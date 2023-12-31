package org.openapitools.api;

import org.springframework.amqp.rabbit.core.RabbitTemplate;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-10T06:36:40.060738Z[Etc/UTC]")
@Controller
@RequestMapping("${openapi.paperlessRestServer.base-path:}")
@CrossOrigin(origins = "http://localhost:8080")
public class ApiApiController implements ApiApi {

    private final NativeWebRequest request;
    private final RabbitTemplate rabbitTemplate;

    @Autowired
    public ApiApiController(NativeWebRequest request, RabbitTemplate rabbitTemplate) {
        this.request = request;
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendMessageToQueue(String queueName, Object message) {
        rabbitTemplate.convertAndSend(queueName, message);
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
