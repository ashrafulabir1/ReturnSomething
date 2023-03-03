
public class ReturnValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int newNumber = 5;
int newSum= 0;
  newSum = sumFunction(100)+newNumber;
  System.out.println(newSum);
	}
public static int sumFunction(int sum) {
	 int x=5;
	 int y=6;
	 sum+= x+y;
	return sum;
   }
}
