package com.company;

public class Main {

    public static void main(String[] args) {
        int [] array = {104,34,106,78,96,10,12};
       int  max=array[0];
       int min = array[0];
        for(int i=0;i<array.length; i++ ){
            if(array[i]>max)
                max = array[i];

        }
        for(int i=0;i<array.length; i++ ){
            if(array[i]<min)
                min = array[i];

        }
        System.out.println("THE Maximum of the arry is " + max);
        System.out.println("THE minimum of the arry is " + min);


    }

}

