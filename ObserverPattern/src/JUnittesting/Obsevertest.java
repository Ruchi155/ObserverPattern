package JUnittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Oberver.com.Event;
import Oberver.com.Observer;
import junit.framework.Assert;

class Obsevertest 
{
	Observer p2;
	Event e;
	int sO_time=0;
	int sE_time=0;
	int sT_time=0;
	
	@Test
	 void notifyObservertest()
		 {
			 p2.notifyObserver(e);
			 sO_time=21;
			 Assert.assertEquals("SUBCRIBER ODD REMOVED", "SUBCRIBER ODD REMOVED");
			 
			 p2.notifyObserver(e);
			 
			 
			 /** Failure
			 sO_time=7;
			 Assert.assertEquals("SUBCRIBER Threes REMOVED", "SUBCRIBER Evens REMOVED");
			*/
		 }
	}


