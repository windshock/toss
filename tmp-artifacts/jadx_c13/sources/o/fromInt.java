package o;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class fromInt {
    public static final <T, R> Object onWarmupCompleted(@NotNull ycx4<? super T> ycx4Var, R r, @NotNull Function2<? super R, ? super access13800<? super T>, ? extends Object> function2) {
        return onExtraCallback(ycx4Var, true, r, function2);
    }

    public static final <T, R> Object IAuthTabCallback(@NotNull ycx4<? super T> ycx4Var, R r, @NotNull Function2<? super R, ? super access13800<? super T>, ? extends Object> function2) {
        return onExtraCallback(ycx4Var, false, r, function2);
    }

    private static final <T, R> Object onExtraCallback(ycx4<? super T> ycx4Var, boolean z, R r, Function2<? super R, ? super access13800<? super T>, ? extends Object> function2) throws Throwable {
        Object iLoader;
        Object objAsBinder;
        try {
            iLoader = !(function2 instanceof BaseContinuationImpl) ? access14200.onWarmupCompleted(function2, r, ycx4Var) : ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(r, ycx4Var);
        } catch (DefaultLogger e) {
            IAuthTabCallback(ycx4Var, e);
            throw new setWrite();
        } catch (Throwable th) {
            iLoader = new ILoader(th, false, 2, null);
        }
        if (iLoader != access14100.onExtraCallback() && (objAsBinder = ycx4Var.asBinder(iLoader)) != setChannelIndex.onExtraCallback) {
            ycx4Var.onTransact();
            if (objAsBinder instanceof ILoader) {
                if (!z && !onExtraCallbackWithResult(ycx4Var, ((ILoader) objAsBinder).IAuthTabCallback)) {
                    if (iLoader instanceof ILoader) {
                        throw ((ILoader) iLoader).IAuthTabCallback;
                    }
                    return iLoader;
                }
                throw ((ILoader) objAsBinder).IAuthTabCallback;
            }
            return setChannelIndex.IAuthTabCallback(objAsBinder);
        }
        return access14100.onExtraCallback();
    }

    private static final boolean onExtraCallbackWithResult(ycx4<?> ycx4Var, Throwable th) {
        return ((th instanceof WebResourceResponseModel) && ((WebResourceResponseModel) th).onWarmupCompleted == ycx4Var) ? false : true;
    }

    private static final Void IAuthTabCallback(ycx4<?> ycx4Var, DefaultLogger defaultLogger) throws Throwable {
        ycx4Var.IAuthTabCallbackStub(new ILoader(defaultLogger.getCause(), false, 2, null));
        throw defaultLogger.getCause();
    }

    public static final <R, T> void IAuthTabCallback(@NotNull Function2<? super R, ? super access13800<? super T>, ? extends Object> function2, R r, @NotNull access13800<? super T> access13800Var) {
        access13800 access13800VarOnExtraCallback = access14600.onExtraCallback(access13800Var);
        try {
            CoroutineContext context = access13800VarOnExtraCallback.getContext();
            Object objOnNavigationEvent = getViewPager.onNavigationEvent(context, (Object) null);
            try {
                access14600.onExtraCallbackWithResult(access13800VarOnExtraCallback);
                Object objOnWarmupCompleted = !(function2 instanceof BaseContinuationImpl) ? access14200.onWarmupCompleted(function2, r, access13800VarOnExtraCallback) : ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(r, access13800VarOnExtraCallback);
                if (objOnWarmupCompleted != access14100.onExtraCallback()) {
                    Result.Companion companion = Result.Companion;
                    access13800VarOnExtraCallback.resumeWith(Result.m31constructorimpl(objOnWarmupCompleted));
                }
            } finally {
                getViewPager.onExtraCallbackWithResult(context, objOnNavigationEvent);
            }
        } catch (Throwable th) {
            th = th;
            if (th instanceof DefaultLogger) {
                th = ((DefaultLogger) th).getCause();
            }
            Result.Companion companion2 = Result.Companion;
            access13800VarOnExtraCallback.resumeWith(Result.m31constructorimpl(ResultKt.createFailure(th)));
        }
    }
}
