package okhttp3;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.teens.cvscash.CvsCashTransactionActivity$;
import java.lang.reflect.Method;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Deprecated;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.TTBaseLandingPageActivity;
import okhttp3.internal._HostnamesCommonKt;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class CertificatePinner {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Companion Companion;
    public static final CertificatePinner DEFAULT;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 0;
    private static int asInterface = 1;
    private static long onExtraCallback = 0;
    private static char[] onExtraCallbackWithResult = null;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final CertificateChainCleaner certificateChainCleaner;
    private final Set<Pin> pins;

    public static /* synthetic */ List $r8$lambda$RSwGGZvOCYXTltt0QzhfCcMJ_AM(CertificatePinner certificatePinner, List list, String str) throws SSLPeerUnverifiedException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        List listCheck$lambda$0 = check$lambda$0(certificatePinner, list, str);
        if (i3 == 0) {
            int i4 = 19 / 0;
        }
        return listCheck$lambda$0;
    }

    @JvmStatic
    public static final String pin(@NotNull Certificate certificate) {
        String strPin;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            strPin = Companion.pin(certificate);
            int i3 = 79 / 0;
        } else {
            strPin = Companion.pin(certificate);
        }
        int i4 = onNavigationEvent + 67;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 46 / 0;
        }
        return strPin;
    }

    @JvmStatic
    public static final TTBaseLandingPageActivity sha1Hash(@NotNull X509Certificate x509Certificate) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        TTBaseLandingPageActivity tTBaseLandingPageActivitySha1Hash = Companion.sha1Hash(x509Certificate);
        int i4 = onNavigationEvent + 11;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return tTBaseLandingPageActivitySha1Hash;
    }

    @JvmStatic
    public static final TTBaseLandingPageActivity sha256Hash(@NotNull X509Certificate x509Certificate) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Companion.sha256Hash(x509Certificate);
            throw null;
        }
        TTBaseLandingPageActivity tTBaseLandingPageActivitySha256Hash = Companion.sha256Hash(x509Certificate);
        int i3 = onNavigationEvent + 21;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return tTBaseLandingPageActivitySha256Hash;
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $11 + 73;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Gravity.getAbsoluteGravity(0, 0), 24 - Color.alpha(0), TextUtils.getOffsetAfter(_UrlKt.FRAGMENT_ENCODE_SET, 0) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onExtraCallback ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 59 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $11 + 3;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 59 - Color.red(0), 6383 - Color.red(0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                throw null;
            }
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), 58 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0'), (ViewConfiguration.getLongPressTimeout() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2);
    }

    public CertificatePinner(@NotNull Set<Pin> set, @Nullable CertificateChainCleaner certificateChainCleaner) {
        Intrinsics.checkNotNullParameter(set, "");
        this.pins = set;
        this.certificateChainCleaner = certificateChainCleaner;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = onWarmupCompleted;
            int i3 = i2 + 29;
            onNavigationEvent = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = i2 + 35;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
            certificateChainCleaner = null;
        }
        this(set, certificateChainCleaner);
    }

    public final Set<Pin> getPins() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 107;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Set<Pin> set = this.pins;
        int i5 = i2 + 85;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return set;
    }

    public final CertificateChainCleaner getCertificateChainCleaner$okhttp() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        CertificateChainCleaner certificateChainCleaner = this.certificateChainCleaner;
        if (i3 == 0) {
            int i4 = 99 / 0;
        }
        return certificateChainCleaner;
    }

    public final void check(@NotNull final String str, @NotNull final List<? extends Certificate> list) throws SSLPeerUnverifiedException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        check$okhttp(str, new Function0() { // from class: okhttp3.CertificatePinner$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CertificatePinner.$r8$lambda$RSwGGZvOCYXTltt0QzhfCcMJ_AM(this.f$0, list, str);
            }
        });
        int i2 = onWarmupCompleted + 57;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 91 / 0;
        }
    }

    public final void check$okhttp(@NotNull String str, @NotNull Function0<? extends List<? extends X509Certificate>> function0) throws Throwable {
        int i = 2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        List<Pin> listFindMatchingPins = findMatchingPins(str);
        if (listFindMatchingPins.isEmpty()) {
            return;
        }
        int i3 = onNavigationEvent + 115;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            function0.invoke().iterator();
            throw null;
        }
        List<? extends X509Certificate> listInvoke = function0.invoke();
        Iterator<? extends X509Certificate> it = listInvoke.iterator();
        while (true) {
            int i4 = 6;
            int i5 = 0;
            if (!it.hasNext()) {
                StringBuilder sb = new StringBuilder();
                Object[] objArr = new Object[1];
                b(new char[]{35307, 6164, 43624, 15447, 52901, 20723, 58071, 29988, 1793, 43389, 15287, 52699, 24564, 57796, 28696, 625, 37969, 9903, 51341, 23187, 60730, 32516, 359, 37819, 9605, 47083, 22983, 59498}, 37336 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0), objArr);
                sb.append(((String) objArr[0]).intern());
                Object[] objArr2 = new Object[1];
                a(new char[]{7, 15, 15, 22, 13897, 13897, 2, 19, '\r', 14, '\t', 4, 1, '\r', 2, '\r', 19, 21, '\f', 18, '\r', 17, 18, 1, '\t', 11}, (byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 73), (ViewConfiguration.getLongPressTimeout() >> 16) + 26, objArr2);
                sb.append(((String) objArr2[0]).intern());
                for (X509Certificate x509Certificate : listInvoke) {
                    Object[] objArr3 = new Object[1];
                    a(new char[]{7, 15, 13828, 13828, 13828}, (byte) (74 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET)), TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0) + 6, objArr3);
                    sb.append(((String) objArr3[0]).intern());
                    sb.append(Companion.pin(x509Certificate));
                    Object[] objArr4 = new Object[1];
                    a(new char[]{'\f', 19}, (byte) (8 - ExpandableListView.getPackedPositionGroup(0L)), Drawable.resolveOpacity(0, 0) + 2, objArr4);
                    sb.append(((String) objArr4[0]).intern());
                    sb.append(x509Certificate.getSubjectDN().getName());
                }
                Object[] objArr5 = new Object[1];
                a(new char[]{7, 15, 15, 22, 1, '\b', '\b', 11, 22, 16, '\r', 14, '\t', 4, 1, '\r', 2, '\r', 19, 21, 18, 3, 16, '\f', 2, 0, 13878}, (byte) (123 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0')), 'K' - AndroidCharacter.getMirror('0'), objArr5);
                sb.append(((String) objArr5[0]).intern());
                sb.append(str);
                Object[] objArr6 = new Object[1];
                b(new char[]{35218}, 31091 - ExpandableListView.getPackedPositionGroup(0L), objArr6);
                sb.append(((String) objArr6[0]).intern());
                for (Pin pin : listFindMatchingPins) {
                    Object[] objArr7 = new Object[1];
                    a(new char[]{7, 15, 13828, 13828, 13828}, (byte) (View.resolveSizeAndState(0, 0, 0) + 74), 5 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr7);
                    sb.append(((String) objArr7[0]).intern());
                    sb.append(pin);
                    int i6 = onWarmupCompleted + 23;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                }
                throw new SSLPeerUnverifiedException(sb.toString());
            }
            X509Certificate next = it.next();
            TTBaseLandingPageActivity tTBaseLandingPageActivitySha1Hash = null;
            TTBaseLandingPageActivity tTBaseLandingPageActivitySha256Hash = null;
            for (Pin pin2 : listFindMatchingPins) {
                int i8 = onWarmupCompleted + Imgproc.COLOR_YUV2RGB_YVYU;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % i;
                String hashAlgorithm = pin2.getHashAlgorithm();
                char[] cArr = new char[i4];
                // fill-array-data instruction
                cArr[0] = 3;
                cArr[1] = 23;
                cArr[2] = 17;
                cArr[3] = 15;
                cArr[4] = 5;
                cArr[5] = 2;
                Object[] objArr8 = new Object[1];
                a(cArr, (byte) ((ViewConfiguration.getEdgeSlop() >> 16) + 81), Color.red(i5) + 6, objArr8);
                if (Intrinsics.areEqual(hashAlgorithm, ((String) objArr8[0]).intern())) {
                    int i10 = onNavigationEvent;
                    int i11 = i10 + 109;
                    onWarmupCompleted = i11 % 128;
                    if (i11 % 2 == 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (tTBaseLandingPageActivitySha256Hash == null) {
                        int i12 = i10 + 69;
                        onWarmupCompleted = i12 % 128;
                        int i13 = i12 % 2;
                        tTBaseLandingPageActivitySha256Hash = Companion.sha256Hash(next);
                    }
                    if (Intrinsics.areEqual(pin2.getHash(), tTBaseLandingPageActivitySha256Hash)) {
                        return;
                    }
                } else {
                    Object[] objArr9 = new Object[1];
                    b(new char[]{35291, 971, 40415, 6072}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 35339, objArr9);
                    if (!Intrinsics.areEqual(hashAlgorithm, ((String) objArr9[0]).intern())) {
                        StringBuilder sb2 = new StringBuilder();
                        Object[] objArr10 = new Object[1];
                        b(new char[]{35293, 8251, 55841, 29738, 11820, 55337, 29225, 11313, 50740, 28712, 10798, 50263, 32284, 10256, 49677, 31763, 5689, 49161, 31237, 5120, 52766, 30720, 4706, 52347, 26237, 4135, 51770}, 43516 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0'), objArr10);
                        sb2.append(((String) objArr10[0]).intern());
                        sb2.append(pin2.getHashAlgorithm());
                        throw new AssertionError(sb2.toString());
                    }
                    if (tTBaseLandingPageActivitySha1Hash == null) {
                        tTBaseLandingPageActivitySha1Hash = Companion.sha1Hash(next);
                    }
                    if (Intrinsics.areEqual(pin2.getHash(), tTBaseLandingPageActivitySha1Hash)) {
                        return;
                    }
                }
                i = 2;
                i4 = 6;
                i5 = 0;
            }
        }
    }

    @Deprecated
    public final void check(@NotNull String str, @NotNull Certificate... certificateArr) throws SSLPeerUnverifiedException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(certificateArr, "");
        check(str, ArraysKt___ArraysKt.toList(certificateArr));
        int i4 = onNavigationEvent + 61;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public final CertificatePinner withCertificateChainCleaner$okhttp(@NotNull CertificateChainCleaner certificateChainCleaner) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(certificateChainCleaner, "");
        if (!Intrinsics.areEqual(this.certificateChainCleaner, certificateChainCleaner)) {
            return new CertificatePinner(this.pins, certificateChainCleaner);
        }
        int i4 = onWarmupCompleted + 123;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return this;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (!(!(obj instanceof CertificatePinner))) {
            CertificatePinner certificatePinner = (CertificatePinner) obj;
            if (Intrinsics.areEqual(certificatePinner.pins, this.pins)) {
                int i2 = onWarmupCompleted + 15;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                if (Intrinsics.areEqual(certificatePinner.certificateChainCleaner, this.certificateChainCleaner)) {
                    return true;
                }
            }
        }
        int i4 = onNavigationEvent + 37;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int iHashCode2 = this.pins.hashCode();
            CertificateChainCleaner certificateChainCleaner = this.certificateChainCleaner;
            if (certificateChainCleaner != null) {
                iHashCode = certificateChainCleaner.hashCode();
            } else {
                int i3 = onWarmupCompleted + 59;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                iHashCode = 0;
            }
            int i5 = ((iHashCode2 + 1517) * 41) + iHashCode;
            int i6 = onNavigationEvent + 47;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }
        this.pins.hashCode();
        throw null;
    }

    public static final class Pin {
        private final TTBaseLandingPageActivity hash;
        private final String hashAlgorithm;
        private final String pattern;

        public Pin(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            if ((!StringsKt__StringsJVMKt.startsWith$default(str, "*.", false, 2, null) || StringsKt__StringsKt.indexOf$default((CharSequence) str, "*", 1, false, 4, (Object) null) != -1) && ((!StringsKt__StringsJVMKt.startsWith$default(str, "**.", false, 2, null) || StringsKt__StringsKt.indexOf$default((CharSequence) str, "*", 2, false, 4, (Object) null) != -1) && StringsKt__StringsKt.indexOf$default((CharSequence) str, "*", 0, false, 6, (Object) null) != -1)) {
                throw new IllegalArgumentException(("Unexpected pattern: " + str).toString());
            }
            String canonicalHost = _HostnamesCommonKt.toCanonicalHost(str);
            if (canonicalHost != null) {
                this.pattern = canonicalHost;
                if (StringsKt__StringsJVMKt.startsWith$default(str2, "sha1/", false, 2, null)) {
                    this.hashAlgorithm = "sha1";
                    TTBaseLandingPageActivity.IAuthTabCallback iAuthTabCallback = TTBaseLandingPageActivity.Companion;
                    String strSubstring = str2.substring(5);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    TTBaseLandingPageActivity tTBaseLandingPageActivityOnExtraCallback = iAuthTabCallback.onExtraCallback(strSubstring);
                    if (tTBaseLandingPageActivityOnExtraCallback != null) {
                        this.hash = tTBaseLandingPageActivityOnExtraCallback;
                        return;
                    }
                    throw new IllegalArgumentException("Invalid pin hash: " + str2);
                }
                if (StringsKt__StringsJVMKt.startsWith$default(str2, "sha256/", false, 2, null)) {
                    this.hashAlgorithm = "sha256";
                    TTBaseLandingPageActivity.IAuthTabCallback iAuthTabCallback2 = TTBaseLandingPageActivity.Companion;
                    String strSubstring2 = str2.substring(7);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                    TTBaseLandingPageActivity tTBaseLandingPageActivityOnExtraCallback2 = iAuthTabCallback2.onExtraCallback(strSubstring2);
                    if (tTBaseLandingPageActivityOnExtraCallback2 != null) {
                        this.hash = tTBaseLandingPageActivityOnExtraCallback2;
                        return;
                    }
                    throw new IllegalArgumentException("Invalid pin hash: " + str2);
                }
                throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': " + str2);
            }
            throw new IllegalArgumentException("Invalid pattern: " + str);
        }

        public final String getPattern() {
            return this.pattern;
        }

        public final String getHashAlgorithm() {
            return this.hashAlgorithm;
        }

        public final TTBaseLandingPageActivity getHash() {
            return this.hash;
        }

        public final boolean matchesHostname(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (StringsKt__StringsJVMKt.startsWith$default(this.pattern, "**.", false, 2, null)) {
                int length = this.pattern.length() - 3;
                int length2 = str.length() - length;
                return StringsKt__StringsJVMKt.regionMatches$default(str, str.length() - length, this.pattern, 3, length, false, 16, (Object) null) && (length2 == 0 || str.charAt(length2 - 1) == '.');
            }
            if (StringsKt__StringsJVMKt.startsWith$default(this.pattern, "*.", false, 2, null)) {
                int length3 = this.pattern.length() - 1;
                return StringsKt__StringsJVMKt.regionMatches$default(str, str.length() - length3, this.pattern, 1, length3, false, 16, (Object) null) && StringsKt__StringsKt.lastIndexOf$default((CharSequence) str, '.', (str.length() - length3) + (-1), false, 4, (Object) null) == -1;
            }
            return Intrinsics.areEqual(str, this.pattern);
        }

        public final boolean matchesCertificate(@NotNull X509Certificate x509Certificate) {
            Intrinsics.checkNotNullParameter(x509Certificate, "");
            String str = this.hashAlgorithm;
            if (Intrinsics.areEqual(str, "sha256")) {
                return Intrinsics.areEqual(this.hash, CertificatePinner.Companion.sha256Hash(x509Certificate));
            }
            if (Intrinsics.areEqual(str, "sha1")) {
                return Intrinsics.areEqual(this.hash, CertificatePinner.Companion.sha1Hash(x509Certificate));
            }
            return false;
        }

        public String toString() {
            return this.hashAlgorithm + '/' + this.hash.IAuthTabCallback();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) obj;
            return Intrinsics.areEqual(this.pattern, pin.pattern) && Intrinsics.areEqual(this.hashAlgorithm, pin.hashAlgorithm) && Intrinsics.areEqual(this.hash, pin.hash);
        }

        public int hashCode() {
            return (((this.pattern.hashCode() * 31) + this.hashAlgorithm.hashCode()) * 31) + this.hash.hashCode();
        }
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        long j;
        int length;
        char[] cArr2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr3 = onExtraCallbackWithResult;
        Object obj2 = null;
        long j2 = 0;
        if (cArr3 != null) {
            int i4 = $11 + 89;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            for (int i5 = 0; i5 < length; i5++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), 27 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), ExpandableListView.getPackedPositionChild(0L) + 23140, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr2[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(IAuthTabCallback)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(0L), ((Process.getThreadPriority(0) + 20) >> 6) + 26, TextUtils.getCapsMode(_UrlKt.FRAGMENT_ENCODE_SET, 0, 0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i6 = $10 + 47;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    i2 = i + 16;
                    cArr4[i2] = (char) (cArr[i2] % b);
                } else {
                    i2 = i - 1;
                    cArr4[i2] = (char) (cArr[i2] - b);
                }
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    int i7 = $11 + 57;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        int i9 = $10 + 51;
                        $11 = i9 % 128;
                        if (i9 % 2 == 0) {
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback >> b);
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent << 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback >> b);
                        } else {
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        }
                        j = j2;
                        obj = obj2;
                    } else {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.normalizeMetaState(0) + 24824), ExpandableListView.getPackedPositionType(j2) + 74, TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                j = 0;
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 29 - ExpandableListView.getPackedPositionChild(0L), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 19488, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            } else {
                                j = 0;
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i10 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i10];
                        } else {
                            obj = null;
                            j = 0;
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i11 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i11];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i12];
                            } else {
                                int i13 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i13];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i14];
                            }
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    obj2 = obj;
                    j2 = j;
                }
            }
            int i15 = 0;
            while (i15 < i) {
                int i16 = $11 + 9;
                $10 = i16 % 128;
                if (i16 % 2 != 0) {
                    cArr4[i15] = (char) (cArr4[i15] ^ 18909);
                    i15 += 47;
                } else {
                    cArr4[i15] = (char) (cArr4[i15] ^ 13722);
                    i15++;
                }
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    public static final class Builder {
        private final List<Pin> pins = new ArrayList();

        public final List<Pin> getPins() {
            return this.pins;
        }

        public final Builder add(@NotNull String str, @NotNull String... strArr) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(strArr, "");
            for (String str2 : strArr) {
                this.pins.add(new Pin(str, str2));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final CertificatePinner build() {
            return new CertificatePinner(CollectionsKt___CollectionsKt.toSet(this.pins), null, 2, 0 == true ? 1 : 0);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TTBaseLandingPageActivity sha1Hash(@NotNull X509Certificate x509Certificate) {
            Intrinsics.checkNotNullParameter(x509Certificate, "");
            TTBaseLandingPageActivity.IAuthTabCallback iAuthTabCallback = TTBaseLandingPageActivity.Companion;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            Intrinsics.checkNotNullExpressionValue(encoded, "");
            return TTBaseLandingPageActivity.IAuthTabCallback.onExtraCallback(iAuthTabCallback, encoded, 0, 0, 3, null).IAuthTabCallbackDefault();
        }

        @JvmStatic
        public final TTBaseLandingPageActivity sha256Hash(@NotNull X509Certificate x509Certificate) {
            Intrinsics.checkNotNullParameter(x509Certificate, "");
            TTBaseLandingPageActivity.IAuthTabCallback iAuthTabCallback = TTBaseLandingPageActivity.Companion;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            Intrinsics.checkNotNullExpressionValue(encoded, "");
            Object[] objArr = {TTBaseLandingPageActivity.IAuthTabCallback.onExtraCallback(iAuthTabCallback, encoded, 0, 0, 3, null)};
            int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
            int iOnWarmupCompleted2 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
            return (TTBaseLandingPageActivity) TTBaseLandingPageActivity.IAuthTabCallback(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), -803068074, objArr, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), iOnWarmupCompleted, iOnWarmupCompleted2, 803068074);
        }

        @JvmStatic
        public final String pin(@NotNull Certificate certificate) {
            Intrinsics.checkNotNullParameter(certificate, "");
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
            }
            return "sha256/" + sha256Hash((X509Certificate) certificate).IAuthTabCallback();
        }
    }

    static {
        onExtraCallback();
        Companion = new Companion(null);
        DEFAULT = new Builder().build();
        int i = IAuthTabCallbackDefault + 63;
        asInterface = i % 128;
        if (i % 2 == 0) {
            int i2 = 62 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<Pin> findMatchingPins(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Set<Pin> set = this.pins;
        List<Pin> listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        for (Object obj : set) {
            int i4 = onNavigationEvent + 103;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            if (((Pin) obj).matchesHostname(str)) {
                int i6 = onNavigationEvent + 37;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 68 / 0;
                    if (listEmptyList.isEmpty()) {
                        listEmptyList = new ArrayList<>();
                    }
                    Intrinsics.checkNotNull(listEmptyList, "");
                    TypeIntrinsics.asMutableList(listEmptyList).add(obj);
                    int i8 = onWarmupCompleted + 77;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                } else {
                    if (listEmptyList.isEmpty()) {
                    }
                    Intrinsics.checkNotNull(listEmptyList, "");
                    TypeIntrinsics.asMutableList(listEmptyList).add(obj);
                    int i82 = onWarmupCompleted + 77;
                    onNavigationEvent = i82 % 128;
                    int i92 = i82 % 2;
                }
            }
        }
        return listEmptyList;
    }

    private static final List check$lambda$0(CertificatePinner certificatePinner, List list, String str) throws SSLPeerUnverifiedException {
        int i = 2 % 2;
        CertificateChainCleaner certificateChainCleaner = certificatePinner.certificateChainCleaner;
        if (certificateChainCleaner != null) {
            List<Certificate> listClean = certificateChainCleaner.clean(list, str);
            if (listClean == null) {
                int i2 = onWarmupCompleted + 31;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            } else {
                list = listClean;
            }
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        int i3 = onNavigationEvent + 101;
        onWarmupCompleted = i3 % 128;
        while (true) {
            int i4 = i3 % 2;
            if (!it.hasNext()) {
                return arrayList;
            }
            int i5 = onWarmupCompleted + 111;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            Certificate certificate = (Certificate) it.next();
            Intrinsics.checkNotNull(certificate, "");
            arrayList.add((X509Certificate) certificate);
            i3 = onWarmupCompleted + 113;
            onNavigationEvent = i3 % 128;
        }
    }

    static void onExtraCallback() {
        onExtraCallbackWithResult = new char[]{64901, 64988, 64900, 64986, 64961, 64953, 64989, 64902, 64922, 64921, 64920, 64981, 64976, 64982, 64905, 64923, 64978, 64915, 64987, 64897, 64995, 64983, 64903, 64960, 64967};
        IAuthTabCallback = (char) 51244;
        onExtraCallback = 343858963704646815L;
    }
}
