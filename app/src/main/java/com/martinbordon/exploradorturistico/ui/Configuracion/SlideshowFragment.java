package com.martinbordon.exploradorturistico.ui.Configuracion;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.martinbordon.exploradorturistico.R;
import com.martinbordon.exploradorturistico.databinding.FragmentSlideshowBinding;

public class SlideshowFragment extends Fragment {

    private Spinner spinnerTipoMapa;
    private RadioGroup radioGroupIdioma;
    private SlideshowViewModel mv;
    private static final int RADIO_ESP_ID = R.id.radio_esp;
    private static final int RADIO_ENG_ID = R.id.radio_eng;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_slideshow, container, false);



        // Inicializar los elementos de la interfaz de usuario
        spinnerTipoMapa = view.findViewById(R.id.spinner_tipo_mapa);
        radioGroupIdioma = view.findViewById(R.id.radio_group_idioma);

        // Obtener una instancia del ViewModel
        mv = new ViewModelProvider(requireActivity()).get(SlideshowViewModel.class);

        // Asignar un listener al Spinner para manejar los cambios de tipo de mapa
        spinnerTipoMapa.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // Guardar el tipo de mapa seleccionado en el ViewModel
                mv.setTipoMapa(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        // Asignar un listener al RadioGroup para manejar los cambios de idioma
        radioGroupIdioma.setOnCheckedChangeListener((group, checkedId) -> {
            if (checkedId == RADIO_ESP_ID) {
                // Guardar el idioma seleccionado en el ViewModel
                mv.setIdioma("es");
            } else if (checkedId == RADIO_ENG_ID) {
                // Guardar el idioma seleccionado en el ViewModel
                mv.setIdioma("en");
            }
        });
        return view;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}