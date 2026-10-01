package o;

import android.graphics.Rect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class noCache extends mustRevalidate {
    private static int asBinder = 0;
    private static int onTransact = 1;
    private final double IAuthTabCallback;
    private final Float IAuthTabCallbackStub;
    private final Float asInterface;
    private final Float onExtraCallback;
    private final int[] onExtraCallbackWithResult;
    private final Float onNavigationEvent;
    private final float[] onWarmupCompleted;

    public noCache(double d, @NotNull int[] iArr, @NotNull float[] fArr, @Nullable Float f, @Nullable Float f2, @Nullable Float f3, @Nullable Float f4) {
        Intrinsics.checkNotNullParameter(iArr, "");
        Intrinsics.checkNotNullParameter(fArr, "");
        this.IAuthTabCallback = d;
        this.onExtraCallbackWithResult = iArr;
        this.onWarmupCompleted = fArr;
        this.asInterface = f;
        this.IAuthTabCallbackStub = f2;
        this.onNavigationEvent = f3;
        this.onExtraCallback = f4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ noCache(double d, int[] iArr, float[] fArr, Float f, Float f2, Float f3, Float f4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        double d2;
        Float f5;
        Float f6;
        Float f7;
        Float f8;
        if ((i & 1) != 0) {
            int i2 = onTransact + 69;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            d2 = 0.0d;
        } else {
            d2 = d;
        }
        if ((i & 8) != 0) {
            int i5 = onTransact + 83;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            f5 = null;
        } else {
            f5 = f;
        }
        if ((i & 16) != 0) {
            int i7 = 2 % 2;
            f6 = null;
        } else {
            f6 = f2;
        }
        if ((i & 32) != 0) {
            int i8 = asBinder + 41;
            onTransact = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 0 / 0;
            }
            f7 = null;
        } else {
            f7 = f3;
        }
        if ((i & 64) != 0) {
            int i10 = 2 % 2;
            f8 = null;
        } else {
            f8 = f4;
        }
        this(d2, iArr, fArr, f5, f6, f7, f8);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(@NotNull Rect rect) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(rect, "");
        float fWidth = rect.width();
        float fHeight = rect.height();
        if (this.asInterface != null && this.IAuthTabCallbackStub != null) {
            int i2 = onTransact;
            int i3 = i2 + 45;
            asBinder = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            if (this.onNavigationEvent != null && this.onExtraCallback != null) {
                int i4 = i2 + 71;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                sMaxAgeSeconds.IAuthTabCallback(onNavigationEvent(), fWidth, fHeight, this.asInterface.floatValue(), this.IAuthTabCallbackStub.floatValue(), this.onNavigationEvent.floatValue(), this.onExtraCallback.floatValue(), this.onExtraCallbackWithResult, this.onWarmupCompleted, 0.0f, 0.0f, 768, null);
                return;
            }
        }
        sMaxAgeSeconds.onWarmupCompleted(onNavigationEvent(), fWidth, fHeight, this.IAuthTabCallback, this.onExtraCallbackWithResult, this.onWarmupCompleted, 0.0f, 0.0f, 96, null);
        int i6 = asBinder + 9;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
    }
}
