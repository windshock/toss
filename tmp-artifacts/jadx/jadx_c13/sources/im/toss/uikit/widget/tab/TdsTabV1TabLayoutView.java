package im.toss.uikit.widget.tab;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.tabs.TabLayout;
import im.toss.features.foreigner.home.ui.test.ForeignerHomeTestScreenKt$;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.uikit.R;
import im.toss.uikit.widget.tab.TdsTabV1TabLayoutView$;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.IntIterator;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import o.ConnectionPool;
import o.RequestBodyCompanion;
import o.access15300;
import o.accessgetTlsVersionsAsStringp;
import o.authParams;
import o.connectionCount;
import o.response;
import o.setDone;
import o.setMinWebSocketMessageToCompressokhttp;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import viva.republica.toss.account.agreement.AccountAgreementHelper$$ExternalSyntheticLambda18;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class TdsTabV1TabLayoutView extends TabLayout {
    private static int onTransact = 1;
    private static int onWarmupCompleted;
    private final Lazy IAuthTabCallback;
    private final Lazy onExtraCallback;
    private onExtraCallbackWithResult onExtraCallbackWithResult;
    private int onNavigationEvent;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsTabV1TabLayoutView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsTabV1TabLayoutView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ int IAuthTabCallback(Context context) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = onWarmupCompleted(context);
        int i4 = onWarmupCompleted + 51;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 19 / 0;
        }
        return iOnWarmupCompleted;
    }

    public static /* synthetic */ int onExtraCallback(Context context) {
        int i = 2 % 2;
        int i2 = onTransact + 37;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(context);
        int i4 = onTransact + 101;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return iOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i;
        int i8 = ~i4;
        int i9 = ~(i7 | i8 | i6);
        int i10 = ~i6;
        int i11 = (~(i7 | i10)) | (~(i8 | i | i6));
        int i12 = (~(i6 | i7)) | (~(i8 | i10));
        int i13 = i + i4 + i3 + ((-1255669517) * i5) + (533247121 * i2);
        int i14 = i13 * i13;
        int i15 = ((i * (-1895547823)) - 858849280) + ((-1895547823) * i4) + (i9 * (-204618832)) + (i11 * (-204618832)) + ((-204618832) * i12) + ((-2100166656) * i3) + (760610816 * i5) + ((-1057882112) * i2) + (1344208896 * i14);
        int i16 = ((i * (-122328301)) - 2132886715) + (i4 * (-122328301)) + (i9 * Imgcodecs.IMWRITE_JPEG2000_COMPRESSION_X1000) + (i11 * Imgcodecs.IMWRITE_JPEG2000_COMPRESSION_X1000) + (i12 * Imgcodecs.IMWRITE_JPEG2000_COMPRESSION_X1000) + (i3 * (-122328029)) + (i5 * (-1196579527)) + (i2 * 656595923) + (i14 * 138215424);
        return i15 + ((i16 * i16) * (-833028096)) != 1 ? onWarmupCompleted(objArr) : IAuthTabCallback(objArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TdsTabV1TabLayoutView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallbackWithResult = onExtraCallbackWithResult.LARGE;
        this.onExtraCallback = LazyKt__LazyJVMKt.lazy(new TdsTabV1TabLayoutView$.ExternalSyntheticLambda0(context));
        this.IAuthTabCallback = LazyKt__LazyJVMKt.lazy(new TdsTabV1TabLayoutView$.ExternalSyntheticLambda1(context));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsTabV1TabLayoutView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onWarmupCompleted + 59;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = onTransact + 5;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallbackWithResult {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallbackWithResult[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;
        private final int value;
        public static final onExtraCallbackWithResult SMALL = new onExtraCallbackWithResult("SMALL", 0, 0);
        public static final onExtraCallbackWithResult LARGE = new onExtraCallbackWithResult("LARGE", 1, 1);

        private static final /* synthetic */ onExtraCallbackWithResult[] $values() {
            onExtraCallbackWithResult[] onextracallbackwithresultArr;
            int i = 2 % 2;
            int i2 = onExtraCallback + 51;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            if (i2 % 2 != 0) {
                onExtraCallbackWithResult onextracallbackwithresult = SMALL;
                onExtraCallbackWithResult onextracallbackwithresult2 = LARGE;
                onextracallbackwithresultArr = new onExtraCallbackWithResult[2];
                onextracallbackwithresultArr[0] = onextracallbackwithresult;
                onextracallbackwithresultArr[0] = onextracallbackwithresult2;
            } else {
                onextracallbackwithresultArr = new onExtraCallbackWithResult[]{SMALL, LARGE};
            }
            int i4 = i3 + 75;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackwithresultArr;
        }

        public static EnumEntries<onExtraCallbackWithResult> getEntries() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 21;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            EnumEntries<onExtraCallbackWithResult> enumEntries = $ENTRIES;
            int i5 = i3 + 33;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return enumEntries;
            }
            throw null;
        }

        public static onExtraCallbackWithResult valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 57;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) Enum.valueOf(onExtraCallbackWithResult.class, str);
            if (i3 == 0) {
                return onextracallbackwithresult;
            }
            throw null;
        }

        public static onExtraCallbackWithResult[] values() {
            onExtraCallbackWithResult[] onextracallbackwithresultArr;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 5;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                onextracallbackwithresultArr = (onExtraCallbackWithResult[]) $VALUES.clone();
                int i3 = 81 / 0;
            } else {
                onextracallbackwithresultArr = (onExtraCallbackWithResult[]) $VALUES.clone();
            }
            int i4 = onExtraCallback + 13;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return onextracallbackwithresultArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private onExtraCallbackWithResult(String str, int i, int i2) {
            this.value = i2;
        }

        public final int getValue() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 39;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return this.value;
            }
            throw null;
        }

        static {
            onExtraCallbackWithResult[] onextracallbackwithresultArr$values = $values();
            $VALUES = onextracallbackwithresultArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackwithresultArr$values);
            int i = IAuthTabCallback + 47;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }
    }

    public final void setTabHorizontalPadding$uikit_release(int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 33;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        this.onNavigationEvent = i;
        if (i4 != 0) {
            throw null;
        }
    }

    public final void setTabSize$uikit_release(@NotNull onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        this.onExtraCallbackWithResult = onextracallbackwithresult;
        int i4 = onWarmupCompleted + 9;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    private final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 31;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Number) this.onExtraCallback.getValue()).intValue();
        int i4 = onTransact + 11;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return iIntValue;
    }

    private static final int onExtraCallbackWithResult(Context context) {
        int i = 2 % 2;
        int i2 = onTransact + 71;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(Float.valueOf(12.0f), displayMetrics);
        int i4 = onTransact + 51;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return iOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact + 65;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Number) this.IAuthTabCallback.getValue()).intValue();
        int i4 = onTransact + 69;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 84 / 0;
        }
        return iIntValue;
    }

    private static final int onWarmupCompleted(Context context) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(Float.valueOf(4.0f), displayMetrics);
        int i4 = onWarmupCompleted + 5;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return iOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        TdsTabV1TabLayoutView tdsTabV1TabLayoutView = (TdsTabV1TabLayoutView) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = onTransact + 81;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {tdsTabV1TabLayoutView, Integer.valueOf(iIntValue)};
        int iOnNavigationEvent = AccountAgreementHelper$$ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$$ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent3 = AccountAgreementHelper$$ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent4 = AccountAgreementHelper$$ExternalSyntheticLambda18.onNavigationEvent();
        if (i3 != 0) {
            throw null;
        }
        View view = (View) onExtraCallbackWithResult(1545710545, iOnNavigationEvent4, iOnNavigationEvent2, -1545710545, iOnNavigationEvent3, objArr2, iOnNavigationEvent);
        if (view != null) {
            view.setVisibility(0);
        }
        int i4 = onWarmupCompleted + 119;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final void onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + Imgproc.COLOR_YUV2RGBA_YVYU;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Integer numValueOf = Integer.valueOf(i);
        if (i4 != 0) {
            int iOnNavigationEvent = AccountAgreementHelper$$ExternalSyntheticLambda18.onNavigationEvent();
            int iOnNavigationEvent2 = AccountAgreementHelper$$ExternalSyntheticLambda18.onNavigationEvent();
            int iOnNavigationEvent3 = AccountAgreementHelper$$ExternalSyntheticLambda18.onNavigationEvent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnNavigationEvent4 = AccountAgreementHelper$$ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent5 = AccountAgreementHelper$$ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent6 = AccountAgreementHelper$$ExternalSyntheticLambda18.onNavigationEvent();
        View view = (View) onExtraCallbackWithResult(1545710545, AccountAgreementHelper$$ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent5, -1545710545, iOnNavigationEvent6, new Object[]{this, numValueOf}, iOnNavigationEvent4);
        if (view != null) {
            view.setVisibility(8);
            int i5 = onWarmupCompleted + 1;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        View customView;
        int i = 2 % 2;
        TabLayout.Tab tabAt = ((TdsTabV1TabLayoutView) objArr[0]).getTabAt(((Number) objArr[1]).intValue());
        if (tabAt == null || (customView = tabAt.getCustomView()) == null) {
            int i2 = onTransact + 13;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        int i4 = onTransact + 37;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        View viewFindViewById = customView.findViewById(R.id.fluid_tab_badge);
        int i6 = onTransact + 89;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return viewFindViewById;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void selectTab(@Nullable TabLayout.Tab tab) {
        int i = 2 % 2;
        if (isEnabled()) {
            int i2 = onWarmupCompleted + 77;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            super.selectTab(tab);
        }
        int i4 = onWarmupCompleted + 67;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 18 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void selectTab(@Nullable TabLayout.Tab tab, boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 76 / 0;
            if (!(!isEnabled())) {
                super.selectTab(tab, z);
            }
        } else if (isEnabled()) {
        }
        int i4 = onWarmupCompleted + 113;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onMeasure(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onTransact + Imgproc.COLOR_YUV2RGB_YVYU;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        super.onMeasure(i, i2);
        if (getTabMode() != 1) {
            onNavigationEvent();
            return;
        }
        int i6 = onWarmupCompleted + 61;
        onTransact = i6 % 128;
        if (i6 % 2 != 0 ? getTabCount() > 4 : getTabCount() > 4) {
            onNavigationEvent();
            return;
        }
        int tabCount = getTabCount();
        int i7 = 0;
        while (i7 < tabCount) {
            if (onExtraCallbackWithResult(i7)) {
                int i8 = onTransact + 43;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                onNavigationEvent();
            }
            i7++;
            int i10 = onTransact + 103;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
        }
    }

    private final boolean onExtraCallbackWithResult(int i) {
        int iOnWarmupCompleted;
        int i2 = 2 % 2;
        int i3 = onTransact + 79;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        TabLayout.Tab tabAt = getTabAt(i);
        View customView = tabAt != null ? tabAt.getCustomView() : null;
        ViewGroup viewGroup = customView instanceof ViewGroup ? (ViewGroup) customView : null;
        if (viewGroup == null) {
            return false;
        }
        BaseTextView childAt = viewGroup.getChildAt(0);
        BaseTextView baseTextView = (childAt instanceof BaseTextView) ^ true ? null : childAt;
        if (baseTextView == null) {
            return false;
        }
        View childAt2 = viewGroup.getChildAt(1);
        if (childAt2 != null) {
            float fMeasureText = baseTextView.getPaint().measureText(baseTextView.getText().toString());
            if (childAt2.getVisibility() == 0) {
                int i5 = onWarmupCompleted + 119;
                onTransact = i5 % 128;
                iOnWarmupCompleted = i5 % 2 == 0 ? onWarmupCompleted() >> childAt2.getMeasuredWidth() : childAt2.getMeasuredWidth() + onWarmupCompleted();
            } else {
                iOnWarmupCompleted = 0;
            }
            return (fMeasureText / 2.0f) + ((float) iOnWarmupCompleted) > ((float) ((Math.max(viewGroup.getWidth(), viewGroup.getMeasuredWidth()) - (this.onNavigationEvent << 1)) / 2));
        }
        int i6 = onTransact + 19;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TabLayout.Tab newTab() {
        int i = 2 % 2;
        Float fValueOf = Float.valueOf(6.0f);
        TabLayout.Tab tabNewTab = super.newTab();
        Intrinsics.checkNotNullExpressionValue(tabNewTab, "");
        final Context context = getContext();
        Typography5 typography5 = new Typography5(context) { // from class: im.toss.uikit.widget.tab.TdsTabV1TabLayoutView$newTab$textView$1
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                Intrinsics.checkNotNull(context);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public void setSelected(boolean z) {
                Typeface typeface$default;
                int i2 = 2 % 2;
                super/*android.view.View*/.setSelected(z);
                TextPaint paint = getPaint();
                if (!z) {
                    response responseVar = response.SemiBold;
                    Context context2 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    typeface$default = response.toTypeface$default(responseVar, context2, (setDone) null, 2, (Object) null);
                    int i3 = onWarmupCompleted + 125;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                } else {
                    int i5 = onWarmupCompleted + 89;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    response responseVar2 = response.Bold;
                    Context context3 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "");
                    typeface$default = response.toTypeface$default(responseVar2, context3, (setDone) null, 2, (Object) null);
                }
                paint.setTypeface(typeface$default);
                int i7 = onExtraCallback + 23;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
            }
        };
        typography5.setId(android.R.id.text1);
        typography5.onWarmupCompleted(varyMatches.IAuthTabCallback(typography5, Float.valueOf(connectionCount.onExtraCallback(new connectionCount(accessgetTlsVersionsAsStringp.Typography5.getSize(), 0.0f, 2, (DefaultConstructorMarker) null), 1.6f, 0.0f, 2, (Object) null))));
        typography5.onExtraCallbackWithResult(ConnectionPool.onWarmupCompleted.onWarmupCompleted());
        typography5.onNavigationEvent(response.SemiBold);
        typography5.setTextColor(new ColorStateList(new int[][]{FrameLayout.SELECTED_STATE_SET, FrameLayout.EMPTY_STATE_SET}, new int[]{RequestBodyCompanion.onNavigationEvent(typography5, authParams.TextPrimary), RequestBodyCompanion.onNavigationEvent(typography5, authParams.TextTertiary)}));
        typography5.setDuplicateParentStateEnabled(true);
        BaseTextView.IAuthTabCallback(ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{typography5, true}, 160681464, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), -160681463);
        View view = new View(getContext());
        view.setId(R.id.fluid_tab_badge);
        view.setBackgroundResource(R.drawable.tab_badge);
        ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
        constraintLayout.addView(typography5);
        constraintLayout.addView(view);
        ViewGroup.LayoutParams layoutParams = typography5.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        int i2 = onWarmupCompleted + 119;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult = (ConstraintLayout.onExtraCallbackWithResult) layoutParams;
        onextracallbackwithresult.IPostMessageServiceStubProxy = 0;
        onextracallbackwithresult.setEngagementSignalsCallback = 0;
        onextracallbackwithresult.IEngagementSignalsCallbackStubProxy = 0;
        onextracallbackwithresult.IAuthTabCallback = 0;
        int i4 = this.onNavigationEvent;
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult).leftMargin = i4;
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult).rightMargin = i4;
        typography5.setLayoutParams(onextracallbackwithresult);
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        int i5 = onWarmupCompleted + 59;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult2 = (ConstraintLayout.onExtraCallbackWithResult) layoutParams2;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult2).width = varyMatches.onNavigationEvent(fValueOf, displayMetrics);
        DisplayMetrics displayMetrics2 = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult2).height = varyMatches.onNavigationEvent(fValueOf, displayMetrics2);
        onextracallbackwithresult2.IPostMessageServiceStubProxy = android.R.id.text1;
        onextracallbackwithresult2.receiveFile = android.R.id.text1;
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult2).leftMargin = onWarmupCompleted();
        view.setLayoutParams(onextracallbackwithresult2);
        view.setVisibility(8);
        tabNewTab.setCustomView(constraintLayout);
        int i7 = onTransact + 1;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return tabNewTab;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onNavigationEvent() {
        ViewGroup viewGroup;
        View childAt;
        int i = 2 % 2;
        setTabMode(0);
        setTabGravity(2);
        Iterator<Integer> it = RangesKt___RangesKt.until(0, getTabCount()).iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            TabLayout.Tab tabAt = getTabAt(iNextInt);
            View customView = tabAt != null ? tabAt.getCustomView() : null;
            if (customView instanceof ViewGroup) {
                viewGroup = (ViewGroup) customView;
            } else {
                int i2 = onWarmupCompleted + Imgproc.COLOR_YUV2RGB_YVYU;
                onTransact = i2 % 128;
                int i3 = i2 % 2;
                viewGroup = null;
            }
            if (viewGroup != null) {
                int i4 = onWarmupCompleted + 115;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                childAt = viewGroup.getChildAt(0);
                int i6 = onTransact + 11;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
            } else {
                childAt = null;
            }
            BaseTextView baseTextView = childAt instanceof BaseTextView ? (BaseTextView) childAt : null;
            if (baseTextView != null) {
                setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -935338024, new Object[]{baseTextView, Integer.valueOf(onExtraCallbackWithResult()), Integer.valueOf(onExtraCallbackWithResult())}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 935338026);
                TabLayout.TabView tabView = tabAt.view;
                if (iNextInt == 0) {
                    Intrinsics.checkNotNull(tabView);
                    DisplayMetrics displayMetrics = tabView.getResources().getDisplayMetrics();
                    Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                    setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -520433888, new Object[]{tabView, Integer.valueOf(varyMatches.onNavigationEvent(20, displayMetrics))}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 520433888);
                } else if (iNextInt == getTabCount() - 1) {
                    Intrinsics.checkNotNull(tabView);
                    DisplayMetrics displayMetrics2 = tabView.getResources().getDisplayMetrics();
                    Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
                    setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(tabView, varyMatches.onNavigationEvent(20, displayMetrics2));
                }
            }
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        int i8 = onWarmupCompleted + 91;
        onTransact = i8 % 128;
        int i9 = i8 % 2;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        DisplayMetrics displayMetrics3 = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
        layoutParams2.leftMargin = varyMatches.onNavigationEvent(0, displayMetrics3);
        DisplayMetrics displayMetrics4 = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
        layoutParams2.rightMargin = varyMatches.onNavigationEvent(0, displayMetrics4);
        setLayoutParams(layoutParams2);
    }

    private final View onExtraCallback(int i) {
        Object[] objArr = {this, Integer.valueOf(i)};
        int iOnNavigationEvent = AccountAgreementHelper$$ExternalSyntheticLambda18.onNavigationEvent();
        return (View) onExtraCallbackWithResult(1545710545, AccountAgreementHelper$$ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$$ExternalSyntheticLambda18.onNavigationEvent(), -1545710545, AccountAgreementHelper$$ExternalSyntheticLambda18.onNavigationEvent(), objArr, iOnNavigationEvent);
    }

    public final void IAuthTabCallback(int i) {
        Object[] objArr = {this, Integer.valueOf(i)};
        int iOnNavigationEvent = AccountAgreementHelper$$ExternalSyntheticLambda18.onNavigationEvent();
        onExtraCallbackWithResult(-205201931, AccountAgreementHelper$$ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$$ExternalSyntheticLambda18.onNavigationEvent(), 205201932, AccountAgreementHelper$$ExternalSyntheticLambda18.onNavigationEvent(), objArr, iOnNavigationEvent);
    }
}
