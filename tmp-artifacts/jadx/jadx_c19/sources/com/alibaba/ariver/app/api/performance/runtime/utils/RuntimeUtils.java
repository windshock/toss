package com.alibaba.ariver.app.api.performance.runtime.utils;

import android.os.Looper;
import android.os.Process;
import com.alibaba.ariver.app.api.performance.ThreadOptimizeSwitch;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class RuntimeUtils {
    public static Integer updateMainThreadPriority(Integer num) {
        Integer numValueOf = null;
        if (num == null) {
            return null;
        }
        try {
            if (Looper.getMainLooper() == Looper.myLooper() && ThreadOptimizeSwitch.mainThreadPriority()) {
                numValueOf = Integer.valueOf(Process.getThreadPriority(Process.myTid()));
                Process.setThreadPriority(num.intValue());
                return numValueOf;
            }
            return null;
        } catch (Throwable unused) {
            return numValueOf;
        }
    }
}
