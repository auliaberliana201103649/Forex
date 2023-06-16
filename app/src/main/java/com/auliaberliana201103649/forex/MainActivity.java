package com.auliaberliana201103649.forex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ProgressBar loadingProgressBar;
    private SwipeRefreshLayout swipeRefreshLayout1;
    private TextView audTextView, bndTextView, btcTextView, eurTextView, gbpTextView, hkdTextView, inrTextView, jpyTextView, myrTextView, usdTextView;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        swipeRefreshLayout1 = (SwipeRefreshLayout) findViewById(R.id.swipeRefreshLayout1);
        audTextView = (TextView)findViewById(R.id.audTextView);
        bndTextView = (TextView)findViewById(R.id.bndTextView);
        btcTextView = (TextView)findViewById(R.id.btcTextView);
        eurTextView = (TextView)findViewById(R.id.eurTextView);
        gbpTextView = (TextView)findViewById(R.id.gbpTextView);
        hkdTextView = (TextView)findViewById(R.id.hkdTextView);
        inrTextView = (TextView)findViewById(R.id.inrTextView);
        jpyTextView = (TextView)findViewById(R.id.jpyTextView);
        myrTextView = (TextView)findViewById(R.id.myrTextView);
        usdTextView = (TextView)findViewById(R.id.usdTextView);
        loadingProgressBar = (ProgressBar) findViewById(R.id.loadingProgressBar);

        initSwipeRefreshLayout();
        initForex();
    }

    private void initSwipeRefreshLayout() {
        swipeRefreshLayout1.setOnRefreshListener((){
            initForex();

            swipeRefreshLayout1.setRefreshing(false);
        });
    }
    public  String formatNumber(double number, String format) {

    }
}