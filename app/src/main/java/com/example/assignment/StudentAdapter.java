package com.example.assignment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.BookVh> {

    Context context ;
    List<Student> studentList;

    public StudentAdapter(Context context , List<Student> studentList) {
        this.context = context;
        this.studentList = studentList;
    }

    @NonNull
    @Override
    public BookVh onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =LayoutInflater.from(context).inflate(R.layout.row_student, parent , false);
        return new BookVh(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookVh holder, int position) {
        holder.setData(studentList.get(position));
    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    class BookVh extends RecyclerView.ViewHolder{
      TextView  name,id,level,avg;
        public BookVh(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            id = itemView.findViewById(R.id.id);
            level = itemView.findViewById(R.id.level);
            avg = itemView.findViewById(R.id.avg);
         }

        public void setData(Student student) {
            name.setText(student.getName());
            id.setText(student.getId());
            level.setText(student.getLevel());
            avg.setText(String.valueOf(student.getAvg()));
        }
    }
}
