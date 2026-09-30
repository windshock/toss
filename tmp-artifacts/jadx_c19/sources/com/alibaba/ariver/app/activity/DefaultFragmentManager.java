package com.alibaba.ariver.app.activity;

import android.os.Bundle;
import android.view.animation.Animation;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.R;
import com.alibaba.ariver.app.api.activity.AnimUtils;
import com.alibaba.ariver.app.api.ui.fragment.IFragmentManager;
import com.alibaba.ariver.app.api.ui.fragment.RVFragment;
import com.alibaba.ariver.app.api.ui.tabbar.TabBar;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.RVKernelUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.common.utils.RVTraceKey;
import com.alibaba.ariver.kernel.common.utils.RVTraceUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;
import o.FlowMeasureLazyPolicyExternalSyntheticLambda3;
import o.FlowRowOverflowCompanionExternalSyntheticLambda4;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class DefaultFragmentManager implements IFragmentManager {
    protected static final String READY_TAG = "mReadyFragment";
    private static final String TAG = "AriverInt:FragmentManager";
    protected FragmentActivity mActivity;
    protected App mApp;
    protected int mContentId;
    protected RVFragment mFirstFragment;
    protected FlowMeasureLazyPolicyExternalSyntheticLambda3 mFragmentManager;
    protected final Stack<RVFragment> mFragmentStack;
    protected Map<Page, RVFragment> mPageFragmentMap;
    protected final AtomicInteger mReadyCounter;
    protected RVFragment mReadyFragment;
    protected RVFragment mTopFragment;

    public DefaultFragmentManager(App app, int i2, FragmentActivity fragmentActivity) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        this.mReadyCounter = atomicInteger;
        this.mPageFragmentMap = new HashMap();
        this.mFragmentStack = new Stack<>();
        RVTraceUtils.traceBeginSection(RVTraceKey.RV_FragmentManager_constructor);
        if (RVKernelUtils.isDebug()) {
            FlowMeasureLazyPolicyExternalSyntheticLambda3.onExtraCallbackWithResult(true);
        }
        this.mApp = app;
        this.mActivity = fragmentActivity;
        this.mFragmentManager = fragmentActivity.getSupportFragmentManager();
        this.mContentId = i2;
        this.mReadyFragment = createFragment();
        Bundle bundle = new Bundle();
        bundle.putLong("ariverAppInstanceId", app.getNodeId());
        this.mReadyFragment.setArguments(bundle);
        this.mReadyFragment.setAlreadyScheduleAdded(true);
        this.mFragmentManager.onExtraCallbackWithResult().IAuthTabCallback(i2, this.mReadyFragment, READY_TAG + atomicInteger.addAndGet(1)).onWarmupCompleted(this.mReadyFragment).onExtraCallbackWithResult();
        RVTraceUtils.traceEndSection(RVTraceKey.RV_FragmentManager_constructor);
    }

    public DefaultFragmentManager(App app, int i2, Fragment fragment) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        this.mReadyCounter = atomicInteger;
        this.mPageFragmentMap = new HashMap();
        this.mFragmentStack = new Stack<>();
        this.mApp = app;
        this.mActivity = fragment.getActivity();
        this.mFragmentManager = fragment.getChildFragmentManager();
        this.mContentId = i2;
        this.mReadyFragment = createFragment();
        Bundle bundle = new Bundle();
        bundle.putLong("ariverAppInstanceId", app.getNodeId());
        this.mReadyFragment.setArguments(bundle);
        this.mReadyFragment.setAlreadyScheduleAdded(true);
        this.mFragmentManager.onExtraCallbackWithResult().IAuthTabCallback(i2, this.mReadyFragment, READY_TAG + atomicInteger.addAndGet(1)).onWarmupCompleted(this.mReadyFragment).onExtraCallbackWithResult();
    }

    @Override // com.alibaba.ariver.app.api.ui.fragment.IFragmentManager
    public RVFragment createFragment() {
        return new RVFragment();
    }

    @Override // com.alibaba.ariver.app.api.ui.fragment.IFragmentManager
    public FlowMeasureLazyPolicyExternalSyntheticLambda3 getInnerManager() {
        return this.mFragmentManager;
    }

    @Override // com.alibaba.ariver.app.api.ui.fragment.IFragmentManager
    public RVFragment findFragmentForPage(Page page) {
        return this.mPageFragmentMap.get(page);
    }

    @Override // com.alibaba.ariver.app.api.ui.fragment.IFragmentManager
    public void resetFragmentToTop(RVFragment rVFragment) {
        synchronized (this) {
            if (!this.mFragmentStack.empty() && this.mFragmentStack.remove(rVFragment)) {
                this.mFragmentStack.push(rVFragment);
            }
        }
    }

    @Override // com.alibaba.ariver.app.api.ui.fragment.IFragmentManager
    public void pushPage(Page page, RVFragment rVFragment, boolean z) {
        synchronized (this) {
            pushPage(page, rVFragment, this.mContentId, z);
        }
    }

    protected void pushPage(final Page page, RVFragment rVFragment, int i2, boolean z) {
        if (this.mApp.getAppContext() == null || this.mActivity.isFinishing() || rVFragment == null || this.mFragmentStack.contains(rVFragment)) {
            RVLogger.e(TAG, "pushPage with illegal state!!!");
            return;
        }
        RVLogger.d(TAG, "pushPage: " + page + " " + rVFragment + " useTranslateAnim: " + z);
        this.mPageFragmentMap.put(page, rVFragment);
        this.mTopFragment = rVFragment;
        if (this.mFragmentStack.isEmpty()) {
            this.mFirstFragment = rVFragment;
        }
        if (!this.mFragmentStack.isEmpty()) {
            RVFragment rVFragmentPeek = this.mFragmentStack.peek();
            rVFragmentPeek.pauseRender();
            detachFragment(rVFragmentPeek, z);
        }
        if (!this.mFragmentStack.contains(rVFragment)) {
            this.mFragmentStack.push(rVFragment);
        }
        if (this.mActivity.isFinishing()) {
            return;
        }
        RVTraceUtils.traceBeginSection(RVTraceKey.RV_FragmentManager_addFragment);
        FlowRowOverflowCompanionExternalSyntheticLambda4 flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult = this.mFragmentManager.onExtraCallbackWithResult();
        RVLogger.d(TAG, "add fragment");
        if (z) {
            try {
                RVLogger.d(TAG, "fragment use translate anim.");
                rVFragment.setShouldResumeWebView(true);
                int animResId = AnimUtils.getAnimResId(this.mActivity, RVFragment.TRANSLATE_IN_LEFT_ID);
                if (animResId == 0) {
                    animResId = R.anim.ariver_fragment_translate_in_left_default;
                }
                flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult.onExtraCallback(animResId, 0);
            } catch (Throwable th) {
                try {
                    RVLogger.e(TAG, "catch fragment exception ", th);
                    return;
                } finally {
                    RVTraceUtils.traceEndSection(RVTraceKey.RV_FragmentManager_addFragment);
                }
            }
        }
        if (rVFragment.isAdded() || rVFragment.isAlreadyScheduleAdded()) {
            flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult.onExtraCallbackWithResult(rVFragment);
        } else {
            flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult.IAuthTabCallback(i2, rVFragment);
        }
        flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult.onExtraCallbackWithResult();
        ExecutorUtils.runOnMain(new Runnable() { // from class: com.alibaba.ariver.app.activity.DefaultFragmentManager.1
            @Override // java.lang.Runnable
            public void run() {
                if (DefaultFragmentManager.this.mApp.isDestroyed()) {
                    return;
                }
                DefaultFragmentManager.this.checkTabBar(page);
            }
        });
    }

    @Override // com.alibaba.ariver.app.api.ui.fragment.IFragmentManager
    public boolean exitPage(Page page, boolean z, boolean z2) {
        synchronized (this) {
            if (this.mApp.getAppContext() != null && !this.mActivity.isFinishing() && !this.mFragmentManager.mayLaunchUrl()) {
                RVFragment rVFragmentRemove = this.mPageFragmentMap.remove(page);
                if (rVFragmentRemove == null) {
                    return false;
                }
                if (this.mFragmentStack.size() <= 1 && z2) {
                    return false;
                }
                if (rVFragmentRemove.getActivity() != null && rVFragmentRemove.getActivity().isFinishing()) {
                    return true;
                }
                RVLogger.d(TAG, "exitPage: " + page + " " + rVFragmentRemove + " fragmentStack: " + this.mFragmentStack.size() + " useTranslateAnim: " + z);
                boolean z3 = rVFragmentRemove == this.mFragmentStack.peek();
                this.mFragmentStack.remove(rVFragmentRemove);
                FlowRowOverflowCompanionExternalSyntheticLambda4 flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult = this.mFragmentManager.onExtraCallbackWithResult();
                if (z) {
                    if (BundleUtils.getBoolean(page.getStartParams(), RVParams.LONG_PUSHWINDOW_WITH_CUSTOM_TRANS_ANIM, false)) {
                        flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult.onExtraCallback(0, android.R.anim.fade_out);
                    } else {
                        int animResId = AnimUtils.getAnimResId(this.mActivity, RVFragment.TRANSLATE_OUT_RIGHT_ID);
                        if (animResId == 0) {
                            animResId = R.anim.ariver_fragment_translate_out_right_default;
                        }
                        int animResId2 = AnimUtils.getAnimResId(this.mActivity, RVFragment.TRANSLATE_IN_RIGHT_ID);
                        if (animResId2 == 0) {
                            animResId2 = R.anim.ariver_fragment_translate_in_right_default;
                        }
                        flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult.onExtraCallback(animResId2, animResId);
                    }
                }
                if (this.mFragmentStack.size() > 0) {
                    RVFragment rVFragmentPeek = this.mFragmentStack.peek();
                    if (z) {
                        rVFragmentPeek.setShouldResumeWebView(true);
                        rVFragmentPeek.setInExitPageWithAnimSchedule();
                    }
                    flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult.IAuthTabCallbackStub(rVFragmentPeek);
                    this.mTopFragment = rVFragmentPeek;
                }
                flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult.onNavigationEvent(rVFragmentRemove);
                flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult.onExtraCallbackWithResult();
                Page activePage = this.mApp.getActivePage();
                if (activePage != null && z3 && !this.mFragmentStack.isEmpty()) {
                    checkTabBar(activePage);
                }
                return true;
            }
            RVLogger.d(TAG, "activity is finishing");
            return false;
        }
    }

    @Override // com.alibaba.ariver.app.api.ui.fragment.IFragmentManager
    public void release() {
        synchronized (this) {
            this.mPageFragmentMap.clear();
            this.mFragmentStack.clear();
            this.mReadyFragment = null;
            this.mFirstFragment = null;
            this.mTopFragment = null;
        }
    }

    @Override // com.alibaba.ariver.app.api.ui.fragment.IFragmentManager
    public RVFragment getReadyFragment() {
        synchronized (this) {
            Fragment fragmentFindFragmentByTag = null;
            if (this.mReadyFragment != null) {
                if ((READY_TAG + this.mReadyCounter.get()).equals(this.mReadyFragment.getTag())) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("getReadyFragment hit field: ");
                    sb.append(this.mReadyCounter);
                    sb.append(" ");
                    sb.append(this.mReadyFragment != null);
                    RVLogger.d(TAG, sb.toString());
                    RVFragment rVFragment = this.mReadyFragment;
                    this.mReadyFragment = null;
                    fragmentFindFragmentByTag = rVFragment;
                }
            }
            if (fragmentFindFragmentByTag == null) {
                fragmentFindFragmentByTag = this.mFragmentManager.findFragmentByTag(READY_TAG + this.mReadyCounter.get());
            }
            if (fragmentFindFragmentByTag != null) {
                RVLogger.d(TAG, "getReadyFragment hit! mReadyCounter: " + this.mReadyCounter);
                this.mReadyCounter.incrementAndGet();
                return (RVFragment) fragmentFindFragmentByTag;
            }
            RVLogger.d(TAG, "getReadyFragment miss! mReadyCounter: " + this.mReadyCounter);
            return createFragment();
        }
    }

    @Override // com.alibaba.ariver.app.api.ui.fragment.IFragmentManager
    public Set<RVFragment> getFragments() {
        return new HashSet(this.mFragmentStack);
    }

    @Override // com.alibaba.ariver.app.api.ui.fragment.IFragmentManager
    public RVFragment getTopFragment() {
        return this.mTopFragment;
    }

    @Override // com.alibaba.ariver.app.api.ui.fragment.IFragmentManager
    public RVFragment getFirstFragment() {
        return this.mFirstFragment;
    }

    protected void checkTabBar(Page page) {
        TabBar tabBar;
        if (this.mApp.getAppContext() == null || (tabBar = this.mApp.getAppContext().getTabBar()) == null || page == null) {
            return;
        }
        boolean zIsTabPage = tabBar.isTabPage(page);
        if (zIsTabPage && !tabBar.isShowing() && tabBar.isAutoShow()) {
            if (!tabBar.isCreated()) {
                tabBar.show(page, (Animation) null);
                return;
            } else {
                tabBar.show((Page) null, (Animation) null);
                return;
            }
        }
        if (zIsTabPage || !tabBar.isShowing()) {
            return;
        }
        tabBar.hide((Animation) null);
    }

    @Override // com.alibaba.ariver.app.api.ui.fragment.IFragmentManager
    public boolean attachFragment(RVFragment rVFragment, boolean z) {
        synchronized (this) {
            if (!this.mActivity.isFinishing() && this.mApp.getAppContext() != null) {
                if (rVFragment != null && !rVFragment.isVisible()) {
                    RVLogger.d(TAG, "attachFragment: " + rVFragment);
                    checkTabBar(rVFragment.getPage());
                    this.mTopFragment = rVFragment;
                    FlowRowOverflowCompanionExternalSyntheticLambda4 flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult = this.mFragmentManager.onExtraCallbackWithResult();
                    if (z) {
                        rVFragment.setShouldResumeWebView(true);
                        int animResId = AnimUtils.getAnimResId(this.mActivity, RVFragment.TRANSLATE_IN_RIGHT_ID);
                        if (animResId == 0) {
                            animResId = R.anim.ariver_fragment_translate_in_right_default;
                        }
                        flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult.onExtraCallback(animResId, 0);
                    }
                    flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult.IAuthTabCallbackStub(rVFragment).onExtraCallbackWithResult();
                    return true;
                }
                return false;
            }
            RVLogger.d(TAG, "activity is finishing");
            return false;
        }
    }

    @Override // com.alibaba.ariver.app.api.ui.fragment.IFragmentManager
    public boolean detachFragment(RVFragment rVFragment, boolean z) {
        synchronized (this) {
            if (this.mActivity.isFinishing()) {
                RVLogger.d(TAG, "activity is finishing");
                return false;
            }
            if (rVFragment != null && !rVFragment.isHidden()) {
                RVLogger.d(TAG, "attachFragment: " + rVFragment);
                FlowRowOverflowCompanionExternalSyntheticLambda4 flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult = this.mFragmentManager.onExtraCallbackWithResult();
                if (z) {
                    try {
                        int animResId = AnimUtils.getAnimResId(this.mActivity, RVFragment.TRANSLATE_OUT_LEFT_ID);
                        if (animResId == 0) {
                            animResId = R.anim.ariver_fragment_translate_out_left_default;
                        }
                        flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult.onExtraCallback(0, animResId);
                    } catch (Throwable th) {
                        RVLogger.e(TAG, th);
                    }
                }
                flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult.IAuthTabCallback(rVFragment).onExtraCallbackWithResult();
                return true;
            }
            return false;
        }
    }
}
