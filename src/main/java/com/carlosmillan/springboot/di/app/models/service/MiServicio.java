package com.carlosmillan.springboot.di.app.models.service;

//@Component("miServicioSimple")
//@Primary
public class MiServicio implements IServicio{
    public String operacion() {
        return "ejecutando algun proceso importante simple ..";
    }
}
