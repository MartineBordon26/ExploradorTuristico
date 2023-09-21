package com.martinbordon.exploradorturistico.ui.LugaresTuristicos;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.martinbordon.exploradorturistico.R;
import com.martinbordon.exploradorturistico.databinding.ActivityDetallesBinding;
import com.martinbordon.exploradorturistico.modelos.Lugar;

import java.lang.annotation.Target;
import java.time.LocalTime;

public class Detalles extends AppCompatActivity {
  //  private LugarAdapter la;
    private Context context;
    private ActivityDetallesBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetallesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        context=getApplicationContext();
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        Lugar lugar = (Lugar) bundle.getSerializable("lugar");

        String hora = lugar.getHoraApertura().toString();
        TextView horaDetalle = binding.tvhorario;

        Glide.with(context)
                .load(lugar.getFoto())
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(binding.imagen);

        horaDetalle.setText(hora);


    }
    }
