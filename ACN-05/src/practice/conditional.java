package practice;

public class conditional {

	public static void main(String[] args) {
		//if condition
		int age = 23;
		if (age>=18)
		{
			System.out.println("eligible for voting");
		}

	// if-else condition
        int n = 7;
        if(n % 2== 0)
        {
        		System.out.println("even");
        }
        else 
        {
        	System.out.println("odd");
        }
	// else-if condition
        
        int marks=80;
        // 100 to 80-A,79 to 50-B,49 TO 35-C, <35- Fail
        if(marks>=80 && marks<=100)
        {
        	System.out.println("A grade");
        } 
        else if(marks>=50 && marks<=79)
        {
        	System.out.println("B grade");
        }
        else if(marks>=35 && marks<=49)
        {
        	System.out.println("C grade");
        }
        else
        {
          System.out.println("fail");
        }
        // switch condition
        int day = 3;
        switch (day) {
        case 0: System.out.println("Sunday"); break;
        case 1: System.out.println("Monday"); break;
        case 2: System.out.println("Tuesday"); break;
        case 3: System.out.println("Wednesday"); break;
        case 4: System.out.println("Thursday"); break;
        case 5: System.out.println("Friday"); break;
        case 6: System.out.println("Saturday"); break;
        default:
        	System.out.println("Invalid day");
        	break;
        }
        
	}
}
