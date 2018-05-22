package sg.edu.rp.webservices.c302_photostoreclient_p05;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class CategoryAdapter extends ArrayAdapter<Category> {

    public static final String LOG_TAG = Category.class.getName();

    private ArrayList<Category> alCategory;
    private Context context;

    public CategoryAdapter(Context context, int resource, ArrayList<Category> objects){
        super(context, resource, objects);
        alCategory = objects;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.category_row, parent, false);

        TextView tvName = (TextView) rowView.findViewById(R.id.tvName);
        TextView tvDesc = (TextView) rowView.findViewById(R.id.tvDesc);

        Category currentCategory = alCategory.get(position);

        tvName.setText(currentCategory.getName());
        tvDesc.setText(currentCategory.getDescription());

        return rowView;
    }

}
