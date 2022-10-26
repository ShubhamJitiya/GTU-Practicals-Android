package com.shubhamjitiya.mad.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.shubhamjitiya.mad.R;
import com.shubhamjitiya.mad.bottomsheet.BottomSheetAddStudent;
import com.shubhamjitiya.mad.practicals.Practical_7;

public class MainScreenAdapter extends RecyclerView.Adapter<MainScreenAdapter.ViewHolder> {
    private final String[] practicalTitle;
    private final String[] practicalHeading;
    private final String[] practicalDescription;

    /**
     * Initialize the dataset of the Adapter.
     * <p>
     * String[] containing the data to populate views to be used
     * by RecyclerView.
     */
    public MainScreenAdapter(String[] practicalTitle, String[] practicalHeading, String[] practicalDescription) {
        this.practicalTitle = practicalTitle;
        this.practicalHeading = practicalHeading;
        this.practicalDescription = practicalDescription;
    }

    // 2. Create new views (invoked by the layout manager)
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_layout_home_screen, viewGroup, false);
        return new ViewHolder(view);
    }

    // 3. Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(@NonNull MainScreenAdapter.ViewHolder viewHolder, int position) {
        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.getCardViewTitle().setText(practicalTitle[position]);
        viewHolder.getCardViewShortDescription().setText(practicalHeading[position]);
        viewHolder.getCardViewDescription().setText(practicalDescription[position]);


        viewHolder.getPracticalsCard().setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                switch (position) {
                    case 5:
                    case 6 :
                        Intent openPractical = new Intent(view.getContext(), Practical_7.class);
                        view.getContext().startActivity(openPractical);
                        break;
                    case 1:
                        BottomSheetDialog addStudent = new BottomSheetDialog(view.getContext());
                        addStudent.setContentView(R.layout.bottom_sheet_add_student);

                        Button btnAddStudent = addStudent.findViewById(R.id.btnAddStudent);
                        btnAddStudent.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Toast.makeText(view.getContext(), "Student added successfully", Toast.LENGTH_SHORT).show();
                            }
                        });
                        addStudent.show();
                        Toast.makeText(view.getContext(), "Clicked: second ", Toast.LENGTH_SHORT).show();
                        break;

                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return practicalTitle.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView cardViewTitle, cardViewShortDescription, cardViewDescription;
        private final CardView cvMainScreen;

        public ViewHolder(@NonNull View view) {
            super(view);
            cvMainScreen = view.findViewById(R.id.cvMainScreen);
            cardViewTitle = view.findViewById(R.id.cardViewTitle);
            cardViewShortDescription = view.findViewById(R.id.cardViewShortDescription);
            cardViewDescription = view.findViewById(R.id.cardViewDescription);
        }

        public CardView getPracticalsCard() {
            return cvMainScreen;
        }

        public TextView getCardViewTitle() {
            return cardViewTitle;
        }

        public TextView getCardViewShortDescription() {
            return cardViewShortDescription;
        }

        public TextView getCardViewDescription() {
            return cardViewDescription;
        }

    }


}
