package com.example.notepad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.notepad.adapter.NotesAdapter;
import com.example.notepad.models.mainnotes;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<mainnotes> notesAL = new ArrayList<>();
    NotesAdapter adapter;
    RecyclerView notesRV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();

        notesAL.add(new mainnotes(R.drawable.qqq,"Accounts","work",true));
        notesAL.add(new mainnotes(R.drawable.www,"Accounts","work",false));
        notesAL.add(new mainnotes(R.drawable.eee,"Accounts","work",true));
        notesAL.add(new mainnotes(R.drawable.rrr,"Accounts","work",false));
        notesAL.add(new mainnotes(R.drawable.ttt,"Accounts","work",true));

        adapter = new NotesAdapter(getApplicationContext(),notesAL,MainActivity.this);

        notesRV.setAdapter(adapter);


    }

    private void initUI() {
        notesRV = findViewById(R.id.recycleRV);
        notesRV.setLayoutManager(new GridLayoutManager(this,2));
    }
}
