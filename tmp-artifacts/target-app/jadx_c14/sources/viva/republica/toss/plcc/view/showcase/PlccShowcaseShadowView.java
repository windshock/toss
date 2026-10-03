package viva.republica.toss.plcc.view.showcase;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PlccShowcaseShadowView extends View {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    public static final int IAuthTabCallback = 8;
    private final Rect onExtraCallbackWithResult;
    private final Rect onNavigationEvent;
    private Bitmap onWarmupCompleted;

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    public PlccShowcaseShadowView(@Nullable Context context) {
        super(context);
        this.onNavigationEvent = new Rect();
        this.onExtraCallbackWithResult = new Rect();
        setCameraDistance(getResources().getDisplayMetrics().density * 2000.0f);
    }

    public PlccShowcaseShadowView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.onNavigationEvent = new Rect();
        this.onExtraCallbackWithResult = new Rect();
        setCameraDistance(getResources().getDisplayMetrics().density * 2000.0f);
    }

    public PlccShowcaseShadowView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.onNavigationEvent = new Rect();
        this.onExtraCallbackWithResult = new Rect();
        setCameraDistance(getResources().getDisplayMetrics().density * 2000.0f);
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        Bitmap bitmap = this.onWarmupCompleted;
        if (bitmap != null) {
            float width = getWidth();
            int i = -(((int) (((width * 1.1f) - getWidth()) / 2.0f)) / 2);
            int i2 = -(((int) (((getHeight() * 1.1f) - getHeight()) / 2.0f)) / 2);
            this.onExtraCallbackWithResult.set(i, i2, (-i) + getWidth(), (-i2) + getHeight());
            canvas.drawBitmap(bitmap, this.onNavigationEvent, this.onExtraCallbackWithResult, (Paint) null);
        }
    }

    public final void setShadowImage(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "");
        this.onWarmupCompleted = bitmap;
        this.onNavigationEvent.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
        invalidate();
    }
}
