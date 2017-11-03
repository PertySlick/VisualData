package edu.roush.visualdata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String testData = "";
        try {
            JSONObject testObject = new JSONObject(testData);
        } catch (Exception e) {

        }
    }
}
