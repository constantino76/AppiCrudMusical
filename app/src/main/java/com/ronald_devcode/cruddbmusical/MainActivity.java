package com.ronald_devcode.cruddbmusical;
import com.ronald_devcode.Model.Playlist;
import com.ronald_devcode.interfaz.*;
import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends AppCompatActivity  implements  View.OnClickListener{
  public  Button btn_click;

     public  static  String  direccion="http://localhost:5206/api/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_click= findViewById(R.id.btnconsultar);
        btn_click.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
int a=9;
listarplaylist();

    }
public void listarplaylist(){

    IPlaylist peticion;
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(direccion)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    peticion = retrofit.create(IPlaylist.class);
    Call<List<Playlist>> call=peticion.ObtenerPlayList();
    call.enqueue(new Callback<List<Playlist>>() {
        @Override
        public void onResponse(Call<List<Playlist>> call, Response<List<Playlist>> response) {
            if(response.isSuccessful()){



            }
        }

        @Override
        public void onFailure(Call<List<Playlist>> call, Throwable throwable) {

        }
    });
}



}