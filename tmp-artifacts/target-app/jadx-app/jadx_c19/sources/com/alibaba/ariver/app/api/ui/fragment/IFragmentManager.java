package com.alibaba.ariver.app.api.ui.fragment;

import com.alibaba.ariver.app.api.Page;
import java.util.Set;
import o.FlowMeasureLazyPolicyExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface IFragmentManager {
    boolean attachFragment(RVFragment rVFragment, boolean z);

    RVFragment createFragment();

    boolean detachFragment(RVFragment rVFragment, boolean z);

    boolean exitPage(Page page, boolean z, boolean z2);

    RVFragment findFragmentForPage(Page page);

    RVFragment getFirstFragment();

    Set<RVFragment> getFragments();

    FlowMeasureLazyPolicyExternalSyntheticLambda3 getInnerManager();

    RVFragment getReadyFragment();

    RVFragment getTopFragment();

    void pushPage(Page page, RVFragment rVFragment, boolean z);

    void release();

    void resetFragmentToTop(RVFragment rVFragment);
}
