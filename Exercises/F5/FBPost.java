package F5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FBPost {
    private int identifier;
    private String post_creator;
    private LocalDate date;
    private int num_likes;
    private List<String> coments;

    public FBPost() {
        this.identifier = 0;
        this.post_creator = "";
        this.date = LocalDate.of(0, 0, 0);
        this.num_likes = 0;
        this.coments = new ArrayList<>();
    }

    public FBPost(int identifier, String post_creator, LocalDate date, int num_likes, List<String> coments) {
        this.identifier = identifier;
        this.post_creator = post_creator;
        this.date = LocalDate.of(date.getYear(), date.getMonth(), date.getDayOfMonth());
        this.num_likes = num_likes;
        this.coments = new ArrayList<>(coments);
    }

    public FBPost(FBPost fb) {
        this.identifier   = fb.getIdentifier();
        this.post_creator = fb.getPost_creator();
        this.date         = fb.getDate();
        this.num_likes    = fb.getNum_likes();
        if(this.coments != null) for(String s: fb.coments) this.coments.add(s);
    }

    /*
    * Getters
     */

    public int getIdentifier() {
        return this.identifier;
    }

    public int getNum_likes() {
        return this.num_likes;
    }

    public String getPost_creator() {
        return this.post_creator;
    }

    public LocalDate getDate() {
        return LocalDate.of(this.date.getYear(), this.date.getMonth(), this.date.getDayOfMonth());
    }

    public List<String> getComents() {
        return new ArrayList<String>(this.coments);
    }

    /*
    Setters
     */

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public void setPost_creator(String post_creator) {
        this.post_creator = post_creator;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setnum_likes(int num_likes) {
        this.num_likes = num_likes;
    }

    public void setComents(List<String> coments) {
        List<String> acc = new ArrayList<>();
        for(String s: coments) acc.add(s);
        this.coments = acc;
    }

    public void set_singlecoment(String comment) {
        this.coments.add(comment);
    }
    /*
    Useful methods
     */
    public String toString() {
        return "\nFBPost: " +
                "\nidentifier=" + identifier +
                "\npost_creator='" + post_creator + '\'' +
                "\ndate=" + date +
                "\nnum_likes=" + num_likes +
                "\ncoments=" + coments;
    }

    public FBPost clone() {
        return new FBPost(this);
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FBPost)) return false;
        FBPost fbPost = (FBPost) o;
        return this.identifier == fbPost.getIdentifier()                    &&
                this.num_likes == fbPost.getNum_likes()                     &&
                Objects.equals(this.post_creator, fbPost.getPost_creator()) &&
                Objects.equals(this.date, fbPost.getDate())                 &&
                Objects.equals(this.coments, fbPost.getComents());
    }

}


