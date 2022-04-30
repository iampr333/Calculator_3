package com.example.calculatorcollege;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1 ;
    EditText num2 ;
    TextView result ;
    int n1,n2;
    String v1,v2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setTitle("Developed By Ritik");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


     boolean check()
     {
        num1 = findViewById(R.id.num1);
         num2 = findViewById(R.id.num2);
          result = findViewById(R.id.result);
           v1 = num1.getText().toString();
           v2 = num2.getText().toString();
               if(v1.equals(null) || v2.equals(null) || (v1.equals("") || v2.equals("")))
               {  String msg = "Enter Vaild Value";
                   result.setText(msg);
                   return false;
               }
                   n1 = Integer.parseInt(v1);
                   n2 = Integer.parseInt(v2);
     return true;
     }



    public void add(View view) {
            int ans;
            if(check()) {
                ans = n1 + n2;
                result.setText(Integer.toString(ans));
            }
    }

    public void mod(View view) {
        double ans;
        if(check()) {
            ans = n1 % n2;
            result.setText(Double.toString(ans));
        }
    }

    public void mul(View view) {
        int ans;
        if(check()) {
            ans = n1 * n2;
            result.setText(Integer.toString(ans));
        }
    }

    public void div(View view) {
        double ans;
        if(check()) {
            ans = n1 / (n2*1.0);
            result.setText(Double.toString(ans));
        }
    }

    public void min(View view) {
        int ans;
        if(check()) {
            ans = n1 - n2;
            result.setText(Integer.toString(ans));
        }
    }

    public void pow(View view) {
        double ans;
        if(check()) {
            ans = Math.pow(n2,n1);
            result.setText(Double.toString(ans));
        }
    }
}