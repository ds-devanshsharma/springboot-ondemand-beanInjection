package com.coditas.socket.socket_client;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class TestServiceA implements TestService{
    public String getMessage(){return "Hi , This message from Service-A layer !" ;}
}
