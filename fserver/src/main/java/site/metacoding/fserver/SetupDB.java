package site.metacoding.fserver;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SetupDB {

  @Bean
  public CommandLineRunner run(ProductRepository productRepository) {
    return (args) -> {// 람다 식으로 함수를 리턴할 수 있게 됨

      Product p1 = Product.builder().name("바나나").price(5000).build();
      Product p2 = Product.builder().name("ㅇㄹㅈ").price(5000).build();
      Product p3 = Product.builder().name("ㄸㄱ").price(5000).build();
      Product p4 = Product.builder().name("ㅇㅍ").price(5000).build();
      Product p5 = Product.builder().name("ㅇㅍ").price(5000).build();

      List<Product> products = Arrays.asList(p1, p2, p3, p4, p5);
      productRepository.saveAll(products);
    };
    // return (args) -> {
    // List<Product> products = new ArrayList<>();
    // for (int i = 0; i < 50; i++) {
    // Product p = Product.builder().name("사과 " + i).price(1000 + i).build();
    // products.add(p);
    // }

    // productRepository.saveAll(products);

  }

}
