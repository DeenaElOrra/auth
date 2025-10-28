package store.auth;

import java.util.Map;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/auth")
public interface AuthController {

    @PostMapping("/register")
    ResponseEntity<TokenOut> register(@Valid @RequestBody RegisterIn in);

    @PostMapping("/login")
    ResponseEntity<TokenOut> login(@Valid @RequestBody LoginIn in);

    @PostMapping("/solve")
    ResponseEntity<Map<String, String>> solve(@Valid @RequestBody TokenOut token);
}
