package o;

import android.graphics.Rect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class maxAgeSeconds extends mustRevalidate {
    private static int IAuthTabCallbackStub = 1;
    private static int onTransact;
    private final Float IAuthTabCallback;
    private final Float onExtraCallback;
    private final int[] onExtraCallbackWithResult;
    private final Float onNavigationEvent;
    private final float[] onWarmupCompleted;

    public maxAgeSeconds(@NotNull int[] iArr, @NotNull float[] fArr, @Nullable Float f, @Nullable Float f2, @Nullable Float f3) {
        Intrinsics.checkNotNullParameter(iArr, "");
        Intrinsics.checkNotNullParameter(fArr, "");
        this.onExtraCallbackWithResult = iArr;
        this.onWarmupCompleted = fArr;
        this.onExtraCallback = f;
        this.onNavigationEvent = f2;
        this.IAuthTabCallback = f3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ maxAgeSeconds(int[] iArr, float[] fArr, Float f, Float f2, Float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Float f4;
        Float f5;
        if ((i & 4) != 0) {
            int i2 = onTransact;
            int i3 = i2 + 43;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 63;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            f4 = null;
        } else {
            f4 = f;
        }
        if ((i & 8) != 0) {
            int i8 = 2 % 2;
            f5 = null;
        } else {
            f5 = f2;
        }
        this(iArr, fArr, f4, f5, (i & 16) != 0 ? null : f3);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(@NotNull Rect rect) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(rect, "");
        float fWidth = rect.width();
        float fHeight = rect.height();
        if (this.onExtraCallback != null) {
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 79;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            if (this.onNavigationEvent != null && this.IAuthTabCallback != null) {
                int i5 = i2 + 105;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                sMaxAgeSeconds.onNavigationEvent(onNavigationEvent(), fWidth, fHeight, this.onExtraCallback.floatValue(), this.onNavigationEvent.floatValue(), this.IAuthTabCallback.floatValue(), this.onExtraCallbackWithResult, this.onWarmupCompleted, 0.0f, 0.0f, 384, null);
                return;
            }
        }
        sMaxAgeSeconds.IAuthTabCallback(onNavigationEvent(), fWidth, fHeight, this.onExtraCallbackWithResult, this.onWarmupCompleted, 0.0f, 0.0f, 48, null);
    }
}
