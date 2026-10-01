package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TTFullScreenVideoActivity1 extends AbstractList<TTBaseLandingPageActivity> implements RandomAccess {
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private final TTBaseLandingPageActivity[] onExtraCallback;
    private final int[] onWarmupCompleted;

    public /* synthetic */ TTFullScreenVideoActivity1(TTBaseLandingPageActivity[] tTBaseLandingPageActivityArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(tTBaseLandingPageActivityArr, iArr);
    }

    @JvmStatic
    public static final TTFullScreenVideoActivity1 onWarmupCompleted(@NotNull TTBaseLandingPageActivity... tTBaseLandingPageActivityArr) {
        return Companion.onWarmupCompleted(tTBaseLandingPageActivityArr);
    }

    private TTFullScreenVideoActivity1(TTBaseLandingPageActivity[] tTBaseLandingPageActivityArr, int[] iArr) {
        this.onExtraCallback = tTBaseLandingPageActivityArr;
        this.onWarmupCompleted = iArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof TTBaseLandingPageActivity) {
            return onExtraCallback((TTBaseLandingPageActivity) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof TTBaseLandingPageActivity) {
            return onNavigationEvent((TTBaseLandingPageActivity) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof TTBaseLandingPageActivity) {
            return onWarmupCompleted((TTBaseLandingPageActivity) obj);
        }
        return -1;
    }

    public boolean onExtraCallback(TTBaseLandingPageActivity tTBaseLandingPageActivity) {
        return super.contains(tTBaseLandingPageActivity);
    }

    public int onNavigationEvent(TTBaseLandingPageActivity tTBaseLandingPageActivity) {
        return super.indexOf(tTBaseLandingPageActivity);
    }

    public int onWarmupCompleted(TTBaseLandingPageActivity tTBaseLandingPageActivity) {
        return super.lastIndexOf(tTBaseLandingPageActivity);
    }

    public final TTBaseLandingPageActivity[] IAuthTabCallback() {
        return this.onExtraCallback;
    }

    public final int[] onExtraCallback() {
        return this.onWarmupCompleted;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.onExtraCallback.length;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public TTBaseLandingPageActivity get(int i) {
        return this.onExtraCallback[i];
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x00c8, code lost:
        
            continue;
         */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final TTFullScreenVideoActivity1 onWarmupCompleted(@NotNull TTBaseLandingPageActivity... tTBaseLandingPageActivityArr) throws IOException {
            Intrinsics.checkNotNullParameter(tTBaseLandingPageActivityArr, "");
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (tTBaseLandingPageActivityArr.length == 0) {
                return new TTFullScreenVideoActivity1(new TTBaseLandingPageActivity[0], new int[]{0, -1}, defaultConstructorMarker);
            }
            List mutableList = ArraysKt___ArraysKt.toMutableList(tTBaseLandingPageActivityArr);
            CollectionsKt__MutableCollectionsJVMKt.sort(mutableList);
            int size = mutableList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(-1);
            }
            int length = tTBaseLandingPageActivityArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                arrayList.set(CollectionsKt__CollectionsKt.binarySearch$default(mutableList, tTBaseLandingPageActivityArr[i2], 0, 0, 6, (Object) null), Integer.valueOf(i3));
                i2++;
                i3++;
            }
            if (((TTBaseLandingPageActivity) mutableList.get(0)).access100() <= 0) {
                throw new IllegalArgumentException("the empty byte string is not a supported option");
            }
            int i4 = 0;
            while (i4 < mutableList.size()) {
                TTBaseLandingPageActivity tTBaseLandingPageActivity = (TTBaseLandingPageActivity) mutableList.get(i4);
                int i5 = i4 + 1;
                int i6 = i5;
                while (i6 < mutableList.size()) {
                    TTBaseLandingPageActivity tTBaseLandingPageActivity2 = (TTBaseLandingPageActivity) mutableList.get(i6);
                    if (tTBaseLandingPageActivity2.onNavigationEvent(tTBaseLandingPageActivity)) {
                        if (tTBaseLandingPageActivity2.access100() == tTBaseLandingPageActivity.access100()) {
                            throw new IllegalArgumentException(("duplicate option: " + tTBaseLandingPageActivity2).toString());
                        }
                        if (((Number) arrayList.get(i6)).intValue() > ((Number) arrayList.get(i4)).intValue()) {
                            mutableList.remove(i6);
                        } else {
                            i6++;
                        }
                    }
                }
                i4 = i5;
            }
            TTBaseActivity tTBaseActivity = new TTBaseActivity();
            IAuthTabCallback(this, 0L, tTBaseActivity, 0, mutableList, 0, 0, arrayList, 53, null);
            int iIAuthTabCallback = (int) IAuthTabCallback(tTBaseActivity);
            int[] iArr = new int[iIAuthTabCallback];
            for (int i7 = 0; i7 < iIAuthTabCallback; i7++) {
                iArr[i7] = tTBaseActivity.onPostMessage();
            }
            Object[] objArrCopyOf = Arrays.copyOf(tTBaseLandingPageActivityArr, tTBaseLandingPageActivityArr.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
            return new TTFullScreenVideoActivity1((TTBaseLandingPageActivity[]) objArrCopyOf, iArr, defaultConstructorMarker);
        }

        static /* synthetic */ void IAuthTabCallback(onExtraCallback onextracallback, long j, TTBaseActivity tTBaseActivity, int i, List list, int i2, int i3, List list2, int i4, Object obj) throws IOException {
            onextracallback.onWarmupCompleted((i4 & 1) != 0 ? 0L : j, tTBaseActivity, (i4 & 4) != 0 ? 0 : i, list, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? list.size() : i3, list2);
        }

        private final void onWarmupCompleted(long j, TTBaseActivity tTBaseActivity, int i, List<? extends TTBaseLandingPageActivity> list, int i2, int i3, List<Integer> list2) throws IOException {
            int iIntValue;
            int i4;
            int i5;
            int i6;
            long j2;
            TTBaseActivity tTBaseActivity2;
            int i7 = i;
            if (i2 >= i3) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for (int i8 = i2; i8 < i3; i8++) {
                if (list.get(i8).access100() < i7) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            TTBaseLandingPageActivity tTBaseLandingPageActivity = list.get(i2);
            TTBaseLandingPageActivity tTBaseLandingPageActivity2 = list.get(i3 - 1);
            if (i7 == tTBaseLandingPageActivity.access100()) {
                int i9 = i2 + 1;
                i4 = i9;
                iIntValue = list2.get(i2).intValue();
                tTBaseLandingPageActivity = list.get(i9);
            } else {
                iIntValue = -1;
                i4 = i2;
            }
            if (tTBaseLandingPageActivity.onExtraCallbackWithResult(i7) != tTBaseLandingPageActivity2.onExtraCallbackWithResult(i7)) {
                int i10 = 1;
                for (int i11 = i4 + 1; i11 < i3; i11++) {
                    if (list.get(i11 - 1).onExtraCallbackWithResult(i7) != list.get(i11).onExtraCallbackWithResult(i7)) {
                        i10++;
                    }
                }
                long jIAuthTabCallback = j + IAuthTabCallback(tTBaseActivity) + 2 + (i10 << 1);
                tTBaseActivity.asBinder(i10);
                tTBaseActivity.asBinder(iIntValue);
                for (int i12 = i4; i12 < i3; i12++) {
                    byte bOnExtraCallbackWithResult = list.get(i12).onExtraCallbackWithResult(i7);
                    if (i12 == i4 || bOnExtraCallbackWithResult != list.get(i12 - 1).onExtraCallbackWithResult(i7)) {
                        tTBaseActivity.asBinder(bOnExtraCallbackWithResult & 255);
                    }
                }
                TTBaseActivity tTBaseActivity3 = new TTBaseActivity();
                while (i4 < i3) {
                    byte bOnExtraCallbackWithResult2 = list.get(i4).onExtraCallbackWithResult(i7);
                    int i13 = i4 + 1;
                    int i14 = i13;
                    while (true) {
                        if (i14 >= i3) {
                            i5 = i3;
                            break;
                        } else {
                            if (bOnExtraCallbackWithResult2 != list.get(i14).onExtraCallbackWithResult(i7)) {
                                i5 = i14;
                                break;
                            }
                            i14++;
                        }
                    }
                    if (i13 == i5 && i7 + 1 == list.get(i4).access100()) {
                        tTBaseActivity.asBinder(list2.get(i4).intValue());
                        i6 = i5;
                        j2 = jIAuthTabCallback;
                        tTBaseActivity2 = tTBaseActivity3;
                    } else {
                        tTBaseActivity.asBinder(-((int) (IAuthTabCallback(tTBaseActivity3) + jIAuthTabCallback)));
                        i6 = i5;
                        j2 = jIAuthTabCallback;
                        tTBaseActivity2 = tTBaseActivity3;
                        onWarmupCompleted(jIAuthTabCallback, tTBaseActivity3, i7 + 1, list, i4, i5, list2);
                    }
                    tTBaseActivity3 = tTBaseActivity2;
                    i4 = i6;
                    jIAuthTabCallback = j2;
                }
                tTBaseActivity.onExtraCallbackWithResult(tTBaseActivity3);
                return;
            }
            int iMin = Math.min(tTBaseLandingPageActivity.access100(), tTBaseLandingPageActivity2.access100());
            int i15 = 0;
            for (int i16 = i7; i16 < iMin && tTBaseLandingPageActivity.onExtraCallbackWithResult(i16) == tTBaseLandingPageActivity2.onExtraCallbackWithResult(i16); i16++) {
                i15++;
            }
            long jIAuthTabCallback2 = j + IAuthTabCallback(tTBaseActivity) + 2 + i15 + 1;
            tTBaseActivity.asBinder(-i15);
            tTBaseActivity.asBinder(iIntValue);
            int i17 = i15 + i7;
            while (i7 < i17) {
                tTBaseActivity.asBinder(tTBaseLandingPageActivity.onExtraCallbackWithResult(i7) & 255);
                i7++;
            }
            if (i4 + 1 == i3) {
                if (i17 != list.get(i4).access100()) {
                    throw new IllegalStateException("Check failed.");
                }
                tTBaseActivity.asBinder(list2.get(i4).intValue());
            } else {
                TTBaseActivity tTBaseActivity4 = new TTBaseActivity();
                tTBaseActivity.asBinder(-((int) (IAuthTabCallback(tTBaseActivity4) + jIAuthTabCallback2)));
                onWarmupCompleted(jIAuthTabCallback2, tTBaseActivity4, i17, list, i4, i3, list2);
                tTBaseActivity.onExtraCallbackWithResult(tTBaseActivity4);
            }
        }

        private final long IAuthTabCallback(TTBaseActivity tTBaseActivity) {
            return tTBaseActivity.ICustomTabsCallbackDefault() / 4;
        }
    }
}
