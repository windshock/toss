package im.toss.facepay.validation.model.init.config.service;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AutoExposureConfig {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Companion Companion;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int asBinder = 0;
    private static int onExtraCallback = 0;
    private static boolean onExtraCallbackWithResult = false;
    private static boolean onNavigationEvent = false;
    private static int onTransact = 1;
    private static char[] onWarmupCompleted;
    private final boolean isEnabled;

    static {
        IAuthTabCallback();
        Companion = new Companion(null);
        int i = IAuthTabCallback + 5;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    public AutoExposureConfig() {
        this(false, 1, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onTransact + 59;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof AutoExposureConfig) {
            return this.isEnabled == ((AutoExposureConfig) obj).isEnabled;
        }
        int i4 = asBinder + 121;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = asBinder + 9;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.isEnabled);
        int i4 = asBinder + 91;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        boolean z = this.isEnabled;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        Object obj = null;
        a(null, null, new byte[]{-107, -108, -118, -109, -110, -111, -116, -123, -120, -114, -112, -113, -114, -115, -116, -124, -117, -118, -119, -126, -120, -124, -121, -122, -123, -124, -125, -126, -127}, 127 - TextUtils.indexOf("", ""), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(z);
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-106}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 127, objArr2);
        sb.append(((String) objArr2[0]).intern());
        String string = sb.toString();
        int i2 = onTransact + 61;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return string;
        }
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AutoExposureConfig> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 43;
            onExtraCallbackWithResult = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                AutoExposureConfig$$serializer autoExposureConfig$$serializer = AutoExposureConfig$$serializer.INSTANCE;
                throw null;
            }
            AutoExposureConfig$$serializer autoExposureConfig$$serializer2 = AutoExposureConfig$$serializer.INSTANCE;
            int i3 = onWarmupCompleted + 101;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return autoExposureConfig$$serializer2;
            }
            obj.hashCode();
            throw null;
        }
    }

    public /* synthetic */ AutoExposureConfig(int i, boolean z, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.isEnabled = true;
            int i2 = asBinder + 67;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        this.isEnabled = z;
        int i4 = onTransact + 19;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onNavigationEvent(AutoExposureConfig autoExposureConfig, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onTransact + 117;
        asBinder = i2 % 128;
        if (i2 % 2 == 0 ? vylVar.onWarmupCompleted(serialDescriptor, 0) : vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            vylVar.onNavigationEvent(serialDescriptor, 0, autoExposureConfig.isEnabled);
            int i3 = asBinder + 117;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
        } else if (!autoExposureConfig.isEnabled) {
        }
        int i5 = asBinder + 105;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
    }

    public AutoExposureConfig(boolean z) {
        this.isEnabled = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AutoExposureConfig(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onTransact + 1;
            int i3 = i2 % 128;
            asBinder = i3;
            z = i2 % 2 == 0;
            int i4 = i3 + 93;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        }
        this(z);
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onWarmupCompleted;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 1), View.resolveSize(0, 0) + 77, 20952 - Color.argb(0, 0, 0, 0), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i3++;
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
        Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(""), 75 - Color.blue(0), TextUtils.indexOf((CharSequence) "", '0', 0) + 16038, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        if (onNavigationEvent) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i4 = $10 + 5;
                $11 = i4 % 128;
                if (i4 % 2 == 0) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback >>> 1) >> defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] % i] / iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 63 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), KeyEvent.keyCodeFromString("") + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } else {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 63 - TextUtils.getCapsMode("", 0, 0), 12214 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!onExtraCallbackWithResult) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i5 = $11 + 115;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback * defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] / i] * iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), TextUtils.lastIndexOf("", '0') + 64, (KeyEvent.getMaxKeyCode() >> 16) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            } else {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                try {
                    Object[] objArr7 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback6 == null) {
                        objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 1), TextUtils.indexOf((CharSequence) "", '0') + 64, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 12215, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback6).invoke(null, objArr7);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
        }
        objArr[0] = new String(cArr6);
    }

    static void IAuthTabCallback() {
        onWarmupCompleted = new char[]{32426, 32510, 32511, 32452, 32430, 32499, 32507, 32504, 32505, 32462, 32424, 32453, 32461, 32450, 32460, 32387, 32458, 32457, 32455, 32463, 32438, 32386};
        onExtraCallback = -1184333973;
        onExtraCallbackWithResult = true;
        onNavigationEvent = true;
    }
}
