/*
public class BouncingBall {
	
	public static int bouncingBall(double h, double bounce, double window) {
        if(h <= 0) return -1;
        if(bounce <= 0 || bounce >= 1) return -1;
        if(window > h) return -1;

        int bounceCount = 0;
        while(h > window){
            bounceCount++;
            h *= bounce;
        }
        return bounceCount*2 - 1;
    }
}
*/


class Kata {
    static String greet(String name, String owner) {
      if(name.equals(owner)) return "Hello boss";
        return "Hello guest";
    }
}
