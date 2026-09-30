package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AnrPluginCompanion {
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private double IAuthTabCallback;
    private double onExtraCallback;
    private double onExtraCallbackWithResult;
    private double onNavigationEvent;
    private double onWarmupCompleted;

    public AnrPluginCompanion(double d, double d2, double d3, double d4) {
        this.onNavigationEvent = d;
        this.IAuthTabCallback = d2;
        this.onExtraCallback = d3;
        this.onWarmupCompleted = d4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AnrPluginCompanion(double d, double d2, double d3, double d4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        double d5;
        double d6;
        if ((i & 4) != 0) {
            int i2 = IAuthTabCallbackDefault + 99;
            IAuthTabCallbackStub = i2 % 128;
            d5 = i2 % 2 == 0 ? 0.0d : 1.0d;
        } else {
            d5 = d3;
        }
        if ((i & 8) != 0) {
            int i3 = IAuthTabCallbackStub + 27;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            d6 = 0.0d;
        } else {
            d6 = d4;
        }
        this(d, d2, d5, d6);
    }

    public final double onNavigationEvent(double d) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 103;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        double d2 = this.onExtraCallback;
        double d3 = d2 / (this.IAuthTabCallback + d2);
        this.onExtraCallbackWithResult = d3;
        double d4 = this.onWarmupCompleted;
        double d5 = d4 + ((d - d4) * d3);
        this.onWarmupCompleted = d5;
        this.onExtraCallback = ((1.0d - d3) * d2) + this.onNavigationEvent;
        int i5 = i3 + 99;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 16 / 0;
        }
        return d5;
    }
}
