package eu.h2020.symbiote.smeur;

/**
 * A point that might form a point string and then a street segment.
 * @author DuennebeilG
 * 
 * I just start with an ad hoc definition. If we find a class that is better suited for this we can replace this class.
 *
 */
public class Point {
	public double lon;
	public double lat;
	
	public Point() {
		
	}
	
	public Point(double lon, double lat) {
		this.lon=lon;
		this.lat=lat;
	}
	
	
	@Override
	public String toString() {
		StringBuffer buffer=new StringBuffer();
		
		buffer.append("Point(lon").append(this.lon).append(",lat=").append(this.lat).append(")");
		
		return buffer.toString();
	}
	
	/**
	 * Implementing this for a mere container may look like overkill but is very useful for unit testing.
	 */
	@Override 
	public boolean equals(Object o) {
		if (o==null)
			return false;
		
		if (! (o instanceof Point) )
			return false;
		
		Point p=(Point)o;
		
		if (this.lat!=p.lat)
			return false;
		
		if (this.lon!=p.lon)
			return false;
		
		
		return true;
	}
	
}
