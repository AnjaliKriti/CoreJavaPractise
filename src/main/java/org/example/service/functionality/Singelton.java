package org.example.service.functionality;

public class Singelton {

    private static Singelton instance = null;
    private Singelton (){}

    // this is lazy initialization but not thread safe
    public static Singelton getInstance(){
        if (instance ==  null){
            return  new Singelton();
        }else return instance;
    }
}
