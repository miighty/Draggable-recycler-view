package co.newfinance.draggablerecycle;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import co.newfinance.draggablerecycle.helpers.ItemTouchHelperAdapter;
import co.newfinance.draggablerecycle.helpers.ItemTouchHelperViewHolder;

/**
 * Created by RicardoMighty on 4/6/16.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ItemViewHolder> implements ItemTouchHelperAdapter {
    
    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main, parent, false);
        ItemViewHolder itemViewHolder = new ItemViewHolder(view);
        return itemViewHolder;
    }
    
    @Override
    public void onBindViewHolder(RecyclerAdapter.ItemViewHolder holder, int position) {
        
    }
    
    @Override
    public int getItemCount() {
        return 0;
    }
    
    @Override
    public boolean onItemMove(int fromPosition, int toPosition) {
        return false;
    }
    
    @Override
    public void onItemDismiss(int position) {
        
    }
    
    public static class ItemViewHolder extends RecyclerView.ViewHolder implements
    ItemTouchHelperViewHolder {
        
        public final TextView textView;
        public final ImageView handleView;
        
        public ItemViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.text);
            handleView = (ImageView) itemView.findViewById(R.id.handle);
        }
        
        @Override
        public void onItemSelected() {
            itemView.setBackgroundColor(Color.LTGRAY);
        }
        
        @Override
        public void onItemClear() {
            itemView.setBackgroundColor(0);
        }
    }
}
