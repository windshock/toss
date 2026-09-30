package im.toss.facepay.log.model;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access15300;
import o.liq;
import o.nc;
import o.updateRenderInfoForVideo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class LogStatus {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LogStatus[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;

    @nc(IAuthTabCallback = "end")
    public static final LogStatus END;
    private static char[] IAuthTabCallback = null;
    private static int IAuthTabCallbackStub = 1;

    @nc(IAuthTabCallback = "ing")
    public static final LogStatus ING;

    @nc(IAuthTabCallback = "start")
    public static final LogStatus START;
    private static int onExtraCallback = 1;
    private static char onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final String value;

    public static /* synthetic */ KSerializer $r8$lambda$zDmW8B_3OO7xLUfkYdhU6KukqTU() throws Throwable {
        KSerializer kSerializer_init_$_anonymous_;
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializer_init_$_anonymous_ = _init_$_anonymous_();
            int i3 = 8 / 0;
        } else {
            kSerializer_init_$_anonymous_ = _init_$_anonymous_();
        }
        int i4 = onNavigationEvent + 1;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 79 / 0;
        }
        return kSerializer_init_$_anonymous_;
    }

    private static final /* synthetic */ LogStatus[] $values() {
        LogStatus[] logStatusArr;
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            LogStatus logStatus = START;
            LogStatus logStatus2 = ING;
            LogStatus logStatus3 = END;
            logStatusArr = new LogStatus[5];
            logStatusArr[1] = logStatus;
            logStatusArr[0] = logStatus2;
            logStatusArr[3] = logStatus3;
        } else {
            logStatusArr = new LogStatus[]{START, ING, END};
        }
        int i4 = i3 + 19;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return logStatusArr;
    }

    public static EnumEntries<LogStatus> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        EnumEntries<LogStatus> enumEntries = $ENTRIES;
        int i5 = i3 + 107;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 81;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializer = (KSerializer) LogStatus.access$get$cachedSerializer$delegate$cp().getValue();
            if (i3 == 0) {
                return kSerializer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final KSerializer<LogStatus> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 1;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return onExtraCallbackWithResult();
            }
            onExtraCallbackWithResult();
            throw null;
        }
    }

    private static final /* synthetic */ KSerializer _init_$_anonymous_() throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        LogStatus[] logStatusArrValues = values();
        Object[] objArr = new Object[1];
        a(new char[]{'#', 7, 26, 14, 13861}, (byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 54), Drawable.resolveOpacity(0, 0) + 5, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new char[]{24, 30, 13890}, (byte) (69 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (ViewConfiguration.getTapTimeout() >> 16) + 3, objArr2);
        String strIntern2 = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(new char[]{6, 28, 13933}, (byte) (110 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (ViewConfiguration.getEdgeSlop() >> 16) + 3, objArr3);
        Object[] objArr4 = new Object[1];
        a(new char[]{19, 20, 11, 17, 25, '#', '#', 1, ' ', 18, '\"', '\b', '\b', 26, 29, 1, 17, 25, '#', 4, 23, 25, 28, '\b', 17, 1, 17, 26, '#', '\"', '\b', 23, '\n', 29, 13813}, (byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 11), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 36, objArr4);
        KSerializer kSerializerOnNavigationEvent = updateRenderInfoForVideo.onNavigationEvent(((String) objArr4[0]).intern(), logStatusArrValues, new String[]{strIntern, strIntern2, ((String) objArr3[0]).intern()}, new Annotation[][]{null, null, null}, (Annotation[]) null);
        int i4 = onExtraCallback + 27;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerOnNavigationEvent;
        }
        throw null;
    }

    public static final /* synthetic */ Lazy access$get$cachedSerializer$delegate$cp() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return $cachedSerializer$delegate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private LogStatus(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 87;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.value;
        int i5 = i2 + 71;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        onExtraCallback();
        Object[] objArr = new Object[1];
        a(new char[]{30, 15, 2, 4, 13779}, (byte) (TextUtils.indexOf((CharSequence) "", '0') + 6), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 4, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new char[]{'#', 7, 26, 14, 13861}, (byte) (55 - View.resolveSizeAndState(0, 0, 0)), Color.red(0) + 5, objArr2);
        START = new LogStatus(strIntern, 0, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a(new char[]{21, 11, 13816}, (byte) (ExpandableListView.getPackedPositionType(0L) + 27), 3 - ExpandableListView.getPackedPositionGroup(0L), objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a(new char[]{24, 30, 13890}, (byte) (70 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), MotionEvent.axisFromString("") + 4, objArr4);
        ING = new LogStatus(strIntern2, 1, ((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        a(new char[]{27, 15, 13815}, (byte) (24 - ImageFormat.getBitsPerPixel(0)), 2 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr5);
        String strIntern3 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a(new char[]{6, 28, 13933}, (byte) (111 - Color.argb(0, 0, 0, 0)), 3 - (Process.myTid() >> 22), objArr6);
        END = new LogStatus(strIntern3, 2, ((String) objArr6[0]).intern());
        LogStatus[] logStatusArr$values = $values();
        $VALUES = logStatusArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(logStatusArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.facepay.log.model.LogStatus$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() throws Throwable {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 49;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializer$r8$lambda$zDmW8B_3OO7xLUfkYdhU6KukqTU = LogStatus.$r8$lambda$zDmW8B_3OO7xLUfkYdhU6KukqTU();
                int i4 = onExtraCallbackWithResult + 119;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    return kSerializer$r8$lambda$zDmW8B_3OO7xLUfkYdhU6KukqTU;
                }
                throw null;
            }
        });
        int i = onWarmupCompleted + 25;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    public static LogStatus valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        LogStatus logStatus = (LogStatus) Enum.valueOf(LogStatus.class, str);
        int i3 = onExtraCallback + 55;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 79 / 0;
        }
        return logStatus;
    }

    public static LogStatus[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        LogStatus[] logStatusArr = (LogStatus[]) $VALUES.clone();
        int i4 = onExtraCallback + 45;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return logStatusArr;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = IAuthTabCallback;
        long j = 0;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 27 - (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)), 23139 - (KeyEvent.getMaxKeyCode() >> 16), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i4++;
                    j = 0;
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
        Object[] objArr3 = {Integer.valueOf(onExtraCallbackWithResult)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 26 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 23139 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                int i5 = $11 + 123;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    int i7 = $10 + 119;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    obj = obj2;
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 24825), 74 - Color.argb(0, 0, 0, 0), 8088 - Color.blue(0), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), 30 - Drawable.resolveOpacity(0, 0), 19489 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i9 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i9];
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i10 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i10];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i11];
                        } else {
                            int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i12];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                int i14 = $11 + 95;
                $10 = i14 % 128;
                if (i14 % 2 != 0) {
                    int i15 = 3 % 4;
                }
                obj2 = obj;
            }
        }
        for (int i16 = 0; i16 < i; i16++) {
            cArr4[i16] = (char) (cArr4[i16] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static void onExtraCallback() {
        IAuthTabCallback = new char[]{51242, 65010, 64963, 64993, 65015, 64925, 51240, 65012, 64961, 65021, 64982, 64967, 64999, 64991, 65023, 51244, 51247, 51245, 64986, 64990, 64978, 65014, 51233, 65018, 64989, 64970, 64983, 51246, 64966, 64988, 64981, 64960, 64976, 64992, 64980, 51243};
        onExtraCallbackWithResult = (char) 51247;
    }
}
