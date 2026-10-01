package o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class mustRevalidate extends Drawable {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private final Paint onNavigationEvent = new Paint(1);

    @Override // android.graphics.drawable.Drawable
    @Deprecated
    public int getOpacity() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return -1;
        }
        throw null;
    }

    public final Paint onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        Paint paint = this.onNavigationEvent;
        int i4 = i3 + 121;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 13 / 0;
        }
        return paint;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        canvas.drawRect(getBounds(), this.onNavigationEvent);
        int i4 = IAuthTabCallback + 57;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        int i = 2 % 2;
        if (!Intrinsics.areEqual(this.onNavigationEvent.getColorFilter(), colorFilter)) {
            this.onNavigationEvent.setColorFilter(colorFilter);
            invalidateSelf();
            int i2 = IAuthTabCallback + 9;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = onExtraCallback + 125;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setAlpha(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 51;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 39 / 0;
            if (this.onNavigationEvent.getAlpha() != i) {
                int i5 = onExtraCallback + 43;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                this.onNavigationEvent.setAlpha(i);
                invalidateSelf();
            }
        } else if (this.onNavigationEvent.getAlpha() != i) {
        }
        int i7 = onExtraCallback + 13;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Paint paint = this.onNavigationEvent;
        if (i3 != 0) {
            return paint.getAlpha();
        }
        paint.getAlpha();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
