package o;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.access13700;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final /* synthetic */ class onLoadStarted {
    public static /* synthetic */ getPackageType onExtraCallback(findResAndMsg findresandmsg, CoroutineContext coroutineContext, setRandomHost setrandomhost, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = access13600.IAuthTabCallback;
        }
        if ((i & 2) != 0) {
            setrandomhost = setRandomHost.DEFAULT;
        }
        return maybeUpdateAnimatable.onWarmupCompleted(findresandmsg, coroutineContext, setrandomhost, (Function2<? super findResAndMsg, ? super access13800<? super Unit>, ? extends Object>) function2);
    }

    public static final getPackageType onExtraCallback(@NotNull findResAndMsg findresandmsg, @NotNull CoroutineContext coroutineContext, @NotNull setRandomHost setrandomhost, @NotNull Function2<? super findResAndMsg, ? super access13800<? super Unit>, ? extends Object> function2) {
        RequestCoordinator seturllist;
        CoroutineContext coroutineContextIAuthTabCallback = StatisticData.IAuthTabCallback(findresandmsg, coroutineContext);
        if (setrandomhost.isLazy()) {
            seturllist = new setLocalVersion(coroutineContextIAuthTabCallback, function2);
        } else {
            seturllist = new setUrlList(coroutineContextIAuthTabCallback, true);
        }
        seturllist.onExtraCallback(setrandomhost, (setRandomHost) seturllist, (Function2<? super setRandomHost, ? super access13800<? super T>, ? extends Object>) function2);
        return seturllist;
    }

    public static /* synthetic */ GeckoHubImp1 onWarmupCompleted(findResAndMsg findresandmsg, CoroutineContext coroutineContext, setRandomHost setrandomhost, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = access13600.IAuthTabCallback;
        }
        if ((i & 2) != 0) {
            setrandomhost = setRandomHost.DEFAULT;
        }
        return maybeUpdateAnimatable.onExtraCallback(findresandmsg, coroutineContext, setrandomhost, function2);
    }

    public static final <T> GeckoHubImp1<T> onWarmupCompleted(@NotNull findResAndMsg findresandmsg, @NotNull CoroutineContext coroutineContext, @NotNull setRandomHost setrandomhost, @NotNull Function2<? super findResAndMsg, ? super access13800<? super T>, ? extends Object> function2) {
        IThreadPoolCallback iThreadPoolCallback;
        CoroutineContext coroutineContextIAuthTabCallback = StatisticData.IAuthTabCallback(findresandmsg, coroutineContext);
        if (setrandomhost.isLazy()) {
            iThreadPoolCallback = new setAccessKey(coroutineContextIAuthTabCallback, function2);
        } else {
            iThreadPoolCallback = new IThreadPoolCallback(coroutineContextIAuthTabCallback, true);
        }
        ((RequestCoordinator) iThreadPoolCallback).onExtraCallback(setrandomhost, (setRandomHost) iThreadPoolCallback, (Function2<? super setRandomHost, ? super access13800<? super T>, ? extends Object>) function2);
        return (GeckoHubImp1<T>) iThreadPoolCallback;
    }

    public static final <T> Object onExtraCallback(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super findResAndMsg, ? super access13800<? super T>, ? extends Object> function2, @NotNull access13800<? super T> access13800Var) {
        Object objIAuthTabCallback;
        CoroutineContext context = access13800Var.getContext();
        CoroutineContext coroutineContextIAuthTabCallback = StatisticData.IAuthTabCallback(context, coroutineContext);
        getFullPackage.IAuthTabCallback(coroutineContextIAuthTabCallback);
        if (coroutineContextIAuthTabCallback == context) {
            ycx4 ycx4Var = new ycx4(coroutineContextIAuthTabCallback, access13800Var);
            objIAuthTabCallback = fromInt.onWarmupCompleted(ycx4Var, ycx4Var, function2);
        } else {
            access13700.onWarmupCompleted onwarmupcompleted = access13700.onWarmupCompleted;
            if (Intrinsics.areEqual(coroutineContextIAuthTabCallback.get(onwarmupcompleted), context.get(onwarmupcompleted))) {
                doPost dopost = new doPost(coroutineContextIAuthTabCallback, access13800Var);
                CoroutineContext context2 = dopost.getContext();
                Object objOnNavigationEvent = getViewPager.onNavigationEvent(context2, (Object) null);
                try {
                    Object objOnWarmupCompleted = fromInt.onWarmupCompleted(dopost, dopost, function2);
                    getViewPager.onExtraCallbackWithResult(context2, objOnNavigationEvent);
                    objIAuthTabCallback = objOnWarmupCompleted;
                } catch (Throwable th) {
                    getViewPager.onExtraCallbackWithResult(context2, objOnNavigationEvent);
                    throw th;
                }
            } else {
                CheckRequestBodyModel checkRequestBodyModel = new CheckRequestBodyModel(coroutineContextIAuthTabCallback, access13800Var);
                setLoop.onExtraCallbackWithResult(function2, checkRequestBodyModel, checkRequestBodyModel);
                objIAuthTabCallback = checkRequestBodyModel.IAuthTabCallback();
            }
        }
        if (objIAuthTabCallback == access14100.onExtraCallback()) {
            access14600.IAuthTabCallback(access13800Var);
        }
        return objIAuthTabCallback;
    }
}
