package k.shinxindia;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class WeekAdapter extends RecyclerView.Adapter<WeekAdapter.ViewHolder> {
    List<Week> weeks;
    Context context;

    public WeekAdapter(List<Week> weeks) {
        this.weeks = weeks;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.week_card,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        context = parent.getContext();
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull WeekAdapter.ViewHolder viewHolder, int i) {
        Week w=weeks.get(i);
        viewHolder.week.setText(w.getWeek());
        viewHolder.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"Blah",Toast.LENGTH_SHORT);
            }
        });

    }

    @Override
    public int getItemCount() {
        return weeks.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView week;
        CardView cv;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            week=itemView.findViewById(R.id.week);
            cv=itemView.findViewById(R.id.weekcv);
        }
    }
}

