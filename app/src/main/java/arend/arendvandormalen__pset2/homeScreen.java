package arend.arendvandormalen__pset2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class homeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
    }

    public void goToFillScreen(View view) {
        Intent getSecondScreenIntent = new Intent(this, fillInScreen.class);
        startActivity(getSecondScreenIntent);
    }
}
