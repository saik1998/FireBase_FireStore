package com.firstapp.firebase_firestore;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.MyHolder> {
    Context context;
    List<DataModel> dataModelList=new ArrayList<>();

    public DataAdapter(Context context, List<DataModel> dataModelList) {
        this.context = context;
        this.dataModelList = dataModelList;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View root= LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_details,parent,false);
        return new MyHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        holder.name.setText(dataModelList.get(position).getName());
        holder.mail.setText(dataModelList.get(position).getMail());
        holder.mobile.setText(dataModelList.get(position).getMobile());
        holder.gender.setText(dataModelList.get(position).getGender());
        holder.state.setText(dataModelList.get(position).getState());


    }

    @Override
    public int getItemCount() {
        return dataModelList.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        TextView name,mail,mobile,gender,state;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.name1);
            mail=itemView.findViewById(R.id.mail1);
            mobile=itemView.findViewById(R.id.mobile1);
            gender=itemView.findViewById(R.id.gender1);
            state=itemView.findViewById(R.id.state1);

        }
    }
}
