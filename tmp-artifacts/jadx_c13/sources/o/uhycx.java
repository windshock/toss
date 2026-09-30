package o;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.uh1;
import org.jetbrains.annotations.NotNull;

@JvmInline
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class uhycx<Output extends uh1<Output>> {
    private final ulsya<Output> onExtraCallbackWithResult;

    public static boolean onExtraCallback(ulsya<? super Output> ulsyaVar, Object obj) {
        return (obj instanceof uhycx) && Intrinsics.areEqual(ulsyaVar, ((uhycx) obj).onExtraCallback());
    }

    public static int onExtraCallbackWithResult(ulsya<? super Output> ulsyaVar) {
        return ulsyaVar.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <Output extends uh1<Output>> ulsya<Output> onNavigationEvent(@NotNull ulsya<? super Output> ulsyaVar) {
        Intrinsics.checkNotNullParameter(ulsyaVar, "");
        return ulsyaVar;
    }

    public static String onWarmupCompleted(ulsya<? super Output> ulsyaVar) {
        return "Parser(commands=" + ulsyaVar + ')';
    }

    public boolean equals(Object obj) {
        return onExtraCallback(this.onExtraCallbackWithResult, obj);
    }

    public int hashCode() {
        return onExtraCallbackWithResult(this.onExtraCallbackWithResult);
    }

    public final /* synthetic */ ulsya onExtraCallback() {
        return this.onExtraCallbackWithResult;
    }

    public String toString() {
        return onWarmupCompleted(this.onExtraCallbackWithResult);
    }

    public static final class onExtraCallback<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return getFaultAddress.onExtraCallbackWithResult(Integer.valueOf(((pmiycx) t2).onExtraCallbackWithResult()), Integer.valueOf(((pmiycx) t).onExtraCallbackWithResult()));
        }
    }

    public static final class onExtraCallbackWithResult implements Function0<String> {
        public static final onExtraCallbackWithResult onWarmupCompleted = new onExtraCallbackWithResult();

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "There is more input to consume";
        }
    }

    public static /* synthetic */ uh1 onExtraCallback(ulsya ulsyaVar, CharSequence charSequence, uh1 uh1Var, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return onExtraCallbackWithResult(ulsyaVar, charSequence, uh1Var, i);
    }

    public static final Output onExtraCallbackWithResult(ulsya<? super Output> ulsyaVar, @NotNull CharSequence charSequence, @NotNull Output output, int i) throws ludzb {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(output, "");
        ArrayList arrayList = new ArrayList();
        List listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new IAuthTabCallback(output, ulsyaVar, i));
        while (true) {
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) CollectionsKt__MutableCollectionsKt.removeLastOrNull(listMutableListOf);
            if (iAuthTabCallback != null) {
                Output output2 = (Output) ((uh1) iAuthTabCallback.onExtraCallback()).onExtraCallback();
                int iOnNavigationEvent = iAuthTabCallback.onNavigationEvent();
                ulsya ulsyaVarOnExtraCallbackWithResult = iAuthTabCallback.onExtraCallbackWithResult();
                int size = ulsyaVarOnExtraCallbackWithResult.onExtraCallback().size();
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        Object objOnExtraCallback = ((setTextLocales) ulsyaVarOnExtraCallbackWithResult.onExtraCallback().get(i2)).onExtraCallback(output2, charSequence, iOnNavigationEvent);
                        if (objOnExtraCallback instanceof Integer) {
                            iOnNavigationEvent = ((Number) objOnExtraCallback).intValue();
                            i2++;
                        } else if (objOnExtraCallback instanceof pmiycx) {
                            arrayList.add((pmiycx) objOnExtraCallback);
                        } else {
                            throw new IllegalStateException(("Unexpected parse result: " + objOnExtraCallback).toString());
                        }
                    } else if (ulsyaVarOnExtraCallbackWithResult.onExtraCallbackWithResult().isEmpty()) {
                        if (iOnNavigationEvent == charSequence.length()) {
                            return output2;
                        }
                        arrayList.add(new pmiycx(iOnNavigationEvent, onExtraCallbackWithResult.onWarmupCompleted));
                    } else {
                        int size2 = ulsyaVarOnExtraCallbackWithResult.onExtraCallbackWithResult().size() - 1;
                        if (size2 >= 0) {
                            while (true) {
                                int i3 = size2 - 1;
                                listMutableListOf.add(new IAuthTabCallback(output2, (ulsya) ulsyaVarOnExtraCallbackWithResult.onExtraCallbackWithResult().get(size2), iOnNavigationEvent));
                                if (i3 >= 0) {
                                    size2 = i3;
                                }
                            }
                        }
                    }
                }
            } else {
                if (arrayList.size() > 1) {
                    CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, new onExtraCallback());
                }
                throw new ludzb(arrayList);
            }
        }
    }

    static final class IAuthTabCallback<Output> {
        private final Output IAuthTabCallback;
        private final int onExtraCallback;
        private final ulsya<Output> onExtraCallbackWithResult;

        /* JADX WARN: Multi-variable type inference failed */
        public IAuthTabCallback(Output output, @NotNull ulsya<? super Output> ulsyaVar, int i) {
            Intrinsics.checkNotNullParameter(ulsyaVar, "");
            this.IAuthTabCallback = output;
            this.onExtraCallbackWithResult = ulsyaVar;
            this.onExtraCallback = i;
        }

        public final Output onExtraCallback() {
            return this.IAuthTabCallback;
        }

        public final ulsya<Output> onExtraCallbackWithResult() {
            return this.onExtraCallbackWithResult;
        }

        public final int onNavigationEvent() {
            return this.onExtraCallback;
        }
    }
}
