package com.Imtiyaaz.Assignment4.SingleResponsibilityPrinciple.Violation;

/**
 * Created by Ameer on 2017/03/30.
 */
public class UserFix {
    private String sender;
    private String receiver;
    private String content;

    public String toString() {
        return String.format("Sender: %s\n Receiver: %s\n Message: %s", getSender(),getReceiver(),getContent());
    }

    public void setSender(String sender) {

        this.sender = sender;
    }

    public void setReceiver(String receiver) {
        // TODO Auto-generated method stub
        this.receiver = receiver;
    }

    public void setContent(String content) {

        this.content = content;
    }

    public String getSender()
    {
        return sender;
    }

    public String getReceiver()
    {
        return receiver;
    }

    public String getContent()
    {
        return content;
    }
}
