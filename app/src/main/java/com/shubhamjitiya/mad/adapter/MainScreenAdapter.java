package com.shubhamjitiya.mad.adapter;

import android.hardware.ConsumerIrManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.shubhamjitiya.mad.R;

public class MainScreenAdapter extends RecyclerView.Adapter<MainScreenAdapter.ViewHolder>{
    private String[] practicalTitle, practicalHeading, practicalDescription;

    /**
     * Initialize the dataset of the Adapter.
     *
     *  String[] containing the data to populate views to be used
     * by RecyclerView.
     */
    public MainScreenAdapter (String[] practicalTitle, String[] practicalHeading, String[] practicalDescription) {
        this.practicalTitle = practicalTitle;
        this.practicalHeading = practicalHeading;
        this.practicalDescription = practicalDescription;
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{
        private final TextView cardViewTitle, cardViewShortDescription, cardViewDescription;
        private final CardView cvMainScreen;

        public ViewHolder(@NonNull View view) {
            super(view);
            cvMainScreen = (CardView)view.findViewById(R.id.cvMainScreen);
            cardViewTitle = (TextView) view.findViewById(R.id.cardViewTitle);
            cardViewShortDescription = (TextView) view.findViewById(R.id.cardViewShortDescription);
            cardViewDescription = (TextView) view.findViewById(R.id.cardViewDescription);
        }

        public CardView getPracticalsCard(){return cvMainScreen;}

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
                Toast.makeText(view.getContext(), "Clicked: " + practicalTitle[position], Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return practicalTitle.length;
    }


}
