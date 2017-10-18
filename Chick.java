class Chick implements Animal 
{     
     private String myType;     
     private String mySound;      
     public Cow(String type, String sound)//help
     {         
         myType = type;         
         mySound = sound;     
     }     
     public Chick()     {         
         myType = "unknown";         
         mySound = "unknown";     
     }      
     public String getSound(){return mySound;}     
     public String getType(){return myType;}
     public int getType()
     {
       return myType;
     }
     public int getSound()
     {
       return mySound;
     }
}