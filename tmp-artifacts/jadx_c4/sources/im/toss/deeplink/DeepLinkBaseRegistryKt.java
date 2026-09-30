package im.toss.deeplink;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class DeepLinkBaseRegistryKt {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        return r3.getClazz();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        r3 = im.toss.deeplink.DeepLinkBaseRegistryKt.IAuthTabCallback + 125;
        im.toss.deeplink.DeepLinkBaseRegistryKt.onWarmupCompleted = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if ((r3 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if (r3 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r3 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Class<?> findClass(@NotNull DeepLinkBaseRegistry deepLinkBaseRegistry, @Nullable String str) {
        DeeplinkEntry deeplinkEntryFindEntry;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(deepLinkBaseRegistry, "");
            deeplinkEntryFindEntry = deepLinkBaseRegistry.findEntry(str);
            int i3 = 11 / 0;
        } else {
            Intrinsics.checkNotNullParameter(deepLinkBaseRegistry, "");
            deeplinkEntryFindEntry = deepLinkBaseRegistry.findEntry(str);
        }
    }
}
