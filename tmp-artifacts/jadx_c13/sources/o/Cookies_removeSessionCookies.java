package o;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class Cookies_removeSessionCookies extends SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1 {
    public static final onNavigationEvent Companion;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    public static final int onNavigationEvent = 8;
    private static int onTransact = 1;
    private static int onWarmupCompleted;
    private final Paint IAuthTabCallback;
    private final boolean onExtraCallback;
    private final String onExtraCallbackWithResult;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onNavigationEvent(defaultConstructorMarker);
        int i = onWarmupCompleted + 97;
        onTransact = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public Cookies_removeSessionCookies(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onExtraCallback = z;
        this.IAuthTabCallback = new Paint(7);
        this.onExtraCallbackWithResult = "CardRotateTransformation/" + str;
    }

    public String IAuthTabCallback() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 49;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        if (i2 % 2 == 0) {
            str = this.onExtraCallbackWithResult;
            int i4 = 6 / 0;
        } else {
            str = this.onExtraCallbackWithResult;
        }
        int i5 = i3 + 103;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public Object onWarmupCompleted(@NotNull Bitmap bitmap, @NotNull RememberObserverHolder rememberObserverHolder, @NotNull access13800<? super Bitmap> access13800Var) {
        float f;
        int i = 2 % 2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        boolean z = this.onExtraCallback;
        if (z) {
            int i2 = IAuthTabCallbackStub + 101;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            f = 90.0f;
        } else {
            f = -90.0f;
        }
        Object obj = null;
        if (!(!z)) {
            int i4 = IAuthTabCallbackStub;
            int i5 = i4 + 107;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            if (height >= width) {
                int i7 = i4 + 77;
                IAuthTabCallbackDefault = i7 % 128;
                if (i7 % 2 != 0) {
                    return bitmap;
                }
                obj.hashCode();
                throw null;
            }
        } else if (height <= width) {
            int i8 = IAuthTabCallbackDefault + 41;
            IAuthTabCallbackStub = i8 % 128;
            if (i8 % 2 == 0) {
                return bitmap;
            }
            obj.hashCode();
            throw null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(height, width, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-width) / 2.0f, (-height) / 2.0f);
        matrix.postRotate(f);
        matrix.postTranslate(height / 2.0f, width / 2.0f);
        canvas.drawBitmap(bitmap, matrix, this.IAuthTabCallback);
        return bitmapCreateBitmap;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }
}
