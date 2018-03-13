package com.assignment4.ISP;

interface Job{
    public void build();
}

interface Rest{
    public void sleep();
}
class Builder implements Job, Rest{
    public void build(){
        System.out.println("Builds wall");
    }

    public void sleep(){
        System.out.println("sleeps in bed");
    }

}

class Test{

    public static void main(String[]args)
    {
        Builder builder = new Builder();

        builder.build();
        builder.sleep();
    }

}
