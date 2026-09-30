package o;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.datetime.internal.format.parser.ReducedIntConsumer;
import o.xkz1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class xkz1 {
    public static final <Output> ulsya<Output> onExtraCallbackWithResult(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @NotNull removePauseListener<? super Output, Integer> removepauselistener, @NotNull String str, @Nullable Integer num4) {
        Intrinsics.checkNotNullParameter(removepauselistener, "");
        Intrinsics.checkNotNullParameter(str, "");
        List listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(onExtraCallback(num, num2, num3, removepauselistener, str, true));
        if (num4 != null) {
            listMutableListOf.add(onNavigationEvent(num, num4, num3, removepauselistener, str, false, 32, null));
            listMutableListOf.add(new ulsya(CollectionsKt__CollectionsKt.listOf((Object[]) new setTextLocales[]{new ulzb("+"), new pmizb(CollectionsKt__CollectionsJVMKt.listOf(new ycxExternalSyntheticApiModelOutline0(Integer.valueOf(num4.intValue() + 1), num2, removepauselistener, str, false)))}), CollectionsKt__CollectionsKt.emptyList()));
        } else {
            listMutableListOf.add(onNavigationEvent(num, num2, num3, removepauselistener, str, false, 32, null));
        }
        return new ulsya<>(CollectionsKt__CollectionsKt.emptyList(), listMutableListOf);
    }

    public static /* synthetic */ ulsya onNavigationEvent(Integer num, Integer num2, Integer num3, removePauseListener removepauselistener, String str, boolean z, int i, Object obj) {
        if ((i & 32) != 0) {
            z = false;
        }
        return onExtraCallback(num, num2, num3, removepauselistener, str, z);
    }

    public static final <Target> ulsya<Target> onExtraCallback(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @NotNull removePauseListener<? super Target, Integer> removepauselistener, @NotNull String str, boolean z) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(removepauselistener, "");
        Intrinsics.checkNotNullParameter(str, "");
        int iIntValue2 = (num != null ? num.intValue() : 1) + (z ? 1 : 0);
        if (num2 != null) {
            iIntValue = num2.intValue();
            if (z) {
                iIntValue++;
            }
        } else {
            iIntValue = IntCompanionObject.MAX_VALUE;
        }
        int iIntValue3 = num3 != null ? num3.intValue() : 0;
        int iMin = Math.min(iIntValue, iIntValue3);
        if (iIntValue2 >= iMin) {
            return onExtraCallbackWithResult(z, removepauselistener, str, iIntValue2, iIntValue);
        }
        ulsya<Target> ulsyaVarOnExtraCallbackWithResult = onExtraCallbackWithResult(z, removepauselistener, str, iIntValue2, iIntValue2);
        while (iIntValue2 < iMin) {
            iIntValue2++;
            ulsyaVarOnExtraCallbackWithResult = new ulsya<>(CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.listOf((Object[]) new ulsya[]{onExtraCallbackWithResult(z, removepauselistener, str, iIntValue2, iIntValue2), ycxdj.onExtraCallback(CollectionsKt__CollectionsKt.listOf((Object[]) new ulsya[]{new ulsya(CollectionsKt__CollectionsJVMKt.listOf(new ulzb(" ")), CollectionsKt__CollectionsKt.emptyList()), ulsyaVarOnExtraCallbackWithResult}))}));
        }
        if (iIntValue3 > iIntValue) {
            return ycxdj.onExtraCallback(CollectionsKt__CollectionsKt.listOf((Object[]) new ulsya[]{new ulsya(CollectionsKt__CollectionsJVMKt.listOf(new ulzb(StringsKt__StringsJVMKt.repeat(" ", iIntValue3 - iIntValue))), CollectionsKt__CollectionsKt.emptyList()), ulsyaVarOnExtraCallbackWithResult}));
        }
        return iIntValue3 == iIntValue ? ulsyaVarOnExtraCallbackWithResult : new ulsya<>(CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.listOf((Object[]) new ulsya[]{onExtraCallbackWithResult(z, removepauselistener, str, iIntValue3 + 1, iIntValue), ulsyaVarOnExtraCallbackWithResult}));
    }

    private static final <Target> ulsya<Target> onExtraCallbackWithResult(boolean z, removePauseListener<? super Target, Integer> removepauselistener, String str, int i, int i2) {
        if (i2 < (z ? 1 : 0) + 1) {
            throw new IllegalStateException("Check failed.");
        }
        List listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        if (z) {
            listCreateListBuilder.add(new ulzb("-"));
        }
        listCreateListBuilder.add(new pmizb(CollectionsKt__CollectionsJVMKt.listOf(new ycxExternalSyntheticApiModelOutline0(Integer.valueOf(i - (z ? 1 : 0)), Integer.valueOf(i2 - (z ? 1 : 0)), removepauselistener, str, z))));
        return new ulsya<>(CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder), CollectionsKt__CollectionsKt.emptyList());
    }

    public static final <Output> ulsya<Output> onExtraCallback(int i, int i2, @NotNull removePauseListener<? super Output, Integer> removepauselistener, @NotNull String str) {
        Intrinsics.checkNotNullParameter(removepauselistener, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new ulsya<>(CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.listOf((Object[]) new ulsya[]{new ulsya(CollectionsKt__CollectionsJVMKt.listOf(new pmizb(CollectionsKt__CollectionsJVMKt.listOf(new ReducedIntConsumer(i, removepauselistener, str, i2)))), CollectionsKt__CollectionsKt.emptyList()), new ulsya(CollectionsKt__CollectionsKt.listOf((Object[]) new setTextLocales[]{new ulzb("+"), new pmizb(CollectionsKt__CollectionsJVMKt.listOf(new ycxExternalSyntheticApiModelOutline0(null, null, removepauselistener, str, false)))}), CollectionsKt__CollectionsKt.emptyList()), new ulsya(CollectionsKt__CollectionsKt.listOf((Object[]) new setTextLocales[]{new ulzb("-"), new pmizb(CollectionsKt__CollectionsJVMKt.listOf(new ycxExternalSyntheticApiModelOutline0(null, null, removepauselistener, str, true)))}), CollectionsKt__CollectionsKt.emptyList())}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <Object, Type> Object onExtraCallback(final removePauseListener<? super Object, Type> removepauselistener, Object object, final Type type, int i, int i2) {
        final Type typeOnWarmupCompleted = removepauselistener.onWarmupCompleted(object, type);
        if (typeOnWarmupCompleted == null) {
            return fbyycx.Companion.onExtraCallbackWithResult(i2);
        }
        return fbyycx.Companion.IAuthTabCallback(i, new Function0() { // from class: kotlinx.datetime.internal.format.parser.ParserOperationKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return xkz1.IAuthTabCallback(typeOnWarmupCompleted, type, removepauselistener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String IAuthTabCallback(Object obj, Object obj2, removePauseListener removepauselistener) {
        return "Attempting to assign conflicting values '" + obj + "' and '" + obj2 + "' to field '" + removepauselistener.onWarmupCompleted() + '\'';
    }
}
