package main.java.store.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;

/** Credenciais de login. */
@Builder
public record LoginIn(
        @Email @NotBlank String email,
        @NotBlank String password
) {}
