package com.tecsup.app.micro.order.User;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RequiredArgsConstructor
@Component
public class UserClient {
    private final RestTemplate restTemplate;

    @Value("${user.service.url}")
    private String userServiceUrl;

    public User getUserById(Long createdBy){
        String url = userServiceUrl + "/api/users/" + createdBy;
        User usr = restTemplate.getForObject(url, User.class);
        log.info("User retrieved successfully from userdb: {}", usr);
        return usr;
    }

}
