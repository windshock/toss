package im.toss.rn.toss.core.portal;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.adInfo;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.videoFrameChanged;
import o.vyl;
import o.wie2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class PortalRuntimeRecycleConfig {
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static int onTransact;
    private final long onExtraCallbackWithResult;
    private final boolean onNavigationEvent;
    private final int onWarmupCompleted;
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private static final PortalRuntimeRecycleConfig onExtraCallback = new PortalRuntimeRecycleConfig(false, 3, 10000);
    private static final wie2 IAuthTabCallback = videoFrameChanged.onWarmupCompleted((wie2) null, new Function1() { // from class: im.toss.rn.toss.core.portal.PortalRuntimeRecycleConfig$$ExternalSyntheticLambda0
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public final Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 67;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallbackWithResult = PortalRuntimeRecycleConfig.onExtraCallbackWithResult((adInfo) obj);
            int i4 = onNavigationEvent + 71;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 98 / 0;
            }
            return unitOnExtraCallbackWithResult;
        }
    }, 1, (Object) null);

    public static /* synthetic */ Unit onExtraCallbackWithResult(adInfo adinfo) {
        int i = 2 % 2;
        int i2 = asBinder + 87;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(adinfo);
        int i4 = IAuthTabCallbackStub + 49;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = asBinder + 47;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (!(obj instanceof PortalRuntimeRecycleConfig)) {
            return false;
        }
        PortalRuntimeRecycleConfig portalRuntimeRecycleConfig = (PortalRuntimeRecycleConfig) obj;
        if (this.onNavigationEvent != portalRuntimeRecycleConfig.onNavigationEvent) {
            int i3 = IAuthTabCallbackStub + 1;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (this.onWarmupCompleted != portalRuntimeRecycleConfig.onWarmupCompleted || this.onExtraCallbackWithResult != portalRuntimeRecycleConfig.onExtraCallbackWithResult) {
            return false;
        }
        int i5 = asBinder + 39;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = asBinder + 5;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((Boolean.hashCode(this.onNavigationEvent) * 31) + Integer.hashCode(this.onWarmupCompleted)) * 31) + Long.hashCode(this.onExtraCallbackWithResult);
        int i4 = IAuthTabCallbackStub + 5;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PortalRuntimeRecycleConfig(isEnabled=" + this.onNavigationEvent + ", sessionThreshold=" + this.onWarmupCompleted + ", idleDelayMillis=" + this.onExtraCallbackWithResult + ")";
        int i2 = asBinder + 19;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public PortalRuntimeRecycleConfig(boolean z, int i, long j) {
        this.onNavigationEvent = z;
        this.onWarmupCompleted = i;
        this.onExtraCallbackWithResult = j;
    }

    public static final /* synthetic */ PortalRuntimeRecycleConfig IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 87;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback;
        }
        throw null;
    }

    public static final /* synthetic */ wie2 onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 117;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        wie2 wie2Var = IAuthTabCallback;
        if (i3 != 0) {
            int i4 = 96 / 0;
        }
        return wie2Var;
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 19;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.onNavigationEvent;
        int i5 = i2 + 35;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final int onExtraCallback() {
        int i;
        int i2 = 2 % 2;
        int i3 = asBinder + 9;
        int i4 = i3 % 128;
        IAuthTabCallbackStub = i4;
        if (i3 % 2 == 0) {
            i = this.onWarmupCompleted;
            int i5 = 38 / 0;
        } else {
            i = this.onWarmupCompleted;
        }
        int i6 = i4 + 99;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 35;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallbackWithResult {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final PortalRuntimeRecycleConfig IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 99;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                PortalRuntimeRecycleConfig.IAuthTabCallback();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            PortalRuntimeRecycleConfig portalRuntimeRecycleConfigIAuthTabCallback = PortalRuntimeRecycleConfig.IAuthTabCallback();
            int i3 = onExtraCallback + 9;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return portalRuntimeRecycleConfigIAuthTabCallback;
        }

        public final PortalRuntimeRecycleConfig onExtraCallbackWithResult(@NotNull String str) {
            Object obj;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            String strOnNavigationEvent = onNavigationEvent(StringsKt.trim(str).toString());
            if (strOnNavigationEvent.length() == 0) {
                return IAuthTabCallback();
            }
            try {
                Result.Companion companion = Result.Companion;
                wie2 wie2VarOnWarmupCompleted = PortalRuntimeRecycleConfig.onWarmupCompleted();
                wie2VarOnWarmupCompleted.onExtraCallback();
                obj = Result.constructor-impl((Payload) wie2VarOnWarmupCompleted.onExtraCallback(Payload.Companion.serializer(), strOnNavigationEvent));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            Object obj2 = null;
            if (Result.onExtraCallback(obj)) {
                obj = null;
            }
            Payload payload = (Payload) obj;
            if (payload == null) {
                int i2 = IAuthTabCallback + 63;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return IAuthTabCallback();
                }
                IAuthTabCallback();
                obj2.hashCode();
                throw null;
            }
            if (!payload.onWarmupCompleted()) {
                return IAuthTabCallback();
            }
            if (payload.onExtraCallback() > 0 && payload.IAuthTabCallback() >= 0) {
                int i3 = IAuthTabCallback + 5;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                if (payload.IAuthTabCallback() <= 86400) {
                    return new PortalRuntimeRecycleConfig(true, payload.onExtraCallback(), payload.IAuthTabCallback() * 1000);
                }
            }
            return IAuthTabCallback();
        }

        private final String onNavigationEvent(String str) {
            Object obj;
            int i = 2 % 2;
            if (!StringsKt.startsWith$default(str, "\"", false, 2, (Object) null)) {
                int i2 = onExtraCallback + 43;
                int i3 = i2 % 128;
                IAuthTabCallback = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 5;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return str;
                }
                throw null;
            }
            try {
                Result.Companion companion = Result.Companion;
                wie2 wie2VarOnWarmupCompleted = PortalRuntimeRecycleConfig.onWarmupCompleted();
                wie2VarOnWarmupCompleted.onExtraCallback();
                obj = Result.constructor-impl((String) wie2VarOnWarmupCompleted.onExtraCallback(getWriggleLayout.onNavigationEvent, str));
                int i6 = onExtraCallback + 93;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            if (Result.onExtraCallback(obj)) {
                obj = "";
            }
            return (String) obj;
        }
    }

    static {
        int i = asInterface + 25;
        onTransact = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static final Unit onNavigationEvent(adInfo adinfo) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 17;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(adinfo, "");
        adinfo.IAuthTabCallback(true);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 19;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    @liq
    static final class Payload {
        public static final Companion Companion = new Companion(null);
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;
        private final boolean enabled;
        private final long idleDelaySeconds;
        private final int sessionThreshold;

        static {
            int i = onWarmupCompleted + 117;
            IAuthTabCallback = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        public Payload() {
            this(false, 0, 0L, 7, (DefaultConstructorMarker) null);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 75;
            int i4 = i3 % 128;
            onNavigationEvent = i4;
            int i5 = i3 % 2;
            if (this == obj) {
                int i6 = i2 + 111;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                return true;
            }
            if (!(obj instanceof Payload)) {
                int i8 = i4 + 103;
                onExtraCallbackWithResult = i8 % 128;
                return i8 % 2 == 0;
            }
            Payload payload = (Payload) obj;
            if (this.enabled != payload.enabled) {
                int i9 = i4 + 11;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
                return false;
            }
            if (this.sessionThreshold != payload.sessionThreshold || this.idleDelaySeconds != payload.idleDelaySeconds) {
                return false;
            }
            int i11 = i4 + 125;
            onExtraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 3;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((Boolean.hashCode(this.enabled) * 31) + Integer.hashCode(this.sessionThreshold)) * 31) + Long.hashCode(this.idleDelaySeconds);
            int i4 = onNavigationEvent + 51;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Payload(enabled=" + this.enabled + ", sessionThreshold=" + this.sessionThreshold + ", idleDelaySeconds=" + this.idleDelaySeconds + ")";
            int i2 = onExtraCallbackWithResult + 5;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public static final class Companion {
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Payload> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 69;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                PortalRuntimeRecycleConfig$Payload$$serializer portalRuntimeRecycleConfig$Payload$$serializer = PortalRuntimeRecycleConfig$Payload$$serializer.INSTANCE;
                int i4 = onExtraCallbackWithResult + 105;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return portalRuntimeRecycleConfig$Payload$$serializer;
            }
        }

        public /* synthetic */ Payload(int i, boolean z, int i2, long j, okycx okycxVar) {
            if ((i & 1) == 0) {
                int i3 = 2 % 2;
                z = false;
            }
            this.enabled = z;
            if ((i & 2) == 0) {
                int i4 = onNavigationEvent + 39;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                this.sessionThreshold = 3;
            } else {
                this.sessionThreshold = i2;
            }
            if ((i & 4) != 0) {
                this.idleDelaySeconds = j;
                return;
            }
            this.idleDelaySeconds = 10L;
            int i6 = onNavigationEvent + 105;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 64 / 0;
            }
        }

        public Payload(boolean z, int i, long j) {
            this.enabled = z;
            this.sessionThreshold = i;
            this.idleDelaySeconds = j;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onExtraCallback(Payload payload, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            if (vylVar.onWarmupCompleted(serialDescriptor, 0) || payload.enabled) {
                vylVar.onNavigationEvent(serialDescriptor, 0, payload.enabled);
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                vylVar.onExtraCallback(serialDescriptor, 1, payload.sessionThreshold);
            } else {
                int i2 = onExtraCallbackWithResult + 113;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                if (payload.sessionThreshold != 3) {
                }
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
                int i4 = onNavigationEvent + 71;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                if (payload.idleDelaySeconds != 10) {
                    vylVar.onExtraCallback(serialDescriptor, 2, payload.idleDelaySeconds);
                }
            }
            int i6 = onExtraCallbackWithResult + 113;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Payload(boolean z, int i, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i2 & 1) != 0) {
                int i3 = 2 % 2;
                z = false;
            }
            if ((i2 & 2) != 0) {
                int i4 = onNavigationEvent + 107;
                onExtraCallbackWithResult = i4 % 128;
                i = i4 % 2 == 0 ? 5 : 3;
                int i5 = 2 % 2;
            }
            if ((i2 & 4) != 0) {
                int i6 = onExtraCallbackWithResult + 33;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                int i8 = 2 % 2;
                j = 10;
            }
            this(z, i, j);
        }

        public final boolean onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 11;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return this.enabled;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 9;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.sessionThreshold;
            int i6 = i2 + 97;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 85 / 0;
            }
            return i5;
        }

        public final long IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 57;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return this.idleDelaySeconds;
            }
            int i3 = 27 / 0;
            return this.idleDelaySeconds;
        }
    }
}
