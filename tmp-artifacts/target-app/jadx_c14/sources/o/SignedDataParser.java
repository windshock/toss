package o;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import o.TTBaseLandingPageActivity;
import o.getCrls;
import o.setProgressColor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class SignedDataParser {
    public static final SignedDataParser IAuthTabCallback;
    private static int IAuthTabCallbackDefault;
    private static byte[] IAuthTabCallbackStub;
    private static int asBinder;
    private static int asInterface;
    private static int getInterfaceDescriptor;
    private static KeyPair onExtraCallback;
    public static final int onExtraCallbackWithResult;
    private static final Object onNavigationEvent;
    private static short[] onTransact;
    private static BaseRoundCornerProgressBar1 onWarmupCompleted;
    private static final byte[] $$a = {20, 103, 109, 52};
    private static final int $$b = 114;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int access100 = 0;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int access000 = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, short r7, int r8) {
        /*
            int r6 = r6 * 2
            int r6 = 115 - r6
            int r7 = r7 * 3
            int r0 = 1 - r7
            byte[] r1 = o.SignedDataParser.$$a
            int r8 = r8 * 3
            int r8 = 4 - r8
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L2c
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r6
            r6 = r4
            r4 = r5
        L2c:
            int r8 = r8 + 1
            int r6 = -r6
            int r6 = r6 + r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.SignedDataParser.$$c(int, short, int):java.lang.String");
    }

    private SignedDataParser() {
    }

    static {
        getInterfaceDescriptor = 1;
        onExtraCallback();
        IAuthTabCallback = new SignedDataParser();
        onNavigationEvent = new Object();
        onExtraCallbackWithResult = 8;
        int i = access000 + 97;
        getInterfaceDescriptor = i % 128;
        int i2 = i % 2;
    }

    public final void onNavigationEvent(@Nullable BaseRoundCornerProgressBar1 baseRoundCornerProgressBar1) {
        synchronized (onNavigationEvent) {
            onWarmupCompleted = baseRoundCornerProgressBar1;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final String onExtraCallbackWithResult() {
        String string;
        synchronized (onNavigationEvent) {
            BaseRoundCornerProgressBar1 baseRoundCornerProgressBar1 = onWarmupCompleted;
            string = baseRoundCornerProgressBar1 != null ? baseRoundCornerProgressBar1.toString() : null;
        }
        return string;
    }

    public final String IAuthTabCallback() throws Throwable {
        Object[] objArr = new Object[1];
        a((short) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), (byte) (KeyEvent.normalizeMetaState(0) + 34), Gravity.getAbsoluteGravity(0, 0) - 1363484197, (-961552872) - TextUtils.lastIndexOf("", '0'), (-58) - View.MeasureSpec.getSize(0), objArr);
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(((String) objArr[0]).intern());
        keyPairGenerator.initialize(2048);
        KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
        synchronized (onNavigationEvent) {
            onExtraCallback = keyPairGenerateKeyPair;
            Unit unit = Unit.INSTANCE;
        }
        TTBaseLandingPageActivity.IAuthTabCallback iAuthTabCallback = TTBaseLandingPageActivity.Companion;
        byte[] encoded = keyPairGenerateKeyPair.getPublic().getEncoded();
        Intrinsics.checkNotNullExpressionValue(encoded, "");
        return TTBaseLandingPageActivity.IAuthTabCallback.onExtraCallback(iAuthTabCallback, encoded, 0, 0, 3, (Object) null).IAuthTabCallback();
    }

    public final getCrls onExtraCallback(@NotNull String str, @NotNull String str2) throws Throwable {
        byte[] bArrAccess000;
        byte[] bArrAccess0002;
        byte[] bArr;
        Pair pairIAuthTabCallback;
        byte[] bArrOnWarmupCompleted;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (str.length() == 0 || str2.length() == 0) {
            Object[] objArr = new Object[1];
            a((short) View.MeasureSpec.getSize(0), (byte) ((-31) - View.combineMeasuredStates(0, 0)), (-1363484224) - Color.blue(0), (-961552881) - ((byte) KeyEvent.getModifierMetaStateMask()), (Process.myPid() >> 22) - 58, objArr);
            return new getCrls.onExtraCallbackWithResult(((String) objArr[0]).intern());
        }
        TTBaseLandingPageActivity.IAuthTabCallback iAuthTabCallback = TTBaseLandingPageActivity.Companion;
        TTBaseLandingPageActivity tTBaseLandingPageActivityOnExtraCallback = iAuthTabCallback.onExtraCallback(str);
        if (tTBaseLandingPageActivityOnExtraCallback == null || (bArrAccess000 = tTBaseLandingPageActivityOnExtraCallback.access000()) == null) {
            Object[] objArr2 = new Object[1];
            a((short) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (byte) ((-32) - TextUtils.indexOf((CharSequence) "", '0')), (-1363484223) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (-961552881) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), Color.argb(0, 0, 0, 0) - 58, objArr2);
            return new getCrls.onExtraCallbackWithResult(((String) objArr2[0]).intern());
        }
        TTBaseLandingPageActivity tTBaseLandingPageActivityOnExtraCallback2 = iAuthTabCallback.onExtraCallback(str2);
        if (tTBaseLandingPageActivityOnExtraCallback2 == null || (bArrAccess0002 = tTBaseLandingPageActivityOnExtraCallback2.access000()) == null) {
            Object[] objArr3 = new Object[1];
            a((short) View.MeasureSpec.getMode(0), (byte) ((ViewConfiguration.getScrollBarSize() >> 8) - 31), (-1363484224) - TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 961552881, (-58) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr3);
            return new getCrls.onExtraCallbackWithResult(((String) objArr3[0]).intern());
        }
        if (bArrAccess0002.length != 12) {
            Object[] objArr4 = new Object[1];
            a((short) (ViewConfiguration.getDoubleTapTimeout() >> 16), (byte) (TextUtils.lastIndexOf("", '0') - 30), (-1363484223) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (-961552880) - View.resolveSizeAndState(0, 0, 0), ((Process.getThreadPriority(0) + 20) >> 6) - 58, objArr4);
            return new getCrls.onExtraCallbackWithResult(((String) objArr4[0]).intern());
        }
        synchronized (onNavigationEvent) {
            BaseRoundCornerProgressBar1 baseRoundCornerProgressBar1 = onWarmupCompleted;
            KeyPair keyPair = onExtraCallback;
            bArr = null;
            pairIAuthTabCallback = getWrite.IAuthTabCallback(baseRoundCornerProgressBar1, keyPair != null ? keyPair.getPrivate() : null);
        }
        setMax setmax = (setMax) pairIAuthTabCallback.onExtraCallbackWithResult();
        PrivateKey privateKey = (PrivateKey) pairIAuthTabCallback.IAuthTabCallback();
        if (setmax == null) {
            return new getCrls.onExtraCallbackWithResult("RRN_NOT_READY");
        }
        if (privateKey == null) {
            return new getCrls.onExtraCallbackWithResult("KEY_NOT_READY");
        }
        byte[] bytes = setmax.toString().getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        if (bytes.length == 0) {
            ArraysKt.fill$default(bytes, (byte) 0, 0, 0, 6, (Object) null);
            return new getCrls.onExtraCallbackWithResult("RRN_NOT_READY");
        }
        try {
            bArrOnWarmupCompleted = onWarmupCompleted(privateKey, bArrAccess000);
        } catch (Throwable unused) {
        }
        try {
            getCrls.onNavigationEvent onnavigationevent = new getCrls.onNavigationEvent(TTBaseLandingPageActivity.IAuthTabCallback.onExtraCallback(iAuthTabCallback, setProgressColor.onNavigationEvent.onWarmupCompleted(setProgressColor.Companion, bArrOnWarmupCompleted, new GCMParameterSpec(128, bArrAccess0002), (byte[]) null, 4, (Object) null).a_(bytes), 0, 0, 3, (Object) null).IAuthTabCallback());
            ArraysKt.fill$default(bytes, (byte) 0, 0, 0, 6, (Object) null);
            if (bArrOnWarmupCompleted != null) {
                ArraysKt.fill$default(bArrOnWarmupCompleted, (byte) 0, 0, 0, 6, (Object) null);
            }
            return onnavigationevent;
        } catch (Throwable unused2) {
            bArr = bArrOnWarmupCompleted;
            try {
                Object[] objArr5 = new Object[1];
                a((short) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) + 54), Color.alpha(0) - 1363484209, (-961552885) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (-59) - TextUtils.lastIndexOf("", '0', 0, 0), objArr5);
                return new getCrls.onExtraCallbackWithResult(((String) objArr5[0]).intern());
            } finally {
                ArraysKt.fill$default(bytes, (byte) 0, 0, 0, 6, (Object) null);
                if (bArr != null) {
                    ArraysKt.fill$default(bArr, (byte) 0, 0, 0, 6, (Object) null);
                }
            }
        }
    }

    public final void onWarmupCompleted() {
        synchronized (onNavigationEvent) {
            BaseRoundCornerProgressBar1 baseRoundCornerProgressBar1 = onWarmupCompleted;
            if (baseRoundCornerProgressBar1 != null) {
                baseRoundCornerProgressBar1.destroy();
            }
            onWarmupCompleted = null;
            onExtraCallback = null;
            Unit unit = Unit.INSTANCE;
        }
    }

    private final byte[] onWarmupCompleted(PrivateKey privateKey, byte[] bArr) throws Throwable {
        int i = 2 % 2;
        Object[] objArr = new Object[1];
        a((short) (TextUtils.lastIndexOf("", '0', 0) + 1), (byte) ((-20) - (ViewConfiguration.getPressedStateDuration() >> 16)), (-1363484243) - TextUtils.indexOf("", "", 0), (-961552871) - TextUtils.indexOf("", "", 0, 0), (-58) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr);
        Cipher cipher = Cipher.getInstance(((String) objArr[0]).intern());
        cipher.init(2, privateKey, new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT));
        byte[] bArrDoFinal = cipher.doFinal(bArr);
        Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "");
        int i2 = IAuthTabCallbackStubProxy + 59;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return bArrDoFinal;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x022c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r25, byte r26, int r27, int r28, int r29, java.lang.Object[] r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.SignedDataParser.a(short, byte, int, int, int, java.lang.Object[]):void");
    }

    static void onExtraCallback() {
        IAuthTabCallbackDefault = -184367525;
        asInterface = -1538795471;
        asBinder = -1659373007;
        IAuthTabCallbackStub = new byte[]{-46, 29, -31, -31, -28, -25, -11, -28, -17, -32, 22, -60, 9, 27, 26, -14, 10, 10, -27, -34, -24, -25, 25, -19, -27, 26, 26, -14, 18, 20, -30, 2, -31, -20, -37, 62, -64, 61, 48, -37, 45, -58, 57, -54, 58, 50, -62, -60, 43};
    }
}
