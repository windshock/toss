package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import com.facebook.internal.ICustomTabsCallbackStubProxy;
import im.toss.ads_sdk.model.NativeExtension;
import im.toss.ads_sdk.remote.model.SdkTemplate;
import im.toss.ads_sdk.remote.model.SdkTemplateCta;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.JsonObject;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.dispatchOnPageScrolled;
import o.onPageScrollStateChanged;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class onPageScrollStateChanged {
    private static int IAuthTabCallbackStub = 0;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int onTransact = 1;
    private final Function1<Integer, Unit> IAuthTabCallback;
    private final Lazy IAuthTabCallbackDefault;
    private final String asBinder;
    private final String asInterface;
    private final Function1<Integer, Unit> onExtraCallback;
    private final Lazy onNavigationEvent;
    private final ProfileStore onWarmupCompleted;
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    public static final int onExtraCallbackWithResult = 8;

    static {
        int i = IAuthTabCallbackStubProxy + 91;
        IAuthTabCallback_Parcel = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit onExtraCallback(onPageScrollStateChanged onpagescrollstatechanged, Integer num) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 57;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(onpagescrollstatechanged, num);
        int i4 = IAuthTabCallbackStub + 107;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~(i7 | i3);
        int i9 = ~(i3 | i);
        int i10 = i7 | (~i3);
        int i11 = i9 | (~(i10 | i5));
        int i12 = (~i5) | i10;
        int i13 = i3 + i + i4 + (1134938392 * i2) + ((-1730424158) * i6);
        int i14 = i13 * i13;
        int i15 = (1345404558 * i3) + 1061748736 + ((-382549644) * i) + (1727954202 * i8) + ((-1283506547) * i11) + (1283506547 * i12) + ((-1666056192) * i4) + (1924136960 * i2) + (748945408 * i6) + (912850944 * i14);
        int i16 = (i3 * 1914917686) + 639827133 + (i * 1914918628) + (i8 * (-942)) + (i11 * (-471)) + (i12 * 471) + (i4 * 1914918157) + (i2 * (-1451741640)) + (i6 * (-1338016710)) + (i14 * (-1605042176));
        int i17 = i15 + (i16 * i16 * (-230752256));
        return i17 != 1 ? i17 != 2 ? onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr) : onExtraCallback(objArr);
    }

    private static final Unit onExtraCallbackWithResult(onPageScrollStateChanged onpagescrollstatechanged, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 69;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallbackWithResult(501992039, ICustomTabsCallbackStubProxy.onExtraCallback(), -501992039, new Object[]{onpagescrollstatechanged, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1))}, ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback());
        Unit unit = Unit.INSTANCE;
        int i6 = onTransact + 13;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ SdkTemplate onNavigationEvent(onPageScrollStateChanged onpagescrollstatechanged) {
        int i = 2 % 2;
        int i2 = onTransact + 31;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {onpagescrollstatechanged};
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback3 = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback4 = ICustomTabsCallbackStubProxy.onExtraCallback();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SdkTemplate sdkTemplate = (SdkTemplate) onExtraCallbackWithResult(2054558485, iOnExtraCallback3, -2054558483, objArr, iOnExtraCallback2, iOnExtraCallback, iOnExtraCallback4);
        int i4 = IAuthTabCallbackStub + 111;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return sdkTemplate;
    }

    public static /* synthetic */ Unit onNavigationEvent(onPageScrollStateChanged onpagescrollstatechanged, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onTransact + 71;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return onExtraCallbackWithResult(onpagescrollstatechanged, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        onExtraCallbackWithResult(onpagescrollstatechanged, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        throw null;
    }

    public static /* synthetic */ JsonObject onWarmupCompleted(onPageScrollStateChanged onpagescrollstatechanged) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 5;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        JsonObject jsonObjectIAuthTabCallback = IAuthTabCallback(onpagescrollstatechanged);
        if (i3 == 0) {
            int i4 = 96 / 0;
        }
        int i5 = onTransact + 15;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return jsonObjectIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public onPageScrollStateChanged(@NotNull String str, @NotNull String str2, @NotNull Function1<? super Integer, Unit> function1, @Nullable ProfileStore profileStore) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.asBinder = str;
        this.asInterface = str2;
        this.onExtraCallback = function1;
        this.onWarmupCompleted = profileStore;
        this.IAuthTabCallback = new Function1() { // from class: im.toss.ads_sdk.ui.NativeAdsRenderScope$$ExternalSyntheticLambda1
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 19;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnExtraCallback = onPageScrollStateChanged.onExtraCallback(this.f$0, (Integer) obj);
                int i4 = onExtraCallback + 95;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return unitOnExtraCallback;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        };
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.NONE;
        this.IAuthTabCallbackDefault = LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.ads_sdk.ui.NativeAdsRenderScope$$ExternalSyntheticLambda2
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                SdkTemplate sdkTemplateOnNavigationEvent;
                int i = 2 % 2;
                int i2 = onExtraCallback + 93;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    sdkTemplateOnNavigationEvent = onPageScrollStateChanged.onNavigationEvent(this.f$0);
                    int i3 = 51 / 0;
                } else {
                    sdkTemplateOnNavigationEvent = onPageScrollStateChanged.onNavigationEvent(this.f$0);
                }
                int i4 = onNavigationEvent + 13;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return sdkTemplateOnNavigationEvent;
            }
        });
        this.onNavigationEvent = LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.ads_sdk.ui.NativeAdsRenderScope$$ExternalSyntheticLambda3
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 109;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                JsonObject jsonObjectOnWarmupCompleted = onPageScrollStateChanged.onWarmupCompleted(this.f$0);
                int i4 = onExtraCallback + 121;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return jsonObjectOnWarmupCompleted;
                }
                throw null;
            }
        });
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 55;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        String str = this.asBinder;
        int i5 = i2 + 81;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ProfileStore onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact + 87;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        ProfileStore profileStore = this.onWarmupCompleted;
        int i5 = i3 + 3;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return profileStore;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(onPageScrollStateChanged onpagescrollstatechanged, Integer num) {
        int i = 2 % 2;
        int i2 = onTransact + 113;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onpagescrollstatechanged.onWarmupCompleted(num);
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            int i4 = 99 / 0;
        }
        return unit;
    }

    public final Function1<Integer, Unit> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 55;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Function1<Integer, Unit> function1 = this.IAuthTabCallback;
        int i5 = i2 + 29;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return function1;
        }
        throw null;
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 61;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ProfileStore profileStore = this.onWarmupCompleted;
        if (profileStore == null) {
            return true;
        }
        int i4 = i3 + 41;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return profileStore.onNavigationEvent();
    }

    public final SdkTemplate IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onTransact + 125;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        SdkTemplate sdkTemplate = (SdkTemplate) this.IAuthTabCallbackDefault.getValue();
        int i4 = IAuthTabCallbackStub + 105;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return sdkTemplate;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Object obj;
        onPageScrollStateChanged onpagescrollstatechanged = (onPageScrollStateChanged) objArr[0];
        int i = 2 % 2;
        if (StringsKt.isBlank(onpagescrollstatechanged.asInterface)) {
            int i2 = IAuthTabCallbackStub + 27;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        try {
            Result.Companion companion = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl((SdkTemplate) NativeExtension.Companion.onWarmupCompleted().onExtraCallback(SdkTemplate.Companion.serializer(), onpagescrollstatechanged.asInterface));
        } catch (Throwable th) {
            Result.Companion companion2 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (kotlin.Result.onExtraCallback(obj)) {
            int i4 = onTransact + 77;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 % 2;
            }
            obj = null;
        }
        SdkTemplate sdkTemplate = (SdkTemplate) obj;
        if (sdkTemplate == null) {
            return null;
        }
        int i6 = IAuthTabCallbackStub + 123;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 67 / 0;
            if (sdkTemplate instanceof SdkTemplate.IAuthTabCallback) {
                return null;
            }
        } else if (sdkTemplate instanceof SdkTemplate.IAuthTabCallback) {
            return null;
        }
        return sdkTemplate;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        onPageScrollStateChanged onpagescrollstatechanged = (onPageScrollStateChanged) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 17;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        JsonObject jsonObject = (JsonObject) onpagescrollstatechanged.onNavigationEvent.getValue();
        int i4 = IAuthTabCallbackStub + 25;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 9 / 0;
        }
        return jsonObject;
    }

    private static final JsonObject IAuthTabCallback(onPageScrollStateChanged onpagescrollstatechanged) {
        Object obj;
        JsonObject jsonObject;
        int i = 2 % 2;
        Object obj2 = null;
        if (!(!StringsKt.isBlank(onpagescrollstatechanged.asInterface))) {
            int i2 = onTransact + 57;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 80 / 0;
            }
            return null;
        }
        try {
            Result.Companion companion = kotlin.Result.Companion;
            JsonObject jsonObjectOnExtraCallback = NativeExtension.Companion.onWarmupCompleted().onExtraCallback(onpagescrollstatechanged.asInterface);
            if (jsonObjectOnExtraCallback instanceof JsonObject) {
                int i4 = IAuthTabCallbackStub + 19;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                jsonObject = jsonObjectOnExtraCallback;
            } else {
                jsonObject = null;
            }
            obj = kotlin.Result.constructor-impl(jsonObject);
            int i6 = onTransact + 53;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
        } catch (Throwable th) {
            Result.Companion companion2 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (kotlin.Result.onExtraCallback(obj)) {
            int i8 = onTransact + 17;
            IAuthTabCallbackStub = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 87 / 0;
            }
        } else {
            obj2 = obj;
        }
        return (JsonObject) obj2;
    }

    private final void onWarmupCompleted(Integer num) {
        String strOnExtraCallbackWithResult;
        int i = 2 % 2;
        ProfileStore profileStore = this.onWarmupCompleted;
        SdkTemplate sdkTemplateIAuthTabCallbackStub = IAuthTabCallbackStub();
        if (profileStore == null || sdkTemplateIAuthTabCallbackStub == null) {
            this.onExtraCallback.invoke(num);
            return;
        }
        int i2 = onTransact;
        int i3 = i2 + 19;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        if (num == null) {
            int i5 = i2 + 125;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            strOnExtraCallbackWithResult = profileStore.onExtraCallback().onExtraCallbackWithResult().onWarmupCompleted();
        } else {
            strOnExtraCallbackWithResult = dispatchOnPageSelected.onExtraCallbackWithResult(sdkTemplateIAuthTabCallbackStub, num.intValue());
        }
        dispatchOnPageScrolled.onNavigationEvent onnavigationeventIAuthTabCallback = dispatchOnPageScrolled.onNavigationEvent.IAuthTabCallback(num == null ? dispatchOnPageSelected.onExtraCallback(sdkTemplateIAuthTabCallbackStub) : dispatchOnPageSelected.onExtraCallback(sdkTemplateIAuthTabCallbackStub, num.intValue()));
        String strIAuthTabCallback = null;
        if (num != null) {
            int i7 = onTransact + 119;
            IAuthTabCallbackStub = i7 % 128;
            if (i7 % 2 != 0) {
                dispatchOnPageSelected.IAuthTabCallback(sdkTemplateIAuthTabCallbackStub, num.intValue());
                strIAuthTabCallback.hashCode();
                throw null;
            }
            strIAuthTabCallback = dispatchOnPageSelected.IAuthTabCallback(sdkTemplateIAuthTabCallbackStub, num.intValue());
        }
        profileStore.onExtraCallback(onnavigationeventIAuthTabCallback, strIAuthTabCallback, strOnExtraCallbackWithResult);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void asInterface() {
        String strOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onTransact + 27;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        ProfileStore profileStore = this.onWarmupCompleted;
        if (profileStore != null) {
            SdkTemplate sdkTemplateIAuthTabCallbackStub = IAuthTabCallbackStub();
            Object obj = null;
            SdkTemplate.onNavigationEvent onnavigationevent = sdkTemplateIAuthTabCallbackStub instanceof SdkTemplate.onNavigationEvent ? (SdkTemplate.onNavigationEvent) sdkTemplateIAuthTabCallbackStub : null;
            if (onnavigationevent == null) {
                return;
            }
            SdkTemplateCta sdkTemplateCtaOnWarmupCompleted = onnavigationevent.onWarmupCompleted();
            if (sdkTemplateCtaOnWarmupCompleted != null) {
                int i4 = onTransact + 1;
                IAuthTabCallbackStub = i4 % 128;
                if (i4 % 2 != 0) {
                    sdkTemplateCtaOnWarmupCompleted.IAuthTabCallback();
                    throw null;
                }
                strOnWarmupCompleted = sdkTemplateCtaOnWarmupCompleted.IAuthTabCallback();
                if (strOnWarmupCompleted != null) {
                    int i5 = onTransact + 123;
                    IAuthTabCallbackStub = i5 % 128;
                    if (i5 % 2 != 0) {
                        StringsKt.isBlank(strOnWarmupCompleted);
                        obj.hashCode();
                        throw null;
                    }
                    if (!(!StringsKt.isBlank(strOnWarmupCompleted))) {
                        strOnWarmupCompleted = null;
                    }
                    if (strOnWarmupCompleted == null) {
                        strOnWarmupCompleted = profileStore.onExtraCallback().onExtraCallbackWithResult().onWarmupCompleted();
                    }
                }
            }
            profileStore.onExtraCallback(dispatchOnPageScrolled.onNavigationEvent.IAuthTabCallback(dispatchOnPageSelected.onExtraCallback(onnavigationevent)), null, strOnWarmupCompleted);
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i;
        final onPageScrollStateChanged onpagescrollstatechanged = (onPageScrollStateChanged) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        final int iIntValue = ((Number) objArr[2]).intValue();
        int i2 = 2 % 2;
        int i3 = onTransact + 29;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(424422257);
        if ((iIntValue & 6) == 0) {
            i = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onpagescrollstatechanged) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((i & 3) != 2) {
            int i5 = IAuthTabCallbackStub;
            int i6 = i5 + 61;
            onTransact = i6 % 128;
            z = i6 % 2 != 0;
            int i7 = i5 + 45;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
        }
        Object obj = null;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(424422257, i, -1, "im.toss.ads_sdk.ui.NativeAdsRenderScope.Template (NativeAdsRenderer.kt:200)");
            }
            getBacktraceNote<onPageScrollStateChanged, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenoteIAuthTabCallback = WebSettingsAdapterExternalSyntheticLambda0.onWarmupCompleted.IAuthTabCallback(onpagescrollstatechanged.asBinder);
            if (getbacktracenoteIAuthTabCallback == null) {
                int i9 = IAuthTabCallbackStub + 59;
                onTransact = i9 % 128;
                if (i9 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-420186364);
                    obj.hashCode();
                    throw null;
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-420186364);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-152101731);
                getbacktracenoteIAuthTabCallback.invoke(onpagescrollstatechanged, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(i & 14));
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.ads_sdk.ui.NativeAdsRenderScope$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                public final Object invoke(Object obj2, Object obj3) {
                    int i10 = 2 % 2;
                    int i11 = onExtraCallback + 33;
                    IAuthTabCallback = i11 % 128;
                    int i12 = i11 % 2;
                    Unit unitOnNavigationEvent = onPageScrollStateChanged.onNavigationEvent(this.f$0, iIntValue, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i13 = onExtraCallback + 27;
                    IAuthTabCallback = i13 % 128;
                    int i14 = i13 % 2;
                    return unitOnNavigationEvent;
                }
            });
        }
        int i10 = IAuthTabCallbackStub + 105;
        onTransact = i10 % 128;
        int i11 = i10 % 2;
        return null;
    }

    public static final class onWarmupCompleted {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final onPageScrollStateChanged onExtraCallbackWithResult(@NotNull NativeExtension nativeExtension, @NotNull Function1<? super Integer, Unit> function1, @Nullable ProfileStore profileStore) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(nativeExtension, "");
            Intrinsics.checkNotNullParameter(function1, "");
            onPageScrollStateChanged onpagescrollstatechanged = new onPageScrollStateChanged(nativeExtension.onWarmupCompleted(), nativeExtension.IAuthTabCallback(), function1, profileStore);
            int i2 = onExtraCallbackWithResult + 23;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onpagescrollstatechanged;
        }
    }

    private static final SdkTemplate onExtraCallbackWithResult(onPageScrollStateChanged onpagescrollstatechanged) {
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        return (SdkTemplate) onExtraCallbackWithResult(2054558485, ICustomTabsCallbackStubProxy.onExtraCallback(), -2054558483, new Object[]{onpagescrollstatechanged}, iOnExtraCallback2, iOnExtraCallback, ICustomTabsCallbackStubProxy.onExtraCallback());
    }

    public final void onWarmupCompleted(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {this, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        onExtraCallbackWithResult(501992039, ICustomTabsCallbackStubProxy.onExtraCallback(), -501992039, objArr, ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback, ICustomTabsCallbackStubProxy.onExtraCallback());
    }

    public final JsonObject onExtraCallbackWithResult() {
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        return (JsonObject) onExtraCallbackWithResult(-600051351, ICustomTabsCallbackStubProxy.onExtraCallback(), 600051352, new Object[]{this}, iOnExtraCallback2, iOnExtraCallback, ICustomTabsCallbackStubProxy.onExtraCallback());
    }
}
