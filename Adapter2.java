/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adapter2;

/**
 *
 * @author hp
 */
public class Adapter2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Bird bird =new Sparr();
        Toydak target =new Adapter(bird);
        target.makesqake();
        bird.fly();
        bird.makesound();
        
        
        
        
        
        
        
    }
    
}
