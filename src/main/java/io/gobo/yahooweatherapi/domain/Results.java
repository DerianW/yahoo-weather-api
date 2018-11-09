package io.gobo.yahooweatherapi.domain;



public class Results
{


    private Channel channel;



    public Results(){}

    public Results(Channel channel) { this.channel = channel; }


    public Channel getChannel() { return channel; }
    public void setChannel(Channel channel) { this.channel = channel; }



    @Override
    public String toString()
    {
        return "Results{" +
                "channel=" + channel +
                '}';
    }



}
