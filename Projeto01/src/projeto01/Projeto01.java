/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projeto01;

/**
 *
 * @author david
 */
public class Projeto01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carro c1 = new Carro();
        c1.modelo = "Fiat toro";
        c1.cor = "Azul";
        c1.chassi = "t838g7y37ybnhhe98";
        c1.ano = 2022;
        c1.fabricante = "fiat";
        c1.status();
        
        Carro c2 = new Carro();
        c2.modelo = "Corolla";
        c2.cor = "Preto";
        c2.chassi = "6b4e1c79op3mxz9w6";
        c2.ano = 2023;
        c2.fabricante = "Toyota";
        c2.status();
        
        Carro c3 = new Carro();
        c3.modelo = "Voyagem";
        c3.cor = "Cinza";
        c3.chassi = "hd8e84js74du84994";
        c3.ano = 2021;
        c3.fabricante = "Volkswagen";
        c3.status();
        
        Carro c4 = new Carro();
        c4.modelo = "Caoa Chery tiggo 8 pro";
        c4.cor = "Branco";
        c4.chassi = "c1t8p8v47v38jhe9d";
        c4.ano = 2023;
        c4.fabricante = "Chery";
        c4.status();
        
        Carro c5 = new Carro();
        c5.modelo = "Volvo xc90";
        c5.cor = "preto";
        c5.chassi = "d48784y2uy4fu947y";
        c5.ano = 2023;
        c5.fabricante = "Volvo";
        c5.status();
    }
    
}
