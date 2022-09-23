public class Duck {
    private static String name;
    private static String color;
    private static int feet;
    private static double weight;

    //setters
    public void setName (String setName){
        this.name = setName;
    }
    public void setColor (String setColor){
        this.color = setColor;
    }
    public void setFeet ( int setFeet){
        this.feet = setFeet;
    }
    public void setWeight ( double setWeight){
        this.weight = setWeight;
    }
    

    //getters
    public String getName(){
        return this.name;
    }
    public String getColor(){
        return this.color;
    }
    public int getFeet(){
        return this.feet;
    }
    public double getWeight(){
        return this.weight;
    }

    public Duck(){
    }
    public Duck(String setName){
        this.name = setName;
    }
    public Duck(String setName, String setColor){
        this.name = setName;
        this.color = setColor;
    }
    public Duck(String setName, double setWeight){
        this.name = setName;
        this.weight = setWeight;
    }
    public Duck(String setName, double setWeight, int setFeet){
        this.name = setName;
        this.weight = setWeight;
        this.feet = setFeet;
    }
    public Duck(String setName, String setColor, double setWeight, int setFeet){
        this.name = setName;
        this.weight = setWeight;
        this.feet = setFeet;
        this.color = setColor;
    }
    public Duck(double setWeight){
        this.weight = setWeight;
    }
    public Duck(double setWeight, int setFeet){
        this.weight = setWeight;
        this.feet = setFeet;
    }


}
