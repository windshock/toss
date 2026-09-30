package o;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface zbsya {
    public static final onExtraCallbackWithResult Companion = onExtraCallbackWithResult.onExtraCallback;

    public static final class onExtraCallbackWithResult {
        static final /* synthetic */ onExtraCallbackWithResult onExtraCallback = new onExtraCallbackWithResult();

        private onExtraCallbackWithResult() {
        }
    }

    public static final class IAuthTabCallback implements zbsya {
        private final zbsya onExtraCallback;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IAuthTabCallback) && Intrinsics.areEqual(this.onExtraCallback, ((IAuthTabCallback) obj).onExtraCallback);
        }

        public int hashCode() {
            return this.onExtraCallback.hashCode();
        }

        public final zbsya onExtraCallbackWithResult() {
            return this.onExtraCallback;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            sb.append(this.onExtraCallback);
            sb.append(']');
            return sb.toString();
        }
    }

    public static final class onWarmupCompleted implements zbsya {
        private final List<zbsya> onExtraCallback;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof onWarmupCompleted) && Intrinsics.areEqual(this.onExtraCallback, ((onWarmupCompleted) obj).onExtraCallback);
        }

        public int hashCode() {
            return this.onExtraCallback.hashCode();
        }

        public final List<zbsya> onExtraCallbackWithResult() {
            return this.onExtraCallback;
        }

        public String toString() {
            return CollectionsKt.joinToString$default(this.onExtraCallback, BuildConfig.FLAVOR, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
        }
    }

    public static final class onExtraCallback implements zbsya {
        private final String IAuthTabCallback;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof onExtraCallback) && Intrinsics.areEqual(this.IAuthTabCallback, ((onExtraCallback) obj).IAuthTabCallback);
        }

        public int hashCode() {
            return this.IAuthTabCallback.hashCode();
        }

        public final String onNavigationEvent() {
            return this.IAuthTabCallback;
        }

        public String toString() {
            if (Intrinsics.areEqual(this.IAuthTabCallback, "'")) {
                return "''";
            }
            String str = this.IAuthTabCallback;
            for (int i = 0; i < str.length(); i++) {
                if (Character.isLetter(str.charAt(i))) {
                    return '\'' + this.IAuthTabCallback + '\'';
                }
            }
            return this.IAuthTabCallback.length() == 0 ? BuildConfig.FLAVOR : this.IAuthTabCallback;
        }
    }

    public static abstract class onNavigationEvent implements zbsya {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract int IAuthTabCallback();

        public abstract char onNavigationEvent();

        private onNavigationEvent() {
        }

        public String toString() {
            return StringsKt.repeat(String.valueOf(onNavigationEvent()), IAuthTabCallback());
        }

        public boolean equals(@Nullable Object obj) {
            if (!(obj instanceof onNavigationEvent)) {
                return false;
            }
            onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
            return onNavigationEvent() == onnavigationevent.onNavigationEvent() && IAuthTabCallback() == onnavigationevent.IAuthTabCallback();
        }

        public int hashCode() {
            return (Character.hashCode(onNavigationEvent()) * 31) + IAuthTabCallback();
        }

        public static abstract class onExtraCallback extends onWarmupCompleted {
            private onExtraCallback() {
                super(null);
            }
        }

        public static abstract class onWarmupCompleted extends onNavigationEvent {
            public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private onWarmupCompleted() {
                super(null);
            }
        }

        public static abstract class IAuthTabCallback extends onNavigationEvent {
            private IAuthTabCallback() {
                super(null);
            }
        }

        public static abstract class onExtraCallbackWithResult extends onNavigationEvent {
            private onExtraCallbackWithResult() {
                super(null);
            }
        }

        /* renamed from: o.zbsya$onNavigationEvent$onNavigationEvent, reason: collision with other inner class name */
        public static abstract class AbstractC0006onNavigationEvent extends onNavigationEvent {
            private AbstractC0006onNavigationEvent() {
                super(null);
            }
        }
    }
}
