package com.alibaba.griver.core.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.os.SystemClock;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.google.android.exoplayer2.source.rtsp.RtspMessageUtil;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class DeviceUtils {
    public static final int DEVICE_DEFAULT = 1;
    public static final int DEVICE_HIGH = 3;
    public static final int DEVICE_LOW = 1;
    public static final int DEVICE_MIDDLE = 2;
    public static final int DINFO_NO_INIT = -100;
    public static final int DINFO_UNKNOWN = -1;
    public static long a = 3221225472L;
    public static long b = -100;
    public static long c = 0;
    static long sAliveRamSize = -100;
    static long sRamSize = -100;

    static {
        a();
    }

    public static void a() {
        b = getTotalMemory(GriverEnv.getApplicationContext());
    }

    public static long getAliveMemory(Context context) {
        if (sAliveRamSize == -1 || SystemClock.elapsedRealtime() - c < RtspMessageUtil.DEFAULT_RTSP_TIMEOUT_MS) {
            return sAliveRamSize;
        }
        synchronized (DeviceUtils.class) {
            try {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
                sAliveRamSize = memoryInfo.availMem;
            } catch (Throwable unused) {
                sAliveRamSize = -1L;
            }
            c = SystemClock.elapsedRealtime();
        }
        return sAliveRamSize;
    }

    public static int getDeviceLevel() {
        if (b == -100) {
            a();
        }
        long j = b;
        if (j == 0 || j == -1 || j < 3221225472L) {
            return 1;
        }
        return j < a ? 2 : 3;
    }

    public static long getTotalMemory(Context context) {
        long j = sRamSize;
        if (j == -1) {
            return j;
        }
        if (j == -100) {
            synchronized (DeviceUtils.class) {
                try {
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
                    sRamSize = memoryInfo.totalMem;
                } catch (Throwable unused) {
                    sRamSize = -1L;
                }
            }
        }
        return sRamSize;
    }
}
