package com.example.HR_AppJava.HR_App;

//This is where we attempted to join the GUI pages together and use a communal tempDataBase

public class Main1 {
    public static void main(String[] args) {
        TempDataBase dataBase = new TempDataBase();
        Manager one = new Manager();
        one.setUsername("bob.smith@company.com");
        one.changePassword("catsAreCool");

        Manager two = new Manager();
        two.setUsername("mary.shelly@company.com");
        two.changePassword("dogsRock");

        Manager[] managers = new Manager[2];
        dataBase.addArray(dataBase.getArray(0));
        managers[0] = one;
        managers[1] = two;

        GUI_Login login = new GUI_Login(managers);
        login.createLogin();

    }
}
