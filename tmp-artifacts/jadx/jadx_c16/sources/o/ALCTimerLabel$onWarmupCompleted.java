package o;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Iterator;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes16.dex */
final class ALCTimerLabel$onWarmupCompleted {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ALCTimerLabel$onWarmupCompleted[] $VALUES;
    public static final ALCTimerLabel$onWarmupCompleted BOTH;
    public static final ALCTimerLabel$onWarmupCompleted CAMERA;
    public static final onNavigationEvent Companion;
    public static final ALCTimerLabel$onWarmupCompleted GALLERY;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 1;
    private static char onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static int onTransact;
    private static char onWarmupCompleted;
    private final String value;

    private static final /* synthetic */ ALCTimerLabel$onWarmupCompleted[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 109;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        ALCTimerLabel$onWarmupCompleted[] aLCTimerLabel$onWarmupCompletedArr = {BOTH, CAMERA, GALLERY};
        int i5 = i2 + 55;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return aLCTimerLabel$onWarmupCompletedArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<ALCTimerLabel$onWarmupCompleted> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        EnumEntries<ALCTimerLabel$onWarmupCompleted> enumEntries = $ENTRIES;
        int i4 = i3 + 61;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return enumEntries;
        }
        obj.hashCode();
        throw null;
    }

    public static ALCTimerLabel$onWarmupCompleted valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        ALCTimerLabel$onWarmupCompleted aLCTimerLabel$onWarmupCompleted = (ALCTimerLabel$onWarmupCompleted) Enum.valueOf(ALCTimerLabel$onWarmupCompleted.class, str);
        if (i3 == 0) {
            int i4 = 91 / 0;
        }
        return aLCTimerLabel$onWarmupCompleted;
    }

    public static ALCTimerLabel$onWarmupCompleted[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        ALCTimerLabel$onWarmupCompleted[] aLCTimerLabel$onWarmupCompletedArr = (ALCTimerLabel$onWarmupCompleted[]) $VALUES.clone();
        int i4 = IAuthTabCallbackDefault + 23;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return aLCTimerLabel$onWarmupCompletedArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i4 = $10 + 69;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i6 = $10 + 25;
            $11 = i6 % 128;
            int i7 = 58224;
            if (i6 % 2 == 0) {
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            } else {
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            }
            int i8 = i3;
            while (i8 < 16) {
                int i9 = $11 + 49;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i11 = (c2 + i7) ^ ((c2 << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)));
                int i12 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(IAuthTabCallback);
                    objArr2[2] = Integer.valueOf(i12);
                    objArr2[1] = Integer.valueOf(i11);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char size = (char) View.MeasureSpec.getSize(i3);
                        int tapTimeout = 10 - (ViewConfiguration.getTapTimeout() >> 16);
                        int iMyTid = 12434 - (Process.myTid() >> 22);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(size, tapTimeout, iMyTid, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 10 - (ViewConfiguration.getPressedStateDuration() >> 16), 12434 - TextUtils.getOffsetAfter("", 0), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i8++;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 16014), Color.blue(0) + 14, 19902 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private ALCTimerLabel$onWarmupCompleted(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 125;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = this.value;
        if (i3 != 0) {
            int i4 = 87 / 0;
        }
        return str;
    }

    static {
        onExtraCallbackWithResult();
        Object[] objArr = new Object[1];
        a(new char[]{51957, 38899, 11315, 26492}, 4 - (ViewConfiguration.getTouchSlop() >> 8), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new char[]{6794, 9502, 16270, 1408}, (ViewConfiguration.getEdgeSlop() >> 16) + 4, objArr2);
        BOTH = new ALCTimerLabel$onWarmupCompleted(strIntern, 0, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a(new char[]{17859, 9236, 12102, 46483, 18733, 24242}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 5, objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a(new char[]{4753, 22705, 41179, 32649, 23731, 29157}, 6 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr4);
        CAMERA = new ALCTimerLabel$onWarmupCompleted(strIntern2, 1, ((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        a(new char[]{10655, 54713, 36290, 61578, 41505, 25775, 5457, 34665}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 7, objArr5);
        String strIntern3 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a(new char[]{37412, 37372, 25378, 29139, 16021, 56830, 40548, 15090}, ((Process.getThreadPriority(0) + 20) >> 6) + 7, objArr6);
        GALLERY = new ALCTimerLabel$onWarmupCompleted(strIntern3, 2, ((String) objArr6[0]).intern());
        ALCTimerLabel$onWarmupCompleted[] aLCTimerLabel$onWarmupCompletedArr$values = $values();
        $VALUES = aLCTimerLabel$onWarmupCompletedArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(aLCTimerLabel$onWarmupCompletedArr$values);
        Companion = new onNavigationEvent(null);
        int i = IAuthTabCallbackStub + 11;
        onTransact = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static final class onNavigationEvent {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
        
            r3 = (o.ALCTimerLabel$onWarmupCompleted) r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
        
            if (r3 != null) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
        
            return o.ALCTimerLabel$onWarmupCompleted.BOTH;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
        
            return r3;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final ALCTimerLabel$onWarmupCompleted onExtraCallbackWithResult(@NotNull String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 63;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Iterator it = ALCTimerLabel$onWarmupCompleted.getEntries().iterator();
            while (true) {
                Object obj = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.areEqual(((ALCTimerLabel$onWarmupCompleted) next).getValue(), str)) {
                    int i4 = onWarmupCompleted + 105;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    obj = next;
                }
            }
        }
    }

    static void onExtraCallbackWithResult() {
        onWarmupCompleted = (char) 3868;
        onNavigationEvent = (char) 18570;
        onExtraCallback = (char) 50820;
        IAuthTabCallback = (char) 20677;
    }
}
