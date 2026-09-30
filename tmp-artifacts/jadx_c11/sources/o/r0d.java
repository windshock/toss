package o;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r0d extends SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1 {
    private static int IAuthTabCallbackDefault = 1;
    private static int asBinder = 0;
    private static int onTransact = 1;
    private static int onWarmupCompleted;
    private final String IAuthTabCallback;
    private final int onExtraCallback;
    private final float onNavigationEvent;
    private static final onExtraCallback Companion = new onExtraCallback(null);
    public static final int onExtraCallbackWithResult = 8;

    static {
        int i = onWarmupCompleted + 23;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    public r0d() {
        this(0.0f, 0, 3, null);
    }

    public r0d(float f, int i) {
        this.onNavigationEvent = f;
        this.onExtraCallback = i;
        this.IAuthTabCallback = "SquircleTransformation(paddingRatio=" + f + ",paddingColor=" + i + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ r0d(float f, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            int i3 = asBinder + 101;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            f = 0.0f;
        }
        if ((i2 & 2) != 0) {
            int i5 = asBinder + 93;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            i = 0;
        }
        this(f, i);
    }

    public String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 61;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        String str = this.IAuthTabCallback;
        int i5 = i2 + 23;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onWarmupCompleted(@NotNull Bitmap bitmap, @NotNull RememberObserverHolder rememberObserverHolder, @NotNull access13800<? super Bitmap> access13800Var) {
        int i = 2 % 2;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        float fMin = 0.0f;
        boolean z = false;
        if (this.onNavigationEvent > 0.0f) {
            int i2 = asBinder + 1;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 26 / 0;
                if (Color.alpha(this.onExtraCallback) != 0) {
                    z = true;
                }
            } else if (Color.alpha(this.onExtraCallback) != 0) {
            }
        }
        if (z) {
            Paint paint = new Paint(1);
            paint.setColor(this.onExtraCallback);
            canvas.drawPath(onWarmupCompleted(width, height, 0.0f), paint);
            int i4 = asBinder + 121;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }
        if (z) {
            fMin = this.onNavigationEvent * Math.min(width, height);
        }
        float f = 2.0f * fMin;
        canvas.drawPath(onWarmupCompleted(width, height, fMin), onNavigationEvent(bitmap, fMin, width - f, height - f));
        return bitmapCreateBitmap;
    }

    private final Path onWarmupCompleted(float f, float f2, float f3) {
        int i = 2 % 2;
        int i2 = onTransact + 27;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        float f4 = 2.0f * f3;
        Path pathIAuthTabCallback = deprecated_noStore.IAuthTabCallback(deprecated_noStore.onExtraCallback, f - f4, f2 - f4, 0.0f, 0.0f, 12, null);
        pathIAuthTabCallback.offset(f3, f3);
        int i4 = onTransact + 115;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return pathIAuthTabCallback;
    }

    private final Paint onNavigationEvent(Bitmap bitmap, float f, float f2, float f3) {
        int i = 2 % 2;
        float fMax = Math.max(f2 / bitmap.getWidth(), f3 / bitmap.getHeight()) * 1.06f;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setScale(fMax, fMax);
        matrix.postTranslate(((f2 - (bitmap.getWidth() * fMax)) / 2.0f) + f, f + ((f3 - (bitmap.getHeight() * fMax)) / 2.0f));
        bitmapShader.setLocalMatrix(matrix);
        Paint paint = new Paint(3);
        paint.setShader(bitmapShader);
        int i2 = onTransact + 25;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 20 / 0;
        }
        return paint;
    }

    static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }
}
