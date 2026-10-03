package viva.republica.toss.ads;

import java.util.Map;
import java.util.UUID;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.findRes;
import o.findResAndMsg;
import o.getPackageType;
import o.isNeedUnzip;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import o.setRandomHost;
import org.jetbrains.annotations.NotNull;

@Singleton
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RedirectionEventLogger {
    private final RedirectionLogFlushScheduler IAuthTabCallback;
    private final RedirectionLogStore onExtraCallbackWithResult;
    private final findResAndMsg onNavigationEvent;

    @Inject
    public RedirectionEventLogger(@NotNull RedirectionLogStore redirectionLogStore, @NotNull RedirectionLogFlushScheduler redirectionLogFlushScheduler) {
        Intrinsics.checkNotNullParameter(redirectionLogStore, "");
        Intrinsics.checkNotNullParameter(redirectionLogFlushScheduler, "");
        this.onExtraCallbackWithResult = redirectionLogStore;
        this.IAuthTabCallback = redirectionLogFlushScheduler;
        this.onNavigationEvent = findRes.onWarmupCompleted(isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null).plus(putChannelInfo.IAuthTabCallback()));
    }

    public final void onWarmupCompleted(long j, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        RedirectionLogStore redirectionLogStore = this.onExtraCallbackWithResult;
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        redirectionLogStore.IAuthTabCallback(new RedirectionLogRecord(string, j, map, System.currentTimeMillis(), 0, 16, (DefaultConstructorMarker) null));
        maybeUpdateAnimatable.onNavigationEvent(this.onNavigationEvent, (CoroutineContext) null, (setRandomHost) null, new RedirectionEventLogger$logAppLanding$1(this, null), 3, (Object) null);
    }
}
