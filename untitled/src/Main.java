import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose pizza type");
        System.out.println("1 - Hawai");
        System.out.println("2 - Capri");
        System.out.println("3 - Ferrara");
        int type = sc.nextInt();
        ArrayList<Pizza> pizzas = new ArrayList<>();
        Hawai h = new Hawai("mozarela", "ham", "+", "tomato", "-", "+", "+");
        Capri c = new Capri("mozarela", "ham", "+", "tomato", "-", "+", "+", "+");
        Ferrara f = new Ferrara("mozarela", "ham", "+", "tomato and mayonnaise", "+", "+", "+", "+");
        if (type == 1) {
            System.out.println("Chosen pizza - Hawai");
            pizzas.add(h);
            System.out.println("Choose your size : 20cm, 30cm, 40cm, 50cm");
        }
            /*int size = sc.nextInt();
            int price = 0;
            if(size==20){
                price = 6;
                System.out.println("Price - " +price);
            } else if (size==30){
                price = 8;
                System.out.println("Price - " +price);
            } else if (size==40) {
                price = 10;
                System.out.println("Price - " +price);
            } else if (size==50){
                price = 12;
                System.out.println("Price - " +price);
            } else {
                System.out.println("Size is not avalaible");
            }
            System.out.println("Accept your order, press 1 - agree, press 2 - decline");
            int o = sc.nextInt();
            if(o==1){
                System.out.println("Thanks!");
            } else {
                System.out.println("Come again!");
            }
        } */
        else if (type == 2) {
            System.out.println("Chosen pizza - Capri");
            pizzas.add(c);
            System.out.println("Choose your size : 20cm, 30cm, 40cm, 50cm");
        }
            /*int size = sc.nextInt();
            int price = 0;
            if(size==20){
                price = 6;
                System.out.println("Price - " +price);
            } else if (size==30){
                price = 8;
                System.out.println("Price - " +price);
            } else if (size==40) {
                price = 10;
                System.out.println("Price - " +price);
            } else if (size==50){
                price = 12;
                System.out.println("Price - " +price);
            } else {
                System.out.println("Size is not avalaible");
            }
            System.out.println("Accept your order, press 1 - agree, press 2 - decline");
            int o = sc.nextInt();
            if(o==1){
                System.out.println("Thanks!");
            } else {
                System.out.println("Come again!");
            }
        }*/
        else if (type == 3) {
            System.out.println("Chosen pizza - Ferrara");
            pizzas.add(c);
            System.out.println("Choose your size : 20cm, 30cm, 40cm, 50cm");}
        else {}
            /*int size = sc.nextInt();
            int price = 0;
            if(size==20){
                price = 6;
                System.out.println("Price - " +price);
            } else if (size==30){
                price = 8;
                System.out.println("Price - " +price);
            } else if (size==40) {
                price = 10;
                System.out.println("Price - " +price);
            } else if (size==50){
                price = 12;
                System.out.println("Price - " +price);
            } else {
                System.out.println("Size is not avalaible");
            }
            System.out.println("Accept your order, press 1 - agree, press 2 - decline");
            int o = sc.nextInt();
            if(o==1){
                System.out.println("Thanks!");
            } else {
                System.out.println("Come again!");
            }
        }*/
            String str = "";
            for (Pizza i : pizzas) {
                str = str + "Choose pizza type!" + "\n";
                str = str + "1 - Hawai" + "\n";
                str = str + "2 - Capri" + "\n";
                str = str + "3 - Ferrara" + "\n";
                int size = sc.nextInt();
                if (type == 1) {
                    str = str + "Chosen pizza - Hawai" + "\n";
                    str = str + h.printInfo();
                } else if (type == 2) {
                    str = str + "Chosen pizza - Capri" + "\n";
                    str = str + c.printInfo();
                } else if (type == 3) {
                    str = str + "Chosen pizza - Ferrara" + "\n";
                    str = str + f.printInfo();
                }
                str = str + "Choose your size : 20cm, 30cm, 40cm, 50cm" + "\n";
                int price = 0;
                if (size == 20) {
                    price = 6;
                    str = str + "Price - " + price + "\n";
                } else if (size == 30) {
                    price = 8;
                    str = str + "Price - " + price + "\n";
                } else if (size == 40) {
                    price = 10;
                    str = str + "Price - " + price + "\n";
                } else if (size == 50) {
                    price = 12;
                    str = str + "Price - " + price + "\n";
                } else {
                    str = str + "Size is not avalaible" + "\n";
                }
                System.out.println("Accept your order, press 1 - agree, press 2 - decline" + "\n");
                str = str + "Accept your order, press 1 - agree, press 2 - decline" + "\n";
                int o = sc.nextInt();
                if (o == 1) {
                    str = str + "Thanks!" + "\n";
                } else {
                    str = str + "Come again!" + "\n";
                }
            }
            System.out.println(str);
            try {
                FileWriter fw = new FileWriter("pizzas.txt");
                fw.write(str);
                fw.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }