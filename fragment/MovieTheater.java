package np.com.aacs.kathmanduvistguide.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import np.com.aacs.kathmanduvistguide.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MovieTheater extends Fragment {


    public MovieTheater() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movie_theater, container, false);
    }

}
