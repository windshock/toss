package com.bytedance.adsdk.zb.lt;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.provider.Settings;
import com.bytedance.adsdk.zb.ycx.ycx.thx;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class lt {
    private static final ThreadLocal<PathMeasure> ycx = new ThreadLocal<PathMeasure>() { // from class: com.bytedance.adsdk.zb.lt.lt.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: ycx, reason: merged with bridge method [inline-methods] */
        public PathMeasure initialValue() {
            return new PathMeasure();
        }
    };
    private static final ThreadLocal<Path> zb = new ThreadLocal<Path>() { // from class: com.bytedance.adsdk.zb.lt.lt.2
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: ycx, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    };
    private static final ThreadLocal<Path> sya = new ThreadLocal<Path>() { // from class: com.bytedance.adsdk.zb.lt.lt.3
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: ycx, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    };
    private static final ThreadLocal<float[]> dj = new ThreadLocal<float[]>() { // from class: com.bytedance.adsdk.zb.lt.lt.4
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: ycx, reason: merged with bridge method [inline-methods] */
        public float[] initialValue() {
            return new float[4];
        }
    };
    private static final float lud = (float) (Math.sqrt(2.0d) / 2.0d);

    public static int ycx(float f, float f2, float f3, float f4) {
        int i2 = f != 0.0f ? (int) (f * 527.0f) : 17;
        if (f2 != 0.0f) {
            i2 = (int) (i2 * 31 * f2);
        }
        if (f3 != 0.0f) {
            i2 = (int) (i2 * 31 * f3);
        }
        return f4 != 0.0f ? (int) (i2 * 31 * f4) : i2;
    }

    public static boolean ycx(int i2, int i3, int i4, int i5, int i6, int i7) {
        if (i2 < i5) {
            return false;
        }
        if (i2 > i5) {
            return true;
        }
        if (i3 < i6) {
            return false;
        }
        return i3 > i6 || i4 >= i7;
    }

    public static Path ycx(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 != null && pointF4 != null && (pointF3.length() != 0.0f || pointF4.length() != 0.0f)) {
            float f = pointF.x;
            float f2 = pointF3.x;
            float f3 = pointF.y;
            float f4 = pointF3.y;
            float f5 = pointF2.x;
            float f6 = pointF4.x;
            float f7 = pointF2.y;
            path.cubicTo(f2 + f, f3 + f4, f5 + f6, f7 + pointF4.y, f5, f7);
            return path;
        }
        path.lineTo(pointF2.x, pointF2.y);
        return path;
    }

    public static void ycx(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static float ycx(Matrix matrix) {
        float[] fArr = dj.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = lud;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static boolean zb(Matrix matrix) {
        float[] fArr = dj.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        return fArr[0] == fArr[2] || fArr[1] == fArr[3];
    }

    public static void ycx(Path path, thx thxVar) {
        if (thxVar == null || thxVar.lt()) {
            return;
        }
        ycx(path, ((com.bytedance.adsdk.zb.ycx.zb.dj) thxVar.sya()).jw() / 100.0f, ((com.bytedance.adsdk.zb.ycx.zb.dj) thxVar.dj()).jw() / 100.0f, ((com.bytedance.adsdk.zb.ycx.zb.dj) thxVar.lud()).jw() / 360.0f);
    }

    public static void ycx(Path path, float f, float f2, float f3) {
        com.bytedance.adsdk.zb.lud.ycx("applyTrimPathIfNeeded");
        PathMeasure pathMeasure = ycx.get();
        Path path2 = zb.get();
        Path path3 = sya.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f == 1.0f && f2 == 0.0f) {
            com.bytedance.adsdk.zb.lud.zb("applyTrimPathIfNeeded");
            return;
        }
        if (length < 1.0f || Math.abs((f2 - f) - 1.0f) < 0.01d) {
            com.bytedance.adsdk.zb.lud.zb("applyTrimPathIfNeeded");
            return;
        }
        float f4 = f * length;
        float f5 = f2 * length;
        float f6 = f3 * length;
        float fMin = Math.min(f4, f5) + f6;
        float fMax = Math.max(f4, f5) + f6;
        if (fMin >= length && fMax >= length) {
            fMin = lud.ycx(fMin, length);
            fMax = lud.ycx(fMax, length);
        }
        if (fMin < 0.0f) {
            fMin = lud.ycx(fMin, length);
        }
        if (fMax < 0.0f) {
            fMax = lud.ycx(fMax, length);
        }
        if (fMin == fMax) {
            path.reset();
            com.bytedance.adsdk.zb.lud.zb("applyTrimPathIfNeeded");
            return;
        }
        if (fMin >= fMax) {
            fMin -= length;
        }
        path2.reset();
        pathMeasure.getSegment(fMin, fMax, path2, true);
        if (fMax > length) {
            path3.reset();
            pathMeasure.getSegment(0.0f, fMax % length, path3, true);
            path2.addPath(path3);
        } else if (fMin < 0.0f) {
            path3.reset();
            pathMeasure.getSegment(fMin + length, length, path3, true);
            path2.addPath(path3);
        }
        path.set(path2);
        com.bytedance.adsdk.zb.lud.zb("applyTrimPathIfNeeded");
    }

    public static float ycx() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static float ycx(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static Bitmap ycx(Bitmap bitmap, int i2, int i3) {
        if (bitmap.getWidth() == i2 && bitmap.getHeight() == i3) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i2, i3, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }

    public static boolean ycx(Throwable th) {
        return (th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException);
    }

    public static void ycx(Canvas canvas, RectF rectF, Paint paint) {
        ycx(canvas, rectF, paint, 31);
    }

    public static void ycx(Canvas canvas, RectF rectF, Paint paint, int i2) {
        com.bytedance.adsdk.zb.lud.ycx("Utils#saveLayer");
        canvas.saveLayer(rectF, paint);
        com.bytedance.adsdk.zb.lud.zb("Utils#saveLayer");
    }
}
