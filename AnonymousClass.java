import java.util.Arrays;
import java.util.Comparator;

public class AnonymousClass {
	
	interface John
	{
		public void play();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// annoymous class created from an abstract class with abstract methods
		Bird b = new Bird() {
    		public void fly()
    		{
    			System.out.println("linbe is flying");
    		}
	    };
	    b.fly();
	    // annoymous class created from an interface
	    John j = new John()
	    	{
	    		@Override 
	    		public void play()
	    		{
	    			System.out.println("hello");
	    		}
	    	};
	    	j.play();
	    	// annoymous class created from an interface Comparator
	    	Integer[] a = new Integer[] {5,4,3,2,1};
	    	Arrays.sort(a,new Comparator<Integer>() {

				@Override
				public int compare(Integer o1, Integer o2) {
					// TODO Auto-generated method stub
					return o1-o2;
				}
	    	});
	    	for(int i:a)
	    		System.out.print(i+" ");
	    	System.out.println();
	}

}
