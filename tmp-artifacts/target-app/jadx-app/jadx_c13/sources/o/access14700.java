package o;

import java.lang.reflect.Field;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access14700 {
    public static final StackTraceElement onExtraCallbackWithResult(@NotNull BaseContinuationImpl baseContinuationImpl) throws Throwable {
        String strIAuthTabCallback;
        Intrinsics.checkNotNullParameter(baseContinuationImpl, "");
        access14800 access14800VarOnNavigationEvent = onNavigationEvent(baseContinuationImpl);
        if (access14800VarOnNavigationEvent == null || access14800VarOnNavigationEvent.onExtraCallbackWithResult() <= 0) {
            return null;
        }
        int iOnWarmupCompleted = onWarmupCompleted(baseContinuationImpl);
        int i = iOnWarmupCompleted < 0 ? -1 : access14800VarOnNavigationEvent.onNavigationEvent()[iOnWarmupCompleted];
        String strOnExtraCallback = access15100.onExtraCallbackWithResult.onExtraCallback(baseContinuationImpl);
        if (strOnExtraCallback == null) {
            strIAuthTabCallback = access14800VarOnNavigationEvent.IAuthTabCallback();
        } else {
            strIAuthTabCallback = strOnExtraCallback + '/' + access14800VarOnNavigationEvent.IAuthTabCallback();
        }
        return new StackTraceElement(strIAuthTabCallback, access14800VarOnNavigationEvent.onExtraCallback(), access14800VarOnNavigationEvent.onWarmupCompleted(), i);
    }

    private static final access14800 onNavigationEvent(BaseContinuationImpl baseContinuationImpl) {
        return (access14800) baseContinuationImpl.getClass().getAnnotation(access14800.class);
    }

    private static final int onWarmupCompleted(BaseContinuationImpl baseContinuationImpl) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (baseContinuationImpl instanceof access15200) {
            return 0;
        }
        try {
            Field declaredField = baseContinuationImpl.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(baseContinuationImpl);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }
}
