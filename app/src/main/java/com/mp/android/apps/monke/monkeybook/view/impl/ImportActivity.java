package com.mp.android.apps.monke.monkeybook.view.impl;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.mp.android.apps.R;
import com.mp.android.apps.main.bookR.adapter.MybookViewPagerAdapter;
import com.mp.android.apps.monke.basemvplib.impl.BaseFragment;
import com.mp.android.apps.monke.monkeybook.base.MBaseActivity;
import com.mp.android.apps.monke.monkeybook.presenter.impl.ImportPresenterImpl;
import com.mp.android.apps.monke.monkeybook.view.IImportView;
import com.mp.android.apps.monke.monkeybook.view.impl.fragment.ImportDirectoryFragment;
import com.mp.android.apps.monke.monkeybook.view.impl.fragment.ImportSmartFrament;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;


public class ImportActivity extends MBaseActivity<ImportPresenterImpl> implements IImportView, View.OnClickListener {
    @BindView(R.id.file_system_btn_add_book)
    Button fileSystemBtnAddBook;
    @BindView(R.id.file_system_btn_delete)
    Button fileSystemBtnDelete;
    @BindView(R.id.file_system_cb_selected_all)
    CheckBox fileSystemCbSelectedAll;
    @BindView(R.id.tab_vp)
    ViewPager tabVp;
    @BindView(R.id.tab_tl_indicator)
    TabLayout tabTlIndicator;
    @BindView(R.id.iv_back)
    ImageView ivBack;
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.tv_right_btn)
    TextView tvRightBtn;
    private List<BaseFragment> sourceList;
    BaseFragment importDirectoryFragment;
    BaseFragment importSmartFrament;
    private String[] titles = new String[]{"智能选择", "本地目录"};
    MybookViewPagerAdapter mybookViewPagerAdapter;

    @Override
    protected ImportPresenterImpl initInjector() {
        return new ImportPresenterImpl();
    }

    @Override
    protected void onCreateActivity() {
        setContentView(R.layout.activity_import_book);
    }

    @Override
    protected void initData() {
        sourceList = new ArrayList<>();
        importDirectoryFragment = new ImportDirectoryFragment();
        importSmartFrament = new ImportSmartFrament();
        sourceList.add(importSmartFrament);
        sourceList.add(importDirectoryFragment);
        mybookViewPagerAdapter = new MybookViewPagerAdapter(getSupportFragmentManager(), sourceList);
        tabVp.setAdapter(mybookViewPagerAdapter);
        for (int i = 0; i < sourceList.size(); i++) {
            tabTlIndicator.addTab(tabTlIndicator.newTab().setText(titles[i]));
        }
    }

    @Override
    protected void bindView() {
        super.bindView();
        tvTitle.setText("本地导入");

    }

    @Override
    protected void firstRequest() {
        super.firstRequest();
    }

    @Override
    protected void bindEvent() {
        super.bindEvent();
        ivBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.iv_back:
                finish();
                break;
            default:
                break;
        }
    }
}
