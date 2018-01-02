package np.com.aacs.kathmanduvistguide.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import np.com.aacs.kathmanduvistguide.RVAdapter;
import np.com.aacs.kathmanduvistguide.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Malls extends Fragment {


    RecyclerView rv;
    LinearLayoutManager llm;
    RVAdapter adapter;


    public Malls() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewRoot=inflater.inflate(R.layout.fragment_malls, container, false);
        rv= (RecyclerView) viewRoot.findViewById(R.id.rv);
        rv.setHasFixedSize(true);

        llm=new LinearLayoutManager(getContext());
        rv.setLayoutManager(llm);


        RVAdapter adapter = new RVAdapter(mallData);
        rv.setAdapter(adapter);







        return viewRoot;


    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initializeData();




    }

    public class MallsData {
        public String name;
        public String desc;
        //public int photoId;

        MallsData(String name, String desc) {
            this.name = name;
            this.desc = desc;
            //this.photoId = photoId;
        }
    }


       private List<MallsData> mallData;

        public void initializeData()
        {
            mallData=new ArrayList<>();
            mallData.add(new MallsData("City Center","Located at Gyaneshwor,Kathmandu"));
            mallData.add(new MallsData("Civil Mall","Located at Sundhara,Kathmandu"));
            mallData.add(new MallsData("KL Tower","Located at Chucchepati,Kathmandu"));
        }




}
