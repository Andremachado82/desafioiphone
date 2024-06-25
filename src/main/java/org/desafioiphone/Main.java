package org.desafioiphone;

import org.desafioiphone.model.iPhone;

public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        // Testando funcionalidades de ReprodutorMusical
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("Minha Música Favorita");

        // Testando funcionalidades de AparelhoTelefonico
        meuIphone.ligar("123456789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando funcionalidades de NavegadorInternet
        meuIphone.exibirPagina("https://www.dio.me/");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}