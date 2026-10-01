package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import im.toss.features.verify.oneclicklogin.impl.view.presentation.LoginTokenConsentViewModel_HiltModules;
import im.toss.features.verify.teensmanualselfie.impl.idcardupload.nav.TeensManualSelfieNavGraphKt$;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import java.lang.reflect.Method;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Arrays;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import o.setProgressColor;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class EstimateFaceQualityFromBGRImage {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final EstimateFaceQualityFromBGRImage IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 0;
    private static int[] asInterface = null;
    private static final SecureRandom onExtraCallback;
    private static char onExtraCallbackWithResult = 0;
    private static char[] onNavigationEvent = null;
    private static int onTransact = 1;
    private static final byte[] onWarmupCompleted;

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) throws Throwable {
        int i7 = ~i2;
        int i8 = ~i3;
        int i9 = ~i4;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i8 | i2 | i4);
        int i12 = (~(i4 | i2)) | (~(i7 | i9)) | i8;
        int i13 = i2 + i3 + i6 + ((-1422066268) * i5) + ((-2108786386) * i);
        int i14 = i13 * i13;
        int i15 = (i2 * 793895740) + 1353643607 + (i3 * 793896262) + (i10 * (-261)) + (i11 * (-261)) + (i12 * 261) + (793896001 * i6) + (692483748 * i5) + ((-1016611666) * i) + (i14 * 166461440);
        int i16 = ((-1583913924) * i2) + 967573504 + (322476998 * i3) + (i10 * 1194288187) + (1194288187 * i11) + ((-1194288187) * i12) + (1516765184 * i6) + ((-1298137088) * i5) + (1722810368 * i) + (518782976 * i14) + (i15 * i15 * 1997799424);
        if (i16 == 1) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i16 != 2) {
            return onNavigationEvent(objArr);
        }
        String str = (String) objArr[1];
        int i17 = 2 % 2;
        Object[] objArr2 = new Object[1];
        b(new char[]{13844, 13844, 13844, 13844, 1, 7, '\f', '\n', '\t', 15, 11, 3, '\n', '\b', 2, '\b', 6, 2, 4, 5, 2, '\n', 13844, 13844, 13844, 13844, 13844}, (byte) (93 - View.MeasureSpec.getSize(0)), KeyEvent.keyCodeFromString("") + 27, objArr2);
        String strReplace$default = StringsKt.replace$default(str, ((String) objArr2[0]).intern(), "", false, 4, (Object) null);
        Object[] objArr3 = new Object[1];
        b(new char[]{13842, 13842, 13842, 13842, 2, 15, 1, 5, 11, 3, '\n', '\b', 2, '\b', 6, 2, 4, 5, 2, '\n', 13842, 13842, 13842, 13842, 13842}, (byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 90), 24 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr3);
        byte[] bArrOnNavigationEvent = Page.onNavigationEvent(StringsKt.replace$default(strReplace$default, ((String) objArr3[0]).intern(), "", false, 4, (Object) null), 0);
        PKCS8EncodedKeySpec pKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(bArrOnNavigationEvent);
        Object[] objArr4 = new Object[1];
        a(new int[]{-1139064367, -422182555}, TextUtils.indexOf("", "", 0) + 3, objArr4);
        PrivateKey privateKeyGeneratePrivate = KeyFactory.getInstance(((String) objArr4[0]).intern()).generatePrivate(pKCS8EncodedKeySpec);
        Arrays.fill(bArrOnNavigationEvent, (byte) 0);
        Intrinsics.checkNotNull(privateKeyGeneratePrivate);
        int i18 = onTransact + 91;
        IAuthTabCallbackStub = i18 % 128;
        int i19 = i18 % 2;
        return privateKeyGeneratePrivate;
    }

    private EstimateFaceQualityFromBGRImage() {
    }

    static {
        IAuthTabCallback();
        IAuthTabCallback = new EstimateFaceQualityFromBGRImage();
        onWarmupCompleted = new byte[0];
        onExtraCallback = new SecureRandom();
        int i = IAuthTabCallbackDefault + 73;
        asBinder = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        String str = (String) objArr[1];
        byte[] bArr = (byte[]) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 23;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        String strOnWarmupCompleted = setup.onWarmupCompleted(setProgressColor.onNavigationEvent.onNavigationEvent(setProgressColor.Companion, bArr, (IvParameterSpec) null, 2, (Object) null), str, 0);
        int i4 = onTransact + 97;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return strOnWarmupCompleted;
        }
        throw null;
    }

    public final String IAuthTabCallback(@NotNull String str, @NotNull byte[] bArr) {
        setupStyleable setupstyleableOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onTransact + 59;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(bArr, "");
            setupstyleableOnExtraCallbackWithResult = setProgressColor.onNavigationEvent.onExtraCallbackWithResult(setProgressColor.Companion, bArr, (IvParameterSpec) null, 5, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(bArr, "");
            setupstyleableOnExtraCallbackWithResult = setProgressColor.onNavigationEvent.onExtraCallbackWithResult(setProgressColor.Companion, bArr, (IvParameterSpec) null, 2, (Object) null);
        }
        String strOnExtraCallback = setup.onExtraCallback(setupstyleableOnExtraCallbackWithResult, str, 0);
        int i3 = onTransact + 63;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return strOnExtraCallback;
    }

    public final String onExtraCallbackWithResult(@NotNull byte[] bArr, @NotNull String str) throws Exception {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 99;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(str, "");
        Object[] objArr = new Object[1];
        a(new int[]{-419641092, -1589112938, -179425737, -1517702521, -1951459237, -284379459, -1447299571, 1409283111}, TextUtils.lastIndexOf("", '0', 0, 0) + 14, objArr);
        Signature signature = Signature.getInstance(((String) objArr[0]).intern());
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        signature.initSign((PrivateKey) onWarmupCompleted(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -710747511, new Object[]{this, str}, 710747513, iIAuthTabCallback, iIAuthTabCallback3, iIAuthTabCallback2));
        signature.update(bArr);
        byte[] bArrSign = signature.sign();
        Intrinsics.checkNotNullExpressionValue(bArrSign, "");
        String strOnNavigationEvent = Page.onNavigationEvent(bArrSign, 0);
        int i4 = IAuthTabCallbackStub + 117;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return strOnNavigationEvent;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        String str = (String) objArr[1];
        byte[] bArr = (byte[]) objArr[2];
        byte[] bArr2 = (byte[]) objArr[3];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        byte[] bArr3 = new byte[12];
        onExtraCallback.nextBytes(bArr3);
        Object[] objArr2 = {setProgressColor.Companion, bArr, new GCMParameterSpec(128, bArr3), bArr2};
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        String strOnExtraCallbackWithResult = Page.onExtraCallbackWithResult(ArraysKt.plus(bArr3, ((setupStyleable) setProgressColor.onNavigationEvent.IAuthTabCallback(-932965038, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), objArr2, 932965038, iOnWarmupCompleted, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted())).a_(PageKey.IAuthTabCallback(str, Charsets.UTF_8))), 0, 1, null);
        int i2 = onTransact + 87;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 88 / 0;
        }
        return strOnExtraCallbackWithResult;
    }

    public final String IAuthTabCallback(@NotNull String str, @NotNull byte[] bArr, @NotNull byte[] bArr2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        byte[] bArrOnNavigationEvent = Page.onNavigationEvent(str, 0, 1, null);
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, ArraysKt.copyOfRange(bArrOnNavigationEvent, 0, 12));
        byte[] bArrCopyOfRange = ArraysKt.copyOfRange(bArrOnNavigationEvent, 12, bArrOnNavigationEvent.length);
        Object[] objArr = {setProgressColor.Companion, bArr, gCMParameterSpec, bArr2};
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        String str2 = new String(((BaseRoundCornerProgressBarOnProgressChangedListener) setProgressColor.onNavigationEvent.IAuthTabCallback(1916344480, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), objArr, -1916344477, iOnWarmupCompleted, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted())).onExtraCallbackWithResult(bArrCopyOfRange), Charsets.UTF_8);
        int i2 = IAuthTabCallbackStub + 105;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return str2;
    }

    public static /* synthetic */ String IAuthTabCallback(EstimateFaceQualityFromBGRImage estimateFaceQualityFromBGRImage, String str, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onTransact + 79;
        int i4 = i3 % 128;
        IAuthTabCallbackStub = i4;
        if (i3 % 2 == 0 ? (i & 2) != 0 : (i & 2) != 0) {
            int i5 = i4 + 17;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        }
        return estimateFaceQualityFromBGRImage.onExtraCallback(str, z);
    }

    public final String onExtraCallback(@NotNull String str, boolean z) throws Exception {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 93;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String strOnWarmupCompleted = onWarmupCompleted(PageKey.IAuthTabCallback(str, Charsets.UTF_8), z);
        int i4 = IAuthTabCallbackStub + 37;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return strOnWarmupCompleted;
    }

    public static /* synthetic */ String IAuthTabCallback(EstimateFaceQualityFromBGRImage estimateFaceQualityFromBGRImage, byte[] bArr, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 101;
        int i4 = i3 % 128;
        onTransact = i4;
        if (i3 % 2 != 0 ? (i & 2) != 0 : (i & 2) != 0) {
            int i5 = i4 + 23;
            int i6 = i5 % 128;
            IAuthTabCallbackStub = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 89;
            onTransact = i8 % 128;
            int i9 = i8 % 2;
            z = true;
        }
        return estimateFaceQualityFromBGRImage.onWarmupCompleted(bArr, z);
    }

    public final String onWarmupCompleted(@NotNull byte[] bArr, boolean z) throws Exception {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(bArr, "");
        if (bArr.length == 0) {
            int i2 = onTransact + 1;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 17 / 0;
            }
            return "";
        }
        byte[] bArrIAuthTabCallback = IAuthTabCallback(bArr);
        Object obj = null;
        if (bArrIAuthTabCallback.length == 0) {
            int i4 = onTransact + 49;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                return "";
            }
            obj.hashCode();
            throw null;
        }
        String strOnExtraCallback = getPageContainer.onExtraCallback(bArrIAuthTabCallback);
        if (!z) {
            String strSubstring = strOnExtraCallback.substring(0, strOnExtraCallback.length() / 2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            return strSubstring;
        }
        int i5 = onTransact + 39;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return strOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ byte[] onNavigationEvent(EstimateFaceQualityFromBGRImage estimateFaceQualityFromBGRImage, byte[] bArr, boolean z, int i, Object obj) throws Exception {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = onTransact + 83;
            IAuthTabCallbackStub = i3 % 128;
            z = i3 % 2 == 0;
        }
        byte[] bArrOnExtraCallback = estimateFaceQualityFromBGRImage.onExtraCallback(bArr, z);
        int i4 = onTransact + 87;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return bArrOnExtraCallback;
    }

    public final byte[] onExtraCallback(@NotNull byte[] bArr, boolean z) throws Exception {
        int i = 2 % 2;
        int i2 = onTransact + 69;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(bArr, "");
            IAuthTabCallback(bArr);
            int length = bArr.length;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(bArr, "");
        byte[] bArrIAuthTabCallback = IAuthTabCallback(bArr);
        if (bArr.length == 0) {
            byte[] bArr2 = onWarmupCompleted;
            int i3 = IAuthTabCallbackStub + 3;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            return bArr2;
        }
        if (z) {
            return bArrIAuthTabCallback;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArrIAuthTabCallback, bArrIAuthTabCallback.length / 2);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "");
        return bArrCopyOf;
    }

    private final byte[] IAuthTabCallback(byte[] bArr) throws Exception {
        int i = 2 % 2;
        try {
            setTextProgressMargin<MessageDigest> settextprogressmarginOnNavigationEvent = setTextProgressSize.onWarmupCompleted.onExtraCallback().onNavigationEvent();
            try {
                MessageDigest messageDigestOnWarmupCompleted = settextprogressmarginOnNavigationEvent.onWarmupCompleted();
                messageDigestOnWarmupCompleted.update(bArr);
                byte[] bArrDigest = messageDigestOnWarmupCompleted.digest();
                settextprogressmarginOnNavigationEvent.close();
                Intrinsics.checkNotNull(bArrDigest);
                int i2 = onTransact + 65;
                IAuthTabCallbackStub = i2 % 128;
                int i3 = i2 % 2;
                return bArrDigest;
            } catch (Throwable th) {
                settextprogressmarginOnNavigationEvent.close();
                throw th;
            }
        } catch (NoSuchAlgorithmException e) {
            auth.IAuthTabCallback(-1588674344, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), new Object[]{auth.onNavigationEvent, e, null, 2, null}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 1588674346, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent());
            byte[] bArr2 = onWarmupCompleted;
            int i4 = onTransact + 45;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return bArr2;
        }
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = asInterface;
        int i4 = -1469660336;
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), ExpandableListView.getPackedPositionType(0L) + 72, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i6++;
                    int i7 = $11 + 43;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    i4 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = asInterface;
        char c = '0';
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i9 = 0;
            while (i9 < length3) {
                Object[] objArr3 = new Object[1];
                objArr3[i5] = Integer.valueOf(iArr5[i9]);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", c, i5, i5) + 1), View.resolveSizeAndState(i5, i5, i5) + 72, 8848 - (ViewConfiguration.getFadingEdgeLength() >> 16), -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i9] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i9++;
                int i10 = $10 + 27;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                i5 = 0;
                c = '0';
            }
            i2 = i5;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i12 = $11 + 17;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i14 = $10 + 33;
            $11 = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = 3 / 3;
            }
            int i16 = 0;
            while (i16 < 16) {
                int i17 = $10 + 83;
                $11 = i17 % 128;
                if (i17 % 2 == 0) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i16];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "", 0) + 22252), Color.red(0) + 39, 10302 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i16 += 47;
                } else {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i16];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.red(0) + 22252), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 38, Color.rgb(0, 0, 0) + 16787517, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue2;
                    i16++;
                }
            }
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i18;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4032 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), View.MeasureSpec.getSize(0) + 78, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public final String onExtraCallbackWithResult(@NotNull String str) throws Exception {
        int i = 2 % 2;
        int i2 = onTransact + 85;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            setTextProgressMargin<MessageDigest> settextprogressmarginOnNavigationEvent = setTextProgressSize.onWarmupCompleted.onWarmupCompleted().onNavigationEvent();
            try {
                MessageDigest messageDigestOnWarmupCompleted = settextprogressmarginOnNavigationEvent.onWarmupCompleted();
                messageDigestOnWarmupCompleted.update(PageKey.IAuthTabCallback(str, Charsets.UTF_8));
                byte[] bArrDigest = messageDigestOnWarmupCompleted.digest();
                Intrinsics.checkNotNullExpressionValue(bArrDigest, "");
                return getPageContainer.onExtraCallback(bArrDigest);
            } finally {
                settextprogressmarginOnNavigationEvent.close();
            }
        } catch (NoSuchAlgorithmException e) {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr = new Object[1];
            a(new int[]{239107728, -1469489960, 383931472, 1532091702, 1259770884, -491458853, 142849581, 610760238, 1788945759, -1597478639, -632812917, 1491747638, 757432346, -1634910918, -351770685, -1010976401, -1523707285, -668646130}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 35, objArr);
            convertFloatArrayToByteArray.IAuthTabCallback(((String) objArr[0]).intern(), e);
            int i4 = onTransact + 1;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return "";
        }
    }

    public final String onNavigationEvent(@NotNull Function1<? super MessageDigest, Unit> function1) throws Exception {
        int i = 2 % 2;
        int i2 = onTransact + 115;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        try {
            setTextProgressMargin<MessageDigest> settextprogressmarginOnNavigationEvent = setTextProgressSize.onWarmupCompleted.onWarmupCompleted().onNavigationEvent();
            try {
                MessageDigest messageDigestOnWarmupCompleted = settextprogressmarginOnNavigationEvent.onWarmupCompleted();
                function1.invoke(messageDigestOnWarmupCompleted);
                byte[] bArrDigest = messageDigestOnWarmupCompleted.digest();
                Intrinsics.checkNotNullExpressionValue(bArrDigest, "");
                return getPageContainer.onExtraCallback(bArrDigest);
            } finally {
                settextprogressmarginOnNavigationEvent.close();
            }
        } catch (NoSuchAlgorithmException e) {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr = new Object[1];
            a(new int[]{239107728, -1469489960, 383931472, 1532091702, 1259770884, -491458853, 142849581, 610760238, 1788945759, -1597478639, -632812917, 1491747638, 757432346, -1634910918, -351770685, -1010976401, -1523707285, -668646130}, 35 - ExpandableListView.getPackedPositionType(0L), objArr);
            convertFloatArrayToByteArray.IAuthTabCallback(((String) objArr[0]).intern(), e);
            int i4 = IAuthTabCallbackStub + 123;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return "";
        }
    }

    private static void b(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onNavigationEvent;
        Object obj2 = null;
        if (cArr2 != null) {
            int i4 = $10 + 3;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), KeyEvent.keyCodeFromString("") + 26, 23139 - (KeyEvent.getMaxKeyCode() >> 16), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
        char c = '0';
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 26 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 23139 - TextUtils.getTrimmedLength(""), -2137011959, false, "z", new Class[]{Integer.TYPE});
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
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24823 - TextUtils.indexOf("", c, 0, 0)), 73 - ImageFormat.getBitsPerPixel(0), 8089 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        int i7 = $10 + 19;
                        $11 = i7 % 128;
                        int i8 = i7 % 2;
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0), 30 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), Color.alpha(0) + 19488, 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i9 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i9];
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            int i10 = $10 + 105;
                            $11 = i10 % 128;
                            int i11 = i10 % 2;
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i12];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                        } else {
                            int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i14];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i15];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
                c = '0';
            }
        }
        int i16 = 0;
        while (i16 < i) {
            cArr4[i16] = (char) (cArr4[i16] ^ 13722);
            i16++;
            int i17 = $11 + 47;
            $10 = i17 % 128;
            int i18 = i17 % 2;
        }
        objArr[0] = new String(cArr4);
    }

    private final PrivateKey IAuthTabCallback(String str) throws Exception {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (PrivateKey) onWarmupCompleted(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -710747511, new Object[]{this, str}, 710747513, iIAuthTabCallback, iIAuthTabCallback3, iIAuthTabCallback2);
    }

    public final String onNavigationEvent(@NotNull String str, @NotNull byte[] bArr) {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (String) onWarmupCompleted(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), 2046127422, new Object[]{this, str, bArr}, -2046127422, iIAuthTabCallback, iIAuthTabCallback3, iIAuthTabCallback2);
    }

    public final String onNavigationEvent(@NotNull String str, @NotNull byte[] bArr, @NotNull byte[] bArr2) {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (String) onWarmupCompleted(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -425464796, new Object[]{this, str, bArr, bArr2}, 425464797, iIAuthTabCallback, iIAuthTabCallback3, iIAuthTabCallback2);
    }

    static void IAuthTabCallback() {
        onNavigationEvent = new char[]{64997, 65015, 64999, 64926, 65016, 65009, 65002, 64915, 65012, 64993, 65010, 65018, 64996, 65021, 65014, 64995};
        onExtraCallbackWithResult = (char) 51245;
        asInterface = new int[]{-173874840, 1930177092, 1885202503, 1693977556, -1559363858, -446443602, -771727518, 1255972873, 1830469698, -297771776, -203866768, -688767665, -44202446, -255559398, -1011565303, -1440674399, 1579454036, -1417600287};
    }
}
