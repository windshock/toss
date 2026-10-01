package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import o.getRippleValue;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getRippleValue<Output> implements setTextLocales<Output> {
    private final onWarmupCompleted onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final removePauseListener<Output, String> onWarmupCompleted;

    public static final class onNavigationEvent<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return getFaultAddress.onExtraCallbackWithResult((String) ((Pair) t).getFirst(), (String) ((Pair) t2).getFirst());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getRippleValue(@NotNull Collection<String> collection, @NotNull removePauseListener<? super Output, String> removepauselistener, @NotNull String str) {
        Intrinsics.checkNotNullParameter(collection, "");
        Intrinsics.checkNotNullParameter(removepauselistener, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.onWarmupCompleted = removepauselistener;
        this.onExtraCallbackWithResult = str;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        boolean z = false;
        int i = 3;
        this.onExtraCallback = new onWarmupCompleted(null, z, i, 0 == true ? 1 : 0);
        for (String str2 : collection) {
            if (str2.length() <= 0) {
                throw new IllegalArgumentException(("Found an empty string in " + this.onExtraCallbackWithResult).toString());
            }
            onWarmupCompleted second = this.onExtraCallback;
            int length = str2.length();
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = str2.charAt(i2);
                List<Pair<String, onWarmupCompleted>> listOnNavigationEvent = second.onNavigationEvent();
                int iBinarySearch = CollectionsKt__CollectionsKt.binarySearch(listOnNavigationEvent, 0, listOnNavigationEvent.size(), new onExtraCallback(String.valueOf(cCharAt)));
                if (iBinarySearch < 0) {
                    onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(objArr2 == true ? 1 : 0, z, i, objArr == true ? 1 : 0);
                    second.onNavigationEvent().add((-iBinarySearch) - 1, getWrite.IAuthTabCallback(String.valueOf(cCharAt), onwarmupcompleted));
                    second = onwarmupcompleted;
                } else {
                    second = second.onNavigationEvent().get(iBinarySearch).getSecond();
                }
            }
            if (second.IAuthTabCallback()) {
                throw new IllegalArgumentException(("The string '" + str2 + "' was passed several times").toString());
            }
            second.onWarmupCompleted(true);
        }
        onWarmupCompleted(this.onExtraCallback);
    }

    static final class onWarmupCompleted {
        private final List<Pair<String, onWarmupCompleted>> onNavigationEvent;
        private boolean onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        public onWarmupCompleted() {
            this(null, false, 3, 0 == true ? 1 : 0);
        }

        public onWarmupCompleted(@NotNull List<Pair<String, onWarmupCompleted>> list, boolean z) {
            Intrinsics.checkNotNullParameter(list, "");
            this.onNavigationEvent = list;
            this.onWarmupCompleted = z;
        }

        public /* synthetic */ onWarmupCompleted(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? false : z);
        }

        public final List<Pair<String, onWarmupCompleted>> onNavigationEvent() {
            return this.onNavigationEvent;
        }

        public final boolean IAuthTabCallback() {
            return this.onWarmupCompleted;
        }

        public final void onWarmupCompleted(boolean z) {
            this.onWarmupCompleted = z;
        }
    }

    private static final void onWarmupCompleted(onWarmupCompleted onwarmupcompleted) {
        Iterator<Pair<String, onWarmupCompleted>> it = onwarmupcompleted.onNavigationEvent().iterator();
        while (it.hasNext()) {
            onWarmupCompleted(it.next().IAuthTabCallback());
        }
        ArrayList arrayList = new ArrayList();
        for (Pair<String, onWarmupCompleted> pair : onwarmupcompleted.onNavigationEvent()) {
            String strOnExtraCallbackWithResult = pair.onExtraCallbackWithResult();
            onWarmupCompleted onwarmupcompletedIAuthTabCallback = pair.IAuthTabCallback();
            if (!onwarmupcompletedIAuthTabCallback.IAuthTabCallback() && onwarmupcompletedIAuthTabCallback.onNavigationEvent().size() == 1) {
                Pair pair2 = (Pair) CollectionsKt___CollectionsKt.single((List) onwarmupcompletedIAuthTabCallback.onNavigationEvent());
                String str = (String) pair2.onExtraCallbackWithResult();
                arrayList.add(getWrite.IAuthTabCallback(strOnExtraCallbackWithResult + str, (onWarmupCompleted) pair2.IAuthTabCallback()));
            } else {
                arrayList.add(getWrite.IAuthTabCallback(strOnExtraCallbackWithResult, onwarmupcompletedIAuthTabCallback));
            }
        }
        onwarmupcompleted.onNavigationEvent().clear();
        onwarmupcompleted.onNavigationEvent().addAll(CollectionsKt___CollectionsKt.sortedWith(arrayList, new onNavigationEvent()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        r1.element += r4.length();
        r0 = r3;
     */
    @Override // o.setTextLocales
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onExtraCallback(Output output, @NotNull final CharSequence charSequence, final int i) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        onWarmupCompleted onwarmupcompleted = this.onExtraCallback;
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = i;
        Integer numValueOf = null;
        loop0: while (intRef.element <= charSequence.length()) {
            if (onwarmupcompleted.IAuthTabCallback()) {
                numValueOf = Integer.valueOf(intRef.element);
            }
            for (Pair<String, onWarmupCompleted> pair : onwarmupcompleted.onNavigationEvent()) {
                String strOnExtraCallbackWithResult = pair.onExtraCallbackWithResult();
                onWarmupCompleted onwarmupcompletedIAuthTabCallback = pair.IAuthTabCallback();
                if (StringsKt__StringsKt.startsWith$default(charSequence, (CharSequence) strOnExtraCallbackWithResult, intRef.element, false, 4, (Object) null)) {
                    break;
                }
            }
        }
        if (numValueOf != null) {
            return xkz1.onExtraCallback(this.onWarmupCompleted, output, charSequence.subSequence(i, numValueOf.intValue()).toString(), i, numValueOf.intValue());
        }
        return fbyycx.Companion.IAuthTabCallback(i, new Function0() { // from class: kotlinx.datetime.internal.format.parser.StringSetParserOperation$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return getRippleValue.onExtraCallback(this.f$0, charSequence, i, intRef);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onExtraCallback(getRippleValue getripplevalue, CharSequence charSequence, int i, Ref.IntRef intRef) {
        return "Expected " + getripplevalue.onExtraCallbackWithResult + " but got " + charSequence.subSequence(i, intRef.element).toString();
    }

    public static final class onExtraCallback implements Function1<Pair<? extends String, ? extends onWarmupCompleted>, Integer> {
        final /* synthetic */ Comparable onExtraCallbackWithResult;

        public onExtraCallback(Comparable comparable) {
            this.onExtraCallbackWithResult = comparable;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(Pair<? extends String, ? extends onWarmupCompleted> pair) {
            return Integer.valueOf(getFaultAddress.onExtraCallbackWithResult(pair.getFirst(), this.onExtraCallbackWithResult));
        }
    }
}
