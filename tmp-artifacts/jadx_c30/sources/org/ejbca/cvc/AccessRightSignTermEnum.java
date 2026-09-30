package org.ejbca.cvc;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public enum AccessRightSignTermEnum implements AccessRights {
    ACCESS_NONE(0),
    ACCESS_SIGN(1),
    ACCESS_QUALSIGN(2),
    ACCESS_SIGN_AND_QUALSIGN(3);

    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static long onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private byte value;

    public static AccessRightSignTermEnum valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        AccessRightSignTermEnum accessRightSignTermEnum = (AccessRightSignTermEnum) Enum.valueOf(AccessRightSignTermEnum.class, str);
        int i4 = onWarmupCompleted + 51;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return accessRightSignTermEnum;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static AccessRightSignTermEnum[] valuesCustom() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        AccessRightSignTermEnum[] accessRightSignTermEnumArrValuesCustom = values();
        if (i3 == 0) {
            return (AccessRightSignTermEnum[]) accessRightSignTermEnumArrValuesCustom.clone();
        }
        int i4 = 40 / 0;
        return (AccessRightSignTermEnum[]) accessRightSignTermEnumArrValuesCustom.clone();
    }

    static {
        onWarmupCompleted();
        int i = IAuthTabCallback + 87;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    AccessRightSignTermEnum(int i) {
        this.value = (byte) i;
    }

    public byte getValue() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.value;
        }
        throw null;
    }

    public boolean allowsSignature() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 87;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            byte b = ACCESS_SIGN.value;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if ((this.value & ACCESS_SIGN.value) != 0) {
            return true;
        }
        int i4 = i2 + 111;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 47 / 0;
        }
        return false;
    }

    public boolean allowsQualifiedSignature() {
        int i = 2 % 2;
        if ((this.value & ACCESS_QUALSIGN.value) != 0) {
            int i2 = onWarmupCompleted + 75;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = onWarmupCompleted + 115;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return false;
        }
        throw null;
    }

    @Override // org.ejbca.cvc.AccessRights
    public byte[] getEncoded() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return new byte[]{this.value};
        }
        byte[] bArr = new byte[0];
        bArr[1] = this.value;
        return bArr;
    }

    /* renamed from: org.ejbca.cvc.AccessRightSignTermEnum$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$ejbca$cvc$AccessRightSignTermEnum;

        static {
            int[] iArr = new int[AccessRightSignTermEnum.valuesCustom().length];
            $SwitchMap$org$ejbca$cvc$AccessRightSignTermEnum = iArr;
            try {
                iArr[AccessRightSignTermEnum.ACCESS_SIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$ejbca$cvc$AccessRightSignTermEnum[AccessRightSignTermEnum.ACCESS_QUALSIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$ejbca$cvc$AccessRightSignTermEnum[AccessRightSignTermEnum.ACCESS_SIGN_AND_QUALSIGN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$ejbca$cvc$AccessRightSignTermEnum[AccessRightSignTermEnum.ACCESS_NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int i4 = AnonymousClass1.$SwitchMap$org$ejbca$cvc$AccessRightSignTermEnum[ordinal()];
        if (i4 == 1) {
            return "Signature";
        }
        if (i4 != 2) {
            int i5 = onWarmupCompleted + 17;
            int i6 = i5 % 128;
            onNavigationEvent = i6;
            int i7 = i5 % 2;
            if (i4 == 3) {
                return "Signature_and_Qualified_Signature";
            }
            int i8 = i6 + 65;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 == 0 ? i4 == 4 : i4 == 4) {
                Object[] objArr = new Object[1];
                a(new char[]{31977, 26772, 2654, 14421, 31879, 9739, 38864, 54496}, TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0), objArr);
                return ((String) objArr[0]).intern();
            }
            throw new IllegalStateException("Enum case not handled");
        }
        return "Qualified_Signature";
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallbackWithResult ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $10 + 43;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 45812), 84 - (ViewConfiguration.getLongPressTimeout() >> 16), 21233 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 14186), 20 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 8808 - Color.alpha(0), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i6 = $11 + 1;
                $10 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    static void onWarmupCompleted() {
        onExtraCallbackWithResult = -2823176494711163396L;
    }
}
