package com.nramiscal.web.models;

public class Cat extends Animal implements Pet {
    public Cat(String name, String breed, double weight){
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

    @Override
    public String showAffection(){
        return "Your " + breed + " cat, " + name + ", looked at you with some affection. You think.";
    }
}
