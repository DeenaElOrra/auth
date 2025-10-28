package store.auth;

import lombok.Builder;

@Builder
public record SolveOut(
    String idAccount,
    String name,
    String email
) {}