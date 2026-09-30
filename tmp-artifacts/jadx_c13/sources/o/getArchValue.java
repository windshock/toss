package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class getArchValue {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private final int IAuthTabCallback;
    private final int IAuthTabCallbackStub;
    private final int onExtraCallback;
    private final int onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private final int onTransact;
    private final int onWarmupCompleted;

    public getArchValue(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.onTransact = i;
        this.onWarmupCompleted = i2;
        this.onNavigationEvent = i3;
        this.onExtraCallback = i4;
        this.onExtraCallbackWithResult = i5;
        this.IAuthTabCallbackStub = i6;
        this.IAuthTabCallback = i7;
    }

    public final int IAuthTabCallbackDefault() {
        return this.onTransact;
    }

    public final int IAuthTabCallback() {
        return this.onWarmupCompleted;
    }

    public final int onExtraCallback() {
        return this.onNavigationEvent;
    }

    public final int onExtraCallbackWithResult() {
        return this.onExtraCallback;
    }

    public final int onWarmupCompleted() {
        return this.onExtraCallbackWithResult;
    }

    public final int IAuthTabCallbackStub() {
        return this.IAuthTabCallbackStub;
    }

    public final int onNavigationEvent() {
        return this.IAuthTabCallback;
    }

    public String toString() {
        return "UnboundLocalDateTime(" + this.onTransact + '-' + this.onWarmupCompleted + '-' + this.onNavigationEvent + ' ' + this.onExtraCallback + ':' + this.onExtraCallbackWithResult + ':' + this.IAuthTabCallbackStub + '.' + this.IAuthTabCallback + ')';
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public final getArchValue onExtraCallback(@NotNull setRevisionBytes setrevisionbytes) {
            long j;
            Intrinsics.checkNotNullParameter(setrevisionbytes, "");
            long jOnExtraCallback = setrevisionbytes.onExtraCallback();
            long j2 = jOnExtraCallback / 86400;
            if ((jOnExtraCallback ^ 86400) < 0 && j2 * 86400 != jOnExtraCallback) {
                j2--;
            }
            long j3 = jOnExtraCallback % 86400;
            int i = (int) (j3 + (86400 & (((j3 ^ 86400) & ((-j3) | j3)) >> 63)));
            long j4 = 719468 + j2;
            if (j4 < 0) {
                long j5 = ((j2 + 719469) / 146097) - 1;
                j = j5 * 400;
                j4 += (-j5) * 146097;
            } else {
                j = 0;
            }
            long j6 = ((j4 * 400) + 591) / 146097;
            long j7 = j4 - ((((j6 * 365) + (j6 / 4)) - (j6 / 100)) + (j6 / 400));
            if (j7 < 0) {
                j6--;
                j7 = j4 - ((((365 * j6) + (j6 / 4)) - (j6 / 100)) + (j6 / 400));
            }
            int i2 = (int) j7;
            int i3 = ((i2 * 5) + 2) / Imgproc.COLOR_RGBA2YUV_YVYU;
            int i4 = i / 3600;
            int i5 = i - (i4 * 3600);
            int i6 = i5 / 60;
            return new getArchValue((int) (j6 + j + (i3 / 10)), ((i3 + 2) % 12) + 1, (i2 - (((i3 * 306) + 5) / 10)) + 1, i4, i6, i5 - (i6 * 60), setrevisionbytes.onNavigationEvent());
        }
    }
}
