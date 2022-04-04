/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KUIS;

/**
 *
 * @author HP
 */
public class Peliharaan implements Animal{
    String name;
    String type;
    String sound;
    
    public Peliharaan (String name, String type, String sound ){
        this.name = name;
        this.type = type;
        this.sound = sound;
    }
    
    @Override
    public String getName(){
        return this.name;
    }
    @Override
    public String getType(){
        return this.type;
    }
    @Override
    public void makeSound(){
        System.out.println(this.sound);
    }
    
     public void printAnimal(Animal animal){
        System.out.print(animal.getName() + " adalah " + animal.getType() + " dengan bunyi ");
        animal.makeSound();
    }
}