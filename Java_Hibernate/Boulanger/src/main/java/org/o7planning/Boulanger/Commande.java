package org.o7planning.Boulanger;

import java.util.Set;
import java.util.Date;
import java.sql.Time;
import java.util.HashSet;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;


public class Commande {
	@Id
    @Column(name="commande_ID")
	  private Integer id;
	 @Column(name="commande_date")
	    private Date date;
	 @Column(name="commande_heure")
	    private Time heure;
	    private Set<Produit> produits = new HashSet<Produit>(0);
	    private Set<user> users = new HashSet<user>(0);


	    public Commande(Integer id, Date date, Time heure, Set<Produit> produits, Set<user> users) {
	        this.id = id;
	        this.date = date;
	        this.heure = heure;
	        this.produits = produits;
	        this.users = users;
	    }

	    
	    public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }

	   
	    public Date getDate() {
	        return date;
	    }

	    public void setDate(Date date) {
	        this.date = date;
	    }
	    
	    public Time getHeure() {
	        return heure;
	    }

	    public void setHeure(Time heure) {
	        this.heure = heure;
	    }
	    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
	    public Set<Produit> getProduits() {
	        return produits;
	    }

	    public void setProduits(Set<Produit> produits) {
	        this.produits = produits;
	    }

	    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
	    public Set<user> getUsers() {
	        return users;
	    }

	    public void setUsers(Set<user> users) {
	        this.users = users;
	    }
}
