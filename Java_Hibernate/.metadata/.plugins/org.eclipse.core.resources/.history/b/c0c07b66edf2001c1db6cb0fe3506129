package org.o7planning.Boulanger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Produit {

    @Id
    @GeneratedValue
    private int id;
    private String nomProduit;
    private double prix;

    public Produit() {
    }

    public Produit(String nomProduit, double prix) {
        this.nomProduit = nomProduit;
        this.prix = prix;
    }

    public Produit(int id, String nomProduit, double prix) {
        this.id = id;
        this.nomProduit = nomProduit;
  
        this.prix = prix;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

  
    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
   
}