package com.mallika.s1508.mynoteapp;

import com.mallika.s1508.mynoteapp.Models.Notes;

import androidx.cardview.widget.CardView;

public interface NotesClickListener {

    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardview);

}
