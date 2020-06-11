package com.sist.mywebapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.webView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var webView1=findViewById<WebView>(R.id.webView)
        webView1.apply {
            settings.javaScriptEnabled=true
            webViewClient= WebViewClient()
        }
        webView1.loadUrl("http://www.google.com")

        searchButton.setOnClickListener{
            var url=urlEditView.text
            webView1.loadUrl("http://"+url.toString())
        }
    }
}