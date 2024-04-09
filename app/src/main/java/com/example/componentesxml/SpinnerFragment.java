package com.example.componentesxml;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SpinnerFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SpinnerFragment extends Fragment {

    TextView seleccion;
    Spinner albums_spinner;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_spinner, container, false);
        seleccion = view.findViewById(R.id.seleccion);
        albums_spinner = view.findViewById(R.id.albums_spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(requireContext(), R.array.albums_array, android.R.layout.simple_spinner_item);
        albums_spinner.setAdapter(adapter);
        return view;
    }
}