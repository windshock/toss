package o;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class hf1 {
    public /* synthetic */ hf1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract KSerializer<?> onExtraCallbackWithResult(@NotNull List<? extends KSerializer<?>> list);

    private hf1() {
    }

    public static final class onWarmupCompleted extends hf1 {
        private final KSerializer<?> onWarmupCompleted;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(@NotNull KSerializer<?> kSerializer) {
            super(null);
            Intrinsics.checkNotNullParameter(kSerializer, "");
            this.onWarmupCompleted = kSerializer;
        }

        public final KSerializer<?> onNavigationEvent() {
            return this.onWarmupCompleted;
        }

        @Override // o.hf1
        public KSerializer<?> onExtraCallbackWithResult(@NotNull List<? extends KSerializer<?>> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return this.onWarmupCompleted;
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof onWarmupCompleted) && Intrinsics.areEqual(((onWarmupCompleted) obj).onWarmupCompleted, this.onWarmupCompleted);
        }

        public int hashCode() {
            return this.onWarmupCompleted.hashCode();
        }
    }

    public static final class onExtraCallbackWithResult extends hf1 {
        private final Function1<List<? extends KSerializer<?>>, KSerializer<?>> onNavigationEvent;

        public final Function1<List<? extends KSerializer<?>>, KSerializer<?>> onExtraCallbackWithResult() {
            return this.onNavigationEvent;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public onExtraCallbackWithResult(@NotNull Function1<? super List<? extends KSerializer<?>>, ? extends KSerializer<?>> function1) {
            super(null);
            Intrinsics.checkNotNullParameter(function1, "");
            this.onNavigationEvent = function1;
        }

        @Override // o.hf1
        public KSerializer<?> onExtraCallbackWithResult(@NotNull List<? extends KSerializer<?>> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return this.onNavigationEvent.invoke(list);
        }
    }
}
