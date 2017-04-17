package com.example.thepo;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;


public class BrowseAdapter extends RecyclerView.Adapter<BrowseAdapter.BrowseHolder>{

    private List<BrowseItem> browseItem;
    private LayoutInflater inflater;
    int tracker = 0;

//    Snackbar.make(findViewById(R.id.browseitem), "You're currently on the radio page!",
//    Snackbar.LENGTH_SHORT).show();



    public BrowseAdapter(List<BrowseItem> browseItem, Context c)
    {
        this.inflater = LayoutInflater.from(c);
        this.browseItem = browseItem;
    }


    @Override
    public BrowseHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.browse_item, parent, false);
//        view.setOnClickListener(
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        Snackbar.make(v.findViewById(R.id.browseitem), "clicked" + getAdapterPosition(), Snackbar.LENGTH_SHORT).show();
//                    }
//                }
//        );
        return new BrowseHolder(view);
    }


    @Override
    public void onBindViewHolder(BrowseHolder holder, final int position) {
        BrowseItem item = browseItem.get(position);

//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Snackbar.make(v.findViewById(R.id.browseitem), "clicked" + position, Snackbar.LENGTH_SHORT).show();
//            }
//        });

        holder.title.setText(item.getTitle());
        holder.icon.setImageResource(item.getImageResID());

        holder.title2.setText(item.getTitle2());
        holder.icon2.setImageResource(item.getImageResID2());

    }

    @Override
    public int getItemCount() {

        return browseItem.size();
    }

    class BrowseHolder extends RecyclerView.ViewHolder{

        private TextView title;
        private TextView title2;
        private ImageView icon;
        private ImageView icon2;
        private View container;

        public BrowseHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.browsetext);
            title2 = (TextView) itemView.findViewById(R.id.browsetext2);
            icon = (ImageView) itemView.findViewById(R.id.browseimage1);
            icon2 = (ImageView) itemView.findViewById(R.id.browseimage2);
            container = itemView.findViewById(R.id.browseitem);
            //tracker++;
        }
    }
}
