package org.ejbca.cvc;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISOFileInfo;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public enum AccessRightEnum implements AccessRights {
    READ_ACCESS_NONE(0),
    READ_ACCESS_DG3(1),
    READ_ACCESS_DG4(2),
    READ_ACCESS_DG3_AND_DG4(3);

    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] IAuthTabCallback = null;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private byte value;

    public static AccessRightEnum valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        AccessRightEnum accessRightEnum = (AccessRightEnum) Enum.valueOf(AccessRightEnum.class, str);
        int i4 = onExtraCallbackWithResult + 103;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return accessRightEnum;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static AccessRightEnum[] valuesCustom() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        AccessRightEnum[] accessRightEnumArr = (AccessRightEnum[]) values().clone();
        int i4 = onExtraCallbackWithResult + 71;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return accessRightEnumArr;
    }

    static {
        IAuthTabCallback();
        int i = onExtraCallback + 71;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    AccessRightEnum(int i) {
        this.value = (byte) i;
    }

    public byte getValue() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        byte b = this.value;
        if (i3 != 0) {
            int i4 = 18 / 0;
        }
        return b;
    }

    public boolean hasDG3() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        if ((this.value & READ_ACCESS_DG3.value) == 0) {
            return false;
        }
        int i5 = i3 + 95;
        int i6 = i5 % 128;
        onNavigationEvent = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 55;
        onExtraCallbackWithResult = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    public boolean hasDG4() {
        int i = 2 % 2;
        if ((this.value & READ_ACCESS_DG4.value) == 0) {
            return false;
        }
        int i2 = onNavigationEvent;
        int i3 = i2 + 61;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 97;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    @Override // org.ejbca.cvc.AccessRights
    public byte[] getEncoded() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 75;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArr = {this.value};
        int i5 = i2 + 59;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return bArr;
    }

    /* renamed from: org.ejbca.cvc.AccessRightEnum$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$ejbca$cvc$AccessRightEnum;

        static {
            int[] iArr = new int[AccessRightEnum.valuesCustom().length];
            $SwitchMap$org$ejbca$cvc$AccessRightEnum = iArr;
            try {
                iArr[AccessRightEnum.READ_ACCESS_DG3_AND_DG4.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$ejbca$cvc$AccessRightEnum[AccessRightEnum.READ_ACCESS_DG4.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$ejbca$cvc$AccessRightEnum[AccessRightEnum.READ_ACCESS_DG3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$ejbca$cvc$AccessRightEnum[AccessRightEnum.READ_ACCESS_NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() throws Throwable {
        int i = 2 % 2;
        int i2 = AnonymousClass1.$SwitchMap$org$ejbca$cvc$AccessRightEnum[ordinal()];
        if (i2 == 1) {
            return "DG3+DG4";
        }
        if (i2 == 2) {
            return "DG4";
        }
        if (i2 == 3) {
            return "DG3";
        }
        if (i2 != 4) {
            throw new IllegalStateException("Enum case not handled");
        }
        int i3 = onExtraCallbackWithResult + 119;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        a(new int[]{0, 4, 0, 1}, false, new byte[]{1, 1, 1, 1}, objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i5 = onExtraCallbackWithResult + 113;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 20 / 0;
        }
        return strIntern;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = IAuthTabCallback;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 49;
                $10 = i8 % 128;
                int i9 = i8 % i;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myTid() >> 22) + 35283), (ViewConfiguration.getWindowTouchSlop() >> 8) + 35, ((byte) KeyEvent.getModifierMetaStateMask()) + ISOFileInfo.A0, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i7++;
                    i = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.blue(0) + 10935), 65 - (ViewConfiguration.getTapTimeout() >> 16), TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0) + 16719, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), (ViewConfiguration.getLongPressTimeout() >> 16) + 29, 17657 - Color.argb(0, 0, 0, 0), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - View.combineMeasuredStates(0, 0)), 70 - (ViewConfiguration.getEdgeSlop() >> 16), 12486 - View.getDefaultSize(0, 0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i12 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i12, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i12);
        }
        if (!(!z)) {
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i13 = $11 + 65;
                $10 = i13 % 128;
                int i14 = i13 % 2;
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void IAuthTabCallback() {
        IAuthTabCallback = new char[]{27260, 27175, 27168, 27168};
    }
}
