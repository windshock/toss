package viva.republica.toss.network.model.transfer.periodic;

import java.util.Date;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.CommonModule_closeView;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.periodic.PeriodicTransferCalculateResp;
import viva.republica.toss.network.model.transfer.periodic.PeriodicTransferCalculateResp$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PeriodicTransferCalculateResp {
    public static final Companion Companion = new Companion(null);
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final Lazy nextTransferDate$delegate;
    private final String nextTransferDateInString;
    private final String noNextTransferDateReason;

    static {
        int i = onExtraCallbackWithResult + 75;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PeriodicTransferCalculateResp() {
        String str = null;
        this(str, str, 3, (DefaultConstructorMarker) str);
    }

    public static /* synthetic */ onWarmupCompleted onExtraCallbackWithResult(PeriodicTransferCalculateResp periodicTransferCalculateResp) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(periodicTransferCalculateResp);
        }
        onWarmupCompleted(periodicTransferCalculateResp);
        throw null;
    }

    public static /* synthetic */ onWarmupCompleted onNavigationEvent(PeriodicTransferCalculateResp periodicTransferCalculateResp) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(periodicTransferCalculateResp);
        }
        onExtraCallback(periodicTransferCalculateResp);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        onWarmupCompleted = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PeriodicTransferCalculateResp)) {
            return false;
        }
        PeriodicTransferCalculateResp periodicTransferCalculateResp = (PeriodicTransferCalculateResp) obj;
        if (Intrinsics.areEqual(this.nextTransferDateInString, periodicTransferCalculateResp.nextTransferDateInString)) {
            if (Intrinsics.areEqual(this.noNextTransferDateReason, periodicTransferCalculateResp.noNextTransferDateReason)) {
                return true;
            }
            int i3 = onNavigationEvent + 99;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        int i4 = onWarmupCompleted + 97;
        int i5 = i4 % 128;
        onNavigationEvent = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 35;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 59;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.nextTransferDateInString;
        if (str == null) {
            int i5 = i2 + 83;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.noNextTransferDateReason;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PeriodicTransferCalculateResp(nextTransferDateInString=" + this.nextTransferDateInString + ", noNextTransferDateReason=" + this.noNextTransferDateReason + ")";
        int i2 = onWarmupCompleted + 39;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PeriodicTransferCalculateResp> serializer() {
            PeriodicTransferCalculateResp$.serializer serializerVar;
            int i = 2 % 2;
            int i2 = onExtraCallback + 103;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                serializerVar = PeriodicTransferCalculateResp$.serializer.INSTANCE;
                int i3 = 80 / 0;
            } else {
                serializerVar = PeriodicTransferCalculateResp$.serializer.INSTANCE;
            }
            int i4 = onExtraCallback + 7;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    public /* synthetic */ PeriodicTransferCalculateResp(int i, String str, String str2, okycx okycxVar) {
        Object obj = null;
        if ((i & 1) == 0) {
            this.nextTransferDateInString = null;
            int i2 = 2 % 2;
        } else {
            this.nextTransferDateInString = str;
        }
        if ((i & 2) == 0) {
            this.noNextTransferDateReason = null;
        } else {
            this.noNextTransferDateReason = str2;
            int i3 = onWarmupCompleted + 87;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        }
        this.nextTransferDate$delegate = LazyKt.onExtraCallbackWithResult(new PeriodicTransferCalculateResp$.ExternalSyntheticLambda1(this));
        int i6 = onWarmupCompleted + 57;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public PeriodicTransferCalculateResp(@Nullable String str, @Nullable String str2) {
        this.nextTransferDateInString = str;
        this.noNextTransferDateReason = str2;
        this.nextTransferDate$delegate = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.network.model.transfer.periodic.PeriodicTransferCalculateResp$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 49;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                PeriodicTransferCalculateResp.onWarmupCompleted onwarmupcompletedOnNavigationEvent = PeriodicTransferCalculateResp.onNavigationEvent(this.f$0);
                int i4 = onNavigationEvent + 57;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return onwarmupcompletedOnNavigationEvent;
                }
                throw null;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(viva.republica.toss.network.model.transfer.periodic.PeriodicTransferCalculateResp r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            r1 = 0
            boolean r2 = r6.onWarmupCompleted(r7, r1)
            r3 = 1
            if (r2 != 0) goto L22
            int r2 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferCalculateResp.onWarmupCompleted
            int r2 = r2 + 107
            int r4 = r2 % 128
            viva.republica.toss.network.model.transfer.periodic.PeriodicTransferCalculateResp.onNavigationEvent = r4
            int r2 = r2 % r0
            if (r2 == 0) goto L1b
            java.lang.String r2 = r5.nextTransferDateInString
            if (r2 == 0) goto L35
            goto L22
        L1b:
            java.lang.String r5 = r5.nextTransferDateInString
            r5 = 0
            r5.hashCode()
            throw r5
        L22:
            o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r4 = r5.nextTransferDateInString
            r6.onExtraCallbackWithResult(r7, r1, r2, r4)
            int r1 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferCalculateResp.onWarmupCompleted
            int r1 = r1 + r3
            int r2 = r1 % 128
            viva.republica.toss.network.model.transfer.periodic.PeriodicTransferCalculateResp.onNavigationEvent = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L35
            int r0 = r0 % 4
        L35:
            boolean r0 = r6.onWarmupCompleted(r7, r3)
            if (r0 != 0) goto L3f
            java.lang.String r0 = r5.noNextTransferDateReason
            if (r0 == 0) goto L46
        L3f:
            o.getWriggleLayout r0 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r5 = r5.noNextTransferDateReason
            r6.onExtraCallbackWithResult(r7, r3, r0, r5)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.periodic.PeriodicTransferCalculateResp.onExtraCallbackWithResult(viva.republica.toss.network.model.transfer.periodic.PeriodicTransferCalculateResp, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PeriodicTransferCalculateResp(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj = null;
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 61;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i3 = 2 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i4 = onNavigationEvent + 71;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            int i5 = 2 % 2;
            str2 = null;
        }
        this(str, str2);
    }

    public final onWarmupCompleted onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) this.nextTransferDate$delegate.getValue();
        int i4 = onWarmupCompleted + 5;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return onwarmupcompleted;
    }

    private static final onWarmupCompleted onExtraCallback(PeriodicTransferCalculateResp periodicTransferCalculateResp) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if (periodicTransferCalculateResp.nextTransferDateInString == null) {
            onWarmupCompleted.onExtraCallback onextracallback = new onWarmupCompleted.onExtraCallback(periodicTransferCalculateResp.noNextTransferDateReason);
            int i4 = onNavigationEvent + 73;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return onextracallback;
        }
        try {
            Date date = CommonModule_closeView.onWarmupCompleted.access000().parse(periodicTransferCalculateResp.nextTransferDateInString);
            Intrinsics.checkNotNull(date);
            return new onWarmupCompleted.onNavigationEvent(date);
        } catch (Throwable th) {
            return new onWarmupCompleted.IAuthTabCallback(th);
        }
    }

    private static final onWarmupCompleted onWarmupCompleted(PeriodicTransferCalculateResp periodicTransferCalculateResp) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if (periodicTransferCalculateResp.nextTransferDateInString == null) {
            onWarmupCompleted.onExtraCallback onextracallback = new onWarmupCompleted.onExtraCallback(periodicTransferCalculateResp.noNextTransferDateReason);
            int i4 = onNavigationEvent + 39;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return onextracallback;
        }
        try {
            Date date = CommonModule_closeView.onWarmupCompleted.access000().parse(periodicTransferCalculateResp.nextTransferDateInString);
            Intrinsics.checkNotNull(date);
            return new onWarmupCompleted.onNavigationEvent(date);
        } catch (Throwable th) {
            return new onWarmupCompleted.IAuthTabCallback(th);
        }
    }

    public static abstract class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class onNavigationEvent extends onWarmupCompleted {
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;
            private final Date date;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onNavigationEvent(@NotNull Date date) {
                super(null);
                Intrinsics.checkNotNullParameter(date, "");
                this.date = date;
            }

            public final Date onExtraCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 55;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                int i4 = i2 % 2;
                Date date = this.date;
                int i5 = i3 + 61;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return date;
            }
        }

        private onWarmupCompleted() {
        }

        public static final class onExtraCallback extends onWarmupCompleted {
            private final String message;

            public onExtraCallback(@Nullable String str) {
                super(null);
                this.message = str;
            }
        }

        public static final class IAuthTabCallback extends onWarmupCompleted {
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;
            private final Throwable throwable;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IAuthTabCallback(@NotNull Throwable th) {
                super(null);
                Intrinsics.checkNotNullParameter(th, "");
                this.throwable = th;
            }

            public final Throwable onNavigationEvent() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 121;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                int i4 = i2 % 2;
                Throwable th = this.throwable;
                int i5 = i3 + 33;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return th;
                }
                throw null;
            }
        }
    }
}
