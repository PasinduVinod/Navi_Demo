package com.example.drawerdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;

public class AboutUs extends AppCompatActivity {
    //initialize variable
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
    }

    public void ClickMenu(View view){
        //open drawer
        MainActivity.openDrawer(drawerLayout);
    }

    public void ClickLogo(View view){
        //close drawer
        MainActivity.closeDrawer(drawerLayout);
    }

    public void ClickHome(View view){
        //redirect activity to home
        MainActivity.redirectActivity(this,MainActivity.class);
    }

    public void ClickDashboard(View view){
        //redirect activity to Dashboard
        MainActivity.redirectActivity(this,Dashboard.class);
    }

    public void ClickAboutUs(View view){
        //recreate activity
        recreate();
    }

    public void ClickSettings(View view){
        //redirect activity to settings
        MainActivity.redirectActivity(this,Settings.class);
    }

    public void ClickLogout(View view){
        //close app
        MainActivity.logout(this);
    }

    @Override
    protected void onPause(){
        super.onPause();
        //clone drawer
        MainActivity.closeDrawer(drawerLayout);
    }

}