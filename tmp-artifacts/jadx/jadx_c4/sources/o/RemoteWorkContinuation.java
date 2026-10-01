package o;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class RemoteWorkContinuation {
    public static final int onExtraCallback = 0;

    public /* synthetic */ RemoteWorkContinuation(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class onExtraCallback extends RemoteWorkContinuation {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        private final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 29;
            int i4 = i3 % 128;
            onNavigationEvent = i4;
            int i5 = i3 % 2;
            if (this != obj) {
                if (obj instanceof onExtraCallback) {
                    return Intrinsics.areEqual(this.onWarmupCompleted, ((onExtraCallback) obj).onWarmupCompleted);
                }
                int i6 = i2 + 27;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            int i8 = i4 + 41;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 == 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 117;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            String str = this.onWarmupCompleted;
            if (i3 == 0) {
                return str.hashCode();
            }
            str.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "H4(text=" + this.onWarmupCompleted + ")";
            int i2 = IAuthTabCallback + 29;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.onWarmupCompleted = str;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 61;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private RemoteWorkContinuation() {
    }

    public static final class onExtraCallbackWithResult extends RemoteWorkContinuation {
        private static int onExtraCallbackWithResult = 0;
        private static int onTransact = 1;
        private final List<onNavigationEvent> IAuthTabCallback;
        private final boolean onNavigationEvent;
        private final int onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onTransact + 79;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (this == obj) {
                int i4 = i3 + 101;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                int i6 = i3 + 57;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            if (!Intrinsics.areEqual(this.IAuthTabCallback, onextracallbackwithresult.IAuthTabCallback)) {
                return false;
            }
            if (this.onWarmupCompleted == onextracallbackwithresult.onWarmupCompleted) {
                return this.onNavigationEvent == onextracallbackwithresult.onNavigationEvent;
            }
            int i8 = onTransact + 51;
            onExtraCallbackWithResult = i8 % 128;
            return i8 % 2 != 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 51;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((this.IAuthTabCallback.hashCode() * 31) + Integer.hashCode(this.onWarmupCompleted)) * 31) + Boolean.hashCode(this.onNavigationEvent);
            int i4 = onTransact + 45;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Ul(items=" + this.IAuthTabCallback + ", indentationLevel=" + this.onWarmupCompleted + ", isSmall=" + this.onNavigationEvent + ")";
            int i2 = onTransact + 19;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public final List<onNavigationEvent> onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 5;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            List<onNavigationEvent> list = this.IAuthTabCallback;
            int i5 = i2 + 65;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return list;
        }

        public final int IAuthTabCallback() {
            int i;
            int i2 = 2 % 2;
            int i3 = onTransact + 67;
            int i4 = i3 % 128;
            onExtraCallbackWithResult = i4;
            if (i3 % 2 != 0) {
                i = this.onWarmupCompleted;
                int i5 = 34 / 0;
            } else {
                i = this.onWarmupCompleted;
            }
            int i6 = i4 + 23;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            return i;
        }

        public final boolean onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 79;
            int i3 = i2 % 128;
            onTransact = i3;
            int i4 = i2 % 2;
            boolean z = this.onNavigationEvent;
            int i5 = i3 + 21;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }
    }

    public static final class onNavigationEvent extends RemoteWorkContinuation {
        private static int asBinder = 1;
        private static int onExtraCallbackWithResult;
        private final float IAuthTabCallback;
        private final boolean onNavigationEvent;
        private final String onWarmupCompleted;

        public /* synthetic */ onNavigationEvent(String str, float f, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, f, z);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = asBinder + 7;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 73;
                asBinder = i5 % 128;
                if (i5 % 2 != 0) {
                    return true;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (!(obj instanceof onNavigationEvent)) {
                int i6 = onExtraCallbackWithResult + 97;
                asBinder = i6 % 128;
                return i6 % 2 == 0;
            }
            onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
            if (!Intrinsics.areEqual(this.onWarmupCompleted, onnavigationevent.onWarmupCompleted)) {
                return false;
            }
            if (VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.IAuthTabCallback, onnavigationevent.IAuthTabCallback)) {
                return this.onNavigationEvent == onnavigationevent.onNavigationEvent;
            }
            int i7 = asBinder + 45;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 51;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((this.onWarmupCompleted.hashCode() * 31) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.IAuthTabCallback)) * 31) + Boolean.hashCode(this.onNavigationEvent);
            int i4 = asBinder + 109;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Li(text=" + this.onWarmupCompleted + ", paddingBottom=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.IAuthTabCallback) + ", isSmall=" + this.onNavigationEvent + ")";
            int i2 = asBinder + 15;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private onNavigationEvent(String str, float f, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.onWarmupCompleted = str;
            this.IAuthTabCallback = f;
            this.onNavigationEvent = z;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onNavigationEvent(String str, float f, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            DefaultConstructorMarker defaultConstructorMarker2 = null;
            if ((i & 2) != 0) {
                int i2 = onExtraCallbackWithResult + 43;
                asBinder = i2 % 128;
                if (i2 % 2 != 0) {
                    f = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f);
                    int i3 = asBinder + 3;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    int i5 = 2 % 2;
                } else {
                    VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f);
                    defaultConstructorMarker2.hashCode();
                    throw null;
                }
            }
            if ((i & 4) != 0) {
                int i6 = 2 % 2;
                z = true;
            }
            this(str, f, z, defaultConstructorMarker2);
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 95;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final float onNavigationEvent() {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 39;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            float f = this.IAuthTabCallback;
            int i5 = i2 + 117;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return f;
        }

        public final boolean onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 15;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            boolean z = this.onNavigationEvent;
            int i5 = i2 + 55;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }
    }

    public static final class IAuthTabCallback extends RemoteWorkContinuation {
        private static int onTransact = 1;
        private static int onWarmupCompleted;
        private final boolean IAuthTabCallback;
        private final float onExtraCallbackWithResult;
        private final hasProvider onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 115;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IAuthTabCallback)) {
                int i5 = i2 + 85;
                onTransact = i5 % 128;
                return i5 % 2 == 0;
            }
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) obj;
            if (Intrinsics.areEqual(this.onNavigationEvent, iAuthTabCallback.onNavigationEvent)) {
                return VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.onExtraCallbackWithResult, iAuthTabCallback.onExtraCallbackWithResult) && this.IAuthTabCallback == iAuthTabCallback.IAuthTabCallback;
            }
            int i6 = onTransact + 57;
            onWarmupCompleted = i6 % 128;
            return i6 % 2 != 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onTransact + 43;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((this.onNavigationEvent.hashCode() * 31) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.onExtraCallbackWithResult)) * 31) + Boolean.hashCode(this.IAuthTabCallback);
            int i4 = onTransact + 93;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ClickableLi(text=" + this.onNavigationEvent + ", paddingBottom=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.onExtraCallbackWithResult) + ", isSmall=" + this.IAuthTabCallback + ")";
            int i2 = onWarmupCompleted + 39;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 81 / 0;
            }
            return str;
        }

        public final hasProvider IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onTransact + 45;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                throw null;
            }
            hasProvider hasprovider = this.onNavigationEvent;
            int i4 = i3 + 59;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                return hasprovider;
            }
            obj.hashCode();
            throw null;
        }

        public final float onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 109;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            float f = this.onExtraCallbackWithResult;
            int i5 = i2 + 45;
            onTransact = i5 % 128;
            if (i5 % 2 != 0) {
                return f;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onTransact + 45;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return this.IAuthTabCallback;
            }
            throw null;
        }
    }

    public static final class onWarmupCompleted extends RemoteWorkContinuation {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        private final String onExtraCallbackWithResult;
        private final boolean onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = IAuthTabCallback + 25;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                int i4 = onNavigationEvent + 25;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
            if (Intrinsics.areEqual(this.onExtraCallbackWithResult, onwarmupcompleted.onExtraCallbackWithResult)) {
                return this.onWarmupCompleted == onwarmupcompleted.onWarmupCompleted;
            }
            int i6 = onNavigationEvent + 3;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 101;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (this.onExtraCallbackWithResult.hashCode() * 31) + Boolean.hashCode(this.onWarmupCompleted);
            int i4 = onNavigationEvent + 91;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Paragraph(text=" + this.onExtraCallbackWithResult + ", isSmall=" + this.onWarmupCompleted + ")";
            int i2 = IAuthTabCallback + 53;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 11;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            String str = this.onExtraCallbackWithResult;
            int i5 = i3 + 39;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final boolean IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 97;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            boolean z = this.onWarmupCompleted;
            int i5 = i3 + 97;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return z;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
