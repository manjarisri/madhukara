//     import java.util.Scanner;
//     public class prime{
//        public static void main(String[] args) {
//            Scanner s = new Scanner(System.in);
//            System.out.print("Enter a number : ");
//            int n = s.nextInt();
//            if (isPrime(n)) {
//                System.out.println(n + " is a prime number");
//            } else {
//                System.out.println(n + " is not a prime number");
//            }
//        }
//        public static boolean isPrime(int n) {
//            if (n <= 1) {
//                return false;
//            }
//            for (int i = 2; i < Math.sqrt(n); i++) {
//                if (n % i == 0) {
//                    return false;
//               }
//            }
//            return true;
//        }
//     }


//     public class prime{    
//      public static void main(String args[]){    
//       int i,m=0,flag=0;      
//       int n=3;//it is the number to be checked    
//       m=n/2;      
//       if(n==0||n==1){  
//        System.out.println(n+" is not prime number");      
//       }else{  
//        for(i=2;i<=m;i++){      
//         if(n%i==0){      
//          System.out.println(n+" is not prime number");      
//          flag=1;      
//          break;      
//         }      
//        }      
//        if(flag==0)  { System.out.println(n+" is prime number"); }  
//       }//end of else  
//     }    
//     }   


pipeline {
    agent any
    stages {
        stage('Take Parameters') {
            steps {
                input message: 'Enter parameters', parameters: [
                    string(name: 'PARAMETER_1', defaultValue: '', description: 'Enter the first parameter'),
                    string(name: 'PARAMETER_2', defaultValue: '', description: 'Enter the second parameter'),
                    choice(name: 'CHOICE_PARAMETER', choices: ['option1', 'option2'], description: 'Choose an option')
                ]
            }
        }
        stage('Build') {
            steps {
                echo "Parameter 1: ${params.PARAMETER_1}"
                echo "Parameter 2: ${params.PARAMETER_2}"
                echo "Choice parameter: ${params.CHOICE_PARAMETER}"
            }
        }
    }
}
