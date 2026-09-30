package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class t8 implements reverseSize {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    private final Function1<Float, Float> IAuthTabCallback;
    private final Function0<Float> onExtraCallbackWithResult;
    private final boolean onNavigationEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public t8(@NotNull Function1<? super Float, Float> function1, @NotNull Function0<Float> function0, boolean z) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.IAuthTabCallback = function1;
        this.onExtraCallbackWithResult = function0;
        this.onNavigationEvent = z;
    }

    /* renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
    public long m100onPreScrollOzD1aCk(long j, int i) {
        int i2 = 2 % 2;
        if (!this.onNavigationEvent) {
            int i3 = onExtraCallback + 61;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return setUseCaseAttached.Companion.IAuthTabCallback();
        }
        if (sizeToRectF.onExtraCallback(i, sizeToRectF.Companion.onWarmupCompleted())) {
            int i5 = onExtraCallback + 91;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            float fFloatValue = ((Number) this.IAuthTabCallback.invoke(Float.valueOf(Float.intBitsToFloat((int) j)))).floatValue();
            return setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fFloatValue) & 4294967295L));
        }
        return setUseCaseAttached.Companion.IAuthTabCallback();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (o.sizeToRectF.onExtraCallback(r7, o.sizeToRectF.Companion.onWarmupCompleted()) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        r4 = o.t8.onWarmupCompleted + 41;
        o.t8.onExtraCallback = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        if ((r4 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        r3 = ((java.lang.Number) r2.onExtraCallbackWithResult.invoke()).floatValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005b, code lost:
    
        r3 = ((java.lang.Number) r2.onExtraCallbackWithResult.invoke()).floatValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007b, code lost:
    
        return o.setUseCaseAttached.IAuthTabCallback((java.lang.Float.floatToRawIntBits(r3) & 4294967295L) | (java.lang.Float.floatToRawIntBits(0.0f) << 32));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007c, code lost:
    
        r4 = o.setUseCaseAttached.Companion.IAuthTabCallback();
        r6 = o.t8.onWarmupCompleted + 109;
        o.t8.onExtraCallback = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008b, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0092, code lost:
    
        return o.setUseCaseAttached.Companion.IAuthTabCallback();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return o.setUseCaseAttached.IAuthTabCallback((java.lang.Float.floatToRawIntBits(1.0f) >> 12) / (java.lang.Float.floatToRawIntBits(r3) % 4294967295L));
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r2.onNavigationEvent == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if ((!r2.onNavigationEvent) != true) goto L9;
     */
    /* renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long m99onPostScrollDzOQY0M(long j, long j2, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 29;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 51 / 0;
        }
    }

    public Object IAuthTabCallback(long j, long j2, @NotNull access13800<? super RequestOptionConfig1> access13800Var) {
        long jOnExtraCallback;
        int i = 2 % 2;
        if (!this.onNavigationEvent) {
            int i2 = onWarmupCompleted + 39;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            jOnExtraCallback = RequestOptionConfig1.Companion.onExtraCallback();
        } else {
            this.onExtraCallbackWithResult.invoke();
            jOnExtraCallback = RequestOptionConfig1.Companion.onExtraCallback();
        }
        RequestOptionConfig1 requestOptionConfig1OnExtraCallbackWithResult = RequestOptionConfig1.onExtraCallbackWithResult(jOnExtraCallback);
        int i4 = onWarmupCompleted + 1;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return requestOptionConfig1OnExtraCallbackWithResult;
    }
}
