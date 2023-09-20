package com.martinbordon.exploradorturistico.ui.LugaresTuristicos;

import android.app.Application;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.martinbordon.exploradorturistico.R;
import com.martinbordon.exploradorturistico.modelos.Lugar;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class HomeViewModel extends AndroidViewModel {

    private Context context;
    private MutableLiveData<List<Lugar>> listaMutable;
    public HomeViewModel(@NonNull Application application) {
        super(application);
        this.context= application.getApplicationContext();
    }

    public LiveData<List<Lugar>> getListaMutable() {
        if (listaMutable == null ) {
            listaMutable= new MutableLiveData<>();
        }
        return listaMutable;
    }

    public void armarLista() {
        List<Lugar> lista=new ArrayList<>();
        lista.add(new Lugar("Catedral", "iglesia antigua", "http://www.secsanluis.com.ar/servicios/casa1.jpg", LocalTime.of(1,23,21)));
        lista.add(new Lugar("Potrero De los Funes", "Cierras", "http://www.secsanluis.com.ar/servicios/casa2.jpg", LocalTime.of(2,23,21)));
        lista.add(new Lugar("Carolina", "Parte con cierras", "http://www.secsanluis.com.ar/servicios/casa3.jpg", LocalTime.of(3,23,21)));
        listaMutable.setValue(lista);
    }


}