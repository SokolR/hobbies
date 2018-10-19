package com.sokol.ruslan;

import com.sokol.ruslan.hobbies.Hobby;
import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class Test {

    final static Logger logger = Logger.getLogger(Test.class);

    public static void main(String[] args) {
        Hobby hobby1 = new Hobby();
        Hobby hobby2 = new Hobby("chess", (byte)3, (short)4, 5, 7L);
        Hobby hobby3 = new Hobby("swim", (byte)2, (short)3, 5, 20L, 2.1f, 10.5d, 'A', true);

        System.out.println(hobby1.tellAboutHobby());
        System.out.println(hobby2);
        System.out.println(hobby3);

        logger.info("hobby1: " + hobby1);
        logger.error("hobby2: " + hobby2);
        logger.debug("hobby3: " + hobby3);
    }
}
