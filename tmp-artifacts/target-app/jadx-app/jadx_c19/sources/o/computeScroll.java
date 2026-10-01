package o;

import android.view.View;
import im.toss.ads_sdk.model.NativeAdsEventLogType;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class computeScroll {
    private static int asBinder = 1;
    private static int asInterface = 0;
    public static final int onExtraCallback = 8;
    private final clearOnPageChangeListeners IAuthTabCallback;
    private final getPageMargin IAuthTabCallbackDefault;
    private final AtomicBoolean IAuthTabCallbackStub;
    private View onExtraCallbackWithResult;
    private final dataSetChanged onNavigationEvent;
    private final executeKeyEvent onTransact;
    private final AtomicBoolean onWarmupCompleted;

    public computeScroll(@NotNull getPageMargin getpagemargin, @NotNull dataSetChanged datasetchanged, @NotNull executeKeyEvent executekeyevent, @NotNull clearOnPageChangeListeners clearonpagechangelisteners) {
        Intrinsics.checkNotNullParameter(getpagemargin, "");
        Intrinsics.checkNotNullParameter(datasetchanged, "");
        Intrinsics.checkNotNullParameter(executekeyevent, "");
        Intrinsics.checkNotNullParameter(clearonpagechangelisteners, "");
        this.IAuthTabCallbackDefault = getpagemargin;
        this.onNavigationEvent = datasetchanged;
        this.onTransact = executekeyevent;
        this.IAuthTabCallback = clearonpagechangelisteners;
        this.IAuthTabCallbackStub = new AtomicBoolean(false);
        this.onWarmupCompleted = new AtomicBoolean(false);
    }

    public final void onNavigationEvent() {
        int i2 = 2 % 2;
        int i3 = asBinder + 109;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        if ((!this.onWarmupCompleted.get()) && this.IAuthTabCallbackStub.compareAndSet(false, true)) {
            this.onTransact.onNavigationEvent(this.IAuthTabCallbackDefault);
            View view = this.onExtraCallbackWithResult;
            if (view != null) {
                int i5 = asBinder + 69;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
                onExtraCallback(view);
            }
            this.onExtraCallbackWithResult = null;
        }
    }

    public final void onNavigationEvent(@NotNull View view) {
        int i2 = 2 % 2;
        int i3 = asInterface + 61;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (this.onWarmupCompleted.get()) {
            return;
        }
        if (!this.IAuthTabCallbackStub.get()) {
            this.onExtraCallbackWithResult = view;
            return;
        }
        int i5 = asInterface + 45;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallback(view);
    }

    public final boolean IAuthTabCallback(@NotNull NativeAdsEventLogType nativeAdsEventLogType) {
        int i2 = 2 % 2;
        int i3 = asInterface + 115;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
            this.onWarmupCompleted.get();
            throw null;
        }
        Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
        if (!this.onWarmupCompleted.get()) {
            onNavigationEvent();
            return dataSetChanged.onExtraCallback(this.onNavigationEvent, this.IAuthTabCallbackDefault, nativeAdsEventLogType, this.onTransact, this.IAuthTabCallback, null, 16, null);
        }
        int i4 = asInterface + 77;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public final void IAuthTabCallback() {
        int i2 = 2 % 2;
        int i3 = asBinder + 109;
        asInterface = i3 % 128;
        if (i3 % 2 == 0 ? this.onWarmupCompleted.compareAndSet(false, true) : this.onWarmupCompleted.compareAndSet(true, false)) {
            this.onExtraCallbackWithResult = null;
            this.IAuthTabCallback.onExtraCallbackWithResult();
        }
        int i4 = asInterface + 5;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onExtraCallback(View view) {
        getCurrentItem getcurrentitem;
        int i2 = 2 % 2;
        executeKeyEvent executekeyevent = this.onTransact;
        if (executekeyevent instanceof getCurrentItem) {
            int i3 = asInterface + 89;
            asBinder = i3 % 128;
            getcurrentitem = (getCurrentItem) executekeyevent;
            if (i3 % 2 == 0) {
                int i4 = 62 / 0;
            }
        } else {
            int i5 = asBinder + 13;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            getcurrentitem = null;
        }
        if (getcurrentitem != null) {
            getcurrentitem.onExtraCallbackWithResult(view);
        }
    }
}
