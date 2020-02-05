package com.example.notepad.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.notepad.R;
import com.example.notepad.models.mainnotes;

import java.util.ArrayList;

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.NotesViewholder> {

    Context mcontext;
    ArrayList<mainnotes> notesAL = new ArrayList<>();
    Activity parentAC;

    public NotesAdapter(Context mcontext, ArrayList<mainnotes> notesAL, Activity parentAC) {
        this.mcontext = mcontext;
        this.notesAL = notesAL;
        this.parentAC = parentAC;
    }

    @NonNull
    @Override
    public NotesViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mcontext);
        View view = inflater.inflate(R.layout.item_homenotes, parent, false);
        return new NotesAdapter.NotesViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NotesViewholder holder, int position) {

        mainnotes obj = notesAL.get(position);

        holder.labelTV.setText(obj.getTag());
        holder.itemIV.setImageResource(obj.getImages());
        if (obj.getFav())
            holder.favIV.setImageResource(R.drawable.heartred);
        else
            holder.favIV.setImageResource(R.drawable.heartwhite);
        holder.titleTV.setText(obj.getTitle());

    }

    @Override
    public int getItemCount() {
        return notesAL.size();
    }

    public class NotesViewholder extends RecyclerView.ViewHolder {

        ImageView favIV, itemIV;
        TextView titleTV, labelTV;

        public NotesViewholder(@NonNull View itemView) {
            super(itemView);
            favIV = itemView.findViewById(R.id.heartIV);
            itemIV = itemView.findViewById(R.id.itemIV);
            titleTV = itemView.findViewById(R.id.titleTV);
            labelTV = itemView.findViewById(R.id.labelTV);
        }
    }
}

