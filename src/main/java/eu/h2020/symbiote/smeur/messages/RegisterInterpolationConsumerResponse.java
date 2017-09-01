package eu.h2020.symbiote.smeur.messages;

public class RegisterInterpolationConsumerResponse {
	public enum StatusCode {
		SUCCESS,
		ERROR
	};

	public StatusCode status;
	public String explanation;	// In case of an error this might (should!) hold a human readable explanation.
}
