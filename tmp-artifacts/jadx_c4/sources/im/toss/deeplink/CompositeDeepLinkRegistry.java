package im.toss.deeplink;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import o.access8100;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class CompositeDeepLinkRegistry extends DeepLinkBaseRegistry {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    private final List<DeepLinkBaseRegistry> registries;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CompositeDeepLinkRegistry(@NotNull List<? extends DeepLinkBaseRegistry> list) {
        super(access8100.onNavigationEvent());
        Intrinsics.checkNotNullParameter(list, "");
        this.registries = list;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CompositeDeepLinkRegistry(@NotNull DeepLinkBaseRegistry... deepLinkBaseRegistryArr) {
        this((List<? extends DeepLinkBaseRegistry>) ArraysKt.toList(deepLinkBaseRegistryArr));
        Intrinsics.checkNotNullParameter(deepLinkBaseRegistryArr, "");
    }

    @Override // im.toss.deeplink.DeepLinkBaseRegistry
    public DeeplinkEntry findEntry(@Nullable String str) {
        Iterator it;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            it = this.registries.iterator();
            int i3 = 25 / 0;
        } else {
            it = this.registries.iterator();
        }
        while (it.hasNext()) {
            int i4 = onWarmupCompleted + 123;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            DeeplinkEntry deeplinkEntryFindEntry = ((DeepLinkBaseRegistry) it.next()).findEntry(str);
            if (deeplinkEntryFindEntry != null) {
                return deeplinkEntryFindEntry;
            }
        }
        return null;
    }

    @Override // im.toss.deeplink.DeepLinkBaseRegistry
    public boolean supportsUri(@Nullable String str) {
        int i = 2 % 2;
        List<DeepLinkBaseRegistry> list = this.registries;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        int i2 = onWarmupCompleted + 111;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        while (it.hasNext()) {
            int i4 = onWarmupCompleted + 51;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 7 / 0;
                if (((DeepLinkBaseRegistry) it.next()).findEntry(str) != null) {
                    int i6 = onWarmupCompleted + 53;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    return true;
                }
            } else if (((DeepLinkBaseRegistry) it.next()).findEntry(str) != null) {
                int i62 = onWarmupCompleted + 53;
                IAuthTabCallback = i62 % 128;
                int i72 = i62 % 2;
                return true;
            }
        }
        return false;
    }
}
