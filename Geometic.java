/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;

import java.util.Date;

/**
 *
 * @author tp
 */
public class Geometic {

    private String color;
    Date dateCreated;

    public Geometic() {
        this.dateCreated = new Date();
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    
    public Geometic(String color) {
        this.color = color;
        this.dateCreated = new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Geometic{" + "color=" + color + ", dateCreated=" + dateCreated + '}';
    }

}
