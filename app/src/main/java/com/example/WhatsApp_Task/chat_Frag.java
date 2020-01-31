package com.example.WhatsApp_Task;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.WhatsApp_Task.R;

import java.util.ArrayList;


public class chat_Frag extends Fragment {
  // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
   private static final String ARG_name = "name";
   private static final String ARG_id = "image";


    private ArrayList<String> name;
  private ArrayList<Integer> image;

    public chat_Frag() {

    }


    // TODO: Rename and change types and number of parameters
    public static chat_Frag newInstance(ArrayList<String>name,ArrayList<Integer>image) {
        chat_Frag fragment = new chat_Frag();

        Bundle args = new Bundle();
        args.putStringArrayList(ARG_name,name);
       args.putIntegerArrayList(ARG_id,image );
     fragment.setArguments(args);
        return fragment;

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
           name = getArguments().getStringArrayList(ARG_name);

  image = getArguments().getIntegerArrayList(ARG_id);
        }
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_chat_, container, false);
    }
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView rv=view.findViewById(R.id.Recycle);




        Recycler_Chats myadapter =new Recycler_Chats(getContext(), name,image, new SetRecyListener() {
            @Override
            public void RecyonClick(Chats chats) {

            }
        });
        rv.setAdapter(myadapter);
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));



    }


    // TODO: Rename method, update argument and hook method into UI event
   /* public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }
*/
  /*  @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    *//**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     *//*
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }*/
}
