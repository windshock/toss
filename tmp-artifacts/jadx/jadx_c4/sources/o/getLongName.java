package o;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.internal.ICustomTabsCallbackStubProxy;
import com.skp.smarttouch.sem.tools.smartcard.AbstractSmartcard;
import com.tmoney.LiveCheckConstants;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getLongName {
    private static final byte[] $$a = {40, AbstractSmartcard.BYTE_RESPONSE_LENGTH, -113, 75};
    private static final int $$b = 77;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    private static long onNavigationEvent = 7798559133331975163L;
    private static int onExtraCallbackWithResult = -2082745517;
    private static char IAuthTabCallback = 27643;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, int i2, byte b) {
        int i3;
        int i4 = i + 109;
        byte[] bArr = $$a;
        int i5 = b + 4;
        int i6 = i2 * 4;
        byte[] bArr2 = new byte[1 - i6];
        int i7 = 0 - i6;
        if (bArr == null) {
            int i8 = i5;
            int i9 = 0;
            int i10 = i7;
            i4 = (-i4) + i10;
            i5 = i8;
            i3 = i9;
            int i11 = i5 + 1;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
                return new String(bArr2, 0);
            }
            int i12 = bArr[i11];
            i10 = i4;
            i4 = i12;
            i9 = i3 + 1;
            i8 = i11;
            i4 = (-i4) + i10;
            i5 = i8;
            i3 = i9;
            int i112 = i5 + 1;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            int i1122 = i5 + 1;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
            }
        }
    }

    public static final /* synthetic */ String onExtraCallbackWithResult(int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 29;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String strOnWarmupCompleted = onWarmupCompleted(i);
        int i5 = onWarmupCompleted + 69;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return strOnWarmupCompleted;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i6;
        int i8 = ~(i7 | i);
        int i9 = ~i;
        int i10 = i8 | (~(i9 | i4));
        int i11 = (~(i | i4)) | (~((~i4) | i7 | i9));
        int i12 = i7 | i4 | i9;
        int i13 = i4 + i6 + i3 + (1362283521 * i5) + ((-853422242) * i2);
        int i14 = i13 * i13;
        int i15 = ((1713903284 * i4) - 1228931072) + ((-782767794) * i6) + (i10 * 1248335539) + (1248335539 * i11) + ((-1248335539) * i12) + (i3 * 465567744) + (465567744 * i5) + (1887436800 * i2) + ((-1154482176) * i14);
        int i16 = ((i4 * 722868660) - 41817558) + (i6 * 722869710) + (i10 * (-525)) + (i11 * (-525)) + (i12 * 525) + (i3 * 722869185) + (i5 * 1172694977) + (i2 * (-747618338)) + (i14 * 791674880);
        return i15 + ((i16 * i16) * 751828992) != 1 ? onWarmupCompleted(objArr) : IAuthTabCallback(objArr);
    }

    private static final String onWarmupCompleted(int i) {
        Object obj;
        int i2 = 2 % 2;
        try {
            Result.Companion companion = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(AFj1rSDK.onExtraCallback.onExtraCallbackWithResult(i));
            int i3 = onExtraCallback + 23;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        } catch (Throwable th) {
            Result.Companion companion2 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (kotlin.Result.onExtraCallback(obj)) {
            int i5 = onWarmupCompleted + 29;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            obj = "";
        }
        return (String) obj;
    }

    public static /* synthetic */ String onExtraCallbackWithResult(Long l, String str, ParamImpl paramImpl, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 15;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2;
        if ((i & 2) != 0) {
            int i6 = i4 + 103;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            paramImpl = ParamImpl.WON;
        }
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(l, str, paramImpl);
        int i8 = onExtraCallback + 1;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        return strOnExtraCallbackWithResult;
    }

    public static final String onExtraCallbackWithResult(@Nullable Long l, @NotNull String str, @NotNull ParamImpl paramImpl) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(paramImpl, "");
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(paramImpl, "");
        if (l != null) {
            return paramImpl.toMoneyString(l.longValue());
        }
        int i3 = onExtraCallback + 25;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String moneyString = paramImpl.toMoneyString(str);
        int i5 = onExtraCallback + 1;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return moneyString;
        }
        throw null;
    }

    public static /* synthetic */ String onNavigationEvent(long j, ParamImpl paramImpl, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 19;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        if (i3 % 2 == 0 && (i & 1) != 0) {
            int i5 = i4 + 63;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            paramImpl = ParamImpl.WON;
        }
        Object[] objArr = {Long.valueOf(j), paramImpl};
        String str = (String) onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), -640286283, ICustomTabsCallbackStubProxy.onExtraCallback(), objArr, 640286283);
        int i7 = onWarmupCompleted + 9;
        onExtraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        long jLongValue = ((Number) objArr[0]).longValue();
        ParamImpl paramImpl = (ParamImpl) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(paramImpl, "");
            return paramImpl.toMoneyString(jLongValue);
        }
        Intrinsics.checkNotNullParameter(paramImpl, "");
        String moneyString = paramImpl.toMoneyString(jLongValue);
        int i3 = 53 / 0;
        return moneyString;
    }

    public static final String IAuthTabCallback(long j, @NotNull String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            String strOnNavigationEvent = Cookies_flush.onNavigationEvent(j, str);
            Intrinsics.checkNotNullExpressionValue(strOnNavigationEvent, "");
            return strOnNavigationEvent;
        }
        Intrinsics.checkNotNullParameter(str, "");
        String strOnNavigationEvent2 = Cookies_flush.onNavigationEvent(j, str);
        Intrinsics.checkNotNullExpressionValue(strOnNavigationEvent2, "");
        int i3 = 66 / 0;
        return strOnNavigationEvent2;
    }

    public static /* synthetic */ String IAuthTabCallback(Long l, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 19;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            int i6 = i4 + 79;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback3 = ICustomTabsCallbackStubProxy.onExtraCallback();
        return (String) onNavigationEvent(iOnExtraCallback, ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback2, -247172514, iOnExtraCallback3, new Object[]{l, str, str2, str3}, 247172515);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Long l = (Long) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        String str3 = (String) objArr[3];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (l == null) {
            int i4 = onWarmupCompleted + 111;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return str3;
        }
        String strOnExtraCallbackWithResult = Cookies_flush.onExtraCallbackWithResult(l.longValue(), str, str2);
        Intrinsics.checkNotNull(strOnExtraCallbackWithResult);
        int i6 = onWarmupCompleted + 81;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return strOnExtraCallbackWithResult;
    }

    @Deprecated
    public static final String onExtraCallbackWithResult(@NotNull Number number, boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(number, "");
        String strOnExtraCallback = onExtraCallback(number.toString(), z);
        int i4 = onExtraCallback + 93;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return strOnExtraCallback;
        }
        throw null;
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
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i3 = $11 + 45;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int i5 = 44 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    int size = 1451 - View.MeasureSpec.getSize(0);
                    byte b = (byte) ($$b & 3);
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(maximumFlingVelocity, i5, size, 228868077, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Gravity.getAbsoluteGravity(0, 0) + 49123), TextUtils.lastIndexOf("", '0', 0) + 45, 1494 - KeyEvent.normalizeMetaState(0), 1533236389, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0) + 23973), 50 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), ExpandableListView.getPackedPositionGroup(0L) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45847 - TextUtils.lastIndexOf("", '0', 0)), 30 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), Color.blue(0) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onNavigationEvent ^ 7798559133331975163L)) ^ ((int) (onExtraCallbackWithResult ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallback ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i6 = $10 + 27;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 2 / 5;
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i8 = $10 + 29;
        $11 = i8 % 128;
        if (i8 % 2 != 0) {
            objArr[0] = str;
        } else {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final String onWarmupCompleted(long j) {
        int i = 2 % 2;
        if (j < 1024) {
            return j + LiveCheckConstants.LOAD_PHONE_LOST_ACK;
        }
        double d = j;
        int iLog = (int) (Math.log(d) / Math.log(1024.0d));
        if (iLog > 0) {
            int i2 = onWarmupCompleted + 45;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (iLog < 7) {
                String str = String.format("%.1f%sB", Arrays.copyOf(new Object[]{Double.valueOf(d / Math.pow(1024.0d, iLog)), Character.valueOf("KMGTPE".charAt(iLog - 1))}, 2));
                Intrinsics.checkNotNullExpressionValue(str, "");
                return str;
            }
        }
        String str2 = j + LiveCheckConstants.LOAD_PHONE_LOST_ACK;
        int i4 = onExtraCallback + 41;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return str2;
    }

    private static final String onExtraCallback(String str, boolean z) throws Throwable {
        boolean z2;
        int i = 2 % 2;
        a((char) (36395 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (-47911818) - View.resolveSizeAndState(0, 0, 0), new char[]{26857}, new char[]{0, 0, 0, 0}, new char[]{30437, 9452, 11261, 30862}, new Object[1]);
        if (!(!Intrinsics.areEqual(((String) r13[0]).intern(), str))) {
            int i2 = onWarmupCompleted + 47;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Object[] objArr = new Object[1];
                a((char) (Color.alpha(0) * 36395), ViewConfiguration.getMaximumDrawingCacheSize() - 47911863, new char[]{26857}, new char[]{0, 0, 0, 0}, new char[]{30437, 9452, 11261, 30862}, objArr);
                return ((String) objArr[0]).intern();
            }
            Object[] objArr2 = new Object[1];
            a((char) (Color.alpha(0) + 36395), (-47911818) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), new char[]{26857}, new char[]{0, 0, 0, 0}, new char[]{30437, 9452, 11261, 30862}, objArr2);
            return ((String) objArr2[0]).intern();
        }
        String str2 = z ? "$1,$2조 $3,$4억 $5,$6만 $7천 $8" : "$1,$2조 $3,$4억 $5,$6만 $7,$8";
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str3 = String.format("%16s", Arrays.copyOf(new Object[]{new Regex("[^0-9]").replace(str, "")}, 1));
        Intrinsics.checkNotNullExpressionValue(str3, "");
        String strReplace = new Regex("( [^1-9]+)").replace(new Regex("^[^1-9]*").replace(new Regex("(.{1})(.{3})(.{1})(.{3})(.{1})(.{3})(.{1})(.{3})").replace(str3, str2), ""), " ");
        int length = strReplace.length() - 1;
        int i3 = 0;
        boolean z3 = false;
        while (i3 <= length) {
            int i4 = onWarmupCompleted + 23;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (Intrinsics.compare(strReplace.charAt(z3 ? length : i3), 32) <= 0) {
                int i5 = onExtraCallback + 33;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                z2 = true;
            } else {
                int i7 = onExtraCallback + 31;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                z2 = false;
            }
            if (z3) {
                if (!z2) {
                    break;
                }
                int i9 = onExtraCallback + 85;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                length--;
            } else if (z2) {
                i3++;
            } else {
                z3 = true;
            }
        }
        return strReplace.subSequence(i3, length + 1).toString();
    }

    public static final String IAuthTabCallback(long j, @NotNull ParamImpl paramImpl) {
        Object[] objArr = {Long.valueOf(j), paramImpl};
        return (String) onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), -640286283, ICustomTabsCallbackStubProxy.onExtraCallback(), objArr, 640286283);
    }

    public static final String onWarmupCompleted(@Nullable Long l, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback3 = ICustomTabsCallbackStubProxy.onExtraCallback();
        return (String) onNavigationEvent(iOnExtraCallback, ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback2, -247172514, iOnExtraCallback3, new Object[]{l, str, str2, str3}, 247172515);
    }
}
