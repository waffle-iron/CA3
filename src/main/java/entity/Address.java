/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import entity.*;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rasmus
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Address.findAll", query = "SELECT a FROM Address a"),
    @NamedQuery(name = "Address.findById", query = "SELECT a FROM Address a WHERE a.id = :id"),
    @NamedQuery(name = "Address.findByStreet", query = "SELECT a FROM Address a WHERE a.street = :street"),
    @NamedQuery(name = "Address.findByAdditionalInfo", query = "SELECT a FROM Address a WHERE a.additionalInfo = :additionalInfo")})
@XmlRootElement
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Size(max = 45)
    @Column(name = "Street")
    private String street;
    @Size(max = 45)
    @Column(name = "AdditionalInfo")
    private String additionalInfo;
    @JoinColumn(name = "CityInfo_id", referencedColumnName = "ZIP")
    
    @ManyToOne
    private CityInfo cityInfo;
    
    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "adress")
    private Collection<entity.Shop> shops;

    public Address() {
    }

    public Address(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public CityInfo getCityinfo() {
        return cityInfo;
    }

    public void setCityinfo(CityInfo cityinfo) {
        this.cityInfo = cityinfo;
    }

}
