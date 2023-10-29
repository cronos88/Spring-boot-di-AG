package com.carlosmillan.springboot.di.app.models.service;

import org.springframework.stereotype.Component;

@Component("MiServicioSimple")
public class MiServicio implements IServicio{
    public String operacion() {
        return "ejecutando algun proceso importantisimo..";
    }
}
