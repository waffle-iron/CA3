/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonmappers;

//import entity.Address;
import entity.CityInfo;
import entity.OpenClose;
import entity.Picture;
import entity.Shop;
import entity.User;
import enums.Category;
import java.util.List;

/**
 *
 * @author TimmosQuadros
 */
public class ShopMapper {
    
    private String name;
    private String street;
    private String housenumber;
    private String phone;
    private String email;
    private OpenCloseMapper openingHours;
    private String website;
    private Category category;
    private String description;
    private String placeId;
    private CityInfo cityInfo;
    private User user;
    

    public ShopMapper(Shop shop) {
        name = shop.getName();
       street = shop.getStreet();
       housenumber = shop.getHousenumber();
        phone = shop.getPhone();
        email = shop.getEmail();
        cityInfo = shop.getCityInfo();
        user = shop.getUser();
        
        
        
        OpenClose openClose = shop.getOpeningHours();
        if(openClose!=null){
            openingHours = new OpenCloseMapper(openClose);
        }else{
            openingHours = new OpenCloseMapper(new OpenClose());
        }
        website = shop.getWebsite();
        category = shop.getCategory();
        description = shop.getDescription();
        placeId = shop.getGoogleShopId();

    }

    public String getPlaceId() {
        return placeId;
    }

    public void setPlaceId(String placeId) {
        this.placeId = placeId;

    }

   
    

    public OpenCloseMapper getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(OpenCloseMapper openingHours) {
        this.openingHours = openingHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHousenumber() {
        return housenumber;
    }

    public void setHousenumber(String housenumber) {
        this.housenumber = housenumber;
    }

    public CityInfo getCityInfo() {
        return cityInfo;
    }

    public void setCityInfo(CityInfo cityInfo) {
        this.cityInfo = cityInfo;
    }

   
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

   
    
    
    
    
    
}
