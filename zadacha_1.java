// Пусть дан произвольный список целых чисел, удалить из него чётные числа

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
public class zadacha_1 {
        public static void main(String[] args) {
            Random rnd = new Random();
            ArrayList<Integer> newList = new ArrayList<>();
            for (int i = 0; i < 20; i++) {
                newList.add(rnd.nextInt(20));
            }
            System.out.println();
            System.out.print(newList + "\t");
            Iterator<Integer> myListIterator = newList.iterator();
            while(myListIterator.hasNext()){
                if (myListIterator.next()%2 == 0){
                    myListIterator.remove();
                }
            }  
            System.out.println();
            System.out.print(newList);
        }   
    }