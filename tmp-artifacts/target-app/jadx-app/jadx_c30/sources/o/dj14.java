package o;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISO7816;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'AES_ENCRYPTED' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class dj14 {
    private static final /* synthetic */ dj14[] $VALUES;
    public static final dj14 AES_ENCRYPTED;
    public static final dj14 BZIP2;
    public static final dj14 DEFLATED;
    public static final dj14 ENHANCED_DEFLATED;
    public static final dj14 EXPANDING_LEVEL_1;
    public static final dj14 EXPANDING_LEVEL_2;
    public static final dj14 EXPANDING_LEVEL_3;
    public static final dj14 EXPANDING_LEVEL_4;
    public static final dj14 IMPLODING;
    public static final dj14 JPEG;
    public static final dj14 LZMA;
    public static final dj14 PKWARE_IMPLODING;
    public static final dj14 PPMD;
    public static final dj14 STORED;
    public static final dj14 TOKENIZATION;
    public static final dj14 UNKNOWN;
    static final int UNKNOWN_CODE = -1;
    public static final dj14 UNSHRINKING;
    public static final dj14 WAVPACK;
    public static final dj14 XZ;
    private static final Map<Integer, dj14> codeToEnum;
    private static long onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static char onWarmupCompleted;
    private final int code;
    private static final byte[] $$a = {99, 53, ISO7816.INS_UNBLOCK_CHV, 107};
    private static final int $$b = 223;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int IAuthTabCallback = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, byte b2) {
        int i2;
        int i3 = i * 4;
        int i4 = 110 - b2;
        byte[] bArr = $$a;
        int i5 = (b * 4) + 4;
        byte[] bArr2 = new byte[1 - i3];
        int i6 = 0 - i3;
        if (bArr == null) {
            int i7 = i5;
            int i8 = i6;
            i2 = 0;
            int i9 = i7 + 1;
            i4 = i5 + i8;
            i5 = i9;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            i2++;
            i8 = bArr[i5];
            int i10 = i4;
            i7 = i5;
            i5 = i10;
            int i92 = i7 + 1;
            i4 = i5 + i8;
            i5 = i92;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        }
    }

    public static dj14 valueOf(String str) {
        int i = 2 % 2;
        int i2 = asInterface + 95;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        dj14 dj14Var = (dj14) Enum.valueOf(dj14.class, str);
        if (i3 != 0) {
            return dj14Var;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static dj14[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 15;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        dj14[] dj14VarArr = (dj14[]) $VALUES.clone();
        int i3 = IAuthTabCallbackStub + 97;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return dj14VarArr;
    }

    static {
        onExtraCallbackWithResult = 1;
        onExtraCallback();
        dj14 dj14Var = new dj14("STORED", 0, 0);
        STORED = dj14Var;
        dj14 dj14Var2 = new dj14("UNSHRINKING", 1, 1);
        UNSHRINKING = dj14Var2;
        dj14 dj14Var3 = new dj14("EXPANDING_LEVEL_1", 2, 2);
        EXPANDING_LEVEL_1 = dj14Var3;
        dj14 dj14Var4 = new dj14("EXPANDING_LEVEL_2", 3, 3);
        EXPANDING_LEVEL_2 = dj14Var4;
        dj14 dj14Var5 = new dj14("EXPANDING_LEVEL_3", 4, 4);
        EXPANDING_LEVEL_3 = dj14Var5;
        dj14 dj14Var6 = new dj14("EXPANDING_LEVEL_4", 5, 5);
        EXPANDING_LEVEL_4 = dj14Var6;
        dj14 dj14Var7 = new dj14("IMPLODING", 6, 6);
        IMPLODING = dj14Var7;
        dj14 dj14Var8 = new dj14("TOKENIZATION", 7, 7);
        TOKENIZATION = dj14Var8;
        dj14 dj14Var9 = new dj14("DEFLATED", 8, 8);
        DEFLATED = dj14Var9;
        dj14 dj14Var10 = new dj14("ENHANCED_DEFLATED", 9, 9);
        ENHANCED_DEFLATED = dj14Var10;
        dj14 dj14Var11 = new dj14("PKWARE_IMPLODING", 10, 10);
        PKWARE_IMPLODING = dj14Var11;
        dj14 dj14Var12 = new dj14("BZIP2", 11, 12);
        BZIP2 = dj14Var12;
        dj14 dj14Var13 = new dj14("LZMA", 12, 14);
        LZMA = dj14Var13;
        dj14 dj14Var14 = new dj14("XZ", 13, 95);
        XZ = dj14Var14;
        dj14 dj14Var15 = new dj14("JPEG", 14, 96);
        JPEG = dj14Var15;
        dj14 dj14Var16 = new dj14("WAVPACK", 15, 97);
        WAVPACK = dj14Var16;
        dj14 dj14Var17 = new dj14("PPMD", 16, 98);
        PPMD = dj14Var17;
        Object[] objArr = new Object[1];
        a((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 8917), ExpandableListView.getPackedPositionGroup(0L) + 2075825857, new char[]{19701, 50165, 5724, 5189, 61209, 28984, 44942, 62879, 47264, 55826, 20017, 16524, 50597}, new char[]{0, 0, 0, 0}, new char[]{49448, 47766, 54395, 17698}, objArr);
        dj14 dj14Var18 = new dj14(((String) objArr[0]).intern(), 17, 99);
        AES_ENCRYPTED = dj14Var18;
        Object[] objArr2 = new Object[1];
        a((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (-2104397556) - (Process.myPid() >> 22), new char[]{22138, 47774, 3936, 59263, 29437, 26894, 15411}, new char[]{0, 0, 0, 0}, new char[]{3089, 37233, 40066, 11644}, objArr2);
        int i = 0;
        dj14 dj14Var19 = new dj14(((String) objArr2[0]).intern(), 18);
        UNKNOWN = dj14Var19;
        $VALUES = new dj14[]{dj14Var, dj14Var2, dj14Var3, dj14Var4, dj14Var5, dj14Var6, dj14Var7, dj14Var8, dj14Var9, dj14Var10, dj14Var11, dj14Var12, dj14Var13, dj14Var14, dj14Var15, dj14Var16, dj14Var17, dj14Var18, dj14Var19};
        HashMap map = new HashMap();
        dj14[] dj14VarArrValues = values();
        int length = dj14VarArrValues.length;
        int i2 = 2 % 2;
        while (i < length) {
            int i3 = IAuthTabCallback + 119;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                dj14 dj14Var20 = dj14VarArrValues[i];
                map.put(Integer.valueOf(dj14Var20.getCode()), dj14Var20);
                i++;
            } else {
                dj14 dj14Var21 = dj14VarArrValues[i];
                map.put(Integer.valueOf(dj14Var21.getCode()), dj14Var21);
                i += 45;
            }
        }
        codeToEnum = Collections.unmodifiableMap(map);
        int i4 = IAuthTabCallback + 93;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
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
        int i3 = $11 + 55;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0)), 43 - View.resolveSize(0, 0), TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0') + 1452, 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 49124), 44 - TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0), 1494 - (ViewConfiguration.getScrollBarSize() >> 8), 1533236389, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - View.combineMeasuredStates(0, 0)), Gravity.getAbsoluteGravity(0, 0) + 50, 22939 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionType(0L) + 45848), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 28, KeyEvent.normalizeMetaState(0) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] ^ cArr4[iIntValue2]) ^ (onExtraCallback ^ 7798559133331975163L)) ^ ((int) (onNavigationEvent ^ 7798559133331975163L))) ^ ((char) (onWarmupCompleted ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i5 = $11 + 31;
                $10 = i5 % 128;
                int i6 = i5 % 2;
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

    public static dj14 getMethodByCode(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 101;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Map<Integer, dj14> map = codeToEnum;
        Integer numValueOf = Integer.valueOf(i);
        if (i4 == 0) {
            return map.get(numValueOf);
        }
        map.get(numValueOf);
        throw null;
    }

    private dj14(String str, int i) {
        this(str, i, -1);
    }

    private dj14(String str, int i, int i2) {
        this.code = i2;
    }

    public int getCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 55;
        asInterface = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = this.code;
        int i5 = i2 + 117;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    static void onExtraCallback() {
        onExtraCallback = 7798559133331975163L;
        onNavigationEvent = 1793631764;
        onWarmupCompleted = (char) 27643;
    }
}
