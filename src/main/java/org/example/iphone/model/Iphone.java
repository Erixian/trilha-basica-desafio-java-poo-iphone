package org.example.iphone.model;

import org.example.iphone.interfaces.AparelhoTelefonico;
import org.example.iphone.interfaces.NavegadorInternet;
import org.example.iphone.interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;
    private String cor;
    private int memoriaGB;

    public Iphone(String modelo, String cor, int memoriaGB) {
        this.modelo = modelo;
        this.cor = cor;
        this.memoriaGB = memoriaGB;
        System.out.println("iPhone " + modelo + " (" + cor + ", " + memoriaGB + "GB) inicializado!");
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo música");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música...");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando..");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página..");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }
}