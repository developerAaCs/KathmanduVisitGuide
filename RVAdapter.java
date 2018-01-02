package np.com.aacs.kathmanduvistguide;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import np.com.aacs.kathmanduvistguide.fragment.Malls;

/**
 * Created by User on 12/18/2016.
 */
public class RVAdapter extends RecyclerView.Adapter<RVAdapter.ViewHolder> {


    List<Malls.MallsData> mallData;

   public RVAdapter(List<Malls.MallsData> mallData) {
        this.mallData=mallData;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_malls,parent,false);
        ViewHolder pvh=new ViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.title1.setText(mallData.get(position).name);
        holder.des1.setText(mallData.get(position).desc);
        //holder.image_mall1.setImageResource(mallData.get(position).photoId);

    }

    @Override
    public int getItemCount() {
        return mallData.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView){
        super.onAttachedToRecyclerView(recyclerView);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        CardView cardView1;
        TextView title1;
        TextView des1;
        ImageView image_mall1;

        ViewHolder(View itemView)
        {
            super(itemView);
            cardView1= (CardView) itemView.findViewById(R.id.cardView1);
            title1=(TextView) itemView.findViewById(R.id.title1);
            des1=(TextView) itemView.findViewById(R.id.des1);
            image_mall1= (ImageView) itemView.findViewById(R.id.image_mall1);

        }




    }



}
