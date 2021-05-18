package F5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        List<String> comments = new ArrayList<>();
        comments.add("Amazing!");
        comments.add("Taikerize!");
        comments.add("Damn!");
        FBPost f1 = new FBPost(1,"Mary", LocalDate.now(),50,comments);
        FBPost f2 = new FBPost(2,"Mary", LocalDate.now(),50,comments);
        FBPost f4 = new FBPost(3,"Joseph", LocalDate.now(),50,comments);
        FBPost f3 = new FBPost(4,"Lebron", LocalDate.now(),50,comments);
        FBPost f5 = new FBPost(5,"Mary", LocalDate.now(),50,comments);

        List<FBPost> feed1 = new ArrayList<>();
        feed1.add(f1);
        feed1.add(f2);
        feed1.add(f5);

        List<FBPost> feed2 = new ArrayList<>();
        feed2.add(f3);

        List<FBPost> feed3 = new ArrayList<>();
        feed3.add(f4);
        feed3.add(f4.clone());

        Map<String,List<FBPost>> feedFinal = new HashMap<>();
        feedFinal.putIfAbsent("Marry",feed1);
        feedFinal.putIfAbsent("lebron",feed2);
        feedFinal.putIfAbsent("Joseph",feed3);

        FBFeedMap f = new FBFeedMap(feedFinal);
        System.out.println(f.toString());




    }
}
