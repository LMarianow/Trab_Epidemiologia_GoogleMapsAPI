package com.google.codelab.currentplace;

import android.util.Log;

import com.opencsv.CSVReader;

import java.io.InputStream;
import java.io.InputStreamReader;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.PlaceLikelihood;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import com.google.android.libraries.places.api.net.FindCurrentPlaceResponse;
import com.google.android.libraries.places.api.net.PlacesClient;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.SimpleAdapter;
import android.widget.Toast;
/*
public class Dados {

    private void ReadSCV(String BR){
        try {
            int Data_Numbers[] = new int[2];

            InputStream is = getAssets()
                    .open(fileName);
            InputStreamReader isr = new InputStreamReader(is, "UTF-8");
            CSVReader reader = new CSVReader(isr,';');
            String[] nextLine = null;
            String Linha="";
            // start reading the scv files, remember the first row is the attribute
            while ((nextLine = reader.readNext()) != null) {
                if( BR.compareTo(nextLine[5]) == 0) {
                    Data_Numbers[0] = Data_Numbers[0] + Integer.valueOf(nextLine[18]);
                    Data_Numbers[1] = Data_Numbers[1] + Integer.valueOf(nextLine[23]);
                }
                Linha = nextLine[5];
                dados.add(nextLine);
            }
            Log.d(TAG, "Linha2="+Linha);
            Log.d(TAG, "Nmortos =" + Data_Numbers[0] + " Nferidos =" + Data_Numbers[1]);
        }catch (Exception e) {
            Log.e( TAG, e.toString() );
        }
    }
}
*/