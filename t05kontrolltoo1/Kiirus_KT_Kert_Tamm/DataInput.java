public class DataInput{
	public double a1kaugus;
	public double a2kaugus;
	public double a1kiirus;
	public double a2kiirus;
	public double uusDist1;
	public double uusDist2;
	
	public DataInput(double auto1kaugus, double auto1kiirus, double auto2kaugus, double auto2kiirus) {
		a1kaugus=auto1kaugus;
		a2kaugus=auto2kaugus;
		a1kiirus=auto1kiirus;
		a2kiirus=auto2kiirus;
	}
	public double distants1() {
		return a1kaugus;
	}
	public double distants2() {
		return a2kaugus;
	}
	public double kiirus1() {
		return a1kiirus;
	}
	public double kiirus2() {
		return a2kiirus;
	}
	public double auto1LeitudDistants(int aeg){
		uusDist1=a1kaugus+aeg*(a1kiirus/3600);
		return uusDist1;
	}
	public double auto2LeitudDistants(int aeg){
		uusDist2=a2kaugus+aeg*(a2kiirus/3600);
		return uusDist2;
	}
}