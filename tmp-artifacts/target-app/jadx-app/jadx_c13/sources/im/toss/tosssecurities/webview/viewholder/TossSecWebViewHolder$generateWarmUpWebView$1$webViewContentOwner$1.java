package im.toss.tosssecurities.webview.viewholder;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import im.toss.base.BaseActivity;
import im.toss.core.webkit.TossCoreWebView;
import im.toss.core.webkit.WebViewContentOwner;
import im.toss.core.widget.TransparentAppBarLayout;
import im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$;
import im.toss.tosssecurities.webview.TossSecuritiesWebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.CacheInterceptorcacheWritingResponsecacheWritingSource1;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.accesscombine;
import o.decodeRegion;
import o.deserializeUriNullableCollection;
import o.getByteBuffer;
import o.hasVaryAll;
import o.manualPushStack;
import o.setTopGuideFont;
import o.w_;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TossSecWebViewHolder$generateWarmUpWebView$1$webViewContentOwner$1 implements WebViewContentOwner, setTopGuideFont, decodeRegion {
    private static int asBinder = 1;
    private static int onTransact;
    private final /* synthetic */ decodeRegion IAuthTabCallback;
    private final TextFieldKeyInputExternalSyntheticLambda9 IAuthTabCallbackDefault;
    private final TossSecuritiesWebView IAuthTabCallbackStub;
    private final /* synthetic */ setTopGuideFont onExtraCallback;
    final /* synthetic */ Context onExtraCallbackWithResult;
    final /* synthetic */ TossSecuritiesWebView onNavigationEvent;
    final /* synthetic */ w_ onWarmupCompleted;

    public getByteBuffer<Boolean> getMainTabBarVisibleState() {
        int i = 2 % 2;
        int i2 = asBinder + 95;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        getByteBuffer<Boolean> mainTabBarVisibleState = this.IAuthTabCallback.getMainTabBarVisibleState();
        int i4 = onTransact + 57;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return mainTabBarVisibleState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean isMainTabBarCurrentlyVisible() {
        int i = 2 % 2;
        int i2 = asBinder + 99;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsMainTabBarCurrentlyVisible = this.IAuthTabCallback.isMainTabBarCurrentlyVisible();
        int i4 = onTransact + 91;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 36 / 0;
        }
        return zIsMainTabBarCurrentlyVisible;
    }

    public boolean isTabBarAlwaysOpaque() {
        int i = 2 % 2;
        int i2 = onTransact + 73;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        decodeRegion decoderegion = this.IAuthTabCallback;
        if (i3 != 0) {
            return decoderegion.isTabBarAlwaysOpaque();
        }
        decoderegion.isTabBarAlwaysOpaque();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onMainTabBarVisibilityChanged(boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 107;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            this.IAuthTabCallback.onMainTabBarVisibilityChanged(z);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.IAuthTabCallback.onMainTabBarVisibilityChanged(z);
        int i3 = onTransact + 3;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
    }

    public void setAppBarLayoutVisibility(boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 41;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallback.setAppBarLayoutVisibility(z);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean shouldAnimateMainTabBarVisibility() {
        int i = 2 % 2;
        int i2 = asBinder + 111;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        boolean zShouldAnimateMainTabBarVisibility = this.IAuthTabCallback.shouldAnimateMainTabBarVisibility();
        int i4 = asBinder + 93;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return zShouldAnimateMainTabBarVisibility;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TossSecWebViewHolder$generateWarmUpWebView$1$webViewContentOwner$1(w_ w_Var, TossSecuritiesWebView tossSecuritiesWebView, Context context) {
        Fragment fragment;
        TextFieldKeyInputExternalSyntheticLambda9 lifecycle;
        this.onWarmupCompleted = w_Var;
        this.onNavigationEvent = tossSecuritiesWebView;
        this.onExtraCallbackWithResult = context;
        this.onExtraCallback = w_.onTransact(w_Var);
        this.IAuthTabCallback = w_.asInterface(w_Var);
        this.IAuthTabCallbackStub = tossSecuritiesWebView;
        Fragment fragmentOnExtraCallbackWithResult = w_.onExtraCallbackWithResult(w_Var);
        if (fragmentOnExtraCallbackWithResult instanceof Fragment) {
            fragment = fragmentOnExtraCallbackWithResult;
            int i = asBinder + 17;
            onTransact = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } else {
            fragment = null;
        }
        if (fragment != null) {
            int i4 = asBinder + 21;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            lifecycle = CacheInterceptorcacheWritingResponsecacheWritingSource1.onExtraCallback(fragment);
            if (i5 != 0) {
                int i6 = 70 / 0;
                if (lifecycle == null) {
                    lifecycle = w_.onExtraCallbackWithResult(w_Var).getLifecycle();
                }
            } else if (lifecycle == null) {
            }
        }
        this.IAuthTabCallbackDefault = lifecycle;
        int i7 = asBinder + 5;
        onTransact = i7 % 128;
        int i8 = i7 % 2;
    }

    public /* bridge */ ViewGroup getCaWebViewContainer() {
        int i = 2 % 2;
        int i2 = asBinder + 113;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        ViewGroup caWebViewContainer = super.getCaWebViewContainer();
        if (i3 != 0) {
            int i4 = 99 / 0;
        }
        return caWebViewContainer;
    }

    public /* bridge */ Boolean getShouldWebViewPauseOnInvisible() {
        int i = 2 % 2;
        int i2 = onTransact + Imgproc.COLOR_YUV2RGBA_YVYU;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Boolean shouldWebViewPauseOnInvisible = super.getShouldWebViewPauseOnInvisible();
        int i4 = onTransact + 99;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return shouldWebViewPauseOnInvisible;
        }
        throw null;
    }

    public /* bridge */ Intent getSourceIntent() {
        Intent sourceIntent;
        int i = 2 % 2;
        int i2 = asBinder + 37;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            sourceIntent = super.getSourceIntent();
            int i3 = 40 / 0;
        } else {
            sourceIntent = super.getSourceIntent();
        }
        int i4 = onTransact + 89;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return sourceIntent;
    }

    public /* bridge */ String getSwipeRefreshCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 11;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        String swipeRefreshCallback = super.getSwipeRefreshCallback();
        int i4 = asBinder + 101;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return swipeRefreshCallback;
    }

    public /* synthetic */ TossCoreWebView getWebView() {
        TossSecuritiesWebView tossSecuritiesWebViewOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = asBinder + 17;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            tossSecuritiesWebViewOnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i3 = 98 / 0;
        } else {
            tossSecuritiesWebViewOnExtraCallbackWithResult = onExtraCallbackWithResult();
        }
        int i4 = asBinder + 87;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return tossSecuritiesWebViewOnExtraCallbackWithResult;
    }

    public /* bridge */ boolean handleCaWebViewBackPress(Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = onTransact + 65;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.startApp*/.handleCaWebViewBackPress(function0);
        }
        super/*o.startApp*/.handleCaWebViewBackPress(function0);
        throw null;
    }

    public /* bridge */ void onHistoryCleared() {
        int i = 2 % 2;
        int i2 = asBinder + 19;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.onHistoryCleared();
        if (i3 != 0) {
            int i4 = 15 / 0;
        }
    }

    public /* bridge */ void onPageReady() {
        int i = 2 % 2;
        int i2 = asBinder + 53;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.onPageReady();
        int i4 = asBinder + 103;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void onSwipeToRefresh(SwipeRefreshLayout swipeRefreshLayout) {
        int i = 2 % 2;
        int i2 = onTransact + 103;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super/*o.startApp*/.onSwipeToRefresh(swipeRefreshLayout);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = asBinder + 99;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void onUpdateWebHistoryState() {
        int i = 2 % 2;
        int i2 = asBinder + 71;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.onUpdateWebHistoryState();
        int i4 = asBinder + 3;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void setShouldWebViewPauseOnInvisible(Boolean bool) {
        int i = 2 % 2;
        int i2 = onTransact + 67;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.setShouldWebViewPauseOnInvisible(bool);
        int i4 = onTransact + 3;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 69 / 0;
        }
    }

    public /* bridge */ void setSwipeRefreshCallback(String str) {
        int i = 2 % 2;
        int i2 = onTransact + Imgproc.COLOR_YUV2RGBA_YVYU;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.setSwipeRefreshCallback(str);
        int i4 = onTransact + 31;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public TossSecuritiesWebView onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 51;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        TossSecuritiesWebView tossSecuritiesWebView = this.IAuthTabCallbackStub;
        int i5 = i3 + 7;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return tossSecuritiesWebView;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public TextFieldKeyInputExternalSyntheticLambda9 getLifecycle() {
        TextFieldKeyInputExternalSyntheticLambda9 textFieldKeyInputExternalSyntheticLambda9;
        int i = 2 % 2;
        int i2 = asBinder + 35;
        int i3 = i2 % 128;
        onTransact = i3;
        if (i2 % 2 != 0) {
            textFieldKeyInputExternalSyntheticLambda9 = this.IAuthTabCallbackDefault;
            int i4 = 56 / 0;
        } else {
            textFieldKeyInputExternalSyntheticLambda9 = this.IAuthTabCallbackDefault;
        }
        int i5 = i3 + 91;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return textFieldKeyInputExternalSyntheticLambda9;
    }

    public void setFullScreenEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 51;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        w_.IAuthTabCallback(this.onWarmupCompleted).onNavigationEvent(z);
        int i4 = onTransact + 113;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public FragmentActivity getActivity() {
        int i = 2 % 2;
        BaseActivity baseActivityOnNavigationEvent = accesscombine.onNavigationEvent(this.onExtraCallbackWithResult);
        if (baseActivityOnNavigationEvent != null) {
            return baseActivityOnNavigationEvent;
        }
        FragmentActivity fragmentActivityOnExtraCallback = hasVaryAll.onExtraCallback(this.onExtraCallbackWithResult);
        if (fragmentActivityOnExtraCallback instanceof FragmentActivity) {
            int i2 = asBinder + 35;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return fragmentActivityOnExtraCallback;
        }
        int i4 = asBinder + 29;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public Context getContext() {
        int i = 2 % 2;
        int i2 = asBinder + 59;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallbackWithResult;
        }
        throw null;
    }

    public View getView() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 63;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        TossCoreWebView tossCoreWebView = this.onNavigationEvent;
        int i5 = i2 + 109;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 57 / 0;
        }
        return tossCoreWebView;
    }

    public void putInstanceStateData(int i, Parcelable parcelable) {
        int i2 = 2 % 2;
        int i3 = asBinder + 95;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        w_.onExtraCallbackWithResult(this.onWarmupCompleted).putInstanceStateData(i, parcelable);
        if (i4 != 0) {
            int i5 = 9 / 0;
        }
    }

    public Parcelable getInstanceStateData(int i) {
        Parcelable instanceStateData;
        int i2 = 2 % 2;
        int i3 = onTransact + 91;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            instanceStateData = w_.onExtraCallbackWithResult(this.onWarmupCompleted).getInstanceStateData(i);
            int i4 = 7 / 0;
        } else {
            instanceStateData = w_.onExtraCallbackWithResult(this.onWarmupCompleted).getInstanceStateData(i);
        }
        int i5 = onTransact + 1;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return instanceStateData;
    }

    public void addSubscription(deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = onTransact + 47;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(deserializeurinullablecollection, "");
        w_.onExtraCallbackWithResult(this.onWarmupCompleted).addSubscription(deserializeurinullablecollection);
        int i4 = asBinder + 21;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void removeSubscription(deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = asBinder + 71;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(deserializeurinullablecollection, "");
            w_.onExtraCallbackWithResult(this.onWarmupCompleted).removeSubscription(deserializeurinullablecollection);
            int i3 = 66 / 0;
        } else {
            Intrinsics.checkNotNullParameter(deserializeurinullablecollection, "");
            w_.onExtraCallbackWithResult(this.onWarmupCompleted).removeSubscription(deserializeurinullablecollection);
        }
        int i4 = asBinder + 17;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setSwipeRefreshEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 9;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        this.onNavigationEvent.setPullToRefreshEnabled(z);
        int i4 = asBinder + 101;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public boolean isSwipeRefreshEnabled() {
        boolean zExtraCommand;
        int i = 2 % 2;
        int i2 = asBinder + 35;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            zExtraCommand = this.onNavigationEvent.extraCommand();
            int i3 = 20 / 0;
        } else {
            zExtraCommand = this.onNavigationEvent.extraCommand();
        }
        int i4 = asBinder + 125;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return zExtraCommand;
    }

    public boolean closeWebView(String str, boolean z) {
        int i = 2 % 2;
        if (!onExtraCallbackWithResult().isAttachedToWindow()) {
            int i2 = onTransact + 55;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = asBinder + 85;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {this.onWarmupCompleted};
        if (i5 == 0) {
            int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
            return ((Boolean) ((Function1) w_.onExtraCallback(iOnNavigationEvent, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 998531608, -998531603, iOnNavigationEvent2)).invoke(str)).booleanValue();
        }
        int iOnNavigationEvent3 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent4 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        ((Boolean) ((Function1) w_.onExtraCallback(iOnNavigationEvent3, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 998531608, -998531603, iOnNavigationEvent4)).invoke(str)).booleanValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setTransparentAppBarMode(manualPushStack manualpushstack) {
        int i = 2 % 2;
        int i2 = asBinder + 5;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(manualpushstack, "");
            w_.onTransact(this.onWarmupCompleted).setTransparentAppBarMode(manualpushstack);
        } else {
            Intrinsics.checkNotNullParameter(manualpushstack, "");
            w_.onTransact(this.onWarmupCompleted).setTransparentAppBarMode(manualpushstack);
            throw null;
        }
    }

    public void setTransparentAppBarEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = onTransact + 67;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            w_.onTransact(this.onWarmupCompleted).setTransparentAppBarEnabled(z);
            int i3 = 12 / 0;
        } else {
            w_.onTransact(this.onWarmupCompleted).setTransparentAppBarEnabled(z);
        }
        int i4 = onTransact + Imgproc.COLOR_YUV2RGB_YVYU;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public TransparentAppBarLayout getVisibleTransparentAppBar() {
        int i = 2 % 2;
        int i2 = asBinder + 85;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        TransparentAppBarLayout visibleTransparentAppBar = w_.onTransact(this.onWarmupCompleted).getVisibleTransparentAppBar();
        int i4 = asBinder + 101;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return visibleTransparentAppBar;
        }
        throw null;
    }
}
