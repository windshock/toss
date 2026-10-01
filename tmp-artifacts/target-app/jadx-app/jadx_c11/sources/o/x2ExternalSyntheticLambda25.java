package o;

import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class x2ExternalSyntheticLambda25 {
    public static final x2ExternalSyntheticLambda25 onExtraCallback = new x2ExternalSyntheticLambda25();
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = onWarmupCompleted + 77;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 60 / 0;
        }
    }

    public static abstract class IAuthTabCallback {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final getBacktraceNote<x2ExternalSyntheticLambda32, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback;
        private final getBacktraceNote<x2ExternalSyntheticLambda27, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult;

        public /* synthetic */ IAuthTabCallback(getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, DefaultConstructorMarker defaultConstructorMarker) {
            this(getbacktracenote, getbacktracenote2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private IAuthTabCallback(getBacktraceNote<? super x2ExternalSyntheticLambda32, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, getBacktraceNote<? super x2ExternalSyntheticLambda27, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2) {
            this.onExtraCallback = getbacktracenote;
            this.onExtraCallbackWithResult = getbacktracenote2;
        }

        public final getBacktraceNote<x2ExternalSyntheticLambda32, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 79;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            getBacktraceNote<x2ExternalSyntheticLambda32, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = this.onExtraCallback;
            int i5 = i3 + 25;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return getbacktracenote;
        }

        public final getBacktraceNote<x2ExternalSyntheticLambda27, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 103;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            getBacktraceNote<x2ExternalSyntheticLambda27, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = this.onExtraCallbackWithResult;
            int i5 = i2 + 107;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return getbacktracenote;
            }
            throw null;
        }

        public static final class onExtraCallbackWithResult extends IAuthTabCallback {
            public static final onExtraCallbackWithResult IAuthTabCallback = new onExtraCallbackWithResult();
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted = 1;

            static {
                int i = onNavigationEvent + 19;
                onExtraCallbackWithResult = i % 128;
                int i2 = i % 2;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallback;
                int i3 = i2 + 33;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                if (this == obj || (obj instanceof onExtraCallbackWithResult)) {
                    return true;
                }
                int i5 = i2 + 75;
                onWarmupCompleted = i5 % 128;
                return i5 % 2 == 0;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 83;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 13;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return 338576798;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 119;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    return "TopList";
                }
                int i3 = 80 / 0;
                return "TopList";
            }

            /* JADX WARN: Illegal instructions before constructor call */
            private onExtraCallbackWithResult() {
                x2ExternalSyntheticLambda23 x2externalsyntheticlambda23 = x2ExternalSyntheticLambda23.onExtraCallback;
                super(x2externalsyntheticlambda23.IAuthTabCallbackStub(), x2externalsyntheticlambda23.onWarmupCompleted(), null);
            }
        }

        public static final class onExtraCallback extends IAuthTabCallback {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 0;
            public static final onExtraCallback onExtraCallbackWithResult = new onExtraCallback();
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted = 1;

            static {
                int i = onNavigationEvent + 43;
                onExtraCallback = i % 128;
                int i2 = i % 2;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 35;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                int i4 = i2 % 2;
                if (this == obj) {
                    return true;
                }
                if (obj instanceof onExtraCallback) {
                    int i5 = i3 + 103;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return true;
                }
                int i7 = i3 + 5;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 121;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 95;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return 1209184869;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 33;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 69;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return "AmountTopListWithIcon";
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            private onExtraCallback() {
                x2ExternalSyntheticLambda23 x2externalsyntheticlambda23 = x2ExternalSyntheticLambda23.onExtraCallback;
                super(x2externalsyntheticlambda23.onNavigationEvent(), x2externalsyntheticlambda23.access000(), null);
            }
        }

        /* renamed from: o.x2ExternalSyntheticLambda25$IAuthTabCallback$IAuthTabCallback, reason: collision with other inner class name */
        public static final class C0072IAuthTabCallback extends IAuthTabCallback {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult = 0;
            public static final C0072IAuthTabCallback onNavigationEvent = new C0072IAuthTabCallback();
            private static int onWarmupCompleted = 1;

            static {
                int i = onExtraCallbackWithResult + 103;
                onWarmupCompleted = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 109;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                if (this == obj || (obj instanceof C0072IAuthTabCallback)) {
                    return true;
                }
                int i5 = i2 + 75;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 115;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return 279263530;
                }
                int i3 = 61 / 0;
                return 279263530;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 91;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 99;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return "SubtitleListWithIcon";
            }

            /* JADX WARN: Illegal instructions before constructor call */
            private C0072IAuthTabCallback() {
                x2ExternalSyntheticLambda23 x2externalsyntheticlambda23 = x2ExternalSyntheticLambda23.onExtraCallback;
                super(x2externalsyntheticlambda23.asInterface(), x2externalsyntheticlambda23.onExtraCallbackWithResult(), null);
            }
        }

        public static final class onWarmupCompleted extends IAuthTabCallback {
            public static final onWarmupCompleted IAuthTabCallback = new onWarmupCompleted();
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            static {
                int i = onNavigationEvent + 35;
                onWarmupCompleted = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallback;
                int i3 = i2 + 39;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                if (this != obj) {
                    return !((obj instanceof onWarmupCompleted) ^ true);
                }
                int i4 = i2 + 23;
                onExtraCallbackWithResult = i4 % 128;
                return i4 % 2 != 0;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 13;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 69 / 0;
                }
                int i5 = i2 + 73;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 25 / 0;
                }
                return -59640641;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 9;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                if (i2 % 2 != 0) {
                    throw null;
                }
                int i4 = i3 + 39;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return "ListOnly";
            }

            /* JADX WARN: Illegal instructions before constructor call */
            private onWarmupCompleted() {
                x2ExternalSyntheticLambda23 x2externalsyntheticlambda23 = x2ExternalSyntheticLambda23.onExtraCallback;
                super(x2externalsyntheticlambda23.IAuthTabCallbackDefault(), x2externalsyntheticlambda23.IAuthTabCallback(), null);
            }
        }

        public static final class onNavigationEvent extends IAuthTabCallback {
            public static final onNavigationEvent IAuthTabCallback = new onNavigationEvent();
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            static {
                int i = onExtraCallback + 109;
                onExtraCallbackWithResult = i % 128;
                int i2 = i % 2;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted;
                int i3 = i2 + 63;
                int i4 = i3 % 128;
                onNavigationEvent = i4;
                if (i3 % 2 != 0) {
                    throw null;
                }
                if (this == obj) {
                    int i5 = i2 + 51;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 34 / 0;
                    }
                    return true;
                }
                if (obj instanceof onNavigationEvent) {
                    return true;
                }
                int i7 = i4 + 59;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 67;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                int i4 = i2 + 3;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    return -889262914;
                }
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 1;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 7;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return "ListWithIconOnly";
            }

            /* JADX WARN: Illegal instructions before constructor call */
            private onNavigationEvent() {
                x2ExternalSyntheticLambda23 x2externalsyntheticlambda23 = x2ExternalSyntheticLambda23.onExtraCallback;
                super(x2externalsyntheticlambda23.onTransact(), x2externalsyntheticlambda23.asBinder(), null);
            }
        }
    }

    private x2ExternalSyntheticLambda25() {
    }

    public interface onExtraCallback {

        /* renamed from: o.x2ExternalSyntheticLambda25$onExtraCallback$onExtraCallback, reason: collision with other inner class name */
        public static final class C0073onExtraCallback implements onExtraCallback {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            public static final C0073onExtraCallback onNavigationEvent = new C0073onExtraCallback();
            private static int onWarmupCompleted = 1;

            static {
                int i = onExtraCallback + 9;
                onWarmupCompleted = i % 128;
                int i2 = i % 2;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    int i2 = IAuthTabCallback + 79;
                    onExtraCallbackWithResult = i2 % 128;
                    return i2 % 2 != 0;
                }
                if (obj instanceof C0073onExtraCallback) {
                    return true;
                }
                int i3 = onExtraCallbackWithResult + 73;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 11;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                int i4 = i2 + 53;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return 1343183691;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 3;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 93;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return "Infinite";
            }

            private C0073onExtraCallback() {
            }
        }

        public static final class onWarmupCompleted implements onExtraCallback {
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;
            private final int onExtraCallback;

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 69;
                int i4 = i3 % 128;
                onWarmupCompleted = i4;
                int i5 = i3 % 2;
                if (this == obj) {
                    int i6 = i2 + 109;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    return true;
                }
                if (!(obj instanceof onWarmupCompleted)) {
                    int i8 = i2 + 15;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                    return false;
                }
                if (this.onExtraCallback == ((onWarmupCompleted) obj).onExtraCallback) {
                    return true;
                }
                int i10 = i4 + 45;
                int i11 = i10 % 128;
                IAuthTabCallback = i11;
                int i12 = i10 % 2;
                int i13 = i11 + 89;
                onWarmupCompleted = i13 % 128;
                int i14 = i13 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 41;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                int i4 = this.onExtraCallback;
                if (i3 != 0) {
                    return Integer.hashCode(i4);
                }
                Integer.hashCode(i4);
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Finite(count=" + this.onExtraCallback + ")";
                int i2 = onWarmupCompleted + 47;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            public onWarmupCompleted(int i) {
                this.onExtraCallback = i;
            }

            public final int onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 17;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                int i4 = this.onExtraCallback;
                if (i3 == 0) {
                    int i5 = 31 / 0;
                }
                return i4;
            }
        }
    }
}
