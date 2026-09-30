package im.toss.uikit.widget.textView;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import im.toss.tds.view.R;
import im.toss.tds.view.component.atom.text.Typography7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.getAdService;
import o.getDEFAULT_CONNECTION_SPECSokhttp;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.readIntokhttp;
import o.setVisitUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class BottomInfo extends Typography7 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BottomInfo(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BottomInfo(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BottomInfo(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.top_top_padding_24);
        setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        Object[] objArr = {new getUrlokhttp(new onWarmupCompleted(configuration))};
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        setTextColor(((Integer) getUrlokhttp.onNavigationEvent(objArr, 975054206, -975054198, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult())).intValue());
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        Resources resources = context3.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration2 = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        setBackgroundColor(new getDEFAULT_CONNECTION_SPECSokhttp(new onExtraCallback(configuration2)).onExtraCallbackWithResult());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BottomInfo(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onNavigationEvent;
            int i4 = i3 + Imgproc.COLOR_YUV2RGB_YVYU;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 75;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            attributeSet = null;
        }
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public static final class onWarmupCompleted implements getAdService {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onWarmupCompleted(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + Imgproc.COLOR_YUV2RGBA_YVYU;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onWarmupCompleted + 25;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return getSpecialFeatureOptInStatus.Dark;
        }
    }

    public static final class onExtraCallback implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public onExtraCallback(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 21;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = IAuthTabCallback + 109;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return getSpecialFeatureOptInStatus.Dark;
        }
    }
}
