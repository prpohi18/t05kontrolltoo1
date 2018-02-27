public class Asukoht{
	public double x;
	public double dx;
	public double newDist;
	public Asukoht(double kaugus, double kiirus) {
		x=kaugus;
		dx=kiirus;
	}
	public double dist() {
		return x;
	}
	public double speed() {
		return dx;
	}
	public double newDistance(int time){
		newDist=x+time*(dx/3600);
		return newDist;
	}
}