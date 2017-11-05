/**
 * Created by bhakti on 10/26/17.
 */

public class Test {

    public static void main(String[] args)

    {
        Test t = new Test();

        long startTime = System.nanoTime();
        t.Method1();
        long endTime = System.nanoTime();
        System.out.println("Method 1 executed in =  " + (endTime - startTime) + " nanoseconds");


        long startTime1 = System.nanoTime();
        t.Method2();
        long endTime1 = System.nanoTime();
        System.out.println("Method 2 executed in =  " + (endTime1 - startTime1) + " nanoseconds");

        long startTime2 = System.nanoTime();
        t.Method3();
        long endTime2 = System.nanoTime();
        System.out.println("Method 3 executed in =  " + (endTime2 - startTime2) + " nanoseconds");
    }

    public void Method1()
    {

        int counter, integer = 0;

        for (counter = 0; counter < 1000; counter++) {
            integer = 100;
        }

        System.out.println(integer * integer);
    }

    public void Method2()
    {

        int counter,counter1;
        int integer;
        integer = 0;

        for (counter = 0; counter < 1000; counter++) {
            for (counter1 = 0; counter1 < 1000; counter1++) {
                integer = 100;
            }
        }

        System.out.println(integer * integer);

    }


    public void Method3()
    {

        int counter,counter1,counter2 ;

        int integer=0;

        for (counter = 0; counter < 1000; counter++) {
            for (counter1 = 0; counter1 < 1000; counter1++) {
                for (counter2 = 0; counter2 < 1000; counter2++) {
                    integer = 100;
                }
            }
        }

            System.out.println( integer * integer);
        }


    }


