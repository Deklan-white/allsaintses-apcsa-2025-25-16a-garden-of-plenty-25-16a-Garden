import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class FlowerGarden
{
	//create an arraylist instance variable
    private ArrayList<String> flowers;
	
	//write a constructor 		
	public FlowerGarden(){
        flowers = new ArrayList<>();
    }
	//write add flower

    public void addFlower(String flower)
    {
        int pos = findFlower(flower);

        if (pos == -1)
        {
            // New flower — add at end with count 01
            flowers.add("01 " + flower);
        }
        else
        {
            // Existing flower — increment count, remove from current position,
            // then re-add at the end
            int currentCount = getCount(flower);
            currentCount++;

            String newEntry = String.format("%02d", currentCount) + " " + flower;
            flowers.remove(pos);       // remove from old position
            flowers.add(newEntry);     // re-add at end
        }
    }
	
	//write get count
    public int getCount(String flower)
    {
        int pos = findFlower(flower);

        if (pos == -1)
        {
            return 0;
        }

        // Each string looks like "02 daisy" — count is before the space
        String entry = flowers.get(pos);
        String countStr = entry.substring(0, entry.indexOf(" "));
        return Integer.parseInt(countStr);
    }
		
	//write get flower name
    public String getFlowerName(int index)
    {
        if (!inRange(index, 0, flowers.size() - 1))
        {
            return "out of range";
        }

        // Name is everything after the first space
        String entry = flowers.get(index);
        return entry.substring(entry.indexOf(" ") + 1);
    }
	
	//write in range
    public boolean inRange(int value, int low, int high)
    {
        return value >= low && value <= high;
    }
	
	//write find flower
    public int findFlower(String flower)
    {
        for (int i = 0; i < flowers.size(); i++)
        {
            if (getFlowerName(i).equals(flower))
            {
                return i;
            }
        }
        return -1;
    }

	//write max flower
    public String maxFlower()
    {
        int maxIndex = 0;
        int maxCount = getCount(getFlowerName(0));

        for (int i = 1; i < flowers.size(); i++)
        {
            String name = getFlowerName(i);
            int count   = getCount(name);

            if (count > maxCount)
            {
                maxCount = count;
                maxIndex = i;
            }
        }
        return flowers.get(maxIndex);  // returns full string e.g. "06 daisy"
    }
	
	//write a toString
    public String toString()
    {
        return flowers.toString();
    }
}

