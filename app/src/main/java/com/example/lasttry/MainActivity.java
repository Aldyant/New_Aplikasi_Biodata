package com.example.lasttry;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void cellphone (View view)
    {
        Uri uri = Uri.parse("tel:082220242123");
        Intent it = new Intent(android.content.Intent.ACTION_VIEW, uri );
        startActivity(it);
    }
    public void showMap (View view)
    {
        Uri uri = Uri.parse("geo:-7.317528, 110.878358q=");
        Intent it = new Intent(android.content.Intent.ACTION_VIEW, uri);
        startActivity(it);
    }
    public void email(View view)
    {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL,new String[]{"kgamin9@gmail.com"});
        try
        {
            startActivity(Intent.createChooser(intent, "Lets TALK!"));

        }
        catch (android.content.ActivityNotFoundException ex)
        {

        }
    }
}
