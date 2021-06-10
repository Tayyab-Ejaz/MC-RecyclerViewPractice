package com.example.recyclerviewpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Student> studentList;
    RecyclerView RecyclerViewStudent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Lookup the recyclerview in activity layout
        RecyclerViewStudent = findViewById(R.id.MyRecyclerView);

        // Initialize contacts
        studentList = new ArrayList<Student>();
        studentList.add(new Student(1,"Tayyab Ejaz", 3.6));
        studentList.add(new Student(2,"Umair Ali", 3.2));
        studentList.add(new Student(3,"Khubaib Ejaz", 3.3));
        studentList.add(new Student(4,"Waqar Tayyab", 3.21));
        studentList.add(new Student(5,"Muhammad Ali", 3.12));
        studentList.add(new Student(6,"Tayyab Ejaz", 3.23));
        studentList.add(new Student(7,"Umair Ali", 3.234));
        studentList.add(new Student(8,"Khubaib Ejaz", 2.6));
        studentList.add(new Student(9,"Waqar Tayyab", 3.2));
        studentList.add(new Student(10,"Muhammad Ali", 3.32));
        studentList.add(new Student(11,"Tayyab Ejaz", 3.6));
        studentList.add(new Student(12,"Umair Ali", 3.6));
        studentList.add(new Student(13,"Khubaib Ejaz", 3.6));
        studentList.add(new Student(14,"Waqar Tayyab", 3.6));
        studentList.add(new Student(15,"Muhammad Ali", 3.6));

        // Create adapter passing in the sample user data
        StudentAdapter adapter = new StudentAdapter(studentList);
        adapter.notifyDataSetChanged();
        // Attach the adapter to the recyclerview to populate items
        RecyclerViewStudent.setAdapter(adapter);
        // Set layout manager to position the items
        RecyclerViewStudent.setLayoutManager(new LinearLayoutManager(this));

    }
}