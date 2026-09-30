package io.jsonwebtoken;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import io.jsonwebtoken.security.InvalidKeyException;
import io.jsonwebtoken.security.Keys;
import io.jsonwebtoken.security.SignatureException;
import io.jsonwebtoken.security.WeakKeyException;
import java.lang.reflect.Method;
import java.security.Key;
import java.security.PrivateKey;
import java.security.interfaces.ECKey;
import java.security.interfaces.RSAKey;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.crypto.SecretKey;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import okhttp3.internal.url._UrlKt;
import org.opencv.imgcodecs.Imgcodecs;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'NONE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class SignatureAlgorithm {
    private static final /* synthetic */ SignatureAlgorithm[] $VALUES;
    public static final SignatureAlgorithm ES256;
    public static final SignatureAlgorithm ES384;
    public static final SignatureAlgorithm ES512;
    public static final SignatureAlgorithm HS256;
    public static final SignatureAlgorithm HS384;
    public static final SignatureAlgorithm HS512;
    private static int IAuthTabCallbackDefault;
    public static final SignatureAlgorithm NONE;
    private static final List<SignatureAlgorithm> PREFERRED_EC_ALGS;
    private static final List<SignatureAlgorithm> PREFERRED_HMAC_ALGS;
    public static final SignatureAlgorithm PS256;
    public static final SignatureAlgorithm PS384;
    public static final SignatureAlgorithm PS512;
    public static final SignatureAlgorithm RS256;
    public static final SignatureAlgorithm RS384;
    public static final SignatureAlgorithm RS512;
    private static int onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static long onNavigationEvent;
    private static char onWarmupCompleted;
    private final String description;
    private final int digestLength;
    private final String familyName;
    private final String jcaName;
    private final boolean jdkStandard;
    private final int minKeyLength;

    @Deprecated
    private final String pkcs12Name;
    private final String value;
    private static final byte[] $$a = {34, -56, 26, -92};
    private static final int $$b = 182;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 0;
    private static int onTransact = 1;
    private static int IAuthTabCallback = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, int i2, byte b) {
        int i3;
        byte[] bArr = $$a;
        int i4 = b + 105;
        int i5 = i2 + 4;
        int i6 = i * 2;
        byte[] bArr2 = new byte[1 - i6];
        int i7 = 0 - i6;
        if (bArr == null) {
            int i8 = i4;
            i3 = 0;
            int i9 = i5;
            int i10 = i9;
            i4 = i5 + (-i8);
            i5 = i10;
            int i11 = i5 + 1;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
                return new String(bArr2, 0);
            }
            i3++;
            i8 = bArr[i11];
            int i12 = i4;
            i9 = i11;
            i5 = i12;
            int i102 = i9;
            i4 = i5 + (-i8);
            i5 = i102;
            int i112 = i5 + 1;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            int i1122 = i5 + 1;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
            }
        }
    }

    public static SignatureAlgorithm valueOf(String str) {
        int i = 2 % 2;
        int i2 = onTransact + 39;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        SignatureAlgorithm signatureAlgorithm = (SignatureAlgorithm) Enum.valueOf(SignatureAlgorithm.class, str);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onTransact + 83;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return signatureAlgorithm;
        }
        obj.hashCode();
        throw null;
    }

    public static SignatureAlgorithm[] values() {
        int i = 2 % 2;
        int i2 = onTransact + 25;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        SignatureAlgorithm[] signatureAlgorithmArr = $VALUES;
        if (i3 == 0) {
            return (SignatureAlgorithm[]) signatureAlgorithmArr.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        IAuthTabCallbackDefault = 1;
        onWarmupCompleted();
        Object[] objArr = new Object[1];
        a((char) (11684 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (-1790199678) - (KeyEvent.getMaxKeyCode() >> 16), new char[]{6368, 61964, 21995}, new char[]{0, 0, 0, 0}, new char[]{33497, 19384, 42133, 36653}, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((char) (26859 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), View.resolveSizeAndState(0, 0, 0), new char[]{56915, 20470, 62892, 10068}, new char[]{0, 0, 0, 0}, new char[]{349, 20529, 60322, 16488}, objArr2);
        SignatureAlgorithm signatureAlgorithm = new SignatureAlgorithm("NONE", 0, ((String) objArr2[0]).intern(), "No digital signature or MAC performed", "None", null, false, 0, 0);
        NONE = signatureAlgorithm;
        SignatureAlgorithm signatureAlgorithm2 = new SignatureAlgorithm("HS256", 1, "HS256", "HMAC using SHA-256", "HMAC", "HmacSHA256", true, 256, 256, "1.2.840.113549.2.9");
        HS256 = signatureAlgorithm2;
        SignatureAlgorithm signatureAlgorithm3 = new SignatureAlgorithm("HS384", 2, "HS384", "HMAC using SHA-384", "HMAC", "HmacSHA384", true, 384, 384, "1.2.840.113549.2.10");
        HS384 = signatureAlgorithm3;
        SignatureAlgorithm signatureAlgorithm4 = new SignatureAlgorithm("HS512", 3, "HS512", "HMAC using SHA-512", "HMAC", "HmacSHA512", true, Imgcodecs.IMWRITE_AVIF_QUALITY, Imgcodecs.IMWRITE_AVIF_QUALITY, "1.2.840.113549.2.11");
        HS512 = signatureAlgorithm4;
        Object[] objArr3 = new Object[1];
        a((char) (60150 - Color.alpha(0)), TextUtils.getCapsMode(_UrlKt.FRAGMENT_ENCODE_SET, 0, 0), new char[]{2238, 11354, 60135, 27094, 7623, 13400, 'j', 24166, 57241, 8462, 37674, 23407, 'A', 64253, 60141, 65395, 7193, 3478, 30053, 16196, 12734, 64607, 45068, 35087, 26208, 30490, 20886, 5628, 20481, 42499}, new char[]{0, 0, 0, 0}, new char[]{19637, 14110, 63008, 19178}, objArr3);
        SignatureAlgorithm signatureAlgorithm5 = new SignatureAlgorithm("RS256", 4, "RS256", ((String) objArr3[0]).intern(), strIntern, "SHA256withRSA", true, 256, 2048);
        RS256 = signatureAlgorithm5;
        Object[] objArr4 = new Object[1];
        a((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 13626), ViewConfiguration.getMaximumFlingVelocity() >> 16, new char[]{13917, 18755, 15698, 18292, 42072, 7227, 38392, 33444, 56860, 15057, 64093, 64773, 19741, 58395, 15141, 34633, 40120, 42909, 12533, 41901, 31431, 23876, 23362, 61396, 29045, 49667, 24832, 39110, 13336, 61149}, new char[]{0, 0, 0, 0}, new char[]{32952, 1155, 15135, 61237}, objArr4);
        SignatureAlgorithm signatureAlgorithm6 = new SignatureAlgorithm("RS384", 5, "RS384", ((String) objArr4[0]).intern(), strIntern, "SHA384withRSA", true, 384, 2048);
        RS384 = signatureAlgorithm6;
        Object[] objArr5 = new Object[1];
        a((char) (9204 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), KeyEvent.keyCodeFromString(_UrlKt.FRAGMENT_ENCODE_SET), new char[]{127, 64821, 8533, 14362, 62578, 44420, 43087, 6572, 1426, 51327, 45261, 17071, 21016, 23083, 22301, 5857, 12934, 6696, 62277, 28162, 49292, 1092, 45832, 51777, 63596, 24018, 64761, 28084, 36861, 26934}, new char[]{0, 0, 0, 0}, new char[]{19349, 13840, 62577, 16675}, objArr5);
        SignatureAlgorithm signatureAlgorithm7 = new SignatureAlgorithm("RS512", 6, "RS512", ((String) objArr5[0]).intern(), strIntern, "SHA512withRSA", true, Imgcodecs.IMWRITE_AVIF_QUALITY, 2048);
        RS512 = signatureAlgorithm7;
        Object[] objArr6 = new Object[1];
        a((char) (31848 - KeyEvent.normalizeMetaState(0)), (-1701527623) + (ViewConfiguration.getJumpTapTimeout() >> 16), new char[]{63344, 23001, 31170, 31512, 55812, 11349, 3581, 30784, 34668, 45381, 6511, 5704, 60679, 42864, 57932}, new char[]{0, 0, 0, 0}, new char[]{47458, 38079, 26778, 38780}, objArr6);
        SignatureAlgorithm signatureAlgorithm8 = new SignatureAlgorithm("ES256", 7, "ES256", "ECDSA using P-256 and SHA-256", "ECDSA", ((String) objArr6[0]).intern(), true, 256, 256);
        ES256 = signatureAlgorithm8;
        SignatureAlgorithm signatureAlgorithm9 = new SignatureAlgorithm("ES384", 8, "ES384", "ECDSA using P-384 and SHA-384", "ECDSA", "SHA384withECDSA", true, 384, 384);
        ES384 = signatureAlgorithm9;
        SignatureAlgorithm signatureAlgorithm10 = new SignatureAlgorithm("ES512", 9, "ES512", "ECDSA using P-521 and SHA-512", "ECDSA", "SHA512withECDSA", true, Imgcodecs.IMWRITE_AVIF_QUALITY, 521);
        ES512 = signatureAlgorithm10;
        Object[] objArr7 = new Object[1];
        b(10 - (ViewConfiguration.getFadingEdgeLength() >> 16), 46 - KeyEvent.getDeadChar(0, 0), new char[]{11, 11, '\b', 65509, 65529, 11, 11, 65529, 11, '\n', 65518, 65517, 65514, 65509, 65529, 0, 11, 65496, ' ', ',', '!', '/', 65496, 65513, 65534, 65535, 5, 65496, 28, '&', 25, 65496, 65518, 65517, 65514, 65509, 65529, 0, 11, 65496, 31, '&', '!', '+', '-', 65496}, 258 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0), true, objArr7);
        String strIntern2 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        a((char) TextUtils.getCapsMode(_UrlKt.FRAGMENT_ENCODE_SET, 0, 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, new char[]{9336, 27736, 8618, 42133, 64203, 13710, 18515, 55383, 44197, 47511}, new char[]{0, 0, 0, 0}, new char[]{64929, 15407, 62296, 49320}, objArr8);
        SignatureAlgorithm signatureAlgorithm11 = new SignatureAlgorithm("PS256", 10, "PS256", strIntern2, strIntern, ((String) objArr8[0]).intern(), false, 256, 2048);
        PS256 = signatureAlgorithm11;
        Object[] objArr9 = new Object[1];
        b(41 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.getTrimmedLength(_UrlKt.FRAGMENT_ENCODE_SET) + 46, new char[]{65535, '\n', 65495, 31, '+', ' ', '.', 65495, 65512, 65533, 65534, 4, 65495, 27, '%', 24, 65495, 65515, 65519, 65514, 65508, 65528, 65535, '\n', 65495, 30, '%', ' ', '*', ',', 65495, '\n', '\n', 7, 65508, 65528, '\n', '\n', 65528, '\n', '\t', 65515, 65519, 65514, 65508, 65528}, ExpandableListView.getPackedPositionType(0L) + 260, true, objArr9);
        String strIntern3 = ((String) objArr9[0]).intern();
        Object[] objArr10 = new Object[1];
        a((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), View.resolveSizeAndState(0, 0, 0), new char[]{9336, 27736, 8618, 42133, 64203, 13710, 18515, 55383, 44197, 47511}, new char[]{0, 0, 0, 0}, new char[]{64929, 15407, 62296, 49320}, objArr10);
        SignatureAlgorithm signatureAlgorithm12 = new SignatureAlgorithm("PS384", 11, "PS384", strIntern3, strIntern, ((String) objArr10[0]).intern(), false, 384, 2048);
        PS384 = signatureAlgorithm12;
        Object[] objArr11 = new Object[1];
        a((char) (TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0) + 1), ViewConfiguration.getLongPressTimeout() >> 16, new char[]{33720, 56294, 28690, 46229, 53815, 42703, 2410, 31154, 17619, 24691, 16994, 54018, 16930, 33165, 36513, 7449, 3126, 38171, 20378, 41371, 57835, 59762, 7713, 12485, 34460, 56410, 15720, 41418, 45192, 22567, 27879, 17192, 29863, 22001, 42003, 2648, 18620, 20098, 3648, 44450, 53344, 19235, 30468, 58819, 45707, 36775}, new char[]{0, 0, 0, 0}, new char[]{2219, 23969, 43540, 19177}, objArr11);
        String strIntern4 = ((String) objArr11[0]).intern();
        Object[] objArr12 = new Object[1];
        a((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, new char[]{9336, 27736, 8618, 42133, 64203, 13710, 18515, 55383, 44197, 47511}, new char[]{0, 0, 0, 0}, new char[]{64929, 15407, 62296, 49320}, objArr12);
        SignatureAlgorithm signatureAlgorithm13 = new SignatureAlgorithm("PS512", 12, "PS512", strIntern4, strIntern, ((String) objArr12[0]).intern(), false, Imgcodecs.IMWRITE_AVIF_QUALITY, 2048);
        PS512 = signatureAlgorithm13;
        $VALUES = new SignatureAlgorithm[]{signatureAlgorithm, signatureAlgorithm2, signatureAlgorithm3, signatureAlgorithm4, signatureAlgorithm5, signatureAlgorithm6, signatureAlgorithm7, signatureAlgorithm8, signatureAlgorithm9, signatureAlgorithm10, signatureAlgorithm11, signatureAlgorithm12, signatureAlgorithm13};
        PREFERRED_HMAC_ALGS = Collections.unmodifiableList(Arrays.asList(signatureAlgorithm4, signatureAlgorithm3, signatureAlgorithm2));
        PREFERRED_EC_ALGS = Collections.unmodifiableList(Arrays.asList(signatureAlgorithm10, signatureAlgorithm9, signatureAlgorithm8));
        int i = IAuthTabCallback + 115;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i4 = $10 + 47;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i6 = $11 + 23;
            $10 = i6 % 128;
            int i7 = i6 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> 16), 43 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1451 - (ViewConfiguration.getPressedStateDuration() >> 16), 228868077, false, $$c(b, b2, (byte) (b2 & 5)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 45 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1494 - KeyEvent.normalizeMetaState(0), 1533236389, false, $$c(b3, (byte) (b3 - 1), (byte) $$a.length), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23971 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0)), TextUtils.getOffsetAfter(_UrlKt.FRAGMENT_ENCODE_SET, 0) + 50, (ViewConfiguration.getTouchSlop() >> 8) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 45848), 29 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), Color.rgb(0, 0, 0) + 16789793, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((int) (onExtraCallbackWithResult ^ 7798559133331975163L)) ^ ((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onNavigationEvent ^ 7798559133331975163L))) ^ ((char) (onWarmupCompleted ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                cArr5 = cArr5;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, char[] cArr, int i3, boolean z, Object[] objArr) throws Throwable {
        char c;
        int i4;
        Object obj;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i2];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            c = '0';
            i4 = 2083011369;
            obj = null;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i2) {
                break;
            }
            int i6 = $10 + 93;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((KeyEvent.getMaxKeyCode() >> 16) + 35125), View.getDefaultSize(0, 0) + 23, 10278 - TextUtils.getOffsetBefore(_UrlKt.FRAGMENT_ENCODE_SET, 0), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12842 - Process.getGidForName(_UrlKt.FRAGMENT_ENCODE_SET)), 55 - Color.blue(0), 2166 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0), 1298711993, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i2) {
                int i9 = $11 + 13;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) >>> 1];
                    try {
                        Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                        if (objOnExtraCallback3 == null) {
                            char c2 = (char) (12844 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                            int deadChar = 55 - KeyEvent.getDeadChar(0, 0);
                            int iIndexOf = 2166 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, c, 0, 0);
                            byte b3 = (byte) 0;
                            byte b4 = (byte) (b3 - 1);
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c2, deadChar, iIndexOf, 1298711993, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(obj, objArr4);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback4 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 - 1);
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.normalizeMetaState(0) + 12843), Process.getGidForName(_UrlKt.FRAGMENT_ENCODE_SET) + 56, 16779383 + Color.rgb(0, 0, 0), 1298711993, false, $$c(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    obj = null;
                }
                c = '0';
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private SignatureAlgorithm(String str, int i, String str2, String str3, String str4, String str5, boolean z, int i2, int i3) {
        this(str, i, str2, str3, str4, str5, z, i2, i3, str5);
    }

    private SignatureAlgorithm(String str, int i, String str2, String str3, String str4, String str5, boolean z, int i2, int i3, String str6) {
        this.value = str2;
        this.description = str3;
        this.familyName = str4;
        this.jcaName = str5;
        this.jdkStandard = z;
        this.digestLength = i2;
        this.minKeyLength = i3;
        this.pkcs12Name = str6;
    }

    public String getValue() {
        String str;
        int i = 2 % 2;
        int i2 = onTransact + 17;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 != 0) {
            str = this.value;
            int i4 = 56 / 0;
        } else {
            str = this.value;
        }
        int i5 = i3 + 25;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String getDescription() {
        int i = 2 % 2;
        int i2 = asInterface + 31;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        String str = this.description;
        int i5 = i3 + 91;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 9 / 0;
        }
        return str;
    }

    public String getFamilyName() {
        int i = 2 % 2;
        int i2 = onTransact + 43;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        String str = this.familyName;
        int i5 = i3 + 97;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getJcaName() {
        int i = 2 % 2;
        int i2 = onTransact + 9;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        String str = this.jcaName;
        int i5 = i3 + 41;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public boolean isJdkStandard() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 109;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.jdkStandard;
        int i5 = i2 + 11;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public boolean isHmac() {
        int i = 2 % 2;
        int i2 = asInterface + 119;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return this.familyName.equals("HMAC");
        }
        int i3 = 98 / 0;
        return this.familyName.equals("HMAC");
    }

    public boolean isRsa() throws Throwable {
        String str;
        Object obj;
        int i = 2 % 2;
        int i2 = onTransact + 115;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            str = this.familyName;
            Object[] objArr = new Object[1];
            a((char) (26274 << ExpandableListView.getPackedPositionChild(0L)), (-1790199678) % View.combineMeasuredStates(1, 0), new char[]{6368, 61964, 21995}, new char[]{0, 0, 0, 0}, new char[]{33497, 19384, 42133, 36653}, objArr);
            obj = objArr[0];
        } else {
            str = this.familyName;
            Object[] objArr2 = new Object[1];
            a((char) (11683 - ExpandableListView.getPackedPositionChild(0L)), (-1790199678) - View.combineMeasuredStates(0, 0), new char[]{6368, 61964, 21995}, new char[]{0, 0, 0, 0}, new char[]{33497, 19384, 42133, 36653}, objArr2);
            obj = objArr2[0];
        }
        return str.equals(((String) obj).intern());
    }

    public boolean isEllipticCurve() {
        int i = 2 % 2;
        int i2 = onTransact + 21;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return this.familyName.equals("ECDSA");
        }
        this.familyName.equals("ECDSA");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getMinKeyLength() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 1;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.minKeyLength;
        int i6 = i2 + 65;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public void assertValidSigningKey(Key key) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 87;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        assertValid(key, true);
        int i4 = onTransact + 95;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public void assertValidVerificationKey(Key key) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 119;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        assertValid(key, false);
        int i4 = asInterface + 17;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    private static String keyType(boolean z) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 91;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 62 / 0;
            if (!z) {
                return "verification";
            }
        } else if (!z) {
            return "verification";
        }
        int i5 = i2 + 69;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return "signing";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void assertValid(Key key, boolean z) throws Throwable {
        String str;
        int i = 2 % 2;
        if (this == NONE) {
            throw new InvalidKeyException("The 'NONE' signature algorithm does not support cryptographic keys.");
        }
        if (isHmac()) {
            if (!(key instanceof SecretKey)) {
                throw new InvalidKeyException(this.familyName + " " + keyType(z) + " keys must be SecretKey instances.");
            }
            SecretKey secretKey = (SecretKey) key;
            byte[] encoded = secretKey.getEncoded();
            if (encoded == null) {
                throw new InvalidKeyException("The " + keyType(z) + " key's encoded bytes cannot be null.");
            }
            String algorithm = secretKey.getAlgorithm();
            if (algorithm == null) {
                throw new InvalidKeyException("The " + keyType(z) + " key's algorithm cannot be null.");
            }
            SignatureAlgorithm signatureAlgorithm = HS256;
            if (!signatureAlgorithm.jcaName.equalsIgnoreCase(algorithm)) {
                SignatureAlgorithm signatureAlgorithm2 = HS384;
                if (!signatureAlgorithm2.jcaName.equalsIgnoreCase(algorithm)) {
                    SignatureAlgorithm signatureAlgorithm3 = HS512;
                    if (!signatureAlgorithm3.jcaName.equalsIgnoreCase(algorithm) && !signatureAlgorithm.pkcs12Name.equals(algorithm)) {
                        int i2 = asInterface + 51;
                        onTransact = i2 % 128;
                        int i3 = i2 % 2;
                        if (!signatureAlgorithm2.pkcs12Name.equals(algorithm)) {
                            int i4 = onTransact + 31;
                            asInterface = i4 % 128;
                            if (i4 % 2 != 0) {
                                signatureAlgorithm3.pkcs12Name.equals(algorithm);
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            if (!signatureAlgorithm3.pkcs12Name.equals(algorithm)) {
                                throw new InvalidKeyException("The " + keyType(z) + " key's algorithm '" + algorithm + "' does not equal a valid HmacSHA* algorithm name and cannot be used with " + name() + ".");
                            }
                        }
                    }
                }
            }
            int length = encoded.length << 3;
            if (length >= this.minKeyLength) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("The ");
            sb.append(keyType(z));
            sb.append(" key's size is ");
            sb.append(length);
            sb.append(" bits which ");
            sb.append("is not secure enough for the ");
            sb.append(name());
            sb.append(" algorithm.  The JWT ");
            sb.append("JWA Specification (RFC 7518, Section 3.2) states that keys used with ");
            sb.append(name());
            sb.append(" MUST have a ");
            sb.append("size >= ");
            sb.append(this.minKeyLength);
            sb.append(" bits (the key size must be greater than or equal to the hash ");
            sb.append("output size).  Consider using the ");
            sb.append(Keys.class.getName());
            sb.append(" class's ");
            sb.append("'secretKeyFor(SignatureAlgorithm.");
            sb.append(name());
            sb.append(")' method to create a key guaranteed to be ");
            sb.append("secure enough for ");
            sb.append(name());
            sb.append(".  See ");
            Object[] objArr = new Object[1];
            a((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 56539), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 386326526, new char[]{42334, 48881, 59676, 38336, 20236, 370, 48930, 9970, 2988, 22897, 43569, 13772, 31627, 16977, 23747, 64582, 16379, 41441, 56841, 63001, 34036, 56066, 50879, 12214, 49401, 52141, 28515, 30283, 32974, 7024, 32509, 16407, 4192, 58784, 723, 10111, 19480, 46859, 42524, 10253, 31986, 26020, 42106, 63731, 22047, 25152, 37873, 50863, 45717, 3040, 40373, 7237, 39715, 35822, 26565, 39313, 46249, 32900, 16543, 59722, 39938, 43251, 7474, 438, 19755, 61972, 36131, 64122, 56584}, new char[]{0, 0, 0, 0}, new char[]{920, 63776, 56552, 14044}, objArr);
            sb.append(((String) objArr[0]).intern());
            throw new WeakKeyException(sb.toString());
        }
        if (z && !(key instanceof PrivateKey)) {
            throw new InvalidKeyException(this.familyName + " signing keys must be PrivateKey instances.");
        }
        if (isEllipticCurve()) {
            if (!(key instanceof ECKey)) {
                throw new InvalidKeyException(this.familyName + " " + keyType(z) + " keys must be ECKey instances.");
            }
            int iBitLength = ((ECKey) key).getParams().getOrder().bitLength();
            if (iBitLength >= this.minKeyLength) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("The ");
            sb2.append(keyType(z));
            sb2.append(" key's size (ECParameterSpec order) is ");
            sb2.append(iBitLength);
            sb2.append(" bits which is not secure enough for the ");
            sb2.append(name());
            sb2.append(" algorithm.  The JWT ");
            sb2.append("JWA Specification (RFC 7518, Section 3.4) states that keys used with ");
            sb2.append(name());
            sb2.append(" MUST have a size >= ");
            sb2.append(this.minKeyLength);
            sb2.append(" bits.  Consider using the ");
            sb2.append(Keys.class.getName());
            sb2.append(" class's ");
            sb2.append("'keyPairFor(SignatureAlgorithm.");
            sb2.append(name());
            sb2.append(")' method to create a key pair guaranteed ");
            sb2.append("to be secure enough for ");
            sb2.append(name());
            sb2.append(".  See ");
            Object[] objArr2 = new Object[1];
            b(43 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 69, new char[]{20, 21, 15, 26, '\t', 11, 25, 65481, 65502, 65495, 65499, 65501, '\t', '\f', 24, 65493, 18, 19, 26, 14, 65493, '\r', 24, 21, 65492, '\f', 26, 11, 15, 65492, 25, 18, 21, 21, 26, 65493, 65493, 65504, 25, 22, 26, 26, 14, 65492, 20, 21, 15, 26, 7, 19, 24, 21, '\f', 20, 15, 65478, 11, 24, 21, 19, 65478, 24, 21, '\f', 65478, 65498, 65492, 65497, 65491}, 276 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0), true, objArr2);
            sb2.append(((String) objArr2[0]).intern());
            throw new WeakKeyException(sb2.toString());
        }
        if (!(key instanceof RSAKey)) {
            throw new InvalidKeyException(this.familyName + " " + keyType(z) + " keys must be RSAKey instances.");
        }
        int i5 = asInterface + 51;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        int iBitLength2 = ((RSAKey) key).getModulus().bitLength();
        if (iBitLength2 < this.minKeyLength) {
            if (name().startsWith("P")) {
                int i7 = asInterface + 35;
                onTransact = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 3 % 4;
                }
                str = "3.5";
            } else {
                str = "3.3";
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("The ");
            sb3.append(keyType(z));
            sb3.append(" key's size is ");
            sb3.append(iBitLength2);
            sb3.append(" bits which is not secure ");
            sb3.append("enough for the ");
            sb3.append(name());
            sb3.append(" algorithm.  The JWT JWA Specification (RFC 7518, Section ");
            sb3.append(str);
            sb3.append(") states that keys used with ");
            sb3.append(name());
            sb3.append(" MUST have a size >= ");
            sb3.append(this.minKeyLength);
            sb3.append(" bits.  Consider using the ");
            sb3.append(Keys.class.getName());
            sb3.append(" class's ");
            sb3.append("'keyPairFor(SignatureAlgorithm.");
            sb3.append(name());
            sb3.append(")' method to create a key pair guaranteed ");
            sb3.append("to be secure enough for ");
            sb3.append(name());
            sb3.append(".  See ");
            Object[] objArr3 = new Object[1];
            b((ViewConfiguration.getScrollDefaultDelay() >> 16) + 25, 44 - ((Process.getThreadPriority(0) + 20) >> 6), new char[]{20, 23, '\f', 65492, '\r', 25, 18, 17, 65492, 23, 11, '\b', 65500, 65498, 65494, 65501, 65480, 24, '\n', '\b', 25, 14, 20, 19, 65490, '\r', 25, 25, 21, 24, 65503, 65492, 65492, 25, 20, 20, 17, 24, 65491, 14, '\n', 25, 11, 65491}, MotionEvent.axisFromString(_UrlKt.FRAGMENT_ENCODE_SET) + 279, false, objArr3);
            sb3.append(((String) objArr3[0]).intern());
            sb3.append(str);
            sb3.append(" for more information.");
            throw new WeakKeyException(sb3.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if ((r10 instanceof java.security.interfaces.RSAKey) != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SignatureAlgorithm forSigningKey(Key key) throws Throwable {
        int i = 2 % 2;
        if (key == null) {
            throw new InvalidKeyException("Key argument cannot be null.");
        }
        boolean z = key instanceof SecretKey;
        if (!z) {
            int i2 = asInterface;
            int i3 = i2 + 111;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            if (!(!(key instanceof PrivateKey))) {
                int i5 = i2 + 97;
                onTransact = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 15 / 0;
                    if (!(key instanceof ECKey)) {
                    }
                } else if (!(key instanceof ECKey)) {
                }
            }
            throw new InvalidKeyException("JWT standard signing algorithms require either 1) a SecretKey for HMAC-SHA algorithms or 2) a private RSAKey for RSA algorithms or 3) a private ECKey for Elliptic Curve algorithms.  The specified key is of type " + key.getClass().getName());
        }
        if (z) {
            int length = io.jsonwebtoken.lang.Arrays.length(((SecretKey) key).getEncoded()) << 3;
            for (SignatureAlgorithm signatureAlgorithm : PREFERRED_HMAC_ALGS) {
                int i7 = asInterface + 13;
                onTransact = i7 % 128;
                int i8 = i7 % 2;
                if (length >= signatureAlgorithm.minKeyLength) {
                    return signatureAlgorithm;
                }
            }
            throw new WeakKeyException("The specified SecretKey is not strong enough to be used with JWT HMAC signature algorithms.  The JWT specification requires HMAC keys to be >= 256 bits long.  The specified key is " + length + " bits.  See https://tools.ietf.org/html/rfc7518#section-3.2 for more information.");
        }
        if (!(key instanceof RSAKey)) {
            int iBitLength = ((ECKey) key).getParams().getOrder().bitLength();
            for (SignatureAlgorithm signatureAlgorithm2 : PREFERRED_EC_ALGS) {
                if (iBitLength >= signatureAlgorithm2.minKeyLength) {
                    int i9 = asInterface + 53;
                    onTransact = i9 % 128;
                    if (i9 % 2 != 0) {
                        signatureAlgorithm2.assertValidSigningKey(key);
                        return signatureAlgorithm2;
                    }
                    signatureAlgorithm2.assertValidSigningKey(key);
                    throw null;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("The specified Elliptic Curve signing key is not strong enough to be used with JWT ECDSA signature algorithms.  The JWT specification requires ECDSA keys to be >= 256 bits long.  The specified ECDSA key is ");
            sb.append(iBitLength);
            sb.append(" bits.  See ");
            Object[] objArr = new Object[1];
            b(Color.red(0) + 43, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 69, new char[]{20, 21, 15, 26, '\t', 11, 25, 65481, 65502, 65495, 65499, 65501, '\t', '\f', 24, 65493, 18, 19, 26, 14, 65493, '\r', 24, 21, 65492, '\f', 26, 11, 15, 65492, 25, 18, 21, 21, 26, 65493, 65493, 65504, 25, 22, 26, 26, 14, 65492, 20, 21, 15, 26, 7, 19, 24, 21, '\f', 20, 15, 65478, 11, 24, 21, 19, 65478, 24, 21, '\f', 65478, 65498, 65492, 65497, 65491}, 277 - TextUtils.getCapsMode(_UrlKt.FRAGMENT_ENCODE_SET, 0, 0), true, objArr);
            sb.append(((String) objArr[0]).intern());
            throw new WeakKeyException(sb.toString());
        }
        int iBitLength2 = ((RSAKey) key).getModulus().bitLength();
        if (iBitLength2 >= 4096) {
            int i10 = onTransact + 109;
            asInterface = i10 % 128;
            int i11 = i10 % 2;
            SignatureAlgorithm signatureAlgorithm3 = RS512;
            signatureAlgorithm3.assertValidSigningKey(key);
            return signatureAlgorithm3;
        }
        if (iBitLength2 >= 3072) {
            int i12 = asInterface + 21;
            onTransact = i12 % 128;
            int i13 = i12 % 2;
            SignatureAlgorithm signatureAlgorithm4 = RS384;
            signatureAlgorithm4.assertValidSigningKey(key);
            return signatureAlgorithm4;
        }
        SignatureAlgorithm signatureAlgorithm5 = RS256;
        if (iBitLength2 >= signatureAlgorithm5.minKeyLength) {
            signatureAlgorithm5.assertValidSigningKey(key);
            return signatureAlgorithm5;
        }
        throw new WeakKeyException("The specified RSA signing key is not strong enough to be used with JWT RSA signature algorithms.  The JWT specification requires RSA keys to be >= 2048 bits long.  The specified RSA key is " + iBitLength2 + " bits.  See https://tools.ietf.org/html/rfc7518#section-3.3 for more information.");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: io.jsonwebtoken.security.SignatureException */
    public static SignatureAlgorithm forName(String str) throws SignatureException {
        SignatureAlgorithm[] signatureAlgorithmArrValues;
        int length;
        int i = 2 % 2;
        int i2 = asInterface + 1;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            signatureAlgorithmArrValues = values();
            length = signatureAlgorithmArrValues.length;
        } else {
            signatureAlgorithmArrValues = values();
            length = signatureAlgorithmArrValues.length;
        }
        for (int i3 = 0; i3 < length; i3++) {
            SignatureAlgorithm signatureAlgorithm = signatureAlgorithmArrValues[i3];
            if (signatureAlgorithm.getValue().equalsIgnoreCase(str)) {
                int i4 = onTransact + 73;
                asInterface = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 / 0;
                }
                return signatureAlgorithm;
            }
        }
        throw new SignatureException("Unsupported signature algorithm '" + str + "'");
    }

    static void onWarmupCompleted() {
        onNavigationEvent = 7798559133331975163L;
        onExtraCallbackWithResult = -1776194565;
        onWarmupCompleted = (char) 15100;
        onExtraCallback = 478309010;
    }
}
