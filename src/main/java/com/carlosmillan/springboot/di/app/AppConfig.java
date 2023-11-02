package com.carlosmillan.springboot.di.app;

import com.carlosmillan.springboot.di.app.models.service.IServicio;
import com.carlosmillan.springboot.di.app.models.service.MiServicio;
import com.carlosmillan.springboot.di.app.models.service.MiServicioComplejo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean("miServicioSimple")
    public IServicio registrarMiServicio() {
        return new MiServicio();
    }

    @Bean("miServicioComplejo")
    public IServicio registrarMiServicioComplejo() {
        return new MiServicioComplejo();
    }
}
