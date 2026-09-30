package o;

import android.util.DisplayMetrics;
import android.view.animation.Interpolator;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.tds.foundation.anim.rally.RallysKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AuthenticatorCompanion;
import o.attachAppLovinSdk;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AuthenticatorCompanion {
    public static final AuthenticatorCompanion IAuthTabCallback = new AuthenticatorCompanion();
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public static final /* synthetic */ class onExtraCallback {
        public static final /* synthetic */ int[] IAuthTabCallback;
        public static final /* synthetic */ int[] onExtraCallback;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[AuthenticatorCompanionAuthenticatorNone.values().length];
            try {
                iArr[AuthenticatorCompanionAuthenticatorNone.SLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AuthenticatorCompanionAuthenticatorNone.FAST.ordinal()] = 2;
                int i = onExtraCallbackWithResult + 69;
                onNavigationEvent = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            IAuthTabCallback = iArr;
            int[] iArr2 = new int[authenticate.values().length];
            try {
                iArr2[authenticate.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[authenticate.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            onExtraCallback = iArr2;
            int[] iArr3 = new int[Cache.values().length];
            try {
                iArr3[Cache.LEFT.ordinal()] = 1;
                int i4 = onExtraCallbackWithResult + 31;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[Cache.RIGHT.ordinal()] = 2;
                int i7 = onExtraCallbackWithResult + 51;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 2 % 2;
                }
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[Cache.DOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[Cache.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            onWarmupCompleted = iArr3;
        }
    }

    static {
        int i = onExtraCallback + 29;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i5;
        int i9 = (~i3) | i8;
        int i10 = i7 | (~i9);
        int i11 = i3 | i8;
        int i12 = ~(i9 | i);
        int i13 = i5 + i + i4 + (1075552530 * i2) + ((-1519595880) * i6);
        int i14 = i13 * i13;
        int i15 = (((-1050772794) * i5) - 1639710720) + ((-2116975300) * i) + (i10 * (-533101253)) + (533101253 * i11) + ((-533101253) * i12) + ((-1583874048) * i4) + ((-189792256) * i2) + (1111490560 * i6) + (1415839744 * i14);
        int i16 = (i5 * 251836610) + 257048825 + (i * 251838484) + (i10 * 937) + (i11 * (-937)) + (i12 * 937) + (i4 * 251837547) + (i2 * 1710852742) + (i6 * (-1855850104)) + (i14 * (-1244921856));
        int i17 = i15 + (i16 * i16 * (-1300496384));
        if (i17 == 1) {
            return onExtraCallback(objArr);
        }
        if (i17 == 2) {
            return onNavigationEvent(objArr);
        }
        if (i17 != 3) {
            return i17 != 4 ? IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr);
        }
        AuthenticatorCompanion authenticatorCompanion = (AuthenticatorCompanion) objArr[0];
        authenticate authenticateVar = (authenticate) objArr[1];
        AuthenticatorCompanionAuthenticatorNone authenticatorCompanionAuthenticatorNone = (AuthenticatorCompanionAuthenticatorNone) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        Object obj = objArr[4];
        int i18 = 2 % 2;
        if ((iIntValue & 2) != 0) {
            int i19 = onNavigationEvent + 71;
            onExtraCallbackWithResult = i19 % 128;
            int i20 = i19 % 2;
            authenticatorCompanionAuthenticatorNone = AuthenticatorCompanionAuthenticatorNone.FAST;
            int i21 = onNavigationEvent + 95;
            onExtraCallbackWithResult = i21 % 128;
            int i22 = i21 % 2;
        }
        return authenticatorCompanion.onExtraCallbackWithResult(authenticateVar, authenticatorCompanionAuthenticatorNone);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) objArr[0];
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(onwarmupcompleted, attachapplovinsdk);
        int i4 = onExtraCallbackWithResult + 31;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(onWarmupCompleted onwarmupcompleted, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(onwarmupcompleted, attachapplovinsdk);
        int i4 = onExtraCallbackWithResult + 39;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(authenticate authenticateVar, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(authenticateVar, attachapplovinsdk);
        int i4 = onNavigationEvent + 73;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(IAuthTabCallback iAuthTabCallback, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(iAuthTabCallback, attachapplovinsdk);
        int i4 = onExtraCallbackWithResult + 13;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(IAuthTabCallback iAuthTabCallback, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(iAuthTabCallback, attachapplovinsdk);
        if (i3 == 0) {
            int i4 = 73 / 0;
        }
        int i5 = onExtraCallbackWithResult + 27;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    private AuthenticatorCompanion() {
    }

    public final AppLovinSdkSettings onExtraCallbackWithResult(@NotNull authenticate authenticateVar, @NotNull AuthenticatorCompanionAuthenticatorNone authenticatorCompanionAuthenticatorNone) {
        Interpolator interpolatorAsInterface;
        float f;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(authenticateVar, "");
        Intrinsics.checkNotNullParameter(authenticatorCompanionAuthenticatorNone, "");
        int[] iArr = onExtraCallback.IAuthTabCallback;
        int i2 = iArr[authenticatorCompanionAuthenticatorNone.ordinal()];
        if (i2 == 1) {
            interpolatorAsInterface = Address.onNavigationEvent.asInterface();
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            interpolatorAsInterface = Address.onNavigationEvent.onWarmupCompleted();
        }
        int i3 = iArr[authenticatorCompanionAuthenticatorNone.ordinal()];
        if (i3 != 1) {
            int i4 = onNavigationEvent + 69;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0 ? i3 != 2 : i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = RallysKt.onExtraCallback(interpolatorAsInterface, 600);
        int[] iArr2 = onExtraCallback.onExtraCallback;
        int i5 = iArr2[authenticateVar.ordinal()];
        float f2 = 1.0f;
        if (i5 == 1) {
            f = 0.0f;
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i6 = onExtraCallbackWithResult + 91;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            f = 1.0f;
        }
        int i8 = iArr2[authenticateVar.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f2 = 0.0f;
        }
        return isMuted.onNavigationEvent(appLovinSdkSettingsOnExtraCallback, Float.valueOf(f), Float.valueOf(f2), (Function1) null, 4, (Object) null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(AppLovinSdkSettings appLovinSdkSettings, authenticate authenticateVar, Cache cache, boolean z, Function1<? super onWarmupCompleted, Unit> function1) throws NoWhenBranchMatchedException {
        final onWarmupCompleted onwarmupcompleted;
        float fIntValue;
        int i;
        onExtraCallbackWithResult onExtraCallbackWithResult2;
        float fFloatValue;
        float fIntValue2;
        int i2;
        onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent;
        float fFloatValue2;
        float f;
        int i3 = 2 % 2;
        Object obj = null;
        if (function1 != null) {
            onWarmupCompleted onwarmupcompleted2 = new onWarmupCompleted();
            function1.invoke(onwarmupcompleted2);
            onwarmupcompleted = onwarmupcompleted2;
        } else {
            onwarmupcompleted = null;
        }
        float fIntValue3 = 0.0f;
        if (z) {
            int[] iArr = onExtraCallback.onExtraCallback;
            int i4 = iArr[authenticateVar.ordinal()];
            float f2 = 1.0f;
            if (i4 != 1) {
                int i5 = onExtraCallbackWithResult + 39;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            int i7 = iArr[authenticateVar.ordinal()];
            if (i7 != 1) {
                int i8 = onNavigationEvent + 75;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 == 0 ? i7 != 2 : i7 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f2 = 0.0f;
            }
            isMuted.onNavigationEvent(appLovinSdkSettings, Float.valueOf(f), Float.valueOf(f2), (Function1) null, 4, (Object) null);
        }
        int[] iArr2 = onExtraCallback.onWarmupCompleted;
        int i9 = iArr2[cache.ordinal()];
        if (i9 == 1 || i9 == 2) {
            if (onwarmupcompleted != null && (onExtraCallbackWithResult2 = onwarmupcompleted.onExtraCallbackWithResult()) != null) {
                int i10 = onNavigationEvent + 81;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
                Float fOnNavigationEvent = onExtraCallbackWithResult2.onNavigationEvent();
                if (fOnNavigationEvent != null) {
                    fFloatValue = fOnNavigationEvent.floatValue();
                } else {
                    int i12 = onExtraCallback.onExtraCallback[authenticateVar.ordinal()];
                    if (i12 == 1) {
                        return;
                    }
                    int i13 = onNavigationEvent + 113;
                    onExtraCallbackWithResult = i13 % 128;
                    if (i13 % 2 == 0 ? i12 != 2 : i12 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fFloatValue = 0.0f;
                }
                Float fOnExtraCallback = onExtraCallbackWithResult2.onExtraCallback();
                if (fOnExtraCallback != null) {
                    fIntValue3 = fOnExtraCallback.floatValue();
                } else {
                    int i14 = onExtraCallback.onExtraCallback[authenticateVar.ordinal()];
                    if (i14 != 1) {
                        if (i14 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return;
                    }
                }
                isMuted.IAuthTabCallbackStubProxy(appLovinSdkSettings, Float.valueOf(fFloatValue), Float.valueOf(fIntValue3), null, 4, null);
                return;
            }
            int[] iArr3 = onExtraCallback.onExtraCallback;
            int i15 = iArr3[authenticateVar.ordinal()];
            if (i15 == 1) {
                int i16 = iArr2[cache.ordinal()];
                if (i16 == 1) {
                    fIntValue = ((Integer) IAuthTabCallback(-1125607383, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{IAuthTabCallback, 50}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1125607387, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent())).intValue();
                    int i17 = onExtraCallbackWithResult + 103;
                    onNavigationEvent = i17 % 128;
                    int i18 = i17 % 2;
                } else if (i16 == 2) {
                    fIntValue = -((Integer) IAuthTabCallback(-1125607383, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{IAuthTabCallback, 50}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1125607387, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent())).intValue();
                }
                i = iArr3[authenticateVar.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i19 = iArr2[cache.ordinal()];
                    if (i19 == 1) {
                        fIntValue3 = -((Integer) IAuthTabCallback(-1125607383, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{IAuthTabCallback, 50}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1125607387, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent())).intValue();
                    } else if (i19 == 2) {
                        fIntValue3 = ((Integer) IAuthTabCallback(-1125607383, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{IAuthTabCallback, 50}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1125607387, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent())).intValue();
                    }
                }
                isMuted.IAuthTabCallback_Parcel(appLovinSdkSettings, Float.valueOf(fIntValue), Float.valueOf(fIntValue3), new Function1() { // from class: im.toss.tds.foundation.anim.rally.transition.AnimateTransition$$ExternalSyntheticLambda0
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj2) {
                        int i20 = 2 % 2;
                        int i21 = onExtraCallbackWithResult + 63;
                        onNavigationEvent = i21 % 128;
                        int i22 = i21 % 2;
                        Object[] objArr = {onwarmupcompleted, (attachAppLovinSdk) obj2};
                        Unit unit = (Unit) AuthenticatorCompanion.IAuthTabCallback(-1527178455, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1527178455, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent());
                        int i23 = onNavigationEvent + 49;
                        onExtraCallbackWithResult = i23 % 128;
                        if (i23 % 2 != 0) {
                            return unit;
                        }
                        throw null;
                    }
                });
                return;
            }
            int i20 = onNavigationEvent + 59;
            onExtraCallbackWithResult = i20 % 128;
            if (i20 % 2 == 0 ? i15 != 2 : i15 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            fIntValue = 0.0f;
            i = iArr3[authenticateVar.ordinal()];
            if (i != 1) {
            }
            isMuted.IAuthTabCallback_Parcel(appLovinSdkSettings, Float.valueOf(fIntValue), Float.valueOf(fIntValue3), new Function1() { // from class: im.toss.tds.foundation.anim.rally.transition.AnimateTransition$$ExternalSyntheticLambda0
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj2) {
                    int i202 = 2 % 2;
                    int i21 = onExtraCallbackWithResult + 63;
                    onNavigationEvent = i21 % 128;
                    int i22 = i21 % 2;
                    Object[] objArr = {onwarmupcompleted, (attachAppLovinSdk) obj2};
                    Unit unit = (Unit) AuthenticatorCompanion.IAuthTabCallback(-1527178455, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1527178455, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent());
                    int i23 = onNavigationEvent + 49;
                    onExtraCallbackWithResult = i23 % 128;
                    if (i23 % 2 != 0) {
                        return unit;
                    }
                    throw null;
                }
            });
            return;
        }
        if (i9 != 3 && i9 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        if (onwarmupcompleted == null || (onextracallbackwithresultOnNavigationEvent = onwarmupcompleted.onNavigationEvent()) == null) {
            int[] iArr4 = onExtraCallback.onExtraCallback;
            int i21 = iArr4[authenticateVar.ordinal()];
            if (i21 == 1) {
                int i22 = iArr2[cache.ordinal()];
                if (i22 == 3) {
                    fIntValue2 = -((Integer) IAuthTabCallback(-1125607383, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{IAuthTabCallback, 80}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1125607387, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent())).intValue();
                } else if (i22 == 4) {
                    fIntValue2 = ((Integer) IAuthTabCallback(-1125607383, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{IAuthTabCallback, 80}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1125607387, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent())).intValue();
                }
                i2 = iArr4[authenticateVar.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i23 = iArr2[cache.ordinal()];
                    if (i23 != 3) {
                        int i24 = onNavigationEvent + 83;
                        onExtraCallbackWithResult = i24 % 128;
                        if (i24 % 2 == 0 ? i23 == 4 : i23 == 4) {
                            fIntValue3 = -((Integer) IAuthTabCallback(-1125607383, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{IAuthTabCallback, 80}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1125607387, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent())).intValue();
                        }
                    } else {
                        fIntValue3 = ((Integer) IAuthTabCallback(-1125607383, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{IAuthTabCallback, 80}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1125607387, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent())).intValue();
                    }
                }
                isMuted.getInterfaceDescriptor(appLovinSdkSettings, Float.valueOf(fIntValue2), Float.valueOf(fIntValue3), new Function1() { // from class: im.toss.tds.foundation.anim.rally.transition.AnimateTransition$$ExternalSyntheticLambda1
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj2) {
                        int i25 = 2 % 2;
                        int i26 = onExtraCallbackWithResult + 5;
                        onNavigationEvent = i26 % 128;
                        int i27 = i26 % 2;
                        Unit unitIAuthTabCallback = AuthenticatorCompanion.IAuthTabCallback(onwarmupcompleted, (attachAppLovinSdk) obj2);
                        int i28 = onNavigationEvent + 13;
                        onExtraCallbackWithResult = i28 % 128;
                        if (i28 % 2 == 0) {
                            int i29 = 8 / 0;
                        }
                        return unitIAuthTabCallback;
                    }
                });
                return;
            }
            if (i21 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            fIntValue2 = 0.0f;
            i2 = iArr4[authenticateVar.ordinal()];
            if (i2 != 1) {
            }
            isMuted.getInterfaceDescriptor(appLovinSdkSettings, Float.valueOf(fIntValue2), Float.valueOf(fIntValue3), new Function1() { // from class: im.toss.tds.foundation.anim.rally.transition.AnimateTransition$$ExternalSyntheticLambda1
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj2) {
                    int i25 = 2 % 2;
                    int i26 = onExtraCallbackWithResult + 5;
                    onNavigationEvent = i26 % 128;
                    int i27 = i26 % 2;
                    Unit unitIAuthTabCallback = AuthenticatorCompanion.IAuthTabCallback(onwarmupcompleted, (attachAppLovinSdk) obj2);
                    int i28 = onNavigationEvent + 13;
                    onExtraCallbackWithResult = i28 % 128;
                    if (i28 % 2 == 0) {
                        int i29 = 8 / 0;
                    }
                    return unitIAuthTabCallback;
                }
            });
            return;
        }
        Float fOnNavigationEvent2 = onextracallbackwithresultOnNavigationEvent.onNavigationEvent();
        if (fOnNavigationEvent2 != null) {
            int i25 = onExtraCallbackWithResult + 101;
            onNavigationEvent = i25 % 128;
            if (i25 % 2 == 0) {
                fOnNavigationEvent2.floatValue();
                obj.hashCode();
                throw null;
            }
            fFloatValue2 = fOnNavigationEvent2.floatValue();
        } else {
            int i26 = onExtraCallback.onExtraCallback[authenticateVar.ordinal()];
            if (i26 == 1) {
                return;
            }
            if (i26 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i27 = onExtraCallbackWithResult + 19;
            onNavigationEvent = i27 % 128;
            int i28 = i27 % 2;
            fFloatValue2 = 0.0f;
        }
        Float fOnExtraCallback2 = onextracallbackwithresultOnNavigationEvent.onExtraCallback();
        if (fOnExtraCallback2 != null) {
            int i29 = onExtraCallbackWithResult + 91;
            onNavigationEvent = i29 % 128;
            if (i29 % 2 == 0) {
                fOnExtraCallback2.floatValue();
                obj.hashCode();
                throw null;
            }
            fIntValue3 = fOnExtraCallback2.floatValue();
        } else {
            int i30 = onExtraCallback.onExtraCallback[authenticateVar.ordinal()];
            if (i30 != 1) {
                if (i30 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e A[PHI: r3
      0x003e: PHI (r3v3 java.lang.Float) = (r3v2 java.lang.Float), (r3v5 java.lang.Float) binds: [B:14:0x003c, B:11:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(onWarmupCompleted onwarmupcompleted, attachAppLovinSdk attachapplovinsdk) {
        Float fIAuthTabCallback;
        Float fOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        if (onwarmupcompleted != null && (fOnWarmupCompleted = onwarmupcompleted.onWarmupCompleted()) != null) {
            attachapplovinsdk.IAuthTabCallback(fOnWarmupCompleted.floatValue());
        }
        if (onwarmupcompleted != null) {
            int i4 = onNavigationEvent + 115;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                fIAuthTabCallback = onwarmupcompleted.IAuthTabCallback();
                int i5 = 72 / 0;
                if (fIAuthTabCallback != null) {
                    attachapplovinsdk.onExtraCallbackWithResult(fIAuthTabCallback.floatValue());
                }
            } else {
                fIAuthTabCallback = onwarmupcompleted.IAuthTabCallback();
                if (fIAuthTabCallback != null) {
                }
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(onWarmupCompleted onwarmupcompleted, attachAppLovinSdk attachapplovinsdk) {
        Float fOnExtraCallback;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        if (onwarmupcompleted != null && (fOnExtraCallback = onwarmupcompleted.onExtraCallback()) != null) {
            attachapplovinsdk.IAuthTabCallback(fOnExtraCallback.floatValue());
        }
        if (onwarmupcompleted != null) {
            int i3 = onExtraCallbackWithResult + 47;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                onwarmupcompleted.asBinder();
                obj.hashCode();
                throw null;
            }
            Float fAsBinder = onwarmupcompleted.asBinder();
            if (fAsBinder != null) {
                attachapplovinsdk.onExtraCallbackWithResult(fAsBinder.floatValue());
            }
        }
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 49;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Number number = (Number) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        DisplayMetrics displayMetrics = contentType.onExtraCallback.IAuthTabCallbackStubProxy().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(number, displayMetrics);
        int i4 = onNavigationEvent + 21;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return Integer.valueOf(iOnNavigationEvent);
        }
        throw null;
    }

    public static /* synthetic */ AppLovinSdkSettings IAuthTabCallback(AuthenticatorCompanion authenticatorCompanion, authenticate authenticateVar, Cache cache, AuthenticatorCompanionAuthenticatorNone authenticatorCompanionAuthenticatorNone, boolean z, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 77;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 4) != 0) {
            authenticatorCompanionAuthenticatorNone = AuthenticatorCompanionAuthenticatorNone.FAST;
            int i5 = onExtraCallbackWithResult + 21;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        }
        AuthenticatorCompanionAuthenticatorNone authenticatorCompanionAuthenticatorNone2 = authenticatorCompanionAuthenticatorNone;
        if ((i & 8) != 0) {
            int i7 = onNavigationEvent + 109;
            onExtraCallbackWithResult = i7 % 128;
            z = i7 % 2 == 0;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            int i8 = onNavigationEvent + 77;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            function1 = null;
        }
        return authenticatorCompanion.onExtraCallbackWithResult(authenticateVar, cache, authenticatorCompanionAuthenticatorNone2, z2, (Function1<? super onWarmupCompleted, Unit>) function1);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final AppLovinSdkSettings onExtraCallbackWithResult(@NotNull authenticate authenticateVar, @NotNull Cache cache, @NotNull AuthenticatorCompanionAuthenticatorNone authenticatorCompanionAuthenticatorNone, boolean z, @Nullable Function1<? super onWarmupCompleted, Unit> function1) throws NoWhenBranchMatchedException {
        Interpolator interpolatorAsBinder;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(authenticateVar, "");
        Intrinsics.checkNotNullParameter(cache, "");
        Intrinsics.checkNotNullParameter(authenticatorCompanionAuthenticatorNone, "");
        int[] iArr = onExtraCallback.IAuthTabCallback;
        int i3 = iArr[authenticatorCompanionAuthenticatorNone.ordinal()];
        if (i3 != 1) {
            int i4 = onNavigationEvent + 89;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            interpolatorAsBinder = Address.onNavigationEvent.onExtraCallbackWithResult();
        } else {
            interpolatorAsBinder = Address.onNavigationEvent.asBinder();
            int i6 = onExtraCallbackWithResult + 121;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 3 / 4;
            }
        }
        int i8 = iArr[authenticatorCompanionAuthenticatorNone.ordinal()];
        if (i8 == 1) {
            i = 600;
        } else {
            if (i8 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i9 = onNavigationEvent + 77;
            onExtraCallbackWithResult = i9 % 128;
            i = i9 % 2 != 0 ? 13497 : 800;
        }
        AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = RallysKt.onExtraCallback(interpolatorAsBinder, i);
        IAuthTabCallback.onNavigationEvent(appLovinSdkSettingsOnExtraCallback, authenticateVar, cache, z, function1);
        return appLovinSdkSettingsOnExtraCallback;
    }

    public static /* synthetic */ AppLovinSdkSettings onWarmupCompleted(AuthenticatorCompanion authenticatorCompanion, authenticate authenticateVar, Cache cache, AuthenticatorCompanionAuthenticatorNone authenticatorCompanionAuthenticatorNone, boolean z, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 67;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0 ? (i & 4) != 0 : (i & 3) != 0) {
            authenticatorCompanionAuthenticatorNone = AuthenticatorCompanionAuthenticatorNone.FAST;
            int i4 = onNavigationEvent + 65;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        AuthenticatorCompanionAuthenticatorNone authenticatorCompanionAuthenticatorNone2 = authenticatorCompanionAuthenticatorNone;
        if ((i & 8) != 0) {
            int i6 = onExtraCallbackWithResult + 29;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            int i8 = onExtraCallbackWithResult + 19;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            function1 = null;
        }
        return authenticatorCompanion.IAuthTabCallback(authenticateVar, cache, authenticatorCompanionAuthenticatorNone2, z2, function1);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d A[PHI: r1
      0x005d: PHI (r1v8 android.view.animation.Interpolator) = (r1v5 android.view.animation.Interpolator), (r1v10 android.view.animation.Interpolator) binds: [B:8:0x0042, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0044 A[PHI: r1 r11
      0x0044: PHI (r1v6 android.view.animation.Interpolator) = (r1v5 android.view.animation.Interpolator), (r1v10 android.view.animation.Interpolator) binds: [B:8:0x0042, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x0044: PHI (r11v3 int) = (r11v2 int), (r11v16 int) binds: [B:8:0x0042, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AppLovinSdkSettings IAuthTabCallback(@NotNull authenticate authenticateVar, @NotNull Cache cache, @NotNull AuthenticatorCompanionAuthenticatorNone authenticatorCompanionAuthenticatorNone, boolean z, @Nullable Function1<? super onWarmupCompleted, Unit> function1) throws NoWhenBranchMatchedException {
        Interpolator interpolatorIAuthTabCallback;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 103;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(authenticateVar, "");
            Intrinsics.checkNotNullParameter(cache, "");
            Intrinsics.checkNotNullParameter(authenticatorCompanionAuthenticatorNone, "");
            interpolatorIAuthTabCallback = Address.onNavigationEvent.IAuthTabCallback();
            i = onExtraCallback.IAuthTabCallback[authenticatorCompanionAuthenticatorNone.ordinal()];
            if (i == 0) {
                int i5 = onNavigationEvent + 107;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                i2 = 800;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i7 = onNavigationEvent + 75;
                onExtraCallbackWithResult = i7 % 128;
                i2 = i7 % 2 != 0 ? 18018 : 550;
            }
        } else {
            Intrinsics.checkNotNullParameter(authenticateVar, "");
            Intrinsics.checkNotNullParameter(cache, "");
            Intrinsics.checkNotNullParameter(authenticatorCompanionAuthenticatorNone, "");
            interpolatorIAuthTabCallback = Address.onNavigationEvent.IAuthTabCallback();
            i = onExtraCallback.IAuthTabCallback[authenticatorCompanionAuthenticatorNone.ordinal()];
            if (i != 1) {
            }
        }
        AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = RallysKt.onExtraCallback(interpolatorIAuthTabCallback, i2);
        IAuthTabCallback.onNavigationEvent(appLovinSdkSettingsOnExtraCallback, authenticateVar, cache, z, function1);
        return appLovinSdkSettingsOnExtraCallback;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void onExtraCallbackWithResult(AppLovinSdkSettings appLovinSdkSettings, authenticate authenticateVar) throws NoWhenBranchMatchedException {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        int i = 2 % 2;
        float f6 = 0.5f;
        Float fValueOf = Float.valueOf(0.5f);
        int[] iArr = onExtraCallback.onExtraCallback;
        int i2 = iArr[authenticateVar.ordinal()];
        float f7 = 1.0f;
        float f8 = 0.0f;
        if (i2 != 1) {
            int i3 = onExtraCallbackWithResult + 87;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        int i5 = iArr[authenticateVar.ordinal()];
        if (i5 != 1) {
            int i6 = onExtraCallbackWithResult + 107;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0 ? i5 != 2 : i5 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            f2 = 0.0f;
        } else {
            f2 = 1.0f;
        }
        isMuted.onNavigationEvent(appLovinSdkSettings, Float.valueOf(f), Float.valueOf(f2), (Function1) null, 4, (Object) null);
        int i7 = iArr[authenticateVar.ordinal()];
        if (i7 != 1) {
            int i8 = onNavigationEvent + 59;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 == 0 ? i7 != 2 : i7 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f3 = 0.0f;
        } else {
            f3 = -70.0f;
        }
        int i9 = iArr[authenticateVar.ordinal()];
        if (i9 == 1) {
            f4 = 0.0f;
        } else {
            if (i9 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f4 = 70.0f;
        }
        isMuted.IAuthTabCallback(appLovinSdkSettings, Float.valueOf(f3), Float.valueOf(f4), (Function1) null, 4, (Object) null);
        int i10 = iArr[authenticateVar.ordinal()];
        if (i10 != 1) {
            int i11 = onExtraCallbackWithResult + 27;
            onNavigationEvent = i11 % 128;
            if (i11 % 2 != 0 ? i10 != 2 : i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            f6 = 0.0f;
        }
        int i12 = iArr[authenticateVar.ordinal()];
        if (i12 != 1) {
            int i13 = onNavigationEvent + 59;
            onExtraCallbackWithResult = i13 % 128;
            int i14 = i13 % 2;
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f8 = -0.5f;
        }
        int i15 = iArr[authenticateVar.ordinal()];
        if (i15 == 1) {
            f5 = 0.8f;
        } else {
            if (i15 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i16 = onExtraCallbackWithResult + 113;
            onNavigationEvent = i16 % 128;
            f5 = i16 % 2 == 0 ? 2.0f : 1.0f;
        }
        int i17 = iArr[authenticateVar.ordinal()];
        if (i17 != 1) {
            int i18 = onExtraCallbackWithResult + 43;
            onNavigationEvent = i18 % 128;
            if (i18 % 2 != 0 ? i17 != 2 : i17 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            f7 = 0.8f;
        }
        isMuted.asBinder(appLovinSdkSettings, Float.valueOf(f5), Float.valueOf(f7), null, 4, null);
        isMuted.access000(appLovinSdkSettings, fValueOf, fValueOf, null, 4, null);
        appLovinSdkSettings.onExtraCallback(getVersionCode.STRONG);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057 A[PHI: r1
      0x0057: PHI (r1v8 int[]) = (r1v4 int[]), (r1v9 int[]) binds: [B:8:0x0030, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032 A[PHI: r1 r3
      0x0032: PHI (r1v5 int[]) = (r1v4 int[]), (r1v9 int[]) binds: [B:8:0x0030, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x0032: PHI (r3v3 int) = (r3v2 int), (r3v15 int) binds: [B:8:0x0030, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AppLovinSdkSettings IAuthTabCallback(@NotNull authenticate authenticateVar, @NotNull AuthenticatorCompanionAuthenticatorNone authenticatorCompanionAuthenticatorNone) throws NoWhenBranchMatchedException {
        int[] iArr;
        int i;
        Interpolator interpolatorOnExtraCallbackWithResult;
        int i2;
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 49;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(authenticateVar, "");
            Intrinsics.checkNotNullParameter(authenticatorCompanionAuthenticatorNone, "");
            iArr = onExtraCallback.IAuthTabCallback;
            i = iArr[authenticatorCompanionAuthenticatorNone.ordinal()];
            if (i == 1) {
                interpolatorOnExtraCallbackWithResult = Address.onNavigationEvent.asBinder();
                int i5 = onExtraCallbackWithResult + 95;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 3 / 5;
                }
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i7 = onNavigationEvent + 101;
                onExtraCallbackWithResult = i7 % 128;
                if (i7 % 2 != 0) {
                    interpolatorOnExtraCallbackWithResult = Address.onNavigationEvent.onExtraCallbackWithResult();
                    int i8 = 64 / 0;
                } else {
                    interpolatorOnExtraCallbackWithResult = Address.onNavigationEvent.onExtraCallbackWithResult();
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(authenticateVar, "");
            Intrinsics.checkNotNullParameter(authenticatorCompanionAuthenticatorNone, "");
            iArr = onExtraCallback.IAuthTabCallback;
            i = iArr[authenticatorCompanionAuthenticatorNone.ordinal()];
            if (i != 1) {
            }
        }
        int i9 = iArr[authenticatorCompanionAuthenticatorNone.ordinal()];
        if (i9 == 1) {
            i2 = 600;
        } else {
            if (i9 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i10 = onExtraCallbackWithResult + 75;
            onNavigationEvent = i10 % 128;
            i2 = i10 % 2 == 0 ? 27373 : 800;
        }
        AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = RallysKt.onExtraCallback(interpolatorOnExtraCallbackWithResult, i2);
        IAuthTabCallback.onExtraCallbackWithResult(appLovinSdkSettingsOnExtraCallback, authenticateVar);
        return appLovinSdkSettingsOnExtraCallback;
    }

    private static final Unit IAuthTabCallback(IAuthTabCallback iAuthTabCallback, attachAppLovinSdk attachapplovinsdk) {
        Float fOnExtraCallbackWithResult;
        Float fIAuthTabCallback;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        Object obj = null;
        if (iAuthTabCallback != null && (fIAuthTabCallback = iAuthTabCallback.IAuthTabCallback()) != null) {
            int i2 = onExtraCallbackWithResult + 117;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                attachapplovinsdk.IAuthTabCallback(fIAuthTabCallback.floatValue());
                obj.hashCode();
                throw null;
            }
            attachapplovinsdk.IAuthTabCallback(fIAuthTabCallback.floatValue());
        }
        if (iAuthTabCallback != null && (fOnExtraCallbackWithResult = iAuthTabCallback.onExtraCallbackWithResult()) != null) {
            attachapplovinsdk.onExtraCallbackWithResult(fOnExtraCallbackWithResult.floatValue());
        }
        Unit unit = Unit.INSTANCE;
        int i3 = onExtraCallbackWithResult + 115;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws NoWhenBranchMatchedException {
        float f;
        float f2;
        final IAuthTabCallback iAuthTabCallback;
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) objArr[1];
        authenticate authenticateVar = (authenticate) objArr[2];
        Function1 function1 = (Function1) objArr[3];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Float fValueOf = Float.valueOf(0.5f);
        int[] iArr = onExtraCallback.onExtraCallback;
        int i4 = iArr[authenticateVar.ordinal()];
        float f3 = 0.0f;
        float f4 = 1.0f;
        if (i4 != 1) {
            int i5 = onNavigationEvent + 7;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0 ? i4 != 2 : i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        int i6 = iArr[authenticateVar.ordinal()];
        if (i6 != 1) {
            int i7 = onNavigationEvent + 11;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 == 0 ? i6 != 2 : i6 != 5) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            f3 = 1.0f;
        }
        isMuted.onNavigationEvent(appLovinSdkSettings, Float.valueOf(f), Float.valueOf(f3), (Function1) null, 4, (Object) null);
        int i8 = iArr[authenticateVar.ordinal()];
        if (i8 != 1) {
            int i9 = onExtraCallbackWithResult + 69;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            if (i8 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f2 = 1.0f;
        } else {
            f2 = 0.6f;
        }
        int i11 = iArr[authenticateVar.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i12 = onExtraCallbackWithResult + 117;
            onNavigationEvent = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 84 / 0;
            }
            f4 = 0.6f;
        }
        isMuted.asBinder(appLovinSdkSettings, Float.valueOf(f2), Float.valueOf(f4), null, 4, null);
        if (function1 != null) {
            iAuthTabCallback = new IAuthTabCallback();
            function1.invoke(iAuthTabCallback);
        } else {
            iAuthTabCallback = null;
        }
        isMuted.IAuthTabCallbackStub(appLovinSdkSettings, fValueOf, fValueOf, new Function1() { // from class: im.toss.tds.foundation.anim.rally.transition.AnimateTransition$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i14 = 2 % 2;
                int i15 = IAuthTabCallback + 59;
                onNavigationEvent = i15 % 128;
                if (i15 % 2 != 0) {
                    AuthenticatorCompanion.onWarmupCompleted(iAuthTabCallback, (attachAppLovinSdk) obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Unit unitOnWarmupCompleted = AuthenticatorCompanion.onWarmupCompleted(iAuthTabCallback, (attachAppLovinSdk) obj);
                int i16 = IAuthTabCallback + 121;
                onNavigationEvent = i16 % 128;
                int i17 = i16 % 2;
                return unitOnWarmupCompleted;
            }
        });
        isMuted.access000(appLovinSdkSettings, fValueOf, fValueOf, new Function1() { // from class: im.toss.tds.foundation.anim.rally.transition.AnimateTransition$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i14 = 2 % 2;
                int i15 = onNavigationEvent + 5;
                IAuthTabCallback = i15 % 128;
                int i16 = i15 % 2;
                Unit unitOnNavigationEvent = AuthenticatorCompanion.onNavigationEvent(iAuthTabCallback, (attachAppLovinSdk) obj);
                int i17 = IAuthTabCallback + 7;
                onNavigationEvent = i17 % 128;
                int i18 = i17 % 2;
                return unitOnNavigationEvent;
            }
        });
        return null;
    }

    private static final Unit onExtraCallback(IAuthTabCallback iAuthTabCallback, attachAppLovinSdk attachapplovinsdk) {
        Float fOnExtraCallback;
        Float fOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        if (iAuthTabCallback != null && (fOnWarmupCompleted = iAuthTabCallback.onWarmupCompleted()) != null) {
            attachapplovinsdk.IAuthTabCallback(fOnWarmupCompleted.floatValue());
        }
        if (iAuthTabCallback != null && (fOnExtraCallback = iAuthTabCallback.onExtraCallback()) != null) {
            int i3 = onNavigationEvent + 65;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            attachapplovinsdk.onExtraCallbackWithResult(fOnExtraCallback.floatValue());
            int i5 = onExtraCallbackWithResult + 27;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppLovinSdkSettings onExtraCallbackWithResult(AuthenticatorCompanion authenticatorCompanion, authenticate authenticateVar, AuthenticatorCompanionAuthenticatorNone authenticatorCompanionAuthenticatorNone, Function1 function1, int i, Object obj) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            authenticatorCompanionAuthenticatorNone = AuthenticatorCompanionAuthenticatorNone.FAST;
        }
        if ((i & 4) != 0) {
            int i3 = onExtraCallbackWithResult + 31;
            onNavigationEvent = i3 % 128;
            Object obj2 = null;
            if (i3 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            function1 = null;
        }
        AppLovinSdkSettings appLovinSdkSettingsOnWarmupCompleted = authenticatorCompanion.onWarmupCompleted(authenticateVar, authenticatorCompanionAuthenticatorNone, function1);
        int i4 = onExtraCallbackWithResult + 65;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return appLovinSdkSettingsOnWarmupCompleted;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final AppLovinSdkSettings onWarmupCompleted(@NotNull authenticate authenticateVar, @NotNull AuthenticatorCompanionAuthenticatorNone authenticatorCompanionAuthenticatorNone, @Nullable Function1<? super IAuthTabCallback, Unit> function1) throws NoWhenBranchMatchedException {
        Interpolator interpolatorAsBinder;
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 23;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(authenticateVar, "");
        Intrinsics.checkNotNullParameter(authenticatorCompanionAuthenticatorNone, "");
        int[] iArr = onExtraCallback.IAuthTabCallback;
        int i5 = iArr[authenticatorCompanionAuthenticatorNone.ordinal()];
        if (i5 == 1) {
            interpolatorAsBinder = Address.onNavigationEvent.asBinder();
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i6 = onExtraCallbackWithResult + 17;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            interpolatorAsBinder = Address.onNavigationEvent.onExtraCallbackWithResult();
        }
        int i8 = iArr[authenticatorCompanionAuthenticatorNone.ordinal()];
        if (i8 == 1) {
            i = 600;
        } else {
            if (i8 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i9 = onNavigationEvent + 43;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            i = 800;
        }
        AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = RallysKt.onExtraCallback(interpolatorAsBinder, i);
        Object[] objArr = {IAuthTabCallback, appLovinSdkSettingsOnExtraCallback, authenticateVar, function1};
        IAuthTabCallback(-1076599312, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1076599313, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent());
        return appLovinSdkSettingsOnExtraCallback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppLovinSdkSettings onExtraCallback(AuthenticatorCompanion authenticatorCompanion, authenticate authenticateVar, AuthenticatorCompanionAuthenticatorNone authenticatorCompanionAuthenticatorNone, Function1 function1, int i, Object obj) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = onNavigationEvent + 43;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            authenticatorCompanionAuthenticatorNone = AuthenticatorCompanionAuthenticatorNone.FAST;
        }
        if ((i & 4) != 0) {
            int i5 = onNavigationEvent + 73;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 / 4;
            }
            function1 = null;
        }
        AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = authenticatorCompanion.onExtraCallback(authenticateVar, authenticatorCompanionAuthenticatorNone, function1);
        int i7 = onExtraCallbackWithResult + 53;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 29 / 0;
        }
        return appLovinSdkSettingsOnExtraCallback;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058 A[PHI: r1
      0x0058: PHI (r1v9 android.view.animation.Interpolator) = (r1v5 android.view.animation.Interpolator), (r1v11 android.view.animation.Interpolator) binds: [B:8:0x003c, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003e A[PHI: r1 r10
      0x003e: PHI (r1v6 android.view.animation.Interpolator) = (r1v5 android.view.animation.Interpolator), (r1v11 android.view.animation.Interpolator) binds: [B:8:0x003c, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x003e: PHI (r10v3 int) = (r10v2 int), (r10v9 int) binds: [B:8:0x003c, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AppLovinSdkSettings onExtraCallback(@NotNull authenticate authenticateVar, @NotNull AuthenticatorCompanionAuthenticatorNone authenticatorCompanionAuthenticatorNone, @Nullable Function1<? super IAuthTabCallback, Unit> function1) throws NoWhenBranchMatchedException {
        Interpolator interpolatorIAuthTabCallback;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 71;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(authenticateVar, "");
            Intrinsics.checkNotNullParameter(authenticatorCompanionAuthenticatorNone, "");
            interpolatorIAuthTabCallback = Address.onNavigationEvent.IAuthTabCallback();
            i = onExtraCallback.IAuthTabCallback[authenticatorCompanionAuthenticatorNone.ordinal()];
            if (i != 0) {
                int i5 = onNavigationEvent + 9;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0 ? i != 2 : i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = 550;
            } else {
                i2 = 800;
            }
        } else {
            Intrinsics.checkNotNullParameter(authenticateVar, "");
            Intrinsics.checkNotNullParameter(authenticatorCompanionAuthenticatorNone, "");
            interpolatorIAuthTabCallback = Address.onNavigationEvent.IAuthTabCallback();
            i = onExtraCallback.IAuthTabCallback[authenticatorCompanionAuthenticatorNone.ordinal()];
            if (i != 1) {
            }
        }
        AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = RallysKt.onExtraCallback(interpolatorIAuthTabCallback, i2);
        Object[] objArr = {IAuthTabCallback, appLovinSdkSettingsOnExtraCallback, authenticateVar, function1};
        IAuthTabCallback(-1076599312, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1076599313, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent());
        return appLovinSdkSettingsOnExtraCallback;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void onNavigationEvent(AppLovinSdkSettings appLovinSdkSettings, authenticate authenticateVar) throws NoWhenBranchMatchedException {
        float f;
        float f2;
        float f3;
        int i = 2 % 2;
        int[] iArr = onExtraCallback.onExtraCallback;
        int i2 = iArr[authenticateVar.ordinal()];
        float f4 = 0.0f;
        if (i2 != 1) {
            int i3 = onExtraCallbackWithResult + 77;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0 ? i2 != 2 : i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            f = 0.0f;
        } else {
            f = -70.0f;
        }
        int i4 = iArr[authenticateVar.ordinal()];
        if (i4 == 1) {
            f2 = 0.0f;
        } else {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f2 = 70.0f;
        }
        isMuted.IAuthTabCallback(appLovinSdkSettings, Float.valueOf(f), Float.valueOf(f2), (Function1) null, 4, (Object) null);
        int i5 = iArr[authenticateVar.ordinal()];
        if (i5 != 1) {
            int i6 = onNavigationEvent + 91;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0 ? i5 != 2 : i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f3 = 1.0f;
        } else {
            f3 = 0.0f;
        }
        int i7 = iArr[authenticateVar.ordinal()];
        if (i7 == 1) {
            f4 = 1.0f;
        } else if (i7 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        isMuted.onNavigationEvent(appLovinSdkSettings, Float.valueOf(f3), Float.valueOf(f4), (Function1) null, 4, (Object) null);
        appLovinSdkSettings.onExtraCallback(getVersionCode.STRONG);
    }

    public static /* synthetic */ AppLovinSdkSettings onExtraCallback(AuthenticatorCompanion authenticatorCompanion, authenticate authenticateVar, AuthenticatorCompanionAuthenticatorNone authenticatorCompanionAuthenticatorNone, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 19;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0 ? (i & 2) != 0 : (i & 2) != 0) {
            authenticatorCompanionAuthenticatorNone = AuthenticatorCompanionAuthenticatorNone.FAST;
            int i4 = onNavigationEvent + 109;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        return authenticatorCompanion.onExtraCallback(authenticateVar, authenticatorCompanionAuthenticatorNone);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final AppLovinSdkSettings onExtraCallback(@NotNull authenticate authenticateVar, @NotNull AuthenticatorCompanionAuthenticatorNone authenticatorCompanionAuthenticatorNone) throws NoWhenBranchMatchedException {
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(authenticateVar, "");
        Intrinsics.checkNotNullParameter(authenticatorCompanionAuthenticatorNone, "");
        Interpolator interpolatorIAuthTabCallback = Address.onNavigationEvent.IAuthTabCallback();
        int i3 = onExtraCallback.IAuthTabCallback[authenticatorCompanionAuthenticatorNone.ordinal()];
        if (i3 != 1) {
            int i4 = onExtraCallbackWithResult;
            int i5 = i4 + 123;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i7 = i4 + 79;
            onNavigationEvent = i7 % 128;
            i = i7 % 2 == 0 ? 26174 : 550;
        } else {
            i = 800;
        }
        AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = RallysKt.onExtraCallback(interpolatorIAuthTabCallback, i);
        IAuthTabCallback.onNavigationEvent(appLovinSdkSettingsOnExtraCallback, authenticateVar);
        return appLovinSdkSettingsOnExtraCallback;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws NoWhenBranchMatchedException {
        int i;
        deprecated_directory deprecated_directoryVar;
        deprecated_directory deprecated_directoryVar2;
        final authenticate authenticateVar = (authenticate) objArr[1];
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(authenticateVar, "");
        Interpolator interpolatorAsBinder = Address.onNavigationEvent.asBinder();
        int[] iArr = onExtraCallback.onExtraCallback;
        int i3 = iArr[authenticateVar.ordinal()];
        if (i3 != 1) {
            int i4 = onNavigationEvent;
            int i5 = i4 + 81;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0 ? i3 != 2 : i3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            int i6 = i4 + 69;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            i = 800;
        } else {
            i = 1000;
        }
        AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = RallysKt.onExtraCallback(interpolatorAsBinder, i);
        int i8 = iArr[authenticateVar.ordinal()];
        Float fValueOf = null;
        if (i8 == 1) {
            deprecated_directoryVar = deprecated_directory.Medium;
        } else {
            if (i8 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i9 = onNavigationEvent + 113;
            onExtraCallbackWithResult = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 4 / 5;
            }
            deprecated_directoryVar = null;
        }
        int i11 = iArr[authenticateVar.ordinal()];
        if (i11 != 1) {
            int i12 = onNavigationEvent + 21;
            onExtraCallbackWithResult = i12 % 128;
            int i13 = i12 % 2;
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            deprecated_directoryVar2 = deprecated_directory.Medium;
        } else {
            deprecated_directoryVar2 = deprecated_directory.None;
        }
        AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallback = isMuted.IAuthTabCallback(appLovinSdkSettingsOnExtraCallback, deprecated_directoryVar, deprecated_directoryVar2, (Function1) null, 4, (Object) null);
        int i14 = iArr[authenticateVar.ordinal()];
        float f = 0.0f;
        if (i14 == 1) {
            fValueOf = Float.valueOf(0.0f);
        } else if (i14 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int i15 = iArr[authenticateVar.ordinal()];
        if (i15 != 1) {
            int i16 = onNavigationEvent + 5;
            onExtraCallbackWithResult = i16 % 128;
            if (i16 % 2 == 0 ? i15 != 2 : i15 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            f = 1.0f;
        }
        return isMuted.onExtraCallback(appLovinSdkSettingsIAuthTabCallback, fValueOf, Float.valueOf(f), (Function1<? super attachAppLovinSdk, Unit>) new Function1() { // from class: im.toss.tds.foundation.anim.rally.transition.AnimateTransition$$ExternalSyntheticLambda4
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i17 = 2 % 2;
                int i18 = onExtraCallbackWithResult + 85;
                onNavigationEvent = i18 % 128;
                int i19 = i18 % 2;
                Unit unitOnExtraCallback = AuthenticatorCompanion.onExtraCallback(authenticateVar, (attachAppLovinSdk) obj);
                int i20 = onExtraCallbackWithResult + 65;
                onNavigationEvent = i20 % 128;
                int i21 = i20 % 2;
                return unitOnExtraCallback;
            }
        });
    }

    private static final Unit onWarmupCompleted(authenticate authenticateVar, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            authenticate authenticateVar2 = authenticate.OUT;
            throw null;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        if (authenticateVar == authenticate.OUT) {
            attachapplovinsdk.IAuthTabCallback(400);
            int i3 = onExtraCallbackWithResult + 95;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
        }
        return Unit.INSTANCE;
    }

    public static final class onWarmupCompleted {
        private static int asBinder = 1;
        private static int onExtraCallbackWithResult;
        private onExtraCallbackWithResult IAuthTabCallback;
        private onExtraCallbackWithResult onExtraCallback;
        private onExtraCallbackWithResult onNavigationEvent;
        private onExtraCallbackWithResult onWarmupCompleted;

        public final void onWarmupCompleted(@NotNull Function1<? super onExtraCallbackWithResult, Unit> function1) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(function1, "");
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult();
            function1.invoke(onextracallbackwithresult);
            this.onWarmupCompleted = onextracallbackwithresult;
            int i2 = onExtraCallbackWithResult + 65;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        public final void onExtraCallback(@NotNull Function1<? super onExtraCallbackWithResult, Unit> function1) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(function1, "");
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult();
            function1.invoke(onextracallbackwithresult);
            this.IAuthTabCallback = onextracallbackwithresult;
            int i2 = asBinder + 63;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
        }

        public final Float onWarmupCompleted() {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = this.onWarmupCompleted;
            if (onextracallbackwithresult == null) {
                return null;
            }
            int i2 = asBinder + 105;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                onextracallbackwithresult.onNavigationEvent();
                throw null;
            }
            Float fOnNavigationEvent = onextracallbackwithresult.onNavigationEvent();
            int i3 = asBinder + 69;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 53 / 0;
            }
            return fOnNavigationEvent;
        }

        public final Float IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = asBinder + 119;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = this.onWarmupCompleted;
            if (onextracallbackwithresult == null) {
                return null;
            }
            int i5 = i3 + 101;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            Float fOnExtraCallback = onextracallbackwithresult.onExtraCallback();
            int i7 = onExtraCallbackWithResult + 33;
            asBinder = i7 % 128;
            if (i7 % 2 != 0) {
                return fOnExtraCallback;
            }
            throw null;
        }

        public final Float onExtraCallback() {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 91;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = this.IAuthTabCallback;
            Object obj = null;
            if (onextracallbackwithresult == null) {
                return null;
            }
            int i5 = i2 + 69;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return onextracallbackwithresult.onNavigationEvent();
            }
            onextracallbackwithresult.onNavigationEvent();
            obj.hashCode();
            throw null;
        }

        public final Float asBinder() {
            int i = 2 % 2;
            int i2 = asBinder + 83;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = this.IAuthTabCallback;
            if (onextracallbackwithresult == null) {
                return null;
            }
            int i5 = i3 + 7;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            Float fOnExtraCallback = onextracallbackwithresult.onExtraCallback();
            if (i6 == 0) {
                int i7 = 99 / 0;
            }
            return fOnExtraCallback;
        }

        public final onExtraCallbackWithResult onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 39;
            int i3 = i2 % 128;
            asBinder = i3;
            int i4 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = this.onNavigationEvent;
            int i5 = i3 + 83;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return onextracallbackwithresult;
            }
            throw null;
        }

        public final onExtraCallbackWithResult onNavigationEvent() {
            int i = 2 % 2;
            int i2 = asBinder + 115;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = this.onExtraCallback;
            if (i3 != 0) {
                int i4 = 93 / 0;
            }
            return onextracallbackwithresult;
        }
    }

    public static final class IAuthTabCallback {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        private onExtraCallbackWithResult onExtraCallbackWithResult;
        private onExtraCallbackWithResult onNavigationEvent;

        public final void onNavigationEvent(@NotNull Function1<? super onExtraCallbackWithResult, Unit> function1) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(function1, "");
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult();
            function1.invoke(onextracallbackwithresult);
            this.onNavigationEvent = onextracallbackwithresult;
            int i2 = onWarmupCompleted + 107;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
        }

        public final void onExtraCallbackWithResult(@NotNull Function1<? super onExtraCallbackWithResult, Unit> function1) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(function1, "");
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult();
            function1.invoke(onextracallbackwithresult);
            this.onExtraCallbackWithResult = onextracallbackwithresult;
            int i2 = onWarmupCompleted + 87;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
        }

        public final Float IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 57;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = this.onNavigationEvent;
            if (onextracallbackwithresult != null) {
                return onextracallbackwithresult.onNavigationEvent();
            }
            int i5 = i2 + 15;
            onWarmupCompleted = i5 % 128;
            Object obj = null;
            if (i5 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
        
            return r2.onExtraCallback();
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
        
            r1 = r1 + 93;
            o.AuthenticatorCompanion.IAuthTabCallback.onWarmupCompleted = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        
            if (r2 != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        
            if (r2 != null) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Float onExtraCallbackWithResult() {
            onExtraCallbackWithResult onextracallbackwithresult;
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 19;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                onextracallbackwithresult = this.onNavigationEvent;
                int i4 = 23 / 0;
            } else {
                onextracallbackwithresult = this.onNavigationEvent;
            }
        }

        public final Float onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 31;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = this.onExtraCallbackWithResult;
            if (onextracallbackwithresult == null) {
                int i5 = i2 + 21;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return null;
            }
            int i7 = i2 + 105;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 != 0) {
                return onextracallbackwithresult.onNavigationEvent();
            }
            onextracallbackwithresult.onNavigationEvent();
            throw null;
        }

        public final Float onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 73;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = this.onExtraCallbackWithResult;
            if (onextracallbackwithresult == null) {
                return null;
            }
            int i5 = i2 + 109;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return onextracallbackwithresult.onExtraCallback();
            }
            onextracallbackwithresult.onExtraCallback();
            throw null;
        }
    }

    public static final class onExtraCallbackWithResult {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private Float onNavigationEvent;
        private Float onWarmupCompleted;

        public final void onExtraCallback(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 5;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            this.onNavigationEvent = Float.valueOf(f);
            if (i3 == 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = onExtraCallback + 85;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        public final void onNavigationEvent(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 113;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onWarmupCompleted = Float.valueOf(f);
            if (i3 == 0) {
                throw null;
            }
            int i4 = onExtraCallbackWithResult + 113;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        public final Float onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 45;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Float f = this.onNavigationEvent;
            int i5 = i2 + 9;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 30 / 0;
            }
            return f;
        }

        public final Float onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 67;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Float f = this.onWarmupCompleted;
            if (i3 == 0) {
                int i4 = 79 / 0;
            }
            return f;
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(onWarmupCompleted onwarmupcompleted, attachAppLovinSdk attachapplovinsdk) {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        return (Unit) IAuthTabCallback(-1527178455, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, new Object[]{onwarmupcompleted, attachapplovinsdk}, iOnNavigationEvent2, 1527178455, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent());
    }

    public static /* synthetic */ AppLovinSdkSettings onExtraCallbackWithResult(AuthenticatorCompanion authenticatorCompanion, authenticate authenticateVar, AuthenticatorCompanionAuthenticatorNone authenticatorCompanionAuthenticatorNone, int i, Object obj) {
        Object[] objArr = {authenticatorCompanion, authenticateVar, authenticatorCompanionAuthenticatorNone, Integer.valueOf(i), obj};
        return (AppLovinSdkSettings) IAuthTabCallback(-1255317290, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1255317293, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent());
    }

    private final void onExtraCallbackWithResult(AppLovinSdkSettings appLovinSdkSettings, authenticate authenticateVar, Function1<? super IAuthTabCallback, Unit> function1) {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        IAuthTabCallback(-1076599312, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, new Object[]{this, appLovinSdkSettings, authenticateVar, function1}, iOnNavigationEvent2, 1076599313, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent());
    }

    private final int onExtraCallbackWithResult(Number number) {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        return ((Integer) IAuthTabCallback(-1125607383, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, new Object[]{this, number}, iOnNavigationEvent2, 1125607387, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent())).intValue();
    }

    public final AppLovinSdkSettings onNavigationEvent(@NotNull authenticate authenticateVar) {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        return (AppLovinSdkSettings) IAuthTabCallback(-1219134781, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, new Object[]{this, authenticateVar}, iOnNavigationEvent2, 1219134783, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent());
    }
}
