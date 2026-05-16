package fundamentos;

import java.util.ArrayList;

public class Ex08Array {

    // ArrayList

    static void main(String[] args) {

        ArrayList<String> listadynamic = new ArrayList<>();

        listadynamic.add("Item 1");
        listadynamic.add("Item 2");
        listadynamic.add("Item 3");

        listadynamic.remove(1); // remove a 2ª variavel

        System.out.println("Tamanho atual: " + listadynamic.size());

    }
}
