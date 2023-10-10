package org.day2.libray;

public class Book {
    private String name;

    public void setName(String Inputname) {
        this.name = Inputname;
        if (Inputname.length() < 5){
            System.out.println(("Book name is invalid"));
            else
                this.name = inputName;
        }
    }
}
