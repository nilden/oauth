package com.nilden.resourceserver;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/resource")
public class ResourceController {

    @GetMapping
    public ResponseEntity<String> resource(@AuthenticationPrincipal Jwt jwt) {
        return ResponseEntity.ok("Resource accessed by: " + jwt.getClaims().get("preferred_username"));
    }
}
