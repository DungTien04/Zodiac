package com.example.zodiac.view.act;

import android.content.Intent;
import android.view.View;
import android.view.animation.AnimationUtils;

import com.example.zodiac.App;
import com.example.zodiac.databinding.M002ActDetailBinding;

public class M002ActDetail extends BaseAct<M002ActDetailBinding> {
    @Override
    protected void initViews() {
        Intent intent = getIntent();
        if(intent==null) {
            return;
        }
        App app = (App)getApplication();

        binding.ivPhoto.setImageDrawable(getStorage().drawable);
       String title= getStorage().m001title.replace("(","\n(");
        binding.title.setText(title);
        binding.tvDetail.setText(getStorage().m001text);
        binding.back.setOnClickListener((View v) -> {
           super.onClick(v);
            finish();
        });
    }



    @Override
    protected M002ActDetailBinding initViewBingding() {
        return M002ActDetailBinding.inflate(getLayoutInflater());
    }

    @Override
    protected int getLayoutId() {
        return 0;
    }
}
