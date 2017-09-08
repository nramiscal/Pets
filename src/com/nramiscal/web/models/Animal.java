package com.nramiscal.web.models;

public class Animal {
    protected String name;
    protected String breed;
    protected double weight;

    // no constructor

    // getters
    public String getName(){
        return name;
    }

    public String getBreed(){
        return breed;
    }

    public double getWeight(){
        return weight;
    }

    // setters
    public void setName(String name){
        this.name = name;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }
}
