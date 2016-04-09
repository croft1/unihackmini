package m.unihackmini;

/**
 * Created by David on 9/04/16.
 */
public class Review {
    // quick review fields (7 items)
    private String id;
    private int rating;             // star rating
    private int cleanliness;
    private Boolean hasWifi;
    private int duration;
    private String comment;
    private String username;        // can be anon

    // standard review  (9 items)
    private int modernity;
    private int traffic;

    // long review fields (11 items)
    private int tpAbundance;
    private String dryer;

    // quick review constructor
    public Review(String id, int rating, int cleanliness, int duration, Boolean hasWifi, String comment, String username) {
        this.id = id;
        this.rating = rating;
        this.cleanliness = cleanliness;
        this.duration = duration;
        this.hasWifi = hasWifi;
        this.comment = comment;
        this.username = username;
    }

    // standard review constructor
    public Review(String id, int rating, int cleanliness, int modernity, int traffic, int duration, Boolean hasWifi, String comment, String username) {
        this.id = id;
        this.rating = rating;
        this.cleanliness = cleanliness;
        this.modernity = modernity;
        this.traffic = traffic;
        this.duration = duration;
        this.hasWifi = hasWifi;
        this.comment = comment;
        this.username = username;
    }

    // long review constructor
    public Review(String id, int rating, int cleanliness, int modernity, int traffic, int duration, Boolean hasWifi, String comment, String username, int tpAbundance, String dryer) {
        this.id = id;
        this.rating = rating;
        this.cleanliness = cleanliness;
        this.modernity = modernity;
        this.traffic = traffic;
        this.duration = duration;
        this.hasWifi = hasWifi;
        this.comment = comment;
        this.username = username;
        this.tpAbundance = tpAbundance;
        this.dryer = dryer;
    }


    public int getRating() {
        return rating;
    }

    public Boolean getWifi() {
        return hasWifi;
    }

    public int getCleanliness() {
        return cleanliness;
    }

    public int getDuration() {
        return duration;
    }

    public String getId() {
        return id;
    }

    public int getModernity() {
        return modernity;
    }

    public int getTraffic() {
        return traffic;
    }

    public String getComment() {
        return comment;
    }

    public String getUsername() {
        return username;
    }

    public String description(){
        return comment + "\n" + username + "duration: " + duration + ", Traffic:" + traffic + " Rating: " + rating;
    }

}



