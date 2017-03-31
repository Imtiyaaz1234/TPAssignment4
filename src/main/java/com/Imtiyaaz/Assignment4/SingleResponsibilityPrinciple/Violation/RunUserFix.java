package com.Imtiyaaz.Assignment4.SingleResponsibilityPrinciple.Violation;

/**
 * Created by Ameer on 2017/03/31.
 */
public class RunUserFix {
    public static void main(String [] args) {


        UserFix use = new UserFix();
        use.setSender("Anyone");
        use.setReciever("Someone");
        use.setContent("Hey");
        System.out.println(use.toString());
    }
}
