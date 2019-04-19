package com.shencangblue.jin.superpixelenergy;

import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.by_syk.lib.sp.SP;
import com.github.chrisbanes.photoview.PhotoView;
import com.shencangblue.jin.superpixelenergy.bean.UserBean;
import com.shencangblue.jin.superpixelenergy.widget.ConfigView;
import com.shencangblue.jin.superpixelenergy.widget.TimerProgressView;

public class MainActivity extends AppCompatActivity {
    private SP sp;
    private PhotoView photoView;
    private TimerProgressView viewTimerProgress;
    private TextView tvAction;
    private View viewHint;
    private View viewHintIcon;
    private View viewHintLogin;
    private TextView tvHintLogin;
    private ConfigView cvTypeArt;
    private ConfigView cvTypePhoto;
    private ConfigView cvScale2x;
    private ConfigView cvScale4x;
    private ConfigView cvScale8x;
    private ConfigView cvScale16x;
    private ConfigView cvDenoiseNo;
    private ConfigView cvDenoiseLow;
    private ConfigView cvDenoiseMiddle;
    private ConfigView cvDenoiseHigh;
    private ConfigView cvDenoiseSuper;

    private BottomSheetBehavior bottomSheetBehavior;
    private int userGrade = UserBean.GRADE_FREE;
    private boolean isForeground = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        init();
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
    }

    private void init() {
    }
}
