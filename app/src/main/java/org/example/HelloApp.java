package org.example;
class Hello {
    static void main(String[] args) {
        // UC3: Handle the case where NO names are provided
        if (args.length > 0) {
            System.out.println("Hello, " + args[0] + "!");
        } else {
            System.out.println("Hello, World! (Tip: No name was provided in the arguments)");
        }
    }
}