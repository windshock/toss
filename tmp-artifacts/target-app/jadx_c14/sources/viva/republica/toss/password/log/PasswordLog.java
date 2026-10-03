package viva.republica.toss.password.log;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.util.UUID;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CommonModule_closeView;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.Deinitialize;
import o.PangleEncryptUtilsType4;
import o.checkValidYaw;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import o.wie2;
import o.zzaj;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PasswordLog implements Deinitialize {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable = 0;
    public static final Companion Companion;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int asInterface = 0;
    private static boolean onExtraCallback = false;
    private static boolean onExtraCallbackWithResult = false;
    private static char[] onNavigationEvent = null;
    private static int onTransact = 1;
    private static int onWarmupCompleted;
    private final int failCount;
    private final String logId;
    private final boolean matched;
    private final String timestamp;

    static {
        onExtraCallbackWithResult();
        Companion = new Companion(null);
        int i = onWarmupCompleted + 77;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = asInterface + 5;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof PasswordLog)) {
            return false;
        }
        PasswordLog passwordLog = (PasswordLog) obj;
        if (this.matched != passwordLog.matched) {
            int i4 = IAuthTabCallbackDefault + 111;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.failCount == passwordLog.failCount) {
            return Intrinsics.areEqual(this.timestamp, passwordLog.timestamp);
        }
        int i6 = asInterface + 93;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = asInterface + 41;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((Boolean.hashCode(this.matched) * 31) + Integer.hashCode(this.failCount)) * 31) + this.timestamp.hashCode();
        int i4 = asInterface + 73;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        boolean z = this.matched;
        int i2 = this.failCount;
        String str = this.timestamp;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        Object obj = null;
        a(null, null, new byte[]{-109, -118, -110, -111, -112, -113, -121, -114, -115, -116, -124, -117, -118, -119, -124, -120, -125, -125, -121, -122}, 127 - Color.alpha(0), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(z);
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-109, -113, -123, -102, -124, -103, -104, -105, -121, -106, -107, -108}, 127 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(i2);
        Object[] objArr3 = new Object[1];
        a(null, null, new byte[]{-109, -101, -114, -121, -113, -125, -110, -114, -105, -113, -107, -108}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 127, objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(str);
        Object[] objArr4 = new Object[1];
        a(null, null, new byte[]{-100}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 128, objArr4);
        sb.append(((String) objArr4[0]).intern());
        String string = sb.toString();
        int i3 = asInterface + 99;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            return string;
        }
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PasswordLog> serializer() {
            return PasswordLog$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PasswordLog(int i, boolean z, int i2, String str, okycx okycxVar) {
        if (3 != (i & 3)) {
            htf31.onExtraCallbackWithResult(i, 3, PasswordLog$$serializer.INSTANCE.getDescriptor());
            int i3 = IAuthTabCallbackDefault + 79;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        }
        this.matched = z;
        this.failCount = i2;
        if ((i & 4) == 0) {
            str = CommonModule_closeView.onWarmupCompleted.getInterfaceDescriptor().format(Long.valueOf(zzaj.onWarmupCompleted().IAuthTabCallbackDefault()));
            Intrinsics.checkNotNullExpressionValue(str, "");
            int i6 = 2 % 2;
        }
        this.timestamp = str;
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        this.logId = string;
        int i7 = IAuthTabCallbackDefault + 23;
        asInterface = i7 % 128;
        int i8 = i7 % 2;
    }

    public PasswordLog(boolean z, int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.matched = z;
        this.failCount = i;
        this.timestamp = str;
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        this.logId = string;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(PasswordLog passwordLog, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = asInterface + 11;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onNavigationEvent(serialDescriptor, 0, passwordLog.matched);
        vylVar.onExtraCallback(serialDescriptor, 1, passwordLog.failCount);
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i4 = asInterface + 97;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                String str = passwordLog.timestamp;
                String str2 = CommonModule_closeView.onWarmupCompleted.getInterfaceDescriptor().format(Long.valueOf(zzaj.onWarmupCompleted().IAuthTabCallbackDefault()));
                Intrinsics.checkNotNullExpressionValue(str2, "");
                if (Intrinsics.areEqual(str, str2)) {
                    return;
                }
            } else {
                String str3 = passwordLog.timestamp;
                String str4 = CommonModule_closeView.onWarmupCompleted.getInterfaceDescriptor().format(Long.valueOf(zzaj.onWarmupCompleted().IAuthTabCallbackDefault()));
                Intrinsics.checkNotNullExpressionValue(str4, "");
                Intrinsics.areEqual(str3, str4);
                throw null;
            }
        }
        vylVar.onExtraCallback(serialDescriptor, 2, passwordLog.timestamp);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PasswordLog(boolean z, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 4) != 0) {
            int i3 = IAuthTabCallbackDefault + 43;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            str = CommonModule_closeView.onWarmupCompleted.getInterfaceDescriptor().format(Long.valueOf(zzaj.onWarmupCompleted().IAuthTabCallbackDefault()));
            Intrinsics.checkNotNullExpressionValue(str, "");
            int i5 = asInterface + 47;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
        }
        this(z, i, str);
    }

    public void IAuthTabCallback(@NotNull OutputStream outputStream) throws IOException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 51;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(outputStream, "");
        try {
            wie2 wie2VarIAuthTabCallback = checkValidYaw.IAuthTabCallback();
            wie2VarIAuthTabCallback.onExtraCallback();
            PangleEncryptUtilsType4.onExtraCallback(wie2VarIAuthTabCallback, Companion.serializer(), this, outputStream);
            int i4 = asInterface + 43;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    public String onWarmupCompleted() throws Throwable {
        int i = 2 % 2;
        String str = this.timestamp;
        String str2 = this.logId;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-123, -124, -125, -126, -127}, MotionEvent.axisFromString("") + 128, objArr);
        sb.append(((String) objArr[0]).intern());
        String string = sb.toString();
        int i2 = IAuthTabCallbackDefault + 5;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onNavigationEvent;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $11 + 71;
                $10 = i6 % 128;
                if (i6 % i3 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 77 - (ViewConfiguration.getTapTimeout() >> 16), (Process.myTid() >> 22) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i5])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 77 - Color.alpha(0), Color.red(0) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i5++;
                }
                i3 = 2;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(IAuthTabCallback)};
        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback3 == null) {
            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getEdgeSlop() >> 16), 75 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), Drawable.resolveOpacity(0, 0) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
        if (onExtraCallbackWithResult) {
            int i7 = $11 + 77;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.green(0), 62 - TextUtils.lastIndexOf("", '0'), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 12215, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (onExtraCallback) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.getDefaultSize(0, 0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 63, 12214 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i9 = $11 + 97;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback * defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] / i] >>> iIntValue);
                i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted;
            } else {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted + 1;
            }
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = i2;
        }
        objArr[0] = new String(cArr6);
    }

    static void onExtraCallbackWithResult() {
        onNavigationEvent = new char[]{32618, 32438, 32429, 32425, 32426, 32392, 32447, 32417, 32430, 32444, 32404, 32433, 32624, 32427, 32428, 32445, 32432, 32435, 32411, 32628, 32632, 32434, 32439, 32436, 32413, 32419, 32424, 32631};
        IAuthTabCallback = -1184333992;
        onExtraCallback = true;
        onExtraCallbackWithResult = true;
    }
}
