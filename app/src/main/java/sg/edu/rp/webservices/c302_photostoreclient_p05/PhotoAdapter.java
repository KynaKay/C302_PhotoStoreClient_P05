package sg.edu.rp.webservices.c302_photostoreclient_p05;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class PhotoAdapter extends ArrayAdapter<Photo> {

    public static final String LOG_TAG = Category.class.getName();

    private ArrayList<Photo> alPhoto;
    private Context context;

    public PhotoAdapter(Context context, int resource, ArrayList<Photo> objects){
        super(context, resource, objects);
        alPhoto = objects;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.photo_row, parent, false);

        TextView tvName = (TextView) rowView.findViewById(R.id.tvName);
        TextView tvDesc = (TextView) rowView.findViewById(R.id.tvDesc);

        Photo currentPhoto = alPhoto.get(position);

        tvName.setText(currentPhoto.getTitle());
        tvDesc.setText(currentPhoto.getDescription());

        return rowView;
    }
}
