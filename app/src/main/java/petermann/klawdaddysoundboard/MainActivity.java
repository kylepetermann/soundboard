package petermann.klawdaddysoundboard;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mysound1;
    MediaPlayer mysound2;
    MediaPlayer mysound3;
    MediaPlayer mysound4;
    MediaPlayer mysound5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mysound1 = MediaPlayer.create(this, R.raw.animals001);
        mysound2 = MediaPlayer.create(this, R.raw.animals002);
        mysound3 = MediaPlayer.create(this, R.raw.animals003);
        mysound4 = MediaPlayer.create(this, R.raw.animals004);
        mysound5 = MediaPlayer.create(this, R.raw.animals011);
    }

    public void mysound1(View view) {
        mysound1.start();
    }
    public void mysound2(View view) {
        mysound2.start();
    }
    public void mysound3(View view) {
        mysound3.start();
    }
    public void mysound4(View view) {
        mysound4.start();
    }
    public void mysound5(View view) {
        mysound5.start();
    }
}
