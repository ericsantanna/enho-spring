package com.example.demo.controllers;

import com.example.demo.models.User;
import com.example.demo.services.UserService;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class UserControllerTest {

    @Test
    public void testSave() {
        User user = new User();
        user.setName("John Doe");

        UserService userService = mock(UserService.class);
        when(userService.save(user)).thenReturn(user);

        UserController userController = new UserController(userService);
        userController.save(user);
    }
}