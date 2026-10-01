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
public final class rl {
    private final List<String> onWarmupCompleted;
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    private static final rl onNavigationEvent = new rl(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
    private static final rl IAuthTabCallback = new rl(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}));

    public rl(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.onWarmupCompleted = list;
        if (list.size() != 12) {
            throw new IllegalArgumentException("Month names must contain exactly 12 elements");
        }
        Iterator<Integer> it = CollectionsKt__CollectionsKt.getIndices(list).iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            if (this.onWarmupCompleted.get(iNextInt).length() <= 0) {
                throw new IllegalArgumentException("A month name can not be empty");
            }
            for (int i = 0; i < iNextInt; i++) {
                if (Intrinsics.areEqual(this.onWarmupCompleted.get(iNextInt), this.onWarmupCompleted.get(i))) {
                    throw new IllegalArgumentException(("Month names must be unique, but '" + this.onWarmupCompleted.get(iNextInt) + "' was repeated").toString());
                }
            }
        }
    }

    public final List<String> onWarmupCompleted() {
        return this.onWarmupCompleted;
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public final rl IAuthTabCallback() {
            return rl.IAuthTabCallback;
        }
    }

    final /* synthetic */ class onNavigationEvent extends FunctionReferenceImpl implements Function1<String, String> {
        public static final onNavigationEvent onExtraCallback = new onNavigationEvent();

        onNavigationEvent() {
            super(1, String.class, "toString", "toString()Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return str.toString();
        }
    }

    public String toString() {
        return CollectionsKt___CollectionsKt.joinToString$default(this.onWarmupCompleted, ", ", "MonthNames(", ")", 0, null, onNavigationEvent.onExtraCallback, 24, null);
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof rl) && Intrinsics.areEqual(this.onWarmupCompleted, ((rl) obj).onWarmupCompleted);
    }

    public int hashCode() {
        return this.onWarmupCompleted.hashCode();
    }
}
