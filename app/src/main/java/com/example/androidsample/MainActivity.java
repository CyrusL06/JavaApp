package com.example.androidsample;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }

    public void Convert(View view){
        //Get object ans save variable and use it to
        //Stores memory object from the view
                            //This is like the DOM
        EditText editText = findViewById(R.id.editText);
        TextView textView = findViewById(R.id.textView);

        String dollar = editText.getText().toString();

        if(!dollar.equals("")){
            Float euro = Float.valueOf(dollar) * 0.85f;
            textView.setText(euro.toString());
        }else{
            textView.setText("You didn't Enter Any Value!");
        }


    }


}