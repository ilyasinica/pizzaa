public class Hawai extends Pizza{
    private String pineapple;
    public Hawai(String cheese, String meat, String greenery, String souce, String tomato, String oregano, String pineapple) {
        super(cheese, meat, greenery, souce, tomato, oregano);
        this.pineapple = pineapple;
    }
    public String printInfo(){
        return("cheese - " + getCheese() + "\n" + "meat - " + getMeat()  + "\n" + "greenery - " +getGreenery() + "\n" + "souce - " + getSouce()  + "\n" + "tomato - " + getTomato()  + "\n" + "oregano - " +getOregano() + "\n" + "pineapple - " + pineapple);
    }
}
