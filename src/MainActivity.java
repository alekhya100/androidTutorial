package com.example.helloandroid;  
import android.os.Bundle;  
import android.app.Activity;  
import android.view.Menu;  
import android.widget.TextView;  
public class MainActivity extends Activity { 
    @Override  
    protected void onCreate(Bundle savedInstanceState) {
    // onCreate is called when Activity class is first created.
        super.onCreate(savedInstanceState);  
                
        setContentView(R.layout.activity_main);
        //gives information about layout resource
    }  
    @Override  
    public boolean onCreateOptionsMenu(Menu menu) {
    //this adds items to the action bar if it is present
      getMenuInflater().inflate(R.menu.activity_main, menu);  
        return true;  
    }  
}  
