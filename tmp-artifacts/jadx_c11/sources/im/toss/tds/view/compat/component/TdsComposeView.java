package im.toss.tds.view.compat.component;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AbstractComposeView;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda2;
import o.ForwardingCameraControl;
import o.MonitorCrashHeaderParams;
import o.QuirksExternalSyntheticBackport0;
import o.accessgetCameraFactoryp;
import o.accessisMonitoringp;
import o.addTags;
import o.clearAllCameraStateObserverslambda19lambda18;
import o.clearFaultAdjacentMetadata;
import o.getSupportedHighSpeedResolutionsFor;
import o.initMiniApp;
import o.initSDK;
import o.setPostviewFormatSelector;
import o.setThreadList;
import o.y1hExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class TdsComposeView extends AbstractComposeView implements addTags {
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder;
    private final getSupportedHighSpeedResolutionsFor<Set<String>> IAuthTabCallback;
    private final Map<String, Object> onExtraCallbackWithResult;
    private final getSupportedHighSpeedResolutionsFor<Function1<initSDK.onNavigationEvent, Unit>> onNavigationEvent;
    private final List<initSDK> onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsComposeView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsComposeView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    private static final Unit IAuthTabCallback(TdsComposeView tdsComposeView, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 101;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        tdsComposeView.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = asBinder + 17;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 57 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(TdsComposeView tdsComposeView, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 47;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(tdsComposeView, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallbackStub + 33;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i4;
        int i9 = ~i2;
        int i10 = (~(i7 | i9)) | i8;
        int i11 = ~(i9 | i8 | i7);
        int i12 = i4 + i6 + i3 + ((-112346298) * i5) + (505796074 * i);
        int i13 = i12 * i12;
        int i14 = ((1543607772 * i4) - 1525940224) + (1734765094 * i6) + (i7 * 95578661) + ((-95578661) * i10) + (95578661 * i11) + (1639186432 * i3) + (859308032 * i5) + (310902784 * i) + (417529856 * i13);
        int i15 = (i4 * (-1233303660)) + 1670658458 + (i6 * (-1233302158)) + (i7 * 751) + (i10 * (-751)) + (i11 * 751) + (i3 * (-1233302909)) + (i5 * 1075253458) + (i * 745806526) + (i13 * 1512636416);
        return i14 + ((i15 * i15) * (-1737162752)) != 1 ? onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TdsComposeView tdsComposeView, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = asBinder + 13;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(tdsComposeView, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = asBinder + 9;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(TdsComposeView tdsComposeView, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 49;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            onExtraCallback(tdsComposeView, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(tdsComposeView, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = IAuthTabCallbackStub + 17;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 35 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(TdsComposeView tdsComposeView, initSDK.onNavigationEvent onnavigationevent) {
        Unit unit;
        int i = 2 % 2;
        int i2 = asBinder + 23;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
            unit = (Unit) onExtraCallbackWithResult(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{tdsComposeView, onnavigationevent}, -2030169503, iOnExtraCallbackWithResult3, 2030169503);
            int i3 = 9 / 0;
        } else {
            int iOnExtraCallbackWithResult4 = JsParamKeys.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult5 = JsParamKeys.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult6 = JsParamKeys.onExtraCallbackWithResult();
            unit = (Unit) onExtraCallbackWithResult(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult5, new Object[]{tdsComposeView, onnavigationevent}, -2030169503, iOnExtraCallbackWithResult6, 2030169503);
        }
        int i4 = asBinder + 41;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 55 / 0;
        }
        return unit;
    }

    public abstract void onExtraCallbackWithResult(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TdsComposeView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.onWarmupCompleted = new ArrayList();
        this.IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(clearFaultAdjacentMetadata.onExtraCallback(), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onNavigationEvent = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onExtraCallbackWithResult = new LinkedHashMap();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsComposeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = asBinder + 35;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i6 = IAuthTabCallbackStub + 87;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public List<initSDK> onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 117;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        List<initSDK> list = this.onWarmupCompleted;
        int i5 = i3 + 67;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        TdsComposeView tdsComposeView = (TdsComposeView) objArr[0];
        initSDK.onNavigationEvent onnavigationevent = (initSDK.onNavigationEvent) objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 21;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        Function1 function1 = (Function1) tdsComposeView.onNavigationEvent.onExtraCallbackWithResult();
        if (function1 != null) {
            function1.invoke(onnavigationevent);
        }
        onnavigationevent.onNavigationEvent(tdsComposeView.onExtraCallbackWithResult);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 33;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(TdsComposeView tdsComposeView, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = asBinder + 87;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            int i5 = asBinder + 25;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1598667077, i, -1, "im.toss.tds.view.compat.component.TdsComposeView.Content.<anonymous>.<anonymous> (TdsComposeView.kt:45)");
            }
            tdsComposeView.onExtraCallbackWithResult((QuirksExternalSyntheticBackport0) QuirksExternalSyntheticBackport0.Companion, cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = asBinder + 5;
                IAuthTabCallbackStub = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(final TdsComposeView tdsComposeView, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = asBinder;
        int i4 = i3 + 9;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 3) != 2) {
            z = true;
        } else {
            int i6 = i3 + 105;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1))) {
            int i8 = asBinder + 63;
            IAuthTabCallbackStub = i8 % 128;
            int i9 = i8 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1790152861, i, -1, "im.toss.tds.view.compat.component.TdsComposeView.Content.<anonymous> (TdsComposeView.kt:44)");
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallback(-1598667077, true, new Function2() { // from class: im.toss.tds.view.compat.component.TdsComposeView$$ExternalSyntheticLambda0
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i10 = 2 % 2;
                    int i11 = onExtraCallbackWithResult + 113;
                    onWarmupCompleted = i11 % 128;
                    int i12 = i11 % 2;
                    Unit unitIAuthTabCallback = TdsComposeView.IAuthTabCallback(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i13 = onWarmupCompleted + 37;
                    onExtraCallbackWithResult = i13 % 128;
                    int i14 = i13 % 2;
                    return unitIAuthTabCallback;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = asBinder + 123;
                IAuthTabCallbackStub = i10 % 128;
                if (i10 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d A[PHI: r1
      0x003d: PHI (r1v8 o.CameraCaptureResultEmptyCameraCaptureResult) = (r1v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r1v9 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0027, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029 A[PHI: r1
      0x0029: PHI (r1v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r1v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r1v9 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0027, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void IAuthTabCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i2;
        int i3;
        initMiniApp initminiapp;
        int i4 = 2 % 2;
        int i5 = asBinder + 95;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1426888029);
            if ((i & 48) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this)) {
                    i2 = 4;
                } else {
                    int i6 = IAuthTabCallbackStub + 65;
                    asBinder = i6 % 128;
                    int i7 = i6 % 2;
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1426888029);
            if ((i & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 3) != 2, i3 & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1426888029, i3, -1, "im.toss.tds.view.compat.component.TdsComposeView.Content (TdsComposeView.kt:34)");
            }
            accessisMonitoringp accessismonitoringpAccess100 = setThreadList.access100();
            initMiniApp context = getContext();
            if (context instanceof initMiniApp) {
                int i8 = IAuthTabCallbackStub + 23;
                asBinder = i8 % 128;
                int i9 = i8 % 2;
                initminiapp = context;
            } else {
                initminiapp = null;
            }
            accessgetCameraFactoryp accessgetcamerafactorypOnExtraCallback = accessismonitoringpAccess100.onExtraCallback(initminiapp);
            accessgetCameraFactoryp accessgetcamerafactorypOnExtraCallback2 = setThreadList.getInterfaceDescriptor().onExtraCallback(this);
            accessisMonitoringp accessismonitoringp = (accessisMonitoringp) setThreadList.onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[0], GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -444290187, 444290201, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
            boolean z = (i3 & 14) == 4;
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!z) {
                int i10 = IAuthTabCallbackStub + 51;
                asBinder = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 8 / 0;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = new Function1() { // from class: im.toss.tds.view.compat.component.TdsComposeView$$ExternalSyntheticLambda1
                            private static int IAuthTabCallback = 0;
                            private static int onExtraCallback = 1;

                            public final Object invoke(Object obj) {
                                int i12 = 2 % 2;
                                int i13 = onExtraCallback + 107;
                                IAuthTabCallback = i13 % 128;
                                int i14 = i13 % 2;
                                TdsComposeView tdsComposeView = this.f$0;
                                initSDK.onNavigationEvent onnavigationevent = (initSDK.onNavigationEvent) obj;
                                if (i14 == 0) {
                                    return TdsComposeView.onWarmupCompleted(tdsComposeView, onnavigationevent);
                                }
                                TdsComposeView.onWarmupCompleted(tdsComposeView, onnavigationevent);
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                    }
                    setPostviewFormatSelector.onExtraCallback(new accessgetCameraFactoryp[]{accessgetcamerafactorypOnExtraCallback, accessgetcamerafactorypOnExtraCallback2, accessismonitoringp.onExtraCallback((Function1) objOnMinimized), ((accessisMonitoringp) setThreadList.onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[0], GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1913699679, -1913699676, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted())).onExtraCallback(new MonitorCrashHeaderParams((Set) this.IAuthTabCallback.onExtraCallbackWithResult(), true))}, ForwardingCameraControl.onExtraCallback(-1790152861, true, new Function2() { // from class: im.toss.tds.view.compat.component.TdsComposeView$$ExternalSyntheticLambda2
                        private static int onExtraCallback = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke(Object obj, Object obj2) {
                            Unit unitOnWarmupCompleted;
                            int i12 = 2 % 2;
                            int i13 = onExtraCallback + 73;
                            onWarmupCompleted = i13 % 128;
                            if (i13 % 2 == 0) {
                                unitOnWarmupCompleted = TdsComposeView.onWarmupCompleted(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                int i14 = 30 / 0;
                            } else {
                                unitOnWarmupCompleted = TdsComposeView.onWarmupCompleted(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            }
                            int i15 = onWarmupCompleted + 81;
                            onExtraCallback = i15 % 128;
                            if (i15 % 2 == 0) {
                                return unitOnWarmupCompleted;
                            }
                            throw null;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, accessgetCameraFactoryp.onNavigationEvent | 48);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    }
                    setPostviewFormatSelector.onExtraCallback(new accessgetCameraFactoryp[]{accessgetcamerafactorypOnExtraCallback, accessgetcamerafactorypOnExtraCallback2, accessismonitoringp.onExtraCallback((Function1) objOnMinimized), ((accessisMonitoringp) setThreadList.onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[0], GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1913699679, -1913699676, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted())).onExtraCallback(new MonitorCrashHeaderParams((Set) this.IAuthTabCallback.onExtraCallbackWithResult(), true))}, ForwardingCameraControl.onExtraCallback(-1790152861, true, new Function2() { // from class: im.toss.tds.view.compat.component.TdsComposeView$$ExternalSyntheticLambda2
                        private static int onExtraCallback = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke(Object obj, Object obj2) {
                            Unit unitOnWarmupCompleted;
                            int i12 = 2 % 2;
                            int i13 = onExtraCallback + 73;
                            onWarmupCompleted = i13 % 128;
                            if (i13 % 2 == 0) {
                                unitOnWarmupCompleted = TdsComposeView.onWarmupCompleted(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                int i14 = 30 / 0;
                            } else {
                                unitOnWarmupCompleted = TdsComposeView.onWarmupCompleted(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            }
                            int i15 = onWarmupCompleted + 81;
                            onExtraCallback = i15 % 128;
                            if (i15 % 2 == 0) {
                                return unitOnWarmupCompleted;
                            }
                            throw null;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, accessgetCameraFactoryp.onNavigationEvent | 48);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.view.compat.component.TdsComposeView$$ExternalSyntheticLambda3
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i12 = 2 % 2;
                    int i13 = onExtraCallback + 19;
                    onExtraCallbackWithResult = i13 % 128;
                    int i14 = i13 % 2;
                    Unit unitOnExtraCallbackWithResult = TdsComposeView.onExtraCallbackWithResult(this.f$0, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i15 = onExtraCallback + 109;
                    onExtraCallbackWithResult = i15 % 128;
                    int i16 = i15 % 2;
                    return unitOnExtraCallbackWithResult;
                }
            });
        }
        int i12 = IAuthTabCallbackStub + 55;
        asBinder = i12 % 128;
        int i13 = i12 % 2;
    }

    public final void onExtraCallback(@NotNull String... strArr) {
        int i = 2 % 2;
        int i2 = asBinder + 67;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(strArr, "");
        onNavigationEvent(ArraysKt.toSet(strArr));
        int i4 = IAuthTabCallbackStub + 63;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void onNavigationEvent(@NotNull Set<String> set) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 97;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(set, "");
            this.IAuthTabCallback.IAuthTabCallback(set);
        } else {
            Intrinsics.checkNotNullParameter(set, "");
            this.IAuthTabCallback.IAuthTabCallback(set);
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        TdsComposeView tdsComposeView = (TdsComposeView) objArr[0];
        Function1 function1 = (Function1) objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 81;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            tdsComposeView.onNavigationEvent.IAuthTabCallback(function1);
            return null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        tdsComposeView.onNavigationEvent.IAuthTabCallback(function1);
        throw null;
    }

    public final void onWarmupCompleted(@NotNull String str, @Nullable Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 115;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        if (obj != null) {
            this.onExtraCallbackWithResult.put(str, obj);
            return;
        }
        this.onExtraCallbackWithResult.remove(str);
        int i3 = IAuthTabCallbackStub + 105;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 0 / 0;
        }
    }

    private static final Unit onExtraCallbackWithResult(TdsComposeView tdsComposeView, initSDK.onNavigationEvent onnavigationevent) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{tdsComposeView, onnavigationevent}, -2030169503, iOnExtraCallbackWithResult3, 2030169503);
    }

    public final void onExtraCallbackWithResult(@NotNull Function1<? super initSDK.onNavigationEvent, Unit> function1) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
        onExtraCallbackWithResult(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{this, function1}, -122849947, iOnExtraCallbackWithResult3, 122849948);
    }
}
