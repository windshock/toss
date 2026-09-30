package o;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class MemoryCacheBuilderExternalSyntheticLambda0 {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    private static final Map<TextRoundCornerProgressBarSavedState1, MemoryCacheBuilderExternalSyntheticLambda1> onExtraCallback;
    private static final Set<String> onExtraCallbackWithResult;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public static final /* synthetic */ Set onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 19;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        Set<String> set = onExtraCallbackWithResult;
        int i5 = i3 + 63;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return set;
    }

    public static final /* synthetic */ Map onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 13;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        Map<TextRoundCornerProgressBarSavedState1, MemoryCacheBuilderExternalSyntheticLambda1> map = onExtraCallback;
        int i5 = i3 + 27;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 58 / 0;
        }
        return map;
    }

    static {
        Map<TextRoundCornerProgressBarSavedState1, MemoryCacheBuilderExternalSyntheticLambda1> mapSynchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        Intrinsics.checkNotNullExpressionValue(mapSynchronizedMap, "");
        onExtraCallback = mapSynchronizedMap;
        ConcurrentHashMap.KeySetView keySetViewNewKeySet = ConcurrentHashMap.newKeySet();
        Intrinsics.checkNotNullExpressionValue(keySetViewNewKeySet, "");
        onExtraCallbackWithResult = keySetViewNewKeySet;
        int i = onNavigationEvent + 17;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static final Set<String> onNavigationEvent() {
        int i = 2 % 2;
        Set<String> set = onExtraCallbackWithResult;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add("shared_prefs/" + ((String) it.next()) + ".xml");
            int i2 = IAuthTabCallback + 117;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
        }
        Set<String> set2 = CollectionsKt.toSet(arrayList);
        int i4 = IAuthTabCallbackStub + 105;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return set2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 onExtraCallback(Context context, String str, getProgressColor getprogresscolor, getMax getmax, TextRoundCornerProgressBarSavedState textRoundCornerProgressBarSavedState, MemoryCacheBuilderExternalSyntheticLambda1 memoryCacheBuilderExternalSyntheticLambda1, Function1 function1, int i, Object obj) {
        TextRoundCornerProgressBarSavedState textRoundCornerProgressBarSavedState2;
        MemoryCacheBuilderExternalSyntheticLambda1 memoryCacheBuilderExternalSyntheticLambda12;
        Function1 function12;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 107;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0 ? (i & 16) == 0 : (i & 111) == 0) {
            textRoundCornerProgressBarSavedState2 = textRoundCornerProgressBarSavedState;
        } else {
            int i5 = i3 + 79;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            textRoundCornerProgressBarSavedState2 = null;
        }
        if ((i & 32) != 0) {
            int i7 = i3 + 73;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            memoryCacheBuilderExternalSyntheticLambda12 = MemoryCacheBuilderExternalSyntheticLambda1.DEFAULT;
        } else {
            memoryCacheBuilderExternalSyntheticLambda12 = memoryCacheBuilderExternalSyntheticLambda1;
        }
        if ((i & 64) != 0) {
            int i9 = IAuthTabCallbackStub;
            int i10 = i9 + 115;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            int i12 = i9 + 5;
            IAuthTabCallback = i12 % 128;
            int i13 = i12 % 2;
            function12 = null;
        } else {
            function12 = function1;
        }
        return onExtraCallbackWithResult(context, str, getprogresscolor, getmax, textRoundCornerProgressBarSavedState2, memoryCacheBuilderExternalSyntheticLambda12, function12);
    }

    @Deprecated
    public static final TextRoundCornerProgressBarSavedState1 onExtraCallbackWithResult(@NotNull Context context, @NotNull String str, @Nullable getProgressColor getprogresscolor, @Nullable getMax getmax, @Nullable TextRoundCornerProgressBarSavedState textRoundCornerProgressBarSavedState, @NotNull MemoryCacheBuilderExternalSyntheticLambda1 memoryCacheBuilderExternalSyntheticLambda1, @Nullable Function1<? super BaseRoundCornerProgressBar, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(memoryCacheBuilderExternalSyntheticLambda1, "");
        BaseRoundCornerProgressBar baseRoundCornerProgressBar = new BaseRoundCornerProgressBar(context, str, 0);
        if (getprogresscolor != null) {
            int i2 = IAuthTabCallbackStub + 27;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                baseRoundCornerProgressBar.onWarmupCompleted(getprogresscolor, textRoundCornerProgressBarSavedState);
                int i3 = 82 / 0;
            } else {
                baseRoundCornerProgressBar.onWarmupCompleted(getprogresscolor, textRoundCornerProgressBarSavedState);
            }
        }
        if (getmax != null) {
            baseRoundCornerProgressBar.onExtraCallback(getmax, textRoundCornerProgressBarSavedState);
            int i4 = IAuthTabCallbackStub + 5;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        if (function1 != null) {
            int i6 = IAuthTabCallbackStub + 7;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                function1.invoke(baseRoundCornerProgressBar);
                int i7 = 82 / 0;
            } else {
                function1.invoke(baseRoundCornerProgressBar);
            }
        }
        drawSecondaryProgress drawsecondaryprogress = new drawSecondaryProgress(baseRoundCornerProgressBar, new getProgressBackgroundColor(ALCEyeBlink.onExtraCallback()));
        Object obj = null;
        if (memoryCacheBuilderExternalSyntheticLambda1 != MemoryCacheBuilderExternalSyntheticLambda1.NONE) {
            int i8 = IAuthTabCallbackStub + 3;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 != 0) {
                onExtraCallback.put(drawsecondaryprogress, memoryCacheBuilderExternalSyntheticLambda1);
                throw null;
            }
            onExtraCallback.put(drawsecondaryprogress, memoryCacheBuilderExternalSyntheticLambda1);
        }
        if (memoryCacheBuilderExternalSyntheticLambda1 == MemoryCacheBuilderExternalSyntheticLambda1.PERSISTENT) {
            int i9 = IAuthTabCallback + 99;
            IAuthTabCallbackStub = i9 % 128;
            if (i9 % 2 == 0) {
                onExtraCallbackWithResult.add(str);
                obj.hashCode();
                throw null;
            }
            onExtraCallbackWithResult.add(str);
        }
        return drawsecondaryprogress;
    }

    public static final void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 75;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            MemoryCacheBuilderExternalSyntheticLambda1[] memoryCacheBuilderExternalSyntheticLambda1Arr = (MemoryCacheBuilderExternalSyntheticLambda1[]) CollectionsKt.minus(MemoryCacheBuilderExternalSyntheticLambda1.getEntries(), MemoryCacheBuilderExternalSyntheticLambda1.PERSISTENT).toArray(new MemoryCacheBuilderExternalSyntheticLambda1[0]);
            onNavigationEvent((MemoryCacheBuilderExternalSyntheticLambda1[]) Arrays.copyOf(memoryCacheBuilderExternalSyntheticLambda1Arr, memoryCacheBuilderExternalSyntheticLambda1Arr.length));
        } else {
            MemoryCacheBuilderExternalSyntheticLambda1[] memoryCacheBuilderExternalSyntheticLambda1Arr2 = (MemoryCacheBuilderExternalSyntheticLambda1[]) CollectionsKt.minus(MemoryCacheBuilderExternalSyntheticLambda1.getEntries(), MemoryCacheBuilderExternalSyntheticLambda1.PERSISTENT).toArray(new MemoryCacheBuilderExternalSyntheticLambda1[0]);
            onNavigationEvent((MemoryCacheBuilderExternalSyntheticLambda1[]) Arrays.copyOf(memoryCacheBuilderExternalSyntheticLambda1Arr2, memoryCacheBuilderExternalSyntheticLambda1Arr2.length));
        }
        int i3 = IAuthTabCallback + 89;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public static final void onNavigationEvent(@NotNull MemoryCacheBuilderExternalSyntheticLambda1... memoryCacheBuilderExternalSyntheticLambda1Arr) {
        Intrinsics.checkNotNullParameter(memoryCacheBuilderExternalSyntheticLambda1Arr, "");
        Map<TextRoundCornerProgressBarSavedState1, MemoryCacheBuilderExternalSyntheticLambda1> map = onExtraCallback;
        synchronized (map) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<TextRoundCornerProgressBarSavedState1, MemoryCacheBuilderExternalSyntheticLambda1> entry : map.entrySet()) {
                if (ArraysKt.contains(memoryCacheBuilderExternalSyntheticLambda1Arr, entry.getValue())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                drawBackgroundProgress.IAuthTabCallback((TextRoundCornerProgressBarSavedState1) it.next(), true);
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
