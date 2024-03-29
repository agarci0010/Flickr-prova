package com.android.bittiger.janescookies.tinyflickr;


import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;


public class GalleryAdapter extends RecyclerView.Adapter<GalleryAdapter.ViewHolder> {
    private Context mContext;

    private List<GalleryItem> mList;

    public GalleryAdapter(Context mContext, List<GalleryItem> mList) {
        this.mContext = mContext;
        this.mList = mList;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImageView;


        public ViewHolder(View itemView) {
            super(itemView);

            mImageView = (ImageView) itemView.findViewById(R.id.gallery_item);

        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_gallery,
                parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final GalleryItem item = mList.get(position);



        holder.mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mContext, PhotoActivity.class);
                intent.putExtra("item", item);
                mContext.startActivity(intent);
            }
        });

        Glide.with(mContext)
                .load(item.getUrl())
                .thumbnail(0.5f)
                .into(holder.mImageView);

    }
    @Override
    public int getItemCount() {
        return mList.size();
    }

    public void addAll(List<GalleryItem> newList) {
        mList.addAll(newList);
    }

    public void add(GalleryItem item) {
        mList.add(item);
    }

    public void clear() {
        mList.clear();
    }

}
