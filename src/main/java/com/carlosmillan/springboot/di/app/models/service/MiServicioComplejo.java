package com.carlosmillan.springboot.di.app.models.service;

//@Component("miServicioComplejo")
public class MiServicioComplejo implements IServicio{
    public String operacion() {
        return "ejecutando algun proceso importante y complicado..";
    }
}
