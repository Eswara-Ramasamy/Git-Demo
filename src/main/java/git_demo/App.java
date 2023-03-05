package git_demo;

import java.sql.SQLOutput;

public class App {

    public void addData(String name) {
        System.out.println("Data = " +name);

        if (name.equals(appconst.name)) {
            System.out.println("welcome");
        }

    }
    
    public void addData2() {
          System.out.println("commit in repo");
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

}
