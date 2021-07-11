package com.hibernate.OneToMany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Module {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mId;
    private String mName;
    private String pName;

    public int getmId ( ) {
        return mId;
    }

    public void setmId ( int mId ) {
        this.mId = mId;
    }

    public String getmName ( ) {
        return mName;
    }

    public void setmName ( String mName ) {
        this.mName = mName;
    }

    public String getpName ( ) {
        return pName;
    }

    public Module ( int mId, String mName, String pName ) {
        this.mId = mId;
        this.mName = mName;
        this.pName = pName;
    }

    public void setpName ( String pName ) {
        this.pName = pName;
    }

    @Override
    public String toString ( ) {
        return "Module{" +
                "mId=" + mId +
                ", mName='" + mName + '\'' +
                ", pName='" + pName + '\'' +
                '}';
    }

    public Module ( ) {
    }
}
