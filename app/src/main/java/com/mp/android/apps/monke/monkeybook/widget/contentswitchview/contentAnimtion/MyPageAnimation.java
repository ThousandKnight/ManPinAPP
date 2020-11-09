package com.mp.android.apps.monke.monkeybook.widget.contentswitchview.contentAnimtion;

import android.content.Context;
import android.view.MotionEvent;

import com.mp.android.apps.monke.monkeybook.utils.DensityUtil;
import com.mp.android.apps.monke.monkeybook.widget.contentswitchview.BookContentView;
import com.mp.android.apps.monke.monkeybook.widget.contentswitchview.ContentSwitchView;

import java.util.List;

public abstract class MyPageAnimation {
    private Context context;

    public MyPageAnimation(Context context) {
        this.context = context;
        scrollX = DensityUtil.dp2px(context, 30f);
        scrollY = DensityUtil.dp2px(context, 30f);
    }

    /**
     * x轴滑动最大距离
     */
    public int scrollX;
    /**
     * Y轴滑动最大距离
     */
    public int scrollY;

    /**
     * 点击事件的处理
     *
     * @param event
     */
    public abstract boolean onTouchEvent(MotionEvent event, onLayoutStatus onLayoutStatus, List<BookContentView> viewContents, ContentSwitchView contentSwitchView, ContentSwitchView.LoadDataListener loadDataListener);

    /**
     * 处理数据源移动监听,预加载layout
     *
     * @param changed
     * @param left
     * @param top
     * @param right
     * @param bottom
     * @param onLayoutStatus
     * @param viewContents
     */
    public abstract void onLayout(boolean changed, int left, int top, int right, int bottom, onLayoutStatus onLayoutStatus, List<BookContentView> viewContents);

    public interface onLayoutStatus {
        boolean preAndNext();

        boolean onlyPre();

        boolean onlyNext();

        boolean onlyOne();

        int getWidth();

        int getHeight();
    }

    ;
}
