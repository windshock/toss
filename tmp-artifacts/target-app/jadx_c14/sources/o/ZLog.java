package o;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import o.toRealPath;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ZLog extends toRealPath {
    private final Context onExtraCallback;
    private final ResultUtil onExtraCallbackWithResult;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZLog)) {
            return false;
        }
        ZLog zLog = (ZLog) obj;
        return Intrinsics.areEqual(this.onExtraCallback, zLog.onExtraCallback) && this.onExtraCallbackWithResult == zLog.onExtraCallbackWithResult;
    }

    public int hashCode() {
        int iHashCode = this.onExtraCallback.hashCode();
        ResultUtil resultUtil = this.onExtraCallbackWithResult;
        return (iHashCode * 31) + (resultUtil == null ? 0 : resultUtil.hashCode());
    }

    public String toString() {
        return "EmptyMessageViewModel(context=" + this.onExtraCallback + ", filterType=" + this.onExtraCallbackWithResult + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZLog(@NotNull Context context, @Nullable ResultUtil resultUtil) {
        super(toRealPath.onNavigationEvent.EMPTY_MESSAGE);
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallback = context;
        this.onExtraCallbackWithResult = resultUtil;
    }

    public long onWarmupCompleted() {
        String str = this.onExtraCallbackWithResult;
        if (str == null) {
            str = "EMPTY";
        }
        return String.valueOf(str).hashCode();
    }

    public final String onNavigationEvent() {
        ResultUtil resultUtil = this.onExtraCallbackWithResult;
        if (resultUtil != null) {
            Context context = this.onExtraCallback;
            String string = context.getString(R.string.no_transfer_message_format, context.getString(resultUtil.getTypeTextResId()));
            Intrinsics.checkNotNull(string);
            return string;
        }
        String string2 = this.onExtraCallback.getString(R.string.app_account_detail_viewmodel___8758b7eaec);
        Intrinsics.checkNotNull(string2);
        return string2;
    }
}
