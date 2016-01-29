/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pk.helloglassfishmaven;

/**
 *
 * @author Mahantesh.Katti
 */
import javax.ejb.Singleton;

/**
 * Singleton session bean used to store the name parameter for "/helloWorld"
 * resource
 * 
* @author mkuchtiak
 */
@Singleton
public class NameStorageBean {
// name field

    private String name = "GlassFish Server";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
