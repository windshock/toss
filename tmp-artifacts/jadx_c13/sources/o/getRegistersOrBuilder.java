package o;

import java.io.InvalidObjectException;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.random.RandomKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getRegistersOrBuilder extends Random implements Serializable {
    private static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    private static final long serialVersionUID = 0;
    private int addend;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    public getRegistersOrBuilder(int i, int i2, int i3, int i4, int i5, int i6) {
        this.x = i;
        this.y = i2;
        this.z = i3;
        this.w = i4;
        this.v = i5;
        this.addend = i6;
        onWarmupCompleted();
        for (int i7 = 0; i7 < 64; i7++) {
            onNavigationEvent();
        }
    }

    public getRegistersOrBuilder(int i, int i2) {
        this(i, i2, 0, 0, ~i, (i << 10) ^ (i2 >>> 4));
    }

    private final void onWarmupCompleted() {
        if ((this.x | this.y | this.z | this.w | this.v) == 0) {
            throw new IllegalArgumentException("Initial state must have at least one non-zero element.");
        }
    }

    private final Object readResolve() throws Throwable {
        try {
            onWarmupCompleted();
            return this;
        } catch (Throwable th) {
            Throwable thInitCause = new InvalidObjectException(th.getMessage()).initCause(th);
            Intrinsics.checkNotNullExpressionValue(thInitCause, "");
            throw thInitCause;
        }
    }

    @Override // kotlin.random.Random
    public int onNavigationEvent() {
        int i = this.x;
        int i2 = i ^ (i >>> 2);
        this.x = this.y;
        this.y = this.z;
        this.z = this.w;
        int i3 = this.v;
        this.w = i3;
        int i4 = ((i2 ^ (i2 << 1)) ^ i3) ^ (i3 << 4);
        this.v = i4;
        int i5 = this.addend + 362437;
        this.addend = i5;
        return i4 + i5;
    }

    @Override // kotlin.random.Random
    public int onExtraCallback(int i) {
        return RandomKt.IAuthTabCallback(onNavigationEvent(), i);
    }

    static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }
}
