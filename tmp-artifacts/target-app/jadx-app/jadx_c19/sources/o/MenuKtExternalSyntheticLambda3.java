package o;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.Nullable;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;
import o.HandwritingHandlerNodeExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class MenuKtExternalSyntheticLambda3 implements HandwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback {
    private static final BasicTextContextMenuProviderKtExternalSyntheticLambda4 IAuthTabCallbackDefault;
    private static long IAuthTabCallbackStubProxy;
    private static char IAuthTabCallback_Parcel;
    private static int access000;
    private static int access100;
    private static final String asBinder;
    private static final BasicTextContextMenuProviderKtExternalSyntheticLambda4 asInterface;
    public static final String onExtraCallbackWithResult;
    public final long IAuthTabCallback;
    public final String IAuthTabCallbackStub;
    public final long onExtraCallback;
    public final byte[] onNavigationEvent;
    private int onTransact;
    public final String onWarmupCompleted;
    private static final byte[] $$a = {74, 75, -50, -9};
    private static final int $$b = 180;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ICustomTabsCallback = 0;
    private static int extraCallbackWithResult = 1;
    private static int getInterfaceDescriptor = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i2, short s2) {
        int i3;
        int i4;
        byte[] bArr = $$a;
        int i5 = 3 - (s * 2);
        int i6 = s2 * 4;
        int i7 = 110 - i2;
        byte[] bArr2 = new byte[1 - i6];
        int i8 = 0 - i6;
        int i9 = -1;
        if (bArr == null) {
            int i10 = -1;
            int i11 = i5;
            i5 += -i7;
            i3 = i11;
            i9 = i10;
            i4 = i9 + 1;
            bArr2[i4] = (byte) i5;
            if (i4 == i8) {
                return new String(bArr2, 0);
            }
            int i12 = i3 + 1;
            i11 = i12;
            i7 = bArr[i12];
            i10 = i4;
            i5 += -i7;
            i3 = i11;
            i9 = i10;
            i4 = i9 + 1;
            bArr2[i4] = (byte) i5;
            if (i4 == i8) {
            }
        } else {
            i3 = i5;
            i5 = i7;
            i4 = i9 + 1;
            bArr2[i4] = (byte) i5;
            if (i4 == i8) {
            }
        }
    }

    static {
        access100 = 0;
        onExtraCallbackWithResult();
        Object[] objArr = new Object[1];
        a((char) (Process.getGidForName("") + 1), ViewConfiguration.getKeyRepeatDelay() >> 16, new char[]{53857, 391, 1248, 515, 59436, 39602, 3746, 2380, 19736, 26940, 47374, 46728, 9611, 5589, 63321, 23728, 36297, 22616, 55909, 3703, 28099, 362, 10338, 60865, 588, 28126, 33359, 8459, 33367, 51594, 17985, 14163, 34632, 8013, 20564, 49916, 20819, 28480, 48263, 63184, 30888, 17714, 23520, 15429, 50058, 48561}, new char[]{10722, 63406, 11901, 2471}, new char[]{11515, 50097, 543, 65091}, objArr);
        asBinder = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((char) (8402 - View.getDefaultSize(0, 0)), TextUtils.getOffsetBefore("", 0), new char[]{36916, 6791, 10420, 24543, 8209, 3440, 36942, 899, 3343, 35912, 52641, 25091, 44769, 55974, 37166, 60074, 35293, 10130, 39053, 30033, 34208, 15700, 14163, 42800, 35858, 19138, 56299, 21837}, new char[]{10722, 63406, 11901, 2471}, new char[]{47236, 49575, 54007, 18976}, objArr2);
        onExtraCallbackWithResult = ((String) objArr2[0]).intern();
        asInterface = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().IAuthTabCallbackDefault("application/id3").onNavigationEvent();
        IAuthTabCallbackDefault = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().IAuthTabCallbackDefault("application/x-scte35").onNavigationEvent();
        int i2 = getInterfaceDescriptor + 59;
        access100 = i2 % 128;
        int i3 = i2 % 2;
    }

    public MenuKtExternalSyntheticLambda3(String str, String str2, long j, long j2, byte[] bArr) {
        this.onWarmupCompleted = str;
        this.IAuthTabCallbackStub = str2;
        this.IAuthTabCallback = j;
        this.onExtraCallback = j2;
        this.onNavigationEvent = bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049 A[PHI: r2
      0x0049: PHI (r2v15 java.lang.String) = (r2v4 java.lang.String), (r2v17 java.lang.String) binds: [B:12:0x0039, B:7:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BasicTextContextMenuProviderKtExternalSyntheticLambda4 onWarmupCompleted() throws Throwable {
        String str;
        Object[] objArr;
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 41;
        extraCallbackWithResult = i3 % 128;
        char c = 65535;
        if (i3 % 2 == 0) {
            str = this.onWarmupCompleted;
            int iHashCode = str.hashCode();
            int i4 = 10 / 0;
            if (iHashCode != -1468477611) {
                if (iHashCode != -795945609) {
                    if (iHashCode != 1303648457) {
                        int i5 = extraCallbackWithResult + 23;
                        ICustomTabsCallback = i5 % 128;
                        if (i5 % 2 != 0) {
                            int i6 = 4 % 4;
                        }
                    } else {
                        Object[] objArr2 = new Object[1];
                        a((char) (ViewConfiguration.getScrollBarSize() >> 8), TextUtils.getTrimmedLength(""), new char[]{53857, 391, 1248, 515, 59436, 39602, 3746, 2380, 19736, 26940, 47374, 46728, 9611, 5589, 63321, 23728, 36297, 22616, 55909, 3703, 28099, 362, 10338, 60865, 588, 28126, 33359, 8459, 33367, 51594, 17985, 14163, 34632, 8013, 20564, 49916, 20819, 28480, 48263, 63184, 30888, 17714, 23520, 15429, 50058, 48561}, new char[]{10722, 63406, 11901, 2471}, new char[]{11515, 50097, 543, 65091}, objArr2);
                        if (str.equals(((String) objArr2[0]).intern())) {
                            c = 2;
                        }
                    }
                }
                objArr = new Object[1];
                a((char) (TextUtils.indexOf("", "", 0, 0) + 8402), ViewConfiguration.getScrollBarSize() >> 8, new char[]{36916, 6791, 10420, 24543, 8209, 3440, 36942, 899, 3343, 35912, 52641, 25091, 44769, 55974, 37166, 60074, 35293, 10130, 39053, 30033, 34208, 15700, 14163, 42800, 35858, 19138, 56299, 21837}, new char[]{10722, 63406, 11901, 2471}, new char[]{47236, 49575, 54007, 18976}, objArr);
                if (str.equals(((String) objArr[0]).intern())) {
                    c = 1;
                }
            }
            if (str.equals("urn:scte:scte35:2014:bin")) {
                int i7 = extraCallbackWithResult + 95;
                ICustomTabsCallback = i7 % 128;
                int i8 = i7 % 2;
                c = 0;
            }
        } else {
            str = this.onWarmupCompleted;
            int iHashCode2 = str.hashCode();
            if (iHashCode2 != -1468477611) {
                if (iHashCode2 != -795945609) {
                    if (iHashCode2 != 1303648457) {
                    }
                }
                objArr = new Object[1];
                a((char) (TextUtils.indexOf("", "", 0, 0) + 8402), ViewConfiguration.getScrollBarSize() >> 8, new char[]{36916, 6791, 10420, 24543, 8209, 3440, 36942, 899, 3343, 35912, 52641, 25091, 44769, 55974, 37166, 60074, 35293, 10130, 39053, 30033, 34208, 15700, 14163, 42800, 35858, 19138, 56299, 21837}, new char[]{10722, 63406, 11901, 2471}, new char[]{47236, 49575, 54007, 18976}, objArr);
                if (str.equals(((String) objArr[0]).intern())) {
                }
            }
            if (str.equals("urn:scte:scte35:2014:bin")) {
            }
        }
        if (c == 0) {
            return IAuthTabCallbackDefault;
        }
        if (c == 1 || c == 2) {
            return asInterface;
        }
        return null;
    }

    public byte[] onExtraCallback() throws Throwable {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 79;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            onWarmupCompleted();
            throw null;
        }
        if (onWarmupCompleted() != null) {
            return this.onNavigationEvent;
        }
        int i4 = extraCallbackWithResult + 41;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int hashCode() {
        String str;
        int iHashCode;
        String str2;
        int i2 = 2 % 2;
        if (this.onTransact == 0) {
            int i3 = extraCallbackWithResult + 105;
            ICustomTabsCallback = i3 % 128;
            int iHashCode2 = 0;
            if (i3 % 2 != 0) {
                str = this.onWarmupCompleted;
                iHashCode = 1;
                if (str != null) {
                    iHashCode2 = 1;
                    iHashCode = iHashCode2;
                    iHashCode2 = str.hashCode();
                }
                str2 = this.IAuthTabCallbackStub;
                if (str2 != null) {
                    int i4 = ICustomTabsCallback + 85;
                    extraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    iHashCode = str2.hashCode();
                }
                long j = this.IAuthTabCallback;
                long j2 = this.onExtraCallback;
                this.onTransact = ((((((((iHashCode2 + 527) * 31) + iHashCode) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Arrays.hashCode(this.onNavigationEvent);
            } else {
                str = this.onWarmupCompleted;
                if (str != null) {
                    iHashCode = iHashCode2;
                    iHashCode2 = str.hashCode();
                } else {
                    iHashCode = 0;
                }
                str2 = this.IAuthTabCallbackStub;
                if (str2 != null) {
                }
                long j3 = this.IAuthTabCallback;
                long j22 = this.onExtraCallback;
                this.onTransact = ((((((((iHashCode2 + 527) * 31) + iHashCode) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j22 ^ (j22 >>> 32)))) * 31) + Arrays.hashCode(this.onNavigationEvent);
            }
        }
        return this.onTransact;
    }

    private static void a(char c, int i2, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
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
        cArr5[2] = (char) (cArr5[2] + ((char) i2));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i5 = $11 + 115;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i7 = $11 + 67;
            $10 = i7 % 128;
            int i8 = i7 % i3;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 43 - (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.indexOf("", "", 0) + 1451, 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 + 1);
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 49124), 44 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1495 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 1533236389, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23971 - TextUtils.lastIndexOf("", '0', 0, 0)), 50 - (ViewConfiguration.getLongPressTimeout() >> 16), View.MeasureSpec.getSize(0) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 45848), ExpandableListView.getPackedPositionGroup(0L) + 29, 12577 - (ViewConfiguration.getWindowTouchSlop() >> 8), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                            cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (IAuthTabCallbackStubProxy ^ 7798559133331975163L)) ^ ((int) (access000 ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallback_Parcel ^ 7798559133331975163L)));
                            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                            i3 = 2;
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
        String str = new String(cArr6);
        int i9 = $11 + 15;
        $10 = i9 % 128;
        int i10 = i9 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 25;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (obj != null && MenuKtExternalSyntheticLambda3.class == obj.getClass()) {
            int i5 = extraCallbackWithResult + 23;
            int i6 = i5 % 128;
            ICustomTabsCallback = i6;
            int i7 = i5 % 2;
            MenuKtExternalSyntheticLambda3 menuKtExternalSyntheticLambda3 = (MenuKtExternalSyntheticLambda3) obj;
            if (this.IAuthTabCallback == menuKtExternalSyntheticLambda3.IAuthTabCallback && this.onExtraCallback == menuKtExternalSyntheticLambda3.onExtraCallback) {
                int i8 = i6 + 73;
                extraCallbackWithResult = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 74 / 0;
                    if (Objects.equals(this.onWarmupCompleted, menuKtExternalSyntheticLambda3.onWarmupCompleted)) {
                        if (Objects.equals(this.IAuthTabCallbackStub, menuKtExternalSyntheticLambda3.IAuthTabCallbackStub) && Arrays.equals(this.onNavigationEvent, menuKtExternalSyntheticLambda3.onNavigationEvent)) {
                            return true;
                        }
                    }
                } else if (!(!Objects.equals(this.onWarmupCompleted, menuKtExternalSyntheticLambda3.onWarmupCompleted))) {
                }
            }
        }
        return false;
    }

    public String toString() {
        int i2 = 2 % 2;
        String str = "EMSG: scheme=" + this.onWarmupCompleted + ", id=" + this.onExtraCallback + ", durationMs=" + this.IAuthTabCallback + ", value=" + this.IAuthTabCallbackStub;
        int i3 = extraCallbackWithResult + 97;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void onExtraCallbackWithResult() {
        IAuthTabCallbackStubProxy = 7322046276328964633L;
        access000 = -1776194565;
        IAuthTabCallback_Parcel = (char) 27643;
    }
}
