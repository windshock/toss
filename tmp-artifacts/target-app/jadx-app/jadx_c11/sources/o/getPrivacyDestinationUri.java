package o;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import im.toss.features.payment.ui.offline.compose.screen.TossPlaceTableOrderScreenKt$;
import im.toss.features.teens.cvscash.CvsCashTransactionActivity$;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.VirtualCameraControlExternalSyntheticLambda1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getPrivacyDestinationUri {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public static final getPrivacyDestinationUri onExtraCallbackWithResult = new getPrivacyDestinationUri();

    static {
        int i = IAuthTabCallback + 91;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private getPrivacyDestinationUri() {
    }

    public static final class IAuthTabCallback {
        public static final onNavigationEvent Companion;
        private static int IAuthTabCallbackDefault = 0;
        private static int IAuthTabCallbackStub = 0;
        private static int asBinder = 1;
        private static int onTransact = 1;
        private final float asInterface;
        private final float onNavigationEvent;
        private static final IAuthTabCallback onExtraCallback = new IAuthTabCallback(-1.0f, -1.0f);
        private static final IAuthTabCallback onWarmupCompleted = new IAuthTabCallback(1.0f, -1.0f);
        private static final IAuthTabCallback IAuthTabCallback = new IAuthTabCallback(-1.0f, 1.0f);
        private static final IAuthTabCallback onExtraCallbackWithResult = new IAuthTabCallback(1.0f, 1.0f);

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onTransact + 41;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            if (i2 % 2 != 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IAuthTabCallback)) {
                int i4 = i3 + 103;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) obj;
            if (Float.compare(this.onNavigationEvent, iAuthTabCallback.onNavigationEvent) != 0) {
                return false;
            }
            if (Float.compare(this.asInterface, iAuthTabCallback.asInterface) != 0) {
                int i6 = IAuthTabCallbackDefault + 111;
                onTransact = i6 % 128;
                return i6 % 2 == 0;
            }
            int i7 = onTransact + 19;
            IAuthTabCallbackDefault = i7 % 128;
            int i8 = i7 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 9;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (Float.hashCode(this.onNavigationEvent) * 31) + Float.hashCode(this.asInterface);
            int i4 = IAuthTabCallbackDefault + 67;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "AccPosition(horizontalBias=" + this.onNavigationEvent + ", verticalBias=" + this.asInterface + ")";
            int i2 = IAuthTabCallbackDefault + 83;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public IAuthTabCallback(float f, float f2) {
            this.onNavigationEvent = f;
            this.asInterface = f2;
        }

        public static final /* synthetic */ IAuthTabCallback IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 113;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            IAuthTabCallback iAuthTabCallback = IAuthTabCallback;
            int i5 = i2 + 45;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return iAuthTabCallback;
        }

        public static final /* synthetic */ IAuthTabCallback onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onTransact + 81;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            int i4 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = onExtraCallback;
            int i5 = i3 + 109;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return iAuthTabCallback;
        }

        public static final /* synthetic */ IAuthTabCallback onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 25;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            IAuthTabCallback iAuthTabCallback = onExtraCallbackWithResult;
            int i5 = i2 + 25;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return iAuthTabCallback;
        }

        public static final /* synthetic */ IAuthTabCallback onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onTransact + 37;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                return onWarmupCompleted;
            }
            throw null;
        }

        public final float onExtraCallback() {
            int i = 2 % 2;
            int i2 = onTransact + 39;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            int i4 = i2 % 2;
            float f = this.onNavigationEvent;
            int i5 = i3 + 97;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return f;
        }

        public final float onTransact() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 61;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                return this.asInterface;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final class onNavigationEvent {
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private onNavigationEvent() {
            }

            public final IAuthTabCallback onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 85;
                onExtraCallback = i2 % 128;
                Object obj = null;
                if (i2 % 2 != 0) {
                    IAuthTabCallback.onExtraCallbackWithResult();
                    throw null;
                }
                IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult = IAuthTabCallback.onExtraCallbackWithResult();
                int i3 = onExtraCallback + 33;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    return iAuthTabCallbackOnExtraCallbackWithResult;
                }
                obj.hashCode();
                throw null;
            }

            public final IAuthTabCallback onNavigationEvent() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 17;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                IAuthTabCallback iAuthTabCallbackOnWarmupCompleted = IAuthTabCallback.onWarmupCompleted();
                int i4 = onExtraCallbackWithResult + 79;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 90 / 0;
                }
                return iAuthTabCallbackOnWarmupCompleted;
            }

            public final IAuthTabCallback onExtraCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 107;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                IAuthTabCallback IAuthTabCallback = IAuthTabCallback.IAuthTabCallback();
                int i4 = onExtraCallbackWithResult + 115;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return IAuthTabCallback;
                }
                throw null;
            }

            public final IAuthTabCallback IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 39;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                IAuthTabCallback iAuthTabCallbackOnNavigationEvent = IAuthTabCallback.onNavigationEvent();
                int i4 = onExtraCallback + 105;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return iAuthTabCallbackOnNavigationEvent;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new onNavigationEvent(defaultConstructorMarker);
            int i = asBinder + 85;
            IAuthTabCallbackStub = i % 128;
            if (i % 2 == 0) {
                return;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }
    }

    public static abstract class onExtraCallbackWithResult {
        private static int IAuthTabCallbackStub = 1;
        private static int onTransact;
        private final float IAuthTabCallback;
        private final toMetersPerSecond onExtraCallback;
        private final float onExtraCallbackWithResult;
        private final long onNavigationEvent;
        private final onExtraCallback onWarmupCompleted;

        public /* synthetic */ onExtraCallbackWithResult(float f, float f2, long j, onExtraCallback onextracallback, toMetersPerSecond tometerspersecond, DefaultConstructorMarker defaultConstructorMarker) {
            this(f, f2, j, onextracallback, tometerspersecond);
        }

        private onExtraCallbackWithResult(float f, float f2, long j, onExtraCallback onextracallback, toMetersPerSecond tometerspersecond) {
            Intrinsics.checkNotNullParameter(onextracallback, "");
            Intrinsics.checkNotNullParameter(tometerspersecond, "");
            this.IAuthTabCallback = f;
            this.onExtraCallbackWithResult = f2;
            this.onNavigationEvent = j;
            this.onWarmupCompleted = onextracallback;
            this.onExtraCallback = tometerspersecond;
        }

        public float IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 123;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            float f = this.IAuthTabCallback;
            int i5 = i2 + 121;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return f;
        }

        public float onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 27;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            float f = this.onExtraCallbackWithResult;
            int i5 = i2 + 95;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 96 / 0;
            }
            return f;
        }

        public long onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 111;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onNavigationEvent;
            }
            int i3 = 76 / 0;
            return this.onNavigationEvent;
        }

        public onExtraCallback onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 33;
            onTransact = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            onExtraCallback onextracallback = this.onWarmupCompleted;
            int i4 = i2 + 29;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return onextracallback;
        }

        public toMetersPerSecond onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 57;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            toMetersPerSecond tometerspersecond = this.onExtraCallback;
            int i5 = i2 + 1;
            onTransact = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 23 / 0;
            }
            return tometerspersecond;
        }

        public static final class IAuthTabCallback extends onExtraCallbackWithResult {
            public static final onExtraCallback Companion = new onExtraCallback(null);
            private static final IAuthTabCallback IAuthTabCallback;
            private static int IAuthTabCallbackDefault = 1;
            private static int access000 = 1;
            private static int asInterface;
            private static int getInterfaceDescriptor;
            private static final IAuthTabCallback onExtraCallback;
            private static final IAuthTabCallback onExtraCallbackWithResult;
            private final float IAuthTabCallbackStub;
            private final long asBinder;
            private final onExtraCallback onNavigationEvent;
            private final toMetersPerSecond onTransact;
            private final float onWarmupCompleted;

            public /* synthetic */ IAuthTabCallback(float f, float f2, long j, onExtraCallback onextracallback, toMetersPerSecond tometerspersecond, DefaultConstructorMarker defaultConstructorMarker) {
                this(f, f2, j, onextracallback, tometerspersecond);
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
                if (!VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.IAuthTabCallbackStub, iAuthTabCallback.IAuthTabCallbackStub)) {
                    int i2 = access000 + 29;
                    getInterfaceDescriptor = i2 % 128;
                    if (i2 % 2 == 0) {
                        return false;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                if (!VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.onWarmupCompleted, iAuthTabCallback.onWarmupCompleted)) {
                    return false;
                }
                if (!r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.onNavigationEvent(this.asBinder, iAuthTabCallback.asBinder)) {
                    int i3 = access000 + 63;
                    getInterfaceDescriptor = i3 % 128;
                    int i4 = i3 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.onNavigationEvent, iAuthTabCallback.onNavigationEvent)) {
                    int i5 = getInterfaceDescriptor + 35;
                    access000 = i5 % 128;
                    return i5 % 2 == 0;
                }
                if (Intrinsics.areEqual(this.onTransact, iAuthTabCallback.onTransact)) {
                    return true;
                }
                int i6 = access000 + 37;
                getInterfaceDescriptor = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = access000 + 97;
                getInterfaceDescriptor = i2 % 128;
                int i3 = i2 % 2;
                int iOnWarmupCompleted = (((((((VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.IAuthTabCallbackStub) * 31) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.onWarmupCompleted)) * 31) + r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.onExtraCallbackWithResult(this.asBinder)) * 31) + this.onNavigationEvent.hashCode()) * 31) + this.onTransact.hashCode();
                int i4 = getInterfaceDescriptor + 1;
                access000 = i4 % 128;
                if (i4 % 2 != 0) {
                    return iOnWarmupCompleted;
                }
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Square(width=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.IAuthTabCallbackStub) + ", height=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.onWarmupCompleted) + ", overlapOffset=" + r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.asInterface(this.asBinder) + ", accSize=" + this.onNavigationEvent + ", shape=" + this.onTransact + ")";
                int i2 = access000 + 43;
                getInterfaceDescriptor = i2 % 128;
                if (i2 % 2 == 0) {
                    return str;
                }
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            private IAuthTabCallback(float f, float f2, long j, onExtraCallback onextracallback, toMetersPerSecond tometerspersecond) {
                super(f, f2, j, onextracallback, tometerspersecond, null);
                Intrinsics.checkNotNullParameter(onextracallback, "");
                Intrinsics.checkNotNullParameter(tometerspersecond, "");
                this.IAuthTabCallbackStub = f;
                this.onWarmupCompleted = f2;
                this.asBinder = j;
                this.onNavigationEvent = onextracallback;
                this.onTransact = tometerspersecond;
            }

            public static final /* synthetic */ IAuthTabCallback IAuthTabCallbackStub() {
                int i = 2 % 2;
                int i2 = access000 + 5;
                int i3 = i2 % 128;
                getInterfaceDescriptor = i3;
                int i4 = i2 % 2;
                IAuthTabCallback iAuthTabCallback = onExtraCallback;
                int i5 = i3 + 25;
                access000 = i5 % 128;
                int i6 = i5 % 2;
                return iAuthTabCallback;
            }

            public static final /* synthetic */ IAuthTabCallback asInterface() {
                int i = 2 % 2;
                int i2 = access000;
                int i3 = i2 + 87;
                getInterfaceDescriptor = i3 % 128;
                int i4 = i3 % 2;
                IAuthTabCallback iAuthTabCallback = IAuthTabCallback;
                int i5 = i2 + 107;
                getInterfaceDescriptor = i5 % 128;
                if (i5 % 2 == 0) {
                    return iAuthTabCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ IAuthTabCallback(float f, float f2, long j, onExtraCallback onextracallback, toMetersPerSecond tometerspersecond, int i, DefaultConstructorMarker defaultConstructorMarker) {
                long jOnWarmupCompleted;
                onExtraCallback onextracallbackIAuthTabCallback;
                if ((i & 4) != 0) {
                    int i2 = getInterfaceDescriptor + 103;
                    access000 = i2 % 128;
                    int i3 = i2 % 2;
                    int i4 = 2 % 2;
                    jOnWarmupCompleted = r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.Companion.onWarmupCompleted();
                } else {
                    jOnWarmupCompleted = j;
                }
                if ((i & 8) != 0) {
                    int i5 = access000 + 29;
                    getInterfaceDescriptor = i5 % 128;
                    int i6 = i5 % 2;
                    onextracallbackIAuthTabCallback = onExtraCallback.Companion.IAuthTabCallback();
                } else {
                    onextracallbackIAuthTabCallback = onextracallback;
                }
                this(f, f2, jOnWarmupCompleted, onextracallbackIAuthTabCallback, tometerspersecond, null);
            }

            @Override // o.getPrivacyDestinationUri.onExtraCallbackWithResult
            public float IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = getInterfaceDescriptor;
                int i3 = i2 + 1;
                access000 = i3 % 128;
                int i4 = i3 % 2;
                float f = this.IAuthTabCallbackStub;
                int i5 = i2 + 31;
                access000 = i5 % 128;
                int i6 = i5 % 2;
                return f;
            }

            @Override // o.getPrivacyDestinationUri.onExtraCallbackWithResult
            public float onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = access000 + 31;
                int i3 = i2 % 128;
                getInterfaceDescriptor = i3;
                int i4 = i2 % 2;
                float f = this.onWarmupCompleted;
                int i5 = i3 + 85;
                access000 = i5 % 128;
                int i6 = i5 % 2;
                return f;
            }

            @Override // o.getPrivacyDestinationUri.onExtraCallbackWithResult
            public long onExtraCallback() {
                int i = 2 % 2;
                int i2 = getInterfaceDescriptor + 113;
                int i3 = i2 % 128;
                access000 = i3;
                Object obj = null;
                if (i2 % 2 == 0) {
                    throw null;
                }
                long j = this.asBinder;
                int i4 = i3 + 103;
                getInterfaceDescriptor = i4 % 128;
                if (i4 % 2 == 0) {
                    return j;
                }
                obj.hashCode();
                throw null;
            }

            @Override // o.getPrivacyDestinationUri.onExtraCallbackWithResult
            public onExtraCallback onNavigationEvent() {
                int i = 2 % 2;
                int i2 = access000 + 17;
                int i3 = i2 % 128;
                getInterfaceDescriptor = i3;
                int i4 = i2 % 2;
                onExtraCallback onextracallback = this.onNavigationEvent;
                int i5 = i3 + 11;
                access000 = i5 % 128;
                int i6 = i5 % 2;
                return onextracallback;
            }

            @Override // o.getPrivacyDestinationUri.onExtraCallbackWithResult
            public toMetersPerSecond onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = getInterfaceDescriptor + 77;
                access000 = i2 % 128;
                if (i2 % 2 != 0) {
                    return this.onTransact;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static final class onExtraCallback {
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private onExtraCallback() {
                }

                public final IAuthTabCallback IAuthTabCallback() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 39;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    IAuthTabCallback iAuthTabCallbackIAuthTabCallbackStub = IAuthTabCallback.IAuthTabCallbackStub();
                    int i4 = onWarmupCompleted + 95;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    return iAuthTabCallbackIAuthTabCallbackStub;
                }

                public final IAuthTabCallback onWarmupCompleted() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 67;
                    onWarmupCompleted = i2 % 128;
                    if (i2 % 2 != 0) {
                        return IAuthTabCallback.asInterface();
                    }
                    IAuthTabCallback.asInterface();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }

            static {
                float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(60.0f);
                float fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(60.0f);
                float fIAuthTabCallback3 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(7.0f);
                float fIAuthTabCallback4 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(7.0f);
                long jOnExtraCallback = r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.onExtraCallback((Float.floatToRawIntBits(fIAuthTabCallback3) << 32) | (Float.floatToRawIntBits(fIAuthTabCallback4) & 4294967295L));
                float fIAuthTabCallback5 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f);
                float fIAuthTabCallback6 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f);
                float fIAuthTabCallback7 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f);
                DefaultConstructorMarker defaultConstructorMarker = null;
                DefaultConstructorMarker defaultConstructorMarker2 = null;
                onExtraCallback = new IAuthTabCallback(fIAuthTabCallback, fIAuthTabCallback2, jOnExtraCallback, new onExtraCallback(fIAuthTabCallback5, fIAuthTabCallback6, r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.onExtraCallback((Float.floatToRawIntBits(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIAuthTabCallback7) << 32)), defaultConstructorMarker), new AppLovinAdClickListener(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f), null), defaultConstructorMarker2);
                float fIAuthTabCallback8 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(52.0f);
                float fIAuthTabCallback9 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(52.0f);
                float fIAuthTabCallback10 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f);
                float fIAuthTabCallback11 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f);
                long jOnExtraCallback2 = r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.onExtraCallback((Float.floatToRawIntBits(fIAuthTabCallback10) << 32) | (Float.floatToRawIntBits(fIAuthTabCallback11) & 4294967295L));
                float fIAuthTabCallback12 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f);
                float fIAuthTabCallback13 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f);
                float fIAuthTabCallback14 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f);
                float fIAuthTabCallback15 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f);
                onExtraCallbackWithResult = new IAuthTabCallback(fIAuthTabCallback8, fIAuthTabCallback9, jOnExtraCallback2, new onExtraCallback(fIAuthTabCallback12, fIAuthTabCallback13, r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.onExtraCallback((Float.floatToRawIntBits(fIAuthTabCallback15) & 4294967295L) | (Float.floatToRawIntBits(fIAuthTabCallback14) << 32)), null), new AppLovinAdClickListener(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f), null), null);
                float fIAuthTabCallback16 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(40.0f);
                float fIAuthTabCallback17 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(40.0f);
                float fIAuthTabCallback18 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(5.0f);
                float fIAuthTabCallback19 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(5.0f);
                long jOnExtraCallback3 = r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.onExtraCallback((Float.floatToRawIntBits(fIAuthTabCallback19) & 4294967295L) | (Float.floatToRawIntBits(fIAuthTabCallback18) << 32));
                float fIAuthTabCallback20 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(14.0f);
                float fIAuthTabCallback21 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(14.0f);
                float fIAuthTabCallback22 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(3.0f);
                float fIAuthTabCallback23 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(3.0f);
                IAuthTabCallback = new IAuthTabCallback(fIAuthTabCallback16, fIAuthTabCallback17, jOnExtraCallback3, new onExtraCallback(fIAuthTabCallback20, fIAuthTabCallback21, r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.onExtraCallback((Float.floatToRawIntBits(fIAuthTabCallback23) & 4294967295L) | (Float.floatToRawIntBits(fIAuthTabCallback22) << 32)), defaultConstructorMarker), new AppLovinAdClickListener(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f), null), defaultConstructorMarker2);
                int i = asInterface + 73;
                IAuthTabCallbackDefault = i % 128;
                if (i % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public static final class onNavigationEvent extends onExtraCallbackWithResult {
            public static final onExtraCallback Companion = new onExtraCallback(null);
            private static final onNavigationEvent IAuthTabCallback;
            private static int IAuthTabCallbackDefault = 0;
            private static int IAuthTabCallbackStubProxy = 0;
            private static int asInterface = 1;
            private static int getInterfaceDescriptor = 1;
            private static final onNavigationEvent onExtraCallback;
            private static final onNavigationEvent onWarmupCompleted;
            private final toMetersPerSecond IAuthTabCallbackStub;
            private final long asBinder;
            private final float onExtraCallbackWithResult;
            private final onExtraCallback onNavigationEvent;
            private final float onTransact;

            public /* synthetic */ onNavigationEvent(float f, float f2, long j, onExtraCallback onextracallback, toMetersPerSecond tometerspersecond, DefaultConstructorMarker defaultConstructorMarker) {
                this(f, f2, j, onextracallback, tometerspersecond);
            }

            public static /* synthetic */ onNavigationEvent onWarmupCompleted(onNavigationEvent onnavigationevent, float f, float f2, long j, onExtraCallback onextracallback, toMetersPerSecond tometerspersecond, int i, Object obj) {
                int i2 = 2 % 2;
                if ((i & 1) != 0) {
                    int i3 = IAuthTabCallbackStubProxy + 101;
                    getInterfaceDescriptor = i3 % 128;
                    if (i3 % 2 == 0) {
                        float f3 = onnavigationevent.onTransact;
                        throw null;
                    }
                    f = onnavigationevent.onTransact;
                }
                float f4 = f;
                if ((i & 2) != 0) {
                    f2 = onnavigationevent.onExtraCallbackWithResult;
                }
                float f5 = f2;
                if ((i & 4) != 0) {
                    int i4 = IAuthTabCallbackStubProxy + 69;
                    getInterfaceDescriptor = i4 % 128;
                    int i5 = i4 % 2;
                    j = onnavigationevent.asBinder;
                }
                long j2 = j;
                if ((i & 8) != 0) {
                    onextracallback = onnavigationevent.onNavigationEvent;
                }
                onExtraCallback onextracallback2 = onextracallback;
                if ((i & 16) != 0) {
                    tometerspersecond = onnavigationevent.IAuthTabCallbackStub;
                }
                return onnavigationevent.onExtraCallbackWithResult(f4, f5, j2, onextracallback2, tometerspersecond);
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof onNavigationEvent)) {
                    int i2 = getInterfaceDescriptor + 31;
                    IAuthTabCallbackStubProxy = i2 % 128;
                    int i3 = i2 % 2;
                    return false;
                }
                onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
                if (!VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.onTransact, onnavigationevent.onTransact)) {
                    int i4 = IAuthTabCallbackStubProxy + 31;
                    getInterfaceDescriptor = i4 % 128;
                    return i4 % 2 == 0;
                }
                if ((!VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.onExtraCallbackWithResult, onnavigationevent.onExtraCallbackWithResult)) || !r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.onNavigationEvent(this.asBinder, onnavigationevent.asBinder)) {
                    return false;
                }
                if (!Intrinsics.areEqual(this.onNavigationEvent, onnavigationevent.onNavigationEvent)) {
                    int i5 = getInterfaceDescriptor + 67;
                    IAuthTabCallbackStubProxy = i5 % 128;
                    int i6 = i5 % 2;
                    return false;
                }
                if (Intrinsics.areEqual(this.IAuthTabCallbackStub, onnavigationevent.IAuthTabCallbackStub)) {
                    return true;
                }
                int i7 = getInterfaceDescriptor + 39;
                IAuthTabCallbackStubProxy = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStubProxy + 99;
                getInterfaceDescriptor = i2 % 128;
                int i3 = i2 % 2;
                int iOnWarmupCompleted = (((((((VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.onTransact) * 31) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.onExtraCallbackWithResult)) * 31) + r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.onExtraCallbackWithResult(this.asBinder)) * 31) + this.onNavigationEvent.hashCode()) * 31) + this.IAuthTabCallbackStub.hashCode();
                int i4 = getInterfaceDescriptor + 103;
                IAuthTabCallbackStubProxy = i4 % 128;
                if (i4 % 2 == 0) {
                    return iOnWarmupCompleted;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final onNavigationEvent onExtraCallbackWithResult(float f, float f2, long j, @NotNull onExtraCallback onextracallback, @NotNull toMetersPerSecond tometerspersecond) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(onextracallback, "");
                Intrinsics.checkNotNullParameter(tometerspersecond, "");
                onNavigationEvent onnavigationevent = new onNavigationEvent(f, f2, j, onextracallback, tometerspersecond, null);
                int i2 = getInterfaceDescriptor + 43;
                IAuthTabCallbackStubProxy = i2 % 128;
                int i3 = i2 % 2;
                return onnavigationevent;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Circle(width=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.onTransact) + ", height=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.onExtraCallbackWithResult) + ", overlapOffset=" + r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.asInterface(this.asBinder) + ", accSize=" + this.onNavigationEvent + ", shape=" + this.IAuthTabCallbackStub + ")";
                int i2 = getInterfaceDescriptor + 5;
                IAuthTabCallbackStubProxy = i2 % 128;
                if (i2 % 2 == 0) {
                    return str;
                }
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            private onNavigationEvent(float f, float f2, long j, onExtraCallback onextracallback, toMetersPerSecond tometerspersecond) {
                super(f, f2, j, onextracallback, tometerspersecond, null);
                Intrinsics.checkNotNullParameter(onextracallback, "");
                Intrinsics.checkNotNullParameter(tometerspersecond, "");
                this.onTransact = f;
                this.onExtraCallbackWithResult = f2;
                this.asBinder = j;
                this.onNavigationEvent = onextracallback;
                this.IAuthTabCallbackStub = tometerspersecond;
            }

            public static final /* synthetic */ onNavigationEvent IAuthTabCallbackStub() {
                int i = 2 % 2;
                int i2 = getInterfaceDescriptor + 97;
                IAuthTabCallbackStubProxy = i2 % 128;
                int i3 = i2 % 2;
                onNavigationEvent onnavigationevent = onExtraCallback;
                if (i3 != 0) {
                    int i4 = 82 / 0;
                }
                return onnavigationevent;
            }

            public static final /* synthetic */ onNavigationEvent asBinder() {
                int i = 2 % 2;
                int i2 = getInterfaceDescriptor + 73;
                int i3 = i2 % 128;
                IAuthTabCallbackStubProxy = i3;
                int i4 = i2 % 2;
                onNavigationEvent onnavigationevent = onWarmupCompleted;
                int i5 = i3 + 53;
                getInterfaceDescriptor = i5 % 128;
                int i6 = i5 % 2;
                return onnavigationevent;
            }

            public static final /* synthetic */ onNavigationEvent onTransact() {
                int i = 2 % 2;
                int i2 = getInterfaceDescriptor + 119;
                int i3 = i2 % 128;
                IAuthTabCallbackStubProxy = i3;
                if (i2 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                onNavigationEvent onnavigationevent = IAuthTabCallback;
                int i4 = i3 + 87;
                getInterfaceDescriptor = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 18 / 0;
                }
                return onnavigationevent;
            }

            @Override // o.getPrivacyDestinationUri.onExtraCallbackWithResult
            public float IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStubProxy + 19;
                int i3 = i2 % 128;
                getInterfaceDescriptor = i3;
                int i4 = i2 % 2;
                float f = this.onTransact;
                int i5 = i3 + 111;
                IAuthTabCallbackStubProxy = i5 % 128;
                int i6 = i5 % 2;
                return f;
            }

            @Override // o.getPrivacyDestinationUri.onExtraCallbackWithResult
            public float onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = getInterfaceDescriptor + 75;
                IAuthTabCallbackStubProxy = i2 % 128;
                int i3 = i2 % 2;
                float f = this.onExtraCallbackWithResult;
                if (i3 != 0) {
                    int i4 = 18 / 0;
                }
                return f;
            }

            @Override // o.getPrivacyDestinationUri.onExtraCallbackWithResult
            public long onExtraCallback() {
                int i = 2 % 2;
                int i2 = getInterfaceDescriptor;
                int i3 = i2 + 75;
                IAuthTabCallbackStubProxy = i3 % 128;
                int i4 = i3 % 2;
                long j = this.asBinder;
                int i5 = i2 + 5;
                IAuthTabCallbackStubProxy = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 90 / 0;
                }
                return j;
            }

            @Override // o.getPrivacyDestinationUri.onExtraCallbackWithResult
            public onExtraCallback onNavigationEvent() {
                int i = 2 % 2;
                int i2 = getInterfaceDescriptor + 9;
                int i3 = i2 % 128;
                IAuthTabCallbackStubProxy = i3;
                int i4 = i2 % 2;
                onExtraCallback onextracallback = this.onNavigationEvent;
                int i5 = i3 + 71;
                getInterfaceDescriptor = i5 % 128;
                int i6 = i5 % 2;
                return onextracallback;
            }

            @Override // o.getPrivacyDestinationUri.onExtraCallbackWithResult
            public toMetersPerSecond onWarmupCompleted() {
                toMetersPerSecond tometerspersecond;
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStubProxy;
                int i3 = i2 + 21;
                getInterfaceDescriptor = i3 % 128;
                if (i3 % 2 == 0) {
                    tometerspersecond = this.IAuthTabCallbackStub;
                    int i4 = 62 / 0;
                } else {
                    tometerspersecond = this.IAuthTabCallbackStub;
                }
                int i5 = i2 + 5;
                getInterfaceDescriptor = i5 % 128;
                if (i5 % 2 != 0) {
                    return tometerspersecond;
                }
                throw null;
            }

            public static final class onExtraCallback {
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private onExtraCallback() {
                }

                public final onNavigationEvent onNavigationEvent() {
                    onNavigationEvent onnavigationeventIAuthTabCallbackStub;
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 3;
                    onExtraCallback = i2 % 128;
                    if (i2 % 2 == 0) {
                        onnavigationeventIAuthTabCallbackStub = onNavigationEvent.IAuthTabCallbackStub();
                        int i3 = 1 / 0;
                    } else {
                        onnavigationeventIAuthTabCallbackStub = onNavigationEvent.IAuthTabCallbackStub();
                    }
                    int i4 = onExtraCallbackWithResult + 101;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        return onnavigationeventIAuthTabCallbackStub;
                    }
                    throw null;
                }

                public final onNavigationEvent onExtraCallbackWithResult() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 61;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    onNavigationEvent onnavigationeventAsBinder = onNavigationEvent.asBinder();
                    int i4 = onExtraCallback + 121;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 == 0) {
                        return onnavigationeventAsBinder;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public final onNavigationEvent IAuthTabCallback() {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 61;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    onNavigationEvent onnavigationeventOnTransact = onNavigationEvent.onTransact();
                    if (i3 != 0) {
                        int i4 = 89 / 0;
                    }
                    return onnavigationeventOnTransact;
                }
            }

            static {
                float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(60.0f);
                float fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(60.0f);
                float fIAuthTabCallback3 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f);
                float fIAuthTabCallback4 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f);
                long jOnExtraCallback = r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.onExtraCallback((Float.floatToRawIntBits(fIAuthTabCallback3) << 32) | (Float.floatToRawIntBits(fIAuthTabCallback4) & 4294967295L));
                float fIAuthTabCallback5 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f);
                float fIAuthTabCallback6 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f);
                float fIAuthTabCallback7 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f);
                DefaultConstructorMarker defaultConstructorMarker = null;
                DefaultConstructorMarker defaultConstructorMarker2 = null;
                onExtraCallback = new onNavigationEvent(fIAuthTabCallback, fIAuthTabCallback2, jOnExtraCallback, new onExtraCallback(fIAuthTabCallback5, fIAuthTabCallback6, r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.onExtraCallback((Float.floatToRawIntBits(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIAuthTabCallback7) << 32)), defaultConstructorMarker), RoundedCornerShapeKt.onWarmupCompleted(), defaultConstructorMarker2);
                float fIAuthTabCallback8 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(40.0f);
                float fIAuthTabCallback9 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(40.0f);
                float fIAuthTabCallback10 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(5.0f);
                float fIAuthTabCallback11 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(7.0f);
                long jOnExtraCallback2 = r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.onExtraCallback((Float.floatToRawIntBits(fIAuthTabCallback11) & 4294967295L) | (Float.floatToRawIntBits(fIAuthTabCallback10) << 32));
                float fIAuthTabCallback12 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f);
                float fIAuthTabCallback13 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f);
                float fIAuthTabCallback14 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f);
                float fIAuthTabCallback15 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f);
                onWarmupCompleted = new onNavigationEvent(fIAuthTabCallback8, fIAuthTabCallback9, jOnExtraCallback2, new onExtraCallback(fIAuthTabCallback12, fIAuthTabCallback13, r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.onExtraCallback((Float.floatToRawIntBits(fIAuthTabCallback15) & 4294967295L) | (Float.floatToRawIntBits(fIAuthTabCallback14) << 32)), defaultConstructorMarker), RoundedCornerShapeKt.onWarmupCompleted(), defaultConstructorMarker2);
                float fIAuthTabCallback16 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(32.0f);
                float fIAuthTabCallback17 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(32.0f);
                float fIAuthTabCallback18 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f);
                float fIAuthTabCallback19 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f);
                long jOnExtraCallback3 = r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.onExtraCallback((Float.floatToRawIntBits(fIAuthTabCallback18) << 32) | (Float.floatToRawIntBits(fIAuthTabCallback19) & 4294967295L));
                float fIAuthTabCallback20 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(14.0f);
                float fIAuthTabCallback21 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(14.0f);
                float fIAuthTabCallback22 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f);
                IAuthTabCallback = new onNavigationEvent(fIAuthTabCallback16, fIAuthTabCallback17, jOnExtraCallback3, new onExtraCallback(fIAuthTabCallback20, fIAuthTabCallback21, r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.onExtraCallback((Float.floatToRawIntBits(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIAuthTabCallback22) << 32)), defaultConstructorMarker), RoundedCornerShapeKt.onWarmupCompleted(), defaultConstructorMarker2);
                int i = asInterface + 117;
                IAuthTabCallbackDefault = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
            }
        }

        public static final class onTransact extends onExtraCallbackWithResult {
            public static final C0022onExtraCallbackWithResult Companion = new C0022onExtraCallbackWithResult(null);
            private static final onTransact IAuthTabCallback;
            private static int IAuthTabCallbackDefault = 0;
            private static int IAuthTabCallback_Parcel = 0;
            private static int access100 = 1;
            private static final onTransact onExtraCallbackWithResult;
            private static final onTransact onNavigationEvent;
            private static int onTransact = 1;
            private final float IAuthTabCallbackStub;
            private final long asBinder;
            private final toMetersPerSecond asInterface;
            private final float onExtraCallback;
            private final onExtraCallback onWarmupCompleted;

            public /* synthetic */ onTransact(float f, float f2, long j, onExtraCallback onextracallback, toMetersPerSecond tometerspersecond, DefaultConstructorMarker defaultConstructorMarker) {
                this(f, f2, j, onextracallback, tometerspersecond);
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof onTransact)) {
                    return false;
                }
                onTransact ontransact = (onTransact) obj;
                if (!VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.IAuthTabCallbackStub, ontransact.IAuthTabCallbackStub)) {
                    return false;
                }
                if (!VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.onExtraCallback, ontransact.onExtraCallback)) {
                    int i2 = IAuthTabCallback_Parcel + 51;
                    access100 = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i3 = 6 / 0;
                    }
                    return false;
                }
                if (r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.onNavigationEvent(this.asBinder, ontransact.asBinder)) {
                    if (Intrinsics.areEqual(this.onWarmupCompleted, ontransact.onWarmupCompleted)) {
                        return Intrinsics.areEqual(this.asInterface, ontransact.asInterface);
                    }
                    int i4 = IAuthTabCallback_Parcel + 71;
                    access100 = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 35 / 0;
                    }
                    return false;
                }
                int i6 = IAuthTabCallback_Parcel + 11;
                int i7 = i6 % 128;
                access100 = i7;
                int i8 = i6 % 2;
                int i9 = i7 + 111;
                IAuthTabCallback_Parcel = i9 % 128;
                if (i9 % 2 == 0) {
                    return false;
                }
                throw null;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback_Parcel + 45;
                access100 = i2 % 128;
                int i3 = i2 % 2;
                int iOnWarmupCompleted = (((((((VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.IAuthTabCallbackStub) * 31) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.onExtraCallback)) * 31) + r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.onExtraCallbackWithResult(this.asBinder)) * 31) + this.onWarmupCompleted.hashCode()) * 31) + this.asInterface.hashCode();
                int i4 = access100 + 9;
                IAuthTabCallback_Parcel = i4 % 128;
                if (i4 % 2 == 0) {
                    return iOnWarmupCompleted;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Squircle(width=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.IAuthTabCallbackStub) + ", height=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.onExtraCallback) + ", overlapOffset=" + r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.asInterface(this.asBinder) + ", accSize=" + this.onWarmupCompleted + ", shape=" + this.asInterface + ")";
                int i2 = access100 + 29;
                IAuthTabCallback_Parcel = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 79 / 0;
                }
                return str;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            private onTransact(float f, float f2, long j, onExtraCallback onextracallback, toMetersPerSecond tometerspersecond) {
                super(f, f2, j, onextracallback, tometerspersecond, null);
                Intrinsics.checkNotNullParameter(onextracallback, "");
                Intrinsics.checkNotNullParameter(tometerspersecond, "");
                this.IAuthTabCallbackStub = f;
                this.onExtraCallback = f2;
                this.asBinder = j;
                this.onWarmupCompleted = onextracallback;
                this.asInterface = tometerspersecond;
            }

            public static final /* synthetic */ onTransact IAuthTabCallbackDefault() {
                onTransact ontransact;
                int i = 2 % 2;
                int i2 = access100 + 89;
                int i3 = i2 % 128;
                IAuthTabCallback_Parcel = i3;
                if (i2 % 2 != 0) {
                    ontransact = onExtraCallbackWithResult;
                    int i4 = 78 / 0;
                } else {
                    ontransact = onExtraCallbackWithResult;
                }
                int i5 = i3 + 81;
                access100 = i5 % 128;
                int i6 = i5 % 2;
                return ontransact;
            }

            public static final /* synthetic */ onTransact IAuthTabCallbackStub() {
                int i = 2 % 2;
                int i2 = access100;
                int i3 = i2 + 27;
                IAuthTabCallback_Parcel = i3 % 128;
                int i4 = i3 % 2;
                onTransact ontransact = IAuthTabCallback;
                int i5 = i2 + 49;
                IAuthTabCallback_Parcel = i5 % 128;
                if (i5 % 2 == 0) {
                    return ontransact;
                }
                throw null;
            }

            public static final /* synthetic */ onTransact onTransact() {
                int i = 2 % 2;
                int i2 = access100 + 19;
                int i3 = i2 % 128;
                IAuthTabCallback_Parcel = i3;
                Object obj = null;
                if (i2 % 2 != 0) {
                    throw null;
                }
                onTransact ontransact = onNavigationEvent;
                int i4 = i3 + 7;
                access100 = i4 % 128;
                if (i4 % 2 != 0) {
                    return ontransact;
                }
                obj.hashCode();
                throw null;
            }

            @Override // o.getPrivacyDestinationUri.onExtraCallbackWithResult
            public float IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback_Parcel + 111;
                access100 = i2 % 128;
                if (i2 % 2 != 0) {
                    return this.IAuthTabCallbackStub;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // o.getPrivacyDestinationUri.onExtraCallbackWithResult
            public float onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = access100;
                int i3 = i2 + 19;
                IAuthTabCallback_Parcel = i3 % 128;
                int i4 = i3 % 2;
                float f = this.onExtraCallback;
                int i5 = i2 + 99;
                IAuthTabCallback_Parcel = i5 % 128;
                if (i5 % 2 == 0) {
                    return f;
                }
                throw null;
            }

            @Override // o.getPrivacyDestinationUri.onExtraCallbackWithResult
            public long onExtraCallback() {
                int i = 2 % 2;
                int i2 = access100;
                int i3 = i2 + 95;
                IAuthTabCallback_Parcel = i3 % 128;
                int i4 = i3 % 2;
                long j = this.asBinder;
                int i5 = i2 + 51;
                IAuthTabCallback_Parcel = i5 % 128;
                int i6 = i5 % 2;
                return j;
            }

            @Override // o.getPrivacyDestinationUri.onExtraCallbackWithResult
            public onExtraCallback onNavigationEvent() {
                int i = 2 % 2;
                int i2 = access100;
                int i3 = i2 + 31;
                IAuthTabCallback_Parcel = i3 % 128;
                int i4 = i3 % 2;
                onExtraCallback onextracallback = this.onWarmupCompleted;
                int i5 = i2 + 115;
                IAuthTabCallback_Parcel = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 17 / 0;
                }
                return onextracallback;
            }

            @Override // o.getPrivacyDestinationUri.onExtraCallbackWithResult
            public toMetersPerSecond onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback_Parcel + 105;
                access100 = i2 % 128;
                int i3 = i2 % 2;
                toMetersPerSecond tometerspersecond = this.asInterface;
                if (i3 == 0) {
                    int i4 = 43 / 0;
                }
                return tometerspersecond;
            }

            /* renamed from: o.getPrivacyDestinationUri$onExtraCallbackWithResult$onTransact$onExtraCallbackWithResult, reason: collision with other inner class name */
            public static final class C0022onExtraCallbackWithResult {
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public /* synthetic */ C0022onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private C0022onExtraCallbackWithResult() {
                }

                public final onTransact onWarmupCompleted() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 9;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    onTransact ontransactIAuthTabCallbackDefault = onTransact.IAuthTabCallbackDefault();
                    int i4 = onNavigationEvent + 17;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return ontransactIAuthTabCallbackDefault;
                }

                public final onTransact onExtraCallbackWithResult() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 79;
                    IAuthTabCallback = i2 % 128;
                    Object obj = null;
                    if (i2 % 2 != 0) {
                        onTransact.IAuthTabCallbackStub();
                        obj.hashCode();
                        throw null;
                    }
                    onTransact ontransactIAuthTabCallbackStub = onTransact.IAuthTabCallbackStub();
                    int i3 = onNavigationEvent + 45;
                    IAuthTabCallback = i3 % 128;
                    if (i3 % 2 == 0) {
                        return ontransactIAuthTabCallbackStub;
                    }
                    throw null;
                }

                public final onTransact IAuthTabCallback() {
                    onTransact onTransact;
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 69;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 == 0) {
                        onTransact = onTransact.onTransact();
                        int i3 = 41 / 0;
                    } else {
                        onTransact = onTransact.onTransact();
                    }
                    int i4 = IAuthTabCallback + 39;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    return onTransact;
                }
            }

            static {
                float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(36.0f);
                float fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(36.0f);
                float fIAuthTabCallback3 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f);
                float fIAuthTabCallback4 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f);
                long jOnExtraCallback = r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.onExtraCallback((Float.floatToRawIntBits(fIAuthTabCallback3) << 32) | (Float.floatToRawIntBits(fIAuthTabCallback4) & 4294967295L));
                float fIAuthTabCallback5 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f);
                float fIAuthTabCallback6 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f);
                float fIAuthTabCallback7 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f);
                float fIAuthTabCallback8 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f);
                DefaultConstructorMarker defaultConstructorMarker = null;
                DefaultConstructorMarker defaultConstructorMarker2 = null;
                onExtraCallbackWithResult = new onTransact(fIAuthTabCallback, fIAuthTabCallback2, jOnExtraCallback, new onExtraCallback(fIAuthTabCallback5, fIAuthTabCallback6, r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.onExtraCallback((Float.floatToRawIntBits(fIAuthTabCallback8) & 4294967295L) | (Float.floatToRawIntBits(fIAuthTabCallback7) << 32)), defaultConstructorMarker), AppLovinRtbRewardedRenderer.onWarmupCompleted(), defaultConstructorMarker2);
                float fIAuthTabCallback9 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(30.0f);
                float fIAuthTabCallback10 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(30.0f);
                float fIAuthTabCallback11 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(5.0f);
                float fIAuthTabCallback12 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(7.0f);
                long jOnExtraCallback2 = r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.onExtraCallback((Float.floatToRawIntBits(fIAuthTabCallback12) & 4294967295L) | (Float.floatToRawIntBits(fIAuthTabCallback11) << 32));
                float fIAuthTabCallback13 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f);
                float fIAuthTabCallback14 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f);
                float fIAuthTabCallback15 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f);
                float fIAuthTabCallback16 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f);
                IAuthTabCallback = new onTransact(fIAuthTabCallback9, fIAuthTabCallback10, jOnExtraCallback2, new onExtraCallback(fIAuthTabCallback13, fIAuthTabCallback14, r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.onExtraCallback((Float.floatToRawIntBits(fIAuthTabCallback16) & 4294967295L) | (Float.floatToRawIntBits(fIAuthTabCallback15) << 32)), defaultConstructorMarker), AppLovinRtbRewardedRenderer.onWarmupCompleted(), defaultConstructorMarker2);
                float fIAuthTabCallback17 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f);
                float fIAuthTabCallback18 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f);
                float fIAuthTabCallback19 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f);
                float fIAuthTabCallback20 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f);
                long jOnExtraCallback3 = r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.onExtraCallback((Float.floatToRawIntBits(fIAuthTabCallback20) & 4294967295L) | (Float.floatToRawIntBits(fIAuthTabCallback19) << 32));
                float fIAuthTabCallback21 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(14.0f);
                float fIAuthTabCallback22 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(14.0f);
                float fIAuthTabCallback23 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f);
                onNavigationEvent = new onTransact(fIAuthTabCallback17, fIAuthTabCallback18, jOnExtraCallback3, new onExtraCallback(fIAuthTabCallback21, fIAuthTabCallback22, r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.onExtraCallback((Float.floatToRawIntBits(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIAuthTabCallback23) << 32)), defaultConstructorMarker), AppLovinRtbRewardedRenderer.onWarmupCompleted(), defaultConstructorMarker2);
                int i = IAuthTabCallbackDefault + 87;
                onTransact = i % 128;
                if (i % 2 == 0) {
                    int i2 = 53 / 0;
                }
            }
        }

        /* renamed from: o.getPrivacyDestinationUri$onExtraCallbackWithResult$onExtraCallbackWithResult, reason: collision with other inner class name */
        public static final class C0021onExtraCallbackWithResult extends onExtraCallbackWithResult {
            public static final onExtraCallback Companion;
            private static final C0021onExtraCallbackWithResult IAuthTabCallback;
            private static final C0021onExtraCallbackWithResult IAuthTabCallbackDefault;
            private static final C0021onExtraCallbackWithResult IAuthTabCallbackStub;
            private static final C0021onExtraCallbackWithResult IAuthTabCallbackStubProxy;
            private static final C0021onExtraCallbackWithResult IAuthTabCallback_Parcel;
            private static int ICustomTabsCallback = 1;
            private static final C0021onExtraCallbackWithResult access000;
            private static final C0021onExtraCallbackWithResult access100;
            private static final C0021onExtraCallbackWithResult asBinder;
            private static final C0021onExtraCallbackWithResult asInterface;
            private static int extraCallback = 0;
            private static final C0021onExtraCallbackWithResult onExtraCallback;
            private static final C0021onExtraCallbackWithResult onExtraCallbackWithResult;
            private static int onMinimized = 1;
            private static final C0021onExtraCallbackWithResult onNavigationEvent;
            private static final C0021onExtraCallbackWithResult onTransact;
            private static final C0021onExtraCallbackWithResult onWarmupCompleted;
            private static int writeTypedObject;
            private final toMetersPerSecond extraCallbackWithResult;
            private final float getInterfaceDescriptor;
            private final float readTypedObject;

            public /* synthetic */ C0021onExtraCallbackWithResult(float f, float f2, toMetersPerSecond tometerspersecond, DefaultConstructorMarker defaultConstructorMarker) {
                this(f, f2, tometerspersecond);
            }

            public /* synthetic */ C0021onExtraCallbackWithResult(float f, toMetersPerSecond tometerspersecond, DefaultConstructorMarker defaultConstructorMarker) {
                this(f, tometerspersecond);
            }

            public static /* synthetic */ Object onNavigationEvent(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
                int i7 = ~i2;
                int i8 = ~i3;
                int i9 = (~(i7 | i8)) | (~(i7 | i6)) | (~(i8 | i6));
                int i10 = ~(i3 | i7);
                int i11 = i6 | i10 | (~(i8 | i2));
                int i12 = i6 + i2 + i + (1997535707 * i4) + (1930545336 * i5);
                int i13 = i12 * i12;
                int i14 = ((-1352905585) * i6) + 1468203008 + ((-417352845) * i2) + (i9 * 1679707278) + (1679707278 * i10) + ((-1679707278) * i11) + (1262354432 * i) + ((-1408630784) * i4) + ((-2070937600) * i5) + (392888320 * i13);
                int i15 = (i6 * (-2054695253)) + 138751921 + (i2 * (-2054693473)) + (i9 * (-890)) + (i10 * (-890)) + (i11 * 890) + (i * (-2054694363)) + (i4 * 1502648999) + (i5 * 931574424) + (i13 * (-2139684864));
                return i14 + ((i15 * i15) * (-174260224)) != 1 ? onWarmupCompleted(objArr) : onNavigationEvent(objArr);
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0021onExtraCallbackWithResult)) {
                    return false;
                }
                C0021onExtraCallbackWithResult c0021onExtraCallbackWithResult = (C0021onExtraCallbackWithResult) obj;
                if (!VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.readTypedObject, c0021onExtraCallbackWithResult.readTypedObject)) {
                    int i2 = onMinimized + 73;
                    writeTypedObject = i2 % 128;
                    return i2 % 2 != 0;
                }
                if (VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.getInterfaceDescriptor, c0021onExtraCallbackWithResult.getInterfaceDescriptor)) {
                    if (Intrinsics.areEqual(this.extraCallbackWithResult, c0021onExtraCallbackWithResult.extraCallbackWithResult)) {
                        return true;
                    }
                    int i3 = onMinimized + 107;
                    writeTypedObject = i3 % 128;
                    return i3 % 2 != 0;
                }
                int i4 = writeTypedObject;
                int i5 = i4 + 31;
                onMinimized = i5 % 128;
                int i6 = i5 % 2;
                int i7 = i4 + 69;
                onMinimized = i7 % 128;
                if (i7 % 2 != 0) {
                    return false;
                }
                throw null;
            }

            public int hashCode() {
                int iOnWarmupCompleted;
                toMetersPerSecond tometerspersecond;
                int i = 2 % 2;
                int i2 = onMinimized + 123;
                writeTypedObject = i2 % 128;
                if (i2 % 2 != 0) {
                    iOnWarmupCompleted = ((VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.readTypedObject) >>> 99) - VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.getInterfaceDescriptor)) + 27;
                    tometerspersecond = this.extraCallbackWithResult;
                } else {
                    iOnWarmupCompleted = ((VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.readTypedObject) * 31) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.getInterfaceDescriptor)) * 31;
                    tometerspersecond = this.extraCallbackWithResult;
                }
                int iHashCode = iOnWarmupCompleted + tometerspersecond.hashCode();
                int i3 = writeTypedObject + 25;
                onMinimized = i3 % 128;
                int i4 = i3 % 2;
                return iHashCode;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Clean(width=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.readTypedObject) + ", height=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.getInterfaceDescriptor) + ", shape=" + this.extraCallbackWithResult + ")";
                int i2 = writeTypedObject + 3;
                onMinimized = i2 % 128;
                if (i2 % 2 != 0) {
                    return str;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static final /* synthetic */ C0021onExtraCallbackWithResult IAuthTabCallbackDefault() {
                C0021onExtraCallbackWithResult c0021onExtraCallbackWithResult;
                int i = 2 % 2;
                int i2 = writeTypedObject + 91;
                int i3 = i2 % 128;
                onMinimized = i3;
                if (i2 % 2 == 0) {
                    c0021onExtraCallbackWithResult = onTransact;
                    int i4 = 84 / 0;
                } else {
                    c0021onExtraCallbackWithResult = onTransact;
                }
                int i5 = i3 + 75;
                writeTypedObject = i5 % 128;
                if (i5 % 2 == 0) {
                    return c0021onExtraCallbackWithResult;
                }
                throw null;
            }

            public static final /* synthetic */ C0021onExtraCallbackWithResult IAuthTabCallbackStub() {
                int i = 2 % 2;
                int i2 = writeTypedObject + 77;
                int i3 = i2 % 128;
                onMinimized = i3;
                int i4 = i2 % 2;
                C0021onExtraCallbackWithResult c0021onExtraCallbackWithResult = onExtraCallback;
                int i5 = i3 + 23;
                writeTypedObject = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 32 / 0;
                }
                return c0021onExtraCallbackWithResult;
            }

            public static final /* synthetic */ C0021onExtraCallbackWithResult IAuthTabCallbackStubProxy() {
                int i = 2 % 2;
                int i2 = writeTypedObject;
                int i3 = i2 + 77;
                onMinimized = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                C0021onExtraCallbackWithResult c0021onExtraCallbackWithResult = access100;
                int i4 = i2 + 59;
                onMinimized = i4 % 128;
                if (i4 % 2 != 0) {
                    return c0021onExtraCallbackWithResult;
                }
                obj.hashCode();
                throw null;
            }

            public static final /* synthetic */ C0021onExtraCallbackWithResult IAuthTabCallback_Parcel() {
                int i = 2 % 2;
                int i2 = onMinimized + 51;
                int i3 = i2 % 128;
                writeTypedObject = i3;
                int i4 = i2 % 2;
                C0021onExtraCallbackWithResult c0021onExtraCallbackWithResult = access000;
                int i5 = i3 + 89;
                onMinimized = i5 % 128;
                int i6 = i5 % 2;
                return c0021onExtraCallbackWithResult;
            }

            public static final /* synthetic */ C0021onExtraCallbackWithResult access100() {
                C0021onExtraCallbackWithResult c0021onExtraCallbackWithResult;
                int i = 2 % 2;
                int i2 = writeTypedObject;
                int i3 = i2 + 63;
                onMinimized = i3 % 128;
                if (i3 % 2 == 0) {
                    c0021onExtraCallbackWithResult = asBinder;
                    int i4 = 55 / 0;
                } else {
                    c0021onExtraCallbackWithResult = asBinder;
                }
                int i5 = i2 + 119;
                onMinimized = i5 % 128;
                int i6 = i5 % 2;
                return c0021onExtraCallbackWithResult;
            }

            public static final /* synthetic */ C0021onExtraCallbackWithResult asBinder() {
                int i = 2 % 2;
                int i2 = writeTypedObject + 25;
                int i3 = i2 % 128;
                onMinimized = i3;
                int i4 = i2 % 2;
                C0021onExtraCallbackWithResult c0021onExtraCallbackWithResult = IAuthTabCallbackDefault;
                int i5 = i3 + 65;
                writeTypedObject = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 23 / 0;
                }
                return c0021onExtraCallbackWithResult;
            }

            public static final /* synthetic */ C0021onExtraCallbackWithResult getInterfaceDescriptor() {
                int i = 2 % 2;
                int i2 = writeTypedObject;
                int i3 = i2 + 11;
                onMinimized = i3 % 128;
                int i4 = i3 % 2;
                C0021onExtraCallbackWithResult c0021onExtraCallbackWithResult = IAuthTabCallbackStub;
                int i5 = i2 + 95;
                onMinimized = i5 % 128;
                int i6 = i5 % 2;
                return c0021onExtraCallbackWithResult;
            }

            private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
                int i = 2 % 2;
                int i2 = writeTypedObject;
                int i3 = i2 + 53;
                onMinimized = i3 % 128;
                int i4 = i3 % 2;
                C0021onExtraCallbackWithResult c0021onExtraCallbackWithResult = asInterface;
                int i5 = i2 + 39;
                onMinimized = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 40 / 0;
                }
                return c0021onExtraCallbackWithResult;
            }

            public static final /* synthetic */ C0021onExtraCallbackWithResult onTransact() {
                int i = 2 % 2;
                int i2 = writeTypedObject;
                int i3 = i2 + 69;
                onMinimized = i3 % 128;
                int i4 = i3 % 2;
                C0021onExtraCallbackWithResult c0021onExtraCallbackWithResult = IAuthTabCallback;
                int i5 = i2 + 59;
                onMinimized = i5 % 128;
                int i6 = i5 % 2;
                return c0021onExtraCallbackWithResult;
            }

            private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
                int i = 2 % 2;
                int i2 = writeTypedObject;
                int i3 = i2 + 21;
                onMinimized = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                C0021onExtraCallbackWithResult c0021onExtraCallbackWithResult = IAuthTabCallback_Parcel;
                int i4 = i2 + 49;
                onMinimized = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 49 / 0;
                }
                return c0021onExtraCallbackWithResult;
            }

            public static final /* synthetic */ C0021onExtraCallbackWithResult writeTypedObject() {
                int i = 2 % 2;
                int i2 = onMinimized + 51;
                int i3 = i2 % 128;
                writeTypedObject = i3;
                int i4 = i2 % 2;
                C0021onExtraCallbackWithResult c0021onExtraCallbackWithResult = IAuthTabCallbackStubProxy;
                int i5 = i3 + 103;
                onMinimized = i5 % 128;
                if (i5 % 2 != 0) {
                    return c0021onExtraCallbackWithResult;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // o.getPrivacyDestinationUri.onExtraCallbackWithResult
            public float IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = writeTypedObject + 73;
                int i3 = i2 % 128;
                onMinimized = i3;
                int i4 = i2 % 2;
                float f = this.readTypedObject;
                int i5 = i3 + 57;
                writeTypedObject = i5 % 128;
                if (i5 % 2 == 0) {
                    return f;
                }
                throw null;
            }

            @Override // o.getPrivacyDestinationUri.onExtraCallbackWithResult
            public float onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = writeTypedObject + 117;
                int i3 = i2 % 128;
                onMinimized = i3;
                if (i2 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                float f = this.getInterfaceDescriptor;
                int i4 = i3 + 45;
                writeTypedObject = i4 % 128;
                int i5 = i4 % 2;
                return f;
            }

            @Override // o.getPrivacyDestinationUri.onExtraCallbackWithResult
            public toMetersPerSecond onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = writeTypedObject + 97;
                int i3 = i2 % 128;
                onMinimized = i3;
                int i4 = i2 % 2;
                toMetersPerSecond tometerspersecond = this.extraCallbackWithResult;
                int i5 = i3 + 67;
                writeTypedObject = i5 % 128;
                int i6 = i5 % 2;
                return tometerspersecond;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            private C0021onExtraCallbackWithResult(float f, float f2, toMetersPerSecond tometerspersecond) {
                super(f, f2, r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.Companion.onWarmupCompleted(), onExtraCallback.Companion.IAuthTabCallback(), tometerspersecond, null);
                Intrinsics.checkNotNullParameter(tometerspersecond, "");
                this.readTypedObject = f;
                this.getInterfaceDescriptor = f2;
                this.extraCallbackWithResult = tometerspersecond;
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            private C0021onExtraCallbackWithResult(float f, toMetersPerSecond tometerspersecond) {
                this(f, f, tometerspersecond, null);
                Intrinsics.checkNotNullParameter(tometerspersecond, "");
            }

            /* renamed from: o.getPrivacyDestinationUri$onExtraCallbackWithResult$onExtraCallbackWithResult$onExtraCallback */
            public static final class onExtraCallback {
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
                    int i7 = ~((~i6) | i3 | i4);
                    int i8 = ~((~i3) | i6);
                    int i9 = ~i4;
                    int i10 = i8 | (~(i9 | i6));
                    int i11 = ~(i9 | i3);
                    int i12 = i6 + i3 + i2 + ((-1568348280) * i5) + (1617068012 * i);
                    int i13 = i12 * i12;
                    int i14 = (((-430874860) * i6) - 739508224) + (1544986862 * i3) + (i7 * 987930861) + ((-987930861) * i10) + (987930861 * i11) + (557056000 * i2) + ((-1885339648) * i5) + (1743781888 * i) + (858456064 * i13);
                    int i15 = (i6 * (-973781596)) + 539565670 + (i3 * (-973779706)) + (i7 * 945) + (i10 * (-945)) + (i11 * 945) + (i2 * (-973780651)) + (i5 * 424585256) + (i * 537576796) + (i13 * 1078394880);
                    return i14 + ((i15 * i15) * 192741376) != 1 ? onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr);
                }

                private onExtraCallback() {
                }

                public final C0021onExtraCallbackWithResult asInterface() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 17;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    C0021onExtraCallbackWithResult c0021onExtraCallbackWithResultAccess100 = C0021onExtraCallbackWithResult.access100();
                    int i4 = IAuthTabCallback + 31;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    return c0021onExtraCallbackWithResultAccess100;
                }

                public final C0021onExtraCallbackWithResult onExtraCallbackWithResult() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 105;
                    IAuthTabCallback = i2 % 128;
                    if (i2 % 2 == 0) {
                        return C0021onExtraCallbackWithResult.IAuthTabCallbackDefault();
                    }
                    C0021onExtraCallbackWithResult.IAuthTabCallbackDefault();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public final C0021onExtraCallbackWithResult IAuthTabCallback() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 83;
                    IAuthTabCallback = i2 % 128;
                    if (i2 % 2 == 0) {
                        return C0021onExtraCallbackWithResult.IAuthTabCallbackStub();
                    }
                    C0021onExtraCallbackWithResult.IAuthTabCallbackStub();
                    throw null;
                }

                public final C0021onExtraCallbackWithResult onWarmupCompleted() {
                    C0021onExtraCallbackWithResult c0021onExtraCallbackWithResultOnTransact;
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 73;
                    IAuthTabCallback = i2 % 128;
                    if (i2 % 2 != 0) {
                        c0021onExtraCallbackWithResultOnTransact = C0021onExtraCallbackWithResult.onTransact();
                        int i3 = 95 / 0;
                    } else {
                        c0021onExtraCallbackWithResultOnTransact = C0021onExtraCallbackWithResult.onTransact();
                    }
                    int i4 = onWarmupCompleted + 125;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return c0021onExtraCallbackWithResultOnTransact;
                }

                private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 3;
                    onWarmupCompleted = i2 % 128;
                    if (i2 % 2 != 0) {
                        return C0021onExtraCallbackWithResult.writeTypedObject();
                    }
                    C0021onExtraCallbackWithResult.writeTypedObject();
                    throw null;
                }

                public final C0021onExtraCallbackWithResult IAuthTabCallbackDefault() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 21;
                    onWarmupCompleted = i2 % 128;
                    if (i2 % 2 != 0) {
                        int iOnExtraCallbackWithResult = com.applovin.mediation.nativeAds.MaxNativeAdListener.onExtraCallbackWithResult();
                        return (C0021onExtraCallbackWithResult) C0021onExtraCallbackWithResult.onNavigationEvent(com.applovin.mediation.nativeAds.MaxNativeAdListener.onExtraCallbackWithResult(), 1783328639, new Object[0], iOnExtraCallbackWithResult, com.applovin.mediation.nativeAds.MaxNativeAdListener.onExtraCallbackWithResult(), com.applovin.mediation.nativeAds.MaxNativeAdListener.onExtraCallbackWithResult(), -1783328639);
                    }
                    int iOnExtraCallbackWithResult2 = com.applovin.mediation.nativeAds.MaxNativeAdListener.onExtraCallbackWithResult();
                    int i3 = 48 / 0;
                    return (C0021onExtraCallbackWithResult) C0021onExtraCallbackWithResult.onNavigationEvent(com.applovin.mediation.nativeAds.MaxNativeAdListener.onExtraCallbackWithResult(), 1783328639, new Object[0], iOnExtraCallbackWithResult2, com.applovin.mediation.nativeAds.MaxNativeAdListener.onExtraCallbackWithResult(), com.applovin.mediation.nativeAds.MaxNativeAdListener.onExtraCallbackWithResult(), -1783328639);
                }

                public final C0021onExtraCallbackWithResult IAuthTabCallbackStub() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 57;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    C0021onExtraCallbackWithResult c0021onExtraCallbackWithResultIAuthTabCallback_Parcel = C0021onExtraCallbackWithResult.IAuthTabCallback_Parcel();
                    int i4 = IAuthTabCallback + 27;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 != 0) {
                        return c0021onExtraCallbackWithResultIAuthTabCallback_Parcel;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 101;
                    onWarmupCompleted = i2 % 128;
                    if (i2 % 2 == 0) {
                        C0021onExtraCallbackWithResult.IAuthTabCallbackStubProxy();
                        throw null;
                    }
                    C0021onExtraCallbackWithResult c0021onExtraCallbackWithResultIAuthTabCallbackStubProxy = C0021onExtraCallbackWithResult.IAuthTabCallbackStubProxy();
                    int i3 = IAuthTabCallback + 107;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    return c0021onExtraCallbackWithResultIAuthTabCallbackStubProxy;
                }

                public final C0021onExtraCallbackWithResult onTransact() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 101;
                    IAuthTabCallback = i2 % 128;
                    if (i2 % 2 != 0) {
                        C0021onExtraCallbackWithResult.getInterfaceDescriptor();
                        throw null;
                    }
                    C0021onExtraCallbackWithResult interfaceDescriptor = C0021onExtraCallbackWithResult.getInterfaceDescriptor();
                    int i3 = IAuthTabCallback + 1;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    return interfaceDescriptor;
                }

                public final C0021onExtraCallbackWithResult onExtraCallback() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 29;
                    IAuthTabCallback = i2 % 128;
                    if (i2 % 2 == 0) {
                        int iOnExtraCallbackWithResult = com.applovin.mediation.nativeAds.MaxNativeAdListener.onExtraCallbackWithResult();
                        return (C0021onExtraCallbackWithResult) C0021onExtraCallbackWithResult.onNavigationEvent(com.applovin.mediation.nativeAds.MaxNativeAdListener.onExtraCallbackWithResult(), 2074749522, new Object[0], iOnExtraCallbackWithResult, com.applovin.mediation.nativeAds.MaxNativeAdListener.onExtraCallbackWithResult(), com.applovin.mediation.nativeAds.MaxNativeAdListener.onExtraCallbackWithResult(), -2074749521);
                    }
                    int iOnExtraCallbackWithResult2 = com.applovin.mediation.nativeAds.MaxNativeAdListener.onExtraCallbackWithResult();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public final C0021onExtraCallbackWithResult onNavigationEvent() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 9;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    C0021onExtraCallbackWithResult c0021onExtraCallbackWithResultAsBinder = C0021onExtraCallbackWithResult.asBinder();
                    int i4 = IAuthTabCallback + 9;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 != 0) {
                        return c0021onExtraCallbackWithResultAsBinder;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public final C0021onExtraCallbackWithResult onExtraCallbackWithResult(float f) {
                    int i = 2 % 2;
                    C0021onExtraCallbackWithResult c0021onExtraCallbackWithResult = new C0021onExtraCallbackWithResult(f, VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback(), RectangleShapeKt.onExtraCallback(), null);
                    int i2 = IAuthTabCallback + 37;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    return c0021onExtraCallbackWithResult;
                }

                public final C0021onExtraCallbackWithResult IAuthTabCallback(float f) {
                    int i = 2 % 2;
                    C0021onExtraCallbackWithResult c0021onExtraCallbackWithResult = new C0021onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback(), f, RectangleShapeKt.onExtraCallback(), null);
                    int i2 = IAuthTabCallback + 27;
                    onWarmupCompleted = i2 % 128;
                    if (i2 % 2 != 0) {
                        return c0021onExtraCallbackWithResult;
                    }
                    throw null;
                }

                public final C0021onExtraCallbackWithResult asBinder() {
                    int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
                    int iOnWarmupCompleted2 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
                    int iOnWarmupCompleted3 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
                    return (C0021onExtraCallbackWithResult) onNavigationEvent(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), iOnWarmupCompleted2, -1911429714, new Object[]{this}, iOnWarmupCompleted, iOnWarmupCompleted3, 1911429715);
                }

                public final C0021onExtraCallbackWithResult access100() {
                    int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
                    int iOnWarmupCompleted2 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
                    int iOnWarmupCompleted3 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
                    return (C0021onExtraCallbackWithResult) onNavigationEvent(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), iOnWarmupCompleted2, 1267506620, new Object[]{this}, iOnWarmupCompleted, iOnWarmupCompleted3, -1267506620);
                }
            }

            static {
                DefaultConstructorMarker defaultConstructorMarker = null;
                onExtraCallback onextracallback = new onExtraCallback(defaultConstructorMarker);
                Companion = onextracallback;
                ApplovinAdapter1 applovinAdapter1 = ApplovinAdapter1.onWarmupCompleted;
                int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
                int iOnWarmupCompleted2 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
                int iOnWarmupCompleted3 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
                onWarmupCompleted = onextracallback.IAuthTabCallback(((Float) ApplovinAdapter1.onExtraCallbackWithResult(iOnWarmupCompleted, 1167401568, -1167401563, iOnWarmupCompleted2, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), new Object[]{applovinAdapter1}, iOnWarmupCompleted3)).floatValue());
                onExtraCallbackWithResult = onextracallback.IAuthTabCallback(applovinAdapter1.IAuthTabCallback());
                onNavigationEvent = onextracallback.IAuthTabCallback(applovinAdapter1.onNavigationEvent());
                asBinder = onextracallback.onExtraCallbackWithResult(applovinAdapter1.newSession());
                onTransact = onextracallback.onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(200.0f));
                onExtraCallback = onextracallback.onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(120.0f));
                IAuthTabCallback = onextracallback.onExtraCallbackWithResult(applovinAdapter1.isEngagementSignalsApiAvailable());
                IAuthTabCallbackStubProxy = onextracallback.onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(80.0f));
                IAuthTabCallback_Parcel = onextracallback.onExtraCallbackWithResult(applovinAdapter1.extraCommand());
                access000 = onextracallback.onExtraCallbackWithResult(applovinAdapter1.ICustomTabsCallback_Parcel());
                access100 = onextracallback.onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(32.0f));
                IAuthTabCallbackStub = onextracallback.onExtraCallbackWithResult(applovinAdapter1.ICustomTabsService());
                asInterface = onextracallback.onExtraCallbackWithResult(applovinAdapter1.mayLaunchUrl());
                IAuthTabCallbackDefault = onextracallback.onExtraCallbackWithResult(applovinAdapter1.postMessage());
                int i = ICustomTabsCallback + 61;
                extraCallback = i % 128;
                if (i % 2 == 0) {
                    return;
                }
                defaultConstructorMarker.hashCode();
                throw null;
            }

            public static final /* synthetic */ C0021onExtraCallbackWithResult asInterface() {
                int iOnExtraCallbackWithResult = com.applovin.mediation.nativeAds.MaxNativeAdListener.onExtraCallbackWithResult();
                return (C0021onExtraCallbackWithResult) onNavigationEvent(com.applovin.mediation.nativeAds.MaxNativeAdListener.onExtraCallbackWithResult(), 2074749522, new Object[0], iOnExtraCallbackWithResult, com.applovin.mediation.nativeAds.MaxNativeAdListener.onExtraCallbackWithResult(), com.applovin.mediation.nativeAds.MaxNativeAdListener.onExtraCallbackWithResult(), -2074749521);
            }

            public static final /* synthetic */ C0021onExtraCallbackWithResult access000() {
                int iOnExtraCallbackWithResult = com.applovin.mediation.nativeAds.MaxNativeAdListener.onExtraCallbackWithResult();
                return (C0021onExtraCallbackWithResult) onNavigationEvent(com.applovin.mediation.nativeAds.MaxNativeAdListener.onExtraCallbackWithResult(), 1783328639, new Object[0], iOnExtraCallbackWithResult, com.applovin.mediation.nativeAds.MaxNativeAdListener.onExtraCallbackWithResult(), com.applovin.mediation.nativeAds.MaxNativeAdListener.onExtraCallbackWithResult(), -1783328639);
            }
        }
    }

    public static final class onExtraCallback {
        public static final onNavigationEvent Companion = new onNavigationEvent(null);
        private static int IAuthTabCallback = 0;
        private static int IAuthTabCallbackStub = 1;
        private static int asBinder = 1;
        private static int asInterface;
        private static final onExtraCallback onNavigationEvent;
        private final float onExtraCallback;
        private final long onExtraCallbackWithResult;
        private final float onWarmupCompleted;

        public /* synthetic */ onExtraCallback(float f, float f2, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(f, f2, j);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
        
            if ((r8 instanceof o.getPrivacyDestinationUri.onExtraCallback) != false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        
            r1 = r1 + 21;
            o.getPrivacyDestinationUri.onExtraCallback.asInterface = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        
            r8 = (o.getPrivacyDestinationUri.onExtraCallback) r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
        
            if (o.VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(r7.onExtraCallback, r8.onExtraCallback) != false) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
        
            if ((!o.VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(r7.onWarmupCompleted, r8.onWarmupCompleted)) == true) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
        
            if (o.r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.onNavigationEvent(r7.onExtraCallbackWithResult, r8.onExtraCallbackWithResult) != false) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
        
            r8 = o.getPrivacyDestinationUri.onExtraCallback.IAuthTabCallbackStub + 115;
            o.getPrivacyDestinationUri.onExtraCallback.asInterface = r8 % 128;
            r8 = r8 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
        
            r8 = o.getPrivacyDestinationUri.onExtraCallback.IAuthTabCallbackStub + 97;
            o.getPrivacyDestinationUri.onExtraCallback.asInterface = r8 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
        
            if ((r8 % 2) != 0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r7 == r8) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r7 == r8) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 37;
            asInterface = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 68 / 0;
            }
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = asInterface + 27;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            int iOnWarmupCompleted = (((VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.onExtraCallback) * 31) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.onWarmupCompleted)) * 31) + r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.onExtraCallbackWithResult(this.onExtraCallbackWithResult);
            int i4 = IAuthTabCallbackStub + 13;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return iOnWarmupCompleted;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "AccSize(width=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.onExtraCallback) + ", height=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.onWarmupCompleted) + ", offset=" + r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.asInterface(this.onExtraCallbackWithResult) + ")";
            int i2 = asInterface + 45;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 40 / 0;
            }
            return str;
        }

        private onExtraCallback(float f, float f2, long j) {
            this.onExtraCallback = f;
            this.onWarmupCompleted = f2;
            this.onExtraCallbackWithResult = j;
        }

        public static final /* synthetic */ onExtraCallback onExtraCallback() {
            int i = 2 % 2;
            int i2 = asInterface + 115;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            int i4 = i2 % 2;
            onExtraCallback onextracallback = onNavigationEvent;
            int i5 = i3 + 125;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return onextracallback;
        }

        public final float onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = asInterface + 69;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final float IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 55;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            float f = this.onWarmupCompleted;
            if (i3 != 0) {
                int i4 = 68 / 0;
            }
            return f;
        }

        public final long onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = asInterface + 125;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onExtraCallbackWithResult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final class onNavigationEvent {
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private onNavigationEvent() {
            }

            public final onExtraCallback IAuthTabCallback() {
                onExtraCallback onExtraCallback2;
                int i = 2 % 2;
                int i2 = onExtraCallback + 49;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    onExtraCallback2 = onExtraCallback.onExtraCallback();
                    int i3 = 77 / 0;
                } else {
                    onExtraCallback2 = onExtraCallback.onExtraCallback();
                }
                int i4 = onExtraCallback + 25;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return onExtraCallback2;
            }
        }

        static {
            VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult onextracallbackwithresult = VirtualCameraControlExternalSyntheticLambda1.Companion;
            onNavigationEvent = new onExtraCallback(onextracallbackwithresult.onExtraCallback(), onextracallbackwithresult.onExtraCallback(), r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.Companion.onWarmupCompleted(), null);
            int i = asBinder + 85;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }
    }
}
