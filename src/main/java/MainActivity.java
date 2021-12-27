package pl.czak.minimal;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebSettings;
import android.widget.TextView;
import android.webkit.WebView;
import android.webkit.JavascriptInterface;
import android.text.TextUtils;

public class MainActivity extends Activity
{
    @Override
    public void onCreate(Bundle savedInstanceState) {
		// Don't want the ugly top bar
		requestWindowFeature(Window.FEATURE_NO_TITLE);

        super.onCreate(savedInstanceState);

		WebView webview = new WebView(this);
		webview.setWebContentsDebuggingEnabled(true);

		WebSettings settings = webview.getSettings();
		settings.setJavaScriptEnabled(true);
		settings.setBuiltInZoomControls(false);
		settings.setDomStorageEnabled(true);
		settings.setLoadWithOverviewMode(true);

		webview.loadUrl("file:///android_asset/index.html");
		webview.addJavascriptInterface(new backend(), "b");

		setContentView(webview);

		// Load web translation
    }
    
    public class backend {
		@JavascriptInterface
		public String farts() {
			return "Hi";
		}
	}
}
