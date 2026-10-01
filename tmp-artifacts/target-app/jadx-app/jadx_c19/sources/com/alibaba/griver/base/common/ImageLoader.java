package com.alibaba.griver.base.common;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.FileUtils;
import com.alibaba.ariver.kernel.common.utils.IOUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.base.common.adapter.ImageListener;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.executor.GriverExecutors;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.monitor.GriverMonitor;
import com.alibaba.griver.base.common.utils.MD5Util;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ImageLoader implements Runnable {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    public static final String TAG = "ImageLoader";
    public static long c = 5242880;
    private static long onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public String a;
    public ImageListener b;

    static {
        IAuthTabCallback();
        int i2 = onExtraCallbackWithResult + 121;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public ImageLoader(String str, ImageListener imageListener) {
        this.a = str;
        this.b = imageListener;
    }

    public static /* synthetic */ ImageListener access$000(ImageLoader imageLoader) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 81;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        ImageListener imageListener = imageLoader.b;
        int i6 = i4 + 71;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return imageListener;
    }

    public File getLocalUrlFile(String str) throws Throwable {
        int i2 = 2 % 2;
        try {
            File file = new File(GriverEnv.getApplicationContext().getExternalCacheDir() + File.separator + "imageload/pictures");
            if (!file.exists()) {
                file.mkdirs();
            }
            String mD5String = MD5Util.getMD5String(str);
            String[] strArrSplit = str.split("/");
            File file2 = new File(file, mD5String + "_" + strArrSplit[strArrSplit.length - 1]);
            int i3 = IAuthTabCallback + 17;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return file2;
        } catch (Exception e) {
            RVLogger.e(TAG, " getLocalUrl file error", e);
            HashMap map = new HashMap();
            Object[] objArr = new Object[1];
            d(new char[]{13999, 14042, 8355, 30072, 34704, 11438, 35186}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1, objArr);
            map.put(((String) objArr[0]).intern(), str);
            if (!TextUtils.isEmpty(e.getMessage())) {
                map.put("errorMessage", e.getMessage());
            }
            GriverMonitor.event("mkdir_file_error", "GriverAppContainer", map);
            int i5 = onWarmupCompleted + 17;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i2 = 2 % 2;
        if (this.b != null) {
            int i3 = IAuthTabCallback + 5;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            if (TextUtils.isEmpty(this.a) || readLocalBitmap(this.a)) {
                return;
            }
            try {
                URLConnection uRLConnectionOpenConnection = new URL(this.a).openConnection();
                uRLConnectionOpenConnection.setConnectTimeout(10000);
                uRLConnectionOpenConnection.setReadTimeout(10000);
                final Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(uRLConnectionOpenConnection.getInputStream());
                GriverExecutors.getExecutor(ExecutorType.UI).execute(new Runnable() { // from class: com.alibaba.griver.base.common.ImageLoader.2
                    @Override // java.lang.Runnable
                    public void run() {
                        GriverLogger.d(ImageLoader.TAG, "listener.onImage");
                        ImageLoader.access$000(ImageLoader.this).onImage(bitmapDecodeStream);
                    }
                });
                saveLocalBitmap(this.a, bitmapDecodeStream);
                int i5 = onWarmupCompleted + 59;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 43 / 0;
                }
            } catch (Throwable th) {
                GriverLogger.e(TAG, "load image exception.", th);
                GriverExecutors.getExecutor(ExecutorType.UI).execute(new Runnable() { // from class: com.alibaba.griver.base.common.ImageLoader.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (ImageLoader.access$000(ImageLoader.this) != null) {
                            ImageLoader.access$000(ImageLoader.this).onImage(null);
                        }
                    }
                });
            }
        }
    }

    public void saveLocalBitmap(String str, Bitmap bitmap) throws Throwable {
        FileOutputStream fileOutputStream;
        int i2 = 2 % 2;
        File localUrlFile = getLocalUrlFile(str);
        if (localUrlFile != null) {
            int i3 = IAuthTabCallback;
            int i4 = i3 + 15;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 97 / 0;
                if (bitmap == null) {
                    return;
                }
            } else if (bitmap == null) {
                return;
            }
            int i6 = i3 + 43;
            onWarmupCompleted = i6 % 128;
            FileOutputStream fileOutputStream2 = null;
            if (i6 % 2 != 0) {
                localUrlFile.exists();
                throw null;
            }
            if (localUrlFile.exists()) {
                localUrlFile.delete();
            }
            try {
                try {
                    fileOutputStream = new FileOutputStream(localUrlFile);
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = null;
                }
            } catch (Exception e) {
                e = e;
            }
            try {
                Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                if (!(!bitmap.hasAlpha())) {
                    compressFormat = Bitmap.CompressFormat.PNG;
                }
                bitmap.compress(compressFormat, 100, fileOutputStream);
                fileOutputStream.flush();
                IOUtils.closeQuietly(fileOutputStream);
            } catch (Exception e2) {
                e = e2;
                fileOutputStream2 = fileOutputStream;
                GriverLogger.e(TAG, "saveLocalBitmap exception.", e);
                HashMap map = new HashMap();
                Object[] objArr = new Object[1];
                d(new char[]{13999, 14042, 8355, 30072, 34704, 11438, 35186}, 1 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr);
                map.put(((String) objArr[0]).intern(), str);
                map.put("path", localUrlFile.getPath());
                if (!TextUtils.isEmpty(e.getMessage())) {
                    map.put("errorMessage", e.getMessage());
                }
                GriverMonitor.event("bitmap2file_error", "GriverAppContainer", map);
                if (localUrlFile.exists()) {
                    localUrlFile.delete();
                }
                IOUtils.closeQuietly(fileOutputStream2);
            } catch (Throwable th2) {
                th = th2;
                IOUtils.closeQuietly(fileOutputStream);
                throw th;
            }
        }
    }

    public boolean readLocalBitmap(String str) throws Throwable {
        boolean z;
        final Bitmap bitmapDecodeStream;
        int i2;
        int i3 = 2 % 2;
        File localUrlFile = getLocalUrlFile(str);
        if (localUrlFile == null) {
            return false;
        }
        int i4 = onWarmupCompleted + 113;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        if (!localUrlFile.exists()) {
            return false;
        }
        int i6 = onWarmupCompleted + 99;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        try {
            if (FileUtils.calculateSize(localUrlFile) > c) {
                WindowManager windowManager = (WindowManager) GriverEnv.getApplicationContext().getSystemService("window");
                DisplayMetrics displayMetrics = new DisplayMetrics();
                if (windowManager != null) {
                    int i8 = onWarmupCompleted + 73;
                    IAuthTabCallback = i8 % 128;
                    int i9 = i8 % 2;
                    windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                    i2 = displayMetrics.widthPixels;
                } else {
                    int i10 = IAuthTabCallback + 101;
                    onWarmupCompleted = i10 % 128;
                    int i11 = i10 % 2;
                    i2 = 0;
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(localUrlFile.getAbsolutePath(), options);
                int i12 = 1;
                for (int i13 = options.outWidth; i13 > i2; i13 /= 2) {
                    i12 <<= 1;
                }
                options.inJustDecodeBounds = false;
                options.inSampleSize = i12;
                bitmapDecodeStream = BitmapFactory.decodeFile(localUrlFile.getAbsolutePath(), options);
            } else {
                bitmapDecodeStream = BitmapFactory.decodeStream(new FileInputStream(localUrlFile));
            }
            if (bitmapDecodeStream == null) {
                return false;
            }
            GriverLogger.d(TAG, "bitmap size : " + bitmapDecodeStream.getAllocationByteCount());
            try {
                GriverExecutors.getExecutor(ExecutorType.UI).execute(new Runnable() { // from class: com.alibaba.griver.base.common.ImageLoader.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ImageLoader.access$000(ImageLoader.this).onImage(bitmapDecodeStream);
                    }
                });
                return true;
            } catch (Exception e) {
                e = e;
                z = true;
                GriverLogger.e(TAG, " readLocalBitmap file error", e);
                HashMap map = new HashMap();
                Object[] objArr = new Object[1];
                d(new char[]{13999, 14042, 8355, 30072, 34704, 11438, 35186}, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr);
                map.put(((String) objArr[0]).intern(), str);
                map.put("path", localUrlFile.getPath());
                StringBuilder sb = new StringBuilder();
                sb.append(localUrlFile.getTotalSpace());
                map.put("localUrlTotalSpace", sb.toString());
                if (!TextUtils.isEmpty(e.getMessage())) {
                    map.put("errorMessage", e.getMessage());
                }
                GriverMonitor.event("file2bitmap_error", "GriverAppContainer", map);
                localUrlFile.delete();
                return z;
            }
        } catch (Exception e2) {
            e = e2;
            z = false;
        }
    }

    private static void d(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallback ^ (-7907085296252847348L), cArr, i2);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i4 = $11 + 79;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i6 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSizeAndState(0, 0, 0) + 45812), 84 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14186 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 20 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 8808 - (ViewConfiguration.getFadingEdgeLength() >> 16), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i7 = $10 + 39;
        $11 = i7 % 128;
        int i8 = i7 % 2;
        objArr[0] = str;
    }

    static void IAuthTabCallback() {
        onExtraCallback = 6036074942484065957L;
    }
}
