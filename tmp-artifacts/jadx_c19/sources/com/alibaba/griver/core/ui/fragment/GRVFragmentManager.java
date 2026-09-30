package com.alibaba.griver.core.ui.fragment;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.ariver.app.activity.DefaultFragmentManager;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.ui.fragment.RVFragment;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class GRVFragmentManager extends DefaultFragmentManager {
    public GRVFragmentManager(App app, int i2, FragmentActivity fragmentActivity) {
        super(app, i2, fragmentActivity);
    }

    @Override // com.alibaba.ariver.app.activity.DefaultFragmentManager, com.alibaba.ariver.app.api.ui.fragment.IFragmentManager
    public RVFragment createFragment() {
        return new GRVFragment();
    }

    public GRVFragmentManager(App app, int i2, Fragment fragment) {
        super(app, i2, fragment);
    }
}
