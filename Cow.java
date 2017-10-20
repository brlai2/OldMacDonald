class Cow implements Animal 
{     
     private String setType;     
     private String setSound;      
     public Cow(String type, String sound)     
     {         
         myType = type;         
         mySound = sound;     
     }     
     public Cow()     {         
         myType = "unknown";         
         mySound = "unknown";     
     }      
     public String getSound(){return getSound;}     
     public String getType(){return getType;} 
}