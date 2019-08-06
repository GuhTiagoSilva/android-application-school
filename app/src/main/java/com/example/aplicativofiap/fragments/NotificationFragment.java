package com.example.aplicativofiap.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.aplicativofiap.R;
import com.example.aplicativofiap.adapter.MyAdapter;
import com.example.aplicativofiap.model.Notification;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class NotificationFragment extends Fragment {

    private RecyclerView recyclerView;

    private List<Notification> notificationList = new ArrayList<>();

    public NotificationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_avisos, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);

        createNotifications();
        MyAdapter adapter = new MyAdapter(notificationList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(), LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapter);

        return view;

    }


    public void createNotifications() {
        Notification n = new Notification("Workshop NESS - Be Agile", "06/08/2019");
        notificationList.add(n);

        n = new Notification("Horário diário das aulas", "06/08/2019");
        notificationList.add(n);


        n = new Notification("Azure Weekend", "05/08/2019");
        notificationList.add(n);

        n = new Notification("Fórum Saúde Digital", "02/08/2019");
        notificationList.add(n);

        n = new Notification("J.P Morgan - Girls on the Move", "31/07/2019");
        notificationList.add(n);

        n = new Notification("Início das aulas do segundo semestre", "26/07/2019");
        notificationList.add(n);

        n = new Notification("Open Inovation Day", "25/07/2019");
        notificationList.add(n);

        n = new Notification("Oportunidades em Aberto", "24/07/2019");
        notificationList.add(n);

        n = new Notification("Startup Weekend", "23/07/2019");
        notificationList.add(n);

        n = new Notification("Talent Day", "21/07/2019");
        notificationList.add(n);

        n = new Notification("MovieDay", "15/07/2019");
        notificationList.add(n);

        n = new Notification("Startup One", "10/07/2019");
        notificationList.add(n);


    }

}
