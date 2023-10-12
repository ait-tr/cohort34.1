package ait.user.test;

import ait.user.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Assertions;

class UserTest {
    User user;
    final String email = "peter@gmx.de";
    final String password = "12345Az!";

    @BeforeEach
    void setUp() {
        user = new User(email, password);
    }

    @Test
    void testValidPassword() {
        String validPassword = "qwertB7$";
        user.setPassword(validPassword);
        assertEquals(validPassword, user.getPassword());
    }

    @Test
    void testPasswordLength() {
        String inValidPassword = "wertB7$";
        user.setPassword(inValidPassword);
        assertEquals(password, user.getPassword());
    }

    @Test
    void testPasswordUpperCase() {
        String inValidPassword = "qwertb7$";
        user.setPassword(inValidPassword);
        assertEquals(password, user.getPassword());
    }

    @Test
    void testPasswordLowerCase() {
        String inValidPassword = "QWERTY7$";
        user.setPassword(inValidPassword);
        assertEquals(password, user.getPassword());
    }

    @Test
    void testPasswordDigit() {
        String inValidPassword = "qwertBD$";
        user.setPassword(inValidPassword);
        assertEquals(password, user.getPassword());
    }

    @Test
    void testPasswordSpecialSymbol() {
        String inValidPassword = "qwertB79";
        user.setPassword(inValidPassword);
        assertEquals(password, user.getPassword());
    }

    @Test
    void testValidEmail() {
        String validEmail = "peter@web.de";
        user.setEmail(validEmail);
        assertEquals(validEmail, user.getEmail());
    }

    @Test
    void testEmailWithoutAt() {
        String inValidEmail = "peter.gmx.de";
        user.setEmail(inValidEmail);
        assertEquals(email, user.getEmail());
    }

    @Test
    void testEmailDoubleAt() {
        String inValidEmail = "peter@we@b.de";
        user.setEmail(inValidEmail);
        assertEquals(email, user.getEmail());
    }

    @Test
    void testEmailDotAfterAt() {
        String inValidEmail = "peter@webde";
        user.setEmail(inValidEmail);
        assertEquals(email, user.getEmail());
    }

    @Test
    void testEmailLastDot() {
        String inValidEmail = "peter@webde.";
        user.setEmail(inValidEmail);
        assertEquals(email, user.getEmail());
        inValidEmail = "peter@web.d.e";
        user.setEmail(inValidEmail);
        assertEquals(email, user.getEmail());
    }

    @Test
    void testIncorrectSymbols() {
        String inValidEmail = "pet!er@web.de";
        user.setEmail(inValidEmail);
        assertEquals(email, user.getEmail());
    }
}