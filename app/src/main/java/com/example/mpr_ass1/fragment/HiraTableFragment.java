package com.example.mpr_ass1.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mpr_ass1.MainActivity;
import com.example.mpr_ass1.R;
import com.example.mpr_ass1.adapter.CharacterAdapter;
import com.example.mpr_ass1.data.DataTable;
import com.example.mpr_ass1.data.model.ItemCharacter;

import java.util.ArrayList;

public class HiraTableFragment extends Fragment implements CharacterAdapter.OnClick {

    View view;
    RecyclerView rclTable;
    CharacterAdapter characterAdapter;
    ArrayList<ItemCharacter> list;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_table_hira, container, false);

        rclTable = view.findViewById(R.id.rlvTableHira);

        list = DataTable.listAlphabetTable();

        characterAdapter = new CharacterAdapter(list, true, getContext(), this);
        rclTable.setAdapter(characterAdapter);
        rclTable.setLayoutManager(new GridLayoutManager(getActivity(), 5));

        return view;
    }


    @Override
    public void clickItem(String c) {
        ((MainActivity) getActivity()).playSound(c);
    }
}
