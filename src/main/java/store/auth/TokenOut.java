package store.auth;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;

@Builder
public record TokenOut(
        @NotBlank String token
) {}
