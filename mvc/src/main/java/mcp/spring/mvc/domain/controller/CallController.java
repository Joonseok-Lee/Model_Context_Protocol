package mcp.spring.mvc.domain.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/mcp")
@RequiredArgsConstructor
public class CallController {
    private final ChatClient chatClient;

    @PostMapping
    public String call(@RequestBody String message) {
        log.info("message={}", message);
        return chatClient.prompt(message).call().content();
    }
}
