package o;

import com.google.zxing.datamatrix.encoder.C40Encoder;
import java.util.List;
import kotlin.collections.CollectionsKt;
import o.IconRoundCornerProgressBarOnIconClickListener;

/* loaded from: classes.dex */
public final class AppLovinAdBase {
    private static final List<IconRoundCornerProgressBarOnIconClickListener> IAuthTabCallback;
    private static final IconRoundCornerProgressBarOnIconClickListener IAuthTabCallbackDefault;
    private static final IconRoundCornerProgressBarOnIconClickListener IAuthTabCallbackStub;
    private static final IconRoundCornerProgressBarOnIconClickListener onExtraCallback;
    static int onExtraCallbackWithResult = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(AppLovinAdBase.class);
    private static final IconRoundCornerProgressBarOnIconClickListener onNavigationEvent;
    private static final IconRoundCornerProgressBarOnIconClickListener onTransact;
    private static final IconRoundCornerProgressBarOnIconClickListener onWarmupCompleted;

    public static /* synthetic */ Object onNavigationEvent(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i5;
        int i9 = ~(i7 | i8);
        int i10 = ~i;
        int i11 = i9 | (~(i10 | i5));
        int i12 = i8 | i4;
        int i13 = ~(i12 | i);
        int i14 = (~(i5 | i7)) | (~(i8 | i10)) | (~i12);
        int i15 = i4 + i + i6 + (1650861130 * i2) + ((-924421097) * i3);
        int i16 = i15 * i15;
        int i17 = (i4 * (-405912681)) + 1474035712 + ((-405912681) * i) + (i11 * (-1619411862)) + (1619411862 * i13) + ((-1619411862) * i14) + ((-2025324544) * i6) + (986710016 * i2) + ((-948436992) * i3) + ((-1864630272) * i16);
        int i18 = ((i4 * (-959335331)) - 587927435) + (i * (-959335331)) + (i11 * 462) + (i13 * (-462)) + (i14 * 462) + (i6 * (-959334869)) + (i2 * 22983790) + (i3 * 637852125) + (i16 * (-1124859904));
        int i19 = i17 + (i18 * i18 * (-1807482880));
        return i19 != 1 ? i19 != 2 ? i19 != 3 ? i19 != 4 ? onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr) : IAuthTabCallback(objArr) : onExtraCallback(objArr);
    }

    static {
        IconRoundCornerProgressBarOnIconClickListener iconRoundCornerProgressBarOnIconClickListenerOnWarmupCompleted;
        IconRoundCornerProgressBarSavedState1 iconRoundCornerProgressBarSavedState1;
        IconRoundCornerProgressBarOnIconClickListener[] iconRoundCornerProgressBarOnIconClickListenerArr;
        IconRoundCornerProgressBarOnIconClickListener.onExtraCallback onextracallback = IconRoundCornerProgressBarOnIconClickListener.Companion;
        char c = 1;
        IconRoundCornerProgressBarOnIconClickListener iconRoundCornerProgressBarOnIconClickListenerOnWarmupCompleted2 = onextracallback.onWarmupCompleted(2, true, IconRoundCornerProgressBarSavedState1.DEBUGGER);
        onNavigationEvent = iconRoundCornerProgressBarOnIconClickListenerOnWarmupCompleted2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(432);
        IconRoundCornerProgressBarOnIconClickListener iconRoundCornerProgressBarOnIconClickListenerOnWarmupCompleted3 = onextracallback.onWarmupCompleted(4, false, IconRoundCornerProgressBarSavedState1.EMULATOR);
        onWarmupCompleted = iconRoundCornerProgressBarOnIconClickListenerOnWarmupCompleted3;
        int i = onExtraCallbackWithResult;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4290);
        int i2 = (~iOnWarmupCompleted) & i;
        int i3 = (~i) & iOnWarmupCompleted;
        int i4 = 16;
        if (((((i3 & i2) | (i2 ^ i3)) >> 23) & 1) == 0) {
            iconRoundCornerProgressBarOnIconClickListenerOnWarmupCompleted = onextracallback.onWarmupCompleted(16, true, IconRoundCornerProgressBarSavedState1.ROOT);
            IAuthTabCallbackStub = iconRoundCornerProgressBarOnIconClickListenerOnWarmupCompleted;
            iconRoundCornerProgressBarSavedState1 = IconRoundCornerProgressBarSavedState1.HOOK;
            i4 = 0;
        } else {
            iconRoundCornerProgressBarOnIconClickListenerOnWarmupCompleted = onextracallback.onWarmupCompleted(16, false, IconRoundCornerProgressBarSavedState1.ROOT);
            IAuthTabCallbackStub = iconRoundCornerProgressBarOnIconClickListenerOnWarmupCompleted;
            iconRoundCornerProgressBarSavedState1 = IconRoundCornerProgressBarSavedState1.HOOK;
        }
        IconRoundCornerProgressBarOnIconClickListener iconRoundCornerProgressBarOnIconClickListenerOnWarmupCompleted4 = onextracallback.onWarmupCompleted(i4, true, iconRoundCornerProgressBarSavedState1);
        onExtraCallback = iconRoundCornerProgressBarOnIconClickListenerOnWarmupCompleted4;
        IconRoundCornerProgressBarOnIconClickListener iconRoundCornerProgressBarOnIconClickListenerOnWarmupCompleted5 = onextracallback.onWarmupCompleted(64, true, IconRoundCornerProgressBarSavedState1.TAMPER_CERT);
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3181);
        onTransact = iconRoundCornerProgressBarOnIconClickListenerOnWarmupCompleted5;
        IconRoundCornerProgressBarOnIconClickListener iconRoundCornerProgressBarOnIconClickListenerOnWarmupCompleted6 = onextracallback.onWarmupCompleted(128, true, IconRoundCornerProgressBarSavedState1.VIRTUAL_ENVIRONMENT);
        int i5 = onExtraCallbackWithResult;
        int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3045);
        int i6 = i5 & iOnWarmupCompleted2;
        if ((((((i5 ^ iOnWarmupCompleted2) | i6) & (~i6)) >> 8) & 1) != 0) {
            IAuthTabCallbackDefault = iconRoundCornerProgressBarOnIconClickListenerOnWarmupCompleted6;
            iconRoundCornerProgressBarOnIconClickListenerArr = new IconRoundCornerProgressBarOnIconClickListener[72];
            iconRoundCornerProgressBarOnIconClickListenerArr[1] = iconRoundCornerProgressBarOnIconClickListenerOnWarmupCompleted2;
            c = 0;
        } else {
            IAuthTabCallbackDefault = iconRoundCornerProgressBarOnIconClickListenerOnWarmupCompleted6;
            iconRoundCornerProgressBarOnIconClickListenerArr = new IconRoundCornerProgressBarOnIconClickListener[6];
            iconRoundCornerProgressBarOnIconClickListenerArr[0] = iconRoundCornerProgressBarOnIconClickListenerOnWarmupCompleted2;
        }
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5517);
        iconRoundCornerProgressBarOnIconClickListenerArr[c] = iconRoundCornerProgressBarOnIconClickListenerOnWarmupCompleted3;
        iconRoundCornerProgressBarOnIconClickListenerArr[2] = iconRoundCornerProgressBarOnIconClickListenerOnWarmupCompleted;
        iconRoundCornerProgressBarOnIconClickListenerArr[3] = iconRoundCornerProgressBarOnIconClickListenerOnWarmupCompleted4;
        iconRoundCornerProgressBarOnIconClickListenerArr[4] = iconRoundCornerProgressBarOnIconClickListenerOnWarmupCompleted5;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2727);
        iconRoundCornerProgressBarOnIconClickListenerArr[5] = iconRoundCornerProgressBarOnIconClickListenerOnWarmupCompleted6;
        IAuthTabCallback = CollectionsKt.listOf(iconRoundCornerProgressBarOnIconClickListenerArr);
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4615);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3656);
        IconRoundCornerProgressBarOnIconClickListener iconRoundCornerProgressBarOnIconClickListener = onNavigationEvent;
        int i2 = onExtraCallbackWithResult;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2457);
        int i3 = i2 & iOnWarmupCompleted;
        if ((((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 7) & 1) != 0) {
            return iconRoundCornerProgressBarOnIconClickListener;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(6002);
        int i3 = i2 & iOnWarmupCompleted;
        int i4 = (i2 ^ iOnWarmupCompleted) | i3;
        Object obj = null;
        if ((((i4 & (~i3)) >> 1) & 1) == 0) {
            obj.hashCode();
            throw null;
        }
        IconRoundCornerProgressBarOnIconClickListener iconRoundCornerProgressBarOnIconClickListener = onWarmupCompleted;
        int i5 = onExtraCallbackWithResult;
        int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3656);
        int i6 = (~iOnWarmupCompleted2) & i5;
        int i7 = (~i5) & iOnWarmupCompleted2;
        if (((((i7 & i6) | (i6 ^ i7)) >> 7) & 1) != 0) {
            return iconRoundCornerProgressBarOnIconClickListener;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5931);
        IconRoundCornerProgressBarOnIconClickListener iconRoundCornerProgressBarOnIconClickListener = onExtraCallback;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1846);
        return iconRoundCornerProgressBarOnIconClickListener;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1505);
        IconRoundCornerProgressBarOnIconClickListener iconRoundCornerProgressBarOnIconClickListener = IAuthTabCallbackDefault;
        int i2 = onExtraCallbackWithResult;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1505);
        if (((((iOnWarmupCompleted & (~i2)) | ((~iOnWarmupCompleted) & i2)) >> 11) & 1) == 0) {
            int i3 = 46 / 0;
        }
        return iconRoundCornerProgressBarOnIconClickListener;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4709);
        int i3 = (~iOnWarmupCompleted) & i2;
        int i4 = (~i2) & iOnWarmupCompleted;
        Object obj = null;
        if (((((i4 & i3) | (i3 ^ i4)) >> 25) & 1) != 0) {
            throw null;
        }
        List<IconRoundCornerProgressBarOnIconClickListener> list = IAuthTabCallback;
        int i5 = onExtraCallbackWithResult;
        int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1235);
        if (((i5 | iOnWarmupCompleted2) & (~(i5 & iOnWarmupCompleted2)) & 1) == 0) {
            return list;
        }
        obj.hashCode();
        throw null;
    }

    public static final IconRoundCornerProgressBarOnIconClickListener IAuthTabCallback() {
        return (IconRoundCornerProgressBarOnIconClickListener) onNavigationEvent(new Object[0], 1009488450, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -1009488447, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback());
    }

    public static final List<IconRoundCornerProgressBarOnIconClickListener> onNavigationEvent() {
        return (List) onNavigationEvent(new Object[0], -1501364564, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), 1501364566, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback());
    }

    public static final IconRoundCornerProgressBarOnIconClickListener onExtraCallback() {
        return (IconRoundCornerProgressBarOnIconClickListener) onNavigationEvent(new Object[0], -937005838, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), 937005842, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback());
    }

    public static final IconRoundCornerProgressBarOnIconClickListener onExtraCallbackWithResult() {
        return (IconRoundCornerProgressBarOnIconClickListener) onNavigationEvent(new Object[0], 1795797383, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -1795797382, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback());
    }

    public static final IconRoundCornerProgressBarOnIconClickListener onWarmupCompleted() {
        return (IconRoundCornerProgressBarOnIconClickListener) onNavigationEvent(new Object[0], 1938470880, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -1938470880, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback());
    }
}
