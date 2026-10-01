package im.toss.uikit.widget.list.agreements.v1;

import android.content.Context;
import android.util.AttributeSet;
import im.toss.uikit.widget.list.TdsListRowV0View;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class TdsAgreementRowV1View extends TdsListRowV0View {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsAgreementRowV1View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsAgreementRowV1View(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TdsAgreementRowV1View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsAgreementRowV1View(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onExtraCallback + Imgproc.COLOR_YUV2RGB_YVYU;
            IAuthTabCallback = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i4 = onExtraCallback + 27;
            IAuthTabCallback = i4 % 128;
            i = i4 % 2 == 0 ? 1 : 0;
            int i5 = 2 % 2;
        }
        this(context, attributeSet, i);
    }
}
