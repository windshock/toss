package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface transV2GenerateCertNum {
    WritableMap onExtraCallbackWithResult();

    public static final class onWarmupCompleted implements transV2GenerateCertNum {
        private final String onExtraCallbackWithResult;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof onWarmupCompleted) && Intrinsics.areEqual(this.onExtraCallbackWithResult, ((onWarmupCompleted) obj).onExtraCallbackWithResult);
        }

        public int hashCode() {
            return this.onExtraCallbackWithResult.hashCode();
        }

        public String toString() {
            return "PreloadApp(appName=" + this.onExtraCallbackWithResult + ")";
        }

        public onWarmupCompleted(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onExtraCallbackWithResult = str;
        }

        @Override // o.transV2GenerateCertNum
        public WritableMap onExtraCallbackWithResult() {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("appName", this.onExtraCallbackWithResult);
            return transV2GetOtherDeviceID.onWarmupCompleted("preloadApp", writableMapCreateMap);
        }
    }

    public static final class onExtraCallbackWithResult implements transV2GenerateCertNum {
        private static short[] IAuthTabCallbackStub;
        private final String IAuthTabCallback;
        private final String onExtraCallbackWithResult;
        private final String onNavigationEvent;
        private static final byte[] $$a = {62, 54, 60, 44};
        private static final int $$b = 244;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onTransact = 0;
        private static int IAuthTabCallbackDefault = 1;
        private static int onWarmupCompleted = -1629135955;
        private static int onExtraCallback = -1538795422;
        private static int asInterface = -2040391614;
        private static byte[] asBinder = {108, 44, 72, 81, 65, 83, 89, 69, -55, -7, -76, -4, -63, 8, 8};

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(short s, byte b, int i) {
            int i2;
            byte[] bArr = $$a;
            int i3 = 115 - (b * 3);
            int i4 = s * 2;
            int i5 = 3 - (i * 3);
            byte[] bArr2 = new byte[i4 + 1];
            if (bArr == null) {
                int i6 = i4;
                int i7 = i5;
                i2 = 0;
                int i8 = i5 + i6;
                i5 = i7;
                i3 = i8;
                int i9 = i5 + 1;
                bArr2[i2] = (byte) i3;
                if (i2 == i4) {
                    return new String(bArr2, 0);
                }
                i2++;
                i6 = bArr[i9];
                i5 = i3;
                i7 = i9;
                int i82 = i5 + i6;
                i5 = i7;
                i3 = i82;
                int i92 = i5 + 1;
                bArr2[i2] = (byte) i3;
                if (i2 == i4) {
                }
            } else {
                i2 = 0;
                int i922 = i5 + 1;
                bArr2[i2] = (byte) i3;
                if (i2 == i4) {
                }
            }
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 49;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                return false;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, onextracallbackwithresult.onExtraCallbackWithResult) || !Intrinsics.areEqual(this.onNavigationEvent, onextracallbackwithresult.onNavigationEvent)) {
                return false;
            }
            if (Intrinsics.areEqual(this.IAuthTabCallback, onextracallbackwithresult.IAuthTabCallback)) {
                return true;
            }
            int i4 = IAuthTabCallbackDefault + 35;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 21;
            onTransact = i2 % 128;
            int iHashCode = i2 % 2 != 0 ? (((this.onExtraCallbackWithResult.hashCode() + 100) - this.onNavigationEvent.hashCode()) >> 20) / this.IAuthTabCallback.hashCode() : (((this.onExtraCallbackWithResult.hashCode() * 31) + this.onNavigationEvent.hashCode()) * 31) + this.IAuthTabCallback.hashCode();
            int i3 = IAuthTabCallbackDefault + 85;
            onTransact = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 51 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "OpenApp(sessionId=" + this.onExtraCallbackWithResult + ", appName=" + this.onNavigationEvent + ", scheme=" + this.IAuthTabCallback + ")";
            int i2 = onTransact + 89;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 34 / 0;
            }
            return str;
        }

        public onExtraCallbackWithResult(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.onExtraCallbackWithResult = str;
            this.onNavigationEvent = str2;
            this.IAuthTabCallback = str3;
        }

        @Override // o.transV2GenerateCertNum
        public WritableMap onExtraCallbackWithResult() throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 101;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            WritableMap writableMapCreateMap = Arguments.createMap();
            Object[] objArr = new Object[1];
            a((short) (50 - Color.green(0)), (byte) ((-115) - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET)), TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0') - 983729060, (-572899286) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (-97) - Drawable.resolveOpacity(0, 0), objArr);
            writableMapCreateMap.putString(((String) objArr[0]).intern(), this.onExtraCallbackWithResult);
            writableMapCreateMap.putString("appName", this.onNavigationEvent);
            Object[] objArr2 = new Object[1];
            a((short) ((ViewConfiguration.getPressedStateDuration() >> 16) - 90), (byte) ((-97) - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), Process.getGidForName(_UrlKt.FRAGMENT_ENCODE_SET) - 983729052, (ViewConfiguration.getMaximumFlingVelocity() >> 16) - 572899287, (-100) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr2);
            writableMapCreateMap.putString(((String) objArr2[0]).intern(), this.IAuthTabCallback);
            WritableMap writableMapOnWarmupCompleted = transV2GetOtherDeviceID.onWarmupCompleted("openApp", writableMapCreateMap);
            int i4 = IAuthTabCallbackDefault + 17;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                return writableMapOnWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
            boolean z;
            long j;
            int i4;
            long j2;
            int i5 = 2;
            int i6 = 2 % 2;
            TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43423 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 42, TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0) + 22440, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                if (iIntValue == -1) {
                    int i7 = $10 + 13;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    int i9 = $11 + 73;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    byte[] bArr = asBinder;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i11 = 0;
                        while (i11 < length) {
                            int i12 = $10 + 79;
                            $11 = i12 % 128;
                            if (i12 % i5 == 0) {
                                Object[] objArr3 = {Integer.valueOf(bArr[i11])};
                                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                                if (objOnExtraCallback2 == null) {
                                    byte b2 = (byte) 0;
                                    byte b3 = b2;
                                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.argb(0, 0, 0, 0) + 12843), 55 - (ViewConfiguration.getWindowTouchSlop() >> 8), 2167 - (ViewConfiguration.getTapTimeout() >> 16), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                                }
                                bArr2[i11] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                                i11 %= 0;
                                i5 = 2;
                            } else {
                                try {
                                    Object[] objArr4 = {Integer.valueOf(bArr[i11])};
                                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                                    if (objOnExtraCallback3 == null) {
                                        j2 = 0;
                                        byte b4 = (byte) 0;
                                        byte b5 = b4;
                                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - KeyEvent.keyCodeFromString(_UrlKt.FRAGMENT_ENCODE_SET)), 54 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0), 2168 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -299036574, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                                    } else {
                                        j2 = 0;
                                    }
                                    bArr2[i11] = ((Byte) ((Method) objOnExtraCallback3).invoke(null, objArr4)).byteValue();
                                    i11++;
                                    i5 = 2;
                                } catch (Throwable th) {
                                    Throwable cause = th.getCause();
                                    if (cause == null) {
                                        throw th;
                                    }
                                    throw cause;
                                }
                            }
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        byte[] bArr3 = asBinder;
                        Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(onWarmupCompleted)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 43 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                        int i13 = $11 + 107;
                        $10 = i13 % 128;
                        int i14 = i13 % 2;
                        j = -4629411779493505016L;
                    } else {
                        j = -4629411779493505016L;
                        iIntValue = (short) (((short) (IAuthTabCallbackStub[i + ((int) (onWarmupCompleted ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                    }
                } else {
                    j = -4629411779493505016L;
                }
                if (iIntValue > 0) {
                    int i15 = ((i + iIntValue) - 2) + ((int) (onWarmupCompleted ^ j));
                    if (z) {
                        int i16 = $10 + 103;
                        $11 = i16 % 128;
                        int i17 = i16 % 2;
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i15 + i4;
                    Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(asInterface), sb};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 87 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), TextUtils.getTrimmedLength(_UrlKt.FRAGMENT_ENCODE_SET) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr4 = asBinder;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        for (int i18 = 0; i18 < length2; i18++) {
                            bArr5[i18] = (byte) (bArr4[i18] ^ (-4629411779493505016L));
                        }
                        bArr4 = bArr5;
                    }
                    boolean z2 = bArr4 != null;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        int i19 = $10 + 113;
                        $11 = i19 % 128;
                        if (i19 % 2 == 0) {
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        if (!z2) {
                            short[] sArr = IAuthTabCallbackStub;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            byte[] bArr6 = asBinder;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
    }

    public static final class onNavigationEvent implements transV2GenerateCertNum {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        private final String onWarmupCompleted;
        private static char[] onNavigationEvent = {64983, 65064, 64988, 64982, 64960, 65018, 65065, 64986, 64989};
        private static char onExtraCallback = 51242;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 41;
            IAuthTabCallback = i3 % 128;
            Object obj2 = null;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onNavigationEvent)) {
                int i4 = i2 + 23;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.onWarmupCompleted, ((onNavigationEvent) obj).onWarmupCompleted)) {
                return false;
            }
            int i6 = IAuthTabCallback + 7;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                return true;
            }
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 63;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.onWarmupCompleted.hashCode();
            int i4 = onExtraCallbackWithResult + 89;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "CloseApp(sessionId=" + this.onWarmupCompleted + ")";
            int i2 = IAuthTabCallback + 69;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onNavigationEvent(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onWarmupCompleted = str;
        }

        @Override // o.transV2GenerateCertNum
        public WritableMap onExtraCallbackWithResult() throws Throwable {
            WritableMap writableMapCreateMap;
            Object obj;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 11;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                writableMapCreateMap = Arguments.createMap();
                Object[] objArr = new Object[1];
                a(new char[]{5, 4, 13922, 13922, '\b', 1, 2, '\b', 13943}, (byte) (55 - (ViewConfiguration.getMaximumFlingVelocity() - 84)), View.getDefaultSize(1, 0) * 30, objArr);
                obj = objArr[0];
            } else {
                writableMapCreateMap = Arguments.createMap();
                Object[] objArr2 = new Object[1];
                a(new char[]{5, 4, 13922, 13922, '\b', 1, 2, '\b', 13943}, (byte) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + Imgproc.COLOR_YUV2RGBA_YVYU), View.getDefaultSize(0, 0) + 9, objArr2);
                obj = objArr2[0];
            }
            writableMapCreateMap.putString(((String) obj).intern(), this.onWarmupCompleted);
            WritableMap writableMapOnWarmupCompleted = transV2GetOtherDeviceID.onWarmupCompleted("closeApp", writableMapCreateMap);
            int i3 = onExtraCallbackWithResult + 51;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 36 / 0;
            }
            return writableMapOnWarmupCompleted;
        }

        private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr2 = onNavigationEvent;
            long j = 0;
            Object obj2 = null;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i4 = 0;
                while (i4 < length) {
                    int i5 = $10 + 105;
                    $11 = i5 % 128;
                    if (i5 % 2 == 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), 27 - (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)), 23139 - (ViewConfiguration.getLongPressTimeout() >> 16), -2137011959, false, "z", new Class[]{Integer.TYPE});
                            }
                            cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        try {
                            Object[] objArr3 = {Integer.valueOf(cArr2[i4])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarSize() >> 8), Process.getGidForName(_UrlKt.FRAGMENT_ENCODE_SET) + 27, 23139 - (Process.myTid() >> 22), -2137011959, false, "z", new Class[]{Integer.TYPE});
                            }
                            cArr3[i4] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                            i4++;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    j = 0;
                }
                cArr2 = cArr3;
            }
            try {
                Object[] objArr4 = {Integer.valueOf(onExtraCallback)};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 26, View.MeasureSpec.getMode(0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                }
                char cCharValue = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                char[] cArr4 = new char[i];
                if (i % 2 != 0) {
                    i2 = i - 1;
                    cArr4[i2] = (char) (cArr[i2] - b);
                } else {
                    i2 = i;
                }
                if (i2 > 1) {
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                    int i6 = $10 + 27;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                        defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                            obj = obj2;
                        } else {
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 24824), 73 - ImageFormat.getBitsPerPixel(0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                if (objOnExtraCallback5 == null) {
                                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), ExpandableListView.getPackedPositionType(0L) + 30, 19488 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                                int i8 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i8];
                            } else {
                                obj = null;
                                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                    defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                    int i9 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    int i10 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i9];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i10];
                                } else {
                                    int i11 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i11];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i12];
                                }
                            }
                        }
                        defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                        obj2 = obj;
                    }
                }
                for (int i13 = 0; i13 < i; i13++) {
                    int i14 = $11 + 39;
                    $10 = i14 % 128;
                    int i15 = i14 % 2;
                    cArr4[i13] = (char) (cArr4[i13] ^ 13722);
                }
                objArr[0] = new String(cArr4);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
    }

    public static final class onExtraCallback implements transV2GenerateCertNum {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char IAuthTabCallback = 591;
        private static char IAuthTabCallbackDefault = 25508;
        private static int asBinder = 1;
        private static int asInterface = 0;
        private static char onExtraCallbackWithResult = 38665;
        private static char onNavigationEvent = 47990;
        private final String onExtraCallback;
        private final boolean onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = asInterface;
            int i3 = i2 + 51;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            if (this == obj) {
                int i5 = i2 + 79;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            if (!(obj instanceof onExtraCallback)) {
                return false;
            }
            onExtraCallback onextracallback = (onExtraCallback) obj;
            if (!Intrinsics.areEqual(this.onExtraCallback, onextracallback.onExtraCallback)) {
                int i7 = asInterface + 47;
                asBinder = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            if (this.onWarmupCompleted != onextracallback.onWarmupCompleted) {
                return false;
            }
            int i9 = asBinder + 119;
            asInterface = i9 % 128;
            int i10 = i9 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = asBinder + Imgproc.COLOR_YUV2RGB_YVYU;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (this.onExtraCallback.hashCode() * 31) + Boolean.hashCode(this.onWarmupCompleted);
            int i4 = asInterface + 47;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "SessionVisibilityChanged(sessionId=" + this.onExtraCallback + ", isVisible=" + this.onWarmupCompleted + ")";
            int i2 = asBinder + 23;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onExtraCallback(@NotNull String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onExtraCallback = str;
            this.onWarmupCompleted = z;
        }

        @Override // o.transV2GenerateCertNum
        public WritableMap onExtraCallbackWithResult() throws Throwable {
            WritableMap writableMapCreateMap;
            Object obj;
            int i = 2 % 2;
            int i2 = asInterface + 101;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                writableMapCreateMap = Arguments.createMap();
                Object[] objArr = new Object[1];
                a(new char[]{48127, 31268, 9740, 30875, 27030, 30485, 35470, 48923, 53069, 24876}, 100 >> KeyEvent.keyCodeFromString(_UrlKt.FRAGMENT_ENCODE_SET), objArr);
                obj = objArr[0];
            } else {
                writableMapCreateMap = Arguments.createMap();
                Object[] objArr2 = new Object[1];
                a(new char[]{48127, 31268, 9740, 30875, 27030, 30485, 35470, 48923, 53069, 24876}, KeyEvent.keyCodeFromString(_UrlKt.FRAGMENT_ENCODE_SET) + 9, objArr2);
                obj = objArr2[0];
            }
            writableMapCreateMap.putString(((String) obj).intern(), this.onExtraCallback);
            writableMapCreateMap.putBoolean("isVisible", this.onWarmupCompleted);
            WritableMap writableMapOnWarmupCompleted = transV2GetOtherDeviceID.onWarmupCompleted("sessionVisibilityChanged", writableMapCreateMap);
            int i3 = asBinder + 111;
            asInterface = i3 % 128;
            if (i3 % 2 == 0) {
                return writableMapOnWarmupCompleted;
            }
            throw null;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
            char[] cArr2 = new char[cArr.length];
            int i3 = 0;
            defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
            char[] cArr3 = new char[2];
            while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
                int i4 = $10 + 65;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                int i6 = $11 + 85;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                int i8 = 58224;
                int i9 = i3;
                while (i9 < 16) {
                    char c = cArr3[1];
                    char c2 = cArr3[i3];
                    int i10 = (c2 + i8) ^ ((c2 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)));
                    int i11 = c2 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(IAuthTabCallbackDefault);
                        objArr2[2] = Integer.valueOf(i11);
                        objArr2[1] = Integer.valueOf(i10);
                        objArr2[i3] = Integer.valueOf(c);
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback == null) {
                            char mode = (char) View.MeasureSpec.getMode(i3);
                            int iMyPid = 10 - (Process.myPid() >> 22);
                            int maximumDrawingCacheSize = 12434 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                            Class[] clsArr = new Class[4];
                            clsArr[i3] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(mode, iMyPid, maximumDrawingCacheSize, -787580090, false, "C", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        char[] cArr4 = cArr3;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onNavigationEvent)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 10 - Color.red(0), 12434 - Color.alpha(0), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i8 -= 40503;
                        i9++;
                        int i12 = $10 + 113;
                        $11 = i12 % 128;
                        int i13 = i12 % 2;
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
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 16014), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 14, TextUtils.getOffsetAfter(_UrlKt.FRAGMENT_ENCODE_SET, 0) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                cArr3 = cArr5;
                i3 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }
    }
}
