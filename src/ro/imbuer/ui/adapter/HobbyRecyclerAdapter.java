/*
package ro.imbuer.ui.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.amulyakhare.textdrawable.TextDrawable;
import com.amulyakhare.textdrawable.util.ColorGenerator;
import ro.imbuer.R;
import ro.imbuer.entities.Item;
import ro.imbuer.utils.Util;

import java.util.List;

*/
/**
 * @author motan
 * @date 11/25/14
 *//*

public class HobbyRecyclerAdapter extends RecyclerView.Adapter<HobbyRecyclerAdapter.ViewHolder> {

    private List<Item> items;
    private int itemLayout;

    public HobbyRecyclerAdapter(List<Item> items, int itemLayout) {
        this.items = items;
        this.itemLayout = itemLayout;
    }

    @Override public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(itemLayout, parent, false);
        return new ViewHolder(v);
    }

    @Override public void onBindViewHolder(ViewHolder holder, int position) {
        Item item = items.get(position);
        holder.text.setText(item.getTitle());

        TextDrawable drawable = TextDrawable.builder().
                buildRoundRect(Util.getFirstLetter(item.getTitle()),
                            ColorGenerator.DEFAULT.getRandomColor(),
                                                                30); // radius
        holder.image.setImageDrawable(drawable);
        holder.itemView.setTag(item);
    }


    @Override public int getItemCount() {
        return items.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView image;
        public TextView text;

        public ViewHolder(View itemView) {
            super(itemView);
            image = (ImageView) itemView.findViewById(R.id.image_view);
            text = (TextView) itemView.findViewById(R.id.text);
        }
    }
}

*/
