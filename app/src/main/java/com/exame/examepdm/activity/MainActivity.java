package com.exame.examepdm.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.DataSetObserver;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.exame.examepdm.R;
import com.exame.examepdm.adapter.Adapter;
import com.exame.examepdm.entity.Cachorro;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Adapter adapter;
    private List<Cachorro> listaCachorro = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.ViewCachorro);
    }
    public void carregaCachorros(){
//lista de cachorros

        Cachorro cachorro1= new Cachorro();
        cachorro1.setRaca("Pitbull");
        cachorro1.setNome("bob");
        cachorro1.setIdade(5);
        listaCachorro.add(cachorro1);
        Cachorro cachorro2= new Cachorro();
        cachorro2.setRaca("Labrador");
        cachorro2.setNome("Marley");
        cachorro2.setIdade(8);
        listaCachorro.add(cachorro2);
        adapter = new Adapter(listaCachorro);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(getApplicationContext(), LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapter);

    }

    @Override
    protected void onStart() {
        carregaCachorros();
        super.onStart();
    }
}