package o;

import com.bytedance.sdk.openadsdk.wwx.lt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC0083handshake;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setCallToAction {
    private static int onExtraCallback = 1;
    public static final setCallToAction onExtraCallbackWithResult = new setCallToAction();
    private static int onWarmupCompleted;

    static {
        int i = onWarmupCompleted + 119;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private setCallToAction() {
    }

    public static final class onExtraCallbackWithResult {
        private static int IAuthTabCallbackDefault = 1;
        private static int IAuthTabCallbackStub = 0;
        private static int asBinder = 0;
        private static int asInterface = 1;
        private final onWarmupCompleted IAuthTabCallback;
        private final onExtraCallback onExtraCallback;
        private final IAuthTabCallback onNavigationEvent;
        private final onNavigationEvent onWarmupCompleted;
        public static final C0064onExtraCallbackWithResult Companion = new C0064onExtraCallbackWithResult(null);
        private static final onExtraCallbackWithResult onExtraCallbackWithResult = new onExtraCallbackWithResult(null, null, null, null, 15, null);

        public onExtraCallbackWithResult() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ onExtraCallbackWithResult IAuthTabCallback(onExtraCallbackWithResult onextracallbackwithresult, onWarmupCompleted onwarmupcompleted, onExtraCallback onextracallback, IAuthTabCallback iAuthTabCallback, onNavigationEvent onnavigationevent, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallbackDefault + 5;
            int i4 = i3 % 128;
            IAuthTabCallbackStub = i4;
            if (i3 % 2 == 0 && (i & 1) != 0) {
                onwarmupcompleted = onextracallbackwithresult.IAuthTabCallback;
            }
            if ((i & 2) != 0) {
                onextracallback = onextracallbackwithresult.onExtraCallback;
            }
            if ((i & 4) != 0) {
                int i5 = i4 + 59;
                IAuthTabCallbackDefault = i5 % 128;
                if (i5 % 2 == 0) {
                    IAuthTabCallback iAuthTabCallback2 = onextracallbackwithresult.onNavigationEvent;
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                iAuthTabCallback = onextracallbackwithresult.onNavigationEvent;
            }
            if ((i & 8) != 0) {
                onnavigationevent = onextracallbackwithresult.onWarmupCompleted;
            }
            onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent = onextracallbackwithresult.onNavigationEvent(onwarmupcompleted, onextracallback, iAuthTabCallback, onnavigationevent);
            int i6 = IAuthTabCallbackDefault + 47;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            return onextracallbackwithresultOnNavigationEvent;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = IAuthTabCallbackDefault + 119;
                IAuthTabCallbackStub = i2 % 128;
                if (i2 % 2 == 0) {
                    return true;
                }
                throw null;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                return false;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            if (this.IAuthTabCallback != onextracallbackwithresult.IAuthTabCallback) {
                return false;
            }
            if (this.onExtraCallback != onextracallbackwithresult.onExtraCallback) {
                int i3 = IAuthTabCallbackStub + 39;
                IAuthTabCallbackDefault = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.onNavigationEvent, onextracallbackwithresult.onNavigationEvent)) {
                return false;
            }
            if (this.onWarmupCompleted == onextracallbackwithresult.onWarmupCompleted) {
                return true;
            }
            int i5 = IAuthTabCallbackStub + 103;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 25;
            IAuthTabCallbackStub = i2 % 128;
            int iHashCode = i2 % 2 != 0 ? (((((this.IAuthTabCallback.hashCode() >>> 73) / this.onExtraCallback.hashCode()) >> 113) << this.onNavigationEvent.hashCode()) - 101) * this.onWarmupCompleted.hashCode() : (((((this.IAuthTabCallback.hashCode() * 31) + this.onExtraCallback.hashCode()) * 31) + this.onNavigationEvent.hashCode()) * 31) + this.onWarmupCompleted.hashCode();
            int i3 = IAuthTabCallbackStub + 81;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        public final onExtraCallbackWithResult onNavigationEvent(@NotNull onWarmupCompleted onwarmupcompleted, @NotNull onExtraCallback onextracallback, @NotNull IAuthTabCallback iAuthTabCallback, @NotNull onNavigationEvent onnavigationevent) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            Intrinsics.checkNotNullParameter(onextracallback, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(onwarmupcompleted, onextracallback, iAuthTabCallback, onnavigationevent);
            int i2 = IAuthTabCallbackStub + 93;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                return onextracallbackwithresult;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Theme(color=" + this.IAuthTabCallback + ", style=" + this.onExtraCallback + ", size=" + this.onNavigationEvent + ", display=" + this.onWarmupCompleted + ")";
            int i2 = IAuthTabCallbackStub + 1;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public onExtraCallbackWithResult(@NotNull onWarmupCompleted onwarmupcompleted, @NotNull onExtraCallback onextracallback, @NotNull IAuthTabCallback iAuthTabCallback, @NotNull onNavigationEvent onnavigationevent) {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            Intrinsics.checkNotNullParameter(onextracallback, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            this.IAuthTabCallback = onwarmupcompleted;
            this.onExtraCallback = onextracallback;
            this.onNavigationEvent = iAuthTabCallback;
            this.onWarmupCompleted = onnavigationevent;
        }

        public static final /* synthetic */ onExtraCallbackWithResult onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 13;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = onExtraCallbackWithResult;
            int i5 = i2 + 35;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return onextracallbackwithresult;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onExtraCallbackWithResult(onWarmupCompleted onwarmupcompleted, onExtraCallback onextracallback, IAuthTabCallback iAuthTabCallback, onNavigationEvent onnavigationevent, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = IAuthTabCallbackStub + 43;
                IAuthTabCallbackDefault = i2 % 128;
                if (i2 % 2 == 0) {
                    onWarmupCompleted onwarmupcompleted2 = onWarmupCompleted.Primary;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                onwarmupcompleted = onWarmupCompleted.Primary;
                int i3 = IAuthTabCallbackDefault + 29;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            }
            if ((i & 2) != 0) {
                onextracallback = onExtraCallback.Fill;
                int i6 = 2 % 2;
            }
            if ((i & 4) != 0) {
                iAuthTabCallback = IAuthTabCallback.Companion.onExtraCallbackWithResult();
                int i7 = IAuthTabCallbackStub + 123;
                IAuthTabCallbackDefault = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 2 % 2;
                }
            }
            if ((i & 8) != 0) {
                int i9 = IAuthTabCallbackStub + 37;
                IAuthTabCallbackDefault = i9 % 128;
                int i10 = i9 % 2;
                onnavigationevent = onNavigationEvent.Inline;
            }
            this(onwarmupcompleted, onextracallback, iAuthTabCallback, onnavigationevent);
        }

        public final onWarmupCompleted IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 75;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            int i4 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = this.IAuthTabCallback;
            int i5 = i3 + 5;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return onwarmupcompleted;
        }

        public final onExtraCallback onWarmupCompleted() {
            onExtraCallback onextracallback;
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 105;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            if (i2 % 2 != 0) {
                onextracallback = this.onExtraCallback;
                int i4 = 63 / 0;
            } else {
                onextracallback = this.onExtraCallback;
            }
            int i5 = i3 + 3;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return onextracallback;
        }

        public final IAuthTabCallback onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 7;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            Object obj = null;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            IAuthTabCallback iAuthTabCallback = this.onNavigationEvent;
            int i4 = i3 + 35;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                return iAuthTabCallback;
            }
            obj.hashCode();
            throw null;
        }

        public final onNavigationEvent onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 43;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            onNavigationEvent onnavigationevent = this.onWarmupCompleted;
            int i4 = i3 + 89;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return onnavigationevent;
        }

        /* renamed from: o.setCallToAction$onExtraCallbackWithResult$onExtraCallbackWithResult, reason: collision with other inner class name */
        public static final class C0064onExtraCallbackWithResult {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public /* synthetic */ C0064onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0064onExtraCallbackWithResult() {
            }

            public final onExtraCallbackWithResult IAuthTabCallback() {
                onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 41;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    onextracallbackwithresultOnNavigationEvent = onExtraCallbackWithResult.onNavigationEvent();
                    int i3 = 32 / 0;
                } else {
                    onextracallbackwithresultOnNavigationEvent = onExtraCallbackWithResult.onNavigationEvent();
                }
                int i4 = onExtraCallbackWithResult + 63;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return onextracallbackwithresultOnNavigationEvent;
            }
        }

        static {
            int i = asInterface + 81;
            asBinder = i % 128;
            int i2 = i % 2;
        }
    }

    public static final class IAuthTabCallback {
        public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
        private static final IAuthTabCallback IAuthTabCallback;
        private static int IAuthTabCallbackStubProxy = 0;
        private static int IAuthTabCallback_Parcel = 1;
        private static int ICustomTabsCallback = 1;
        private static final IAuthTabCallback onExtraCallback;
        private static final IAuthTabCallback onExtraCallbackWithResult;
        private static final IAuthTabCallback onWarmupCompleted;
        private static int writeTypedObject;
        private final float IAuthTabCallbackDefault;
        private final float IAuthTabCallbackStub;
        private final InterfaceC0083handshake access000;
        private final float access100;
        private final float asBinder;
        private final boolean asInterface;
        private final long getInterfaceDescriptor;
        private final float onNavigationEvent;
        private final float onTransact;

        public /* synthetic */ IAuthTabCallback(long j, InterfaceC0083handshake interfaceC0083handshake, float f, float f2, float f3, float f4, float f5, float f6, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, interfaceC0083handshake, f, f2, f3, f4, f5, f6, z);
        }

        public /* synthetic */ IAuthTabCallback(accessgetTlsVersionsAsStringp accessgettlsversionsasstringp, InterfaceC0083handshake interfaceC0083handshake, float f, float f2, float f3, float f4, float f5, float f6, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(accessgettlsversionsasstringp, interfaceC0083handshake, f, f2, f3, f4, f5, f6, z);
        }

        public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
            int i7 = ~i4;
            int i8 = i5 | i7 | (~i2);
            int i9 = ~i5;
            int i10 = (~(i2 | i7)) | (~(i7 | i9));
            int i11 = i4 + i5 + i3 + ((-92689393) * i6) + (1942122663 * i);
            int i12 = i11 * i11;
            int i13 = (((-665130586) * i4) - 357761024) + ((-674687396) * i5) + (4778405 * i8) + (i9 * (-4778405)) + ((-4778405) * i10) + ((-669908992) * i3) + ((-1056047104) * i6) + ((-742522880) * i) + ((-592117760) * i12);
            int i14 = (i4 * 1048061654) + 1366922925 + (i5 * 1048062268) + (i8 * (-307)) + (i9 * 307) + (i10 * 307) + (i3 * 1048061961) + (i6 * 439444615) + (i * (-1279783457)) + (i12 * 173867008);
            return i13 + ((i14 * i14) * (-1898250240)) != 1 ? onWarmupCompleted(objArr) : onNavigationEvent(objArr);
        }

        public static /* synthetic */ IAuthTabCallback onWarmupCompleted(IAuthTabCallback iAuthTabCallback, long j, InterfaceC0083handshake interfaceC0083handshake, float f, float f2, float f3, float f4, float f5, float f6, boolean z, int i, Object obj) {
            long j2;
            float f7;
            float f8;
            boolean z2;
            int i2 = 2 % 2;
            if ((i & 1) != 0) {
                int i3 = ICustomTabsCallback + 53;
                writeTypedObject = i3 % 128;
                int i4 = i3 % 2;
                j2 = iAuthTabCallback.getInterfaceDescriptor;
            } else {
                j2 = j;
            }
            InterfaceC0083handshake interfaceC0083handshake2 = (i & 2) != 0 ? iAuthTabCallback.access000 : interfaceC0083handshake;
            if ((i & 4) != 0) {
                int i5 = ICustomTabsCallback + 47;
                writeTypedObject = i5 % 128;
                int i6 = i5 % 2;
                f7 = iAuthTabCallback.access100;
            } else {
                f7 = f;
            }
            float f9 = (i & 8) != 0 ? iAuthTabCallback.onTransact : f2;
            float f10 = (i & 16) != 0 ? iAuthTabCallback.IAuthTabCallbackDefault : f3;
            float f11 = (i & 32) != 0 ? iAuthTabCallback.onNavigationEvent : f4;
            float f12 = (i & 64) != 0 ? iAuthTabCallback.IAuthTabCallbackStub : f5;
            if ((i & 128) != 0) {
                int i7 = ICustomTabsCallback + 45;
                writeTypedObject = i7 % 128;
                int i8 = i7 % 2;
                f8 = iAuthTabCallback.asBinder;
            } else {
                f8 = f6;
            }
            if ((i & 256) != 0) {
                int i9 = ICustomTabsCallback + 47;
                writeTypedObject = i9 % 128;
                if (i9 % 2 != 0) {
                    z2 = iAuthTabCallback.asInterface;
                    int i10 = 2 / 0;
                } else {
                    z2 = iAuthTabCallback.asInterface;
                }
            } else {
                z2 = z;
            }
            return iAuthTabCallback.onNavigationEvent(j2, interfaceC0083handshake2, f7, f9, f10, f11, f12, f8, z2);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IAuthTabCallback)) {
                return false;
            }
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) obj;
            if (!AvoidCaptureProcessProgressAvailabilityCheckQuirk.onWarmupCompleted(this.getInterfaceDescriptor, iAuthTabCallback.getInterfaceDescriptor)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.access000, iAuthTabCallback.access000)) {
                int i2 = writeTypedObject + 79;
                ICustomTabsCallback = i2 % 128;
                return i2 % 2 == 0;
            }
            if (!VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.access100, iAuthTabCallback.access100)) {
                return false;
            }
            if (VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.onTransact, iAuthTabCallback.onTransact)) {
                return VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.IAuthTabCallbackDefault, iAuthTabCallback.IAuthTabCallbackDefault) && VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.onNavigationEvent, iAuthTabCallback.onNavigationEvent) && !(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.IAuthTabCallbackStub, iAuthTabCallback.IAuthTabCallbackStub) ^ true) && VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.asBinder, iAuthTabCallback.asBinder) && this.asInterface == iAuthTabCallback.asInterface;
            }
            int i3 = ICustomTabsCallback + 17;
            writeTypedObject = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = ICustomTabsCallback + 113;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            int iOnTransact = (((((((((((((((AvoidCaptureProcessProgressAvailabilityCheckQuirk.onTransact(this.getInterfaceDescriptor) * 31) + this.access000.hashCode()) * 31) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.access100)) * 31) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.onTransact)) * 31) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.IAuthTabCallbackDefault)) * 31) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.onNavigationEvent)) * 31) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.IAuthTabCallbackStub)) * 31) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.asBinder)) * 31) + Boolean.hashCode(this.asInterface);
            int i4 = writeTypedObject + 61;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
            return iOnTransact;
        }

        public final IAuthTabCallback onNavigationEvent(long j, @NotNull InterfaceC0083handshake interfaceC0083handshake, float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(interfaceC0083handshake, "");
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(j, interfaceC0083handshake, f, f2, f3, f4, f5, f6, z, (DefaultConstructorMarker) null);
            int i2 = writeTypedObject + 59;
            ICustomTabsCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return iAuthTabCallback;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Size(textSize=" + AvoidCaptureProcessProgressAvailabilityCheckQuirk.asInterface(this.getInterfaceDescriptor) + ", tdsLineHeight=" + this.access000 + ", minWidth=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.access100) + ", minHeight=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.onTransact) + ", horizontalPadding=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.IAuthTabCallbackDefault) + ", buttonRadius=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.onNavigationEvent) + ", loadingSize=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.IAuthTabCallbackStub) + ", loadingGap=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.asBinder) + ", isTwoLinesAvailable=" + this.asInterface + ")";
            int i2 = ICustomTabsCallback + 81;
            writeTypedObject = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private IAuthTabCallback(long j, InterfaceC0083handshake interfaceC0083handshake, float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
            Intrinsics.checkNotNullParameter(interfaceC0083handshake, "");
            this.getInterfaceDescriptor = j;
            this.access000 = interfaceC0083handshake;
            this.access100 = f;
            this.onTransact = f2;
            this.IAuthTabCallbackDefault = f3;
            this.onNavigationEvent = f4;
            this.IAuthTabCallbackStub = f5;
            this.asBinder = f6;
            this.asInterface = z;
        }

        public static final /* synthetic */ IAuthTabCallback onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = ICustomTabsCallback + 15;
            int i3 = i2 % 128;
            writeTypedObject = i3;
            int i4 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = IAuthTabCallback;
            int i5 = i3 + 51;
            ICustomTabsCallback = i5 % 128;
            int i6 = i5 % 2;
            return iAuthTabCallback;
        }

        public static final /* synthetic */ IAuthTabCallback onNavigationEvent() {
            IAuthTabCallback iAuthTabCallback;
            int i = 2 % 2;
            int i2 = writeTypedObject + 17;
            int i3 = i2 % 128;
            ICustomTabsCallback = i3;
            if (i2 % 2 == 0) {
                iAuthTabCallback = onWarmupCompleted;
                int i4 = 92 / 0;
            } else {
                iAuthTabCallback = onWarmupCompleted;
            }
            int i5 = i3 + 41;
            writeTypedObject = i5 % 128;
            int i6 = i5 % 2;
            return iAuthTabCallback;
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
            int i = 2 % 2;
            int i2 = writeTypedObject;
            int i3 = i2 + 71;
            ICustomTabsCallback = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            IAuthTabCallback iAuthTabCallback = onExtraCallbackWithResult;
            int i4 = i2 + 125;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
            return iAuthTabCallback;
        }

        public static final /* synthetic */ IAuthTabCallback onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = ICustomTabsCallback + 45;
            int i3 = i2 % 128;
            writeTypedObject = i3;
            int i4 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = onExtraCallback;
            int i5 = i3 + 15;
            ICustomTabsCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return iAuthTabCallback;
            }
            throw null;
        }

        private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
            long j;
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) objArr[0];
            int i = 2 % 2;
            int i2 = ICustomTabsCallback + 83;
            writeTypedObject = i2 % 128;
            if (i2 % 2 != 0) {
                j = iAuthTabCallback.getInterfaceDescriptor;
                int i3 = 78 / 0;
            } else {
                j = iAuthTabCallback.getInterfaceDescriptor;
            }
            return Long.valueOf(j);
        }

        public final InterfaceC0083handshake access000() {
            int i = 2 % 2;
            int i2 = writeTypedObject + 59;
            int i3 = i2 % 128;
            ICustomTabsCallback = i3;
            int i4 = i2 % 2;
            InterfaceC0083handshake interfaceC0083handshake = this.access000;
            int i5 = i3 + 55;
            writeTypedObject = i5 % 128;
            int i6 = i5 % 2;
            return interfaceC0083handshake;
        }

        public final float IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = ICustomTabsCallback;
            int i3 = i2 + 55;
            writeTypedObject = i3 % 128;
            int i4 = i3 % 2;
            float f = this.access100;
            int i5 = i2 + 123;
            writeTypedObject = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 41 / 0;
            }
            return f;
        }

        public final float IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = ICustomTabsCallback + 99;
            writeTypedObject = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onTransact;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final float onTransact() {
            int i = 2 % 2;
            int i2 = writeTypedObject + 111;
            int i3 = i2 % 128;
            ICustomTabsCallback = i3;
            int i4 = i2 % 2;
            float f = this.IAuthTabCallbackDefault;
            int i5 = i3 + 101;
            writeTypedObject = i5 % 128;
            int i6 = i5 % 2;
            return f;
        }

        public final float onExtraCallback() {
            int i = 2 % 2;
            int i2 = ICustomTabsCallback + 111;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            float f = this.onNavigationEvent;
            if (i3 != 0) {
                int i4 = 49 / 0;
            }
            return f;
        }

        public final float asInterface() {
            int i = 2 % 2;
            int i2 = writeTypedObject + 55;
            ICustomTabsCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return this.IAuthTabCallbackStub;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final float asBinder() {
            int i = 2 % 2;
            int i2 = writeTypedObject + 39;
            int i3 = i2 % 128;
            ICustomTabsCallback = i3;
            int i4 = i2 % 2;
            float f = this.asBinder;
            int i5 = i3 + 73;
            writeTypedObject = i5 % 128;
            int i6 = i5 % 2;
            return f;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        private IAuthTabCallback(accessgetTlsVersionsAsStringp accessgettlsversionsasstringp, InterfaceC0083handshake interfaceC0083handshake, float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
            this(RequestOptionConfigBuilderExternalSyntheticLambda0.onNavigationEvent(accessgettlsversionsasstringp.getSize()), interfaceC0083handshake, f, f2, f3, f4, f5, f6, z, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(accessgettlsversionsasstringp, "");
            Intrinsics.checkNotNullParameter(interfaceC0083handshake, "");
        }

        public static final class onExtraCallbackWithResult {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private onExtraCallbackWithResult() {
            }

            public final IAuthTabCallback onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 87;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult3 = lt.40.onExtraCallbackWithResult();
                IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) IAuthTabCallback.IAuthTabCallback(lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, -1127476623, new Object[0], 1127476623, iOnExtraCallbackWithResult3);
                int i4 = IAuthTabCallback + 119;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return iAuthTabCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final IAuthTabCallback onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 125;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                IAuthTabCallback iAuthTabCallbackOnNavigationEvent = IAuthTabCallback.onNavigationEvent();
                int i4 = onExtraCallback + 61;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return iAuthTabCallbackOnNavigationEvent;
            }

            public final IAuthTabCallback IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 97;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult = IAuthTabCallback.onExtraCallbackWithResult();
                int i4 = onExtraCallback + 43;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return iAuthTabCallbackOnExtraCallbackWithResult;
            }

            public final IAuthTabCallback onNavigationEvent() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 89;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return IAuthTabCallback.onWarmupCompleted();
                }
                IAuthTabCallback.onWarmupCompleted();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        static {
            accessgetTlsVersionsAsStringp accessgettlsversionsasstringp = accessgetTlsVersionsAsStringp.SubTypography9;
            ConnectionPool connectionPool = ConnectionPool.onWarmupCompleted;
            InterfaceC0083handshake.onNavigationEvent onnavigationeventOnWarmupCompleted = connectionPool.onWarmupCompleted();
            MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity = MaxDebuggerAdUnitDetailActivity.onExtraCallback;
            float fOnExtraCallback = maxDebuggerAdUnitDetailActivity.onExtraCallback();
            AppLovinAdType appLovinAdType = AppLovinAdType.onExtraCallbackWithResult;
            float fAsInterface = appLovinAdType.asInterface();
            float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(28.0f);
            AppLovinAdSize appLovinAdSize = AppLovinAdSize.onWarmupCompleted;
            boolean z = true;
            DefaultConstructorMarker defaultConstructorMarker = null;
            onExtraCallbackWithResult = new IAuthTabCallback(accessgettlsversionsasstringp, onnavigationeventOnWarmupCompleted, fOnExtraCallback, fAsInterface, fIAuthTabCallback, appLovinAdSize.onExtraCallbackWithResult(), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(7.0f), z, defaultConstructorMarker);
            onWarmupCompleted = new IAuthTabCallback(accessgettlsversionsasstringp, connectionPool.onWarmupCompleted(), maxDebuggerAdUnitDetailActivity.onNavigationEvent(), appLovinAdType.onExtraCallbackWithResult(), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), appLovinAdSize.onExtraCallback(), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(5.0f), z, defaultConstructorMarker);
            IAuthTabCallback = new IAuthTabCallback(accessgetTlsVersionsAsStringp.Typography6, (InterfaceC0083handshake) connectionPool.onWarmupCompleted(), maxDebuggerAdUnitDetailActivity.onWarmupCompleted(), appLovinAdType.onExtraCallback(), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), appLovinAdSize.IAuthTabCallbackStub(), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(5.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f), false, (DefaultConstructorMarker) null);
            onExtraCallback = new IAuthTabCallback(accessgetTlsVersionsAsStringp.Typography7, (InterfaceC0083handshake) connectionPool.onWarmupCompleted(), maxDebuggerAdUnitDetailActivity.IAuthTabCallback(), appLovinAdType.onWarmupCompleted(), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f), appLovinAdSize.asBinder(), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(5.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(3.0f), false, defaultConstructorMarker);
            int i = IAuthTabCallbackStubProxy + 51;
            IAuthTabCallback_Parcel = i % 128;
            int i2 = i % 2;
        }

        public static final /* synthetic */ IAuthTabCallback IAuthTabCallback() {
            int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = lt.40.onExtraCallbackWithResult();
            return (IAuthTabCallback) IAuthTabCallback(lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, -1127476623, new Object[0], 1127476623, iOnExtraCallbackWithResult3);
        }

        public final long IAuthTabCallbackStubProxy() {
            int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = lt.40.onExtraCallbackWithResult();
            return ((Long) IAuthTabCallback(lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, 1079691704, new Object[]{this}, -1079691703, iOnExtraCallbackWithResult3)).longValue();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onNavigationEvent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onNavigationEvent[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private static int onNavigationEvent;
        public static final onNavigationEvent Inline = new onNavigationEvent("Inline", 0);
        public static final onNavigationEvent Block = new onNavigationEvent("Block", 1);
        public static final onNavigationEvent Full = new onNavigationEvent("Full", 2);

        private static final /* synthetic */ onNavigationEvent[] $values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 35;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            onNavigationEvent[] onnavigationeventArr = {Inline, Block, Full};
            int i5 = i2 + 125;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return onnavigationeventArr;
        }

        public static EnumEntries<onNavigationEvent> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 79;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<onNavigationEvent> enumEntries = $ENTRIES;
            int i5 = i2 + 29;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return enumEntries;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onNavigationEvent valueOf(String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 101;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
            if (i3 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = onNavigationEvent + 33;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return onnavigationevent;
        }

        public static onNavigationEvent[] values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 83;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent[] onnavigationeventArr = (onNavigationEvent[]) $VALUES.clone();
            int i4 = onNavigationEvent + 101;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return onnavigationeventArr;
            }
            throw null;
        }

        private onNavigationEvent(String str, int i) {
        }

        static {
            onNavigationEvent[] onnavigationeventArr$values = $values();
            $VALUES = onnavigationeventArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
            int i = IAuthTabCallback + 25;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 != 0) {
                int i2 = 82 / 0;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onWarmupCompleted {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onWarmupCompleted[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;
        public static final onWarmupCompleted Primary = new onWarmupCompleted("Primary", 0);
        public static final onWarmupCompleted Dark = new onWarmupCompleted("Dark", 1);
        public static final onWarmupCompleted Danger = new onWarmupCompleted("Danger", 2);
        public static final onWarmupCompleted Light = new onWarmupCompleted("Light", 3);

        private static final /* synthetic */ onWarmupCompleted[] $values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 5;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            onWarmupCompleted[] onwarmupcompletedArr = {Primary, Dark, Danger, Light};
            int i5 = i3 + 45;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return onwarmupcompletedArr;
        }

        public static EnumEntries<onWarmupCompleted> getEntries() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 81;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            EnumEntries<onWarmupCompleted> enumEntries = $ENTRIES;
            int i5 = i3 + 125;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 33 / 0;
            }
            return enumEntries;
        }

        public static onWarmupCompleted valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 49;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
            if (i3 == 0) {
                int i4 = 14 / 0;
            }
            return onwarmupcompleted;
        }

        public static onWarmupCompleted[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 105;
            onNavigationEvent = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            onWarmupCompleted[] onwarmupcompletedArr = (onWarmupCompleted[]) $VALUES.clone();
            int i3 = onExtraCallbackWithResult + 77;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return onwarmupcompletedArr;
            }
            throw null;
        }

        private onWarmupCompleted(String str, int i) {
        }

        static {
            onWarmupCompleted[] onwarmupcompletedArr$values = $values();
            $VALUES = onwarmupcompletedArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onwarmupcompletedArr$values);
            int i = IAuthTabCallback + 35;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallback[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private static int onWarmupCompleted;
        public static final onExtraCallback Fill = new onExtraCallback("Fill", 0);
        public static final onExtraCallback Weak = new onExtraCallback("Weak", 1);

        private static final /* synthetic */ onExtraCallback[] $values() {
            onExtraCallback[] onextracallbackArr;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 117;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                onExtraCallback onextracallback = Fill;
                onExtraCallback onextracallback2 = Weak;
                onextracallbackArr = new onExtraCallback[3];
                onextracallbackArr[0] = onextracallback;
                onextracallbackArr[1] = onextracallback2;
            } else {
                onextracallbackArr = new onExtraCallback[]{Fill, Weak};
            }
            int i4 = i2 + 99;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return onextracallbackArr;
            }
            throw null;
        }

        public static EnumEntries<onExtraCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 29;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            EnumEntries<onExtraCallback> enumEntries = $ENTRIES;
            if (i3 == 0) {
                int i4 = 95 / 0;
            }
            return enumEntries;
        }

        public static onExtraCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 53;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
            if (i3 != 0) {
                int i4 = 88 / 0;
            }
            return onextracallback;
        }

        public static onExtraCallback[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 71;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback[] onextracallbackArr = (onExtraCallback[]) $VALUES.clone();
            int i4 = onExtraCallbackWithResult + 103;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return onextracallbackArr;
            }
            throw null;
        }

        private onExtraCallback(String str, int i) {
        }

        static {
            onExtraCallback[] onextracallbackArr$values = $values();
            $VALUES = onextracallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
            int i = onWarmupCompleted + 17;
            onExtraCallback = i % 128;
            if (i % 2 == 0) {
                int i2 = 3 / 0;
            }
        }
    }
}
