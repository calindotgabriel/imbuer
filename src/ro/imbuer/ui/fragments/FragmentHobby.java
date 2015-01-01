package ro.imbuer.ui.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ro.imbuer.R;
import ro.imbuer.entities.Hobby;
import ro.imbuer.entities.Item;
import ro.imbuer.ui.adapter.ItemRecyclerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Loopiezlol on 19.12.2014.
 */
public class FragmentHobby extends Fragment {


    public FragmentHobby() {
    }

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstancesState){



        View v = inflater.inflate(R.layout.hobby_layout, container,false);
        initRecycleView(v, getMockList(), R.id.recycle_list, R.layout.item);

        return v ;

    }

    public void initRecycleView(View v, List<Item> items, int list, int item) {
        RecyclerView recyclerView = (RecyclerView) v.findViewById(list);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new ItemRecyclerAdapter(items, item));
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setVisibility(View.VISIBLE);
    }

    private ArrayList<Item> getMockList() {
        ArrayList<Item> mockList = new ArrayList<Item>();
        mockList.add(new Hobby(1, "Running"));
        mockList.add(new Hobby(2, "Dancing"));
        mockList.add(new Hobby(3, "Programming"));

        return mockList;
    }
}
