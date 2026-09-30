package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinNativeAdImplExternalSyntheticLambda2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0;
import o.addInterceptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class addInterceptor implements eventListener {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final LiveDataObservableExternalSyntheticLambda1<retryOnConnectionFailure> onWarmupCompleted;

    /* JADX WARN: Illegal instructions before constructor call */
    public addInterceptor() {
        LiveDataObservableExternalSyntheticLambda1 liveDataObservableExternalSyntheticLambda1 = null;
        this(liveDataObservableExternalSyntheticLambda1, 1, liveDataObservableExternalSyntheticLambda1);
    }

    public static /* synthetic */ Unit IAuthTabCallback(addInterceptor addinterceptor, Object obj, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 71;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(addinterceptor, obj, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 99;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 28 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(addInterceptor addinterceptor, y1b y1bVar, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 99;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(addinterceptor, y1bVar, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onExtraCallback + 29;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onWarmupCompleted(addInterceptor addinterceptor, CameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0 cameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 79;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(addinterceptor, cameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 83;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    private static final Unit onWarmupCompleted(addInterceptor addinterceptor, y1b y1bVar, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 111;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        addinterceptor.onExtraCallbackWithResult(y1bVar, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallback + 111;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 37 / 0;
        }
        return unit;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r5 instanceof o.addInterceptor) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r4.onWarmupCompleted, ((o.addInterceptor) r5).onWarmupCompleted) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        r5 = o.addInterceptor.onExtraCallbackWithResult + 41;
        o.addInterceptor.onExtraCallback = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if ((r5 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        r5 = o.addInterceptor.onExtraCallback + 19;
        o.addInterceptor.onExtraCallbackWithResult = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        if ((r5 % 2) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r4 == r5) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r4 == r5) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 51 / 0;
        }
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.onWarmupCompleted.hashCode();
        int i4 = onExtraCallbackWithResult + 99;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BadgeListState(badges=" + this.onWarmupCompleted + ")";
        int i2 = onExtraCallback + 37;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public addInterceptor(@NotNull LiveDataObservableExternalSyntheticLambda1<retryOnConnectionFailure> liveDataObservableExternalSyntheticLambda1) {
        Intrinsics.checkNotNullParameter(liveDataObservableExternalSyntheticLambda1, "");
        this.onWarmupCompleted = liveDataObservableExternalSyntheticLambda1;
    }

    public /* synthetic */ addInterceptor(LiveDataObservableExternalSyntheticLambda1 liveDataObservableExternalSyntheticLambda1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            liveDataObservableExternalSyntheticLambda1 = new LiveDataObservableExternalSyntheticLambda1();
            int i2 = onExtraCallbackWithResult + 69;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
        }
        this(liveDataObservableExternalSyntheticLambda1);
    }

    public final LiveDataObservableExternalSyntheticLambda1<retryOnConnectionFailure> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 31;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        LiveDataObservableExternalSyntheticLambda1<retryOnConnectionFailure> liveDataObservableExternalSyntheticLambda1 = this.onWarmupCompleted;
        int i5 = i2 + 17;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return liveDataObservableExternalSyntheticLambda1;
    }

    @Override // o.eventListener
    public <T> getBacktraceNote<T, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        LiveDataObservableExternalSyntheticLambda1<retryOnConnectionFailure> liveDataObservableExternalSyntheticLambda1 = this.onWarmupCompleted;
        if (liveDataObservableExternalSyntheticLambda1.isEmpty()) {
            int i4 = onExtraCallbackWithResult;
            int i5 = i4 + 95;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 55 / 0;
            }
            int i7 = i4 + 31;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            liveDataObservableExternalSyntheticLambda1 = null;
        }
        if (liveDataObservableExternalSyntheticLambda1 != null) {
            return ForwardingCameraControl.onExtraCallbackWithResult(-2142203884, true, new getBacktraceNote() { // from class: im.toss.tds.view.compat.component.state.BadgeListState$$ExternalSyntheticLambda0
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i9 = 2 % 2;
                    int i10 = onExtraCallback + 71;
                    onNavigationEvent = i10 % 128;
                    int i11 = i10 % 2;
                    Unit unitIAuthTabCallback = addInterceptor.IAuthTabCallback(this.f$0, obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i12 = onExtraCallback + 17;
                    onNavigationEvent = i12 % 128;
                    int i13 = i12 % 2;
                    return unitIAuthTabCallback;
                }
            });
        }
        return null;
    }

    private static final Unit onExtraCallbackWithResult(addInterceptor addinterceptor, Object obj, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean zOnExtraCallback;
        int i2;
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult;
        int i5 = i4 + 73;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0 ? (i & 6) == 0 : (i & 31) == 0) {
            if ((i & 8) == 0) {
                int i6 = i4 + 105;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(obj);
            } else {
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(obj);
            }
            if (zOnExtraCallback) {
                int i8 = onExtraCallbackWithResult + 73;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                i2 = 4;
            } else {
                i2 = 2;
            }
            i |= i2;
        }
        boolean z = false;
        if ((i & 19) != 18) {
            int i10 = onExtraCallbackWithResult + 83;
            onExtraCallback = i10 % 128;
            if (i10 % 2 == 0) {
                z = true;
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = onExtraCallbackWithResult + 87;
                onExtraCallback = i11 % 128;
                int i12 = i11 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2142203884, i, -1, "im.toss.tds.view.compat.component.state.BadgeListState.toComposable.<anonymous>.<anonymous> (BadgeListState.kt:14)");
            }
            if (obj instanceof y1b) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1368594915);
                addinterceptor.onExtraCallbackWithResult((y1b) obj, cameraCaptureResultEmptyCameraCaptureResult, i & 14);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(523257102);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                int i13 = onExtraCallback + 15;
                onExtraCallbackWithResult = i13 % 128;
                int i14 = i13 % 2;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(addInterceptor addinterceptor, CameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0 cameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(cameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0, "");
        boolean z = false;
        if ((i & 17) != 16) {
            int i3 = onExtraCallbackWithResult + 45;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                z = true;
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i4 = onExtraCallback + 109;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1233774382, i, -1, "im.toss.tds.view.compat.component.state.BadgeListState.Content.<anonymous> (BadgeListState.kt:24)");
            }
            int i5 = onExtraCallback + 99;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            for (retryOnConnectionFailure retryonconnectionfailure : addinterceptor.onWarmupCompleted) {
                hasProvider hasprovider = (hasProvider) retryonconnectionfailure.onExtraCallbackWithResult().IAuthTabCallbackStub().onExtraCallbackWithResult();
                if (hasprovider == null) {
                    hasprovider = new hasProvider("", (List) null, 2, (DefaultConstructorMarker) null);
                }
                AppLovinNativeAdImplExternalSyntheticLambda10.onExtraCallbackWithResult(hasprovider, null, (AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent) retryonconnectionfailure.onWarmupCompleted().onExtraCallbackWithResult(), (AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult) retryonconnectionfailure.IAuthTabCallback().onExtraCallbackWithResult(), (AppLovinNativeAdImplExternalSyntheticLambda2.onWarmupCompleted) retryonconnectionfailure.onExtraCallback().onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, 0, 2);
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public final void onExtraCallbackWithResult(@NotNull final y1b y1bVar, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1bVar, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(2012157627);
        if ((i & 6) == 0) {
            int i5 = onExtraCallbackWithResult + 87;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(y1bVar) ^ true ? 2 : 4) | i;
            int i7 = onExtraCallback + 9;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this)) {
                int i9 = onExtraCallbackWithResult + 83;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            int i11 = onExtraCallbackWithResult + 29;
            onExtraCallback = i11 % 128;
            int i12 = i11 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
            int i13 = onExtraCallbackWithResult + 57;
            onExtraCallback = i13 % 128;
            int i14 = i13 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2012157627, i2, -1, "im.toss.tds.view.compat.component.state.BadgeListState.Content (BadgeListState.kt:22)");
            }
            y1bVar.onExtraCallback(ForwardingCameraControl.onExtraCallback(1233774382, true, new getBacktraceNote() { // from class: im.toss.tds.view.compat.component.state.BadgeListState$$ExternalSyntheticLambda1
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i15 = 2 % 2;
                    int i16 = onExtraCallback + 27;
                    onExtraCallbackWithResult = i16 % 128;
                    int i17 = i16 % 2;
                    addInterceptor addinterceptor = this.f$0;
                    CameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0 cameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0 = (CameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0) obj;
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (i17 == 0) {
                        return addInterceptor.onWarmupCompleted(addinterceptor, cameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue);
                    }
                    addInterceptor.onWarmupCompleted(addinterceptor, cameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue);
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i2 << 3) & 112) | 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i15 = onExtraCallback + 39;
                onExtraCallbackWithResult = i15 % 128;
                if (i15 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i16 = 7 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.view.compat.component.state.BadgeListState$$ExternalSyntheticLambda2
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj, Object obj2) {
                    int i17 = 2 % 2;
                    int i18 = onWarmupCompleted + 93;
                    onNavigationEvent = i18 % 128;
                    int i19 = i18 % 2;
                    Unit unitOnNavigationEvent = addInterceptor.onNavigationEvent(this.f$0, y1bVar, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i20 = onWarmupCompleted + 21;
                    onNavigationEvent = i20 % 128;
                    if (i20 % 2 != 0) {
                        return unitOnNavigationEvent;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            });
            int i17 = onExtraCallback + 61;
            onExtraCallbackWithResult = i17 % 128;
            if (i17 % 2 == 0) {
                int i18 = 3 / 3;
            }
        }
    }
}
