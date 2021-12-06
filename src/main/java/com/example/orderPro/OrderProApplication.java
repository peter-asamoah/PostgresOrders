package com.example.orderPro;
import com.example.orderPro.exchangeProo.Order;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Mono;

@SpringBootApplication
public class OrderProApplication {
	private static String API_KEY = "2b6f4744-e23d-48a9-aa6a-6e08c4958c48";

	public static void main(String[] args) {


		SpringApplication.run(OrderProApplication.class, args);

		String base_order_url = "https://exchange.matraining.com/" + API_KEY;
		WebClient webClient = WebClient
				.builder()
				.defaultHeader("Content-Type", "application/json")
				.build();


		Order order = new Order();
				order.setProduct("AAPL");
				order.setPrice(1.5);
				order.setQuantity(3);
				order.setSide("BUY");
				order.setOrderId(null);

		String id = webClient
				.post().uri(base_order_url+"/order")
				.body(Mono.just(order), Order.class)
				.retrieve().bodyToMono(String.class).block();
		System.out.println(id);


		String correctID = id.substring(1, id.length() - 1);

		order.setOrderId(correctID);


//		System.out.println(correctID);

		WebClient local = WebClient
				.builder()
				.defaultHeader("Content-Type", "application/json")
				.build();


				local.post().uri("localhost:8081/save")
						.body(Mono.just(order), Order.class).retrieve().bodyToMono(String.class).block();

	}

}
