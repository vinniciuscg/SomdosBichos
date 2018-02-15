package somdosbichos.vinicius.com.somdosbichos;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView cachorro;
    private ImageView gato;
    private ImageView leao;
    private ImageView macaco;
    private ImageView ovelha;
    private ImageView vaca;

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cachorro = (ImageView) findViewById(R.id.cachorroId);
        gato = (ImageView) findViewById(R.id.gatoId);
        leao = (ImageView) findViewById(R.id.leaoId);
        macaco = (ImageView) findViewById(R.id.macacoId);
        ovelha = (ImageView) findViewById(R.id.ovelhaId);
        vaca = (ImageView) findViewById(R.id.vacaId);

        cachorro.setOnClickListener(this);
        gato.setOnClickListener(this);
        leao.setOnClickListener(this);
        macaco.setOnClickListener(this);
        ovelha.setOnClickListener(this);
        vaca.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int idClicado = view.getId();

        switch (idClicado){
            case R.id.cachorroId:
                if(mediaPlayer != null){
                    mediaPlayer.release();
                }
                mediaPlayer = MediaPlayer.create(this, R.raw.cao);
                tocarSom();
                break;
            case R.id.gatoId:
                if(mediaPlayer != null){
                    mediaPlayer.release();
                }
                mediaPlayer = MediaPlayer.create(this, R.raw.gato);
                tocarSom();
                break;
            case R.id.leaoId:
                if(mediaPlayer != null){
                    mediaPlayer.release();
                }
                mediaPlayer = MediaPlayer.create(this, R.raw.leao);
                tocarSom();
                break;
            case R.id.macacoId:
                if(mediaPlayer != null){
                    mediaPlayer.release();
                }
                mediaPlayer = MediaPlayer.create(this, R.raw.macaco);
                tocarSom();
                break;
            case R.id.ovelhaId:
                if(mediaPlayer != null){
                    mediaPlayer.release();
                }
                mediaPlayer = MediaPlayer.create(this, R.raw.ovelha);
                tocarSom();
                break;
            case R.id.vacaId:
                if(mediaPlayer != null){
                    mediaPlayer.release();
                }
                mediaPlayer = MediaPlayer.create(this, R.raw.vaca);
                tocarSom();
                break;
        }
    }

    private void tocarSom(){

        if(mediaPlayer != null){
            mediaPlayer.start();
        }
    }

    @Override
    protected void onDestroy() {

        if(mediaPlayer != null){
            mediaPlayer.release();
            mediaPlayer = null;
        }

        super.onDestroy();
    }
}
