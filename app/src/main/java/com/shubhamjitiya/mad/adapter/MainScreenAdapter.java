package com.shubhamjitiya.mad.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.shubhamjitiya.mad.R;
import com.shubhamjitiya.mad.practical_1.Practical_1;
import com.shubhamjitiya.mad.practical_10.Practical_10;
import com.shubhamjitiya.mad.practical_11.Practical_11;
import com.shubhamjitiya.mad.practical_12.Practical_12;
import com.shubhamjitiya.mad.practical_13.Practical_13;
import com.shubhamjitiya.mad.practical_14.Practical_14;
import com.shubhamjitiya.mad.practical_15.Practical_15;
import com.shubhamjitiya.mad.practical_16.Practical_16;
import com.shubhamjitiya.mad.practical_17.Practical_17;
import com.shubhamjitiya.mad.practicals.Practical_7;
import com.shubhamjitiya.mad.practicals.Practical_8;
import com.shubhamjitiya.mad.practicals.Practical_9;

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
                    case 0:
                        Intent openPractical1 = new Intent(view.getContext(), Practical_1.class);
                        view.getContext().startActivity(openPractical1);
                        break;
                    case 5:
                    case 6:
                        Intent openPractical = new Intent(view.getContext(), Practical_7.class);
                        view.getContext().startActivity(openPractical);
                        break;
                    case 7:
                        Intent openPractical8 = new Intent(view.getContext(), Practical_8.class);
                        view.getContext().startActivity(openPractical8);
                        // Toast.makeText(view.getContext(), "Clicked: second ", Toast.LENGTH_SHORT).show();
                        break;
                    case 8:
                        Intent openPractical9 = new Intent(view.getContext(), Practical_9.class);
                        view.getContext().startActivity(openPractical9);
                        // Toast.makeText(view.getContext(), "Clicked: second ", Toast.LENGTH_SHORT).show();
                        break;
                    case 9:
                        Intent openPractical10 = new Intent(view.getContext(), Practical_10.class);
                        view.getContext().startActivity(openPractical10);
                        // Toast.makeText(view.getContext(), "Clicked: second ", Toast.LENGTH_SHORT).show();
                        break;
                    case 10:
                        Intent openPractical11 = new Intent(view.getContext(), Practical_11.class);
                        view.getContext().startActivity(openPractical11);
                        // Toast.makeText(view.getContext(), "Clicked: second ", Toast.LENGTH_SHORT).show();
                        break;

                    case 11:
                        Intent openPractical12 = new Intent(view.getContext(), Practical_12.class);
                        view.getContext().startActivity(openPractical12);
                        // Toast.makeText(view.getContext(), "Clicked: second ", Toast.LENGTH_SHORT).show();
                        break;
                    case 12:
                        Intent openPractical13 = new Intent(view.getContext(), Practical_13.class);
                        view.getContext().startActivity(openPractical13);
                        // Toast.makeText(view.getContext(), "Clicked: second ", Toast.LENGTH_SHORT).show();
                        break;
                    case 13:
                        Intent openPractical14 = new Intent(view.getContext(), Practical_14.class);
                        view.getContext().startActivity(openPractical14);
                        // Toast.makeText(view.getContext(), "Clicked: second ", Toast.LENGTH_SHORT).show();
                        break;
                    case 14:
                        Intent openPractical_15 = new Intent(view.getContext(), Practical_15.class);
                        view.getContext().startActivity(openPractical_15);
                        // Toast.makeText(view.getContext(), "Clicked: second ", Toast.LENGTH_SHORT).show();
                        break;
                    case 15:
                        Intent openPractical_16 = new Intent(view.getContext(), Practical_16.class);
                        view.getContext().startActivity(openPractical_16);
                        // Toast.makeText(view.getContext(), "Clicked: second ", Toast.LENGTH_SHORT).show();
                        break;
                    case 16:
                        Intent openPractical_17 = new Intent(view.getContext(), Practical_17.class);
                        view.getContext().startActivity(openPractical_17);
                        // Toast.makeText(view.getContext(), "Clicked: second ", Toast.LENGTH_SHORT).show();
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
