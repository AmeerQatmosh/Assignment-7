package edu.najah.it.capp.asd.intf;

import edu.najah.it.capp.asd.constants.ConnectionType;
import edu.najah.it.capp.asd.impl.ProtocolFactory;
import edu.najah.it.capp.asd.service.Connection;
import edu.najah.it.capp.exception.ProtocolException;

public interface Protocol {
	
	// public Protocol getInstance(String message) throws ProtocolException;
	
	//Connection is already released
	//Unable to release the connection 
	//connection is use 
	  
	public boolean release() throws ProtocolException;

	
	
	//No connection
	//timeout connection
	//System busy exception

    public void send(String message) throws ProtocolException;
    
 
    
}

