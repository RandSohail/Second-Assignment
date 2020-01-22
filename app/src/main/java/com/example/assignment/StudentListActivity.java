package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StudentListActivity extends AppCompatActivity {

    RecyclerView studentList_RV;
    StudentAdapter studentAdapter;

    List<Student> studentList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);
        Objects.requireNonNull(getSupportActionBar()).hide();

        studentList.add(new Student("20163138","wejdan murad","4th year", 87.2f));
        studentList.add(new Student("20151935","woroud murad","5th year", 82.5f));
        studentList.add(new Student("20161234","rewaa shamalakh","4th year", 85f));
        studentList.add(new Student("20161234","rewaa shamalakh","4th year", 85f));
        studentList.add(new Student("20161234","rewaa shamalakh","4th year", 85f));
        studentList.add(new Student("20161234","rewaa shamalakh","4th year", 85f));
        studentList.add(new Student("20161234","rewaa shamalakh","4th year", 85f));
        studentList.add(new Student("20163138","wejdan murad","4th year", 87.2f));
        studentList.add(new Student("20151935","woroud murad","5th year", 82.5f));
        studentList.add(new Student("20161234","rewaa shamalakh","4th year", 85f));
        studentList.add(new Student("20161234","rewaa shamalakh","4th year", 85f));
        studentList.add(new Student("20161234","rewaa shamalakh","4th year", 85f));
        studentList.add(new Student("20161234","rewaa shamalakh","4th year", 85f));
        studentList.add(new Student("20161234","rewaa shamalakh","4th year", 85f));

        studentList_RV = findViewById(R.id.studentsList_rv);
        studentList_RV.setLayoutManager(new LinearLayoutManager(this));
        studentAdapter = new StudentAdapter(this , studentList);
        studentList_RV.setAdapter(studentAdapter);
    }
}
