package pro.nanosystems.traffic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView mRedLight, mYellowLight, mGreenLight;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRedLight = findViewById(R.id.red_light);
        mYellowLight = findViewById(R.id.yellow_light);
        mGreenLight = findViewById(R.id.green_light);
    }

    public void turnOff() {
        mRedLight.setImageResource(R.drawable.light_off);
        mYellowLight.setImageResource(R.drawable.light_off);
        mGreenLight.setImageResource(R.drawable.light_off);
    }


    public void turnOnRed(View view) {
        turnOff();
        mRedLight.setImageResource(R.drawable.red_on);
    }

    public void turnOnYellow(View view) {
        turnOff();
        mYellowLight.setImageResource(R.drawable.yellow_on);
    }

    public void turnOnGreen(View view) {
        turnOff();
        mGreenLight.setImageResource(R.drawable.green_on);
    }
}
