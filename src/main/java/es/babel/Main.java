package es.babel;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {

        // Serialization
        Persona persona1 = new Persona("Mireya", "Medalle", 27);
        Gson gson = new Gson();
        String json = gson.toJson(persona1);
        System.out.println(json);

        // Deserialization
        Persona persona2 = gson.fromJson(json, Persona.class);
        System.out.println(persona2);

    }
}