package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.random.RandomKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class getMemoryDumpOrBuilder extends Random {
    public abstract java.util.Random onWarmupCompleted();

    @Override // kotlin.random.Random
    public int onExtraCallback(int i) {
        return RandomKt.IAuthTabCallback(onWarmupCompleted().nextInt(), i);
    }

    @Override // kotlin.random.Random
    public int onNavigationEvent() {
        return onWarmupCompleted().nextInt();
    }

    @Override // kotlin.random.Random
    public int onExtraCallbackWithResult(int i) {
        return onWarmupCompleted().nextInt(i);
    }

    @Override // kotlin.random.Random
    public long IAuthTabCallbackDefault() {
        return onWarmupCompleted().nextLong();
    }

    @Override // kotlin.random.Random
    public boolean onExtraCallback() {
        return onWarmupCompleted().nextBoolean();
    }

    @Override // kotlin.random.Random
    public double IAuthTabCallback() {
        return onWarmupCompleted().nextDouble();
    }

    @Override // kotlin.random.Random
    public float onExtraCallbackWithResult() {
        return onWarmupCompleted().nextFloat();
    }

    @Override // kotlin.random.Random
    public byte[] onExtraCallbackWithResult(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        onWarmupCompleted().nextBytes(bArr);
        return bArr;
    }
}
