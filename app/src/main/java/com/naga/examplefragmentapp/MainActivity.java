package com.naga.examplefragmentapp;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.fragment.app.FragmentActivity;


import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.naga.examplefragmentapp.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends FragmentActivity implements ToolbarFragment.ToolbarListener {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
    public void onButtonClick(int fontsize, String text) {

    }
}