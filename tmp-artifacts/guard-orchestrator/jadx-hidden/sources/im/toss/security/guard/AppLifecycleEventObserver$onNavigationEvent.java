package im.toss.security.guard;

import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TextFieldKeyInputExternalSyntheticLambda9;

/* loaded from: classes.dex */
public final /* synthetic */ class AppLifecycleEventObserver$onNavigationEvent {
    static int IAuthTabCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(AppLifecycleEventObserver$onNavigationEvent.class);
    public static final /* synthetic */ int[] onExtraCallbackWithResult;

    static {
        int[] iArr = new int[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.values().length];
        try {
            iArr[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_START.ordinal()] = 1;
            int i = IAuthTabCallback;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2462);
            int i2 = i & iOnWarmupCompleted;
            if ((((((i ^ iOnWarmupCompleted) | i2) & (~i2)) >> 8) & 1) == 0) {
                int i3 = 2 % 2;
            }
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_STOP.ordinal()] = 2;
            int i4 = IAuthTabCallback;
            int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5161);
            int i5 = i4 & iOnWarmupCompleted2;
            if ((((((i4 ^ iOnWarmupCompleted2) | i5) & (~i5)) >> 22) & 1) == 0) {
                int i6 = 3 % 3;
            } else {
                int i7 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_DESTROY.ordinal()] = 3;
            int i8 = IAuthTabCallback;
            int iOnWarmupCompleted3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5014);
            int i9 = i8 & iOnWarmupCompleted3;
            if ((((((i8 ^ iOnWarmupCompleted3) | i9) & (~i9)) >> 1) & 1) != 0) {
                int i10 = 2 % 2;
            }
        } catch (NoSuchFieldError unused3) {
        }
        onExtraCallbackWithResult = iArr;
        int i11 = IAuthTabCallback;
        int iOnWarmupCompleted4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2171);
        int i12 = (~iOnWarmupCompleted4) & i11;
        int i13 = (~i11) & iOnWarmupCompleted4;
        if (((((i13 & i12) | (i12 ^ i13)) >> 13) & 1) == 0) {
            int i14 = 51 / 0;
        }
    }
}
