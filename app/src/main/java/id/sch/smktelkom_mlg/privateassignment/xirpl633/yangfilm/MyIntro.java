package id.sch.smktelkom_mlg.privateassignment.xirpl633.yangfilm;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.widget.Toast;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class MyIntro extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addSlide(AppIntroFragment.newInstance("YangFilm",
                "Film Information",
                R.drawable.ic_camera_roll_black_24dp,
                Color.parseColor("#51e2b7")));

        addSlide(AppIntroFragment.newInstance("YangFilm",
                "Film apa saja yang jadi list untuk ditonton?",
                R.drawable.ic_menu_slideshow,
                Color.parseColor("#66CCCC")));

        addSlide(AppIntroFragment.newInstance("YangFilm",
                "Enjoy it",
                R.drawable.ic_menu_send,
                Color.parseColor("#006699")));

        showStatusBar(false);
        setBarColor(Color.parseColor("#333639"));
        setSeparatorColor(Color.parseColor("#2196F3"));
    }

    @Override
    public void onDonePressed() {
        finish();
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        finish();
    }

    @Override
    public void onSlideChanged() {
        Toast.makeText(this, "Go Slide Changed", Toast.LENGTH_SHORT).show();
    }
}
