package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        TextView screenLabel = findViewById(R.id.app_name);
        screenLabel.setText("About us");
        ImageButton infoIcon = findViewById(R.id.info_icon);
        infoIcon.setVisibility(View.INVISIBLE);
        TextView github = findViewById(R.id.github_link);
        github.setMovementMethod(LinkMovementMethod.getInstance());
        TextView instagram = findViewById(R.id.instagram_link);
        instagram.setMovementMethod(LinkMovementMethod.getInstance());
        TextView feedbackMail = findViewById(R.id.feedback_mail);
        feedbackMail.setText(Html.fromHtml("<a href=\"mailto:arjun4mtr@gmail.com\">Send Feedback</a>"));
        feedbackMail.setMovementMethod(LinkMovementMethod.getInstance());
    }
}