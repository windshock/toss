package o;

import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.tru;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class tru {
    private static final syc<access14900, wie> IAuthTabCallback;
    private static boolean IAuthTabCallbackDefault;
    private static boolean IAuthTabCallbackStub;
    private static final /* synthetic */ AtomicLong IAuthTabCallback_Parcel;
    private static boolean asBinder;
    private static final /* synthetic */ AtomicInteger asInterface;
    public static final tru onExtraCallback;
    private static final StackTraceElement onExtraCallbackWithResult;
    private static final SimpleDateFormat onNavigationEvent;
    private static final Function1<Boolean, Unit> onTransact;
    private static final syc<IAuthTabCallback<?>, Boolean> onWarmupCompleted;

    private final /* synthetic */ AtomicInteger IAuthTabCallbackDefault() {
        return asInterface;
    }

    private tru() {
    }

    static {
        tru truVar = new tru();
        onExtraCallback = truVar;
        onExtraCallbackWithResult = new onExtraCallback().IAuthTabCallback();
        onNavigationEvent = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        onWarmupCompleted = new syc<>(false, 1, null);
        asInterface = new AtomicInteger(0);
        IAuthTabCallback_Parcel = new AtomicLong(0L);
        IAuthTabCallbackStub = true;
        IAuthTabCallbackDefault = true;
        onTransact = truVar.onNavigationEvent();
        IAuthTabCallback = new syc<>(true);
    }

    private final Set<IAuthTabCallback<?>> onExtraCallbackWithResult() {
        return onWarmupCompleted.keySet();
    }

    public final boolean IAuthTabCallback() {
        return IAuthTabCallbackDefault().get() > 0;
    }

    public final boolean onExtraCallback() {
        return asBinder;
    }

    private final Function1<Boolean, Unit> onNavigationEvent() {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            Object objNewInstance = Class.forName("kotlinx.coroutines.debug.ByteBuddyDynamicAttach").getConstructors()[0].newInstance(null);
            Intrinsics.checkNotNull(objNewInstance, BuildConfig.FLAVOR);
            obj = Result.constructor-impl((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(objNewInstance, 1));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        return (Function1) (Result.onExtraCallback(obj) ? null : obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit asBinder() {
        IAuthTabCallback.IAuthTabCallback();
        return Unit.INSTANCE;
    }

    public static final class onWarmupCompleted<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return getCodeNameBytes.IAuthTabCallback(Long.valueOf(((IAuthTabCallback) t).onWarmupCompleted.onWarmupCompleted), Long.valueOf(((IAuthTabCallback) t2).onWarmupCompleted.onWarmupCompleted));
        }
    }

    public final void onWarmupCompleted(@NotNull PrintStream printStream) {
        synchronized (printStream) {
            onExtraCallback.onExtraCallback(printStream);
            Unit unit = Unit.INSTANCE;
        }
    }

    private final boolean onWarmupCompleted(IAuthTabCallback<?> iAuthTabCallback) {
        getPackageType getpackagetype;
        CoroutineContext coroutineContextOnExtraCallbackWithResult = iAuthTabCallback.onWarmupCompleted.onExtraCallbackWithResult();
        if (coroutineContextOnExtraCallbackWithResult == null || (getpackagetype = coroutineContextOnExtraCallbackWithResult.get(getPackageType.onNavigationEvent)) == null || !getpackagetype.IAuthTabCallbackStubProxy()) {
            return false;
        }
        onWarmupCompleted.remove(iAuthTabCallback);
        return true;
    }

    private final void onExtraCallback(PrintStream printStream) {
        String strOnExtraCallback;
        if (!IAuthTabCallback()) {
            throw new IllegalStateException("Debug probes are not installed");
        }
        printStream.print("Coroutines dump " + onNavigationEvent.format(Long.valueOf(System.currentTimeMillis())));
        Iterator itIAuthTabCallback = clearRevision.onExtraCallbackWithResult(clearRevision.onWarmupCompleted(CollectionsKt.asSequence(onExtraCallbackWithResult()), new Function1() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return Boolean.valueOf(tru.onExtraCallbackWithResult((tru.IAuthTabCallback) obj));
            }
        }), new onWarmupCompleted()).IAuthTabCallback();
        while (itIAuthTabCallback.hasNext()) {
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) itIAuthTabCallback.next();
            wie wieVar = iAuthTabCallback.onWarmupCompleted;
            List<StackTraceElement> listOnTransact = wieVar.onTransact();
            tru truVar = onExtraCallback;
            List<StackTraceElement> listOnNavigationEvent = truVar.onNavigationEvent(wieVar.onExtraCallback(), wieVar.lastObservedThread, listOnTransact);
            if (Intrinsics.areEqual(wieVar.onExtraCallback(), "RUNNING") && listOnNavigationEvent == listOnTransact) {
                strOnExtraCallback = wieVar.onExtraCallback() + " (Last suspension stacktrace, not an actual stacktrace)";
            } else {
                strOnExtraCallback = wieVar.onExtraCallback();
            }
            printStream.print("\n\nCoroutine " + iAuthTabCallback.onExtraCallbackWithResult + ", state: " + strOnExtraCallback);
            if (listOnTransact.isEmpty()) {
                printStream.print("\n\tat " + onExtraCallbackWithResult);
                truVar.onExtraCallback(printStream, wieVar.IAuthTabCallback());
            } else {
                truVar.onExtraCallback(printStream, listOnNavigationEvent);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onExtraCallbackWithResult(IAuthTabCallback iAuthTabCallback) {
        return !onExtraCallback.onWarmupCompleted((IAuthTabCallback<?>) iAuthTabCallback);
    }

    private final void onExtraCallback(PrintStream printStream, List<StackTraceElement> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            printStream.print("\n\tat " + ((StackTraceElement) it.next()));
        }
    }

    private final List<StackTraceElement> onNavigationEvent(String str, Thread thread, List<StackTraceElement> list) {
        Object obj;
        if (Intrinsics.areEqual(str, "RUNNING") && thread != null) {
            try {
                Result.Companion companion = Result.Companion;
                obj = Result.constructor-impl(thread.getStackTrace());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            if (Result.onExtraCallback(obj)) {
                obj = null;
            }
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) obj;
            if (stackTraceElementArr != null) {
                int length = stackTraceElementArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTraceElementArr[i];
                    if (Intrinsics.areEqual(stackTraceElement.getClassName(), "kotlin.coroutines.jvm.internal.BaseContinuationImpl") && Intrinsics.areEqual(stackTraceElement.getMethodName(), "resumeWith") && Intrinsics.areEqual(stackTraceElement.getFileName(), "ContinuationImpl.kt")) {
                        break;
                    }
                    i++;
                }
                Pair<Integer, Integer> pairOnExtraCallback = onExtraCallback(i, stackTraceElementArr, list);
                int iIntValue = ((Number) pairOnExtraCallback.onExtraCallbackWithResult()).intValue();
                int iIntValue2 = ((Number) pairOnExtraCallback.IAuthTabCallback()).intValue();
                if (iIntValue != -1) {
                    ArrayList arrayList = new ArrayList((((list.size() + i) - iIntValue) - 1) - iIntValue2);
                    for (int i2 = 0; i2 < i - iIntValue2; i2++) {
                        arrayList.add(stackTraceElementArr[i2]);
                    }
                    int size = list.size();
                    for (int i3 = iIntValue + 1; i3 < size; i3++) {
                        arrayList.add(list.get(i3));
                    }
                    return arrayList;
                }
            }
        }
        return list;
    }

    private final Pair<Integer, Integer> onExtraCallback(int i, StackTraceElement[] stackTraceElementArr, List<StackTraceElement> list) {
        for (int i2 = 0; i2 < 3; i2++) {
            int iOnNavigationEvent = onExtraCallback.onNavigationEvent((i - 1) - i2, stackTraceElementArr, list);
            if (iOnNavigationEvent != -1) {
                return getWrite.IAuthTabCallback(Integer.valueOf(iOnNavigationEvent), Integer.valueOf(i2));
            }
        }
        return getWrite.IAuthTabCallback(-1, 0);
    }

    private final int onNavigationEvent(int i, StackTraceElement[] stackTraceElementArr, List<StackTraceElement> list) {
        StackTraceElement stackTraceElement = (StackTraceElement) ArraysKt.getOrNull(stackTraceElementArr, i);
        if (stackTraceElement == null) {
            return -1;
        }
        int i2 = 0;
        for (StackTraceElement stackTraceElement2 : list) {
            if (Intrinsics.areEqual(stackTraceElement2.getFileName(), stackTraceElement.getFileName()) && Intrinsics.areEqual(stackTraceElement2.getClassName(), stackTraceElement.getClassName()) && Intrinsics.areEqual(stackTraceElement2.getMethodName(), stackTraceElement.getMethodName())) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    private final access14900 onNavigationEvent(access14900 access14900Var) {
        do {
            access14900Var = access14900Var.getCallerFrame();
            if (access14900Var == null) {
                return null;
            }
        } while (access14900Var.getStackTraceElement() == null);
        return access14900Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onExtraCallback(IAuthTabCallback<?> iAuthTabCallback) {
        access14900 access14900VarOnNavigationEvent;
        onWarmupCompleted.remove(iAuthTabCallback);
        access14900 access14900VarOnNavigationEvent2 = iAuthTabCallback.onWarmupCompleted.onNavigationEvent();
        if (access14900VarOnNavigationEvent2 == null || (access14900VarOnNavigationEvent = onNavigationEvent(access14900VarOnNavigationEvent2)) == null) {
            return;
        }
        IAuthTabCallback.remove(access14900VarOnNavigationEvent);
    }

    public static final class IAuthTabCallback<T> implements access13800<T>, access14900 {
        public final access13800<T> onExtraCallbackWithResult;
        public final wie onWarmupCompleted;

        public CoroutineContext getContext() {
            return this.onExtraCallbackWithResult.getContext();
        }

        private final ycx onExtraCallbackWithResult() {
            return this.onWarmupCompleted.onWarmupCompleted();
        }

        public access14900 getCallerFrame() {
            ycx ycxVarOnExtraCallbackWithResult = onExtraCallbackWithResult();
            if (ycxVarOnExtraCallbackWithResult != null) {
                return ycxVarOnExtraCallbackWithResult.getCallerFrame();
            }
            return null;
        }

        public StackTraceElement getStackTraceElement() {
            ycx ycxVarOnExtraCallbackWithResult = onExtraCallbackWithResult();
            if (ycxVarOnExtraCallbackWithResult != null) {
                return ycxVarOnExtraCallbackWithResult.getStackTraceElement();
            }
            return null;
        }

        public void resumeWith(@NotNull Object obj) {
            tru.onExtraCallback.onExtraCallback((IAuthTabCallback<?>) this);
            this.onExtraCallbackWithResult.resumeWith(obj);
        }

        public String toString() {
            return this.onExtraCallbackWithResult.toString();
        }
    }
}
