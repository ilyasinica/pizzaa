public class Capri extends Pizza {
    private String champignon;
    private String cucumbers;
    public Capri(String cheese, String meat, String greenery, String souce, String tomato, String oregano, String champignon, String cucumbers) {
        super(cheese, meat, greenery, souce, tomato, oregano);
        this.champignon = champignon;
        this.cucumbers = cucumbers;
    }
    public String printInfo(){
        return("cheese - " + getCheese() + "\n" + "meat - " + getMeat()  + "\n" + "greenery - " +getGreenery() + "\n" + "souce - " + getSouce()  + "\n" + "tomato - " + getTomato()  + "\n" + "oregano - " +getOregano() + "\n" + "champignon - " + champignon + "\n" +  "cucumbers - " + cucumbers);
    }
}
