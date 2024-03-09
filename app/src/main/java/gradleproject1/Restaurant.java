package gradleproject1;

public class Restaurant {
    
    private String resturant_name;
    private String Id;
    private String location;
    
    public Restaurant(String res_name,String id,String loc){
    this.Id=id;
    this.location=loc;
    this.resturant_name=res_name;   
    }
    //------setters beginning 
    public void setName(String name){
    this.resturant_name=name;
    }
    
    public void setId(String id){
    this.Id=id;
    }
    
    public void setLocation(String loc){
    this.location=loc;
    }
    //-------setters ending
    
    //-------getters beginning
    public String getName(){
    return resturant_name;
    }
    
    public String getID(){
    return Id;
    }
    
    public String getLocation(){
    return location;
    }
    //-------getters ending
}
