package com.alibaba.griver.core.keepalive;

import android.app.Activity;
import android.app.ActivityManager;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.alibaba.griver.base.R;
import com.alibaba.griver.base.common.logger.GriverLogger;
import java.util.List;
import o.MediaStoreVideoCannotWrite;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ActivityBackAdvice {
    public static boolean a(Activity activity, int i2, ActivityManager activityManager, List<ActivityManager.RunningTaskInfo> list, boolean z) {
        for (ActivityManager.RunningTaskInfo runningTaskInfo : list) {
            if (i2 == runningTaskInfo.id) {
                moveTaskToFront(activityManager, activity, runningTaskInfo, z);
                return true;
            }
        }
        return false;
    }

    public static boolean moveTaskToBack(final Activity activity, @Nullable int i2, boolean z) {
        if (activity == null || i2 == -1) {
            return false;
        }
        ActivityManager activityManager = (ActivityManager) activity.getApplication().getSystemService("activity");
        if (!a(activity, i2, activityManager, activityManager.getRunningTasks(Integer.MAX_VALUE), z)) {
            return false;
        }
        new Handler(activity.getMainLooper()).post(new Runnable() { // from class: com.alibaba.griver.core.keepalive.ActivityBackAdvice.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    activity.moveTaskToBack(false);
                } catch (Throwable th) {
                    GriverLogger.e("ActivityBackAdvice", "moveTaskToFront error" + th);
                }
            }
        });
        return true;
    }

    public static void moveTaskToFront(final ActivityManager activityManager, final Activity activity, final ActivityManager.RunningTaskInfo runningTaskInfo, final boolean z) {
        if (runningTaskInfo == null) {
            return;
        }
        new Handler(activity.getMainLooper()).post(new Runnable() { // from class: com.alibaba.griver.core.keepalive.ActivityBackAdvice.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ActivityBackAdvice.a(activityManager, activity, runningTaskInfo, z);
                } catch (Throwable th) {
                    GriverLogger.e("ActivityBackAdvice", "moveTaskToFront error" + th);
                }
            }
        });
    }

    public static void a(ActivityManager activityManager, Activity activity, ActivityManager.RunningTaskInfo runningTaskInfo, boolean z) {
        if (z) {
            activityManager.moveTaskToFront(runningTaskInfo.id, 0, MediaStoreVideoCannotWrite.onExtraCallback(activity, R.anim.griver_core_app_close_enter_left_in, R.anim.griver_core_app_close_exit_right_out).onWarmupCompleted());
        } else {
            activityManager.moveTaskToFront(runningTaskInfo.id, 0);
        }
    }
}
