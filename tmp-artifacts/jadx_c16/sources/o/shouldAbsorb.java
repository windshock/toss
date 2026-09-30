package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.hardware.Camera;
import android.os.Handler;
import androidx.annotation.NonNull;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class shouldAbsorb {
    private static final addFocusables onWarmupCompleted = addFocusables.onExtraCallback(shouldAbsorb.class.getSimpleName());

    public static boolean onExtraCallback(@NonNull Context context) {
        PackageManager packageManager = context.getPackageManager();
        return packageManager.hasSystemFeature("android.hardware.camera") || packageManager.hasSystemFeature("android.hardware.camera.front");
    }

    public static boolean onExtraCallbackWithResult(@NonNull Context context, @NonNull clearOldPositions clearoldpositions) {
        int iIAuthTabCallback = findViewHolderForLayoutPosition.onExtraCallbackWithResult().IAuthTabCallback(clearoldpositions);
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int numberOfCameras = Camera.getNumberOfCameras();
        for (int i = 0; i < numberOfCameras; i++) {
            Camera.getCameraInfo(i, cameraInfo);
            if (cameraInfo.facing == iIAuthTabCallback) {
                return true;
            }
        }
        return false;
    }

    static void onExtraCallback(@NonNull byte[] bArr, int i, int i2, @NonNull BitmapFactory.Options options, int i3, @NonNull setDebugAssertionsEnabled setdebugassertionsenabled) {
        isNestedScrollingEnabled.onWarmupCompleted(new 4(bArr, i, i2, options, i3, new Handler(), setdebugassertionsenabled));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0099 A[Catch: OutOfMemoryError -> 0x00e2, TryCatch #6 {OutOfMemoryError -> 0x00e2, blocks: (B:44:0x0093, B:54:0x00c1, B:45:0x0099, B:49:0x00ad), top: B:70:0x008f }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x007a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap onNavigationEvent(@NonNull byte[] bArr, int i, int i2, @NonNull BitmapFactory.Options options, int i3) throws Throwable {
        boolean z;
        int iOnExtraCallbackWithResult;
        Bitmap bitmapDecodeByteArray;
        ByteArrayInputStream byteArrayInputStream;
        int i4 = i <= 0 ? Integer.MAX_VALUE : i;
        int i5 = i2 <= 0 ? Integer.MAX_VALUE : i2;
        ByteArrayInputStream byteArrayInputStream2 = null;
        if (i3 != -1) {
            onWarmupCompleted.onExtraCallbackWithResult(new Object[]{"decodeBitmap:", "got orientation from constructor.", Integer.valueOf(i3)});
            z = false;
            iOnExtraCallbackWithResult = i3;
        } else {
            try {
                try {
                    byteArrayInputStream = new ByteArrayInputStream(bArr);
                    try {
                        int iOnWarmupCompleted = new FlowColumnOverflowScopeImplExternalSyntheticLambda0(byteArrayInputStream).onWarmupCompleted("Orientation", 1);
                        iOnExtraCallbackWithResult = isAnimating.onExtraCallbackWithResult(iOnWarmupCompleted);
                        z = iOnWarmupCompleted == 2 || iOnWarmupCompleted == 4 || iOnWarmupCompleted == 5 || iOnWarmupCompleted == 7;
                        onWarmupCompleted.onExtraCallbackWithResult(new Object[]{"decodeBitmap:", "got orientation from EXIF.", Integer.valueOf(iOnExtraCallbackWithResult)});
                        try {
                            byteArrayInputStream.close();
                        } catch (Exception unused) {
                        }
                    } catch (IOException e) {
                        e = e;
                        onWarmupCompleted.onNavigationEvent(new Object[]{"decodeBitmap:", "could not get orientation from EXIF.", e});
                        if (byteArrayInputStream != null) {
                            try {
                                byteArrayInputStream.close();
                            } catch (Exception unused2) {
                            }
                        }
                        z = false;
                        iOnExtraCallbackWithResult = 0;
                        if (i4 >= Integer.MAX_VALUE) {
                            options.inJustDecodeBounds = true;
                            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                            int i6 = options.outHeight;
                            int i7 = options.outWidth;
                            if (iOnExtraCallbackWithResult % 180 != 0) {
                            }
                            options.inSampleSize = onExtraCallbackWithResult(i6, i7, i4, i5);
                            options.inJustDecodeBounds = false;
                            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                        }
                        if (iOnExtraCallbackWithResult == 0) {
                            return bitmapDecodeByteArray;
                        }
                        Matrix matrix = new Matrix();
                        matrix.setRotate(iOnExtraCallbackWithResult);
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, true);
                        bitmapDecodeByteArray.recycle();
                        return bitmapCreateBitmap;
                    }
                } catch (Throwable th) {
                    th = th;
                    byteArrayInputStream2 = byteArrayInputStream;
                    if (byteArrayInputStream2 != null) {
                        try {
                            byteArrayInputStream2.close();
                        } catch (Exception unused3) {
                        }
                    }
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                byteArrayInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                if (byteArrayInputStream2 != null) {
                }
                throw th;
            }
        }
        try {
            if (i4 >= Integer.MAX_VALUE || i5 < Integer.MAX_VALUE) {
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                int i62 = options.outHeight;
                int i72 = options.outWidth;
                if (iOnExtraCallbackWithResult % 180 != 0) {
                    i72 = i62;
                    i62 = i72;
                }
                options.inSampleSize = onExtraCallbackWithResult(i62, i72, i4, i5);
                options.inJustDecodeBounds = false;
                bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            } else {
                bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            }
            if (iOnExtraCallbackWithResult == 0 && !z) {
                return bitmapDecodeByteArray;
            }
            Matrix matrix2 = new Matrix();
            matrix2.setRotate(iOnExtraCallbackWithResult);
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix2, true);
            bitmapDecodeByteArray.recycle();
            return bitmapCreateBitmap2;
        } catch (OutOfMemoryError unused4) {
            return null;
        }
    }

    private static int onExtraCallbackWithResult(int i, int i2, int i3, int i4) {
        int i5 = 1;
        if (i2 <= i4 && i <= i3) {
            return 1;
        }
        while (true) {
            if (i2 / i5 < i4 && i / i5 < i3) {
                return i5;
            }
            i5 <<= 1;
        }
    }
}
