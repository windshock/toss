package o;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class findFirstPartiallyOrCompletelyInvisibleChild {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private static final Lazy<findFirstPartiallyOrCompletelyInvisibleChild> IAuthTabCallback = LazyKt.onExtraCallbackWithResult(onExtraCallback.onExtraCallback);
    private findLastPartiallyOrCompletelyInvisibleChild onWarmupCompleted;

    /* JADX WARN: Illegal instructions before constructor call */
    public findFirstPartiallyOrCompletelyInvisibleChild() {
        findLastPartiallyOrCompletelyInvisibleChild findlastpartiallyorcompletelyinvisiblechild = null;
        this(findlastpartiallyorcompletelyinvisiblechild, 1, findlastpartiallyorcompletelyinvisiblechild);
    }

    public findFirstPartiallyOrCompletelyInvisibleChild(@NotNull findLastPartiallyOrCompletelyInvisibleChild findlastpartiallyorcompletelyinvisiblechild) {
        Intrinsics.checkNotNullParameter(findlastpartiallyorcompletelyinvisiblechild, "");
        this.onWarmupCompleted = findlastpartiallyorcompletelyinvisiblechild;
    }

    public /* synthetic */ findFirstPartiallyOrCompletelyInvisibleChild(findLastPartiallyOrCompletelyInvisibleChild findlastpartiallyorcompletelyinvisiblechild, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? computeScrollExtent.Companion.onNavigationEvent() : findlastpartiallyorcompletelyinvisiblechild);
    }

    public final findLastPartiallyOrCompletelyInvisibleChild onExtraCallback() {
        return this.onWarmupCompleted;
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final findFirstPartiallyOrCompletelyInvisibleChild onExtraCallbackWithResult() {
            return (findFirstPartiallyOrCompletelyInvisibleChild) findFirstPartiallyOrCompletelyInvisibleChild.IAuthTabCallback.getValue();
        }
    }

    static final class onExtraCallback extends Lambda implements Function0<findFirstPartiallyOrCompletelyInvisibleChild> {
        public static final onExtraCallback onExtraCallback = new onExtraCallback();

        onExtraCallback() {
            super(0);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final findFirstPartiallyOrCompletelyInvisibleChild invoke() {
            findLastPartiallyOrCompletelyInvisibleChild findlastpartiallyorcompletelyinvisiblechild = null;
            return new findFirstPartiallyOrCompletelyInvisibleChild(findlastpartiallyorcompletelyinvisiblechild, 1, findlastpartiallyorcompletelyinvisiblechild);
        }
    }
}
