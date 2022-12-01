package deque;

import java.util.Deque;
import java.util.LinkedList;

class DequeP{
	
	int firstPetrolPump(int n, int petrol[], int dist[]) {
		int start = 0, curr_pet = 0;
		// idea behind the previous petrol
		// when you are switching from i to i+1 , so we need the amount of petrol to reach from 0 to n-1 and then n-1 to 0  
		int prev_pet = 0;
		
		for(int i = 0; i<n; i++) {
			curr_pet += (petrol[i] - dist[i]);
			// if the current_petrol is negative then none of the petrol pump 
			// from zero to i can be your answer
			if(curr_pet < 0) {
				// so you can safely make start equals to i+1 and then we make curr_pet = 0
				start = i+1;
				prev_pet+=curr_pet;
				curr_pet = 0;
			}
		}
		
		return ((curr_pet + prev_pet)>=0)?(start + 1):-1;
	}
}

public class PetrolPumpProblem {

	public static void main(String[] args) {
		int[] arr1 = new int[]{4,8,7,4};
		int[] arr2 = new int[]{6,5,3,5};
//		int[] arr1 = new int[]{50,10,60,100};
//		int[] arr2 = new int[]{30,20,100,10};
		DequeP dp = new DequeP();
		System.out.println(dp.firstPetrolPump(arr1.length, arr1, arr2));
	}
}
