package im.toss.core.widget;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.widget.ProgressBar;
import im.toss.core.widget.SmoothProgressBar$;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SmoothProgressBar extends ProgressBar {
    private static int asBinder = 1;
    private static int onExtraCallbackWithResult;
    private final Handler IAuthTabCallback;
    private final Handler onExtraCallback;
    private boolean onNavigationEvent;
    private final Handler.Callback onWarmupCompleted;

    public static /* synthetic */ void onNavigationEvent(SmoothProgressBar smoothProgressBar) {
        int i = 2 % 2;
        int i2 = asBinder + 109;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(smoothProgressBar);
        int i4 = asBinder + 9;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ boolean onNavigationEvent(SmoothProgressBar smoothProgressBar, Message message) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onExtraCallback(smoothProgressBar, message);
            obj.hashCode();
            throw null;
        }
        boolean zOnExtraCallback = onExtraCallback(smoothProgressBar, message);
        int i3 = asBinder + 61;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return zOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    public final void setShowing(boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        this.onNavigationEvent = z;
        int i5 = i3 + 37;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059 A[PHI: r1
      0x0059: PHI (r1v10 int) = (r1v4 int), (r1v24 int) binds: [B:8:0x001f, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0093 A[PHI: r1 r5 r6 r9
      0x0093: PHI (r1v16 int) = (r1v15 int), (r1v23 int) binds: [B:20:0x0091, B:17:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x0093: PHI (r5v10 int) = (r5v9 int), (r5v13 int) binds: [B:20:0x0091, B:17:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x0093: PHI (r6v2 int) = (r6v1 int), (r6v5 int) binds: [B:20:0x0091, B:17:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x0093: PHI (r9v8 java.lang.Integer) = (r9v7 java.lang.Integer), (r9v13 java.lang.Integer) binds: [B:20:0x0091, B:17:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ab A[PHI: r1 r5 r6 r9
      0x00ab: PHI (r1v20 int) = (r1v15 int), (r1v23 int) binds: [B:20:0x0091, B:17:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x00ab: PHI (r5v12 int) = (r5v9 int), (r5v13 int) binds: [B:20:0x0091, B:17:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x00ab: PHI (r6v4 int) = (r6v1 int), (r6v5 int) binds: [B:20:0x0091, B:17:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x00ab: PHI (r9v11 java.lang.Integer) = (r9v7 java.lang.Integer), (r9v13 java.lang.Integer) binds: [B:20:0x0091, B:17:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final boolean onExtraCallback(SmoothProgressBar smoothProgressBar, Message message) {
        int i;
        int i2;
        int i3;
        Integer num;
        int i4;
        int iMin;
        int i5 = 2 % 2;
        int i6 = onExtraCallbackWithResult + 115;
        asBinder = i6 % 128;
        if (i6 % 2 == 0) {
            Intrinsics.checkNotNullParameter(message, "");
            i = message.what;
            if (i == 1) {
                int i7 = asBinder + 73;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                int i9 = message.arg1;
                Object obj = message.obj;
                Intrinsics.checkNotNull(obj, "");
                int iIntValue = ((Integer) obj).intValue();
                int iCeil = (int) Math.ceil((iIntValue - i9) / (message.arg2 / 16.0f));
                i = iIntValue > i9 ? 1 : 0;
                Handler handler = smoothProgressBar.onExtraCallback;
                handler.sendMessage(handler.obtainMessage(2, iCeil, iIntValue, Integer.valueOf(i)));
            } else if (i == 2) {
                int i10 = onExtraCallbackWithResult + 117;
                asBinder = i10 % 128;
                if (i10 % 2 == 0) {
                    int progress = smoothProgressBar.getProgress();
                    i2 = message.arg1;
                    i3 = message.arg2;
                    Object obj2 = message.obj;
                    Intrinsics.checkNotNull(obj2, "");
                    num = (Integer) obj2;
                    i4 = progress >> i2;
                    if (num.intValue() == 0) {
                        int i11 = onExtraCallbackWithResult + 43;
                        asBinder = i11 % 128;
                        if (i11 % 2 == 0) {
                            iMin = Math.min(i3, i4);
                            int i12 = 21 / 0;
                        } else {
                            iMin = Math.min(i3, i4);
                        }
                    } else {
                        iMin = Math.max(i3, i4);
                    }
                } else {
                    int progress2 = smoothProgressBar.getProgress();
                    i2 = message.arg1;
                    i3 = message.arg2;
                    Object obj3 = message.obj;
                    Intrinsics.checkNotNull(obj3, "");
                    num = (Integer) obj3;
                    i4 = progress2 + i2;
                    if (num.intValue() == 1) {
                    }
                }
                if (iMin == i3) {
                    int i13 = asBinder + 91;
                    onExtraCallbackWithResult = i13 % 128;
                    if (i13 % 2 != 0) {
                        int i14 = 5 % 2;
                    }
                    i = 1;
                }
                smoothProgressBar.setProgress(iMin);
                if (i == 0) {
                    Handler handler2 = smoothProgressBar.onExtraCallback;
                    handler2.sendMessage(handler2.obtainMessage(2, i2, i3, num));
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(message, "");
            i = message.what;
            if (i == 1) {
            }
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmoothProgressBar(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        SmoothProgressBar$.ExternalSyntheticLambda0 externalSyntheticLambda0 = new SmoothProgressBar$.ExternalSyntheticLambda0(this);
        this.onWarmupCompleted = externalSyntheticLambda0;
        this.onExtraCallback = new Handler(Looper.getMainLooper(), externalSyntheticLambda0);
        this.IAuthTabCallback = new Handler(Looper.getMainLooper());
        IAuthTabCallback();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmoothProgressBar(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        SmoothProgressBar$.ExternalSyntheticLambda0 externalSyntheticLambda0 = new SmoothProgressBar$.ExternalSyntheticLambda0(this);
        this.onWarmupCompleted = externalSyntheticLambda0;
        this.onExtraCallback = new Handler(Looper.getMainLooper(), externalSyntheticLambda0);
        this.IAuthTabCallback = new Handler(Looper.getMainLooper());
        IAuthTabCallback();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmoothProgressBar(@NotNull Context context, @NotNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        SmoothProgressBar$.ExternalSyntheticLambda0 externalSyntheticLambda0 = new SmoothProgressBar$.ExternalSyntheticLambda0(this);
        this.onWarmupCompleted = externalSyntheticLambda0;
        this.onExtraCallback = new Handler(Looper.getMainLooper(), externalSyntheticLambda0);
        this.IAuthTabCallback = new Handler(Looper.getMainLooper());
        IAuthTabCallback();
    }

    private final void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        setIndeterminate(false);
    }

    private static final void onWarmupCompleted(SmoothProgressBar smoothProgressBar) {
        int i = 2 % 2;
        smoothProgressBar.onNavigationEvent = true;
        smoothProgressBar.setVisibility(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(300L);
        smoothProgressBar.startAnimation(alphaAnimation);
        int i2 = onExtraCallbackWithResult + 9;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public final void onExtraCallbackWithResult(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 87;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int progress = getProgress();
        this.onExtraCallback.removeMessages(1);
        this.onExtraCallback.removeMessages(2);
        Handler handler = this.onExtraCallback;
        handler.sendMessage(handler.obtainMessage(1, progress, 300, Integer.valueOf(i)));
        int i5 = asBinder + 25;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }
}
