package com.lxb.guet_music;

import org.apache.commons.lang.enums.Enum;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Scanner;

@SpringBootTest
class GuetMusicApplicationTests {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            int num = in.nextInt();
            String b = in.next();
            ArrayList<Double> arrayList = new ArrayList();
            int temp = 10;
            double height;
            String s = String.valueOf(num);
            int length = s.length();
            double width = 0;
            double t = 0;
            for (int i = 1; i <= length; i++) {
                arrayList.add((num % temp)/(Math.pow(10,i - 1)));

            }
            height = arrayList.get(0);

            for (int i = 0; i < arrayList.size(); i++) {
                width += arrayList.get(i);
                i++;
            }
            double qh = 0;
            for (int i = 0; i < arrayList.size(); i++) {
                qh += qh + arrayList.get(i);
            }

            System.out.println(qh);
            System.out.println(height);
            System.out.println(width);


        }

        @Test
    public void t(){
            Scanner in = new Scanner(System.in);
            while (in.hasNextInt()) {
                int a = in.nextInt();
                int b = in.nextInt();
                System.out.println(a + b);
            }
        }


}
