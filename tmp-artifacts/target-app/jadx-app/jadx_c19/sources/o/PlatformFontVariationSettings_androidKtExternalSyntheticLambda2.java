package o;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class PlatformFontVariationSettings_androidKtExternalSyntheticLambda2 {
    private final int IAuthTabCallback;
    private final int onExtraCallback;
    private final Context onNavigationEvent;
    private final int onWarmupCompleted;

    interface onNavigationEvent {
        int IAuthTabCallback();

        int onExtraCallback();
    }

    PlatformFontVariationSettings_androidKtExternalSyntheticLambda2(IAuthTabCallback iAuthTabCallback) {
        int i2;
        this.onNavigationEvent = iAuthTabCallback.onNavigationEvent;
        if (onExtraCallback(iAuthTabCallback.onWarmupCompleted)) {
            i2 = iAuthTabCallback.onExtraCallback / 2;
        } else {
            i2 = iAuthTabCallback.onExtraCallback;
        }
        this.IAuthTabCallback = i2;
        int iOnExtraCallback = onExtraCallback(iAuthTabCallback.onWarmupCompleted, iAuthTabCallback.asInterface, iAuthTabCallback.onTransact);
        float fOnExtraCallback = (iAuthTabCallback.asBinder.onExtraCallback() * iAuthTabCallback.asBinder.IAuthTabCallback()) << 2;
        int iRound = Math.round(iAuthTabCallback.onExtraCallbackWithResult * fOnExtraCallback);
        int iRound2 = Math.round(fOnExtraCallback * iAuthTabCallback.IAuthTabCallbackDefault);
        int i3 = iOnExtraCallback - i2;
        if (iRound2 + iRound <= i3) {
            this.onWarmupCompleted = iRound2;
            this.onExtraCallback = iRound;
        } else {
            float f = i3;
            float f2 = iAuthTabCallback.onExtraCallbackWithResult;
            float f3 = iAuthTabCallback.IAuthTabCallbackDefault;
            float f4 = f / (f2 + f3);
            this.onWarmupCompleted = Math.round(f3 * f4);
            this.onExtraCallback = Math.round(f4 * iAuthTabCallback.onExtraCallbackWithResult);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            onExtraCallbackWithResult(this.onWarmupCompleted);
            onExtraCallbackWithResult(this.onExtraCallback);
            onExtraCallbackWithResult(i2);
            onExtraCallbackWithResult(iOnExtraCallback);
            iAuthTabCallback.onWarmupCompleted.getMemoryClass();
            onExtraCallback(iAuthTabCallback.onWarmupCompleted);
        }
    }

    public int IAuthTabCallback() {
        return this.onWarmupCompleted;
    }

    public int onNavigationEvent() {
        return this.onExtraCallback;
    }

    public int onWarmupCompleted() {
        return this.IAuthTabCallback;
    }

    private static int onExtraCallback(ActivityManager activityManager, float f, float f2) {
        float memoryClass = activityManager.getMemoryClass() * 1048576;
        if (onExtraCallback(activityManager)) {
            f = f2;
        }
        return Math.round(memoryClass * f);
    }

    private String onExtraCallbackWithResult(int i2) {
        return Formatter.formatFileSize(this.onNavigationEvent, i2);
    }

    static boolean onExtraCallback(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    public static final class IAuthTabCallback {
        static final int IAuthTabCallback;
        onNavigationEvent asBinder;
        float onExtraCallbackWithResult;
        final Context onNavigationEvent;
        ActivityManager onWarmupCompleted;
        float IAuthTabCallbackDefault = 2.0f;
        float asInterface = 0.4f;
        float onTransact = 0.33f;
        int onExtraCallback = 4194304;

        static {
            IAuthTabCallback = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public IAuthTabCallback(Context context) {
            this.onExtraCallbackWithResult = IAuthTabCallback;
            this.onNavigationEvent = context;
            this.onWarmupCompleted = (ActivityManager) context.getSystemService("activity");
            this.asBinder = new onExtraCallback(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !PlatformFontVariationSettings_androidKtExternalSyntheticLambda2.onExtraCallback(this.onWarmupCompleted)) {
                return;
            }
            this.onExtraCallbackWithResult = 0.0f;
        }

        public PlatformFontVariationSettings_androidKtExternalSyntheticLambda2 onExtraCallback() {
            return new PlatformFontVariationSettings_androidKtExternalSyntheticLambda2(this);
        }
    }

    static final class onExtraCallback implements onNavigationEvent {
        private final DisplayMetrics onExtraCallbackWithResult;

        onExtraCallback(DisplayMetrics displayMetrics) {
            this.onExtraCallbackWithResult = displayMetrics;
        }

        @Override // o.PlatformFontVariationSettings_androidKtExternalSyntheticLambda2.onNavigationEvent
        public int onExtraCallback() {
            return this.onExtraCallbackWithResult.widthPixels;
        }

        @Override // o.PlatformFontVariationSettings_androidKtExternalSyntheticLambda2.onNavigationEvent
        public int IAuthTabCallback() {
            return this.onExtraCallbackWithResult.heightPixels;
        }
    }
}
