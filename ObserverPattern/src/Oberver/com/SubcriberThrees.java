package Oberver.com;
public class SubcriberThrees extends Observer
{
	public boolean notifyObserver(Event e) 
	{
		if (e.getEventData() % 3 == 0) 
		{
			System.out.println("Event " + e.getEventNumber() + " is divisible by 3: " + e.getEventData());
			return true;
		}
		return false;
	}

}
