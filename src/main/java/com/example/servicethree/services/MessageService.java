package com.example.servicethree.services;

import com.example.servicethree.clints.MessageClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    private final MessageClient messageClient;

    @Autowired
    public MessageService(MessageClient messageClient) {
        this.messageClient = messageClient;
    }

    private void getAllActivityService() {
        messageClient.getServiceIdsWithActivityStatusUsingGET();

        //Некая волшебная логика
    }
}
