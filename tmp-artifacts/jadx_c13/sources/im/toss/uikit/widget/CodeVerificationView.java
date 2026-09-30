package im.toss.uikit.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import androidx.core.content.ContextCompat;
import com.google.android.flexbox.FlexboxLayout;
import im.toss.tds.view.component.atom.text.SubTypography5;
import im.toss.uikit.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.getAdService;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.readIntokhttp;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class CodeVerificationView extends FlexboxLayout {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CodeVerificationView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CodeVerificationView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    private final float IAuthTabCallback(int i) {
        int i2 = 2 % 2;
        if (i >= 5) {
            int i3 = IAuthTabCallback + 41;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return 58.0f;
        }
        int i5 = onNavigationEvent;
        int i6 = i5 + 95;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i5 + 49;
        IAuthTabCallback = i8 % 128;
        if (i8 % 2 != 0) {
            return 77.0f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final float onExtraCallback(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 63;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        if (i3 % 2 != 0) {
            if (i >= 3) {
                return 40.0f;
            }
        } else if (i >= 5) {
            return 40.0f;
        }
        int i5 = i4 + 17;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 99 / 0;
        }
        return 64.0f;
    }

    private final float onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 23;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        if (i < 5) {
            int i6 = i4 + 75;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return 54.0f;
        }
        int i8 = i4 + 67;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        return 32.0f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CodeVerificationView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        setFlexWrap(1);
        setShowDivider(2);
        setDividerDrawable(ContextCompat.getDrawable(context, R.drawable.divider_6));
        setCode("1234");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CodeVerificationView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = IAuthTabCallback;
            int i4 = i3 + 49;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 109;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 % 2;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i8 = IAuthTabCallback + 19;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setCode(@NotNull String str) {
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            int i3 = IAuthTabCallback + 21;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        if (str.length() <= 6) {
            int i5 = IAuthTabCallback + 93;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                removeAllViews();
                i = 1;
            } else {
                removeAllViews();
                i = 0;
            }
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                SubTypography5 subTypography5 = new SubTypography5(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                subTypography5.setBackgroundResource(R.drawable.code_verification_bg);
                subTypography5.setGravity(17);
                subTypography5.setTextSize(1, onWarmupCompleted(str.length()));
                subTypography5.setText(String.valueOf(cCharAt));
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                Configuration configuration = context2.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration, "");
                subTypography5.setTextColor(new getUrlokhttp(new onWarmupCompleted(configuration)).onRelationshipValidationResult());
                float fOnExtraCallback = onExtraCallback(str.length());
                DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                int iOnNavigationEvent = varyMatches.onNavigationEvent(Float.valueOf(fOnExtraCallback), displayMetrics);
                float fIAuthTabCallback = IAuthTabCallback(str.length());
                DisplayMetrics displayMetrics2 = getContext().getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
                addView(subTypography5, new FlexboxLayout.LayoutParams(iOnNavigationEvent, varyMatches.onNavigationEvent(Float.valueOf(fIAuthTabCallback), displayMetrics2)));
                i++;
            }
        }
    }

    public static final class onWarmupCompleted implements getAdService {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration IAuthTabCallback;

        public onWarmupCompleted(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            Object obj = null;
            if (readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                int i2 = onExtraCallback + 55;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                if (i3 == 0) {
                    return getspecialfeatureoptinstatus;
                }
                throw null;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Light;
            int i4 = onExtraCallback + 65;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return getspecialfeatureoptinstatus2;
            }
            obj.hashCode();
            throw null;
        }
    }
}
