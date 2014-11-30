package ro.imbuer.ui;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import ro.imbuer.R;
import ro.imbuer.entities.Hobby;
import ro.imbuer.entities.Item;
import ro.imbuer.ui.adapter.HobbyRecyclerAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends ActionBarActivity {
    /**
     * Called when the activity is first created.
     */

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        ArrayList<Item> mockList = new ArrayList<Item>();
        mockList.add(new Hobby(1, "Running"));
        mockList.add(new Hobby(2, "Dancing"));
        mockList.add(new Hobby(3, "Programming"));

        initRecycleView(mockList, R.id.list, R.layout.item);

       Toolbar mToolbar ;
       mToolbar = (Toolbar) findViewById(R.id.my_awesome_toolbar);
      // setSupportActionBar(mToolbar);


    }

    /**
     * Initiates the main view.
     * @param items - List<Item> - items to be displayed
     * @param list - int - id of list to be inflated ( ex: R.id.list )
     * @param item - int - layout of item to be inflated ( ex: R.layout.item )
     */
    public void initRecycleView(List<Item> items, int list, int item) {
        RecyclerView recyclerView = (RecyclerView) findViewById(list);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new HobbyRecyclerAdapter(items, item));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }

}
