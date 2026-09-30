package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class onInterstitialAdLoadFailed {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ onInterstitialAdLoadFailed[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final String logValue;
    private final String reasonValue;
    private final String triggerValue;
    public static final onInterstitialAdLoadFailed SESSION_TERMINATED = new onInterstitialAdLoadFailed("SESSION_TERMINATED", 0, "session_terminated", "app_session_reset", "session_end");
    public static final onInterstitialAdLoadFailed RECYCLE = new onInterstitialAdLoadFailed("RECYCLE", 1, "recycle", "runtime_recycle", "state_changed");

    private static final /* synthetic */ onInterstitialAdLoadFailed[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return new onInterstitialAdLoadFailed[]{SESSION_TERMINATED, RECYCLE};
        }
        onInterstitialAdLoadFailed oninterstitialadloadfailed = SESSION_TERMINATED;
        onInterstitialAdLoadFailed oninterstitialadloadfailed2 = RECYCLE;
        onInterstitialAdLoadFailed[] oninterstitialadloadfailedArr = new onInterstitialAdLoadFailed[2];
        oninterstitialadloadfailedArr[0] = oninterstitialadloadfailed;
        oninterstitialadloadfailedArr[0] = oninterstitialadloadfailed2;
        return oninterstitialadloadfailedArr;
    }

    public static EnumEntries<onInterstitialAdLoadFailed> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        throw null;
    }

    public static onInterstitialAdLoadFailed valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onInterstitialAdLoadFailed oninterstitialadloadfailed = (onInterstitialAdLoadFailed) Enum.valueOf(onInterstitialAdLoadFailed.class, str);
        if (i3 == 0) {
            int i4 = 95 / 0;
        }
        return oninterstitialadloadfailed;
    }

    public static onInterstitialAdLoadFailed[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onInterstitialAdLoadFailed[] oninterstitialadloadfailedArr = (onInterstitialAdLoadFailed[]) $VALUES.clone();
        int i4 = IAuthTabCallback + 101;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 67 / 0;
        }
        return oninterstitialadloadfailedArr;
    }

    private onInterstitialAdLoadFailed(String str, int i, String str2, String str3, String str4) {
        this.logValue = str2;
        this.reasonValue = str3;
        this.triggerValue = str4;
    }

    public final String getLogValue() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.logValue;
        int i5 = i3 + 101;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getReasonValue() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.reasonValue;
        int i4 = i3 + 101;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getTriggerValue() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 41;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.triggerValue;
        int i5 = i2 + 85;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 11 / 0;
        }
        return str;
    }

    static {
        onInterstitialAdLoadFailed[] oninterstitialadloadfailedArr$values = $values();
        $VALUES = oninterstitialadloadfailedArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(oninterstitialadloadfailedArr$values);
        int i = onExtraCallback + 61;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }
}
