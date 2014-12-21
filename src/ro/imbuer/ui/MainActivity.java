package ro.imbuer.ui;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.Toast;
import ro.imbuer.R;
import ro.imbuer.ui.drawer.NavigationDrawerCallbacks;
import ro.imbuer.ui.drawer.NavigationDrawerFragment;
import ro.imbuer.ui.fragments.FragmentClass;
import ro.imbuer.ui.fragments.FragmentHobby;
import ro.imbuer.ui.fragments.FragmentOptions;

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
        initDrawer();


    }

    private void initDrawer() {
        mToolbar = (Toolbar) findViewById(R.id.toolbar_actionbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        mNavigationDrawerFragment = (NavigationDrawerFragment) getFragmentManager().findFragmentById(R.id.fragment_drawer);
        mNavigationDrawerFragment.setup(R.id.fragment_drawer, (DrawerLayout) findViewById(R.id.drawer), mToolbar);
    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onNavigationDrawerItemSelected(int position) {
        Toast.makeText(this, "Menu item selected -> " + position, Toast.LENGTH_SHORT).show();

        Fragment toReplaceFragment = null;

        switch (position){
            case 0:
                toReplaceFragment = new FragmentHobby();
                break;
            case 1:
                toReplaceFragment = new FragmentClass();
                break;
            case 2:
                toReplaceFragment = new FragmentOptions();
                break;
        }

        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.listFragment, toReplaceFragment);
        transaction.addToBackStack(null);
        transaction.commit();

    }

    @Override
    public void onBackPressed() {
        if (mNavigationDrawerFragment.isDrawerOpen())
            mNavigationDrawerFragment.closeDrawer();
        else
            super.onBackPressed();
    }
}
