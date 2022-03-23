package com.example.iboto;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomListAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Model> models;
    private String nav;

    public CustomListAdapter(Context context, ArrayList<Model> models, String nav) {
        this.context = context;
        this.models = models;
        this.nav = nav;
    }


    @Override
    public int getCount() {
        return models.size();
    }

    @Override
    public Object getItem(int i) {
        return models.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if(view == null){
            view = View.inflate(context, R.layout.activity_candidate_card_view, null);
        }
        ImageView images = (ImageView) view.findViewById(R.id.cardImage);
        TextView title = (TextView)view.findViewById(R.id.cardTitle);
        TextView view_info = (TextView)view.findViewById(R.id.viewInfo);
        Model model = models.get(i);

        images.setImageResource(model.getCandidateImage());
        title.setText(model.getName());

        if(nav.equals("senate")){
            view_info.setText(model.getPartylist());
        }




        return view;
    }
}
