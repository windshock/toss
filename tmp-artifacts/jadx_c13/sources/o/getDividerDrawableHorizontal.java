package o;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.getDividerDrawableHorizontal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getDividerDrawableHorizontal {
    public static final void onNavigationEvent(@NotNull final djzb<?> djzbVar, @NotNull CoroutineContext coroutineContext) {
        if (((Number) coroutineContext.fold(0, new Function2() { // from class: kotlinx.coroutines.flow.internal.SafeCollector_commonKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(getDividerDrawableHorizontal.onNavigationEvent(djzbVar, ((Integer) obj).intValue(), (CoroutineContext.Element) obj2));
            }
        })).intValue() == djzbVar.collectContextSize) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + djzbVar.collectContext + ",\n\t\tbut emission happened in " + coroutineContext + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int onNavigationEvent(djzb djzbVar, int i, CoroutineContext.Element element) {
        CoroutineContext.onExtraCallback<?> key = element.getKey();
        CoroutineContext.Element element2 = djzbVar.collectContext.get(key);
        if (key != getPackageType.onNavigationEvent) {
            if (element != element2) {
                return Integer.MIN_VALUE;
            }
            return i + 1;
        }
        getPackageType getpackagetype = (getPackageType) element2;
        Intrinsics.checkNotNull(element, "");
        getPackageType getpackagetypeOnWarmupCompleted = onWarmupCompleted((getPackageType) element, getpackagetype);
        if (getpackagetypeOnWarmupCompleted == getpackagetype) {
            return getpackagetype == null ? i : i + 1;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + getpackagetypeOnWarmupCompleted + ", expected child of " + getpackagetype + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }

    public static final getPackageType onWarmupCompleted(@Nullable getPackageType getpackagetype, @Nullable getPackageType getpackagetype2) {
        while (getpackagetype != null) {
            if (getpackagetype == getpackagetype2 || !(getpackagetype instanceof ycx4)) {
                return getpackagetype;
            }
            getpackagetype = ((ycx4) getpackagetype).ICustomTabsCallback();
        }
        return null;
    }
}
