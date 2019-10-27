package Oberver.com;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PublisherImplementation implements Publisher
{
	List<Observer> subcribers = new ArrayList<Observer>();
	List<Observer> unSubcribers = new ArrayList<Observer>();
	public int sO_time = 0;
	int sE_time = 0;
	int sT_time = 0;

	boolean isTrue;

	private Event generateEvent() 
	{
		return null;
	}

	public void runSimulation() 
	{
		Random rGenerator = new Random();
		Event e;

		for (int i = 0; i < 200; i++) 
		{
			e = new Event(i, rGenerator.nextInt(5001));
			notifyObserver(e);

			if (i == 40 || i == 80 || i == 120 || i == 160 || i == 200) 
			{
				for (Observer o : unSubcribers) 
				{
					registerObserver(o);
				}
				unSubcribers.clear();
		    }
		}
	}

public boolean contains(Observer o) 
{
		if (subcribers.contains(o)) 
		{
			return true;
		}
		return false;
}

	@Override
	public void registerObserver(Observer o) 
	{
		subcribers.add(o);
	}

	@Override
	public void removeObserver(Observer o) 
	{
		if (subcribers.contains(o)) 
		{
			subcribers.remove(o);
			unSubcribers.add(o);
		}
	}

	@Override
	public void notifyObserver(Event e) 
	{
		for (Observer o : subcribers) 
		{
			isTrue = o.notifyObserver(e);
			if (isTrue == true) 
			{
				if (o.getClass() == SubcriberOdds.class) 
				{
					sO_time += 1;
					if (sO_time > 20) 
					{
						removeObserver(o);
						sO_time = 0;
						System.out.println("SUBCRIBER ODDS REMOVED");
						break;
					}
				}
				if (o.getClass() == SubcriberThrees.class) 
				{
					sT_time += 1;
					if (sT_time > 6) 
					{
						removeObserver(o);
						sT_time = 0;
						System.out.println("SUBCRIBER THREES REMOVED");
						break;
					}
				}
			}
		}
	}
}
