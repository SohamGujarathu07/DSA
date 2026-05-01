
public class DS_arrays {
        public static void main(String[] args) {
                // // method 1: deceleration and then allocation
                // int [] markss;
                // markss = new int [5];
                // // Initialization
                // markss [0]=77;
                // markss[1]=85;
                // markss[3]=89;
                // markss[4]=99;
                // System.out.println(" method 1: deceleration and then allocation:");
                // System.out.println(markss[3]);
                // // method 2: deceleration and allocation
                // int [] marksss = new int[5];
                // marksss[0]=77;
                // marksss[1]=85;
                // marksss[3]=89;
                // marksss[4]=99;
                // System.out.println(" method 2: deceleration and allocation:");
                // System.out.println(marksss[0]);

                // // method 3: deceleration ,allocation and Initialization
                // int[] marks = {77, 75, 88, 87, 95, 97};
                // System.out.println(" method 3: deceleration ,allocation and
                // Initialization:");
                // System.out.println(marks[3]);

                // // printing string array
                // String [] str ={"Soham","Pranamya",};
                // System.out.println("printing string array");
                // System.out.println(str.length);

                // // Display array using for loop
                // System.out.println(" Display array using for loop:");
                // for (int i = 0; i < marks.length; i++) {
                // System.out.println(marks[i]);
                // }

                // // Display array in reverse order using for loop
                // System.out.println("Display array in reverse order using for loop:");
                // for(int i=marks.length - 1;i>0;i--){
                // System.out.println(marks[i]);
                // }

                // // Display array using for-each loop
                // System.out.println("Display array using for-each loop:");
                // for (int element:marks){
                // System.out.println(element);
                // }

                // // Multi Dimensional Array
                // System.out.println(" Multi Dimensional Array:");
                // int [][] flat = new int[2][4];
                // flat[0][0]=101;
                // flat[0][1]=102;
                // flat[0][2]=103;
                // flat[0][3]=104;
                // flat[1][0]=201;
                // flat[1][1]=202;
                // flat[1][2]=203;
                // flat[1][3]=204;

                // for (int i=0;i< flat.length;i++){
                // for (int j=0;j<flat[i].length;j++){
                // System.out.print(flat[i][j]);
                // System.out.print(" ");
                // }
                // System.out.println("");
                // }

                // int[][] num = new int[2][4];
                // for (int i = 0; i < 2; i++) {
                //         for (int j = 0; j < 4; j++) {
                //                 num[i][j] = (int) (Math.random() * 1000);
                //         }

                // }
                // for (int i = 0; i < 2; i++) {
                //         for (int j = 0; j < 4; j++) {
                //                 System.out.print(num[i][j] + " ");
                //         }
                //         System.out.println("");
                // }

                // Jagged arrays
                int num2 [][]=new int [3][];
                num2[0] = new int[4];
                num2[1] = new int[3];
                num2[2] = new int[2];

                for(int i=0;i< num2.length;i++){
                        for(int j=0;j< num2[i].length;j++){
                        num2[i][j]=(int)(Math.random()*10);     

                        }
                } 
                for(int n[]:num2){
                        for(int m:n){
                                System.out.print(m +" ");
                        }
                        System.out.println();
                } 
        }
}
