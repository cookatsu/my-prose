# Copyright (c) 2025 Sára Ahmad
# SPDX-License-Identifier: MIT


package com.example;

import com.google.gson.Gson;

public class JsonExample {
    public static void main(String[] args) {
        // 1. Objekt erstellen
        Person p = new Person("Lilo", 100);

        // 2. Gson benutzen, um das Objekt in JSON zu verwandeln
        Gson gson = new Gson();
        String json = gson.toJson(p);

        // 3. Ausgabe
        System.out.println(json);
    }
}

// Hilfsklasse für die Person
class Person {
    String name;
    int age;

    // Konstruktor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
