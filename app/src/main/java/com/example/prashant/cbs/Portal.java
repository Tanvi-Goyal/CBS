package com.example.prashant.cbs;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Portal extends AppCompatActivity {

    ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portal);

        Intent intent = getIntent();
        Bundle bd = intent.getExtras();
        String add = null;
        if (bd != null) {
            add = (String) bd.get("web_add");
        }
        WebView browser = (WebView) findViewById(R.id.wv1);
        browser.getSettings().setJavaScriptEnabled(true);
        browser.setWebViewClient(new MyBrowser());
        browser.getSettings().setLoadWithOverviewMode(true);
        browser.getSettings().setBuiltInZoomControls(true);
        browser.getSettings().setSupportMultipleWindows(true);
        browser.getSettings().setUseWideViewPort(true);
        browser.setHorizontalScrollBarEnabled(true);
        browser.loadUrl(add);
    }

    private class MyBrowser extends WebViewClient
    {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url)
        {
            view.loadUrl(url);
            return true;
        }

        public void onLoadResource (WebView view, String url) {

            try {
                if (progressDialog == null) {
                    // in standard case YourActivity.this
                    progressDialog = new ProgressDialog(Portal.this);
                    progressDialog.setMessage("Loading...");
                    progressDialog.show();
                }
            }catch(Exception exception) {
                exception.printStackTrace();
            }
        }
       public void onPageFinished(WebView view, String url) {
            try{
                if (progressDialog!=null||progressDialog.isShowing()) {
                    progressDialog.dismiss();
                    progressDialog = null;
                }
            }catch(Exception exception){
                exception.printStackTrace();
            }
        }
    }

}
