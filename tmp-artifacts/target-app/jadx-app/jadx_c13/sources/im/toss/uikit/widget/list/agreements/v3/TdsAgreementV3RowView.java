package im.toss.uikit.widget.list.agreements.v3;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.iap.ac.android.biz.common.rpc.request.MobilePaymentInquireQuoteRequest;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelAdapter$;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.features.tosscert.ui.R;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.uikit.R;
import im.toss.uikit.widget.TdsSpace;
import im.toss.uikit.widget.list.agreements.v3.TdsAgreementV3ColumnView;
import im.toss.uikit.widget.list.agreements.v3.TdsAgreementV3RowView$;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import o.AFj1zSDK;
import o.AppLovinSdkSettings;
import o.EasingFunctionsKtExternalSyntheticLambda0;
import o.EasingFunctionsKtExternalSyntheticLambda4;
import o.M_;
import o.access15300;
import o.clearProcessUptime;
import o.deprecated_certificatePinner;
import o.deprecated_dns;
import o.deprecated_minFreshSeconds;
import o.ensureCausesIsMutable;
import o.getAdService;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.getWrite;
import o.head;
import o.isMuted;
import o.loadlambda0;
import o.readIntokhttp;
import o.setMinWebSocketMessageToCompressokhttp;
import o.setProtocolsokhttp;
import o.varyMatches;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TdsAgreementV3RowView extends ConstraintLayout {
    private static int IAuthTabCallback_Parcel = 1;
    private static int access000 = 1;
    private static int access100;
    private static int getInterfaceDescriptor;
    private CharSequence IAuthTabCallback;
    private int IAuthTabCallbackDefault;
    private int IAuthTabCallbackStub;
    private final head IAuthTabCallbackStubProxy;
    private boolean asBinder;
    private final ArrayList<TdsAgreementV3ColumnView> asInterface;
    private TdsAgreementV3ColumnView.onExtraCallbackWithResult onExtraCallback;
    private final AFj1zSDK onExtraCallbackWithResult;
    private ValueAnimator onNavigationEvent;
    private int onTransact;
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    public static final int onWarmupCompleted = 8;

    static {
        int i = getInterfaceDescriptor + 21;
        access000 = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsAgreementV3RowView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsAgreementV3RowView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 61;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(function1, view);
        int i4 = IAuthTabCallback_Parcel + 27;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        TdsAgreementV3ColumnView tdsAgreementV3ColumnView = (TdsAgreementV3ColumnView) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 39;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(tdsAgreementV3ColumnView, view);
        int i4 = IAuthTabCallback_Parcel + 97;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 86 / 0;
        }
        return null;
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, View view) {
        int i = 2 % 2;
        int i2 = access100 + 123;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        asBinder(function1, view);
        int i4 = IAuthTabCallback_Parcel + 81;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ AppLovinSdkSettings onExtraCallbackWithResult(TdsAgreementV3RowView tdsAgreementV3RowView, boolean z) {
        int i = 2 % 2;
        int i2 = access100 + 61;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(tdsAgreementV3RowView, z);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallback = IAuthTabCallback(tdsAgreementV3RowView, z);
        int i3 = access100 + 59;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return appLovinSdkSettingsIAuthTabCallback;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 55;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onTransact(function1, view);
        int i4 = access100 + 33;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ TdsAgreementV3ColumnView onNavigationEvent(View view) {
        int i = 2 % 2;
        int i2 = access100 + 27;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        TdsAgreementV3ColumnView tdsAgreementV3ColumnViewOnExtraCallback = onExtraCallback(view);
        int i4 = access100 + 79;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return tdsAgreementV3ColumnViewOnExtraCallback;
    }

    public static /* synthetic */ CharSequence onNavigationEvent(TdsAgreementV3RowView tdsAgreementV3RowView) {
        int i = 2 % 2;
        int i2 = access100 + 49;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
            int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
            int iOnExtraCallback3 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
            return (CharSequence) onWarmupCompleted(-15791190, 15791195, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback, iOnExtraCallback3, new Object[]{tdsAgreementV3RowView}, iOnExtraCallback2);
        }
        int iOnExtraCallback4 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback5 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback6 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(TdsAgreementV3ColumnView tdsAgreementV3ColumnView, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 83;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(tdsAgreementV3ColumnView, view);
        if (i3 != 0) {
            int i4 = 75 / 0;
        }
        int i5 = access100 + 1;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 19 / 0;
        }
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, View view) {
        int i = 2 % 2;
        int i2 = access100 + 63;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackDefault(function1, view);
        if (i3 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i2;
        int i8 = (~(i7 | i)) | i4;
        int i9 = ~i;
        int i10 = ~i4;
        int i11 = (~(i9 | i10)) | i2;
        int i12 = (~(i4 | i9 | i2)) | (~(i7 | i9 | i10)) | (~(i10 | i | i2));
        int i13 = i + i2 + i6 + ((-104759182) * i5) + ((-453318476) * i3);
        int i14 = i13 * i13;
        int i15 = (i * 1504131295) + 1805123584 + (1504131295 * i2) + (179255518 * i8) + ((-358511036) * i11) + ((-179255518) * i12) + (1324875776 * i6) + (711983104 * i5) + (1180696576 * i3) + (1022754816 * i14);
        int i16 = ((i * (-1431886989)) - 1507491630) + (i2 * (-1431886989)) + (i8 * (-122)) + (i11 * 244) + (i12 * Imgproc.COLOR_YUV2BGRA_YVYU) + (i6 * (-1431886867)) + (i5 * 722567050) + (i3 * (-1618605404)) + (i14 * 297664512);
        switch (i15 + (i16 * i16 * (-277217280))) {
            case 1:
                return onWarmupCompleted(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                return onNavigationEvent(objArr);
            case 6:
                return IAuthTabCallbackDefault(objArr);
            default:
                TdsAgreementV3RowView tdsAgreementV3RowView = (TdsAgreementV3RowView) objArr[0];
                TdsAgreementV3ColumnView.onExtraCallbackWithResult onextracallbackwithresult = (TdsAgreementV3ColumnView.onExtraCallbackWithResult) objArr[1];
                CharSequence charSequence = (CharSequence) objArr[2];
                boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
                loadlambda0 loadlambda0Var = (loadlambda0) objArr[4];
                int i17 = 2 % 2;
                int i18 = IAuthTabCallback_Parcel + 37;
                access100 = i18 % 128;
                int i19 = i18 % 2;
                TdsAgreementV3ColumnView tdsAgreementV3ColumnViewOnNavigationEvent = tdsAgreementV3RowView.onNavigationEvent(onextracallbackwithresult, charSequence, zBooleanValue, loadlambda0Var);
                tdsAgreementV3RowView.onExtraCallbackWithResult(tdsAgreementV3ColumnViewOnNavigationEvent);
                int i20 = IAuthTabCallback_Parcel + 111;
                access100 = i20 % 128;
                int i21 = i20 % 2;
                return tdsAgreementV3ColumnViewOnNavigationEvent;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        TdsAgreementV3RowView tdsAgreementV3RowView = (TdsAgreementV3RowView) objArr[0];
        ValueAnimator valueAnimator = (ValueAnimator) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 107;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback3 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        onWarmupCompleted(1731246131, -1731246125, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback, iOnExtraCallback3, new Object[]{tdsAgreementV3RowView, valueAnimator}, iOnExtraCallback2);
        int i4 = IAuthTabCallback_Parcel + 9;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static final class onWarmupCompleted implements View.OnLayoutChangeListener {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public onWarmupCompleted() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, im.toss.uikit.widget.list.agreements.v3.TdsAgreementV3RowView] */
        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = 2 % 2;
            view.removeOnLayoutChangeListener(this);
            ?? r1 = TdsAgreementV3RowView.this;
            r1.post(new asInterface());
            int i10 = onNavigationEvent + 59;
            onExtraCallbackWithResult = i10 % 128;
            if (i10 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TdsAgreementV3RowView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes;
        int i2;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.asInterface = new ArrayList<>();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        this.IAuthTabCallbackDefault = new getUrlokhttp(new IAuthTabCallbackDefault(configuration)).onActivityResized();
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        Configuration configuration2 = context3.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        this.IAuthTabCallbackStub = new getUrlokhttp(new asBinder(configuration2)).onPostMessage();
        TdsAgreementV3ColumnView.onExtraCallbackWithResult onextracallbackwithresult = TdsAgreementV3ColumnView.onExtraCallbackWithResult.SMALL;
        this.onExtraCallback = onextracallbackwithresult;
        this.asBinder = true;
        AFj1zSDK aFj1zSDKOnNavigationEvent = AFj1zSDK.onNavigationEvent(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(aFj1zSDKOnNavigationEvent, "");
        this.onExtraCallbackWithResult = aFj1zSDKOnNavigationEvent;
        this.IAuthTabCallbackStubProxy = new head(this, (View) null, false, new TdsAgreementV3RowView$.ExternalSyntheticLambda8(this), 6, (DefaultConstructorMarker) null);
        if (getLayoutParams() == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        }
        String string = null;
        int i3 = 0;
        if (attributeSet != null) {
            int i4 = access100 + 119;
            IAuthTabCallback_Parcel = i4 % 128;
            if (i4 % 2 == 0) {
                typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.TdsAgreementV3Row, 0, 0);
                Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            } else {
                typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.TdsAgreementV3Row, 0, 0);
                Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            }
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            int integer = 0;
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i5);
                if (index == R.styleable.TdsAgreementV3Row_agreementIndent) {
                    integer = typedArrayObtainStyledAttributes.getInteger(index, integer);
                } else {
                    if (index == R.styleable.TdsAgreementV3Row_agreementCheckable) {
                        int i6 = IAuthTabCallback_Parcel + 39;
                        access100 = i6 % 128;
                        int i7 = i6 % 2;
                        this.asBinder = typedArrayObtainStyledAttributes.getBoolean(index, this.asBinder);
                        i2 = access100 + 73;
                    } else if (index == R.styleable.TdsAgreementV3Row_agreementCenterTextType) {
                        onextracallbackwithresult = TdsAgreementV3ColumnView.onExtraCallbackWithResult.getEntries().get(typedArrayObtainStyledAttributes.getInt(index, 0));
                        i2 = access100 + 65;
                    } else {
                        if (index == R.styleable.TdsAgreementV3Row_agreementCenterText) {
                            this.IAuthTabCallback = typedArrayObtainStyledAttributes.getString(index);
                        } else if (index == R.styleable.TdsAgreementV3Row_agreementRightText) {
                            int i8 = access100 + 47;
                            IAuthTabCallback_Parcel = i8 % 128;
                            int i9 = i8 % 2;
                            string = typedArrayObtainStyledAttributes.getString(index);
                            int i10 = IAuthTabCallback_Parcel + 97;
                            access100 = i10 % 128;
                            if (i10 % 2 != 0) {
                            }
                        }
                    }
                    IAuthTabCallback_Parcel = i2 % 128;
                    int i11 = i2 % 2;
                }
                int i12 = 2 % 2;
            }
            i3 = integer;
        }
        setIndent(i3);
        TdsAgreementV3ColumnView.onExtraCallbackWithResult onextracallbackwithresult2 = onextracallbackwithresult;
        onNavigationEvent(onextracallbackwithresult2);
        CharSequence charSequence = this.IAuthTabCallback;
        if (charSequence != null) {
            setRow$default(this, onextracallbackwithresult2, charSequence, this.asBinder, null, 8, null);
        }
        if (string != null) {
            int i13 = IAuthTabCallback_Parcel + 1;
            access100 = i13 % 128;
            int i14 = i13 % 2;
            onWarmupCompleted(IAuthTabCallback.HYPERLINK);
            onWarmupCompleted(string);
        }
        this.onExtraCallbackWithResult.onWarmupCompleted.setDuplicateParentStateEnabled(true);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsAgreementV3RowView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = IAuthTabCallback_Parcel + 21;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i6 = IAuthTabCallback_Parcel + 81;
            access100 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public static final /* synthetic */ ArrayList IAuthTabCallback(TdsAgreementV3RowView tdsAgreementV3RowView) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 19;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        ArrayList<TdsAgreementV3ColumnView> arrayList = tdsAgreementV3RowView.asInterface;
        int i5 = i2 + 89;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return arrayList;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(TdsAgreementV3RowView tdsAgreementV3RowView, List list) {
        int i = 2 % 2;
        int i2 = access100 + 33;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        tdsAgreementV3RowView.IAuthTabCallback((List<TdsAgreementV3ColumnView>) list);
        int i4 = IAuthTabCallback_Parcel + 43;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setCollapsedArrowTintColor(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 95;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallbackDefault = i;
        if (i4 != 0) {
            int i5 = 18 / 0;
        }
    }

    public final void setUnCollapsedArrowTintColor(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 33;
        int i4 = i3 % 128;
        access100 = i4;
        int i5 = i3 % 2;
        this.IAuthTabCallbackStub = i;
        int i6 = i4 + 77;
        IAuthTabCallback_Parcel = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static final class IAuthTabCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAuthTabCallback[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;
        public static final IAuthTabCallback NONE = new IAuthTabCallback("NONE", 0);
        public static final IAuthTabCallback HYPERLINK = new IAuthTabCallback("HYPERLINK", 1);
        public static final IAuthTabCallback ACCORDION = new IAuthTabCallback("ACCORDION", 2);
        public static final IAuthTabCallback TAG = new IAuthTabCallback("TAG", 3);

        private static final /* synthetic */ IAuthTabCallback[] $values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 105;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = NONE;
            if (i3 == 0) {
                return new IAuthTabCallback[]{iAuthTabCallback, HYPERLINK, ACCORDION, TAG};
            }
            IAuthTabCallback iAuthTabCallback2 = HYPERLINK;
            IAuthTabCallback iAuthTabCallback3 = ACCORDION;
            IAuthTabCallback iAuthTabCallback4 = TAG;
            IAuthTabCallback[] iAuthTabCallbackArr = {iAuthTabCallback, iAuthTabCallback2};
            iAuthTabCallbackArr[3] = iAuthTabCallback3;
            iAuthTabCallbackArr[4] = iAuthTabCallback4;
            return iAuthTabCallbackArr;
        }

        public static EnumEntries<IAuthTabCallback> getEntries() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 91;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<IAuthTabCallback> enumEntries = $ENTRIES;
            int i5 = i2 + Imgproc.COLOR_YUV2RGBA_YVYU;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return enumEntries;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static IAuthTabCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 25;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
            int i4 = IAuthTabCallback + 119;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return iAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static IAuthTabCallback[] values() {
            IAuthTabCallback[] iAuthTabCallbackArr;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 11;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                iAuthTabCallbackArr = (IAuthTabCallback[]) $VALUES.clone();
                int i3 = 38 / 0;
            } else {
                iAuthTabCallbackArr = (IAuthTabCallback[]) $VALUES.clone();
            }
            int i4 = IAuthTabCallback + 7;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return iAuthTabCallbackArr;
            }
            throw null;
        }

        private IAuthTabCallback(String str, int i) {
        }

        static {
            IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
            $VALUES = iAuthTabCallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
            int i = onExtraCallback + 89;
            onNavigationEvent = i % 128;
            if (i % 2 != 0) {
                int i2 = 22 / 0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onNavigationEvent(TdsAgreementV3ColumnView.onExtraCallbackWithResult onextracallbackwithresult) {
        Pair pairIAuthTabCallback;
        int i = 2 % 2;
        this.onExtraCallback = onextracallbackwithresult;
        int i2 = onExtraCallback.onExtraCallbackWithResult[onextracallbackwithresult.ordinal()];
        if (i2 != 1) {
            int i3 = access100;
            int i4 = i3 + 41;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            if (i2 != 2) {
                int i6 = i3 + 57;
                IAuthTabCallback_Parcel = i6 % 128;
                if (i6 % 2 != 0 ? i2 != 3 : i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                float fOnNavigationEvent = varyMatches.onNavigationEvent(12, displayMetrics);
                DisplayMetrics displayMetrics2 = getContext().getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
                pairIAuthTabCallback = getWrite.IAuthTabCallback(Float.valueOf(fOnNavigationEvent), Integer.valueOf(varyMatches.onNavigationEvent(4, displayMetrics2)));
            } else {
                DisplayMetrics displayMetrics3 = getContext().getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
                float fOnNavigationEvent2 = varyMatches.onNavigationEvent(8, displayMetrics3);
                DisplayMetrics displayMetrics4 = getContext().getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
                pairIAuthTabCallback = getWrite.IAuthTabCallback(Float.valueOf(fOnNavigationEvent2), Integer.valueOf(varyMatches.onNavigationEvent(0, displayMetrics4)));
            }
        } else {
            DisplayMetrics displayMetrics5 = getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics5, "");
            float fOnNavigationEvent3 = varyMatches.onNavigationEvent(8, displayMetrics5);
            DisplayMetrics displayMetrics6 = getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics6, "");
            pairIAuthTabCallback = getWrite.IAuthTabCallback(Float.valueOf(fOnNavigationEvent3), Integer.valueOf(varyMatches.onNavigationEvent(0, displayMetrics6)));
            int i7 = IAuthTabCallback_Parcel + 93;
            access100 = i7 % 128;
            int i8 = i7 % 2;
        }
        float fFloatValue = ((Number) pairIAuthTabCallback.onExtraCallbackWithResult()).floatValue();
        int iIntValue = ((Number) pairIAuthTabCallback.IAuthTabCallback()).intValue();
        View view = this.onExtraCallbackWithResult.onWarmupCompleted;
        M_ m_ = M_.onExtraCallback;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        view.setBackground((deprecated_minFreshSeconds) M_.onNavigationEvent(-556734050, new Object[]{m_, context, Float.valueOf(fFloatValue)}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 556734051, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent()));
        View view2 = this.onExtraCallbackWithResult.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(view2, "");
        setMinWebSocketMessageToCompressokhttp.onExtraCallback(view2, iIntValue, iIntValue);
        int i9 = IAuthTabCallback_Parcel + 71;
        access100 = i9 % 128;
        if (i9 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallbackDefault implements getAdService {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onExtraCallback;

        public IAuthTabCallbackDefault(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i2 = onExtraCallbackWithResult + 105;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return getspecialfeatureoptinstatus;
            }
            int i4 = onWarmupCompleted + 119;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            if (i5 != 0) {
                return getspecialfeatureoptinstatus2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class asBinder implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Configuration onWarmupCompleted;

        public asBinder(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 33;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onExtraCallbackWithResult + 3;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i6 = IAuthTabCallback + 95;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                return getspecialfeatureoptinstatus;
            }
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final AppLovinSdkSettings IAuthTabCallback(TdsAgreementV3RowView tdsAgreementV3RowView, boolean z) {
        deprecated_dns deprecated_dnsVarOnNavigationEvent;
        float f;
        int i = 2 % 2;
        deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
        if (z) {
            int i2 = IAuthTabCallback_Parcel + 81;
            access100 = i2 % 128;
            if (i2 % 2 != 0) {
                deprecated_dnsVarOnNavigationEvent = deprecated_certificatepinner.asInterface();
                int i3 = 95 / 0;
            } else {
                deprecated_dnsVarOnNavigationEvent = deprecated_certificatepinner.asInterface();
            }
        } else {
            deprecated_dnsVarOnNavigationEvent = deprecated_certificatepinner.onNavigationEvent();
        }
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_dnsVarOnNavigationEvent}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
        float scaleX = tdsAgreementV3RowView.getScaleX();
        if (z) {
            f = 0.96f;
        } else {
            int i4 = IAuthTabCallback_Parcel + 75;
            access100 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 / 3;
            }
            f = 1.0f;
        }
        return isMuted.asBinder(appLovinSdkSettings, Float.valueOf(scaleX), Float.valueOf(f), (Function1) null, 4, (Object) null);
    }

    public static /* synthetic */ void setRow$default(TdsAgreementV3RowView tdsAgreementV3RowView, TdsAgreementV3ColumnView.onExtraCallbackWithResult onextracallbackwithresult, CharSequence charSequence, boolean z, loadlambda0 loadlambda0Var, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = access100 + 87;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0 ? (i & 8) != 0 : (i & 86) != 0) {
            loadlambda0Var = loadlambda0.NONE;
        }
        tdsAgreementV3RowView.setRow(onextracallbackwithresult, charSequence, z, loadlambda0Var);
        int i4 = access100 + 27;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final void onExtraCallbackWithResult(TdsAgreementV3ColumnView tdsAgreementV3ColumnView, View view) {
        int i = 2 % 2;
        int i2 = access100 + 95;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
            TdsAgreementV3ColumnView.IAuthTabCallback(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 1504630141, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, -1504630141, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{tdsAgreementV3ColumnView});
            int i3 = 72 / 0;
        } else {
            int iOnExtraCallbackWithResult3 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult4 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
            TdsAgreementV3ColumnView.IAuthTabCallback(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 1504630141, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult4, -1504630141, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{tdsAgreementV3ColumnView});
        }
        int i4 = access100 + 119;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setRowCheckBoxCheckedListener(@NotNull Function2<? super TdsCheckBoxV2View, ? super Boolean, Unit> function2) {
        TdsCheckBoxV2View tdsCheckBoxV2ViewOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = access100 + 5;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function2, "");
            onNavigationEvent();
            throw null;
        }
        Intrinsics.checkNotNullParameter(function2, "");
        TdsAgreementV3ColumnView tdsAgreementV3ColumnViewOnNavigationEvent = onNavigationEvent();
        if (tdsAgreementV3ColumnViewOnNavigationEvent == null || (tdsCheckBoxV2ViewOnWarmupCompleted = tdsAgreementV3ColumnViewOnNavigationEvent.onWarmupCompleted()) == null) {
            return;
        }
        int i3 = access100 + 29;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        tdsCheckBoxV2ViewOnWarmupCompleted.setOnCheckedChangeListener(function2);
    }

    public final TdsAgreementV3ColumnView onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 95;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TdsAgreementV3ColumnView tdsAgreementV3ColumnView = (TdsAgreementV3ColumnView) CollectionsKt___CollectionsKt.firstOrNull((List) onWarmupCompleted());
        int i3 = access100 + 41;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return tdsAgreementV3ColumnView;
    }

    public final void setColumns(@NotNull TdsAgreementV3ColumnView.onExtraCallbackWithResult onextracallbackwithresult, @NotNull List<onExtraCallbackWithResult> list) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        Intrinsics.checkNotNullParameter(list, "");
        onExtraCallbackWithResult();
        List<onExtraCallbackWithResult> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        int i2 = access100 + 21;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        for (onExtraCallbackWithResult onextracallbackwithresult2 : list2) {
            arrayList.add(onExtraCallback(this, onextracallbackwithresult, onextracallbackwithresult2.onWarmupCompleted(), onextracallbackwithresult2.onExtraCallback(), null, 8, null));
        }
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback3 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        onWarmupCompleted(-1639111576, 1639111579, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback, iOnExtraCallback3, new Object[]{this, arrayList}, iOnExtraCallback2);
        int i4 = access100 + 15;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static final void onExtraCallback(TdsAgreementV3ColumnView tdsAgreementV3ColumnView, View view) {
        int i = 2 % 2;
        int i2 = access100 + 83;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        TdsAgreementV3ColumnView.IAuthTabCallback(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 1504630141, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, -1504630141, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{tdsAgreementV3ColumnView});
        int i4 = IAuthTabCallback_Parcel + 85;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        TdsAgreementV3RowView tdsAgreementV3RowView = (TdsAgreementV3RowView) objArr[0];
        List list = (List) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 51;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int i4 = access100 + 9;
            IAuthTabCallback_Parcel = i4 % 128;
            if (i4 % 2 == 0) {
                ((TdsAgreementV3ColumnView) it.next()).onWarmupCompleted();
                throw null;
            }
            final TdsAgreementV3ColumnView tdsAgreementV3ColumnView = (TdsAgreementV3ColumnView) it.next();
            TdsCheckBoxV2View tdsCheckBoxV2ViewOnWarmupCompleted = tdsAgreementV3ColumnView.onWarmupCompleted();
            if (tdsCheckBoxV2ViewOnWarmupCompleted != null) {
                int i5 = access100 + 79;
                IAuthTabCallback_Parcel = i5 % 128;
                int i6 = i5 % 2;
                tdsCheckBoxV2ViewOnWarmupCompleted.setClickable(false);
            }
            tdsAgreementV3ColumnView.setOnClickListener(new View.OnClickListener() { // from class: im.toss.uikit.widget.list.agreements.v3.TdsAgreementV3RowView$$ExternalSyntheticLambda9
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i7 = 2 % 2;
                    int i8 = IAuthTabCallback + 37;
                    onWarmupCompleted = i8 % 128;
                    if (i8 % 2 == 0) {
                        TdsAgreementV3RowView.onNavigationEvent(tdsAgreementV3ColumnView, view);
                        int i9 = 44 / 0;
                    } else {
                        TdsAgreementV3RowView.onNavigationEvent(tdsAgreementV3ColumnView, view);
                    }
                    int i10 = onWarmupCompleted + 119;
                    IAuthTabCallback = i10 % 128;
                    int i11 = i10 % 2;
                }
            });
        }
        tdsAgreementV3RowView.onWarmupCompleted(IAuthTabCallback.NONE);
        tdsAgreementV3RowView.setOnClickListener(null);
        int i7 = IAuthTabCallback_Parcel + 43;
        access100 = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        List<TdsAgreementV3ColumnView> listOnWarmupCompleted = onWarmupCompleted();
        if (listOnWarmupCompleted instanceof Collection) {
            int i2 = access100 + 19;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            if (listOnWarmupCompleted.isEmpty()) {
                int i4 = IAuthTabCallback_Parcel + 21;
                access100 = i4 % 128;
                return i4 % 2 == 0;
            }
        }
        Iterator<T> it = listOnWarmupCompleted.iterator();
        while (it.hasNext()) {
            int i5 = IAuthTabCallback_Parcel + 9;
            access100 = i5 % 128;
            if (i5 % 2 != 0) {
                ((TdsAgreementV3ColumnView) it.next()).onExtraCallback();
                throw null;
            }
            if (!((TdsAgreementV3ColumnView) it.next()).onExtraCallback()) {
                int i6 = IAuthTabCallback_Parcel + 61;
                access100 = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
        }
        return true;
    }

    public final List<TdsAgreementV3ColumnView> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = access100 + 17;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        ArrayList<TdsAgreementV3ColumnView> arrayList = this.asInterface;
        int i5 = i3 + 67;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return arrayList;
    }

    public static /* synthetic */ void setCenterText$default(TdsAgreementV3RowView tdsAgreementV3RowView, CharSequence charSequence, loadlambda0 loadlambda0Var, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 29;
        int i4 = i3 % 128;
        access100 = i4;
        int i5 = i3 % 2;
        if ((i & 2) != 0) {
            int i6 = i4 + 31;
            IAuthTabCallback_Parcel = i6 % 128;
            if (i6 % 2 == 0) {
                loadlambda0 loadlambda0Var2 = loadlambda0.NONE;
                throw null;
            }
            loadlambda0Var = loadlambda0.NONE;
        }
        tdsAgreementV3RowView.setCenterText(charSequence, loadlambda0Var);
        int i7 = access100 + 45;
        IAuthTabCallback_Parcel = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    public final void setCenterText(@Nullable CharSequence charSequence, @NotNull loadlambda0 loadlambda0Var) {
        int i = 2 % 2;
        int i2 = access100 + 33;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(loadlambda0Var, "");
            this.IAuthTabCallback = charSequence;
            throw null;
        }
        Intrinsics.checkNotNullParameter(loadlambda0Var, "");
        this.IAuthTabCallback = charSequence;
        if (charSequence != null) {
            setRow(this.onExtraCallback, charSequence, this.asBinder, loadlambda0Var);
            int i3 = IAuthTabCallback_Parcel + 93;
            access100 = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    private static final void onTransact(Function1 function1, View view) {
        int i = 2 % 2;
        int i2 = access100 + 69;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(view);
        if (i3 == 0) {
            int i4 = 83 / 0;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        TdsAgreementV3RowView tdsAgreementV3RowView = (TdsAgreementV3RowView) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 57;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        CharSequence charSequence = null;
        CharSequence charSequence2 = tdsAgreementV3RowView.IAuthTabCallback;
        if (i3 == 0) {
            throw null;
        }
        if (charSequence2 != null && charSequence2.length() != 0) {
            charSequence = charSequence2;
        }
        if (charSequence == null) {
            charSequence = _UrlKt.FRAGMENT_ENCODE_SET;
            int i4 = access100 + 73;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
        }
        return String.valueOf(charSequence);
    }

    private static final void asBinder(Function1 function1, View view) {
        int i = 2 % 2;
        int i2 = access100 + 41;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(view);
        if (i3 == 0) {
            throw null;
        }
        int i4 = IAuthTabCallback_Parcel + 123;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setRightLink(@Nullable CharSequence charSequence, @NotNull Function1<? super View, Unit> function1) {
        int i = 2 % 2;
        int i2 = access100 + 5;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        onWarmupCompleted(IAuthTabCallback.HYPERLINK);
        this.onExtraCallbackWithResult.onNavigationEvent.setVisibility(0);
        this.onExtraCallbackWithResult.onNavigationEvent.setContentDescription(onExtraCallback());
        Typography7 typography7 = this.onExtraCallbackWithResult.onTransact;
        Intrinsics.checkNotNullExpressionValue(typography7, "");
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(typography7, varyMatches.onNavigationEvent(4, displayMetrics));
        onWarmupCompleted(charSequence);
        if (!this.asBinder) {
            setOnClickListener(new TdsAgreementV3RowView$.ExternalSyntheticLambda3(function1));
            int i4 = access100 + 21;
            IAuthTabCallback_Parcel = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.onExtraCallbackWithResult.onExtraCallbackWithResult.setOnClickListener(new TdsAgreementV3RowView$.ExternalSyntheticLambda1(function1));
        ConstraintLayout constraintLayout = this.onExtraCallbackWithResult.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        setProtocolsokhttp.onWarmupCompleted(constraintLayout, new TdsAgreementV3RowView$.ExternalSyntheticLambda2(this));
        int i5 = access100 + 25;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final TdsAgreementV3ColumnView onExtraCallback(View view) {
        int i = 2 % 2;
        int i2 = access100 + 53;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (!(view instanceof TdsAgreementV3ColumnView)) {
            return null;
        }
        TdsAgreementV3ColumnView tdsAgreementV3ColumnView = (TdsAgreementV3ColumnView) view;
        int i4 = IAuthTabCallback_Parcel + 39;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return tdsAgreementV3ColumnView;
    }

    private final CharSequence onExtraCallback() {
        int i = 2 % 2;
        ConstraintLayout constraintLayout = this.onExtraCallbackWithResult.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        TdsAgreementV3ColumnView tdsAgreementV3ColumnView = (TdsAgreementV3ColumnView) ensureCausesIsMutable.onMessageChannelReady(ensureCausesIsMutable.onActivityResized(ensureCausesIsMutable.extraCallback(EasingFunctionsKtExternalSyntheticLambda4.onWarmupCompleted(constraintLayout), new TdsAgreementV3RowView$.ExternalSyntheticLambda4())));
        if (tdsAgreementV3ColumnView != null) {
            int i2 = IAuthTabCallback_Parcel + 83;
            access100 = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                BaseTextView baseTextViewOnNavigationEvent = tdsAgreementV3ColumnView.onNavigationEvent();
                if (baseTextViewOnNavigationEvent != null) {
                    int i3 = IAuthTabCallback_Parcel + Imgproc.COLOR_YUV2RGBA_YVYU;
                    access100 = i3 % 128;
                    int i4 = i3 % 2;
                    CharSequence text = baseTextViewOnNavigationEvent.getText();
                    if (text != null) {
                        int i5 = access100 + 55;
                        IAuthTabCallback_Parcel = i5 % 128;
                        if (i5 % 2 != 0) {
                            return text;
                        }
                        throw null;
                    }
                }
            } else {
                tdsAgreementV3ColumnView.onNavigationEvent();
                obj.hashCode();
                throw null;
            }
        }
        return _UrlKt.FRAGMENT_ENCODE_SET;
    }

    public static /* synthetic */ void setRightAccordion$default(TdsAgreementV3RowView tdsAgreementV3RowView, CharSequence charSequence, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = access100;
        int i4 = i3 + 1;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            int i5 = i3 + 17;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            charSequence = null;
        }
        tdsAgreementV3RowView.setRightAccordion(charSequence, function1);
        int i7 = access100 + 11;
        IAuthTabCallback_Parcel = i7 % 128;
        int i8 = i7 % 2;
    }

    private static final void onWarmupCompleted(Function1 function1, View view) {
        int i = 2 % 2;
        int i2 = access100 + 37;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(view);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = access100 + 87;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void IAuthTabCallbackDefault(Function1 function1, View view) {
        int i = 2 % 2;
        int i2 = access100 + 43;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(view);
        if (i3 == 0) {
            int i4 = 26 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setRightAccordion(@Nullable CharSequence charSequence, @NotNull Function1<? super View, Unit> function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 93;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        onWarmupCompleted(IAuthTabCallback.ACCORDION);
        this.onExtraCallbackWithResult.onNavigationEvent.setVisibility(0);
        Typography7 typography7 = this.onExtraCallbackWithResult.onTransact;
        Intrinsics.checkNotNullExpressionValue(typography7, "");
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(typography7, varyMatches.onNavigationEvent(4, displayMetrics));
        onWarmupCompleted(charSequence);
        if (!this.asBinder) {
            setOnClickListener(new TdsAgreementV3RowView$.ExternalSyntheticLambda7(function1));
            return;
        }
        this.onExtraCallbackWithResult.onExtraCallbackWithResult.setOnClickListener(new TdsAgreementV3RowView$.ExternalSyntheticLambda6(function1));
        int i4 = access100 + 9;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setRightTag(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = access100 + 91;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(IAuthTabCallback.TAG);
        this.onExtraCallbackWithResult.onNavigationEvent.setVisibility(8);
        Typography7 typography7 = this.onExtraCallbackWithResult.onTransact;
        Intrinsics.checkNotNullExpressionValue(typography7, "");
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(typography7, varyMatches.onNavigationEvent(8, displayMetrics));
        onWarmupCompleted(charSequence);
        int i4 = IAuthTabCallback_Parcel + 111;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setCollapsed$uikit_release(boolean z, boolean z2) {
        CharSequence text;
        int i;
        BaseTextView baseTextViewOnNavigationEvent;
        int i2 = 2 % 2;
        onWarmupCompleted(z ? 90.0f : -90.0f, z2);
        TdsImageView tdsImageView = this.onExtraCallbackWithResult.onNavigationEvent;
        Context context = getContext();
        int i3 = im.toss.uikit.R.string.agreement_v3_row_right_arrow_detail_text;
        TdsAgreementV3ColumnView tdsAgreementV3ColumnViewOnNavigationEvent = onNavigationEvent();
        if (tdsAgreementV3ColumnViewOnNavigationEvent == null || (baseTextViewOnNavigationEvent = tdsAgreementV3ColumnViewOnNavigationEvent.onNavigationEvent()) == null) {
            text = null;
        } else {
            text = baseTextViewOnNavigationEvent.getText();
            int i4 = IAuthTabCallback_Parcel + 111;
            access100 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 / 5;
            }
        }
        tdsImageView.setContentDescription(context.getString(i3, text));
        if (z) {
            int i6 = access100;
            int i7 = i6 + 13;
            IAuthTabCallback_Parcel = i7 % 128;
            int i8 = i7 % 2;
            i = this.IAuthTabCallbackDefault;
            int i9 = i6 + 113;
            IAuthTabCallback_Parcel = i9 % 128;
            int i10 = i9 % 2;
        } else {
            i = this.IAuthTabCallbackStub;
        }
        this.onExtraCallbackWithResult.onNavigationEvent.setColorFilter(i);
        if (!this.asBinder) {
            IAuthTabCallback((View) this, !z);
            return;
        }
        int i11 = access100 + 67;
        IAuthTabCallback_Parcel = i11 % 128;
        ConstraintLayout constraintLayout = i11 % 2 == 0 ? this.onExtraCallbackWithResult.onExtraCallbackWithResult : this.onExtraCallbackWithResult.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        IAuthTabCallback((View) constraintLayout, !z);
    }

    public static final class IAuthTabCallbackStub extends View.AccessibilityDelegate {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ boolean onExtraCallbackWithResult;
        final /* synthetic */ View onWarmupCompleted;

        IAuthTabCallbackStub(View view, boolean z) {
            this.onWarmupCompleted = view;
            this.onExtraCallbackWithResult = z;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 101;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            if (i == 262144 || i == 524288) {
                this.onWarmupCompleted.performClick();
                int i5 = onExtraCallback + 61;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
            }
            return super.performAccessibilityAction(view, i, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(accessibilityNodeInfo, "");
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(Button.class.getName());
            if (this.onExtraCallbackWithResult) {
                int i2 = IAuthTabCallback + 5;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_COLLAPSE);
                    return;
                } else {
                    accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_COLLAPSE);
                    int i3 = 72 / 0;
                    return;
                }
            }
            if (this.onWarmupCompleted.isSelected()) {
                accessibilityNodeInfo.setSelected(false);
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_COLLAPSE);
            } else {
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_EXPAND);
                int i4 = IAuthTabCallback + 109;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
            }
        }
    }

    private final void IAuthTabCallback(View view, boolean z) {
        int i = 2 % 2;
        view.setAccessibilityDelegate(new IAuthTabCallbackStub(view, z));
        int i2 = access100 + 125;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 2 / 0;
        }
    }

    public final void onWarmupCompleted(float f, boolean z) {
        long j;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 5;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        ValueAnimator valueAnimator = this.onNavigationEvent;
        if (valueAnimator != null) {
            int i5 = i2 + 107;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            valueAnimator.cancel();
            int i7 = access100 + 123;
            IAuthTabCallback_Parcel = i7 % 128;
            int i8 = i7 % 2;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.onExtraCallbackWithResult.onNavigationEvent.getRotation(), f);
        valueAnimatorOfFloat.addUpdateListener(new TdsAgreementV3RowView$.ExternalSyntheticLambda5(this));
        if (z) {
            int i9 = IAuthTabCallback_Parcel + 111;
            access100 = i9 % 128;
            int i10 = i9 % 2;
            j = 200;
        } else {
            int i11 = IAuthTabCallback_Parcel + 125;
            access100 = i11 % 128;
            int i12 = i11 % 2;
            j = 0;
        }
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.start();
        this.onNavigationEvent = valueAnimatorOfFloat;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        TdsAgreementV3RowView tdsAgreementV3RowView = (TdsAgreementV3RowView) objArr[0];
        ValueAnimator valueAnimator = (ValueAnimator) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 65;
        access100 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "");
            tdsAgreementV3RowView.onExtraCallbackWithResult.onNavigationEvent.setRotation(((Float) animatedValue).floatValue());
            return null;
        }
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue2, "");
        tdsAgreementV3RowView.onExtraCallbackWithResult.onNavigationEvent.setRotation(((Float) animatedValue2).floatValue());
        obj.hashCode();
        throw null;
    }

    public final void setRightTextColor(int i) {
        int i2 = 2 % 2;
        int i3 = access100 + 77;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Typography7 typography7 = this.onExtraCallbackWithResult.onTransact;
        if (i4 != 0) {
            typography7.setTextColor(i);
        } else {
            typography7.setTextColor(i);
            throw null;
        }
    }

    static /* synthetic */ TdsAgreementV3ColumnView onExtraCallback(TdsAgreementV3RowView tdsAgreementV3RowView, TdsAgreementV3ColumnView.onExtraCallbackWithResult onextracallbackwithresult, CharSequence charSequence, boolean z, loadlambda0 loadlambda0Var, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 83;
        access100 = i3 % 128;
        if (i3 % 2 == 0 ? (i & 8) != 0 : (i & 24) != 0) {
            loadlambda0Var = loadlambda0.NONE;
            int i4 = IAuthTabCallback_Parcel + 125;
            access100 = i4 % 128;
            int i5 = i4 % 2;
        }
        Object[] objArr = {tdsAgreementV3RowView, onextracallbackwithresult, charSequence, Boolean.valueOf(z), loadlambda0Var};
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        TdsAgreementV3ColumnView tdsAgreementV3ColumnView = (TdsAgreementV3ColumnView) onWarmupCompleted(1272731790, -1272731790, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), objArr, iOnExtraCallback2);
        int i6 = access100 + 55;
        IAuthTabCallback_Parcel = i6 % 128;
        if (i6 % 2 != 0) {
            return tdsAgreementV3ColumnView;
        }
        throw null;
    }

    static final class asInterface implements Runnable {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        asInterface() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 37;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            TdsAgreementV3RowView tdsAgreementV3RowView = TdsAgreementV3RowView.this;
            TdsAgreementV3RowView.onExtraCallbackWithResult(tdsAgreementV3RowView, TdsAgreementV3RowView.IAuthTabCallback(tdsAgreementV3RowView));
            int i4 = onWarmupCompleted + 19;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private final void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 27;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        this.asInterface.clear();
        ConstraintLayout constraintLayout = this.onExtraCallbackWithResult.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        Iterator itIAuthTabCallback = clearProcessUptime.onExtraCallback((Sequence<?>) EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback(constraintLayout), TdsAgreementV3ColumnView.class).IAuthTabCallback();
        while (itIAuthTabCallback.hasNext()) {
            int i4 = IAuthTabCallback_Parcel + 79;
            access100 = i4 % 128;
            if (i4 % 2 != 0) {
                this.onExtraCallbackWithResult.IAuthTabCallback.removeView((TdsAgreementV3ColumnView) itIAuthTabCallback.next());
                int i5 = 51 / 0;
            } else {
                this.onExtraCallbackWithResult.IAuthTabCallback.removeView((TdsAgreementV3ColumnView) itIAuthTabCallback.next());
            }
        }
    }

    private final void onWarmupCompleted(IAuthTabCallback iAuthTabCallback) {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 7;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        ConstraintLayout constraintLayout = this.onExtraCallbackWithResult.onExtraCallbackWithResult;
        if (iAuthTabCallback != IAuthTabCallback.NONE) {
            int i5 = access100 + 51;
            int i6 = i5 % 128;
            IAuthTabCallback_Parcel = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 77;
            access100 = i8 % 128;
            int i9 = i8 % 2;
            i = 0;
        } else {
            i = 8;
        }
        constraintLayout.setVisibility(i);
        int i10 = access100 + 53;
        IAuthTabCallback_Parcel = i10 % 128;
        int i11 = i10 % 2;
    }

    private final void onWarmupCompleted(CharSequence charSequence) {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 15;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            this.onExtraCallbackWithResult.onTransact.setText(charSequence);
            Typography7 typography7 = this.onExtraCallbackWithResult.onTransact;
            if (charSequence == null || charSequence.length() == 0) {
                int i4 = IAuthTabCallback_Parcel + 71;
                access100 = i4 % 128;
                int i5 = i4 % 2;
                i = 8;
            } else {
                i = 0;
            }
            typography7.setVisibility(i);
            return;
        }
        this.onExtraCallbackWithResult.onTransact.setText(charSequence);
        Typography7 typography72 = this.onExtraCallbackWithResult.onTransact;
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallback(List<TdsAgreementV3ColumnView> list) {
        int i = 2 % 2;
        if (list.isEmpty()) {
            return;
        }
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(Float.valueOf(24.0f), displayMetrics);
        List<TdsAgreementV3ColumnView> list2 = list;
        Iterator<T> it = list2.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        int measuredWidth = ((TdsAgreementV3ColumnView) it.next()).getMeasuredWidth();
        int i2 = IAuthTabCallback_Parcel + 107;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        while (it.hasNext()) {
            int i4 = access100 + 7;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            int measuredWidth2 = ((TdsAgreementV3ColumnView) it.next()).getMeasuredWidth();
            if (measuredWidth < measuredWidth2) {
                measuredWidth = measuredWidth2;
            }
        }
        float f = measuredWidth;
        float measuredWidth3 = this.onExtraCallbackWithResult.IAuthTabCallback.getMeasuredWidth() / f;
        Integer numValueOf = Integer.valueOf((int) measuredWidth3);
        if (numValueOf.intValue() <= 0) {
            int i6 = access100 + 125;
            IAuthTabCallback_Parcel = i6 % 128;
            int i7 = i6 % 2;
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 1;
        if (iIntValue > 1 && f * (measuredWidth3 - iIntValue) < iOnNavigationEvent) {
            iIntValue--;
        }
        int iMin = Math.min(list.size(), iIntValue);
        List<ConstraintLayout> listTake = CollectionsKt___CollectionsKt.take(list2, iMin);
        for (ConstraintLayout constraintLayout : listTake) {
            constraintLayout.getLayoutParams().width = (this.onExtraCallbackWithResult.IAuthTabCallback.getMeasuredWidth() - ((iMin - 1) * iOnNavigationEvent)) / iMin;
            constraintLayout.requestLayout();
        }
        IAuthTabCallback((List<TdsAgreementV3ColumnView>) CollectionsKt___CollectionsKt.drop(list2, listTake.size()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View, androidx.constraintlayout.widget.ConstraintLayout, im.toss.uikit.widget.list.agreements.v3.TdsAgreementV3ColumnView] */
    private final TdsAgreementV3ColumnView onNavigationEvent(TdsAgreementV3ColumnView.onExtraCallbackWithResult onextracallbackwithresult, CharSequence charSequence, boolean z, loadlambda0 loadlambda0Var) {
        int i = 2 % 2;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ?? tdsAgreementV3ColumnView = new TdsAgreementV3ColumnView(context, null, 0, 6, null);
        tdsAgreementV3ColumnView.setId(View.generateViewId());
        tdsAgreementV3ColumnView.setLayoutParams(new ConstraintLayout.onExtraCallbackWithResult(-2, -2));
        tdsAgreementV3ColumnView.setType(onextracallbackwithresult);
        tdsAgreementV3ColumnView.setPrefix(loadlambda0Var);
        tdsAgreementV3ColumnView.setTitle(charSequence);
        tdsAgreementV3ColumnView.setCheckable(z);
        int i2 = IAuthTabCallback_Parcel + 45;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return tdsAgreementV3ColumnView;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0084 A[PHI: r3
      0x0084: PHI (r3v16 ??) = (r3v19 ??), (r3v20 ??) binds: [B:15:0x0082, B:12:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r13v2, types: [android.view.ViewGroup, im.toss.uikit.widget.list.agreements.v3.TdsAgreementV3RowView, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [android.view.View, im.toss.uikit.widget.list.agreements.v3.TdsAgreementV3ColumnView] */
    /* JADX WARN: Type inference failed for: r3v12, types: [android.view.View, im.toss.uikit.widget.list.agreements.v3.TdsAgreementV3ColumnView] */
    /* JADX WARN: Type inference failed for: r3v16, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r3v18, types: [android.view.View, im.toss.uikit.widget.list.agreements.v3.TdsAgreementV3ColumnView] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        ?? r3;
        ?? r13 = (TdsAgreementV3RowView) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 21;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        List listOnRelationshipValidationResult = ensureCausesIsMutable.onRelationshipValidationResult(clearProcessUptime.onExtraCallback((Sequence<?>) EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback((ViewGroup) r13), TdsAgreementV3ColumnView.class));
        Object obj = null;
        if (listOnRelationshipValidationResult.size() > 1) {
            int i4 = IAuthTabCallback_Parcel + 57;
            access100 = i4 % 128;
            if (i4 % 2 == 0) {
                int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
                int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
                int iOnExtraCallback3 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
                onWarmupCompleted(-1639111576, 1639111579, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback, iOnExtraCallback3, new Object[]{r13, listOnRelationshipValidationResult}, iOnExtraCallback2);
                Iterator it = listOnRelationshipValidationResult.iterator();
                while (it.hasNext()) {
                    int i5 = IAuthTabCallback_Parcel + 91;
                    access100 = i5 % 128;
                    if (i5 % 2 != 0) {
                        r3 = (TdsAgreementV3ColumnView) it.next();
                        int id = r3.getId();
                        int i6 = 23 / 0;
                        r3 = r3;
                        if (id == -1) {
                            int i7 = access100 + 81;
                            IAuthTabCallback_Parcel = i7 % 128;
                            if (i7 % 2 == 0) {
                                r3.setId(View.generateViewId());
                                int i8 = 38 / 0;
                            } else {
                                r3.setId(View.generateViewId());
                            }
                        }
                    } else {
                        r3 = (TdsAgreementV3ColumnView) it.next();
                        int id2 = r3.getId();
                        r3 = r3;
                        if (id2 == -1) {
                        }
                    }
                    r13.removeViewInLayout(r3);
                    r13.onExtraCallbackWithResult(r3);
                    int i9 = access100 + 79;
                    IAuthTabCallback_Parcel = i9 % 128;
                    int i10 = i9 % 2;
                }
            } else {
                int iOnExtraCallback4 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
                int iOnExtraCallback5 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
                int iOnExtraCallback6 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
                onWarmupCompleted(-1639111576, 1639111579, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback4, iOnExtraCallback6, new Object[]{r13, listOnRelationshipValidationResult}, iOnExtraCallback5);
                listOnRelationshipValidationResult.iterator();
                obj.hashCode();
                throw null;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onFinishInflate() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 7;
        access100 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
            int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
            int iOnExtraCallback3 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
            onWarmupCompleted(-1125460273, 1125460277, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback, iOnExtraCallback3, new Object[]{this}, iOnExtraCallback2);
            super/*android.view.View*/.onFinishInflate();
            int i3 = IAuthTabCallback_Parcel + 39;
            access100 = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        int iOnExtraCallback4 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback5 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback6 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        onWarmupCompleted(-1125460273, 1125460277, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback4, iOnExtraCallback6, new Object[]{this}, iOnExtraCallback5);
        super/*android.view.View*/.onFinishInflate();
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addView(@Nullable View view, int i, @Nullable ViewGroup.LayoutParams layoutParams) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 13;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        super/*android.view.ViewGroup*/.addView(view, i, layoutParams);
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback3 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        onWarmupCompleted(-1125460273, 1125460277, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback, iOnExtraCallback3, new Object[]{this}, iOnExtraCallback2);
        int i5 = access100 + 45;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void removeView(@Nullable View view) {
        int i = 2 % 2;
        int i2 = access100 + 99;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super/*android.view.ViewGroup*/.removeView(view);
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback3 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        onWarmupCompleted(-1125460273, 1125460277, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback, iOnExtraCallback3, new Object[]{this}, iOnExtraCallback2);
        int i4 = IAuthTabCallback_Parcel + 101;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        Object obj = null;
        if (hasOnClickListeners()) {
            int i2 = IAuthTabCallback_Parcel + 37;
            access100 = i2 % 128;
            if (i2 % 2 != 0) {
                this.IAuthTabCallbackStubProxy.onNavigationEvent(motionEvent);
                obj.hashCode();
                throw null;
            }
            this.IAuthTabCallbackStubProxy.onNavigationEvent(motionEvent);
        }
        boolean zOnTouchEvent = super/*android.view.View*/.onTouchEvent(motionEvent);
        int i3 = IAuthTabCallback_Parcel + 109;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            return zOnTouchEvent;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setPressed(boolean z) {
        int i = 2 % 2;
        super/*android.view.View*/.setPressed(z);
        if (!(!hasOnClickListeners())) {
            int i2 = IAuthTabCallback_Parcel + 111;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            this.IAuthTabCallbackStubProxy.onNavigationEvent(z);
        }
        int i4 = access100 + 3;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + Imgproc.COLOR_YUV2RGB_YVYU;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super/*android.view.View*/.setOnClickListener(onClickListener);
        if (onClickListener != null) {
            int i4 = IAuthTabCallback_Parcel;
            int i5 = i4 + 47;
            access100 = i5 % 128;
            z = i5 % 2 == 0;
            int i6 = i4 + 73;
            access100 = i6 % 128;
            int i7 = i6 % 2;
        }
        setClickable(z);
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setRow(@NotNull TdsAgreementV3ColumnView.onExtraCallbackWithResult onextracallbackwithresult, @NotNull CharSequence charSequence, boolean z, @NotNull loadlambda0 loadlambda0Var) {
        int iOnNavigationEvent;
        DisplayMetrics displayMetrics;
        int i;
        TdsCheckBoxV2View tdsCheckBoxV2ViewOnWarmupCompleted;
        TdsCheckBoxV2View tdsCheckBoxV2ViewOnWarmupCompleted2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(loadlambda0Var, "");
        onExtraCallbackWithResult();
        Object[] objArr = {this, onextracallbackwithresult, charSequence, Boolean.valueOf(z), loadlambda0Var};
        TdsAgreementV3ColumnView tdsAgreementV3ColumnView = (TdsAgreementV3ColumnView) onWarmupCompleted(1272731790, -1272731790, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), objArr, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback());
        Object obj = null;
        if (z) {
            int i3 = IAuthTabCallback_Parcel + 23;
            access100 = i3 % 128;
            if (i3 % 2 != 0) {
                onNavigationEvent();
                obj.hashCode();
                throw null;
            }
            TdsAgreementV3ColumnView tdsAgreementV3ColumnViewOnNavigationEvent = onNavigationEvent();
            if (tdsAgreementV3ColumnViewOnNavigationEvent != null && (tdsCheckBoxV2ViewOnWarmupCompleted2 = tdsAgreementV3ColumnViewOnNavigationEvent.onWarmupCompleted()) != null) {
                String string = getContext().getString(im.toss.uikit.R.string.uikit_agreement_row_checked);
                Intrinsics.checkNotNullExpressionValue(string, "");
                String string2 = getContext().getString(im.toss.uikit.R.string.uikit_agreement_row_unchecked);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                tdsCheckBoxV2ViewOnWarmupCompleted2.setStateDescription(string, string2);
            }
            TdsAgreementV3ColumnView tdsAgreementV3ColumnViewOnNavigationEvent2 = onNavigationEvent();
            if (tdsAgreementV3ColumnViewOnNavigationEvent2 != null && (tdsCheckBoxV2ViewOnWarmupCompleted = tdsAgreementV3ColumnViewOnNavigationEvent2.onWarmupCompleted()) != null) {
                tdsCheckBoxV2ViewOnWarmupCompleted.setClickable(false);
            }
            setOnClickListener(new TdsAgreementV3RowView$.ExternalSyntheticLambda0(tdsAgreementV3ColumnView));
        } else {
            setOnClickListener(null);
        }
        float fIAuthTabCallback = tdsAgreementV3ColumnView.IAuthTabCallback();
        DisplayMetrics displayMetrics2 = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        float fFloatValue = ((Float) varyMatches.onNavigationEvent(1845166571, -1845166568, new Object[]{Float.valueOf(fIAuthTabCallback), displayMetrics2}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback())).floatValue();
        if (41.0f <= fFloatValue && fFloatValue <= Float.MAX_VALUE) {
            int i4 = IAuthTabCallback_Parcel + 45;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            DisplayMetrics displayMetrics3 = getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
            iOnNavigationEvent = varyMatches.onNavigationEvent(44, displayMetrics3);
        } else if (35.0f <= fFloatValue && fFloatValue <= 41.0f) {
            DisplayMetrics displayMetrics4 = getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
            iOnNavigationEvent = varyMatches.onNavigationEvent(40, displayMetrics4);
        } else if (29.0f <= fFloatValue) {
            int i6 = access100;
            int i7 = i6 + 37;
            IAuthTabCallback_Parcel = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 85 / 0;
                if (fFloatValue <= 35.0f) {
                    int i9 = i6 + 45;
                    IAuthTabCallback_Parcel = i9 % 128;
                    int i10 = i9 % 2;
                    DisplayMetrics displayMetrics5 = getContext().getResources().getDisplayMetrics();
                    Intrinsics.checkNotNullExpressionValue(displayMetrics5, "");
                    iOnNavigationEvent = varyMatches.onNavigationEvent(36, displayMetrics5);
                } else if (23.0f <= fFloatValue) {
                    int i11 = IAuthTabCallback_Parcel + 89;
                    access100 = i11 % 128;
                    if (i11 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (fFloatValue <= 29.0f) {
                        DisplayMetrics displayMetrics6 = getContext().getResources().getDisplayMetrics();
                        Intrinsics.checkNotNullExpressionValue(displayMetrics6, "");
                        iOnNavigationEvent = varyMatches.onNavigationEvent(34, displayMetrics6);
                    } else if (19.0f <= fFloatValue && fFloatValue <= 23.0f) {
                        int i12 = access100 + 83;
                        IAuthTabCallback_Parcel = i12 % 128;
                        if (i12 % 2 == 0) {
                            displayMetrics = getContext().getResources().getDisplayMetrics();
                            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                            i = 37;
                        } else {
                            displayMetrics = getContext().getResources().getDisplayMetrics();
                            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                            i = 28;
                        }
                        iOnNavigationEvent = varyMatches.onNavigationEvent(Integer.valueOf(i), displayMetrics);
                    } else if (16.0f > fFloatValue || fFloatValue > 19.0f) {
                        DisplayMetrics displayMetrics7 = getContext().getResources().getDisplayMetrics();
                        Intrinsics.checkNotNullExpressionValue(displayMetrics7, "");
                        iOnNavigationEvent = varyMatches.onNavigationEvent(24, displayMetrics7);
                    } else {
                        DisplayMetrics displayMetrics8 = getContext().getResources().getDisplayMetrics();
                        Intrinsics.checkNotNullExpressionValue(displayMetrics8, "");
                        iOnNavigationEvent = varyMatches.onNavigationEvent(26, displayMetrics8);
                    }
                }
            } else if (fFloatValue <= 35.0f) {
            }
        }
        TdsImageView tdsImageView = this.onExtraCallbackWithResult.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        ViewGroup.LayoutParams layoutParams = tdsImageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = iOnNavigationEvent;
        layoutParams.height = iOnNavigationEvent;
        tdsImageView.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult(TdsAgreementV3ColumnView tdsAgreementV3ColumnView) {
        int i = 2 % 2;
        int i2 = access100 + 15;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallbackWithResult.IAuthTabCallback.addView(tdsAgreementV3ColumnView);
        this.onExtraCallbackWithResult.onExtraCallback.onExtraCallbackWithResult(tdsAgreementV3ColumnView);
        this.asInterface.add(tdsAgreementV3ColumnView);
        if (isLaidOut() && !isLayoutRequested()) {
            post(new asInterface());
            return;
        }
        addOnLayoutChangeListener(new onWarmupCompleted());
        int i4 = access100 + 51;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005f, code lost:
    
        if ((r6 % 2) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
    
        r6 = 29 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0065, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006d, code lost:
    
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        if (r3 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        if (r3 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        r4 = getContext().getResources().getDisplayMetrics();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, "");
        r3.width = o.varyMatches.onNavigationEvent(java.lang.Float.valueOf((r6 * 16.0f) + 24.0f), r4);
        r1.setLayoutParams(r3);
        r6 = im.toss.uikit.widget.list.agreements.v3.TdsAgreementV3RowView.IAuthTabCallback_Parcel + 103;
        im.toss.uikit.widget.list.agreements.v3.TdsAgreementV3RowView.access100 = r6 % 128;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setIndent(int i) {
        TdsSpace tdsSpace;
        ViewGroup.LayoutParams layoutParams;
        int i2 = 2 % 2;
        int i3 = access100 + 25;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            this.onTransact = i;
            tdsSpace = this.onExtraCallbackWithResult.IAuthTabCallbackStub;
            Intrinsics.checkNotNullExpressionValue(tdsSpace, "");
            layoutParams = tdsSpace.getLayoutParams();
            int i4 = 95 / 0;
        } else {
            this.onTransact = i;
            tdsSpace = this.onExtraCallbackWithResult.IAuthTabCallbackStub;
            Intrinsics.checkNotNullExpressionValue(tdsSpace, "");
            layoutParams = tdsSpace.getLayoutParams();
        }
    }

    public static /* synthetic */ void onExtraCallbackWithResult(TdsAgreementV3RowView tdsAgreementV3RowView, ValueAnimator valueAnimator) {
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback3 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        onWarmupCompleted(792830807, -792830806, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback, iOnExtraCallback3, new Object[]{tdsAgreementV3RowView, valueAnimator}, iOnExtraCallback2);
    }

    public static /* synthetic */ void onWarmupCompleted(TdsAgreementV3ColumnView tdsAgreementV3ColumnView, View view) {
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback3 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        onWarmupCompleted(-1070660685, 1070660687, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback, iOnExtraCallback3, new Object[]{tdsAgreementV3ColumnView, view}, iOnExtraCallback2);
    }

    private final TdsAgreementV3ColumnView onWarmupCompleted(TdsAgreementV3ColumnView.onExtraCallbackWithResult onextracallbackwithresult, CharSequence charSequence, boolean z, loadlambda0 loadlambda0Var) {
        Object[] objArr = {this, onextracallbackwithresult, charSequence, Boolean.valueOf(z), loadlambda0Var};
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        return (TdsAgreementV3ColumnView) onWarmupCompleted(1272731790, -1272731790, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), objArr, iOnExtraCallback2);
    }

    private static final void onExtraCallback(TdsAgreementV3RowView tdsAgreementV3RowView, ValueAnimator valueAnimator) {
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback3 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        onWarmupCompleted(1731246131, -1731246125, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback, iOnExtraCallback3, new Object[]{tdsAgreementV3RowView, valueAnimator}, iOnExtraCallback2);
    }

    private final void onNavigationEvent(List<TdsAgreementV3ColumnView> list) {
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback3 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        onWarmupCompleted(-1639111576, 1639111579, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback, iOnExtraCallback3, new Object[]{this, list}, iOnExtraCallback2);
    }

    private static final CharSequence onWarmupCompleted(TdsAgreementV3RowView tdsAgreementV3RowView) {
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback3 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        return (CharSequence) onWarmupCompleted(-15791190, 15791195, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback, iOnExtraCallback3, new Object[]{tdsAgreementV3RowView}, iOnExtraCallback2);
    }

    private final void onTransact() {
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback3 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        onWarmupCompleted(-1125460273, 1125460277, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback, iOnExtraCallback3, new Object[]{this}, iOnExtraCallback2);
    }
}
