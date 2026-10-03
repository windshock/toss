package viva.republica.toss.plcc.view.showcase;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PlccShowcaseCardView extends View {
    private final Rect IAuthTabCallback;
    private final Rect onExtraCallback;
    private Bitmap onExtraCallbackWithResult;

    public PlccShowcaseCardView(@Nullable Context context) {
        super(context);
        this.onExtraCallback = new Rect();
        this.IAuthTabCallback = new Rect();
        setCameraDistance(getResources().getDisplayMetrics().density * 3000.0f);
    }

    public PlccShowcaseCardView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.onExtraCallback = new Rect();
        this.IAuthTabCallback = new Rect();
        setCameraDistance(getResources().getDisplayMetrics().density * 3000.0f);
    }

    public PlccShowcaseCardView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.onExtraCallback = new Rect();
        this.IAuthTabCallback = new Rect();
        setCameraDistance(getResources().getDisplayMetrics().density * 3000.0f);
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        Bitmap bitmap = this.onExtraCallbackWithResult;
        if (bitmap != null) {
            this.IAuthTabCallback.set(0, 0, getWidth(), getHeight());
            canvas.drawBitmap(bitmap, this.onExtraCallback, this.IAuthTabCallback, (Paint) null);
        }
    }

    public final void setCardBitmap(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "");
        this.onExtraCallbackWithResult = bitmap;
        this.onExtraCallback.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
        invalidate();
    }
}
