package automationtest;


public class IfthenElse_Q3 {
    public boolean isTeen(int age,String name) {
        if (age <= 18) {
            System.out.println(+ age +" "+ "- true" );
            return true;
        } else
            System.out.println(+age +" "+ "- false");
            return false;

        }

        public static void main (String[]args){
            IfthenElse_Q3 obj1 = new IfthenElse_Q3();
            obj1.isTeen(15, "Lily");
            obj1.isTeen(25,"Billy");

        }

    }

