package br.com.arkson.springjpaenvers.bootstrap;

import br.com.arkson.springjpaenvers.model.Owner;
import br.com.arkson.springjpaenvers.services.OwnerService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author arkson
 * @date 16/11/2020
 */
@Component
@AllArgsConstructor
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;

    @Override
    public void run(String... args) throws Exception {
        Owner ww = new Owner();
        ww.setFirstName("Walter");
        ww.setLastName("White");

        Owner wwSaved = ownerService.save(ww);
        wwSaved.setCity("Albuquerque");
        ownerService.save(wwSaved);

        Owner jesse = new Owner();
        jesse.setFirstName("Jesse");
        jesse.setLastName("Pinkman");

        ownerService.save(jesse);
    }
}
