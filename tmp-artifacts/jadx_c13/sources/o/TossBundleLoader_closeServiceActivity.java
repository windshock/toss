package o;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.TossBundleLoader_closeServiceActivity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TossBundleLoader_closeServiceActivity {
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private Pair<Boolean, ? extends Function0<Unit>> IAuthTabCallback;
    private TossModule_isAllowedByPolicy asBinder;
    private final Handler onExtraCallback = new Handler(Looper.getMainLooper());
    private boolean onExtraCallbackWithResult;
    private ViewGroup onNavigationEvent;
    private boolean onWarmupCompleted;

    public static /* synthetic */ Unit onWarmupCompleted(TossBundleLoader_closeServiceActivity tossBundleLoader_closeServiceActivity, View view, Function0 function0) {
        int i = 2 % 2;
        int i2 = asInterface + 51;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(tossBundleLoader_closeServiceActivity, view, function0);
        }
        IAuthTabCallback(tossBundleLoader_closeServiceActivity, view, function0);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void IAuthTabCallback(@Nullable ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 81;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        this.onNavigationEvent = viewGroup;
        int i5 = i2 + 113;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void onExtraCallback(@Nullable TossModule_isAllowedByPolicy tossModule_isAllowedByPolicy) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 27;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        this.asBinder = tossModule_isAllowedByPolicy;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallback(@NotNull Runnable runnable, long j) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 65;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(runnable, "");
            this.onExtraCallback.postDelayed(runnable, j);
            throw null;
        }
        Intrinsics.checkNotNullParameter(runnable, "");
        this.onExtraCallback.postDelayed(runnable, j);
        int i3 = asInterface + 93;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface + 21;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        this.onExtraCallbackWithResult = false;
        this.IAuthTabCallback = null;
        this.onNavigationEvent = null;
        this.asBinder = null;
        int i5 = i3 + 67;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit IAuthTabCallback(TossBundleLoader_closeServiceActivity tossBundleLoader_closeServiceActivity, View view, Function0 function0) {
        int i = 2 % 2;
        try {
            ViewGroup viewGroup = tossBundleLoader_closeServiceActivity.onNavigationEvent;
            if (viewGroup != null) {
                int i2 = asInterface + 97;
                IAuthTabCallbackStub = i2 % 128;
                int i3 = i2 % 2;
                viewGroup.removeView(view);
            }
        } catch (Exception unused) {
        }
        tossBundleLoader_closeServiceActivity.onExtraCallbackWithResult();
        if (function0 != null) {
            int i4 = asInterface + 57;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public final void IAuthTabCallback(boolean z, @Nullable final Function0<Unit> function0) {
        int i = 2 % 2;
        if (!this.onWarmupCompleted) {
            this.IAuthTabCallback = getWrite.IAuthTabCallback(Boolean.valueOf(z), function0);
            return;
        }
        if (this.onExtraCallbackWithResult) {
            return;
        }
        this.onExtraCallbackWithResult = true;
        TossModule_isAllowedByPolicy tossModule_isAllowedByPolicy = this.asBinder;
        if (tossModule_isAllowedByPolicy != null) {
            final View viewIAuthTabCallback = tossModule_isAllowedByPolicy.IAuthTabCallback();
            if (z) {
                tossModule_isAllowedByPolicy.IAuthTabCallback(new Function0() { // from class: im.toss.uikit.widget.BridgeHandler$$ExternalSyntheticLambda0
                    private static int onExtraCallbackWithResult = 1;
                    private static int onWarmupCompleted;

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i2 = 2 % 2;
                        int i3 = onWarmupCompleted + 73;
                        onExtraCallbackWithResult = i3 % 128;
                        int i4 = i3 % 2;
                        Unit unitOnWarmupCompleted = TossBundleLoader_closeServiceActivity.onWarmupCompleted(this.f$0, viewIAuthTabCallback, function0);
                        int i5 = onWarmupCompleted + 81;
                        onExtraCallbackWithResult = i5 % 128;
                        if (i5 % 2 == 0) {
                            int i6 = 77 / 0;
                        }
                        return unitOnWarmupCompleted;
                    }
                });
            } else {
                try {
                    ViewGroup viewGroup = this.onNavigationEvent;
                    if (viewGroup != null) {
                        int i2 = IAuthTabCallbackStub + 45;
                        asInterface = i2 % 128;
                        if (i2 % 2 == 0) {
                            viewGroup.removeView(viewIAuthTabCallback);
                            int i3 = 38 / 0;
                        } else {
                            viewGroup.removeView(viewIAuthTabCallback);
                        }
                    }
                } catch (Exception unused) {
                }
                onExtraCallbackWithResult();
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
        this.onExtraCallback.removeCallbacksAndMessages(null);
        int i4 = asInterface + Imgproc.COLOR_YUV2RGBA_YVYU;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 49;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        if (this.onExtraCallbackWithResult) {
            return true;
        }
        int i5 = i3 + 109;
        int i6 = i5 % 128;
        asInterface = i6;
        int i7 = i5 % 2;
        if (this.asBinder != null) {
            return true;
        }
        int i8 = i6 + 35;
        IAuthTabCallbackStub = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public final void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface + 73;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        this.onWarmupCompleted = true;
        Pair<Boolean, ? extends Function0<Unit>> pair = this.IAuthTabCallback;
        if (pair != null) {
            IAuthTabCallback(pair.getFirst().booleanValue(), pair.getSecond());
        }
        int i4 = asInterface + 61;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
