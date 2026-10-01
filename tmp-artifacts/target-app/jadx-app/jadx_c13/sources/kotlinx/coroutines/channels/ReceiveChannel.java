package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.ResultKt;
import o.access13800;
import o.access14100;
import o.jni_YGNodeStyleGetAlignItemsJNI;
import o.lud;
import o.nUnlockFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface ReceiveChannel<E> {
    Object IAuthTabCallback(@NotNull access13800<? super lud<? extends E>> access13800Var);

    jni_YGNodeStyleGetAlignItemsJNI<E> IAuthTabCallbackStub();

    jni_YGNodeStyleGetAlignItemsJNI<lud<E>> asInterface();

    Object onExtraCallbackWithResult(@NotNull access13800<? super E> access13800Var);

    Object onMinimized();

    void onNavigationEvent(@Nullable CancellationException cancellationException);

    boolean readTypedObject();

    nUnlockFile<E> writeTypedObject();

    public static final class DefaultImpls {
        public static /* synthetic */ void onExtraCallbackWithResult(ReceiveChannel receiveChannel, CancellationException cancellationException, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i & 1) != 0) {
                cancellationException = null;
            }
            receiveChannel.onNavigationEvent(cancellationException);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Deprecated
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static <E> Object onNavigationEvent(@NotNull ReceiveChannel<? extends E> receiveChannel, @NotNull access13800<? super E> access13800Var) {
            ReceiveChannel$receiveOrNull$1 receiveChannel$receiveOrNull$1;
            Object objIAuthTabCallback;
            if (access13800Var instanceof ReceiveChannel$receiveOrNull$1) {
                receiveChannel$receiveOrNull$1 = (ReceiveChannel$receiveOrNull$1) access13800Var;
                int i = receiveChannel$receiveOrNull$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    receiveChannel$receiveOrNull$1.label = i - 2147483648;
                } else {
                    receiveChannel$receiveOrNull$1 = new ReceiveChannel$receiveOrNull$1(access13800Var);
                }
            }
            Object obj = receiveChannel$receiveOrNull$1.result;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = receiveChannel$receiveOrNull$1.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                receiveChannel$receiveOrNull$1.label = 1;
                objIAuthTabCallback = receiveChannel.IAuthTabCallback(receiveChannel$receiveOrNull$1);
                if (objIAuthTabCallback == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                objIAuthTabCallback = ((lud) obj).onExtraCallback();
            }
            return lud.onExtraCallbackWithResult(objIAuthTabCallback);
        }
    }
}
