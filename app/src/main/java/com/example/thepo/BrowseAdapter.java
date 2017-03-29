package com.example.thepo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by laurahovey on 3/27/17.
 */

public class BrowseAdapter extends RecyclerView.Adapter<BrowseAdapter.BrowseHolder>{

    private List<BrowseItem> browseItem;
    private LayoutInflater inflater;
    int tracker = 0;

    public BrowseAdapter(List<BrowseItem> browseItem, Context c)
    {
        this.inflater = LayoutInflater.from(c);
        this.browseItem = browseItem;
    }


    @Override
    public BrowseHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.browse_item, parent, false);
        return new BrowseHolder(view);
    }

    @Override
    public void onBindViewHolder(BrowseHolder holder, int position) {
        BrowseItem item = browseItem.get(position);
        //if((tracker%2)==0)
        //{
            holder.title.setText(item.getTitle());
            //holder.title2.setText(item.getTitle2());
            holder.icon.setImageResource(item.getImageResID());
            //holder.icon2.setImageResource(item.getImageResID2());
        //}
        //else
        //{
            //holder.title.setText(item.getTitle());
            holder.title2.setText(item.getTitle2());
            //holder.icon.setImageResource(item.getImageResID());
            holder.icon2.setImageResource(item.getImageResID2());
        //}


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
