
package jsonmappers;

import entity.ShopMapPosition;


public class ShopMapPositionMapper {
    
    private double x;
    private double y;
    private double angle;

    public ShopMapPositionMapper(ShopMapPosition pos) {
        x = pos.getX();
        y = pos.getY();
        angle = pos.getAngle();
    }
    
    
    
}
