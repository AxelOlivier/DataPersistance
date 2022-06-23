package org.o7planning.Boulanger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 Serviceproduit newProduit = new Serviceproduit();
    	 newProduit.create(new Produit("Baguette", (float) 0.90));
    	 newProduit.create(new Produit("Pain Campagne", (float) 2.70));
    	 newProduit.create(new Produit("Petit Pain",  (float) 0.80));
    	 newProduit.create(new Produit("Croissant", (float) 0.70));
    	 
    	 ServiceUser newuser = new ServiceUser();  
    	 newuser.create(new user("Olivier", "Axel"," 0102030405"));
    	 newuser.create(new user("Lefebvre", "Martin","0102030405"));
    	 newuser.create(new user("Marescaux", "Gauthier", "0102030405"));
    	 newuser.create(new user("Dupont", "Paul","0102030405"));
    	 newuser.create(new user("Marco", "Julien", "0102030405"));

    }
}
