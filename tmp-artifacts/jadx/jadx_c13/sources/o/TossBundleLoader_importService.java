package o;

import android.graphics.Bitmap;
import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TossBundleLoader_importService {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    public static final TossBundleLoader_importService onWarmupCompleted = new TossBundleLoader_importService();

    static {
        int i = onNavigationEvent + 55;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private TossBundleLoader_importService() {
    }

    public static /* synthetic */ Integer IAuthTabCallback(TossBundleLoader_importService tossBundleLoader_importService, Bitmap bitmap, Rect rect, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 3;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0 ? (i2 & 4) != 0 : (i2 & 3) != 0) {
            i = 32;
        }
        Integer numOnExtraCallback = tossBundleLoader_importService.onExtraCallback(bitmap, rect, i);
        int i5 = onExtraCallbackWithResult + 95;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return numOnExtraCallback;
        }
        throw null;
    }

    public final Integer onExtraCallback(@NotNull Bitmap bitmap, @Nullable Rect rect, int i) {
        Bitmap bitmapCreateBitmap;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(bitmap, "");
        Object obj = null;
        if (bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
            return null;
        }
        if (rect == null || rect.left < 0 || rect.top < 0 || rect.right > bitmap.getWidth() || rect.bottom > bitmap.getHeight()) {
            bitmapCreateBitmap = bitmap;
        } else {
            int i3 = onExtraCallbackWithResult + 39;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height());
                obj.hashCode();
                throw null;
            }
            bitmapCreateBitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height());
        }
        Intrinsics.checkNotNull(bitmapCreateBitmap);
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, i, i, false);
        if (bitmapCreateBitmap != bitmap) {
            int i4 = onExtraCallback + 25;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            bitmapCreateBitmap.recycle();
        }
        int[] iArr = new int[32768];
        int i6 = i * i;
        int[] iArr2 = new int[i6];
        bitmapCreateScaledBitmap.getPixels(iArr2, 0, i, 0, 0, i, i);
        bitmapCreateScaledBitmap.recycle();
        int i7 = -1;
        int i8 = 0;
        for (int i9 = 0; i9 < i6; i9++) {
            int i10 = iArr2[i9];
            int i11 = (((i10 >>> 19) & 31) << 10) | ((((i10 >>> 11) & 63) >> 1) << 5) | ((i10 >>> 3) & 31);
            int i12 = iArr[i11] + 1;
            iArr[i11] = i12;
            if (i12 > i7) {
                i8 = i10;
                i7 = i12;
            }
        }
        return Integer.valueOf(i8);
    }
}
