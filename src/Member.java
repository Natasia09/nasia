/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class Member {
    private String name;
    private double weight;
    private double height;
    
    public Member(String name,double weight,double height) {
       this.name=name;
       this.weight=weight;
       this.height=height;
    }

    @Override
    public String toString() {
        return "Member{" + "name=" + name + ", weight=" + weight + ", height=" + height + '}';
    }
    
}
