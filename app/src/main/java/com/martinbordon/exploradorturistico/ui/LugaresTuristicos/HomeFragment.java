package com.martinbordon.exploradorturistico.ui.LugaresTuristicos;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.martinbordon.exploradorturistico.MainActivity;
import com.martinbordon.exploradorturistico.databinding.FragmentHomeBinding;
import com.martinbordon.exploradorturistico.modelos.Lugar;

import java.util.List;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private HomeViewModel vm;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        vm = new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        vm.getListaMutable().observe(getViewLifecycleOwner(), new Observer<List<Lugar>>() {
            @Override
            public void onChanged(List<Lugar> lugars) {
                RecyclerView rv = binding.rvLugares;
                GridLayoutManager glm = new GridLayoutManager(getContext(), 2, GridLayoutManager.VERTICAL, false);
                rv.setLayoutManager(glm);
                LugarAdapter lad = new LugarAdapter(getContext(), lugars, getLayoutInflater());
                rv.setAdapter(lad);
                 lad.setOnItemClickListener(new LugarAdapter.OnItemClickListener() {
                   @Override
                    public void onItemClick(Lugar lugar) {
                        Intent intent = new Intent(getContext(), Detalles.class);
                        intent.putExtra("hora", lugar.getHoraApertura().toString());
                        intent.putExtra("foto", lugar.getFoto());
                        startActivity(intent);
                    }
                });
            }
        });

        vm.armarLista();

        return root;
    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}