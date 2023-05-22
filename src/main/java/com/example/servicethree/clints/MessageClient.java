package com.example.servicethree.clints;

import com.example.servicethree.api.MessagesApi;
import org.springframework.cloud.openfeign.FeignClient;

//Todo адре обычно выноиться в проперти иои в константы
@FeignClient(value = "message", url ="http://localhost:8080//messages")
public interface MessageClient extends MessagesApi {
}
