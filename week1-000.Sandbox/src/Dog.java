/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acfan
 */
public class Dog extends Animal {
    public Dog(int age, String name) {
        super(age, name);
    }
    
    @Override
    public String toString() {
        return String.format("%s is %d years old.", GetName(), GetAge());
    }
}
