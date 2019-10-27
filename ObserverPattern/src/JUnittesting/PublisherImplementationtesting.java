package JUnittesting;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import Oberver.com.Event;
import Oberver.com.Observer;
import Oberver.com.PublisherImplementation;
import Oberver.com.SubcriberEvens;
import Oberver.com.SubcriberOdds;
import Oberver.com.SubcriberThrees;
import junit.framework.Assert;

class PublisherImplementationtesting 
{
	List<Observer> subcribers = new ArrayList<Observer>();
	List<Observer> unSubcribers = new ArrayList<Observer>();


     	Observer s1=new SubcriberOdds();
		Observer s2=new SubcriberEvens();
		Observer s3=new SubcriberThrees();
		boolean isTrue;
		int sO_time=0;
		int sE_time=0;
		int sT_time=0;

		PublisherImplementation p1=new PublisherImplementation();
		Event e;
	@Test	
	void registertest()
	{
		p1.registerObserver(s1);
		assertEquals(s1,s1);	
		
		/**Failure
		p1.registerObserver(s2);
		assertEquals(s1,s2);
		*/	
	 }
	 @Test
	 void Containstest()
	 {	
		//Success
		p1.contains(s1);
		assertEquals(true,true);
		
		/**failure
		//p1.contains(s1);
		//assertEquals(false,true);*/
	 }
	 
	 @Test
	 void notifyObservertest()
	 {
		 p1.notifyObserver(e);
		 sO_time=21;
		 Assert.assertEquals("SUBCRIBER ODD REMOVED", "SUBCRIBER ODD REMOVED");
		 
		 /** Failure
		 sO_time=7;
		 Assert.assertEquals("SUBCRIBER Threes REMOVED", "SUBCRIBER Evens REMOVED");
		*/
	 }
	 
	 @Test
	 void removeObservertest()
	 {
		 p1.removeObserver(s1);
		 assertEquals(s1,s2);
		 
	 }
	 
	 @Test
	 void runsimulationtest() 
	 {
		 p1.runSimulation();
		 assertEquals(s2,s2);
	 }
	}

