package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq(onNavigationEvent = setBrickNativeValue.class)
/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class jni_YGNodeStyleGetPaddingJNI {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallback Companion;
    private static int IAuthTabCallback = 1;
    private static long onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    static {
        asBinder();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallback(defaultConstructorMarker);
        int i = IAuthTabCallback + 75;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public /* synthetic */ jni_YGNodeStyleGetPaddingJNI(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract long IAuthTabCallbackDefault();

    public abstract long IAuthTabCallbackStub();

    public abstract int onNavigationEvent();

    private jni_YGNodeStyleGetPaddingJNI() {
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $11 + 125;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0), 24 - View.MeasureSpec.makeMeasureSpec(0, 0), Gravity.getAbsoluteGravity(0, 0) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onExtraCallback ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 60 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), MotionEvent.axisFromString(BuildConfig.FLAVOR) + 6384, -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i6 = $11 + 15;
        while (true) {
            $10 = i6 % 128;
            int i7 = i6 % 2;
            if (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback >= cArr.length) {
                objArr[0] = new String(cArr2);
                return;
            }
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ImageFormat.getBitsPerPixel(0)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 59, View.resolveSize(0, 0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            i6 = $11 + 21;
        }
    }

    public final int onTransact() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        long jIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        int i4 = i3 != 0 ? (int) (jIAuthTabCallbackDefault | 12) : (int) (jIAuthTabCallbackDefault / 12);
        int i5 = onNavigationEvent + 71;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    public final int asInterface() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallbackDefault = (int) (IAuthTabCallbackDefault() % 12);
        int i4 = onWarmupCompleted + 119;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iIAuthTabCallbackDefault;
    }

    public int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallbackStub = (int) (IAuthTabCallbackStub() / 3600000000000L);
        int i4 = onNavigationEvent + 93;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return iIAuthTabCallbackStub;
    }

    public int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallbackStub = (int) ((IAuthTabCallbackStub() % 3600000000000L) / 60000000000L);
        int i4 = onNavigationEvent + 59;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return iIAuthTabCallbackStub;
    }

    public int onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallbackStub = (int) ((IAuthTabCallbackStub() % 60000000000L) / 1000000000);
        int i4 = onWarmupCompleted + 31;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return iIAuthTabCallbackStub;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        onWarmupCompleted = i2 % 128;
        return (int) (i2 % 2 != 0 ? IAuthTabCallbackStub() | 1000000000 : IAuthTabCallbackStub() % 1000000000);
    }

    private final boolean IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        if (IAuthTabCallbackDefault() > 0 || onNavigationEvent() > 0 || IAuthTabCallbackStub() > 0) {
            return false;
        }
        int i2 = onWarmupCompleted + 85;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0 ? (IAuthTabCallbackDefault() | IAuthTabCallbackStub()) == 0 : (IAuthTabCallbackDefault() | IAuthTabCallbackStub()) == 1) {
            if (onNavigationEvent() == 0) {
                return false;
            }
        }
        int i3 = onNavigationEvent + 61;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }

    public String toString() throws Throwable {
        int i;
        Object objIntern;
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        if (IAuthTabCallback_Parcel()) {
            sb.append('-');
            i = -1;
        } else {
            i = 1;
        }
        sb.append('P');
        if (onTransact() != 0) {
            sb.append(onTransact() * i);
            sb.append('Y');
        }
        if (asInterface() != 0) {
            sb.append(asInterface() * i);
            sb.append('M');
        }
        if (onNavigationEvent() != 0) {
            sb.append(onNavigationEvent() * i);
            sb.append('D');
        }
        int iOnWarmupCompleted = onWarmupCompleted();
        String str = "T";
        String str2 = BuildConfig.FLAVOR;
        if (iOnWarmupCompleted != 0) {
            int i3 = onWarmupCompleted + 85;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            sb.append("T");
            sb.append(onWarmupCompleted() * i);
            sb.append('H');
            str = BuildConfig.FLAVOR;
        }
        if (IAuthTabCallback() != 0) {
            sb.append(str);
            sb.append(IAuthTabCallback() * i);
            sb.append('M');
        } else {
            str2 = str;
        }
        if ((onExtraCallback() | onExtraCallbackWithResult()) != 0) {
            sb.append(str2);
            if (onExtraCallback() != 0) {
                int i5 = onWarmupCompleted + 89;
                onNavigationEvent = i5 % 128;
                objIntern = i5 % 2 == 0 ? Integer.valueOf(onExtraCallback() / i) : Integer.valueOf(onExtraCallback() * i);
            } else if (onExtraCallbackWithResult() * i < 0) {
                int i6 = onWarmupCompleted + 125;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                objIntern = "-0";
            } else {
                Object[] objArr = new Object[1];
                a(new char[]{13118}, 49297 - (KeyEvent.getMaxKeyCode() >> 16), objArr);
                objIntern = ((String) objArr[0]).intern();
            }
            sb.append(objIntern);
            if (onExtraCallbackWithResult() != 0) {
                int i8 = onWarmupCompleted + 11;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                sb.append('.');
                sb.append(StringsKt.padStart(String.valueOf(Math.abs(onExtraCallbackWithResult())), 9, '0'));
            }
            sb.append('S');
        }
        if (sb.length() == 1) {
            int i10 = onWarmupCompleted + 115;
            onNavigationEvent = i10 % 128;
            if (i10 % 2 == 0) {
                sb.append("0D");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            sb.append("0D");
        }
        return sb.toString();
    }

    public static final class onExtraCallback {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int asInterface = 1;
        private static int onExtraCallback;
        private static char[] onExtraCallbackWithResult = {32677};
        private static int onWarmupCompleted = -1184333931;
        private static boolean IAuthTabCallback = true;
        private static boolean onNavigationEvent = true;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr2 = onExtraCallbackWithResult;
            char c = '0';
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i4 = 0;
                while (i4 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 76 - TextUtils.indexOf(BuildConfig.FLAVOR, c, 0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i4++;
                        c = '0';
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
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getEdgeSlop() >> 16), Color.red(0) + 75, 16037 - TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0), -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            int i5 = 1052772399;
            if (onNavigationEvent) {
                int i6 = $10 + 11;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), 62 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    i5 = 1052772399;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!IAuthTabCallback) {
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
            int i8 = $10 + 115;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                i2 = defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback;
            } else {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                i2 = defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback;
            }
            char[] cArr6 = new char[i2];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i9 = $11 + 47;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback % 1) / defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] >>> i] % iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0), (ViewConfiguration.getTapTimeout() >> 16) + 63, (ViewConfiguration.getWindowTouchSlop() >> 8) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                } else {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 63 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0), View.MeasureSpec.getSize(0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                }
            }
            objArr[0] = new String(cArr6);
        }

        private onExtraCallback() {
        }

        public final KSerializer<jni_YGNodeStyleGetPaddingJNI> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 97;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                setBrickNativeValue setbricknativevalue = setBrickNativeValue.onWarmupCompleted;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            setBrickNativeValue setbricknativevalue2 = setBrickNativeValue.onWarmupCompleted;
            int i3 = onExtraCallback + 105;
            asInterface = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 / 0;
            }
            return setbricknativevalue2;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: o.jni_YGNodeStyleGetMaxHeightJNI */
        private static final Void onNavigationEvent(String str, int i) throws jni_YGNodeStyleGetMaxHeightJNI {
            int i2 = 2 % 2;
            throw new jni_YGNodeStyleGetMaxHeightJNI("Parse error at char " + i + ": " + str);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: o.setWrite */
        /* JADX WARN: Removed duplicated region for block: B:218:0x03e8 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:97:0x01e3  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final jni_YGNodeStyleGetPaddingJNI onWarmupCompleted(@NotNull String str) throws Throwable {
            int i;
            int i2;
            char cCharAt;
            char c;
            long jOnWarmupCompleted;
            int i3;
            String str2;
            boolean z;
            int i4;
            int i5;
            char c2;
            int iOnWarmupCompleted;
            char cCharAt2;
            char c3;
            char cCharAt3;
            int i6 = 2;
            int i7 = 2 % 2;
            String str3 = BuildConfig.FLAVOR;
            Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
            int i8 = 0;
            char c4 = 0;
            int i9 = 1;
            int iOnWarmupCompleted2 = 0;
            int iOnWarmupCompleted3 = 0;
            boolean z2 = false;
            int i10 = 0;
            int iOnWarmupCompleted4 = 0;
            int iOnWarmupCompleted5 = 0;
            int iOnWarmupCompleted6 = 0;
            int iOnWarmupCompleted7 = 0;
            int i11 = 0;
            while (i8 < str.length()) {
                if (c4 != 0) {
                    char cCharAt4 = str.charAt(i8);
                    if (cCharAt4 != '+') {
                        int i12 = onExtraCallback;
                        int i13 = i12 + 59;
                        asInterface = i13 % 128;
                        int i14 = i13 % 2;
                        if (cCharAt4 != '-') {
                            if (('0' > cCharAt4 || cCharAt4 >= ':') && cCharAt4 == 'T') {
                                int i15 = i12 + 101;
                                asInterface = i15 % 128;
                                if (i15 % 2 == 0) {
                                    if (c4 >= '}') {
                                        onNavigationEvent("Only one 'T' designator is allowed", i8);
                                        throw new setWrite();
                                    }
                                    i8++;
                                    i6 = 2;
                                    c4 = 6;
                                } else {
                                    if (c4 >= 6) {
                                        onNavigationEvent("Only one 'T' designator is allowed", i8);
                                        throw new setWrite();
                                    }
                                    i8++;
                                    i6 = 2;
                                    c4 = 6;
                                }
                            } else {
                                i2 = i8;
                                i = i9;
                                c = ':';
                                jOnWarmupCompleted = 0;
                                while (i2 < str.length() && '0' <= (cCharAt3 = str.charAt(i2)) && cCharAt3 < c) {
                                    int i16 = asInterface + 7;
                                    onExtraCallback = i16 % 128;
                                    int i17 = i16 % 2;
                                    int i18 = i9;
                                    int i19 = iOnWarmupCompleted2;
                                    int i20 = iOnWarmupCompleted3;
                                    try {
                                        jOnWarmupCompleted = jw12.onWarmupCompleted(jw12.onNavigationEvent(jOnWarmupCompleted, 10L), str.charAt(i2) - '0');
                                        i2++;
                                        i9 = i18;
                                        iOnWarmupCompleted3 = i20;
                                        iOnWarmupCompleted2 = i19;
                                        c = ':';
                                    } catch (ArithmeticException unused) {
                                        onNavigationEvent("The number is too large", i8);
                                        throw new setWrite();
                                    }
                                }
                                int i21 = i9;
                                int i22 = iOnWarmupCompleted2;
                                int i23 = iOnWarmupCompleted3;
                                long j = i * jOnWarmupCompleted;
                                if (i2 != str.length()) {
                                    onNavigationEvent("Expected a designator after the numerical value", i2);
                                    throw new setWrite();
                                }
                                char upperCase = Character.toUpperCase(str.charAt(i2));
                                int i24 = i10;
                                if (upperCase != ',') {
                                    int i25 = onExtraCallback + 57;
                                    i3 = iOnWarmupCompleted4;
                                    int i26 = i25 % 128;
                                    asInterface = i26;
                                    if (i25 % 2 != 0 ? upperCase != '.' : upperCase != '*') {
                                        if (upperCase != 'D') {
                                            if (upperCase != 'H') {
                                                if (upperCase != 'M') {
                                                    if (upperCase != 'S') {
                                                        if (upperCase != 'W') {
                                                            if (upperCase != 'Y') {
                                                                onNavigationEvent("Expected a designator after the numerical value", i2);
                                                                throw new setWrite();
                                                            }
                                                            if (c4 >= 2) {
                                                                onNavigationEvent("Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'", i2);
                                                                throw new setWrite();
                                                            }
                                                            iOnWarmupCompleted4 = onWarmupCompleted(j, i8, 'Y');
                                                            iOnWarmupCompleted2 = i22;
                                                            c3 = 2;
                                                            str2 = str3;
                                                            c4 = c3;
                                                            iOnWarmupCompleted3 = i23;
                                                            i10 = i24;
                                                            z = true;
                                                            i8 = i2 + 1;
                                                            z2 = z;
                                                            str3 = str2;
                                                            i9 = i21;
                                                            i6 = 2;
                                                        } else {
                                                            if (c4 >= 4) {
                                                                onNavigationEvent("Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'", i2);
                                                                throw new setWrite();
                                                            }
                                                            int i27 = i26 + 91;
                                                            onExtraCallback = i27 % 128;
                                                            int i28 = i27 % 2;
                                                            iOnWarmupCompleted3 = onWarmupCompleted(j, i8, 'W');
                                                            str2 = str3;
                                                            c4 = 4;
                                                            iOnWarmupCompleted2 = i22;
                                                            iOnWarmupCompleted4 = i3;
                                                            i10 = i24;
                                                            z = true;
                                                            i8 = i2 + 1;
                                                            z2 = z;
                                                            str3 = str2;
                                                            i9 = i21;
                                                            i6 = 2;
                                                        }
                                                    } else {
                                                        if (c4 >= '\t' || c4 < 6) {
                                                            onNavigationEvent("Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'", i2);
                                                            throw new setWrite();
                                                        }
                                                        iOnWarmupCompleted = onWarmupCompleted(j, i8, 'S');
                                                        str2 = str3;
                                                        i5 = iOnWarmupCompleted5;
                                                        i4 = i23;
                                                        i10 = i24;
                                                        c2 = '\t';
                                                    }
                                                } else if (c4 >= 6) {
                                                    int i29 = i26 + 85;
                                                    onExtraCallback = i29 % 128;
                                                    if (i29 % 2 != 0) {
                                                        if (c4 >= 'T') {
                                                            onNavigationEvent("Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'", i2);
                                                            throw new setWrite();
                                                        }
                                                        iOnWarmupCompleted7 = onWarmupCompleted(j, i8, 'M');
                                                        c4 = '\b';
                                                        str2 = str3;
                                                    } else {
                                                        if (c4 >= '\b') {
                                                            onNavigationEvent("Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'", i2);
                                                            throw new setWrite();
                                                        }
                                                        iOnWarmupCompleted7 = onWarmupCompleted(j, i8, 'M');
                                                        c4 = '\b';
                                                        str2 = str3;
                                                    }
                                                } else {
                                                    if (c4 >= 3) {
                                                        onNavigationEvent("Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'", i2);
                                                        throw new setWrite();
                                                    }
                                                    iOnWarmupCompleted5 = onWarmupCompleted(j, i8, 'M');
                                                    c3 = 3;
                                                    iOnWarmupCompleted2 = i22;
                                                }
                                            } else {
                                                if (c4 >= 7 || c4 < 6) {
                                                    onNavigationEvent("Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'", i2);
                                                    throw new setWrite();
                                                }
                                                iOnWarmupCompleted6 = onWarmupCompleted(j, i8, 'H');
                                                str2 = str3;
                                                c4 = 7;
                                            }
                                            iOnWarmupCompleted3 = i23;
                                            iOnWarmupCompleted2 = i22;
                                            iOnWarmupCompleted4 = i3;
                                            i10 = i24;
                                            z = true;
                                            i8 = i2 + 1;
                                            z2 = z;
                                            str3 = str2;
                                            i9 = i21;
                                            i6 = 2;
                                        } else {
                                            if (c4 >= 5) {
                                                onNavigationEvent("Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'", i2);
                                                throw new setWrite();
                                            }
                                            iOnWarmupCompleted2 = onWarmupCompleted(j, i8, 'D');
                                            c3 = 5;
                                        }
                                        iOnWarmupCompleted4 = i3;
                                        str2 = str3;
                                        c4 = c3;
                                        iOnWarmupCompleted3 = i23;
                                        i10 = i24;
                                        z = true;
                                        i8 = i2 + 1;
                                        z2 = z;
                                        str3 = str2;
                                        i9 = i21;
                                        i6 = 2;
                                    }
                                    c4 = c2;
                                    iOnWarmupCompleted5 = i5;
                                    iOnWarmupCompleted2 = i22;
                                    iOnWarmupCompleted3 = i4;
                                    iOnWarmupCompleted4 = i3;
                                    i11 = iOnWarmupCompleted;
                                    z = true;
                                    i8 = i2 + 1;
                                    z2 = z;
                                    str3 = str2;
                                    i9 = i21;
                                    i6 = 2;
                                } else {
                                    i3 = iOnWarmupCompleted4;
                                }
                                int i30 = i2 + 1;
                                if (i30 >= str.length()) {
                                    onNavigationEvent("Expected designator 'S' after " + str.charAt(i2), i30);
                                    throw new setWrite();
                                }
                                int i31 = asInterface + 29;
                                onExtraCallback = i31 % 128;
                                int i32 = i31 % 2;
                                i2 = i30;
                                while (i2 < str.length() && '0' <= (cCharAt2 = str.charAt(i2)) && cCharAt2 < ':') {
                                    i2++;
                                }
                                int i33 = i2 - i30;
                                if (i33 > 9) {
                                    onNavigationEvent("Only the nanosecond fractions of a second are supported", i30);
                                    throw new setWrite();
                                }
                                StringBuilder sb = new StringBuilder();
                                String strSubstring = str.substring(i30, i2);
                                Intrinsics.checkNotNullExpressionValue(strSubstring, str3);
                                sb.append(strSubstring);
                                str2 = str3;
                                i5 = iOnWarmupCompleted5;
                                Object[] objArr = new Object[1];
                                i4 = i23;
                                a(null, null, new byte[]{ISOFileInfo.DATA_BYTES2}, 127 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr);
                                sb.append(StringsKt.repeat(((String) objArr[0]).intern(), 9 - i33));
                                int i34 = Integer.parseInt(sb.toString(), CharsKt.IAuthTabCallback(10));
                                if (str.charAt(i2) != 'S') {
                                    onNavigationEvent("Expected the 'S' designator after a fraction", i2);
                                    throw new setWrite();
                                }
                                c2 = '\t';
                                if (c4 >= '\t' || c4 < 6) {
                                    onNavigationEvent("Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'", i2);
                                    throw new setWrite();
                                }
                                i10 = i34 * i;
                                iOnWarmupCompleted = onWarmupCompleted(j, i8, 'S');
                                c4 = c2;
                                iOnWarmupCompleted5 = i5;
                                iOnWarmupCompleted2 = i22;
                                iOnWarmupCompleted3 = i4;
                                iOnWarmupCompleted4 = i3;
                                i11 = iOnWarmupCompleted;
                                z = true;
                                i8 = i2 + 1;
                                z2 = z;
                                str3 = str2;
                                i9 = i21;
                                i6 = 2;
                            }
                        }
                    }
                    if (str.charAt(i8) == '-') {
                        int i35 = asInterface + 17;
                        onExtraCallback = i35 % 128;
                        if (i35 % 2 != 0) {
                            i = -i9;
                            int i36 = 53 / 0;
                        } else {
                            i = -i9;
                        }
                    } else {
                        i = i9;
                    }
                    i2 = i8 + 1;
                    if (i2 < str.length() && '0' <= (cCharAt = str.charAt(i2))) {
                        int i37 = onExtraCallback + 93;
                        asInterface = i37 % 128;
                        int i38 = i37 % 2;
                        c = ':';
                        if (cCharAt >= ':') {
                        }
                        jOnWarmupCompleted = 0;
                        while (i2 < str.length()) {
                            int i162 = asInterface + 7;
                            onExtraCallback = i162 % 128;
                            int i172 = i162 % 2;
                            int i182 = i9;
                            int i192 = iOnWarmupCompleted2;
                            int i202 = iOnWarmupCompleted3;
                            jOnWarmupCompleted = jw12.onWarmupCompleted(jw12.onNavigationEvent(jOnWarmupCompleted, 10L), str.charAt(i2) - '0');
                            i2++;
                            i9 = i182;
                            iOnWarmupCompleted3 = i202;
                            iOnWarmupCompleted2 = i192;
                            c = ':';
                        }
                        int i212 = i9;
                        int i222 = iOnWarmupCompleted2;
                        int i232 = iOnWarmupCompleted3;
                        long j2 = i * jOnWarmupCompleted;
                        if (i2 != str.length()) {
                        }
                    }
                    onNavigationEvent("A number expected after '" + str.charAt(i2) + '\'', i2);
                    throw new setWrite();
                }
                int i39 = i8 + 1;
                if (i39 >= str.length() && (str.charAt(i8) == '+' || str.charAt(i8) == '-')) {
                    onNavigationEvent("Unexpected end of string; 'P' designator is required", i8);
                    throw new setWrite();
                }
                char cCharAt5 = str.charAt(i8);
                if (cCharAt5 == '+' || cCharAt5 == '-') {
                    if (str.charAt(i8) == '-') {
                        i9 = -1;
                    }
                    if (str.charAt(i39) != 'P') {
                        onNavigationEvent("Expected 'P', got '" + str.charAt(i39) + '\'', i39);
                        throw new setWrite();
                    }
                    i8 += 2;
                } else {
                    if (cCharAt5 != 'P') {
                        onNavigationEvent("Expected '+', '-', 'P', got '" + str.charAt(i8) + '\'', i8);
                        throw new setWrite();
                    }
                    i8 = i39;
                }
                i6 = 2;
                c4 = 1;
            }
            if (c4 == 0) {
                onNavigationEvent("Unexpected end of input; 'P' designator is required", i8);
                throw new setWrite();
            }
            if (c4 == 6) {
                onNavigationEvent("Unexpected end of input; at least one time component is required after 'T'", i8);
                throw new setWrite();
            }
            int i40 = onExtraCallback + 71;
            asInterface = i40 % 128;
            int i41 = i40 % i6;
            long j3 = iOnWarmupCompleted2 + (iOnWarmupCompleted3 * 7);
            if (-2147483648L > j3 || j3 > 2147483647L) {
                onNavigationEvent("The total number of days under 'D' and 'W' designators should fit into an Int", 0);
                throw new setWrite();
            }
            int i42 = (int) j3;
            if (z2) {
                return jni_YGNodeStyleGetWidthJNI.onExtraCallbackWithResult(iOnWarmupCompleted4, iOnWarmupCompleted5, i42, iOnWarmupCompleted6, iOnWarmupCompleted7, i11, i10);
            }
            onNavigationEvent("At least one component is required, but none were found", 0);
            throw new setWrite();
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: o.setWrite */
        private static final int onWarmupCompleted(long j, int i, char c) throws jni_YGNodeStyleGetMaxHeightJNI, setWrite {
            int i2 = 2 % 2;
            if (j >= -2147483648L) {
                int i3 = onExtraCallback;
                int i4 = i3 + 7;
                asInterface = i4 % 128;
                if (i4 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (j <= 2147483647L) {
                    int i5 = i3 + 101;
                    asInterface = i5 % 128;
                    int i6 = i5 % 2;
                    return (int) j;
                }
            }
            onNavigationEvent("Value " + j + " does not fit into an Int, which is required for component '" + c + '\'', i);
            throw new setWrite();
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jni_YGNodeStyleGetPaddingJNI)) {
            return false;
        }
        jni_YGNodeStyleGetPaddingJNI jni_ygnodestylegetpaddingjni = (jni_YGNodeStyleGetPaddingJNI) obj;
        if (IAuthTabCallbackDefault() == jni_ygnodestylegetpaddingjni.IAuthTabCallbackDefault()) {
            return onNavigationEvent() == jni_ygnodestylegetpaddingjni.onNavigationEvent() && IAuthTabCallbackStub() == jni_ygnodestylegetpaddingjni.IAuthTabCallbackStub();
        }
        int i4 = onWarmupCompleted;
        int i5 = i4 + 83;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 79;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 15 / 0;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            iHashCode = (((Long.hashCode(IAuthTabCallbackDefault()) >> 17) - onNavigationEvent()) / 22) % Long.hashCode(IAuthTabCallbackStub());
        } else {
            iHashCode = (((Long.hashCode(IAuthTabCallbackDefault()) * 31) + onNavigationEvent()) * 31) + Long.hashCode(IAuthTabCallbackStub());
        }
        int i3 = onNavigationEvent + 101;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 8 / 0;
        }
        return iHashCode;
    }

    static void asBinder() {
        onExtraCallback = -8315995329015466439L;
    }
}
