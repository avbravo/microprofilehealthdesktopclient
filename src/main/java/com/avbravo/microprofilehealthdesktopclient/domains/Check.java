/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.microprofilehealthdesktopclient.domains;

import java.util.List;
import java.util.Map;

/**
 *
 * @author avbravo
 */
public class Check {

    public String status;
    public List<Checks> checks;

    public Check() {
    }

    public Check(String status, List<Checks> checks) {
        this.status = status;
        this.checks = checks;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Checks> getChecks() {
        return checks;
    }

    public void setChecks(List<Checks> checks) {
        this.checks = checks;
    }

    @Override
    public String toString() {
//        String res ="\n";
//        checks.forEach(p->{
//            System.out.println(" "+p.toString());
//        });
        return "Check{" + "status=" + status + ", checks=" + checks + '}';
    }

}
