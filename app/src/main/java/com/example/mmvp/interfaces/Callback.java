package com.example.mmvp.interfaces;

public interface Callback<T> {

    void success(T data);

    void fail(String err);

}
