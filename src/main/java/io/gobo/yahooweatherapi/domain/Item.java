package io.gobo.yahooweatherapi.domain;



public class Item
{



    private Condition condition;



    public Item(){}

    public Item(Condition condition) { this.condition = condition; }



    public Condition getCondition() { return condition; }
    public void setCondition(Condition condition) { this.condition = condition; }


    @Override
    public String toString()
    {
        return "Item{" +
                "condition=" + condition +
                '}';
    }



}
