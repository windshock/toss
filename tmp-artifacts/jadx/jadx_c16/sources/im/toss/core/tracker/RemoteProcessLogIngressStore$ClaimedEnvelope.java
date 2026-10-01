package im.toss.core.tracker;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RemoteProcessLogIngressStore$ClaimedEnvelope {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private final File onExtraCallback;
    private final File onExtraCallbackWithResult;
    private final RemoteProcessLogEnvelope onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemoteProcessLogIngressStore$ClaimedEnvelope)) {
            return false;
        }
        RemoteProcessLogIngressStore$ClaimedEnvelope remoteProcessLogIngressStore$ClaimedEnvelope = (RemoteProcessLogIngressStore$ClaimedEnvelope) obj;
        if ((!Intrinsics.areEqual(this.onExtraCallbackWithResult, remoteProcessLogIngressStore$ClaimedEnvelope.onExtraCallbackWithResult)) || !Intrinsics.areEqual(this.onExtraCallback, remoteProcessLogIngressStore$ClaimedEnvelope.onExtraCallback)) {
            return false;
        }
        if (Intrinsics.areEqual(this.onWarmupCompleted, remoteProcessLogIngressStore$ClaimedEnvelope.onWarmupCompleted)) {
            return true;
        }
        int i3 = IAuthTabCallback + 105;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.onExtraCallbackWithResult.hashCode() * 31) + this.onExtraCallback.hashCode()) * 31) + this.onWarmupCompleted.hashCode();
        int i4 = onNavigationEvent + 21;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ClaimedEnvelope(finalFile=" + this.onExtraCallbackWithResult + ", processingFile=" + this.onExtraCallback + ", envelope=" + this.onWarmupCompleted + ")";
        int i2 = onNavigationEvent + 121;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public RemoteProcessLogIngressStore$ClaimedEnvelope(@NotNull File file, @NotNull File file2, @NotNull RemoteProcessLogEnvelope remoteProcessLogEnvelope) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(file2, "");
        Intrinsics.checkNotNullParameter(remoteProcessLogEnvelope, "");
        this.onExtraCallbackWithResult = file;
        this.onExtraCallback = file2;
        this.onWarmupCompleted = remoteProcessLogEnvelope;
    }

    public final RemoteProcessLogEnvelope onExtraCallbackWithResult() {
        RemoteProcessLogEnvelope remoteProcessLogEnvelope;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 95;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            remoteProcessLogEnvelope = this.onWarmupCompleted;
            int i4 = 63 / 0;
        } else {
            remoteProcessLogEnvelope = this.onWarmupCompleted;
        }
        int i5 = i2 + 125;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return remoteProcessLogEnvelope;
    }

    public final void onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            this.onExtraCallback.delete();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.onExtraCallback.delete()) {
            return;
        }
        this.onExtraCallback.deleteOnExit();
        int i3 = IAuthTabCallback + 95;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        File file = this.onExtraCallback;
        if (i3 == 0) {
            file.renameTo(this.onExtraCallbackWithResult);
        } else {
            file.renameTo(this.onExtraCallbackWithResult);
            throw null;
        }
    }
}
