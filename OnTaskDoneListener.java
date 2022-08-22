package ru.netology.venikov_d_i;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
