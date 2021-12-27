package pl.czak.minimal;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity
{
	static {
		System.loadLibrary("backend");
	}

	public native String stringFromJNI();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView label = new TextView(this);
        label.setText(stringFromJNI());

        setContentView(label);
    }
}


