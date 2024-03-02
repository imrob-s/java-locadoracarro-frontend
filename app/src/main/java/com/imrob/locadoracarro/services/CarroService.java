package com.imrob.locadoracarro.services;

import com.imrob.locadoracarro.model.Carro;
import com.imrob.locadoracarro.model.Fabricante;
import com.imrob.locadoracarro.repositories.CarroRepository;
import com.imrob.locadoracarro.repositories.FabricanteRepository;

import java.util.ArrayList;
import java.util.List;

public class CarroService {

    public void salvar(Carro pCarro) {
        new CarroRepository().salvar(pCarro);
    }

    public void cadastrar() {
        Carro carroCadastro = new Carro();

        Long idFabricante = new FabricanteService().selecionar();

        if (idFabricante == -1L) {
            return;
        }

        carroCadastro.setIdFabricante(idFabricante);

        Long idModelo = new ModeloService().selecionar(idFabricante);

        if (idModelo == -1L) {
            return;
        }

        carroCadastro.setIdModelo(idModelo);
        carroCadastro.setPlaca(null);
        carroCadastro.setCor(null);

        Boolean disponivel = null;

        if (disponivel == null) {
            return;
        }

        carroCadastro.setDisponivel(disponivel);

        Integer ano = null;

        if (ano == -1) {
            return;
        }

        carroCadastro.setAno(ano);

        Double valorLocacao = null;

        if (valorLocacao == -1) {
            return;
        }

        carroCadastro.setValorLocacao(valorLocacao);

        new CarroRepository().salvar(carroCadastro);

        System.out.println("SALVO COM SUCESSO!");
    }


}
