/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package KUIS;

/**
 *
 * @author HP
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Peliharaan animal1 = new Peliharaan("Mpus", "Kucing", "Meong-Meong");
        Peliharaan animal2 = new Peliharaan("Bird", "Burung", "Suit-Suit");
        Peliharaan animal3 = new Peliharaan("Chick", "Ayam", "Kuk-kukuruyuk");
        Peliharaan animal4 = new Peliharaan("Duck", "Bebek", "WekWek-WekWek");
        
        animal1.printAnimal(animal1); 
        animal2.printAnimal(animal2); 
        animal3.printAnimal(animal3); 
        animal4.printAnimal(animal4); 
    }   
}