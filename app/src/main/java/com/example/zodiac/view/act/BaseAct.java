package com.example.zodiac.view.act;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewbinding.ViewBinding;

import com.example.zodiac.App;
import com.example.zodiac.Storage;

public abstract class BaseAct<T extends ViewBinding> extends AppCompatActivity implements View.OnClickListener {
    protected T binding;
    @Override
    public final void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = initViewBingding();
        setContentView(binding.getRoot());
        initViews();
    }
    protected Storage getStorage(){
        return App.getInstance().getStorage();
    }

    protected abstract void initViews();
    protected abstract T initViewBingding();
    protected abstract int getLayoutId();

    @Override
    public final void onClick(View v) {
        v.startAnimation(AnimationUtils.loadAnimation(this,
                androidx.appcompat.R.anim.abc_fade_in));
        clickView(v);
    }
    protected void clickView(View v) {
        // do nothing
    }
    protected final void notify(String msg){
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }
    protected final void notify(int msg){
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }
}
