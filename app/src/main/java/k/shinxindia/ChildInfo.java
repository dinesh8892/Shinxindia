package k.shinxindia;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ChildInfo extends Fragment {


    public ChildInfo() {
    }
    RecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root= inflater.inflate(R.layout.child_info, container, false);
        recyclerView=root.findViewById(R.id.childrv);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        List<Week> ws=new ArrayList<>();
        for(int i=1;i<=10;i++)
        {

            Week w=new Week("Week "+i+"");
            ws.add(w);
        }
        recyclerView.setAdapter(new WeekAdapter(ws));
        return root;
    }

}
