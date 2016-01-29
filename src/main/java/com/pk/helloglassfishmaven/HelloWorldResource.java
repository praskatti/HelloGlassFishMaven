/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pk.helloglassfishmaven;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;

/**
 * REST Web Service
 * 
* @author mkuchtiak
 */
@Stateless
@Path("/helloWorld")
public class HelloWorldResource {

    @EJB
    private NameStorageBean nameStorage;

    /**
     * Retrieves representation of an instance of helloworld.HelloWorldResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/html")
    public String getXml() {
        return "<html><body><h1>Hello " + nameStorage.getName() + "!</h1></body></html>";
    }

    /**
     * PUT method for updating an instance of HelloWorldResource
     *
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("text/plain")
    public void putXml(String content) {
        nameStorage.setName(content);
    }
}