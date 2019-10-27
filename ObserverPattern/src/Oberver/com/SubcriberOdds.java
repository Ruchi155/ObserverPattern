package Oberver.com;
public class SubcriberOdds extends Observer 
{
	public boolean notifyObserver(Event e) 
	{
		if (e.getEventData() % 2 != 0) 
		{
			System.out.println("Event " + e.getEventNumber() + " is odd: " + e.getEventData());
			return true;
		}
		return false;
	}

}
