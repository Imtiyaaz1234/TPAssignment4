package com.Imtiyaaz.Assignment4.PrincipleLeastKnowledge;

/**
 * Created by Ameer on 2017/03/31.
 */
public class PLKfix {
    public void process(ProcessFix o)
    {
        InvoiceFix msg = o.getMessage();
        msg.normalize();
        ((InvoiceFix) o.getMessage).normalize();

    }
}
