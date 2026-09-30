package o;

import com.facebook.react.uimanager.LayoutShadowNode;
import com.google.zxing.datamatrix.encoder.C40Encoder;
import kotlin.Deprecated;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC0083handshake;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getDistanceBetweenPoints {
    public static final getDistanceBetweenPoints IAuthTabCallback = new getDistanceBetweenPoints();
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    static {
        int i = onExtraCallback + 43;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private getDistanceBetweenPoints() {
    }

    @JvmInline
    public static final class onNavigationEvent {
        private static int IAuthTabCallback = 1;
        private static int IAuthTabCallbackStub = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;
        private final int onExtraCallback;
        public static final C0015onNavigationEvent Companion = new C0015onNavigationEvent(null);
        private static final int onExtraCallbackWithResult = onWarmupCompleted(-1);

        public static int onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallbackStub + 29;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int iHashCode = Integer.hashCode(i);
            if (i4 != 0) {
                int i5 = 50 / 0;
            }
            return iHashCode;
        }

        public static String onNavigationEvent(int i) {
            int i2 = 2 % 2;
            String str = "IndentLevel(level=" + i + ")";
            int i3 = IAuthTabCallbackStub + 69;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 24 / 0;
            }
            return str;
        }

        public static final boolean onNavigationEvent(int i, int i2) {
            int i3 = 2 % 2;
            if (i != i2) {
                return false;
            }
            int i4 = onWarmupCompleted;
            int i5 = i4 + 53;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 65;
            IAuthTabCallbackStub = i7 % 128;
            if (i7 % 2 != 0) {
                return true;
            }
            throw null;
        }

        public static boolean onNavigationEvent(int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallbackStub + 23;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                boolean z = obj instanceof onNavigationEvent;
                throw null;
            }
            if (!(obj instanceof onNavigationEvent)) {
                return false;
            }
            if (i == ((onNavigationEvent) obj).onWarmupCompleted()) {
                return true;
            }
            int i4 = IAuthTabCallbackStub + 59;
            onWarmupCompleted = i4 % 128;
            return i4 % 2 != 0;
        }

        public static int onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallbackStub;
            int i4 = i3 + 41;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 39;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return i;
        }

        public boolean equals(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 105;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            boolean zOnNavigationEvent = onNavigationEvent(this.onExtraCallback, obj);
            int i4 = IAuthTabCallbackStub + 15;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return zOnNavigationEvent;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 93;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                onExtraCallback(this.onExtraCallback);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iOnExtraCallback = onExtraCallback(this.onExtraCallback);
            int i3 = onWarmupCompleted + 53;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            return iOnExtraCallback;
        }

        public final /* synthetic */ int onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 57;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            int i5 = this.onExtraCallback;
            int i6 = i3 + 125;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 25;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            String strOnNavigationEvent = onNavigationEvent(this.onExtraCallback);
            if (i3 != 0) {
                int i4 = 85 / 0;
            }
            return strOnNavigationEvent;
        }

        public static final /* synthetic */ int onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 77;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            int i5 = onExtraCallbackWithResult;
            int i6 = i2 + 59;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        public static final int onWarmupCompleted(int i, int i2) {
            int i3 = 2 % 2;
            int i4 = onWarmupCompleted + 35;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            int iOnWarmupCompleted = onWarmupCompleted(i + i2);
            int i6 = onWarmupCompleted + 111;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            return iOnWarmupCompleted;
        }

        /* renamed from: o.getDistanceBetweenPoints$onNavigationEvent$onNavigationEvent, reason: collision with other inner class name */
        public static final class C0015onNavigationEvent {
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public /* synthetic */ C0015onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0015onNavigationEvent() {
            }

            public final int IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 123;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                int iOnExtraCallbackWithResult = onNavigationEvent.onExtraCallbackWithResult();
                if (i3 == 0) {
                    int i4 = 98 / 0;
                }
                return iOnExtraCallbackWithResult;
            }
        }

        static {
            int i = onNavigationEvent + 93;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }
    }

    @Deprecated
    public static abstract class onWarmupCompleted {
        public static final C0016onWarmupCompleted Companion = new C0016onWarmupCompleted(null);
        private static final onWarmupCompleted IAuthTabCallback;
        private static final onWarmupCompleted IAuthTabCallbackDefault;
        private static int IAuthTabCallbackStubProxy = 1;
        private static int ICustomTabsCallback = 1;
        private static int access000;
        private static int access100;
        private static final onWarmupCompleted asInterface;
        private static final onWarmupCompleted onExtraCallback;
        private static final onWarmupCompleted onExtraCallbackWithResult;
        private static final onWarmupCompleted onNavigationEvent;
        private static final onWarmupCompleted onWarmupCompleted;
        private final GraphicDeviceInfo IAuthTabCallbackStub;
        private final InterfaceC0083handshake IAuthTabCallback_Parcel;
        private final float asBinder;
        private final float getInterfaceDescriptor;
        private final float onTransact;

        public /* synthetic */ onWarmupCompleted(GraphicDeviceInfo graphicDeviceInfo, float f, float f2, float f3, InterfaceC0083handshake interfaceC0083handshake, DefaultConstructorMarker defaultConstructorMarker) {
            this(graphicDeviceInfo, f, f2, f3, interfaceC0083handshake);
        }

        public abstract getHumanReadableName IAuthTabCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i);

        private onWarmupCompleted(GraphicDeviceInfo graphicDeviceInfo, float f, float f2, float f3, InterfaceC0083handshake interfaceC0083handshake) {
            this.IAuthTabCallbackStub = graphicDeviceInfo;
            this.getInterfaceDescriptor = f;
            this.onTransact = f2;
            this.asBinder = f3;
            this.IAuthTabCallback_Parcel = interfaceC0083handshake;
        }

        public static final /* synthetic */ onWarmupCompleted IAuthTabCallback() {
            onWarmupCompleted onwarmupcompleted;
            int i = 2 % 2;
            int i2 = ICustomTabsCallback;
            int i3 = i2 + 9;
            access100 = i3 % 128;
            if (i3 % 2 != 0) {
                onwarmupcompleted = IAuthTabCallback;
                int i4 = 59 / 0;
            } else {
                onwarmupcompleted = IAuthTabCallback;
            }
            int i5 = i2 + 53;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            return onwarmupcompleted;
        }

        public static final /* synthetic */ onWarmupCompleted IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = ICustomTabsCallback;
            int i3 = i2 + 89;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            onWarmupCompleted onwarmupcompleted = asInterface;
            int i5 = i2 + 101;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            return onwarmupcompleted;
        }

        public static final /* synthetic */ onWarmupCompleted onExtraCallback() {
            int i = 2 % 2;
            int i2 = access100 + 15;
            int i3 = i2 % 128;
            ICustomTabsCallback = i3;
            int i4 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = onWarmupCompleted;
            int i5 = i3 + 125;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            return onwarmupcompleted;
        }

        public static final /* synthetic */ onWarmupCompleted onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = access100 + 61;
            int i3 = i2 % 128;
            ICustomTabsCallback = i3;
            int i4 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = onExtraCallback;
            int i5 = i3 + 7;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            return onwarmupcompleted;
        }

        public static final /* synthetic */ onWarmupCompleted onNavigationEvent() {
            int i = 2 % 2;
            int i2 = ICustomTabsCallback;
            int i3 = i2 + 41;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            onWarmupCompleted onwarmupcompleted = onNavigationEvent;
            int i5 = i2 + 87;
            access100 = i5 % 128;
            if (i5 % 2 == 0) {
                return onwarmupcompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final /* synthetic */ onWarmupCompleted onTransact() {
            int i = 2 % 2;
            int i2 = access100 + 125;
            int i3 = i2 % 128;
            ICustomTabsCallback = i3;
            int i4 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = IAuthTabCallbackDefault;
            int i5 = i3 + 83;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            return onwarmupcompleted;
        }

        public static final /* synthetic */ onWarmupCompleted onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = access100;
            int i3 = i2 + 51;
            ICustomTabsCallback = i3 % 128;
            int i4 = i3 % 2;
            onWarmupCompleted onwarmupcompleted = onExtraCallbackWithResult;
            int i5 = i2 + 31;
            ICustomTabsCallback = i5 % 128;
            int i6 = i5 % 2;
            return onwarmupcompleted;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* synthetic */ onWarmupCompleted(GraphicDeviceInfo graphicDeviceInfo, float f, float f2, float f3, InterfaceC0083handshake interfaceC0083handshake, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 16) != 0) {
                int i2 = access100 + 21;
                ICustomTabsCallback = i2 % 128;
                int i3 = i2 % 2;
                interfaceC0083handshake = getCombinedPathForAllStarsWithSide.onExtraCallbackWithResult.onNavigationEvent();
                int i4 = ICustomTabsCallback + 7;
                access100 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 % 2;
                }
            }
            this(graphicDeviceInfo, f, f2, f3, interfaceC0083handshake);
        }

        public GraphicDeviceInfo asInterface() {
            int i = 2 % 2;
            int i2 = access100 + 63;
            int i3 = i2 % 128;
            ICustomTabsCallback = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            GraphicDeviceInfo graphicDeviceInfo = this.IAuthTabCallbackStub;
            int i4 = i3 + 89;
            access100 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 46 / 0;
            }
            return graphicDeviceInfo;
        }

        public float IAuthTabCallbackStubProxy() {
            int i = 2 % 2;
            int i2 = ICustomTabsCallback + 119;
            int i3 = i2 % 128;
            access100 = i3;
            int i4 = i2 % 2;
            float f = this.getInterfaceDescriptor;
            int i5 = i3 + 125;
            ICustomTabsCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return f;
            }
            throw null;
        }

        public float IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = ICustomTabsCallback;
            int i3 = i2 + 27;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            float f = this.onTransact;
            int i5 = i2 + 89;
            access100 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 12 / 0;
            }
            return f;
        }

        public float asBinder() {
            int i = 2 % 2;
            int i2 = ICustomTabsCallback;
            int i3 = i2 + 49;
            access100 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            float f = this.asBinder;
            int i4 = i2 + 117;
            access100 = i4 % 128;
            if (i4 % 2 == 0) {
                return f;
            }
            throw null;
        }

        public InterfaceC0083handshake getInterfaceDescriptor() {
            int i = 2 % 2;
            int i2 = ICustomTabsCallback;
            int i3 = i2 + 95;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            InterfaceC0083handshake interfaceC0083handshake = this.IAuthTabCallback_Parcel;
            int i5 = i2 + 27;
            access100 = i5 % 128;
            if (i5 % 2 == 0) {
                return interfaceC0083handshake;
            }
            throw null;
        }

        public long onExtraCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
            int i2 = 2 % 2;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(800387483);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(800387483, i, -1, "im.toss.tds.compose.component.atom.post.TdsPostV2.Style.color (TdsPostV2.kt:75)");
                int i3 = ICustomTabsCallback + 35;
                access100 = i3 % 128;
                int i4 = i3 % 2;
            }
            long jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextSecondary, cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = ICustomTabsCallback + 51;
                access100 = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            return jOnExtraCallback;
        }

        public static abstract class IAuthTabCallbackStub extends onWarmupCompleted {
            private static int IAuthTabCallbackStub = 0;
            private static int onTransact = 1;
            private final GraphicDeviceInfo IAuthTabCallback;
            private final int IAuthTabCallbackDefault;
            private final String asBinder;
            private final float asInterface;
            private final float onExtraCallback;
            private final float onExtraCallbackWithResult;
            private final int onNavigationEvent;
            private final float onWarmupCompleted;

            public /* synthetic */ IAuthTabCallbackStub(String str, float f, int i, int i2, GraphicDeviceInfo graphicDeviceInfo, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, f, i, i2, graphicDeviceInfo, f2, f3, f4);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            private IAuthTabCallbackStub(String str, float f, int i, int i2, GraphicDeviceInfo graphicDeviceInfo, float f2, float f3, float f4) {
                super(graphicDeviceInfo, f2, f3, f4, null, 16, null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(graphicDeviceInfo, "");
                this.asBinder = str;
                this.onWarmupCompleted = f;
                this.IAuthTabCallbackDefault = i;
                this.onNavigationEvent = i2;
                this.IAuthTabCallback = graphicDeviceInfo;
                this.asInterface = f2;
                this.onExtraCallbackWithResult = f3;
                this.onExtraCallback = f4;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ IAuthTabCallbackStub(String str, float f, int i, int i2, GraphicDeviceInfo graphicDeviceInfo, float f2, float f3, float f4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                String str2;
                float fIAuthTabCallback;
                int i4;
                if ((i3 & 1) != 0) {
                    int i5 = onTransact + 35;
                    IAuthTabCallbackStub = i5 % 128;
                    int i6 = i5 % 2;
                    str2 = "";
                } else {
                    str2 = str;
                }
                if ((i3 & 2) != 0) {
                    int i7 = IAuthTabCallbackStub + 117;
                    onTransact = i7 % 128;
                    int i8 = i7 % 2;
                    fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f);
                } else {
                    fIAuthTabCallback = f;
                }
                if ((i3 & 4) != 0) {
                    int iIAuthTabCallback = createCameraCaptureCallback.Companion.IAuthTabCallback();
                    int i9 = onTransact + 21;
                    IAuthTabCallbackStub = i9 % 128;
                    if (i9 % 2 != 0) {
                        int i10 = 3 % 5;
                    } else {
                        int i11 = 2 % 2;
                    }
                    i4 = iIAuthTabCallback;
                } else {
                    i4 = i;
                }
                this(str2, fIAuthTabCallback, i4, i2, graphicDeviceInfo, f2, f3, f4, null);
            }

            public final String access100() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub;
                int i3 = i2 + 125;
                onTransact = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                String str = this.asBinder;
                int i4 = i2 + 19;
                onTransact = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 83 / 0;
                }
                return str;
            }

            public final float IAuthTabCallback_Parcel() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub + 11;
                onTransact = i2 % 128;
                if (i2 % 2 != 0) {
                    return this.onWarmupCompleted;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final int readTypedObject() {
                int i = 2 % 2;
                int i2 = onTransact;
                int i3 = i2 + 119;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
                int i5 = this.IAuthTabCallbackDefault;
                int i6 = i2 + 21;
                IAuthTabCallbackStub = i6 % 128;
                int i7 = i6 % 2;
                return i5;
            }

            public int access000() {
                int i = 2 % 2;
                int i2 = onTransact + 119;
                int i3 = i2 % 128;
                IAuthTabCallbackStub = i3;
                int i4 = i2 % 2;
                int i5 = this.onNavigationEvent;
                int i6 = i3 + 15;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
                return i5;
            }

            @Override // o.getDistanceBetweenPoints.onWarmupCompleted
            public GraphicDeviceInfo asInterface() {
                int i = 2 % 2;
                int i2 = onTransact;
                int i3 = i2 + 71;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
                GraphicDeviceInfo graphicDeviceInfo = this.IAuthTabCallback;
                int i5 = i2 + 91;
                IAuthTabCallbackStub = i5 % 128;
                if (i5 % 2 == 0) {
                    return graphicDeviceInfo;
                }
                throw null;
            }

            @Override // o.getDistanceBetweenPoints.onWarmupCompleted
            public float IAuthTabCallbackStubProxy() {
                int i = 2 % 2;
                int i2 = onTransact + 13;
                int i3 = i2 % 128;
                IAuthTabCallbackStub = i3;
                int i4 = i2 % 2;
                float f = this.asInterface;
                int i5 = i3 + 77;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                return f;
            }

            @Override // o.getDistanceBetweenPoints.onWarmupCompleted
            public float IAuthTabCallbackDefault() {
                int i = 2 % 2;
                int i2 = onTransact + 65;
                int i3 = i2 % 128;
                IAuthTabCallbackStub = i3;
                int i4 = i2 % 2;
                float f = this.onExtraCallbackWithResult;
                int i5 = i3 + 93;
                onTransact = i5 % 128;
                if (i5 % 2 != 0) {
                    return f;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // o.getDistanceBetweenPoints.onWarmupCompleted
            public float asBinder() {
                int i = 2 % 2;
                int i2 = onTransact + 105;
                IAuthTabCallbackStub = i2 % 128;
                if (i2 % 2 == 0) {
                    return this.onExtraCallback;
                }
                throw null;
            }
        }

        public static final class asBinder extends IAuthTabCallbackStub {
            private static int IAuthTabCallback = 0;
            private static int asInterface = 1;
            private final setByteOrder onExtraCallback;
            private final int onExtraCallbackWithResult;
            private final GraphicDeviceInfo onNavigationEvent;
            private final int onWarmupCompleted;

            public /* synthetic */ asBinder(int i, int i2, GraphicDeviceInfo graphicDeviceInfo, setByteOrder setbyteorder, DefaultConstructorMarker defaultConstructorMarker) {
                this(i, i2, graphicDeviceInfo, setbyteorder);
            }

            public static /* synthetic */ asBinder onExtraCallback(asBinder asbinder, int i, int i2, GraphicDeviceInfo graphicDeviceInfo, setByteOrder setbyteorder, int i3, Object obj) {
                int i4 = 2 % 2;
                int i5 = IAuthTabCallback;
                int i6 = i5 + 73;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
                if ((i3 & 1) != 0) {
                    int i8 = i5 + 13;
                    asInterface = i8 % 128;
                    int i9 = i8 % 2;
                    i = asbinder.onExtraCallbackWithResult;
                }
                if ((i3 & 2) != 0) {
                    i2 = asbinder.onWarmupCompleted;
                }
                if ((i3 & 4) != 0) {
                    int i10 = asInterface + 111;
                    IAuthTabCallback = i10 % 128;
                    if (i10 % 2 != 0) {
                        GraphicDeviceInfo graphicDeviceInfo2 = asbinder.onNavigationEvent;
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    graphicDeviceInfo = asbinder.onNavigationEvent;
                }
                if ((i3 & 8) != 0) {
                    setbyteorder = asbinder.onExtraCallback;
                }
                asBinder asbinderOnExtraCallbackWithResult = asbinder.onExtraCallbackWithResult(i, i2, graphicDeviceInfo, setbyteorder);
                int i11 = asInterface + 11;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
                return asbinderOnExtraCallbackWithResult;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = asInterface;
                int i3 = i2 + 103;
                int i4 = i3 % 128;
                IAuthTabCallback = i4;
                int i5 = i3 % 2;
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof asBinder)) {
                    int i6 = i4 + 95;
                    asInterface = i6 % 128;
                    int i7 = i6 % 2;
                    return false;
                }
                asBinder asbinder = (asBinder) obj;
                if (this.onExtraCallbackWithResult != asbinder.onExtraCallbackWithResult) {
                    int i8 = i2 + 105;
                    IAuthTabCallback = i8 % 128;
                    int i9 = i8 % 2;
                    return false;
                }
                if (this.onWarmupCompleted != asbinder.onWarmupCompleted || (!Intrinsics.areEqual(this.onNavigationEvent, asbinder.onNavigationEvent))) {
                    return false;
                }
                if (Intrinsics.areEqual(this.onExtraCallback, asbinder.onExtraCallback)) {
                    return true;
                }
                int i10 = IAuthTabCallback + 117;
                asInterface = i10 % 128;
                int i11 = i10 % 2;
                return false;
            }

            public int hashCode() {
                int i;
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 125;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
                int iHashCode = Integer.hashCode(this.onExtraCallbackWithResult);
                int iHashCode2 = Integer.hashCode(this.onWarmupCompleted);
                int iHashCode3 = this.onNavigationEvent.hashCode();
                setByteOrder setbyteorder = this.onExtraCallback;
                if (setbyteorder == null) {
                    i = 0;
                } else {
                    int iOnTransact = setByteOrder.onTransact(setbyteorder.access100());
                    int i5 = asInterface + 29;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    i = iOnTransact;
                }
                return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + i;
            }

            public final asBinder onExtraCallbackWithResult(int i, int i2, @NotNull GraphicDeviceInfo graphicDeviceInfo, @Nullable setByteOrder setbyteorder) {
                int i3 = 2 % 2;
                Intrinsics.checkNotNullParameter(graphicDeviceInfo, "");
                asBinder asbinder = new asBinder(i, i2, graphicDeviceInfo, setbyteorder, null);
                int i4 = asInterface + 113;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 98 / 0;
                }
                return asbinder;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "OrderedList(number=" + this.onExtraCallbackWithResult + ", indentLevel=" + this.onWarmupCompleted + ", numberFontWeight=" + this.onNavigationEvent + ", numberFontColor=" + this.onExtraCallback + ")";
                int i2 = asInterface + 21;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            @Override // o.getDistanceBetweenPoints.onWarmupCompleted.IAuthTabCallbackStub
            public int access000() {
                int i = 2 % 2;
                int i2 = asInterface + 115;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return this.onWarmupCompleted;
                }
                throw null;
            }

            public final GraphicDeviceInfo extraCallback() {
                int i = 2 % 2;
                int i2 = asInterface + 13;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                GraphicDeviceInfo graphicDeviceInfo = this.onNavigationEvent;
                if (i3 != 0) {
                    int i4 = 14 / 0;
                }
                return graphicDeviceInfo;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            private asBinder(int i, int i2, GraphicDeviceInfo graphicDeviceInfo, setByteOrder setbyteorder) {
                Intrinsics.checkNotNullParameter(graphicDeviceInfo, "");
                GraphicDeviceInfo graphicDeviceInfoAsBinder = isRepeatingEnabled.onExtraCallback.asBinder();
                super(i + ".", VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), createCameraCaptureCallback.Companion.onNavigationEvent(), i2, graphicDeviceInfoAsBinder, 0.0f, 16.0f, 24.0f, null);
                this.onExtraCallbackWithResult = i;
                this.onWarmupCompleted = i2;
                this.onNavigationEvent = graphicDeviceInfo;
                this.onExtraCallback = setbyteorder;
            }

            @Override // o.getDistanceBetweenPoints.onWarmupCompleted
            public getHumanReadableName IAuthTabCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                int i2 = 2 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1121991685);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i3 = IAuthTabCallback + 95;
                    asInterface = i3 % 128;
                    int i4 = i3 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1121991685, i, -1, "im.toss.tds.compose.component.atom.post.TdsPostV2.Style.OrderedList.typography (TdsPostV2.kt:111)");
                }
                getHumanReadableName interfaceDescriptor = AppLovinPostbackService.onExtraCallbackWithResult.getInterfaceDescriptor();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i5 = asInterface + 79;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    if (i6 != 0) {
                        throw null;
                    }
                    int i7 = IAuthTabCallback + 125;
                    asInterface = i7 % 128;
                    int i8 = i7 % 2;
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                return interfaceDescriptor;
            }
        }

        public static final class access100 extends IAuthTabCallbackStub {
            private static int asInterface = 1;
            private static int onExtraCallbackWithResult;
            private final int IAuthTabCallback;
            private final GraphicDeviceInfo onExtraCallback;
            private final setByteOrder onNavigationEvent;
            private final int onWarmupCompleted;

            public /* synthetic */ access100(int i, int i2, GraphicDeviceInfo graphicDeviceInfo, setByteOrder setbyteorder, DefaultConstructorMarker defaultConstructorMarker) {
                this(i, i2, graphicDeviceInfo, setbyteorder);
            }

            public static /* synthetic */ access100 onWarmupCompleted(access100 access100Var, int i, int i2, GraphicDeviceInfo graphicDeviceInfo, setByteOrder setbyteorder, int i3, Object obj) {
                int i4 = 2 % 2;
                if ((i3 & 1) != 0) {
                    int i5 = asInterface + 115;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    i = access100Var.onWarmupCompleted;
                }
                if ((i3 & 2) != 0) {
                    int i7 = asInterface + 35;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    i2 = access100Var.IAuthTabCallback;
                }
                if ((i3 & 4) != 0) {
                    graphicDeviceInfo = access100Var.onExtraCallback;
                }
                if ((i3 & 8) != 0) {
                    int i9 = onExtraCallbackWithResult + 9;
                    asInterface = i9 % 128;
                    if (i9 % 2 == 0) {
                        setByteOrder setbyteorder2 = access100Var.onNavigationEvent;
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    setbyteorder = access100Var.onNavigationEvent;
                }
                return access100Var.onExtraCallbackWithResult(i, i2, graphicDeviceInfo, setbyteorder);
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = asInterface;
                int i3 = i2 + 71;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof access100)) {
                    int i4 = i2 + 41;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }
                access100 access100Var = (access100) obj;
                if (this.onWarmupCompleted != access100Var.onWarmupCompleted || this.IAuthTabCallback != access100Var.IAuthTabCallback) {
                    return false;
                }
                if (!Intrinsics.areEqual(this.onExtraCallback, access100Var.onExtraCallback)) {
                    int i6 = onExtraCallbackWithResult + 15;
                    asInterface = i6 % 128;
                    int i7 = i6 % 2;
                    return false;
                }
                if (Intrinsics.areEqual(this.onNavigationEvent, access100Var.onNavigationEvent)) {
                    return true;
                }
                int i8 = asInterface + 17;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }

            public int hashCode() {
                int i;
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 17;
                asInterface = i3 % 128;
                if (i3 % 2 == 0) {
                    Integer.hashCode(this.onWarmupCompleted);
                    Integer.hashCode(this.IAuthTabCallback);
                    this.onExtraCallback.hashCode();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int iHashCode = Integer.hashCode(this.onWarmupCompleted);
                int iHashCode2 = Integer.hashCode(this.IAuthTabCallback);
                int iHashCode3 = this.onExtraCallback.hashCode();
                setByteOrder setbyteorder = this.onNavigationEvent;
                if (setbyteorder == null) {
                    i = 0;
                } else {
                    int iOnTransact = setByteOrder.onTransact(setbyteorder.access100());
                    int i4 = onExtraCallbackWithResult + 95;
                    asInterface = i4 % 128;
                    int i5 = i4 % 2;
                    i = iOnTransact;
                }
                return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + i;
            }

            public final access100 onExtraCallbackWithResult(int i, int i2, @NotNull GraphicDeviceInfo graphicDeviceInfo, @Nullable setByteOrder setbyteorder) {
                int i3 = 2 % 2;
                Intrinsics.checkNotNullParameter(graphicDeviceInfo, "");
                access100 access100Var = new access100(i, i2, graphicDeviceInfo, setbyteorder, null);
                int i4 = asInterface + 19;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 55 / 0;
                }
                return access100Var;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "OrderedListSmall(number=" + this.onWarmupCompleted + ", indentLevel=" + this.IAuthTabCallback + ", numberFontWeight=" + this.onExtraCallback + ", numberFontColor=" + this.onNavigationEvent + ")";
                int i2 = onExtraCallbackWithResult + 69;
                asInterface = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 66 / 0;
                }
                return str;
            }

            @Override // o.getDistanceBetweenPoints.onWarmupCompleted.IAuthTabCallbackStub
            public int access000() {
                int i;
                int i2 = 2 % 2;
                int i3 = asInterface + 91;
                int i4 = i3 % 128;
                onExtraCallbackWithResult = i4;
                if (i3 % 2 != 0) {
                    i = this.IAuthTabCallback;
                    int i5 = 59 / 0;
                } else {
                    i = this.IAuthTabCallback;
                }
                int i6 = i4 + 37;
                asInterface = i6 % 128;
                if (i6 % 2 != 0) {
                    return i;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final GraphicDeviceInfo extraCallback() {
                int i = 2 % 2;
                int i2 = asInterface;
                int i3 = i2 + 119;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                GraphicDeviceInfo graphicDeviceInfo = this.onExtraCallback;
                int i5 = i2 + 11;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    return graphicDeviceInfo;
                }
                throw null;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            private access100(int i, int i2, GraphicDeviceInfo graphicDeviceInfo, setByteOrder setbyteorder) {
                Intrinsics.checkNotNullParameter(graphicDeviceInfo, "");
                GraphicDeviceInfo graphicDeviceInfoAsBinder = isRepeatingEnabled.onExtraCallback.asBinder();
                super(i + ".", VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), createCameraCaptureCallback.Companion.onNavigationEvent(), i2, graphicDeviceInfoAsBinder, 0.0f, 16.0f, 24.0f, null);
                this.onWarmupCompleted = i;
                this.IAuthTabCallback = i2;
                this.onExtraCallback = graphicDeviceInfo;
                this.onNavigationEvent = setbyteorder;
            }

            @Override // o.getDistanceBetweenPoints.onWarmupCompleted
            public getHumanReadableName IAuthTabCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 69;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(2042574504);
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2042574504, i, -1, "im.toss.tds.compose.component.atom.post.TdsPostV2.Style.OrderedListSmall.typography (TdsPostV2.kt:131)");
                    int i5 = onExtraCallbackWithResult + 21;
                    asInterface = i5 % 128;
                    int i6 = i5 % 2;
                }
                getHumanReadableName gethumanreadablename = (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{AppLovinPostbackService.onExtraCallbackWithResult}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                int i7 = onExtraCallbackWithResult + 109;
                asInterface = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 94 / 0;
                }
                return gethumanreadablename;
            }
        }

        public static final class IAuthTabCallbackStubProxy extends IAuthTabCallbackStub {
            private static int IAuthTabCallbackDefault = 1;
            private static int onNavigationEvent;
            private final GraphicDeviceInfo IAuthTabCallback;
            private final int onExtraCallback;
            private final setByteOrder onExtraCallbackWithResult;
            private final int onWarmupCompleted;

            public /* synthetic */ IAuthTabCallbackStubProxy(int i, int i2, GraphicDeviceInfo graphicDeviceInfo, setByteOrder setbyteorder, DefaultConstructorMarker defaultConstructorMarker) {
                this(i, i2, graphicDeviceInfo, setbyteorder);
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof IAuthTabCallbackStubProxy)) {
                    int i2 = IAuthTabCallbackDefault + 115;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    return false;
                }
                IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy = (IAuthTabCallbackStubProxy) obj;
                if (this.onWarmupCompleted != iAuthTabCallbackStubProxy.onWarmupCompleted) {
                    int i4 = IAuthTabCallbackDefault + 61;
                    onNavigationEvent = i4 % 128;
                    return i4 % 2 != 0;
                }
                if (this.onExtraCallback != iAuthTabCallbackStubProxy.onExtraCallback) {
                    int i5 = onNavigationEvent + 35;
                    IAuthTabCallbackDefault = i5 % 128;
                    int i6 = i5 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.IAuthTabCallback, iAuthTabCallbackStubProxy.IAuthTabCallback) || !Intrinsics.areEqual(this.onExtraCallbackWithResult, iAuthTabCallbackStubProxy.onExtraCallbackWithResult)) {
                    return false;
                }
                int i7 = onNavigationEvent + 115;
                IAuthTabCallbackDefault = i7 % 128;
                if (i7 % 2 != 0) {
                    return true;
                }
                throw null;
            }

            public int hashCode() {
                int iOnTransact;
                int i = 2 % 2;
                int i2 = IAuthTabCallbackDefault + 103;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    Integer.hashCode(this.onWarmupCompleted);
                    Integer.hashCode(this.onExtraCallback);
                    this.IAuthTabCallback.hashCode();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int iHashCode = Integer.hashCode(this.onWarmupCompleted);
                int iHashCode2 = Integer.hashCode(this.onExtraCallback);
                int iHashCode3 = this.IAuthTabCallback.hashCode();
                setByteOrder setbyteorder = this.onExtraCallbackWithResult;
                if (setbyteorder == null) {
                    int i3 = onNavigationEvent + 93;
                    IAuthTabCallbackDefault = i3 % 128;
                    int i4 = i3 % 2;
                    iOnTransact = 0;
                } else {
                    iOnTransact = setByteOrder.onTransact(setbyteorder.access100());
                }
                return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iOnTransact;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "OrderedListXSmall(number=" + this.onWarmupCompleted + ", indentLevel=" + this.onExtraCallback + ", numberFontWeight=" + this.IAuthTabCallback + ", numberFontColor=" + this.onExtraCallbackWithResult + ")";
                int i2 = onNavigationEvent + 33;
                IAuthTabCallbackDefault = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 73 / 0;
                }
                return str;
            }

            @Override // o.getDistanceBetweenPoints.onWarmupCompleted.IAuthTabCallbackStub
            public int access000() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackDefault;
                int i3 = i2 + 35;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                int i5 = this.onExtraCallback;
                int i6 = i2 + 115;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 4 / 0;
                }
                return i5;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            private IAuthTabCallbackStubProxy(int i, int i2, GraphicDeviceInfo graphicDeviceInfo, setByteOrder setbyteorder) {
                Intrinsics.checkNotNullParameter(graphicDeviceInfo, "");
                GraphicDeviceInfo graphicDeviceInfoAsBinder = isRepeatingEnabled.onExtraCallback.asBinder();
                super(i + ".", VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), createCameraCaptureCallback.Companion.onNavigationEvent(), i2, graphicDeviceInfoAsBinder, 0.0f, 16.0f, 24.0f, null);
                this.onWarmupCompleted = i;
                this.onExtraCallback = i2;
                this.IAuthTabCallback = graphicDeviceInfo;
                this.onExtraCallbackWithResult = setbyteorder;
            }

            @Override // o.getDistanceBetweenPoints.onWarmupCompleted
            public getHumanReadableName IAuthTabCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallbackDefault + 9;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1246382838);
                if (i4 != 0) {
                    CameraConfigExternalSyntheticLambda0.asBinder();
                    throw null;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1246382838, i, -1, "im.toss.tds.compose.component.atom.post.TdsPostV2.Style.OrderedListXSmall.typography (TdsPostV2.kt:151)");
                }
                getHumanReadableName gethumanreadablenameIAuthTabCallback_Parcel = AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallback_Parcel();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i5 = onNavigationEvent + 15;
                    IAuthTabCallbackDefault = i5 % 128;
                    int i6 = i5 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    if (i6 == 0) {
                        int i7 = 30 / 0;
                    }
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                return gethumanreadablenameIAuthTabCallback_Parcel;
            }
        }

        public static final class access000 extends IAuthTabCallbackStub {
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;
            private final int onExtraCallbackWithResult;

            public final access000 IAuthTabCallback(int i) {
                int i2 = 2 % 2;
                access000 access000Var = new access000(i);
                int i3 = onExtraCallback + 55;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return access000Var;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallback;
                int i3 = i2 + 47;
                int i4 = i3 % 128;
                onNavigationEvent = i4;
                int i5 = i3 % 2;
                if (this == obj) {
                    int i6 = i2 + 41;
                    onNavigationEvent = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 11 / 0;
                    }
                    return true;
                }
                if (obj instanceof access000) {
                    return this.onExtraCallbackWithResult == ((access000) obj).onExtraCallbackWithResult;
                }
                int i8 = i4 + 59;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 83;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = Integer.hashCode(this.onExtraCallbackWithResult);
                int i4 = onExtraCallback + 13;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return iHashCode;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "UnorderedList(indentLevel=" + this.onExtraCallbackWithResult + ")";
                int i2 = onExtraCallback + 59;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    return str;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // o.getDistanceBetweenPoints.onWarmupCompleted.IAuthTabCallbackStub
            public int access000() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 103;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    return this.onExtraCallbackWithResult;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public access000(int i) {
                String str = "∙";
                super(str, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), 0, i, isRepeatingEnabled.onExtraCallback.asBinder(), 0.0f, 24.0f, 24.0f, 4, null);
                this.onExtraCallbackWithResult = i;
            }

            /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
            @Override // o.getDistanceBetweenPoints.onWarmupCompleted
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public getHumanReadableName IAuthTabCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 39;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(33007746);
                if (i4 == 0) {
                    int i5 = 63 / 0;
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(33007746, i, -1, "im.toss.tds.compose.component.atom.post.TdsPostV2.Style.UnorderedList.typography (TdsPostV2.kt:167)");
                    }
                } else if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                getHumanReadableName interfaceDescriptor = AppLovinPostbackService.onExtraCallbackWithResult.getInterfaceDescriptor();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i6 = onNavigationEvent + 31;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                return interfaceDescriptor;
            }
        }

        public static final class IAuthTabCallback_Parcel extends IAuthTabCallbackStub {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            private final int onWarmupCompleted;

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 21;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                if (this != obj) {
                    if (obj instanceof IAuthTabCallback_Parcel) {
                        return this.onWarmupCompleted == ((IAuthTabCallback_Parcel) obj).onWarmupCompleted;
                    }
                    int i5 = i2 + 93;
                    onExtraCallbackWithResult = i5 % 128;
                    return i5 % 2 == 0;
                }
                int i6 = i2 + 35;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 != 0) {
                    return true;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 101;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = Integer.hashCode(this.onWarmupCompleted);
                int i4 = IAuthTabCallback + 77;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return iHashCode;
            }

            public final IAuthTabCallback_Parcel onExtraCallback(int i) {
                int i2 = 2 % 2;
                IAuthTabCallback_Parcel iAuthTabCallback_Parcel = new IAuthTabCallback_Parcel(i);
                int i3 = IAuthTabCallback + 29;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    return iAuthTabCallback_Parcel;
                }
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "UnorderedListSmall(indentLevel=" + this.onWarmupCompleted + ")";
                int i2 = IAuthTabCallback + 59;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    return str;
                }
                throw null;
            }

            @Override // o.getDistanceBetweenPoints.onWarmupCompleted.IAuthTabCallbackStub
            public int access000() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 83;
                int i3 = i2 % 128;
                IAuthTabCallback = i3;
                if (i2 % 2 != 0) {
                    throw null;
                }
                int i4 = this.onWarmupCompleted;
                int i5 = i3 + 95;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return i4;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public IAuthTabCallback_Parcel(int i) {
                String str = "∙";
                super(str, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), 0, i, isRepeatingEnabled.onExtraCallback.asBinder(), 0.0f, 24.0f, 24.0f, 4, null);
                this.onWarmupCompleted = i;
            }

            @Override // o.getDistanceBetweenPoints.onWarmupCompleted
            public getHumanReadableName IAuthTabCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                int i2 = 2 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1701572991);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i3 = onExtraCallbackWithResult + 105;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1701572991, i, -1, "im.toss.tds.compose.component.atom.post.TdsPostV2.Style.UnorderedListSmall.typography (TdsPostV2.kt:183)");
                    if (i4 != 0) {
                        throw null;
                    }
                }
                Object[] objArr = {AppLovinPostbackService.onExtraCallbackWithResult};
                getHumanReadableName gethumanreadablename = (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), objArr, LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i5 = IAuthTabCallback + 79;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                int i7 = IAuthTabCallback + 49;
                onExtraCallbackWithResult = i7 % 128;
                if (i7 % 2 != 0) {
                    return gethumanreadablename;
                }
                throw null;
            }
        }

        public static final class getInterfaceDescriptor extends IAuthTabCallbackStub {
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;
            private final int onExtraCallbackWithResult;

            /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
            
                if ((r6 instanceof o.getDistanceBetweenPoints.onWarmupCompleted.getInterfaceDescriptor) != false) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
            
                r1 = r1 + 69;
                o.getDistanceBetweenPoints.onWarmupCompleted.getInterfaceDescriptor.onExtraCallback = r1 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
            
                if ((r1 % 2) != 0) goto L14;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
            
                r3 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
            
                return !r3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
            
                if (r5.onExtraCallbackWithResult == ((o.getDistanceBetweenPoints.onWarmupCompleted.getInterfaceDescriptor) r6).onExtraCallbackWithResult) goto L20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0034, code lost:
            
                return true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
            
                if (r5 == r6) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
            
                if (r5 == r6) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
            
                return true;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 55;
                onExtraCallback = i3 % 128;
                boolean z = false;
                if (i3 % 2 == 0) {
                    int i4 = 44 / 0;
                }
            }

            public int hashCode() {
                int iHashCode;
                int i = 2 % 2;
                int i2 = onNavigationEvent + 7;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    iHashCode = Integer.hashCode(this.onExtraCallbackWithResult);
                    int i3 = 17 / 0;
                } else {
                    iHashCode = Integer.hashCode(this.onExtraCallbackWithResult);
                }
                int i4 = onNavigationEvent + 75;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return iHashCode;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "UnorderedListXSmall(indentLevel=" + this.onExtraCallbackWithResult + ")";
                int i2 = onNavigationEvent + 73;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            @Override // o.getDistanceBetweenPoints.onWarmupCompleted.IAuthTabCallbackStub
            public int access000() {
                int i = 2 % 2;
                int i2 = onExtraCallback;
                int i3 = i2 + 85;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                int i5 = this.onExtraCallbackWithResult;
                int i6 = i2 + 73;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0) {
                    return i5;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public getInterfaceDescriptor(int i) {
                String str = "∙";
                super(str, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), 0, i, isRepeatingEnabled.onExtraCallback.asBinder(), 0.0f, 24.0f, 24.0f, 4, null);
                this.onExtraCallbackWithResult = i;
            }

            @Override // o.getDistanceBetweenPoints.onWarmupCompleted
            public getHumanReadableName IAuthTabCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                int i2 = 2 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1350838191);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i3 = onNavigationEvent + 89;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1350838191, i, -1, "im.toss.tds.compose.component.atom.post.TdsPostV2.Style.UnorderedListXSmall.typography (TdsPostV2.kt:199)");
                    if (i4 == 0) {
                        int i5 = 49 / 0;
                    }
                }
                getHumanReadableName gethumanreadablenameIAuthTabCallback_Parcel = AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallback_Parcel();
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    int i6 = onExtraCallback + 33;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    if (i7 != 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                return gethumanreadablenameIAuthTabCallback_Parcel;
            }
        }

        /* renamed from: o.getDistanceBetweenPoints$onWarmupCompleted$onWarmupCompleted, reason: collision with other inner class name */
        public static final class C0016onWarmupCompleted {
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public /* synthetic */ C0016onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0016onWarmupCompleted() {
            }

            public final onWarmupCompleted onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 105;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                onWarmupCompleted onwarmupcompletedOnExtraCallback = onWarmupCompleted.onExtraCallback();
                int i4 = IAuthTabCallback + 9;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return onwarmupcompletedOnExtraCallback;
            }

            public final onWarmupCompleted IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 73;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                onWarmupCompleted onwarmupcompletedOnNavigationEvent = onWarmupCompleted.onNavigationEvent();
                int i4 = onNavigationEvent + 91;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return onwarmupcompletedOnNavigationEvent;
                }
                throw null;
            }

            public final onWarmupCompleted onExtraCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 81;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                onWarmupCompleted onwarmupcompletedIAuthTabCallback = onWarmupCompleted.IAuthTabCallback();
                int i4 = onNavigationEvent + 105;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return onwarmupcompletedIAuthTabCallback;
                }
                throw null;
            }

            public final onWarmupCompleted onNavigationEvent() {
                onWarmupCompleted onWarmupCompleted;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 111;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    onWarmupCompleted = onWarmupCompleted.onWarmupCompleted();
                    int i3 = 9 / 0;
                } else {
                    onWarmupCompleted = onWarmupCompleted.onWarmupCompleted();
                }
                int i4 = onNavigationEvent + 41;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return onWarmupCompleted;
            }

            public final onWarmupCompleted onWarmupCompleted() {
                onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 71;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    onwarmupcompletedOnExtraCallbackWithResult = onWarmupCompleted.onExtraCallbackWithResult();
                    int i3 = 52 / 0;
                } else {
                    onwarmupcompletedOnExtraCallbackWithResult = onWarmupCompleted.onExtraCallbackWithResult();
                }
                int i4 = IAuthTabCallback + 15;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return onwarmupcompletedOnExtraCallbackWithResult;
                }
                throw null;
            }

            public final onWarmupCompleted IAuthTabCallbackDefault() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 29;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    return onWarmupCompleted.onTransact();
                }
                onWarmupCompleted.onTransact();
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final onWarmupCompleted asBinder() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 27;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                onWarmupCompleted onwarmupcompletedIAuthTabCallbackStub = onWarmupCompleted.IAuthTabCallbackStub();
                int i4 = onNavigationEvent + 79;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return onwarmupcompletedIAuthTabCallbackStub;
            }
        }

        public static final class IAuthTabCallback extends onWarmupCompleted {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            IAuthTabCallback(GraphicDeviceInfo graphicDeviceInfo, InterfaceC0083handshake.onNavigationEvent onnavigationevent) {
                super(graphicDeviceInfo, 16.0f, 24.0f, 24.0f, onnavigationevent, null);
            }

            @Override // o.getDistanceBetweenPoints.onWarmupCompleted
            public getHumanReadableName IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 23;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Object obj = null;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(876901435);
                if (i4 == 0) {
                    CameraConfigExternalSyntheticLambda0.asBinder();
                    obj.hashCode();
                    throw null;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(876901435, i, -1, "im.toss.tds.compose.component.atom.post.TdsPostV2.Style.Companion.Heading1.<no name provided>.typography (TdsPostV2.kt:212)");
                }
                getHumanReadableName gethumanreadablenameOnTransact = AppLovinPostbackService.onExtraCallbackWithResult.onTransact();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i5 = IAuthTabCallback + 61;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    if (i6 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                return gethumanreadablenameOnTransact;
            }
        }

        static {
            isRepeatingEnabled isrepeatingenabled = isRepeatingEnabled.onExtraCallback;
            GraphicDeviceInfo graphicDeviceInfoOnExtraCallbackWithResult = isrepeatingenabled.onExtraCallbackWithResult();
            getCombinedPathForAllStarsWithSide getcombinedpathforallstarswithside = getCombinedPathForAllStarsWithSide.onExtraCallbackWithResult;
            int iOnExtraCallback = C40Encoder.onExtraCallback();
            int iOnExtraCallback2 = C40Encoder.onExtraCallback();
            onWarmupCompleted = new IAuthTabCallback(graphicDeviceInfoOnExtraCallbackWithResult, (InterfaceC0083handshake.onNavigationEvent) getCombinedPathForAllStarsWithSide.onExtraCallback(iOnExtraCallback, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -268374465, iOnExtraCallback2, 268374468, new Object[]{getcombinedpathforallstarswithside}));
            GraphicDeviceInfo graphicDeviceInfoOnExtraCallbackWithResult2 = isrepeatingenabled.onExtraCallbackWithResult();
            int iOnExtraCallback3 = C40Encoder.onExtraCallback();
            int iOnExtraCallback4 = C40Encoder.onExtraCallback();
            onNavigationEvent = new onNavigationEvent(graphicDeviceInfoOnExtraCallbackWithResult2, (InterfaceC0083handshake.onNavigationEvent) getCombinedPathForAllStarsWithSide.onExtraCallback(iOnExtraCallback3, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -268374465, iOnExtraCallback4, 268374468, new Object[]{getcombinedpathforallstarswithside}));
            GraphicDeviceInfo graphicDeviceInfoOnExtraCallbackWithResult3 = isrepeatingenabled.onExtraCallbackWithResult();
            int iOnExtraCallback5 = C40Encoder.onExtraCallback();
            int iOnExtraCallback6 = C40Encoder.onExtraCallback();
            IAuthTabCallback = new onExtraCallbackWithResult(graphicDeviceInfoOnExtraCallbackWithResult3, (InterfaceC0083handshake.onNavigationEvent) getCombinedPathForAllStarsWithSide.onExtraCallback(iOnExtraCallback5, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -268374465, iOnExtraCallback6, 268374468, new Object[]{getcombinedpathforallstarswithside}));
            GraphicDeviceInfo graphicDeviceInfoOnExtraCallbackWithResult4 = isrepeatingenabled.onExtraCallbackWithResult();
            int iOnExtraCallback7 = C40Encoder.onExtraCallback();
            int iOnExtraCallback8 = C40Encoder.onExtraCallback();
            onExtraCallbackWithResult = new onExtraCallback(graphicDeviceInfoOnExtraCallbackWithResult4, (InterfaceC0083handshake.onNavigationEvent) getCombinedPathForAllStarsWithSide.onExtraCallback(iOnExtraCallback7, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -268374465, iOnExtraCallback8, 268374468, new Object[]{getcombinedpathforallstarswithside}));
            onExtraCallback = new asInterface(isrepeatingenabled.asBinder());
            IAuthTabCallbackDefault = new IAuthTabCallbackDefault(isrepeatingenabled.asBinder());
            asInterface = new onTransact(isrepeatingenabled.asBinder());
            int i = IAuthTabCallbackStubProxy + 3;
            access000 = i % 128;
            int i2 = i % 2;
        }

        public static final class onNavigationEvent extends onWarmupCompleted {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            onNavigationEvent(GraphicDeviceInfo graphicDeviceInfo, InterfaceC0083handshake.onNavigationEvent onnavigationevent) {
                super(graphicDeviceInfo, 16.0f, 24.0f, 24.0f, onnavigationevent, null);
            }

            @Override // o.getDistanceBetweenPoints.onWarmupCompleted
            public getHumanReadableName IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 27;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1953454844);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1953454844, i, -1, "im.toss.tds.compose.component.atom.post.TdsPostV2.Style.Companion.Heading2.<no name provided>.typography (TdsPostV2.kt:224)");
                    int i5 = onExtraCallbackWithResult + 47;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                }
                getHumanReadableName gethumanreadablename = (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -242380979, 242380980, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{AppLovinPostbackService.onExtraCallbackWithResult}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    int i7 = onExtraCallbackWithResult + 65;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    if (i8 != 0) {
                        int i9 = 17 / 0;
                    }
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                return gethumanreadablename;
            }
        }

        public static final class onExtraCallbackWithResult extends onWarmupCompleted {
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            onExtraCallbackWithResult(GraphicDeviceInfo graphicDeviceInfo, InterfaceC0083handshake.onNavigationEvent onnavigationevent) {
                super(graphicDeviceInfo, 8.0f, 24.0f, 24.0f, onnavigationevent, null);
            }

            @Override // o.getDistanceBetweenPoints.onWarmupCompleted
            public getHumanReadableName IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                int i2 = 2 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1264959043);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1264959043, i, -1, "im.toss.tds.compose.component.atom.post.TdsPostV2.Style.Companion.Heading3.<no name provided>.typography (TdsPostV2.kt:236)");
                    int i3 = onExtraCallbackWithResult + 53;
                    onExtraCallback = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 3 / 4;
                    }
                }
                getHumanReadableName gethumanreadablenameIAuthTabCallbackStub = AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallbackStub();
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i5 = onExtraCallback + 31;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                return gethumanreadablenameIAuthTabCallbackStub;
            }
        }

        public static final class onExtraCallback extends onWarmupCompleted {
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            onExtraCallback(GraphicDeviceInfo graphicDeviceInfo, InterfaceC0083handshake.onNavigationEvent onnavigationevent) {
                super(graphicDeviceInfo, 8.0f, 24.0f, 24.0f, onnavigationevent, null);
            }

            @Override // o.getDistanceBetweenPoints.onWarmupCompleted
            public getHumanReadableName IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                int i2 = 2 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-188405634);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i3 = IAuthTabCallback + 63;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-188405634, i, -1, "im.toss.tds.compose.component.atom.post.TdsPostV2.Style.Companion.Heading4.<no name provided>.typography (TdsPostV2.kt:248)");
                    if (i4 != 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    int i5 = IAuthTabCallback + 69;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                }
                getHumanReadableName interfaceDescriptor = AppLovinPostbackService.onExtraCallbackWithResult.getInterfaceDescriptor();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i7 = IAuthTabCallback + 21;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                return interfaceDescriptor;
            }
        }

        public static final class asInterface extends onWarmupCompleted {
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            asInterface(GraphicDeviceInfo graphicDeviceInfo) {
                super(graphicDeviceInfo, 0.0f, 24.0f, 24.0f, null, 16, null);
            }

            @Override // o.getDistanceBetweenPoints.onWarmupCompleted
            public getHumanReadableName IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 87;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-411554802);
                if (i4 == 0) {
                    CameraConfigExternalSyntheticLambda0.asBinder();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i5 = onNavigationEvent + 29;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-411554802, i, -1, "im.toss.tds.compose.component.atom.post.TdsPostV2.Style.Companion.Paragraph.<no name provided>.typography (TdsPostV2.kt:259)");
                    int i7 = onNavigationEvent + 119;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                }
                getHumanReadableName interfaceDescriptor = AppLovinPostbackService.onExtraCallbackWithResult.getInterfaceDescriptor();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i9 = onExtraCallback + 37;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                return interfaceDescriptor;
            }
        }

        public static final class IAuthTabCallbackDefault extends onWarmupCompleted {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            IAuthTabCallbackDefault(GraphicDeviceInfo graphicDeviceInfo) {
                super(graphicDeviceInfo, 0.0f, 24.0f, 24.0f, null, 16, null);
            }

            @Override // o.getDistanceBetweenPoints.onWarmupCompleted
            public getHumanReadableName IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                int i2 = 2 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-952201979);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i3 = onExtraCallbackWithResult + 51;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-952201979, i, -1, "im.toss.tds.compose.component.atom.post.TdsPostV2.Style.Companion.ParagraphSmall.<no name provided>.typography (TdsPostV2.kt:270)");
                    if (i4 == 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    int i5 = onExtraCallbackWithResult + 73;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                }
                getHumanReadableName gethumanreadablename = (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{AppLovinPostbackService.onExtraCallbackWithResult}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i7 = onExtraCallbackWithResult + 19;
                    IAuthTabCallback = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 2 / 4;
                    }
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                return gethumanreadablename;
            }
        }

        public static final class onTransact extends onWarmupCompleted {
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            onTransact(GraphicDeviceInfo graphicDeviceInfo) {
                super(graphicDeviceInfo, 0.0f, 24.0f, 24.0f, null, 16, null);
            }

            @Override // o.getDistanceBetweenPoints.onWarmupCompleted
            public getHumanReadableName IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 89;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(236862173);
                if (i4 != 0) {
                    CameraConfigExternalSyntheticLambda0.asBinder();
                    throw null;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i5 = onWarmupCompleted + 21;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(236862173, i, -1, "im.toss.tds.compose.component.atom.post.TdsPostV2.Style.Companion.ParagraphXSmall.<no name provided>.typography (TdsPostV2.kt:281)");
                    if (i6 == 0) {
                        throw null;
                    }
                    int i7 = IAuthTabCallback + 57;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                }
                getHumanReadableName gethumanreadablenameIAuthTabCallback_Parcel = AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallback_Parcel();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                return gethumanreadablenameIAuthTabCallback_Parcel;
            }
        }
    }
}
