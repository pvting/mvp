package com.example.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mvp.presenter.Presenter;
import com.example.mvp.view.IView;

public class MainActivity extends AppCompatActivity implements IView {

    Presenter presenter;
    TextView tv;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView)findViewById(R.id.tv);
        bt = (Button)findViewById(R.id.bt);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setStuName("我是小米");
            }
        });

        presenter = new Presenter(this);
    }




    @Override
    public void setStuName(String name) {
        presenter.setStuName(name);
    }

    @Override
    public void onResult(String name) {
        tv.setText(name);
    }
}
