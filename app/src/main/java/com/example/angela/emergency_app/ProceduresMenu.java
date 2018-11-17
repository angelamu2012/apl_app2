package com.example.angela.emergency_app;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

public class ProceduresMenu extends Activity {

    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_procedures_menu);

        mainGrid = (GridLayout) findViewById((R.id.mainGrid));

        setToggleEvent(mainGrid);
    }

    private void setToggleEvent(GridLayout mainGrid) {
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            final CardView cardView = (CardView) mainGrid.getChildAt(i);
            final int finalI = i;
            Log.i("finalI", ""+finalI);
            cardView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view)
                {
                    Intent myIntent = new Intent(ProceduresMenu.this, ProceduresInfo.class);
                    myIntent.putExtra("cardNum", finalI);
                    Log.i("extra finalI", ""+finalI);
                    startActivity(myIntent);
                }
            });
        }
    }

    private void setSingleEvent(GridLayout mainGrid)
    {
        for (int i = 0; i<mainGrid.getChildCount();i++)
        {
            CardView cardView = (CardView) mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener()
            {
                public void onClick (View view)
                {
                    Toast.makeText(ProceduresMenu.this, "clicked" + finalI, Toast.LENGTH_SHORT);

                }
            });
        }
    }
}
