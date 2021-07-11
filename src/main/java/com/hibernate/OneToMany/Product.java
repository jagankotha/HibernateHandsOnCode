package com.hibernate.OneToMany;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pId;
    private String pName;
    private String pClient;

    public HashSet< Module > getHashSet ( ) {
        return ( HashSet< Module > ) hashSet;
    }

    public void setHashSet ( HashSet< Module > hashSet ) {
        this.hashSet = hashSet;
    }

    @OneToMany
   @JoinColumn(name = "pIdFK")

    Set<Module> hashSet = new HashSet<> (  );

    public int getpId ( ) {
        return pId;
    }

    public void setpId ( int pId ) {
        this.pId = pId;
    }

    public String getpName ( ) {
        return pName;
    }

    public void setpName ( String pName ) {
        this.pName = pName;
    }

    public String getpClient ( ) {
        return pClient;
    }

    public void setpClient ( String pClient ) {
        this.pClient = pClient;
    }



    public Product ( int pId, String pName, String pClient ) {
        this.pId = pId;
        this.pName = pName;
        this.pClient = pClient;

    }

    public Product ( ) {
    }

    @Override
    public String toString ( ) {
        return "Product{" +
                "pId=" + pId +
                ", pName='" + pName + '\'' +
                ", pClient='" + pClient + '\'' +

                '}';
    }
}
