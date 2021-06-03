public class MessingAroundWithLoops<names> {
    public static void  main (String [] args){
        // basic while loop
       int i = 0;

       while (i<5) {
           System.out.println("Count A: "+i);
           i++;
       }

       // do while loop
        int a = 0;
       do{
            System.out.println("Count B: "+(a));
            a++;
       }
        while (a < 5);


        // loop throuh
        String [] names = {"Alex","Bill","Maria","Tyler","Madison"};
        for (String c : names) {
            System.out.println(c);
        }

        // for loop with simple break
        for (int y = 0; y < 10; y++){
            if (y== 4 ) {
                System.out.println("We broke out at 4!\n"+y);
                break;
            }
            System.out.println(y);
        }



    } //watch this <-- dont delete

}
