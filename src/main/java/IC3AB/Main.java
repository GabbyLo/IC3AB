/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IC3AB;

/**
 *
 * @author Gabriel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello Java");
        int programminggrade = 87;
        System.out.println("Your grade is " + programminggrade);
        
        float grade = 85;
        String remark = "";
        if (grade > 90){
           remark = "High Honor";
        }
        else if (grade > 84){
           remark = "with Honors";
        }
        else if (grade > 74.4){
           remark = "Passed";
        }
        else {
             remark = "Failed";
        }
        System.out.println("The Grade " + grade + " is " + remark);
    }
    
}
