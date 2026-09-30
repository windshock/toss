package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg[] $VALUES;
    public static final r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg CDN_DEFAULT;
    public static final r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg CONFIGURED;
    public static final r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg DECLARED_DEFAULT;
    private static int IAuthTabCallbackDefault;
    public static final r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg PERSISTENT_CACHE;
    public static final r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg REMOTE;
    public static final r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg SESSION_CACHE;
    public static final r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg UNKNOWN;
    private static char onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static long onWarmupCompleted;
    private final String attributeValue;
    private static final byte[] $$a = {75, -35, 114, 51};
    private static final int $$b = 254;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 1;
    private static int onNavigationEvent = 0;
    private static int IAuthTabCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, int i2) {
        int i3;
        int i4;
        int i5 = (i2 * 3) + 1;
        byte[] bArr = $$a;
        int i6 = i + 109;
        int i7 = s + 4;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i8 = i6;
            i4 = 0;
            int i9 = i7;
            int i10 = i7 + (-i8);
            i3 = i4;
            int i11 = i9;
            i6 = i10;
            i7 = i11;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            int i12 = i7 + 1;
            if (i4 == i5) {
                return new String(bArr2, 0);
            }
            i8 = bArr[i12];
            int i13 = i6;
            i9 = i12;
            i7 = i13;
            int i102 = i7 + (-i8);
            i3 = i4;
            int i112 = i9;
            i6 = i102;
            i7 = i112;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            int i122 = i7 + 1;
            if (i4 == i5) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            int i1222 = i7 + 1;
            if (i4 == i5) {
            }
        }
    }

    private static final /* synthetic */ r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 23;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg[] r8lambdaimi1kkyy494wcpjbjziyxabnqtgArr = {REMOTE, SESSION_CACHE, PERSISTENT_CACHE, CDN_DEFAULT, CONFIGURED, DECLARED_DEFAULT, UNKNOWN};
        int i5 = i2 + 109;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return r8lambdaimi1kkyy494wcpjbjziyxabnqtgArr;
    }

    public static EnumEntries<r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 53;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg> enumEntries = $ENTRIES;
        int i5 = i2 + 5;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg r8lambdaimi1kkyy494wcpjbjziyxabnqtg = (r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg) Enum.valueOf(r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg.class, str);
        int i4 = onNavigationEvent + 17;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return r8lambdaimi1kkyy494wcpjbjziyxabnqtg;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg[] r8lambdaimi1kkyy494wcpjbjziyxabnqtgArr = (r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg[]) $VALUES.clone();
        int i4 = onNavigationEvent + 123;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return r8lambdaimi1kkyy494wcpjbjziyxabnqtgArr;
    }

    private r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg(String str, int i, String str2) {
        this.attributeValue = str2;
    }

    public final String getAttributeValue() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.attributeValue;
        int i4 = i3 + 97;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    static {
        IAuthTabCallbackDefault = 0;
        onNavigationEvent();
        REMOTE = new r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg("REMOTE", 0, "remote");
        SESSION_CACHE = new r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg("SESSION_CACHE", 1, "session_cache");
        PERSISTENT_CACHE = new r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg("PERSISTENT_CACHE", 2, "persistent_cache");
        CDN_DEFAULT = new r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg("CDN_DEFAULT", 3, "cdn_default");
        CONFIGURED = new r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg("CONFIGURED", 4, "configured");
        DECLARED_DEFAULT = new r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg("DECLARED_DEFAULT", 5, "declared_default");
        Object[] objArr = new Object[1];
        a((char) (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 871471898, new char[]{12580, 1717, 26859, 7328, 30952, 26258, 63445}, new char[]{59448, 31834, 19399, 42512}, new char[]{6690, 61851, 30515, 19698}, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (-1786365010) - ExpandableListView.getPackedPositionGroup(0L), new char[]{42625, 14976, 9167, 61140, 29516, 8394, 53064}, new char[]{59448, 31834, 19399, 42512}, new char[]{44645, 34363, 49045, 36586}, objArr2);
        UNKNOWN = new r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg(strIntern, 6, ((String) objArr2[0]).intern());
        r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg[] r8lambdaimi1kkyy494wcpjbjziyxabnqtgArr$values = $values();
        $VALUES = r8lambdaimi1kkyy494wcpjbjziyxabnqtgArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(r8lambdaimi1kkyy494wcpjbjziyxabnqtgArr$values);
        int i = asInterface + 87;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i4 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i5 = $10 + 87;
            $11 = i5 % 128;
            int i6 = i5 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', i4, i4) + 44;
                    int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 1451;
                    byte b = (byte) (-1);
                    byte b2 = (byte) (-b);
                    String str$$c = $$c(b, b2, (byte) (b2 - 1));
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(jumpTapTimeout, iIndexOf, maxKeyCode, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) (-1);
                    byte b4 = (byte) (b3 + 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionGroup(0L) + 49123), Color.alpha(i4) + 44, Gravity.getAbsoluteGravity(i4, i4) + 1494, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), ImageFormat.getBitsPerPixel(0) + 51, Color.rgb(0, 0, 0) + 16800155, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - TextUtils.indexOf("", "", 0)), View.combineMeasuredStates(0, 0) + 29, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (onExtraCallbackWithResult ^ 7798559133331975163L))) ^ ((char) (onExtraCallback ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i7 = $11 + 123;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                i2 = 2;
                i4 = 0;
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

    static void onNavigationEvent() {
        onWarmupCompleted = -3879209024679607357L;
        onExtraCallbackWithResult = -1776194565;
        onExtraCallback = (char) 27643;
    }
}
