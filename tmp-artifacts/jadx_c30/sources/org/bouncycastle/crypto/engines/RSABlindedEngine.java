package org.bouncycastle.crypto.engines;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.SecureRandom;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class RSABlindedEngine implements AsymmetricBlockCipher {
    private static short[] IAuthTabCallback;
    private static int IAuthTabCallbackDefault;
    private static final BigInteger ONE;
    private static byte[] onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private RSACoreEngine core = new RSACoreEngine();
    private RSAKeyParameters key;
    private SecureRandom random;
    private static final byte[] $$a = {35, -27, ISOFileInfo.DATA_BYTES1, ISO7816.INS_INCREASE};
    private static final int $$b = 179;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 0;
    private static int asBinder = 1;
    private static int onTransact = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, int i2) {
        int i3;
        int i4 = i * 3;
        int i5 = i2 + 4;
        byte[] bArr = $$a;
        int i6 = 115 - (b * 4);
        byte[] bArr2 = new byte[1 - i4];
        int i7 = 0 - i4;
        if (bArr == null) {
            int i8 = i7;
            i3 = 0;
            i6 += -i8;
            bArr2[i3] = (byte) i6;
            if (i3 == i7) {
                return new String(bArr2, 0);
            }
            i3++;
            i5++;
            i8 = bArr[i5];
            i6 += -i8;
            bArr2[i3] = (byte) i6;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i6;
            if (i3 == i7) {
            }
        }
    }

    static {
        IAuthTabCallbackDefault = 0;
        onExtraCallback();
        ONE = BigInteger.valueOf(1L);
        int i = onTransact + 53;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        int i = 2 % 2;
        int i2 = asBinder + 99;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int inputBlockSize = this.core.getInputBlockSize();
        int i4 = asBinder + 59;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 98 / 0;
        }
        return inputBlockSize;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        int i = 2 % 2;
        int i2 = asInterface + 45;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int outputBlockSize = this.core.getOutputBlockSize();
        int i4 = asInterface + 15;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return outputBlockSize;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        SecureRandom secureRandom;
        int i = 2 % 2;
        this.core.init(z, cipherParameters);
        Object obj = null;
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            RSAKeyParameters parameters = parametersWithRandom.getParameters();
            this.key = parameters;
            if (!(parameters instanceof RSAPrivateCrtKeyParameters)) {
                this.random = null;
                return;
            }
            int i2 = asBinder + 23;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                parametersWithRandom.getRandom();
                obj.hashCode();
                throw null;
            }
            secureRandom = parametersWithRandom.getRandom();
        } else {
            RSAKeyParameters rSAKeyParameters = (RSAKeyParameters) cipherParameters;
            this.key = rSAKeyParameters;
            if (!(rSAKeyParameters instanceof RSAPrivateCrtKeyParameters)) {
                this.random = null;
                return;
            }
            int i3 = asInterface + 25;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            secureRandom = CryptoServicesRegistrar.getSecureRandom();
            int i5 = asInterface + 105;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
        }
        this.random = secureRandom;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if ((r9 instanceof org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        r9 = (org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters) r9;
        r10 = r9.getPublicExponent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        if (r10 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        r11 = org.bouncycastle.crypto.engines.RSABlindedEngine.asBinder + 87;
        org.bouncycastle.crypto.engines.RSABlindedEngine.asInterface = r11 % 128;
        r11 = r11 % 2;
        r1 = r9.getModulus();
        r9 = org.bouncycastle.crypto.engines.RSABlindedEngine.ONE;
        r9 = org.bouncycastle.util.BigIntegers.createRandomInRange(r9, r1.subtract(r9), r15.random);
        r9 = r15.core.processBlock(r9.modPow(r10, r1).multiply(r2).mod(r1)).multiply(org.bouncycastle.util.BigIntegers.modOddInverse(r1, r9)).mod(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007d, code lost:
    
        if (r2.equals(r9.modPow(r10, r1)) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0080, code lost:
    
        r2 = new java.lang.Object[1];
        a((short) (android.text.TextUtils.indexOf(net.sf.scuba.smartcards.BuildConfig.FLAVOR, net.sf.scuba.smartcards.BuildConfig.FLAVOR) - 41), (byte) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), android.view.KeyEvent.getDeadChar(0, 0) - 538653955, android.text.TextUtils.indexOf((java.lang.CharSequence) net.sf.scuba.smartcards.BuildConfig.FLAVOR, '0') - 59108158, (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)) - 94, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00bc, code lost:
    
        throw new java.lang.IllegalStateException(((java.lang.String) r2[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00bd, code lost:
    
        r9 = r15.core.processBlock(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c9, code lost:
    
        return r15.core.convertOutput(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ca, code lost:
    
        r2 = new java.lang.Object[1];
        a((short) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) - 22), (byte) android.text.TextUtils.indexOf(net.sf.scuba.smartcards.BuildConfig.FLAVOR, net.sf.scuba.smartcards.BuildConfig.FLAVOR), (-538653909) - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)), android.view.MotionEvent.axisFromString(net.sf.scuba.smartcards.BuildConfig.FLAVOR) - 59108158, android.widget.ExpandableListView.getPackedPositionChild(0) - 92, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0101, code lost:
    
        throw new java.lang.IllegalStateException(((java.lang.String) r2[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        if (r15.key != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r15.key != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        r2 = r15.core.convertInput(r16, r17, r18);
        r9 = r15.key;
     */
    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] processBlock(byte[] bArr, int i, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = asInterface + 93;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 65 / 0;
        }
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4;
        int i5;
        boolean z2;
        int i6 = 2;
        int i7 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - Color.blue(0)), 42 - TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0), 22438 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0'), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i8 = $11 + 99;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                byte[] bArr = onExtraCallback;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i10 = 0;
                    while (i10 < length) {
                        int i11 = $10 + 95;
                        $11 = i11 % 128;
                        if (i11 % i6 == 0) {
                            try {
                                Object[] objArr3 = {Integer.valueOf(bArr[i10])};
                                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                                if (objOnExtraCallback2 == null) {
                                    byte b2 = (byte) 0;
                                    byte b3 = b2;
                                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 55, 2167 - Color.blue(0), -299036574, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                                }
                                bArr2[i10] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr[i10])};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback3 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 55 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2167, -299036574, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE});
                            }
                            bArr2[i10] = ((Byte) ((Method) objOnExtraCallback3).invoke(null, objArr4)).byteValue();
                            i10++;
                        }
                        i6 = 2;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i12 = $10 + 37;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    byte[] bArr3 = onExtraCallback;
                    Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - View.combineMeasuredStates(0, 0)), 42 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (IAuthTabCallback[i + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i14 = ((i + iIntValue) - 2) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)));
                if (z) {
                    int i15 = $11 + 79;
                    $10 = i15 % 128;
                    int i16 = i15 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i14 + i4;
                Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onWarmupCompleted), sb};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), 86 - (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 9566, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onExtraCallback;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i17 = 0; i17 < length2; i17++) {
                        bArr5[i17] = (byte) (bArr4[i17] ^ (-4629411779493505016L));
                    }
                    int i18 = $10 + 65;
                    $11 = i18 % 128;
                    i5 = 2;
                    int i19 = i18 % 2;
                    bArr4 = bArr5;
                } else {
                    i5 = 2;
                }
                if (bArr4 != null) {
                    int i20 = $10 + 83;
                    $11 = i20 % 128;
                    int i21 = i20 % i5;
                    z2 = true;
                } else {
                    z2 = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    int i22 = $10 + 61;
                    $11 = i22 % 128;
                    if (i22 % 2 == 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (z2) {
                        byte[] bArr6 = onExtraCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = IAuthTabCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
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

    static void onExtraCallback() {
        onExtraCallbackWithResult = -2074284789;
        onNavigationEvent = -1538795436;
        onWarmupCompleted = -1480445031;
        onExtraCallback = new byte[]{-39, ISO7816.INS_VERIFY, 18, ISO7816.INS_INCREASE, 47, 18, ISO7816.INS_DECREASE, ISO7816.INS_MSE, 101, -22, ISO7816.INS_PSO, 38, ISO7816.INS_UNBLOCK_CHV, 56, 47, 23, 101, ISO7816.INS_APPEND_RECORD, ISO7816.INS_VERIFY, 39, 22, 37, 40, 56, ISO7816.INS_DECREASE, 47, ISO7816.INS_MSE, 101, ISO7816.INS_LOAD_KEY_FILE, 38, 57, 40, 53, ISO7816.INS_UNBLOCK_CHV, 103, -20, 40, 38, 35, ISO7816.INS_PSO, 58, 102, 0, 31, ISO7816.INS_MSE, ISO7816.INS_READ_RECORD_STAMPED, 29, 0, 40, 27, 41, 6, 3, 41, 25, 19, 87, ISO7816.INS_GET_DATA, 19, 31, 108, -39, 5, 19, ISO7816.CLA_COMMAND_CHAINING, 7, 23, 83, -3, 12, 31};
    }
}
