package org.example.javaExamples.okPackage.YesPAckage;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringSplitMethod {
    public static void main(String[] args) {
        String str="Merhaba, Cigdem Akbas";
        String[] st;
        st = str.split(",");
        System.out.println(Arrays.toString(st));

    }
}
