package o;

import android.content.Context;
import im.toss.uikit.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class r8lambdaaf6h4gyIT_zMU5_zL59OQo83yI extends getTypedExportedConstants {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public static final int onWarmupCompleted = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdaaf6h4gyIT_zMU5_zL59OQo83yI(@NotNull Context context, int i, boolean z, boolean z2) {
        super(context, i, z, z2, 0L, null, 48, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ r8lambdaaf6h4gyIT_zMU5_zL59OQo83yI(Context context, int i, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = IAuthTabCallback + 77;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            i = R.style.BottomSheetDialog;
            int i5 = IAuthTabCallback + 81;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
        }
        this(context, i, (i2 & 4) != 0 ? true : z, (i2 & 8) != 0 ? false : z2);
    }
}
