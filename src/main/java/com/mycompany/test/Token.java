/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

/**
 *
 * @author jluis
 */
public class Token {
    
    private String Username;
    private String Password;
    private String Taxid;
    private String Data1;
    private String DATA2;
    private String COUNTRY;
    private String Authorization;

    public String getAuthorization() {
        return Authorization;
    }

    public void setAuthorization(String Authorization) {
        this.Authorization = Authorization;
    }
    
    
    public String getTaxid() {
        return Taxid;
    }

    public void setTaxid(String Taxid) {
        this.Taxid = Taxid;
    }

    public String getData1() {
        return Data1;
    }

    public void setData1(String Data1) {
        this.Data1 = Data1;
    }

    public String getData2() {
        return DATA2;
    }

    public void setData2(String Data2) {
        this.DATA2 = Data2;
    }

    public String getCountry() {
        return COUNTRY;
    }

    public void setCountry(String Country) {
        this.COUNTRY = Country;
    }

    
    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
}
