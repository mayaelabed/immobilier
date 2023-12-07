package com.example.immobilier.entites;

public class RentalContact {
    

    private long id;
    private Owner owner;
    private Property property;
    private String tentant;
    private double monthlyRent;

    public RentalContact(long id, Owner owner, Property property, String tentant, double monthlyRent) {
        this.id = id;
        this.owner = owner;
        this.property = property;
        this.tentant = tentant;
        this.monthlyRent = monthlyRent;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Owner getOwner() {
        return owner;
    }
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Property getProperty() {
        return property;
    }
    public void setProperty(Property property) {
        this.property = property;
    }

    public String getTentant() {
        return tentant;
    }
    public void setTentant(String tentant) {
        this.tentant = tentant;
    }
    
    public double getMonthlyRent() {
        return monthlyRent;
    }
    public void setMonthlyRent(double monthlyRent) {
        this.monthlyRent = monthlyRent;
    }
}
