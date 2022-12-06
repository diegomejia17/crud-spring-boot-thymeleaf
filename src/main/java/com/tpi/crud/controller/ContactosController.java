package com.tpi.crud.controller;

import com.tpi.crud.entity.Contacto;
import com.tpi.crud.service.api.ContactosServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/contactos")
public class ContactosController {
    @Autowired
    ContactosServiceAPI contactosServiceAPI;

    @GetMapping("/home")
    public String vistaContactos(Model model){
        model.addAttribute("listaContactos", contactosServiceAPI.getAll());
        return "/index.html";
    }

    @RequestMapping("/create")
    public String create(Model model) {
        model.addAttribute("contacto", new Contacto());
        return "save";
    }

    @GetMapping("/save/{id}")
    public String showSave(@PathVariable("id") Long id, Model model) {
        if (id != null && id != 0) {
            model.addAttribute("Contacto", contactosServiceAPI.get(id));
        } else {
            model.addAttribute("Contacto", new Contacto());
        }
        return "save";
    }

    @PostMapping("/save")
    public String save(Contacto contacto, Model model) {
        contactosServiceAPI.save(contacto);
        return "redirect:/home/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id, Model model) {
        contactosServiceAPI.delete(id);

        return "redirect:/home/";
    }

    public  String hola(){
        return "";
    }
}


