package com.example.pr7servis;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Naaaa extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setTitle("Подтверждение");
        builder.setMessage("Вы уверены, что хотите выполнить это действие?");
        builder.setIcon(android.R.drawable.ic_dialog_alert);
        builder.setNegativeButton("Отмена", null);
        builder.setPositiveButton("Ок", null);
        return builder.create();
    }
}