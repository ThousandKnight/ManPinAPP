package com.mp.android.apps.monke.monkeybook.view.impl.fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mp.android.apps.R;
import com.mp.android.apps.monke.basemvplib.impl.BaseFragment;
import com.mp.android.apps.monke.monkeybook.presenter.IImportDirectoryFragmentPresenter;
import com.mp.android.apps.monke.monkeybook.presenter.impl.ImportDirectoryFragmentPresenter;
import com.mp.android.apps.monke.monkeybook.view.IImportDirectoryFragmentView;

public class ImportDirectoryFragment extends BaseFragment<IImportDirectoryFragmentPresenter> implements IImportDirectoryFragmentView {

    @Override
    protected IImportDirectoryFragmentPresenter initInjector() {
        return new ImportDirectoryFragmentPresenter();
    }

    @Override
    protected View createView(LayoutInflater inflater, ViewGroup container) {
        return inflater.inflate(R.layout.activity_import_book_directory_fragment, container, false);
    }
}
