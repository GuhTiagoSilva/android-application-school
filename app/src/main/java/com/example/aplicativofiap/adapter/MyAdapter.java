package com.example.aplicativofiap.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aplicativofiap.R;
import com.example.aplicativofiap.model.Notification;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private List<Notification>notificationList;

    public MyAdapter(List<Notification>notificationList){
        this.notificationList = notificationList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemList = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_lista_avisos, parent, false);
        return new MyViewHolder(itemList);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Notification notification = notificationList.get(position);
        holder.notification.setText(notification.getNotification());
        holder.notificationDate.setText(notification.getNotificationDate());
    }

    @Override
    public int getItemCount() {
        return notificationList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView notification;
        TextView notificationDate;


        public MyViewHolder(@NonNull View view){
            super(view);

            notification = view.findViewById(R.id.textDate);
            notificationDate = view.findViewById(R.id.textNotificationDate);

        }
    }


}
