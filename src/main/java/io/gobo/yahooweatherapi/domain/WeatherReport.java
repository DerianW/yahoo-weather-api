package io.gobo.yahooweatherapi.domain;



public class WeatherReport
{



    private Query query;



    public WeatherReport(){}

    public WeatherReport(Query query) { this.query = query; }



    public Query getQuery() { return query; }
    public void setQuery(Query query) { this.query = query; }


    @Override
    public String toString()
    {
        return "WeatherReport{" +
                "query=" + query +
                '}';
    }



}
