import com.co.dreamcode.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insert a Category: ");
        String line = scan.nextLine();
        switch (line.toLowerCase()) {
            case "minor appliance", "kitchen appliance", "lawn & garden", "general appliance":
                HomeAppliance h = new MinorAppliance();
                System.out.println(h.getDefaultKeyWords());
                break;
            default:
                System.out.println("Insert one of this categories: " + "minor appliance, kitchen appliance, lawn & garden, general appliance");
                System.out.println("Maybe you are insterested in our general categorie:");
                System.out.println(HomeAppliance.defaultKeyWords());
        }
        List<HomeAppliance> objects = new ArrayList<>();
        objects.add(new MinorAppliance());
        objects.add(new Lawn_Garden());
        objects.add(new KitchenAppliance());
        objects.add(new GeneralAppliance());
        System.out.print("Insert a Category: ");
        line = scan.nextLine();
        if ("lawn & garden".equals(line) || "kitchen appliance".equals(line)) {
            System.out.println("la categoria " + line + " es de nivel 3");
        } else if ("minor appliance".equals(line)) {
            System.out.println("la categoria " + line + " es de nivel 2");
        } else {
            System.out.println("la categoria " + line + " es de nivel 1");
        }

    }
}