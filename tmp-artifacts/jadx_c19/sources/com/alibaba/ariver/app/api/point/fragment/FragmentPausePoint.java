package com.alibaba.ariver.app.api.point.fragment;

import androidx.fragment.app.Fragment;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.kernel.api.extension.Extension;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface FragmentPausePoint extends Extension {
    void onPause(Page page, Fragment fragment);
}
