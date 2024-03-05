public class Pizza {
    private String cheese;
    private String meat;
    private String greenery;
    private String souce;
    private String tomato;
    private String oregano;
    private int size;

    public Pizza(String cheese, String meat, String greenery, String souce, String tomato, String oregano) {
        this.cheese = cheese;
        this.meat = meat;
        this.greenery = greenery;
        this.souce = souce;
        this.tomato = tomato;
        this.oregano = oregano;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getGreenery() {
        return greenery;
    }

    public void setGreenery(String greenery) {
        this.greenery = greenery;
    }

    public String getSouce() {
        return souce;
    }

    public void setSouce(String souce) {
        this.souce = souce;
    }

    public String getTomato() {
        return tomato;
    }

    public void setTomato(String tomato) {
        this.tomato = tomato;
    }

    public String getOregano() {
        return oregano;
    }

    public void setOregano(String oregano) {
        this.oregano = oregano;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String printInfo() {
        return(" ");
    }
}
