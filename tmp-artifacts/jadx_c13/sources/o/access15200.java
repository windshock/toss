package o;

import kotlin.ResultKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access15200 extends BaseContinuationImpl {
    private final access13800<Object> continuation;
    private final String declaringClass;
    private final String fileName;
    private final int lineNumber;
    private final String methodName;
    private final Object[] spilledVariables;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public Object invokeSuspend(@NotNull Object obj) {
        ResultKt.onNavigationEvent(obj);
        return obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, o.access14900
    public StackTraceElement getStackTraceElement() throws Throwable {
        String str;
        String strOnExtraCallback = access15100.onExtraCallbackWithResult.onExtraCallback(this);
        if (strOnExtraCallback == null) {
            str = this.declaringClass;
        } else {
            str = strOnExtraCallback + '/' + this.declaringClass;
        }
        return new StackTraceElement(str, this.methodName, this.fileName, this.lineNumber);
    }

    @Override // o.access13800
    public CoroutineContext getContext() {
        return this.continuation.getContext();
    }
}
