public class multiplier {

    public static void main(String[] args) {
                
    // Let's Create A Multiplication Table With For Loop in Java
                for(int number = 1; number <= 10; number ++){
            for(int multiplier = 1; multiplier <= 10; multiplier ++){
                System.out.printf("%d X %d = %d \n", number, multiplier, number * multiplier);
            }
        }

    // Let's Create A Multiplication Table With While Loop in Java
        int multiplier = 1;
        int digit = 5;
        
        while (multiplier <= 10) {
            System.out.printf("%d X %d = %d \n", digit, multiplier, digit * multiplier);

            multiplier ++;            
        }

        // Let's Create A Multiplication Table With While Loop in Java
        int multiple = 1;
        int digits = 2;
        
        do {
            System.out.printf("%d X %d = %d \n", digits, multiple, digits * multiple);
            multiple++;

        } while (multiple <= 10);
        
    //Print Odd numbers from 1-50
        for(int number = 1; number <= 50; number++){
            if(number % 2 == 1){
                System.out.println(number);
            }
        }
        
        
        
        
        
        
        
        
        
        
                                      
        
        
        
        
        /*int sum = 0;
        for(int number = 1; number <= 10; number++) {
            System.out.println(number);
            sum += number;
            

        }
        System.out.println(sum);        */
                
    }
    
}
