package com.samsung.android.ssiframework.sdk.data;

import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import o.access15300;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class VcType {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ VcType[] $VALUES;
    public static final Companion Companion;
    public static final VcType DRIVER_LICENCE;
    private static int IAuthTabCallback = 1;
    public static final VcType IDENTITY;
    public static final VcType NATIONAL_HONOREE;
    public static final VcType RESIDENCE_CARD;
    public static final VcType UNKNOWN;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static long onWarmupCompleted;
    private final int id;

    private static final /* synthetic */ VcType[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 25;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        VcType[] vcTypeArr = {UNKNOWN, IDENTITY, DRIVER_LICENCE, NATIONAL_HONOREE, RESIDENCE_CARD};
        int i5 = i2 + 31;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 61 / 0;
        }
        return vcTypeArr;
    }

    static {
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        a(new char[]{53768, 28912, 53853, 54861, 59490, 38638, 42447, 25209, 18827, 12824, 414}, -TextUtils.indexOf((CharSequence) "", '0', 0), objArr);
        UNKNOWN = new VcType(((String) objArr[0]).intern(), 0, 0);
        IDENTITY = new VcType("IDENTITY", 1, 1);
        DRIVER_LICENCE = new VcType("DRIVER_LICENCE", 2, 2);
        NATIONAL_HONOREE = new VcType("NATIONAL_HONOREE", 3, 3);
        RESIDENCE_CARD = new VcType("RESIDENCE_CARD", 4, 6);
        VcType[] vcTypeArr$values = $values();
        $VALUES = vcTypeArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(vcTypeArr$values);
        Companion = new Companion((DefaultConstructorMarker) null);
        int i = onExtraCallback + 27;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private VcType(String str, int i, int i2) {
        this.id = i2;
    }

    public static EnumEntries<VcType> getEntries() {
        EnumEntries<VcType> enumEntries;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            enumEntries = $ENTRIES;
            int i4 = 93 / 0;
        } else {
            enumEntries = $ENTRIES;
        }
        int i5 = i3 + 67;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return enumEntries;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static VcType valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        VcType vcType = (VcType) Enum.valueOf(VcType.class, str);
        int i4 = onNavigationEvent + 93;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return vcType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static VcType[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        VcType[] vcTypeArr = $VALUES;
        if (i3 == 0) {
            return (VcType[]) vcTypeArr.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getId() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 17;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.id;
        int i6 = i2 + 55;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onWarmupCompleted ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $11 + 39;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Drawable.resolveOpacity(0, 0) + 45812), 84 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 21232, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 14184), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 19, 8808 - (Process.myTid() >> 22), 64918803, false, "d", new Class[]{Object.class, Object.class});
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
        int i6 = $11 + 89;
        $10 = i6 % 128;
        if (i6 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i7 = 31 / 0;
            objArr[0] = str;
        }
    }

    static void IAuthTabCallback() {
        onWarmupCompleted = 9165365137869495807L;
    }
}
