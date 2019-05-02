// my ugly version or mergeSort
public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] in = new int[] {3,2,6};
		msort(in,0,2);
		pa(in);
	}
	public static void pa(int[] in)
	{
		for(int i=0 ; i<in.length ; i++)
		{
			System.out.print(" "+in[i]);
		}
		System.out.println();
	}
	public static void msort(int[] in, int l,  int r)
	{
		
		int n=in.length;
		int m = (l+r)/2;
		System.out.println("l="+l+" r="+r+" m="+m);
		if(l==r)
			return;
		msort(in,l,m);
		msort(in,m+1,r);
		merge(in, l, r);
		
	}
	
	public static void merge(int[] in, int l, int r)
	{
		int m = (l+r)/2;
		int n1 = m-l+1;
		int n2 = r-(m+1)+1;
		int n = in.length;
		int[] a1 = new int[n1];
		int[] a2 = new int[n2];
		if(l==r)
			return;
		System.out.println("merging "+l+" "+r);
		// copy half sorted arrays
		for(int i=l ; i<=m ; i++)
		{
			a1[i-l] = in[i];
		}
		for(int i=m+1 ; i<=r ; i++)
		{
			a2[i-m-1] = in[i];
		}
		int p1=0 , p2=0;
		for(int i=l ; i<=r ; i++)
		{
			if(p1>=n1 && p2>=n2)
			{
				break;
			}
			else if(p1>=n1)
			{
				in[i] = a2[p2++];
			}
			else if(p2>=n2)
			{
				in[i] = a1[p1++];
			}
			else if(a1[p1]<a2[p2])
				in[i] = a1[p1++];
			else
				in[i] = a2[p2++];
		}
			
	}
}
