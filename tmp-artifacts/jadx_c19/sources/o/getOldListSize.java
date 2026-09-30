package o;

import com.kakao.sdk.auth.model.OAuthToken;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class getOldListSize {
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private static final Lazy<getOldListSize> onNavigationEvent = LazyKt.onExtraCallbackWithResult(onNavigationEvent.IAuthTabCallback);
    private final findFirstPartiallyOrCompletelyInvisibleChild IAuthTabCallback;
    private final LinearLayoutManager onExtraCallbackWithResult;

    /* JADX WARN: Multi-variable type inference failed */
    public getOldListSize() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public getOldListSize(@NotNull LinearLayoutManager linearLayoutManager, @NotNull findFirstPartiallyOrCompletelyInvisibleChild findfirstpartiallyorcompletelyinvisiblechild) {
        Intrinsics.checkNotNullParameter(linearLayoutManager, "");
        Intrinsics.checkNotNullParameter(findfirstpartiallyorcompletelyinvisiblechild, "");
        this.onExtraCallbackWithResult = linearLayoutManager;
        this.IAuthTabCallback = findfirstpartiallyorcompletelyinvisiblechild;
    }

    public /* synthetic */ getOldListSize(LinearLayoutManager linearLayoutManager, findFirstPartiallyOrCompletelyInvisibleChild findfirstpartiallyorcompletelyinvisiblechild, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? LinearLayoutManager.Companion.onWarmupCompleted() : linearLayoutManager, (i2 & 2) != 0 ? findFirstPartiallyOrCompletelyInvisibleChild.Companion.onExtraCallbackWithResult() : findfirstpartiallyorcompletelyinvisiblechild);
    }

    public final void onExtraCallbackWithResult(@NotNull String str, @Nullable String str2, @NotNull Function2<? super OAuthToken, ? super Throwable, Unit> function2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.onExtraCallbackWithResult.onExtraCallbackWithResult(str, str2, function2);
    }

    public final void IAuthTabCallback(@NotNull Function2<? super String, ? super Throwable, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.onExtraCallbackWithResult.IAuthTabCallback(function2);
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final getOldListSize onExtraCallbackWithResult() {
            return (getOldListSize) getOldListSize.onNavigationEvent.getValue();
        }
    }

    static final class onNavigationEvent extends Lambda implements Function0<getOldListSize> {
        public static final onNavigationEvent IAuthTabCallback = new onNavigationEvent();

        onNavigationEvent() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final getOldListSize invoke() {
            return new getOldListSize(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }
}
