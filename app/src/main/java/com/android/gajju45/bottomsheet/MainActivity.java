package com.android.gajju45.bottomsheet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout share,upload,copy;
    BottomSheetDialog bottomSheetDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createBottomSheetDilog();
    }

    private void createBottomSheetDilog(){

        if (bottomSheetDialog == null){
            View view= LayoutInflater.from(this).inflate(R.layout.bottom_sheet,null);
            share=view.findViewById(R.id.shareLinearLayout);
            upload=view.findViewById(R.id.uploadLinearLayout);
            copy=view.findViewById(R.id.copyLinearLayout);

            share.setOnClickListener(this);
            upload.setOnClickListener(this);
            copy.setOnClickListener(this);

            bottomSheetDialog=new BottomSheetDialog(this);
            bottomSheetDialog.setContentView(view);
        }
    }
    public void showDialog(View view) {
        bottomSheetDialog.show();

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.shareLinearLayout:
                Toast.makeText(this, "Share", Toast.LENGTH_SHORT).show();
                break;

            case R.id.uploadLinearLayout:
                Toast.makeText(this, "Upload", Toast.LENGTH_SHORT).show();
                break;

            case R.id.copyLinearLayout:
                Toast.makeText(this, "Copy", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}