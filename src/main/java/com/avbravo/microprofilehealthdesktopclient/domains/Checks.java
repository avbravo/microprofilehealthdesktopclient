/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.microprofilehealthdesktopclient.domains;

import java.util.Map;

/**
 *
 * @author avbravo
 */
public class Checks {
    public String name;
    public HealthStatus status;
    public Map<String, Object> data;

    public Checks() {
    }

    public Checks(String name, HealthStatus status, Map<String, Object> data) {
        this.name = name;
        this.status = status;
        this.data = data;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

   
 

    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HealthStatus getStatus() {
        return status;
    }

    public void setStatus(HealthStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Checks{" + "name=" + name + ", status=" + status + ", data=" + data + '}';
    }

   

   
}
