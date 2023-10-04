/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto01;

/**
 *
 * @author david
 */
public class Carro {
    String modelo;
    String cor;
    String chassi;
    int ano;
    String fabricante;
    
    void status() {
        System.out.println("Modelo do carro " + this.modelo);
        System.out.println("Cor do carro " + this.cor);
        System.out.println("Chassi " + this.chassi);
        System.out.println("Ano do carro " + this.ano);
        System.out.println("Fabricante " + this.fabricante + "\n");
    }
}
