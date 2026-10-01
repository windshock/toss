package im.toss.deeplink;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TombstoneProtosMemoryMappingBuilder;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class DeeplinkEntry {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final Lazy clazz$delegate;
    private final List<TargetRegion> regions;

    public static /* synthetic */ Class $r8$lambda$mZFlFDKjzkezT1yMOglp0n7nVk8(Function0 function0) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            clazz_delegate$lambda$0(function0);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Class clsClazz_delegate$lambda$0 = clazz_delegate$lambda$0(function0);
        int i3 = onExtraCallbackWithResult + 63;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return clsClazz_delegate$lambda$0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeeplinkEntry(@NotNull final Function0<? extends Class<?>> function0, @NotNull List<? extends TargetRegion> list) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.regions = list;
        this.clazz$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.deeplink.DeeplinkEntry$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 113;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$mZFlFDKjzkezT1yMOglp0n7nVk8 = DeeplinkEntry.$r8$lambda$mZFlFDKjzkezT1yMOglp0n7nVk8(function0);
                int i4 = onWarmupCompleted + 95;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return cls$r8$lambda$mZFlFDKjzkezT1yMOglp0n7nVk8;
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DeeplinkEntry(Function0 function0, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = onExtraCallbackWithResult + 73;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                list = CollectionsKt.emptyList();
                int i3 = 40 / 0;
            } else {
                list = CollectionsKt.emptyList();
            }
            int i4 = 2 % 2;
        }
        this(function0, list);
    }

    public final List<TargetRegion> getRegions() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        List<TargetRegion> list = this.regions;
        int i5 = i3 + 5;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    private static final Class clazz_delegate$lambda$0(Function0 function0) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Class cls = (Class) function0.invoke();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = onNavigationEvent + 85;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return cls;
        }
        throw null;
    }

    public final Class<?> getClazz() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        Class<?> cls = (Class) this.clazz$delegate.getValue();
        int i3 = onNavigationEvent + 85;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return cls;
        }
        obj.hashCode();
        throw null;
    }
}
