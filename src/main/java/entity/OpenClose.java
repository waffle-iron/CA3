/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author TimmosQuadros
 */
@Entity
public class OpenClose implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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


    
}
