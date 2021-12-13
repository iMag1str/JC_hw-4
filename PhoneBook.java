/**
 * Java Core. HomeWork 4
 *
 * @author Mark
 * @version 12.12.2021
 */
import java.util.HashMap;
import java.util.ArrayList;

public class PhoneBook {
    HashMap<String, ArrayList<String>> namePhone = new HashMap<>();

    public void add(String name, String phone) {
        if (namePhone.get(name) == null) {
            ArrayList<String> phones = new ArrayList<>();
            phones.add(phone);
            namePhone.put(name, phones);
        }
        else {
            namePhone.get(name).add(phone);
        }
    }

    public ArrayList<String> get(String name) {
        return namePhone.get(name);
    }
}
