package ru.netology.venikov_d_i;

public class Main {

    public static void main(String[] args) {
	// write your code here
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener errorListener = x -> {
            if (x == 33){
                return "ERROR";
            } else return null;
        };
        Worker worker1 = new Worker(listener, errorListener);
        worker1.start();
    }
}
