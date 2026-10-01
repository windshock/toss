package org.jmrtd.lds.iso19794;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import org.bouncycastle.pqc.crypto.rainbow.util.GF2Field;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'UNKNOWN' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class FaceImageInfo$HairColor {
    private static final /* synthetic */ FaceImageInfo$HairColor[] $VALUES;
    public static final FaceImageInfo$HairColor BALD;
    public static final FaceImageInfo$HairColor BLACK;
    public static final FaceImageInfo$HairColor BLONDE;
    public static final FaceImageInfo$HairColor BLUE;
    public static final FaceImageInfo$HairColor BROWN;
    public static final FaceImageInfo$HairColor GRAY;
    public static final FaceImageInfo$HairColor GREEN;
    private static char IAuthTabCallback;
    public static final FaceImageInfo$HairColor RED;
    public static final FaceImageInfo$HairColor UNKNOWN;
    public static final FaceImageInfo$HairColor UNSPECIFIED;
    public static final FaceImageInfo$HairColor WHITE;
    private static long onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private int code;
    private static final byte[] $$a = {120, 65, 99, 57};
    private static final int $$b = 22;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallback = 1;

    private static String $$c(int i, int i2, byte b) {
        byte[] bArr = $$a;
        int i3 = b + 4;
        int i4 = i + 109;
        int i5 = i2 * 3;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        int i7 = -1;
        if (bArr == null) {
            i4 += i6;
        }
        while (true) {
            i7++;
            i3++;
            bArr2[i7] = (byte) i4;
            if (i7 == i6) {
                return new String(bArr2, 0);
            }
            i4 += bArr[i3];
        }
    }

    public static FaceImageInfo$HairColor valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 79;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        FaceImageInfo$HairColor faceImageInfo$HairColor = (FaceImageInfo$HairColor) Enum.valueOf(FaceImageInfo$HairColor.class, str);
        if (i3 == 0) {
            return faceImageInfo$HairColor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static FaceImageInfo$HairColor[] values() {
        int i = 2 % 2;
        int i2 = asBinder + 17;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        FaceImageInfo$HairColor[] faceImageInfo$HairColorArr = (FaceImageInfo$HairColor[]) $VALUES.clone();
        int i4 = IAuthTabCallbackDefault + 51;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 33 / 0;
        }
        return faceImageInfo$HairColorArr;
    }

    static {
        onWarmupCompleted = 0;
        onExtraCallbackWithResult();
        FaceImageInfo$HairColor faceImageInfo$HairColor = new FaceImageInfo$HairColor("UNSPECIFIED", 0, 0);
        UNSPECIFIED = faceImageInfo$HairColor;
        FaceImageInfo$HairColor faceImageInfo$HairColor2 = new FaceImageInfo$HairColor("BALD", 1, 1);
        BALD = faceImageInfo$HairColor2;
        FaceImageInfo$HairColor faceImageInfo$HairColor3 = new FaceImageInfo$HairColor("BLACK", 2, 2);
        BLACK = faceImageInfo$HairColor3;
        FaceImageInfo$HairColor faceImageInfo$HairColor4 = new FaceImageInfo$HairColor("BLONDE", 3, 3);
        BLONDE = faceImageInfo$HairColor4;
        FaceImageInfo$HairColor faceImageInfo$HairColor5 = new FaceImageInfo$HairColor("BROWN", 4, 4);
        BROWN = faceImageInfo$HairColor5;
        FaceImageInfo$HairColor faceImageInfo$HairColor6 = new FaceImageInfo$HairColor("GRAY", 5, 5);
        GRAY = faceImageInfo$HairColor6;
        FaceImageInfo$HairColor faceImageInfo$HairColor7 = new FaceImageInfo$HairColor("WHITE", 6, 6);
        WHITE = faceImageInfo$HairColor7;
        FaceImageInfo$HairColor faceImageInfo$HairColor8 = new FaceImageInfo$HairColor("RED", 7, 7);
        RED = faceImageInfo$HairColor8;
        FaceImageInfo$HairColor faceImageInfo$HairColor9 = new FaceImageInfo$HairColor("GREEN", 8, 8);
        GREEN = faceImageInfo$HairColor9;
        FaceImageInfo$HairColor faceImageInfo$HairColor10 = new FaceImageInfo$HairColor("BLUE", 9, 9);
        BLUE = faceImageInfo$HairColor10;
        Object[] objArr = new Object[1];
        a((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (-207963652) - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0), new char[]{46782, 38514, 13154, 42536, 13753, 42680, 59944}, new char[]{0, 0, 0, 0}, new char[]{64580, 39609, 17907, 31451}, objArr);
        FaceImageInfo$HairColor faceImageInfo$HairColor11 = new FaceImageInfo$HairColor(((String) objArr[0]).intern(), 10, GF2Field.MASK);
        UNKNOWN = faceImageInfo$HairColor11;
        $VALUES = new FaceImageInfo$HairColor[]{faceImageInfo$HairColor, faceImageInfo$HairColor2, faceImageInfo$HairColor3, faceImageInfo$HairColor4, faceImageInfo$HairColor5, faceImageInfo$HairColor6, faceImageInfo$HairColor7, faceImageInfo$HairColor8, faceImageInfo$HairColor9, faceImageInfo$HairColor10, faceImageInfo$HairColor11};
        int i = onExtraCallback + 13;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            int i2 = 25 / 0;
        }
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i3 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i4 = $11 + 125;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char cIndexOf = (char) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, i3);
                    int iRgb = (-16777173) - Color.rgb(i3, i3, i3);
                    int packedPositionGroup = 1451 - ExpandableListView.getPackedPositionGroup(0L);
                    byte b = (byte) 1;
                    byte b2 = (byte) (b - 1);
                    String str$$c = $$c(b, b2, (byte) (b2 - 1));
                    Class[] clsArr = new Class[1];
                    clsArr[i3] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, iRgb, packedPositionGroup, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) i3;
                        byte b4 = b3;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, i3, i3) + 49123), 45 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 1542 - AndroidCharacter.getMirror('0'), 1533236389, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myPid() >> 22) + 23972), TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 50, TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.blue(0) + 45848), TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0) + 30, 12578 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                            cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallbackWithResult ^ 7798559133331975163L)) ^ ((int) (onNavigationEvent ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallback ^ 7798559133331975163L)));
                            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                            int i6 = $10 + 67;
                            $11 = i6 % 128;
                            int i7 = i6 % 2;
                            i3 = 0;
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
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr6);
    }

    private FaceImageInfo$HairColor(String str, int i, int i2) {
        this.code = i2;
    }

    public int toInt() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 29;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        int i5 = this.code;
        int i6 = i3 + 13;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static FaceImageInfo$HairColor toHairColor(int i) {
        int i2 = 2 % 2;
        FaceImageInfo$HairColor[] faceImageInfo$HairColorArrValues = values();
        int length = faceImageInfo$HairColorArrValues.length;
        int i3 = 0;
        while (i3 < length) {
            int i4 = asBinder + 41;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            FaceImageInfo$HairColor faceImageInfo$HairColor = faceImageInfo$HairColorArrValues[i3];
            if (faceImageInfo$HairColor.toInt() == i) {
                int i6 = IAuthTabCallbackDefault + 71;
                asBinder = i6 % 128;
                if (i6 % 2 == 0) {
                    return faceImageInfo$HairColor;
                }
                throw null;
            }
            i3++;
            int i7 = asBinder + 75;
            IAuthTabCallbackDefault = i7 % 128;
            int i8 = i7 % 2;
        }
        return UNKNOWN;
    }

    static void onExtraCallbackWithResult() {
        onExtraCallbackWithResult = 7798559133331975163L;
        onNavigationEvent = -1583665227;
        IAuthTabCallback = (char) 27643;
    }
}
