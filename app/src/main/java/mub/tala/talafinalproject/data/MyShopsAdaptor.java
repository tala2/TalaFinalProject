package mub.tala.talafinalproject.data;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import mub.tala.talafinalproject.R;

public class MyShopsAdaptor extends ArrayAdapter<Shop> {
    /**
     *constractor
     * @param context the activity of (app) that this adapter belong to
     * @param resource XML  design of the item
     */
    //fix error
    public MyShopsAdaptor(@NonNull Context context, int resource) {
        super(context, resource);
        /**
         * bulding single item view
         * @param position index item in list view
         * @param convertView item view
         * @param parent listview
         * @return
         */
        //3. overriding getview
        
    }
}
