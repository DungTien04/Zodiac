package com.example.zodiac.view.act;

import android.content.Intent;
import android.os.Handler;

import com.example.zodiac.databinding.M000ActSplashBinding;

public class M000SplashAct extends BaseAct<M000ActSplashBinding> {
    private static final int TIME_DELAY = 2000;

    @Override
    protected void initViews() {
        new Handler().postDelayed(() -> startActivity(new Intent(M000SplashAct.this,M001ActList.class)),TIME_DELAY);
    }

    @Override
    protected M000ActSplashBinding initViewBingding() {
        return M000ActSplashBinding.inflate(getLayoutInflater());
    }

    @Override
    protected int getLayoutId() {
        return 0;
    }
}
