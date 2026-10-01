package im.toss.facepay.validation.model.init.config.service;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.tmoney.LiveCheckConstants;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.access8100;
import o.getMutilBackgroundDrawable;
import o.getWriggleLayout;
import o.getWrite;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class OtaConfig {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final KSerializer<Object>[] $childSerializers;
    public static final Companion Companion;
    private static final Map<String, String> DEFAULT_PACKAGE_NAMES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static char[] onExtraCallbackWithResult = null;
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    private static char onWarmupCompleted;
    private final Map<String, String> packageNames;

    /* JADX WARN: Illegal instructions before constructor call */
    public OtaConfig() {
        Map map = null;
        this(map, 1, (DefaultConstructorMarker) map);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 17;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this != obj) {
            return (obj instanceof OtaConfig) && Intrinsics.areEqual(this.packageNames, ((OtaConfig) obj).packageNames);
        }
        int i4 = i2 + 123;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onTransact + 45;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            iHashCode = this.packageNames.hashCode();
            int i3 = 69 / 0;
        } else {
            iHashCode = this.packageNames.hashCode();
        }
        int i4 = onExtraCallback + 73;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        Map<String, String> map = this.packageNames;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new char[]{16, 23, '\b', 0, '\n', 25, 31, 29, '\t', 6, 18, 7, 15, 31, 7, '\t', 18, '#', '\t', 18, 18, 19, 13783}, (byte) (TextUtils.getOffsetBefore("", 0) + 48), 24 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(map);
        Object[] objArr2 = new Object[1];
        a(new char[]{13774}, (byte) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 27), 1 - TextUtils.indexOf("", ""), objArr2);
        sb.append(((String) objArr2[0]).intern());
        String string = sb.toString();
        int i2 = onTransact + 63;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return string;
        }
        throw null;
    }

    public /* synthetic */ OtaConfig(int i, Map map, okycx okycxVar) {
        if ((i & 1) != 0) {
            this.packageNames = map;
            int i2 = onTransact + 65;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        this.packageNames = DEFAULT_PACKAGE_NAMES;
        int i4 = onTransact + 79;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ KSerializer[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 119;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return $childSerializers;
        }
        throw null;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(OtaConfig otaConfig, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onTransact + 97;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        py[] pyVarArr = $childSerializers;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i4 = onExtraCallback + 91;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            if (Intrinsics.areEqual(otaConfig.packageNames, DEFAULT_PACKAGE_NAMES)) {
                return;
            }
        }
        vylVar.onNavigationEvent(serialDescriptor, 0, pyVarArr[0], otaConfig.packageNames);
        int i6 = onExtraCallback + 57;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
    }

    public OtaConfig(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.packageNames = map;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ OtaConfig(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onTransact;
            int i3 = i2 + 55;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Map<String, String> map2 = DEFAULT_PACKAGE_NAMES;
            int i5 = i2 + 77;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            map = map2;
        }
        this(map);
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OtaConfig> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 7;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            OtaConfig$$serializer otaConfig$$serializer = OtaConfig$$serializer.INSTANCE;
            int i4 = onWarmupCompleted + 13;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 70 / 0;
            }
            return otaConfig$$serializer;
        }
    }

    static {
        IAuthTabCallback();
        Companion = new Companion(null);
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        $childSerializers = new KSerializer[]{new getMutilBackgroundDrawable<>(getwrigglelayout, getwrigglelayout)};
        Object[] objArr = new Object[1];
        a(new char[]{27, 19, 16, 21, 6, 19, 21, '\f', '\"', 17, '\n', 25, 21, 4, 29, 19, '!', 14, 17, 22, 21, 18, '\f', 24, 13885}, (byte) (62 - Drawable.resolveOpacity(0, 0)), 25 - (ViewConfiguration.getTouchSlop() >> 8), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new char[]{27, 19, 16, 21, 6, 19, 21, '\f', '\"', 17, '\n', 25, 21, 4, 29, 19, '!', 14, 4, 5, 14, 27, 29, 5, 7, 30, 21, 23, 16, 17, 18, 21, 18, 11, 19, 18}, (byte) (43 - View.MeasureSpec.getMode(0)), 36 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr2);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(strIntern, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a(new char[]{27, 19, 16, 21, 6, 19, 21, '\f', '\"', 17, '\n', 25, 21, 4, 29, 19, '!', 14, 29, 20, '#', ' ', 13876}, (byte) (Color.green(0) + 55), TextUtils.getTrimmedLength("") + 23, objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a(new char[]{27, 19, 16, 21, 6, 19, 21, '\f', '\"', 17, '\n', 25, 21, 4, 29, 19, '!', 14, 4, 5, 14, 27, 29, 5, 7, 30, 21, 23, 14, 27, 22, '#', ' ', 7}, (byte) (TextUtils.getOffsetBefore("", 0) + 63), 34 - KeyEvent.getDeadChar(0, 0), objArr4);
        DEFAULT_PACKAGE_NAMES = access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(strIntern2, ((String) objArr4[0]).intern())});
        int i = onNavigationEvent + 17;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onExtraCallbackWithResult;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0')), (KeyEvent.getMaxKeyCode() >> 16) + 26, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
        Object[] objArr3 = {Integer.valueOf(onWarmupCompleted)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getTouchSlop() >> 8) + 26, 23139 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -2137011959, false, "z", new Class[]{Integer.TYPE});
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
            int i6 = $11 + 77;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    int i8 = $11 + 7;
                    $10 = i8 % 128;
                    if (i8 % 2 != 0) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback >> b);
                        int i9 = defaultGainProviderExternalSyntheticLambda0.onNavigationEvent;
                        cArr4[0] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback >> b);
                    } else {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    }
                    obj = obj2;
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 74 - TextUtils.indexOf("", "", 0, 0), 8088 - Drawable.resolveOpacity(0, 0), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        int i10 = $11 + 23;
                        $10 = i10 % 128;
                        int i11 = i10 % 2;
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), (ViewConfiguration.getTapTimeout() >> 16) + 30, 19488 - KeyEvent.normalizeMetaState(0), 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i12];
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            int i13 = $11 + 123;
                            $10 = i13 % 128;
                            int i14 = i13 % 2;
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i15 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i16 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i15];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i16];
                        } else {
                            int i17 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i18 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i17];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i18];
                            int i19 = $10 + 87;
                            $11 = i19 % 128;
                            i3 = 2;
                            int i20 = i19 % 2;
                            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += i3;
                            obj2 = obj;
                        }
                    }
                }
                i3 = 2;
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += i3;
                obj2 = obj;
            }
        }
        int i21 = 0;
        while (i21 < i) {
            int i22 = $10 + 25;
            $11 = i22 % 128;
            if (i22 % 2 == 0) {
                cArr4[i21] = (char) (cArr4[i21] ^ 17815);
                i21 += 73;
            } else {
                cArr4[i21] = (char) (cArr4[i21] ^ 13722);
                i21++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    static void IAuthTabCallback() {
        onExtraCallbackWithResult = new char[]{51243, 51247, 65008, 64965, 64897, 51233, 64978, 64988, 64980, 51242, 51246, 64923, 51244, 64976, 64910, 64925, 64961, 65020, 64960, 64963, 64991, 64990, 64967, 64982, 64922, 64986, 64983, 51245, 64989, 51240, 65021, 64966, 64964, 64984, 64977, 64981};
        onWarmupCompleted = (char) 51247;
    }
}
