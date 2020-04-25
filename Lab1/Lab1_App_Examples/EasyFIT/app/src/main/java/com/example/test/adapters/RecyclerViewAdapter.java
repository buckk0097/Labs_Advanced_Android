package com.example.test.adapters;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


import androidx.recyclerview.widget.RecyclerView;

import com.example.test.model.Contact;
import com.example.test.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context mContext;
    List<Contact> mData;
    Dialog myDialog;

    public RecyclerViewAdapter(Context mContext, List<Contact> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public MyViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {

        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_contact,parent,false);
        final MyViewHolder vHolder = new MyViewHolder(v);


        // dialog ini

        myDialog = new Dialog(mContext);
        myDialog.setContentView(R.layout.dialog_contact);
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));


        vHolder.item_contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView dialog_name_tv = (TextView) myDialog.findViewById(R.id.dialog_name_id);
                TextView dialog_phone_tv = (TextView) myDialog.findViewById(R.id.dialog_phone_id);
                TextView dialog_description_tv = (TextView) myDialog.findViewById(R.id.dialog_description_id);
                ImageView dialog_contact_img = (ImageView) myDialog.findViewById(R.id.dialog_img);
                dialog_name_tv.setText(mData.get(vHolder.getAdapterPosition()).getName());
                dialog_phone_tv.setText(mData.get(vHolder.getAdapterPosition()).getPhone());
                dialog_description_tv.setText(mData.get(vHolder.getAdapterPosition()).getDescription());
                dialog_contact_img.setImageResource(mData.get(vHolder.getAdapterPosition()).getPhoto());
                Toast.makeText(mContext, "You chose Coach "+mData.get(vHolder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
               // Toast.makeText(mContext, "You have chosen the Coach Number"+String.valueOf(vHolder.getAdapterPosition()+1), Toast.LENGTH_SHORT).show();
                myDialog.show();

            }
        });
        return vHolder;
    }

    @Override
    public void onBindViewHolder( MyViewHolder holder, int position) {

        holder.tv_name.setText(mData.get(position).getName());
        holder.tv_phone.setText(mData.get(position).getPhone());
        holder.tv_description.setText(mData.get(position).getDescription());
        holder.img.setImageResource(mData.get(position).getPhoto());


    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private LinearLayout item_contact;
        private TextView tv_name;
        private TextView tv_phone;
        private TextView tv_description;
        private ImageView img;


      public MyViewHolder( View itemView) {
          super(itemView);

          item_contact = (LinearLayout) itemView.findViewById(R.id.item_contact_id);
          tv_name = (TextView) itemView.findViewById(R.id.name_contact);
          tv_phone = (TextView) itemView.findViewById(R.id.phone_contact);
          tv_description = (TextView) itemView.findViewById(R.id.description_contact);
          img = (ImageView) itemView.findViewById(R.id.img_contact);

      }
  }
}
