package o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import kotlin.Deprecated;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class deprecated_sMaxAgeSeconds extends Drawable {
    private static int asBinder = 0;
    private static int onTransact = 1;
    private final Paint IAuthTabCallback;
    private final Paint onExtraCallback;
    private float onExtraCallbackWithResult;
    private int onNavigationEvent;
    private int onWarmupCompleted;

    @Override // android.graphics.drawable.Drawable
    @Deprecated
    public int getOpacity() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 87;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 19;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return -3;
    }

    public deprecated_sMaxAgeSeconds(int i, int i2, float f) {
        this.onWarmupCompleted = i;
        this.onNavigationEvent = i2;
        this.onExtraCallbackWithResult = f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.onExtraCallback = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        this.IAuthTabCallback = paint2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ deprecated_sMaxAgeSeconds(int i, int i2, float f, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i3 & 2) != 0) {
            int i4 = onTransact;
            int i5 = i4 + 5;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 99;
            asBinder = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 2 % 2;
            }
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            int i9 = onTransact + 35;
            asBinder = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
            f = 0.0f;
        }
        this(i, i2, f);
    }

    public final void onExtraCallback(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 1;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        this.onWarmupCompleted = i;
        invalidateSelf();
        int i5 = asBinder + 57;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 7 / 0;
        }
    }

    public final void onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 19;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            this.onNavigationEvent = i;
            invalidateSelf();
        } else {
            this.onNavigationEvent = i;
            invalidateSelf();
            throw null;
        }
    }

    public final void IAuthTabCallback(float f) {
        int i = 2 % 2;
        int i2 = asBinder + 55;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallbackWithResult = f;
        invalidateSelf();
        int i4 = onTransact + 3;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        float f = this.onExtraCallbackWithResult / 2.0f;
        Path pathIAuthTabCallback = deprecated_noStore.IAuthTabCallback(deprecated_noStore.onExtraCallback, getBounds().width() - this.onExtraCallbackWithResult, getBounds().height() - this.onExtraCallbackWithResult, 0.0f, 0.0f, 12, null);
        pathIAuthTabCallback.offset(f, f);
        canvas.save();
        canvas.translate(getBounds().left, getBounds().top);
        this.onExtraCallback.setColor(this.onWarmupCompleted);
        canvas.drawPath(pathIAuthTabCallback, this.onExtraCallback);
        if (this.onExtraCallbackWithResult > 0.0f) {
            int i2 = asBinder + 105;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                this.IAuthTabCallback.setColor(this.onNavigationEvent);
                this.IAuthTabCallback.setStrokeWidth(this.onExtraCallbackWithResult);
                canvas.drawPath(pathIAuthTabCallback, this.IAuthTabCallback);
                throw null;
            }
            this.IAuthTabCallback.setColor(this.onNavigationEvent);
            this.IAuthTabCallback.setStrokeWidth(this.onExtraCallbackWithResult);
            canvas.drawPath(pathIAuthTabCallback, this.IAuthTabCallback);
        }
        canvas.restore();
        int i3 = asBinder + 87;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 11;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            this.onExtraCallback.setAlpha(i);
            invalidateSelf();
            int i4 = 90 / 0;
        } else {
            this.onExtraCallback.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        int i = 2 % 2;
        int i2 = onTransact + 35;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallback.setColorFilter(colorFilter);
        if (i3 != 0) {
            int i4 = 89 / 0;
        }
    }
}
