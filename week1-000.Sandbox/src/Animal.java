/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acfan
 */
public class Animal {
    private int _age;
    private String _name;
    
    public Animal(int age, String name) {
        _age = age;
        _name = name;
    }
    
    public int GetAge() {
        return _age;
    }
    
    public String GetName() {
        return _name;
    }
}
