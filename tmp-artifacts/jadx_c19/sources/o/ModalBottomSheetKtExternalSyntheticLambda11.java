package o;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.Nullable;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import o.HandwritingHandlerNodeExternalSyntheticLambda0;
import o.TextFieldBufferExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ModalBottomSheetKtExternalSyntheticLambda11 implements HandwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface;
    private static int[] onTransact = {-820155532, 614899984, -1506066563, 65182129, 1030791677, -2107844646, 638803443, -2129697819, 770131654, 1648506041, 460817712, 1755253792, -963296837, 230136177, 112537214, 333017554, 823120827, 678620268};
    public final String IAuthTabCallback;
    public final String asBinder;
    public final boolean onExtraCallback;
    public final String onExtraCallbackWithResult;
    public final int onNavigationEvent;
    public final int onWarmupCompleted;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ModalBottomSheetKtExternalSyntheticLambda11 IAuthTabCallback(Map<String, List<String>> map) throws Throwable {
        int i2;
        boolean z;
        List<String> list;
        String str;
        List<String> list2;
        String str2;
        List<String> list3;
        String str3;
        List<String> list4;
        boolean zEquals;
        List<String> list5;
        int i3;
        int i4;
        int i5 = 2 % 2;
        List<String> list6 = map.get("icy-br");
        int i6 = -1;
        boolean z2 = true;
        if (list6 != null) {
            int i7 = IAuthTabCallbackStub + 3;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
            String str4 = list6.get(0);
            try {
                i4 = Integer.parseInt(str4) * 1000;
            } catch (NumberFormatException unused) {
                i4 = -1;
            }
            if (i4 > 0) {
                z = true;
                i2 = i4;
            } else {
                try {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("IcyHeaders", "Invalid bitrate: " + str4);
                    i4 = -1;
                } catch (NumberFormatException unused2) {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("IcyHeaders", "Invalid bitrate header: " + str4);
                    z = false;
                    i2 = i4;
                    list = map.get("icy-genre");
                    if (list == null) {
                    }
                    list2 = map.get("icy-name");
                    if (list2 == null) {
                    }
                    list3 = map.get("icy-url");
                    if (list3 == null) {
                    }
                    list4 = map.get("icy-pub");
                    if (list4 == null) {
                    }
                    list5 = map.get("icy-metaint");
                    if (list5 != null) {
                    }
                    int i9 = asInterface + 33;
                    IAuthTabCallbackStub = i9 % 128;
                    int i10 = i9 % 2;
                    if (z) {
                    }
                    int i11 = IAuthTabCallbackStub + 75;
                    asInterface = i11 % 128;
                    int i12 = i11 % 2;
                    return modalBottomSheetKtExternalSyntheticLambda11;
                }
                z = false;
                i2 = i4;
            }
        } else {
            i2 = -1;
            z = false;
        }
        list = map.get("icy-genre");
        if (list == null) {
            str = list.get(0);
            z = true;
        } else {
            str = null;
        }
        list2 = map.get("icy-name");
        if (list2 == null) {
            str2 = list2.get(0);
            z = true;
        } else {
            str2 = null;
        }
        list3 = map.get("icy-url");
        if (list3 == null) {
            int i13 = IAuthTabCallbackStub + 39;
            asInterface = i13 % 128;
            int i14 = i13 % 2;
            str3 = list3.get(0);
            z = true;
        } else {
            str3 = null;
        }
        list4 = map.get("icy-pub");
        if (list4 == null) {
            int i15 = asInterface + 125;
            IAuthTabCallbackStub = i15 % 128;
            if (i15 % 2 == 0) {
                String str5 = list4.get(0);
                Object[] objArr = new Object[1];
                a(new int[]{1075057259, 231479893}, (ViewConfiguration.getScrollFriction() > 1.0f ? 1 : (ViewConfiguration.getScrollFriction() == 1.0f ? 0 : -1)), objArr);
                zEquals = str5.equals(((String) objArr[0]).intern());
                z = false;
            } else {
                String str6 = list4.get(0);
                Object[] objArr2 = new Object[1];
                a(new int[]{1075057259, 231479893}, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr2);
                zEquals = str6.equals(((String) objArr2[0]).intern());
                z = true;
            }
        } else {
            zEquals = false;
        }
        list5 = map.get("icy-metaint");
        if (list5 != null) {
            String str7 = list5.get(0);
            try {
                i3 = Integer.parseInt(str7);
            } catch (NumberFormatException unused3) {
            }
            if (i3 > 0) {
                int i16 = IAuthTabCallbackStub + 81;
                asInterface = i16 % 128;
                int i17 = i16 % 2;
                i6 = i3;
                z = z2;
            } else {
                try {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("IcyHeaders", "Invalid metadata interval: " + str7);
                } catch (NumberFormatException unused4) {
                    i6 = i3;
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("IcyHeaders", "Invalid metadata interval: " + str7);
                    z2 = z;
                    z = z2;
                    int i92 = asInterface + 33;
                    IAuthTabCallbackStub = i92 % 128;
                    int i102 = i92 % 2;
                    if (z) {
                    }
                    int i112 = IAuthTabCallbackStub + 75;
                    asInterface = i112 % 128;
                    int i122 = i112 % 2;
                    return modalBottomSheetKtExternalSyntheticLambda11;
                }
                z2 = z;
                z = z2;
            }
        }
        int i922 = asInterface + 33;
        IAuthTabCallbackStub = i922 % 128;
        int i1022 = i922 % 2;
        ModalBottomSheetKtExternalSyntheticLambda11 modalBottomSheetKtExternalSyntheticLambda11 = z ? new ModalBottomSheetKtExternalSyntheticLambda11(i2, str, str2, str3, zEquals, i6) : null;
        int i1122 = IAuthTabCallbackStub + 75;
        asInterface = i1122 % 128;
        int i1222 = i1122 % 2;
        return modalBottomSheetKtExternalSyntheticLambda11;
    }

    private static void a(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = onTransact;
        int i4 = -1469660336;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i5 = 0;
            while (i5 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), 71 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 8848 - TextUtils.getOffsetAfter("", 0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr4[i5] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i5++;
                    int i6 = $11 + 81;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                    i4 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = onTransact;
        if (iArr6 != null) {
            int i8 = $11 + 23;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            for (int i9 = 0; i9 < length; i9++) {
                Object[] objArr3 = {Integer.valueOf(iArr6[i9])};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16777216), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 71, Gravity.getAbsoluteGravity(0, 0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr2[i9] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            }
            int i10 = $10 + 1;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            iArr6 = iArr2;
        }
        System.arraycopy(iArr6, 0, iArr5, 0, length3);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            int i12 = $11 + 113;
            $10 = i12 % 128;
            int i13 = 2;
            int i14 = i12 % 2;
            int i15 = 0;
            while (i15 < 16) {
                int i16 = $11 + 41;
                $10 = i16 % 128;
                int i17 = i16 % i13;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[i15];
                try {
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 22252), 39 - (ViewConfiguration.getFadingEdgeLength() >> 16), 10301 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i15++;
                    i13 = 2;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i18;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr5[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[17];
            int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - View.resolveSize(0, 0)), 77 - ((byte) KeyEvent.getModifierMetaStateMask()), 7398 - (ViewConfiguration.getEdgeSlop() >> 16), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    public ModalBottomSheetKtExternalSyntheticLambda11(int i2, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z, int i3) {
        boolean z2 = true;
        if (i3 != -1 && i3 <= 0) {
            int i4 = asInterface + 13;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                z2 = false;
            }
        }
        int i5 = 2 % 2;
        RecordingInputConnection_androidKt.onNavigationEvent(z2);
        this.onWarmupCompleted = i2;
        this.IAuthTabCallback = str;
        this.onExtraCallbackWithResult = str2;
        this.asBinder = str3;
        this.onExtraCallback = z;
        this.onNavigationEvent = i3;
        int i6 = asInterface + 91;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
    }

    public void onWarmupCompleted(TextFieldBufferExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult) {
        int i2 = 2 % 2;
        int i3 = asInterface + 121;
        int i4 = i3 % 128;
        IAuthTabCallbackStub = i4;
        int i5 = i3 % 2;
        String str = this.onExtraCallbackWithResult;
        if (str != null) {
            int i6 = i4 + 109;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            onextracallbackwithresult.IAuthTabCallbackDefault(str);
        }
        String str2 = this.IAuthTabCallback;
        if (str2 != null) {
            onextracallbackwithresult.asInterface(str2);
            int i8 = IAuthTabCallbackStub + 63;
            asInterface = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = IAuthTabCallbackStub + 113;
            asInterface = i3 % 128;
            return i3 % 2 == 0;
        }
        if (obj != null && ModalBottomSheetKtExternalSyntheticLambda11.class == obj.getClass()) {
            int i4 = IAuthTabCallbackStub + 119;
            int i5 = i4 % 128;
            asInterface = i5;
            Object obj2 = null;
            if (i4 % 2 != 0) {
                int i6 = ((ModalBottomSheetKtExternalSyntheticLambda11) obj).onWarmupCompleted;
                throw null;
            }
            ModalBottomSheetKtExternalSyntheticLambda11 modalBottomSheetKtExternalSyntheticLambda11 = (ModalBottomSheetKtExternalSyntheticLambda11) obj;
            if (this.onWarmupCompleted == modalBottomSheetKtExternalSyntheticLambda11.onWarmupCompleted) {
                int i7 = i5 + 41;
                IAuthTabCallbackStub = i7 % 128;
                if (i7 % 2 == 0) {
                    Objects.equals(this.IAuthTabCallback, modalBottomSheetKtExternalSyntheticLambda11.IAuthTabCallback);
                    obj2.hashCode();
                    throw null;
                }
                if (Objects.equals(this.IAuthTabCallback, modalBottomSheetKtExternalSyntheticLambda11.IAuthTabCallback) && Objects.equals(this.onExtraCallbackWithResult, modalBottomSheetKtExternalSyntheticLambda11.onExtraCallbackWithResult) && Objects.equals(this.asBinder, modalBottomSheetKtExternalSyntheticLambda11.asBinder) && this.onExtraCallback == modalBottomSheetKtExternalSyntheticLambda11.onExtraCallback && this.onNavigationEvent == modalBottomSheetKtExternalSyntheticLambda11.onNavigationEvent) {
                    int i8 = IAuthTabCallbackStub + 47;
                    asInterface = i8 % 128;
                    return i8 % 2 == 0;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i2 = 2 % 2;
        int i3 = this.onWarmupCompleted;
        String str = this.IAuthTabCallback;
        int iHashCode3 = 0;
        if (str != null) {
            int i4 = IAuthTabCallbackStub + 45;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = str.hashCode();
        } else {
            iHashCode = 0;
        }
        String str2 = this.onExtraCallbackWithResult;
        if (str2 != null) {
            int i6 = IAuthTabCallbackStub + 103;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            iHashCode2 = str2.hashCode();
        } else {
            iHashCode2 = 0;
        }
        String str3 = this.asBinder;
        if (str3 != null) {
            int i8 = IAuthTabCallbackStub + 111;
            asInterface = i8 % 128;
            if (i8 % 2 != 0) {
                int iHashCode4 = str3.hashCode();
                int i9 = 16 / 0;
                iHashCode3 = iHashCode4;
            } else {
                iHashCode3 = str3.hashCode();
            }
        }
        return ((((((((((i3 + 527) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (this.onExtraCallback ? 1 : 0)) * 31) + this.onNavigationEvent;
    }

    public String toString() {
        int i2 = 2 % 2;
        String str = "IcyHeaders: name=\"" + this.onExtraCallbackWithResult + "\", genre=\"" + this.IAuthTabCallback + "\", bitrate=" + this.onWarmupCompleted + ", metadataInterval=" + this.onNavigationEvent;
        int i3 = asInterface + 77;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
