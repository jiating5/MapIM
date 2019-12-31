package com.jt.gisim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.jt.commonmodule.arouter.ARouterConfig;
/**
 * @author 贾婷
 * @date 2019/12/31.
 * GitHub：https://github.com/jiating5
 * description：
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onclick(View view) {
        ARouter.getInstance().build(ARouterConfig.MAP_MAP).navigation();
    }
}
