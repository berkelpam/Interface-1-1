package com.pvb;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pauljava on 06/12/2017.
 */
public class Player implements ISaveable{
    private String name;
    private String classType;
    private int hitPoints;
    private int strengh;
    private String weapon;

    public Player(String name, String classType, int hitPoints, int strengh, String weapon) {
        this.name = name;
        this.classType = classType;
        this.hitPoints = hitPoints;
        this.strengh = strengh;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrengh() {
        return strengh;
    }

    public void setStrengh(int strengh) {
        this.strengh = strengh;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", classType='" + classType + '\'' +
                ", hitPoints=" + hitPoints +
                ", strengh=" + strengh +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> values= new ArrayList<String>();
        values.add(1,this.name);
        values.add(2,this.classType);
        values.add(3,""+ this.hitPoints);
        values.add(4,""+this.strengh);
        values.add(5,this.weapon);
        return null;
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues!=null && savedValues.size()>0){
            this.name=savedValues.get(1);
            this.classType=savedValues.get(2);
            this.hitPoints= Integer.parseInt(savedValues.get(3));
            this.strengh= Integer.parseInt(savedValues.get(4));
            this.weapon=savedValues.get(5);

        }

    }
}
