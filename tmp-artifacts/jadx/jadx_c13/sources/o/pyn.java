package o;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import o.pyn;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class pyn {
    private static final getShakeView<? extends Object> onExtraCallback = getRenderRequest.onWarmupCompleted(new Function1() { // from class: kotlinx.serialization.SerializersCacheKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return pyn.IAuthTabCallback((KClass) obj);
        }
    });
    private static final getShakeView<Object> onNavigationEvent = getRenderRequest.onWarmupCompleted(new Function1() { // from class: kotlinx.serialization.SerializersCacheKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return pyn.onNavigationEvent((KClass) obj);
        }
    });
    private static final ea12<? extends Object> onExtraCallbackWithResult = getRenderRequest.IAuthTabCallback(new Function2() { // from class: kotlinx.serialization.SerializersCacheKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return pyn.onNavigationEvent((KClass) obj, (List) obj2);
        }
    });
    private static final ea12<Object> IAuthTabCallback = getRenderRequest.IAuthTabCallback(new Function2() { // from class: kotlinx.serialization.SerializersCacheKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return pyn.onExtraCallbackWithResult((KClass) obj, (List) obj2);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer IAuthTabCallback(KClass kClass) {
        Intrinsics.checkNotNullParameter(kClass, "");
        KSerializer kSerializerOnExtraCallback = nzi.onExtraCallback(kClass);
        if (kSerializerOnExtraCallback != null) {
            return kSerializerOnExtraCallback;
        }
        if (htf2.IAuthTabCallback(kClass)) {
            return new giw(kClass);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer onNavigationEvent(KClass kClass) {
        KSerializer kSerializerIAuthTabCallback;
        Intrinsics.checkNotNullParameter(kClass, "");
        KSerializer kSerializerOnExtraCallback = nzi.onExtraCallback(kClass);
        if (kSerializerOnExtraCallback == null) {
            kSerializerOnExtraCallback = htf2.IAuthTabCallback(kClass) ? new giw(kClass) : null;
        }
        if (kSerializerOnExtraCallback == null || (kSerializerIAuthTabCallback = sp.IAuthTabCallback(kSerializerOnExtraCallback)) == null) {
            return null;
        }
        return kSerializerIAuthTabCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer onNavigationEvent(KClass kClass, final List list) {
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(list, "");
        List<KSerializer<Object>> listOnWarmupCompleted = nzi.onWarmupCompleted(tnycx.onNavigationEvent(), (List<? extends access5900>) list, true);
        Intrinsics.checkNotNull(listOnWarmupCompleted);
        return nzi.onWarmupCompleted((KClass<Object>) kClass, listOnWarmupCompleted, (Function0<? extends access5200>) new Function0() { // from class: kotlinx.serialization.SerializersCacheKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return pyn.onExtraCallbackWithResult(list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final access5200 onExtraCallbackWithResult(List list) {
        return ((access5900) list.get(0)).getClassifier();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer onExtraCallbackWithResult(KClass kClass, final List list) {
        KSerializer kSerializerIAuthTabCallback;
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(list, "");
        List<KSerializer<Object>> listOnWarmupCompleted = nzi.onWarmupCompleted(tnycx.onNavigationEvent(), (List<? extends access5900>) list, true);
        Intrinsics.checkNotNull(listOnWarmupCompleted);
        KSerializer<? extends Object> kSerializerOnWarmupCompleted = nzi.onWarmupCompleted((KClass<Object>) kClass, listOnWarmupCompleted, (Function0<? extends access5200>) new Function0() { // from class: kotlinx.serialization.SerializersCacheKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return pyn.onExtraCallback(list);
            }
        });
        if (kSerializerOnWarmupCompleted == null || (kSerializerIAuthTabCallback = sp.IAuthTabCallback(kSerializerOnWarmupCompleted)) == null) {
            return null;
        }
        return kSerializerIAuthTabCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final access5200 onExtraCallback(List list) {
        return ((access5900) list.get(0)).getClassifier();
    }

    public static final KSerializer<Object> onExtraCallbackWithResult(@NotNull KClass<Object> kClass, boolean z) {
        Intrinsics.checkNotNullParameter(kClass, "");
        if (!z) {
            KSerializer<? extends Object> kSerializerOnWarmupCompleted = onExtraCallback.onWarmupCompleted(kClass);
            if (kSerializerOnWarmupCompleted != null) {
                return kSerializerOnWarmupCompleted;
            }
            return null;
        }
        return onNavigationEvent.onWarmupCompleted(kClass);
    }

    public static final Object IAuthTabCallback(@NotNull KClass<Object> kClass, @NotNull List<? extends access5900> list, boolean z) {
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (!z) {
            return onExtraCallbackWithResult.onWarmupCompleted(kClass, list);
        }
        return IAuthTabCallback.onWarmupCompleted(kClass, list);
    }
}
