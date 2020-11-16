package br.com.arkson.springjpaenvers.controllers;

import br.com.arkson.springjpaenvers.services.OwnerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class OwnerControllerTest {

    OwnerController ownerController;

    @Mock
    OwnerService ownerService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        ownerController = new OwnerController(ownerService);
    }

    @Test
    void testFindAll2xx() throws Exception {
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(ownerController).build();
        mockMvc.perform(get("/owners"))
                .andExpect(status().isOk());
    }

    @Test
    void testFindAll4xx() throws Exception {
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(ownerController).build();
        mockMvc.perform(get("/owners/10"))
                .andExpect(status().is4xxClientError());
    }
}