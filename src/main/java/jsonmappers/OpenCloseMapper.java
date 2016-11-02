/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonmappers;

import entity.OpenClose;

/**
 *
 * @author TimmosQuadros
 */
public class OpenCloseMapper {
    
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

    public OpenCloseMapper(OpenClose openClose) {
        dayNullOpen = openClose.getDayNullOpen();
        dayOneOpen = openClose.getDayOneOpen();
        dayTwoOpen = openClose.getDayTwoOpen();
        dayThreeOpen = openClose.getDayThreeOpen();
        dayFourOpen = openClose.getDayFourOpen();
        dayFiveOpen = openClose.getDayFiveOpen();
        daySixOpen = openClose.getDaySixOpen();
        
        dayNullClose = openClose.getDayNullClose();
        dayOneClose = openClose.getDayOneClose();
        dayTwoClose = openClose.getDayTwoClose();
        dayThreeClose = openClose.getDayThreeClose();
        dayFourClose = openClose.getDayFourClose();
        dayFiveClose = openClose.getDayFiveClose();
        daySixClose = openClose.getDaySixClose();
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
