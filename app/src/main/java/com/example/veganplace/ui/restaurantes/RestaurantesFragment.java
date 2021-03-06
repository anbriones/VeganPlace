package com.example.veganplace.ui.restaurantes;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.veganplace.R;

public class RestaurantesFragment extends Fragment {

    private RestaurantesViewModel restaurantesViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        restaurantesViewModel =
                new ViewModelProvider(this).get(RestaurantesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_restaurantes, container, false);
        final TextView textView = root.findViewById(R.id.text_restaurantes);
        restaurantesViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

        return root;
    }
}