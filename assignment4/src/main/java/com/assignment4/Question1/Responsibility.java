package com.assignment4.Question1;

/**
 * Created by ajpGa on 2018/03/13.
 */
public class Responsibility {


    private String position;
    private String promotionDate;
    private double bonus = 0;


    public Responsibility(String position, String promotionDate, double bonus){
        this.position = position;
        this.promotionDate = promotionDate;
        this.bonus = bonus;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setPromotionDate(String promotionDate) {
        this.promotionDate = promotionDate;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getPosition() {
        return position;
    }

    public String getPromotionDate() {
        return promotionDate;
    }

    public double getBonus() {
        return bonus;
    }

}
