package com.example.mpr_ass1.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mpr_ass1.R;
import com.example.mpr_ass1.data.model.ItemCharacter;

import java.util.ArrayList;

public class CharacterAdapter extends RecyclerView.Adapter<CharacterAdapter.MyViewHolder> {

    OnClick onClick;
    private ArrayList<ItemCharacter> list;
    private Animation mBounceAnimation;
    private boolean isHira;

    public CharacterAdapter(ArrayList<ItemCharacter> val, boolean isHira, Context context, OnClick onClick){
        list = new ArrayList<>(val);
        this.isHira = isHira;
        mBounceAnimation = AnimationUtils.loadAnimation(context, R.anim.anim_bounce);
        this.onClick = onClick;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_character, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, @SuppressLint("RecyclerView") int position) {

        if(isHira){
            switch (list.get(position).c){
                case "a":
                    holder.img.setImageResource(R.mipmap.a);
                    break;
                case "i":
                    holder.img.setImageResource(R.mipmap.i);
                    break;
                case "u":
                    holder.img.setImageResource(R.mipmap.u);
                    break;
                case "e":
                    holder.img.setImageResource(R.mipmap.e);
                    break;
                case "o":
                    holder.img.setImageResource(R.mipmap.o);
                    break;
                case "ka":
                    holder.img.setImageResource(R.mipmap.ka);
                    break;
                case "ki":
                    holder.img.setImageResource(R.mipmap.ki);
                    break;
                case "ku":
                    holder.img.setImageResource(R.mipmap.ku);
                    break;
                case "ke":
                    holder.img.setImageResource(R.mipmap.ke);
                    break;
                case "ko":
                    holder.img.setImageResource(R.mipmap.ko);
                    break;
                case "sa":
                    holder.img.setImageResource(R.mipmap.sa);
                    break;
                case "shi":
                    holder.img.setImageResource(R.mipmap.shi);
                    break;
                case "su":
                    holder.img.setImageResource(R.mipmap.su);
                    break;
                case "se":
                    holder.img.setImageResource(R.mipmap.se);
                    break;
                case "so":
                    holder.img.setImageResource(R.mipmap.so);
                    break;
                case "ta":
                    holder.img.setImageResource(R.mipmap.ta);
                    break;
                case "chi":
                    holder.img.setImageResource(R.mipmap.chi);
                    break;
                case "tsu":
                    holder.img.setImageResource(R.mipmap.tsu);
                    break;
                case "te":
                    holder.img.setImageResource(R.mipmap.te);
                    break;
                case "to":
                    holder.img.setImageResource(R.mipmap.to);
                    break;
                case "na":
                    holder.img.setImageResource(R.mipmap.na);
                    break;
                case "ni":
                    holder.img.setImageResource(R.mipmap.ni);
                    break;
                case "nu":
                    holder.img.setImageResource(R.mipmap.nu);
                    break;
                case "ne":
                    holder.img.setImageResource(R.mipmap.ne);
                    break;
                case "no":
                    holder.img.setImageResource(R.mipmap.no);
                    break;
                case "ha":
                    holder.img.setImageResource(R.mipmap.ha);
                    break;
                case "hi":
                    holder.img.setImageResource(R.mipmap.hi);
                    break;
                case "fu":
                    holder.img.setImageResource(R.mipmap.fu);
                    break;
                case "he":
                    holder.img.setImageResource(R.mipmap.he);
                    break;
                case "ho":
                    holder.img.setImageResource(R.mipmap.ho);
                    break;
                case "ma":
                    holder.img.setImageResource(R.mipmap.ma);
                    break;
                case "mi":
                    holder.img.setImageResource(R.mipmap.mi);
                    break;
                case "mu":
                    holder.img.setImageResource(R.mipmap.mu);
                    break;
                case "me":
                    holder.img.setImageResource(R.mipmap.me);
                    break;
                case "mo":
                    holder.img.setImageResource(R.mipmap.mo);
                    break;
                case "ya":
                    holder.img.setImageResource(R.mipmap.ya);
                    break;
                case "yu":
                    holder.img.setImageResource(R.mipmap.yu);
                    break;
                case "yo":
                    holder.img.setImageResource(R.mipmap.yo);
                    break;
                case "ra":
                    holder.img.setImageResource(R.mipmap.ra);
                    break;
                case "ri":
                    holder.img.setImageResource(R.mipmap.ri);
                    break;
                case "ru":
                    holder.img.setImageResource(R.mipmap.ru);
                    break;
                case "re":
                    holder.img.setImageResource(R.mipmap.re);
                    break;
                case "ro":
                    holder.img.setImageResource(R.mipmap.ro);
                    break;
                case "wa":
                    holder.img.setImageResource(R.mipmap.wa);
                    break;
                case "wo":
                    holder.img.setImageResource(R.mipmap.wo);
                    break;
                case "n":
                    holder.img.setImageResource(R.mipmap.n);
                    break;
                case "":
                    holder.img.setImageResource(R.mipmap.hihihih);
                    break;
            }
        }
        else{
            switch (list.get(position).c){
                case "a":
                    holder.img.setImageResource(R.mipmap.a1);
                    break;
                case "i":
                    holder.img.setImageResource(R.mipmap.i1);
                    break;
                case "u":
                    holder.img.setImageResource(R.mipmap.u1);
                    break;
                case "e":
                    holder.img.setImageResource(R.mipmap.e1);
                    break;
                case "o":
                    holder.img.setImageResource(R.mipmap.o1);
                    break;
                case "ka":
                    holder.img.setImageResource(R.mipmap.ka1);
                    break;
                case "ki":
                    holder.img.setImageResource(R.mipmap.ki1);
                    break;
                case "ku":
                    holder.img.setImageResource(R.mipmap.ku1);
                    break;
                case "ke":
                    holder.img.setImageResource(R.mipmap.ke1);
                    break;
                case "ko":
                    holder.img.setImageResource(R.mipmap.ko1);
                    break;
                case "sa":
                    holder.img.setImageResource(R.mipmap.sa1);
                    break;
                case "shi":
                    holder.img.setImageResource(R.mipmap.shi1);
                    break;
                case "su":
                    holder.img.setImageResource(R.mipmap.su1);
                    break;
                case "se":
                    holder.img.setImageResource(R.mipmap.se1);
                    break;
                case "so":
                    holder.img.setImageResource(R.mipmap.so1);
                    break;
                case "ta":
                    holder.img.setImageResource(R.mipmap.ta1);
                    break;
                case "chi":
                    holder.img.setImageResource(R.mipmap.chi1);
                    break;
                case "tsu":
                    holder.img.setImageResource(R.mipmap.tsu1);
                    break;
                case "te":
                    holder.img.setImageResource(R.mipmap.te1);
                    break;
                case "to":
                    holder.img.setImageResource(R.mipmap.to1);
                    break;
                case "na":
                    holder.img.setImageResource(R.mipmap.na1);
                    break;
                case "ni":
                    holder.img.setImageResource(R.mipmap.ni1);
                    break;
                case "nu":
                    holder.img.setImageResource(R.mipmap.nu1);
                    break;
                case "ne":
                    holder.img.setImageResource(R.mipmap.ne1);
                    break;
                case "no":
                    holder.img.setImageResource(R.mipmap.no1);
                    break;
                case "ha":
                    holder.img.setImageResource(R.mipmap.ha1);
                    break;
                case "hi":
                    holder.img.setImageResource(R.mipmap.hi1);
                    break;
                case "fu":
                    holder.img.setImageResource(R.mipmap.fu1);
                    break;
                case "he":
                    holder.img.setImageResource(R.mipmap.he1);
                    break;
                case "ho":
                    holder.img.setImageResource(R.mipmap.ho1);
                    break;
                case "ma":
                    holder.img.setImageResource(R.mipmap.ma1);
                    break;
                case "mi":
                    holder.img.setImageResource(R.mipmap.mi1);
                    break;
                case "mu":
                    holder.img.setImageResource(R.mipmap.mu1);
                    break;
                case "me":
                    holder.img.setImageResource(R.mipmap.me1);
                    break;
                case "mo":
                    holder.img.setImageResource(R.mipmap.mo1);
                    break;
                case "ya":
                    holder.img.setImageResource(R.mipmap.ya1);
                    break;
                case "yu":
                    holder.img.setImageResource(R.mipmap.yu1);
                    break;
                case "yo":
                    holder.img.setImageResource(R.mipmap.yo1);
                    break;
                case "ra":
                    holder.img.setImageResource(R.mipmap.ra1);
                    break;
                case "ri":
                    holder.img.setImageResource(R.mipmap.ri1);
                    break;
                case "ru":
                    holder.img.setImageResource(R.mipmap.ru1);
                    break;
                case "re":
                    holder.img.setImageResource(R.mipmap.re1);
                    break;
                case "ro":
                    holder.img.setImageResource(R.mipmap.ro1);
                    break;
                case "wa":
                    holder.img.setImageResource(R.mipmap.wa1);
                    break;
                case "wo":
                    holder.img.setImageResource(R.mipmap.wo1);
                    break;
                case "n":
                    holder.img.setImageResource(R.mipmap.n1);
                    break;
                case "":
                    holder.img.setImageResource(R.mipmap.hihihih);
                    break;
            }
        }

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.e("Click Item ", list.get(position).c);
                if(!list.get(position).c.equals("")){
                    holder.itemView.startAnimation(mBounceAnimation);
                    onClick.clickItem(list.get(position).c);
                }
            }
        });
    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView img;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.imgCharacter);
        }
    }

    public interface OnClick{
        void clickItem(String c);
    }

}
