/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.microprofilehealthdesktopclient.domains;

/**
 *
 * @author avbravo
 */
public class Group {
    private String group;
    private String description;

    public Group() {
    }

    public Group(String group, String description) {
        this.group = group;
        this.description = description;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

   


  

   

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
  public static class Builder {
        private String group;
    private String description;
       

        public Builder withGroup(String group) {
            this.group = group;
            return this;
        }
        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }
       

       

        public Group build() {
            return new Group(group, description);
        }

    }
    
    
    
    
}
