package com.carlosmillan.springboot.di.app.models.service;

import org.springframework.stereotype.Component;

@Component("MiServicioComplejo")
public class MiServicioComplejo implements IServicio{
    public String operacion() {
        return "ejecutando algun proceso importante y complicado..";
    }
}
