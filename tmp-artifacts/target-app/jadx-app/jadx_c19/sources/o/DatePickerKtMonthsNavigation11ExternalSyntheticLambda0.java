package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import o.DatePickerKtExternalSyntheticLambda31;
import o.DatePickerKtHorizontalMonthsList1ExternalSyntheticLambda1;
import o.DateRangePickerKtExternalSyntheticLambda5;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class DatePickerKtMonthsNavigation11ExternalSyntheticLambda0<T> implements DatePickerKtDatePickerContent242ExternalSyntheticLambda0<T> {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    private static final DatePickerKtMonthsNavigation11ExternalSyntheticLambda0<Object> onNavigationEvent = new DatePickerKtMonthsNavigation11ExternalSyntheticLambda0<>(DatePickerKtHorizontalMonthsList1ExternalSyntheticLambda1.onWarmupCompleted.Companion.onWarmupCompleted());
    private int IAuthTabCallback;
    private final List<DateRangePickerDefaultsExternalSyntheticLambda1<T>> onExtraCallback;
    private int onExtraCallbackWithResult;
    private int onWarmupCompleted;

    public interface onExtraCallback {
        void IAuthTabCallback(int i2, int i3);

        void onExtraCallback(int i2, int i3);

        void onNavigationEvent(int i2, int i3);

        void onNavigationEvent(@NotNull DatePickerKtExternalSyntheticLambda8 datePickerKtExternalSyntheticLambda8, boolean z, @NotNull DatePickerKtExternalSyntheticLambda31 datePickerKtExternalSyntheticLambda31);

        void onWarmupCompleted(@NotNull DatePickerKtExternalSyntheticLambda32 datePickerKtExternalSyntheticLambda32, @Nullable DatePickerKtExternalSyntheticLambda32 datePickerKtExternalSyntheticLambda322);
    }

    public final /* synthetic */ class onWarmupCompleted {
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[DatePickerKtExternalSyntheticLambda8.values().length];
            try {
                iArr[DatePickerKtExternalSyntheticLambda8.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DatePickerKtExternalSyntheticLambda8.PREPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DatePickerKtExternalSyntheticLambda8.APPEND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            onWarmupCompleted = iArr;
        }
    }

    public DatePickerKtMonthsNavigation11ExternalSyntheticLambda0(@NotNull List<DateRangePickerDefaultsExternalSyntheticLambda1<T>> list, int i2, int i3) {
        Intrinsics.checkNotNullParameter(list, "");
        this.onExtraCallback = CollectionsKt.toMutableList(list);
        this.IAuthTabCallback = onExtraCallback(list);
        this.onWarmupCompleted = i2;
        this.onExtraCallbackWithResult = i3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DatePickerKtMonthsNavigation11ExternalSyntheticLambda0(@NotNull DatePickerKtHorizontalMonthsList1ExternalSyntheticLambda1.onWarmupCompleted<T> onwarmupcompleted) {
        this(onwarmupcompleted.IAuthTabCallback(), onwarmupcompleted.asBinder(), onwarmupcompleted.onWarmupCompleted());
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
    }

    @Override // o.DatePickerKtDatePickerContent242ExternalSyntheticLambda0
    public int IAuthTabCallbackDefault() {
        return this.IAuthTabCallback;
    }

    private final int asInterface() {
        Integer numMinOrNull = ArraysKt.minOrNull(((DateRangePickerDefaultsExternalSyntheticLambda1) CollectionsKt.first(this.onExtraCallback)).IAuthTabCallback());
        Intrinsics.checkNotNull(numMinOrNull);
        return numMinOrNull.intValue();
    }

    private final int onTransact() {
        Integer numMaxOrNull = ArraysKt.maxOrNull(((DateRangePickerDefaultsExternalSyntheticLambda1) CollectionsKt.last(this.onExtraCallback)).IAuthTabCallback());
        Intrinsics.checkNotNull(numMaxOrNull);
        return numMaxOrNull.intValue();
    }

    @Override // o.DatePickerKtDatePickerContent242ExternalSyntheticLambda0
    public int onNavigationEvent() {
        return this.onWarmupCompleted;
    }

    @Override // o.DatePickerKtDatePickerContent242ExternalSyntheticLambda0
    public int onWarmupCompleted() {
        return this.onExtraCallbackWithResult;
    }

    private final void IAuthTabCallback(int i2) {
        if (i2 < 0 || i2 >= onExtraCallback()) {
            throw new IndexOutOfBoundsException("Index: " + i2 + ", Size: " + onExtraCallback());
        }
    }

    public String toString() {
        int iIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        ArrayList arrayList = new ArrayList(iIAuthTabCallbackDefault);
        for (int i2 = 0; i2 < iIAuthTabCallbackDefault; i2++) {
            arrayList.add(onNavigationEvent(i2));
        }
        return "[(" + onNavigationEvent() + " placeholders), " + CollectionsKt.joinToString$default(arrayList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null) + ", (" + onWarmupCompleted() + " placeholders)]";
    }

    public final T onExtraCallback(int i2) {
        IAuthTabCallback(i2);
        int iOnNavigationEvent = i2 - onNavigationEvent();
        if (iOnNavigationEvent < 0 || iOnNavigationEvent >= IAuthTabCallbackDefault()) {
            return null;
        }
        return onNavigationEvent(iOnNavigationEvent);
    }

    public final DatePickerKtExternalSyntheticLambda3<T> IAuthTabCallbackStub() {
        int iOnNavigationEvent = onNavigationEvent();
        int iOnWarmupCompleted = onWarmupCompleted();
        List<DateRangePickerDefaultsExternalSyntheticLambda1<T>> list = this.onExtraCallback;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((DateRangePickerDefaultsExternalSyntheticLambda1) it.next()).onExtraCallbackWithResult());
        }
        return new DatePickerKtExternalSyntheticLambda3<>(iOnNavigationEvent, iOnWarmupCompleted, arrayList);
    }

    @Override // o.DatePickerKtDatePickerContent242ExternalSyntheticLambda0
    public T onNavigationEvent(int i2) {
        int size = this.onExtraCallback.size();
        int i3 = 0;
        while (i3 < size) {
            int size2 = this.onExtraCallback.get(i3).onExtraCallbackWithResult().size();
            if (size2 > i2) {
                break;
            }
            i2 -= size2;
            i3++;
        }
        return (T) this.onExtraCallback.get(i3).onExtraCallbackWithResult().get(i2);
    }

    @Override // o.DatePickerKtDatePickerContent242ExternalSyntheticLambda0
    public int onExtraCallback() {
        return onNavigationEvent() + IAuthTabCallbackDefault() + onWarmupCompleted();
    }

    private final int onExtraCallback(List<DateRangePickerDefaultsExternalSyntheticLambda1<T>> list) {
        Iterator<T> it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((DateRangePickerDefaultsExternalSyntheticLambda1) it.next()).onExtraCallbackWithResult().size();
        }
        return size;
    }

    public final void onWarmupCompleted(@NotNull DatePickerKtHorizontalMonthsList1ExternalSyntheticLambda1<T> datePickerKtHorizontalMonthsList1ExternalSyntheticLambda1, @NotNull onExtraCallback onextracallback) {
        Intrinsics.checkNotNullParameter(datePickerKtHorizontalMonthsList1ExternalSyntheticLambda1, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        if (datePickerKtHorizontalMonthsList1ExternalSyntheticLambda1 instanceof DatePickerKtHorizontalMonthsList1ExternalSyntheticLambda1.onWarmupCompleted) {
            onWarmupCompleted((DatePickerKtHorizontalMonthsList1ExternalSyntheticLambda1.onWarmupCompleted) datePickerKtHorizontalMonthsList1ExternalSyntheticLambda1, onextracallback);
            return;
        }
        if (datePickerKtHorizontalMonthsList1ExternalSyntheticLambda1 instanceof DatePickerKtHorizontalMonthsList1ExternalSyntheticLambda1.onExtraCallbackWithResult) {
            onWarmupCompleted((DatePickerKtHorizontalMonthsList1ExternalSyntheticLambda1.onExtraCallbackWithResult) datePickerKtHorizontalMonthsList1ExternalSyntheticLambda1, onextracallback);
        } else if (datePickerKtHorizontalMonthsList1ExternalSyntheticLambda1 instanceof DatePickerKtHorizontalMonthsList1ExternalSyntheticLambda1.onExtraCallback) {
            DatePickerKtHorizontalMonthsList1ExternalSyntheticLambda1.onExtraCallback onextracallback2 = (DatePickerKtHorizontalMonthsList1ExternalSyntheticLambda1.onExtraCallback) datePickerKtHorizontalMonthsList1ExternalSyntheticLambda1;
            onextracallback.onWarmupCompleted(onextracallback2.IAuthTabCallback(), onextracallback2.onExtraCallback());
        } else if (datePickerKtHorizontalMonthsList1ExternalSyntheticLambda1 instanceof DatePickerKtHorizontalMonthsList1ExternalSyntheticLambda1.onNavigationEvent) {
            throw new IllegalStateException("Paging received an event to display a static list, while still actively loading\nfrom an existing generation of PagingData. If you see this exception, it is most\nlikely a bug in the library. Please file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
        }
    }

    public final DateRangePickerKtExternalSyntheticLambda5.onNavigationEvent IAuthTabCallback() {
        int iIAuthTabCallbackDefault = IAuthTabCallbackDefault() / 2;
        return new DateRangePickerKtExternalSyntheticLambda5.onNavigationEvent(iIAuthTabCallbackDefault, iIAuthTabCallbackDefault, asInterface(), onTransact());
    }

    public final DateRangePickerKtExternalSyntheticLambda5.onWarmupCompleted onExtraCallbackWithResult(int i2) {
        int i3 = 0;
        int iOnNavigationEvent = i2 - onNavigationEvent();
        while (iOnNavigationEvent >= this.onExtraCallback.get(i3).onExtraCallbackWithResult().size() && i3 < CollectionsKt.getLastIndex(this.onExtraCallback)) {
            iOnNavigationEvent -= this.onExtraCallback.get(i3).onExtraCallbackWithResult().size();
            i3++;
        }
        DateRangePickerDefaultsExternalSyntheticLambda1<T> dateRangePickerDefaultsExternalSyntheticLambda1 = this.onExtraCallback.get(i3);
        int iOnNavigationEvent2 = onNavigationEvent();
        int iOnExtraCallback = onExtraCallback();
        return dateRangePickerDefaultsExternalSyntheticLambda1.onExtraCallback(iOnNavigationEvent, i2 - iOnNavigationEvent2, ((iOnExtraCallback - i2) - onWarmupCompleted()) - 1, asInterface(), onTransact());
    }

    private final void onWarmupCompleted(DatePickerKtHorizontalMonthsList1ExternalSyntheticLambda1.onWarmupCompleted<T> onwarmupcompleted, onExtraCallback onextracallback) {
        int iOnExtraCallback = onExtraCallback(onwarmupcompleted.IAuthTabCallback());
        int iOnExtraCallback2 = onExtraCallback();
        int i2 = onWarmupCompleted.onWarmupCompleted[onwarmupcompleted.onExtraCallback().ordinal()];
        if (i2 == 1) {
            throw new IllegalStateException("Paging received a refresh event in the middle of an actively loading generation\nof PagingData. If you see this exception, it is most likely a bug in the library.\nPlease file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
        }
        if (i2 == 2) {
            int iMin = Math.min(onNavigationEvent(), iOnExtraCallback);
            int iOnNavigationEvent = onNavigationEvent();
            int i3 = iOnExtraCallback - iMin;
            this.onExtraCallback.addAll(0, onwarmupcompleted.IAuthTabCallback());
            this.IAuthTabCallback = IAuthTabCallbackDefault() + iOnExtraCallback;
            this.onWarmupCompleted = onwarmupcompleted.asBinder();
            onextracallback.IAuthTabCallback(iOnNavigationEvent - iMin, iMin);
            onextracallback.onNavigationEvent(0, i3);
            int iOnExtraCallback3 = (onExtraCallback() - iOnExtraCallback2) - i3;
            if (iOnExtraCallback3 > 0) {
                onextracallback.onNavigationEvent(0, iOnExtraCallback3);
            } else if (iOnExtraCallback3 < 0) {
                onextracallback.onExtraCallback(0, -iOnExtraCallback3);
            }
        } else if (i2 == 3) {
            int iMin2 = Math.min(onWarmupCompleted(), iOnExtraCallback);
            int iOnNavigationEvent2 = onNavigationEvent() + IAuthTabCallbackDefault();
            int i4 = iOnExtraCallback - iMin2;
            List<DateRangePickerDefaultsExternalSyntheticLambda1<T>> list = this.onExtraCallback;
            list.addAll(list.size(), onwarmupcompleted.IAuthTabCallback());
            this.IAuthTabCallback = IAuthTabCallbackDefault() + iOnExtraCallback;
            this.onExtraCallbackWithResult = onwarmupcompleted.onWarmupCompleted();
            onextracallback.IAuthTabCallback(iOnNavigationEvent2, iMin2);
            onextracallback.onNavigationEvent(iOnNavigationEvent2 + iMin2, i4);
            int iOnExtraCallback4 = (onExtraCallback() - iOnExtraCallback2) - i4;
            if (iOnExtraCallback4 > 0) {
                onextracallback.onNavigationEvent(onExtraCallback() - iOnExtraCallback4, iOnExtraCallback4);
            } else if (iOnExtraCallback4 < 0) {
                onextracallback.onExtraCallback(onExtraCallback(), -iOnExtraCallback4);
            }
        }
        onextracallback.onWarmupCompleted(onwarmupcompleted.IAuthTabCallbackStub(), onwarmupcompleted.onNavigationEvent());
    }

    private final int onExtraCallback(IntRange intRange) {
        Iterator<DateRangePickerDefaultsExternalSyntheticLambda1<T>> it = this.onExtraCallback.iterator();
        int size = 0;
        while (it.hasNext()) {
            DateRangePickerDefaultsExternalSyntheticLambda1<T> next = it.next();
            int[] iArrIAuthTabCallback = next.IAuthTabCallback();
            int length = iArrIAuthTabCallback.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (intRange.contains(iArrIAuthTabCallback[i2])) {
                    size += next.onExtraCallbackWithResult().size();
                    it.remove();
                    break;
                }
                i2++;
            }
        }
        return size;
    }

    private final void onWarmupCompleted(DatePickerKtHorizontalMonthsList1ExternalSyntheticLambda1.onExtraCallbackWithResult<T> onextracallbackwithresult, onExtraCallback onextracallback) {
        int iOnExtraCallback = onExtraCallback();
        DatePickerKtExternalSyntheticLambda8 datePickerKtExternalSyntheticLambda8OnWarmupCompleted = onextracallbackwithresult.onWarmupCompleted();
        DatePickerKtExternalSyntheticLambda8 datePickerKtExternalSyntheticLambda8 = DatePickerKtExternalSyntheticLambda8.PREPEND;
        if (datePickerKtExternalSyntheticLambda8OnWarmupCompleted == datePickerKtExternalSyntheticLambda8) {
            int iOnNavigationEvent = onNavigationEvent();
            this.IAuthTabCallback = IAuthTabCallbackDefault() - onExtraCallback(new IntRange(onextracallbackwithresult.onExtraCallback(), onextracallbackwithresult.IAuthTabCallback()));
            this.onWarmupCompleted = onextracallbackwithresult.onNavigationEvent();
            int iOnExtraCallback2 = onExtraCallback() - iOnExtraCallback;
            if (iOnExtraCallback2 > 0) {
                onextracallback.onNavigationEvent(0, iOnExtraCallback2);
            } else if (iOnExtraCallback2 < 0) {
                onextracallback.onExtraCallback(0, -iOnExtraCallback2);
            }
            int iMax = Math.max(0, iOnNavigationEvent + iOnExtraCallback2);
            int iOnNavigationEvent2 = onextracallbackwithresult.onNavigationEvent() - iMax;
            if (iOnNavigationEvent2 > 0) {
                onextracallback.IAuthTabCallback(iMax, iOnNavigationEvent2);
            }
            onextracallback.onNavigationEvent(datePickerKtExternalSyntheticLambda8, false, DatePickerKtExternalSyntheticLambda31.onExtraCallbackWithResult.Companion.onWarmupCompleted());
            return;
        }
        int iOnWarmupCompleted = onWarmupCompleted();
        this.IAuthTabCallback = IAuthTabCallbackDefault() - onExtraCallback(new IntRange(onextracallbackwithresult.onExtraCallback(), onextracallbackwithresult.IAuthTabCallback()));
        this.onExtraCallbackWithResult = onextracallbackwithresult.onNavigationEvent();
        int iOnExtraCallback3 = onExtraCallback() - iOnExtraCallback;
        if (iOnExtraCallback3 > 0) {
            onextracallback.onNavigationEvent(iOnExtraCallback, iOnExtraCallback3);
        } else if (iOnExtraCallback3 < 0) {
            onextracallback.onExtraCallback(iOnExtraCallback + iOnExtraCallback3, -iOnExtraCallback3);
        }
        int iOnNavigationEvent3 = onextracallbackwithresult.onNavigationEvent() - (iOnWarmupCompleted - (iOnExtraCallback3 < 0 ? Math.min(iOnWarmupCompleted, -iOnExtraCallback3) : 0));
        if (iOnNavigationEvent3 > 0) {
            onextracallback.IAuthTabCallback(onExtraCallback() - onextracallbackwithresult.onNavigationEvent(), iOnNavigationEvent3);
        }
        onextracallback.onNavigationEvent(DatePickerKtExternalSyntheticLambda8.APPEND, false, DatePickerKtExternalSyntheticLambda31.onExtraCallbackWithResult.Companion.onWarmupCompleted());
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public final <T> DatePickerKtMonthsNavigation11ExternalSyntheticLambda0<T> onExtraCallbackWithResult(@Nullable DatePickerKtHorizontalMonthsList1ExternalSyntheticLambda1.onWarmupCompleted<T> onwarmupcompleted) {
            if (onwarmupcompleted == null) {
                DatePickerKtMonthsNavigation11ExternalSyntheticLambda0<T> datePickerKtMonthsNavigation11ExternalSyntheticLambda0 = DatePickerKtMonthsNavigation11ExternalSyntheticLambda0.onNavigationEvent;
                Intrinsics.checkNotNull(datePickerKtMonthsNavigation11ExternalSyntheticLambda0, "");
                return datePickerKtMonthsNavigation11ExternalSyntheticLambda0;
            }
            return new DatePickerKtMonthsNavigation11ExternalSyntheticLambda0<>(onwarmupcompleted);
        }
    }
}
