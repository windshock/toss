package o;

import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class recycleViewsFromEnd implements resolveShouldLayoutReverse {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallback Companion;
    private static char[] IAuthTabCallbackStub = null;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access000 = 0;
    private static int getInterfaceDescriptor = 1;
    private static final String onExtraCallbackWithResult;
    private static char onTransact;
    private final Cipher IAuthTabCallback;
    private final IvParameterSpec IAuthTabCallbackDefault;
    private final String asBinder;
    private final byte[] asInterface;
    private final Charset onExtraCallback;
    private final Cipher onNavigationEvent;
    private final String onWarmupCompleted;

    static {
        onNavigationEvent();
        Object[] objArr = new Object[1];
        a(new char[]{2, 1, 13850}, (byte) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 81), 3 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr);
        onExtraCallbackWithResult = ((String) objArr[0]).intern();
        Companion = new onExtraCallback(null);
        int i2 = IAuthTabCallback_Parcel + 1;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public recycleViewsFromEnd() {
        logChildren logchildren = null;
        this(logchildren, 1, logchildren);
    }

    public recycleViewsFromEnd(@NotNull logChildren logchildren) throws Throwable {
        Intrinsics.checkNotNullParameter(logchildren, "");
        String strOnWarmupCompleted = onWarmupCompleted("My0oeSI1IzInbyA+LVFaW2wiNSokPAMiMipOLS4=");
        this.asBinder = strOnWarmupCompleted;
        String strOnWarmupCompleted2 = onWarmupCompleted("Iio+ASgjKE4/ZSIjXDMOCUoCDww=");
        this.onWarmupCompleted = strOnWarmupCompleted2;
        this.onExtraCallback = Charsets.UTF_8;
        byte[] bArr = {112, 78, 75, 55, -54, -30, -10, 44, 102, -126, -126, 92, -116, -48, -123, -55};
        this.asInterface = bArr;
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
        this.IAuthTabCallbackDefault = ivParameterSpec;
        String strIAuthTabCallbackStub = logchildren.IAuthTabCallbackStub();
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(strOnWarmupCompleted);
        String strSubstring = strIAuthTabCallbackStub.substring(0, Math.min(strIAuthTabCallbackStub.length(), 16));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        char[] charArray = strSubstring.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "");
        SecretKey secretKeyGenerateSecret = secretKeyFactory.generateSecret(new PBEKeySpec(charArray, logchildren.asBinder(), 2, 256));
        byte[] encoded = secretKeyGenerateSecret.getEncoded();
        Object[] objArr = new Object[1];
        a(new char[]{2, 1, 13850}, (byte) (81 - TextUtils.indexOf("", "", 0, 0)), 2 - ImageFormat.getBitsPerPixel(0), objArr);
        SecretKeySpec secretKeySpec = new SecretKeySpec(encoded, ((String) objArr[0]).intern());
        Cipher cipher = Cipher.getInstance(strOnWarmupCompleted2);
        Intrinsics.checkNotNullExpressionValue(cipher, "");
        this.IAuthTabCallback = cipher;
        Cipher cipher2 = Cipher.getInstance(strOnWarmupCompleted2);
        Intrinsics.checkNotNullExpressionValue(cipher2, "");
        this.onNavigationEvent = cipher2;
        try {
            cipher.init(1, secretKeySpec, ivParameterSpec);
            cipher2.init(2, secretKeySpec, ivParameterSpec);
        } catch (InvalidKeyException unused) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(secretKeyGenerateSecret.getEncoded(), 0, secretKeyGenerateSecret.getEncoded().length / 2);
            Object[] objArr2 = new Object[1];
            a(new char[]{2, 1, 13850}, (byte) (81 - View.MeasureSpec.makeMeasureSpec(0, 0)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 2, objArr2);
            SecretKeySpec secretKeySpec2 = new SecretKeySpec(bArrCopyOfRange, ((String) objArr2[0]).intern());
            this.IAuthTabCallback.init(1, secretKeySpec2, this.IAuthTabCallbackDefault);
            this.onNavigationEvent.init(2, secretKeySpec2, this.IAuthTabCallbackDefault);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ recycleViewsFromEnd(logChildren logchildren, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            int i3 = getInterfaceDescriptor + 97;
            access000 = i3 % 128;
            int i4 = i3 % 2;
            logchildren = fixLayoutStartGap.onNavigationEvent.onExtraCallbackWithResult();
            int i5 = getInterfaceDescriptor + 17;
            access000 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        }
        this(logchildren);
    }

    @Override // o.resolveShouldLayoutReverse
    public String onNavigationEvent(@NotNull String str) {
        String strEncodeToString;
        int i2 = 2 % 2;
        int i3 = access000 + 33;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Cipher cipher = this.IAuthTabCallback;
            byte[] bytes = str.getBytes(this.onExtraCallback);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            strEncodeToString = Base64.encodeToString(cipher.doFinal(bytes), 2);
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            Cipher cipher2 = this.IAuthTabCallback;
            byte[] bytes2 = str.getBytes(this.onExtraCallback);
            Intrinsics.checkNotNullExpressionValue(bytes2, "");
            strEncodeToString = Base64.encodeToString(cipher2.doFinal(bytes2), 2);
        }
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
        int i4 = access000 + 73;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return strEncodeToString;
    }

    @Override // o.resolveShouldLayoutReverse
    public String IAuthTabCallback(@NotNull String str) throws BadPaddingException, IllegalBlockSizeException {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        byte[] bArrDoFinal = this.onNavigationEvent.doFinal(Base64.decode(str, 2));
        Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "");
        String str2 = new String(bArrDoFinal, this.onExtraCallback);
        int i3 = getInterfaceDescriptor + 99;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        return str2;
    }

    private final String onExtraCallback(String str) {
        int i2 = 2 % 2;
        int i3 = access000 + 9;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        String strOnNavigationEvent = onNavigationEvent(str, "com.kakao.api");
        int i5 = getInterfaceDescriptor + 97;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return strOnNavigationEvent;
    }

    private final String onNavigationEvent(String str, String str2) {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor;
        int i4 = i3 + 55;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        if (str != null) {
            int i6 = i3 + 27;
            access000 = i6 % 128;
            int i7 = i6 % 2;
            if (str2 != null) {
                try {
                    char[] charArray = str2.toCharArray();
                    Intrinsics.checkNotNullExpressionValue(charArray, "");
                    char[] charArray2 = str.toCharArray();
                    Intrinsics.checkNotNullExpressionValue(charArray2, "");
                    int length = charArray2.length;
                    int length2 = charArray.length;
                    char[] cArr = new char[length];
                    int i8 = 0;
                    while (i8 < length) {
                        int i9 = getInterfaceDescriptor + 19;
                        access000 = i9 % 128;
                        if (i9 % 2 != 0) {
                            cArr[i8] = (char) (charArray2[i8] ^ charArray[i8 + length2]);
                            i8 += 7;
                        } else {
                            cArr[i8] = (char) (charArray2[i8] ^ charArray[i8 % length2]);
                            i8++;
                        }
                    }
                    return new String(cArr);
                } catch (Exception unused) {
                }
            }
        }
        int i10 = getInterfaceDescriptor + 21;
        access000 = i10 % 128;
        Object obj = null;
        if (i10 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private final String onWarmupCompleted(String str) {
        int i2 = 2 % 2;
        byte[] bArrDecode = Base64.decode(str, 0);
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "");
        String strOnExtraCallback = onExtraCallback(new String(bArrDecode, Charsets.UTF_8));
        int i3 = access000 + 105;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return strOnExtraCallback;
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(char[] cArr, byte b, int i2, Object[] objArr) throws Throwable {
        int i3;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = IAuthTabCallbackStub;
        if (cArr2 != null) {
            int i5 = $11 + 51;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i7 = 0; i7 < length; i7++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 26, 23138 - TextUtils.indexOf((CharSequence) "", '0', 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
        Object[] objArr3 = {Integer.valueOf(onTransact)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        long j = 0;
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 1), AndroidCharacter.getMirror('0') - 22, 23139 - (KeyEvent.getMaxKeyCode() >> 16), -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i2];
        if (i2 % 2 != 0) {
            int i8 = $10 + 37;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                i3 = i2 + 67;
                cArr4[i3] = (char) (cArr[i3] / b);
            } else {
                i3 = i2 - 1;
                cArr4[i3] = (char) (cArr[i3] - b);
            }
        } else {
            i3 = i2;
        }
        if (i3 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i9 = $10 + 37;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent % 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        int i10 = $10 + 113;
                        $11 = i10 % 128;
                        int i11 = i10 % 2;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    } else {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24872 - AndroidCharacter.getMirror('0')), (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)) + 74, 8087 - TextUtils.lastIndexOf("", '0'), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), 30 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 19487 - MotionEvent.axisFromString(""), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i12];
                        } else if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i13 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i13];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i14];
                        } else {
                            int i15 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i16 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i15];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i16];
                        }
                    }
                } else {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                j = 0;
            }
        }
        for (int i17 = 0; i17 < i2; i17++) {
            cArr4[i17] = (char) (cArr4[i17] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static void onNavigationEvent() {
        IAuthTabCallbackStub = new char[]{65014, 64992, 64969, 65010};
        onTransact = (char) 51243;
    }
}
