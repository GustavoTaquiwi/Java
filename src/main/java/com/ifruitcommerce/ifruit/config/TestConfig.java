package com.ifruitcommerce.ifruit.config;

import com.ifruitcommerce.ifruit.entities.*;
import com.ifruitcommerce.ifruit.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private PaymentRepository paymentRepository;
    @Autowired
    private OrdemItemRepository ordemItemRepository;

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User(1L, "Ana Silva","Ana.silva@example.com","555) 123-4567", "pR3tTysun5h1n3!");
        User user2 = new User(2L,"Inês Lima", "ines.lima@example.com","(555) 789-0123","F!rstT!m3Tr@v3l");
        Product product1 = new Product(1L, "Pizza", "Pizza",17.00 ,"ImagemPizza");
        Product product2 = new Product(2L,"Pao","Pao",5.00, "ImagemPao");
        Category category1 = new Category(1L, "Pizza");
        Category category2 = new Category(2L, "Pao");
        Order order1 = new Order(1L, null, OrderStatus.PAID);
        Order order2 = new Order(2L, null, OrderStatus.CANCELLED);
        Payment payment = new Payment(null,1L);
        Payment payment2 = new Payment(null,2L);
        OrdemItem ordemItem = new OrdemItem(1L,2,17.00);
        OrdemItem ordemItem1 = new OrdemItem(2L,10,5.00);

        userRepository.saveAll(Arrays.asList(user1,user2));
        productRepository.saveAll(Arrays.asList(product1,product2));
        categoryRepository.saveAll(Arrays.asList(category1,category2));
        orderRepository.saveAll(Arrays.asList(order1,order2));
        paymentRepository.saveAll(Arrays.asList(payment,payment2));
        ordemItemRepository.saveAll(Arrays.asList(ordemItem,ordemItem1));


    }
}
