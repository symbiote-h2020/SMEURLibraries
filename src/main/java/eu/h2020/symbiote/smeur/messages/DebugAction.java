package eu.h2020.symbiote.smeur.messages;

/**
 * The purpose of this message is to start actions on any service.
 * E.g. , intended usage is to re-initiate a query for resources,
 * start a new interpolation without the official messages sent, and so on.
 * You name it.
 * Just add an asynchronous receiver for this message through the enablerLogic.
 * Interpret the actionString.
 * If it makes sense for you, do what you are asked for.
 * The intended initiator of such a message is a command line utility.
 * 
 * Note: This is experimental!
 * @author DuennebeilG
 *
 */
public class DebugAction {
	public String actionString;	// Whatever makes sense for your service
}
