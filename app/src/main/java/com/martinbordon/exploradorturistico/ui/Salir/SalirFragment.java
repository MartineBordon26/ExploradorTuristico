package com.martinbordon.exploradorturistico.ui.Salir;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.martinbordon.exploradorturistico.R;

public class SalirFragment extends Fragment {
    public static SalirFragment newInstance() {
        return new SalirFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        SalirViewModel.mostrarDialog(getActivity());
        return inflater.inflate(R.layout.fragment_salir, container, false);
    }

}