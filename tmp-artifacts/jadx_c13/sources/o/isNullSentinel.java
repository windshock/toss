package o;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import o.isNullSentinel;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class isNullSentinel {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    private List<String> onExtraCallbackWithResult = CollectionsKt__CollectionsKt.emptyList();

    public static /* synthetic */ void onExtraCallback(Function1 function1, isNullSentinel isnullsentinel, CharSequence charSequence, Function2 function2, int i, TextView textView, View view) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 109;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        IAuthTabCallback(function1, isnullsentinel, charSequence, function2, i, textView, view);
        if (i4 == 0) {
            throw null;
        }
    }

    public final void onExtraCallback(@NotNull List<String> list) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        this.onExtraCallbackWithResult = list;
        int i4 = onExtraCallback + 63;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 11 / 0;
        }
    }

    public final void IAuthTabCallback(@NotNull List<? extends TextView> list, @NotNull final Function2<? super Integer, ? super View, Unit> function2, @NotNull final Function1<? super List<Integer>, Unit> function1) {
        TextView textView;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        int i4 = 0;
        for (Object obj : list) {
            if (i4 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            final TextView textView2 = (TextView) obj;
            CharSequence text = null;
            if (textView2 != null) {
                int i5 = onWarmupCompleted + 9;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                textView = textView2;
            } else {
                textView = null;
            }
            if (textView != null) {
                int i7 = onExtraCallback + 105;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                text = textView.getText();
            }
            final CharSequence charSequence = text;
            final int i9 = i4;
            textView2.setOnClickListener(new View.OnClickListener() { // from class: im.toss.uikit.utils.BlurKeyboardTouchManager$$ExternalSyntheticLambda0
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i10 = 2 % 2;
                    int i11 = onExtraCallback + 83;
                    onWarmupCompleted = i11 % 128;
                    int i12 = i11 % 2;
                    isNullSentinel.onExtraCallback(function1, this, charSequence, function2, i9, textView2, view);
                    int i13 = onExtraCallback + 119;
                    onWarmupCompleted = i13 % 128;
                    int i14 = i13 % 2;
                }
            });
            i4++;
        }
    }

    private static final void IAuthTabCallback(Function1 function1, isNullSentinel isnullsentinel, CharSequence charSequence, Function2 function2, int i, TextView textView, View view) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 15;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            function1.invoke(isnullsentinel.onNavigationEvent(isnullsentinel.onExtraCallbackWithResult, String.valueOf(charSequence)));
            function2.invoke(Integer.valueOf(i), textView);
            int i4 = 25 / 0;
        } else {
            function1.invoke(isnullsentinel.onNavigationEvent(isnullsentinel.onExtraCallbackWithResult, String.valueOf(charSequence)));
            function2.invoke(Integer.valueOf(i), textView);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final List<Integer> onNavigationEvent(List<String> list, String str) {
        int i = 2 % 2;
        int iIndexOf = list.indexOf(str);
        if (iIndexOf < 0) {
            int i2 = onWarmupCompleted + 61;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 21 / 0;
            }
            return null;
        }
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{new Pair(1, 1), new Pair(1, 2), new Pair(1, 3), new Pair(2, 1), new Pair(2, 2), new Pair(2, 3), new Pair(3, 1), new Pair(3, 2), new Pair(3, 3), new Pair(4, 2)});
        Pair pair = (Pair) listListOf.get(iIndexOf);
        ArrayList arrayList = new ArrayList();
        Iterator it = listListOf.iterator();
        int i4 = onExtraCallback + 65;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        while (!(!it.hasNext())) {
            int i6 = onExtraCallback + 61;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            Object next = it.next();
            Pair pair2 = (Pair) next;
            int iAbs = Math.abs(((Number) pair.getFirst()).intValue() - ((Number) pair2.getFirst()).intValue());
            int iAbs2 = Math.abs(((Number) pair.getSecond()).intValue() - ((Number) pair2.getSecond()).intValue());
            if (iAbs <= 1 && iAbs2 <= 1) {
                int i8 = onExtraCallback + 7;
                onWarmupCompleted = i8 % 128;
                if (i8 % 2 == 0) {
                    if (iAbs == 1) {
                        if (iAbs2 != 1) {
                        }
                    }
                } else if (iAbs == 1) {
                    if (iAbs2 != 1) {
                    }
                }
            }
            arrayList.add(next);
        }
        int iIndexOf2 = listListOf.indexOf((Pair) CollectionsKt___CollectionsKt.random(arrayList, Random.onNavigationEvent));
        if (iIndexOf2 < 0) {
            return null;
        }
        Pair pair3 = (Pair) listListOf.get(iIndexOf2);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            Pair pair4 = (Pair) obj;
            int iAbs3 = Math.abs(((Number) pair3.getFirst()).intValue() - ((Number) pair4.getFirst()).intValue());
            int iAbs4 = Math.abs(((Number) pair3.getSecond()).intValue() - ((Number) pair4.getSecond()).intValue());
            if (iAbs3 > 1 || iAbs4 > 1 || (iAbs3 == 1 && iAbs4 == 1)) {
                arrayList2.add(obj);
            }
        }
        int iIndexOf3 = listListOf.indexOf((Pair) CollectionsKt___CollectionsKt.random(arrayList2, Random.onNavigationEvent));
        if (iIndexOf3 < 0) {
            return null;
        }
        return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(iIndexOf), Integer.valueOf(iIndexOf2), Integer.valueOf(iIndexOf3)});
    }
}
