package io.sample.spring.cloud.contract.producer;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import io.sample.spring.cloud.contract.producer.web.UserController;
import org.junit.Before;

public class ContractBaseTest {
    @Before
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(new UserController());
    }
}
