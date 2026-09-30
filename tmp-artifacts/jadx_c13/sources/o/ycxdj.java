package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.pmiycx;
import o.ycxdj;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ycxdj {
    private static final <T> ulsya<T> IAuthTabCallback(ulsya<? super T> ulsyaVar, ulsya<? super T> ulsyaVar2) {
        if (ulsyaVar.onExtraCallbackWithResult().isEmpty()) {
            return new ulsya<>(CollectionsKt___CollectionsKt.plus((Collection) ulsyaVar.onExtraCallback(), (Iterable) ulsyaVar2.onExtraCallback()), ulsyaVar2.onExtraCallbackWithResult());
        }
        List<setTextLocales<? super T>> listOnExtraCallback = ulsyaVar.onExtraCallback();
        List<ulsya<? super T>> listOnExtraCallbackWithResult = ulsyaVar.onExtraCallbackWithResult();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listOnExtraCallbackWithResult, 10));
        Iterator<T> it = listOnExtraCallbackWithResult.iterator();
        while (it.hasNext()) {
            arrayList.add(IAuthTabCallback((ulsya) it.next(), ulsyaVar2));
        }
        return new ulsya<>(listOnExtraCallback, arrayList);
    }

    private static final <T> ulsya<T> IAuthTabCallback(ulsya<? super T> ulsyaVar, List<ycxlud<T>> list) {
        ulsya ulsyaVar2;
        List listListOf;
        ArrayList arrayList = new ArrayList();
        List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) list);
        List mutableList2 = null;
        for (setTextLocales<? super T> settextlocales : ulsyaVar.onExtraCallback()) {
            if (settextlocales instanceof pmizb) {
                if (mutableList2 != null) {
                    mutableList2.addAll(((pmizb) settextlocales).onWarmupCompleted());
                } else {
                    mutableList2 = CollectionsKt___CollectionsKt.toMutableList((Collection) ((pmizb) settextlocales).onWarmupCompleted());
                }
            } else if (settextlocales instanceof ycxlud) {
                mutableList.add(settextlocales);
            } else {
                if (mutableList2 != null) {
                    arrayList.add(new pmizb(mutableList2));
                    mutableList2 = null;
                }
                arrayList.add(settextlocales);
            }
        }
        List<ulsya<? super T>> listOnExtraCallbackWithResult = ulsyaVar.onExtraCallbackWithResult();
        List arrayList2 = new ArrayList();
        Iterator<T> it = listOnExtraCallbackWithResult.iterator();
        while (it.hasNext()) {
            ulsya ulsyaVarIAuthTabCallback = IAuthTabCallback((ulsya) it.next(), mutableList);
            if (ulsyaVarIAuthTabCallback.onExtraCallback().isEmpty()) {
                List listOnExtraCallbackWithResult2 = ulsyaVarIAuthTabCallback.onExtraCallbackWithResult();
                if (listOnExtraCallbackWithResult2.isEmpty()) {
                    listOnExtraCallbackWithResult2 = CollectionsKt__CollectionsJVMKt.listOf(ulsyaVarIAuthTabCallback);
                }
                listListOf = listOnExtraCallbackWithResult2;
            } else {
                listListOf = CollectionsKt__CollectionsJVMKt.listOf(ulsyaVarIAuthTabCallback);
            }
            CollectionsKt__MutableCollectionsKt.addAll(arrayList2, listListOf);
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = CollectionsKt__CollectionsJVMKt.listOf(new ulsya(mutableList, CollectionsKt__CollectionsKt.emptyList()));
        }
        List list2 = arrayList2;
        if (mutableList2 == null) {
            return new ulsya<>(arrayList, list2);
        }
        List<ulsya> list3 = list2;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                setTextLocales settextlocales2 = (setTextLocales) CollectionsKt___CollectionsKt.firstOrNull(((ulsya) it2.next()).onExtraCallback());
                if (settextlocales2 != null && (settextlocales2 instanceof pmizb)) {
                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                    for (ulsya ulsyaVar3 : list3) {
                        setTextLocales settextlocales3 = (setTextLocales) CollectionsKt___CollectionsKt.firstOrNull(ulsyaVar3.onExtraCallback());
                        if (settextlocales3 instanceof pmizb) {
                            ulsyaVar2 = new ulsya(CollectionsKt___CollectionsKt.plus((Collection) CollectionsKt__CollectionsJVMKt.listOf(new pmizb(CollectionsKt___CollectionsKt.plus((Collection) mutableList2, (Iterable) ((pmizb) settextlocales3).onWarmupCompleted()))), (Iterable) CollectionsKt___CollectionsKt.drop(ulsyaVar3.onExtraCallback(), 1)), ulsyaVar3.onExtraCallbackWithResult());
                        } else if (settextlocales3 == null) {
                            ulsyaVar2 = new ulsya(CollectionsKt__CollectionsJVMKt.listOf(new pmizb(mutableList2)), ulsyaVar3.onExtraCallbackWithResult());
                        } else {
                            ulsyaVar2 = new ulsya(CollectionsKt___CollectionsKt.plus((Collection) CollectionsKt__CollectionsJVMKt.listOf(new pmizb(mutableList2)), (Iterable) ulsyaVar3.onExtraCallback()), ulsyaVar3.onExtraCallbackWithResult());
                        }
                        arrayList3.add(ulsyaVar2);
                    }
                    return new ulsya<>(arrayList, arrayList3);
                }
            }
        }
        arrayList.add(new pmizb(mutableList2));
        return new ulsya<>(arrayList, list2);
    }

    public static final <T> ulsya<T> onExtraCallback(@NotNull List<? extends ulsya<? super T>> list) {
        Intrinsics.checkNotNullParameter(list, "");
        ulsya ulsyaVar = new ulsya(CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.emptyList());
        if (!list.isEmpty()) {
            ListIterator<? extends ulsya<? super T>> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                ulsyaVar = IAuthTabCallback(listIterator.previous(), ulsyaVar);
            }
        }
        return IAuthTabCallback(ulsyaVar, CollectionsKt__CollectionsKt.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onExtraCallbackWithResult(List<pmiycx> list) {
        if (list.size() == 1) {
            return "Position " + list.get(0).onExtraCallbackWithResult() + ": " + list.get(0).onNavigationEvent().invoke();
        }
        String string = ((StringBuilder) CollectionsKt___CollectionsKt.joinTo$default(list, new StringBuilder(list.size() * 33), ", ", "Errors: ", null, 0, null, new Function1() { // from class: kotlinx.datetime.internal.format.parser.ParserKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ycxdj.IAuthTabCallback((pmiycx) obj);
            }
        }, 56, null)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence IAuthTabCallback(pmiycx pmiycxVar) {
        Intrinsics.checkNotNullParameter(pmiycxVar, "");
        return "position " + pmiycxVar.onExtraCallbackWithResult() + ": '" + pmiycxVar.onNavigationEvent().invoke() + '\'';
    }
}
