package com.example.matt.tankpit;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class MainActivity extends ActionBarActivity {

   // private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // mWebView = (WebView) findViewById(R.id.activity_main_webview);
       //WebSettings webSettings = mWebView.getSettings();
       // webSettings.setJavaScriptEnabled(true);

        //mWebView.loadUrl("http://tankpit.com");

        String url = "http://tankpit.com";
        WebView view = (WebView) this.findViewById(R.id.webView1);
        view.setWebViewClient(new WebViewClient());
        view.setInitialScale(85);
        view.getSettings().setDefaultZoom(WebSettings.ZoomDensity.FAR);
        view.getSettings().setLoadWithOverviewMode(true);
        view.getSettings().setUseWideViewPort(true);
        view.getSettings().setJavaScriptEnabled(true);
        view .getSettings().setDomStorageEnabled(true);
        view.loadUrl(url);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
