package o;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getSkeleonSymbol {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ getSkeleonSymbol[] $VALUES;
    public static final getSkeleonSymbol CANCELED;
    public static final getSkeleonSymbol EXCLUDED;
    public static final getSkeleonSymbol EXCLUDED_FORCE;
    private static long IAuthTabCallback = 0;
    public static final getSkeleonSymbol NORMAL;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    private static final /* synthetic */ getSkeleonSymbol[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getSkeleonSymbol getskeleonsymbol = NORMAL;
        if (i3 != 0) {
            return new getSkeleonSymbol[]{getskeleonsymbol, EXCLUDED, EXCLUDED_FORCE, CANCELED};
        }
        getSkeleonSymbol getskeleonsymbol2 = EXCLUDED;
        getSkeleonSymbol getskeleonsymbol3 = EXCLUDED_FORCE;
        getSkeleonSymbol getskeleonsymbol4 = CANCELED;
        getSkeleonSymbol[] getskeleonsymbolArr = new getSkeleonSymbol[4];
        getskeleonsymbolArr[0] = getskeleonsymbol;
        getskeleonsymbolArr[0] = getskeleonsymbol2;
        getskeleonsymbolArr[3] = getskeleonsymbol3;
        getskeleonsymbolArr[3] = getskeleonsymbol4;
        return getskeleonsymbolArr;
    }

    public static EnumEntries<getSkeleonSymbol> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 45;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<getSkeleonSymbol> enumEntries = $ENTRIES;
        int i5 = i2 + 91;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static getSkeleonSymbol valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getSkeleonSymbol getskeleonsymbol = (getSkeleonSymbol) Enum.valueOf(getSkeleonSymbol.class, str);
        int i4 = onWarmupCompleted + 91;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return getskeleonsymbol;
    }

    public static getSkeleonSymbol[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        getSkeleonSymbol[] getskeleonsymbolArr = (getSkeleonSymbol[]) $VALUES.clone();
        int i3 = onNavigationEvent + 39;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return getskeleonsymbolArr;
        }
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallback ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $11 + 25;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - (ViewConfiguration.getPressedStateDuration() >> 16)), 84 - (Process.myTid() >> 22), ((Process.getThreadPriority(0) + 20) >> 6) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14186 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (ViewConfiguration.getJumpTapTimeout() >> 16) + 19, (ViewConfiguration.getJumpTapTimeout() >> 16) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    int i6 = $11 + 117;
                    $10 = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 2 / 4;
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    private getSkeleonSymbol(String str, int i) {
    }

    static {
        onExtraCallbackWithResult();
        NORMAL = new getSkeleonSymbol("NORMAL", 0);
        EXCLUDED = new getSkeleonSymbol("EXCLUDED", 1);
        EXCLUDED_FORCE = new getSkeleonSymbol("EXCLUDED_FORCE", 2);
        Object[] objArr = new Object[1];
        a(new char[]{63231, 10930, 63164, 62923, 49135, 39927, 38797, 44192, 12970, 24554, 54166, 26807}, TextUtils.getCapsMode("", 0, 0), objArr);
        CANCELED = new getSkeleonSymbol(((String) objArr[0]).intern(), 3);
        getSkeleonSymbol[] getskeleonsymbolArr$values = $values();
        $VALUES = getskeleonsymbolArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(getskeleonsymbolArr$values);
        int i = onExtraCallbackWithResult + 23;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public final boolean isNormal() {
        int i = 2 % 2;
        if (this == NORMAL) {
            int i2 = onNavigationEvent + 31;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = onNavigationEvent + 113;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public final boolean isExcluded() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (this == EXCLUDED || isExcludedForce()) {
            int i4 = onWarmupCompleted + 107;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = onNavigationEvent + 79;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r5 == o.getSkeleonSymbol.EXCLUDED_FORCE) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r5 == o.getSkeleonSymbol.EXCLUDED_FORCE) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r2 = r2 + 65;
        o.getSkeleonSymbol.onWarmupCompleted = r2 % 128;
        r2 = r2 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isExcludedForce() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.getSkeleonSymbol.onWarmupCompleted
            int r1 = r1 + 83
            int r2 = r1 % 128
            o.getSkeleonSymbol.onNavigationEvent = r2
            int r1 = r1 % r0
            r3 = 0
            if (r1 != 0) goto L17
            o.getSkeleonSymbol r1 = o.getSkeleonSymbol.EXCLUDED_FORCE
            r4 = 80
            int r4 = r4 / r3
            if (r5 != r1) goto L24
            goto L1b
        L17:
            o.getSkeleonSymbol r1 = o.getSkeleonSymbol.EXCLUDED_FORCE
            if (r5 != r1) goto L24
        L1b:
            int r2 = r2 + 65
            int r1 = r2 % 128
            o.getSkeleonSymbol.onWarmupCompleted = r1
            int r2 = r2 % r0
            r0 = 1
            return r0
        L24:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getSkeleonSymbol.isExcludedForce():boolean");
    }

    public final boolean isCanceled() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        if (this != CANCELED) {
            return false;
        }
        int i5 = i3 + 45;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    static void onExtraCallbackWithResult() {
        IAuthTabCallback = -4873991217152079352L;
    }
}
