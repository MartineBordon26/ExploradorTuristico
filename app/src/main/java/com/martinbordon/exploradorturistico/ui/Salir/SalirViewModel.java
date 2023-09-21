package com.martinbordon.exploradorturistico.ui.Salir;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;

public class SalirViewModel extends ViewModel {
    public static void mostrarDialog(Context activity){
        new AlertDialog.Builder(activity)
                .setTitle("Nos vemos la proxima")
                .setMessage("Cerrar la aplicación ?")
                .setPositiveButton("Sí", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //   activity.finish();
                        //   System.exit(0);
                        ((AppCompatActivity)activity).finishAndRemoveTask();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(activity, "Continuamos trabajando", Toast.LENGTH_SHORT).show();
                    }
                }).show();
    }
}