package com.gabriellopes.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
