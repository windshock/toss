package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class WorkerUpdaterExternalSyntheticLambda2 {
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface;
    private final ProcessorExternalSyntheticLambda0 IAuthTabCallback;
    private final String IAuthTabCallbackDefault;
    private final String onExtraCallback;
    private final int onExtraCallbackWithResult;
    private final boolean onNavigationEvent;
    private final RescheduleMigration onTransact;
    private final boolean onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = asInterface + 103;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof WorkerUpdaterExternalSyntheticLambda2)) {
            return false;
        }
        WorkerUpdaterExternalSyntheticLambda2 workerUpdaterExternalSyntheticLambda2 = (WorkerUpdaterExternalSyntheticLambda2) obj;
        if (this.onTransact != workerUpdaterExternalSyntheticLambda2.onTransact) {
            int i4 = IAuthTabCallbackStub + 35;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.onExtraCallbackWithResult != workerUpdaterExternalSyntheticLambda2.onExtraCallbackWithResult) {
            int i6 = asInterface + 125;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.IAuthTabCallbackDefault, workerUpdaterExternalSyntheticLambda2.IAuthTabCallbackDefault)) {
            return Intrinsics.areEqual(this.IAuthTabCallback, workerUpdaterExternalSyntheticLambda2.IAuthTabCallback) && Intrinsics.areEqual(this.onExtraCallback, workerUpdaterExternalSyntheticLambda2.onExtraCallback) && this.onWarmupCompleted == workerUpdaterExternalSyntheticLambda2.onWarmupCompleted && this.onNavigationEvent == workerUpdaterExternalSyntheticLambda2.onNavigationEvent;
        }
        int i8 = asInterface + 35;
        IAuthTabCallbackStub = i8 % 128;
        return i8 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 65;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((this.onTransact.hashCode() * 31) + Integer.hashCode(this.onExtraCallbackWithResult)) * 31) + this.IAuthTabCallbackDefault.hashCode()) * 31) + this.IAuthTabCallback.hashCode()) * 31) + this.onExtraCallback.hashCode()) * 31) + Boolean.hashCode(this.onWarmupCompleted)) * 31) + Boolean.hashCode(this.onNavigationEvent);
        int i4 = IAuthTabCallbackStub + 77;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TossDeviceSearchResult(searchType=" + this.onTransact + ", rssi=" + this.onExtraCallbackWithResult + ", uuid=" + this.IAuthTabCallbackDefault + ", deviceMetaInfo=" + this.IAuthTabCallback + ", otherDeviceState=" + this.onExtraCallback + ", backgroundPushDisable=" + this.onWarmupCompleted + ", isPlaceDeviceMerchantBleKey=" + this.onNavigationEvent + ")";
        int i2 = asInterface + 15;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public WorkerUpdaterExternalSyntheticLambda2(@NotNull RescheduleMigration rescheduleMigration, int i, @NotNull String str, @NotNull ProcessorExternalSyntheticLambda0 processorExternalSyntheticLambda0, @NotNull String str2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(rescheduleMigration, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(processorExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.onTransact = rescheduleMigration;
        this.onExtraCallbackWithResult = i;
        this.IAuthTabCallbackDefault = str;
        this.IAuthTabCallback = processorExternalSyntheticLambda0;
        this.onExtraCallback = str2;
        this.onWarmupCompleted = z;
        this.onNavigationEvent = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ WorkerUpdaterExternalSyntheticLambda2(RescheduleMigration rescheduleMigration, int i, String str, ProcessorExternalSyntheticLambda0 processorExternalSyntheticLambda0, String str2, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z3;
        boolean z4 = (i2 & 32) != 0 ? false : z;
        if ((i2 & 64) != 0) {
            int i3 = IAuthTabCallbackStub;
            int i4 = i3 + 35;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 119;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            z3 = false;
        } else {
            z3 = z2;
        }
        this(rescheduleMigration, i, str, processorExternalSyntheticLambda0, str2, z4, z3);
    }

    public final RescheduleMigration onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface + 73;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onTransact;
        }
        throw null;
    }

    public final int onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 19;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.onExtraCallbackWithResult;
        int i6 = i2 + 7;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = asInterface + 7;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        String str = this.IAuthTabCallbackDefault;
        if (i3 == 0) {
            int i4 = 68 / 0;
        }
        return str;
    }

    public final ProcessorExternalSyntheticLambda0 onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 53;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        ProcessorExternalSyntheticLambda0 processorExternalSyntheticLambda0 = this.IAuthTabCallback;
        int i5 = i2 + 49;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return processorExternalSyntheticLambda0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 21;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.onExtraCallback;
        int i4 = i3 + 85;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 13;
        IAuthTabCallbackStub = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        boolean z = this.onWarmupCompleted;
        int i4 = i2 + 121;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 77;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
