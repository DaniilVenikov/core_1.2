package ru.netology.venikov_d_i;

public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback){
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start(){
        for (int i = 0; i < 100; i++) {
            if ("ERROR".equals(errorCallback.onError(i + 1))){
                callback.onDone("ERROR");
            } else callback.onDone("Task " + (i + 1) + " is done");
        }
    }

}
