package o;

import com.facebook.react.uimanager.LayoutShadowNode;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class oExternalSyntheticLambda0 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onTransact = 1;
    private static int onWarmupCompleted = 1;
    public static final oExternalSyntheticLambda0 IAuthTabCallback = new oExternalSyntheticLambda0();
    private static final float onNavigationEvent = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f);

    private oExternalSyntheticLambda0() {
    }

    public final float onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 17;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        float f = onNavigationEvent;
        int i5 = i3 + 57;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public static final class onWarmupCompleted {
        private static int IAuthTabCallbackDefault = 1;
        private static int asInterface = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onTransact = 1;
        private final IAuthTabCallback IAuthTabCallback;
        private final onNavigationEvent onExtraCallback;
        private final onExtraCallbackWithResult onNavigationEvent;
        public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
        private static final onWarmupCompleted onWarmupCompleted = new onWarmupCompleted(null, null, null, 7, null);

        public onWarmupCompleted() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ onWarmupCompleted onExtraCallbackWithResult(onWarmupCompleted onwarmupcompleted, onExtraCallbackWithResult onextracallbackwithresult, IAuthTabCallback iAuthTabCallback, onNavigationEvent onnavigationevent, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallbackDefault;
            int i4 = i3 + 119;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            if ((i & 1) != 0) {
                onextracallbackwithresult = onwarmupcompleted.onNavigationEvent;
            }
            if ((i & 2) != 0) {
                iAuthTabCallback = onwarmupcompleted.IAuthTabCallback;
            }
            if ((i & 4) != 0) {
                int i6 = i3 + 109;
                asInterface = i6 % 128;
                if (i6 % 2 != 0) {
                    onNavigationEvent onnavigationevent2 = onwarmupcompleted.onExtraCallback;
                    throw null;
                }
                onnavigationevent = onwarmupcompleted.onExtraCallback;
            }
            return onwarmupcompleted.onExtraCallbackWithResult(onextracallbackwithresult, iAuthTabCallback, onnavigationevent);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = asInterface + 7;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                return false;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
            if (!Intrinsics.areEqual(this.onNavigationEvent, onwarmupcompleted.onNavigationEvent)) {
                int i4 = asInterface + 47;
                IAuthTabCallbackDefault = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.IAuthTabCallback, onwarmupcompleted.IAuthTabCallback)) {
                return false;
            }
            if (this.onExtraCallback == onwarmupcompleted.onExtraCallback) {
                return true;
            }
            int i6 = asInterface + 87;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            onNavigationEvent onnavigationevent;
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 101;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                iHashCode = ((this.onNavigationEvent.hashCode() * 33) % this.IAuthTabCallback.hashCode()) >>> 23;
                onnavigationevent = this.onExtraCallback;
            } else {
                iHashCode = ((this.onNavigationEvent.hashCode() * 31) + this.IAuthTabCallback.hashCode()) * 31;
                onnavigationevent = this.onExtraCallback;
            }
            int iHashCode2 = iHashCode + onnavigationevent.hashCode();
            int i3 = asInterface + 99;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode2;
        }

        public final onWarmupCompleted onExtraCallbackWithResult(@NotNull onExtraCallbackWithResult onextracallbackwithresult, @NotNull IAuthTabCallback iAuthTabCallback, @NotNull onNavigationEvent onnavigationevent) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(onextracallbackwithresult, iAuthTabCallback, onnavigationevent);
            int i2 = asInterface + 63;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Theme(style=" + this.onNavigationEvent + ", decoration=" + this.IAuthTabCallback + ", arrowPosition=" + this.onExtraCallback + ")";
            int i2 = asInterface + 103;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onWarmupCompleted(@NotNull onExtraCallbackWithResult onextracallbackwithresult, @NotNull IAuthTabCallback iAuthTabCallback, @NotNull onNavigationEvent onnavigationevent) {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            this.onNavigationEvent = onextracallbackwithresult;
            this.IAuthTabCallback = iAuthTabCallback;
            this.onExtraCallback = onnavigationevent;
        }

        public static final /* synthetic */ onWarmupCompleted onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 21;
            int i3 = i2 % 128;
            asInterface = i3;
            int i4 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = onWarmupCompleted;
            int i5 = i3 + 51;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return onwarmupcompleted;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onWarmupCompleted(onExtraCallbackWithResult onextracallbackwithresult, IAuthTabCallback iAuthTabCallback, onNavigationEvent onnavigationevent, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                onextracallbackwithresult = onExtraCallbackWithResult.Companion.onNavigationEvent();
                int i2 = 2 % 2;
            }
            if ((i & 2) != 0) {
                int i3 = asInterface + 57;
                IAuthTabCallbackDefault = i3 % 128;
                int i4 = i3 % 2;
                iAuthTabCallback = IAuthTabCallback.Companion.onWarmupCompleted();
                int i5 = IAuthTabCallbackDefault + 31;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
            }
            this(onextracallbackwithresult, iAuthTabCallback, (i & 4) != 0 ? onNavigationEvent.Companion.onWarmupCompleted() : onnavigationevent);
        }

        public final onExtraCallbackWithResult onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = asInterface + 43;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            int i4 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = this.onNavigationEvent;
            int i5 = i3 + 119;
            asInterface = i5 % 128;
            if (i5 % 2 == 0) {
                return onextracallbackwithresult;
            }
            throw null;
        }

        public final IAuthTabCallback onExtraCallback() {
            int i = 2 % 2;
            int i2 = asInterface + 61;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            int i4 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = this.IAuthTabCallback;
            int i5 = i3 + 67;
            asInterface = i5 % 128;
            if (i5 % 2 == 0) {
                return iAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final onNavigationEvent onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 1;
            int i3 = i2 % 128;
            asInterface = i3;
            int i4 = i2 % 2;
            onNavigationEvent onnavigationevent = this.onExtraCallback;
            int i5 = i3 + 81;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 != 0) {
                return onnavigationevent;
            }
            throw null;
        }

        public static final class IAuthTabCallback {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private IAuthTabCallback() {
            }

            public final onWarmupCompleted onNavigationEvent() {
                onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 75;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    onwarmupcompletedOnExtraCallbackWithResult = onWarmupCompleted.onExtraCallbackWithResult();
                    int i3 = 51 / 0;
                } else {
                    onwarmupcompletedOnExtraCallbackWithResult = onWarmupCompleted.onExtraCallbackWithResult();
                }
                int i4 = IAuthTabCallback + 27;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return onwarmupcompletedOnExtraCallbackWithResult;
            }
        }

        static {
            int i = onExtraCallbackWithResult + 65;
            onTransact = i % 128;
            int i2 = i % 2;
        }
    }

    public interface onExtraCallbackWithResult {
        public static final onWarmupCompleted Companion = onWarmupCompleted.IAuthTabCallback;

        long onExtraCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i);

        long onExtraCallbackWithResult(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i);

        public static final class onWarmupCompleted {
            private static int IAuthTabCallbackStub = 0;
            private static int asBinder = 1;
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;
            static final /* synthetic */ onWarmupCompleted IAuthTabCallback = new onWarmupCompleted();
            private static final onExtraCallbackWithResult onNavigationEvent = new onNavigationEvent();
            private static final onExtraCallbackWithResult onExtraCallback = new C0046onExtraCallbackWithResult();

            private onWarmupCompleted() {
            }

            public static final class onNavigationEvent implements onExtraCallbackWithResult {
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                onNavigationEvent() {
                }

                @Override // o.oExternalSyntheticLambda0.onExtraCallbackWithResult
                public long onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                    int i2 = 2 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(625191737);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i3 = IAuthTabCallback + 101;
                        onExtraCallback = i3 % 128;
                        int i4 = i3 % 2;
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(625191737, i, -1, "im.toss.tds.compose.component.atom.textbutton.TdsTextButtonV1.Style.Companion.Blue.<no name provided>.textColor (TdsTextButtonV1.kt:100)");
                        int i5 = IAuthTabCallback + 29;
                        onExtraCallback = i5 % 128;
                        int i6 = i5 % 2;
                    }
                    long jOnNavigationEvent = r8lambdawQE4EmefLHjqjqCjz5ylaHtLcSY.onWarmupCompleted.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    int i7 = onExtraCallback + 101;
                    IAuthTabCallback = i7 % 128;
                    if (i7 % 2 != 0) {
                        return jOnNavigationEvent;
                    }
                    throw null;
                }

                @Override // o.oExternalSyntheticLambda0.onExtraCallbackWithResult
                public long onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallback + 59;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1741886649);
                    if (i4 == 0) {
                        CameraConfigExternalSyntheticLambda0.asBinder();
                        throw null;
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i5 = onExtraCallback + 89;
                        IAuthTabCallback = i5 % 128;
                        int i6 = i5 % 2;
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1741886649, i, -1, "im.toss.tds.compose.component.atom.textbutton.TdsTextButtonV1.Style.Companion.Blue.<no name provided>.arrowColor (TdsTextButtonV1.kt:104)");
                        if (i6 == 0) {
                            throw null;
                        }
                    }
                    long jOnWarmupCompleted = r8lambdawQE4EmefLHjqjqCjz5ylaHtLcSY.onWarmupCompleted.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, 6);
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                        int i7 = onExtraCallback + 17;
                        IAuthTabCallback = i7 % 128;
                        int i8 = i7 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    return jOnWarmupCompleted;
                }
            }

            static {
                int i = onWarmupCompleted + 25;
                onExtraCallbackWithResult = i % 128;
                if (i % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final onExtraCallbackWithResult onExtraCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub;
                int i3 = i2 + 53;
                asBinder = i3 % 128;
                if (i3 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                onExtraCallbackWithResult onextracallbackwithresult = onNavigationEvent;
                int i4 = i2 + 57;
                asBinder = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 77 / 0;
                }
                return onextracallbackwithresult;
            }

            /* renamed from: o.oExternalSyntheticLambda0$onExtraCallbackWithResult$onWarmupCompleted$onExtraCallbackWithResult, reason: collision with other inner class name */
            public static final class C0046onExtraCallbackWithResult implements onExtraCallbackWithResult {
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                C0046onExtraCallbackWithResult() {
                }

                @Override // o.oExternalSyntheticLambda0.onExtraCallbackWithResult
                public long onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                    int i2 = 2 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1473986498);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i3 = IAuthTabCallback + 109;
                        onExtraCallbackWithResult = i3 % 128;
                        int i4 = i3 % 2;
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1473986498, i, -1, "im.toss.tds.compose.component.atom.textbutton.TdsTextButtonV1.Style.Companion.Grey.<no name provided>.textColor (TdsTextButtonV1.kt:112)");
                        if (i4 == 0) {
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                    }
                    long jOnExtraCallbackWithResult = r8lambdawQE4EmefLHjqjqCjz5ylaHtLcSY.onWarmupCompleted.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 6);
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        int i5 = onExtraCallbackWithResult + 71;
                        IAuthTabCallback = i5 % 128;
                        int i6 = i5 % 2;
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    return jOnExtraCallbackWithResult;
                }

                @Override // o.oExternalSyntheticLambda0.onExtraCallbackWithResult
                public long onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                    int i2 = 2 % 2;
                    int i3 = IAuthTabCallback + 3;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    Object obj = null;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-357291586);
                    if (i4 == 0) {
                        CameraConfigExternalSyntheticLambda0.asBinder();
                        obj.hashCode();
                        throw null;
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i5 = IAuthTabCallback + 101;
                        onExtraCallbackWithResult = i5 % 128;
                        int i6 = i5 % 2;
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-357291586, i, -1, "im.toss.tds.compose.component.atom.textbutton.TdsTextButtonV1.Style.Companion.Grey.<no name provided>.arrowColor (TdsTextButtonV1.kt:116)");
                        int i7 = onExtraCallbackWithResult + 21;
                        IAuthTabCallback = i7 % 128;
                        int i8 = i7 % 2;
                    }
                    long jOnExtraCallback = r8lambdawQE4EmefLHjqjqCjz5ylaHtLcSY.onWarmupCompleted.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, 6);
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                        int i9 = onExtraCallbackWithResult + 41;
                        IAuthTabCallback = i9 % 128;
                        int i10 = i9 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        if (i10 != 0) {
                            throw null;
                        }
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    return jOnExtraCallback;
                }
            }

            public final onExtraCallbackWithResult onNavigationEvent() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub + 7;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                onExtraCallbackWithResult onextracallbackwithresult = onExtraCallback;
                if (i3 == 0) {
                    int i4 = 13 / 0;
                }
                return onextracallbackwithresult;
            }

            public static final class onExtraCallback implements onExtraCallbackWithResult {
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;
                final /* synthetic */ long IAuthTabCallback;
                final /* synthetic */ long onExtraCallback;

                onExtraCallback(long j, long j2) {
                    this.onExtraCallback = j;
                    this.IAuthTabCallback = j2;
                }

                @Override // o.oExternalSyntheticLambda0.onExtraCallbackWithResult
                public long onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                    int i2 = 2 % 2;
                    int i3 = onNavigationEvent + 45;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1786004627);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i5 = onNavigationEvent + 37;
                        onExtraCallbackWithResult = i5 % 128;
                        int i6 = i5 % 2;
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1786004627, i, -1, "im.toss.tds.compose.component.atom.textbutton.TdsTextButtonV1.Style.Companion.invoke.<no name provided>.textColor (TdsTextButtonV1.kt:126)");
                    }
                    long j = this.onExtraCallback;
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        int i7 = onNavigationEvent + 75;
                        onExtraCallbackWithResult = i7 % 128;
                        int i8 = i7 % 2;
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    int i9 = onNavigationEvent + 115;
                    onExtraCallbackWithResult = i9 % 128;
                    int i10 = i9 % 2;
                    return j;
                }

                @Override // o.oExternalSyntheticLambda0.onExtraCallbackWithResult
                public long onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                    int i2 = 2 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-659558893);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-659558893, i, -1, "im.toss.tds.compose.component.atom.textbutton.TdsTextButtonV1.Style.Companion.invoke.<no name provided>.arrowColor (TdsTextButtonV1.kt:130)");
                        int i3 = onNavigationEvent + 5;
                        onExtraCallbackWithResult = i3 % 128;
                        int i4 = i3 % 2;
                    }
                    long j = this.IAuthTabCallback;
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                        int i5 = onNavigationEvent + 91;
                        onExtraCallbackWithResult = i5 % 128;
                        int i6 = i5 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    int i7 = onNavigationEvent + 37;
                    onExtraCallbackWithResult = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i8 = 2 / 0;
                    }
                    return j;
                }
            }

            public final onExtraCallbackWithResult IAuthTabCallback(long j, long j2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
                int i3 = 2 % 2;
                if ((i2 & 2) != 0) {
                    int i4 = asBinder + 83;
                    IAuthTabCallbackStub = i4 % 128;
                    if (i4 % 2 != 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    j2 = j;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1245555829, i, -1, "im.toss.tds.compose.component.atom.textbutton.TdsTextButtonV1.Style.Companion.invoke (TdsTextButtonV1.kt:121)");
                }
                onExtraCallback onextracallback = new onExtraCallback(j, j2);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                int i5 = asBinder + 93;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                return onextracallback;
            }
        }
    }

    public interface onExtraCallback {
        public static final onNavigationEvent Companion = onNavigationEvent.onExtraCallbackWithResult;

        GraphicDeviceInfo IAuthTabCallback();

        long onExtraCallback();

        public static final class onNavigationEvent {
            private static int IAuthTabCallbackDefault = 0;
            private static int IAuthTabCallbackStub = 1;
            private static int getInterfaceDescriptor = 1;
            private static int onTransact;
            static final /* synthetic */ onNavigationEvent onExtraCallbackWithResult = new onNavigationEvent();
            private static final onExtraCallback asInterface = new asInterface();
            private static final onExtraCallback onExtraCallback = new IAuthTabCallback();
            private static final onExtraCallback IAuthTabCallback = new C0045onNavigationEvent();
            private static final onExtraCallback onWarmupCompleted = new C0044onExtraCallback();
            private static final onExtraCallback onNavigationEvent = new onExtraCallbackWithResult();
            private static final onExtraCallback asBinder = new onWarmupCompleted();

            private onNavigationEvent() {
            }

            public static final class asInterface implements onExtraCallback {
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;
                private final GraphicDeviceInfo IAuthTabCallback = GraphicDeviceInfo.Companion.IAuthTabCallback();
                private final long onExtraCallback = AppLovinPostbackService.onExtraCallbackWithResult.asBinder().IAuthTabCallbackStub();

                asInterface() {
                }

                @Override // o.oExternalSyntheticLambda0.onExtraCallback
                public GraphicDeviceInfo IAuthTabCallback() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 61;
                    int i3 = i2 % 128;
                    onWarmupCompleted = i3;
                    int i4 = i2 % 2;
                    GraphicDeviceInfo graphicDeviceInfo = this.IAuthTabCallback;
                    int i5 = i3 + 25;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    return graphicDeviceInfo;
                }

                @Override // o.oExternalSyntheticLambda0.onExtraCallback
                public long onExtraCallback() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 101;
                    int i3 = i2 % 128;
                    onWarmupCompleted = i3;
                    int i4 = i2 % 2;
                    long j = this.onExtraCallback;
                    int i5 = i3 + 107;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 71 / 0;
                    }
                    return j;
                }
            }

            static {
                int i = IAuthTabCallbackStub + 63;
                IAuthTabCallbackDefault = i % 128;
                int i2 = i % 2;
            }

            public static final class IAuthTabCallback implements onExtraCallback {
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;
                private final GraphicDeviceInfo onNavigationEvent = GraphicDeviceInfo.Companion.IAuthTabCallback();
                private final long onWarmupCompleted;

                IAuthTabCallback() {
                    Object[] objArr = {AppLovinPostbackService.onExtraCallbackWithResult};
                    this.onWarmupCompleted = ((getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -242380979, 242380980, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), objArr, LayoutShadowNode.onWarmupCompleted.onNavigationEvent())).IAuthTabCallbackStub();
                }

                @Override // o.oExternalSyntheticLambda0.onExtraCallback
                public GraphicDeviceInfo IAuthTabCallback() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 23;
                    int i3 = i2 % 128;
                    onExtraCallback = i3;
                    int i4 = i2 % 2;
                    GraphicDeviceInfo graphicDeviceInfo = this.onNavigationEvent;
                    int i5 = i3 + 113;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return graphicDeviceInfo;
                }

                @Override // o.oExternalSyntheticLambda0.onExtraCallback
                public long onExtraCallback() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 77;
                    int i3 = i2 % 128;
                    onExtraCallback = i3;
                    if (i2 % 2 != 0) {
                        throw null;
                    }
                    long j = this.onWarmupCompleted;
                    int i4 = i3 + 17;
                    IAuthTabCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        return j;
                    }
                    throw null;
                }
            }

            /* renamed from: o.oExternalSyntheticLambda0$onExtraCallback$onNavigationEvent$onNavigationEvent, reason: collision with other inner class name */
            public static final class C0045onNavigationEvent implements onExtraCallback {
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;
                private final GraphicDeviceInfo onWarmupCompleted = GraphicDeviceInfo.Companion.asBinder();
                private final long IAuthTabCallback = AppLovinPostbackService.onExtraCallbackWithResult.access100().IAuthTabCallbackStub();

                C0045onNavigationEvent() {
                }

                @Override // o.oExternalSyntheticLambda0.onExtraCallback
                public GraphicDeviceInfo IAuthTabCallback() {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 33;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    GraphicDeviceInfo graphicDeviceInfo = this.onWarmupCompleted;
                    if (i3 != 0) {
                        int i4 = 66 / 0;
                    }
                    return graphicDeviceInfo;
                }

                @Override // o.oExternalSyntheticLambda0.onExtraCallback
                public long onExtraCallback() {
                    long j;
                    int i = 2 % 2;
                    int i2 = onExtraCallback;
                    int i3 = i2 + 55;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 != 0) {
                        j = this.IAuthTabCallback;
                        int i4 = 58 / 0;
                    } else {
                        j = this.IAuthTabCallback;
                    }
                    int i5 = i2 + 111;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 == 0) {
                        return j;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }

            public final onExtraCallback onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = getInterfaceDescriptor + 89;
                int i3 = i2 % 128;
                onTransact = i3;
                Object obj = null;
                if (i2 % 2 != 0) {
                    throw null;
                }
                onExtraCallback onextracallback = IAuthTabCallback;
                int i4 = i3 + 17;
                getInterfaceDescriptor = i4 % 128;
                if (i4 % 2 != 0) {
                    return onextracallback;
                }
                obj.hashCode();
                throw null;
            }

            /* renamed from: o.oExternalSyntheticLambda0$onExtraCallback$onNavigationEvent$onExtraCallback, reason: collision with other inner class name */
            public static final class C0044onExtraCallback implements onExtraCallback {
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;
                private final GraphicDeviceInfo onWarmupCompleted = GraphicDeviceInfo.Companion.asBinder();
                private final long onExtraCallback = AppLovinPostbackService.onExtraCallbackWithResult.getInterfaceDescriptor().IAuthTabCallbackStub();

                C0044onExtraCallback() {
                }

                @Override // o.oExternalSyntheticLambda0.onExtraCallback
                public GraphicDeviceInfo IAuthTabCallback() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback;
                    int i3 = i2 + 33;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    GraphicDeviceInfo graphicDeviceInfo = this.onWarmupCompleted;
                    int i5 = i2 + 117;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    return graphicDeviceInfo;
                }

                @Override // o.oExternalSyntheticLambda0.onExtraCallback
                public long onExtraCallback() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 111;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 != 0) {
                        return this.onExtraCallback;
                    }
                    int i3 = 40 / 0;
                    return this.onExtraCallback;
                }
            }

            public final onExtraCallback onNavigationEvent() {
                int i = 2 % 2;
                int i2 = onTransact + 101;
                getInterfaceDescriptor = i2 % 128;
                if (i2 % 2 != 0) {
                    return onWarmupCompleted;
                }
                throw null;
            }

            public static final class onExtraCallbackWithResult implements onExtraCallback {
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;
                private final GraphicDeviceInfo onExtraCallbackWithResult = GraphicDeviceInfo.Companion.onNavigationEvent();
                private final long onWarmupCompleted;

                onExtraCallbackWithResult() {
                    Object[] objArr = {AppLovinPostbackService.onExtraCallbackWithResult};
                    this.onWarmupCompleted = ((getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), objArr, LayoutShadowNode.onWarmupCompleted.onNavigationEvent())).IAuthTabCallbackStub();
                }

                @Override // o.oExternalSyntheticLambda0.onExtraCallback
                public GraphicDeviceInfo IAuthTabCallback() {
                    int i = 2 % 2;
                    int i2 = onExtraCallback;
                    int i3 = i2 + 125;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    GraphicDeviceInfo graphicDeviceInfo = this.onExtraCallbackWithResult;
                    int i5 = i2 + 43;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    return graphicDeviceInfo;
                }

                @Override // o.oExternalSyntheticLambda0.onExtraCallback
                public long onExtraCallback() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 25;
                    int i3 = i2 % 128;
                    onExtraCallback = i3;
                    int i4 = i2 % 2;
                    long j = this.onWarmupCompleted;
                    int i5 = i3 + 89;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 == 0) {
                        return j;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }

            public final onExtraCallback IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = getInterfaceDescriptor + 77;
                int i3 = i2 % 128;
                onTransact = i3;
                int i4 = i2 % 2;
                onExtraCallback onextracallback = onNavigationEvent;
                int i5 = i3 + 97;
                getInterfaceDescriptor = i5 % 128;
                if (i5 % 2 != 0) {
                    return onextracallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static final class onWarmupCompleted implements onExtraCallback {
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;
                private final GraphicDeviceInfo IAuthTabCallback = GraphicDeviceInfo.Companion.onNavigationEvent();
                private final long onWarmupCompleted = AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallback_Parcel().IAuthTabCallbackStub();

                onWarmupCompleted() {
                }

                @Override // o.oExternalSyntheticLambda0.onExtraCallback
                public GraphicDeviceInfo IAuthTabCallback() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 31;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    GraphicDeviceInfo graphicDeviceInfo = this.IAuthTabCallback;
                    if (i3 == 0) {
                        int i4 = 93 / 0;
                    }
                    return graphicDeviceInfo;
                }

                @Override // o.oExternalSyntheticLambda0.onExtraCallback
                public long onExtraCallback() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 45;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 == 0) {
                        return this.onWarmupCompleted;
                    }
                    throw null;
                }
            }

            public final onExtraCallback IAuthTabCallback(long j) {
                int i = 2 % 2;
                AppLovinPostbackService appLovinPostbackService = AppLovinPostbackService.onExtraCallbackWithResult;
                if (AvoidCaptureProcessProgressAvailabilityCheckQuirk.onWarmupCompleted(j, appLovinPostbackService.asBinder().IAuthTabCallbackStub())) {
                    return asInterface;
                }
                Object obj = null;
                if (AvoidCaptureProcessProgressAvailabilityCheckQuirk.onWarmupCompleted(j, ((getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -242380979, 242380980, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{appLovinPostbackService}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent())).IAuthTabCallbackStub())) {
                    int i2 = onTransact + 23;
                    getInterfaceDescriptor = i2 % 128;
                    if (i2 % 2 != 0) {
                        return onExtraCallback;
                    }
                    obj.hashCode();
                    throw null;
                }
                if (AvoidCaptureProcessProgressAvailabilityCheckQuirk.onWarmupCompleted(j, appLovinPostbackService.access100().IAuthTabCallbackStub())) {
                    int i3 = getInterfaceDescriptor + 85;
                    onTransact = i3 % 128;
                    if (i3 % 2 == 0) {
                        return IAuthTabCallback;
                    }
                    throw null;
                }
                if (AvoidCaptureProcessProgressAvailabilityCheckQuirk.onWarmupCompleted(j, appLovinPostbackService.getInterfaceDescriptor().IAuthTabCallbackStub())) {
                    return onWarmupCompleted;
                }
                if (!AvoidCaptureProcessProgressAvailabilityCheckQuirk.onWarmupCompleted(j, ((getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{appLovinPostbackService}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent())).IAuthTabCallbackStub())) {
                    return !(AvoidCaptureProcessProgressAvailabilityCheckQuirk.onWarmupCompleted(j, appLovinPostbackService.IAuthTabCallback_Parcel().IAuthTabCallbackStub()) ^ true) ? asBinder : onWarmupCompleted;
                }
                int i4 = onTransact + 89;
                getInterfaceDescriptor = i4 % 128;
                if (i4 % 2 != 0) {
                    return onNavigationEvent;
                }
                throw null;
            }
        }
    }

    public static final class IAuthTabCallback {
        private static int IAuthTabCallbackStub = 1;
        private static int asBinder = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onTransact = 1;
        private final int onWarmupCompleted;
        public static final onExtraCallback Companion = new onExtraCallback(null);
        private static final IAuthTabCallback IAuthTabCallback = new IAuthTabCallback(0);
        private static final IAuthTabCallback onNavigationEvent = new IAuthTabCallback(1);
        private static final IAuthTabCallback onExtraCallback = new IAuthTabCallback(2);

        public IAuthTabCallback(int i) {
            this.onWarmupCompleted = i;
        }

        public static final /* synthetic */ IAuthTabCallback onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 37;
            onTransact = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            IAuthTabCallback iAuthTabCallback = IAuthTabCallback;
            int i4 = i2 + 1;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                return iAuthTabCallback;
            }
            obj.hashCode();
            throw null;
        }

        public static final /* synthetic */ IAuthTabCallback onNavigationEvent() {
            int i = 2 % 2;
            int i2 = asBinder + 27;
            int i3 = i2 % 128;
            onTransact = i3;
            int i4 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = onExtraCallback;
            int i5 = i3 + 11;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                return iAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final /* synthetic */ IAuthTabCallback onWarmupCompleted() {
            IAuthTabCallback iAuthTabCallback;
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 3;
            asBinder = i3 % 128;
            if (i3 % 2 != 0) {
                iAuthTabCallback = onNavigationEvent;
                int i4 = 60 / 0;
            } else {
                iAuthTabCallback = onNavigationEvent;
            }
            int i5 = i2 + 89;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                return iAuthTabCallback;
            }
            throw null;
        }

        public final int IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 125;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.onWarmupCompleted;
            int i6 = i2 + 17;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        public static final class onExtraCallback {
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private onExtraCallback() {
            }

            public final IAuthTabCallback onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 27;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult = IAuthTabCallback.onExtraCallbackWithResult();
                int i4 = onWarmupCompleted + 59;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return iAuthTabCallbackOnExtraCallbackWithResult;
            }

            public final IAuthTabCallback onExtraCallback() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 71;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    return IAuthTabCallback.onWarmupCompleted();
                }
                IAuthTabCallback.onWarmupCompleted();
                throw null;
            }

            public final IAuthTabCallback IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 95;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                IAuthTabCallback iAuthTabCallbackOnNavigationEvent = IAuthTabCallback.onNavigationEvent();
                if (i3 == 0) {
                    int i4 = 37 / 0;
                }
                return iAuthTabCallbackOnNavigationEvent;
            }

            public final IAuthTabCallback IAuthTabCallback(@NotNull List<IAuthTabCallback> list) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(list, "");
                int i2 = 0;
                Integer numValueOf = 0;
                int size = list.size();
                while (i2 < size) {
                    int i3 = onWarmupCompleted + 65;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    numValueOf = Integer.valueOf(numValueOf.intValue() | list.get(i2).IAuthTabCallback());
                    i2++;
                    int i5 = onNavigationEvent + 39;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                }
                return new IAuthTabCallback(numValueOf.intValue());
            }

            public final IAuthTabCallback onNavigationEvent(@NotNull IAuthTabCallback... iAuthTabCallbackArr) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 21;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(iAuthTabCallbackArr, "");
                IAuthTabCallback IAuthTabCallback = IAuthTabCallback(ArraysKt.toList(iAuthTabCallbackArr));
                int i4 = onNavigationEvent + 25;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return IAuthTabCallback;
            }
        }

        static {
            int i = onExtraCallbackWithResult + 73;
            IAuthTabCallbackStub = i % 128;
            int i2 = i % 2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
        
            if ((r5.onWarmupCompleted | r1) == r1) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
        
            if ((r5.onWarmupCompleted | r1) == r1) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
        
            r5 = o.oExternalSyntheticLambda0.IAuthTabCallback.onTransact + 9;
            o.oExternalSyntheticLambda0.IAuthTabCallback.asBinder = r5 % 128;
            r5 = r5 % 2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean onExtraCallbackWithResult(@NotNull IAuthTabCallback iAuthTabCallback) {
            int i = 2 % 2;
            int i2 = asBinder + 79;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
                int i3 = this.onWarmupCompleted;
                int i4 = 51 / 0;
            } else {
                Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
                int i5 = this.onWarmupCompleted;
            }
        }

        public String toString() {
            int i = 2 % 2;
            if (this.onWarmupCompleted == 0) {
                int i2 = onTransact + 125;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                return "TextButtonDecoration.None";
            }
            ArrayList arrayList = new ArrayList();
            if ((this.onWarmupCompleted & onNavigationEvent.onWarmupCompleted) != 0) {
                arrayList.add("Underline");
                int i4 = asBinder + 33;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
            }
            if ((this.onWarmupCompleted & onExtraCallback.onWarmupCompleted) != 0) {
                arrayList.add("Arrow");
            }
            if (arrayList.size() != 1) {
                return "TextButtonDecoration[" + AdvancedSessionProcessorExtensionMetadataMonitor.onNavigationEvent(arrayList, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null) + "]";
            }
            String str = "TextButtonDecoration." + arrayList.get(0);
            int i6 = asBinder + 53;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            return str;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 123;
            int i4 = i3 % 128;
            asBinder = i4;
            int i5 = i3 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IAuthTabCallback)) {
                int i6 = i2 + 19;
                asBinder = i6 % 128;
                return i6 % 2 != 0;
            }
            if (this.onWarmupCompleted == ((IAuthTabCallback) obj).onWarmupCompleted) {
                int i7 = i2 + 37;
                asBinder = i7 % 128;
                return i7 % 2 == 0;
            }
            int i8 = i4 + 23;
            onTransact = i8 % 128;
            if (i8 % 2 != 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int i;
            int i2 = 2 % 2;
            int i3 = asBinder + 9;
            int i4 = i3 % 128;
            onTransact = i4;
            if (i3 % 2 == 0) {
                i = this.onWarmupCompleted;
                int i5 = 80 / 0;
            } else {
                i = this.onWarmupCompleted;
            }
            int i6 = i4 + 35;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            return i;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onNavigationEvent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onNavigationEvent[] $VALUES;
        public static final onNavigationEvent Bottom;
        public static final onWarmupCompleted Companion;
        private static final onNavigationEvent Default;
        private static int IAuthTabCallback = 0;
        public static final onNavigationEvent Right;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted = 1;

        private static final /* synthetic */ onNavigationEvent[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 29;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            onNavigationEvent[] onnavigationeventArr = {Right, Bottom};
            int i5 = i2 + 53;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return onnavigationeventArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static EnumEntries<onNavigationEvent> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 17;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            EnumEntries<onNavigationEvent> enumEntries = $ENTRIES;
            int i5 = i3 + 29;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 21 / 0;
            }
            return enumEntries;
        }

        public static onNavigationEvent valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 99;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
            int i4 = onExtraCallback + 45;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return onnavigationevent;
            }
            throw null;
        }

        public static onNavigationEvent[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 117;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            onNavigationEvent[] onnavigationeventArr = (onNavigationEvent[]) $VALUES.clone();
            int i3 = onExtraCallback + 21;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return onnavigationeventArr;
        }

        private onNavigationEvent(String str, int i) {
        }

        public static final /* synthetic */ onNavigationEvent access$getDefault$cp() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 123;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return Default;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            onNavigationEvent onnavigationevent = new onNavigationEvent("Right", 0);
            Right = onnavigationevent;
            Bottom = new onNavigationEvent("Bottom", 1);
            onNavigationEvent[] onnavigationeventArr$values = $values();
            $VALUES = onnavigationeventArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
            Companion = new onWarmupCompleted(null);
            Default = onnavigationevent;
            int i = onWarmupCompleted + 79;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        public static final class onWarmupCompleted {
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private onWarmupCompleted() {
            }

            public final onNavigationEvent onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 105;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                onNavigationEvent onnavigationeventAccess$getDefault$cp = onNavigationEvent.access$getDefault$cp();
                if (i3 == 0) {
                    int i4 = 16 / 0;
                }
                return onnavigationeventAccess$getDefault$cp;
            }
        }
    }

    static {
        int i = onWarmupCompleted + 107;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }
}
