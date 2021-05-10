package com.company.F4;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Ex 1
        Scanner sc = new Scanner(System.in);
        Stackstr s = new Stackstr(), s2 = new Stackstr();
        System.out.println("Initial Stack");
        s.pushs("ola");
        s.pushs("Mundo");
        s.pushs("Again");
        System.out.println(s.toString());
        System.out.println("Poped stack");
        s.pop();
        System.out.println(s.toString());
        System.out.println(s2.isEmpty());

        //Ex 4
        List<String> comments = new ArrayList<>();
        comments.add("Amazing!");
        comments.add("Taikerize!");
        comments.add("Damn!");
        FBPost f1 = new FBPost(1,"Mary", LocalDate.now(),50,comments);
        FBPost f2 = new FBPost(2,"Mary", LocalDate.now(),50,comments);
        FBPost f4 = new FBPost(3,"Joseph", LocalDate.now(),50,comments);
        FBPost f3 = new FBPost(4,"Lebron", LocalDate.now(),50,comments);
        FBPost f5 = new FBPost(5,"Mary", LocalDate.now(),50,comments);


        FBfeed feed = new FBfeed();
        feed.add_to_feed(f1);
        feed.add_to_feed(f2);
        feed.add_to_feed(f3);
        feed.add_to_feed(f4);
        feed.add_to_feed(f5);
//        System.out.println(feed.toString());
        System.out.println(feed.nrPosts("Mary"));
        System.out.println(feed.postsOf("Mary").toString());
    }
}
