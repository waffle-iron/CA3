/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import enums.Category;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.validation.constraints.Size;

/**
 *
 * @author TimmosQuadros
 */
@Entity
public class Shop implements Serializable {

    @ManyToOne
    private User user;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String email;
    private String phone;

    @ManyToOne(optional = false, cascade = CascadeType.PERSIST)
    private Address adress;

    @Column(length=500)
    private String description;
    
    private String website;

    @Enumerated(EnumType.STRING)
    private Category category;

    private String googleShopId;

    @OneToOne
    private ShopMapPosition pos;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date updated;
    
    @ManyToOne
    private OpenClose openingHours;

    public Shop(String name, String email, String phone, Address adress, String description, String website, Category category, Date updated) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.adress = adress;
        this.description = description;
        this.website = website;
        this.category = category;
        this.updated = updated;
    }

    public Shop() {
    }

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Shop)) {
            return false;
        }
        Shop other = (Shop) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Shop[ id=" + id + " ]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAdress() {
        return adress;
    }

    public void setAdress(Address adress) {
        this.adress = adress;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getGoogleShopId() {
        return googleShopId;
    }

    public void setGoogleShopId(String googleShopId) {
        this.googleShopId = googleShopId;
    }

    public ShopMapPosition getPos() {
        return pos;
    }

    public void setPos(ShopMapPosition pos) {
        this.pos = pos;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public OpenClose getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(OpenClose openingHours) {
        this.openingHours = openingHours;
    }
    
    
    
    

}
