package io.sample.spring.cloud.contract.producer.web;

import io.sample.spring.cloud.contract.producer.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping(path = "/user")
    public UserDto getUserById() {
        return new UserDto(101L, "John Smith");
    }
}
