package br.com.zup.handora.cadastrobasico4.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(AutorController.BASE_URI)
public class AutorController {

    public final static String BASE_URI = "/autores";

}
