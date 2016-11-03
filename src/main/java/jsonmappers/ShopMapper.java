/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonmappers;

import entity.Address;
import entity.OpenClose;
import entity.Shop;
import enums.Category;

/**
 *
 * @author TimmosQuadros
 */
public class ShopMapper {
    
    private String name;
    private AddressMapper address;
    private String phone;
    private String email;
    private OpenCloseMapper openingHours;
    private String website;
    private Category category;
    private String description;
    private String placeId;
    

    public ShopMapper(Shop shop) {
        name = shop.getName();
        address = new AddressMapper(shop.getAdress());
        phone = shop.getPhone();
        email = shop.getEmail();
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

    public AddressMapper getAddress() {
        return address;
    }

    public void setAddress(AddressMapper address) {
        this.address = address;
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
    
    
    
    
    
}
