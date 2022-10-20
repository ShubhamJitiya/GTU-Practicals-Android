package com.shubhamjitiya.mad.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.shubhamjitiya.mad.R;
import com.shubhamjitiya.mad.data.StudentsData;

public class StudentDetailsAdapter extends RecyclerView.Adapter<StudentDetailsAdapter.ViewHolder> {

    private StudentsData student;

    public StudentDetailsAdapter(StudentsData student) {
       this.student = student;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout_student_details, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentDetailsAdapter.ViewHolder holder, int position) {
        holder.getStudentImage().setImageResource(student.imgId[position]);
        holder.getStudentName().setText(student.name[position]);
        holder.getStudentAddress().setText(student.address[position]);
    }

    @Override
    public int getItemCount() {
        return student.name.length;
    }

    //Find all views
    protected static class ViewHolder extends RecyclerView.ViewHolder{
        private final ImageView studentImage;
        private final TextView studentName, studentAddress;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            studentImage = itemView.findViewById(R.id.student_image);
            studentName = itemView.findViewById(R.id.student_name);
            studentAddress = itemView.findViewById(R.id.student_address);
        }

        public ImageView getStudentImage() {
            return studentImage;
        }

        public TextView getStudentName() {
            return studentName;
        }

        public TextView getStudentAddress() {
            return studentAddress;
        }
    }
}
