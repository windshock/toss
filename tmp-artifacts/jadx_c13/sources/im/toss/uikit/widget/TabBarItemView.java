package im.toss.uikit.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.SubTypography13;
import im.toss.uikit.R;
import im.toss.uikit.widget.TabBarItemView$;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import o.Address;
import o.AppLovinSdkSettings;
import o.CameraControllerExternalSyntheticLambda9;
import o.ConnectionPool;
import o.EasingFunctionsKtExternalSyntheticLambda0;
import o.M_;
import o.OkHttpClientCompanion;
import o.RecomposerKt;
import o.RequestBodyCompanion;
import o.SuspendAnimationKtExternalSyntheticLambda4;
import o.TossBundleLoader_startServiceSessionEvents;
import o.access;
import o.access15300;
import o.attachAppLovinSdk;
import o.authParams;
import o.deprecated_certificatePinner;
import o.deprecated_dns;
import o.deprecated_followRedirects;
import o.deprecated_followSslRedirects;
import o.deprecated_minFreshSeconds;
import o.eExternalSyntheticLambda0;
import o.ensureCausesIsMutable;
import o.generateInviteUrl;
import o.getExtraParameters;
import o.isFireOS;
import o.isMuted;
import o.pxToDp;
import o.response;
import o.runOnUiThreadDelayed;
import o.setProxySelectorokhttp;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TabBarItemView extends ConstraintLayout {
    private static int IAuthTabCallback_Parcel = 0;
    private static int ICustomTabsCallback = 1;
    private static int access000 = 1;
    private static int writeTypedObject;
    private runOnUiThreadDelayed IAuthTabCallback;
    private ImageView IAuthTabCallbackDefault;
    private String IAuthTabCallbackStub;
    private IAuthTabCallback IAuthTabCallbackStubProxy;
    private runOnUiThreadDelayed access100;
    private TossBundleLoader_startServiceSessionEvents asBinder;
    private boolean asInterface;
    private View getInterfaceDescriptor;
    private View onExtraCallbackWithResult;
    private TextView onTransact;
    private View onWarmupCompleted;
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    public static final int onExtraCallback = 8;
    private static final int onNavigationEvent = View.generateViewId();

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TabBarItemView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TabBarItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Object onExtraCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i6;
        int i9 = (~(i7 | i8)) | (~(i8 | i3));
        int i10 = ~((~i3) | i5 | i6);
        int i11 = i9 | i10;
        int i12 = (~(i3 | i8 | i5)) | i10;
        int i13 = i5 | i6;
        int i14 = i5 + i6 + i + ((-1865910757) * i2) + ((-1665280692) * i4);
        int i15 = i14 * i14;
        int i16 = ((i5 * (-906343980)) - 215482368) + ((-906343980) * i6) + (i11 * (-2063747539)) + (2063747539 * i12) + ((-2063747539) * i13) + (1324875776 * i) + ((-1540882432) * i2) + ((-912261120) * i4) + (1566179328 * i15);
        int i17 = (i5 * (-52584228)) + 761582770 + (i6 * (-52584228)) + (i11 * 415) + (i12 * (-415)) + (i13 * 415) + (i * (-52583813)) + (i2 * (-195242759)) + (i4 * 1657508740) + (i15 * (-834797568));
        int i18 = i16 + (i17 * i17 * 1251344384);
        return i18 != 1 ? i18 != 2 ? i18 != 3 ? onWarmupCompleted(objArr) : IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr) : onExtraCallback(objArr);
    }

    public static /* synthetic */ Unit onExtraCallback(TabBarItemView tabBarItemView, TdsImageView tdsImageView, RecomposerKt recomposerKt) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 57;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(tabBarItemView, tdsImageView, recomposerKt);
        if (i3 == 0) {
            int i4 = 65 / 0;
        }
        int i5 = IAuthTabCallback_Parcel + 17;
        access000 = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(TabBarItemView tabBarItemView) {
        int i = 2 % 2;
        int i2 = access000 + 33;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(tabBarItemView);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zIAuthTabCallback = IAuthTabCallback(tabBarItemView);
        int i3 = access000 + 71;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return zIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(TabBarItemView tabBarItemView, IAuthTabCallback iAuthTabCallback, TdsImageView tdsImageView, Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 111;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(tabBarItemView, iAuthTabCallback, tdsImageView, th);
        int i4 = access000 + 71;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onWarmupCompleted(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = access000 + Imgproc.COLOR_YUV2RGBA_YVYU;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(attachapplovinsdk);
        int i4 = access000 + 75;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TabBarItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.asInterface = true;
        Class cls = Integer.TYPE;
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.width = -2;
        layoutParams2.height = -1;
        setLayoutParams(layoutParams);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TabBarItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = IAuthTabCallback_Parcel + 31;
            access000 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 89 / 0;
            }
            int i5 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i6 = IAuthTabCallback_Parcel + 9;
            access000 = i6 % 128;
            int i7 = i6 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onNavigationEvent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onNavigationEvent[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private static int onNavigationEvent;
        private final int backgroundRes;
        public static final onNavigationEvent RED = new onNavigationEvent("RED", 0, R.drawable.shape_circle_red);
        public static final onNavigationEvent BLUE = new onNavigationEvent("BLUE", 1, R.drawable.shape_circle_blue);

        private static final /* synthetic */ onNavigationEvent[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 81;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            onNavigationEvent[] onnavigationeventArr = {RED, BLUE};
            int i5 = i3 + 17;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return onnavigationeventArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static EnumEntries<onNavigationEvent> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 71;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<onNavigationEvent> enumEntries = $ENTRIES;
            int i5 = i2 + 103;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static onNavigationEvent valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 41;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
            int i4 = onExtraCallbackWithResult + 19;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return onnavigationevent;
        }

        public static onNavigationEvent[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 13;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent[] onnavigationeventArr = $VALUES;
            if (i3 != 0) {
                return (onNavigationEvent[]) onnavigationeventArr.clone();
            }
            throw null;
        }

        private onNavigationEvent(String str, int i, int i2) {
            this.backgroundRes = i2;
        }

        public final int getBackgroundRes() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 93;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            int i5 = this.backgroundRes;
            int i6 = i3 + Imgproc.COLOR_YUV2RGBA_YVYU;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        static {
            onNavigationEvent[] onnavigationeventArr$values = $values();
            $VALUES = onnavigationeventArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
            int i = onNavigationEvent + 39;
            IAuthTabCallback = i % 128;
            if (i % 2 == 0) {
                int i2 = 58 / 0;
            }
        }
    }

    public final IAuthTabCallback onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 85;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        IAuthTabCallback iAuthTabCallback = this.IAuthTabCallbackStubProxy;
        int i5 = i3 + 115;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return iAuthTabCallback;
        }
        throw null;
    }

    public final ImageView onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 79;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallbackDefault;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setTab(@NotNull IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 45;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        removeAllViews();
        this.IAuthTabCallbackStub = null;
        onWarmupCompleted(iAuthTabCallback);
        this.IAuthTabCallbackStubProxy = iAuthTabCallback;
        setContentDescription(iAuthTabCallback.onNavigationEvent());
        int i4 = IAuthTabCallback_Parcel + 31;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onWarmupCompleted(IAuthTabCallback iAuthTabCallback) {
        float f;
        int i;
        int paddingTop;
        int i2;
        Integer numOnExtraCallbackWithResult;
        int i3 = 2 % 2;
        Float fValueOf = Float.valueOf(5.0f);
        boolean z = this.asInterface;
        Class cls = Integer.TYPE;
        if (z) {
            View view = new View(getContext());
            ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult = (ViewGroup.LayoutParams) ConstraintLayout.onExtraCallbackWithResult.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
            Intrinsics.checkNotNull(onextracallbackwithresult);
            ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult2 = onextracallbackwithresult;
            ((ViewGroup.MarginLayoutParams) onextracallbackwithresult2).width = 0;
            ((ViewGroup.MarginLayoutParams) onextracallbackwithresult2).height = 0;
            int i4 = onNavigationEvent;
            onextracallbackwithresult2.IPostMessageServiceStubProxy = i4;
            onextracallbackwithresult2.setEngagementSignalsCallback = 0;
            onextracallbackwithresult2.IEngagementSignalsCallbackStubProxy = 0;
            onextracallbackwithresult2.IAuthTabCallback = i4;
            DisplayMetrics displayMetrics = view.getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            onextracallbackwithresult2.ICustomTabsServiceDefault = varyMatches.onNavigationEvent(56, displayMetrics);
            view.setLayoutParams(onextracallbackwithresult);
            M_ m_ = M_.onExtraCallback;
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Intrinsics.checkNotNullExpressionValue(view.getContext().getResources().getDisplayMetrics(), "");
            view.setBackground((deprecated_minFreshSeconds) M_.onNavigationEvent(-556734050, new Object[]{m_, context, Float.valueOf(varyMatches.onNavigationEvent(16, r14))}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 556734051, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent()));
            view.setDuplicateParentStateEnabled(true);
            setProxySelectorokhttp.onExtraCallbackWithResult(this, view);
            this.getInterfaceDescriptor = view;
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        LinearLayout linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(1);
        int i5 = onNavigationEvent;
        linearLayout.setId(i5);
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult3 = (ViewGroup.LayoutParams) ConstraintLayout.onExtraCallbackWithResult.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(onextracallbackwithresult3);
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult4 = onextracallbackwithresult3;
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult4).width = 0;
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult4).height = -2;
        onextracallbackwithresult4.IPostMessageServiceStubProxy = 0;
        onextracallbackwithresult4.setEngagementSignalsCallback = 0;
        onextracallbackwithresult4.IEngagementSignalsCallbackStubProxy = 0;
        onextracallbackwithresult4.IAuthTabCallback = 0;
        linearLayout.setLayoutParams(onextracallbackwithresult3);
        linearLayout.setGravity(17);
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        TdsImageView tdsImageView = new TdsImageView(context3, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        DisplayMetrics displayMetrics2 = tdsImageView.getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(Float.valueOf(24.0f), displayMetrics2);
        layoutParams2.width = iOnNavigationEvent;
        layoutParams2.height = iOnNavigationEvent;
        tdsImageView.setLayoutParams(layoutParams);
        tdsImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        IAuthTabCallback(tdsImageView, iAuthTabCallback, isSelected());
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsImageView);
        this.IAuthTabCallbackDefault = tdsImageView;
        BaseTextView baseTextView = (BaseTextView) SubTypography13.class.getDeclaredConstructor(Context.class).newInstance(linearLayout.getContext());
        Intrinsics.checkNotNull(baseTextView);
        ViewGroup.LayoutParams layoutParams3 = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams3);
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
        layoutParams4.width = -2;
        layoutParams4.height = -2;
        DisplayMetrics displayMetrics3 = baseTextView.getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
        layoutParams4.topMargin = varyMatches.onNavigationEvent(3, displayMetrics3);
        baseTextView.setLayoutParams(layoutParams3);
        baseTextView.setGravity(17);
        baseTextView.setSingleLine();
        baseTextView.setEllipsize(TextUtils.TruncateAt.END);
        baseTextView.onNavigationEvent(response.Medium);
        baseTextView.onWarmupCompleted(varyMatches.onNavigationEvent(baseTextView, 13));
        baseTextView.onExtraCallbackWithResult(ConnectionPool.onWarmupCompleted.onWarmupCompleted());
        Context context4 = baseTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        Resources resources = context4.getResources();
        Object obj = null;
        if (resources != null) {
            int i6 = access000 + 67;
            IAuthTabCallback_Parcel = i6 % 128;
            int i7 = i6 % 2;
            Configuration configuration = resources.getConfiguration();
            if (configuration != null) {
                int i8 = access000 + 3;
                IAuthTabCallback_Parcel = i8 % 128;
                if (i8 % 2 != 0) {
                    float f2 = configuration.fontScale;
                    obj.hashCode();
                    throw null;
                }
                f = configuration.fontScale;
            } else {
                f = 1.0f;
            }
        }
        if (f < 1.0f) {
            baseTextView.setTextSize(1, 11.0f);
        }
        baseTextView.setTextColor(RequestBodyCompanion.onNavigationEvent(baseTextView, authParams.TextPrimary));
        baseTextView.setText(iAuthTabCallback.onNavigationEvent());
        Intrinsics.checkNotNull(baseTextView);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, baseTextView);
        this.onTransact = baseTextView;
        setProxySelectorokhttp.onExtraCallbackWithResult(this, linearLayout);
        this.onExtraCallbackWithResult = linearLayout;
        View view2 = new View(getContext());
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult5 = (ViewGroup.LayoutParams) ConstraintLayout.onExtraCallbackWithResult.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(onextracallbackwithresult5);
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult6 = onextracallbackwithresult5;
        DisplayMetrics displayMetrics4 = view2.getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult6).width = varyMatches.onNavigationEvent(fValueOf, displayMetrics4);
        DisplayMetrics displayMetrics5 = view2.getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics5, "");
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult6).height = varyMatches.onNavigationEvent(fValueOf, displayMetrics5);
        onextracallbackwithresult6.IPostMessageServiceStubProxy = i5;
        onextracallbackwithresult6.setEngagementSignalsCallback = 0;
        onextracallbackwithresult6.IEngagementSignalsCallbackStubProxy = 0;
        View view3 = this.onExtraCallbackWithResult;
        if (view3 != null) {
            int i9 = IAuthTabCallback_Parcel + 103;
            access000 = i9 % 128;
            if (i9 % 2 == 0) {
                paddingTop = view3.getPaddingTop();
                i = 0;
                int i10 = 96 / 0;
            } else {
                i = 0;
                paddingTop = view3.getPaddingTop();
            }
        } else {
            i = 0;
            paddingTop = 0;
        }
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult6).topMargin = paddingTop;
        view2.setLayoutParams(onextracallbackwithresult5);
        ImageView imageView = this.IAuthTabCallbackDefault;
        if (imageView != null) {
            int i11 = IAuthTabCallback_Parcel + 41;
            access000 = i11 % 128;
            if (i11 % 2 == 0) {
                imageView.getLayoutParams();
                throw null;
            }
            ViewGroup.LayoutParams layoutParams5 = imageView.getLayoutParams();
            i2 = layoutParams5 != null ? layoutParams5.width : i;
        }
        int i12 = view2.getLayoutParams().width / 2;
        Intrinsics.checkNotNullExpressionValue(view2.getContext().getResources().getDisplayMetrics(), "");
        view2.setTranslationX((i2 / 2) + i12 + varyMatches.onNavigationEvent(Float.valueOf(2.0f), r3));
        view2.setContentDescription(view2.getContext().getString(R.string.uikit_new_update));
        view2.setBackgroundResource(onNavigationEvent.RED.getBackgroundRes());
        view2.setVisibility(8);
        setProxySelectorokhttp.onExtraCallbackWithResult(this, view2);
        this.onWarmupCompleted = view2;
        if (!iAuthTabCallback.IAuthTabCallbackDefault()) {
            if (onExtraCallbackWithResult(iAuthTabCallback, isSelected()) == null || (numOnExtraCallbackWithResult = onExtraCallbackWithResult(iAuthTabCallback, isSelected())) == null) {
                return;
            }
            int i13 = access000 + 95;
            IAuthTabCallback_Parcel = i13 % 128;
            int i14 = i13 % 2;
            this.asBinder = generateInviteUrl.onExtraCallback((View) this, numOnExtraCallbackWithResult.intValue(), (CharSequence) iAuthTabCallback.onNavigationEvent(), (Integer) null, 4, (Object) null);
            return;
        }
        int i15 = access000 + 125;
        IAuthTabCallback_Parcel = i15 % 128;
        if (i15 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = (String) onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{this, iAuthTabCallback, Boolean.valueOf(isSelected())}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 1414508592, -1414508591);
        if (str != null) {
            this.asBinder = generateInviteUrl.onWarmupCompleted(this, str, iAuthTabCallback.onNavigationEvent(), null, 4, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 101;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super/*android.view.View*/.setEnabled(z);
        if (!z) {
            int i4 = access000;
            int i5 = i4 + 49;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            TossBundleLoader_startServiceSessionEvents tossBundleLoader_startServiceSessionEvents = this.asBinder;
            if (tossBundleLoader_startServiceSessionEvents != null) {
                int i7 = i4 + 109;
                IAuthTabCallback_Parcel = i7 % 128;
                int i8 = i7 % 2;
                tossBundleLoader_startServiceSessionEvents.dismiss();
                if (i8 != 0) {
                    throw null;
                }
            }
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        TabBarItemView tabBarItemView = (TabBarItemView) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = access000 + 39;
        IAuthTabCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            tabBarItemView.setSelected(zBooleanValue);
            tabBarItemView.IAuthTabCallback(zBooleanValue);
            tabBarItemView.onNavigationEvent(zBooleanValue);
            int i3 = IAuthTabCallback_Parcel + 33;
            access000 = i3 % 128;
            if (i3 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        tabBarItemView.setSelected(zBooleanValue);
        tabBarItemView.IAuthTabCallback(zBooleanValue);
        tabBarItemView.onNavigationEvent(zBooleanValue);
        obj.hashCode();
        throw null;
    }

    private final void IAuthTabCallback(boolean z) {
        IAuthTabCallback iAuthTabCallback;
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 85;
        IAuthTabCallback_Parcel = i3 % 128;
        TdsImageView tdsImageView = null;
        if (i3 % 2 == 0) {
            ImageView imageView = this.IAuthTabCallbackDefault;
            if (imageView instanceof TdsImageView) {
                tdsImageView = (TdsImageView) imageView;
            } else {
                int i4 = i2 + 115;
                IAuthTabCallback_Parcel = i4 % 128;
                int i5 = i4 % 2;
            }
            if (tdsImageView == null || (iAuthTabCallback = this.IAuthTabCallbackStubProxy) == null) {
                return;
            }
            IAuthTabCallback(tdsImageView, iAuthTabCallback, z);
            return;
        }
        boolean z2 = this.IAuthTabCallbackDefault instanceof TdsImageView;
        tdsImageView.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 13;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        if (!z) {
            return OkHttpClientCompanion.onWarmupCompleted(this, eExternalSyntheticLambda0.TabBarIconUnselected);
        }
        int iOnWarmupCompleted = OkHttpClientCompanion.onWarmupCompleted(this, eExternalSyntheticLambda0.TabBarIconSelected);
        int i4 = IAuthTabCallback_Parcel + 9;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return iOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallbackWithResult(boolean z, Drawable drawable) {
        int i = 2 % 2;
        int i2 = access000 + 81;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnWarmupCompleted = onWarmupCompleted(z);
            Drawable drawableIAuthTabCallbackStub = drawable != null ? CameraControllerExternalSyntheticLambda9.IAuthTabCallbackStub(drawable) : null;
            if (drawableIAuthTabCallbackStub != null) {
                int i3 = access000 + 69;
                IAuthTabCallback_Parcel = i3 % 128;
                int i4 = i3 % 2;
                CameraControllerExternalSyntheticLambda9.IAuthTabCallback(drawableIAuthTabCallbackStub.mutate(), iOnWarmupCompleted);
                return;
            }
            return;
        }
        onWarmupCompleted(z);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(TabBarItemView tabBarItemView, TdsImageView tdsImageView, RecomposerKt recomposerKt) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 119;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(recomposerKt, "");
        tabBarItemView.onExtraCallbackWithResult(tabBarItemView.isSelected(), tdsImageView.getDrawable());
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 1;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onWarmupCompleted(TabBarItemView tabBarItemView, IAuthTabCallback iAuthTabCallback, TdsImageView tdsImageView, Throwable th) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        boolean zIsSelected = tabBarItemView.isSelected();
        Integer numOnExtraCallbackWithResult = tabBarItemView.onExtraCallbackWithResult(iAuthTabCallback, zIsSelected);
        if (numOnExtraCallbackWithResult != null) {
            int i2 = access000 + 47;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            tdsImageView.setImageResource(numOnExtraCallbackWithResult.intValue());
            int i4 = access000 + 49;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
        }
        tabBarItemView.onExtraCallbackWithResult(zIsSelected, tdsImageView.getDrawable());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0071, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r8.IAuthTabCallbackStub, r0)) != true) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0073, code lost:
    
        onExtraCallbackWithResult(r11, r9.getDrawable());
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007b, code lost:
    
        r8.IAuthTabCallbackStub = r0;
        r9.setImage(r0, new im.toss.uikit.widget.TabBarItemView$$ExternalSyntheticLambda0(r8, r9), new im.toss.uikit.widget.TabBarItemView$$ExternalSyntheticLambda1(r8, r10, r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0042, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.IAuthTabCallbackStub, r0) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IAuthTabCallback(final TdsImageView tdsImageView, final IAuthTabCallback iAuthTabCallback, boolean z) {
        String str;
        int i = 2 % 2;
        if (!iAuthTabCallback.IAuthTabCallbackDefault()) {
            Integer numOnExtraCallbackWithResult = onExtraCallbackWithResult(iAuthTabCallback, z);
            if (numOnExtraCallbackWithResult != null) {
                int i2 = IAuthTabCallback_Parcel + Imgproc.COLOR_YUV2RGBA_YVYU;
                access000 = i2 % 128;
                int i3 = i2 % 2;
                tdsImageView.setImageResource(numOnExtraCallbackWithResult.intValue());
            }
            onExtraCallbackWithResult(z, tdsImageView.getDrawable());
            return;
        }
        int i4 = IAuthTabCallback_Parcel + 115;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            str = (String) onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{this, iAuthTabCallback, Boolean.valueOf(z)}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 1414508592, -1414508591);
            int i5 = 44 / 0;
        } else {
            str = (String) onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{this, iAuthTabCallback, Boolean.valueOf(z)}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 1414508592, -1414508591);
        }
    }

    private final void onNavigationEvent(boolean z) {
        deprecated_followRedirects deprecated_followredirectsOnExtraCallback;
        int i = 2 % 2;
        IAuthTabCallback iAuthTabCallback = this.IAuthTabCallbackStubProxy;
        if (iAuthTabCallback != null) {
            deprecated_followRedirects deprecated_followredirectsOnWarmupCompleted = null;
            if (iAuthTabCallback.IAuthTabCallbackDefault()) {
                int i2 = access000 + 33;
                IAuthTabCallback_Parcel = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                String str = (String) onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{this, iAuthTabCallback, Boolean.valueOf(z)}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 1414508592, -1414508591);
                if (str != null) {
                    int i3 = IAuthTabCallback_Parcel + 107;
                    access000 = i3 % 128;
                    if (i3 % 2 == 0) {
                        deprecated_followredirectsOnExtraCallback = deprecated_followSslRedirects.onExtraCallback(str);
                        int i4 = 13 / 0;
                    } else {
                        deprecated_followredirectsOnExtraCallback = deprecated_followSslRedirects.onExtraCallback(str);
                    }
                    deprecated_followredirectsOnWarmupCompleted = deprecated_followredirectsOnExtraCallback;
                }
            } else {
                Integer numOnExtraCallbackWithResult = onExtraCallbackWithResult(iAuthTabCallback, z);
                if (numOnExtraCallbackWithResult != null) {
                    deprecated_followredirectsOnWarmupCompleted = deprecated_followSslRedirects.onWarmupCompleted(numOnExtraCallbackWithResult.intValue());
                }
            }
            TossBundleLoader_startServiceSessionEvents tossBundleLoader_startServiceSessionEvents = this.asBinder;
            if (tossBundleLoader_startServiceSessionEvents != null) {
                tossBundleLoader_startServiceSessionEvents.onNavigationEvent(deprecated_followredirectsOnWarmupCompleted, Integer.valueOf(onWarmupCompleted(z)));
            }
        }
    }

    private static final Unit onExtraCallbackWithResult(attachAppLovinSdk attachapplovinsdk) {
        int i;
        int i2 = 2 % 2;
        int i3 = access000 + 97;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            i = 28640;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            i = 400;
        }
        attachapplovinsdk.onExtraCallback(i);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 77;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public final void onExtraCallbackWithResult(@NotNull onNavigationEvent onnavigationevent, boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        runOnUiThreadDelayed runonuithreaddelayed = this.IAuthTabCallback;
        if (runonuithreaddelayed != null) {
            int i2 = access000 + 105;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            runonuithreaddelayed.onNavigationEvent();
        }
        View view = this.onWarmupCompleted;
        if (view != null) {
            view.setBackgroundResource(onnavigationevent.getBackgroundRes());
            view.setVisibility(0);
            if (!z) {
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                return;
            }
            view.setScaleX(0.0f);
            view.setScaleY(0.0f);
            runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted = RallysKt.onWarmupCompleted(view, pxToDp.IAuthTabCallback.onExtraCallback, CollectionsKt__CollectionsJVMKt.listOf((Rally) RallysKt.onWarmupCompleted(new Object[]{view, isMuted.onTransact((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onWarmupCompleted()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(0.0f), Float.valueOf(1.0f), new TabBarItemView$.ExternalSyntheticLambda2()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 4088, (Object) null);
            isFireOS.onExtraCallbackWithResult(runonuithreaddelayedOnWarmupCompleted, false, 1, (Object) null);
            this.IAuthTabCallback = runonuithreaddelayedOnWarmupCompleted;
            int i4 = access000 + 79;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        TabBarItemView tabBarItemView = (TabBarItemView) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 111;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        runOnUiThreadDelayed runonuithreaddelayed = tabBarItemView.IAuthTabCallback;
        if (runonuithreaddelayed != null) {
            int i5 = i2 + 91;
            access000 = i5 % 128;
            int i6 = i5 % 2;
            runonuithreaddelayed.onNavigationEvent();
        }
        tabBarItemView.IAuthTabCallback = null;
        View view = tabBarItemView.onWarmupCompleted;
        if (view != null) {
            int i7 = access000 + 51;
            IAuthTabCallback_Parcel = i7 % 128;
            if (i7 % 2 != 0) {
                view.setVisibility(105);
                view.setScaleX(0.0f);
            } else {
                view.setVisibility(8);
                view.setScaleX(1.0f);
            }
            view.setScaleY(1.0f);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setSelected(boolean z) {
        int i = 2 % 2;
        super/*android.view.View*/.setSelected(z);
        ImageView imageView = this.IAuthTabCallbackDefault;
        if (imageView != null) {
            int i2 = access000 + 39;
            IAuthTabCallback_Parcel = i2 % 128;
            if (i2 % 2 != 0) {
                imageView.setSelected(z);
                throw null;
            }
            imageView.setSelected(z);
            int i3 = access000 + 77;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
        }
        TextView textView = this.onTransact;
        if (textView != null) {
            textView.setSelected(z);
        }
        int i5 = IAuthTabCallback_Parcel + 125;
        access000 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onInitializeAccessibilityNodeInfo(@NotNull AccessibilityNodeInfo accessibilityNodeInfo) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(accessibilityNodeInfo, "");
        super/*android.view.View*/.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        SuspendAnimationKtExternalSyntheticLambda4 suspendAnimationKtExternalSyntheticLambda4OnExtraCallbackWithResult = SuspendAnimationKtExternalSyntheticLambda4.onExtraCallbackWithResult(accessibilityNodeInfo);
        suspendAnimationKtExternalSyntheticLambda4OnExtraCallbackWithResult.onExtraCallback(SuspendAnimationKtExternalSyntheticLambda4.IAuthTabCallbackStub.onNavigationEvent(0, 1, ((Integer) onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{this}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 1886692507, -1886692504)).intValue(), 1, false, isSelected()));
        View view = this.onWarmupCompleted;
        if (view != null) {
            int i2 = access000 + 17;
            IAuthTabCallback_Parcel = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 13 / 0;
                if (view.getVisibility() != 0) {
                    int i4 = access000 + 79;
                    IAuthTabCallback_Parcel = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 5 % 5;
                    }
                    view = null;
                }
                if (view != null) {
                    suspendAnimationKtExternalSyntheticLambda4OnExtraCallbackWithResult.IAuthTabCallback(((Object) getContentDescription()) + ", " + ((Object) view.getContentDescription()));
                }
            } else {
                if (view.getVisibility() != 0) {
                }
                if (view != null) {
                }
            }
        }
        if (isSelected()) {
            int i6 = IAuthTabCallback_Parcel + 19;
            access000 = i6 % 128;
            if (i6 % 2 == 0) {
                suspendAnimationKtExternalSyntheticLambda4OnExtraCallbackWithResult.IAuthTabCallbackStub(true);
            } else {
                suspendAnimationKtExternalSyntheticLambda4OnExtraCallbackWithResult.IAuthTabCallbackStub(false);
            }
            suspendAnimationKtExternalSyntheticLambda4OnExtraCallbackWithResult.onWarmupCompleted(SuspendAnimationKtExternalSyntheticLambda4.IAuthTabCallback.IAuthTabCallback);
        }
        suspendAnimationKtExternalSyntheticLambda4OnExtraCallbackWithResult.asBinder(getResources().getString(com.google.android.material.R.string.item_view_role_description));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026 A[PHI: r2
      0x0026: PHI (r2v5 android.view.ViewParent) = (r2v4 android.view.ViewParent), (r2v15 android.view.ViewParent) binds: [B:8:0x0024, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        ViewParent parent;
        ViewGroup viewGroup;
        ConstraintLayout constraintLayout = (TabBarItemView) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 81;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            parent = constraintLayout.getParent();
            int i3 = 6 / 0;
            if (parent instanceof ViewGroup) {
                int i4 = IAuthTabCallback_Parcel + 43;
                access000 = i4 % 128;
                int i5 = i4 % 2;
                viewGroup = (ViewGroup) parent;
            } else {
                viewGroup = null;
            }
        } else {
            parent = constraintLayout.getParent();
            if (parent instanceof ViewGroup) {
            }
        }
        if (viewGroup == null) {
            int i6 = IAuthTabCallback_Parcel + 25;
            access000 = i6 % 128;
            int i7 = i6 % 2;
            return -1;
        }
        Sequence sequenceAccess100 = ensureCausesIsMutable.access100(EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback(viewGroup), onExtraCallback.onNavigationEvent);
        Intrinsics.checkNotNull(sequenceAccess100, "");
        int iOnExtraCallback = ensureCausesIsMutable.onExtraCallback((Sequence<? extends ConstraintLayout>) ((Sequence<? extends Object>) ensureCausesIsMutable.access100(sequenceAccess100, new Function1() { // from class: im.toss.uikit.widget.TabBarItemView$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i8 = 2 % 2;
                int i9 = onWarmupCompleted + 59;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                Boolean boolValueOf = Boolean.valueOf(TabBarItemView.onExtraCallbackWithResult((TabBarItemView) obj));
                if (i10 == 0) {
                    int i11 = 11 / 0;
                }
                int i12 = IAuthTabCallback + 103;
                onWarmupCompleted = i12 % 128;
                if (i12 % 2 != 0) {
                    int i13 = 49 / 0;
                }
                return boolValueOf;
            }
        })), constraintLayout);
        int i8 = access000 + 37;
        IAuthTabCallback_Parcel = i8 % 128;
        if (i8 % 2 == 0) {
            return Integer.valueOf(iOnExtraCallback);
        }
        int i9 = 47 / 0;
        return Integer.valueOf(iOnExtraCallback);
    }

    public final void onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 71;
        access000 = i3 % 128;
        this.asInterface = i3 % 2 == 0;
        int i4 = i2 + 119;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0041 A[PHI: r0 r1 r2
      0x0041: PHI (r0v5 java.lang.Float) = (r0v4 java.lang.Float), (r0v36 java.lang.Float) binds: [B:8:0x003f, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x0041: PHI (r1v3 java.lang.Float) = (r1v2 java.lang.Float), (r1v26 java.lang.Float) binds: [B:8:0x003f, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x0041: PHI (r2v2 java.lang.Float) = (r2v1 java.lang.Float), (r2v13 java.lang.Float) binds: [B:8:0x003f, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setPressed(boolean z) {
        Float fValueOf;
        Float fValueOf2;
        Float fValueOf3;
        int i;
        runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted;
        int i2 = 2 % 2;
        int i3 = access000 + 11;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            fValueOf = Float.valueOf(0.93f);
            fValueOf2 = Float.valueOf(1.08f);
            fValueOf3 = Float.valueOf(1.0f);
            super/*android.view.View*/.setPressed(z);
            if (this.asInterface) {
                Float f = fValueOf;
                Float f2 = fValueOf3;
                Float f3 = fValueOf2;
                runOnUiThreadDelayed runonuithreaddelayed = this.access100;
                if (runonuithreaddelayed != null) {
                    int i4 = access000 + 39;
                    IAuthTabCallback_Parcel = i4 % 128;
                    int i5 = i4 % 2;
                    runonuithreaddelayed.onNavigationEvent();
                }
                ImageView imageView = this.IAuthTabCallbackDefault;
                if (imageView != null) {
                    if (z) {
                        int i6 = IAuthTabCallback_Parcel + 125;
                        access000 = i6 % 128;
                        int i7 = i6 % 2;
                        i = 1;
                        runonuithreaddelayedOnWarmupCompleted = RallysKt.onWarmupCompleted(this, pxToDp.IAuthTabCallback.onExtraCallback, CollectionsKt__CollectionsJVMKt.listOf((Rally) RallysKt.onWarmupCompleted(new Object[]{this, isMuted.asBinder(RallysKt.onExtraCallback(Address.onNavigationEvent.asBinder(), 200), (Float) null, Float.valueOf(0.9f), (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, Boolean.FALSE, 0, 0L, false, 3832, (Object) null);
                    } else {
                        i = 1;
                        runonuithreaddelayedOnWarmupCompleted = RallysKt.onWarmupCompleted(this, pxToDp.IAuthTabCallback.onExtraCallback, CollectionsKt__CollectionsKt.listOf((Object[]) new Rally[]{(Rally) RallysKt.onWarmupCompleted(new Object[]{this, isMuted.asBinder((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{new deprecated_dns(300.0d, 15.0d)}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, f2, (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), RallysKt.onWarmupCompleted(imageView, RallysKt.onNavigationEvent(new AppLovinSdkSettings[]{isMuted.IAuthTabCallbackDefault(isMuted.IAuthTabCallbackStub((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.asInterface()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), f2, f3, (Function1) null, 4, (Object) null), f2, f, (Function1) null, 4, (Object) null)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null), RallysKt.onWarmupCompleted(imageView, RallysKt.onNavigationEvent(new AppLovinSdkSettings[]{isMuted.IAuthTabCallbackDefault(isMuted.IAuthTabCallbackStub((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{new deprecated_dns(300.0d, 15.0d)}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), f3, f2, (Function1) null, 4, (Object) null), f, f2, (Function1) null, 4, (Object) null)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 200, 0L, false, 1788, (Object) null)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, Boolean.FALSE, 0, 0L, false, 3832, (Object) null);
                    }
                    isFireOS.onExtraCallbackWithResult(runonuithreaddelayedOnWarmupCompleted, false, i, (Object) null);
                    this.access100 = runonuithreaddelayedOnWarmupCompleted;
                }
            }
        } else {
            fValueOf = Float.valueOf(0.93f);
            fValueOf2 = Float.valueOf(1.08f);
            fValueOf3 = Float.valueOf(1.0f);
            super/*android.view.View*/.setPressed(z);
            if (!(!this.asInterface)) {
            }
        }
    }

    public final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = access000 + 25;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ImageView imageView = this.IAuthTabCallbackDefault;
        if (imageView == null) {
            return 0;
        }
        int left = imageView.getLeft();
        int i3 = IAuthTabCallback_Parcel + 61;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        return left;
    }

    public static final class IAuthTabCallback {
        public static final onNavigationEvent Companion;
        private static int IAuthTabCallbackDefault = 0;
        private static int IAuthTabCallback_Parcel = 1;
        private static int asBinder = 0;
        private static int asInterface = 1;
        private final String IAuthTabCallback;
        private final String IAuthTabCallbackStub;
        private final int onExtraCallback;
        private final String onExtraCallbackWithResult;
        private final Integer onNavigationEvent;
        private final Integer onTransact;
        private final boolean onWarmupCompleted;

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new onNavigationEvent(defaultConstructorMarker);
            int i = asInterface + 93;
            IAuthTabCallbackDefault = i % 128;
            if (i % 2 == 0) {
                return;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public IAuthTabCallback(int i, @Nullable String str, @Nullable String str2, @NotNull String str3, @Nullable Integer num, @Nullable Integer num2) {
            boolean z;
            Intrinsics.checkNotNullParameter(str3, "");
            this.onExtraCallback = i;
            this.IAuthTabCallback = str;
            this.IAuthTabCallbackStub = str2;
            this.onExtraCallbackWithResult = str3;
            this.onNavigationEvent = num;
            this.onTransact = num2;
            if (str == null || str.length() == 0) {
                if (str2 != null) {
                    int i2 = asBinder + 125;
                    IAuthTabCallback_Parcel = i2 % 128;
                    int i3 = i2 % 2;
                    if (str2.length() != 0) {
                        int i4 = 2 % 2;
                        z = true;
                    }
                }
                int i5 = asBinder + 95;
                IAuthTabCallback_Parcel = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 2 % 2;
                }
                z = false;
            }
            this.onWarmupCompleted = z;
        }

        public final int onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel;
            int i3 = i2 + 57;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.onExtraCallback;
            int i6 = i2 + 101;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel;
            int i3 = i2 + 29;
            asBinder = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            String str = this.IAuthTabCallback;
            int i4 = i2 + 107;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public final String asBinder() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 99;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                return this.IAuthTabCallbackStub;
            }
            throw null;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 29;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onExtraCallbackWithResult;
            }
            throw null;
        }

        public final Integer onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = asBinder + 103;
            IAuthTabCallback_Parcel = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onNavigationEvent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Integer IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 67;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            Integer num = this.onTransact;
            int i5 = i2 + 1;
            IAuthTabCallback_Parcel = i5 % 128;
            if (i5 % 2 != 0) {
                return num;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 9;
            int i3 = i2 % 128;
            asBinder = i3;
            int i4 = i2 % 2;
            boolean z = this.onWarmupCompleted;
            int i5 = i3 + 19;
            IAuthTabCallback_Parcel = i5 % 128;
            if (i5 % 2 != 0) {
                return z;
            }
            throw null;
        }

        public static final class onNavigationEvent {
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private onNavigationEvent() {
            }

            public static /* synthetic */ IAuthTabCallback IAuthTabCallback(onNavigationEvent onnavigationevent, int i, Integer num, String str, Integer num2, int i2, Object obj) {
                int i3 = 2 % 2;
                if ((i2 & 2) != 0) {
                    int i4 = onNavigationEvent + 83;
                    IAuthTabCallback = i4 % 128;
                    Object obj2 = null;
                    if (i4 % 2 != 0) {
                        obj2.hashCode();
                        throw null;
                    }
                    num = null;
                }
                if ((i2 & 8) != 0) {
                    int i5 = IAuthTabCallback + 63;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 99 / 0;
                    }
                    num2 = num;
                }
                return onnavigationevent.IAuthTabCallback(i, num, str, num2);
            }

            public final IAuthTabCallback IAuthTabCallback(int i, @Nullable Integer num, @NotNull String str, @Nullable Integer num2) {
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(str, "");
                IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(i, null, null, str, num2, num);
                int i3 = IAuthTabCallback + 119;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    return iAuthTabCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static /* synthetic */ IAuthTabCallback onNavigationEvent(onNavigationEvent onnavigationevent, int i, String str, String str2, Integer num, String str3, int i2, Object obj) {
                int i3 = 2 % 2;
                int i4 = onNavigationEvent + 115;
                int i5 = i4 % 128;
                IAuthTabCallback = i5;
                if (i4 % 2 == 0 ? (i2 & 8) != 0 : (i2 & 67) != 0) {
                    int i6 = i5 + 103;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    num = null;
                }
                return onnavigationevent.onWarmupCompleted(i, str, str2, num, str3);
            }

            public final IAuthTabCallback onWarmupCompleted(int i, @NotNull String str, @NotNull String str2, @Nullable Integer num, @NotNull String str3) {
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(i, str, str2, str3, num, num);
                int i3 = IAuthTabCallback + 51;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    return iAuthTabCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    static {
        int i = ICustomTabsCallback + 67;
        writeTypedObject = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 87;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        if (!zBooleanValue) {
            String strAsBinder = iAuthTabCallback.asBinder();
            return strAsBinder == null ? iAuthTabCallback.onWarmupCompleted() : strAsBinder;
        }
        int i5 = i3 + 9;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            String strOnWarmupCompleted = iAuthTabCallback.onWarmupCompleted();
            int i6 = 26 / 0;
            if (strOnWarmupCompleted != null) {
                return strOnWarmupCompleted;
            }
        } else {
            String strOnWarmupCompleted2 = iAuthTabCallback.onWarmupCompleted();
            if (strOnWarmupCompleted2 != null) {
                return strOnWarmupCompleted2;
            }
        }
        return iAuthTabCallback.asBinder();
    }

    private final Integer onExtraCallbackWithResult(IAuthTabCallback iAuthTabCallback, boolean z) {
        int i = 2 % 2;
        if (z) {
            int i2 = IAuthTabCallback_Parcel + 21;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            Integer numOnExtraCallbackWithResult = iAuthTabCallback.onExtraCallbackWithResult();
            if (numOnExtraCallbackWithResult != null) {
                return numOnExtraCallbackWithResult;
            }
            int i4 = IAuthTabCallback_Parcel + 23;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            return iAuthTabCallback.IAuthTabCallback();
        }
        Integer numIAuthTabCallback = iAuthTabCallback.IAuthTabCallback();
        if (numIAuthTabCallback != null) {
            return numIAuthTabCallback;
        }
        Integer numOnExtraCallbackWithResult2 = iAuthTabCallback.onExtraCallbackWithResult();
        int i6 = IAuthTabCallback_Parcel + 59;
        access000 = i6 % 128;
        int i7 = i6 % 2;
        return numOnExtraCallbackWithResult2;
    }

    public static final class onExtraCallback implements Function1<Object, Boolean> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        public static final onExtraCallback onNavigationEvent = new onExtraCallback();
        private static int onWarmupCompleted = 1;

        static {
            int i = IAuthTabCallback + 37;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Boolean invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 47;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Boolean boolOnNavigationEvent = onNavigationEvent(obj);
            int i4 = onExtraCallback + 19;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return boolOnNavigationEvent;
        }

        public final Boolean onNavigationEvent(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + Imgproc.COLOR_YUV2RGB_YVYU;
            onExtraCallback = i2 % 128;
            boolean z = obj instanceof TabBarItemView;
            if (i2 % 2 == 0) {
                return Boolean.valueOf(z);
            }
            Boolean.valueOf(z);
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean IAuthTabCallback(TabBarItemView tabBarItemView) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 5;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(tabBarItemView, "");
        if (tabBarItemView.getVisibility() == 0) {
            return true;
        }
        int i4 = access000 + 33;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final int asInterface() {
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        return ((Integer) onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{this}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 1886692507, -1886692504)).intValue();
    }

    private final String onWarmupCompleted(IAuthTabCallback iAuthTabCallback, boolean z) {
        return (String) onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{this, iAuthTabCallback, Boolean.valueOf(z)}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 1414508592, -1414508591);
    }

    public final void IAuthTabCallback() {
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{this}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 1272131073, -1272131071);
    }

    public final void onExtraCallbackWithResult(boolean z) {
        onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{this, Boolean.valueOf(z)}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 1867665790, -1867665790);
    }
}
