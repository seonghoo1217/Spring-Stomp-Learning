package com.example.stomp.api;

import com.example.stomp.dto.TestResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StompTestAPI {

    private final SimpMessagingTemplate template;

    @MessageMapping("/test")
    public void testConnection(){
        TestResponseDTO testResponseDTO=new TestResponseDTO();
        template.convertAndSend("/queue/test",testResponseDTO);
    }
}
