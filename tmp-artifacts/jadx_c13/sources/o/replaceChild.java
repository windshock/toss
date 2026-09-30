package o;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class replaceChild {
    private final List<String> onExtraCallbackWithResult;
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private static final replaceChild onNavigationEvent = new replaceChild(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}));
    private static final replaceChild IAuthTabCallback = new replaceChild(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"}));

    public replaceChild(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.onExtraCallbackWithResult = list;
        if (list.size() != 7) {
            throw new IllegalArgumentException("Day of week names must contain exactly 7 elements");
        }
        Iterator<Integer> it = CollectionsKt__CollectionsKt.getIndices(list).iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            if (this.onExtraCallbackWithResult.get(iNextInt).length() <= 0) {
                throw new IllegalArgumentException("A day-of-week name can not be empty");
            }
            for (int i = 0; i < iNextInt; i++) {
                if (Intrinsics.areEqual(this.onExtraCallbackWithResult.get(iNextInt), this.onExtraCallbackWithResult.get(i))) {
                    throw new IllegalArgumentException(("Day-of-week names must be unique, but '" + this.onExtraCallbackWithResult.get(iNextInt) + "' was repeated").toString());
                }
            }
        }
    }

    public final List<String> onExtraCallback() {
        return this.onExtraCallbackWithResult;
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final replaceChild onNavigationEvent() {
            return replaceChild.IAuthTabCallback;
        }
    }

    final /* synthetic */ class onExtraCallbackWithResult extends FunctionReferenceImpl implements Function1<String, String> {
        public static final onExtraCallbackWithResult onNavigationEvent = new onExtraCallbackWithResult();

        onExtraCallbackWithResult() {
            super(1, String.class, "toString", "toString()Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return str.toString();
        }
    }

    public String toString() {
        return CollectionsKt___CollectionsKt.joinToString$default(this.onExtraCallbackWithResult, ", ", "DayOfWeekNames(", ")", 0, null, onExtraCallbackWithResult.onNavigationEvent, 24, null);
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof replaceChild) && Intrinsics.areEqual(this.onExtraCallbackWithResult, ((replaceChild) obj).onExtraCallbackWithResult);
    }

    public int hashCode() {
        return this.onExtraCallbackWithResult.hashCode();
    }
}
