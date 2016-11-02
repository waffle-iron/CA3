/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonmappers;

import entity.Address;

/**
 *
 * @author TimmosQuadros
 */
public class AddressMapper {
    
    private String additionalInfo;
    private String street;
    private CityInfoMapper cityInfoM;

    public AddressMapper(Address address) {
        additionalInfo = address.getAdditionalInfo();
        street = address.getStreet();
        cityInfoM = new CityInfoMapper(address.getCityinfo());
    }
    
    
    
}
