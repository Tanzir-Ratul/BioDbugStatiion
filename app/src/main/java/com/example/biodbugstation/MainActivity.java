package com.example.biodbugstation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView  textViewLVL, textViewNXT,textViewPara,textViewMenu,textViewJake,textViewBio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Action bar hiding code
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        getActionBar().hide();
        //full screen activity
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        textViewMenu=findViewById(R.id.menu);
        textViewLVL = findViewById(R.id.tvlvl);
        textViewNXT = findViewById(R.id.tvnxt);
        textViewPara = findViewById(R.id.i_do_art_i_);
        textViewJake = findViewById(R.id.jake);
        textViewBio = findViewById(R.id.main_headin);

        //Custom font Add->
        Typeface customFont = Typeface.createFromAsset(getAssets(),"fonts/poppins_italic.ttf");

        textViewLVL.setTypeface(customFont);
        textViewNXT.setTypeface(customFont);
        textViewPara.setTypeface(customFont);
        textViewMenu.setTypeface(customFont);
        textViewJake.setTypeface(customFont);
        textViewBio.setTypeface(customFont);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_item,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.networkID){
            Toast.makeText(this, "Network icon", Toast.LENGTH_SHORT).show();
        }
        else if(item.getItemId() == R.id.wifiID){
            Toast.makeText(this, "Wireless net icon", Toast.LENGTH_SHORT).show();
        }
       else if(item.getItemId() == R.id.batteryID){
            Toast.makeText(this, "Battery icon", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}