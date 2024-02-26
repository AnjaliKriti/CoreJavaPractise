package org.example.service.functionality;

public  class InnerStaticAndNonStaticClass {

    private static String msg = "GeeksForGeeks";
    public static class InnerStaticClass {
        public void printMessage()
        {
            System.out.println(
                    "Message from nested static class: " + msg);
        }
    }

    public class InnerNonStaticClass {
        public void display()
        {

            // Print statement whenever this method is
            // called
            System.out.println(
                    "Message from non-static nested class: "
                            + msg);
        }
    }

}

