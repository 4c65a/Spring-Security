package com.project.security.Auth;

import lombok.Builder;



@Builder
public class RegisterRequest {
    private String nombre;
    private String apellido;
    private String email;
    private String password;

    public RegisterRequest() {
    }
    public RegisterRequest(String nombre,String apellido,String password,String email){
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.password = password;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre(){
        return nombre;
    }

    public void  setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
