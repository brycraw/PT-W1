package week3app2;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 18};
			System.out.println(ages[0] - ages[ages.length - 1]); // 1.a., 1.b.
			System.out.println();
		
		int sum = 0;	//declaring and initializing 
			
		for (int num: ages) {	//loop to add the array up
		           sum += num;
		        }
			
		int agesAvg = sum / ages.length;	//dec./int. agesAvg and dividing the sum by the number of elements
			System.out.println("The average age is " + agesAvg + ".");	//printing it all
			System.out.println();
			// not a double because adults don't typically care about the years AND months old they are
			
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		int sum2 = names.length;
		double namesSum = 0;
		
		for (String i: names) {
			namesSum += i.length();
		}	//for each loop to get number of characters in each element
		
		double namesAvg = namesSum / sum2;	//double for true average
	
		System.out.println("The average number of characters in each name is " + namesAvg + "."); //2.a.
		System.out.println();
		
		String allNames = "";
		for (String i : names) {
			allNames += i + " ";
		}	//for each loop to merge with a space all the names from names[]
	
		System.out.println(allNames);	//2.b.
		System.out.println();
		
		System.out.println("QUESTION 3 ANSWER : You can access the last element in an array with: array[array.legnth -1]");
		System.out.println("QUESTION 4 ANSWER : You can access the first element in an array with: array[0]");
		System.out.println();
	
		
		int[] namesLength = new int[names.length]; //initializing Q5, size o array equal to same size as names array
		
		int counter = 0;
		
		for (String i : names) { //5.
			namesLength[counter] = i.length();
			counter++;	//for each loop taking elements of names and making them their character length instead
		}
		
		int namesLengthSum = 0;
		for(int i : namesLength) {
			namesLengthSum += i;
		}
		
		System.out.println("The sum of all elements in namesLengths is " + namesLengthSum + ".");	//6.
		System.out.println();
		
		Scanner kb = new Scanner(System.in); //initiate scanner
		System.out.println("Enter a word");
		System.out.println();
		String word = kb.next();
		System.out.println("Enter a number");
		System.out.println();
		int n = kb.nextInt();
		
		manyWords(word, n);	//call method
		
		//tester code required to fulfill question 9
		int[] arrayTestFalse = {3, 9, 23};
		int[] arrayTestTrue = {3, 9, 23, 99};
		System.out.println(isHundy(arrayTestTrue));
		System.out.println();
		
		//tester code required to fulfill question 10
		double[] arrayTestAvg = {3.2, 9.5, 23.1};
		System.out.println(listAvg(arrayTestAvg));
		System.out.println();
		
		//tester code required to fulfill question 11
		double[] arrayTestAvg1 = {3.2, 9.5, 1.1};
		double[] arrayTestAvg2 = {3.2, 9.5, 9.1};
		System.out.println(avgCompare(arrayTestAvg1, arrayTestAvg2));
		System.out.println();
		
		//tester code not required to fulfill question 12
		boolean isHotOutside = false;	//left the boolean to false to show that the method overrides it
		double moneyInPocket = 11.2;	//this is enough to buy the drink so out pout should be true
		//double moneyInPocket = 9.4;	//commented out tester code for testing false
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		System.out.println();
		
		
		//tester code required to fulfill question 13
		int accuracy = 3;	//in future weeks I could make different players have different accuracy scores
		int monsterAC = 15;	//in future weeks I could have different monster values
		doesItHit(accuracy, monsterAC);
		
	}
	
	//method manyWords which uses a for loop to add user input word to its self to a user input number of times
	public static void manyWords(String word, int n) {
			String manyWords = "";
					
			for(int i = 0; i < n; i++) {
				manyWords += word;
			}
			
			System.out.println(manyWords); //7.
	}
	
	//making a method to concatenate a persons many names to make their "legal" name
		public static String fullName(String firstName, String lastName) {
			String fullName = firstName + " " + lastName;
			return fullName; //8.
		}
		
		//boolean method to return true if sum of an int[] is > 100, else false. //9. Tester code above.
		public static boolean isHundy(int[] list) {
			boolean arraySum = false;
			int sum = 0;
			
			for (int num: list) {	//loop to add the array up
			           sum += num;
			        }
			if (sum > 100) {	//if/else to boolean if > 100
				arraySum = true;
			}
			else{arraySum = false;}
					
			return arraySum;
			
		}
		
		//double method to average the elements of a double[] //10. Tester code above.
		public static double listAvg(double[] list) {
			double sum = 0.0;
			
			for (double num: list) {	//loop to add the array up
		           sum += num;
		        }
			double listAvg = sum / list.length;	//average is sum of elements / number of elements
			return listAvg;
		}
		
		//boolean method to return true if first parameter double[] is > second. //11. Tester code above.
		public static boolean avgCompare(double[] list1, double[] list2) {
			double sum1 = 0.0;
			double sum2 = 0.0;
			
			for (double num: list1) {	//loop to add the array up
		           sum1 += num;
		        }
			
			for (double num: list2) {	//loop to add the array up
		           sum2 += num;
		        }
			
			return sum1 > sum2;
		}
		
		//boolean method that returns true if several parameters line up. //12. Tester code above.
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			if(isHotOutside = true && moneyInPocket > 10.50) {
				return  true;
			}
			else {return false;}
		}
		
		//custom created method for //13. Tester code above. Simulates an approximation of a 20-sided die roll and adds player hit value
		//then compares it to monster Armor Class. COuld be used for various games
		public static void doesItHit(int accuracy, int monsterAC) {
			double roll = Math.random() * 20;	//.random is 0.0 - 1.0 and I couldnt find a way to make it the range of numbers I wanted so I kept
				if(roll == 0) {	//this loop is to re-roll if .random is a 0.0
					roll = (Math.random()) * 20;	//this just re-rolls over and over until its not 0.0
				}	//I could have done something like if(roll != 0.0) or something but what I made works fine for this example
			roll = (int) roll;	//casted roll to bring the value back to a whole number, like a die
			int attack = (int) (roll + accuracy);	//casted to satisfy int attack = because roll is a double
			System.out.println("You rolled a " + (int) roll + " and you add " + accuracy + " which is " + attack + " !");
			System.out.println("The monster has a " + monsterAC + " Armor Class!");
			//some flavor text and to make Console readable
			
			if(attack >= monsterAC) {
				System.out.println("You nailed 'em!"); //more flavor text and and an if/else to inform player of result
			}
			else{System.out.println("You swung and missed!");}
		}
}
