package com.Imtiyaaz.Assignment4.SingleResponsibilityPrinciple.Violation;

/**
 * Created by Ameer on 2017/03/30.
 */
public class RunUser {
    public static void main(String[]args)
    {
        User use = new User();
        use.setSender("Anyone");
        use.setReceiver("Someone");
        use.setContent("Hey");
        System.out.println(use.toString());
    }
}
