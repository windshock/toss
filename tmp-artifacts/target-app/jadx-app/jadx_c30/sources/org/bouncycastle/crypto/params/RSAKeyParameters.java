package org.bouncycastle.crypto.params;

import android.graphics.Color;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.math.BigInteger;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import org.bouncycastle.util.Properties;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class RSAKeyParameters extends AsymmetricKeyParameter {
    private static long IAuthTabCallback;
    private static final BigInteger ONE;
    private static final BigInteger SMALL_PRIMES_PRODUCT;
    private static int onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static int onWarmupCompleted;
    private BigInteger exponent;
    private BigInteger modulus;
    private static final byte[] $$a = {106, 40, -98, ISOFileInfo.SECURITY_ATTR_EXP};
    private static final int $$b = 198;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, byte b) {
        int i;
        byte[] bArr = $$a;
        int i2 = s2 * 2;
        int i3 = s + 109;
        int i4 = b + 4;
        byte[] bArr2 = new byte[i2 + 1];
        if (bArr == null) {
            i3 = i2;
            int i5 = i4;
            int i6 = 0;
            i3 += -i4;
            i4 = i5;
            i = i6;
            int i7 = i4 + 1;
            bArr2[i] = (byte) i3;
            if (i == i2) {
                return new String(bArr2, 0);
            }
            int i8 = i + 1;
            i5 = i7;
            i4 = bArr[i7];
            i6 = i8;
            i3 += -i4;
            i4 = i5;
            i = i6;
            int i72 = i4 + 1;
            bArr2[i] = (byte) i3;
            if (i == i2) {
            }
        } else {
            i = 0;
            int i722 = i4 + 1;
            bArr2[i] = (byte) i3;
            if (i == i2) {
            }
        }
    }

    static {
        onWarmupCompleted = 0;
        onExtraCallback();
        SMALL_PRIMES_PRODUCT = new BigInteger("8138e8a0fcf3a4e84a771d40fd305d7f4aa59306d7251de54d98af8fe95729a1f73d893fa424cd2edc8636a6c3285e022b0e3866a565ae8108eed8591cd4fe8d2ce86165a978d719ebf647f362d33fca29cd179fb42401cbaf3df0c614056f9c8f3cfd51e474afb6bc6974f78db8aba8e9e517fded658591ab7502bd41849462f", 16);
        ONE = BigInteger.valueOf(1L);
        int i = onExtraCallback + 11;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public RSAKeyParameters(boolean z, BigInteger bigInteger, BigInteger bigInteger2) throws Throwable {
        super(z);
        if (!z && (bigInteger2.intValue() & 1) == 0) {
            Object[] objArr = new Object[1];
            a((char) (13905 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), Color.blue(0), new char[]{38581, 42689, 51986, 7445, 47979, 35549, 58080, 43862, 1380, 32344, 59432, 18271, 2075, 51382, 40012, 29653, 16158, 38830, 43878, 56841, 22806, 13776, 32314, 40311, 32592, 38415}, new char[]{46722, 9812, 4162, 58654}, new char[]{46556, 57056, 20872, 20790}, objArr);
            throw new IllegalArgumentException(((String) objArr[0]).intern());
        }
        this.modulus = validate(bigInteger);
        this.exponent = bigInteger2;
        int i = IAuthTabCallbackDefault + 13;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private BigInteger validate(BigInteger bigInteger) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 23;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if ((bigInteger.intValue() & 1) == 0) {
            Object[] objArr = new Object[1];
            a((char) (9896 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 791497147, new char[]{24636, 20749, 65363, 12658, 51247, 34571, 34313, 5238, 11044, 65520, 39465, 9058, 1235, 5128, 39194, 5771, 61834, 43067, 64176}, new char[]{46722, 9812, 4162, 58654}, new char[]{47972, 11593, 43055, 21286}, objArr);
            throw new IllegalArgumentException(((String) objArr[0]).intern());
        }
        int i4 = asBinder + 13;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 73 / 0;
            if (!Properties.isOverrideSet("org.bouncycastle.rsa.allow_unsafe_mod")) {
                int i6 = asBinder + 67;
                IAuthTabCallbackDefault = i6 % 128;
                int i7 = i6 % 2;
                if (!bigInteger.gcd(SMALL_PRIMES_PRODUCT).equals(ONE)) {
                    Object[] objArr2 = new Object[1];
                    a((char) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0), View.MeasureSpec.getSize(0), new char[]{32505, 49153, 19889, 32998, 43048, 29660, 3014, 48383, 53017, 52095, 50965, 65459, 2551, 33236, 11042, 29241, 16815, 60508, 8579, 52102, 32539, 33824, 56169, 34978, 56655, 469, 43706, 22370, 33742, 35512, 34916, 61512, 26470, 45640, 17679, 44417}, new char[]{46722, 9812, 4162, 58654}, new char[]{40753, 54531, 12350, 20027}, objArr2);
                    throw new IllegalArgumentException(((String) objArr2[0]).intern());
                }
            }
        } else if (!Properties.isOverrideSet("org.bouncycastle.rsa.allow_unsafe_mod")) {
        }
        int i8 = asBinder + 93;
        IAuthTabCallbackDefault = i8 % 128;
        if (i8 % 2 != 0) {
            return bigInteger;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public BigInteger getExponent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 89;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        BigInteger bigInteger = this.exponent;
        int i5 = i2 + 33;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return bigInteger;
        }
        throw null;
    }

    public BigInteger getModulus() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 51;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return this.modulus;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
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
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i5 = $10 + 11;
            $11 = i5 % 128;
            int i6 = i5 % i3;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 1;
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), ((byte) KeyEvent.getModifierMetaStateMask()) + ISO7816.INS_UNBLOCK_CHV, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1451, 228868077, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Gravity.getAbsoluteGravity(0, 0) + 49123), TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0) + 45, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1494, 1533236389, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString(BuildConfig.FLAVOR) + 23973), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 49, 22938 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                    if (objOnExtraCallback4 == null) {
                        i2 = 2;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 45848), 29 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 12577 - View.combineMeasuredStates(0, 0), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                    } else {
                        i2 = 2;
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                    cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (IAuthTabCallback ^ 7798559133331975163L)) ^ ((int) (onExtraCallbackWithResult ^ 7798559133331975163L))) ^ ((char) (onNavigationEvent ^ 7798559133331975163L)));
                    trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                    int i7 = $11 + 75;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    i3 = i2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr6);
    }

    static void onExtraCallback() {
        IAuthTabCallback = -8564689303849542279L;
        onExtraCallbackWithResult = -1776194565;
        onNavigationEvent = (char) 27643;
    }
}
