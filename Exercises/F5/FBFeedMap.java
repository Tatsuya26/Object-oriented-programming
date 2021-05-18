package F5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FBFeedMap {
    private Map<String, List<FBPost>> feed;

    public FBFeedMap() {
        this.feed = new HashMap<>();
    }


    public FBFeedMap(Map<String, List<FBPost>> f) {
        Map<String, List<FBPost>> new_feed = new HashMap<>();
        this.feed = f.entrySet().stream().
                collect(Collectors.toMap( e->e.getKey(), e->e.getValue().stream().map(FBPost::clone)));
    }

    @Override
    public String toString() {
        return "FBFeedMap{" +
                "feed=" + feed +
                '}';
    }

    public void addPost(String user, FBPost post) {
        this.feed.get(user).add(post);
    }
}
