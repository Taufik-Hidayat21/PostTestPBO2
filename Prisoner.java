/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prisoners;
public final class Prisoner {
    final private Integer noPrisoner;
    final private String name;
    final private String gender;
    private Integer age;
    
    public Prisoner(Integer noPrisoner, String name, String gender, Integer age){
        this.noPrisoner = noPrisoner;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    
    public final void setAge(Integer age) {
        this.age = age;
    }
    
    public final Integer getNoPrisoner() {
        return noPrisoner;
    }
    public final String getName() {
        return name;
    }
    public final String getGender() {
        return gender;
    }
    public final Integer getAge() {
        return age  ;
    }
}
