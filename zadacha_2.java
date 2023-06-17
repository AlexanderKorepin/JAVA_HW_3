// Пусть дан произвольный список целых чисел.
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение
import java.util.ArrayList;
import java.util.Random;
public class zadacha_2 {
    public static int minOfArray(ArrayList<Integer> newList){
            int arrayMin = newList.get(0);
            for (int i = 1; i < newList.size(); i++) {
                if(newList.get(i)<arrayMin){
                    arrayMin = newList.get(i);
                }
            }
            return arrayMin;
    }
    public static int maxOfArray(ArrayList<Integer> newList){
        int arrayMax = newList.get(0);
        for (int i = 1; i < newList.size(); i++) {
            if(newList.get(i)>arrayMax){
                arrayMax = newList.get(i);
            }
        }
        return arrayMax;
    }
    public static int average(ArrayList<Integer> newList){
        int sum = 0;
        for (int i = 0; i < newList.size(); i++) {
            sum = sum + newList.get(i);
            }
        int average = sum/newList.size();
        return average;
    }
    public static void main(String[] args) {        
        Random rnd = new Random();
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            newList.add(rnd.nextInt(20));
        }
        System.out.println("\n" + newList + "\n");
        System.out.println("Максимальное значение равно:" + " " + maxOfArray(newList));
        System.out.println("Минимальное значение равно:" + " " +  minOfArray(newList));
        System.out.println("Среднее значение равно:" + " " +  average(newList)+ "\n");
    }  
}
