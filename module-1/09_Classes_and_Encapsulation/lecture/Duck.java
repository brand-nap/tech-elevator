public class Duck {
    private static String name;
    private static String color;
    private static int feet;
    private static int weight;

    //setters

    public static void setName (String setName){
        name = setName;
    }
    public static void setColor (String setColor){
        color = setColor;
    }
    public static void setFeet ( int setFeet){
        feet = setFeet;
    }
    

    //getters
    public static String getName(){
        return name;
    }
    public static String getColor(){
        return color;
    }
    public static int getFeet(){
        return feet;
    }

}
