package com.mallika.s1508.mynoteapp.Database;

import com.mallika.s1508.mynoteapp.Models.Notes;
//import static androidx.room.OnConflictStrategy.REPLACE;
import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;


@Dao
public interface MainDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Notes notes);

    @Query("SELECT * FROM notes ORDER BY id DESC")
    List<Notes> getAll();

    @Query("UPDATE notes SET title=:title, notes=:notes WHERE ID = :id")
    void update(int id,String title,String notes);

    @Delete
    void delete(Notes notes);

    @Query("UPDATE notes SET pinned = :pin WHERE ID= :id")
    void pin(int id, boolean pin);
}
