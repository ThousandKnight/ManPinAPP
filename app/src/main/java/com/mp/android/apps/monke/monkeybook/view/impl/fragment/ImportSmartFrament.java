package com.mp.android.apps.monke.monkeybook.view.impl.fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mp.android.apps.R;
import com.mp.android.apps.monke.basemvplib.impl.BaseFragment;
import com.mp.android.apps.monke.monkeybook.presenter.impl.ImportSmartFragmentPresenter;
import com.mp.android.apps.monke.monkeybook.view.IImportSmartFragmentView;

public class ImportSmartFrament extends BaseFragment<ImportSmartFragmentPresenter> implements IImportSmartFragmentView {
    @Override
    protected ImportSmartFragmentPresenter initInjector() {
        return new ImportSmartFragmentPresenter();
    }

    @Override
    protected View createView(LayoutInflater inflater, ViewGroup container) {
        return inflater.inflate(R.layout.activity_import_book_smart_fragment, container, false);
    }
}
