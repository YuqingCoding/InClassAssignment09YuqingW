package com.example.inclassassignment09_yuqingw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MainActivity extends AppCompatActivity {

    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference myRef = database.getReference("Car Type");
    private DatabaseReference myCarRef = database.getReference("Multiple Cars");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void setCar(View view){
        myRef.setValue(new Car("Dodge","Colt",1989,false));
    }

    public void addCar(View view){
        myCarRef.push().setValue(new Car("BMW","series 4",2016,true));
    }
}
