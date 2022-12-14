
package boletin13_1;

import org.danielcastelao.ruben.Personal;

public class App {

    public static void main(String[] args) {
        Personal al = new Personal("aaa@aaa.aaa","111");  
        Academica obx = new Academica("aa",7,al);
            System.out.println(obx.toString());
    }
    
} 