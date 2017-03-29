package com.example.thepo;

import android.content.Context;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by laurahovey on 3/26/17.
 */

public class artistAdapter extends RecyclerView.Adapter<artistAdapter.artistHolder>
{
    private List<ListItem> listData;
    private LayoutInflater inflater;

    public artistAdapter(List<ListItem> listData, Context c)
    {
        this.inflater = LayoutInflater.from(c);
        this.listData = listData;
    }

    @Override
    public artistHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new artistHolder(view);
    }

    @Override
    public void onBindViewHolder(artistHolder holder, int position) {
        ListItem item = listData.get(position);
        holder.title.setText(item.getTitle());
        holder.icon.setImageResource(item.getItemNum());
    }

    @Override
    public int getItemCount() {

        return listData.size();
    }

    class artistHolder extends RecyclerView.ViewHolder{

        private TextView title;
        private ImageView icon;
        private View container;

        public artistHolder(View itemView) {
            super(itemView);
            title = (TextView)itemView.findViewById(R.id.itemText);
            icon = (ImageView) itemView.findViewById(R.id.itemImage);
            container = itemView.findViewById(R.id.itemOfList);
        }
    }
}
