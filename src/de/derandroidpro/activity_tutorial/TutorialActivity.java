package de.derandroidpro.activity_tutorial;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TutorialActivity extends Activity implements OnClickListener {
	public Button btn1;
	public EditText et1;
	public String ettext;
	public int uebergabeid = 444;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tutorial_layout);
		btn1 = (Button) findViewById(R.id.button1);
		btn1.setOnClickListener(this);
		et1 = (EditText) findViewById(R.id.editText1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tutorial, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()){
		
		case R.id.button1:{
			if (et1.getText().toString().length() >0){
			
			ettext = et1.getText().toString();
			Intent activityintent = new Intent (TutorialActivity.this, SecondActivity.class);
			activityintent.putExtra("Uebergabetxt", ettext);
			startActivityForResult(activityintent, uebergabeid);
			
			}
			
			else {
				Toast.makeText(getApplicationContext(), "Bitte gib einen Text ein!", Toast.LENGTH_SHORT).show();
			}
			
		}
		
		}
	}
}
