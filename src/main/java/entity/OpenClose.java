/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author TimmosQuadros
 */
@Entity
public class OpenClose implements Serializable {

    @OneToMany(mappedBy = "openingHours")
    private List<Shop> shops;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private int dayNullOpen;
    private int dayNullClose;
    private int dayOneOpen;
    private int dayOneClose;
    private int dayTwoOpen;
    private int dayTwoClose;
    private int dayThreeOpen;
    private int dayThreeClose;
    private int dayFourOpen;
    private int dayFourClose;
    private int dayFiveOpen;
    private int dayFiveClose;
    private int daySixOpen;
    private int daySixClose;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Shop> getShops() {
        return shops;
    }

    public void setShops(List<Shop> shops) {
        this.shops = shops;
    }

    public int getDayNullOpen() {
        return dayNullOpen;
    }

    public void setDayNullOpen(int dayNullOpen) {
        this.dayNullOpen = dayNullOpen;
    }

    public int getDayNullClose() {
        return dayNullClose;
    }

    public void setDayNullClose(int dayNullClose) {
        this.dayNullClose = dayNullClose;
    }

    public int getDayOneOpen() {
        return dayOneOpen;
    }

    public void setDayOneOpen(int dayOneOpen) {
        this.dayOneOpen = dayOneOpen;
    }

    public int getDayOneClose() {
        return dayOneClose;
    }

    public void setDayOneClose(int dayOneClose) {
        this.dayOneClose = dayOneClose;
    }

    public int getDayTwoOpen() {
        return dayTwoOpen;
    }

    public void setDayTwoOpen(int dayTwoOpen) {
        this.dayTwoOpen = dayTwoOpen;
    }

    public int getDayTwoClose() {
        return dayTwoClose;
    }

    public void setDayTwoClose(int dayTwoClose) {
        this.dayTwoClose = dayTwoClose;
    }

    public int getDayThreeOpen() {
        return dayThreeOpen;
    }

    public void setDayThreeOpen(int dayThreeOpen) {
        this.dayThreeOpen = dayThreeOpen;
    }

    public int getDayThreeClose() {
        return dayThreeClose;
    }

    public void setDayThreeClose(int dayThreeClose) {
        this.dayThreeClose = dayThreeClose;
    }

    public int getDayFourOpen() {
        return dayFourOpen;
    }

    public void setDayFourOpen(int dayFourOpen) {
        this.dayFourOpen = dayFourOpen;
    }

    public int getDayFourClose() {
        return dayFourClose;
    }

    public void setDayFourClose(int dayFourClose) {
        this.dayFourClose = dayFourClose;
    }

    public int getDayFiveOpen() {
        return dayFiveOpen;
    }

    public void setDayFiveOpen(int dayFiveOpen) {
        this.dayFiveOpen = dayFiveOpen;
    }

    public int getDayFiveClose() {
        return dayFiveClose;
    }

    public void setDayFiveClose(int dayFiveClose) {
        this.dayFiveClose = dayFiveClose;
    }

    public int getDaySixOpen() {
        return daySixOpen;
    }

    public void setDaySixOpen(int daySixOpen) {
        this.daySixOpen = daySixOpen;
    }

    public int getDaySixClose() {
        return daySixClose;
    }

    public void setDaySixClose(int daySixClose) {
        this.daySixClose = daySixClose;
    }
    
    


    
}
