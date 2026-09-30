package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import com.alibaba.griver.device.adapter.GriverCommonAbilityProxyImpl;
import im.toss.deeplink.ksp.registry.FeaturesMydataKspDeepLinkRegistry$;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.toIntegerList;
import o.toStringMap;
import o.useAndConfigureProgramWithTexture;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class toIntegerList {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    private final QuirksExternalSyntheticBackport0 onExtraCallback;
    private final int onExtraCallbackWithResult;
    private final Function1<VirtualCameraInfo, Unit> onWarmupCompleted;

    private static final Unit IAuthTabCallback(toIntegerList tointegerlist, toStringMap tostringmap, Function2 function2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 57;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        tointegerlist.onNavigationEvent(tostringmap, function2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallback + 15;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(toStringMap tostringmap, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(tostringmap, useandconfigureprogramwithtexture);
        int i4 = onNavigationEvent + 35;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 96 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(toIntegerList tointegerlist, toStringMap tostringmap, Function2 function2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 97;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            IAuthTabCallback(tointegerlist, tostringmap, function2, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(tointegerlist, tostringmap, function2, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i6 = onNavigationEvent + 25;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return unitIAuthTabCallback;
    }

    public toIntegerList(int i, @NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable Function1<? super VirtualCameraInfo, Unit> function1) {
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        this.onExtraCallbackWithResult = i;
        this.onExtraCallback = quirksExternalSyntheticBackport0;
        this.onWarmupCompleted = function1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ toIntegerList(int i, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            quirksExternalSyntheticBackport0 = QuirksExternalSyntheticBackport0.Companion;
            int i3 = onNavigationEvent + 93;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 2 % 2;
            }
        }
        if ((i2 & 4) != 0) {
            int i5 = onNavigationEvent + 67;
            IAuthTabCallback = i5 % 128;
            Object obj = null;
            if (i5 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i6 = 2 % 2;
            function1 = null;
        }
        this(i, quirksExternalSyntheticBackport0, function1);
    }

    private static final Unit onNavigationEvent(toStringMap tostringmap, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        String strOnExtraCallback = tostringmap.onExtraCallback();
        if (strOnExtraCallback != null) {
            int i4 = onNavigationEvent + 67;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, strOnExtraCallback);
                int i5 = 12 / 0;
            } else {
                unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, strOnExtraCallback);
            }
        }
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallback + 97;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ float $maxFontScale;
        final /* synthetic */ toStringMap $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(toStringMap tostringmap, float f, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$state = tostringmap;
            this.$maxFontScale = f;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$state, this.$maxFontScale, access13800Var);
            int i2 = IAuthTabCallback + 81;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return onextracallback;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 13;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 79;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 7;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 123;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 49;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i2 + 65;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            if (i6 == 0) {
                this.$state.onNavigationEvent(access14000.onExtraCallbackWithResult(this.$maxFontScale));
                return Unit.INSTANCE;
            }
            this.$state.onNavigationEvent(access14000.onExtraCallbackWithResult(this.$maxFontScale));
            Unit unit = Unit.INSTANCE;
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v8 */
    public final void onNavigationEvent(@Nullable toStringMap tostringmap, @Nullable Function2<? super Boolean, Object, Unit> function2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        final toStringMap tostringmapOnWarmupCompleted;
        int i3;
        Function2<? super Boolean, Object, Unit> function22;
        int i4;
        Function2<? super Boolean, Object, Unit> function23;
        int i5;
        boolean z;
        int i6;
        int i7;
        int i8 = 2 % 2;
        int i9 = onNavigationEvent + 19;
        IAuthTabCallback = i9 % 128;
        int i10 = i9 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-2077122951);
        if ((i & 6) == 0) {
            if ((i2 & 1) == 0) {
                tostringmapOnWarmupCompleted = tostringmap;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(tostringmapOnWarmupCompleted)) {
                    i7 = 4;
                }
                i3 = i7 | i;
            } else {
                tostringmapOnWarmupCompleted = tostringmap;
            }
            i7 = 2;
            i3 = i7 | i;
        } else {
            tostringmapOnWarmupCompleted = tostringmap;
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
            function22 = function2;
        } else {
            function22 = function2;
            if ((i & 48) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function22)) {
                    i4 = 32;
                } else {
                    int i12 = onNavigationEvent + 77;
                    IAuthTabCallback = i12 % 128;
                    int i13 = i12 % 2;
                    i4 = 16;
                }
                i3 |= i4;
            }
        }
        if ((i & 384) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this) ? 256 : 128;
        }
        int i14 = i3;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i14 & 147) != 146, i14 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
            if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                if ((i2 & 1) != 0) {
                    int i15 = IAuthTabCallback + 23;
                    onNavigationEvent = i15 % 128;
                    int i16 = i15 % 2;
                    i5 = 1;
                    i14 &= -15;
                    z = false;
                    tostringmapOnWarmupCompleted = hashMap.onWarmupCompleted(null, false, false, null, null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 63);
                } else {
                    i5 = 1;
                    z = false;
                }
                if (i11 != 0) {
                    function23 = null;
                    i6 = z;
                } else {
                    function23 = function2;
                    i6 = z;
                }
            } else {
                int i17 = IAuthTabCallback + 25;
                onNavigationEvent = i17 % 128;
                int i18 = i17 % 2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                if ((i2 & 1) != 0) {
                    i14 &= -15;
                }
                i5 = 1;
                function23 = function22;
                i6 = 0;
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2077122951, i14, -1, "im.toss.tds.compose.component.compound.agreement.v4.row.LeftPreset.CheckBox (TdsAgreementV4RowPresets.kt:74)");
            }
            float fFloatValue = ((Number) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback((accessisMonitoringp) toStringList.onNavigationEvent(813075283, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), new Object[i6], -813075282, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted()))).floatValue();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = this.onExtraCallback;
            int i19 = (i14 & 14) ^ 6;
            int i20 = ((i19 <= 4 || !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(tostringmapOnWarmupCompleted)) && (i14 & 6) != 4) ? i6 : i5;
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if ((i20 ^ i5) == 0 || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.compound.agreement.v4.row.LeftPreset$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj) {
                        int i21 = 2 % 2;
                        int i22 = onNavigationEvent + 67;
                        IAuthTabCallback = i22 % 128;
                        int i23 = i22 % 2;
                        toStringMap tostringmap2 = tostringmapOnWarmupCompleted;
                        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) obj;
                        if (i23 != 0) {
                            return toIntegerList.IAuthTabCallback(tostringmap2, useandconfigureprogramwithtexture);
                        }
                        toIntegerList.IAuthTabCallback(tostringmap2, useandconfigureprogramwithtexture);
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            int i21 = i14;
            addUniqueObjectIfExists.onExtraCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 1167395490, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -1167395487, new Object[]{getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, i6, (Function1) objOnMinimized, i5, (Object) null), tostringmapOnWarmupCompleted, Integer.valueOf(this.onExtraCallbackWithResult), function23, this.onWarmupCompleted, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(((i14 << 3) & 112) | ((i14 << 6) & 7168)), Integer.valueOf(i6)});
            boolean z2 = (i19 > 4 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(tostringmapOnWarmupCompleted)) || (i21 & 6) == 4;
            boolean zIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fFloatValue);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if ((zIAuthTabCallback | z2) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized2 = new onExtraCallback(tostringmapOnWarmupCompleted, fFloatValue, null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
            }
            isZslDisabledByByUserCaseConfig.onNavigationEvent(Float.valueOf(fFloatValue), (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            function23 = function2;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            final toStringMap tostringmap2 = tostringmapOnWarmupCompleted;
            final Function2<? super Boolean, Object, Unit> function24 = function23;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.agreement.v4.row.LeftPreset$$ExternalSyntheticLambda1
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i22 = 2 % 2;
                    int i23 = onExtraCallback + 85;
                    onNavigationEvent = i23 % 128;
                    int i24 = i23 % 2;
                    Unit unitOnExtraCallbackWithResult = toIntegerList.onExtraCallbackWithResult(this.f$0, tostringmap2, function24, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i25 = onNavigationEvent + 41;
                    onExtraCallback = i25 % 128;
                    if (i25 % 2 != 0) {
                        int i26 = 14 / 0;
                    }
                    return unitOnExtraCallbackWithResult;
                }
            });
        }
    }
}
