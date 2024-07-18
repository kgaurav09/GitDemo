package interviewQuestions;

public class EquilibriumIndexExample {
	static int eqbmindex(int array[], int n)  
	{  
	//lsum denotes the left sum and rsum denotes the right sum  
	int rsum = 0;  
	int lsum = 0;  
	//stores the sum of whole array  
	for (int i = 0; i < n; ++i)  
	rsum = rsum + array[i];  
	for (int i = 0; i < n; ++i)   
	{  
	//updates rsum  
	rsum = rsum - array[i];  
	//if rsum and lsum are equal, returns i (equilibrium index), else returns -1  
	if (lsum == rsum)  
	return i;  
	lsum = lsum + array[i];  
	}  
	return -1;  
	}  
	public static void main(String args[])  
	{  
	int array[] = {2, 9, 3, 4, 0, 3, 3, 2, 9, 1};  
	int arraysize = array.length;  
	System.out.print("Equilibrium Index is: ");  
	System.out.println(eqbmindex(array, arraysize));  
	}  
	}  


