package app;

import java.awt.image.BufferedImage;

public class Main {
    public static void main(String[] args) {
        BufferedImage imagem = ManipularImagem.abrirImagem("meninoVerde.jpg");
        ManipularImagem.exibirImagem(
                ManipularImagem.abrirImagem("meninoVerde.jpg"),
                OperacoesPontuais.brilhoMttY(imagem,3));
    }
}
