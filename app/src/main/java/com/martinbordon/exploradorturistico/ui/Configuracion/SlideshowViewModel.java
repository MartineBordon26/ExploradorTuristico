package com.martinbordon.exploradorturistico.ui.Configuracion;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SlideshowViewModel extends ViewModel {

    private MutableLiveData<Integer> tipoMapa = new MutableLiveData<>();
    private MutableLiveData<String> idioma = new MutableLiveData<>();

    public LiveData<Integer> getTipoMapa() {
        return tipoMapa;
    }

    public void setTipoMapa(int tipoMapaSeleccionado) {
        tipoMapa.setValue(tipoMapaSeleccionado);
    }

    public LiveData<String> getIdioma() {
        return idioma;
    }

    public void setIdioma(String idiomaSeleccionado) {
        idioma.setValue(idiomaSeleccionado);
    }
}