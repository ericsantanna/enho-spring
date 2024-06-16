package com.example.demo.controllers;

import com.example.demo.models.User;
import com.example.demo.services.UserService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class UserControllerTest {

    private UserService userService;

    @Test
    public void testSave() {
        User mockUser = new User();
        mockUser.setName("John Doe");

        UserService userService = mock(UserService.class);
        when(userService.save(mockUser)).thenReturn(mockUser);

        UserController userController = new UserController(userService);
        var user = userController.save(mockUser);

        User expectedUser = new User();
        expectedUser.setId(1L);
        expectedUser.setName("Mario");

        assertEquals(expectedUser, user, "User should be saved successfully.");
        assertTrue(false);
    }
}