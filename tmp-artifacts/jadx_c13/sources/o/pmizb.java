package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.pmizb;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class pmizb<Output> implements setTextLocales<Output> {
    private final int IAuthTabCallback;
    private final boolean onExtraCallbackWithResult;
    private final List<done<Output>> onNavigationEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public pmizb(@NotNull List<? extends done<? super Output>> list) {
        boolean z;
        Intrinsics.checkNotNullParameter(list, "");
        this.onNavigationEvent = list;
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            int iIntValue = 1;
            if (!it.hasNext()) {
                break;
            }
            Integer numOnNavigationEvent = ((done) it.next()).onNavigationEvent();
            if (numOnNavigationEvent != null) {
                iIntValue = numOnNavigationEvent.intValue();
            }
            i2 += iIntValue;
        }
        this.IAuthTabCallback = i2;
        List<done<Output>> list2 = this.onNavigationEvent;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            z = false;
        } else {
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                if (((done) it2.next()).onNavigationEvent() == null) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        this.onExtraCallbackWithResult = z;
        List<done<Output>> list3 = this.onNavigationEvent;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator<T> it3 = list3.iterator();
            while (it3.hasNext()) {
                Integer numOnNavigationEvent2 = ((done) it3.next()).onNavigationEvent();
                if (numOnNavigationEvent2 != null && numOnNavigationEvent2.intValue() <= 0) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
        }
        List<done<Output>> list4 = this.onNavigationEvent;
        if ((list4 instanceof Collection) && list4.isEmpty()) {
            return;
        }
        Iterator<T> it4 = list4.iterator();
        while (it4.hasNext()) {
            if (((done) it4.next()).onNavigationEvent() == null && (i = i + 1) < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        if (i <= 1) {
            return;
        }
        List<done<Output>> list5 = this.onNavigationEvent;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list5) {
            if (((done) obj).onNavigationEvent() == null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            arrayList2.add(((done) it5.next()).onExtraCallbackWithResult());
        }
        throw new IllegalArgumentException(("At most one variable-length numeric field in a row is allowed, but got several: " + arrayList2 + ". Parsing is undefined: for example, with variable-length month number and variable-length day of month, '111' can be parsed as Jan 11th or Nov 1st.").toString());
    }

    public final List<done<Output>> onWarmupCompleted() {
        return this.onNavigationEvent;
    }

    private final String onExtraCallbackWithResult() {
        String str;
        List<done<Output>> list = this.onNavigationEvent;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            done doneVar = (done) it.next();
            StringBuilder sb = new StringBuilder();
            Integer numOnNavigationEvent = doneVar.onNavigationEvent();
            if (numOnNavigationEvent == null) {
                str = "at least one digit";
            } else {
                str = numOnNavigationEvent + " digits";
            }
            sb.append(str);
            sb.append(" for ");
            sb.append(doneVar.onExtraCallbackWithResult());
            arrayList.add(sb.toString());
        }
        if (this.onExtraCallbackWithResult) {
            return "a number with at least " + this.IAuthTabCallback + " digits: " + arrayList;
        }
        return "a number with exactly " + this.IAuthTabCallback + " digits: " + arrayList;
    }

    @Override // o.setTextLocales
    public Object onExtraCallback(Output output, @NotNull CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        if (this.IAuthTabCallback + i > charSequence.length()) {
            return fbyycx.Companion.IAuthTabCallback(i, new Function0() { // from class: kotlinx.datetime.internal.format.parser.NumberSpanParserOperation$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return pmizb.onWarmupCompleted(this.f$0);
                }
            });
        }
        final Ref.IntRef intRef = new Ref.IntRef();
        while (intRef.element + i < charSequence.length() && jw10.IAuthTabCallback(charSequence.charAt(intRef.element + i))) {
            intRef.element++;
        }
        if (intRef.element < this.IAuthTabCallback) {
            return fbyycx.Companion.IAuthTabCallback(i, new Function0() { // from class: kotlinx.datetime.internal.format.parser.NumberSpanParserOperation$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return pmizb.IAuthTabCallback(intRef, this);
                }
            });
        }
        int size = this.onNavigationEvent.size();
        final int i2 = 0;
        while (i2 < size) {
            Integer numOnNavigationEvent = this.onNavigationEvent.get(i2).onNavigationEvent();
            int iIntValue = (numOnNavigationEvent != null ? numOnNavigationEvent.intValue() : (intRef.element - this.IAuthTabCallback) + 1) + i;
            final wwx1 wwx1VarOnWarmupCompleted = this.onNavigationEvent.get(i2).onWarmupCompleted(output, charSequence, i, iIntValue);
            if (wwx1VarOnWarmupCompleted != null) {
                final String string = charSequence.subSequence(i, iIntValue).toString();
                return fbyycx.Companion.IAuthTabCallback(i, new Function0() { // from class: kotlinx.datetime.internal.format.parser.NumberSpanParserOperation$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return pmizb.onNavigationEvent(string, this, i2, wwx1VarOnWarmupCompleted);
                    }
                });
            }
            i2++;
            i = iIntValue;
        }
        return fbyycx.Companion.onExtraCallbackWithResult(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onWarmupCompleted(pmizb pmizbVar) {
        return "Unexpected end of input: yet to parse " + pmizbVar.onExtraCallbackWithResult();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String IAuthTabCallback(Ref.IntRef intRef, pmizb pmizbVar) {
        return "Only found " + intRef.element + " digits in a row, but need to parse " + pmizbVar.onExtraCallbackWithResult();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onNavigationEvent(String str, pmizb pmizbVar, int i, wwx1 wwx1Var) {
        return "Can not interpret the string '" + str + "' as " + pmizbVar.onNavigationEvent.get(i).onExtraCallbackWithResult() + ": " + wwx1Var.onWarmupCompleted();
    }

    public String toString() {
        return onExtraCallbackWithResult();
    }
}
