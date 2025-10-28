package store.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;

/** Dados para registro de um novo usuário. */
@Builder
public record RegisterIn(
        @NotBlank String name,
        @Email @NotBlank String email,
        @NotBlank String password
) {}