package o;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class StatisticModelPackageStatisticModelDownloadFailRecords {
    public static /* synthetic */ lt onNavigationEvent(findResAndMsg findresandmsg, CoroutineContext coroutineContext, int i, setRandomHost setrandomhost, Function1 function1, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = access13600.IAuthTabCallback;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            setrandomhost = setRandomHost.DEFAULT;
        }
        setRandomHost setrandomhost2 = setrandomhost;
        if ((i2 & 8) != 0) {
            function1 = null;
        }
        return onExtraCallbackWithResult(findresandmsg, coroutineContext2, i3, setrandomhost2, function1, function2);
    }

    public static final <E> lt<E> onExtraCallbackWithResult(@NotNull findResAndMsg findresandmsg, @NotNull CoroutineContext coroutineContext, int i, @NotNull setRandomHost setrandomhost, @Nullable Function1<? super Throwable, Unit> function1, @NotNull Function2<? super BsPatch<E>, ? super access13800<? super Unit>, ? extends Object> function2) {
        FileLock fileLock;
        CoroutineContext coroutineContextIAuthTabCallback = StatisticData.IAuthTabCallback(findresandmsg, coroutineContext);
        nLockFileSegment nlockfilesegmentOnExtraCallbackWithResult = zb.onExtraCallbackWithResult(i, null, null, 6, null);
        if (setrandomhost.isLazy()) {
            fileLock = new jc(coroutineContextIAuthTabCallback, nlockfilesegmentOnExtraCallbackWithResult, function2);
        } else {
            fileLock = new FileLock(coroutineContextIAuthTabCallback, nlockfilesegmentOnExtraCallbackWithResult, true);
        }
        if (function1 != null) {
            ((setFullPackage) fileLock).onExtraCallback(function1);
        }
        ((RequestCoordinator) fileLock).onExtraCallback(setrandomhost, (setRandomHost) fileLock, (Function2<? super setRandomHost, ? super access13800<? super T>, ? extends Object>) function2);
        return (lt<E>) fileLock;
    }
}
