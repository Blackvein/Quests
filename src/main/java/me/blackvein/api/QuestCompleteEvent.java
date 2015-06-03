package me.blackvein.api;

import me.blackvein.quests.Quest;
import me.blackvein.quests.Quester;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class QuestCompleteEvent extends Event
{
    
    private final HandlerList handlers = new HandlerList();
    private Quest quest;
    private Quester quester;
    
    public QuestCompleteEvent(Quest quest, Quester quester)
    {
        this.quest = quest;
        this.quester = quester;
    }

    public Quest getQuest()
    {
        return quest;
    }
    
    public Quester getQuester()
    {
        return quester;
    }
    
    @Override
    public HandlerList getHandlers() 
    {
        return handlers;
    }
    
}
