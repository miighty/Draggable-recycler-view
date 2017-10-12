package co.newfinance.draggablerecycle;

import android.support.v4.app.Fragment;
import android.view.DragEvent;
import android.view.View;

/**
 * Created by RicardoMighty on 4/6/16.
 */

public class RecyclerFragment extends Fragment implements View.OnDragListener {
    
    @Override
    public boolean onDrag(View v, DragEvent event) {
        return false;
    }
}
