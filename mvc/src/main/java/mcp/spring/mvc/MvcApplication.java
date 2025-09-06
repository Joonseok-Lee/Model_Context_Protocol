package mcp.spring.mvc;

import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class MvcApplication {

    public static void main(String[] args) {
		SpringApplication.run(MvcApplication.class, args);
	}

}
