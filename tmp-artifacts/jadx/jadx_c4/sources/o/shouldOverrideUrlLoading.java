package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import com.google.common.collect.Synchronized;
import im.toss.ads_sdk.remote.model.SdkTemplate;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.onPageScrollStateChanged;
import o.shouldOverrideUrlLoading;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class shouldOverrideUrlLoading {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        onPageScrollStateChanged onpagescrollstatechanged = (onPageScrollStateChanged) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        IAuthTabCallback = i2 % 128;
        IAuthTabCallback(onpagescrollstatechanged, cameraCaptureResultEmptyCameraCaptureResult, i2 % 2 == 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1) : RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1));
        Unit unit = Unit.INSTANCE;
        int i3 = onWarmupCompleted + 107;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(onPageScrollStateChanged onpagescrollstatechanged, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 21;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {onpagescrollstatechanged, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        Unit unit = (Unit) onExtraCallback(objArr, -461626113, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 461626114, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent, iOnNavigationEvent2);
        int i6 = IAuthTabCallback + 31;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final Unit asInterface(onPageScrollStateChanged onpagescrollstatechanged, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 47;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallback(onpagescrollstatechanged, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallback + 27;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Object onExtraCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i3 | i | (~i5);
        int i8 = (~((~i3) | i)) | (~(i3 | i5));
        int i9 = (~(i5 | (~i))) | i3;
        int i10 = i3 + i + i6 + ((-1069702238) * i4) + (1645725337 * i2);
        int i11 = i10 * i10;
        int i12 = ((i3 * 2084108943) - 1824784384) + (2084108943 * i) + (i7 * (-929364622)) + (929364622 * i8) + ((-929364622) * i9) + (1154744320 * i6) + ((-1977090048) * i4) + (448004096 * i2) + (1807155200 * i11);
        int i13 = (i3 * (-999696423)) + 1136243370 + (i * (-999696423)) + (i7 * 830) + (i8 * (-830)) + (i9 * 830) + (i6 * (-999695593)) + (i4 * 636963214) + (i2 * (-1077364033)) + (i11 * 980484096);
        if (i12 + (i13 * i13 * 1287192576) != 1) {
            return IAuthTabCallback(objArr);
        }
        onPageScrollStateChanged onpagescrollstatechanged = (onPageScrollStateChanged) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        ((Number) objArr[3]).intValue();
        int i14 = 2 % 2;
        int i15 = IAuthTabCallback + 13;
        onWarmupCompleted = i15 % 128;
        int i16 = i15 % 2;
        IAuthTabCallback(onpagescrollstatechanged, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1));
        Unit unit = Unit.INSTANCE;
        int i17 = onWarmupCompleted + 121;
        IAuthTabCallback = i17 % 128;
        int i18 = i17 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(onPageScrollStateChanged onpagescrollstatechanged, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 51;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallback(onpagescrollstatechanged, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallback + 23;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 99 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(onPageScrollStateChanged onpagescrollstatechanged, Integer num) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(onpagescrollstatechanged, num);
        }
        onWarmupCompleted(onpagescrollstatechanged, num);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(onPageScrollStateChanged onpagescrollstatechanged, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 107;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return onExtraCallback(onpagescrollstatechanged, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        onExtraCallback(onpagescrollstatechanged, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(onPageScrollStateChanged onpagescrollstatechanged, Integer num) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(onpagescrollstatechanged, num);
        if (i3 == 0) {
            int i4 = 33 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onNavigationEvent(onPageScrollStateChanged onpagescrollstatechanged, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 17;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Unit unitAsInterface = asInterface(onpagescrollstatechanged, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = IAuthTabCallback + 61;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ Unit onWarmupCompleted(onPageScrollStateChanged onpagescrollstatechanged, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Unit unit;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 99;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Integer numValueOf = Integer.valueOf(i);
        Integer numValueOf2 = Integer.valueOf(i2);
        if (i5 != 0) {
            int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
            int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
            unit = (Unit) onExtraCallback(new Object[]{onpagescrollstatechanged, numValueOf, cameraCaptureResultEmptyCameraCaptureResult, numValueOf2}, 441990232, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -441990232, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent, iOnNavigationEvent2);
            int i6 = 91 / 0;
        } else {
            int iOnNavigationEvent3 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
            int iOnNavigationEvent4 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
            unit = (Unit) onExtraCallback(new Object[]{onpagescrollstatechanged, numValueOf, cameraCaptureResultEmptyCameraCaptureResult, numValueOf2}, 441990232, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -441990232, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent3, iOnNavigationEvent4);
        }
        int i7 = IAuthTabCallback + 43;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(onPageScrollStateChanged onpagescrollstatechanged, Integer num) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onpagescrollstatechanged.onNavigationEvent().invoke((Object) null);
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = onWarmupCompleted + 11;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 50 / 0;
        }
        return unit;
    }

    private static final Unit onWarmupCompleted(onPageScrollStateChanged onpagescrollstatechanged, Integer num) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onpagescrollstatechanged.onNavigationEvent().invoke((Object) null);
        if (i3 != 0) {
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 15;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit2;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(@NotNull final onPageScrollStateChanged onpagescrollstatechanged, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        Function2 function2;
        int i3;
        SdkTemplate.onExtraCallbackWithResult onextracallbackwithresult;
        Object obj;
        Object obj2;
        int i4;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(onpagescrollstatechanged, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1496185828);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onpagescrollstatechanged)) {
                int i6 = onWarmupCompleted + 39;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        boolean z = false;
        if ((i2 & 3) != 2) {
            int i8 = onWarmupCompleted + 65;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 != 0) {
                z = true;
            }
        }
        Object obj3 = null;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1496185828, i2, -1, "im.toss.ads_sdk.ui.compose.NanaSingleTemplate (NativeAdsNanaSingleTemplate.kt:19)");
            }
            SdkTemplate sdkTemplateIAuthTabCallbackStub = onpagescrollstatechanged.IAuthTabCallbackStub();
            if (sdkTemplateIAuthTabCallbackStub instanceof SdkTemplate.onExtraCallbackWithResult) {
                int i9 = onWarmupCompleted + 91;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                onextracallbackwithresult = (SdkTemplate.onExtraCallbackWithResult) sdkTemplateIAuthTabCallbackStub;
            } else {
                onextracallbackwithresult = null;
            }
            if (onextracallbackwithresult == null) {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    function2 = new Function2() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsNanaSingleTemplateKt$$ExternalSyntheticLambda0
                        private static int onExtraCallback = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke(Object obj4, Object obj5) {
                            int i11 = 2 % 2;
                            int i12 = onNavigationEvent + 71;
                            onExtraCallback = i12 % 128;
                            int i13 = i12 % 2;
                            Unit unitOnExtraCallbackWithResult = shouldOverrideUrlLoading.onExtraCallbackWithResult(onpagescrollstatechanged, i, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                            int i14 = onExtraCallback + 25;
                            onNavigationEvent = i14 % 128;
                            int i15 = i14 % 2;
                            return unitOnExtraCallbackWithResult;
                        }
                    };
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(function2);
                    return;
                }
                i3 = IAuthTabCallback + 85;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    return;
                }
                obj3.hashCode();
                throw null;
            }
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallbackwithresult);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (zOnNavigationEvent || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = WindowAreaControllerImplwindowAreaInfos1ExternalSyntheticLambda0.onNavigationEvent(onextracallbackwithresult);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            RearDisplayPresentationSessionPresenterImpl rearDisplayPresentationSessionPresenterImpl = (RearDisplayPresentationSessionPresenterImpl) objOnMinimized;
            if (rearDisplayPresentationSessionPresenterImpl == null) {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    Function2 function22 = new Function2() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsNanaSingleTemplateKt$$ExternalSyntheticLambda1
                        private static int onNavigationEvent = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke(Object obj4, Object obj5) {
                            int i11 = 2 % 2;
                            int i12 = onWarmupCompleted + 63;
                            onNavigationEvent = i12 % 128;
                            if (i12 % 2 != 0) {
                                shouldOverrideUrlLoading.onWarmupCompleted(onpagescrollstatechanged, i, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                                throw null;
                            }
                            Unit unitOnWarmupCompleted = shouldOverrideUrlLoading.onWarmupCompleted(onpagescrollstatechanged, i, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                            int i13 = onWarmupCompleted + 105;
                            onNavigationEvent = i13 % 128;
                            int i14 = i13 % 2;
                            return unitOnWarmupCompleted;
                        }
                    };
                    int i11 = onWarmupCompleted + 65;
                    IAuthTabCallback = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i12 = 5 % 3;
                    }
                    function2 = function22;
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(function2);
                    return;
                }
                i3 = IAuthTabCallback + 85;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                }
            } else {
                ProfileStore profileStoreOnWarmupCompleted = onpagescrollstatechanged.onWarmupCompleted();
                if (profileStoreOnWarmupCompleted == null) {
                    int i13 = onWarmupCompleted + 47;
                    IAuthTabCallback = i13 % 128;
                    if (i13 % 2 == 0) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-298361051);
                        onpagescrollstatechanged.onExtraCallback();
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onpagescrollstatechanged);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        obj3.hashCode();
                        throw null;
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-298361051);
                    boolean zOnExtraCallback = onpagescrollstatechanged.onExtraCallback();
                    boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onpagescrollstatechanged);
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!zOnExtraCallback2) {
                        obj2 = objOnMinimized2;
                        if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        }
                        WebViewProviderAdapterExternalSyntheticLambda3.onExtraCallbackWithResult(rearDisplayPresentationSessionPresenterImpl, null, (Function1) obj2, null, null, zOnExtraCallback, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 90);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            function2 = new Function2() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsNanaSingleTemplateKt$$ExternalSyntheticLambda3
                                private static int onExtraCallbackWithResult = 0;
                                private static int onNavigationEvent = 1;

                                public final Object invoke(Object obj4, Object obj5) {
                                    int i14 = 2 % 2;
                                    int i15 = onExtraCallbackWithResult + 109;
                                    onNavigationEvent = i15 % 128;
                                    int i16 = i15 % 2;
                                    Unit unitIAuthTabCallback = shouldOverrideUrlLoading.IAuthTabCallback(onpagescrollstatechanged, i, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                                    int i17 = onExtraCallbackWithResult + 121;
                                    onNavigationEvent = i17 % 128;
                                    if (i17 % 2 != 0) {
                                        return unitIAuthTabCallback;
                                    }
                                    Object obj6 = null;
                                    obj6.hashCode();
                                    throw null;
                                }
                            };
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(function2);
                            return;
                        }
                        i3 = IAuthTabCallback + 85;
                        onWarmupCompleted = i3 % 128;
                        if (i3 % 2 == 0) {
                        }
                    }
                    Function1 function1 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsNanaSingleTemplateKt$$ExternalSyntheticLambda2
                        private static int IAuthTabCallback = 0;
                        private static int onExtraCallbackWithResult = 1;

                        public final Object invoke(Object obj4) {
                            int i14 = 2 % 2;
                            int i15 = onExtraCallbackWithResult + 9;
                            IAuthTabCallback = i15 % 128;
                            int i16 = i15 % 2;
                            onPageScrollStateChanged onpagescrollstatechanged2 = onpagescrollstatechanged;
                            Integer num = (Integer) obj4;
                            if (i16 == 0) {
                                return shouldOverrideUrlLoading.onExtraCallbackWithResult(onpagescrollstatechanged2, num);
                            }
                            shouldOverrideUrlLoading.onExtraCallbackWithResult(onpagescrollstatechanged2, num);
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function1);
                    obj2 = function1;
                    WebViewProviderAdapterExternalSyntheticLambda3.onExtraCallbackWithResult(rearDisplayPresentationSessionPresenterImpl, null, (Function1) obj2, null, null, zOnExtraCallback, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 90);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                    i3 = IAuthTabCallback + 85;
                    onWarmupCompleted = i3 % 128;
                    if (i3 % 2 == 0) {
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-298244770);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-979448639, profileStoreOnWarmupCompleted.IAuthTabCallback());
                    boolean zOnExtraCallback3 = onpagescrollstatechanged.onExtraCallback();
                    boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onpagescrollstatechanged);
                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!zOnExtraCallback4) {
                        int i14 = IAuthTabCallback + 121;
                        onWarmupCompleted = i14 % 128;
                        int i15 = i14 % 2;
                        obj = objOnMinimized3;
                        if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        }
                        WebViewProviderAdapterExternalSyntheticLambda3.onExtraCallbackWithResult(rearDisplayPresentationSessionPresenterImpl, null, (Function1) obj, null, null, zOnExtraCallback3, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 90);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStub();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            int i16 = IAuthTabCallback + 25;
                            onWarmupCompleted = i16 % 128;
                            if (i16 % 2 != 0) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                                obj3.hashCode();
                                throw null;
                            }
                            CameraConfigExternalSyntheticLambda0.onTransact();
                            int i17 = onWarmupCompleted + 17;
                            IAuthTabCallback = i17 % 128;
                            int i18 = i17 % 2;
                        }
                    }
                    Function1 function12 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsNanaSingleTemplateKt$$ExternalSyntheticLambda4
                        private static int IAuthTabCallback = 0;
                        private static int onExtraCallbackWithResult = 1;

                        public final Object invoke(Object obj4) {
                            int i19 = 2 % 2;
                            int i20 = IAuthTabCallback + 29;
                            onExtraCallbackWithResult = i20 % 128;
                            int i21 = i20 % 2;
                            Unit unitOnExtraCallback = shouldOverrideUrlLoading.onExtraCallback(onpagescrollstatechanged, (Integer) obj4);
                            if (i21 == 0) {
                                int i22 = 45 / 0;
                            }
                            return unitOnExtraCallback;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function12);
                    obj = function12;
                    WebViewProviderAdapterExternalSyntheticLambda3.onExtraCallbackWithResult(rearDisplayPresentationSessionPresenterImpl, null, (Function1) obj, null, null, zOnExtraCallback3, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 90);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStub();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            function2 = new Function2() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsNanaSingleTemplateKt$$ExternalSyntheticLambda5
                private static int IAuthTabCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj4, Object obj5) {
                    int i19 = 2 % 2;
                    int i20 = IAuthTabCallback + 23;
                    onWarmupCompleted = i20 % 128;
                    int i21 = i20 % 2;
                    Unit unitOnNavigationEvent = shouldOverrideUrlLoading.onNavigationEvent(onpagescrollstatechanged, i, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                    int i22 = IAuthTabCallback + 95;
                    onWarmupCompleted = i22 % 128;
                    int i23 = i22 % 2;
                    return unitOnNavigationEvent;
                }
            };
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(function2);
            return;
        }
        i3 = IAuthTabCallback + 85;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
        }
    }

    private static final Unit IAuthTabCallbackStub(onPageScrollStateChanged onpagescrollstatechanged, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {onpagescrollstatechanged, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        return (Unit) onExtraCallback(objArr, 441990232, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -441990232, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent, iOnNavigationEvent2);
    }

    private static final Unit onTransact(onPageScrollStateChanged onpagescrollstatechanged, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {onpagescrollstatechanged, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        return (Unit) onExtraCallback(objArr, -461626113, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 461626114, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent, iOnNavigationEvent2);
    }
}
