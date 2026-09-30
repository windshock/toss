package o;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ResultUtil {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ResultUtil[] $VALUES;
    public static final IAuthTabCallback Companion;
    private final int index;
    private final int typeTextResId;
    public static final ResultUtil ALL = new ResultUtil("ALL", 0, 0, R.string.transfer_history);
    public static final ResultUtil DEPOSIT = new ResultUtil("DEPOSIT", 1, 1, R.string.deposit_transfer);
    public static final ResultUtil WITHDRAWAL = new ResultUtil("WITHDRAWAL", 2, 2, R.string.withdrawal_transfer);

    private static final /* synthetic */ ResultUtil[] $values() {
        return new ResultUtil[]{ALL, DEPOSIT, WITHDRAWAL};
    }

    public static EnumEntries<ResultUtil> getEntries() {
        return $ENTRIES;
    }

    public static ResultUtil valueOf(String str) {
        return (ResultUtil) Enum.valueOf(ResultUtil.class, str);
    }

    public static ResultUtil[] values() {
        return (ResultUtil[]) $VALUES.clone();
    }

    private ResultUtil(String str, int i, int i2, int i3) {
        this.index = i2;
        this.typeTextResId = i3;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getTypeTextResId() {
        return this.typeTextResId;
    }

    static {
        ResultUtil[] resultUtilArr$values = $values();
        $VALUES = resultUtilArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(resultUtilArr$values);
        Companion = new IAuthTabCallback(null);
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public final ResultUtil[] onNavigationEvent() {
            return new ResultUtil[]{ResultUtil.ALL, ResultUtil.DEPOSIT, ResultUtil.WITHDRAWAL};
        }

        public final ResultUtil onNavigationEvent(@NotNull ResultUtil[] resultUtilArr, int i) {
            ResultUtil resultUtil;
            Intrinsics.checkNotNullParameter(resultUtilArr, "");
            int length = resultUtilArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    resultUtil = null;
                    break;
                }
                resultUtil = resultUtilArr[i2];
                if (resultUtil.getIndex() == i) {
                    break;
                }
                i2++;
            }
            return resultUtil == null ? ResultUtil.ALL : resultUtil;
        }
    }
}
