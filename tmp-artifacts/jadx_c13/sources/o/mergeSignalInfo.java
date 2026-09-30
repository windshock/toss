package o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class mergeSignalInfo implements Sequence<IntRange> {
    private final int onExtraCallback;
    private final CharSequence onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private final Function2<CharSequence, Integer, Pair<Integer, Integer>> onWarmupCompleted;

    /* JADX WARN: Multi-variable type inference failed */
    public mergeSignalInfo(@NotNull CharSequence charSequence, int i, int i2, @NotNull Function2<? super CharSequence, ? super Integer, Pair<Integer, Integer>> function2) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.onExtraCallbackWithResult = charSequence;
        this.onNavigationEvent = i;
        this.onExtraCallback = i2;
        this.onWarmupCompleted = function2;
    }

    public static final class onWarmupCompleted implements Iterator<IntRange>, KMappedMarker {
        private int IAuthTabCallback;
        private int IAuthTabCallbackDefault = -1;
        private IntRange onExtraCallbackWithResult;
        private int onNavigationEvent;
        private int onWarmupCompleted;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        onWarmupCompleted() {
            int iCoerceIn = RangesKt___RangesKt.coerceIn(mergeSignalInfo.this.onNavigationEvent, 0, mergeSignalInfo.this.onExtraCallbackWithResult.length());
            this.IAuthTabCallback = iCoerceIn;
            this.onWarmupCompleted = iCoerceIn;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final void IAuthTabCallback() {
            Pair pair;
            if (this.onWarmupCompleted >= 0) {
                if (mergeSignalInfo.this.onExtraCallback > 0) {
                    int i = this.onNavigationEvent + 1;
                    this.onNavigationEvent = i;
                    if (i < mergeSignalInfo.this.onExtraCallback) {
                        if (this.onWarmupCompleted > mergeSignalInfo.this.onExtraCallbackWithResult.length() || (pair = (Pair) mergeSignalInfo.this.onWarmupCompleted.invoke(mergeSignalInfo.this.onExtraCallbackWithResult, Integer.valueOf(this.onWarmupCompleted))) == null) {
                            this.onExtraCallbackWithResult = new IntRange(this.IAuthTabCallback, StringsKt__StringsKt.getLastIndex(mergeSignalInfo.this.onExtraCallbackWithResult));
                            this.onWarmupCompleted = -1;
                        } else {
                            int iIntValue = ((Number) pair.onExtraCallbackWithResult()).intValue();
                            int iIntValue2 = ((Number) pair.IAuthTabCallback()).intValue();
                            this.onExtraCallbackWithResult = RangesKt___RangesKt.until(this.IAuthTabCallback, iIntValue);
                            int i2 = iIntValue + iIntValue2;
                            this.IAuthTabCallback = i2;
                            this.onWarmupCompleted = i2 + (iIntValue2 == 0 ? 1 : 0);
                        }
                    } else {
                        this.onExtraCallbackWithResult = new IntRange(this.IAuthTabCallback, StringsKt__StringsKt.getLastIndex(mergeSignalInfo.this.onExtraCallbackWithResult));
                        this.onWarmupCompleted = -1;
                    }
                }
                this.IAuthTabCallbackDefault = 1;
                return;
            }
            this.IAuthTabCallbackDefault = 0;
            this.onExtraCallbackWithResult = null;
        }

        @Override // java.util.Iterator
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public IntRange next() {
            if (this.IAuthTabCallbackDefault == -1) {
                IAuthTabCallback();
            }
            if (this.IAuthTabCallbackDefault == 0) {
                throw new NoSuchElementException();
            }
            IntRange intRange = this.onExtraCallbackWithResult;
            Intrinsics.checkNotNull(intRange, "");
            this.onExtraCallbackWithResult = null;
            this.IAuthTabCallbackDefault = -1;
            return intRange;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.IAuthTabCallbackDefault == -1) {
                IAuthTabCallback();
            }
            return this.IAuthTabCallbackDefault == 1;
        }
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<IntRange> IAuthTabCallback() {
        return new onWarmupCompleted();
    }
}
