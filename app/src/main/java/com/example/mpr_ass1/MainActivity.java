package com.example.mpr_ass1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mpr_ass1.adapter.ViewPagerTableAdapter;
import com.example.mpr_ass1.fragment.HiraTableFragment;
import com.example.mpr_ass1.fragment.KataTableFragment;

import java.io.IOException;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btnHira, btnKata;
    MediaPlayer mediaPlayer;
    ViewPager2 viewPager2;
    ViewPagerTableAdapter tableAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init(){
        btnHira = findViewById(R.id.btnHira);
        btnKata = findViewById(R.id.btnKata);
        viewPager2 = findViewById(R.id.vpgTable);

        mediaPlayer = new MediaPlayer();

        tableAdapter = new ViewPagerTableAdapter(this);

        viewPager2.setAdapter(tableAdapter);

        viewPager2.setOffscreenPageLimit(2);

        btnHira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickHira();
            }
        });

        btnKata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickKata();
            }
        });

    }

    public void onClickHira(){
        viewPager2.setCurrentItem(0);
    }

    public void onClickKata(){
        viewPager2.setCurrentItem(1);
    }

    public void playSound(String character){
        mediaPlayer.stop();

        Log.e("playSound", character);

        switch (character){
            case "a":
                mediaPlayer = MediaPlayer.create(this, R.raw.a);
                break;
            case "i":
                mediaPlayer = MediaPlayer.create(this, R.raw.i);
                break;
            case "u":
                mediaPlayer = MediaPlayer.create(this, R.raw.u);
                break;
            case "e":
                mediaPlayer = MediaPlayer.create(this, R.raw.e);
                break;
            case "o":
                mediaPlayer = MediaPlayer.create(this, R.raw.o);
                break;
            case "ka":
                mediaPlayer = MediaPlayer.create(this, R.raw.ka);
                break;
            case "ki":
                mediaPlayer = MediaPlayer.create(this, R.raw.ki);
                break;
            case "ku":
                mediaPlayer = MediaPlayer.create(this, R.raw.ku);
                break;
            case "ke":
                mediaPlayer = MediaPlayer.create(this, R.raw.ke);
                break;
            case "ko":
                mediaPlayer = MediaPlayer.create(this, R.raw.ko);
                break;
            case "sa":
                mediaPlayer = MediaPlayer.create(this, R.raw.sa);
                break;
            case "shi":
                mediaPlayer = MediaPlayer.create(this, R.raw.shi);
                break;
            case "su":
                mediaPlayer = MediaPlayer.create(this, R.raw.su);
                break;
            case "se":
                mediaPlayer = MediaPlayer.create(this, R.raw.se);
                break;
            case "so":
                mediaPlayer = MediaPlayer.create(this, R.raw.so);
                break;
            case "ta":
                mediaPlayer = MediaPlayer.create(this, R.raw.ta);
                break;
            case "chi":
                mediaPlayer = MediaPlayer.create(this, R.raw.chi);
                break;
            case "tsu":
                mediaPlayer = MediaPlayer.create(this, R.raw.tsu);
                break;
            case "te":
                mediaPlayer = MediaPlayer.create(this, R.raw.te);
                break;
            case "to":
                mediaPlayer = MediaPlayer.create(this, R.raw.to);
                break;
            case "na":
                mediaPlayer = MediaPlayer.create(this, R.raw.na);
                break;
            case "ni":
                mediaPlayer = MediaPlayer.create(this, R.raw.ni);
                break;
            case "nu":
                mediaPlayer = MediaPlayer.create(this, R.raw.nu);
                break;
            case "ne":
                mediaPlayer = MediaPlayer.create(this, R.raw.ne);
                break;
            case "no":
                mediaPlayer = MediaPlayer.create(this, R.raw.no);
                break;
            case "ha":
                mediaPlayer = MediaPlayer.create(this, R.raw.ha);
                break;
            case "hi":
                mediaPlayer = MediaPlayer.create(this, R.raw.hi);
                break;
            case "fu":
                mediaPlayer = MediaPlayer.create(this, R.raw.fu);
                break;
            case "he":
                mediaPlayer = MediaPlayer.create(this, R.raw.he);
                break;
            case "ho":
                mediaPlayer = MediaPlayer.create(this, R.raw.ho);
                break;
            case "ma":
                mediaPlayer = MediaPlayer.create(this, R.raw.ma);
                break;
            case "mi":
                mediaPlayer = MediaPlayer.create(this, R.raw.mi);
                break;
            case "mu":
                mediaPlayer = MediaPlayer.create(this, R.raw.mu);
                break;
            case "me":
                mediaPlayer = MediaPlayer.create(this, R.raw.me);
                break;
            case "mo":
                mediaPlayer = MediaPlayer.create(this, R.raw.mo);
                break;
            case "ya":
                mediaPlayer = MediaPlayer.create(this, R.raw.ya);
                break;
            case "yu":
                mediaPlayer = MediaPlayer.create(this, R.raw.yu);
                break;
            case "yo":
                mediaPlayer = MediaPlayer.create(this, R.raw.yo);
                break;
            case "ra":
                mediaPlayer = MediaPlayer.create(this, R.raw.ra);
                break;
            case "ri":
                mediaPlayer = MediaPlayer.create(this, R.raw.ri);
                break;
            case "ru":
                mediaPlayer = MediaPlayer.create(this, R.raw.ru);
                break;
            case "re":
                mediaPlayer = MediaPlayer.create(this, R.raw.re);
                break;
            case "ro":
                mediaPlayer = MediaPlayer.create(this, R.raw.ro);
                break;
            case "wa":
                mediaPlayer = MediaPlayer.create(this, R.raw.wa);
                break;
            case "wo":
                mediaPlayer = MediaPlayer.create(this, R.raw.wo);
                break;
            case "n":
                mediaPlayer = MediaPlayer.create(this, R.raw.n);
                break;
            default:
                break;
        }
        mediaPlayer.start();

    }
}