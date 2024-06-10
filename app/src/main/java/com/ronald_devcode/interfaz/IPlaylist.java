package com.ronald_devcode.interfaz;

import com.ronald_devcode.Model.Playlist;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface IPlaylist {
    //Obtenerplaylist
    @GET("listar")
    Call<List<Playlist>> ObtenerPlayList();

}
