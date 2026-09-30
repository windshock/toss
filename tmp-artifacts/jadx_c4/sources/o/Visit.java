package o;

import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.tmoney.LiveCheckConstants;
import java.lang.reflect.Method;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class Visit {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Visit[] $VALUES;
    public static final onNavigationEvent Companion;
    public static final Visit DEGREE_0;
    public static final Visit DEGREE_180;
    public static final Visit DEGREE_270;
    public static final Visit DEGREE_90;
    private static int IAuthTabCallback = 0;
    private static int asInterface = 1;
    private static char onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static char[] onWarmupCompleted;
    private final int code;

    private static final /* synthetic */ Visit[] $values() {
        Visit[] visitArr;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 111;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            Visit visit = DEGREE_0;
            Visit visit2 = DEGREE_90;
            Visit visit3 = DEGREE_180;
            Visit visit4 = DEGREE_270;
            visitArr = new Visit[3];
            visitArr[1] = visit;
            visitArr[1] = visit2;
            visitArr[3] = visit3;
            visitArr[5] = visit4;
        } else {
            visitArr = new Visit[]{DEGREE_0, DEGREE_90, DEGREE_180, DEGREE_270};
        }
        int i4 = i2 + 85;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return visitArr;
    }

    public static EnumEntries<Visit> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 89;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<Visit> enumEntries = $ENTRIES;
        int i5 = i2 + 25;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    private Visit(String str, int i, int i2) {
        this.code = i2;
    }

    public final int getCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.code;
        }
        throw null;
    }

    static {
        onWarmupCompleted();
        Object[] objArr = new Object[1];
        a(new char[]{4, 6, 15, 1, 13891, 13891, 3, 14}, (byte) (100 - KeyEvent.normalizeMetaState(0)), 8 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr);
        DEGREE_0 = new Visit(((String) objArr[0]).intern(), 0, 0);
        Object[] objArr2 = new Object[1];
        a(new char[]{4, 6, 15, 1, 13826, 13826, 3, 2, 13773}, (byte) (35 - (ViewConfiguration.getEdgeSlop() >> 16)), 9 - TextUtils.getTrimmedLength(""), objArr2);
        DEGREE_90 = new Visit(((String) objArr2[0]).intern(), 1, 1);
        Object[] objArr3 = new Object[1];
        a(new char[]{4, 6, 15, 1, 13798, 13798, 6, 2, '\r', '\f'}, (byte) (7 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10, objArr3);
        DEGREE_180 = new Visit(((String) objArr3[0]).intern(), 2, 2);
        Object[] objArr4 = new Object[1];
        a(new char[]{4, 6, 15, 1, 13815, 13815, 6, 14, 3, '\f'}, (byte) (23 - TextUtils.lastIndexOf("", '0', 0)), 10 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr4);
        DEGREE_270 = new Visit(((String) objArr4[0]).intern(), 3, 3);
        Visit[] visitArr$values = $values();
        $VALUES = visitArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(visitArr$values);
        Companion = new onNavigationEvent(null);
        int i = onExtraCallbackWithResult + 41;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    public static Visit valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Visit visit = (Visit) Enum.valueOf(Visit.class, str);
        int i4 = onNavigationEvent + 49;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 45 / 0;
        }
        return visit;
    }

    public static Visit[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Visit[] visitArr = (Visit[]) $VALUES.clone();
        int i3 = onNavigationEvent + 17;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return visitArr;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onWarmupCompleted;
        float f = 0.0f;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 26, (KeyEvent.getMaxKeyCode() >> 16) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), 27 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 23140 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i5 = $10 + 71;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                i2 = i + 59;
                cArr4[i2] = (char) (cArr[i2] << b);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i6 = $11 + 23;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)) + 24824), 74 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 8087 - TextUtils.indexOf((CharSequence) "", '0'), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        int i8 = $10 + 77;
                        $11 = i8 % 128;
                        int i9 = i8 % 2;
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 30, 19488 - (Process.myTid() >> 22), 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i10 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i10];
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i11 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i11];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i12];
                        } else {
                            int i13 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i13];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i14];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
                f = 0.0f;
            }
        }
        for (int i15 = 0; i15 < i; i15++) {
            cArr4[i15] = (char) (cArr4[i15] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static void onWarmupCompleted() {
        onWarmupCompleted = new char[]{64900, 64906, 65004, 64993, 64902, 65014, 64920, 65015, 64923, 64921, 64897, 64903, 64907, 65012, 64898, 64899};
        onExtraCallback = (char) 51245;
    }
}
