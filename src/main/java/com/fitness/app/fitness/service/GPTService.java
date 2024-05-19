package com.fitness.app.fitness.service;

import jakarta.annotation.Resource;
import org.springframework.ai.chat.ChatResponse;
import org.springframework.ai.chat.messages.UserMessage;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.openai.OpenAiChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Flux;

import java.util.Map;

public class GPTService {
    private final OpenAiChatClient chatClient;

    public GPTService(OpenAiChatClient chatClient) {
        this.chatClient = chatClient;
    }

    public Map generate(String message) {
        return Map.of("generation", chatClient.call(message));
    }

    public Flux<ChatResponse> generateStream(String message) {
        Prompt prompt = new Prompt(new UserMessage(message));
        return chatClient.stream(prompt);
    }
}
