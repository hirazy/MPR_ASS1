package com.example.mpr_ass1.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.mpr_ass1.fragment.HiraTableFragment;
import com.example.mpr_ass1.fragment.KataTableFragment;

import java.util.ArrayList;

public class ViewPagerTableAdapter extends FragmentStateAdapter {

    private ArrayList<Fragment> listFragment = new ArrayList();

    public ViewPagerTableAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new HiraTableFragment();
            case 1:
                return new KataTableFragment();
        }
        return new Fragment();
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
