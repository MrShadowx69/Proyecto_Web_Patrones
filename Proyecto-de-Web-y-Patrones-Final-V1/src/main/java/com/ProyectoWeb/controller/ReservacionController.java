/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProyectoWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/reservacion")
public class ReservacionController {
    
   @GetMapping("/listado")
    public String listado(Model model) {
        return "/reservacion/listado";
    }
    
    @GetMapping("/confirmacion")
    public String confirmacion(Model model) {

        return "/reservacion/confirmacion";
    }
    
    
}
