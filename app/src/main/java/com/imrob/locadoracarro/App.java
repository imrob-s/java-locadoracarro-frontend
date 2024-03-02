package com.imrob.locadoracarro;

import com.imrob.locadoracarro.config.ConexaoBanco;
import com.imrob.locadoracarro.services.MainService;

public class App {

    public static void main(String[] args) {
        new ConexaoBanco().conectar();
        
        new MainService().iniciarSistema();
    }
}
