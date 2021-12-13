/**
 * Java Core. HomeWork 4
 *
 * @author Mark
 * @version 12.12.2021
 */
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class BrandsAndPhoneBook {
    public static void main(String[] args) {
        System.out.println("Phone brands:");
        String[] brands = {"iPhone", "LG", "Samsung", "Nokia", "Sony", "Huawei", "Honor",
        "iPhone", "Nokia", "Nokia", "Sony", "Honor", "LG", "Nokia", "iPhone"};
        HashMap<String, Integer> gb = new HashMap<>();
        for (String s: brands) {
            gb.put(s, 0);
        }
        for (Map.Entry<String, Integer> o : gb.entrySet()) {
            System.out.print(o.getKey()+", ");
        }
        System.out.println();

        for (String s: brands) {
            if (gb.get(s) == null) {
                gb.put(s, 1);
            }
            else {
                gb.put(s, gb.get(s)+1);
            }
        }
        
        System.out.println(gb);
        System.out.println();
        System.out.println("Contacts:");
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Grozniy", "89212312233");
        phoneBook.add("Plusheviy", "89214356786");
        phoneBook.add("Kolyuchiy", "89216541234");
        phoneBook.add("Kaketliviy", "89215461234");
        phoneBook.add("Kaketliviy", "89217894365");
        phoneBook.add("Plusheviy", "89212314312");
        phoneBook.add("Kaketliviy", "89213416576");
        phoneBook.add("Kaketliviy", "89212341254");
        
        System.out.println("Grozniy - " + phoneBook.get("Grozniy"));
        System.out.println("Plusheviy - " + phoneBook.get("Plusheviy"));
        System.out.println("Kolyuchiy - " + phoneBook.get("Kolyuchiy"));
        System.out.println("Kaketliviy - " + phoneBook.get("Kaketliviy"));
    }
}