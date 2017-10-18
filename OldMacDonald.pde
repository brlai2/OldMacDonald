public void setup() {     
    Cow c = new Cow("cow", "moo");   
    System.out.println(c.getType() + " goes " + c.getSound());
    Chick b = new Chick("chirp", "peak");
    System.out.println(b.getType() + " goes" + b.getSound());
}