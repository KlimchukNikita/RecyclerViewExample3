package com.example.recyclerviewexample3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MyRecyclerViewAdapter.ItemClickListener {

    MyRecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // data to populate the RecyclerView with
        ArrayList <String> subjectNames = new ArrayList<>();
        subjectNames.add("СОВР. ТЕХ. РАЗР. ИНТ. ИС");
        subjectNames.add("АДМ. БАЗ ДАННЫХ");
        subjectNames.add("ПРОГР. Web-ПРИЛ. c.п.");
        subjectNames.add("ВОЕН. ПОДГОТОВКА");
        subjectNames.add("ТЕХ. РАЗР. ПРОГ. ОБЕСП.");
        subjectNames.add("СОВР. ТЕХ. РАЗР. ИНТ. ИС");
        subjectNames.add("ПРОГР. КЛИЕНТ. ПРИЛ.");
        subjectNames.add("ФИЗ. КУЛЬТУРА");
        subjectNames.add("ИНФ. БЕЗОП. КОМП. СИС.");
        subjectNames.add("ТЕХ. РАЗР. ПРОГ. ОБЕСП.");
        subjectNames.add("ИНФ. БЕЗОП. КОМП. СИС.");
        subjectNames.add("ИНФ. БЕЗОП. КОМП. СИС.");
        subjectNames.add("АДМ. БАЗ ДАННЫХ");
        subjectNames.add("ПРОГР. Web-ПРИЛ. c.п.");
        subjectNames.add("ВОЕН. ПОДГОТОВКА");
        subjectNames.add("ТЕХ. РАЗР. ПРОГ. ОБЕСП.");
        subjectNames.add("ПРОГР. КЛИЕНТ. ПРИЛ.");
        subjectNames.add("ПРОГР. КЛИЕНТ. ПРИЛ.");
        subjectNames.add("ФИЗ. КУЛЬТУРА");
        subjectNames.add("ТЕХ. РАЗР. ПРОГ. ОБЕСП.");
        subjectNames.add("ИНФ. БЕЗОП. КОМП. СИС.");

        // set up the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.rvSubjectNames);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MyRecyclerViewAdapter(this, subjectNames);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "You clicked " + adapter.getItem(position) + " on row number " + position, Toast.LENGTH_SHORT).show();
    }
}
