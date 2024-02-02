/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter2;

/**
 *
 * @author hp
 */
public class Adapter implements Toydak {
    
    
    Bird bird;

    public Adapter(Bird Bird) {
        this.bird = Bird;
    }
    

    @Override
    public void makesqake() {
        bird.makesound();
    }
    
}
