//package com.EBussines.dailybotani.ui.home;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.EBussines.dailybotani.R;
//
//import java.util.List;
//
//
//public class HomeViewModelAdapter extends RecyclerView.Adapter<HomeViewModelAdapter.MyViewHolder> {
//
//    List<HomeViewModel> homeViewModelList;
//
//    public HomeViewModelAdapter(List<HomeViewModel> homeViewModelList){
//        this.homeViewModelList = homeViewModelList;
//    }
//
//    @NonNull
//    @Override
//    public HomeViewModelAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//
//        // object context diambil dari parent
//        Context context = parent.getContext();
//
//        // object context digunakan untuk membuat object layout Inflater
//        LayoutInflater layoutInflater = LayoutInflater.from(context);
//
//        // object layoutInflater digunakan untuk membuat object view yang merupakan hasil inflate layout (menghubungkan adapter dengan layout)
//        View HomeViewModelView = layoutInflater.inflate(R.layout.item_list,parent, false);
//
//        MyViewHolder viewHolder = new MyViewHolder(HomeViewModelView);
//
//        return viewHolder;
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull HomeViewModelAdapter.MyViewHolder holder, int position) {
//
//        HomeViewModel homeViewModel = homeViewModelList.get(position);
//
//        holder.gambarID.setText(homeViewModel.getGambarID());
//        holder.gambar.setImageResource(homeViewModel.getImageUrl());
//    }
//
//    @Override
//    public int getItemCount() {
//        return (homeViewModelList != null) ? homeViewModelList.size() : 0;
//    }
//
//    public class MyViewHolder extends RecyclerView.ViewHolder{
//
//        public TextView gambarID;
//        public ImageView gambar;
//
//        public MyViewHolder(@NonNull View itemView) {
//            super(itemView);
//
//            gambarID = itemView.findViewById(R.id.gambarID);
//            gambar = itemView.findViewById(R.id.gambar);
//        }
//    }
//}
