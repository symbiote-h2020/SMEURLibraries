package eu.h2020.symbiote.smeur.messages;


/**
 * This data is sent back when somebody tries to register a region.
 * 
 * @author DuennebeilG
 *
 */

public class RegisterRegionResponse {
	public enum StatusCode {
		SUCCESS,
		ERROR
	};

	public StatusCode status;
	public String explanation;	// In case of an error this might (should!) hold a human readable explanation.
	
	
	@Override
	public String toString() {

		StringBuffer buffer=new StringBuffer();
		buffer.append("A RegisterRegionResponse message with:\n");
		buffer.append("Status is ").append(status).append("\n");
		buffer.append("explanation is: ").append(explanation);
		
		return buffer.toString();
		
	}

}
