package de.derandroidpro.activity_tutorial;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class SecondActivity extends Activity {
	public TextView tv1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second_layout);
		
		tv1 = (TextView) findViewById(R.id.textView1);
		
		final Bundle intentauswertung = getIntent().getExtras();
		
		if (intentauswertung != null) {
			tv1.setText("Dein Text: " + intentauswertung.getString("Uebergabetxt"));
			
			
		}
		
		ActionBar actionbar = getActionBar();
		actionbar.setHomeButtonEnabled(true);
		actionbar.setDisplayHomeAsUpEnabled(true);
		
		
		
			
		
	}



	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		switch (item.getItemId()) {
		case android.R.id.home:{
			onBackPressed();
			SecondActivity.this.finish();
			
		}
		
		}
		return super.onOptionsItemSelected(item);
	}
}
