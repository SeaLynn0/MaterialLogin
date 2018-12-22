package cn.fanrunqi.materiallogin;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import cn.fanrunqi.materiallogin.a.LoginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void doEffectA(View v) {
        startActivity(new Intent(this, LoginActivity.class));
    }


}
