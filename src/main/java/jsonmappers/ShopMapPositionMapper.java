/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonmappers;

import entity.ShopMapPosition;
import java.math.BigDecimal;

/**
 *
 * @author TimmosQuadros
 */
public class ShopMapPositionMapper {
    
    private double x;
    private double y;

    public ShopMapPositionMapper(ShopMapPosition pos) {
        x = pos.getX();
        y = pos.getY();
    }
    
    
    
}
