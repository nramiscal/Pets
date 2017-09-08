package com.nramiscal.web.models;

public class Dog extends Animal implements Pet {
    public Dog(String name, String breed, double weight){
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

    @Override
    public String showAffection(){
        if (weight < 30){
            return name + " hopped into your lap and cuddled you!";
        }
        else {
            return name + " curled up next to you for a nice long nap.";
        }
    }
}
