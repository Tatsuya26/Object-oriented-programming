package com.company.F4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class FBfeed {
    private List<FBPost> time_line;

    public FBfeed() {
        this.time_line = new ArrayList<>();
    }

    public FBfeed(List<FBPost> fb) {
        this.time_line = new ArrayList<>(fb);
    }

    public FBfeed(FBfeed fb) {
        for(FBPost f: fb.time_line) this.time_line.add(f.clone());
    }

    public int nrPosts(String user) {
        return (int) this.time_line.stream().filter((FBPost f)->f.getPost_creator().equals(user)).count();
    }

    public void add_to_feed(FBPost fb) {
        this.time_line.add(fb.clone());
    }


    public List<FBPost> postsOf(String user) {
        return this.time_line.stream().filter((FBPost f)->f.getPost_creator().equals(user)).collect(Collectors.toList());
    }

    public List<FBPost> postsOf(String user, LocalDate inicio, LocalDate fim) {
        return this.postsOf(user).stream().
                                filter((FBPost f)->f.getDate().isAfter(inicio) && f.getDate().isBefore(fim)).
                                collect(Collectors.toList());
    }

    public FBPost getPost(int id) {
        for(FBPost fb: this.time_line) if(fb.getIdentifier() == id) return fb;
        return null;
    }

    public void comment(FBPost post, String comentario){
        Iterator<FBPost> it = this.time_line.iterator();
        boolean found = false;
        FBPost fb;
        while(it.hasNext() && !found) {
            fb = it.next();
            if(fb.equals(post)) {
                found = true;
                fb.set_singlecoment(comentario);
            }
        }
    }

    public void like(int postid) {
        Iterator<FBPost> it = this.time_line.iterator();
        boolean found = false;
        FBPost fb;
        while(it.hasNext() && !found) {
            fb = it.next();
            if(fb.getIdentifier() == postid) {
                found = true;
                fb.setnum_likes(fb.getNum_likes() + 1);
            }
        }
    }

    public String toString() {
        return "FBfeed{\n" +
                "time_line=" + time_line +
                "\n}";
    }
}
