package com.reactnativepagerview;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.viewmanagers.RNCViewPagerManagerDelegate;
import com.facebook.react.viewmanagers.RNCViewPagerManagerInterface;
import com.facebook.soloader.SoLoader;
import com.initech.pkix.cmp.client.util.URI;
import com.reactnativepagerview.PagerViewViewManager$;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CredentialProviderGetSignInIntentControllerhandleResponse2;
import o.convertToGoogleIdTokenOption;
import o.hasStableIds;
import o.notifyItemRangeChanged;
import o.notifyItemRangeInserted;
import o.notifyItemRemoved;
import o.onAttachedToRecyclerView;
import o.onDetachedFromRecyclerView;
import o.onFailedToRecycleView;
import o.r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI;
import o.r8lambdaXf3l0PkPKOo1rTArgwmrPM3pKtc;
import o.r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ReactModule(IAuthTabCallback = "RNCViewPager")
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class PagerViewViewManager extends ViewGroupManager<NestedScrollableHost> implements RNCViewPagerManagerInterface<NestedScrollableHost> {
    public static final onWarmupCompleted Companion = new onWarmupCompleted((DefaultConstructorMarker) null);
    private final r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ<NestedScrollableHost> mDelegate;

    @ReactProp(IAuthTabCallbackStub = "keyboardDismissMode")
    public void setKeyboardDismissMode(@Nullable NestedScrollableHost nestedScrollableHost, @Nullable String str) {
    }

    @ReactProp(IAuthTabCallbackStub = "overdrag")
    public void setOverdrag(@Nullable NestedScrollableHost nestedScrollableHost, boolean z) {
    }

    public PagerViewViewManager() {
        super((ReactApplicationContext) null, 1, (DefaultConstructorMarker) null);
        this.mDelegate = new RNCViewPagerManagerDelegate(this);
    }

    static {
        String str = hasStableIds.IAuthTabCallback;
        if (str != null) {
            SoLoader.IAuthTabCallback(str);
        }
    }

    public r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ<NestedScrollableHost> getDelegate() {
        return this.mDelegate;
    }

    public String getName() {
        return "RNCViewPager";
    }

    public void receiveCommand(@NotNull NestedScrollableHost nestedScrollableHost, @NotNull String str, @Nullable ReadableArray readableArray) {
        Intrinsics.checkNotNullParameter(nestedScrollableHost, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.mDelegate.onNavigationEvent(nestedScrollableHost, str, readableArray);
    }

    public NestedScrollableHost createViewInstance(@NotNull CredentialProviderGetSignInIntentControllerhandleResponse2 credentialProviderGetSignInIntentControllerhandleResponse2) {
        Intrinsics.checkNotNullParameter(credentialProviderGetSignInIntentControllerhandleResponse2, "");
        NestedScrollableHost nestedScrollableHost = new NestedScrollableHost(credentialProviderGetSignInIntentControllerhandleResponse2);
        nestedScrollableHost.setId(View.generateViewId());
        nestedScrollableHost.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        nestedScrollableHost.setSaveEnabled(false);
        ViewPager2 viewPager2 = new ViewPager2(credentialProviderGetSignInIntentControllerhandleResponse2);
        viewPager2.setAdapter(new notifyItemRemoved());
        viewPager2.setSaveEnabled(false);
        viewPager2.post(new PagerViewViewManager$.ExternalSyntheticLambda0(viewPager2, credentialProviderGetSignInIntentControllerhandleResponse2, nestedScrollableHost));
        notifyItemRangeInserted.onWarmupCompleted(notifyItemRangeInserted.onNavigationEvent(viewPager2));
        nestedScrollableHost.addView(viewPager2);
        return nestedScrollableHost;
    }

    public static final class IAuthTabCallback extends ViewPager2.OnPageChangeCallback {
        final /* synthetic */ CredentialProviderGetSignInIntentControllerhandleResponse2 onExtraCallback;
        final /* synthetic */ NestedScrollableHost onExtraCallbackWithResult;

        IAuthTabCallback(CredentialProviderGetSignInIntentControllerhandleResponse2 credentialProviderGetSignInIntentControllerhandleResponse2, NestedScrollableHost nestedScrollableHost) {
            this.onExtraCallback = credentialProviderGetSignInIntentControllerhandleResponse2;
            this.onExtraCallbackWithResult = nestedScrollableHost;
        }

        public void onPageScrolled(int i, float f, int i2) {
            super.onPageScrolled(i, f, i2);
            EventDispatcher eventDispatcherOnExtraCallbackWithResult = r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI.onExtraCallbackWithResult(this.onExtraCallback, this.onExtraCallbackWithResult.getId());
            if (eventDispatcherOnExtraCallbackWithResult != null) {
                eventDispatcherOnExtraCallbackWithResult.onWarmupCompleted(new onDetachedFromRecyclerView(this.onExtraCallbackWithResult.getId(), i, f));
            }
        }

        public void onPageSelected(int i) {
            super.onPageSelected(i);
            EventDispatcher eventDispatcherOnExtraCallbackWithResult = r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI.onExtraCallbackWithResult(this.onExtraCallback, this.onExtraCallbackWithResult.getId());
            if (eventDispatcherOnExtraCallbackWithResult != null) {
                eventDispatcherOnExtraCallbackWithResult.onWarmupCompleted(new onFailedToRecycleView(this.onExtraCallbackWithResult.getId(), i));
            }
        }

        public void onPageScrollStateChanged(int i) {
            String str;
            super.onPageScrollStateChanged(i);
            if (i == 0) {
                str = "idle";
            } else if (i == 1) {
                str = "dragging";
            } else if (i == 2) {
                str = "settling";
            } else {
                throw new IllegalStateException("Unsupported pageScrollState");
            }
            EventDispatcher eventDispatcherOnExtraCallbackWithResult = r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI.onExtraCallbackWithResult(this.onExtraCallback, this.onExtraCallbackWithResult.getId());
            if (eventDispatcherOnExtraCallbackWithResult != null) {
                eventDispatcherOnExtraCallbackWithResult.onWarmupCompleted(new onAttachedToRecyclerView(this.onExtraCallbackWithResult.getId(), str));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createViewInstance$lambda$0(ViewPager2 viewPager2, CredentialProviderGetSignInIntentControllerhandleResponse2 credentialProviderGetSignInIntentControllerhandleResponse2, NestedScrollableHost nestedScrollableHost) {
        viewPager2.onExtraCallbackWithResult(new IAuthTabCallback(credentialProviderGetSignInIntentControllerhandleResponse2, nestedScrollableHost));
        EventDispatcher eventDispatcherOnExtraCallbackWithResult = r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI.onExtraCallbackWithResult(credentialProviderGetSignInIntentControllerhandleResponse2, nestedScrollableHost.getId());
        if (eventDispatcherOnExtraCallbackWithResult != null) {
            eventDispatcherOnExtraCallbackWithResult.onWarmupCompleted(new onFailedToRecycleView(nestedScrollableHost.getId(), viewPager2.onNavigationEvent()));
        }
    }

    public void addView(@NotNull NestedScrollableHost nestedScrollableHost, @NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(nestedScrollableHost, "");
        Intrinsics.checkNotNullParameter(view, "");
        notifyItemRangeChanged.onExtraCallbackWithResult.onWarmupCompleted(nestedScrollableHost, view, i);
    }

    public int getChildCount(@NotNull NestedScrollableHost nestedScrollableHost) {
        Intrinsics.checkNotNullParameter(nestedScrollableHost, "");
        return notifyItemRangeChanged.onExtraCallbackWithResult.onNavigationEvent(nestedScrollableHost);
    }

    public View getChildAt(@NotNull NestedScrollableHost nestedScrollableHost, int i) {
        Intrinsics.checkNotNullParameter(nestedScrollableHost, "");
        return notifyItemRangeChanged.onExtraCallbackWithResult.onExtraCallback(nestedScrollableHost, i);
    }

    public void removeView(@NotNull NestedScrollableHost nestedScrollableHost, @NotNull View view) {
        Intrinsics.checkNotNullParameter(nestedScrollableHost, "");
        Intrinsics.checkNotNullParameter(view, "");
        notifyItemRangeChanged.onExtraCallbackWithResult.onExtraCallback(nestedScrollableHost, view);
    }

    public void removeAllViews(@NotNull NestedScrollableHost nestedScrollableHost) {
        Intrinsics.checkNotNullParameter(nestedScrollableHost, "");
        notifyItemRangeChanged.onExtraCallbackWithResult.onExtraCallbackWithResult(nestedScrollableHost);
    }

    public void removeViewAt(@NotNull NestedScrollableHost nestedScrollableHost, int i) {
        Intrinsics.checkNotNullParameter(nestedScrollableHost, "");
        notifyItemRangeChanged.onExtraCallbackWithResult.IAuthTabCallback(nestedScrollableHost, i);
    }

    public boolean needsCustomLayoutForChildren() {
        return notifyItemRangeChanged.onExtraCallbackWithResult.onNavigationEvent();
    }

    @ReactProp(IAuthTabCallbackStub = "scrollEnabled", onExtraCallbackWithResult = URI.ENABLE_BACKWARDS_COMPATIBILITY)
    public void setScrollEnabled(@Nullable NestedScrollableHost nestedScrollableHost, boolean z) {
        if (nestedScrollableHost != null) {
            notifyItemRangeChanged.onExtraCallbackWithResult.onExtraCallback(nestedScrollableHost, z);
        }
    }

    @ReactProp(IAuthTabCallbackStub = "layoutDirection")
    public void setLayoutDirection(@Nullable NestedScrollableHost nestedScrollableHost, @Nullable String str) {
        if (nestedScrollableHost == null || str == null) {
            return;
        }
        notifyItemRangeChanged.onExtraCallbackWithResult.onExtraCallback(nestedScrollableHost, str);
    }

    @ReactProp(IAuthTabCallbackStub = "initialPage", onExtraCallback = 0)
    public void setInitialPage(@Nullable NestedScrollableHost nestedScrollableHost, int i) {
        if (nestedScrollableHost != null) {
            notifyItemRangeChanged.onExtraCallbackWithResult.onExtraCallbackWithResult(nestedScrollableHost, i);
        }
    }

    @ReactProp(IAuthTabCallbackStub = "orientation")
    public void setOrientation(@Nullable NestedScrollableHost nestedScrollableHost, @Nullable String str) {
        if (nestedScrollableHost == null || str == null) {
            return;
        }
        notifyItemRangeChanged.onExtraCallbackWithResult.onWarmupCompleted(nestedScrollableHost, str);
    }

    @ReactProp(IAuthTabCallbackStub = "offscreenPageLimit", onExtraCallback = -1)
    public void setOffscreenPageLimit(@Nullable NestedScrollableHost nestedScrollableHost, int i) {
        if (nestedScrollableHost != null) {
            notifyItemRangeChanged.onExtraCallbackWithResult.onNavigationEvent(nestedScrollableHost, i);
        }
    }

    @ReactProp(IAuthTabCallbackStub = "pageMargin", onExtraCallback = 0)
    public void setPageMargin(@Nullable NestedScrollableHost nestedScrollableHost, int i) {
        if (nestedScrollableHost != null) {
            notifyItemRangeChanged.onExtraCallbackWithResult.onWarmupCompleted(nestedScrollableHost, i);
        }
    }

    @ReactProp(IAuthTabCallbackStub = "overScrollMode")
    public void setOverScrollMode(@Nullable NestedScrollableHost nestedScrollableHost, @Nullable String str) {
        if (nestedScrollableHost == null || str == null) {
            return;
        }
        notifyItemRangeChanged.onExtraCallbackWithResult.onExtraCallbackWithResult(nestedScrollableHost, str);
    }

    public final void goTo(@Nullable NestedScrollableHost nestedScrollableHost, int i, boolean z) {
        if (nestedScrollableHost == null) {
            return;
        }
        notifyItemRangeChanged notifyitemrangechanged = notifyItemRangeChanged.onExtraCallbackWithResult;
        ViewPager2 viewPager2OnExtraCallback = notifyitemrangechanged.onExtraCallback(nestedScrollableHost);
        convertToGoogleIdTokenOption.onExtraCallbackWithResult(viewPager2OnExtraCallback);
        RecyclerView.Adapter adapterOnWarmupCompleted = viewPager2OnExtraCallback.onWarmupCompleted();
        Integer numValueOf = adapterOnWarmupCompleted != null ? Integer.valueOf(adapterOnWarmupCompleted.getItemCount()) : null;
        if (numValueOf == null || numValueOf.intValue() <= 0 || i < 0 || i >= numValueOf.intValue()) {
            return;
        }
        notifyitemrangechanged.onExtraCallbackWithResult(viewPager2OnExtraCallback, i, z);
    }

    public void setPage(@Nullable NestedScrollableHost nestedScrollableHost, int i) {
        goTo(nestedScrollableHost, i, true);
    }

    public void setPageWithoutAnimation(@Nullable NestedScrollableHost nestedScrollableHost, int i) {
        goTo(nestedScrollableHost, i, false);
    }

    public void setScrollEnabledImperatively(@Nullable NestedScrollableHost nestedScrollableHost, boolean z) {
        if (nestedScrollableHost != null) {
            notifyItemRangeChanged.onExtraCallbackWithResult.onExtraCallback(nestedScrollableHost, z);
        }
    }

    public Map<String, Map<String, String>> getExportedCustomDirectEventTypeConstants() {
        return r8lambdaXf3l0PkPKOo1rTArgwmrPM3pKtc.onNavigationEvent("topPageScroll", r8lambdaXf3l0PkPKOo1rTArgwmrPM3pKtc.onWarmupCompleted("registrationName", "onPageScroll"), "topPageScrollStateChanged", r8lambdaXf3l0PkPKOo1rTArgwmrPM3pKtc.onWarmupCompleted("registrationName", "onPageScrollStateChanged"), "topPageSelected", r8lambdaXf3l0PkPKOo1rTArgwmrPM3pKtc.onWarmupCompleted("registrationName", "onPageSelected"));
    }
}
