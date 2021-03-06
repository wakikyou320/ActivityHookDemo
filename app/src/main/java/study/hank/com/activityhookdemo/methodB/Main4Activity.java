package study.hank.com.activityhookdemo.methodB;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import study.hank.com.activityhookdemo.GlobalActivityHookHelper;
import study.hank.com.activityhookdemo.R;
import study.hank.com.activityhookdemo.methodA.Main2Activity;
import study.hank.com.activityhookdemo.methodA.Main3Activity;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        GlobalActivityHookHelper.hook();
//        ApplicationContextHookHelper.hook();
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityByApplicationContext();
            }
        });
    }

    private void startActivityByApplicationContext() {
        Intent i = new Intent(Main4Activity.this, Main5Activity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        getApplicationContext().startActivity(i);
    }
}
