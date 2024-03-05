public class Ferrara extends Pizza{
    private String onion;
    private String bacon;
    public Ferrara(String cheese, String meat, String greenery, String souce, String tomato, String oregano, String onion, String bacon) {
        super(cheese, meat, greenery, souce, tomato, oregano);
        this.onion = onion;
        this.bacon = bacon;
    }
    public String printInfo(){
        return("cheese - " + getCheese() + "\n" + "meat - " + getMeat()  + "\n" + "greenery - " +getGreenery() + "\n" + "souce - " + getSouce()  + "\n" + "tomato - " + getTomato()  + "\n" + "oregano - " +getOregano() + "\n" + "onion - " + onion + "\n" + "bacon - " + bacon + "\n");
    }
}
