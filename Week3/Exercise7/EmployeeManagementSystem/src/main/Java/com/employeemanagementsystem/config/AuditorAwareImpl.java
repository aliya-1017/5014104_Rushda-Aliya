package com.employeemanagementsystem.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

@Configuration
public class AuditorAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        // Implement your logic to retrieve the current user (e.g., from Spring Security)
        // For demonstration, returning a static user
        return Optional.of("Admin"); // Replace with actual user retrieval logic
    }
}
