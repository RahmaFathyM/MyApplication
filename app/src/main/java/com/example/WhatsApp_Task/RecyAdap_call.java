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

public class RecyAdap_call extends RecyclerView.Adapter<RecyAdap_call.CallHolder> {
ArrayList<String> text_call;

    ArrayList<Integer> Image_call;

    public RecyAdap_call(Context c,ArrayList<String> text_call, ArrayList<Integer> image_call) {
        this.text_call = text_call;
        Image_call = image_call;
    }

    @NonNull
    @Override
    public CallHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.call_layout,null,false);

        return new CallHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CallHolder holder, int position) {
holder.image.setImageResource(Image_call.get(position));
holder.tv.setText(text_call.get(position));
    }

    @Override
    public int getItemCount() {
        return text_call.size();
    }

    class CallHolder extends RecyclerView.ViewHolder{
TextView tv;
ImageView image;
ImageView call;

        public CallHolder(@NonNull View itemView) {
            super(itemView);
            tv=itemView.findViewById(R.id.name_call);
            image=itemView.findViewById(R.id.call_image);
            call=itemView.findViewById(R.id.call);


        }
    }
}
