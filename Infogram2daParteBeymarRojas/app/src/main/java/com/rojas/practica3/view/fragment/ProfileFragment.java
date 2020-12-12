package com.rojas.practica3.view.fragment;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rojas.practica3.R;
import com.rojas.practica3.adapter.CardViewAdapter;
import com.rojas.practica3.model.Image;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ProfileFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProfileFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ProfileFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ProfileFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ProfileFragment newInstance(String param1, String param2) {
        ProfileFragment fragment = new ProfileFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_profile, container, false);
        //toolbar
        showToolBar("", false, view);

        //recyclerview
        RecyclerView recyclerView = view.findViewById(R.id.recyclerview_profile);

        //layaout manager
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        //adapter
        CardViewAdapter cardViewAdapter = new CardViewAdapter(buidImages(), R.layout.cardview_image, getActivity());
        recyclerView.setAdapter(cardViewAdapter);
        return view;
    }
    public void showToolBar(String titulo, boolean botonSubir, View view) {
        Toolbar toolbar = view.findViewById(R.id.toolbar_profile);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);

        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(titulo);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(botonSubir);
    }

    //creamos lista de imagenes
    public ArrayList<Image> buidImages(){
        ArrayList<Image> images = new ArrayList<>();

        images.add(new Image("https://lavozdebolivia.com/wp-content/uploads/2018/09/Jorge-Wilstermann.jpg", "Julio Cesar Miranda", "2 dias", "1 me gusta"));
        images.add(new Image("https://i1.wp.com/www.sopitas.com/wp-content/uploads/2018/11/aficionados-boca-juniors-practica-bombonera-final-copa-libertadores.png", "Karen Quiroz", "3 dias", "5 me gusta"));
        images.add(new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR-RxoYRPuLYPS8NmED5s6zoacPbI3pUfH9Bg&usqp=CAU", "Fabrizio Zambrana", "6 dias", "4 me gusta"));
        images.add(new Image("https://upload.wikimedia.org/wikipedia/commons/f/f3/Bolivia_north.jpg", "Alejandro Zardon", "5 dias", "6 me gusta"));
        images.add(new Image("https://i.pinimg.com/originals/e2/0f/30/e20f30ae41f17f956e9c88542e7ae1f1.jpg", "Daniel Rojas", "3 dias", "2 me gusta"));
        images.add(new Image("https://www.lostiempos.com/sites/default/files/styles/noticia_detalle/public/media_imagen/2018/7/28/pag7foto6elfuerte.jpg?itok=URvCBG1l", "El Pepe", "4 dias", "5 me gusta"));
        images.add(new Image("https://boliviadventure.com/wp-content/uploads/2018/09/bolivia-tours.jpg", "Bon Jovi", "6 dias", "3 me gusta"));
        images.add(new Image("https://boliviadventure.com/wp-content/uploads/2019/01/torotoro.jpg", "Leonel Messi", "9 dias", "1 me gusta"));
        images.add(new Image("https://media-cdn.tripadvisor.com/media/photo-s/0b/48/2c/fb/torres.jpg", "Roberto Carlos", "2 dias", "3 me gusta"));
        images.add(new Image("https://www.incaworldbolivia.com/fotos/11102016111643-Templo-de-Kalasasaya-tiwanaku.jpg", "Shakira", "2 dias", "8 me gusta"));

        return images;
    }
}