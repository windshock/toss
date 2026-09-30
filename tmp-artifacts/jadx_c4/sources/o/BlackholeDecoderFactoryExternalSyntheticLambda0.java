package o;

import android.graphics.Color;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyInfo;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.ads.zzgc;
import im.toss.rn.appsintoss.api.model.contacts_common.PushInfo;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.Key;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.spec.KeySpec;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class BlackholeDecoderFactoryExternalSyntheticLambda0 {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallback Companion;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int asBinder = 1;
    private static int asInterface;
    private static final String onExtraCallback;
    private static char[] onExtraCallbackWithResult;
    private static volatile BlackholeDecoderFactoryExternalSyntheticLambda0 onWarmupCompleted;
    private final KeyStore onNavigationEvent;

    static {
        onExtraCallback();
        Object[] objArr = new Object[1];
        a(new int[]{0, 20, 0, 11}, false, new byte[]{1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 1}, objArr);
        onExtraCallback = ((String) objArr[0]).intern();
        Companion = new onExtraCallback(null);
        int i = IAuthTabCallback + 49;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ BlackholeDecoderFactoryExternalSyntheticLambda0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ Object onExtraCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~((~i2) | i4);
        int i8 = ~((~i) | i4);
        int i9 = i7 | i8;
        int i10 = i8 | (~((~i4) | i2)) | i7;
        int i11 = i4 + i2 + i3 + ((-1814252664) * i6) + (2073254503 * i5);
        int i12 = i11 * i11;
        int i13 = ((-223937157) * i4) + 1943797760 + (1745420935 * i2) + (i9 * 1162804602) + (1162804602 * i7) + ((-1162804602) * i10) + ((-1386741760) * i3) + ((-1631584256) * i6) + ((-1368915968) * i5) + ((-1053032448) * i12);
        int i14 = (i4 * (-1919122223)) + 1408767311 + (i2 * (-1919121035)) + (i9 * (-594)) + (i7 * (-594)) + (i10 * 594) + (i3 * (-1919121629)) + (i6 * (-390511720)) + (i5 * 1804971285) + (i12 * 255066112);
        return i13 + ((i14 * i14) * 379846656) != 1 ? onExtraCallback(objArr) : onNavigationEvent(objArr);
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final BlackholeDecoderFactoryExternalSyntheticLambda0 onExtraCallbackWithResult() {
            BlackholeDecoderFactoryExternalSyntheticLambda0 blackholeDecoderFactoryExternalSyntheticLambda0OnExtraCallbackWithResult;
            BlackholeDecoderFactoryExternalSyntheticLambda0 blackholeDecoderFactoryExternalSyntheticLambda0OnExtraCallbackWithResult2 = BlackholeDecoderFactoryExternalSyntheticLambda0.onExtraCallbackWithResult();
            if (blackholeDecoderFactoryExternalSyntheticLambda0OnExtraCallbackWithResult2 != null) {
                return blackholeDecoderFactoryExternalSyntheticLambda0OnExtraCallbackWithResult2;
            }
            synchronized (this) {
                blackholeDecoderFactoryExternalSyntheticLambda0OnExtraCallbackWithResult = BlackholeDecoderFactoryExternalSyntheticLambda0.onExtraCallbackWithResult();
                if (blackholeDecoderFactoryExternalSyntheticLambda0OnExtraCallbackWithResult == null) {
                    try {
                        blackholeDecoderFactoryExternalSyntheticLambda0OnExtraCallbackWithResult = new BlackholeDecoderFactoryExternalSyntheticLambda0(null);
                        onExtraCallback onextracallback = BlackholeDecoderFactoryExternalSyntheticLambda0.Companion;
                        BlackholeDecoderFactoryExternalSyntheticLambda0.IAuthTabCallback(blackholeDecoderFactoryExternalSyntheticLambda0OnExtraCallbackWithResult);
                    } catch (Throwable th) {
                        throw new SingletonImageLoadersKtExternalSyntheticLambda0("Failed to initialize TossKeyStoreCryptor : " + th.getCause());
                    }
                }
            }
            return blackholeDecoderFactoryExternalSyntheticLambda0OnExtraCallbackWithResult;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        if (r11.onNavigationEvent.containsAlias("toss-keystore") == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        r11.onNavigationEvent.deleteEntry("toss-keystore");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
    
        if (r11.onNavigationEvent.containsAlias("im.toss.keystore.cbc") == true) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        r2 = o.BlackholeDecoderFactoryExternalSyntheticLambda0.IAuthTabCallbackDefault + 89;
        o.BlackholeDecoderFactoryExternalSyntheticLambda0.asInterface = r2 % 128;
        r2 = r2 % 2;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ab, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private BlackholeDecoderFactoryExternalSyntheticLambda0() throws Throwable {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        Intrinsics.checkNotNullExpressionValue(keyStore, "");
        this.onNavigationEvent = keyStore;
        int i = 2 % 2;
        int i2 = 0;
        while (true) {
            Object obj = null;
            if (i2 >= 2) {
                try {
                    this.onNavigationEvent.load(null);
                    Unit unit = Unit.INSTANCE;
                    break;
                } catch (Throwable th) {
                    ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult("TossKeyStore", "Failed after 3 retries", th, access8100.onNavigationEvent(getWrite.IAuthTabCallback("retryTag", "TossKeyStoreCryptor_init_keystore_load")));
                    throw th;
                }
            }
            int i3 = asInterface + 87;
            IAuthTabCallbackDefault = i3 % 128;
            try {
                if (i3 % 2 == 0) {
                    this.onNavigationEvent.load(null);
                    obj.hashCode();
                    throw null;
                }
                this.onNavigationEvent.load(null);
            } catch (Exception unused) {
                i2++;
            }
        }
        for (int i4 = 0; i4 < 2; i4++) {
            try {
                asInterface();
                return;
            } catch (Exception unused2) {
            }
        }
        try {
            asInterface();
            Unit unit2 = Unit.INSTANCE;
            int i5 = asInterface + 75;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 72 / 0;
            }
        } catch (Throwable th2) {
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult("TossKeyStore", "Failed after 3 retries", th2, access8100.onNavigationEvent(getWrite.IAuthTabCallback("retryTag", "TossKeyStoreCryptor_createSecretKeyForCBC")));
            throw th2;
        }
    }

    public static final /* synthetic */ void IAuthTabCallback(BlackholeDecoderFactoryExternalSyntheticLambda0 blackholeDecoderFactoryExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 29;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted = blackholeDecoderFactoryExternalSyntheticLambda0;
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackDefault + 77;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ BlackholeDecoderFactoryExternalSyntheticLambda0 onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface + 33;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted;
        }
        throw null;
    }

    public final String onWarmupCompleted(@NotNull String str) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Key keyIAuthTabCallbackStub = IAuthTabCallbackStub();
            Object[] objArr = new Object[1];
            a(new int[]{0, 20, 0, 11}, false, new byte[]{1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 1}, objArr);
            Cipher cipher = Cipher.getInstance(((String) objArr[0]).intern());
            Intrinsics.checkNotNullExpressionValue(cipher, "");
            cipher.init(1, keyIAuthTabCallbackStub);
            byte[] iv = cipher.getIV();
            byte[] bArrDoFinal = cipher.doFinal(PageKey.onWarmupCompleted(str, null, 1, null));
            byteArrayOutputStream.write(ByteBuffer.allocate(4).putInt(iv.length).array());
            byteArrayOutputStream.write(iv);
            byteArrayOutputStream.write(ByteBuffer.allocate(4).putInt(bArrDoFinal.length).array());
            byteArrayOutputStream.write(bArrDoFinal);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "");
            String strOnExtraCallbackWithResult = Page.onExtraCallbackWithResult(byteArray, 0, 1, null);
            int i2 = asInterface + 119;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            return strOnExtraCallbackWithResult;
        } catch (Throwable th) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TossKeyStore", "[TossKeyStoreCryptor] Failed to encrypt data", th, (Map) null, 8, (Object) null);
            throw th;
        }
    }

    public final String onNavigationEvent(@NotNull String str) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Object obj = null;
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(Page.onNavigationEvent(str, 0, 1, null));
            Intrinsics.checkNotNull(byteBufferWrap);
            byte[] bArr = (byte[]) onExtraCallback(PushInfo.Companion.onExtraCallback(), new Object[]{this, byteBufferWrap}, 1485902904, PushInfo.Companion.onExtraCallback(), -1485902903, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback());
            byte[] bArrIAuthTabCallback = IAuthTabCallback(byteBufferWrap);
            Key keyIAuthTabCallbackStub = IAuthTabCallbackStub();
            Object[] objArr = new Object[1];
            a(new int[]{0, 20, 0, 11}, false, new byte[]{1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 1}, objArr);
            Cipher cipher = Cipher.getInstance(((String) objArr[0]).intern());
            Intrinsics.checkNotNullExpressionValue(cipher, "");
            cipher.init(2, keyIAuthTabCallbackStub, new IvParameterSpec(bArr));
            byte[] bArrDoFinal = cipher.doFinal(bArrIAuthTabCallback);
            Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "");
            String str2 = new String(bArrDoFinal, Charsets.UTF_8);
            int i2 = IAuthTabCallbackDefault + 95;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                return str2;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TossKeyStore", "[TossKeyStoreCryptor] Failed to decrypt data", th, (Map) null, 8, (Object) null);
            throw th;
        }
    }

    public final void onWarmupCompleted() throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 51;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult("toss-keystore");
        onExtraCallbackWithResult("im.toss.keystore.cbc");
        onExtraCallbackWithResult("im.toss.keystore.gcm");
        int i4 = IAuthTabCallbackDefault + 21;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onExtraCallbackWithResult(@NotNull String str) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 117;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            this.onNavigationEvent.deleteEntry(str);
            int i4 = IAuthTabCallbackDefault + 93;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TossKeyStore", "[TossKeyStoreCryptor] Failed to delete entry " + str, th, (Map) null, 8, (Object) null);
            throw th;
        }
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 53;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        boolean zAreEqual = Intrinsics.areEqual("testValue", onNavigationEvent(onWarmupCompleted("testValue")));
        int i4 = asInterface + 77;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return zAreEqual;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        KeyInfo keyInfo;
        Integer numValueOf;
        BlackholeDecoderFactoryExternalSyntheticLambda0 blackholeDecoderFactoryExternalSyntheticLambda0 = (BlackholeDecoderFactoryExternalSyntheticLambda0) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 61;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Key keyIAuthTabCallbackStub = blackholeDecoderFactoryExternalSyntheticLambda0.IAuthTabCallbackStub();
        Intrinsics.checkNotNull(keyIAuthTabCallbackStub, "");
        SecretKey secretKey = (SecretKey) keyIAuthTabCallbackStub;
        KeySpec keySpec = SecretKeyFactory.getInstance(secretKey.getAlgorithm(), "AndroidKeyStore").getKeySpec(secretKey, KeyInfo.class);
        Object obj = null;
        if (keySpec instanceof KeyInfo) {
            int i4 = asInterface + 117;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            keyInfo = (KeyInfo) keySpec;
        } else {
            keyInfo = null;
        }
        if (keyInfo == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            int i5 = IAuthTabCallbackDefault + 77;
            asInterface = i5 % 128;
            if (i5 % 2 != 0) {
                Integer.valueOf(keyInfo.getSecurityLevel());
                obj.hashCode();
                throw null;
            }
            numValueOf = Integer.valueOf(keyInfo.getSecurityLevel());
        } else {
            numValueOf = null;
        }
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("isInsideSecureHardware", Boolean.valueOf(keyInfo.isInsideSecureHardware()));
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("securityLevel(API31+)", numValueOf);
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("purposes", Integer.valueOf(keyInfo.getPurposes()));
        String[] blockModes = keyInfo.getBlockModes();
        Intrinsics.checkNotNullExpressionValue(blockModes, "");
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback("blockModes", ArraysKt.toList(blockModes));
        String[] encryptionPaddings = keyInfo.getEncryptionPaddings();
        Intrinsics.checkNotNullExpressionValue(encryptionPaddings, "");
        ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{convertFloatArrayToByteArray, "TossKeyStore", "keyInfo", access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, getWrite.IAuthTabCallback("encryptionPaddings", ArraysKt.toList(encryptionPaddings)), getWrite.IAuthTabCallback("keySize", Integer.valueOf(keyInfo.getKeySize()))}), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        return null;
    }

    private final void asInterface() throws Throwable {
        int i = 2 % 2;
        SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
        Object[] objArr = new Object[1];
        a(new int[]{20, 3, 0, 0}, false, new byte[]{1, 0, 0}, objArr);
        KeyGenerator keyGenerator = KeyGenerator.getInstance(((String) objArr[0]).intern(), "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder("im.toss.keystore.cbc", 3).setBlockModes("CBC").setEncryptionPaddings("PKCS7Padding").build(), secureRandom);
        keyGenerator.generateKey();
        int i2 = asInterface + 71;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i;
        ByteBuffer byteBuffer = (ByteBuffer) objArr[1];
        int i2 = 2 % 2;
        if (byteBuffer.remaining() < 4) {
            throw new UtilsKtUseMinConstraintsMeasurePolicy1ExternalSyntheticLambda0("No IV size available");
        }
        int i3 = IAuthTabCallbackDefault + 117;
        asInterface = i3 % 128;
        if (i3 % 2 == 0 ? (i = byteBuffer.getInt()) != 16 : (i = byteBuffer.getInt()) != 124) {
            throw new UtilsKtUseMinConstraintsMeasurePolicy1ExternalSyntheticLambda0("Invalid IV size " + i + " (expected 16)");
        }
        if (byteBuffer.remaining() >= i) {
            int i4 = IAuthTabCallbackDefault + 27;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            if (i >= 0) {
                byte[] bArr = new byte[i];
                byteBuffer.get(bArr);
                return bArr;
            }
        }
        throw new UtilsKtUseMinConstraintsMeasurePolicy1ExternalSyntheticLambda0("Not enough data for IV or IV size is negative");
    }

    private final byte[] IAuthTabCallback(ByteBuffer byteBuffer) {
        int i = 2 % 2;
        if (byteBuffer.remaining() < 4) {
            throw new UtilsKtUseMinConstraintsMeasurePolicy1ExternalSyntheticLambda0("Not enough data size for content");
        }
        int i2 = asInterface + 85;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            byteBuffer.getInt();
            byteBuffer.remaining();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i3 = byteBuffer.getInt();
        if (byteBuffer.remaining() >= i3) {
            int i4 = IAuthTabCallbackDefault + 59;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            if (i3 >= 0) {
                byte[] bArr = new byte[i3];
                byteBuffer.get(bArr);
                return bArr;
            }
        }
        throw new UtilsKtUseMinConstraintsMeasurePolicy1ExternalSyntheticLambda0("Not enough data for encrypted content or encrypted data size is negative");
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int length;
        char[] cArr;
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr2 = onExtraCallbackWithResult;
        long j = 0;
        if (cArr2 != null) {
            int i9 = $10 + 11;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
                i2 = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                int i10 = $10 + 79;
                $11 = i10 % 128;
                if (i10 % i3 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i2])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35284 - (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1))), Gravity.getAbsoluteGravity(0, 0) + 35, (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) + 14238, -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr[i2] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i2])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 35282), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 35, 14239 - View.getDefaultSize(0, 0), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr[i2] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                }
                i2++;
                i3 = 2;
                j = 0;
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i6];
        System.arraycopy(cArr2, i5, cArr3, 0, i6);
        if (bArr != null) {
            char[] cArr4 = new char[i6];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i6) {
                int i11 = $11 + 49;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 10936), ((Process.getThreadPriority(0) + 20) >> 6) + 65, 16718 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                } else {
                    int i14 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), (KeyEvent.getMaxKeyCode() >> 16) + 29, 17656 - ExpandableListView.getPackedPositionChild(0L), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 69, 12486 - KeyEvent.getDeadChar(0, 0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            int i15 = $11 + 105;
            $10 = i15 % 128;
            i = 2;
            int i16 = i15 % 2;
            cArr3 = cArr4;
        } else {
            i = 2;
        }
        if (i8 > 0) {
            int i17 = $11 + 117;
            $10 = i17 % 128;
            if (i17 % i != 0) {
                char[] cArr5 = new char[i6];
                System.arraycopy(cArr3, 1, cArr5, 1, i6);
                System.arraycopy(cArr5, 1, cArr3, i6 % i8, i8);
                System.arraycopy(cArr5, i8, cArr3, 0, i6 >>> i8);
            } else {
                char[] cArr6 = new char[i6];
                System.arraycopy(cArr3, 0, cArr6, 0, i6);
                int i18 = i6 - i8;
                System.arraycopy(cArr6, 0, cArr3, i18, i8);
                System.arraycopy(cArr6, i8, cArr3, 0, i18);
            }
        }
        if (z) {
            char[] cArr7 = new char[i6];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i6) {
                cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i6 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr7;
        }
        if (i7 > 0) {
            int i19 = $11 + 89;
            $10 = i19 % 128;
            int i20 = i19 % 2;
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i6) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Key IAuthTabCallbackStub() throws Throwable {
        Key key;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 25;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        while (true) {
            if (i4 >= 2) {
                try {
                    key = this.onNavigationEvent.getKey("im.toss.keystore.cbc", null);
                    break;
                } catch (Throwable th) {
                    ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult("TossKeyStore", "Failed after 3 retries", th, access8100.onNavigationEvent(getWrite.IAuthTabCallback("retryTag", "TossKeyStoreCryptor_getSecretKeyForCbc")));
                    throw th;
                }
            }
            int i5 = IAuthTabCallbackDefault + 75;
            asInterface = i5 % 128;
            try {
                if (i5 % 2 != 0) {
                    this.onNavigationEvent.getKey("im.toss.keystore.cbc", null);
                    throw null;
                }
                key = this.onNavigationEvent.getKey("im.toss.keystore.cbc", null);
            } catch (Exception unused) {
                i4++;
            }
        }
    }

    private final byte[] onWarmupCompleted(ByteBuffer byteBuffer) {
        return (byte[]) onExtraCallback(PushInfo.Companion.onExtraCallback(), new Object[]{this, byteBuffer}, 1485902904, PushInfo.Companion.onExtraCallback(), -1485902903, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback());
    }

    public final void IAuthTabCallback() {
        onExtraCallback(PushInfo.Companion.onExtraCallback(), new Object[]{this}, -484938128, PushInfo.Companion.onExtraCallback(), 484938128, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback());
    }

    static void onExtraCallback() {
        onExtraCallbackWithResult = new char[]{27243, 27145, 27141, 27147, 27149, 27158, 27180, 27178, 27176, 27173, 27172, 27162, 27149, 27138, 27151, 27255, 27148, 27148, 27255, 27249, 27246, 27149, 27138};
    }
}
