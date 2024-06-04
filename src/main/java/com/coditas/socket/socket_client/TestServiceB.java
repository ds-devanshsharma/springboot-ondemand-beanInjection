package com.coditas.socket.socket_client;

import org.springframework.stereotype.Service;

@Service
public class TestServiceB implements TestService{
    public String getMessage(){return "Hi , This message from Service-B layer !" ;}
}
