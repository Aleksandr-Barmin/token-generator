package dev.abarmin.token.generator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import uk.co.santander.sirius.commons.jwtdecoder.jwt.JWTFactory;

@RestController
public class TokenGeneratorController {
    @Autowired
    @Qualifier("sirius-jwt-factory")
    private JWTFactory jwtFactory;

    @GetMapping("/token")
    public String generateJWT() {
        return jwtFactory.generateServiceToken();
    }
}
