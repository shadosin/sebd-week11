package com.kenzie.supportingmaterials;

import java.util.List;

public class MovieDTO {
private String title;
private String year;
private String rated;

private String released;

private List<String> genre;

private String actors;
private String plot;
private String language;
private List<Ratings> ratings;
private String metascore;
private String imdbRating;
private String imdbVotes;
private String imdbID;
private String type;

public class Ratings{
    private String source;
    private String value;
}


}