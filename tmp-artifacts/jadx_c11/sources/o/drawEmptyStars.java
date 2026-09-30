package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface drawEmptyStars {

    public static final class onWarmupCompleted {
        public static final IAuthTabCallback Companion;
        private static int IAuthTabCallbackDefault = 0;
        private static int IAuthTabCallbackStub = 1;
        private static int asBinder = 1;
        private static int asInterface;
        private static final onWarmupCompleted onExtraCallback;
        private static final onWarmupCompleted onExtraCallbackWithResult;
        private static final onWarmupCompleted onNavigationEvent;
        private final float IAuthTabCallback;
        private final float onWarmupCompleted;

        public /* synthetic */ onWarmupCompleted(float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
            this(f, f2);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = asInterface + 125;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                return false;
            }
            if (!VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.IAuthTabCallback, ((onWarmupCompleted) obj).IAuthTabCallback)) {
                return false;
            }
            if (!VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.onWarmupCompleted, r6.onWarmupCompleted)) {
                int i4 = IAuthTabCallbackStub + 121;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            int i6 = IAuthTabCallbackStub + 17;
            asInterface = i6 % 128;
            if (i6 % 2 == 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 29;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            int iOnWarmupCompleted = (VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.IAuthTabCallback) * 31) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.onWarmupCompleted);
            int i4 = IAuthTabCallbackStub + 47;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return iOnWarmupCompleted;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Size(size=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.IAuthTabCallback) + ", strokeSize=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.onWarmupCompleted) + ")";
            int i2 = asInterface + 107;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 19 / 0;
            }
            return str;
        }

        private onWarmupCompleted(float f, float f2) {
            this.IAuthTabCallback = f;
            this.onWarmupCompleted = f2;
        }

        public static final /* synthetic */ onWarmupCompleted onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 65;
            asInterface = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            onWarmupCompleted onwarmupcompleted = onExtraCallbackWithResult;
            int i4 = i2 + 1;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompleted;
        }

        public static final /* synthetic */ onWarmupCompleted onNavigationEvent() {
            int i = 2 % 2;
            int i2 = asInterface;
            int i3 = i2 + 1;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            onWarmupCompleted onwarmupcompleted = onNavigationEvent;
            int i5 = i2 + 125;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return onwarmupcompleted;
        }

        public static final /* synthetic */ onWarmupCompleted onWarmupCompleted() {
            onWarmupCompleted onwarmupcompleted;
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 125;
            int i3 = i2 % 128;
            asInterface = i3;
            if (i2 % 2 != 0) {
                onwarmupcompleted = onExtraCallback;
                int i4 = 42 / 0;
            } else {
                onwarmupcompleted = onExtraCallback;
            }
            int i5 = i3 + 9;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 16 / 0;
            }
            return onwarmupcompleted;
        }

        public final float IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = asInterface + 105;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            float f = this.IAuthTabCallback;
            int i4 = i3 + 99;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return f;
        }

        public final float onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 73;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onWarmupCompleted;
            }
            throw null;
        }

        public static final class IAuthTabCallback {
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private IAuthTabCallback() {
            }

            public final onWarmupCompleted onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 35;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                onWarmupCompleted onwarmupcompletedOnNavigationEvent = onWarmupCompleted.onNavigationEvent();
                int i4 = onWarmupCompleted + 17;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return onwarmupcompletedOnNavigationEvent;
                }
                throw null;
            }

            public final onWarmupCompleted IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 5;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult = onWarmupCompleted.onExtraCallbackWithResult();
                int i4 = onWarmupCompleted + 89;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return onwarmupcompletedOnExtraCallbackWithResult;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final onWarmupCompleted onExtraCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 105;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    return onWarmupCompleted.onWarmupCompleted();
                }
                onWarmupCompleted.onWarmupCompleted();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new IAuthTabCallback(defaultConstructorMarker);
            onNavigationEvent = new onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(28.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f), defaultConstructorMarker);
            onExtraCallbackWithResult = new onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(40.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(3.0f), defaultConstructorMarker);
            onExtraCallback = new onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(52.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(5.0f), defaultConstructorMarker);
            int i = IAuthTabCallbackDefault + 95;
            asBinder = i % 128;
            int i2 = i % 2;
        }
    }

    public interface onNavigationEvent {
        public static final onWarmupCompleted Companion = onWarmupCompleted.onNavigationEvent;

        long onExtraCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i);

        long onWarmupCompleted(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i);

        public static final class onWarmupCompleted {
            private static int IAuthTabCallbackDefault = 0;
            private static int IAuthTabCallbackStub = 1;
            private static int asInterface = 1;
            private static int onExtraCallbackWithResult;
            static final /* synthetic */ onWarmupCompleted onNavigationEvent = new onWarmupCompleted();
            private static final onNavigationEvent onExtraCallback = new onExtraCallback();
            private static final onNavigationEvent IAuthTabCallback = new IAuthTabCallback();
            private static final onNavigationEvent onWarmupCompleted = new onExtraCallbackWithResult();

            private onWarmupCompleted() {
            }

            public static final class onExtraCallback implements onNavigationEvent {
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                onExtraCallback() {
                }

                @Override // o.drawEmptyStars.onNavigationEvent
                public long onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
                    int i2 = 2 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1191382901);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i3 = onExtraCallbackWithResult + 65;
                        IAuthTabCallback = i3 % 128;
                        int i4 = i3 % 2;
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1191382901, i, -1, "im.toss.tds.compose.component.atom.loader.TdsLoaderV1.Type.Companion.Primary.<no name provided>.<get-loaderColor> (TdsLoaderV1.kt:70)");
                    }
                    long jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.IconBrand, cameraCaptureResultEmptyCameraCaptureResult, 6);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    int i5 = IAuthTabCallback + 109;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    return jOnExtraCallback;
                }

                @Override // o.drawEmptyStars.onNavigationEvent
                public long onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
                    int i2 = 2 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1585673953);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1585673953, i, -1, "im.toss.tds.compose.component.atom.loader.TdsLoaderV1.Type.Companion.Primary.<no name provided>.<get-labelColor> (TdsLoaderV1.kt:75)");
                        int i3 = onExtraCallbackWithResult + 27;
                        IAuthTabCallback = i3 % 128;
                        if (i3 % 2 == 0) {
                            int i4 = 4 / 2;
                        }
                    }
                    long jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextPrimary, cameraCaptureResultEmptyCameraCaptureResult, 6);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i5 = IAuthTabCallback + 67;
                        onExtraCallbackWithResult = i5 % 128;
                        int i6 = i5 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        if (i6 != 0) {
                            throw null;
                        }
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    return jOnExtraCallback;
                }
            }

            static {
                int i = onExtraCallbackWithResult + 87;
                IAuthTabCallbackStub = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
            }

            public final onNavigationEvent IAuthTabCallback() {
                onNavigationEvent onnavigationevent;
                int i = 2 % 2;
                int i2 = asInterface;
                int i3 = i2 + 19;
                IAuthTabCallbackDefault = i3 % 128;
                if (i3 % 2 != 0) {
                    onnavigationevent = onExtraCallback;
                    int i4 = 68 / 0;
                } else {
                    onnavigationevent = onExtraCallback;
                }
                int i5 = i2 + 69;
                IAuthTabCallbackDefault = i5 % 128;
                int i6 = i5 % 2;
                return onnavigationevent;
            }

            public static final class IAuthTabCallback implements onNavigationEvent {
                private static int IAuthTabCallback = 1;
                private static int onNavigationEvent;

                IAuthTabCallback() {
                }

                @Override // o.drawEmptyStars.onNavigationEvent
                public long onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
                    int i2 = 2 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-187021561);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-187021561, i, -1, "im.toss.tds.compose.component.atom.loader.TdsLoaderV1.Type.Companion.Dark.<no name provided>.<get-loaderColor> (TdsLoaderV1.kt:84)");
                        int i3 = onNavigationEvent + 57;
                        IAuthTabCallback = i3 % 128;
                        int i4 = i3 % 2;
                    }
                    long jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.IconPrimary, cameraCaptureResultEmptyCameraCaptureResult, 6);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i5 = IAuthTabCallback + 67;
                        onNavigationEvent = i5 % 128;
                        int i6 = i5 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        if (i6 != 0) {
                            throw null;
                        }
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    return jOnExtraCallback;
                }

                @Override // o.drawEmptyStars.onNavigationEvent
                public long onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
                    int i2 = 2 % 2;
                    int i3 = onNavigationEvent + 49;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1361377051);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1361377051, i, -1, "im.toss.tds.compose.component.atom.loader.TdsLoaderV1.Type.Companion.Dark.<no name provided>.<get-labelColor> (TdsLoaderV1.kt:89)");
                    }
                    long jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextPrimary, cameraCaptureResultEmptyCameraCaptureResult, 6);
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                        int i5 = IAuthTabCallback + 13;
                        onNavigationEvent = i5 % 128;
                        int i6 = i5 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    return jOnExtraCallback;
                }
            }

            public final onNavigationEvent onExtraCallback() {
                int i = 2 % 2;
                int i2 = asInterface + 113;
                int i3 = i2 % 128;
                IAuthTabCallbackDefault = i3;
                int i4 = i2 % 2;
                onNavigationEvent onnavigationevent = IAuthTabCallback;
                int i5 = i3 + 5;
                asInterface = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 91 / 0;
                }
                return onnavigationevent;
            }

            public static final class onExtraCallbackWithResult implements onNavigationEvent {
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                onExtraCallbackWithResult() {
                }

                @Override // o.drawEmptyStars.onNavigationEvent
                public long onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
                    int i2 = 2 % 2;
                    int i3 = onWarmupCompleted + 57;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-2050204383);
                    if (i4 == 0) {
                        CameraConfigExternalSyntheticLambda0.asBinder();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2050204383, i, -1, "im.toss.tds.compose.component.atom.loader.TdsLoaderV1.Type.Companion.Light.<no name provided>.<get-loaderColor> (TdsLoaderV1.kt:98)");
                    }
                    long jOnWarmupCompleted = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onWarmupCompleted(eExternalSyntheticLambda0.LoaderWhiteFill, cameraCaptureResultEmptyCameraCaptureResult, 6);
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                        int i5 = onNavigationEvent + 9;
                        onWarmupCompleted = i5 % 128;
                        int i6 = i5 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        if (i6 != 0) {
                            int i7 = 56 / 0;
                        }
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    return jOnWarmupCompleted;
                }

                @Override // o.drawEmptyStars.onNavigationEvent
                public long onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
                    int i2 = 2 % 2;
                    int i3 = onWarmupCompleted + 9;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1294487667);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i5 = onNavigationEvent + 79;
                        onWarmupCompleted = i5 % 128;
                        int i6 = i5 % 2;
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1294487667, i, -1, "im.toss.tds.compose.component.atom.loader.TdsLoaderV1.Type.Companion.Light.<no name provided>.<get-labelColor> (TdsLoaderV1.kt:103)");
                    }
                    long jOnWarmupCompleted = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onWarmupCompleted(eExternalSyntheticLambda0.LoaderWhiteText, cameraCaptureResultEmptyCameraCaptureResult, 6);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        int i7 = onWarmupCompleted + 125;
                        onNavigationEvent = i7 % 128;
                        int i8 = i7 % 2;
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    return jOnWarmupCompleted;
                }
            }

            public final onNavigationEvent onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = asInterface + 11;
                int i3 = i2 % 128;
                IAuthTabCallbackDefault = i3;
                if (i2 % 2 != 0) {
                    throw null;
                }
                onNavigationEvent onnavigationevent = onWarmupCompleted;
                int i4 = i3 + 87;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                return onnavigationevent;
            }
        }
    }
}
