package ru.netology.venikov_d_i;

@FunctionalInterface
public interface OnTaskErrorListener {
    String onError(Integer count);
}
