package o;

import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFh1hSDK {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    public static final findResAndMsg onExtraCallbackWithResult(@NotNull findResAndMsg findresandmsg, @Nullable GeckoHubImp geckoHubImp, boolean z, @Nullable Function2<? super CoroutineContext, ? super Throwable, Unit> function2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(findresandmsg, "");
        getPackageType getpackagetype = (getPackageType) findresandmsg.getCoroutineContext().get(getPackageType.onNavigationEvent);
        CoroutineContext coroutineContextIAuthTabCallback = z ? isNeedUnzip.IAuthTabCallback(getpackagetype) : getFullPackage.onExtraCallbackWithResult(getpackagetype);
        if (geckoHubImp == null) {
            geckoHubImp = (GeckoHubImp) findresandmsg.getCoroutineContext().get(GeckoHubImp.onExtraCallbackWithResult);
        }
        if (geckoHubImp != null) {
            coroutineContextIAuthTabCallback = coroutineContextIAuthTabCallback.plus(geckoHubImp);
            int i4 = onExtraCallback + 87;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
        if (function2 != null) {
            coroutineContextIAuthTabCallback = coroutineContextIAuthTabCallback.plus(new onExtraCallback(function2, CoroutineExceptionHandler.extraCallbackWithResult));
        }
        return findRes.onWarmupCompleted(coroutineContextIAuthTabCallback);
    }

    public static final class onExtraCallback extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Function2 onExtraCallbackWithResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(Function2 function2, CoroutineExceptionHandler.onWarmupCompleted onwarmupcompleted) {
            super(onwarmupcompleted);
            this.onExtraCallbackWithResult = function2;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 39;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallbackWithResult.invoke(coroutineContext, th);
            if (i3 != 0) {
                int i4 = 84 / 0;
            }
        }
    }
}
