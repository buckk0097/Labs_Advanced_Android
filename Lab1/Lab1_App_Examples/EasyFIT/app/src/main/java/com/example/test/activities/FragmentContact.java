package com.example.test.activities;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.test.R;
import com.example.test.adapters.RecyclerViewAdapter;
import com.example.test.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class FragmentContact extends Fragment {

    View v;
    private RecyclerView myrecyclerview;
    private List<Contact> lstContact;


    public FragmentContact() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
       v = inflater.inflate(R.layout.contact_fragment,container,false);
       myrecyclerview = (RecyclerView) v.findViewById(R.id.contact_recyclerview);
       RecyclerViewAdapter recyclerAdapter = new RecyclerViewAdapter(getContext(), lstContact);
       myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
       myrecyclerview.setAdapter(recyclerAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstContact = new ArrayList<>();
        lstContact.add(new Contact("Clara Clark", "FITNESS", "Hello, My name is Clara and im from Helsinki I have been a professional trainer for 4 years. I'm capable of mentoring various types of programs and diets (vegan, vegetarian ...etc). Im looking forward to working with you", R.drawable.claraclarck));
        lstContact.add(new Contact("Emma Paige", "YOGA", "My name is emma, Im from the USA but i live in Finland. I've always loved YOGA , 2 years ago i earned my Yoga instructoring diploma. Feel free to contact me if you have any questions about the program and the benefits of training your body! ", R.drawable.emmapaige));
        lstContact.add(new Contact("James Gate", "BODYBUILDING","HI! Im James Gate, I've been a Bodybuilding professional trainer for 7 years. I have various programs for different types of stops and goals. Please do contact me if you devide to start trainer because i can help you get in a great shape", R.drawable.jamesgate));
        lstContact.add(new Contact("Jasmine Nekaty", "JUDO", "Hello! My name is Jasmine and i have the black belt in judo 4th level. I've been training judo for 10 years and i coached it for 4 years now. Feel free to contact me so i can tell you more about JUDO amazing benefits and training program", R.drawable.jasminenekaty));
        lstContact.add(new Contact("Leon Fox", "CLIMBING", "Description", R.drawable.leonfox));
        lstContact.add(new Contact("Sara Ramirez", "CYCLING6", "Description", R.drawable.sararamirez));
        lstContact.add(new Contact("Tom White", "SWIMMING", "Description", R.drawable.tomwhite));
        lstContact.add(new Contact("Clara Clark", "FITNESS", "Description", R.drawable.claraclarck));
        lstContact.add(new Contact("Emma Paige", "GYMNASTICS", "Description", R.drawable.emmapaige));
        lstContact.add(new Contact("James Gate", "CURLING", "Description", R.drawable.jamesgate));
        lstContact.add(new Contact("Jasmine Nekaty", "RUNNING","Description",  R.drawable.jasminenekaty));
        lstContact.add(new Contact("Leon Fox", "BODYBUILDING", "Description", R.drawable.leonfox));
        lstContact.add(new Contact("Sara Ramirez", "FITNESS","Description",  R.drawable.sararamirez));
        lstContact.add(new Contact("Tom White", "SWIMMING","Description",  R.drawable.tomwhite));
        lstContact.add(new Contact("Leon Fox", "YOGA","Description",  R.drawable.leonfox));
        lstContact.add(new Contact("Sara Ramirez", "KARATE", "Description", R.drawable.sararamirez));
        lstContact.add(new Contact("Tom White", "BODYBUILDING","Description",  R.drawable.tomwhite));

    }
}
