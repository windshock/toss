package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class DateRangePickerKtExternalSyntheticLambda4 {

    static final class onExtraCallback extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function1<T, Object> $key;
        final /* synthetic */ DateRangePickerKtExternalSyntheticLambda3<T> $this_itemKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(Function1<T, ? extends Object> function1, DateRangePickerKtExternalSyntheticLambda3<T> dateRangePickerKtExternalSyntheticLambda3) {
            super(1);
            this.$key = function1;
            this.$this_itemKey = dateRangePickerKtExternalSyntheticLambda3;
        }

        public /* synthetic */ Object invoke(Object obj) {
            return onNavigationEvent(((Number) obj).intValue());
        }

        public final Object onNavigationEvent(int i2) {
            if (this.$key == 0) {
                return new DateRangePickerKtDateRangePicker6ExternalSyntheticLambda0(i2);
            }
            Object objOnExtraCallback = this.$this_itemKey.onExtraCallback(i2);
            return objOnExtraCallback == null ? new DateRangePickerKtDateRangePicker6ExternalSyntheticLambda0(i2) : this.$key.invoke(objOnExtraCallback);
        }
    }

    public static final <T> Function1<Integer, Object> onExtraCallback(@NotNull DateRangePickerKtExternalSyntheticLambda3<T> dateRangePickerKtExternalSyntheticLambda3, @Nullable Function1<T, ? extends Object> function1) {
        Intrinsics.checkNotNullParameter(dateRangePickerKtExternalSyntheticLambda3, "");
        return new onExtraCallback(function1, dateRangePickerKtExternalSyntheticLambda3);
    }
}
