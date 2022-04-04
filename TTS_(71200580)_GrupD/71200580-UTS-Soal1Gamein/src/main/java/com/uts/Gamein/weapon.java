package com.uts.Gamein;



public class weapon {
    private String Name;
    private Integer Durability;
    private boolean isDisable;
    private Integer hitDamage;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getDurability() {
        return Durability;
    }

    public void setDurability(Integer durability) {
        Durability = durability;
    }

    public boolean isDisable() {
        return isDisable;
    }

    public void setDisable(boolean disable) {
        isDisable = disable;
    }

    public Integer getHitDamage() {
        return hitDamage;
    }

    public void setHitDamage(Integer hitDamage) {
        this.hitDamage = hitDamage;
    }
}
