package com.example.demo;

//import com.example.demo.consumer.HelloRabbitConsumer;
import com.example.demo.provider.HelloRabbitProvider;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
class DemoApplicationTests {
    @Autowired
    private HelloRabbitProvider helloRabbitProvider;

    @Test
   public void contextLoads() {
        for (int i = 0; i <10000; i++) {
            helloRabbitProvider.send();
        }
    }



}
