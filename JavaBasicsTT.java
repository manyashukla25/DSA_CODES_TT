public strictfp class JavaBasicsTT {
     // public strictfp static void main(String[] args) {
        public  strictfp static void main(String[] args) {
            /*
             * variable - which is used to store the value
             */
            byte age = 22; // Variable (Not Initalize) - Local Variable has to be initalize first
            int id = 1001;
            long voterId = 100000l; // Long Literal
            System.out.println(age);
            age = (byte)130;  //type casting
            System.out.println(age);
            //int age; 
            // age is name of a variable
            // int is a type of variable
            float roi = 7.2f; // f or F float literal
            roi = 9.2F;
            roi = (float)10.2;
            double amount = 8888.22234;
            System.out.println(id);
            System.out.println(voterId);
            System.out.println(roi);
            System.out.println(amount);
        }
}
