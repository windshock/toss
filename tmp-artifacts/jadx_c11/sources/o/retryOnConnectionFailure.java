package o;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinNativeAdImplExternalSyntheticLambda2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.retryOnConnectionFailure;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class retryOnConnectionFailure implements eventListener, getConnectionPoolokhttp, connectTimeout {
    private static int asInterface = 1;
    private static int onExtraCallbackWithResult;
    private final getSupportedHighSpeedResolutionsFor<AppLovinNativeAdImplExternalSyntheticLambda2.onWarmupCompleted> IAuthTabCallback;
    private final getSupportedHighSpeedResolutionsFor<AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent> onExtraCallback;
    private final getSupportedHighSpeedResolutionsFor<AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult> onNavigationEvent;
    private final getMinWebSocketMessageToCompressokhttp onWarmupCompleted;

    public retryOnConnectionFailure() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(retryOnConnectionFailure retryonconnectionfailure, Object obj, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 11;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(retryonconnectionfailure, obj, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = asInterface + 11;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 28 / 0;
        }
        return unitIAuthTabCallback;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof retryOnConnectionFailure)) {
            return false;
        }
        retryOnConnectionFailure retryonconnectionfailure = (retryOnConnectionFailure) obj;
        if (!Intrinsics.areEqual(this.onWarmupCompleted, retryonconnectionfailure.onWarmupCompleted)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallback, retryonconnectionfailure.onExtraCallback)) {
            int i2 = onExtraCallbackWithResult + 57;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onNavigationEvent, retryonconnectionfailure.onNavigationEvent)) {
            return false;
        }
        if (Intrinsics.areEqual(this.IAuthTabCallback, retryonconnectionfailure.IAuthTabCallback)) {
            return true;
        }
        int i4 = onExtraCallbackWithResult + 115;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 19;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.onWarmupCompleted.hashCode() * 31) + this.onExtraCallback.hashCode()) * 31) + this.onNavigationEvent.hashCode()) * 31) + this.IAuthTabCallback.hashCode();
        int i4 = onExtraCallbackWithResult + 123;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    @Override // o.getNetworkInterceptorsokhttp
    public void onExtraCallbackWithResult(@Nullable setByteOrder setbyteorder) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            this.onWarmupCompleted.onExtraCallbackWithResult(setbyteorder);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.onWarmupCompleted.onExtraCallbackWithResult(setbyteorder);
        int i3 = onExtraCallbackWithResult + 3;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // o.getNetworkInterceptorsokhttp
    public void onNavigationEvent(@Nullable Integer num) {
        int i = 2 % 2;
        int i2 = asInterface + 37;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        this.onWarmupCompleted.onNavigationEvent(num);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.getFollowSslRedirectsokhttp
    public void onNavigationEvent(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        this.onWarmupCompleted.onNavigationEvent(str);
        int i4 = onExtraCallbackWithResult + 91;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.getFollowSslRedirectsokhttp
    public void onNavigationEvent(@Nullable hasProvider hasprovider) {
        int i = 2 % 2;
        int i2 = asInterface + 35;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        this.onWarmupCompleted.onNavigationEvent(hasprovider);
        int i4 = asInterface + 53;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 35 / 0;
        }
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BadgeState(textState=" + this.onWarmupCompleted + ", size=" + this.onExtraCallback + ", type=" + this.onNavigationEvent + ", style=" + this.IAuthTabCallback + ")";
        int i2 = onExtraCallbackWithResult + 103;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public retryOnConnectionFailure(@NotNull getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttp, @NotNull getSupportedHighSpeedResolutionsFor<AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent> getsupportedhighspeedresolutionsfor, @NotNull getSupportedHighSpeedResolutionsFor<AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult> getsupportedhighspeedresolutionsfor2, @NotNull getSupportedHighSpeedResolutionsFor<AppLovinNativeAdImplExternalSyntheticLambda2.onWarmupCompleted> getsupportedhighspeedresolutionsfor3) {
        Intrinsics.checkNotNullParameter(getminwebsocketmessagetocompressokhttp, "");
        Intrinsics.checkNotNullParameter(getsupportedhighspeedresolutionsfor, "");
        Intrinsics.checkNotNullParameter(getsupportedhighspeedresolutionsfor2, "");
        Intrinsics.checkNotNullParameter(getsupportedhighspeedresolutionsfor3, "");
        this.onWarmupCompleted = getminwebsocketmessagetocompressokhttp;
        this.onExtraCallback = getsupportedhighspeedresolutionsfor;
        this.onNavigationEvent = getsupportedhighspeedresolutionsfor2;
        this.IAuthTabCallback = getsupportedhighspeedresolutionsfor3;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ retryOnConnectionFailure(o.getMinWebSocketMessageToCompressokhttp r23, o.getSupportedHighSpeedResolutionsFor r24, o.getSupportedHighSpeedResolutionsFor r25, o.getSupportedHighSpeedResolutionsFor r26, int r27, kotlin.jvm.internal.DefaultConstructorMarker r28) {
        /*
            r22 = this;
            r0 = r27 & 1
            r1 = 2
            if (r0 == 0) goto L34
            o.getMinWebSocketMessageToCompressokhttp r0 = new o.getMinWebSocketMessageToCompressokhttp
            r2 = r0
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 65535(0xffff, float:9.1834E-41)
            r21 = 0
            r2.<init>(r3, r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            int r2 = o.retryOnConnectionFailure.onExtraCallbackWithResult
            int r2 = r2 + 119
            int r3 = r2 % 128
            o.retryOnConnectionFailure.asInterface = r3
            int r2 = r2 % r1
            if (r2 != 0) goto L31
            goto L36
        L31:
            int r2 = r1 % r1
            goto L36
        L34:
            r0 = r23
        L36:
            r2 = r27 & 2
            r3 = 0
            if (r2 == 0) goto L4b
            int r2 = o.retryOnConnectionFailure.onExtraCallbackWithResult
            int r2 = r2 + 87
            int r4 = r2 % 128
            o.retryOnConnectionFailure.asInterface = r4
            int r2 = r2 % r1
            o.AppLovinNativeAdImplExternalSyntheticLambda2$onNavigationEvent r2 = o.AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent.Small
            o.getSupportedHighSpeedResolutionsFor r2 = o.CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(r2, r3, r1, r3)
            goto L4d
        L4b:
            r2 = r24
        L4d:
            r4 = r27 & 4
            if (r4 == 0) goto L63
            o.AppLovinNativeAdImplExternalSyntheticLambda2$onExtraCallbackWithResult r4 = o.AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult.Blue
            o.getSupportedHighSpeedResolutionsFor r4 = o.CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(r4, r3, r1, r3)
            int r5 = o.retryOnConnectionFailure.onExtraCallbackWithResult
            int r5 = r5 + 117
            int r6 = r5 % 128
            o.retryOnConnectionFailure.asInterface = r6
            int r5 = r5 % r1
            int r5 = r1 % r1
            goto L65
        L63:
            r4 = r25
        L65:
            r5 = r27 & 8
            if (r5 == 0) goto L72
            o.AppLovinNativeAdImplExternalSyntheticLambda2$onWarmupCompleted r5 = o.AppLovinNativeAdImplExternalSyntheticLambda2.onWarmupCompleted.Fill
            o.getSupportedHighSpeedResolutionsFor r1 = o.CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(r5, r3, r1, r3)
            r3 = r22
            goto L76
        L72:
            r3 = r22
            r1 = r26
        L76:
            r3.<init>(r0, r2, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.retryOnConnectionFailure.<init>(o.getMinWebSocketMessageToCompressokhttp, o.getSupportedHighSpeedResolutionsFor, o.getSupportedHighSpeedResolutionsFor, o.getSupportedHighSpeedResolutionsFor, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final getMinWebSocketMessageToCompressokhttp onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface + 125;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttp = this.onWarmupCompleted;
        int i4 = i3 + 37;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return getminwebsocketmessagetocompressokhttp;
        }
        throw null;
    }

    public final getSupportedHighSpeedResolutionsFor<AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getSupportedHighSpeedResolutionsFor<AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 87;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        getSupportedHighSpeedResolutionsFor<AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult> getsupportedhighspeedresolutionsfor = this.onNavigationEvent;
        int i5 = i3 + 123;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return getsupportedhighspeedresolutionsfor;
    }

    public final getSupportedHighSpeedResolutionsFor<AppLovinNativeAdImplExternalSyntheticLambda2.onWarmupCompleted> onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 49;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getSupportedHighSpeedResolutionsFor<AppLovinNativeAdImplExternalSyntheticLambda2.onWarmupCompleted> getsupportedhighspeedresolutionsfor = this.IAuthTabCallback;
        int i4 = i3 + 3;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return getsupportedhighspeedresolutionsfor;
    }

    @Override // o.eventListener
    public <T> getBacktraceNote<T, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent() {
        int i = 2 % 2;
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(487046778, true, new getBacktraceNote() { // from class: im.toss.tds.view.compat.component.state.BadgeState$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 11;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    retryOnConnectionFailure.onExtraCallbackWithResult(this.f$0, obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    throw null;
                }
                Unit unitOnExtraCallbackWithResult = retryOnConnectionFailure.onExtraCallbackWithResult(this.f$0, obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onExtraCallback + 105;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return unitOnExtraCallbackWithResult;
                }
                throw null;
            }
        });
        int i2 = onExtraCallbackWithResult + 121;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return encoderProfilesProxyVideoProfileProxyOnExtraCallbackWithResult;
    }

    private static final Unit IAuthTabCallback(retryOnConnectionFailure retryonconnectionfailure, Object obj, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 27;
        onExtraCallbackWithResult = i4 % 128;
        boolean z = false;
        if (i4 % 2 == 0 ? (i & 17) != 16 : (i & 39) != 96) {
            int i5 = i3 + 57;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                z = true;
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(487046778, i, -1, "im.toss.tds.view.compat.component.state.BadgeState.toComposable.<anonymous> (BadgeState.kt:16)");
            }
            hasProvider hasprovider = (hasProvider) retryonconnectionfailure.onWarmupCompleted.IAuthTabCallbackStub().onExtraCallbackWithResult();
            if (hasprovider == null) {
                hasprovider = new hasProvider("", (List) null, 2, (DefaultConstructorMarker) null);
            }
            AppLovinNativeAdImplExternalSyntheticLambda10.onExtraCallbackWithResult(hasprovider, null, (AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent) retryonconnectionfailure.onExtraCallback.onExtraCallbackWithResult(), (AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult) retryonconnectionfailure.onNavigationEvent.onExtraCallbackWithResult(), (AppLovinNativeAdImplExternalSyntheticLambda2.onWarmupCompleted) retryonconnectionfailure.IAuthTabCallback.onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, 0, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }
}
