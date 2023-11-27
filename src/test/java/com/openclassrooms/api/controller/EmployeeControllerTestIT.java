package com.openclassrooms.api.controller;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest//charge le context spring
@AutoConfigureMockMvc// configure le mock mvc pou appeler les bonne classe et le controller et sa methode
class EmployeeControllerTestIT {

	 @Autowired
	    private MockMvc mockMvc;

	    @Test
	    public void testGetEmployees() throws Exception {
	        mockMvc.perform(get("/employees"))
	            .andExpect(status().isOk())
	            .andExpect(jsonPath("$[0].firstName", is("Laurent")));//verifie a l index 0 de l objet retourné  dans MvcResult
	    }

}
