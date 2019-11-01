package ru.job4j.dic.phonedic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private FragmentManager fm;
    private Fragment phoneDicFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fm = getSupportFragmentManager(); // получить FragmentManager
        phoneDicFragment = fm.findFragmentById(R.id.mainContainer);
        if (phoneDicFragment == null) {
            phoneDicFragment = new PhoneDicFragment();
            fm.beginTransaction()
                    .add(R.id.mainContainer, phoneDicFragment) // добавить фрагмент в контейнер
                    .commit();
        }

    }


}