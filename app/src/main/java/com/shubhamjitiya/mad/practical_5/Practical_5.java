package com.shubhamjitiya.mad.practical_5;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.shubhamjitiya.mad.R;
import com.shubhamjitiya.mad.databinding.ActivityPractical5Binding;

public class Practical_5 extends AppCompatActivity {
    ActivityPractical5Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPractical5Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        String[] appLinks = {"https://play.google.com/store/apps/details?id=com.shubhjitiya.gecgandhinagar",
                "https://play.google.com/store/apps/details?id=com.shubhamjitiya.god",
                "https://play.google.com/store/apps/details?id=com.shubhjitiya.whatsinstasaver",
                "https://play.google.com/store/apps/details?id=com.jitiyashubham.mystifying",
                "https://play.google.com/store/apps/developer?id=Startboozz+Infotech",
                "https://www.google.com"
        };
        String[] designLinks = {
                "https://www.behance.net/gallery/154823187/Blinkit-Redesign-Concept",
                "https://www.behance.net/gallery/154960925/Feeder-Donate-food-waste-Mobile-application",
                "https://www.behance.net/gallery/156263147/Dashboard-details-Web-app",
                "https://www.behance.net/gallery/155855877/UIUX-Case-study-My-Guru-Mobile-Application",

        };

        binding.gtu.setOnClickListener(view -> {
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(appLinks[0]));
            startActivity(i);
        });

        binding.god.setOnClickListener(view -> {
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(appLinks[1]));
            startActivity(i);
        });

        binding.whatsinsta.setOnClickListener(view -> {
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(appLinks[2]));
            startActivity(i);
        });

        binding.mystfying.setOnClickListener(view -> {
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(appLinks[3]));
            startActivity(i);
        });

        binding.hometutor.setOnClickListener(view -> {
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(appLinks[4]));
            startActivity(i);
        });
        binding.billing.setOnClickListener(view -> {
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(appLinks[5]));
            startActivity(i);
        });


        binding.blinkit.setOnClickListener(view -> {
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(designLinks[0]));
            startActivity(i);
        });

        binding.feeder.setOnClickListener(view -> {
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(designLinks[1]));
            startActivity(i);
        });
        binding.dashboardDetails.setOnClickListener(view -> {
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(designLinks[2]));
            startActivity(i);
        });
        binding.myGuru.setOnClickListener(view -> {
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(designLinks[3]));
            startActivity(i);
        });

        binding.email.setOnClickListener(view -> {
            Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:" + "jitiya66@gmail.com"));
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "GTU Practical App");
            emailIntent.putExtra(Intent.EXTRA_TEXT, "Enter message here");
            //emailIntent.putExtra(Intent.EXTRA_HTML_TEXT, body); //If you are using HTML in your body text

            startActivity(Intent.createChooser(emailIntent, "Send mail : "));
        });

    }


    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.message:
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:" + "jitiya66@gmail.com"));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "GTU Practical App");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "Enter message here");
                //emailIntent.putExtra(Intent.EXTRA_HTML_TEXT, body); //If you are using HTML in your body text

                startActivity(Intent.createChooser(emailIntent, "Send mail : "));
                return true;

            case R.id.picture:
                Toast.makeText(getApplicationContext(), "Shows image icon", Toast.LENGTH_SHORT).show();
                //   startActivity(i2);
                return (true);

            case R.id.mode:
                Toast.makeText(getApplicationContext(), "Shows call icon", Toast.LENGTH_SHORT).show();
                return (true);

            case R.id.linkedIn:
                Intent linkedIn = new Intent(Intent.ACTION_VIEW);
                linkedIn.setData(Uri.parse("https://www.linkedin.com/in/shubham-jitiya/"));
                startActivity(linkedIn);
                return (true);

            case R.id.behance:
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.behance.net/shubhamjitiya"));
                startActivity(i);
                return (true);

            case R.id.exit:
                finish();
                return (true);
        }
        return (super.onOptionsItemSelected(item));
    }
}