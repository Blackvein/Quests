package me.blackvein.quests;

import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;

public abstract class CustomReward {

    public final Map<String, Object> dataMap = new HashMap<String, Object>();
    public final Map<String, String> descriptions = new HashMap<String, String>();
    private String rewardName = null;
    private String author = null;
    private String name = null;


    public abstract void giveReward(Player p, Map<String, Object> m);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void addData(String name) {
        dataMap.put(name, null);
    }

    public void addDescription(String data, String description) {
        descriptions.put(data, description);
    }

    public String getRewardName() {
        return rewardName;
    }

    public void setRewardName(String name) {
        rewardName = name;
    }

}
