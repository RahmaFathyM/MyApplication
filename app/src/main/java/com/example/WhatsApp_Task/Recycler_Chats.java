package com.example.WhatsApp_Task;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Recycler_Chats extends RecyclerView.Adapter<Recycler_Chats.chatHolder> {
    ArrayList<String> inf;
    ArrayList<Integer>imageArray;
   SetRecyListener listener;

    public Recycler_Chats(Context c,ArrayList<String> inf ,ArrayList<Integer>imageArray,SetRecyListener listener) {
        this.inf= inf;
        this.imageArray=imageArray;
        this.listener=listener;

    }

    @NonNull
    @Override

    public chatHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_layout,null,false);
        return new chatHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull chatHolder holder, int position) {

holder.name.setText(inf.get(position));
holder.image.setImageResource(imageArray.get(position));
    }

    @Override
    public int getItemCount() {
        return inf.size();
    }

   public class chatHolder extends RecyclerView.ViewHolder{
TextView name ;
ImageView image;

       public chatHolder(@NonNull View itemView) {
           super(itemView);
           name=itemView.findViewById(R.id.chat_text);
        image=itemView.findViewById(R.id.chat_image);
           itemView.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {

               }
           });
       }
   }
}
