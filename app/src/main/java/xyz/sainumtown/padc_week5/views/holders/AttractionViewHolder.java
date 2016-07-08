package xyz.sainumtown.padc_week5.views.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import xyz.sainumtown.padc_week5.R;
import xyz.sainumtown.padc_week5.datas.vos.AttractionVO;

/**
 * Created by User on 7/8/2016.
 */
public class AttractionViewHolder extends RecyclerView.ViewHolder {

    private TextView tvAttractionTitle;
    private ImageView ivAttractionPhoto;
    private TextView tvAttractionDesc;


    public AttractionViewHolder(View itemView) {
        super(itemView);
        tvAttractionTitle = (TextView) itemView.findViewById(R.id.tv_attraction_title);
        tvAttractionDesc = (TextView) itemView.findViewById(R.id.tv_attraction_desc);
        ivAttractionPhoto = (ImageView) itemView.findViewById(R.id.iv_image);
    }

    public void setData(AttractionVO attraction) {
        tvAttractionTitle.setText(attraction.getTitle());
        tvAttractionDesc.setText(attraction.getDesc());
        Glide.with(ivAttractionPhoto.getContext())
                .load("http://www.aungpyaephyo.xyz/myanmar_attractions/"+attraction.getImages().get(0).toString())
                .centerCrop()
                .placeholder(R.drawable.stock_photo_placeholder)
                .into(ivAttractionPhoto);
    }
}