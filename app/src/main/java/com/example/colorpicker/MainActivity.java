package com.example.colorpicker;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.lang.Object;
import java.text.NumberFormat;
import java.util.Currency;

import com.google.android.material.slider.LabelFormatter;
import com.google.android.material.slider.Slider;



public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

}