package Oberver.com;
public class SubcriberEvens extends Observer 
{
	public boolean notifyObserver(Event e) 
	{
		if (e.getEventData() % 2 == 0) 
		{
			System.out.println("Event " + e.getEventNumber() + " is even: " + e.getEventData());
			return true;
		}
		return false;
	}

}
