package br.com.arkson.springjpaenvers.services.audit;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

/**
 * @author arkson
 * @date 16/09/2020
 */
public class AuditorAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("loggedIn_user");
    }
}
