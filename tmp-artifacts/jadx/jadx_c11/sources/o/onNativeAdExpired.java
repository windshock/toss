package o;

import com.google.zxing.datamatrix.encoder.C40Encoder;
import im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.foundation.anim.rally.RallysKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.attachAppLovinSdk;
import o.onNativeAdExpired;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class onNativeAdExpired {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    public static /* synthetic */ Unit IAuthTabCallback(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(attachapplovinsdk);
        if (i3 != 0) {
            int i4 = 12 / 0;
        }
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Object onExtraCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i6;
        int i9 = ~i4;
        int i10 = (~(i7 | i9)) | i8;
        int i11 = ~(i9 | i8 | i7);
        int i12 = i6 + i2 + i5 + ((-112346298) * i) + (505796074 * i3);
        int i13 = i12 * i12;
        int i14 = ((1543607772 * i6) - 1525940224) + (1734765094 * i2) + (i7 * 95578661) + ((-95578661) * i10) + (95578661 * i11) + (1639186432 * i5) + (859308032 * i) + (310902784 * i3) + (417529856 * i13);
        int i15 = (i6 * (-1233303660)) + 1670658458 + (i2 * (-1233302158)) + (i7 * 751) + (i10 * (-751)) + (i11 * 751) + (i5 * (-1233302909)) + (i * 1075253458) + (i3 * 745806526) + (i13 * 1512636416);
        int i16 = i14 + (i15 * i15 * (-1737162752));
        return i16 != 1 ? i16 != 2 ? i16 != 3 ? onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr) : IAuthTabCallback(objArr) : onExtraCallback(objArr);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = C40Encoder.onExtraCallback();
            int iOnExtraCallback2 = C40Encoder.onExtraCallback();
            return (Unit) onExtraCallback(C40Encoder.onExtraCallback(), new Object[]{attachapplovinsdk}, 816669939, C40Encoder.onExtraCallback(), iOnExtraCallback, iOnExtraCallback2, -816669939);
        }
        int iOnExtraCallback3 = C40Encoder.onExtraCallback();
        int iOnExtraCallback4 = C40Encoder.onExtraCallback();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(attachapplovinsdk);
        int i4 = onNavigationEvent + 47;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitAsBinder;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(attachapplovinsdk);
        int i4 = onNavigationEvent + 43;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnTransact;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        AppLovinSdkSettings appLovinSdkSettings = new AppLovinSdkSettings();
        int i2 = onNavigationEvent + 123;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return appLovinSdkSettings;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final AppLovinSdkSettings onExtraCallbackWithResult(int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 57;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = RallysKt.onExtraCallback(Address.onNavigationEvent.asBinder(), i);
        int i5 = onNavigationEvent + 25;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return appLovinSdkSettingsOnExtraCallback;
        }
        throw null;
    }

    public static final AppLovinSdkSettings onExtraCallback(@NotNull getStarRatingContentViewGroup getstarratingcontentviewgroup) {
        AppLovinSdkSettings appLovinSdkSettings;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(getstarratingcontentviewgroup, "");
            appLovinSdkSettings = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{getstarratingcontentviewgroup.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
            int i3 = 84 / 0;
        } else {
            Intrinsics.checkNotNullParameter(getstarratingcontentviewgroup, "");
            appLovinSdkSettings = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{getstarratingcontentviewgroup.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
        }
        int i4 = onExtraCallback + 123;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return appLovinSdkSettings;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        getMediaContentViewGroup getmediacontentviewgroup = (getMediaContentViewGroup) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(getmediacontentviewgroup, "");
        Object[] objArr2 = {new AppLovinSdkSettings().onWarmupCompleted(getmediacontentviewgroup.IAuthTabCallback()), Integer.valueOf(iIntValue)};
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1045515484, objArr2, -1045515484, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
        int i2 = onNavigationEvent + 121;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return appLovinSdkSettings;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 97;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ AppLovinSdkSettings onWarmupCompleted(AppLovinSdkSettings appLovinSdkSettings, setByteOrder setbyteorder, setByteOrder setbyteorder2, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            setbyteorder = null;
        }
        if ((i & 2) != 0) {
            int i3 = onNavigationEvent + 99;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            setbyteorder2 = null;
        }
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: im.toss.tds.compose.foundation.anim.rally.MotionKt$$ExternalSyntheticLambda1
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj2) {
                    int i4 = 2 % 2;
                    int i5 = onExtraCallback + 111;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    Unit unitOnExtraCallbackWithResult = onNativeAdExpired.onExtraCallbackWithResult((attachAppLovinSdk) obj2);
                    int i7 = onWarmupCompleted + 83;
                    onExtraCallback = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 48 / 0;
                    }
                    return unitOnExtraCallbackWithResult;
                }
            };
            int i4 = onNavigationEvent + 49;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        return onNavigationEvent(appLovinSdkSettings, setbyteorder, setbyteorder2, (Function1<? super attachAppLovinSdk, Unit>) function1);
    }

    public static final AppLovinSdkSettings onNavigationEvent(@NotNull AppLovinSdkSettings appLovinSdkSettings, @Nullable setByteOrder setbyteorder, @Nullable setByteOrder setbyteorder2, @NotNull Function1<? super attachAppLovinSdk, Unit> function1) {
        Integer numValueOf;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Integer numValueOf2 = null;
        if (setbyteorder != null) {
            numValueOf = Integer.valueOf(ByteOrderedDataOutputStream.onNavigationEvent(setbyteorder.access100()));
            int i2 = onNavigationEvent + 85;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
        } else {
            int i4 = onNavigationEvent + 73;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            numValueOf = null;
        }
        if (setbyteorder2 != null) {
            int i6 = onNavigationEvent + 121;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                numValueOf2 = Integer.valueOf(ByteOrderedDataOutputStream.onNavigationEvent(setbyteorder2.access100()));
                int i7 = 58 / 0;
            } else {
                numValueOf2 = Integer.valueOf(ByteOrderedDataOutputStream.onNavigationEvent(setbyteorder2.access100()));
            }
        }
        attachAppLovinSdk attachapplovinsdk = new attachAppLovinSdk(new reinitialize(numValueOf, numValueOf2));
        function1.invoke(attachapplovinsdk);
        return appLovinSdkSettings.onNavigationEvent(attachapplovinsdk);
    }

    private static final Unit onTransact(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 17;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackStub(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 39;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 47 / 0;
        }
        return unit;
    }

    public static /* synthetic */ AppLovinSdkSettings onExtraCallback(r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, AppLovinSdkSettings appLovinSdkSettings, VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1, VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda12, boolean z, Function1 function1, int i, Object obj) {
        VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda13;
        boolean z2;
        Function1 function12;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 77;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda14 = null;
        if (i3 % 2 != 0 ? (i & 2) == 0 : (i & 4) == 0) {
            virtualCameraControlExternalSyntheticLambda13 = virtualCameraControlExternalSyntheticLambda1;
        } else {
            int i5 = i4 + 71;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            virtualCameraControlExternalSyntheticLambda13 = null;
        }
        if ((i & 4) != 0) {
            int i7 = onExtraCallback;
            int i8 = i7 + 45;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            int i10 = i7 + 35;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
        } else {
            virtualCameraControlExternalSyntheticLambda14 = virtualCameraControlExternalSyntheticLambda12;
        }
        if ((i & 8) != 0) {
            int i12 = onExtraCallback + 43;
            onNavigationEvent = i12 % 128;
            z2 = i12 % 2 != 0;
        } else {
            z2 = z;
        }
        if ((i & 16) != 0) {
            function12 = new Function1() { // from class: im.toss.tds.compose.foundation.anim.rally.MotionKt$$ExternalSyntheticLambda3
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj2) {
                    int i13 = 2 % 2;
                    int i14 = onNavigationEvent + 21;
                    onExtraCallback = i14 % 128;
                    int i15 = i14 % 2;
                    Unit unitIAuthTabCallback = onNativeAdExpired.IAuthTabCallback((attachAppLovinSdk) obj2);
                    int i16 = onExtraCallback + 115;
                    onNavigationEvent = i16 % 128;
                    int i17 = i16 % 2;
                    return unitIAuthTabCallback;
                }
            };
            int i13 = onExtraCallback + 49;
            onNavigationEvent = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 3 / 2;
            }
        } else {
            function12 = function1;
        }
        AppLovinSdkSettings appLovinSdkSettingsOnExtraCallbackWithResult = onExtraCallbackWithResult(r8lambdanm9dm2eewl4vrptnjmesfjqky4, appLovinSdkSettings, virtualCameraControlExternalSyntheticLambda13, virtualCameraControlExternalSyntheticLambda14, z2, function12);
        int i15 = onNavigationEvent + 55;
        onExtraCallback = i15 % 128;
        int i16 = i15 % 2;
        return appLovinSdkSettingsOnExtraCallbackWithResult;
    }

    public static final AppLovinSdkSettings onExtraCallbackWithResult(@NotNull r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, @NotNull AppLovinSdkSettings appLovinSdkSettings, @Nullable VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1, @Nullable VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda12, boolean z, @NotNull Function1<? super attachAppLovinSdk, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Intrinsics.checkNotNullParameter(function1, "");
        attachAppLovinSdk attachapplovinsdk = new attachAppLovinSdk((MaxRewardedAd) onExtraCallback(C40Encoder.onExtraCallback(), new Object[]{r8lambdanm9dm2eewl4vrptnjmesfjqky4, virtualCameraControlExternalSyntheticLambda1, virtualCameraControlExternalSyntheticLambda12, Boolean.valueOf(z)}, 490166687, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -490166684));
        function1.invoke(attachapplovinsdk);
        AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = appLovinSdkSettings.onNavigationEvent(attachapplovinsdk);
        int i2 = onNavigationEvent + 23;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return appLovinSdkSettingsOnNavigationEvent;
    }

    public static /* synthetic */ AppLovinSdkSettings IAuthTabCallback(r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, AppLovinSdkSettings appLovinSdkSettings, VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1, VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda12, boolean z, Function1 function1, int i, Object obj) {
        VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda13;
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = onExtraCallback + 111;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 68 / 0;
            }
            virtualCameraControlExternalSyntheticLambda13 = null;
        } else {
            virtualCameraControlExternalSyntheticLambda13 = virtualCameraControlExternalSyntheticLambda1;
        }
        VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda14 = (i & 4) != 0 ? null : virtualCameraControlExternalSyntheticLambda12;
        if ((i & 8) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            function1 = new Function1() { // from class: im.toss.tds.compose.foundation.anim.rally.MotionKt$$ExternalSyntheticLambda0
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2) {
                    int i5 = 2 % 2;
                    int i6 = onWarmupCompleted + 99;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    Unit unitOnNavigationEvent = onNativeAdExpired.onNavigationEvent((attachAppLovinSdk) obj2);
                    int i8 = onExtraCallbackWithResult + 7;
                    onWarmupCompleted = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i9 = 59 / 0;
                    }
                    return unitOnNavigationEvent;
                }
            };
            int i5 = onExtraCallback + 13;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        }
        return onExtraCallback(r8lambdanm9dm2eewl4vrptnjmesfjqky4, appLovinSdkSettings, virtualCameraControlExternalSyntheticLambda13, virtualCameraControlExternalSyntheticLambda14, z2, function1);
    }

    private static final Unit asBinder(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 55;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final AppLovinSdkSettings onExtraCallback(@NotNull r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, @NotNull AppLovinSdkSettings appLovinSdkSettings, @Nullable VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1, @Nullable VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda12, boolean z, @NotNull Function1<? super attachAppLovinSdk, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Intrinsics.checkNotNullParameter(function1, "");
        attachAppLovinSdk attachapplovinsdk = new attachAppLovinSdk(onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky4, virtualCameraControlExternalSyntheticLambda1, virtualCameraControlExternalSyntheticLambda12, z));
        function1.invoke(attachapplovinsdk);
        AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = appLovinSdkSettings.onNavigationEvent(attachapplovinsdk);
        int i2 = onExtraCallback + 81;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return appLovinSdkSettingsOnNavigationEvent;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) objArr[0];
        VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1 = (VirtualCameraControlExternalSyntheticLambda1) objArr[1];
        VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda12 = (VirtualCameraControlExternalSyntheticLambda1) objArr[2];
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Float fValueOf = null;
        Float fValueOf2 = virtualCameraControlExternalSyntheticLambda1 != null ? Float.valueOf(r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(virtualCameraControlExternalSyntheticLambda1.IAuthTabCallback())) : null;
        if (virtualCameraControlExternalSyntheticLambda12 != null) {
            int i4 = onExtraCallback + 113;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            fValueOf = Float.valueOf(r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(virtualCameraControlExternalSyntheticLambda12.IAuthTabCallback()));
        }
        return new MaxRewardedAd(fValueOf2, fValueOf, zBooleanValue);
    }

    private static final MaxNativeAd onNavigationEvent(r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1, VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda12, boolean z) {
        Float fValueOf;
        int i = 2 % 2;
        Float fValueOf2 = null;
        if (virtualCameraControlExternalSyntheticLambda1 != null) {
            int i2 = onExtraCallback + 7;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            float fIAuthTabCallback = virtualCameraControlExternalSyntheticLambda1.IAuthTabCallback();
            if (i3 == 0) {
                Float.valueOf(r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(fIAuthTabCallback));
                throw null;
            }
            fValueOf = Float.valueOf(r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(fIAuthTabCallback));
        } else {
            fValueOf = null;
        }
        if (virtualCameraControlExternalSyntheticLambda12 != null) {
            int i4 = onExtraCallback + 41;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            fValueOf2 = Float.valueOf(r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(virtualCameraControlExternalSyntheticLambda12.IAuthTabCallback()));
            int i6 = onExtraCallback + 31;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
        }
        return new MaxNativeAd(fValueOf, fValueOf2, z);
    }

    public static final AppLovinSdkSettings IAuthTabCallback(@NotNull AppLovinSdkSettings appLovinSdkSettings, @NotNull getMediaContentViewGroup getmediacontentviewgroup) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
            Intrinsics.checkNotNullParameter(getmediacontentviewgroup, "");
            return appLovinSdkSettings.onWarmupCompleted(getmediacontentviewgroup.IAuthTabCallback());
        }
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Intrinsics.checkNotNullParameter(getmediacontentviewgroup, "");
        appLovinSdkSettings.onWarmupCompleted(getmediacontentviewgroup.IAuthTabCallback());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final attachAppLovinSdk onNavigationEvent(@NotNull attachAppLovinSdk attachapplovinsdk, @NotNull getMediaContentViewGroup getmediacontentviewgroup) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        Intrinsics.checkNotNullParameter(getmediacontentviewgroup, "");
        attachAppLovinSdk attachapplovinsdkIAuthTabCallback = attachapplovinsdk.IAuthTabCallback(getmediacontentviewgroup.IAuthTabCallback());
        int i4 = onExtraCallback + 75;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return attachapplovinsdkIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final MaxRewardedAd IAuthTabCallback(r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1, VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda12, boolean z) {
        return (MaxRewardedAd) onExtraCallback(C40Encoder.onExtraCallback(), new Object[]{r8lambdanm9dm2eewl4vrptnjmesfjqky4, virtualCameraControlExternalSyntheticLambda1, virtualCameraControlExternalSyntheticLambda12, Boolean.valueOf(z)}, 490166687, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -490166684);
    }

    public static final AppLovinSdkSettings onWarmupCompleted() {
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        return (AppLovinSdkSettings) onExtraCallback(C40Encoder.onExtraCallback(), new Object[0], 1646601245, C40Encoder.onExtraCallback(), iOnExtraCallback, iOnExtraCallback2, -1646601244);
    }

    public static final AppLovinSdkSettings IAuthTabCallback(@NotNull getMediaContentViewGroup getmediacontentviewgroup, int i) {
        return (AppLovinSdkSettings) onExtraCallback(C40Encoder.onExtraCallback(), new Object[]{getmediacontentviewgroup, Integer.valueOf(i)}, 827070143, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -827070141);
    }

    private static final Unit onExtraCallback(attachAppLovinSdk attachapplovinsdk) {
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        return (Unit) onExtraCallback(C40Encoder.onExtraCallback(), new Object[]{attachapplovinsdk}, 816669939, C40Encoder.onExtraCallback(), iOnExtraCallback, iOnExtraCallback2, -816669939);
    }
}
