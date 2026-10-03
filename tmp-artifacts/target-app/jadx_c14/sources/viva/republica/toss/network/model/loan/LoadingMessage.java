package viva.republica.toss.network.model.loan;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class LoadingMessage {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final long end;
    private final String message;
    private final long start;

    static {
        int i = onWarmupCompleted + 113;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadingMessage)) {
            int i2 = onExtraCallbackWithResult + 59;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        LoadingMessage loadingMessage = (LoadingMessage) obj;
        if (!Intrinsics.areEqual(this.message, loadingMessage.message)) {
            return false;
        }
        if (this.start == loadingMessage.start) {
            return this.end == loadingMessage.end;
        }
        int i4 = IAuthTabCallback + 15;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 107;
        onExtraCallbackWithResult = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (((this.message.hashCode() << 127) * Long.hashCode(this.start)) << 45) >> Long.hashCode(this.end) : (((this.message.hashCode() * 31) + Long.hashCode(this.start)) * 31) + Long.hashCode(this.end);
        int i3 = IAuthTabCallback + 11;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoadingMessage(message=" + this.message + ", start=" + this.start + ", end=" + this.end + ")";
        int i2 = onExtraCallbackWithResult + 1;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LoadingMessage> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 97;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            LoadingMessage$$serializer loadingMessage$$serializer = LoadingMessage$$serializer.INSTANCE;
            int i4 = onExtraCallbackWithResult + 121;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return loadingMessage$$serializer;
            }
            throw null;
        }
    }

    public /* synthetic */ LoadingMessage(int i, String str, long j, long j2, okycx okycxVar) {
        if (7 != (i & 7)) {
            int i2 = IAuthTabCallback + 125;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 7, LoadingMessage$$serializer.INSTANCE.getDescriptor());
            int i4 = onExtraCallbackWithResult + 77;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.message = str;
        this.start = j;
        this.end = j2;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(LoadingMessage loadingMessage, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            vylVar.onExtraCallback(serialDescriptor, 1, loadingMessage.message);
            vylVar.onExtraCallback(serialDescriptor, 1, loadingMessage.start);
            vylVar.onExtraCallback(serialDescriptor, 5, loadingMessage.end);
        } else {
            vylVar.onExtraCallback(serialDescriptor, 0, loadingMessage.message);
            vylVar.onExtraCallback(serialDescriptor, 1, loadingMessage.start);
            vylVar.onExtraCallback(serialDescriptor, 2, loadingMessage.end);
        }
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.message;
        int i5 = i3 + 65;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        long j = this.start;
        int i4 = i3 + 29;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.end;
        }
        int i3 = 70 / 0;
        return this.end;
    }
}
