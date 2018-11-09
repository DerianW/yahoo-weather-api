package io.gobo.yahooweatherapi.domain;



public class Query
{



    private Integer count;
    private String created;
    private String lang;
    private Results results;



    public Query(){}

    public Query(Integer count, String created, String lang, Results results)
    {
        this.count = count;
        this.created = created;
        this.lang = lang;
        this.results = results;
    }



    public Integer getCount() { return count; }
    public void setCount(Integer count) { this.count = count; }

    public String getCreated() { return created; }
    public void setCreated(String created) { this.created = created; }

    public String getLang() { return lang; }
    public void setLang(String lang) { this.lang = lang; }

    public Results getResults() { return results; }
    public void setResults(Results results) { this.results = results; }



    @Override
    public String toString()
    {
        return "Query{" +
                "count=" + count +
                ", created='" + created + '\'' +
                ", lang='" + lang + '\'' +
                ", results=" + results +
                '}';
    }



}
