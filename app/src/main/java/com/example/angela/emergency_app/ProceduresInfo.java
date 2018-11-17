package com.example.angela.emergency_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class ProceduresInfo extends AppCompatActivity {

    TextView info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_procedures_info);

        info = (TextView) findViewById(R.id.textView);

        Bundle extras = getIntent().getExtras();
        int cardNumVal = extras.getInt("cardNum");
        Log.i("cardNumVal", ""+cardNumVal);
        String x = Integer.toString(cardNumVal);
//        info.setText(x);
        String text;
        if (cardNumVal==0) {
            text = "♦APL will use the term “Lockdown” during emergencies that could endanger your life, such as an active assailant/armed intruder on campus\n\n" +
                    "♦You might receive this message via the PA system, telephone call, e-mail or text message\n\n" +
                    "♦When a Lockdown is announced:\n\n" +
                    "       •In open or public areas, such as a cafeteria, the Kossiakoff Center or Parsons Auditorium:\n\n" +
                    "           √Quickly determine your proximity to the assailant (if possible)\n\n" +
                    "           √If you see an escape path away from the threat, take it\n\n" +
                    "       •However, in most instances, the exact location of the assailant will be unclear and may be evolving. Therefore, the safest course of action is to Lockdown by seeking safe haven in a location not easily observable or accessible by the assailant if escape is not a viable option:\n\n" +
                    "           √Go into an office or nearby room, lock all doors and use available items to block the doors\n\n" +
                    "           √Remain quiet and put phones on silent or vibrate\n\n" +
                    "           √If no lockable rooms are close by, hide where the assailant is least likely to find you\n\n" +
                    "♦You might have to stay in the room or in hiding for several hours while Police deal with the situation\n\n" +
                    "♦If you need medical attention, call 555\n\n" +
                    "♦Do NOT open your door and look out";
            info.setText(text);
        }
        else if (cardNumVal==1) {
            text = "1";
            info.setText(text);
        }
        else {
            info.setText("else");
        }


            /*case 3:
                text = "3";
                info.setText(text);
            case 4:
                text = "4";
                info.setText(text);
            case 5:
                text = "5";
                info.setText(text);
            case 6:
                text = "6";
                info.setText(text);
            case 7:
                text = "7";
                info.setText(text);*/
        }


    }
