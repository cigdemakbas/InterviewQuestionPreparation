package org.example.javaExamples.okPackage.YesPAckage;

import org.junit.Test;

public class a {
    a(){
        System.out.println("Parent class cons");
    }


}

class b extends a{
    b(int age){
super();
        System.out.println("child class cons...");
    }
    b(){

       this(12);
        System.out.println("child class cons");
    }

    public static void main(String[] args) {
        b object= new b(15);
    }

}
