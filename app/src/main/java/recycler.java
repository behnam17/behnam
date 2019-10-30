import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.behnamphone.R;

import java.util.ArrayList;


public class recycler extends RecyclerView.Adapter<recycler.recyclerviewholder> {
    ArrayList <String> mylist;
    public recycler (ArrayList list){
        mylist = list;

    }

    @NonNull
    @Override
    public recyclerviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View v =  LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main,parent,false);

        recyclerviewholder holder = new recyclerviewholder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull recyclerviewholder holder, int position) {
        holder.btnprofile.setText(mylist.get(position));




    }

    @Override
    public int getItemCount() {
        return 2;
    }

    class recyclerviewholder extends RecyclerView.ViewHolder{
        Button btnprofile;
        Button btndail;


        public recyclerviewholder(@NonNull View itemView) {
            super(itemView);
            btnprofile = itemView.findViewById(R.id.pro);
             btndail = itemView.findViewById(R.id.dial);
        }
    }

}
