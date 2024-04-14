package com.example.zodiac.view.act;

import android.content.Intent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.zodiac.App;
import com.example.zodiac.R;
import com.example.zodiac.databinding.M001ActListBinding;

public class M001ActList extends BaseAct<M001ActListBinding>  {
    @Override
    protected void initViews() {
        binding.ivBoCap.setOnClickListener(this);
        binding.ivBachDuong.setOnClickListener(this);
        binding.ivSongNgu.setOnClickListener(this);
        binding.ivNhanMa.setOnClickListener(this);
        binding.ivMaKet.setOnClickListener(this);
        binding.ivBaoBinh.setOnClickListener(this);
        binding.ivSuTu.setOnClickListener(this);
        binding.ivSongTu.setOnClickListener(this);
        binding.ivCuGiai.setOnClickListener(this);
        binding.ivKimNguu.setOnClickListener(this);
        binding.ivThienBinh.setOnClickListener(this);
        binding.ivXuNu.setOnClickListener(this);
        binding.btDetail.setOnClickListener(this);
        clickView(binding.ivBoCap);
    }

    @Override
    protected void clickView(View v) {
        if(v.getId()==R.id.bt_Detail){
            gotoDetail();
        }else{ if(v instanceof ImageView){

            ImageView img = (ImageView) v;
            String text = (String) img.getTag();
            String  title  =v.getContentDescription().toString();
            binding.ivDetail.setImageDrawable(img.getDrawable());
            binding.tvContentDetail.setText(text);
            binding.tvTitleDetail.setText(title);

            App app = (App) getApplication();
            getStorage().m001text = text;
            getStorage().m001title = title;
            getStorage().drawable = img.getDrawable();

        }

        }
    }
    private void gotoDetail() {
        Intent intent = new Intent();
        intent.setClass(this, M002ActDetail.class);
        startActivity(intent);
    }

    @Override
    protected M001ActListBinding initViewBingding() {
        return M001ActListBinding.inflate(getLayoutInflater());
    }

    @Override
    protected int getLayoutId() {
        return 0;
    }
}