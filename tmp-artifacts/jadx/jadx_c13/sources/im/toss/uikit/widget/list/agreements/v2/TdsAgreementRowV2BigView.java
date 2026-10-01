package im.toss.uikit.widget.list.agreements.v2;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.SubTypography8;
import im.toss.uikit.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.getAdService;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.readIntokhttp;
import o.response;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TdsAgreementRowV2BigView extends TdsAgreementRowV2GroupView {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsAgreementRowV2BigView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsAgreementRowV2BigView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TdsAgreementRowV2BigView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        boolean z = false;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.TdsAgreementRowV2Big, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            boolean z2 = false;
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == R.styleable.TdsAgreementRowV2Big_border) {
                    int i3 = onWarmupCompleted + 17;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    z2 = typedArrayObtainStyledAttributes.getBoolean(index, z2);
                    int i5 = 2 % 2;
                }
            }
            z = z2;
        }
        onNavigationEvent(asBinder());
        setBorder(z);
        int i6 = onExtraCallbackWithResult + 109;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsAgreementRowV2BigView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onExtraCallbackWithResult;
            int i4 = i3 + 5;
            onWarmupCompleted = i4 % 128;
            Object obj = null;
            if (i4 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 75;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i7 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.uikit.widget.list.agreements.v2.TdsAgreementRowV2GroupView
    public BaseTextView IAuthTabCallback() {
        int i = 2 % 2;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        SubTypography8 subTypography8 = new SubTypography8(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        subTypography8.onNavigationEvent(response.Bold);
        Context context2 = subTypography8.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        subTypography8.setTextColor(new getUrlokhttp(new onExtraCallback(configuration)).onRelationshipValidationResult());
        int i2 = onExtraCallbackWithResult + 55;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return subTypography8;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.uikit.widget.list.agreements.v2.TdsAgreementRowV2GroupView
    public int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(Float.valueOf(16.0f), displayMetrics);
        int i4 = onExtraCallbackWithResult + 85;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 91 / 0;
        }
        return iOnNavigationEvent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.uikit.widget.list.agreements.v2.TdsAgreementRowV2GroupView
    public int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            return varyMatches.onNavigationEvent(Float.valueOf(8.0f), displayMetrics);
        }
        DisplayMetrics displayMetrics2 = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(Float.valueOf(8.0f), displayMetrics2);
        int i3 = 57 / 0;
        return iOnNavigationEvent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.uikit.widget.list.agreements.v2.TdsAgreementRowV2GroupView
    public int onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(Float.valueOf(56.0f), displayMetrics);
        int i4 = onExtraCallbackWithResult + 67;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return iOnNavigationEvent;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final View asBinder() {
        int i = 2 % 2;
        View view = new View(getContext());
        view.setId(R.id.tds_agreement_row_v2_big_divider);
        DisplayMetrics displayMetrics = view.getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult = new ConstraintLayout.onExtraCallbackWithResult(-1, varyMatches.onNavigationEvent(Float.valueOf(0.5f), displayMetrics));
        onextracallbackwithresult.IAuthTabCallback = R.id.spaceBottom;
        Float fValueOf = Float.valueOf(24.0f);
        DisplayMetrics displayMetrics2 = view.getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult).leftMargin = varyMatches.onNavigationEvent(fValueOf, displayMetrics2);
        DisplayMetrics displayMetrics3 = view.getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult).rightMargin = varyMatches.onNavigationEvent(fValueOf, displayMetrics3);
        view.setLayoutParams(onextracallbackwithresult);
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        view.setBackgroundColor(new getUrlokhttp(new onExtraCallbackWithResult(configuration)).isEngagementSignalsApiAvailable());
        int i2 = onWarmupCompleted + 5;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.tds_agreement_row_v2_big_divider;
        if (i3 == 0) {
            return findViewById(i4);
        }
        findViewById(i4);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallback implements getAdService {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration IAuthTabCallback;

        public onExtraCallback(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i2 = onNavigationEvent + 125;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = onNavigationEvent + 69;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Configuration IAuthTabCallback;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                int i2 = onExtraCallbackWithResult + 125;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = onExtraCallbackWithResult + 71;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return getspecialfeatureoptinstatus;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final void setBorder(boolean z) {
        int i;
        int i2 = 2 % 2;
        View viewOnWarmupCompleted = onWarmupCompleted();
        if (viewOnWarmupCompleted != null) {
            int i3 = onWarmupCompleted + 39;
            int i4 = i3 % 128;
            onExtraCallbackWithResult = i4;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (z) {
                i = 0;
            } else {
                int i5 = i4 + 51;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                i = 8;
            }
            viewOnWarmupCompleted.setVisibility(i);
            int i7 = onExtraCallbackWithResult + 47;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
        }
    }
}
