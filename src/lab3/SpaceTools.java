package lab3;

public class SpaceTools{
	public static double travelTime(Planet p, double speed) {
		return (p.getDistanceFromSun() * 1000000)/speed;
	}
	public static String compareDistance(Planet a, Planet b){
		if (a.getDistanceFromSun() < b.getDistanceFromSun()) 
			return a.getName();
		else
			return b.getName();
	}
	public static String abbreviation(Planet p) {
		String abr = p.getName().substring(0, 4);
		abr.toUpperCase();	
		return abr;
	}
	public static double orbitTime(Planet p) {
		return (200000000 * p.getDistanceFromSun() * Math.PI)/ 100000;
	}
	public static double orbitTime(Planet p, double speed) {
		return (200000000 * p.getDistanceFromSun() * Math.PI)/ speed;
	}
	public static Planet randomDestination(Planet[] planets) {
		int plan = (int) Math.random() * planets.length;
		return planets[plan];
	}
	
}