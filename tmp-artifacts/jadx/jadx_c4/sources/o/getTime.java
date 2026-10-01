package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class getTime {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;

    public /* synthetic */ getTime(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract enableNebulaServiceInitOpt IAuthTabCallback();

    private getTime() {
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 57;
        onWarmupCompleted = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            int i4 = 33 / 0;
            if (this instanceof onNavigationEvent) {
                int i5 = i2 + 23;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    ((onNavigationEvent) this).onNavigationEvent();
                    obj.hashCode();
                    throw null;
                }
                if (((onNavigationEvent) this).onNavigationEvent() > 0) {
                    return true;
                }
            }
        } else if (this instanceof onNavigationEvent) {
        }
        int i6 = IAuthTabCallback + 27;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public static final class onExtraCallbackWithResult extends getTime {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        private final enableNebulaServiceInitOpt onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallbackWithResult + 5;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                return false;
            }
            if (this.onNavigationEvent == ((onExtraCallbackWithResult) obj).onNavigationEvent) {
                return true;
            }
            int i4 = onExtraCallbackWithResult + 1;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 57;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.onNavigationEvent.hashCode();
            int i4 = IAuthTabCallback + 75;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Empty(creditBureauType=" + this.onNavigationEvent + ")";
            int i2 = IAuthTabCallback + 101;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallbackWithResult(@NotNull enableNebulaServiceInitOpt enablenebulaserviceinitopt) {
            super(null);
            Intrinsics.checkNotNullParameter(enablenebulaserviceinitopt, "");
            this.onNavigationEvent = enablenebulaserviceinitopt;
        }

        @Override // o.getTime
        public enableNebulaServiceInitOpt IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 123;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            enableNebulaServiceInitOpt enablenebulaserviceinitopt = this.onNavigationEvent;
            int i5 = i2 + 51;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return enablenebulaserviceinitopt;
            }
            throw null;
        }
    }

    public static final class onExtraCallback extends getTime {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        private final enableNebulaServiceInitOpt onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 51;
            int i4 = i3 % 128;
            IAuthTabCallback = i4;
            if (i3 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallback)) {
                int i5 = i4 + 3;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            if (this.onWarmupCompleted != ((onExtraCallback) obj).onWarmupCompleted) {
                return false;
            }
            int i7 = i2 + 53;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 59;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.onWarmupCompleted.hashCode();
            int i4 = IAuthTabCallback + 9;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Maintenance(creditBureauType=" + this.onWarmupCompleted + ")";
            int i2 = onExtraCallbackWithResult + 53;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(@NotNull enableNebulaServiceInitOpt enablenebulaserviceinitopt) {
            super(null);
            Intrinsics.checkNotNullParameter(enablenebulaserviceinitopt, "");
            this.onWarmupCompleted = enablenebulaserviceinitopt;
        }

        @Override // o.getTime
        public enableNebulaServiceInitOpt IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 5;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            enableNebulaServiceInitOpt enablenebulaserviceinitopt = this.onWarmupCompleted;
            int i5 = i3 + 9;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return enablenebulaserviceinitopt;
        }
    }

    public static final class IAuthTabCallback extends getTime {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        private final enableNebulaServiceInitOpt onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onNavigationEvent + 27;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof IAuthTabCallback)) {
                return false;
            }
            if (this.onWarmupCompleted == ((IAuthTabCallback) obj).onWarmupCompleted) {
                return true;
            }
            int i4 = IAuthTabCallback + 105;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 125;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.onWarmupCompleted.hashCode();
            int i4 = onNavigationEvent + 23;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "UnknownDI(creditBureauType=" + this.onWarmupCompleted + ")";
            int i2 = onNavigationEvent + 99;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 36 / 0;
            }
            return str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(@NotNull enableNebulaServiceInitOpt enablenebulaserviceinitopt) {
            super(null);
            Intrinsics.checkNotNullParameter(enablenebulaserviceinitopt, "");
            this.onWarmupCompleted = enablenebulaserviceinitopt;
        }

        @Override // o.getTime
        public enableNebulaServiceInitOpt IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 83;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            enableNebulaServiceInitOpt enablenebulaserviceinitopt = this.onWarmupCompleted;
            int i4 = i2 + 113;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 11 / 0;
            }
            return enablenebulaserviceinitopt;
        }
    }

    public static final class onNavigationEvent extends getTime {
        private static int IAuthTabCallbackDefault = 1;
        private static int IAuthTabCallbackStub;
        private final enableNebulaServiceInitOpt IAuthTabCallback;
        private final enableOverridePendingTransition asBinder;
        private final float asInterface;
        private final boolean onExtraCallback;
        private final boolean onExtraCallbackWithResult;
        private final Integer onNavigationEvent;
        private final int onTransact;
        private final boolean onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 103;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            int i4 = i2 % 2;
            if (this == obj) {
                int i5 = i3 + 117;
                IAuthTabCallbackDefault = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            if (!(obj instanceof onNavigationEvent)) {
                int i7 = i3 + 121;
                IAuthTabCallbackDefault = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
            if (this.IAuthTabCallback != onnavigationevent.IAuthTabCallback) {
                return false;
            }
            if (this.onTransact != onnavigationevent.onTransact) {
                int i9 = i3 + 105;
                IAuthTabCallbackDefault = i9 % 128;
                return i9 % 2 == 0;
            }
            if (Float.compare(this.asInterface, onnavigationevent.asInterface) != 0 || this.onExtraCallbackWithResult != onnavigationevent.onExtraCallbackWithResult) {
                return false;
            }
            if (!Intrinsics.areEqual(this.onNavigationEvent, onnavigationevent.onNavigationEvent)) {
                int i10 = IAuthTabCallbackDefault + 25;
                IAuthTabCallbackStub = i10 % 128;
                int i11 = i10 % 2;
                return false;
            }
            if (this.onWarmupCompleted != onnavigationevent.onWarmupCompleted) {
                return false;
            }
            if (this.onExtraCallback == onnavigationevent.onExtraCallback) {
                return this.asBinder == onnavigationevent.asBinder;
            }
            int i12 = IAuthTabCallbackStub + 1;
            IAuthTabCallbackDefault = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 71;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                this.IAuthTabCallback.hashCode();
                Integer.hashCode(this.onTransact);
                Float.hashCode(this.asInterface);
                Boolean.hashCode(this.onExtraCallbackWithResult);
                throw null;
            }
            int iHashCode2 = this.IAuthTabCallback.hashCode();
            int iHashCode3 = Integer.hashCode(this.onTransact);
            int iHashCode4 = Float.hashCode(this.asInterface);
            int iHashCode5 = Boolean.hashCode(this.onExtraCallbackWithResult);
            Integer num = this.onNavigationEvent;
            if (num == null) {
                int i3 = IAuthTabCallbackDefault + 67;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
                iHashCode = 0;
            } else {
                iHashCode = num.hashCode();
            }
            return (((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode) * 31) + Boolean.hashCode(this.onWarmupCompleted)) * 31) + Boolean.hashCode(this.onExtraCallback)) * 31) + this.asBinder.hashCode();
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Score(creditBureauType=" + this.IAuthTabCallback + ", score=" + this.onTransact + ", percent=" + this.asInterface + ", isMaintenance=" + this.onExtraCallbackWithResult + ", originScore=" + this.onNavigationEvent + ", animate=" + this.onWarmupCompleted + ", isRaised=" + this.onExtraCallback + ", scoreChangeDirection=" + this.asBinder + ")";
            int i2 = IAuthTabCallbackStub + 45;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onNavigationEvent(@NotNull enableNebulaServiceInitOpt enablenebulaserviceinitopt, int i, float f, boolean z, @Nullable Integer num, boolean z2, boolean z3, @NotNull enableOverridePendingTransition enableoverridependingtransition) {
            super(null);
            Intrinsics.checkNotNullParameter(enablenebulaserviceinitopt, "");
            Intrinsics.checkNotNullParameter(enableoverridependingtransition, "");
            this.IAuthTabCallback = enablenebulaserviceinitopt;
            this.onTransact = i;
            this.asInterface = f;
            this.onExtraCallbackWithResult = z;
            this.onNavigationEvent = num;
            this.onWarmupCompleted = z2;
            this.onExtraCallback = z3;
            this.asBinder = enableoverridependingtransition;
        }

        @Override // o.getTime
        public enableNebulaServiceInitOpt IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 93;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            enableNebulaServiceInitOpt enablenebulaserviceinitopt = this.IAuthTabCallback;
            int i5 = i2 + 121;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 == 0) {
                return enablenebulaserviceinitopt;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 53;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onTransact;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 65;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            int i4 = i2 % 2;
            boolean z = this.onExtraCallbackWithResult;
            int i5 = i3 + 41;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }

        public final boolean onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 35;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (this.onTransact > 0) {
                return false;
            }
            int i4 = i2 + 91;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 90 / 0;
            }
            return true;
        }

        public final boolean IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 83;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                onExtraCallback();
                throw null;
            }
            if (onExtraCallback() || this.onExtraCallbackWithResult) {
                return false;
            }
            int i3 = IAuthTabCallbackDefault + 71;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
    }

    public static final class onWarmupCompleted extends getTime {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        private final enableNebulaServiceInitOpt onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallback + 101;
                IAuthTabCallback = i2 % 128;
                return i2 % 2 != 0;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                return false;
            }
            if (this.onWarmupCompleted != ((onWarmupCompleted) obj).onWarmupCompleted) {
                int i3 = onExtraCallback + 77;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            int i5 = IAuthTabCallback + 51;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return true;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 63;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.onWarmupCompleted.hashCode();
            int i4 = IAuthTabCallback + 37;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ConnectScore(creditBureauType=" + this.onWarmupCompleted + ")";
            int i2 = onExtraCallback + 9;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(@NotNull enableNebulaServiceInitOpt enablenebulaserviceinitopt) {
            super(null);
            Intrinsics.checkNotNullParameter(enablenebulaserviceinitopt, "");
            this.onWarmupCompleted = enablenebulaserviceinitopt;
        }

        @Override // o.getTime
        public enableNebulaServiceInitOpt IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 73;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onWarmupCompleted;
            }
            throw null;
        }
    }
}
