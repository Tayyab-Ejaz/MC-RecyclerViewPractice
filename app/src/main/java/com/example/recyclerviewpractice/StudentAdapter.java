package com.example.recyclerviewpractice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.ViewHolder>{

    public ArrayList<Student> list;

    public StudentAdapter(ArrayList<Student> list) {
        this.list = list;
    }


//    onCreateViewHolder to inflate the item layout and create the holder
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View StudentView = inflater.inflate(R.layout.recycler_view_item, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(StudentView);
        return viewHolder;
    }


//    onBindViewHolder to set the view attributes based on the data
    @Override
    public void onBindViewHolder(@NonNull StudentAdapter.ViewHolder holder, int position) {
        // Get the data model based on position
        Student student = list.get(position);

        // Set item views based on your views and data model
        TextView NameTextView= holder.NameTextView;
        TextView IDTextView= holder.IDTextView;
        TextView CGPATextView= holder.CGPATextView;

        NameTextView.setText(student.Name);
        IDTextView.setText(Integer.toString(student.ID));
        CGPATextView.setText(Double.toString(student.CGPA));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access
    public class ViewHolder extends RecyclerView.ViewHolder {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row
        public TextView IDTextView;
        public TextView NameTextView;
        public TextView CGPATextView;

        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        public ViewHolder(View itemView) {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            super(itemView);

            IDTextView = (TextView) itemView.findViewById(R.id.IDTextView);
            NameTextView = (TextView) itemView.findViewById(R.id.NameTextView);
            CGPATextView = (TextView) itemView.findViewById(R.id.CGPATextView);
        }
    }
}
