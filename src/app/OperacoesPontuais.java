package app;

import java.awt.*;
import java.awt.image.BufferedImage;

public class OperacoesPontuais {
    public static BufferedImage imagemVerde(BufferedImage imgEntrada){
        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());

        for(int h = 0;h<altura;h++){
            for (int w = 0;w<largura;w++){
                int rgb = imgEntrada.getRGB(w,h);
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();
                Color novaCor = new Color(0,green,0);
                imgSaida.setRGB(w,h, novaCor.getRGB());
            }
        }
        return imgSaida;
    }
    public static BufferedImage imagemVermelha(BufferedImage imgEntrada){
        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());

        for(int h = 0;h<altura;h++){
            for (int w = 0;w<largura;w++){
                int rgb = imgEntrada.getRGB(w,h);
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();
                Color novaCor = new Color(red,0,0);
                imgSaida.setRGB(w,h, novaCor.getRGB());
            }
        }
        return imgSaida;
    }
    public static BufferedImage imagemAzul(BufferedImage imgEntrada){
        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());

        for(int h = 0;h<altura;h++){
            for (int w = 0;w<largura;w++){
                int rgb = imgEntrada.getRGB(w,h);
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();
                Color novaCor = new Color(0,0,blue);
                imgSaida.setRGB(w,h, novaCor.getRGB());
            }
        }
        return imgSaida;
    }
    public static BufferedImage negativo(BufferedImage imgEntrada){
        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());

        for(int h = 0;h<altura;h++){
            for (int w = 0;w<largura;w++){
                int rgb = imgEntrada.getRGB(w,h);
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();
                Color novaCor = new Color(255 - red, 255 - green, 255 - blue);
                imgSaida.setRGB(w,h, novaCor.getRGB());
            }
        }
        return imgSaida;
    }
    public static BufferedImage cinzaGreen(BufferedImage imgEntrada){
        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());

        for(int h = 0;h<altura;h++){
            for (int w = 0;w<largura;w++){
                int rgb = imgEntrada.getRGB(w,h);
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();
                Color novaCor = new Color(green, green, green);
                imgSaida.setRGB(w,h, novaCor.getRGB());
            }
        }
        return imgSaida;
    }
    public static BufferedImage cinzaBlue(BufferedImage imgEntrada){
        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());

        for(int h = 0;h<altura;h++){
            for (int w = 0;w<largura;w++){
                int rgb = imgEntrada.getRGB(w,h);
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();
                Color novaCor = new Color(blue, blue, blue);
                imgSaida.setRGB(w,h, novaCor.getRGB());
            }
        }
        return imgSaida;
    }
    public static BufferedImage cinzaRed(BufferedImage imgEntrada){
        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());

        for(int h = 0;h<altura;h++){
            for (int w = 0;w<largura;w++){
                int rgb = imgEntrada.getRGB(w,h);
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();
                Color novaCor = new Color(red, red, red);
                imgSaida.setRGB(w,h, novaCor.getRGB());
            }
        }
        return imgSaida;
    }
    public static BufferedImage cinzaMedia(BufferedImage imgEntrada){
        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());

        for(int h = 0;h<altura;h++){
            for (int w = 0;w<largura;w++){
                int rgb = imgEntrada.getRGB(w,h);
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();
                int media = (blue + green + red)/3;
                Color novaCor = new Color(media, media, media);
                imgSaida.setRGB(w,h, novaCor.getRGB());
            }
        }
        return imgSaida;
    }
    public static BufferedImage binarizacao(BufferedImage imgEntrada,int limiar){
        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());

        for(int h = 0;h<altura;h++){
            for (int w = 0;w<largura;w++){
                int rgb = imgEntrada.getRGB(w,h);
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();
                int media = (blue + green + red)/3;
                int novoValor = media > limiar ? 255 : 0;
                Color novaCor = new Color(novoValor, novoValor, novoValor);
                imgSaida.setRGB(w,h,novaCor.getRGB());
            }
        }
        return imgSaida;
    }
    public static BufferedImage alteraTonalidade(BufferedImage imgEntrada, String banda, int valor){
        
        if(!banda.equalsIgnoreCase("red")
        && !banda.equalsIgnoreCase("blue")
        && !banda.equalsIgnoreCase("green")){
            throw new IllegalArgumentException("Banda inválida");
        }
        
        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());

        for(int h = 0;h<altura;h++){
            for (int w = 0;w<largura;w++){
                int rgb = imgEntrada.getRGB(w,h);
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();

                if(banda.equalsIgnoreCase("red")) red = validaLimites(red, valor);
                else if(banda.equalsIgnoreCase("blue")) blue = validaLimites(blue, valor);
                else green = validaLimites(green, valor);

                Color novaCor = new Color(red, green, blue);
                imgSaida.setRGB(w,h, novaCor.getRGB());
            }
        }
        return imgSaida;
    }
    public static BufferedImage brilhoAdd(BufferedImage imgEntrada, int valor){

        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();
        int piso = 0;
        int teto = 255;

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());

        for(int h = 0;h<altura;h++){
            for (int w = 0;w<largura;w++){
                int rgb = imgEntrada.getRGB(w,h);
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();

                Color novaCor = new Color(validaLimites(red,valor),validaLimites(green,valor), validaLimites(blue,valor));
                imgSaida.setRGB(w,h, novaCor.getRGB());
            }
        }
        return imgSaida;
    }

    public static BufferedImage brilhoMtt(BufferedImage imgEntrada, float valor){

        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());

        for(int h = 0;h<altura;h++){
            for (int w = 0;w<largura;w++){
                int rgb = imgEntrada.getRGB(w,h);
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();

                Color novaCor = new Color(validaLimites(red,valor),validaLimites(green,valor), validaLimites(blue,valor));
                imgSaida.setRGB(w,h, novaCor.getRGB());
            }
        }
        return imgSaida;
    }
    public static BufferedImage brilhoAddY(BufferedImage imgEntrada, double valor){

        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());

        for(int h = 0;h<altura;h++){
            for (int w = 0;w<largura;w++){
                int rgb = imgEntrada.getRGB(w,h);
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();
                double y = conversaoParaY(red,green,blue);
                double i = conversaoParaI(red,green,blue);
                double q = conversaoParaQ(red,green,blue);
                y += valor;
                red = validaLimites(conversaoParaRed(y,i,q));
                green = validaLimites(conversaoParaGreen(y,i,q));
                blue = validaLimites(conversaoParaBlue(y,i,q));

                Color novaCor = new Color(red,green,blue);
                imgSaida.setRGB(w,h, novaCor.getRGB());
            }
        }
        return imgSaida;
    }
    public static BufferedImage brilhoMttY(BufferedImage imgEntrada, double valor){

        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());

        for(int h = 0;h<altura;h++){
            for (int w = 0;w<largura;w++){
                int rgb = imgEntrada.getRGB(w,h);
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();
                double y = conversaoParaY(red,green,blue);
                double i = conversaoParaI(red,green,blue);
                double q = conversaoParaQ(red,green,blue);
                y *= valor;
                red = validaLimites(conversaoParaRed(y,i,q));
                green = validaLimites(conversaoParaGreen(y,i,q));
                blue = validaLimites(conversaoParaBlue(y,i,q));

                Color novaCor = new Color(red,green,blue);
                imgSaida.setRGB(w,h, novaCor.getRGB());
            }
        }
        return imgSaida;
    }
    public static BufferedImage negativoY(BufferedImage imgEntrada){

        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());

        for(int h = 0;h<altura;h++){
            for (int w = 0;w<largura;w++){
                int rgb = imgEntrada.getRGB(w,h);
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();
                double y = conversaoParaY(red,green,blue);
                double i = conversaoParaI(red,green,blue);
                double q = conversaoParaQ(red,green,blue);
                y = 255-y;
                red = validaLimites(conversaoParaRed(y,i,q));
                green = validaLimites(conversaoParaGreen(y,i,q));
                blue = validaLimites(conversaoParaBlue(y,i,q));

                Color novaCor = new Color(red,green,blue);
                imgSaida.setRGB(w,h, novaCor.getRGB());
            }
        }
        return imgSaida;
    }

    public static BufferedImage kernelMedia(BufferedImage imgEntrada){

        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());

        for(int h = 0;h<altura;h++){
            for (int w = 0;w<largura;w++){
                int rgb = imgEntrada.getRGB(w,h);
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();

                red = validaLimites(conversaoParaRed(y,i,q));
                green = validaLimites(conversaoParaGreen(y,i,q));
                blue = validaLimites(conversaoParaBlue(y,i,q));

                Color novaCor = new Color(red,green,blue);
                imgSaida.setRGB(w,h, novaCor.getRGB());
            }
        }
        return imgSaida;
    }
    public static double conversaoParaY(int red, int green, int blue){
        double y = (0.299*red) + (0.587*green) + (0.114*blue);
        return y;
    }
    public static double conversaoParaI(int red, int green, int blue){
        double i = (0.596*red) - (0.274*green) - (0.322*blue);
        return i;
    }
    public static double conversaoParaQ(int red, int green, int blue){
        double q = (0.211*red) - (0.523*green) + (0.312*blue);
        return q;
    }
    public static int conversaoParaRed(double y, double i, double q){
        double r = y + (0.956*i) + (0.621*q);
        return (int)r;

    }
    public static int conversaoParaGreen(double y, double i, double q){
        double g = y - (0.272*i) - (0.647*q);
        return (int)g;
    }
    public static int conversaoParaBlue(double y, double i, double q){
        double b = y - (1.106*i) + (1.703*q);
        return (int)b;
    }
    private static int validaLimites(int banda, int acrescimo) {
        banda += acrescimo;
        if(banda >255) banda = 255;
        else if(banda <0) banda = 0;
        return banda;
    }

    private static int validaLimites(int banda, float acrescimo) {
        banda *= acrescimo;
        if(banda >255) banda = 255;
        else if(banda <0) banda = 0;
        return banda;
    }
    private static int validaLimites(int banda) {
        if(banda >255) banda = 255;
        else if(banda <0) banda = 0;
        return banda;
    }


}