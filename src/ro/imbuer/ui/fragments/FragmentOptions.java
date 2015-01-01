package ro.imbuer.ui.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ro.imbuer.R;

/**
 * Created by Loopiezlol on 19.12.2014.
 */
public class FragmentOptions extends Fragment {
    public FragmentOptions() {
    }

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState){
        return inflater.inflate(R.layout.options_layout,container,false);
    }
}
