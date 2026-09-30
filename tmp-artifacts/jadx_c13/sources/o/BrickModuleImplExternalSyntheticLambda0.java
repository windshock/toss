package o;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.core.tracker.entry.TrackState;
import im.toss.features.home.core.ui.compose.dst.HomeAssetSubCategoryHeaderKt$;
import im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.component.widget.TdsNestedScrollView;
import im.toss.tds.view.component.widget.TdsRecyclerView;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import im.toss.tds.view.component.widget.TdsScrollView;
import im.toss.uikit.widget.TdsSpace;
import im.toss.uikit.widget.dialog.BaseTdsBottomSheetV2$;
import im.toss.uikit.widget.dialog.BaseTdsBottomSheetV2$setGesture$touchListener$1$;
import im.toss.uikit.widget.dialog.TdsBottomSheetV2Content;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import o.BrickModuleImplExternalSyntheticLambda0;
import o.SuspendAnimationKtExternalSyntheticLambda4;
import o.initMiniApp;
import o.pxToDp;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class BrickModuleImplExternalSyntheticLambda0 extends openNativeCrashMonitor implements ViewTreeObserver.OnGlobalLayoutListener, SetDetectingInterval {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private static int ICustomTabsCallbackStub = 0;
    private static int extraCommand = 0;
    private static int mayLaunchUrl = 1;
    private static int onUnminimized = 1;
    private boolean IAuthTabCallback;
    private Rally IAuthTabCallbackDefault;
    private int IAuthTabCallbackStub;
    private boolean IAuthTabCallbackStubProxy;
    private Rally IAuthTabCallback_Parcel;
    private final long ICustomTabsCallback;
    private Rally ICustomTabsCallbackDefault;
    private boolean ICustomTabsCallbackStubProxy;
    private float access000;
    private Map<Integer, Boolean> access100;
    private boolean asBinder;
    private final int asInterface;
    private final Context extraCallback;
    private int extraCallbackWithResult;
    private boolean getInterfaceDescriptor;
    private float onActivityLayout;
    private float onActivityResized;
    private View onExtraCallback;
    private final View onExtraCallbackWithResult;
    private int onMessageChannelReady;
    private final float onMinimized;
    private DialogInterface.OnCancelListener onNavigationEvent;
    private float onPostMessage;
    private Rally onRelationshipValidationResult;
    private runOnUiThreadDelayed onTransact;
    private int onWarmupCompleted;
    private int readTypedObject;
    private final Lazy writeTypedObject;

    static {
        int i = extraCommand + 41;
        mayLaunchUrl = i % 128;
        if (i % 2 == 0) {
            int i2 = 73 / 0;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0, float f) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 61;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(brickModuleImplExternalSyntheticLambda0, f);
        int i4 = onUnminimized + 1;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return unitAsInterface;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0 = (BrickModuleImplExternalSyntheticLambda0) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 105;
        onUnminimized = i2 % 128;
        if (i2 % 2 != 0) {
            return extraCallback(brickModuleImplExternalSyntheticLambda0);
        }
        extraCallback(brickModuleImplExternalSyntheticLambda0);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 105;
        onUnminimized = i2 % 128;
        if (i2 % 2 != 0) {
            return readTypedObject();
        }
        readTypedObject();
        throw null;
    }

    public static /* synthetic */ boolean asInterface(View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 81;
        onUnminimized = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(view);
            throw null;
        }
        boolean zOnExtraCallback = onExtraCallback(view);
        int i3 = onUnminimized + 47;
        ICustomTabsCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 90 / 0;
        }
        return zOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 31;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess000 = access000(brickModuleImplExternalSyntheticLambda0);
        if (i3 == 0) {
            int i4 = 45 / 0;
        }
        return unitAccess000;
    }

    public static /* synthetic */ Unit onExtraCallback(initMiniApp.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 27;
        onUnminimized = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(onwarmupcompleted);
        }
        onWarmupCompleted(onwarmupcompleted);
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 109;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(new Object[]{brickModuleImplExternalSyntheticLambda0, view}, 1430247545, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1430247541, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
        int i4 = ICustomTabsCallbackStub + 73;
        onUnminimized = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ WindowInsetsCompat onExtraCallbackWithResult(BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0, View view, View view2, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 13;
        onUnminimized = i2 % 128;
        if (i2 % 2 != 0) {
            return (WindowInsetsCompat) onWarmupCompleted(new Object[]{brickModuleImplExternalSyntheticLambda0, view, view2, windowInsetsCompat}, -1258552833, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1258552840, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
        }
        WindowInsetsCompat windowInsetsCompat2 = (WindowInsetsCompat) onWarmupCompleted(new Object[]{brickModuleImplExternalSyntheticLambda0, view, view2, windowInsetsCompat}, -1258552833, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1258552840, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
        int i3 = 26 / 0;
        return windowInsetsCompat2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0 = (BrickModuleImplExternalSyntheticLambda0) objArr[0];
        View view = (View) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int iIntValue3 = ((Number) objArr[4]).intValue();
        int iIntValue4 = ((Number) objArr[5]).intValue();
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 13;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(brickModuleImplExternalSyntheticLambda0, view, iIntValue, iIntValue2, iIntValue3, iIntValue4);
        if (i3 == 0) {
            throw null;
        }
        int i4 = ICustomTabsCallbackStub + 19;
        onUnminimized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
        return null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function0 function0) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 53;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onWarmupCompleted(new Object[]{function0}, -1171511627, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1171511640, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
        int i4 = onUnminimized + Imgproc.COLOR_YUV2RGBA_YVYU;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 93;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(brickModuleImplExternalSyntheticLambda0, view);
        if (i3 == 0) {
            throw null;
        }
        int i4 = ICustomTabsCallbackStub + Imgproc.COLOR_YUV2RGB_YVYU;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onNavigationEvent(BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onUnminimized + 15;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitWriteTypedObject = writeTypedObject(brickModuleImplExternalSyntheticLambda0);
        if (i3 != 0) {
            int i4 = 82 / 0;
        }
        return unitWriteTypedObject;
    }

    public static /* synthetic */ void onNavigationEvent(BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0, View view, int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = ICustomTabsCallbackStub + 61;
        onUnminimized = i6 % 128;
        int i7 = i6 % 2;
        onWarmupCompleted(brickModuleImplExternalSyntheticLambda0, view, i, i2, i3, i4);
        int i8 = ICustomTabsCallbackStub + 1;
        onUnminimized = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        initMiniApp.onWarmupCompleted onwarmupcompleted = (initMiniApp.onWarmupCompleted) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 79;
        onUnminimized = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(onwarmupcompleted);
        }
        IAuthTabCallback(onwarmupcompleted);
        throw null;
    }

    public static /* synthetic */ boolean onTransact(View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 17;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(view);
        if (i3 == 0) {
            int i4 = 10 / 0;
        }
        return zOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Object onWarmupCompleted(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        float fFloatValue;
        int i7 = ~i5;
        int i8 = ~i;
        int i9 = ~i2;
        int i10 = (~(i7 | i8 | i9)) | (~(i5 | i));
        int i11 = ~(i2 | i);
        int i12 = i10 | i11;
        int i13 = ~(i7 | i);
        int i14 = i11 | i7 | (~(i8 | i9));
        int i15 = i5 + i + i4 + (1349231875 * i6) + (1735201104 * i3);
        int i16 = i15 * i15;
        int i17 = ((i5 * 236314795) - 374860141) + (i * 236313123) + (i12 * (-836)) + (i13 * (-836)) + (i14 * 836) + (236313959 * i4) + ((-66979019) * i6) + ((-1872492752) * i3) + (i16 * (-417333248));
        switch (((-413510627) * i5) + 1558183936 + (237349861 * i) + (i12 * 325430244) + (325430244 * i13) + ((-325430244) * i14) + ((-88080384) * i4) + ((-1337982976) * i6) + (469762048 * i3) + (1272971264 * i16) + (i17 * i17 * 639631360)) {
            case 1:
                BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0 = (BrickModuleImplExternalSyntheticLambda0) objArr[0];
                int i18 = 2 % 2;
                int i19 = ICustomTabsCallbackStub + 85;
                onUnminimized = i19 % 128;
                if (i19 % 2 == 0) {
                    fFloatValue = ((Float) onWarmupCompleted(new Object[]{brickModuleImplExternalSyntheticLambda0}, 154214211, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -154214197, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback())).floatValue() * (-RangesKt___RangesKt.coerceIn(brickModuleImplExternalSyntheticLambda0.writeTypedObject().getTranslationY() * brickModuleImplExternalSyntheticLambda0.writeTypedObject().getMeasuredHeight(), -1.0f, 0.0f)) * ((Float) onWarmupCompleted(new Object[]{brickModuleImplExternalSyntheticLambda0}, 154214211, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -154214197, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback())).floatValue();
                } else {
                    fFloatValue = ((Float) onWarmupCompleted(new Object[]{brickModuleImplExternalSyntheticLambda0}, 154214211, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -154214197, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback())).floatValue() + ((-RangesKt___RangesKt.coerceIn(brickModuleImplExternalSyntheticLambda0.writeTypedObject().getTranslationY() / brickModuleImplExternalSyntheticLambda0.writeTypedObject().getMeasuredHeight(), -1.0f, 1.0f)) * ((Float) onWarmupCompleted(new Object[]{brickModuleImplExternalSyntheticLambda0}, 154214211, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -154214197, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback())).floatValue());
                }
                float fCoerceAtMost = RangesKt___RangesKt.coerceAtMost(fFloatValue, 0.8f);
                int i20 = ICustomTabsCallbackStub + 65;
                onUnminimized = i20 % 128;
                int i21 = i20 % 2;
                return Float.valueOf(fCoerceAtMost);
            case 2:
                BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda02 = (BrickModuleImplExternalSyntheticLambda0) objArr[0];
                int i22 = 2 % 2;
                int i23 = ICustomTabsCallbackStub + 101;
                onUnminimized = i23 % 128;
                int i24 = i23 % 2;
                brickModuleImplExternalSyntheticLambda02.onPostMessage();
                int i25 = onUnminimized + 79;
                ICustomTabsCallbackStub = i25 % 128;
                int i26 = i25 % 2;
                return null;
            case 3:
                return onExtraCallback(objArr);
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                return onExtraCallbackWithResult(objArr);
            case 6:
                return IAuthTabCallback(objArr);
            case 7:
                BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda03 = (BrickModuleImplExternalSyntheticLambda0) objArr[0];
                View view = (View) objArr[1];
                View view2 = (View) objArr[2];
                WindowInsetsCompat windowInsetsCompat = (WindowInsetsCompat) objArr[3];
                int i27 = 2 % 2;
                int i28 = onUnminimized + 89;
                ICustomTabsCallbackStub = i28 % 128;
                int i29 = i28 % 2;
                Intrinsics.checkNotNullParameter(view2, "");
                Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
                brickModuleImplExternalSyntheticLambda03.onMessageChannelReady = windowInsetsCompat.onWarmupCompleted(WindowInsetsCompat.onTransact.IAuthTabCallbackDefault()).onWarmupCompleted;
                brickModuleImplExternalSyntheticLambda03.extraCallbackWithResult = windowInsetsCompat.onWarmupCompleted(WindowInsetsCompat.onTransact.asInterface()).onExtraCallback;
                brickModuleImplExternalSyntheticLambda03.getBehavior().setState(3);
                brickModuleImplExternalSyntheticLambda03.getBehavior().setDraggable(false);
                brickModuleImplExternalSyntheticLambda03.getBehavior().setGestureInsetBottomIgnored(true);
                BottomSheetBehavior behavior = brickModuleImplExternalSyntheticLambda03.getBehavior();
                M_ m_ = M_.onExtraCallback;
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                behavior.setPeekHeight(m_.IAuthTabCallback(context) + brickModuleImplExternalSyntheticLambda03.extraCallbackWithResult + brickModuleImplExternalSyntheticLambda03.onMessageChannelReady);
                view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), 0);
                int i30 = onUnminimized + 59;
                ICustomTabsCallbackStub = i30 % 128;
                int i31 = i30 % 2;
                return windowInsetsCompat;
            case 8:
                return asInterface(objArr);
            case 9:
                return asBinder(objArr);
            case 10:
                return IAuthTabCallbackDefault(objArr);
            case 11:
                BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda04 = (BrickModuleImplExternalSyntheticLambda0) objArr[0];
                int i32 = 2 % 2;
                View.OnTouchListener onextracallback = brickModuleImplExternalSyntheticLambda04.new onExtraCallback();
                brickModuleImplExternalSyntheticLambda04.writeTypedObject().setOnTouchListener(onextracallback);
                brickModuleImplExternalSyntheticLambda04.onTransact().setOnTouchListener(onextracallback);
                int i33 = ICustomTabsCallbackStub + 77;
                onUnminimized = i33 % 128;
                int i34 = i33 % 2;
                return null;
            case 12:
                return onTransact(objArr);
            case 13:
                return IAuthTabCallbackStub(objArr);
            case 14:
                return access000(objArr);
            case 15:
                return access100(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0, float f) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 123;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onWarmupCompleted(new Object[]{brickModuleImplExternalSyntheticLambda0, Float.valueOf(f)}, 2018858056, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -2018858056, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
        int i4 = onUnminimized + 101;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ void onWarmupCompleted(BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 55;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        asBinder(brickModuleImplExternalSyntheticLambda0, view);
        if (i3 == 0) {
            int i4 = 42 / 0;
        }
        int i5 = onUnminimized + 123;
        ICustomTabsCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    public boolean onExtraCallbackWithResult(int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackStub;
        int i4 = i3 + 9;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 9;
        onUnminimized = i6 % 128;
        if (i6 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallbackWithResult implements View.OnLayoutChangeListener {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public onExtraCallbackWithResult() {
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x009d A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0041  */
        @Override // android.view.View.OnLayoutChangeListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            ConstraintLayout constraintLayoutOnTransact;
            NestedScrollView nestedScrollView;
            int i9;
            int i10 = 2 % 2;
            view.removeOnLayoutChangeListener(this);
            if (BrickModuleImplExternalSyntheticLambda0.this.onTransact().getChildCount() == 1) {
                int i11 = onNavigationEvent + 55;
                onWarmupCompleted = i11 % 128;
                int i12 = i11 % 2;
                if (BrickModuleImplExternalSyntheticLambda0.this.onTransact().getChildAt(0) instanceof ViewGroup) {
                    View childAt = BrickModuleImplExternalSyntheticLambda0.this.onTransact().getChildAt(0);
                    Intrinsics.checkNotNull(childAt, "");
                    constraintLayoutOnTransact = (ViewGroup) childAt;
                } else {
                    constraintLayoutOnTransact = BrickModuleImplExternalSyntheticLambda0.this.onTransact();
                }
            }
            List listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
            Iterator itIAuthTabCallback = EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback(constraintLayoutOnTransact).IAuthTabCallback();
            while (true) {
                Object obj = null;
                if (!itIAuthTabCallback.hasNext()) {
                    List<View> listBuild = CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder);
                    pxToDp.onNavigationEvent onnavigationevent = new pxToDp.onNavigationEvent(30);
                    List listCreateListBuilder2 = CollectionsKt__CollectionsJVMKt.createListBuilder();
                    TdsRoundLayout tdsRoundLayoutIAuthTabCallbackStub = BrickModuleImplExternalSyntheticLambda0.IAuthTabCallbackStub(BrickModuleImplExternalSyntheticLambda0.this);
                    AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(0.0f), Float.valueOf(1.0f), (Function1) null, 4, (Object) null);
                    DisplayMetrics displayMetrics = BrickModuleImplExternalSyntheticLambda0.this.getContext().getResources().getDisplayMetrics();
                    Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                    listCreateListBuilder2.add((Rally) RallysKt.onWarmupCompleted(new Object[]{tdsRoundLayoutIAuthTabCallbackStub, isMuted.onExtraCallback(appLovinSdkSettingsOnNavigationEvent, Integer.valueOf(varyMatches.onNavigationEvent(100, displayMetrics)), 0, (Function1) null, 4, (Object) null), 0, null, 0, null, null, Boolean.FALSE, 0, 0L, false, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
                    for (View view2 : listBuild) {
                        AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallback = AuthenticatorCompanion.IAuthTabCallback(AuthenticatorCompanion.IAuthTabCallback, authenticate.IN, Cache.UP, AuthenticatorCompanionAuthenticatorNone.FAST, false, (Function1) null, 24, (Object) null);
                        int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
                        int iOnExtraCallback2 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
                        int iOnExtraCallback3 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
                        listCreateListBuilder2.add((Rally) RallysKt.onWarmupCompleted(new Object[]{view2, appLovinSdkSettingsIAuthTabCallback, 0, null, 0, null, null, Boolean.FALSE, 0, 0L, false, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
                    }
                    isFireOS.onExtraCallbackWithResult(runOnUiThreadDelayed.onWarmupCompleted(RallysKt.onWarmupCompleted((View) null, onnavigationevent, CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder2), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, Boolean.FALSE, 0, 0L, false, 3833, (Object) null), (Object) null, BrickModuleImplExternalSyntheticLambda0.this.new onWarmupCompleted(), 1, (Object) null), false, 1, (Object) null);
                    int i13 = onWarmupCompleted + 101;
                    onNavigationEvent = i13 % 128;
                    if (i13 % 2 != 0) {
                        int i14 = 26 / 0;
                        return;
                    }
                    return;
                }
                RecyclerView recyclerView = (View) itIAuthTabCallback.next();
                if (recyclerView instanceof RecyclerView) {
                    int i15 = onNavigationEvent + 107;
                    onWarmupCompleted = i15 % 128;
                    if (i15 % 2 == 0) {
                        int i16 = 63 / 0;
                        if (recyclerView.getChildCount() > 0) {
                            i9 = onWarmupCompleted + 7;
                            onNavigationEvent = i9 % 128;
                            if (i9 % 2 == 0) {
                                CollectionsKt__MutableCollectionsKt.addAll(listCreateListBuilder, EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback((ViewGroup) recyclerView));
                                obj.hashCode();
                                throw null;
                            }
                            CollectionsKt__MutableCollectionsKt.addAll(listCreateListBuilder, EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback((ViewGroup) recyclerView));
                        }
                    } else if (recyclerView.getChildCount() > 0) {
                        i9 = onWarmupCompleted + 7;
                        onNavigationEvent = i9 % 128;
                        if (i9 % 2 == 0) {
                        }
                    }
                }
                if (recyclerView instanceof NestedScrollView) {
                    int i17 = onWarmupCompleted + 65;
                    onNavigationEvent = i17 % 128;
                    if (i17 % 2 != 0) {
                        nestedScrollView = (NestedScrollView) recyclerView;
                        if (nestedScrollView.getChildAt(0) instanceof LinearLayout) {
                            View childAt2 = nestedScrollView.getChildAt(0);
                            Intrinsics.checkNotNull(childAt2, "");
                            CollectionsKt__MutableCollectionsKt.addAll(listCreateListBuilder, EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback((LinearLayout) childAt2));
                        }
                    } else {
                        nestedScrollView = (NestedScrollView) recyclerView;
                        if (nestedScrollView.getChildAt(0) instanceof LinearLayout) {
                            View childAt22 = nestedScrollView.getChildAt(0);
                            Intrinsics.checkNotNull(childAt22, "");
                            CollectionsKt__MutableCollectionsKt.addAll(listCreateListBuilder, EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback((LinearLayout) childAt22));
                        }
                    }
                }
                listCreateListBuilder.add(recyclerView);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BrickModuleImplExternalSyntheticLambda0(@NotNull Context context, boolean z, boolean z2, int i, int i2, long j, @NotNull Function1<? super initMiniApp.onWarmupCompleted, Unit> function1) {
        ViewTreeObserver viewTreeObserver;
        super(context, i2);
        Intrinsics.checkNotNullParameter(context, "");
        Function1<? super initMiniApp.onWarmupCompleted, Unit> function12 = function1;
        Intrinsics.checkNotNullParameter(function12, "");
        this.IAuthTabCallbackStubProxy = z2;
        this.readTypedObject = i;
        this.ICustomTabsCallback = j;
        function12 = j == -1 ? null : function12;
        if (function12 == null) {
            function12 = new Function1() { // from class: im.toss.uikit.widget.dialog.BaseTdsBottomSheetV2$$ExternalSyntheticLambda7
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i3 = 2 % 2;
                    int i4 = onNavigationEvent + 111;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    Unit unitOnExtraCallback = BrickModuleImplExternalSyntheticLambda0.onExtraCallback((initMiniApp.onWarmupCompleted) obj);
                    int i6 = onWarmupCompleted + 79;
                    onNavigationEvent = i6 % 128;
                    if (i6 % 2 != 0) {
                        return unitOnExtraCallback;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            };
            int i3 = onUnminimized + 11;
            ICustomTabsCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        }
        this.writeTypedObject = isStopUpload.onWarmupCompleted(this, j, (Function1) null, function12, 2, (Object) null);
        this.onPostMessage = -1.0f;
        this.onActivityLayout = -1.0f;
        this.access000 = -1.0f;
        this.onMinimized = ((Integer) M_.onNavigationEvent(-2118175014, new Object[]{M_.onExtraCallback, context}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 2118175019, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent())).intValue() * 0.1f;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        this.asInterface = varyMatches.onNavigationEvent(100, displayMetrics);
        this.onActivityResized = 1.0f;
        this.access100 = access8000.IAuthTabCallbackStubProxy(getWrite.IAuthTabCallback(-1, Boolean.valueOf(z)), getWrite.IAuthTabCallback(0, Boolean.valueOf(z)), getWrite.IAuthTabCallback(1, Boolean.valueOf(z)), getWrite.IAuthTabCallback(2, Boolean.valueOf(z)));
        this.IAuthTabCallbackStub = -1;
        this.extraCallback = context;
        int i6 = this.readTypedObject;
        if (i6 == 0) {
            getDelegate().onNavigationEvent(1);
        } else if (i6 == 1) {
            int i7 = ICustomTabsCallbackStub + 111;
            onUnminimized = i7 % 128;
            int i8 = i7 % 2;
            getDelegate().onNavigationEvent(2);
        }
        View viewInflate = LayoutInflater.from(context).inflate(im.toss.uikit.R.layout.tds_bottom_sheet_v2, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        this.onExtraCallbackWithResult = viewInflate;
        super.setContentView(viewInflate);
        super/*com.google.android.material.bottomsheet.BottomSheetDialog*/.setCancelable(false);
        Window window = getWindow();
        if (window != null) {
            window.setDimAmount(((Float) onWarmupCompleted(new Object[]{this}, 154214211, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -154214197, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback())).floatValue());
        }
        View viewAq_ = aq_();
        if (viewAq_ != null && (viewTreeObserver = viewAq_.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this);
            int i9 = 2 % 2;
        }
        extraCallbackWithResult();
        int i10 = ICustomTabsCallbackStub + 125;
        onUnminimized = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 45 / 0;
        }
    }

    public /* synthetic */ BrickModuleImplExternalSyntheticLambda0(Context context, boolean z, boolean z2, int i, int i2, long j, Function1 function1, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z3;
        boolean z4;
        int i4;
        long j2;
        Function1 function12;
        if ((i3 & 2) != 0) {
            int i5 = 2 % 2;
            z3 = true;
        } else {
            z3 = z;
        }
        if ((i3 & 4) != 0) {
            int i6 = 2 % 2;
            z4 = false;
        } else {
            z4 = z2;
        }
        int i7 = (i3 & 8) != 0 ? -1 : i;
        if ((i3 & 16) != 0) {
            int i8 = ICustomTabsCallbackStub + 83;
            onUnminimized = i8 % 128;
            int i9 = i8 % 2;
            i4 = im.toss.uikit.R.style.BottomSheetDialog;
        } else {
            i4 = i2;
        }
        if ((i3 & 32) != 0) {
            int i10 = onUnminimized + 113;
            ICustomTabsCallbackStub = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 2 % 2;
            }
            j2 = -1;
        } else {
            j2 = j;
        }
        if ((i3 & 64) != 0) {
            function12 = new Function1() { // from class: im.toss.uikit.widget.dialog.BaseTdsBottomSheetV2$$ExternalSyntheticLambda14
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i12 = 2 % 2;
                    int i13 = onWarmupCompleted + 75;
                    onNavigationEvent = i13 % 128;
                    initMiniApp.onWarmupCompleted onwarmupcompleted = (initMiniApp.onWarmupCompleted) obj;
                    if (i13 % 2 == 0) {
                        throw null;
                    }
                    Unit unit = (Unit) BrickModuleImplExternalSyntheticLambda0.onWarmupCompleted(new Object[]{onwarmupcompleted}, -1432637537, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1432637549, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
                    int i14 = onWarmupCompleted + 1;
                    onNavigationEvent = i14 % 128;
                    int i15 = i14 % 2;
                    return unit;
                }
            };
            int i12 = onUnminimized + 55;
            ICustomTabsCallbackStub = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 4 / 4;
            } else {
                int i14 = 2 % 2;
            }
        } else {
            function12 = function1;
        }
        this(context, z3, z4, i7, i4, j2, function12);
    }

    public static final /* synthetic */ float IAuthTabCallback(BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 73;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        float fFloatValue = ((Float) onWarmupCompleted(new Object[]{brickModuleImplExternalSyntheticLambda0}, 330793922, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -330793921, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback())).floatValue();
        int i4 = ICustomTabsCallbackStub + 19;
        onUnminimized = i4 % 128;
        if (i4 % 2 != 0) {
            return fFloatValue;
        }
        throw null;
    }

    public static final /* synthetic */ float IAuthTabCallbackDefault(BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onUnminimized;
        int i3 = i2 + 17;
        ICustomTabsCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        float f = brickModuleImplExternalSyntheticLambda0.access000;
        int i5 = i2 + 67;
        ICustomTabsCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public static final /* synthetic */ TdsRoundLayout IAuthTabCallbackStub(BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 47;
        onUnminimized = i2 % 128;
        if (i2 % 2 != 0) {
            return brickModuleImplExternalSyntheticLambda0.writeTypedObject();
        }
        brickModuleImplExternalSyntheticLambda0.writeTypedObject();
        throw null;
    }

    public static final /* synthetic */ boolean IAuthTabCallback_Parcel(BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onUnminimized + 65;
        int i3 = i2 % 128;
        ICustomTabsCallbackStub = i3;
        int i4 = i2 % 2;
        boolean z = brickModuleImplExternalSyntheticLambda0.IAuthTabCallbackStubProxy;
        int i5 = i3 + 37;
        onUnminimized = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public static final /* synthetic */ void access100(BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onUnminimized + 27;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        brickModuleImplExternalSyntheticLambda0.ICustomTabsCallback();
        int i4 = ICustomTabsCallbackStub + 47;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ float asBinder(BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onUnminimized;
        int i3 = i2 + 33;
        ICustomTabsCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        float f = brickModuleImplExternalSyntheticLambda0.onPostMessage;
        int i5 = i2 + 25;
        ICustomTabsCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public static final /* synthetic */ float asInterface(BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 1;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        float f = brickModuleImplExternalSyntheticLambda0.onMinimized;
        if (i3 != 0) {
            return f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void getInterfaceDescriptor(BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 103;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(new Object[]{brickModuleImplExternalSyntheticLambda0}, 1858077530, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1858077519, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
        int i4 = ICustomTabsCallbackStub + 9;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void onExtraCallback(BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0, float f) {
        int i = 2 % 2;
        int i2 = onUnminimized + 5;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        brickModuleImplExternalSyntheticLambda0.onPostMessage = f;
        if (i3 != 0) {
            int i4 = 36 / 0;
        }
    }

    public static final /* synthetic */ int onExtraCallbackWithResult(BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onUnminimized + 105;
        int i3 = i2 % 128;
        ICustomTabsCallbackStub = i3;
        int i4 = i2 % 2;
        int i5 = brickModuleImplExternalSyntheticLambda0.asInterface;
        if (i4 != 0) {
            int i6 = 81 / 0;
        }
        int i7 = i3 + 89;
        onUnminimized = i7 % 128;
        if (i7 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0, float f) {
        int i = 2 % 2;
        int i2 = onUnminimized + 93;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        brickModuleImplExternalSyntheticLambda0.access000 = f;
        if (i3 != 0) {
            int i4 = 19 / 0;
        }
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0, int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackStub + 35;
        onUnminimized = i3 % 128;
        int i4 = i3 % 2;
        onWarmupCompleted(new Object[]{brickModuleImplExternalSyntheticLambda0, Integer.valueOf(i)}, 1440138886, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1440138877, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
        int i5 = onUnminimized + 7;
        ICustomTabsCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 23 / 0;
        }
    }

    public static final /* synthetic */ void onNavigationEvent(BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0, float f) {
        int i = 2 % 2;
        int i2 = onUnminimized + 87;
        int i3 = i2 % 128;
        ICustomTabsCallbackStub = i3;
        int i4 = i2 % 2;
        Object obj = null;
        brickModuleImplExternalSyntheticLambda0.onActivityLayout = f;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 49;
        onUnminimized = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ float onTransact(BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 99;
        int i3 = i2 % 128;
        onUnminimized = i3;
        int i4 = i2 % 2;
        float f = brickModuleImplExternalSyntheticLambda0.onActivityLayout;
        if (i4 == 0) {
            int i5 = 61 / 0;
        }
        int i6 = i3 + 65;
        ICustomTabsCallbackStub = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 58 / 0;
        }
        return f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ AFj1nSDK4 getLogVersion() {
        int i = 2 % 2;
        int i2 = onUnminimized + 57;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        AFj1nSDK4 logVersion = super/*o.L_*/.getLogVersion();
        int i4 = onUnminimized + 99;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return logVersion;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ String getReferrerParam() {
        int i = 2 % 2;
        int i2 = onUnminimized + 11;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        String referrerParam = super/*o.L_*/.getReferrerParam();
        int i4 = onUnminimized + 5;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return referrerParam;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ String getScreenHash() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 61;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        String screenHash = super/*o.L_*/.getScreenHash();
        int i4 = onUnminimized + 75;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return screenHash;
        }
        throw null;
    }

    public /* bridge */ long getScreenId() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 25;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        long screenId = super.getScreenId();
        int i4 = onUnminimized + 55;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return screenId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ Map<String, Object> getScreenParams() {
        int i = 2 % 2;
        int i2 = onUnminimized + 51;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            super.getScreenParams();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Map<String, Object> screenParams = super.getScreenParams();
        int i3 = ICustomTabsCallbackStub + 79;
        onUnminimized = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 32 / 0;
        }
        return screenParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ boolean onTrackBottomSheetView() {
        int i = 2 % 2;
        int i2 = onUnminimized + 23;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnTrackBottomSheetView = super/*o.L_*/.onTrackBottomSheetView();
        if (i3 != 0) {
            int i4 = 57 / 0;
        }
        return zOnTrackBottomSheetView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ boolean onTrackView() {
        boolean zOnTrackView;
        int i = 2 % 2;
        int i2 = onUnminimized + 103;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            zOnTrackView = super/*o.L_*/.onTrackView();
            int i3 = 20 / 0;
        } else {
            zOnTrackView = super/*o.L_*/.onTrackView();
        }
        int i4 = onUnminimized + 89;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnTrackView;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ boolean onTrackView(boolean z) {
        int i = 2 % 2;
        int i2 = onUnminimized + 79;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnTrackView = super/*o.L_*/.onTrackView(z);
        int i4 = onUnminimized + 63;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnTrackView;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ boolean onTrackViewInternal(boolean z, boolean z2) {
        int i = 2 % 2;
        int i2 = onUnminimized + 13;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnTrackViewInternal = super/*o.L_*/.onTrackViewInternal(z, z2);
        int i4 = ICustomTabsCallbackStub + 109;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
        return zOnTrackViewInternal;
    }

    public /* synthetic */ initMiniApp updateVisuals() {
        int i = 2 % 2;
        int i2 = onUnminimized + 79;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        hasCrashWhenJavaCrash hascrashwhenjavacrashIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy();
        int i4 = onUnminimized + 47;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return hascrashwhenjavacrashIAuthTabCallbackStubProxy;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(initMiniApp.onWarmupCompleted onwarmupcompleted) {
        Unit unit;
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 1;
        onUnminimized = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            unit = Unit.INSTANCE;
            int i3 = 90 / 0;
        } else {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            unit = Unit.INSTANCE;
        }
        int i4 = ICustomTabsCallbackStub + 47;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public String getScreenName() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 99;
        int i3 = i2 % 128;
        onUnminimized = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 97;
        ICustomTabsCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        throw null;
    }

    public hasCrashWhenJavaCrash IAuthTabCallbackStubProxy() {
        hasCrashWhenJavaCrash hascrashwhenjavacrash;
        int i = 2 % 2;
        int i2 = onUnminimized + 31;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            hascrashwhenjavacrash = (hasCrashWhenJavaCrash) this.writeTypedObject.getValue();
            int i3 = 10 / 0;
        } else {
            hascrashwhenjavacrash = (hasCrashWhenJavaCrash) this.writeTypedObject.getValue();
        }
        int i4 = onUnminimized + 81;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 66 / 0;
        }
        return hascrashwhenjavacrash;
    }

    private static final Unit onWarmupCompleted(initMiniApp.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = onUnminimized + 85;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallbackStub + Imgproc.COLOR_YUV2RGB_YVYU;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final View access000() {
        View viewFindViewById;
        int i = 2 % 2;
        int i2 = onUnminimized + 113;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            viewFindViewById = this.onExtraCallbackWithResult.findViewById(im.toss.uikit.R.id.handle);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            int i3 = 42 / 0;
        } else {
            viewFindViewById = this.onExtraCallbackWithResult.findViewById(im.toss.uikit.R.id.handle);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        }
        int i4 = onUnminimized + 5;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return viewFindViewById;
    }

    private final TdsRoundLayout writeTypedObject() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 87;
        onUnminimized = i2 % 128;
        if (i2 % 2 != 0) {
            TdsRoundLayout tdsRoundLayoutFindViewById = this.onExtraCallbackWithResult.findViewById(im.toss.uikit.R.id.sheet);
            Intrinsics.checkNotNullExpressionValue(tdsRoundLayoutFindViewById, "");
            return tdsRoundLayoutFindViewById;
        }
        TdsRoundLayout tdsRoundLayoutFindViewById2 = this.onExtraCallbackWithResult.findViewById(im.toss.uikit.R.id.sheet);
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayoutFindViewById2, "");
        int i3 = 51 / 0;
        return tdsRoundLayoutFindViewById2;
    }

    public final TdsBottomSheetV2Content onTransact() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 125;
        onUnminimized = i2 % 128;
        if (i2 % 2 != 0) {
            Object objFindViewById = this.onExtraCallbackWithResult.findViewById(im.toss.uikit.R.id.content);
            Intrinsics.checkNotNullExpressionValue(objFindViewById, "");
            return (TdsBottomSheetV2Content) objFindViewById;
        }
        Object objFindViewById2 = this.onExtraCallbackWithResult.findViewById(im.toss.uikit.R.id.content);
        Intrinsics.checkNotNullExpressionValue(objFindViewById2, "");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected final TdsSpace asInterface() {
        int i = 2 % 2;
        int i2 = onUnminimized + 21;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        View viewFindViewById = this.onExtraCallbackWithResult.findViewById(im.toss.uikit.R.id.space);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        TdsSpace tdsSpace = (TdsSpace) viewFindViewById;
        int i4 = onUnminimized + 105;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return tdsSpace;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0 = (BrickModuleImplExternalSyntheticLambda0) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub;
        int i3 = i2 + 51;
        onUnminimized = i3 % 128;
        int i4 = i3 % 2;
        boolean z = brickModuleImplExternalSyntheticLambda0.asBinder;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 1;
        onUnminimized = i5 % 128;
        if (i5 % 2 != 0) {
            return Boolean.valueOf(z);
        }
        int i6 = 81 / 0;
        return Boolean.valueOf(z);
    }

    public final void onExtraCallbackWithResult(boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 39;
        int i3 = i2 % 128;
        onUnminimized = i3;
        int i4 = i2 % 2;
        this.ICustomTabsCallbackStubProxy = z;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 67;
        ICustomTabsCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    protected final boolean access100() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 111;
        onUnminimized = i2 % 128;
        if (i2 % 2 != 0) {
            return this.getInterfaceDescriptor;
        }
        throw null;
    }

    protected final void onNavigationEvent(boolean z) {
        int i = 2 % 2;
        int i2 = onUnminimized + 125;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        this.getInterfaceDescriptor = z;
        onTransact().setExpanded(z);
        int i4 = onUnminimized + 97;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onNavigationEvent(View view) {
        int i = 2 % 2;
        int i2 = onUnminimized + 119;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallback = view;
        onTransact().setAttachedView(this.onExtraCallback);
        int i4 = ICustomTabsCallbackStub + 35;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View aq_() {
        View decorView;
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 95;
        onUnminimized = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            getWindow();
            obj.hashCode();
            throw null;
        }
        Window window = getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            int i3 = onUnminimized + 1;
            ICustomTabsCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        int i5 = ICustomTabsCallbackStub + 39;
        onUnminimized = i5 % 128;
        int i6 = i5 % 2;
        View viewFindViewById = decorView.findViewById(android.R.id.content);
        int i7 = onUnminimized + 53;
        ICustomTabsCallbackStub = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 7 / 0;
        }
        return viewFindViewById;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        float f;
        int i = 2 % 2;
        Context context = ((BrickModuleImplExternalSyntheticLambda0) objArr[0]).getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        if (((Boolean) generateLink.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -194147640, new Object[]{context}, 194147643, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).booleanValue()) {
            int i2 = ICustomTabsCallbackStub + 5;
            onUnminimized = i2 % 128;
            int i3 = i2 % 2;
            f = 0.56f;
        } else {
            int i4 = ICustomTabsCallbackStub + 41;
            onUnminimized = i4 % 128;
            int i5 = i4 % 2;
            f = 0.2f;
        }
        return Float.valueOf(f);
    }

    private final void extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 55;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        initSDK initsdkAccess000 = access000();
        initSDK initsdk = !(initsdkAccess000 instanceof initSDK) ? null : initsdkAccess000;
        if (initsdk != null) {
            int i4 = onUnminimized + 65;
            ICustomTabsCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            initsdk.setTrackable(false);
        }
        int i6 = ICustomTabsCallbackStub + 63;
        onUnminimized = i6 % 128;
        int i7 = i6 % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0 = (BrickModuleImplExternalSyntheticLambda0) objArr[0];
        int i = 2 % 2;
        int i2 = onUnminimized + 63;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        brickModuleImplExternalSyntheticLambda0.getInterfaceDescriptor();
        if (i3 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = onUnminimized + 13;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            super/*com.google.android.material.bottomsheet.BottomSheetDialog*/.onCreate(bundle);
            onMessageChannelReady();
            extraCallback();
            View viewFindViewById = findViewById(com.google.android.material.R.id.touch_outside);
            if (viewFindViewById != null) {
                viewFindViewById.setOnClickListener(new BaseTdsBottomSheetV2$.ExternalSyntheticLambda5(this));
            }
            asInterface().setOnClickListener(new BaseTdsBottomSheetV2$.ExternalSyntheticLambda6(this));
            int i3 = onUnminimized + 19;
            ICustomTabsCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        super/*com.google.android.material.bottomsheet.BottomSheetDialog*/.onCreate(bundle);
        onMessageChannelReady();
        extraCallback();
        findViewById(com.google.android.material.R.id.touch_outside);
        throw null;
    }

    private static final void asBinder(BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 35;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        brickModuleImplExternalSyntheticLambda0.getInterfaceDescriptor();
        if (i3 == 0) {
            throw null;
        }
        int i4 = ICustomTabsCallbackStub + 17;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPrepareTrackViewParams(@NotNull Map<String, Object> map) {
        L_ l_;
        String screenName;
        int i = 2 % 2;
        int i2 = onUnminimized + 97;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        super/*o.L_*/.onPrepareTrackViewParams(map);
        Object obj = this.extraCallback;
        String interfaceDescriptor = null;
        if (obj instanceof L_) {
            int i4 = ICustomTabsCallbackStub + 1;
            onUnminimized = i4 % 128;
            int i5 = i4 % 2;
            l_ = (L_) obj;
        } else {
            l_ = null;
        }
        if (l_ != null && (screenName = l_.getScreenName()) != null) {
            if (screenName.length() == 0) {
                TrackState trackStateOnExtraCallbackWithResult = TrackState.Companion.onExtraCallbackWithResult();
                if (trackStateOnExtraCallbackWithResult != null) {
                    int i6 = onUnminimized + 57;
                    ICustomTabsCallbackStub = i6 % 128;
                    if (i6 % 2 != 0) {
                        trackStateOnExtraCallbackWithResult.getInterfaceDescriptor();
                        interfaceDescriptor.hashCode();
                        throw null;
                    }
                    interfaceDescriptor = trackStateOnExtraCallbackWithResult.getInterfaceDescriptor();
                }
            } else {
                interfaceDescriptor = screenName;
            }
        }
        map.put("parent_screen", interfaceDescriptor);
    }

    public void onStart() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 9;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        super/*com.google.android.material.bottomsheet.BottomSheetDialog*/.onStart();
        onGreatestScrollPercentageIncreased();
        onTrackBottomSheetView();
        int i4 = ICustomTabsCallbackStub + 77;
        onUnminimized = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public void onStop() {
        int i = 2 % 2;
        int i2 = onUnminimized + 1;
        ICustomTabsCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super/*androidx.appcompat.app.AppCompatDialog*/.onStop();
            writeTypedList();
            int i3 = ICustomTabsCallbackStub + 61;
            onUnminimized = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        super/*androidx.appcompat.app.AppCompatDialog*/.onStop();
        writeTypedList();
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025 A[PHI: r1
      0x0025: PHI (r1v5 android.view.Window) = (r1v4 android.view.Window), (r1v16 android.view.Window) binds: [B:8:0x0023, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttachedToWindow() {
        Window window;
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 89;
        onUnminimized = i2 % 128;
        if (i2 % 2 == 0) {
            super/*com.google.android.material.bottomsheet.BottomSheetDialog*/.onAttachedToWindow();
            window = getWindow();
            int i3 = 21 / 0;
            if (window != null) {
                int i4 = ICustomTabsCallbackStub + 73;
                onUnminimized = i4 % 128;
                if (i4 % 2 == 0) {
                    RepeatableSpec.onExtraCallbackWithResult(window, true);
                    ViewCompat.IAuthTabCallbackStub(window.getDecorView(), 2);
                    RepeatableSpec.onExtraCallbackWithResult(window, true);
                } else {
                    RepeatableSpec.onExtraCallbackWithResult(window, false);
                    ViewCompat.IAuthTabCallbackStub(window.getDecorView(), 2);
                    RepeatableSpec.onExtraCallbackWithResult(window, false);
                }
            }
        } else {
            super/*com.google.android.material.bottomsheet.BottomSheetDialog*/.onAttachedToWindow();
            window = getWindow();
            if (window != null) {
            }
        }
        View viewFindViewById = findViewById(com.google.android.material.R.id.container);
        if (viewFindViewById != null) {
            viewFindViewById.setFitsSystemWindows(false);
            ViewCompat.onWarmupCompleted(viewFindViewById, new BaseTdsBottomSheetV2$.ExternalSyntheticLambda13(this, viewFindViewById));
            int i5 = ICustomTabsCallbackStub + 49;
            onUnminimized = i5 % 128;
            int i6 = i5 % 2;
        }
        View viewFindViewById2 = findViewById(com.google.android.material.R.id.coordinator);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setFitsSystemWindows(false);
        }
        int i7 = onUnminimized + 83;
        ICustomTabsCallbackStub = i7 % 128;
        int i8 = i7 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onMessageChannelReady() {
        Window window;
        NavigationBarKtExternalSyntheticLambda8 navigationBarKtExternalSyntheticLambda8OnNavigationEvent;
        Window window2;
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult;
        int i = 2 % 2;
        View viewFindViewById = findViewById(android.R.id.content);
        if (viewFindViewById != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Activity activityIAuthTabCallback = hasVaryAll.IAuthTabCallback(context);
            if (activityIAuthTabCallback != null && (window2 = activityIAuthTabCallback.getWindow()) != null) {
                int i2 = onUnminimized + 11;
                ICustomTabsCallbackStub = i2 % 128;
                if (i2 % 2 != 0) {
                    window2.getDecorView();
                    throw null;
                }
                View decorView = window2.getDecorView();
                if (decorView != null && (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(decorView)) != null) {
                    AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.IAuthTabCallback(viewFindViewById, textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult);
                }
            }
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Activity activityIAuthTabCallback2 = hasVaryAll.IAuthTabCallback(context2);
            if (activityIAuthTabCallback2 != null) {
                int i3 = onUnminimized + 21;
                ICustomTabsCallbackStub = i3 % 128;
                if (i3 % 2 != 0) {
                    window = activityIAuthTabCallback2.getWindow();
                    int i4 = 97 / 0;
                    if (window == null) {
                        return;
                    }
                } else {
                    window = activityIAuthTabCallback2.getWindow();
                    if (window == null) {
                        return;
                    }
                }
                int i5 = ICustomTabsCallbackStub + 89;
                onUnminimized = i5 % 128;
                if (i5 % 2 == 0) {
                    window.getDecorView();
                    throw null;
                }
                View decorView2 = window.getDecorView();
                if (decorView2 == null || (navigationBarKtExternalSyntheticLambda8OnNavigationEvent = NavigationDrawerKtExternalSyntheticLambda1.onNavigationEvent(decorView2)) == null) {
                    return;
                }
                NavigationDrawerKtExternalSyntheticLambda1.onExtraCallbackWithResult(viewFindViewById, navigationBarKtExternalSyntheticLambda8OnNavigationEvent);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onContentChanged() {
        int i = 2 % 2;
        super/*android.app.Dialog*/.onContentChanged();
        View viewFindViewById = findViewById(com.google.android.material.R.id.design_bottom_sheet);
        if (viewFindViewById != null) {
            int i2 = onUnminimized + 109;
            ICustomTabsCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            viewFindViewById.setBackground(null);
            int i4 = onUnminimized + 103;
            ICustomTabsCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        }
        onActivityLayout();
        int i6 = onUnminimized + 109;
        ICustomTabsCallbackStub = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 1 / 0;
        }
    }

    public void setOnCancelListener(@Nullable DialogInterface.OnCancelListener onCancelListener) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 25;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        this.onNavigationEvent = onCancelListener;
        if (i3 == 0) {
            int i4 = 67 / 0;
        }
    }

    public void getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 61;
        onUnminimized = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(new Object[]{this, 5}, 1440138886, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1440138877, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
            return;
        }
        onWarmupCompleted(new Object[]{this, 2}, 1440138886, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1440138877, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
    }

    public void cancel() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 107;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(new Object[]{this, -1}, 1440138886, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1440138877, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
        int i4 = onUnminimized + 35;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0 = (BrickModuleImplExternalSyntheticLambda0) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        if (!(!(brickModuleImplExternalSyntheticLambda0.access100.get(Integer.valueOf(iIntValue)) != null ? r4.booleanValue() : false))) {
            int i2 = ICustomTabsCallbackStub + 35;
            onUnminimized = i2 % 128;
            int i3 = i2 % 2;
            if (!brickModuleImplExternalSyntheticLambda0.IAuthTabCallback) {
                if (!brickModuleImplExternalSyntheticLambda0.onExtraCallbackWithResult(iIntValue)) {
                    int i4 = onUnminimized + 99;
                    ICustomTabsCallbackStub = i4 % 128;
                    int i5 = i4 % 2;
                    brickModuleImplExternalSyntheticLambda0.IAuthTabCallback = true;
                    super/*com.google.android.material.bottomsheet.BottomSheetDialog*/.cancel();
                }
                return null;
            }
        }
        brickModuleImplExternalSyntheticLambda0.ICustomTabsCallbackDefault();
        int i6 = ICustomTabsCallbackStub + 35;
        onUnminimized = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    private final boolean onMinimized() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 1;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        if (writeTypedObject().getTranslationY() != 0.0f || writeTypedObject().getTranslationX() != 0.0f) {
            return false;
        }
        int i4 = onUnminimized + 75;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ICustomTabsCallbackDefault() {
        int i = 2 % 2;
        int i2 = onUnminimized;
        int i3 = i2 + 77;
        ICustomTabsCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Rally rally = this.ICustomTabsCallbackDefault;
        if (rally != null) {
            int i5 = i2 + 31;
            ICustomTabsCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                if (!rally.postMessage()) {
                    return;
                }
            } else if (rally.postMessage()) {
                return;
            }
        }
        if (onMinimized()) {
            int i6 = onUnminimized + 89;
            ICustomTabsCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            this.ICustomTabsCallbackDefault = isFireOS.onExtraCallbackWithResult(RallysKt.onWarmupCompleted(writeTypedObject(), deprecated_proxy.onNavigationEvent(deprecated_proxy.onNavigationEvent, (deprecated_proxySelector) null, certificatePinner.X, 1, (Object) null).onNavigationEvent(), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, Boolean.FALSE, 0, 0L, false, 1916, (Object) null), false, 1, (Object) null);
            int i8 = ICustomTabsCallbackStub + 89;
            onUnminimized = i8 % 128;
            int i9 = i8 % 2;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        minFresh.onNavigationEvent(context, noStore.Companion.access100());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void show() {
        int i = 2 % 2;
        int i2 = onUnminimized + 35;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        super/*android.app.Dialog*/.show();
        this.asBinder = false;
        this.IAuthTabCallback = false;
        Window window = getWindow();
        if (window != null) {
            int i4 = onUnminimized + 43;
            ICustomTabsCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            window.setDimAmount(((Float) onWarmupCompleted(new Object[]{this}, 154214211, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -154214197, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback())).floatValue());
            int i6 = ICustomTabsCallbackStub + 33;
            onUnminimized = i6 % 128;
            int i7 = i6 % 2;
        }
        writeTypedObject().setAlpha(1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void dismiss() {
        DialogInterface.OnCancelListener onCancelListener;
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 75;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        if (this.asBinder) {
            return;
        }
        this.asBinder = true;
        onTransact().setAttachedView(null);
        if (this.ICustomTabsCallbackStubProxy) {
            if (this.IAuthTabCallback && (onCancelListener = this.onNavigationEvent) != null) {
                int i4 = onUnminimized + 77;
                ICustomTabsCallbackStub = i4 % 128;
                if (i4 % 2 == 0) {
                    onCancelListener.onCancel(this);
                } else {
                    onCancelListener.onCancel(this);
                    int i5 = 89 / 0;
                }
            }
            super/*androidx.appcompat.app.AppCompatDialog*/.dismiss();
            return;
        }
        onWarmupCompleted((Function0<Unit>) new Function0() { // from class: im.toss.uikit.widget.dialog.BaseTdsBottomSheetV2$$ExternalSyntheticLambda4
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i6 = 2 % 2;
                int i7 = onExtraCallbackWithResult + 69;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                Unit unitOnNavigationEvent = BrickModuleImplExternalSyntheticLambda0.onNavigationEvent(this.f$0);
                int i9 = onExtraCallbackWithResult + 125;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                return unitOnNavigationEvent;
            }
        });
        int i6 = onUnminimized + 99;
        ICustomTabsCallbackStub = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit writeTypedObject(BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onUnminimized + 15;
        int i3 = i2 % 128;
        ICustomTabsCallbackStub = i3;
        if (i2 % 2 != 0) {
            boolean z = brickModuleImplExternalSyntheticLambda0.IAuthTabCallback;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (brickModuleImplExternalSyntheticLambda0.IAuthTabCallback) {
            int i4 = i3 + 45;
            int i5 = i4 % 128;
            onUnminimized = i5;
            int i6 = i4 % 2;
            DialogInterface.OnCancelListener onCancelListener = brickModuleImplExternalSyntheticLambda0.onNavigationEvent;
            if (onCancelListener != null) {
                int i7 = i5 + 39;
                ICustomTabsCallbackStub = i7 % 128;
                int i8 = i7 % 2;
                onCancelListener.onCancel(brickModuleImplExternalSyntheticLambda0);
            }
        }
        if (brickModuleImplExternalSyntheticLambda0.isShowing()) {
            super/*androidx.appcompat.app.AppCompatDialog*/.dismiss();
            return Unit.INSTANCE;
        }
        Unit unit = Unit.INSTANCE;
        int i9 = ICustomTabsCallbackStub + 1;
        onUnminimized = i9 % 128;
        int i10 = i9 % 2;
        return unit;
    }

    public static final class onExtraCallback implements View.OnTouchListener {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public static /* synthetic */ float onExtraCallbackWithResult(BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0, float f) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 33;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            float fOnNavigationEvent = onNavigationEvent(brickModuleImplExternalSyntheticLambda0, f);
            int i4 = onExtraCallback + 27;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return fOnNavigationEvent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        onExtraCallback() {
        }

        private static final void onWarmupCompleted(BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0, float f, float f2, MotionEvent motionEvent) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 77;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            BrickModuleImplExternalSyntheticLambda0.onExtraCallback(brickModuleImplExternalSyntheticLambda0, f);
            BrickModuleImplExternalSyntheticLambda0.onNavigationEvent(brickModuleImplExternalSyntheticLambda0, f2);
            BrickModuleImplExternalSyntheticLambda0.IAuthTabCallbackStub(brickModuleImplExternalSyntheticLambda0).setPivotX(motionEvent.getX());
            BrickModuleImplExternalSyntheticLambda0.IAuthTabCallbackStub(brickModuleImplExternalSyntheticLambda0).setPivotY(motionEvent.getY());
            BrickModuleImplExternalSyntheticLambda0.onWarmupCompleted(new Object[]{brickModuleImplExternalSyntheticLambda0}, 1187649555, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1187649553, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
            int i4 = onExtraCallback + 25;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(motionEvent, "");
            view.getParent().requestDisallowInterceptTouchEvent(true);
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            int action = motionEvent.getAction();
            if (action == 0) {
                onWarmupCompleted(BrickModuleImplExternalSyntheticLambda0.this, rawX, rawY, motionEvent);
                return true;
            }
            if (action != 1) {
                int i2 = onNavigationEvent + 69;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0 ? action == 2 : action == 2) {
                    if (BrickModuleImplExternalSyntheticLambda0.asBinder(BrickModuleImplExternalSyntheticLambda0.this) < 0.0f) {
                        int i3 = onExtraCallback + 111;
                        onNavigationEvent = i3 % 128;
                        int i4 = i3 % 2;
                        if (BrickModuleImplExternalSyntheticLambda0.onTransact(BrickModuleImplExternalSyntheticLambda0.this) < 0.0f) {
                            onWarmupCompleted(BrickModuleImplExternalSyntheticLambda0.this, rawX, rawY, motionEvent);
                        }
                    }
                    float fAsBinder = BrickModuleImplExternalSyntheticLambda0.asBinder(BrickModuleImplExternalSyntheticLambda0.this);
                    float fOnTransact = rawY - BrickModuleImplExternalSyntheticLambda0.onTransact(BrickModuleImplExternalSyntheticLambda0.this);
                    BaseTdsBottomSheetV2$setGesture$touchListener$1$.ExternalSyntheticLambda0 externalSyntheticLambda0 = new BaseTdsBottomSheetV2$setGesture$touchListener$1$.ExternalSyntheticLambda0(BrickModuleImplExternalSyntheticLambda0.this);
                    if (fOnTransact <= 0.0f) {
                        float fAbs = Math.abs(fOnTransact);
                        Intrinsics.checkNotNullExpressionValue(BrickModuleImplExternalSyntheticLambda0.this.getContext().getResources().getDisplayMetrics(), "");
                        float fFloatValue = ((Number) externalSyntheticLambda0.invoke(Float.valueOf(RangesKt___RangesKt.coerceAtMost(fAbs, varyMatches.onNavigationEvent(100, r7))))).floatValue();
                        Intrinsics.checkNotNullExpressionValue(BrickModuleImplExternalSyntheticLambda0.this.getContext().getResources().getDisplayMetrics(), "");
                        fOnTransact = (-fFloatValue) + RangesKt___RangesKt.coerceAtMost((fOnTransact + varyMatches.onNavigationEvent(100, r0)) * 0.1f, 0.0f);
                    }
                    BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0 = BrickModuleImplExternalSyntheticLambda0.this;
                    BrickModuleImplExternalSyntheticLambda0.onExtraCallbackWithResult(brickModuleImplExternalSyntheticLambda0, fOnTransact - BrickModuleImplExternalSyntheticLambda0.IAuthTabCallbackStub(brickModuleImplExternalSyntheticLambda0).getTranslationY());
                    BrickModuleImplExternalSyntheticLambda0.IAuthTabCallbackStub(BrickModuleImplExternalSyntheticLambda0.this).setTranslationX(RangesKt___RangesKt.coerceIn((rawX - fAsBinder) * 0.1f, -BrickModuleImplExternalSyntheticLambda0.asInterface(BrickModuleImplExternalSyntheticLambda0.this), BrickModuleImplExternalSyntheticLambda0.asInterface(BrickModuleImplExternalSyntheticLambda0.this)));
                    BrickModuleImplExternalSyntheticLambda0.IAuthTabCallbackStub(BrickModuleImplExternalSyntheticLambda0.this).setTranslationY(fOnTransact);
                    Window window = BrickModuleImplExternalSyntheticLambda0.this.getWindow();
                    if (window != null) {
                        window.setDimAmount(BrickModuleImplExternalSyntheticLambda0.IAuthTabCallback(BrickModuleImplExternalSyntheticLambda0.this));
                    }
                    return true;
                }
                if (action != 3) {
                    return false;
                }
            }
            float fOnTransact2 = rawY - BrickModuleImplExternalSyntheticLambda0.onTransact(BrickModuleImplExternalSyntheticLambda0.this);
            BrickModuleImplExternalSyntheticLambda0.onExtraCallback(BrickModuleImplExternalSyntheticLambda0.this, -1.0f);
            BrickModuleImplExternalSyntheticLambda0.onNavigationEvent(BrickModuleImplExternalSyntheticLambda0.this, -1.0f);
            DisplayMetrics displayMetrics = BrickModuleImplExternalSyntheticLambda0.this.getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            int iOnNavigationEvent = varyMatches.onNavigationEvent(50, displayMetrics);
            DisplayMetrics displayMetrics2 = BrickModuleImplExternalSyntheticLambda0.this.getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
            int iOnNavigationEvent2 = varyMatches.onNavigationEvent(50, displayMetrics2);
            if (fOnTransact2 >= iOnNavigationEvent) {
                int i5 = onNavigationEvent + 11;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                if (BrickModuleImplExternalSyntheticLambda0.IAuthTabCallbackDefault(BrickModuleImplExternalSyntheticLambda0.this) > 0.0f) {
                    BrickModuleImplExternalSyntheticLambda0.onExtraCallbackWithResult(BrickModuleImplExternalSyntheticLambda0.this, 0);
                    if (!BrickModuleImplExternalSyntheticLambda0.this.onExtraCallback(0)) {
                        BrickModuleImplExternalSyntheticLambda0.access100(BrickModuleImplExternalSyntheticLambda0.this);
                    }
                    return true;
                }
            }
            if (fOnTransact2 <= (-iOnNavigationEvent2) && BrickModuleImplExternalSyntheticLambda0.IAuthTabCallback_Parcel(BrickModuleImplExternalSyntheticLambda0.this) && !BrickModuleImplExternalSyntheticLambda0.this.access100()) {
                BrickModuleImplExternalSyntheticLambda0.this.asBinder();
            }
            BrickModuleImplExternalSyntheticLambda0.access100(BrickModuleImplExternalSyntheticLambda0.this);
            view.getParent().requestDisallowInterceptTouchEvent(false);
            return true;
        }

        private static final float onNavigationEvent(BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0, float f) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 3;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            float fOnExtraCallbackWithResult = (((-9.0f) / (BrickModuleImplExternalSyntheticLambda0.onExtraCallbackWithResult(brickModuleImplExternalSyntheticLambda0) * 20.0f)) * f * f) + f;
            int i4 = onExtraCallback + 17;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 31 / 0;
            }
            return fOnExtraCallbackWithResult;
        }
    }

    private final void onPostMessage() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub;
        int i3 = i2 + 11;
        onUnminimized = i3 % 128;
        int i4 = i3 % 2;
        Rally rally = this.onRelationshipValidationResult;
        Object obj = null;
        if (rally != null) {
            int i5 = i2 + 75;
            onUnminimized = i5 % 128;
            if (i5 % 2 == 0) {
                rally.ICustomTabsServiceStub();
                throw null;
            }
            rally.ICustomTabsServiceStub();
        }
        this.onRelationshipValidationResult = isFireOS.onExtraCallbackWithResult((Rally) RallysKt.onWarmupCompleted(new Object[]{writeTypedObject(), isMuted.asBinder((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.asInterface()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, Float.valueOf(0.98f), (Function1) null, 5, (Object) null), 0, null, 0, null, null, Boolean.FALSE, 0, 0L, false, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), false, 1, (Object) null);
        Rally rally2 = this.IAuthTabCallbackDefault;
        if (rally2 != null) {
            rally2.ICustomTabsServiceStub();
        }
        int i6 = ICustomTabsCallbackStub + 123;
        onUnminimized = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        SetDetectingInterval setDetectingInterval = (BrickModuleImplExternalSyntheticLambda0) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        Window window = setDetectingInterval.getWindow();
        if (window != null) {
            int i2 = onUnminimized + 33;
            ICustomTabsCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                window.setDimAmount(fFloatValue);
                throw null;
            }
            window.setDimAmount(fFloatValue);
            int i3 = ICustomTabsCallbackStub + 33;
            onUnminimized = i3 % 128;
            int i4 = i3 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i5 = onUnminimized + 31;
        ICustomTabsCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private final void ICustomTabsCallback() {
        int i = 2 % 2;
        Rally rally = this.onRelationshipValidationResult;
        Object obj = null;
        if (rally != null) {
            int i2 = ICustomTabsCallbackStub + 81;
            onUnminimized = i2 % 128;
            if (i2 % 2 == 0) {
                rally.ICustomTabsServiceStub();
                obj.hashCode();
                throw null;
            }
            rally.ICustomTabsServiceStub();
        }
        TdsRoundLayout tdsRoundLayoutWriteTypedObject = writeTypedObject();
        deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{isMuted.asBinder((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, Float.valueOf(1.0f), (Function1) null, 5, (Object) null), Float.valueOf(((Float) onWarmupCompleted(new Object[]{this}, 330793922, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -330793921, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback())).floatValue()), Float.valueOf(((Float) onWarmupCompleted(new Object[]{this}, 154214211, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -154214197, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback())).floatValue()), new BaseTdsBottomSheetV2$.ExternalSyntheticLambda8(this), null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
        Boolean bool = Boolean.FALSE;
        this.onRelationshipValidationResult = isFireOS.onExtraCallbackWithResult((Rally) RallysKt.onWarmupCompleted(new Object[]{tdsRoundLayoutWriteTypedObject, appLovinSdkSettings, 0, null, 0, null, null, bool, 0, 0L, false, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), false, 1, (Object) null);
        this.IAuthTabCallbackDefault = isFireOS.onExtraCallbackWithResult((Rally) RallysKt.onWarmupCompleted(new Object[]{writeTypedObject(), isMuted.onExtraCallback(isMuted.onExtraCallbackWithResult((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.asInterface()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Integer) null, 0, (Function1) null, 5, (Object) null), (Integer) null, 0, (Function1) null, 5, (Object) null), 0, null, 0, null, null, bool, 0, 0L, false, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), false, 1, (Object) null);
        int i3 = onUnminimized + 55;
        ICustomTabsCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static final class onWarmupCompleted implements Function0<Unit> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        onWarmupCompleted() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 29;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback();
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 47;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            BrickModuleImplExternalSyntheticLambda0.getInterfaceDescriptor(BrickModuleImplExternalSyntheticLambda0.this);
            if (i3 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static final Unit readTypedObject() {
        int i = 2 % 2;
        int i2 = onUnminimized + 45;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onUnminimized + 7;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 98 / 0;
        }
        return unit;
    }

    public final void onWarmupCompleted(@NotNull final Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 15;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        runOnUiThreadDelayed runonuithreaddelayed = this.onTransact;
        if (runonuithreaddelayed != null) {
            runonuithreaddelayed.onNavigationEvent();
            int i4 = onUnminimized + 39;
            ICustomTabsCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        }
        pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
        TdsRoundLayout tdsRoundLayoutWriteTypedObject = writeTypedObject();
        AppLovinSdkSettings appLovinSdkSettingsOnWarmupCompleted = isMuted.onWarmupCompleted(isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.asInterface()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, Float.valueOf(0.0f), (Function1) null, 5, (Object) null), (String) null, "+=100dp", (Function1) null, 5, (Object) null);
        float fFloatValue = ((Float) onWarmupCompleted(new Object[]{this}, 330793922, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -330793921, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback())).floatValue();
        Object[] objArr = {appLovinSdkSettingsOnWarmupCompleted, Float.valueOf(fFloatValue), Float.valueOf(0.0f), new Function1() { // from class: im.toss.uikit.widget.dialog.BaseTdsBottomSheetV2$$ExternalSyntheticLambda10
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i6 = 2 % 2;
                int i7 = onExtraCallback + 85;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0 = this.f$0;
                float fFloatValue2 = ((Float) obj).floatValue();
                if (i8 == 0) {
                    return BrickModuleImplExternalSyntheticLambda0.IAuthTabCallback(brickModuleImplExternalSyntheticLambda0, fFloatValue2);
                }
                BrickModuleImplExternalSyntheticLambda0.IAuthTabCallback(brickModuleImplExternalSyntheticLambda0, fFloatValue2);
                throw null;
            }
        }, null, 8, null};
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, objArr, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
        Boolean bool = Boolean.FALSE;
        this.onTransact = isFireOS.onExtraCallbackWithResult(runOnUiThreadDelayed.onWarmupCompleted(RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt__CollectionsJVMKt.listOf((Rally) RallysKt.onWarmupCompleted(new Object[]{tdsRoundLayoutWriteTypedObject, appLovinSdkSettings, 0, null, 0, null, null, bool, 0, 0L, false, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, bool, 0, 0L, false, 3833, (Object) null), (Object) null, new Function0() { // from class: im.toss.uikit.widget.dialog.BaseTdsBottomSheetV2$$ExternalSyntheticLambda11
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i6 = 2 % 2;
                int i7 = onExtraCallback + 71;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                Unit unitOnExtraCallbackWithResult = BrickModuleImplExternalSyntheticLambda0.onExtraCallbackWithResult(function0);
                if (i8 != 0) {
                    int i9 = 60 / 0;
                }
                return unitOnExtraCallbackWithResult;
            }
        }, 1, (Object) null), false, 1, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit asInterface(BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0, float f) {
        int i = 2 % 2;
        if (ViewCompat.ICustomTabsCallbackStubProxy(brickModuleImplExternalSyntheticLambda0.onExtraCallbackWithResult)) {
            int i2 = ICustomTabsCallbackStub + 77;
            onUnminimized = i2 % 128;
            int i3 = i2 % 2;
            Window window = brickModuleImplExternalSyntheticLambda0.getWindow();
            if (window != null) {
                int i4 = onUnminimized + 63;
                ICustomTabsCallbackStub = i4 % 128;
                int i5 = i4 % 2;
                window.setDimAmount(f);
                int i6 = ICustomTabsCallbackStub + 77;
                onUnminimized = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        Unit unit = Unit.INSTANCE;
        int i8 = ICustomTabsCallbackStub + 107;
        onUnminimized = i8 % 128;
        if (i8 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        int i = 2 % 2;
        int i2 = onUnminimized + 39;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallbackStub + 69;
        onUnminimized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 93 / 0;
        }
        return unit;
    }

    private static final boolean onExtraCallback(View view) {
        int i = 2 % 2;
        int i2 = onUnminimized + 25;
        ICustomTabsCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            boolean z = view instanceof RecyclerView;
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        if (!(view instanceof RecyclerView)) {
            int i3 = onUnminimized;
            int i4 = i3 + 95;
            ICustomTabsCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                boolean z2 = view instanceof NestedScrollView;
                obj.hashCode();
                throw null;
            }
            if (!(view instanceof NestedScrollView) && (!(view instanceof ScrollView))) {
                int i5 = i3 + 5;
                ICustomTabsCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                int i7 = i3 + 87;
                ICustomTabsCallbackStub = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
        }
        return true;
    }

    private static final Unit extraCallback(BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onUnminimized + 29;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        brickModuleImplExternalSyntheticLambda0.getBehavior().setState(3);
        Unit unit = Unit.INSTANCE;
        int i4 = onUnminimized + 1;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 89 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void asBinder() {
        int iOnNavigationEvent;
        int iComputeVerticalScrollRange;
        View childAt;
        int i = 2 % 2;
        if (this.IAuthTabCallbackStubProxy) {
            if (asInterface().getMeasuredHeight() > 0) {
                iOnNavigationEvent = asInterface().getHeight();
            } else {
                DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                iOnNavigationEvent = varyMatches.onNavigationEvent(10, displayMetrics);
            }
            RecyclerView recyclerViewOnWarmupCompleted = generateInviteUrl.onWarmupCompleted(onTransact(), new Function1() { // from class: im.toss.uikit.widget.dialog.BaseTdsBottomSheetV2$$ExternalSyntheticLambda15
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i2 = 2 % 2;
                    int i3 = IAuthTabCallback + 5;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    Boolean boolValueOf = Boolean.valueOf(BrickModuleImplExternalSyntheticLambda0.asInterface((View) obj));
                    int i5 = IAuthTabCallback + 89;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return boolValueOf;
                }
            });
            if (recyclerViewOnWarmupCompleted == null) {
                Iterator itIAuthTabCallback = EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback(onTransact()).IAuthTabCallback();
                int measuredHeight = 0;
                while (itIAuthTabCallback.hasNext()) {
                    int i2 = ICustomTabsCallbackStub + 33;
                    onUnminimized = i2 % 128;
                    int i3 = i2 % 2;
                    measuredHeight += ((View) itIAuthTabCallback.next()).getMeasuredHeight();
                }
                iComputeVerticalScrollRange = measuredHeight;
            } else if (recyclerViewOnWarmupCompleted instanceof RecyclerView) {
                int i4 = ICustomTabsCallbackStub + 29;
                onUnminimized = i4 % 128;
                int i5 = i4 % 2;
                iComputeVerticalScrollRange = recyclerViewOnWarmupCompleted.computeVerticalScrollRange();
            } else if (recyclerViewOnWarmupCompleted instanceof NestedScrollView) {
                int i6 = ICustomTabsCallbackStub + 25;
                onUnminimized = i6 % 128;
                int i7 = i6 % 2;
                iComputeVerticalScrollRange = ((NestedScrollView) recyclerViewOnWarmupCompleted).computeVerticalScrollRange();
            } else if (!(recyclerViewOnWarmupCompleted instanceof ScrollView) || (childAt = ((ScrollView) recyclerViewOnWarmupCompleted).getChildAt(0)) == null) {
                iComputeVerticalScrollRange = IntCompanionObject.MAX_VALUE;
            } else {
                int height = childAt.getHeight();
                int i8 = onUnminimized + Imgproc.COLOR_YUV2RGB_YVYU;
                ICustomTabsCallbackStub = i8 % 128;
                int i9 = i8 % 2;
                iComputeVerticalScrollRange = height;
            }
            M_ m_ = M_.onExtraCallback;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iMin = Integer.min(iComputeVerticalScrollRange, (m_.IAuthTabCallback(context) - iOnNavigationEvent) + this.extraCallbackWithResult + this.onMessageChannelReady);
            if (onTransact().getMeasuredHeight() >= iMin - access000().getMeasuredHeight()) {
                onNavigationEvent(false);
                return;
            }
            onTransact().setExpandedMaxHeight(iMin - access000().getMeasuredHeight());
            onNavigationEvent(true);
            if (this.IAuthTabCallbackStub < 0) {
                this.IAuthTabCallbackStub = writeTypedObject().getMeasuredHeight();
            }
            isFireOS.onExtraCallbackWithResult(Rally.onTransact((Rally) RallysKt.onWarmupCompleted(new Object[]{writeTypedObject(), (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -1685808947, new Object[]{(AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), null, Integer.valueOf(iMin), null, 5, null}, 1685808950, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, Boolean.FALSE, 0, 0L, false, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Object) null, new Function0() { // from class: im.toss.uikit.widget.dialog.BaseTdsBottomSheetV2$$ExternalSyntheticLambda16
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i10 = 2 % 2;
                    int i11 = onExtraCallbackWithResult + 9;
                    IAuthTabCallback = i11 % 128;
                    int i12 = i11 % 2;
                    Unit unit = (Unit) BrickModuleImplExternalSyntheticLambda0.onWarmupCompleted(new Object[]{this.f$0}, 2013455303, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -2013455293, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
                    int i13 = onExtraCallbackWithResult + 25;
                    IAuthTabCallback = i13 % 128;
                    if (i13 % 2 == 0) {
                        return unit;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }, 1, (Object) null), false, 1, (Object) null);
        }
    }

    private static final Unit access000(BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onUnminimized + 115;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        brickModuleImplExternalSyntheticLambda0.getBehavior().setState(4);
        Unit unit = Unit.INSTANCE;
        int i4 = onUnminimized + 111;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 41 / 0;
        }
        return unit;
    }

    public final void IAuthTabCallbackDefault() {
        int measuredHeight;
        int i = 2 % 2;
        if (this.IAuthTabCallbackStubProxy) {
            onNavigationEvent(false);
            if (this.IAuthTabCallbackStub > onTransact().getMeasuredHeight()) {
                int i2 = ICustomTabsCallbackStub + 73;
                onUnminimized = i2 % 128;
                int i3 = i2 % 2;
                measuredHeight = onTransact().getMeasuredHeight() + access000().getMeasuredHeight();
            } else {
                int i4 = this.IAuthTabCallbackStub;
                int i5 = ICustomTabsCallbackStub + 65;
                onUnminimized = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 3 % 5;
                }
                measuredHeight = i4;
            }
            TdsRoundLayout tdsRoundLayoutWriteTypedObject = writeTypedObject();
            Object[] objArr = {(AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), null, Integer.valueOf(measuredHeight), null, 5, null};
            Object[] objArr2 = {(Rally) RallysKt.onWarmupCompleted(new Object[]{tdsRoundLayoutWriteTypedObject, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -1685808947, objArr, 1685808950, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, Boolean.FALSE, 0, 0L, false, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), null, new Function0() { // from class: im.toss.uikit.widget.dialog.BaseTdsBottomSheetV2$$ExternalSyntheticLambda0
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i7 = 2 % 2;
                    int i8 = onNavigationEvent + 41;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                    Unit unitOnExtraCallback = BrickModuleImplExternalSyntheticLambda0.onExtraCallback(this.f$0);
                    int i10 = onWarmupCompleted + 63;
                    onNavigationEvent = i10 % 128;
                    if (i10 % 2 != 0) {
                        return unitOnExtraCallback;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }, 1, null};
            int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            isFireOS.onExtraCallbackWithResult((Rally) Rally.onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -2128644225, iOnExtraCallback, objArr2, 2128644226), false, 1, (Object) null);
        }
    }

    public void setCancelable(boolean z) {
        int i = 2 % 2;
        int i2 = onUnminimized + 11;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        this.access100 = access8000.IAuthTabCallbackStubProxy(getWrite.IAuthTabCallback(-1, Boolean.valueOf(z)), getWrite.IAuthTabCallback(0, Boolean.valueOf(z)), getWrite.IAuthTabCallback(1, Boolean.valueOf(z)), getWrite.IAuthTabCallback(2, Boolean.valueOf(z)));
        int i4 = onUnminimized + 49;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onNavigationEvent(int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackStub + 83;
        onUnminimized = i3 % 128;
        int i4 = i3 % 2;
        Map<Integer, Boolean> map = this.access100;
        Integer numValueOf = Integer.valueOf(i);
        if (i4 != 0) {
            map.put(numValueOf, Boolean.valueOf(z));
            return;
        }
        map.put(numValueOf, Boolean.valueOf(z));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        if ((r1 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        r4 = r4.booleanValue();
        r1 = o.BrickModuleImplExternalSyntheticLambda0.onUnminimized + org.opencv.imgproc.Imgproc.COLOR_YUV2RGBA_YVYU;
        o.BrickModuleImplExternalSyntheticLambda0.ICustomTabsCallbackStub = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        r4.booleanValue();
        r4 = null;
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if (r4 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        if (r4 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        r1 = o.BrickModuleImplExternalSyntheticLambda0.onUnminimized + 75;
        o.BrickModuleImplExternalSyntheticLambda0.ICustomTabsCallbackStub = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onExtraCallback(int i) {
        Boolean bool;
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackStub + 25;
        onUnminimized = i3 % 128;
        if (i3 % 2 == 0) {
            bool = this.access100.get(Integer.valueOf(i));
            int i4 = 8 / 0;
        } else {
            bool = this.access100.get(Integer.valueOf(i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setContentView(int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackStub + 95;
        onUnminimized = i3 % 128;
        int i4 = i3 % 2;
        View viewInflate = getLayoutInflater().inflate(i, (ViewGroup) onTransact(), false);
        Intrinsics.checkNotNull(viewInflate);
        onWarmupCompleted(this, viewInflate, null, 2, null);
        int i5 = ICustomTabsCallbackStub + 61;
        onUnminimized = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setContentView(@NotNull View view) {
        int i = 2 % 2;
        int i2 = onUnminimized + 41;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Object obj = null;
        onWarmupCompleted(this, view, null, 2, null);
        int i4 = ICustomTabsCallbackStub + 79;
        onUnminimized = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void setContentView(@NotNull View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        int i = 2 % 2;
        int i2 = onUnminimized + 65;
        ICustomTabsCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            onNavigationEvent(view, layoutParams);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        onNavigationEvent(view, layoutParams);
        int i3 = onUnminimized + 85;
        ICustomTabsCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        ((o.BrickModuleImplExternalSyntheticLambda0) r14).onWarmupCompleted = r13;
        r2 = ((o.BrickModuleImplExternalSyntheticLambda0) r14).IAuthTabCallback_Parcel;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (r2 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        r1 = r1 + 75;
        o.BrickModuleImplExternalSyntheticLambda0.onUnminimized = r1 % 128;
        r1 = r1 % 2;
        r2.ICustomTabsServiceStub();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        ((o.BrickModuleImplExternalSyntheticLambda0) r14).IAuthTabCallback_Parcel = o.isFireOS.onExtraCallbackWithResult((im.toss.tds.foundation.anim.rally.Rally) im.toss.tds.foundation.anim.rally.RallysKt.onWarmupCompleted(new java.lang.Object[]{r14.writeTypedObject(), o.isMuted.getInterfaceDescriptor((o.AppLovinSdkSettings) im.toss.tds.foundation.anim.rally.RallysKt.onWarmupCompleted(new java.lang.Object[]{o.deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent()}, im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), -26725365, im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), 26725368), java.lang.Float.valueOf(r13), java.lang.Float.valueOf(0.0f), (kotlin.jvm.functions.Function1) null, 4, (java.lang.Object) null), 0, null, 0, null, null, java.lang.Boolean.FALSE, 0, 0L, false, 1916, null}, im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), -303858023, im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), 303858025), false, 1, (java.lang.Object) null);
        r1 = r14.writeTypedObject();
        r3 = r1.getLayoutParams();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00cd, code lost:
    
        if (r3 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00cf, code lost:
    
        r3 = (android.view.ViewGroup.MarginLayoutParams) r3;
        r4 = r14.getContext().getResources().getDisplayMetrics();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, "");
        r3.bottomMargin = o.varyMatches.onNavigationEvent(10, r4) + r13;
        r1.setLayoutParams(r3);
        r1 = o.BrickModuleImplExternalSyntheticLambda0.onUnminimized + 115;
        o.BrickModuleImplExternalSyntheticLambda0.ICustomTabsCallbackStub = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00fd, code lost:
    
        if ((r1 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ff, code lost:
    
        r1 = 92 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0102, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x010a, code lost:
    
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0029, code lost:
    
        if (((o.BrickModuleImplExternalSyntheticLambda0) r14).onWarmupCompleted == r13) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        if (((o.BrickModuleImplExternalSyntheticLambda0) r14).onWarmupCompleted == r13) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
    
        return null;
     */
    /* JADX WARN: Type inference failed for: r14v1, types: [android.app.Dialog, o.BrickModuleImplExternalSyntheticLambda0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        ?? r14 = (BrickModuleImplExternalSyntheticLambda0) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub;
        int i3 = i2 + 65;
        onUnminimized = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 78 / 0;
        }
    }

    static /* synthetic */ void onWarmupCompleted(BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0, View view, ViewGroup.LayoutParams layoutParams, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onUnminimized + 111;
        int i4 = i3 % 128;
        ICustomTabsCallbackStub = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setBottomSheetContentView");
        }
        if ((i & 2) != 0) {
            int i5 = i4 + 67;
            onUnminimized = i5 % 128;
            int i6 = i5 % 2;
            layoutParams = null;
        }
        brickModuleImplExternalSyntheticLambda0.onNavigationEvent(view, layoutParams);
    }

    private static final boolean onExtraCallbackWithResult(View view) {
        int i = 2 % 2;
        int i2 = onUnminimized + Imgproc.COLOR_YUV2RGB_YVYU;
        ICustomTabsCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            boolean z = view instanceof TdsScrollView;
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        if ((view instanceof TdsScrollView) || (view instanceof TdsNestedScrollView)) {
            return true;
        }
        int i3 = onUnminimized + 27;
        int i4 = i3 % 128;
        ICustomTabsCallbackStub = i4;
        boolean z2 = view instanceof TdsRecyclerView;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (z2) {
            return true;
        }
        int i5 = i4 + 125;
        onUnminimized = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    private final void onNavigationEvent(View view, ViewGroup.LayoutParams layoutParams) {
        View viewOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onUnminimized + 111;
        ICustomTabsCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onTransact().removeAllViews();
            throw null;
        }
        onTransact().removeAllViews();
        if (layoutParams != null) {
            view.setLayoutParams(layoutParams);
            onTransact().addView(view, layoutParams);
            setProxySelectorokhttp.onExtraCallbackWithResult(onTransact(), view);
        } else {
            view.setLayoutParams(Companion.onNavigationEvent());
            setProxySelectorokhttp.onExtraCallbackWithResult(onTransact(), view);
        }
        if (this.onActivityResized < 1.0f) {
            int i3 = ICustomTabsCallbackStub + 33;
            onUnminimized = i3 % 128;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (this.onExtraCallback == null && (viewOnWarmupCompleted = generateInviteUrl.onWarmupCompleted(onTransact(), new Function1() { // from class: im.toss.uikit.widget.dialog.BaseTdsBottomSheetV2$$ExternalSyntheticLambda3
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int i4 = 2 % 2;
                    int i5 = onExtraCallbackWithResult + 111;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    Boolean boolValueOf = Boolean.valueOf(BrickModuleImplExternalSyntheticLambda0.onTransact((View) obj2));
                    int i7 = onWarmupCompleted + 7;
                    onExtraCallbackWithResult = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i8 = 98 / 0;
                    }
                    return boolValueOf;
                }
            })) != null) {
                onWarmupCompleted(new Object[]{this, viewOnWarmupCompleted}, 507117893, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -507117885, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
            }
        }
        int i4 = onUnminimized + 73;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 33 / 0;
        }
    }

    private final void extraCallback() {
        int i = 2 % 2;
        View viewFindViewById = findViewById(com.google.android.material.R.id.touch_outside);
        if (viewFindViewById != null) {
            Context context = viewFindViewById.getContext();
            int i2 = im.toss.uikit.R.string.uikit_content_desc_close;
            viewFindViewById.setContentDescription(context.getString(i2));
            viewFindViewById.setFocusable(true);
            viewFindViewById.setImportantForAccessibility(1);
            SuspendAnimationKtExternalSyntheticLambda4.IAuthTabCallback iAuthTabCallback = SuspendAnimationKtExternalSyntheticLambda4.IAuthTabCallback.IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(iAuthTabCallback, "");
            setProtocolsokhttp.IAuthTabCallback(viewFindViewById, iAuthTabCallback, viewFindViewById.getContext().getString(i2));
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(im.toss.uikit.R.id.container);
        if (viewGroup != null) {
            int i3 = ICustomTabsCallbackStub + 65;
            onUnminimized = i3 % 128;
            int i4 = i3 % 2;
            Iterator itIAuthTabCallback = EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback(viewGroup).IAuthTabCallback();
            int i5 = onUnminimized + 47;
            ICustomTabsCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            Object obj = null;
            while (!(!itIAuthTabCallback.hasNext())) {
                Object next = itIAuthTabCallback.next();
                if (((View) next).getVisibility() == 0 && !(!r6.isImportantForAccessibility())) {
                    obj = next;
                }
            }
            View view = (View) obj;
            if (view != null) {
                int i7 = ICustomTabsCallbackStub + 53;
                onUnminimized = i7 % 128;
                int i8 = i7 % 2;
                if (viewFindViewById != null) {
                    viewFindViewById.setAccessibilityTraversalAfter(view.getId());
                }
            }
        }
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new BaseTdsBottomSheetV2$.ExternalSyntheticLambda12(this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onNavigationEvent(BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 91;
        onUnminimized = i2 % 128;
        if (i2 % 2 != 0) {
            Context context = brickModuleImplExternalSyntheticLambda0.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            if (varyFields.onWarmupCompleted(context) && brickModuleImplExternalSyntheticLambda0.isShowing()) {
                int i3 = ICustomTabsCallbackStub + 13;
                onUnminimized = i3 % 128;
                int i4 = i3 % 2;
                brickModuleImplExternalSyntheticLambda0.dismiss();
                return;
            }
            return;
        }
        Context context2 = brickModuleImplExternalSyntheticLambda0.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        varyFields.onWarmupCompleted(context2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onBackPressed() {
        int i = 2 % 2;
        int i2 = onUnminimized + 41;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        if (this.getInterfaceDescriptor) {
            IAuthTabCallbackDefault();
            return;
        }
        if (onExtraCallback(1)) {
            int i4 = onUnminimized + 17;
            ICustomTabsCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            super/*com.google.android.material.bottomsheet.BottomSheetDialog*/.setCancelable(true);
        }
        onWarmupCompleted(new Object[]{this, 1}, 1440138886, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1440138877, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
        int i6 = onUnminimized + Imgproc.COLOR_YUV2RGBA_YVYU;
        ICustomTabsCallbackStub = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 37 / 0;
        }
    }

    public void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver;
        int i = 2 % 2;
        int i2 = onUnminimized + 29;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            super/*com.google.android.material.bottomsheet.BottomSheetDialog*/.onDetachedFromWindow();
            runOnUiThreadDelayed runonuithreaddelayed = this.onTransact;
            if (runonuithreaddelayed != null) {
                runonuithreaddelayed.onNavigationEvent();
            }
            View viewAq_ = aq_();
            if (viewAq_ != null && (viewTreeObserver = viewAq_.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
                int i3 = onUnminimized + 83;
                ICustomTabsCallbackStub = i3 % 128;
                int i4 = i3 % 2;
            }
            IEngagementSignalsCallback();
            return;
        }
        super/*com.google.android.material.bottomsheet.BottomSheetDialog*/.onDetachedFromWindow();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        int height;
        int i = 2 % 2;
        Rect rect = new Rect();
        View viewAq_ = aq_();
        if (viewAq_ != null) {
            int i2 = onUnminimized + 31;
            ICustomTabsCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            viewAq_.getWindowVisibleDisplayFrame(rect);
        }
        View viewAq_2 = aq_();
        if (viewAq_2 != null) {
            height = viewAq_2.getHeight();
        } else {
            M_ m_ = M_.onExtraCallback;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iIAuthTabCallback = m_.IAuthTabCallback(context);
            int i4 = onUnminimized + 25;
            ICustomTabsCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            height = iIAuthTabCallback;
        }
        onWarmupCompleted(new Object[]{this, Integer.valueOf(RangesKt___RangesKt.coerceAtLeast(height - rect.bottom, 0))}, -24177225, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 24177228, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
    }

    public static final class IAuthTabCallback extends RecyclerView.OnScrollListener {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        IAuthTabCallback() {
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            int i3 = 2 % 2;
            int i4 = onExtraCallback + 69;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.checkNotNullParameter(recyclerView, "");
            if (i2 > 0) {
                int i6 = onExtraCallback + 11;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                if (!BrickModuleImplExternalSyntheticLambda0.this.access100()) {
                    BrickModuleImplExternalSyntheticLambda0.this.asBinder();
                }
            }
            int i8 = onWarmupCompleted + 111;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    private static final void onExtraCallback(BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0, View view, int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = onUnminimized;
        int i7 = i6 + 27;
        ICustomTabsCallbackStub = i7 % 128;
        int i8 = i7 % 2;
        if (i2 - i4 > 0 && (!brickModuleImplExternalSyntheticLambda0.getInterfaceDescriptor)) {
            int i9 = i6 + 35;
            ICustomTabsCallbackStub = i9 % 128;
            int i10 = i9 % 2;
            brickModuleImplExternalSyntheticLambda0.asBinder();
            int i11 = onUnminimized + 47;
            ICustomTabsCallbackStub = i11 % 128;
            int i12 = i11 % 2;
        }
        int i13 = onUnminimized + 3;
        ICustomTabsCallbackStub = i13 % 128;
        if (i13 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onWarmupCompleted(BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0, View view, int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = onUnminimized;
        int i7 = i6 + 13;
        ICustomTabsCallbackStub = i7 % 128;
        if (i7 % 2 != 0) {
            if ((i2 >>> i4) <= 0) {
                return;
            }
        } else if (i2 - i4 <= 0) {
            return;
        }
        if (brickModuleImplExternalSyntheticLambda0.getInterfaceDescriptor) {
            return;
        }
        int i8 = i6 + 87;
        ICustomTabsCallbackStub = i8 % 128;
        int i9 = i8 % 2;
        brickModuleImplExternalSyntheticLambda0.asBinder();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object asInterface(Object[] objArr) {
        final BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0 = (BrickModuleImplExternalSyntheticLambda0) objArr[0];
        RecyclerView recyclerView = (View) objArr[1];
        int i = 2 % 2;
        int i2 = onUnminimized + 59;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            recyclerView.setNestedScrollingEnabled(true);
            recyclerView.setOverScrollMode(4);
            if (recyclerView instanceof RecyclerView) {
                recyclerView.addOnScrollListener(brickModuleImplExternalSyntheticLambda0.new IAuthTabCallback());
                brickModuleImplExternalSyntheticLambda0.onNavigationEvent((View) recyclerView);
            } else if (recyclerView instanceof ScrollView) {
                recyclerView.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: im.toss.uikit.widget.dialog.BaseTdsBottomSheetV2$$ExternalSyntheticLambda1
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;

                    @Override // android.view.View.OnScrollChangeListener
                    public final void onScrollChange(View view, int i3, int i4, int i5, int i6) {
                        int i7 = 2 % 2;
                        int i8 = onWarmupCompleted + 21;
                        onNavigationEvent = i8 % 128;
                        int i9 = i8 % 2;
                        BrickModuleImplExternalSyntheticLambda0.onWarmupCompleted(new Object[]{this.f$0, view, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)}, -1136081022, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1136081027, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
                        int i10 = onWarmupCompleted + 101;
                        onNavigationEvent = i10 % 128;
                        if (i10 % 2 == 0) {
                            int i11 = 94 / 0;
                        }
                    }
                });
                brickModuleImplExternalSyntheticLambda0.onNavigationEvent((View) recyclerView);
                int i3 = ICustomTabsCallbackStub + 103;
                onUnminimized = i3 % 128;
                int i4 = i3 % 2;
            } else if (recyclerView instanceof NestedScrollView) {
                recyclerView.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: im.toss.uikit.widget.dialog.BaseTdsBottomSheetV2$$ExternalSyntheticLambda2
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallback;

                    @Override // android.view.View.OnScrollChangeListener
                    public final void onScrollChange(View view, int i5, int i6, int i7, int i8) {
                        int i9 = 2 % 2;
                        int i10 = IAuthTabCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
                        onExtraCallback = i10 % 128;
                        if (i10 % 2 == 0) {
                            BrickModuleImplExternalSyntheticLambda0.onNavigationEvent(this.f$0, view, i5, i6, i7, i8);
                        } else {
                            BrickModuleImplExternalSyntheticLambda0.onNavigationEvent(this.f$0, view, i5, i6, i7, i8);
                            throw null;
                        }
                    }
                });
                brickModuleImplExternalSyntheticLambda0.onNavigationEvent((View) recyclerView);
                int i5 = ICustomTabsCallbackStub + 89;
                onUnminimized = i5 % 128;
                int i6 = i5 % 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            recyclerView.setNestedScrollingEnabled(false);
            recyclerView.setOverScrollMode(2);
            if (recyclerView instanceof RecyclerView) {
            }
        }
        recyclerView.setVerticalFadingEdgeEnabled(true);
        DisplayMetrics displayMetrics = recyclerView.getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        recyclerView.setFadingEdgeLength(varyMatches.onNavigationEvent(40, displayMetrics));
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        if ((r6 & 1) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if ((r6 & 1) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        r1 = r2.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
        r1 = r1.getResources().getConfiguration();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        if (o.readIntokhttp.onWarmupCompleted(r1) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
    
        r0 = o.BrickModuleImplExternalSyntheticLambda0.onUnminimized + 73;
        o.BrickModuleImplExternalSyntheticLambda0.ICustomTabsCallbackStub = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        if ((r0 % 2) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        r4 = 0.9f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        r0 = o.BrickModuleImplExternalSyntheticLambda0.onUnminimized + 119;
        o.BrickModuleImplExternalSyntheticLambda0.ICustomTabsCallbackStub = r0 % 128;
        r0 = r0 % 2;
        r4 = 0.7f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
    
        r2.onWarmupCompleted(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0086, code lost:
    
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyMaxHeight");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002f, code lost:
    
        if (r9 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:
    
        if (r9 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        r8 = r8 + 55;
        o.BrickModuleImplExternalSyntheticLambda0.ICustomTabsCallbackStub = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003c, code lost:
    
        if ((r8 % 2) == 0) goto L13;
     */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.app.Dialog, o.BrickModuleImplExternalSyntheticLambda0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object access100(Object[] objArr) {
        ?? r2 = (BrickModuleImplExternalSyntheticLambda0) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int iIntValue = ((Number) objArr[2]).intValue();
        Object obj = objArr[3];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 125;
        int i3 = i2 % 128;
        onUnminimized = i3;
        if (i2 % 2 == 0) {
            int i4 = 32 / 0;
        }
    }

    public final void onWarmupCompleted(float f) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 57;
        onUnminimized = i2 % 128;
        if (i2 % 2 != 0) {
            this.onActivityResized = f;
            onTransact().setMaxHeightRatio(f);
            int i3 = onUnminimized + 15;
            ICustomTabsCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        this.onActivityResized = f;
        onTransact().setMaxHeightRatio(f);
        throw null;
    }

    public static final class onNavigationEvent {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public final ViewGroup.LayoutParams onNavigationEvent() {
            int i = 2 % 2;
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
            int i2 = onExtraCallback + 57;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 90 / 0;
            }
            return layoutParams;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029 A[PHI: r2
      0x0029: PHI (r2v5 androidx.constraintlayout.widget.ConstraintLayout) = (r2v4 androidx.constraintlayout.widget.ConstraintLayout), (r2v24 androidx.constraintlayout.widget.ConstraintLayout) binds: [B:8:0x0027, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onActivityLayout() {
        ConstraintLayout constraintLayoutOnTransact;
        ConstraintLayout constraintLayoutOnTransact2;
        int i = 2 % 2;
        int i2 = onUnminimized + Imgproc.COLOR_YUV2RGBA_YVYU;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            constraintLayoutOnTransact = onTransact();
            int i3 = 56 / 0;
            if (constraintLayoutOnTransact.isLaidOut()) {
                if (!constraintLayoutOnTransact.isLayoutRequested()) {
                    if (onTransact().getChildCount() != 1 || (!(onTransact().getChildAt(0) instanceof ViewGroup))) {
                        constraintLayoutOnTransact2 = onTransact();
                    } else {
                        View childAt = onTransact().getChildAt(0);
                        Intrinsics.checkNotNull(childAt, "");
                        constraintLayoutOnTransact2 = (ViewGroup) childAt;
                    }
                    List listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                    Iterator itIAuthTabCallback = EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback(constraintLayoutOnTransact2).IAuthTabCallback();
                    while (itIAuthTabCallback.hasNext()) {
                        RecyclerView recyclerView = (View) itIAuthTabCallback.next();
                        if (!(recyclerView instanceof RecyclerView) || recyclerView.getChildCount() <= 0) {
                            if (!(!(recyclerView instanceof NestedScrollView))) {
                                NestedScrollView nestedScrollView = (NestedScrollView) recyclerView;
                                if (nestedScrollView.getChildAt(0) instanceof LinearLayout) {
                                    View childAt2 = nestedScrollView.getChildAt(0);
                                    Intrinsics.checkNotNull(childAt2, "");
                                    CollectionsKt__MutableCollectionsKt.addAll(listCreateListBuilder, EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback((LinearLayout) childAt2));
                                }
                            }
                            listCreateListBuilder.add(recyclerView);
                        } else {
                            CollectionsKt__MutableCollectionsKt.addAll(listCreateListBuilder, EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback((ViewGroup) recyclerView));
                            int i4 = onUnminimized + 43;
                            ICustomTabsCallbackStub = i4 % 128;
                            int i5 = i4 % 2;
                        }
                    }
                    List<View> listBuild = CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder);
                    pxToDp.onNavigationEvent onnavigationevent = new pxToDp.onNavigationEvent(30);
                    List listCreateListBuilder2 = CollectionsKt__CollectionsJVMKt.createListBuilder();
                    TdsRoundLayout tdsRoundLayoutIAuthTabCallbackStub = IAuthTabCallbackStub(this);
                    AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(0.0f), Float.valueOf(1.0f), (Function1) null, 4, (Object) null);
                    DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
                    Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                    listCreateListBuilder2.add((Rally) RallysKt.onWarmupCompleted(new Object[]{tdsRoundLayoutIAuthTabCallbackStub, isMuted.onExtraCallback(appLovinSdkSettingsOnNavigationEvent, Integer.valueOf(varyMatches.onNavigationEvent(100, displayMetrics)), 0, (Function1) null, 4, (Object) null), 0, null, 0, null, null, Boolean.FALSE, 0, 0L, false, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
                    for (View view : listBuild) {
                        int i6 = ICustomTabsCallbackStub + 71;
                        onUnminimized = i6 % 128;
                        int i7 = i6 % 2;
                        AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallback = AuthenticatorCompanion.IAuthTabCallback(AuthenticatorCompanion.IAuthTabCallback, authenticate.IN, Cache.UP, AuthenticatorCompanionAuthenticatorNone.FAST, false, (Function1) null, 24, (Object) null);
                        listCreateListBuilder2.add((Rally) RallysKt.onWarmupCompleted(new Object[]{view, appLovinSdkSettingsIAuthTabCallback, 0, null, 0, null, null, Boolean.FALSE, 0, 0L, false, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
                    }
                    isFireOS.onExtraCallbackWithResult(runOnUiThreadDelayed.onWarmupCompleted(RallysKt.onWarmupCompleted((View) null, onnavigationevent, CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder2), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, Boolean.FALSE, 0, 0L, false, 3833, (Object) null), (Object) null, new onWarmupCompleted(), 1, (Object) null), false, 1, (Object) null);
                    return;
                }
            }
        } else {
            constraintLayoutOnTransact = onTransact();
            if (constraintLayoutOnTransact.isLaidOut()) {
            }
        }
        constraintLayoutOnTransact.addOnLayoutChangeListener(new onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit onWarmupCompleted(BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0) {
        return (Unit) onWarmupCompleted(new Object[]{brickModuleImplExternalSyntheticLambda0}, 2013455303, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -2013455293, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(initMiniApp.onWarmupCompleted onwarmupcompleted) {
        return (Unit) onWarmupCompleted(new Object[]{onwarmupcompleted}, -1432637537, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1432637549, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
    }

    private final float onWarmupCompleted() {
        return ((Float) onWarmupCompleted(new Object[]{this}, 330793922, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -330793921, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback())).floatValue();
    }

    private final void onNavigationEvent(int i) {
        onWarmupCompleted(new Object[]{this, Integer.valueOf(i)}, 1440138886, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1440138877, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
    }

    private final float onExtraCallbackWithResult() {
        return ((Float) onWarmupCompleted(new Object[]{this}, 154214211, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -154214197, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback())).floatValue();
    }

    private static final Unit IAuthTabCallback(Function0 function0) {
        return (Unit) onWarmupCompleted(new Object[]{function0}, -1171511627, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1171511640, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
    }

    private static final WindowInsetsCompat IAuthTabCallback(BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0, View view, View view2, WindowInsetsCompat windowInsetsCompat) {
        return (WindowInsetsCompat) onWarmupCompleted(new Object[]{brickModuleImplExternalSyntheticLambda0, view, view2, windowInsetsCompat}, -1258552833, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1258552840, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
    }

    private static final void IAuthTabCallback(BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0, View view) {
        onWarmupCompleted(new Object[]{brickModuleImplExternalSyntheticLambda0, view}, 1430247545, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1430247541, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
    }

    private static final Unit asBinder(BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0, float f) {
        return (Unit) onWarmupCompleted(new Object[]{brickModuleImplExternalSyntheticLambda0, Float.valueOf(f)}, 2018858056, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -2018858056, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
    }

    private final void onActivityResized() {
        onWarmupCompleted(new Object[]{this}, 1858077530, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1858077519, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
    }

    public final void IAuthTabCallbackStub(@NotNull View view) {
        onWarmupCompleted(new Object[]{this, view}, 507117893, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -507117885, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
    }

    public final boolean IAuthTabCallback_Parcel() {
        return ((Boolean) onWarmupCompleted(new Object[]{this}, -508513839, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 508513845, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback())).booleanValue();
    }

    public final void asInterface(int i) {
        onWarmupCompleted(new Object[]{this, Integer.valueOf(i)}, -24177225, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 24177228, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
    }
}
