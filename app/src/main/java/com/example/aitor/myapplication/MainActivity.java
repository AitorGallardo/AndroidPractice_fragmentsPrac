package com.example.aitor.myapplication;

import android.app.FragmentManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements OperatorFragment.OnFragmentInteractionListener, operatorInterface,ResultFragment.OnFragmentInteractionListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void sendOprationType(String dades, int v1, int v2) {
        int resultat = 0;

        switch(dades){
            case "suma":
                resultat = suma(v1, v2);
                break;
            case "resta":
                resultat = resta(v1, v2);
                break;
            case "multiplicacio":
                resultat = multiplicacio(v1, v2);
                break;
            case "divisio":
                resultat = divisio(v1, v2);
                break;
        }

        FragmentManager fm= getFragmentManager();
        ResultFragment Fb= (ResultFragment)fm.findFragmentById(R.id.fragment2);
        Fb.setResult(String.valueOf(resultat));
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {



    }

    int suma(int v1, int v2){
        return v1+v2;
    }
    int resta(int v1, int v2){
        return v1-v2;
    }
    int multiplicacio(int v1, int v2){
        return v1*v2;
    }
    int divisio(int v1, int v2){
        return v1%v2;
    }
}
