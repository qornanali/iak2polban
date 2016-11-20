package qornan.helloworld;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.Random;

/**
 * Created by qornanali on 11/20/16.
 */

public class ListAdapter extends ArrayAdapter<String> {

    public ListAdapter(Context context, int resource, List<String> items) {
        super(context, resource, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.list_item_nama, null);
        }

        String nama = getItem(position);

        TextView textnama;
        textnama = (TextView) v.findViewById(R.id.textnama);

        textnama.setText(nama);

        Random rnd = new Random();
        int color = Color.argb(255, rnd.nextInt(256),
                rnd.nextInt(256), rnd.nextInt(256));
        textnama.setTextColor(color);

        return v;
    }

}
