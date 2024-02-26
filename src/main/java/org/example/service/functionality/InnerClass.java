package org.example.service.functionality;

public class InnerClass {
    public static void main(String[] arg) {


        // creating object of inner static class
        InnerStaticAndNonStaticClass.InnerStaticClass staticObj = new
                InnerStaticAndNonStaticClass.InnerStaticClass();
        staticObj.printMessage();

        // creating object of inner non-static class
        InnerStaticAndNonStaticClass outerClass = new InnerStaticAndNonStaticClass();
        InnerStaticAndNonStaticClass.InnerNonStaticClass nonStaticObj = outerClass.new InnerNonStaticClass();
        nonStaticObj.display();
    }
}
