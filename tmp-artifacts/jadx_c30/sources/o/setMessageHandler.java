package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.lang.reflect.Method;
import kotlin.enums.EnumEntries;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISO7816;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class setMessageHandler implements Serializable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ setMessageHandler[] $VALUES;
    private static char IAuthTabCallback;
    private static int IAuthTabCallbackDefault;

    @SerializedName("birthday")
    public static final setMessageHandler birthday;

    @SerializedName("brand")
    public static final setMessageHandler brand;

    @SerializedName("cardholder")
    public static final setMessageHandler cardholder;

    @SerializedName("cardno")
    public static final setMessageHandler cardno;

    @SerializedName("cardpw2")
    public static final setMessageHandler cardpw2;

    @SerializedName("cardpw4")
    public static final setMessageHandler cardpw4;

    @SerializedName("carrier")
    public static final setMessageHandler carrier;

    @SerializedName("cvc")
    public static final setMessageHandler cvc;

    @SerializedName("expiry")
    public static final setMessageHandler expiry;

    @SerializedName("gender")
    public static final setMessageHandler gender;

    @SerializedName("nation")
    public static final setMessageHandler nation;
    private static int onExtraCallback;
    private static long onExtraCallbackWithResult;

    @SerializedName(PKCS12.KEY_PHONE)
    public static final setMessageHandler phone;
    private final String hint;
    private final int validLength;
    private static final byte[] $$a = {4, ISO7816.INS_READ_BINARY, 45, 109};
    private static final int $$b = 206;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, short s, int i) {
        int i2;
        int i3 = (i * 3) + 4;
        int i4 = (s * 4) + 1;
        byte[] bArr = $$a;
        int i5 = 110 - b;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            i5 = i4;
            int i6 = i3;
            i2 = 0;
            i3++;
            i5 += i6;
            bArr2[i2] = (byte) i5;
            i2++;
            if (i2 == i4) {
                return new String(bArr2, 0);
            }
            i6 = bArr[i3];
            i3++;
            i5 += i6;
            bArr2[i2] = (byte) i5;
            i2++;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            i2++;
            if (i2 == i4) {
            }
        }
    }

    private static final /* synthetic */ setMessageHandler[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        setMessageHandler[] setmessagehandlerArr = {cardno, expiry, cvc, cardpw2, cardpw4, cardholder, carrier, phone, gender, nation, brand, birthday};
        int i5 = i3 + 3;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return setmessagehandlerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<setMessageHandler> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 123;
        onNavigationEvent = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        EnumEntries<setMessageHandler> enumEntries = $ENTRIES;
        int i4 = i2 + 71;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return enumEntries;
        }
        throw null;
    }

    public static setMessageHandler valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        setMessageHandler setmessagehandler = (setMessageHandler) Enum.valueOf(setMessageHandler.class, str);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onWarmupCompleted + 11;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return setmessagehandler;
        }
        obj.hashCode();
        throw null;
    }

    public static setMessageHandler[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        setMessageHandler[] setmessagehandlerArr = $VALUES;
        if (i3 != 0) {
            return (setMessageHandler[]) setmessagehandlerArr.clone();
        }
        throw null;
    }

    private setMessageHandler(String str, int i, String str2, int i2) {
        this.hint = str2;
        this.validLength = i2;
    }

    public final String getHint() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 35;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.hint;
        int i5 = i2 + 91;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int getValidLength() {
        int i;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 91;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        if (i3 % 2 != 0) {
            i = this.validLength;
            int i5 = 63 / 0;
        } else {
            i = this.validLength;
        }
        int i6 = i4 + 63;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    static {
        IAuthTabCallbackDefault = 0;
        onWarmupCompleted();
        cardno = new setMessageHandler("cardno", 0, "카드번호", 12);
        expiry = new setMessageHandler("expiry", 1, "유효기한", 4);
        cvc = new setMessageHandler("cvc", 2, "CVC", 3);
        Object[] objArr = new Object[1];
        a((char) ((-1) - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0)), 1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), new char[]{33746, 53666, 38026, 56861, 8536, 59810, 19070, 34956, 289, 22927}, new char[]{0, 0, 0, 0}, new char[]{43163, 35116, 17065, 30734}, objArr);
        cardpw2 = new setMessageHandler("cardpw2", 3, ((String) objArr[0]).intern(), 2);
        Object[] objArr2 = new Object[1];
        a((char) (10749 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (-1) - ImageFormat.getBitsPerPixel(0), new char[]{13280, 29843, 10683, 32186}, new char[]{0, 0, 0, 0}, new char[]{29709, 6413, 64716, 53801}, objArr2);
        cardpw4 = new setMessageHandler("cardpw4", 4, ((String) objArr2[0]).intern(), 4);
        cardholder = new setMessageHandler("cardholder", 5, BuildConfig.FLAVOR, 0);
        carrier = new setMessageHandler("carrier", 6, BuildConfig.FLAVOR, 0);
        phone = new setMessageHandler(PKCS12.KEY_PHONE, 7, BuildConfig.FLAVOR, 0);
        gender = new setMessageHandler("gender", 8, BuildConfig.FLAVOR, 0);
        nation = new setMessageHandler("nation", 9, BuildConfig.FLAVOR, 0);
        brand = new setMessageHandler("brand", 10, BuildConfig.FLAVOR, 0);
        birthday = new setMessageHandler("birthday", 11, BuildConfig.FLAVOR, 0);
        setMessageHandler[] setmessagehandlerArr$values = $values();
        $VALUES = setmessagehandlerArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(setmessagehandlerArr$values);
        int i = asBinder + 49;
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
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i4 = $10 + 51;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0') + 44, 1451 - Color.red(0), 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 1;
                    byte b4 = (byte) (b3 - 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + ISO7816.INS_DELETE_FILE), 44 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1494 - (KeyEvent.getMaxKeyCode() >> 16), 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 23971), 50 - View.MeasureSpec.getSize(0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 28, View.getDefaultSize(0, 0) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallbackWithResult ^ 7798559133331975163L)) ^ ((int) (onExtraCallback ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallback ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i6 = $11 + 57;
        $10 = i6 % 128;
        if (i6 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i7 = 1 / 0;
            objArr[0] = str;
        }
    }

    static void onWarmupCompleted() {
        onExtraCallbackWithResult = 7798559133331975163L;
        onExtraCallback = -1776194565;
        IAuthTabCallback = (char) 45963;
    }
}
