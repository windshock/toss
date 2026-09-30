package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class getEventDispatcher extends Throwable {
    private final String url;

    public /* synthetic */ getEventDispatcher(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    public static final class IAuthTabCallback extends getEventDispatcher {
        /* JADX WARN: Illegal instructions before constructor call */
        public IAuthTabCallback() {
            String str = null;
            this(str, str, 3, str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(@NotNull String str, @Nullable String str2) {
            super(str, str2, null);
            Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        }

        public /* synthetic */ IAuthTabCallback(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? BuildConfig.FLAVOR : str, (i & 2) != 0 ? null : str2);
        }
    }

    private getEventDispatcher(String str, String str2) {
        super(str);
        this.url = str2;
    }

    public final String onWarmupCompleted() {
        return this.url;
    }

    public static final class onWarmupCompleted extends getEventDispatcher {
        private final String schema;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(@NotNull String str, @Nullable String str2, @Nullable String str3) {
            super(str, str2, null);
            Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
            this.schema = str3;
        }

        public final String onExtraCallback() {
            return this.schema;
        }
    }

    public static final class onExtraCallback extends getEventDispatcher {
        /* JADX WARN: Illegal instructions before constructor call */
        public onExtraCallback() {
            String str = null;
            this(str, str, 3, str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(@NotNull String str, @Nullable String str2) {
            super(str, str2, null);
            Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        }

        public /* synthetic */ onExtraCallback(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? BuildConfig.FLAVOR : str, (i & 2) != 0 ? null : str2);
        }
    }
}
