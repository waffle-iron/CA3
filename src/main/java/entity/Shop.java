package entity;

import enums.Category;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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

    @Column(length = 500)
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

    @OneToMany(mappedBy = "shop")
    private List<Picture> pictures;

    @Size(max = 45)
    private String street;

    @Size(max = 45)
    @Column(name = "HOUSENUMBER")
    private String houseNumber;


    @ManyToOne
   // @Column(name = "CITYINFO")
   @JoinColumn(name = "CITYINFO", referencedColumnName = "ZIP")
    private CityInfo cityInfo;

    public Shop(String name, String email, String phone, String street, String description, String website, String houseNumber, Category category) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.street = street;
        this.description = description;
        this.website = website;
        this.category = category;
        this.houseNumber = houseNumber;
        this.updated = new Date();
    }

    public Shop() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

//    public Address getAdress() {
//        return adress;
//    }
//
//    public void setAdress(Address adress) {
//        this.adress = adress;
//    }
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

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHousenumber() {
        return houseNumber;
    }

    public void setHousenumber(String housenumber) {
        this.houseNumber = housenumber;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public CityInfo getCityInfo() {
        return cityInfo;
    }

    public void setCityInfo(CityInfo cityInfo) {
        this.cityInfo = cityInfo;
    }

}
