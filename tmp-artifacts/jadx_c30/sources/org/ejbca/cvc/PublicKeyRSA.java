package org.ejbca.cvc;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.interfaces.RSAPublicKey;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISOFileInfo;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.ejbca.cvc.exception.ConstructionException;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class PublicKeyRSA extends CVCPublicKey implements RSAPublicKey {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    private static CVCTagEnum[] allowedFields = null;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static int onExtraCallback = 0;
    private static boolean onExtraCallbackWithResult = false;
    private static boolean onNavigationEvent = false;
    private static char[] onWarmupCompleted = null;
    private static final long serialVersionUID = 1;

    static {
        onExtraCallback();
        allowedFields = new CVCTagEnum[]{CVCTagEnum.OID, CVCTagEnum.MODULUS, CVCTagEnum.EXPONENT};
        int i = onExtraCallback + 67;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // org.ejbca.cvc.AbstractSequence
    protected CVCTagEnum[] getAllowedFields() {
        int i = 2 % 2;
        int i2 = asInterface + 75;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return allowedFields;
        }
        throw null;
    }

    PublicKeyRSA(GenericPublicKeyField genericPublicKeyField) throws ConstructionException, NoSuchFieldException {
        ByteField byteField = (ByteField) genericPublicKeyField.getSubfield(CVCTagEnum.MODULUS);
        byteField.setShowBitLength(true);
        addSubfield(genericPublicKeyField.getSubfield(CVCTagEnum.OID));
        addSubfield(byteField);
        addSubfield(genericPublicKeyField.getSubfield(CVCTagEnum.EXPONENT));
    }

    PublicKeyRSA(OIDField oIDField, RSAPublicKey rSAPublicKey) throws ConstructionException {
        addSubfield(oIDField);
        addSubfield(new ByteField(CVCTagEnum.MODULUS, CVCObject.trimByteArray(rSAPublicKey.getModulus().toByteArray()), true));
        addSubfield(new ByteField(CVCTagEnum.EXPONENT, CVCObject.trimByteArray(rSAPublicKey.getPublicExponent().toByteArray())));
    }

    @Override // java.security.Key
    public String getAlgorithm() throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = asBinder + 93;
        asInterface = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{ISOFileInfo.FILE_IDENTIFIER, -126, ISOFileInfo.DATA_BYTES2}, Color.alpha(1) + 57, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(null, null, new byte[]{ISOFileInfo.FILE_IDENTIFIER, -126, ISOFileInfo.DATA_BYTES2}, Color.alpha(0) + CertificateBody.profileType, objArr2);
            obj = objArr2[0];
        }
        String strIntern = ((String) obj).intern();
        int i3 = asInterface + 91;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            return strIntern;
        }
        obj2.hashCode();
        throw null;
    }

    @Override // java.security.Key
    public String getFormat() {
        int i = 2 % 2;
        int i2 = asInterface + 109;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return "CVC";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.security.interfaces.RSAPublicKey
    public BigInteger getPublicExponent() {
        int i = 2 % 2;
        try {
            BigInteger bigInteger = new BigInteger(1, ((ByteField) getSubfield(CVCTagEnum.EXPONENT)).getData());
            int i2 = asBinder + 61;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                return bigInteger;
            }
            throw null;
        } catch (NoSuchFieldException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.security.interfaces.RSAKey
    public BigInteger getModulus() {
        int i = 2 % 2;
        try {
            BigInteger bigInteger = new BigInteger(1, ((ByteField) getSubfield(CVCTagEnum.MODULUS)).getData());
            int i2 = asBinder + 111;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return bigInteger;
        } catch (NoSuchFieldException e) {
            throw new IllegalStateException(e);
        }
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onWarmupCompleted;
        long j = 0;
        if (cArr2 != null) {
            int i3 = $10;
            int i4 = i3 + 57;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = i3 + 89;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 77, 20953 - (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i8++;
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
        try {
            Object[] objArr3 = {Integer.valueOf(IAuthTabCallback)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 75, 16038 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            int i9 = 1052772399;
            if (onNavigationEvent) {
                int i10 = $10 + 51;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 62 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 12214 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
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
            int i12 = $11 + 79;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i9);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 62, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                i9 = 1052772399;
            }
            objArr[0] = new String(cArr6);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static void onExtraCallback() {
        onWarmupCompleted = new char[]{32549, 32548, 32566};
        IAuthTabCallback = -1184333833;
        onExtraCallbackWithResult = true;
        onNavigationEvent = true;
    }
}
