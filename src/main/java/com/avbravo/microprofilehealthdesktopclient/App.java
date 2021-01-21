/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.microprofilehealthdesktopclient;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import com.avbravo.microprofilehealthdesktopclient.domains.Check;
import javax.ws.rs.core.MediaType;
import org.jboss.resteasy.plugins.providers.RegisterBuiltin;
import org.jboss.resteasy.plugins.providers.jackson.ResteasyJacksonProvider;

import org.jboss.resteasy.spi.ResteasyProviderFactory;

/**
 *
 * @author avbravo
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {

            ResteasyProviderFactory instance = ResteasyProviderFactory.getInstance();
            RegisterBuiltin.register(instance);
            instance.registerProvider(ResteasyJacksonProvider.class);

            ResteasyClient client = new ResteasyClientBuilder().build();
            ResteasyWebTarget target = client.target("http://127.0.0.1:8080/health");
            javax.ws.rs.core.Response response = target.request()
                    .accept(MediaType.APPLICATION_JSON)
                    .get();
//String value = response.readEntity(String.class);
            Check value = response.readEntity(Check.class);
            System.out.println(value.toString());
            response.close();
            
            
        } catch (Exception e) {
            System.out.println(" main() " + e.getLocalizedMessage());
        }

    }

}
