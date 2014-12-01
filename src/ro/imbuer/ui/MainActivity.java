package ro.imbuer.ui;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;
import ro.imbuer.R;
import ro.imbuer.entities.Hobby;
import ro.imbuer.entities.Item;
import ro.imbuer.ui.adapter.ItemRecyclerAdapter;
import ro.imbuer.ui.drawer.NavigationDrawerCallbacks;
import ro.imbuer.ui.drawer.NavigationDrawerFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends ActionBarActivity implements NavigationDrawerCallbacks {
    /**
     * Called when the activity is first created.
     */


    private Toolbar mToolbar;
    private NavigationDrawerFragment mNavigationDrawerFragment;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);


        initRecycleView(getMockList(), R.id.recycle_list, R.layout.item);


        initDrawer();


    }

    private void initDrawer() {
        mToolbar = (Toolbar) findViewById(R.id.toolbar_actionbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        mNavigationDrawerFragment = (NavigationDrawerFragment) getFragmentManager().findFragmentById(R.id.fragment_drawer);
        mNavigationDrawerFragment.setup(R.id.fragment_drawer, (DrawerLayout) findViewById(R.id.drawer), mToolbar);
    }

    private ArrayList<Item> getMockList() {
        ArrayList<Item> mockList = new ArrayList<Item>();
        mockList.add(new Hobby(1, "Running"));
        mockList.add(new Hobby(2, "Dancing"));
        mockList.add(new Hobby(3, "Programming"));

        return mockList;
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
        recyclerView.setAdapter(new ItemRecyclerAdapter(items, item));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setVisibility(View.VISIBLE);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onNavigationDrawerItemSelected(int position) {
        Toast.makeText(this, "Menu item selected -> " + position, Toast.LENGTH_SHORT).show();



    }

    @Override
    public void onBackPressed() {
        if (mNavigationDrawerFragment.isDrawerOpen())
            mNavigationDrawerFragment.closeDrawer();
        else
            super.onBackPressed();
    }
}
