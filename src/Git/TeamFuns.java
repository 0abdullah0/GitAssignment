package Git;
import java.util.*;
import java.util.Arrays;
public class TeamFuns 
{
	private static Scanner input;
	static int Count_Primes(int []arr)
	{
		int counter=0;
		for(int i=0;i<arr.length;++i){
			for(int y=2;y<=arr[i];++y)
			{		
				if(arr[i]%y==0&&arr[i]!=2)   
					break;
				if((arr[i]%y!=0&&y+1==arr[i])||arr[i]==2)
					counter++;}}
		return counter;
	}
	public static void main(String[]args)
	{
		 input = new Scanner(System.in);
		 int size,choice;  //size:length of an array& choice:number of function to execute
		 System.out.println("Enter the size of array:");
		 size=input.nextInt();
		 int []arr=new int[size];
		 System.out.println("Fill the array elements:");
		 for(int i=0;i<arr.length;++i)
		 	{arr[i]=input.nextInt();}
		 System.out.println("<<<Main Menu>>>");
		 System.out.println("1-Most repeated value\t2-Sort\t3-Shuffle\t4-Find the largest prime\t5-Find the smallest prime\t6-Check palindrome");
		 System.out.println("7-Check sorted\t8-Count Primes-\t9-Reverse array\t10-Shift array\t11-Distinct array\t12-Get the maximum 3 numbers");
		 System.out.println("13-Get the minimum 3 numbers\t14-Get average\t15-Get median\t16-Return only primes\t17-Zero if less than zero\t18-Execute all functions");
		 System.out.println("Enter the number of which function to be executed:");
		 choice=input.nextInt();
		 switch(choice)   //Add your functions 
		 {
		 case 1:  //Most repeated value
			 break;
		 case 2: //Sort
			 break;
		 case 3: //Shuffle
			 break;
		 case 4://Find the largest prime
			 break;
		 case 5://Find the smallest prime
			 break;
		 case 6: //Check palindrome
			 break;
		 case 7: //Check sorted
			 break;
		 case 8:
			 System.out.println("The number of prime numbers:"+Count_Primes(arr));
			 break;
		 case 9://Reverse array
			 break;
		 case 10://Shift array
			 break;
		 case 11://Distinct array
			 break;
		 case 12://Get the maximum 3 numbers
			 break;
		 case 13://Get the minimum 3 numbers
			 break;
		 case 14://Get average
			 break;
		 case 15://Get median
			 get_median();
			 break;
		 case 16://Return only primes
			 break;
		 case 17://Zero if less than zero
			 break;
		 case 18://option to perform all developed functions
		 {
			 //Add your function here also
			 System.out.println("The number of prime numbers:"+Count_Primes(arr));
		 }
			 break;
		default:
		System.out.println("Invalid input!");
		break;
		 }
		 }
		 public static void get_median(){
			int[] nums =new int[5];
			Scanner x=new Scanner(System.in);
			for(int i=0;i<5;i++)
				nums[i]=x.nextInt();
			 Arrays.sort(nums);
			 System.out.println("median is :" + nums[3]);
		 }
}
