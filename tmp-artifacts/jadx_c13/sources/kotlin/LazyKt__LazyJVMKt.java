package kotlin;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.TombstoneProtosMemoryMappingBuilder;
import o.TombstoneProtosMemoryMappingOrBuilder;
import o.access12900;
import o.clearU64;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class LazyKt__LazyJVMKt {

    public static final /* synthetic */ class onNavigationEvent {
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[TombstoneProtosMemoryMappingBuilder.values().length];
            try {
                iArr[TombstoneProtosMemoryMappingBuilder.SYNCHRONIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TombstoneProtosMemoryMappingBuilder.PUBLICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TombstoneProtosMemoryMappingBuilder.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            onWarmupCompleted = iArr;
        }
    }

    public static <T> Lazy<T> lazy(@NotNull Function0<? extends T> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        return new TombstoneProtosMemoryMappingOrBuilder(function0, null, 2, null);
    }

    public static <T> Lazy<T> lazy(@NotNull TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder, @NotNull Function0<? extends T> function0) {
        Intrinsics.checkNotNullParameter(tombstoneProtosMemoryMappingBuilder, "");
        Intrinsics.checkNotNullParameter(function0, "");
        int i = onNavigationEvent.onWarmupCompleted[tombstoneProtosMemoryMappingBuilder.ordinal()];
        if (i == 1) {
            return new TombstoneProtosMemoryMappingOrBuilder(function0, null, 2, null);
        }
        if (i == 2) {
            return new access12900(function0);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return new clearU64(function0);
    }

    public static final <T> Lazy<T> lazy(@Nullable Object obj, @NotNull Function0<? extends T> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        return new TombstoneProtosMemoryMappingOrBuilder(function0, obj);
    }
}
