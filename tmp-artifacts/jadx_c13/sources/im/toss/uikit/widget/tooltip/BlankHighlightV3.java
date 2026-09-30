package im.toss.uikit.widget.tooltip;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.features.home.ui.dst.view.cardbill.detail.HomeDstCardBillDetailFilterActivity$;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.uikit.widget.tooltip.BlankHighlightV3$;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.Address;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2;
import o.AppLovinSdkSettings;
import o.TextFieldPressGestureFilterKtExternalSyntheticLambda0;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.access13800;
import o.access14100;
import o.attachAppLovinSdk;
import o.deprecated_certificatePinner;
import o.deprecated_dns;
import o.findResAndMsg;
import o.formatMsgs;
import o.generateAppWithState;
import o.getAdService;
import o.getAppDataMetadata;
import o.getDEFAULT_CONNECTION_SPECSokhttp;
import o.getDurationMs;
import o.getExtraParameters;
import o.getSpecialFeatureOptInStatus;
import o.isFireOS;
import o.isMuted;
import o.onLoadStarted;
import o.pxToDp;
import o.readIntokhttp;
import o.runOnUiThreadDelayed;
import o.setProxySelectorokhttp;
import o.setTagsokhttp;
import o.varyFields;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class BlankHighlightV3 extends ConstraintLayout implements generateAppWithState {
    private static int ICustomTabsCallbackDefault = 1;
    private static int onRelationshipValidationResult;
    private View IAuthTabCallback;
    private runOnUiThreadDelayed IAuthTabCallbackDefault;
    private int IAuthTabCallbackStub;
    private FrameLayout IAuthTabCallbackStubProxy;
    private generateAppWithState.onExtraCallback IAuthTabCallback_Parcel;
    private runOnUiThreadDelayed ICustomTabsCallback;
    private String access000;
    private TdsImageView access100;
    private final Paint asBinder;
    private boolean asInterface;
    private float extraCallback;
    private Integer extraCallbackWithResult;
    private int getInterfaceDescriptor;
    private float onActivityLayout;
    private float onActivityResized;
    private TdsImageView onExtraCallback;
    private final Paint onExtraCallbackWithResult;
    private Rect onMessageChannelReady;
    private int[] onMinimized;
    private final DisplayMetrics onNavigationEvent;
    private View onPostMessage;
    private boolean onTransact;
    private ViewGroup onWarmupCompleted;
    private ViewGroup readTypedObject;
    private generateAppWithState.onExtraCallbackWithResult writeTypedObject;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BlankHighlightV3(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BlankHighlightV3(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        BlankHighlightV3 blankHighlightV3 = (BlankHighlightV3) objArr[0];
        getAppDataMetadata getappdatametadata = (getAppDataMetadata) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 49;
        onRelationshipValidationResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onNavigationEvent(blankHighlightV3, getappdatametadata);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(blankHighlightV3, getappdatametadata);
        int i3 = onRelationshipValidationResult + 47;
        ICustomTabsCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(BlankHighlightV3 blankHighlightV3) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 27;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackStubProxy(blankHighlightV3);
        }
        IAuthTabCallbackStubProxy(blankHighlightV3);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(AppLovinSdkSettings appLovinSdkSettings) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 49;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(appLovinSdkSettings);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(appLovinSdkSettings);
        int i3 = onRelationshipValidationResult + 53;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ void IAuthTabCallback(BlankHighlightV3 blankHighlightV3, boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 97;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(blankHighlightV3, z);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = ICustomTabsCallbackDefault + 9;
        onRelationshipValidationResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit asInterface(BlankHighlightV3 blankHighlightV3) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 31;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess100 = access100(blankHighlightV3);
        if (i3 != 0) {
            int i4 = 14 / 0;
        }
        int i5 = onRelationshipValidationResult + 105;
        ICustomTabsCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return unitAccess100;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7;
        int i8 = ~(i3 | i6);
        int i9 = (~i) | (~i6);
        int i10 = (~i9) | i3;
        int i11 = (~(i6 | i)) | (~((~i3) | i)) | (~(i9 | i3));
        int i12 = i + i3 + i2 + ((-101282902) * i4) + ((-829309908) * i5);
        int i13 = i12 * i12;
        int i14 = ((i * 42798203) - 224002048) + (42798203 * i3) + ((-1233194106) * i8) + (1828579084 * i10) + (1233194106 * i11) + ((-1190395904) * i2) + (1710751744 * i4) + ((-1643118592) * i5) + ((-1134166016) * i13);
        int i15 = (i * 1745018779) + 1790267665 + (i3 * 1745018779) + (i8 * (-58)) + (i10 * (-116)) + (i11 * 58) + (i2 * 1745018721) + (i4 * (-1587019414)) + (i5 * (-1871011668)) + (i13 * 1017511936);
        int i16 = i14 + (i15 * i15 * (-1139146752));
        boolean z = false;
        switch (i16) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
                int i17 = 2 % 2;
                int i18 = onRelationshipValidationResult + 45;
                ICustomTabsCallbackDefault = i18 % 128;
                int i19 = i18 % 2;
                Unit unitOnTransact = onTransact(attachapplovinsdk);
                int i20 = onRelationshipValidationResult + 89;
                ICustomTabsCallbackDefault = i20 % 128;
                int i21 = i20 % 2;
                return unitOnTransact;
            case 5:
                return IAuthTabCallback(objArr);
            case 6:
                return onExtraCallbackWithResult(objArr);
            case 7:
                return asBinder(objArr);
            case 8:
                attachAppLovinSdk attachapplovinsdk2 = (attachAppLovinSdk) objArr[0];
                int i22 = 2 % 2;
                int i23 = onRelationshipValidationResult + 41;
                ICustomTabsCallbackDefault = i23 % 128;
                if (i23 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(attachapplovinsdk2, "");
                    attachapplovinsdk2.IAuthTabCallback(Address.onNavigationEvent.asBinder());
                    attachapplovinsdk2.IAuthTabCallback(17311);
                    i7 = 126;
                } else {
                    Intrinsics.checkNotNullParameter(attachapplovinsdk2, "");
                    attachapplovinsdk2.IAuthTabCallback(Address.onNavigationEvent.asBinder());
                    attachapplovinsdk2.IAuthTabCallback(1000);
                    i7 = 100;
                }
                attachapplovinsdk2.onExtraCallback(i7);
                return Unit.INSTANCE;
            default:
                BlankHighlightV3 blankHighlightV3 = (BlankHighlightV3) objArr[0];
                int i24 = 2 % 2;
                int i25 = ICustomTabsCallbackDefault + 29;
                onRelationshipValidationResult = i25 % 128;
                if (i25 % 2 != 0) {
                    onExtraCallback(53083928, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -53083922, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{blankHighlightV3}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
                    z = true;
                } else {
                    onExtraCallback(53083928, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -53083922, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{blankHighlightV3}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
                }
                blankHighlightV3.onExtraCallbackWithResult(z);
                Unit unit = Unit.INSTANCE;
                int i26 = ICustomTabsCallbackDefault + 27;
                onRelationshipValidationResult = i26 % 128;
                int i27 = i26 % 2;
                return unit;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        BlankHighlightV3 blankHighlightV3 = (BlankHighlightV3) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 3;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        Unit unit = (Unit) onExtraCallback(-1310347593, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 1310347593, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{blankHighlightV3}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback);
        int i4 = ICustomTabsCallbackDefault + 77;
        onRelationshipValidationResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(BlankHighlightV3 blankHighlightV3) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 53;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(blankHighlightV3);
        int i4 = onRelationshipValidationResult + 15;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitAsBinder;
    }

    public static /* synthetic */ Unit onExtraCallback(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 55;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(attachapplovinsdk);
        int i4 = onRelationshipValidationResult + 109;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 81 / 0;
        }
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ void onExtraCallback(View view, BlankHighlightV3 blankHighlightV3) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 7;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(view, blankHighlightV3);
        int i4 = onRelationshipValidationResult + 1;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onExtraCallback(View view, BlankHighlightV3 blankHighlightV3, ViewGroup viewGroup, ViewGroup viewGroup2, Integer num, Integer num2, generateAppWithState.onExtraCallbackWithResult onextracallbackwithresult, long j) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 107;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(view, blankHighlightV3, viewGroup, viewGroup2, num, num2, onextracallbackwithresult, j);
        int i4 = ICustomTabsCallbackDefault + 75;
        onRelationshipValidationResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(BlankHighlightV3 blankHighlightV3) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 51;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(blankHighlightV3);
        int i4 = ICustomTabsCallbackDefault + 41;
        onRelationshipValidationResult = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(AppLovinSdkSettings appLovinSdkSettings) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 1;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(appLovinSdkSettings);
        int i4 = onRelationshipValidationResult + 87;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(attachAppLovinSdk attachapplovinsdk) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 15;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {attachapplovinsdk};
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback3 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback4 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        if (i3 == 0) {
            unit = (Unit) onExtraCallback(-729412332, iIAuthTabCallback2, 729412334, iIAuthTabCallback3, objArr, iIAuthTabCallback4, iIAuthTabCallback);
            int i4 = 72 / 0;
        } else {
            unit = (Unit) onExtraCallback(-729412332, iIAuthTabCallback2, 729412334, iIAuthTabCallback3, objArr, iIAuthTabCallback4, iIAuthTabCallback);
        }
        int i5 = ICustomTabsCallbackDefault + 101;
        onRelationshipValidationResult = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(BlankHighlightV3 blankHighlightV3, View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 37;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(blankHighlightV3, view, motionEvent);
        }
        onExtraCallback(blankHighlightV3, view, motionEvent);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 57;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
            return (Unit) onExtraCallback(1556542757, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -1556542750, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{attachapplovinsdk}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback);
        }
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(BlankHighlightV3 blankHighlightV3) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 87;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackDefault(blankHighlightV3);
        int i4 = ICustomTabsCallbackDefault + 109;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 49;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
            return (Unit) onExtraCallback(1070306785, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -1070306777, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{attachapplovinsdk}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback);
        }
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BlankHighlightV3(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.IAuthTabCallback_Parcel = generateAppWithState.onExtraCallback.CENTER;
        this.onMessageChannelReady = new Rect();
        this.onActivityLayout = -1.0f;
        this.onActivityResized = -1.0f;
        this.onMinimized = new int[2];
        this.extraCallback = -1.0f;
        this.IAuthTabCallbackStub = setTagsokhttp.onExtraCallbackWithResult(this, 10);
        this.onNavigationEvent = getResources().getDisplayMetrics();
        setLayerType(2, null);
        setClipChildren(true);
        setClipToPadding(true);
        if (getLayoutParams() == null) {
            setLayoutParams(new ConstraintLayout.onExtraCallbackWithResult(-1, -1));
            int i2 = ICustomTabsCallbackDefault + 17;
            onRelationshipValidationResult = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        View view = new View(getContext());
        Class cls = Integer.TYPE;
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult = (ViewGroup.LayoutParams) ConstraintLayout.onExtraCallbackWithResult.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(onextracallbackwithresult);
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult2 = onextracallbackwithresult;
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult2).width = -1;
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult2).height = -1;
        view.setLayoutParams(onextracallbackwithresult);
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Resources resources = context2.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        view.setBackgroundColor(new getDEFAULT_CONNECTION_SPECSokhttp(new onWarmupCompleted(configuration)).onWarmupCompleted());
        view.setVisibility(4);
        view.setAlpha(0.0f);
        view.setClickable(false);
        view.setFocusable(false);
        setProxySelectorokhttp.onExtraCallbackWithResult(this, view);
        setDim(view);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        FrameLayout frameLayout = new FrameLayout(context3);
        frameLayout.setLayoutParams(new ConstraintLayout.onExtraCallbackWithResult(-2, -2));
        Context context4 = frameLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        TdsImageView tdsImageView = new TdsImageView(context4, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        tdsImageView.setTag("BlueGradient");
        getDurationMs.IAuthTabCallback iAuthTabCallback = getDurationMs.IAuthTabCallback.onNavigationEvent;
        TdsImageView.setImage$default(tdsImageView, iAuthTabCallback.IAuthTabCallback(), (Function1) null, (Function1) null, 6, (Object) null);
        setProxySelectorokhttp.onExtraCallbackWithResult(frameLayout, tdsImageView);
        this.onExtraCallback = tdsImageView;
        Context context5 = frameLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        TdsImageView tdsImageView2 = new TdsImageView(context5, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        tdsImageView2.setTag("MintGradient");
        TdsImageView.setImage$default(tdsImageView2, iAuthTabCallback.onWarmupCompleted(), (Function1) null, (Function1) null, 6, (Object) null);
        setProxySelectorokhttp.onExtraCallbackWithResult(frameLayout, tdsImageView2);
        this.access100 = tdsImageView2;
        frameLayout.setVisibility(4);
        setProxySelectorokhttp.onExtraCallbackWithResult(this, frameLayout);
        this.IAuthTabCallbackStubProxy = frameLayout;
        Paint paint = new Paint();
        paint.setColor(0);
        this.asBinder = paint;
        Paint paint2 = new Paint();
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.onExtraCallbackWithResult = paint2;
        int i5 = onRelationshipValidationResult + 59;
        ICustomTabsCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 68 / 0;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BlankHighlightV3(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onRelationshipValidationResult;
            int i4 = i3 + 59;
            ICustomTabsCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 21;
            ICustomTabsCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i9 = onRelationshipValidationResult + 47;
            ICustomTabsCallbackDefault = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        BlankHighlightV3 blankHighlightV3 = (BlankHighlightV3) objArr[0];
        Function0<Unit> function0 = (Function0) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 101;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        blankHighlightV3.IAuthTabCallback(function0);
        int i4 = ICustomTabsCallbackDefault + 5;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static final /* synthetic */ boolean onTransact(BlankHighlightV3 blankHighlightV3) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 93;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 != 0) {
            blankHighlightV3.access100();
            throw null;
        }
        boolean zAccess100 = blankHighlightV3.access100();
        int i3 = onRelationshipValidationResult + 11;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return zAccess100;
    }

    @Override // o.generateAppWithState
    public /* bridge */ boolean onExtraCallbackWithResult(@NotNull Rect rect, float f, float f2) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 45;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = super.onExtraCallbackWithResult(rect, f, f2);
        if (i3 != 0) {
            int i4 = 1 / 0;
        }
        int i5 = onRelationshipValidationResult + 91;
        ICustomTabsCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return zOnExtraCallbackWithResult;
    }

    public ViewGroup onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 71;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onWarmupCompleted;
        }
        throw null;
    }

    public void setDecorView(@Nullable ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 11;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        int i4 = i2 % 2;
        this.onWarmupCompleted = viewGroup;
        int i5 = i3 + 15;
        onRelationshipValidationResult = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public runOnUiThreadDelayed IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 27;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        runOnUiThreadDelayed runonuithreaddelayed = this.ICustomTabsCallback;
        if (i3 == 0) {
            int i4 = 76 / 0;
        }
        return runonuithreaddelayed;
    }

    public void setStartTimeline(@Nullable runOnUiThreadDelayed runonuithreaddelayed) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 23;
        int i3 = i2 % 128;
        onRelationshipValidationResult = i3;
        int i4 = i2 % 2;
        this.ICustomTabsCallback = runonuithreaddelayed;
        int i5 = i3 + 115;
        ICustomTabsCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public runOnUiThreadDelayed onExtraCallback() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult;
        int i3 = i2 + 1;
        ICustomTabsCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        runOnUiThreadDelayed runonuithreaddelayed = this.IAuthTabCallbackDefault;
        int i4 = i2 + 93;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return runonuithreaddelayed;
    }

    public void setEndTimeline(@Nullable runOnUiThreadDelayed runonuithreaddelayed) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault;
        int i3 = i2 + 111;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallbackDefault = runonuithreaddelayed;
        int i5 = i2 + 9;
        onRelationshipValidationResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public View asInterface() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 67;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        int i4 = i2 % 2;
        View view = this.onPostMessage;
        int i5 = i3 + 123;
        onRelationshipValidationResult = i5 % 128;
        int i6 = i5 % 2;
        return view;
    }

    public void setTargetView(@Nullable View view) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult;
        int i3 = i2 + 39;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        this.onPostMessage = view;
        if (i4 == 0) {
            int i5 = 85 / 0;
        }
        int i6 = i2 + 29;
        ICustomTabsCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
    }

    public void setMessage(@Nullable String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault;
        int i3 = i2 + 77;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        this.access000 = str;
        int i5 = i2 + 101;
        onRelationshipValidationResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setMessageAlign(@NotNull generateAppWithState.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 119;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        this.IAuthTabCallback_Parcel = onextracallback;
        int i4 = onRelationshipValidationResult + 93;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ViewGroup onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 35;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        int i4 = i2 % 2;
        ViewGroup viewGroup = this.readTypedObject;
        int i5 = i3 + 7;
        onRelationshipValidationResult = i5 % 128;
        int i6 = i5 % 2;
        return viewGroup;
    }

    public void setParentViewGroup(@Nullable ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 81;
        int i3 = i2 % 128;
        onRelationshipValidationResult = i3;
        int i4 = i2 % 2;
        this.readTypedObject = viewGroup;
        int i5 = i3 + 67;
        ICustomTabsCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public Rect IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 25;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onMessageChannelReady;
        }
        throw null;
    }

    public void setTargetRect(@NotNull Rect rect) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 3;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(rect, "");
        this.onMessageChannelReady = rect;
        int i4 = onRelationshipValidationResult + 41;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 16 / 0;
        }
    }

    public float IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 109;
        int i3 = i2 % 128;
        onRelationshipValidationResult = i3;
        int i4 = i2 % 2;
        float f = this.onActivityLayout;
        int i5 = i3 + Imgproc.COLOR_YUV2RGB_YVYU;
        ICustomTabsCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public void setTargetViewX(float f) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 97;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        int i4 = i2 % 2;
        this.onActivityLayout = f;
        int i5 = i3 + 9;
        onRelationshipValidationResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public float IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault;
        int i3 = i2 + 21;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        float f = this.onActivityResized;
        int i5 = i2 + 119;
        onRelationshipValidationResult = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public void setTargetViewY(float f) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 93;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        int i4 = i2 % 2;
        this.onActivityResized = f;
        if (i4 == 0) {
            int i5 = 17 / 0;
        }
        int i6 = i3 + 17;
        onRelationshipValidationResult = i6 % 128;
        int i7 = i6 % 2;
    }

    public int[] asBinder() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult;
        int i3 = i2 + 23;
        ICustomTabsCallbackDefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int[] iArr = this.onMinimized;
        int i4 = i2 + 83;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return iArr;
        }
        throw null;
    }

    public void setTargetViewPosition(@NotNull int[] iArr) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 19;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(iArr, "");
            this.onMinimized = iArr;
            int i3 = 4 / 0;
        } else {
            Intrinsics.checkNotNullParameter(iArr, "");
            this.onMinimized = iArr;
        }
        int i4 = ICustomTabsCallbackDefault + 45;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Integer onTransact() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 7;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.extraCallbackWithResult;
        }
        throw null;
    }

    public void setPlayCount(@Nullable Integer num) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault;
        int i3 = i2 + 119;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        this.extraCallbackWithResult = num;
        int i5 = i2 + Imgproc.COLOR_YUV2RGB_YVYU;
        onRelationshipValidationResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public View IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 73;
        int i3 = i2 % 128;
        onRelationshipValidationResult = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        View view = this.IAuthTabCallback;
        int i4 = i3 + 89;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return view;
    }

    public void setDim(@NotNull View view) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 47;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            this.IAuthTabCallback = view;
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            this.IAuthTabCallback = view;
            throw null;
        }
    }

    private static final Unit IAuthTabCallbackStubProxy(BlankHighlightV3 blankHighlightV3) {
        boolean z;
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 71;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
            onExtraCallback(53083928, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -53083922, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{blankHighlightV3}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback);
            z = true;
        } else {
            int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
            onExtraCallback(53083928, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -53083922, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{blankHighlightV3}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback2);
            z = false;
        }
        blankHighlightV3.onExtraCallbackWithResult(z);
        Unit unit = Unit.INSTANCE;
        int i3 = ICustomTabsCallbackDefault + 125;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onWarmupCompleted(View view, BlankHighlightV3 blankHighlightV3) {
        int i = 2 % 2;
        view.getLocationOnScreen(blankHighlightV3.asBinder());
        blankHighlightV3.setTargetRect(new Rect(blankHighlightV3.asBinder()[0], blankHighlightV3.asBinder()[1], blankHighlightV3.asBinder()[0] + view.getWidth(), blankHighlightV3.asBinder()[1] + view.getHeight()));
        if (blankHighlightV3.isAttachedToWindow()) {
            blankHighlightV3.IAuthTabCallback((Function0<Unit>) new BlankHighlightV3$.ExternalSyntheticLambda10(blankHighlightV3));
            int i2 = onRelationshipValidationResult + 5;
            ICustomTabsCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
        }
        blankHighlightV3.getInterfaceDescriptor();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.generateAppWithState
    public void onExtraCallbackWithResult(@NotNull Rect rect) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 7;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(rect, "");
        setTargetRect(rect);
        if (isAttachedToWindow()) {
            IAuthTabCallback((Function0<Unit>) new Function0() { // from class: im.toss.uikit.widget.tooltip.BlankHighlightV3$$ExternalSyntheticLambda9
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i4 = 2 % 2;
                    int i5 = onExtraCallback + 21;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 == 0) {
                        throw null;
                    }
                    Unit unit = (Unit) BlankHighlightV3.onExtraCallback(-735986672, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 735986673, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{this.f$0}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
                    int i6 = onExtraCallback + 123;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    return unit;
                }
            });
        }
        getInterfaceDescriptor();
        int i4 = ICustomTabsCallbackDefault + 89;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 29 / 0;
        }
    }

    public static /* synthetic */ void setTargetView$default(BlankHighlightV3 blankHighlightV3, View view, ViewGroup viewGroup, ViewGroup viewGroup2, Integer num, Integer num2, generateAppWithState.onExtraCallbackWithResult onextracallbackwithresult, long j, int i, Object obj) {
        Integer num3;
        int i2 = 2 % 2;
        int i3 = onRelationshipValidationResult;
        int i4 = i3 + 23;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 != 0 ? (i & 8) == 0 : (i & 3) == 0) {
            num3 = num;
        } else {
            int i5 = i3 + 5;
            ICustomTabsCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            num3 = null;
        }
        blankHighlightV3.setTargetView(view, viewGroup, viewGroup2, num3, (i & 16) != 0 ? null : num2, onextracallbackwithresult, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036 A[PHI: r3
      0x0036: PHI (r3v8 android.view.ViewGroup) = (r3v7 android.view.ViewGroup), (r3v11 android.view.ViewGroup) binds: [B:10:0x0034, B:7:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setTargetView(@NotNull View view, @NotNull final ViewGroup viewGroup, @NotNull final ViewGroup viewGroup2, @Nullable final Integer num, @Nullable final Integer num2, @Nullable final generateAppWithState.onExtraCallbackWithResult onextracallbackwithresult, final long j) {
        ViewGroup viewGroup3;
        View view2 = view;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(viewGroup2, "");
        if (!(!(view2 instanceof ViewGroup))) {
            int i2 = onRelationshipValidationResult + 57;
            ICustomTabsCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                viewGroup3 = (ViewGroup) view2;
                if (viewGroup3.getChildCount() == 0) {
                    if (!(!(viewGroup3.getChildAt(0) instanceof TdsListRowV1View))) {
                        int i3 = ICustomTabsCallbackDefault + 71;
                        onRelationshipValidationResult = i3 % 128;
                        View childAt = i3 % 2 != 0 ? viewGroup3.getChildAt(0) : viewGroup3.getChildAt(0);
                        Intrinsics.checkNotNull(childAt, "");
                        view2 = (TdsListRowV1View) childAt;
                        int i4 = onRelationshipValidationResult + 51;
                        ICustomTabsCallbackDefault = i4 % 128;
                        int i5 = i4 % 2;
                    }
                }
            } else {
                viewGroup3 = (ViewGroup) view2;
                if (viewGroup3.getChildCount() == 1) {
                }
            }
        }
        setTargetView(view2);
        final View viewAsInterface = asInterface();
        if (viewAsInterface == null) {
            return;
        }
        viewAsInterface.post(new Runnable() { // from class: im.toss.uikit.widget.tooltip.BlankHighlightV3$$ExternalSyntheticLambda6
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            @Override // java.lang.Runnable
            public final void run() {
                int i6 = 2 % 2;
                int i7 = onWarmupCompleted + 31;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                BlankHighlightV3.onExtraCallback(viewAsInterface, this, viewGroup, viewGroup2, num, num2, onextracallbackwithresult, j);
                int i9 = onNavigationEvent + 109;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
            }
        });
    }

    private static final void IAuthTabCallback(View view, BlankHighlightV3 blankHighlightV3, ViewGroup viewGroup, ViewGroup viewGroup2, Integer num, Integer num2, generateAppWithState.onExtraCallbackWithResult onextracallbackwithresult, long j) {
        int i = 2 % 2;
        view.getLocationOnScreen(blankHighlightV3.asBinder());
        blankHighlightV3.setTargetRect(new Rect(blankHighlightV3.asBinder()[0], blankHighlightV3.asBinder()[1], blankHighlightV3.asBinder()[0] + view.getWidth(), blankHighlightV3.asBinder()[1] + view.getHeight()));
        blankHighlightV3.IAuthTabCallback(viewGroup, viewGroup2, num, num2, onextracallbackwithresult, j);
        int i2 = ICustomTabsCallbackDefault + 41;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void setTargetRect$default(BlankHighlightV3 blankHighlightV3, Rect rect, ViewGroup viewGroup, ViewGroup viewGroup2, Integer num, Integer num2, generateAppWithState.onExtraCallbackWithResult onextracallbackwithresult, long j, int i, Object obj) {
        Integer num3;
        int i2 = 2 % 2;
        int i3 = onRelationshipValidationResult + 75;
        int i4 = i3 % 128;
        ICustomTabsCallbackDefault = i4;
        Integer num4 = (i3 % 2 != 0 ? (i & 8) == 0 : (i & 85) == 0) ? num : null;
        if ((i & 16) != 0) {
            int i5 = i4 + 19;
            onRelationshipValidationResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 28 / 0;
            }
            num3 = null;
        } else {
            num3 = num2;
        }
        blankHighlightV3.setTargetRect(rect, viewGroup, viewGroup2, num4, num3, onextracallbackwithresult, j);
    }

    public final void setTargetRect(@NotNull Rect rect, @NotNull ViewGroup viewGroup, @NotNull ViewGroup viewGroup2, @Nullable Integer num, @Nullable Integer num2, @Nullable generateAppWithState.onExtraCallbackWithResult onextracallbackwithresult, long j) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 113;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(rect, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            Intrinsics.checkNotNullParameter(viewGroup2, "");
            setTargetRect(rect);
            IAuthTabCallback(viewGroup, viewGroup2, num, num2, onextracallbackwithresult, j);
            return;
        }
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(viewGroup2, "");
        setTargetRect(rect);
        IAuthTabCallback(viewGroup, viewGroup2, num, num2, onextracallbackwithresult, j);
        throw null;
    }

    public static final class onWarmupCompleted implements getAdService {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public onWarmupCompleted(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 41;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = onNavigationEvent + 25;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 93 / 0;
            }
            return getspecialfeatureoptinstatus;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void IAuthTabCallbackDefault(final BlankHighlightV3 blankHighlightV3) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 31;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        if (blankHighlightV3.isAttachedToWindow()) {
            blankHighlightV3.IAuthTabCallback((Function0<Unit>) new Function0() { // from class: im.toss.uikit.widget.tooltip.BlankHighlightV3$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i4 = 2 % 2;
                    int i5 = onWarmupCompleted + 41;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    BlankHighlightV3 blankHighlightV32 = this.f$0;
                    if (i6 == 0) {
                        return BlankHighlightV3.onExtraCallback(blankHighlightV32);
                    }
                    BlankHighlightV3.onExtraCallback(blankHighlightV32);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            });
        }
        int i4 = ICustomTabsCallbackDefault + 7;
        onRelationshipValidationResult = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit asBinder(BlankHighlightV3 blankHighlightV3) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 59;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
            onExtraCallback(53083928, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -53083922, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{blankHighlightV3}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback);
        } else {
            int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
            onExtraCallback(53083928, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -53083922, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{blankHighlightV3}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback2);
        }
        blankHighlightV3.onExtraCallbackWithResult(true);
        Unit unit = Unit.INSTANCE;
        int i3 = onRelationshipValidationResult + 123;
        ICustomTabsCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 12 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IAuthTabCallback(ViewGroup viewGroup, ViewGroup viewGroup2, Integer num, Integer num2, generateAppWithState.onExtraCallbackWithResult onextracallbackwithresult, long j) {
        int iIntValue;
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 1;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 != 0) {
            setDecorView(viewGroup);
            int i3 = 27 / 0;
            if (num != null) {
                iIntValue = num.intValue();
                int i4 = ICustomTabsCallbackDefault + 63;
                onRelationshipValidationResult = i4 % 128;
                int i5 = i4 % 2;
            } else {
                iIntValue = -1;
            }
        } else {
            setDecorView(viewGroup);
            if (num != null) {
            }
        }
        this.getInterfaceDescriptor = iIntValue;
        setPlayCount(num2);
        setParentViewGroup(viewGroup2);
        setOnDismissListener(onextracallbackwithresult);
        postDelayed(new Runnable() { // from class: im.toss.uikit.widget.tooltip.BlankHighlightV3$$ExternalSyntheticLambda17
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            @Override // java.lang.Runnable
            public final void run() {
                int i6 = 2 % 2;
                int i7 = onNavigationEvent + 51;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                BlankHighlightV3.onNavigationEvent(this.f$0);
                int i9 = onNavigationEvent + Imgproc.COLOR_YUV2RGB_YVYU;
                onExtraCallback = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 22 / 0;
                }
            }
        }, j);
        getInterfaceDescriptor();
        int i6 = onRelationshipValidationResult + 69;
        ICustomTabsCallbackDefault = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 21;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int i3 = 67 / 0;
            if (!varyFields.onWarmupCompleted(context)) {
                IAuthTabCallback().setOnTouchListener(new View.OnTouchListener() { // from class: im.toss.uikit.widget.tooltip.BlankHighlightV3$$ExternalSyntheticLambda11
                    private static int onExtraCallback = 1;
                    private static int onWarmupCompleted;

                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        int i4 = 2 % 2;
                        int i5 = onExtraCallback + 93;
                        onWarmupCompleted = i5 % 128;
                        int i6 = i5 % 2;
                        boolean zOnExtraCallbackWithResult = BlankHighlightV3.onExtraCallbackWithResult(this.f$0, view, motionEvent);
                        int i7 = onExtraCallback + 19;
                        onWarmupCompleted = i7 % 128;
                        if (i7 % 2 != 0) {
                            int i8 = 7 / 0;
                        }
                        return zOnExtraCallbackWithResult;
                    }
                });
            }
        } else {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            if (!varyFields.onWarmupCompleted(context2)) {
            }
        }
        int i4 = ICustomTabsCallbackDefault + 63;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 87 / 0;
        }
    }

    private static final boolean onExtraCallback(BlankHighlightV3 blankHighlightV3, View view, MotionEvent motionEvent) {
        View viewAsInterface;
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 107;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int action = motionEvent.getAction();
        if (action != 0) {
            int i4 = onRelationshipValidationResult + 1;
            int i5 = i4 % 128;
            ICustomTabsCallbackDefault = i5;
            int i6 = i4 % 2;
            if (action != 1) {
                if (action == 3) {
                    if (!blankHighlightV3.onTransact) {
                        View viewAsInterface2 = blankHighlightV3.asInterface();
                        if (viewAsInterface2 != null) {
                            int i7 = ICustomTabsCallbackDefault + 109;
                            onRelationshipValidationResult = i7 % 128;
                            if (i7 % 2 != 0) {
                                viewAsInterface2.setPressed(true);
                            } else {
                                viewAsInterface2.setPressed(false);
                            }
                            int i8 = onRelationshipValidationResult + 35;
                            ICustomTabsCallbackDefault = i8 % 128;
                            int i9 = i8 % 2;
                        }
                        View viewAsInterface3 = blankHighlightV3.asInterface();
                        if (viewAsInterface3 != null) {
                            int i10 = ICustomTabsCallbackDefault + 49;
                            onRelationshipValidationResult = i10 % 128;
                            int i11 = i10 % 2;
                            viewAsInterface3.onTouchEvent(motionEvent);
                        }
                    }
                    blankHighlightV3.onTransact = false;
                }
                return false;
            }
            if (!blankHighlightV3.onTransact) {
                int i12 = i5 + 73;
                onRelationshipValidationResult = i12 % 128;
                int i13 = i12 % 2;
                View viewAsInterface4 = blankHighlightV3.asInterface();
                if (viewAsInterface4 != null) {
                    viewAsInterface4.setPressed(false);
                }
                View viewAsInterface5 = blankHighlightV3.asInterface();
                if (viewAsInterface5 != null) {
                    viewAsInterface5.onTouchEvent(motionEvent);
                }
                if (blankHighlightV3.onExtraCallbackWithResult(blankHighlightV3.IAuthTabCallbackDefault(), motionEvent.getX(), motionEvent.getY()) && (viewAsInterface = blankHighlightV3.asInterface()) != null) {
                    int i14 = ICustomTabsCallbackDefault + 5;
                    onRelationshipValidationResult = i14 % 128;
                    int i15 = i14 % 2;
                    viewAsInterface.performClick();
                }
            }
            blankHighlightV3.onTransact = false;
        } else {
            boolean zOnExtraCallbackWithResult = blankHighlightV3.onExtraCallbackWithResult(blankHighlightV3.IAuthTabCallbackDefault(), motionEvent.getX(), motionEvent.getY());
            blankHighlightV3.onTransact = !zOnExtraCallbackWithResult;
            if (zOnExtraCallbackWithResult) {
                int i16 = onRelationshipValidationResult + 1;
                ICustomTabsCallbackDefault = i16 % 128;
                int i17 = i16 % 2;
                View viewAsInterface6 = blankHighlightV3.asInterface();
                if (viewAsInterface6 != null) {
                    viewAsInterface6.setPressed(true);
                    viewAsInterface6.onTouchEvent(motionEvent);
                }
            }
        }
        blankHighlightV3.onNavigationEvent();
        int i18 = ICustomTabsCallbackDefault + 27;
        onRelationshipValidationResult = i18 % 128;
        int i19 = i18 % 2;
        return false;
    }

    public final void setOnDismissListener(@Nullable generateAppWithState.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 111;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        int i4 = i2 % 2;
        this.writeTypedObject = onextracallbackwithresult;
        int i5 = i3 + 31;
        onRelationshipValidationResult = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onDetachedFromWindow() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 77;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        super/*android.view.View*/.onDetachedFromWindow();
        runOnUiThreadDelayed runonuithreaddelayedIAuthTabCallbackStub = IAuthTabCallbackStub();
        if (runonuithreaddelayedIAuthTabCallbackStub != null) {
            runonuithreaddelayedIAuthTabCallbackStub.onNavigationEvent();
        }
        runOnUiThreadDelayed runonuithreaddelayedOnExtraCallback = onExtraCallback();
        if (runonuithreaddelayedOnExtraCallback != null) {
            runonuithreaddelayedOnExtraCallback.onNavigationEvent();
        }
        setStartTimeline(null);
        setEndTimeline(null);
        int i4 = ICustomTabsCallbackDefault + 125;
        onRelationshipValidationResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onNavigationEvent() {
        int i = 2 % 2;
        if (this.asInterface) {
            return;
        }
        this.asInterface = true;
        runOnUiThreadDelayed runonuithreaddelayedOnExtraCallback = onExtraCallback();
        if (runonuithreaddelayedOnExtraCallback != null) {
            int i2 = ICustomTabsCallbackDefault + 9;
            onRelationshipValidationResult = i2 % 128;
            if (i2 % 2 != 0) {
                if (!runonuithreaddelayedOnExtraCallback.postMessage()) {
                    return;
                }
            } else if (runonuithreaddelayedOnExtraCallback.postMessage()) {
                return;
            }
        }
        onWarmupCompleted(getAppDataMetadata.USER_TOUCHED);
        int i3 = ICustomTabsCallbackDefault + 125;
        onRelationshipValidationResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 65 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallback(Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 73;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this);
        if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult != null) {
            int i4 = onRelationshipValidationResult + 65;
            ICustomTabsCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult);
            if (textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent != null) {
                onLoadStarted.onExtraCallback(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, null, null, new onExtraCallback(function0, null), 3, null);
                int i6 = onRelationshipValidationResult + 97;
                ICustomTabsCallbackDefault = i6 % 128;
                int i7 = i6 % 2;
            }
        }
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Function0<Unit> $runnable;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(Function0<Unit> function0, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$runnable = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = BlankHighlightV3.this.new onExtraCallback(this.$runnable, access13800Var);
            int i2 = onExtraCallbackWithResult + 59;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 81;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            int i4 = onWarmupCompleted + 91;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnWarmupCompleted;
            }
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 3;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((onExtraCallback) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 61;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onWarmupCompleted + 93;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0 ? i2 != 1 : i2 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(100L, this) == objOnExtraCallback) {
                    int i4 = onWarmupCompleted + 79;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    return objOnExtraCallback;
                }
            }
            if (!BlankHighlightV3.onTransact(BlankHighlightV3.this)) {
                int i6 = onWarmupCompleted + 69;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                BlankHighlightV3.onExtraCallback(-1331808571, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 1331808574, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{BlankHighlightV3.this, this.$runnable}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
            } else {
                this.$runnable.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    private final boolean access100() {
        int i = 2 % 2;
        if (asInterface() == null) {
            setTargetViewX(IAuthTabCallbackDefault().left);
            setTargetViewY(IAuthTabCallbackDefault().top);
            int i2 = ICustomTabsCallbackDefault + 19;
            onRelationshipValidationResult = i2 % 128;
            if (i2 % 2 == 0) {
                return true;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        View viewAsInterface = asInterface();
        if (viewAsInterface == null) {
            int i3 = onRelationshipValidationResult + 39;
            ICustomTabsCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        int[] iArr = new int[2];
        viewAsInterface.getLocationOnScreen(iArr);
        float f = iArr[0];
        float f2 = iArr[1];
        boolean z = IAuthTabCallbackStubProxy() == f && IAuthTabCallback_Parcel() == f2;
        setTargetViewX(f);
        setTargetViewY(f2);
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult(final boolean z) {
        int i = 2 % 2;
        post(new Runnable() { // from class: im.toss.uikit.widget.tooltip.BlankHighlightV3$$ExternalSyntheticLambda16
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 3;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                BlankHighlightV3 blankHighlightV3 = this.f$0;
                if (i4 != 0) {
                    BlankHighlightV3.IAuthTabCallback(blankHighlightV3, z);
                } else {
                    BlankHighlightV3.IAuthTabCallback(blankHighlightV3, z);
                    throw null;
                }
            }
        });
        int i2 = onRelationshipValidationResult + 77;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onTransact(attachAppLovinSdk attachapplovinsdk) {
        int i;
        int i2 = 2 % 2;
        int i3 = onRelationshipValidationResult + 95;
        ICustomTabsCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asInterface());
            i = 4925;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asInterface());
            i = 1500;
        }
        attachapplovinsdk.IAuthTabCallback(i);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i;
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackDefault + 123;
        onRelationshipValidationResult = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
            i = 16076;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
            i = 800;
        }
        attachapplovinsdk.IAuthTabCallback(i);
        attachapplovinsdk.onExtraCallback(0);
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackDefault(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 53;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
        attachapplovinsdk.IAuthTabCallback(800);
        attachapplovinsdk.onExtraCallback(200);
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallbackDefault + 37;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 94 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallback(AppLovinSdkSettings appLovinSdkSettings) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(0.3f);
        isMuted.onExtraCallback(appLovinSdkSettings, fValueOf, fValueOf2, new Function1() { // from class: im.toss.uikit.widget.tooltip.BlankHighlightV3$$ExternalSyntheticLambda14
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 9;
                onExtraCallbackWithResult = i3 % 128;
                Object obj2 = null;
                attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj;
                if (i3 % 2 != 0) {
                    BlankHighlightV3.onExtraCallbackWithResult(attachapplovinsdk);
                    obj2.hashCode();
                    throw null;
                }
                Unit unitOnExtraCallbackWithResult = BlankHighlightV3.onExtraCallbackWithResult(attachapplovinsdk);
                int i4 = onExtraCallback + Imgproc.COLOR_YUV2RGB_YVYU;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return unitOnExtraCallbackWithResult;
                }
                obj2.hashCode();
                throw null;
            }
        });
        isMuted.onExtraCallback(appLovinSdkSettings, fValueOf2, fValueOf, new Function1() { // from class: im.toss.uikit.widget.tooltip.BlankHighlightV3$$ExternalSyntheticLambda15
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 43;
                onExtraCallbackWithResult = i3 % 128;
                attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj;
                if (i3 % 2 != 0) {
                    BlankHighlightV3.onExtraCallback(attachapplovinsdk);
                    throw null;
                }
                Unit unitOnExtraCallback = BlankHighlightV3.onExtraCallback(attachapplovinsdk);
                int i4 = onExtraCallbackWithResult + 123;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return unitOnExtraCallback;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = onRelationshipValidationResult + 67;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 49 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        int i;
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i2 = 2 % 2;
        int i3 = onRelationshipValidationResult + 19;
        ICustomTabsCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
            attachapplovinsdk.IAuthTabCallback(8635);
            i = 18424;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
            attachapplovinsdk.IAuthTabCallback(1500);
            i = 850;
        }
        attachapplovinsdk.onExtraCallback(i);
        Unit unit = Unit.INSTANCE;
        int i4 = onRelationshipValidationResult + 81;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(AppLovinSdkSettings appLovinSdkSettings) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(0.8f);
        isMuted.onExtraCallback(appLovinSdkSettings, fValueOf, fValueOf2, new Function1() { // from class: im.toss.uikit.widget.tooltip.BlankHighlightV3$$ExternalSyntheticLambda7
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 55;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnWarmupCompleted = BlankHighlightV3.onWarmupCompleted((attachAppLovinSdk) obj);
                int i5 = onWarmupCompleted + 93;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    return unitOnWarmupCompleted;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
        isMuted.onExtraCallback(appLovinSdkSettings, fValueOf2, fValueOf, new Function1() { // from class: im.toss.uikit.widget.tooltip.BlankHighlightV3$$ExternalSyntheticLambda8
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 55;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnNavigationEvent = BlankHighlightV3.onNavigationEvent((attachAppLovinSdk) obj);
                int i5 = onExtraCallback + 99;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    return unitOnNavigationEvent;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = onRelationshipValidationResult + 39;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackStub(BlankHighlightV3 blankHighlightV3) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 49;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 != 0) {
            blankHighlightV3.IAuthTabCallbackStubProxy.setVisibility(1);
        } else {
            blankHighlightV3.IAuthTabCallbackStubProxy.setVisibility(0);
        }
        blankHighlightV3.IAuthTabCallback().setVisibility(0);
        Unit unit = Unit.INSTANCE;
        int i3 = ICustomTabsCallbackDefault + 75;
        onRelationshipValidationResult = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit access100(BlankHighlightV3 blankHighlightV3) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 125;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            blankHighlightV3.onWarmupCompleted(getAppDataMetadata.REPEAT_FINISHED);
            Unit unit = Unit.INSTANCE;
            int i3 = onRelationshipValidationResult + 81;
            ICustomTabsCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
        blankHighlightV3.onWarmupCompleted(getAppDataMetadata.REPEAT_FINISHED);
        Unit unit2 = Unit.INSTANCE;
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onExtraCallback(final BlankHighlightV3 blankHighlightV3, boolean z) {
        int iWidth;
        int iHeight;
        runOnUiThreadDelayed runonuithreaddelayedIAuthTabCallbackDefault;
        runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted;
        int i = 2 % 2;
        View viewAsInterface = blankHighlightV3.asInterface();
        if (viewAsInterface != null) {
            int i2 = ICustomTabsCallbackDefault + 111;
            onRelationshipValidationResult = i2 % 128;
            if (i2 % 2 != 0) {
                viewAsInterface.getWidth();
                throw null;
            }
            iWidth = viewAsInterface.getWidth();
        } else {
            iWidth = blankHighlightV3.IAuthTabCallbackDefault().width();
        }
        View viewAsInterface2 = blankHighlightV3.asInterface();
        if (viewAsInterface2 != null) {
            int i3 = ICustomTabsCallbackDefault + 111;
            onRelationshipValidationResult = i3 % 128;
            int i4 = i3 % 2;
            iHeight = viewAsInterface2.getHeight();
        } else {
            iHeight = blankHighlightV3.IAuthTabCallbackDefault().height();
        }
        float f = iWidth;
        float fIAuthTabCallbackStubProxy = ((blankHighlightV3.IAuthTabCallbackStubProxy() + (f / 2.0f)) - f) - (blankHighlightV3.IAuthTabCallbackStubProxy.getWidth() / 2);
        blankHighlightV3.extraCallback = fIAuthTabCallbackStubProxy;
        blankHighlightV3.IAuthTabCallbackStubProxy.setX(fIAuthTabCallbackStubProxy);
        blankHighlightV3.IAuthTabCallbackStubProxy.setY((blankHighlightV3.IAuthTabCallback_Parcel() - (blankHighlightV3.IAuthTabCallbackStubProxy.getHeight() / 2)) + (iHeight / 2));
        int iOnExtraCallbackWithResult = blankHighlightV3.getInterfaceDescriptor;
        int iIntValue = -1;
        if (iOnExtraCallbackWithResult == -1) {
            iOnExtraCallbackWithResult = setTagsokhttp.onExtraCallbackWithResult(blankHighlightV3, Integer.valueOf(iHeight > varyMatches.IAuthTabCallback(blankHighlightV3, 60) ? 20 : 18));
        }
        blankHighlightV3.getInterfaceDescriptor = iOnExtraCallbackWithResult;
        if (z) {
            int i5 = onRelationshipValidationResult + 109;
            ICustomTabsCallbackDefault = i5 % 128;
            if (i5 % 2 == 0) {
                pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
                getExtraParameters getextraparameters = getExtraParameters.Normal;
                blankHighlightV3.onTransact();
                throw null;
            }
            pxToDp.IAuthTabCallback iAuthTabCallback2 = pxToDp.IAuthTabCallback.onExtraCallback;
            getExtraParameters getextraparameters2 = getExtraParameters.Normal;
            Integer numOnTransact = blankHighlightV3.onTransact();
            if (numOnTransact != null) {
                iIntValue = numOnTransact.intValue();
                int i6 = onRelationshipValidationResult + 35;
                ICustomTabsCallbackDefault = i6 % 128;
                int i7 = i6 % 2;
            }
            int i8 = iIntValue;
            FrameLayout frameLayout = blankHighlightV3.IAuthTabCallbackStubProxy;
            AppLovinSdkSettings appLovinSdkSettings = new AppLovinSdkSettings();
            float f2 = blankHighlightV3.extraCallback;
            AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = isMuted.onExtraCallback(isMuted.IAuthTabCallback_Parcel(appLovinSdkSettings, Float.valueOf(f2), Float.valueOf(f2 + (f * 2.0f)), new Function1() { // from class: im.toss.uikit.widget.tooltip.BlankHighlightV3$$ExternalSyntheticLambda1
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i9 = 2 % 2;
                    int i10 = onNavigationEvent + 5;
                    onWarmupCompleted = i10 % 128;
                    int i11 = i10 % 2;
                    int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
                    Unit unit = (Unit) BlankHighlightV3.onExtraCallback(551492863, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -551492859, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{(attachAppLovinSdk) obj}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback);
                    int i12 = onNavigationEvent + 61;
                    onWarmupCompleted = i12 % 128;
                    if (i12 % 2 == 0) {
                        return unit;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            }), new Function1() { // from class: im.toss.uikit.widget.tooltip.BlankHighlightV3$$ExternalSyntheticLambda2
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i9 = 2 % 2;
                    int i10 = onExtraCallbackWithResult + 107;
                    IAuthTabCallback = i10 % 128;
                    AppLovinSdkSettings appLovinSdkSettings2 = (AppLovinSdkSettings) obj;
                    if (i10 % 2 == 0) {
                        return BlankHighlightV3.IAuthTabCallback(appLovinSdkSettings2);
                    }
                    BlankHighlightV3.IAuthTabCallback(appLovinSdkSettings2);
                    throw null;
                }
            });
            Boolean bool = Boolean.TRUE;
            blankHighlightV3.setStartTimeline(RallysKt.onWarmupCompleted((View) null, iAuthTabCallback2, CollectionsKt__CollectionsKt.listOf((Object[]) new Rally[]{(Rally) RallysKt.onWarmupCompleted(new Object[]{frameLayout, appLovinSdkSettingsOnExtraCallback, 0, null, 0, null, null, bool, 0, 0L, false, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Rally) RallysKt.onWarmupCompleted(new Object[]{blankHighlightV3.IAuthTabCallback(), isMuted.onExtraCallbackWithResult(new AppLovinSdkSettings(), new Function1() { // from class: im.toss.uikit.widget.tooltip.BlankHighlightV3$$ExternalSyntheticLambda3
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i9 = 2 % 2;
                    int i10 = onExtraCallback + 101;
                    onNavigationEvent = i10 % 128;
                    int i11 = i10 % 2;
                    Unit unitOnExtraCallbackWithResult = BlankHighlightV3.onExtraCallbackWithResult((AppLovinSdkSettings) obj);
                    int i12 = onNavigationEvent + 99;
                    onExtraCallback = i12 % 128;
                    int i13 = i12 % 2;
                    return unitOnExtraCallbackWithResult;
                }
            }), 0, null, 0, null, null, bool, 0, 0L, false, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)}), i8, getextraparameters2, 0, (Interpolator) null, (Integer) null, bool, 0, 0L, false, 3809, (Object) null));
            int i9 = ICustomTabsCallbackDefault + 97;
            onRelationshipValidationResult = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 5 / 4;
            }
        } else {
            blankHighlightV3.setStartTimeline(null);
            int i11 = onRelationshipValidationResult + 113;
            ICustomTabsCallbackDefault = i11 % 128;
            int i12 = i11 % 2;
        }
        runOnUiThreadDelayed runonuithreaddelayedIAuthTabCallbackStub = blankHighlightV3.IAuthTabCallbackStub();
        if (runonuithreaddelayedIAuthTabCallbackStub == null || (runonuithreaddelayedIAuthTabCallbackDefault = runOnUiThreadDelayed.IAuthTabCallbackDefault(runonuithreaddelayedIAuthTabCallbackStub, (Object) null, new Function0() { // from class: im.toss.uikit.widget.tooltip.BlankHighlightV3$$ExternalSyntheticLambda4
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i13 = 2 % 2;
                int i14 = onExtraCallbackWithResult + 49;
                onWarmupCompleted = i14 % 128;
                if (i14 % 2 == 0) {
                    BlankHighlightV3.onExtraCallbackWithResult(this.f$0);
                    throw null;
                }
                Unit unitOnExtraCallbackWithResult = BlankHighlightV3.onExtraCallbackWithResult(this.f$0);
                int i15 = onWarmupCompleted + 15;
                onExtraCallbackWithResult = i15 % 128;
                if (i15 % 2 != 0) {
                    int i16 = 84 / 0;
                }
                return unitOnExtraCallbackWithResult;
            }
        }, 1, (Object) null)) == null || (runonuithreaddelayedOnWarmupCompleted = runOnUiThreadDelayed.onWarmupCompleted(runonuithreaddelayedIAuthTabCallbackDefault, (Object) null, new Function0() { // from class: im.toss.uikit.widget.tooltip.BlankHighlightV3$$ExternalSyntheticLambda5
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i13 = 2 % 2;
                int i14 = onExtraCallback + 103;
                IAuthTabCallback = i14 % 128;
                int i15 = i14 % 2;
                Unit unitAsInterface = BlankHighlightV3.asInterface(this.f$0);
                int i16 = IAuthTabCallback + 111;
                onExtraCallback = i16 % 128;
                int i17 = i16 % 2;
                return unitAsInterface;
            }
        }, 1, (Object) null)) == null) {
            return;
        }
        isFireOS.onExtraCallbackWithResult(runonuithreaddelayedOnWarmupCompleted, false, 1, (Object) null);
    }

    private static final Unit onNavigationEvent(BlankHighlightV3 blankHighlightV3, getAppDataMetadata getappdatametadata) {
        int i = 2 % 2;
        blankHighlightV3.IAuthTabCallbackStubProxy.setVisibility(4);
        blankHighlightV3.IAuthTabCallback().setVisibility(4);
        runOnUiThreadDelayed runonuithreaddelayedIAuthTabCallbackStub = blankHighlightV3.IAuthTabCallbackStub();
        if (runonuithreaddelayedIAuthTabCallbackStub != null) {
            runonuithreaddelayedIAuthTabCallbackStub.onNavigationEvent();
        }
        runOnUiThreadDelayed runonuithreaddelayedOnExtraCallback = blankHighlightV3.onExtraCallback();
        if (runonuithreaddelayedOnExtraCallback != null) {
            runonuithreaddelayedOnExtraCallback.onNavigationEvent();
        }
        blankHighlightV3.setStartTimeline(null);
        blankHighlightV3.setEndTimeline(null);
        ViewGroup viewGroupOnExtraCallbackWithResult = blankHighlightV3.onExtraCallbackWithResult();
        if (viewGroupOnExtraCallbackWithResult != null) {
            int i2 = onRelationshipValidationResult + 21;
            ICustomTabsCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            viewGroupOnExtraCallbackWithResult.removeView(blankHighlightV3.onWarmupCompleted());
        }
        generateAppWithState.onExtraCallbackWithResult onextracallbackwithresult = blankHighlightV3.writeTypedObject;
        if (onextracallbackwithresult != null) {
            onextracallbackwithresult.onDismiss(getappdatametadata);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = onRelationshipValidationResult + 87;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private final void onWarmupCompleted(final getAppDataMetadata getappdatametadata) {
        runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted;
        int i = 2 % 2;
        pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
        deprecated_dns deprecated_dnsVarAsBinder = deprecated_certificatePinner.onExtraCallbackWithResult.asBinder();
        FrameLayout frameLayout = this.IAuthTabCallbackStubProxy;
        AppLovinSdkSettings appLovinSdkSettings = new AppLovinSdkSettings();
        Float fValueOf = Float.valueOf(0.0f);
        setEndTimeline(RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt__CollectionsKt.listOf((Object[]) new Rally[]{(Rally) RallysKt.onWarmupCompleted(new Object[]{frameLayout, isMuted.onNavigationEvent(appLovinSdkSettings, (Float) null, fValueOf, (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Rally) RallysKt.onWarmupCompleted(new Object[]{IAuthTabCallback(), isMuted.onNavigationEvent(new AppLovinSdkSettings(), (Float) null, fValueOf, (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)}), 0, (getExtraParameters) null, 0, deprecated_dnsVarAsBinder, (Integer) null, Boolean.FALSE, 0, 0L, false, 3769, (Object) null));
        runOnUiThreadDelayed runonuithreaddelayedOnExtraCallback = onExtraCallback();
        if (runonuithreaddelayedOnExtraCallback != null && (runonuithreaddelayedOnWarmupCompleted = runOnUiThreadDelayed.onWarmupCompleted(runonuithreaddelayedOnExtraCallback, (Object) null, new Function0() { // from class: im.toss.uikit.widget.tooltip.BlankHighlightV3$$ExternalSyntheticLambda13
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 19;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Unit unit = (Unit) BlankHighlightV3.onExtraCallback(-1139467437, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 1139467442, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{this.f$0, getappdatametadata}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
                int i5 = onNavigationEvent + 85;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    return unit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, 1, (Object) null)) != null) {
            int i2 = ICustomTabsCallbackDefault + 9;
            onRelationshipValidationResult = i2 % 128;
            int i3 = i2 % 2;
            isFireOS.onExtraCallbackWithResult(runonuithreaddelayedOnWarmupCompleted, false, 1, (Object) null);
            int i4 = onRelationshipValidationResult + 87;
            ICustomTabsCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 4 % 4;
            }
        }
        int i6 = onRelationshipValidationResult + 75;
        ICustomTabsCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void dispatchDraw(@NotNull Canvas canvas) {
        float fIAuthTabCallbackStubProxy;
        float fIAuthTabCallback_Parcel;
        float f;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        View viewAsInterface = asInterface();
        int width = viewAsInterface != null ? viewAsInterface.getWidth() : IAuthTabCallbackDefault().width();
        View viewAsInterface2 = asInterface();
        int height = viewAsInterface2 != null ? viewAsInterface2.getHeight() : IAuthTabCallbackDefault().height();
        if (asInterface() != null) {
            int i2 = ICustomTabsCallbackDefault + 5;
            onRelationshipValidationResult = i2 % 128;
            int i3 = i2 % 2;
            fIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy();
        } else {
            fIAuthTabCallbackStubProxy = IAuthTabCallbackDefault().left;
        }
        if (asInterface() != null) {
            int i4 = onRelationshipValidationResult + 113;
            ICustomTabsCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            fIAuthTabCallback_Parcel = IAuthTabCallback_Parcel();
        } else {
            fIAuthTabCallback_Parcel = IAuthTabCallbackDefault().top;
        }
        float f2 = fIAuthTabCallback_Parcel;
        int i6 = this.IAuthTabCallbackStub;
        float f3 = i6;
        float f4 = fIAuthTabCallbackStubProxy < f3 ? f3 + fIAuthTabCallbackStubProxy : fIAuthTabCallbackStubProxy;
        float f5 = fIAuthTabCallbackStubProxy + width;
        int i7 = this.onNavigationEvent.widthPixels;
        float f6 = i7 - i6;
        if (f5 >= f6) {
            int i8 = onRelationshipValidationResult + 3;
            ICustomTabsCallbackDefault = i8 % 128;
            if (i8 % 2 == 0) {
                f6 = i7 << i6;
            }
            f = f6;
        } else {
            f = f5;
        }
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.asBinder);
        super.dispatchDraw(canvas);
        Path path = new Path();
        float f7 = this.getInterfaceDescriptor;
        path.addRoundRect(f4, f2, f, f2 + height, f7, f7, Path.Direction.CW);
        canvas.drawPath(path, this.onExtraCallbackWithResult);
        canvas.restoreToCount(iSaveLayer);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        BlankHighlightV3 blankHighlightV3 = (BlankHighlightV3) objArr[0];
        int i = 2 % 2;
        View viewAsInterface = blankHighlightV3.asInterface();
        if (viewAsInterface != null) {
            int i2 = onRelationshipValidationResult + 111;
            ICustomTabsCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            viewAsInterface.getWidth();
            int i4 = onRelationshipValidationResult + 75;
            ICustomTabsCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
        } else {
            blankHighlightV3.IAuthTabCallbackDefault().width();
        }
        View viewAsInterface2 = blankHighlightV3.asInterface();
        int height = viewAsInterface2 != null ? viewAsInterface2.getHeight() : blankHighlightV3.IAuthTabCallbackDefault().height();
        FrameLayout frameLayout = blankHighlightV3.IAuthTabCallbackStubProxy;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        int i6 = onRelationshipValidationResult + 77;
        ICustomTabsCallbackDefault = i6 % 128;
        float f = height;
        if (i6 % 2 == 0) {
            int i7 = (int) (f % 5.0f);
            layoutParams.width = i7;
            layoutParams.height = i7;
            frameLayout.setLayoutParams(layoutParams);
            return null;
        }
        int i8 = (int) (f * 5.0f);
        layoutParams.width = i8;
        layoutParams.height = i8;
        frameLayout.setLayoutParams(layoutParams);
        return null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(BlankHighlightV3 blankHighlightV3, getAppDataMetadata getappdatametadata) {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (Unit) onExtraCallback(-1139467437, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 1139467442, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{blankHighlightV3, getappdatametadata}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback);
    }

    public static /* synthetic */ Unit IAuthTabCallback(attachAppLovinSdk attachapplovinsdk) {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (Unit) onExtraCallback(551492863, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -551492859, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{attachapplovinsdk}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback);
    }

    public static /* synthetic */ Unit onWarmupCompleted(BlankHighlightV3 blankHighlightV3) {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (Unit) onExtraCallback(-735986672, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 735986673, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{blankHighlightV3}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback);
    }

    public static final /* synthetic */ void onWarmupCompleted(BlankHighlightV3 blankHighlightV3, Function0 function0) {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        onExtraCallback(-1331808571, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 1331808574, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{blankHighlightV3, function0}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback);
    }

    private final void access000() {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        onExtraCallback(53083928, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -53083922, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{this}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback);
    }

    private static final Unit asBinder(attachAppLovinSdk attachapplovinsdk) {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (Unit) onExtraCallback(-729412332, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 729412334, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{attachapplovinsdk}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback);
    }

    private static final Unit IAuthTabCallbackStub(attachAppLovinSdk attachapplovinsdk) {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (Unit) onExtraCallback(1070306785, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -1070306777, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{attachapplovinsdk}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback);
    }

    private static final Unit asInterface(attachAppLovinSdk attachapplovinsdk) {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (Unit) onExtraCallback(1556542757, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -1556542750, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{attachapplovinsdk}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback);
    }

    private static final Unit IAuthTabCallback_Parcel(BlankHighlightV3 blankHighlightV3) {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (Unit) onExtraCallback(-1310347593, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 1310347593, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{blankHighlightV3}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback);
    }
}
