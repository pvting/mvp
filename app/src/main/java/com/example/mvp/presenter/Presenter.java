package com.example.mvp.presenter;

import com.example.mvp.model.Student;
import com.example.mvp.view.IView;

public class Presenter {
    private Student stu;
    private IView view;

    public Presenter(IView view){
        this.view = view;
        stu = new Student();
    }
    public void setStuName(String name){
        stu.setName(name);
        onResult(stu.getName());
    }

    public void onResult(String name){
        view.onResult(name);
    }

}
