package com.example.jcmilena.apptomodify1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ControllerActivity extends AppCompatActivity  {

    String fragment_number = "1";
    int fragment_color = R.color.colorFragment1;
    int fragment_container = R.id.fragment_container1;
    String fragment_tag = "Frag1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controller);


        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction().replace(fragment_container, fragment,fragment_tag).commit();

    }

    @Override
    public void pulsado(String numero) {
        if(numero.equalsIgnoreCase("1")){
            FragmentManager fm = getSupportFragmentManager();
            Fragment fragmentToRemove = fm.findFragmentByTag("Frag1");
            fm.beginTransaction().remove(fragmentToRemove).commit();
        }
        else{

        }

    }

}
