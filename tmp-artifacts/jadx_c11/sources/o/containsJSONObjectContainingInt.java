package o;

import com.facebook.react.uimanager.LayoutShadowNode;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.VirtualCameraControlExternalSyntheticLambda1;
import o.containsJSONObjectContainingInt;
import o.getHumanReadableName;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface containsJSONObjectContainingInt {

    public static abstract class onExtraCallbackWithResult {
        private static int IAuthTabCallbackStub = 0;
        private static int onTransact = 1;
        private final GraphicDeviceInfo IAuthTabCallback;
        private final int onExtraCallback;
        private final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, getHumanReadableName> onExtraCallbackWithResult;
        private final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, setByteOrder> onNavigationEvent;
        private final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, VirtualCameraControlExternalSyntheticLambda1> onWarmupCompleted;

        public /* synthetic */ onExtraCallbackWithResult(Function2 function2, Function2 function22, int i, GraphicDeviceInfo graphicDeviceInfo, Function2 function23, DefaultConstructorMarker defaultConstructorMarker) {
            this(function2, function22, i, graphicDeviceInfo, function23);
        }

        public static /* synthetic */ VirtualCameraControlExternalSyntheticLambda1 onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallbackStub + 123;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1OnExtraCallbackWithResult = onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, i);
            int i5 = IAuthTabCallbackStub + 67;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return virtualCameraControlExternalSyntheticLambda1OnExtraCallbackWithResult;
        }

        private onExtraCallbackWithResult(Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, getHumanReadableName> function2, Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, setByteOrder> function22, int i, GraphicDeviceInfo graphicDeviceInfo, Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, VirtualCameraControlExternalSyntheticLambda1> function23) {
            this.onExtraCallbackWithResult = function2;
            this.onNavigationEvent = function22;
            this.onExtraCallback = i;
            this.IAuthTabCallback = graphicDeviceInfo;
            this.onWarmupCompleted = function23;
        }

        public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, setByteOrder> onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 123;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, setByteOrder> function2 = this.onNavigationEvent;
            int i5 = i2 + 99;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return function2;
        }

        public final int onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onTransact + 35;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            int i4 = i2 % 2;
            int i5 = this.onExtraCallback;
            int i6 = i3 + 1;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        public final GraphicDeviceInfo IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 13;
            int i3 = i2 % 128;
            onTransact = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            GraphicDeviceInfo graphicDeviceInfo = this.IAuthTabCallback;
            int i4 = i3 + 107;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return graphicDeviceInfo;
        }

        public /* synthetic */ onExtraCallbackWithResult(Function2 function2, Function2 function22, int i, GraphicDeviceInfo graphicDeviceInfo, Function2 function23, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i2 & 16) != 0) {
                function23 = new Function2() { // from class: im.toss.tds.compose.component.compound.agreement.v4.model.TdsAgreementV4$Level$$ExternalSyntheticLambda0
                    private static int onExtraCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke(Object obj, Object obj2) {
                        int i3 = 2 % 2;
                        int i4 = onExtraCallbackWithResult + 57;
                        onExtraCallback = i4 % 128;
                        int i5 = i4 % 2;
                        VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1OnWarmupCompleted = containsJSONObjectContainingInt.onExtraCallbackWithResult.onWarmupCompleted((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i6 = onExtraCallback + 77;
                        onExtraCallbackWithResult = i6 % 128;
                        int i7 = i6 % 2;
                        return virtualCameraControlExternalSyntheticLambda1OnWarmupCompleted;
                    }
                };
                int i3 = IAuthTabCallbackStub + 49;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            }
            this(function2, function22, i, graphicDeviceInfo, function23, null);
        }

        private static final VirtualCameraControlExternalSyntheticLambda1 onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2 = 2 % 2;
            int i3 = onTransact + 59;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(925927306);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(925927306, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.model.TdsAgreementV4.Level.<init>.<anonymous> (TdsAgreementV4.kt:25)");
            }
            float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = IAuthTabCallbackStub + 49;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i7 = onTransact + 5;
                IAuthTabCallbackStub = i7 % 128;
                int i8 = i7 % 2;
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            return VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback);
        }

        public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, VirtualCameraControlExternalSyntheticLambda1> onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onTransact + 107;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            int i4 = i2 % 2;
            Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, VirtualCameraControlExternalSyntheticLambda1> function2 = this.onWarmupCompleted;
            int i5 = i3 + 71;
            onTransact = i5 % 128;
            if (i5 % 2 != 0) {
                return function2;
            }
            throw null;
        }

        /* renamed from: o.containsJSONObjectContainingInt$onExtraCallbackWithResult$onExtraCallbackWithResult, reason: collision with other inner class name */
        public static final class C0013onExtraCallbackWithResult extends onExtraCallbackWithResult {
            public static final C0013onExtraCallbackWithResult IAuthTabCallback = new C0013onExtraCallbackWithResult();
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            static {
                int i = onWarmupCompleted + 31;
                onNavigationEvent = i % 128;
                if (i % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static /* synthetic */ VirtualCameraControlExternalSyntheticLambda1 IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 93;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1OnExtraCallbackWithResult = onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, i);
                int i5 = onExtraCallback + 91;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return virtualCameraControlExternalSyntheticLambda1OnExtraCallbackWithResult;
            }

            public static /* synthetic */ getHumanReadableName onNavigationEvent(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 67;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    return onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
                }
                onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
            
                return true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
            
                if ((r6 instanceof o.containsJSONObjectContainingInt.onExtraCallbackWithResult.C0013onExtraCallbackWithResult) != false) goto L16;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
            
                return true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
            
                if (r5 == r6) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
            
                if (r5 == r6) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
            
                r2 = r2 + 13;
                o.containsJSONObjectContainingInt.onExtraCallbackWithResult.C0013onExtraCallbackWithResult.onExtraCallbackWithResult = r2 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
            
                if ((r2 % 2) == 0) goto L11;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 71;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                if (i2 % 2 != 0) {
                    int i4 = 24 / 0;
                }
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 69;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 125;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 12 / 0;
                }
                return -19003792;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 59;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 37;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return "Level0";
                }
                throw null;
            }

            private C0013onExtraCallbackWithResult() {
                super(new Function2() { // from class: im.toss.tds.compose.component.compound.agreement.v4.model.TdsAgreementV4$Level$Level0$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj, Object obj2) {
                        int i = 2 % 2;
                        int i2 = IAuthTabCallback + 45;
                        onWarmupCompleted = i2 % 128;
                        int i3 = i2 % 2;
                        getHumanReadableName gethumanreadablenameOnNavigationEvent = containsJSONObjectContainingInt.onExtraCallbackWithResult.C0013onExtraCallbackWithResult.onNavigationEvent((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i4 = IAuthTabCallback + 35;
                        onWarmupCompleted = i4 % 128;
                        if (i4 % 2 == 0) {
                            return gethumanreadablenameOnNavigationEvent;
                        }
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                }, new Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, setByteOrder>() { // from class: o.containsJSONObjectContainingInt.onExtraCallbackWithResult.onExtraCallbackWithResult.3
                    private static int onExtraCallback = 1;
                    private static int onExtraCallbackWithResult = 0;
                    private static int onNavigationEvent = 0;
                    private static int onWarmupCompleted = 1;

                    static {
                        int i = onNavigationEvent + 39;
                        onWarmupCompleted = i % 128;
                        if (i % 2 == 0) {
                            int i2 = 6 / 0;
                        }
                    }

                    public /* synthetic */ Object invoke(Object obj, Object obj2) {
                        int i = 2 % 2;
                        int i2 = onExtraCallbackWithResult + 55;
                        onExtraCallback = i2 % 128;
                        int i3 = i2 % 2;
                        setByteOrder setbyteorderOnNavigationEvent = setByteOrder.onNavigationEvent(onNavigationEvent((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Number) obj2).intValue()));
                        int i4 = onExtraCallback + 103;
                        onExtraCallbackWithResult = i4 % 128;
                        if (i4 % 2 != 0) {
                            int i5 = 30 / 0;
                        }
                        return setbyteorderOnNavigationEvent;
                    }

                    public final long onNavigationEvent(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                        int i2 = 2 % 2;
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-469108424);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-469108424, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.model.TdsAgreementV4.Level.Level0.<init>.<anonymous> (TdsAgreementV4.kt:28)");
                            int i3 = onExtraCallback + 95;
                            onExtraCallbackWithResult = i3 % 128;
                            int i4 = i3 % 2;
                        }
                        long jICustomTabsService = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService();
                        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                            int i5 = onExtraCallbackWithResult + 125;
                            onExtraCallback = i5 % 128;
                            int i6 = i5 % 2;
                            CameraConfigExternalSyntheticLambda0.onTransact();
                            if (i6 == 0) {
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                        }
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        return jICustomTabsService;
                    }
                }, 17, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), new Function2() { // from class: im.toss.tds.compose.component.compound.agreement.v4.model.TdsAgreementV4$Level$Level0$$ExternalSyntheticLambda1
                    private static int onExtraCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj, Object obj2) {
                        int i = 2 % 2;
                        int i2 = onNavigationEvent + 23;
                        onExtraCallback = i2 % 128;
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
                        Integer num = (Integer) obj2;
                        if (i2 % 2 != 0) {
                            return containsJSONObjectContainingInt.onExtraCallbackWithResult.C0013onExtraCallbackWithResult.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, num.intValue());
                        }
                        VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1IAuthTabCallback = containsJSONObjectContainingInt.onExtraCallbackWithResult.C0013onExtraCallbackWithResult.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, num.intValue());
                        int i3 = 64 / 0;
                        return virtualCameraControlExternalSyntheticLambda1IAuthTabCallback;
                    }
                }, null);
            }

            private static final getHumanReadableName onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 91;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-953555496);
                if (i4 == 0) {
                    CameraConfigExternalSyntheticLambda0.asBinder();
                    throw null;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-953555496, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.model.TdsAgreementV4.Level.Level0.<init>.<anonymous> (TdsAgreementV4.kt:27)");
                }
                getHumanReadableName interfaceDescriptor = AppLovinPostbackService.onExtraCallbackWithResult.getInterfaceDescriptor();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i5 = onExtraCallbackWithResult + 111;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                return interfaceDescriptor;
            }

            private static final VirtualCameraControlExternalSyntheticLambda1 onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                int i2 = 2 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(56422640);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i3 = onExtraCallbackWithResult + 105;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(56422640, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.model.TdsAgreementV4.Level.Level0.<init>.<anonymous> (TdsAgreementV4.kt:31)");
                }
                float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i5 = onExtraCallback + 123;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    if (i6 == 0) {
                        int i7 = 78 / 0;
                    }
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                return VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback);
            }
        }

        public static final class onNavigationEvent extends onExtraCallbackWithResult {
            private static int IAuthTabCallback = 1;
            public static final onNavigationEvent onExtraCallback = new onNavigationEvent();
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            static {
                int i = onExtraCallbackWithResult + 99;
                onNavigationEvent = i % 128;
                int i2 = i % 2;
            }

            public static /* synthetic */ VirtualCameraControlExternalSyntheticLambda1 onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 109;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1OnExtraCallback = onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
                int i5 = IAuthTabCallback + 55;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    return virtualCameraControlExternalSyntheticLambda1OnExtraCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static /* synthetic */ getHumanReadableName onNavigationEvent(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 31;
                onWarmupCompleted = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
                    obj.hashCode();
                    throw null;
                }
                getHumanReadableName gethumanreadablenameIAuthTabCallback = IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
                int i4 = IAuthTabCallback + 77;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return gethumanreadablenameIAuthTabCallback;
                }
                obj.hashCode();
                throw null;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 17;
                int i4 = i3 % 128;
                onWarmupCompleted = i4;
                if (i3 % 2 != 0) {
                    throw null;
                }
                if (this == obj) {
                    int i5 = i2 + 75;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    return true;
                }
                if (obj instanceof onNavigationEvent) {
                    return true;
                }
                int i7 = i4 + 83;
                IAuthTabCallback = i7 % 128;
                return i7 % 2 == 0;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 7;
                int i3 = i2 % 128;
                IAuthTabCallback = i3;
                if (i2 % 2 == 0) {
                    throw null;
                }
                int i4 = i3 + 63;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return -19003791;
                }
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 43;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                if (i2 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i4 = i3 + 113;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return "Level1";
            }

            private onNavigationEvent() {
                super(new Function2() { // from class: im.toss.tds.compose.component.compound.agreement.v4.model.TdsAgreementV4$Level$Level1$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallback = 1;

                    public final Object invoke(Object obj, Object obj2) {
                        int i = 2 % 2;
                        int i2 = onExtraCallback + 45;
                        IAuthTabCallback = i2 % 128;
                        int i3 = i2 % 2;
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (i3 != 0) {
                            containsJSONObjectContainingInt.onExtraCallbackWithResult.onNavigationEvent.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                        getHumanReadableName gethumanreadablenameOnNavigationEvent = containsJSONObjectContainingInt.onExtraCallbackWithResult.onNavigationEvent.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                        int i4 = onExtraCallback + 113;
                        IAuthTabCallback = i4 % 128;
                        int i5 = i4 % 2;
                        return gethumanreadablenameOnNavigationEvent;
                    }
                }, new Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, setByteOrder>() { // from class: o.containsJSONObjectContainingInt.onExtraCallbackWithResult.onNavigationEvent.4
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallbackWithResult = 0;
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;

                    static {
                        int i = onExtraCallbackWithResult + 23;
                        onNavigationEvent = i % 128;
                        if (i % 2 == 0) {
                            int i2 = 77 / 0;
                        }
                    }

                    public /* synthetic */ Object invoke(Object obj, Object obj2) {
                        int i = 2 % 2;
                        int i2 = IAuthTabCallback + 97;
                        onWarmupCompleted = i2 % 128;
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
                        Number number = (Number) obj2;
                        if (i2 % 2 == 0) {
                            return setByteOrder.onNavigationEvent(onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, number.intValue()));
                        }
                        setByteOrder.onNavigationEvent(onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, number.intValue()));
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }

                    public final long onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                        int i2 = 2 % 2;
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1110194567);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            int i3 = IAuthTabCallback + 113;
                            onWarmupCompleted = i3 % 128;
                            int i4 = i3 % 2;
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1110194567, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.model.TdsAgreementV4.Level.Level1.<init>.<anonymous> (TdsAgreementV4.kt:36)");
                        }
                        long jICustomTabsService = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                            int i5 = IAuthTabCallback + 29;
                            onWarmupCompleted = i5 % 128;
                            int i6 = i5 % 2;
                        }
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        return jICustomTabsService;
                    }
                }, 15, isRepeatingEnabled.onExtraCallback.IAuthTabCallbackStub(), new Function2() { // from class: im.toss.tds.compose.component.compound.agreement.v4.model.TdsAgreementV4$Level$Level1$$ExternalSyntheticLambda1
                    private static int onExtraCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj, Object obj2) {
                        int i = 2 % 2;
                        int i2 = onWarmupCompleted + 57;
                        onExtraCallback = i2 % 128;
                        int i3 = i2 % 2;
                        VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1OnExtraCallbackWithResult = containsJSONObjectContainingInt.onExtraCallbackWithResult.onNavigationEvent.onExtraCallbackWithResult((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        if (i3 != 0) {
                            int i4 = 52 / 0;
                        }
                        int i5 = onWarmupCompleted + 25;
                        onExtraCallback = i5 % 128;
                        int i6 = i5 % 2;
                        return virtualCameraControlExternalSyntheticLambda1OnExtraCallbackWithResult;
                    }
                }, null);
            }

            /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static final getHumanReadableName IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 117;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1594641639);
                if (i4 != 0) {
                    int i5 = 58 / 0;
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1594641639, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.model.TdsAgreementV4.Level.Level1.<init>.<anonymous> (TdsAgreementV4.kt:35)");
                    }
                } else if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                Object[] objArr = {AppLovinPostbackService.onExtraCallbackWithResult};
                getHumanReadableName gethumanreadablename = (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), objArr, LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i6 = onWarmupCompleted + 77;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    if (i7 == 0) {
                        int i8 = 18 / 0;
                    }
                    int i9 = IAuthTabCallback + 19;
                    onWarmupCompleted = i9 % 128;
                    int i10 = i9 % 2;
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                int i11 = onWarmupCompleted + 49;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
                return gethumanreadablename;
            }

            private static final VirtualCameraControlExternalSyntheticLambda1 onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                int i2 = 2 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-584663503);
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    int i3 = IAuthTabCallback + 85;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-584663503, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.model.TdsAgreementV4.Level.Level1.<init>.<anonymous> (TdsAgreementV4.kt:39)");
                    if (i4 != 0) {
                        int i5 = 58 / 0;
                    }
                }
                float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i6 = IAuthTabCallback + 99;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                return VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback);
            }
        }

        public static final class onExtraCallback extends onExtraCallbackWithResult {
            public static final onExtraCallback IAuthTabCallback = new onExtraCallback();
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;
            private static int onWarmupCompleted;

            static {
                int i = onExtraCallbackWithResult + 79;
                onNavigationEvent = i % 128;
                int i2 = i % 2;
            }

            public static /* synthetic */ VirtualCameraControlExternalSyntheticLambda1 onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 7;
                onExtraCallback = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
                    throw null;
                }
                VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1IAuthTabCallback = IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
                int i4 = onExtraCallback + 15;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return virtualCameraControlExternalSyntheticLambda1IAuthTabCallback;
                }
                obj.hashCode();
                throw null;
            }

            public static /* synthetic */ getHumanReadableName onNavigationEvent(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 121;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                getHumanReadableName gethumanreadablenameOnExtraCallbackWithResult = onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, i);
                if (i4 == 0) {
                    int i5 = 64 / 0;
                }
                return gethumanreadablenameOnExtraCallbackWithResult;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 109;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                if (i2 % 2 == 0) {
                    throw null;
                }
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof onExtraCallback)) {
                    return false;
                }
                int i4 = i3 + 7;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 89;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                if (i2 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i4 = i3 + 15;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return -19003790;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted;
                int i3 = i2 + 87;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 69;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return "Level2";
                }
                throw null;
            }

            private onExtraCallback() {
                super(new Function2() { // from class: im.toss.tds.compose.component.compound.agreement.v4.model.TdsAgreementV4$Level$Level2$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallback;

                    public final Object invoke(Object obj, Object obj2) {
                        int i = 2 % 2;
                        int i2 = IAuthTabCallback + 57;
                        onExtraCallback = i2 % 128;
                        int i3 = i2 % 2;
                        getHumanReadableName gethumanreadablenameOnNavigationEvent = containsJSONObjectContainingInt.onExtraCallbackWithResult.onExtraCallback.onNavigationEvent((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i4 = IAuthTabCallback + 71;
                        onExtraCallback = i4 % 128;
                        if (i4 % 2 == 0) {
                            return gethumanreadablenameOnNavigationEvent;
                        }
                        throw null;
                    }
                }, new Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, setByteOrder>() { // from class: o.containsJSONObjectContainingInt.onExtraCallbackWithResult.onExtraCallback.1
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallback = 1;
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent;

                    static {
                        int i = onExtraCallbackWithResult + 57;
                        IAuthTabCallback = i % 128;
                        int i2 = i % 2;
                    }

                    public /* synthetic */ Object invoke(Object obj, Object obj2) {
                        int i = 2 % 2;
                        int i2 = onNavigationEvent + 5;
                        onExtraCallback = i2 % 128;
                        int i3 = i2 % 2;
                        setByteOrder setbyteorderOnNavigationEvent = setByteOrder.onNavigationEvent(onNavigationEvent((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Number) obj2).intValue()));
                        int i4 = onExtraCallback + 71;
                        onNavigationEvent = i4 % 128;
                        int i5 = i4 % 2;
                        return setbyteorderOnNavigationEvent;
                    }

                    public final long onNavigationEvent(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                        long jLongValue;
                        int i2 = 2 % 2;
                        int i3 = onExtraCallback + 67;
                        onNavigationEvent = i3 % 128;
                        int i4 = i3 % 2;
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1751280710);
                        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                            int i5 = onNavigationEvent + 49;
                            onExtraCallback = i5 % 128;
                            int i6 = i5 % 2;
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1751280710, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.model.TdsAgreementV4.Level.Level2.<init>.<anonymous> (TdsAgreementV4.kt:44)");
                            if (i6 == 0) {
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            int i7 = onNavigationEvent + 47;
                            onExtraCallback = i7 % 128;
                            int i8 = i7 % 2;
                        }
                        y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                        if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                            int i9 = onNavigationEvent + 51;
                            onExtraCallback = i9 % 128;
                            int i10 = i9 % 2;
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(646419169);
                            jLongValue = (i10 == 0 ? y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 38) : y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)).ICustomTabsService();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(646420129);
                            jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        return jLongValue;
                    }
                }, 13, isRepeatingEnabled.onExtraCallback.IAuthTabCallbackStub(), new Function2() { // from class: im.toss.tds.compose.component.compound.agreement.v4.model.TdsAgreementV4$Level$Level2$$ExternalSyntheticLambda1
                    private static int IAuthTabCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj, Object obj2) {
                        int i = 2 % 2;
                        int i2 = IAuthTabCallback + 33;
                        onNavigationEvent = i2 % 128;
                        int i3 = i2 % 2;
                        VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1OnExtraCallback = containsJSONObjectContainingInt.onExtraCallbackWithResult.onExtraCallback.onExtraCallback((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i4 = IAuthTabCallback + 11;
                        onNavigationEvent = i4 % 128;
                        int i5 = i4 % 2;
                        return virtualCameraControlExternalSyntheticLambda1OnExtraCallback;
                    }
                }, null);
            }

            private static final getHumanReadableName onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                int i2 = 2 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(2059239514);
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2059239514, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.model.TdsAgreementV4.Level.Level2.<init>.<anonymous> (TdsAgreementV4.kt:43)");
                    int i3 = onWarmupCompleted + 69;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                }
                getHumanReadableName gethumanreadablenameIAuthTabCallback_Parcel = AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallback_Parcel();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i5 = onExtraCallback + 103;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                int i7 = onWarmupCompleted + 81;
                onExtraCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    return gethumanreadablenameIAuthTabCallback_Parcel;
                }
                throw null;
            }

            private static final VirtualCameraControlExternalSyntheticLambda1 IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 69;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1225749646);
                if (i4 != 0) {
                    CameraConfigExternalSyntheticLambda0.asBinder();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1225749646, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.model.TdsAgreementV4.Level.Level2.<init>.<anonymous> (TdsAgreementV4.kt:47)");
                }
                float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i5 = onWarmupCompleted + 27;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                return VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback);
            }
        }

        public static final class onWarmupCompleted extends onExtraCallbackWithResult {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent = 1;
            public static final onWarmupCompleted onWarmupCompleted = new onWarmupCompleted();

            static {
                int i = onExtraCallbackWithResult + 55;
                onExtraCallback = i % 128;
                int i2 = i % 2;
            }

            public static /* synthetic */ getHumanReadableName onNavigationEvent(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 1;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    return IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
                }
                IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    int i2 = IAuthTabCallback + 11;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    return true;
                }
                if (obj instanceof onWarmupCompleted) {
                    return true;
                }
                int i4 = onNavigationEvent + 125;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 125;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 81;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return -19003789;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 31;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 83;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return "Level3";
            }

            private onWarmupCompleted() {
                super(new Function2() { // from class: im.toss.tds.compose.component.compound.agreement.v4.model.TdsAgreementV4$Level$Level3$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj, Object obj2) {
                        int i = 2 % 2;
                        int i2 = onNavigationEvent + 13;
                        IAuthTabCallback = i2 % 128;
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
                        Integer num = (Integer) obj2;
                        if (i2 % 2 == 0) {
                            return containsJSONObjectContainingInt.onExtraCallbackWithResult.onWarmupCompleted.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, num.intValue());
                        }
                        getHumanReadableName gethumanreadablenameOnNavigationEvent = containsJSONObjectContainingInt.onExtraCallbackWithResult.onWarmupCompleted.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, num.intValue());
                        int i3 = 23 / 0;
                        return gethumanreadablenameOnNavigationEvent;
                    }
                }, new Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, setByteOrder>() { // from class: o.containsJSONObjectContainingInt.onExtraCallbackWithResult.onWarmupCompleted.1
                    private static int onExtraCallback = 1;
                    private static int onExtraCallbackWithResult = 0;
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;

                    static {
                        int i = onNavigationEvent + 81;
                        onWarmupCompleted = i % 128;
                        if (i % 2 != 0) {
                            int i2 = 57 / 0;
                        }
                    }

                    public /* synthetic */ Object invoke(Object obj, Object obj2) {
                        int i = 2 % 2;
                        int i2 = onExtraCallback + 77;
                        onExtraCallbackWithResult = i2 % 128;
                        int i3 = i2 % 2;
                        setByteOrder setbyteorderOnNavigationEvent = setByteOrder.onNavigationEvent(onWarmupCompleted((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Number) obj2).intValue()));
                        int i4 = onExtraCallbackWithResult + 89;
                        onExtraCallback = i4 % 128;
                        int i5 = i4 % 2;
                        return setbyteorderOnNavigationEvent;
                    }

                    public final long onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                        long jOnUnminimized;
                        Object objOnExtraCallbackWithResult;
                        int i2 = 2 % 2;
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1902600443);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            int i3 = onExtraCallback + 69;
                            onExtraCallbackWithResult = i3 % 128;
                            int i4 = i3 % 2;
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1902600443, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.model.TdsAgreementV4.Level.Level3.<init>.<anonymous> (TdsAgreementV4.kt:52)");
                            if (i4 != 0) {
                                int i5 = 79 / 0;
                            }
                        }
                        y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                        if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                            int i6 = onExtraCallbackWithResult + 75;
                            onExtraCallback = i6 % 128;
                            int i7 = i6 % 2;
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1257040926);
                            if (i7 == 0) {
                                objOnExtraCallbackWithResult = addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 92)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446);
                            } else {
                                objOnExtraCallbackWithResult = addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446);
                            }
                            jOnUnminimized = ((Long) objOnExtraCallbackWithResult).longValue();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1257039966);
                            jOnUnminimized = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).onUnminimized();
                            int i8 = onExtraCallback + 105;
                            onExtraCallbackWithResult = i8 % 128;
                            int i9 = i8 % 2;
                        }
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        int i10 = onExtraCallbackWithResult + 3;
                        onExtraCallback = i10 % 128;
                        if (i10 % 2 == 0) {
                            CameraConfigExternalSyntheticLambda0.asBinder();
                            throw null;
                        }
                        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        int i11 = onExtraCallback + 89;
                        onExtraCallbackWithResult = i11 % 128;
                        if (i11 % 2 != 0) {
                            int i12 = 53 / 0;
                        }
                        return jOnUnminimized;
                    }
                }, 13, isRepeatingEnabled.onExtraCallback.onTransact(), null, 16, null);
            }

            private static final getHumanReadableName IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                int i2 = 2 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1418153371);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i3 = IAuthTabCallback + 17;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1418153371, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.model.TdsAgreementV4.Level.Level3.<init>.<anonymous> (TdsAgreementV4.kt:51)");
                }
                getHumanReadableName gethumanreadablenameIAuthTabCallback_Parcel = AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallback_Parcel();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i5 = IAuthTabCallback + 3;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                return gethumanreadablenameIAuthTabCallback_Parcel;
            }
        }
    }
}
