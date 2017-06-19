package me.blackvein.quests;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import org.bukkit.DyeColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;

public class Stage {

	LinkedList<ItemStack> blocksToDamage = new LinkedList<ItemStack>();
    LinkedList<ItemStack> blocksToBreak = new LinkedList<ItemStack>();
    LinkedList<ItemStack> blocksToPlace = new LinkedList<ItemStack>();
    LinkedList<ItemStack> blocksToUse = new LinkedList<ItemStack>();
    LinkedList<ItemStack> blocksToCut = new LinkedList<ItemStack>();
    Integer fishToCatch;
    Integer playersToKill;
    Map<Map<Enchantment, Material>, Integer> itemsToEnchant = new HashMap<Map<Enchantment, Material>, Integer>();

    LinkedList<EntityType> mobsToKill = new LinkedList<EntityType>();
    LinkedList<Integer> mobNumToKill = new LinkedList<Integer>();
    LinkedList<Location> locationsToKillWithin = new LinkedList<Location>();
    LinkedList<Integer> radiiToKillWithin = new LinkedList<Integer>();
    LinkedList<String> areaNames = new LinkedList<String>();

    LinkedList<ItemStack> itemsToDeliver = new LinkedList<ItemStack>();
    LinkedList<Integer> itemDeliveryTargets = new LinkedList<Integer>() {

		private static final long serialVersionUID = -2774443496142382127L;

		@Override
        public boolean equals(Object o) {

            if (o instanceof LinkedList) {

                @SuppressWarnings("unchecked")
				LinkedList<Integer> otherList = (LinkedList<Integer>) o;

                for (Integer i : this) {

                    Integer other = otherList.get(this.indexOf(i));
                    if (!other.equals(i)) {
                        return false;
                    }
                }

            }

            return true;

        }

    };
    public LinkedList<String> deliverMessages = new LinkedList<String>();

    public LinkedList<Integer> citizensToInteract = new LinkedList<Integer>() {

		private static final long serialVersionUID = -4086855121042524435L;

		@Override
        public boolean equals(Object o) {

            if (o instanceof LinkedList) {

                @SuppressWarnings("unchecked")
				LinkedList<Integer> otherList = (LinkedList<Integer>) o;

                for (Integer i : this) {

                    Integer other = otherList.get(this.indexOf(i));
                    if (!other.equals(i)) {
                        return false;
                    }
                }

            }

            return true;

        }

    };
    public LinkedList<Integer> citizensToKill = new LinkedList<Integer>() {

		private static final long serialVersionUID = 7705964814014176415L;

		@Override
        public boolean equals(Object o) {

            if (o instanceof LinkedList) {

                @SuppressWarnings("unchecked")
				LinkedList<Integer> otherList = (LinkedList<Integer>) o;

                for (Integer i : this) {

                    Integer other = otherList.get(this.indexOf(i));
                    if (!other.equals(i)) {
                        return false;
                    }
                }

            }

            return true;

        }

    };
    public LinkedList<Integer> citizenNumToKill = new LinkedList<Integer>();

    public LinkedList<Location> locationsToReach = new LinkedList<Location>();
    public LinkedList<Integer> radiiToReachWithin = new LinkedList<Integer>();
    public LinkedList<World> worldsToReachWithin = new LinkedList<World>();
    public LinkedList<String> locationNames = new LinkedList<String>();
    public Map<EntityType, Integer> mobsToTame = new EnumMap<EntityType, Integer>(EntityType.class);
    public Map<DyeColor, Integer> sheepToShear = new EnumMap<DyeColor, Integer>(DyeColor.class);
    public Map<EnumMap<Material, Integer>, Boolean> itemsToCraft = new HashMap<EnumMap<Material, Integer>, Boolean>();
    public LinkedList<CustomObjective> customObjectives = new LinkedList<CustomObjective>();
    public LinkedList<Integer> customObjectiveCounts = new LinkedList<Integer>();
    public LinkedList<String> customObjectiveDisplays = new LinkedList<String>();
    public LinkedList<Map<String, Object>> customObjectiveData = new LinkedList<Map<String, Object>>();
    public LinkedList<String> passwordDisplays = new LinkedList<String>();
    public LinkedList<LinkedList<String>> passwordPhrases = new LinkedList<LinkedList<String>>();
    public String script;
    public Event startEvent = null;
    public Event deathEvent = null;
    public Map<String, Event> chatEvents = new HashMap<String, Event>();
    public Event disconnectEvent = null;
    public Event finishEvent = null;
    public long delay = -1;
    public String delayMessage = null;
    public String completeMessage = null;
    public String startMessage = null;
    public String objectiveOverride = null;

    public int hashCode() {
    	  assert false : "hashCode not designed";
    	  return 42; // any arbitrary constant will do
    }
    
    @Override
    public boolean equals(Object o) {

        if (o instanceof Stage) {

            Stage other = (Stage) o;

            if (!other.blocksToDamage.equals(blocksToDamage)) {
                return false;
            }

            if (!other.blocksToBreak.equals(blocksToBreak)) {
                return false;
            }

            if (!other.blocksToPlace.equals(blocksToPlace)) {
                return false;
            }

            if (!other.blocksToUse.equals(blocksToUse)) {
                return false;
            }

            if (!other.blocksToCut.equals(blocksToCut)) {
                return false;
            }

            if (other.fishToCatch != null && fishToCatch != null) {
                if (!other.fishToCatch.equals(fishToCatch)) {
                    return false;
                }
            } else if (other.fishToCatch != null && fishToCatch == null) {
                return false;
            } else if (other.fishToCatch == null && fishToCatch != null) {
                return false;
            }

            if (other.playersToKill != null && playersToKill != null) {
                if (!other.playersToKill.equals(playersToKill)) {
                    return false;
                }
            } else if (other.playersToKill != null && playersToKill == null) {
                return false;
            } else if (other.playersToKill == null && playersToKill != null) {
                return false;
            }

            if (!other.itemsToEnchant.equals(itemsToEnchant)) {
                return false;
            }

            if (!other.mobsToKill.equals(mobsToKill)) {
                return false;
            }

            if (!other.mobNumToKill.equals(mobNumToKill)) {
                return false;
            }

            if (!other.locationsToKillWithin.equals(locationsToKillWithin)) {
                return false;
            }

            if (!other.radiiToKillWithin.equals(radiiToKillWithin)) {
                return false;
            }

            if (!other.areaNames.equals(areaNames)) {
                return false;
            }

            if (!other.itemsToDeliver.equals(itemsToDeliver)) {
                return false;
            }

            if (!other.itemDeliveryTargets.equals(itemDeliveryTargets)) {
                return false;
            }

            if (!other.deliverMessages.equals(deliverMessages)) {
                return false;
            }

            if (!other.citizensToInteract.equals(citizensToInteract)) {
                return false;
            }

            if (!other.citizensToKill.equals(citizensToKill)) {
                return false;
            }

            if (!other.citizenNumToKill.equals(citizenNumToKill)) {
                return false;
            }

            if (!other.locationsToReach.equals(locationsToReach)) {
                return false;
            }

            if (!other.radiiToReachWithin.equals(radiiToReachWithin)) {
                return false;
            }

            if (!other.worldsToReachWithin.equals(worldsToReachWithin)) {
                return false;
            }

            if (!other.locationNames.equals(locationNames)) {
                return false;
            }

            if (!other.mobsToTame.equals(mobsToTame)) {
                return false;
            }

            if (!other.sheepToShear.equals(sheepToShear)) {
                return false;
            }

            if (!other.itemsToCraft.equals(itemsToCraft)) {
                return false;
            }

            if (!other.customObjectives.equals(customObjectives)) {
                return false;
            }

            if (!other.customObjectiveDisplays.equals(customObjectiveDisplays)) {
                return false;
            }

            if (!other.customObjectiveData.equals(customObjectiveData)) {
                return false;
            }

            if (!other.passwordDisplays.equals(passwordDisplays)) {
                return false;
            }

            if (!other.passwordPhrases.equals(passwordPhrases)) {
                return false;
            }

            if (other.script != null && script != null) {
                if (!other.script.equals(script)) {
                    return false;
                }
            } else if (other.script != null && script == null) {
                return false;
            } else if (other.script == null && script != null) {
                return false;
            }

            if (other.startEvent != null && startEvent != null) {
                if (!other.startEvent.equals(startEvent)) {
                    return false;
                }
            } else if (other.startEvent != null && startEvent == null) {
                return false;
            } else if (other.startEvent == null && startEvent != null) {
                return false;
            }

            if (other.deathEvent != null && deathEvent != null) {
                if (!other.deathEvent.equals(deathEvent)) {
                    return false;
                }
            } else if (other.deathEvent != null && deathEvent == null) {
                return false;
            } else if (other.deathEvent == null && deathEvent != null) {
                return false;
            }

            if (other.finishEvent != null && finishEvent != null) {
                if (!other.finishEvent.equals(finishEvent)) {
                    return false;
                }
            } else if (other.finishEvent != null && finishEvent == null) {
                return false;
            } else if (other.finishEvent == null && finishEvent != null) {
                return false;
            }

            if (!other.chatEvents.equals(chatEvents)) {
                return false;
            }

            if (other.delay != delay) {
                return false;
            }

            if (other.delayMessage != null && delayMessage != null) {
                if (!other.delayMessage.equals(delayMessage)) {
                    return false;
                }
            } else if (other.delayMessage != null && delayMessage == null) {
                return false;
            } else if (other.delayMessage == null && delayMessage != null) {
                return false;
            }

            if (other.startMessage != null && startMessage != null) {
                if (!other.startMessage.equals(startMessage)) {
                    return false;
                }
            } else if (other.startMessage != null && startMessage == null) {
                return false;
            } else if (other.startMessage == null && startMessage != null) {
                return false;
            }

            if (other.completeMessage != null && completeMessage != null) {
                if (!other.completeMessage.equals(completeMessage)) {
                    return false;
                }
            } else if (other.completeMessage != null && completeMessage == null) {
                return false;
            } else if (other.completeMessage == null && completeMessage != null) {
                return false;
            }

            if (other.objectiveOverride != null && objectiveOverride != null) {
                if (!other.objectiveOverride.equals(objectiveOverride)) {
                    return false;
                }
            } else if (other.objectiveOverride != null && objectiveOverride == null) {
                return false;
            } else if (other.objectiveOverride == null && objectiveOverride != null) {
                return false;
            }

        }

        return true;

    }

}
