package com.carlosmillan.springboot.di.app.models.service;

import org.springframework.stereotype.Component;

@Component("miServicioSimple")
//@Primary
public class MiServicio implements IServicio{
    public String operacion() {
        return "ejecutando algun proceso importante simple ..";
    }
}
