package com.example.iboto;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class NewsAdapter extends BaseAdapter {
    private ArrayList<NewsModel> nModel;
    private Context context;

    public NewsAdapter( Context context,ArrayList<NewsModel> nModel) {
        this.nModel = nModel;
        this.context = context;
    }

    @Override
    public int getCount() {
        return nModel.size();
    }

    @Override
    public Object getItem(int i) {
        return nModel.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null){
            view = View.inflate(context, R.layout.news_card_view, null);
        }

        ImageView images = (ImageView) view.findViewById(R.id.newsImg);
        TextView title = (TextView)view.findViewById(R.id.newsTitle);
        TextView description = (TextView)view.findViewById(R.id.newsDescription);

        NewsModel newsModel = nModel.get(i);

        images.setImageResource(newsModel.getImg());
        title.setText(newsModel.getTitle());
        description.setText(newsModel.getDescription());

        return view;
    }
}
