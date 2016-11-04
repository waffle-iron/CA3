/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import entity.Shop;
import facades.UserFacade;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.scene.input.KeyCode.T;
import javax.json.JsonException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import jsonmappers.ShopMapper;
import security.IUserFacade;
import security.UserFacadeFactory;
import utils.ExternalURLRESTCall;

/**
 * REST Web Service
 *
 * @author TimmosQuadros
 */
@Path("shop")
public class ShopRest {

    @Context
    private UriInfo context;
    private String key = "AIzaSyCk7blviPaQ3wPLGzDt7Dndzikj4bNeLI0"; // this is the developer key needed to make the REST call
    private IUserFacade facade;
    static Gson gson = new GsonBuilder().setPrettyPrinting().create();

    /**
     * Creates a new instance of Shop
     */
    public ShopRest() {
        facade = UserFacadeFactory.getInstance();
    }

    /**
     * Retrieves representation of an instance of rest.ShopRest
     * @return an instance of java.lang.String
     * @throws java.io.IOException
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("update/all")
    public String getGoogleData() throws IOException {
        JsonObject jsonObject;
        String result = "{}";
//        try {
            jsonObject = ExternalURLRESTCall.readJsonFromUrl("https://maps.googleapis.com/maps/api/place/textsearch/json?query=shops+in+Norrebro&key="+key);
            result = jsonObject.toString();
            //return "";
//        } catch (IOException ex) {
//            System.err.println(ex.getStackTrace());
//        } catch (JsonException ex) {
//            System.err.println(ex.getStackTrace());
//        } catch (Exception ex){
//            System.err.println(ex.getStackTrace());
//        }
        return result;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("all")
    public String getAllShops() {
        
        
        
        List<entity.Shop> shops = facade.getAllShops();
        List<jsonmappers.ShopMapper> shopmappers = new ArrayList<>();
        
        for(entity.Shop shop : shops) {
            shopmappers.add(new ShopMapper(shop));
        }
        
        return gson.toJson(shopmappers);
    }

    /**
     * PUT method for updating or creating an instance of ShopRest
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
    
    
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public String addShop(String content){      
        Shop s = gson.fromJson(content, Shop.class);
        Shop newShop = facade.create(s);
        return gson.toJson(newShop);
    }
    
}
