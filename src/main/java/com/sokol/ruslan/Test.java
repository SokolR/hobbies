package com.sokol.ruslan;

import com.sokol.ruslan.hobbies.*;

/**
 * Hello world!
 *
 */
public class Test {
    public static void main(String[] args) {
        Hobby[] hobbies = new Hobby[2];

        hobbies[0] = new Football("football", (byte)1, (short) 2, 3, 4L, 5.2f, 7.7d, 'A', true, "Dinamo");
        hobbies[1] = new Fishing("fishing", (byte)1, (short) 2, 3, 4L, 77);

        for (Hobby hobby:hobbies) {
            System.out.println(hobby.tellAboutHobby());
        }
    }
}
