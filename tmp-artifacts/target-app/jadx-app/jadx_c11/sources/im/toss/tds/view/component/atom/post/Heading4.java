package im.toss.tds.view.component.atom.post;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import im.toss.tds.view.component.atom.text.SubTypography10;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.getUrlokhttp;
import o.response;
import o.setBodyokhttp;
import o.setTagsokhttp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class Heading4 extends SubTypography10 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Heading4(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Heading4(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Heading4(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        setPadding(setTagsokhttp.onExtraCallbackWithResult(this, 24), setTagsokhttp.onExtraCallbackWithResult(this, 8), setTagsokhttp.onExtraCallbackWithResult(this, 24), setTagsokhttp.onExtraCallbackWithResult(this, 16));
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        setTextColor(new getUrlokhttp(new setBodyokhttp.onWarmupCompleted(configuration)).onRelationshipValidationResult());
        onNavigationEvent(response.Bold);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Heading4(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onWarmupCompleted + 31;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i6 = onWarmupCompleted + 73;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
