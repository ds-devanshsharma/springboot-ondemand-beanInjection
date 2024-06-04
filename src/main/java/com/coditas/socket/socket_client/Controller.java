package com.coditas.socket.socket_client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class Controller {
    private TestService service;

    // setter Injection
    @Autowired
    public void setTestService(TestService testService){
        this.service = testService;
    }

    @GetMapping("/{serviceName}")
    String getController(@PathVariable String serviceName){
        if("A".equals(serviceName)) setTestService(getTestServiceA());
        else setTestService(getTestServiceB());

        log.info("Bean :{} " , service.getClass());
        return service.getMessage();
    }

    @Bean
    TestServiceA getTestServiceA(){
        return new TestServiceA();
    }
    @Bean
    TestServiceB getTestServiceB(){
        return new TestServiceB();
    }
}
