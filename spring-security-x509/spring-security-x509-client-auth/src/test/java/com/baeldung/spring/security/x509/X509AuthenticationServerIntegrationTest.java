package com.baeldung.spring.security.x509;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class X509AuthenticationServerIntegrationTest {
    @Test
    public void contextLoads() {
    }
}
/*
curl -k --cert cid.pem --key key.pem https://localhost:8443/user
keytool -delete -alias cid -keystore ./truststore.jks
openssl pkcs12 -in cid.p12 -out key.pem -nocerts -nodes
openssl pkcs12 -in cid.p12 -out cid.pem -clcerts -nokeys

 */
