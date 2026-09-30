package o;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class maybePropagateCancellationTo {
    private static final Paint IAuthTabCallback;
    private static final Lock onExtraCallback;
    private static final Set<String> onExtraCallbackWithResult;
    private static final Paint onWarmupCompleted = new Paint(6);
    private static final Paint onNavigationEvent = new Paint(7);

    public static int IAuthTabCallback(int i2) {
        switch (i2) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public static boolean onExtraCallbackWithResult(int i2) {
        switch (i2) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    static {
        HashSet hashSet = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"));
        onExtraCallbackWithResult = hashSet;
        onExtraCallback = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new onExtraCallback();
        Paint paint = new Paint(7);
        IAuthTabCallback = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public static Lock onWarmupCompleted() {
        return onExtraCallback;
    }

    public static Bitmap IAuthTabCallback(@NonNull Savers_androidKtExternalSyntheticLambda5 savers_androidKtExternalSyntheticLambda5, @NonNull Bitmap bitmap, int i2, int i3) {
        float width;
        float height;
        if (bitmap.getWidth() == i2 && bitmap.getHeight() == i3) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i3 > bitmap.getHeight() * i2) {
            width = i3 / bitmap.getHeight();
            width2 = (i2 - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i2 / bitmap.getWidth();
            height = (i3 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapOnNavigationEvent = savers_androidKtExternalSyntheticLambda5.onNavigationEvent(i2, i3, onExtraCallback(bitmap));
        onExtraCallback(bitmap, bitmapOnNavigationEvent);
        onExtraCallback(bitmap, bitmapOnNavigationEvent, matrix);
        return bitmapOnNavigationEvent;
    }

    public static Bitmap onExtraCallbackWithResult(@NonNull Savers_androidKtExternalSyntheticLambda5 savers_androidKtExternalSyntheticLambda5, @NonNull Bitmap bitmap, int i2, int i3) {
        if (bitmap.getWidth() == i2 && bitmap.getHeight() == i3) {
            Log.isLoggable("TransformationUtils", 2);
            return bitmap;
        }
        float fMin = Math.min(i2 / bitmap.getWidth(), i3 / bitmap.getHeight());
        int iRound = Math.round(bitmap.getWidth() * fMin);
        int iRound2 = Math.round(bitmap.getHeight() * fMin);
        if (bitmap.getWidth() == iRound && bitmap.getHeight() == iRound2) {
            return bitmap;
        }
        Bitmap bitmapOnNavigationEvent = savers_androidKtExternalSyntheticLambda5.onNavigationEvent((int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), onExtraCallback(bitmap));
        onExtraCallback(bitmap, bitmapOnNavigationEvent);
        if (Log.isLoggable("TransformationUtils", 2)) {
            bitmap.getWidth();
            bitmap.getHeight();
            bitmapOnNavigationEvent.getWidth();
            bitmapOnNavigationEvent.getHeight();
        }
        Matrix matrix = new Matrix();
        matrix.setScale(fMin, fMin);
        onExtraCallback(bitmap, bitmapOnNavigationEvent, matrix);
        return bitmapOnNavigationEvent;
    }

    public static Bitmap onWarmupCompleted(@NonNull Savers_androidKtExternalSyntheticLambda5 savers_androidKtExternalSyntheticLambda5, @NonNull Bitmap bitmap, int i2, int i3) {
        return (bitmap.getWidth() > i2 || bitmap.getHeight() > i3) ? onExtraCallbackWithResult(savers_androidKtExternalSyntheticLambda5, bitmap, i2, i3) : bitmap;
    }

    public static void onExtraCallback(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }

    public static Bitmap onWarmupCompleted(@NonNull Bitmap bitmap, int i2) {
        if (i2 == 0) {
            return bitmap;
        }
        try {
            Matrix matrix = new Matrix();
            matrix.setRotate(i2);
            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } catch (Exception unused) {
            return bitmap;
        }
    }

    public static Bitmap IAuthTabCallback(@NonNull Savers_androidKtExternalSyntheticLambda5 savers_androidKtExternalSyntheticLambda5, @NonNull Bitmap bitmap, int i2) {
        if (!onExtraCallbackWithResult(i2)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        onExtraCallbackWithResult(i2, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap bitmapOnNavigationEvent = savers_androidKtExternalSyntheticLambda5.onNavigationEvent(Math.round(rectF.width()), Math.round(rectF.height()), onExtraCallback(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        bitmapOnNavigationEvent.setHasAlpha(bitmap.hasAlpha());
        onExtraCallback(bitmap, bitmapOnNavigationEvent, matrix);
        return bitmapOnNavigationEvent;
    }

    public static Bitmap onExtraCallback(@NonNull Savers_androidKtExternalSyntheticLambda5 savers_androidKtExternalSyntheticLambda5, @NonNull Bitmap bitmap, int i2, int i3) {
        int iMin = Math.min(i2, i3);
        float f = iMin;
        float f2 = f / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float fMax = Math.max(f / width, f / height);
        float f3 = width * fMax;
        float f4 = fMax * height;
        float f5 = (f - f3) / 2.0f;
        float f6 = (f - f4) / 2.0f;
        RectF rectF = new RectF(f5, f6, f3 + f5, f4 + f6);
        Bitmap bitmapOnWarmupCompleted = onWarmupCompleted(savers_androidKtExternalSyntheticLambda5, bitmap);
        Bitmap bitmapOnNavigationEvent = savers_androidKtExternalSyntheticLambda5.onNavigationEvent(iMin, iMin, onWarmupCompleted(bitmap));
        bitmapOnNavigationEvent.setHasAlpha(true);
        Lock lock = onExtraCallback;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapOnNavigationEvent);
            canvas.drawCircle(f2, f2, f2, onNavigationEvent);
            canvas.drawBitmap(bitmapOnWarmupCompleted, (Rect) null, rectF, IAuthTabCallback);
            onWarmupCompleted(canvas);
            lock.unlock();
            if (!bitmapOnWarmupCompleted.equals(bitmap)) {
                savers_androidKtExternalSyntheticLambda5.onWarmupCompleted(bitmapOnWarmupCompleted);
            }
            return bitmapOnNavigationEvent;
        } catch (Throwable th) {
            onExtraCallback.unlock();
            throw th;
        }
    }

    private static Bitmap onWarmupCompleted(@NonNull Savers_androidKtExternalSyntheticLambda5 savers_androidKtExternalSyntheticLambda5, @NonNull Bitmap bitmap) {
        Bitmap.Config configOnWarmupCompleted = onWarmupCompleted(bitmap);
        if (configOnWarmupCompleted.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap bitmapOnNavigationEvent = savers_androidKtExternalSyntheticLambda5.onNavigationEvent(bitmap.getWidth(), bitmap.getHeight(), configOnWarmupCompleted);
        new Canvas(bitmapOnNavigationEvent).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return bitmapOnNavigationEvent;
    }

    private static Bitmap.Config onWarmupCompleted(@NonNull Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 26) {
            Bitmap.Config configOnNavigationEvent = StabilizationMode.onNavigationEvent();
            if (configOnNavigationEvent.equals(bitmap.getConfig())) {
                return configOnNavigationEvent;
            }
        }
        return Bitmap.Config.ARGB_8888;
    }

    public static Bitmap onNavigationEvent(@NonNull Savers_androidKtExternalSyntheticLambda5 savers_androidKtExternalSyntheticLambda5, @NonNull Bitmap bitmap, final int i2) {
        markHierarchyDirty.onExtraCallbackWithResult(i2 > 0, "roundingRadius must be greater than 0.");
        return onExtraCallbackWithResult(savers_androidKtExternalSyntheticLambda5, bitmap, new onExtraCallbackWithResult() { // from class: o.maybePropagateCancellationTo.2
            public void onExtraCallback(Canvas canvas, Paint paint, RectF rectF) {
                float f = i2;
                canvas.drawRoundRect(rectF, f, f, paint);
            }
        });
    }

    private static Bitmap onExtraCallbackWithResult(@NonNull Savers_androidKtExternalSyntheticLambda5 savers_androidKtExternalSyntheticLambda5, @NonNull Bitmap bitmap, onExtraCallbackWithResult onextracallbackwithresult) {
        Bitmap.Config configOnWarmupCompleted = onWarmupCompleted(bitmap);
        Bitmap bitmapOnWarmupCompleted = onWarmupCompleted(savers_androidKtExternalSyntheticLambda5, bitmap);
        Bitmap bitmapOnNavigationEvent = savers_androidKtExternalSyntheticLambda5.onNavigationEvent(bitmapOnWarmupCompleted.getWidth(), bitmapOnWarmupCompleted.getHeight(), configOnWarmupCompleted);
        bitmapOnNavigationEvent.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmapOnWarmupCompleted, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, bitmapOnNavigationEvent.getWidth(), bitmapOnNavigationEvent.getHeight());
        Lock lock = onExtraCallback;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapOnNavigationEvent);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            onextracallbackwithresult.onExtraCallback(canvas, paint, rectF);
            onWarmupCompleted(canvas);
            lock.unlock();
            if (!bitmapOnWarmupCompleted.equals(bitmap)) {
                savers_androidKtExternalSyntheticLambda5.onWarmupCompleted(bitmapOnWarmupCompleted);
            }
            return bitmapOnNavigationEvent;
        } catch (Throwable th) {
            onExtraCallback.unlock();
            throw th;
        }
    }

    private static void onWarmupCompleted(Canvas canvas) {
        canvas.setBitmap(null);
    }

    private static Bitmap.Config onExtraCallback(@NonNull Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    private static void onExtraCallback(@NonNull Bitmap bitmap, @NonNull Bitmap bitmap2, Matrix matrix) {
        Lock lock = onExtraCallback;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, onWarmupCompleted);
            onWarmupCompleted(canvas);
            lock.unlock();
        } catch (Throwable th) {
            onExtraCallback.unlock();
            throw th;
        }
    }

    static void onExtraCallbackWithResult(int i2, Matrix matrix) {
        switch (i2) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                break;
        }
    }

    static final class onExtraCallback implements Lock {
        @Override // java.util.concurrent.locks.Lock
        public void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock(long j, @NonNull TimeUnit timeUnit) throws InterruptedException {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public void unlock() {
        }

        onExtraCallback() {
        }

        @Override // java.util.concurrent.locks.Lock
        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }
    }
}
