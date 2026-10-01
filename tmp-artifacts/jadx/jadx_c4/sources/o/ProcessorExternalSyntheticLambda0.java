package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ProcessorExternalSyntheticLambda0 {
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private static int IAuthTabCallback = 0;
    private static int asInterface = 1;
    private static int onNavigationEvent = 1;
    private static int onTransact;
    private final String onExtraCallback;
    private final long onExtraCallbackWithResult;
    private final ProcessorExternalSyntheticLambda1 onWarmupCompleted;

    static {
        int i = onNavigationEvent + 5;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 39;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProcessorExternalSyntheticLambda0)) {
            int i5 = i3 + 119;
            asInterface = i5 % 128;
            if (i5 % 2 != 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        ProcessorExternalSyntheticLambda0 processorExternalSyntheticLambda0 = (ProcessorExternalSyntheticLambda0) obj;
        if (!Intrinsics.areEqual(this.onExtraCallback, processorExternalSyntheticLambda0.onExtraCallback) || this.onWarmupCompleted != processorExternalSyntheticLambda0.onWarmupCompleted) {
            return false;
        }
        if (this.onExtraCallbackWithResult == processorExternalSyntheticLambda0.onExtraCallbackWithResult) {
            return true;
        }
        int i6 = onTransact + 85;
        asInterface = i6 % 128;
        return i6 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = asInterface + 23;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.onExtraCallback.hashCode() * 31) + this.onWarmupCompleted.hashCode()) * 31) + Long.hashCode(this.onExtraCallbackWithResult);
        int i4 = onTransact + 125;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DeviceMetaInfo(deviceAddress=" + this.onExtraCallback + ", deviceOS=" + this.onWarmupCompleted + ", scannedTimestamp=" + this.onExtraCallbackWithResult + ")";
        int i2 = onTransact + 43;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ProcessorExternalSyntheticLambda0(@NotNull String str, @NotNull ProcessorExternalSyntheticLambda1 processorExternalSyntheticLambda1, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(processorExternalSyntheticLambda1, "");
        this.onExtraCallback = str;
        this.onWarmupCompleted = processorExternalSyntheticLambda1;
        this.onExtraCallbackWithResult = j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ProcessorExternalSyntheticLambda0(String str, ProcessorExternalSyntheticLambda1 processorExternalSyntheticLambda1, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            int i2 = onTransact + 119;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 80 / 0;
            }
            int i4 = 2 % 2;
            j = -1;
        }
        this(str, processorExternalSyntheticLambda1, j);
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface + 75;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ProcessorExternalSyntheticLambda1 onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 35;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        ProcessorExternalSyntheticLambda1 processorExternalSyntheticLambda1 = this.onWarmupCompleted;
        int i5 = i2 + 73;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return processorExternalSyntheticLambda1;
    }

    public static final class onExtraCallback {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final ProcessorExternalSyntheticLambda0 onExtraCallback(@NotNull ProcessorExternalSyntheticLambda0 processorExternalSyntheticLambda0) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(processorExternalSyntheticLambda0, "");
            ProcessorExternalSyntheticLambda0 processorExternalSyntheticLambda02 = new ProcessorExternalSyntheticLambda0(processorExternalSyntheticLambda0.onWarmupCompleted(), processorExternalSyntheticLambda0.onExtraCallbackWithResult(), System.currentTimeMillis());
            int i2 = onExtraCallbackWithResult + 107;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return processorExternalSyntheticLambda02;
            }
            throw null;
        }
    }
}
