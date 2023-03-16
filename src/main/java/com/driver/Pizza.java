package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean cheese ;
    private boolean toppings ;
    private boolean take ;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg==true)
        {
            price = price + 300 ;
        }
        else {
            price = price + 400 ;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){

        if(!cheese)
        {
            cheese = true ;
            price = price + 80 ;
        }

    }

    public void addExtraToppings(){
        if(!toppings) {
            toppings = true;
            if (isVeg == true) {
                price = price + 70;
            } else {
                price = price + 120;
            }
        }
    }

    public void addTakeaway(){
        if(!take) {
            price = price + 20;
            take = true;
        }
    }

    public String getBill(){
        if(isVeg==true)
        {
            this.bill = "Base Price Of The Pizza: " + 300;
        }
        else {
            this.bill = "Base Price Of The Pizza: " + 400;
        }

        if(this.cheese)
        {
            this.bill=this.bill+ "\n" +"Extra Cheese Added: "+80;
        }

        if(this.toppings)
        {
            if(this.isVeg)
            {
                this.bill=this.bill+"\n" +"Extra Toppings Added: "+70;
            }
            else
            {
                this.bill=this.bill+"\n" +"Extra Toppings Added: "+120;
            }
        }

        if(take==true)
        {
            this.bill=this.bill+'\n'+"Paperbag Added: "+20;
        }

        this.bill=this.bill+"\n"+"Total Price: "+this.price+"\n" ;

            return this.bill;
    }
}
