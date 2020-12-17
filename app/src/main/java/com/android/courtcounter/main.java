package com.android.courtcounter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.view.MenuItem.*;
import android.content.*;
import android.widget.ActionMenuView.*;

public class main extends Activity
{

	// Tracks the score for Team A
	int scoreTeamA = 0;

	// Tracks the score for Team B
	int scoreTeamB = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{

		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_setting, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.

		int setting = item.getItemId();
		int license = item.getItemId();
		int exit = item.getItemId();

		if (setting == R.id.menu_settings)
		{
			// Toast.makeText(this, "Settings menu item was clicked!", Toast.LENGTH_SHORT).show();

			Intent intent=new Intent(main.this, setting.class);
			startActivity(intent);

			return true;
		}

		if (license == R.id.menu_license)
		{
			// Toast.makeText(this, "License menu item is clicked!", Toast.LENGTH_SHORT).show();

			Intent intent=new Intent(main.this, license.class);
			startActivity(intent);

			return true;
		}

		if (exit == R.id.menu_exit)
		{
			// Toast.makeText(this, "Exiting app!", Toast.LENGTH_SHORT).show();

			System.exit(0);

			return true;
		}

		return super.onOptionsItemSelected(item);
	}


	/**
	 * Increases the score for Team A by 1 point.
	 */
	public void addOneForTeamA(View view)
	{
		scoreTeamA += 1;
		displayForTeamA(scoreTeamA);
	}


	/**
	 * Increases the score for Team A by 2 points.
	 */
	public void addTwoForTeamA(View view)
	{
		scoreTeamA += 2;
		displayForTeamA(scoreTeamA);
	}


	/**
	 * Increases the score for Team A by 3 points.
	 */
	public void addThreeForTeamA(View view)
	{
		scoreTeamA += 3;
		displayForTeamA(scoreTeamA);
	}
	
	
	/**
	 * Decreases the score for Team A by 1 point.
	 */
	 public void minusOneFromTeamA(View view)
	 {
		 scoreTeamA -= 1;
		 displayForTeamA(scoreTeamA);
	 }


	/**
	 * Increases the score for Team B by 1 point.
	 */
	public void addOneForTeamB(View view)
	{
		scoreTeamB += 1;
		displayForTeamB(scoreTeamB);
	}


	/**
	 * Increases the score for Team B by 2 points.
	 */
	public void addTwoForTeamB(View view)
	{
		scoreTeamB += 2;
		displayForTeamB(scoreTeamB);
	}


	/**
	 * Increases the score for Team B by 3 points.
	 */
	public void addThreeForTeamB(View view)
	{
		scoreTeamB += 3;
		displayForTeamB(scoreTeamB);
	}
	
	
	/**
	 * Decreases the score for Team B by 1 point.
	 */
	public void minusOneFromTeamB(View view)
	{
		scoreTeamB -= 1;
		displayForTeamB(scoreTeamB);
	}


	/**
	 * Resets the score for both teams back to 0.
	 */
	public void resetScores(View view)
	{
		scoreTeamA = 0;
		scoreTeamB = 0;

		displayForTeamA(scoreTeamA);
		displayForTeamB(scoreTeamB);

		Toast.makeText(this, "Reset Successful!", Toast.LENGTH_SHORT).show();

		return;
	}


	/**
	 * Displays the given score for Team A.
	 */
	public void displayForTeamA(int score)
	{
		TextView scoreView = findViewById(R.id.team_a_score);
		scoreView.setText(String.valueOf(score));
	}


	/**
	 * Displays the given score for Team B.
	 */
	public void displayForTeamB(int score)
	{
		TextView scoreView = findViewById(R.id.team_b_score);
		scoreView.setText(String.valueOf(score));
	}

}
