package o;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class wwx5 {
    private static final Comparator<Method> onWarmupCompleted = Comparator.comparing(new Function() { // from class: org.apache.commons.lang3.reflect.MethodUtils$$ExternalSyntheticLambda8
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((Method) obj).toString();
        }
    });

    public static /* synthetic */ List onWarmupCompleted(Integer num) {
        return new ArrayList();
    }

    private static int onExtraCallback(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (!onVideoError.onExtraCallback(clsArr, clsArr2, true)) {
            return -1;
        }
        int i = 0;
        for (int i2 = 0; i2 < clsArr.length; i2++) {
            Class<?> cls = clsArr[i2];
            Class<?> cls2 = clsArr2[i2];
            if (cls != null && !cls.equals(cls2)) {
                i = (!onVideoError.onExtraCallbackWithResult(cls, cls2, true) || onVideoError.onExtraCallbackWithResult(cls, cls2, false)) ? i + 2 : i + 1;
            }
        }
        return i;
    }
}
