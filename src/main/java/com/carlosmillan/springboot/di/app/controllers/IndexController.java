package com.carlosmillan.springboot.di.app.controllers;

import com.carlosmillan.springboot.di.app.models.service.IServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Autowired
    @Qualifier("miServicioComplejo")
    private IServicio servicio;

    /*@Autowired
    public IndexController(IServicio servicio) { //Constructor
        this.servicio = servicio;
    }*/

    @GetMapping({"/", "", "/index"})
    public String index(Model model) {
        model.addAttribute("objeto", servicio.operacion());
        return "index";
    }

    /*@Autowired // Principio Hollywood
    public void setServicio(IServicio servicio) {
        this.servicio = servicio;
    }*/
}
