package com.example.chik.p1astudio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    Toolbar mToolbar;
    ImageView mItem;
    TextView mDescription;
    TextView mPrice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mToolbar = findViewById(R.id.toolbar);
        mItem = findViewById(R.id.ivImage);
        mDescription = findViewById(R.id.tvDescription);
        mPrice = findViewById(R.id.tvPrice);

        Bundle mBundle = getIntent().getExtras();
        if (mBundle != null){
            mToolbar.setTitle(mBundle.getString("Title"));
            mItem.setImageResource(mBundle.getInt("Image"));
            mDescription.setText(mBundle.getString("Description"));
            mPrice.setText(mBundle.getString("Price"));
        }

    }

}
