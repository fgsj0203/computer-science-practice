import java.util.Scanner;

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float temperature;
    System.out.println("What of temperature: \n");
    temperature = sc.nextFloat();

    System.out.println("The temperature is: " + temperature);
    sc.close();
}