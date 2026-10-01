package o;

import java.lang.reflect.Method;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class access15900 {

    static final class onExtraCallback {
        public static final Method IAuthTabCallback;
        public static final Method onExtraCallback;
        public static final onExtraCallback onExtraCallbackWithResult = new onExtraCallback();

        private onExtraCallback() {
        }

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            Intrinsics.checkNotNull(methods);
            int length = methods.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                method = null;
                if (i2 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i2];
                if (Intrinsics.areEqual(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    Intrinsics.checkNotNullExpressionValue(parameterTypes, "");
                    if (Intrinsics.areEqual(ArraysKt___ArraysKt.singleOrNull(parameterTypes), Throwable.class)) {
                        break;
                    }
                }
                i2++;
            }
            IAuthTabCallback = method2;
            int length2 = methods.length;
            while (true) {
                if (i >= length2) {
                    break;
                }
                Method method3 = methods[i];
                if (Intrinsics.areEqual(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i++;
            }
            onExtraCallback = method;
        }
    }

    public void onExtraCallbackWithResult(@NotNull Throwable th, @NotNull Throwable th2) {
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(th2, "");
        Method method = onExtraCallback.IAuthTabCallback;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public List<Throwable> IAuthTabCallback(@NotNull Throwable th) {
        Object objInvoke;
        List<Throwable> listAsList;
        Intrinsics.checkNotNullParameter(th, "");
        Method method = onExtraCallback.onExtraCallback;
        return (method == null || (objInvoke = method.invoke(th, null)) == null || (listAsList = ArraysKt___ArraysJvmKt.asList((Throwable[]) objInvoke)) == null) ? CollectionsKt__CollectionsKt.emptyList() : listAsList;
    }

    public Random IAuthTabCallback() {
        return new getMemoryDumpOrBuilderList();
    }

    public setProcessUptime onExtraCallback() {
        throw new UnsupportedOperationException("getSystemClock should not be called on the base PlatformImplementations.");
    }
}
