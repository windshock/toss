package com.swmansion.rnscreens.bottomsheet;

import com.facebook.react.views.view.ReactViewGroup;
import com.swmansion.rnscreens.Screen;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SheetDetents {
    public static final Companion Companion = new Companion(null);
    public static final double SHEET_FIT_TO_CONTENTS = -1.0d;
    private final List<Double> rawDetents;

    public SheetDetents(@NotNull List<Double> list) {
        Intrinsics.checkNotNullParameter(list, "");
        List<Double> list2 = list;
        this.rawDetents = CollectionsKt.toList(list2);
        if (list.isEmpty()) {
            throw new IllegalArgumentException("[RNScreens] At least one detent must be provided.");
        }
        if (list.size() > 3) {
            throw new IllegalArgumentException("[RNScreens] Maximum of 3 detents supported.");
        }
        if (list.size() == 1) {
            double dDoubleValue = list.get(0).doubleValue();
            if ((0.0d > dDoubleValue || dDoubleValue > 1.0d) && dDoubleValue != -1.0d) {
                throw new IllegalArgumentException(("[RNScreens] Detent value must be within 0.0 and 1.0, or SHEET_FIT_TO_CONTENTS should be defined, got " + dDoubleValue + ".").toString());
            }
            return;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            double dDoubleValue2 = ((Number) it.next()).doubleValue();
            if (0.0d > dDoubleValue2 || dDoubleValue2 > 1.0d) {
                throw new IllegalArgumentException(("[RNScreens] Detent values must be within 0.0 and 1.0, got " + dDoubleValue2 + ".").toString());
            }
        }
        if (!Intrinsics.areEqual(list, CollectionsKt.sorted(list2))) {
            throw new IllegalArgumentException("[RNScreens] Detents must be sorted in ascending order.");
        }
    }

    public final int getCount$react_native_screens_release() {
        return this.rawDetents.size();
    }

    public final double at$react_native_screens_release(int i) {
        return this.rawDetents.get(i).doubleValue();
    }

    public final double shortest$react_native_screens_release() {
        return ((Number) CollectionsKt.first(this.rawDetents)).doubleValue();
    }

    public final double highest$react_native_screens_release() {
        return ((Number) CollectionsKt.last(this.rawDetents)).doubleValue();
    }

    public final int heightAt$react_native_screens_release(int i, int i2) {
        double dAt$react_native_screens_release = at$react_native_screens_release(i);
        if (dAt$react_native_screens_release != -1.0d) {
            return (int) (dAt$react_native_screens_release * i2);
        }
        throw new IllegalArgumentException("[RNScreens] FIT_TO_CONTENTS is not supported by heightAt.");
    }

    public final int firstHeight$react_native_screens_release(int i) {
        return heightAt$react_native_screens_release(0, i);
    }

    public final int maxAllowedHeight$react_native_screens_release(int i) {
        return heightAt$react_native_screens_release(getCount$react_native_screens_release() - 1, i);
    }

    public final int maxAllowedHeightForFitToContents$react_native_screens_release(@NotNull Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "");
        ReactViewGroup contentWrapper = screen.getContentWrapper();
        if (contentWrapper == null) {
            return 0;
        }
        Integer numValueOf = Integer.valueOf(contentWrapper.getHeight());
        if (!SheetUtilsKt.isLaidOutOrHasCachedLayout(contentWrapper)) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    public final float halfExpandedRatio$react_native_screens_release() {
        if (getCount$react_native_screens_release() < 3) {
            throw new IllegalStateException("[RNScreens] At least 3 detents required for halfExpandedRatio.");
        }
        return (float) (at$react_native_screens_release(1) / at$react_native_screens_release(2));
    }

    public static /* synthetic */ int expandedOffsetFromTop$react_native_screens_release$default(SheetDetents sheetDetents, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return sheetDetents.expandedOffsetFromTop$react_native_screens_release(i, i2);
    }

    public final int expandedOffsetFromTop$react_native_screens_release(int i, int i2) {
        if (getCount$react_native_screens_release() < 3) {
            throw new IllegalStateException("[RNScreens] At least 3 detents required for expandedOffsetFromTop.");
        }
        return ((int) ((1.0d - at$react_native_screens_release(2)) * i)) + i2;
    }

    public final int peekHeight$react_native_screens_release(int i) {
        return heightAt$react_native_screens_release(0, i);
    }

    public final int sheetStateFromIndex$react_native_screens_release(int i) {
        return SheetUtils.INSTANCE.sheetStateFromDetentIndex(i, getCount$react_native_screens_release());
    }

    public final int indexFromSheetState$react_native_screens_release(int i) {
        return SheetUtils.INSTANCE.detentIndexFromSheetState(i, getCount$react_native_screens_release());
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
