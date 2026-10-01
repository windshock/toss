package o;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.rx2.RxAwaitKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RealImageLoaderKtExternalSyntheticLambda1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    static final class IAuthTabCallback<T> extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 125;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallbackWithResult = RealImageLoaderKtExternalSyntheticLambda1.onExtraCallbackWithResult(null, this);
            if (i3 != 0) {
                int i4 = 3 / 0;
            }
            int i5 = onExtraCallbackWithResult + 51;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return objOnExtraCallbackWithResult;
        }
    }

    static final class onExtraCallback<T> extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objIAuthTabCallback = RealImageLoaderKtExternalSyntheticLambda1.IAuthTabCallback(null, this);
            if (objIAuthTabCallback != access14300.onWarmupCompleted()) {
                return kotlin.Result.IAuthTabCallback(objIAuthTabCallback);
            }
            int i2 = onExtraCallback;
            int i3 = i2 + 95;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            int i4 = i2 + 67;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }
    }

    static final class onNavigationEvent<T> extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnNavigationEvent = RealImageLoaderKtExternalSyntheticLambda1.onNavigationEvent(null, this);
            if (objOnNavigationEvent == access14300.onWarmupCompleted()) {
                int i2 = onWarmupCompleted + 113;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return objOnNavigationEvent;
            }
            kotlin.Result resultIAuthTabCallback = kotlin.Result.IAuthTabCallback(objOnNavigationEvent);
            int i4 = onWarmupCompleted + 27;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return resultIAuthTabCallback;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object onExtraCallbackWithResult(@NotNull writeRaw<T> writeraw, @NotNull access13800<? super T> access13800Var) {
        IAuthTabCallback iAuthTabCallback;
        Object objIAuthTabCallback;
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 13;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        if (access13800Var instanceof IAuthTabCallback) {
            int i5 = i2 + 49;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = ((IAuthTabCallback) access13800Var).label;
                obj.hashCode();
                throw null;
            }
            iAuthTabCallback = (IAuthTabCallback) access13800Var;
            int i7 = iAuthTabCallback.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                iAuthTabCallback.label = i7 - 2147483648;
            } else {
                iAuthTabCallback = new IAuthTabCallback(access13800Var);
            }
        }
        Object obj2 = iAuthTabCallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i8 = iAuthTabCallback.label;
        if (i8 != 0) {
            int i9 = IAuthTabCallback + 115;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj2);
            objIAuthTabCallback = ((kotlin.Result) obj2).onNavigationEvent();
        } else {
            ResultKt.onNavigationEvent(obj2);
            iAuthTabCallback.L$0 = access15400.onNavigationEvent(writeraw);
            iAuthTabCallback.label = 1;
            objIAuthTabCallback = IAuthTabCallback(writeraw, iAuthTabCallback);
            if (objIAuthTabCallback == objOnWarmupCompleted) {
                int i11 = onExtraCallback + 115;
                IAuthTabCallback = i11 % 128;
                if (i11 % 2 != 0) {
                    return objOnWarmupCompleted;
                }
                obj.hashCode();
                throw null;
            }
        }
        if (kotlin.Result.exceptionOrNull-impl(objIAuthTabCallback) == null) {
            return objIAuthTabCallback;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object IAuthTabCallback(@NotNull writeRaw<T> writeraw, @NotNull access13800<? super kotlin.Result<? extends T>> access13800Var) {
        onExtraCallback onextracallback;
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            boolean z = access13800Var instanceof onExtraCallback;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (access13800Var instanceof onExtraCallback) {
            onextracallback = (onExtraCallback) access13800Var;
            int i3 = onextracallback.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                int i4 = IAuthTabCallback + 13;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    onextracallback.label = i3 % Integer.MIN_VALUE;
                } else {
                    onextracallback.label = i3 - 2147483648;
                }
            } else {
                onextracallback = new onExtraCallback(access13800Var);
            }
        }
        Object objOnWarmupCompleted = onextracallback.result;
        Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
        int i5 = onextracallback.label;
        try {
            if (i5 == 0) {
                ResultKt.onNavigationEvent(objOnWarmupCompleted);
                Result.Companion companion = kotlin.Result.Companion;
                onextracallback.L$0 = access15400.onNavigationEvent(writeraw);
                onextracallback.L$1 = access15400.onNavigationEvent(onextracallback);
                onextracallback.I$0 = 0;
                onextracallback.I$1 = 0;
                onextracallback.label = 1;
                objOnWarmupCompleted = RxAwaitKt.onWarmupCompleted(writeraw, onextracallback);
                if (objOnWarmupCompleted == objOnWarmupCompleted2) {
                    int i6 = IAuthTabCallback + 35;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    return objOnWarmupCompleted2;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i8 = onExtraCallback + 77;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                ResultKt.onNavigationEvent(objOnWarmupCompleted);
            }
            return kotlin.Result.constructor-impl(objOnWarmupCompleted);
        } catch (WebResourceResponseModel e) {
            Result.Companion companion2 = kotlin.Result.Companion;
            return kotlin.Result.constructor-impl(ResultKt.createFailure(e));
        } catch (CancellationException e2) {
            throw e2;
        } catch (Exception e3) {
            Result.Companion companion3 = kotlin.Result.Companion;
            return kotlin.Result.constructor-impl(ResultKt.createFailure(e3));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object onNavigationEvent(@NotNull getByteBuffer<T> getbytebuffer, @NotNull access13800<? super kotlin.Result<? extends T>> access13800Var) {
        onNavigationEvent onnavigationevent;
        int i = 2 % 2;
        if (access13800Var instanceof onNavigationEvent) {
            onnavigationevent = (onNavigationEvent) access13800Var;
            int i2 = onnavigationevent.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = IAuthTabCallback + 31;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                onnavigationevent.label = i2 - 2147483648;
            } else {
                onnavigationevent = new onNavigationEvent(access13800Var);
                int i5 = IAuthTabCallback + 23;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        Object objOnNavigationEvent = onnavigationevent.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i7 = onnavigationevent.label;
        try {
            if (i7 == 0) {
                ResultKt.onNavigationEvent(objOnNavigationEvent);
                Result.Companion companion = kotlin.Result.Companion;
                onnavigationevent.L$0 = access15400.onNavigationEvent(getbytebuffer);
                onnavigationevent.L$1 = access15400.onNavigationEvent(onnavigationevent);
                onnavigationevent.I$0 = 0;
                onnavigationevent.I$1 = 0;
                onnavigationevent.label = 1;
                objOnNavigationEvent = RxAwaitKt.onNavigationEvent(getbytebuffer, onnavigationevent);
                if (objOnNavigationEvent == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(objOnNavigationEvent);
            }
            return kotlin.Result.constructor-impl(objOnNavigationEvent);
        } catch (Exception e) {
            Result.Companion companion2 = kotlin.Result.Companion;
            return kotlin.Result.constructor-impl(ResultKt.createFailure(e));
        } catch (WebResourceResponseModel e2) {
            Result.Companion companion3 = kotlin.Result.Companion;
            return kotlin.Result.constructor-impl(ResultKt.createFailure(e2));
        } catch (CancellationException e3) {
            throw e3;
        }
    }
}
