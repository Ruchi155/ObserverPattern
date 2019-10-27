package Oberver.com;
public class Event 
{
	int EventNumber;
	int EventData;

	public int getEventData() 
	{
		return EventData;
	}

	public int getEventNumber() 
	{
		return EventNumber + 1;
	}

	public Event(int eventNumber, int eventData) 
	{
		this.EventNumber = eventNumber;
		this.EventData = eventData;
	}
}
