package o;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.ReceiveChannel;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final /* synthetic */ class sycycx {

    static final class IAuthTabCallback<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return sycycx.onWarmupCompleted(null, null, false, this);
        }
    }

    public static final <T> Object onWarmupCompleted(@NotNull setRipple<? super T> setripple, @NotNull ReceiveChannel<? extends T> receiveChannel, @NotNull access13800<? super Unit> access13800Var) {
        Object objOnWarmupCompleted = onWarmupCompleted(setripple, receiveChannel, true, access13800Var);
        return objOnWarmupCompleted == access14100.onExtraCallback() ? objOnWarmupCompleted : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008e, code lost:
    
        if (r9 == r1) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c A[Catch: all -> 0x009b, TRY_LEAVE, TryCatch #0 {all -> 0x009b, blocks: (B:13:0x0036, B:22:0x0060, B:25:0x0074, B:27:0x007c, B:18:0x0052, B:21:0x005c), top: B:41:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, o.setRipple] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x008e -> B:14:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object onWarmupCompleted(setRipple<? super T> setripple, ReceiveChannel<? extends T> receiveChannel, boolean z, access13800<? super Unit> access13800Var) {
        IAuthTabCallback iAuthTabCallback;
        nUnlockFile<? extends T> nunlockfileWriteTypedObject;
        nUnlockFile<? extends T> nunlockfile;
        ?? r2;
        Object objOnWarmupCompleted;
        if (access13800Var instanceof IAuthTabCallback) {
            iAuthTabCallback = (IAuthTabCallback) access13800Var;
            int i = iAuthTabCallback.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                iAuthTabCallback.label = i - 2147483648;
            } else {
                iAuthTabCallback = new IAuthTabCallback(access13800Var);
            }
        }
        Object obj = iAuthTabCallback.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = iAuthTabCallback.label;
        try {
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                ycxycx.onExtraCallback(setripple);
                nunlockfileWriteTypedObject = receiveChannel.writeTypedObject();
                iAuthTabCallback.L$0 = setripple;
                iAuthTabCallback.L$1 = receiveChannel;
                iAuthTabCallback.L$2 = nunlockfileWriteTypedObject;
                iAuthTabCallback.Z$0 = z;
                iAuthTabCallback.label = 1;
                objOnWarmupCompleted = nunlockfileWriteTypedObject.onWarmupCompleted(iAuthTabCallback);
                if (objOnWarmupCompleted != objOnExtraCallback) {
                }
                return objOnExtraCallback;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = iAuthTabCallback.Z$0;
                nunlockfile = (nUnlockFile) iAuthTabCallback.L$2;
                receiveChannel = (ReceiveChannel) iAuthTabCallback.L$1;
                setRipple<? super T> setripple2 = (setRipple) iAuthTabCallback.L$0;
                ResultKt.onNavigationEvent(obj);
                setRipple<? super T> setripple3 = setripple2;
                nunlockfileWriteTypedObject = nunlockfile;
                setripple = setripple3;
                iAuthTabCallback.L$0 = setripple;
                iAuthTabCallback.L$1 = receiveChannel;
                iAuthTabCallback.L$2 = nunlockfileWriteTypedObject;
                iAuthTabCallback.Z$0 = z;
                iAuthTabCallback.label = 1;
                objOnWarmupCompleted = nunlockfileWriteTypedObject.onWarmupCompleted(iAuthTabCallback);
                if (objOnWarmupCompleted != objOnExtraCallback) {
                    r2 = setripple;
                    nunlockfile = nunlockfileWriteTypedObject;
                    obj = objOnWarmupCompleted;
                    if (!((Boolean) obj).booleanValue()) {
                        T tOnNavigationEvent = nunlockfile.onNavigationEvent();
                        iAuthTabCallback.L$0 = r2;
                        iAuthTabCallback.L$1 = receiveChannel;
                        iAuthTabCallback.L$2 = nunlockfile;
                        iAuthTabCallback.Z$0 = z;
                        iAuthTabCallback.label = 2;
                        Object objEmit = r2.emit(tOnNavigationEvent, iAuthTabCallback);
                        setripple3 = r2;
                    } else {
                        if (z) {
                            av.onExtraCallback(receiveChannel, null);
                        }
                        return Unit.INSTANCE;
                    }
                }
                return objOnExtraCallback;
            }
            z = iAuthTabCallback.Z$0;
            nunlockfile = (nUnlockFile) iAuthTabCallback.L$2;
            receiveChannel = (ReceiveChannel) iAuthTabCallback.L$1;
            setRipple setripple4 = (setRipple) iAuthTabCallback.L$0;
            ResultKt.onNavigationEvent(obj);
            r2 = setripple4;
            if (!((Boolean) obj).booleanValue()) {
            }
        } finally {
        }
    }

    public static final <T> IAnimation<T> onWarmupCompleted(@NotNull ReceiveChannel<? extends T> receiveChannel) {
        return new xkz(receiveChannel, false, null, 0, null, 28, null);
    }

    public static final <T> IAnimation<T> IAuthTabCallback(@NotNull ReceiveChannel<? extends T> receiveChannel) {
        return new xkz(receiveChannel, true, null, 0, null, 28, null);
    }

    public static final <T> ReceiveChannel<T> onExtraCallback(@NotNull IAnimation<? extends T> iAnimation, @NotNull findResAndMsg findresandmsg) {
        return ycx11.onWarmupCompleted(iAnimation).onNavigationEvent(findresandmsg);
    }
}
