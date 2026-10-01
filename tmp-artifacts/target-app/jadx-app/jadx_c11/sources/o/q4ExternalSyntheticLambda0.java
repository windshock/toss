package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.q4ExternalSyntheticLambda2;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class q4ExternalSyntheticLambda0 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    public static /* synthetic */ CharSequence onWarmupCompleted(q4ExternalSyntheticLambda2.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        CharSequence charSequenceIAuthTabCallback = IAuthTabCallback(iAuthTabCallback);
        int i4 = onExtraCallback + 107;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 47 / 0;
        }
        return charSequenceIAuthTabCallback;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
    
        return new o.q4ExternalSyntheticLambda1("{} monitoring event drop: reason={}, droppedCount={}", kotlin.collections.CollectionsKt.listOf(new java.lang.Object[]{r10, r9.IAuthTabCallback(), java.lang.Integer.valueOf(r9.onWarmupCompleted())}));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        if ((r9 instanceof o.q4ExternalSyntheticLambda10.onExtraCallback) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        r9 = (o.q4ExternalSyntheticLambda10.onExtraCallback) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006e, code lost:
    
        return new o.q4ExternalSyntheticLambda1("{} monitoring event 생성 실패: errorCategory={}", kotlin.collections.CollectionsKt.listOf(new java.io.Serializable[]{r10, o.q4ExternalSyntheticLambda11.onExtraCallback(r9.onWarmupCompleted()), r9.onWarmupCompleted()}));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0071, code lost:
    
        if ((r9 instanceof o.q4ExternalSyntheticLambda10.onExtraCallbackWithResult) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a0, code lost:
    
        return new o.q4ExternalSyntheticLambda1("{} monitoring event contract 검증 실패: {}", kotlin.collections.CollectionsKt.listOf(new java.lang.String[]{r10, kotlin.collections.CollectionsKt.joinToString$default(((o.q4ExternalSyntheticLambda10.onExtraCallbackWithResult) r9).onExtraCallbackWithResult().onExtraCallback(), (java.lang.CharSequence) null, (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, new im.toss.securities.libs.performance.tracker.domain.monitoring.MonitoringDispatchFailureLogKt$$ExternalSyntheticLambda0(), 31, (java.lang.Object) null)}));
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a3, code lost:
    
        if ((r9 instanceof o.q4ExternalSyntheticLambda10.onNavigationEvent) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a5, code lost:
    
        r9 = (o.q4ExternalSyntheticLambda10.onNavigationEvent) r9;
        r10 = new o.q4ExternalSyntheticLambda1("{} monitoring event 전송 실패: errorCategory={}", kotlin.collections.CollectionsKt.listOf(new java.io.Serializable[]{r10, o.q4ExternalSyntheticLambda11.onExtraCallback(r9.onExtraCallbackWithResult()), r9.onExtraCallbackWithResult()}));
        r9 = o.q4ExternalSyntheticLambda0.onExtraCallback + 11;
        o.q4ExternalSyntheticLambda0.onNavigationEvent = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00cf, code lost:
    
        if ((r9 % 2) != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d1, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d3, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d9, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if ((r9 instanceof o.q4ExternalSyntheticLambda10.onWarmupCompleted) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if ((r9 instanceof o.q4ExternalSyntheticLambda10.onWarmupCompleted) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        r9 = (o.q4ExternalSyntheticLambda10.onWarmupCompleted) r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final q4ExternalSyntheticLambda1 IAuthTabCallback(@NotNull q4ExternalSyntheticLambda10 q4externalsyntheticlambda10, @NotNull String str) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(q4externalsyntheticlambda10, "");
            Intrinsics.checkNotNullParameter(str, "");
            int i3 = 45 / 0;
        } else {
            Intrinsics.checkNotNullParameter(q4externalsyntheticlambda10, "");
            Intrinsics.checkNotNullParameter(str, "");
        }
    }

    private static final CharSequence IAuthTabCallback(q4ExternalSyntheticLambda2.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            return iAuthTabCallback.onExtraCallbackWithResult();
        }
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        iAuthTabCallback.onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
