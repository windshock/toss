package o;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.google.android.gms.internal.firebase-auth-api.zzmr;
import com.google.firebase.messaging.FcmBroadcastProcessor$;
import com.skt.usp.UCPApiConstants;
import im.toss.base.transition.icon.ScaleTransitionTargetIconContainer;
import im.toss.base.transition.icon.ScaleTransitionTargetIconFactory;
import im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import o.UtilsKtExternalSyntheticLambda17;
import o.attachAppLovinSdk;
import o.getTags;
import o.getTaskExecutor;
import o.handleNativeAdClick;
import o.pxToDp;
import o.startWork;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getTags {
    public static final getTags IAuthTabCallback = new getTags();
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = onNavigationEvent + 65;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) throws Throwable {
        int i7 = ~(i | i2);
        int i8 = (~i3) | (~i2);
        int i9 = (~i8) | i;
        int i10 = (~(i2 | i3)) | (~((~i) | i3)) | (~(i8 | i));
        int i11 = i3 + i + i6 + ((-101282902) * i4) + ((-829309908) * i5);
        int i12 = i11 * i11;
        int i13 = ((i3 * 42798203) - 224002048) + (42798203 * i) + ((-1233194106) * i7) + (1828579084 * i9) + (1233194106 * i10) + ((-1190395904) * i6) + (1710751744 * i4) + ((-1643118592) * i5) + ((-1134166016) * i12);
        int i14 = (i3 * 1745018779) + 1790267665 + (i * 1745018779) + (i7 * (-58)) + (i9 * (-116)) + (i10 * 58) + (i6 * 1745018721) + (i4 * (-1587019414)) + (i5 * (-1871011668)) + (i12 * 1017511936);
        switch (i13 + (i14 * i14 * (-1139146752))) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                startWork startwork = (startWork) objArr[0];
                Activity activity = (Activity) objArr[1];
                TdsRoundLayout tdsRoundLayout = (TdsRoundLayout) objArr[2];
                int i15 = 2 % 2;
                setForeground.onExtraCallback(setForeground.onExtraCallback, "origin_open_timeline_started", null, startwork, access8100.onNavigationEvent(getWrite.IAuthTabCallback("activity", activity.getClass().getSimpleName())), 2, null);
                tdsRoundLayout.setAlpha(1.0f);
                Function1<Float, Unit> function1AsBinder = startwork.asBinder();
                if (function1AsBinder != null) {
                    int i16 = onExtraCallbackWithResult + 83;
                    onExtraCallback = i16 % 128;
                    int i17 = i16 % 2;
                    function1AsBinder.invoke(Float.valueOf(0.0f));
                    int i18 = onExtraCallback + 29;
                    onExtraCallbackWithResult = i18 % 128;
                    if (i18 % 2 == 0) {
                        int i19 = 4 / 5;
                    }
                }
                Function0 function0 = (Function0) startWork.onExtraCallback(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1525916084, new Object[]{startwork}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1525916073);
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.INSTANCE;
            case 5:
                return onNavigationEvent(objArr);
            case 6:
                return IAuthTabCallbackStub(objArr);
            case 7:
                return IAuthTabCallbackDefault(objArr);
            case 8:
                return onTransact(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(startWork startwork, Ref.BooleanRef booleanRef, Activity activity, Function0 function0) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(startwork, booleanRef, activity, function0);
        int i4 = onExtraCallbackWithResult + 123;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 46 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) throws Throwable {
        Ref.BooleanRef booleanRef = (Ref.BooleanRef) objArr[0];
        startWork startwork = (startWork) objArr[1];
        Activity activity = (Activity) objArr[2];
        List list = (List) objArr[3];
        View view = (View) objArr[4];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return asInterface(booleanRef, startwork, activity, list, view);
        }
        asInterface(booleanRef, startwork, activity, list, view);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Ref.BooleanRef booleanRef, startWork startwork, Activity activity, List list, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(booleanRef, startwork, activity, list, view);
        if (i3 != 0) {
            int i4 = 3 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) IAuthTabCallback(-339552896, new Object[]{attachapplovinsdk}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 339552901, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback());
        int i4 = onExtraCallback + 63;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(startWork startwork, runOnUiThreadDelayed runonuithreaddelayed, View view, Activity activity) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(startwork, runonuithreaddelayed, view, activity);
        int i4 = onExtraCallback + 33;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ boolean onExtraCallback(startWork startwork, View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(startwork, view, motionEvent);
        if (i3 == 0) {
            int i4 = 36 / 0;
        }
        return zOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(int i, float f, float f2, float f3, float f4, float f5, int i2, View view, float f6) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 47;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(i, f, f2, f3, f4, f5, i2, view, f6);
        int i6 = onExtraCallbackWithResult + 117;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(startWork startwork, float f) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(startwork, f);
        int i4 = onExtraCallbackWithResult + 97;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 81 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(View view, ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(view, viewGroup);
        int i4 = onExtraCallback + 19;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onNavigationEvent(Ref.BooleanRef booleanRef, startWork startwork, Activity activity, List list, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onTransact(booleanRef, startwork, activity, list, view);
            throw null;
        }
        Unit unitOnTransact = onTransact(booleanRef, startwork, activity, list, view);
        int i3 = onExtraCallback + 97;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ boolean onNavigationEvent(startWork startwork, View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = IAuthTabCallback(startwork, view, motionEvent);
        if (i3 != 0) {
            int i4 = 64 / 0;
        }
        return zIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Ref.BooleanRef booleanRef, startWork startwork, Activity activity, List list, View view) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) IAuthTabCallback(1010811408, new Object[]{booleanRef, startwork, activity, list, view}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -1010811405, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback());
        int i4 = onExtraCallback + 103;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 11 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(startWork startwork, float f) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(startwork, f);
        }
        onNavigationEvent(startwork, f);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(startWork startwork, Activity activity, TdsRoundLayout tdsRoundLayout) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            unit = (Unit) IAuthTabCallback(525309901, new Object[]{startwork, activity, tdsRoundLayout}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -525309897, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback());
            int i3 = 2 / 0;
        } else {
            unit = (Unit) IAuthTabCallback(525309901, new Object[]{startwork, activity, tdsRoundLayout}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -525309897, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback());
        }
        int i4 = onExtraCallback + 77;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 72 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(startWork startwork, Activity activity, Ref.BooleanRef booleanRef) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(startwork, activity, booleanRef);
        int i4 = onExtraCallback + 87;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private getTags() {
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        String simpleName;
        getTags gettags = (getTags) objArr[0];
        startWork startwork = (startWork) objArr[1];
        Activity activity = (Activity) objArr[2];
        getJobwork_runtime_ktx_release getjobwork_runtime_ktx_release = (getJobwork_runtime_ktx_release) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int iIntValue2 = ((Number) objArr[5]).intValue();
        int iIntValue3 = ((Number) objArr[6]).intValue();
        int iIntValue4 = ((Number) objArr[7]).intValue();
        Integer num = (Integer) objArr[8];
        int iIntValue5 = ((Number) objArr[9]).intValue();
        Function0<Unit> function0 = (Function0) objArr[10];
        handleNativeAdClick.onExtraCallback.asInterface asinterface = (handleNativeAdClick.onExtraCallback.asInterface) objArr[11];
        boolean zBooleanValue = ((Boolean) objArr[12]).booleanValue();
        Integer num2 = (Integer) objArr[13];
        getFuturework_runtime_ktx_release getfuturework_runtime_ktx_release = (getFuturework_runtime_ktx_release) objArr[14];
        Bitmap bitmap = (Bitmap) objArr[15];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(startwork, "");
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(getjobwork_runtime_ktx_release, "");
        Intrinsics.checkNotNullParameter(function0, "");
        setForeground setforeground = setForeground.onExtraCallback;
        if (setforeground.onExtraCallbackWithResult() != startwork) {
            setforeground.onExtraCallback("origin_start_transition_skipped", "entry_not_current", startwork, access8100.onNavigationEvent(getWrite.IAuthTabCallback("activity", activity.getClass().getSimpleName())));
            return false;
        }
        startwork.onExtraCallback(false);
        startwork.onWarmupCompleted(getjobwork_runtime_ktx_release, iIntValue, iIntValue2, iIntValue3, iIntValue4, num, asinterface, iIntValue5, getfuturework_runtime_ktx_release, bitmap);
        startwork.IAuthTabCallback(zBooleanValue);
        if (num2 != null) {
            startWork.onExtraCallback(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -845680777, new Object[]{startwork, Integer.valueOf(num2.intValue())}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 845680786);
        }
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("activity", activity.getClass().getSimpleName());
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("target_width", Integer.valueOf(iIntValue3));
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("target_height", Integer.valueOf(iIntValue4));
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback("screen_background", Integer.valueOf(iIntValue5));
        if (asinterface != null) {
            simpleName = handleNativeAdClick.onExtraCallback.asInterface.class.getSimpleName();
            int i2 = onExtraCallback + 9;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 5 % 5;
            }
        } else {
            simpleName = null;
        }
        setForeground.onExtraCallback(setforeground, "origin_start_transition_requested", null, startwork, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, getWrite.IAuthTabCallback("squircle", simpleName), getWrite.IAuthTabCallback("target_type", getfuturework_runtime_ktx_release != null ? "image_url" : bitmap != null ? "fallback_bitmap" : "view_factory")}), 2, null);
        if (gettags.onNavigationEvent(activity, startwork)) {
            return Boolean.valueOf(gettags.onExtraCallback(activity, startwork, function0));
        }
        int i4 = onExtraCallbackWithResult + 95;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public final void onExtraCallback(@NotNull Activity activity) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(activity, "");
            getTaskExecutor.onWarmupCompleted.onNavigationEvent(activity);
        } else {
            Intrinsics.checkNotNullParameter(activity, "");
            getTaskExecutor.onWarmupCompleted.onNavigationEvent(activity);
            throw null;
        }
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 107;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                if (!(!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult))) {
                    return getSpecialFeatureOptInStatus.Dark;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i3 = onWarmupCompleted + 81;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    return getspecialfeatureoptinstatus;
                }
                throw null;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult);
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean onNavigationEvent(Activity activity, startWork startwork) throws Throwable {
        getTaskExecutor.onNavigationEvent onnavigationevent;
        View view;
        View view2;
        char c;
        boolean z;
        FrameLayout frameLayout;
        ViewGroup viewGroup;
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setForeground setforeground = setForeground.onExtraCallback;
        if (setforeground.onExtraCallbackWithResult() != startwork) {
            setforeground.onExtraCallback("origin_attach_skipped", "entry_not_current", startwork, access8100.onNavigationEvent(getWrite.IAuthTabCallback("activity", activity.getClass().getSimpleName())));
            return false;
        }
        runOnUiThreadDelayed runonuithreaddelayedWriteTypedObject = startwork.writeTypedObject();
        if (runonuithreaddelayedWriteTypedObject != null) {
            int i4 = onExtraCallbackWithResult + 53;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            runonuithreaddelayedWriteTypedObject.onNavigationEvent();
        }
        startwork.onNavigationEvent((runOnUiThreadDelayed) null);
        runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted = startwork.onWarmupCompleted();
        if (runonuithreaddelayedOnWarmupCompleted != null) {
            runonuithreaddelayedOnWarmupCompleted.onNavigationEvent();
        }
        startwork.onWarmupCompleted((runOnUiThreadDelayed) null);
        WeakReference<FrameLayout> interfaceDescriptor = startwork.getInterfaceDescriptor();
        if (interfaceDescriptor != null && (frameLayout = interfaceDescriptor.get()) != null && (!getTaskExecutor.onWarmupCompleted.IAuthTabCallback(frameLayout, false, null))) {
            ViewParent parent = frameLayout.getParent();
            if (parent instanceof ViewGroup) {
                int i6 = onExtraCallbackWithResult + 51;
                onExtraCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    throw null;
                }
                viewGroup = (ViewGroup) parent;
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                viewGroup.removeView(frameLayout);
            }
        }
        startWork.onExtraCallback(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1950767050, new Object[]{startwork, null}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1950767042);
        startwork.onNavigationEvent((WeakReference<FrameLayout>) null);
        startwork.IAuthTabCallbackDefault((WeakReference<TdsRoundLayout>) null);
        startwork.onExtraCallback((WeakReference<View>) null);
        startwork.onWarmupCompleted((WeakReference<ViewGroup>) null);
        startwork.IAuthTabCallback((WeakReference<View>) null);
        int iICustomTabsCallbackStub = startwork.ICustomTabsCallbackStub();
        int typedObject = startwork.readTypedObject();
        Integer numICustomTabsCallbackDefault = startwork.ICustomTabsCallbackDefault();
        int iIntValue = numICustomTabsCallbackDefault != null ? numICustomTabsCallbackDefault.intValue() : 0;
        startwork.ICustomTabsCallbackStubProxy();
        startwork.onRelationshipValidationResult();
        ListenableWorker listenableWorker = (ListenableWorker) IAuthTabCallback(-14014887, new Object[]{this, activity, startwork}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 14014888, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback());
        int iOnWarmupCompleted = listenableWorker.onWarmupCompleted();
        int iOnNavigationEvent = listenableWorker.onNavigationEvent();
        Rect rectOnExtraCallback = M_.onExtraCallback.onExtraCallback(activity);
        if (rectOnExtraCallback != null) {
            int i7 = onExtraCallbackWithResult + 119;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            iIntValue = rectOnExtraCallback.top;
        }
        float f = iIntValue;
        startwork.onWarmupCompleted(f);
        if (startwork.onMessageChannelReady() == null) {
            Resources resources = activity.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            Configuration configuration = resources.getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            startWork.onExtraCallback(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -845680777, new Object[]{startwork, Integer.valueOf(new getDEFAULT_CONNECTION_SPECSokhttp(new onExtraCallbackWithResult(configuration)).onWarmupCompleted())}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 845680786);
            int i9 = onExtraCallback + 101;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
        }
        if (iICustomTabsCallbackStub == -1 || typedObject == -1) {
            setforeground.onExtraCallback("origin_attach_skipped", "invalid_icon_size", startwork, access8100.onNavigationEvent(getWrite.IAuthTabCallback("activity", activity.getClass().getSimpleName())));
            return false;
        }
        View decorView = activity.getWindow().getDecorView();
        ViewGroup viewGroup2 = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup2 == null) {
            int i11 = onExtraCallbackWithResult + 97;
            onExtraCallback = i11 % 128;
            if (i11 % 2 != 0) {
                setforeground.onExtraCallback("origin_attach_skipped", "decor_view_missing", startwork, access8100.onNavigationEvent(getWrite.IAuthTabCallback("activity", activity.getClass().getSimpleName())));
                return true;
            }
            setforeground.onExtraCallback("origin_attach_skipped", "decor_view_missing", startwork, access8100.onNavigationEvent(getWrite.IAuthTabCallback("activity", activity.getClass().getSimpleName())));
            return false;
        }
        getTaskExecutor gettaskexecutor = getTaskExecutor.onWarmupCompleted;
        getTaskExecutor.onNavigationEvent onnavigationeventIAuthTabCallback = gettaskexecutor.IAuthTabCallback(activity, viewGroup2);
        onnavigationeventIAuthTabCallback.onTransact();
        FrameLayout frameLayoutOnWarmupCompleted = onnavigationeventIAuthTabCallback.onWarmupCompleted();
        ScaleTransitionTargetIconFactory scaleTransitionTargetIconFactory = ScaleTransitionTargetIconFactory.onWarmupCompleted;
        ViewGroup viewGroup3 = viewGroup2;
        ScaleTransitionTargetIconFactory.onExtraCallback onextracallbackOnExtraCallbackWithResult = scaleTransitionTargetIconFactory.onExtraCallbackWithResult(activity, startwork, listenableWorker, (ScaleTransitionTargetIconContainer) getTaskExecutor.onNavigationEvent.onExtraCallback(new Object[]{onnavigationeventIAuthTabCallback}, zzmr.onExtraCallbackWithResult(), -586221734, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), 586221737), onnavigationeventIAuthTabCallback.IAuthTabCallbackStub(), onnavigationeventIAuthTabCallback.IAuthTabCallback());
        if (onextracallbackOnExtraCallbackWithResult == null) {
            gettaskexecutor.IAuthTabCallback(frameLayoutOnWarmupCompleted, false, null);
            setforeground.onExtraCallback("origin_attach_skipped", "target_icon_views_missing", startwork, access8100.onNavigationEvent(getWrite.IAuthTabCallback("activity", activity.getClass().getSimpleName())));
            return false;
        }
        ScaleTransitionTargetIconContainer scaleTransitionTargetIconContainerOnExtraCallback = onextracallbackOnExtraCallbackWithResult.onExtraCallback();
        View viewOnExtraCallbackWithResult = onextracallbackOnExtraCallbackWithResult.onExtraCallbackWithResult();
        scaleTransitionTargetIconFactory.onExtraCallbackWithResult(scaleTransitionTargetIconContainerOnExtraCallback, viewOnExtraCallbackWithResult, iICustomTabsCallbackStub, typedObject);
        if (startwork.ICustomTabsCallback()) {
            View viewOnExtraCallbackWithResult2 = scaleTransitionTargetIconFactory.onExtraCallbackWithResult(activity, startwork, onnavigationeventIAuthTabCallback.onNavigationEvent(), onnavigationeventIAuthTabCallback.onExtraCallbackWithResult());
            if (viewOnExtraCallbackWithResult2 != null) {
                onnavigationevent = onnavigationeventIAuthTabCallback;
                onnavigationevent.onNavigationEvent(viewOnExtraCallbackWithResult2, new FrameLayout.LayoutParams(iICustomTabsCallbackStub, typedObject));
                view = viewOnExtraCallbackWithResult2;
                view2 = view;
                startWork.onExtraCallback(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1950767050, new Object[]{startwork, new WeakReference(frameLayoutOnWarmupCompleted)}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1950767042);
                FrameLayout frameLayoutOnExtraCallback = onnavigationevent.onExtraCallback();
                startwork.onNavigationEvent(frameLayoutOnExtraCallback == null ? new WeakReference<>(frameLayoutOnExtraCallback) : null);
                startwork.IAuthTabCallbackDefault(new WeakReference<>(scaleTransitionTargetIconContainerOnExtraCallback));
                startwork.onExtraCallback(new WeakReference<>(viewOnExtraCallbackWithResult));
                startwork.IAuthTabCallback(view2 == null ? new WeakReference<>(view2) : null);
                startwork.onWarmupCompleted(new WeakReference<>(viewGroup3));
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("activity", activity.getClass().getSimpleName());
                Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("screen_width", Integer.valueOf(iOnWarmupCompleted));
                Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("screen_height", Integer.valueOf(iOnNavigationEvent));
                Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback("device_radius", Float.valueOf(f));
                Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback("show_loading", Boolean.valueOf(startwork.ICustomTabsCallback()));
                if (view2 == null) {
                    int i12 = onExtraCallback + 95;
                    onExtraCallbackWithResult = i12 % 128;
                    c = 2;
                    int i13 = i12 % 2;
                    z = true;
                } else {
                    c = 2;
                    z = false;
                }
                Pair pairIAuthTabCallback6 = getWrite.IAuthTabCallback("has_loading_icon", Boolean.valueOf(z));
                Pair[] pairArr = new Pair[6];
                pairArr[0] = pairIAuthTabCallback;
                pairArr[1] = pairIAuthTabCallback2;
                pairArr[c] = pairIAuthTabCallback3;
                pairArr[3] = pairIAuthTabCallback4;
                pairArr[4] = pairIAuthTabCallback5;
                pairArr[5] = pairIAuthTabCallback6;
                setForeground.onExtraCallback(setforeground, "origin_attach_success", null, startwork, access8100.onWarmupCompleted(pairArr), 2, null);
                return true;
            }
            onnavigationevent = onnavigationeventIAuthTabCallback;
        } else {
            onnavigationevent = onnavigationeventIAuthTabCallback;
            onnavigationevent.asBinder();
        }
        view = null;
        view2 = view;
        startWork.onExtraCallback(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1950767050, new Object[]{startwork, new WeakReference(frameLayoutOnWarmupCompleted)}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1950767042);
        FrameLayout frameLayoutOnExtraCallback2 = onnavigationevent.onExtraCallback();
        startwork.onNavigationEvent(frameLayoutOnExtraCallback2 == null ? new WeakReference<>(frameLayoutOnExtraCallback2) : null);
        startwork.IAuthTabCallbackDefault(new WeakReference<>(scaleTransitionTargetIconContainerOnExtraCallback));
        startwork.onExtraCallback(new WeakReference<>(viewOnExtraCallbackWithResult));
        startwork.IAuthTabCallback(view2 == null ? new WeakReference<>(view2) : null);
        startwork.onWarmupCompleted(new WeakReference<>(viewGroup3));
        Pair pairIAuthTabCallback7 = getWrite.IAuthTabCallback("activity", activity.getClass().getSimpleName());
        Pair pairIAuthTabCallback22 = getWrite.IAuthTabCallback("screen_width", Integer.valueOf(iOnWarmupCompleted));
        Pair pairIAuthTabCallback32 = getWrite.IAuthTabCallback("screen_height", Integer.valueOf(iOnNavigationEvent));
        Pair pairIAuthTabCallback42 = getWrite.IAuthTabCallback("device_radius", Float.valueOf(f));
        Pair pairIAuthTabCallback52 = getWrite.IAuthTabCallback("show_loading", Boolean.valueOf(startwork.ICustomTabsCallback()));
        if (view2 == null) {
        }
        Pair pairIAuthTabCallback62 = getWrite.IAuthTabCallback("has_loading_icon", Boolean.valueOf(z));
        Pair[] pairArr2 = new Pair[6];
        pairArr2[0] = pairIAuthTabCallback7;
        pairArr2[1] = pairIAuthTabCallback22;
        pairArr2[c] = pairIAuthTabCallback32;
        pairArr2[3] = pairIAuthTabCallback42;
        pairArr2[4] = pairIAuthTabCallback52;
        pairArr2[5] = pairIAuthTabCallback62;
        setForeground.onExtraCallback(setforeground, "origin_attach_success", null, startwork, access8100.onWarmupCompleted(pairArr2), 2, null);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean onExtraCallback(final Activity activity, final startWork startwork, final Function0<Unit> function0) throws Throwable {
        FrameLayout frameLayout;
        boolean z;
        Float f;
        float f2;
        int iIntValue;
        runOnUiThreadDelayed runonuithreaddelayedWriteTypedObject;
        final runOnUiThreadDelayed runonuithreaddelayedWriteTypedObject2;
        boolean z2;
        Map mapOnNavigationEvent;
        int i;
        Object obj;
        setForeground setforeground;
        String str;
        String str2;
        startWork startwork2;
        FrameLayout frameLayout2;
        int i2 = 2 % 2;
        setForeground setforeground2 = setForeground.onExtraCallback;
        if (setforeground2.onExtraCallbackWithResult() != startwork) {
            setforeground2.onExtraCallback("origin_open_skipped", "entry_not_current", startwork, access8100.onNavigationEvent(getWrite.IAuthTabCallback("activity", activity.getClass().getSimpleName())));
            return false;
        }
        WeakReference<TdsRoundLayout> weakReferenceOnMinimized = startwork.onMinimized();
        final TdsRoundLayout tdsRoundLayout = weakReferenceOnMinimized != null ? weakReferenceOnMinimized.get() : null;
        WeakReference<View> weakReferenceOnActivityResized = startwork.onActivityResized();
        View view = weakReferenceOnActivityResized != null ? weakReferenceOnActivityResized.get() : null;
        WeakReference<View> weakReferenceOnExtraCallback = startwork.onExtraCallback();
        View view2 = weakReferenceOnExtraCallback != null ? weakReferenceOnExtraCallback.get() : null;
        WeakReference<FrameLayout> weakReferenceIAuthTabCallback_Parcel = startwork.IAuthTabCallback_Parcel();
        if (weakReferenceIAuthTabCallback_Parcel != null) {
            int i3 = onExtraCallback + 87;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                frameLayout2 = weakReferenceIAuthTabCallback_Parcel.get();
                int i4 = 99 / 0;
            } else {
                frameLayout2 = weakReferenceIAuthTabCallback_Parcel.get();
            }
            frameLayout = frameLayout2;
        } else {
            frameLayout = null;
        }
        if (tdsRoundLayout == null || view == null || frameLayout == null) {
            View view3 = view;
            int i5 = onExtraCallback + 13;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("activity", activity.getClass().getSimpleName());
            Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("has_target_icon_container", Boolean.valueOf(tdsRoundLayout != null));
            Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("has_target_icon", Boolean.valueOf(view3 != null));
            Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback("has_screen_background_dim", Boolean.valueOf(frameLayout != null));
            if (view2 == null) {
                int i7 = onExtraCallbackWithResult + 15;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                z = false;
            } else {
                z = true;
            }
            setforeground2.onExtraCallback("origin_open_skipped", "missing_view_refs", startwork, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, getWrite.IAuthTabCallback("has_loading_icon", Boolean.valueOf(z))}));
            return false;
        }
        int iICustomTabsCallbackStub = startwork.ICustomTabsCallbackStub();
        int typedObject = startwork.readTypedObject();
        int iICustomTabsCallbackStubProxy = startwork.ICustomTabsCallbackStubProxy();
        int iOnRelationshipValidationResult = startwork.onRelationshipValidationResult();
        handleNativeAdClick.onExtraCallback.asInterface asinterfaceExtraCallback = startwork.extraCallback();
        if (asinterfaceExtraCallback != null) {
            Float fValueOf = Float.valueOf(asinterfaceExtraCallback.IAuthTabCallbackDefault());
            int i9 = onExtraCallback + 7;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            f = fValueOf;
        } else {
            f = null;
        }
        Integer numICustomTabsCallbackDefault = startwork.ICustomTabsCallbackDefault();
        ListenableWorker listenableWorker = (ListenableWorker) IAuthTabCallback(-14014887, new Object[]{this, activity, startwork}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 14014888, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback());
        int iOnWarmupCompleted = listenableWorker.onWarmupCompleted();
        int iOnNavigationEvent = listenableWorker.onNavigationEvent();
        Rect rectOnExtraCallback = M_.onExtraCallback.onExtraCallback(activity);
        if (rectOnExtraCallback != null) {
            iIntValue = rectOnExtraCallback.top;
        } else {
            if (numICustomTabsCallbackDefault == null) {
                f2 = 0.0f;
                float f3 = f2;
                runonuithreaddelayedWriteTypedObject = startwork.writeTypedObject();
                if (runonuithreaddelayedWriteTypedObject != null) {
                    int i11 = onExtraCallback + 115;
                    onExtraCallbackWithResult = i11 % 128;
                    if (i11 % 2 != 0 ? runonuithreaddelayedWriteTypedObject.postMessage() : !runonuithreaddelayedWriteTypedObject.postMessage()) {
                        setforeground2.onExtraCallback("origin_open_skipped", "start_timeline_running", startwork, access8100.onNavigationEvent(getWrite.IAuthTabCallback("activity", activity.getClass().getSimpleName())));
                        return false;
                    }
                }
                final View view4 = view;
                runOnUiThreadDelayed runonuithreaddelayedOnNavigationEvent = getTriggeredContentUris.onNavigationEvent.onNavigationEvent(tdsRoundLayout, view, frameLayout, view2, iICustomTabsCallbackStub, typedObject, iICustomTabsCallbackStubProxy, iOnRelationshipValidationResult, numICustomTabsCallbackDefault, f, iOnWarmupCompleted, iOnNavigationEvent, f3);
                if (startwork.ICustomTabsCallback()) {
                    int i12 = onExtraCallbackWithResult + 45;
                    onExtraCallback = i12 % 128;
                    int i13 = i12 % 2;
                    if (view2 != null) {
                        runonuithreaddelayedOnNavigationEvent = RallysKt.onWarmupCompleted((View) null, pxToDp.IAuthTabCallback.onExtraCallback, CollectionsKt.listOf(new runOnUiThreadDelayed[]{onWarmupCompleted(view2, iICustomTabsCallbackStub, typedObject, iICustomTabsCallbackStubProxy, iOnRelationshipValidationResult, iOnWarmupCompleted, iOnNavigationEvent), runonuithreaddelayedOnNavigationEvent}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, Boolean.FALSE, 0, 0L, false, 3833, (Object) null);
                    }
                }
                startwork.onNavigationEvent(runonuithreaddelayedOnNavigationEvent);
                runonuithreaddelayedWriteTypedObject2 = startwork.writeTypedObject();
                if (runonuithreaddelayedWriteTypedObject2 != null) {
                    int i14 = onExtraCallbackWithResult + 41;
                    onExtraCallback = i14 % 128;
                    int i15 = i14 % 2;
                    return false;
                }
                final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                runOnUiThreadDelayed.onExtraCallback(runOnUiThreadDelayed.onWarmupCompleted(runOnUiThreadDelayed.IAuthTabCallbackDefault(runonuithreaddelayedWriteTypedObject2, (Object) null, new Function0() { // from class: im.toss.base.transition.origin.OriginScaleTransition$$ExternalSyntheticLambda3
                    private static int onNavigationEvent = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke() {
                        int i16 = 2 % 2;
                        int i17 = onNavigationEvent + 33;
                        onWarmupCompleted = i17 % 128;
                        int i18 = i17 % 2;
                        Unit unitOnWarmupCompleted = getTags.onWarmupCompleted(startwork, activity, tdsRoundLayout);
                        int i19 = onWarmupCompleted + 45;
                        onNavigationEvent = i19 % 128;
                        if (i19 % 2 == 0) {
                            return unitOnWarmupCompleted;
                        }
                        throw null;
                    }
                }, 1, (Object) null), (Object) null, new Function0() { // from class: im.toss.base.transition.origin.OriginScaleTransition$$ExternalSyntheticLambda4
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke() {
                        int i16 = 2 % 2;
                        int i17 = onExtraCallbackWithResult + 33;
                        IAuthTabCallback = i17 % 128;
                        int i18 = i17 % 2;
                        startWork startwork3 = startwork;
                        if (i18 != 0) {
                            return getTags.IAuthTabCallback(startwork3, booleanRef, activity, function0);
                        }
                        int i19 = 56 / 0;
                        return getTags.IAuthTabCallback(startwork3, booleanRef, activity, function0);
                    }
                }, 1, (Object) null), (Object) null, new Function0() { // from class: im.toss.base.transition.origin.OriginScaleTransition$$ExternalSyntheticLambda5
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke() throws Throwable {
                        int i16 = 2 % 2;
                        int i17 = IAuthTabCallback + 125;
                        onNavigationEvent = i17 % 128;
                        int i18 = i17 % 2;
                        startWork startwork3 = startwork;
                        if (i18 == 0) {
                            return getTags.onWarmupCompleted(startwork3, activity, booleanRef);
                        }
                        getTags.onWarmupCompleted(startwork3, activity, booleanRef);
                        throw null;
                    }
                }, 1, (Object) null);
                ScaleTransitionTargetIconFactory scaleTransitionTargetIconFactory = ScaleTransitionTargetIconFactory.onWarmupCompleted;
                if (scaleTransitionTargetIconFactory.IAuthTabCallback(view4)) {
                    z2 = true;
                } else {
                    int i16 = onExtraCallbackWithResult + 57;
                    onExtraCallback = i16 % 128;
                    if (i16 % 2 != 0) {
                        mapOnNavigationEvent = access8100.onNavigationEvent(getWrite.IAuthTabCallback("activity", activity.getClass().getSimpleName()));
                        setforeground = setforeground2;
                        str = "origin_open_waiting_target_icon";
                        str2 = null;
                        z2 = true;
                        startwork2 = startwork;
                        i = 3;
                        obj = null;
                    } else {
                        z2 = true;
                        mapOnNavigationEvent = access8100.onNavigationEvent(getWrite.IAuthTabCallback("activity", activity.getClass().getSimpleName()));
                        i = 2;
                        obj = null;
                        setforeground = setforeground2;
                        str = "origin_open_waiting_target_icon";
                        str2 = null;
                        startwork2 = startwork;
                    }
                    setForeground.onExtraCallback(setforeground, str, str2, startwork2, mapOnNavigationEvent, i, obj);
                }
                scaleTransitionTargetIconFactory.onNavigationEvent(view4, new Function0() { // from class: im.toss.base.transition.origin.OriginScaleTransition$$ExternalSyntheticLambda6
                    private static int onExtraCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke() throws Throwable {
                        int i17 = 2 % 2;
                        int i18 = onExtraCallback + 7;
                        onNavigationEvent = i18 % 128;
                        int i19 = i18 % 2;
                        Unit unitOnExtraCallback = getTags.onExtraCallback(startwork, runonuithreaddelayedWriteTypedObject2, view4, activity);
                        int i20 = onExtraCallback + 75;
                        onNavigationEvent = i20 % 128;
                        if (i20 % 2 == 0) {
                            return unitOnExtraCallback;
                        }
                        throw null;
                    }
                });
                return z2;
            }
            iIntValue = numICustomTabsCallbackDefault.intValue();
        }
        f2 = iIntValue;
        float f32 = f2;
        runonuithreaddelayedWriteTypedObject = startwork.writeTypedObject();
        if (runonuithreaddelayedWriteTypedObject != null) {
        }
        final View view42 = view;
        runOnUiThreadDelayed runonuithreaddelayedOnNavigationEvent2 = getTriggeredContentUris.onNavigationEvent.onNavigationEvent(tdsRoundLayout, view, frameLayout, view2, iICustomTabsCallbackStub, typedObject, iICustomTabsCallbackStubProxy, iOnRelationshipValidationResult, numICustomTabsCallbackDefault, f, iOnWarmupCompleted, iOnNavigationEvent, f32);
        if (startwork.ICustomTabsCallback()) {
        }
        startwork.onNavigationEvent(runonuithreaddelayedOnNavigationEvent2);
        runonuithreaddelayedWriteTypedObject2 = startwork.writeTypedObject();
        if (runonuithreaddelayedWriteTypedObject2 != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        r9.element = true;
        o.setForeground.onExtraCallback(r1, "origin_open_timeline_ended", null, r8, o.access8100.onNavigationEvent(o.getWrite.IAuthTabCallback("activity", r10.getClass().getSimpleName())), 2, null);
        r8.onNavigationEvent((o.runOnUiThreadDelayed) null);
        r8 = r8.onTransact();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004c, code lost:
    
        if (r8 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        r8.invoke();
        r8 = o.getTags.onExtraCallback + 5;
        o.getTags.onExtraCallbackWithResult = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        r11.invoke();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r1.onNavigationEvent(r8) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r1.onNavigationEvent(r8) == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(startWork startwork, Ref.BooleanRef booleanRef, Activity activity, Function0 function0) throws Throwable {
        setForeground setforeground;
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            setforeground = setForeground.onExtraCallback;
            int i3 = 83 / 0;
        } else {
            setforeground = setForeground.onExtraCallback;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x008a, code lost:
    
        if (((java.lang.Boolean) o.startWork.onExtraCallback(o.CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), r11, o.CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -796467992, new java.lang.Object[]{r17}, r15, 796467999)).booleanValue() != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x008c, code lost:
    
        r0 = kotlin.Unit.INSTANCE;
        r1 = o.getTags.onExtraCallbackWithResult + 17;
        o.getTags.onExtraCallback = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0097, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0098, code lost:
    
        r17.onNavigationEvent((o.runOnUiThreadDelayed) null);
        r17.ICustomTabsCallback_Parcel();
        r12 = com.facebook.react.uimanager.LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        r10 = com.facebook.react.uimanager.LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        r16 = com.facebook.react.uimanager.LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        o.setForeground.onWarmupCompleted(r10, -283765271, r12, com.facebook.react.uimanager.LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 283765271, new java.lang.Object[]{r9, r17, false, false, 4, null}, r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0063, code lost:
    
        if (((java.lang.Boolean) o.startWork.onExtraCallback(o.CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), r11, o.CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -796467992, new java.lang.Object[]{r17}, r15, 796467999)).booleanValue() != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(startWork startwork, Activity activity, Ref.BooleanRef booleanRef) throws Throwable {
        int i = 2 % 2;
        setForeground setforeground = setForeground.onExtraCallback;
        setForeground.onExtraCallback(setforeground, "origin_open_timeline_cancelled", null, startwork, access8100.onNavigationEvent(getWrite.IAuthTabCallback("activity", activity.getClass().getSimpleName())), 2, null);
        if (!booleanRef.element && setforeground.onNavigationEvent(startwork)) {
            int i2 = onExtraCallback + 15;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                int i3 = 66 / 0;
            } else {
                int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                int iOnExtraCallback4 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            }
        }
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 91;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023 A[PHI: r1
      0x0023: PHI (r1v5 o.setForeground) = (r1v4 o.setForeground), (r1v7 o.setForeground) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(startWork startwork, runOnUiThreadDelayed runonuithreaddelayed, View view, Activity activity) throws Throwable {
        setForeground setforeground;
        View view2;
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            setforeground = setForeground.onExtraCallback;
            int i3 = 66 / 0;
            if (setforeground.onExtraCallbackWithResult() == startwork) {
                if (startwork.writeTypedObject() == runonuithreaddelayed) {
                    WeakReference<View> weakReferenceOnActivityResized = startwork.onActivityResized();
                    if (weakReferenceOnActivityResized != null) {
                        view2 = weakReferenceOnActivityResized.get();
                        int i4 = onExtraCallbackWithResult + 1;
                        onExtraCallback = i4 % 128;
                        int i5 = i4 % 2;
                    } else {
                        view2 = null;
                    }
                    if (view2 == view) {
                        int i6 = onExtraCallbackWithResult + 21;
                        onExtraCallback = i6 % 128;
                        int i7 = i6 % 2;
                        isFireOS.onExtraCallbackWithResult(runonuithreaddelayed, false, 1, (Object) null);
                        return Unit.INSTANCE;
                    }
                }
            }
        } else {
            setforeground = setForeground.onExtraCallback;
            if (setforeground.onExtraCallbackWithResult() == startwork) {
            }
        }
        setforeground.onExtraCallback("origin_open_timeline_start_skipped", "stale_target_icon_ready", startwork, access8100.onNavigationEvent(getWrite.IAuthTabCallback("activity", activity.getClass().getSimpleName())));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0218 A[LOOP:0: B:66:0x0212->B:68:0x0218, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0228  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        ConstraintLayout constraintLayout;
        FrameLayout frameLayout;
        ConstraintLayout constraintLayout2;
        boolean z;
        ConstraintLayout constraintLayoutValueOf;
        float f;
        int iIntValue;
        Iterator it;
        runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted;
        ConstraintLayout constraintLayout3;
        getTags gettags = (getTags) objArr[0];
        final Activity activity = (Activity) objArr[1];
        final startWork startwork = (startWork) objArr[2];
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(startwork, "");
        setForeground setforeground = setForeground.onExtraCallback;
        Object obj = null;
        if (!setforeground.onNavigationEvent(startwork)) {
            setforeground.onExtraCallback("origin_close_skipped", "entry_not_found", startwork, access8100.onNavigationEvent(getWrite.IAuthTabCallback("activity", activity.getClass().getSimpleName())));
            return null;
        }
        runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted2 = startwork.onWarmupCompleted();
        if (runonuithreaddelayedOnWarmupCompleted2 != null && runonuithreaddelayedOnWarmupCompleted2.postMessage()) {
            setforeground.onExtraCallback("origin_close_skipped", "end_timeline_running", startwork, access8100.onNavigationEvent(getWrite.IAuthTabCallback("activity", activity.getClass().getSimpleName())));
            return null;
        }
        if (!((Boolean) startWork.onExtraCallback(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -796467992, new Object[]{startwork}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 796467999)).booleanValue()) {
            startwork.onExtraCallbackWithResult(true);
            startwork.onExtraCallbackWithResult(SystemClock.uptimeMillis());
        }
        startwork.onWarmupCompleted(true);
        runOnUiThreadDelayed runonuithreaddelayedWriteTypedObject = startwork.writeTypedObject();
        if (runonuithreaddelayedWriteTypedObject != null) {
            setforeground.onExtraCallback("origin_close_prepare", runonuithreaddelayedWriteTypedObject.postMessage() ? "cancel_open_running" : "cancel_open_waiting", startwork, access8100.onNavigationEvent(getWrite.IAuthTabCallback("activity", activity.getClass().getSimpleName())));
            runonuithreaddelayedWriteTypedObject.onWarmupCompleted((Function1) null);
            startwork.onNavigationEvent((runOnUiThreadDelayed) null);
            runonuithreaddelayedWriteTypedObject.onNavigationEvent();
        }
        setForeground.onExtraCallback(setforeground, "origin_close_requested", null, startwork, access8100.onNavigationEvent(getWrite.IAuthTabCallback("activity", activity.getClass().getSimpleName())), 2, null);
        Function0<Unit> function0IAuthTabCallbackDefault = startwork.IAuthTabCallbackDefault();
        if (function0IAuthTabCallbackDefault != null) {
            int i4 = onExtraCallbackWithResult + 105;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            function0IAuthTabCallbackDefault.invoke();
        }
        WeakReference<FrameLayout> interfaceDescriptor = startwork.getInterfaceDescriptor();
        if (interfaceDescriptor != null) {
            int i6 = onExtraCallback + 77;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                interfaceDescriptor.get();
                obj.hashCode();
                throw null;
            }
            frameLayout = interfaceDescriptor.get();
            constraintLayout = null;
        } else {
            constraintLayout = null;
            frameLayout = null;
        }
        WeakReference<TdsRoundLayout> weakReferenceOnMinimized = startwork.onMinimized();
        ConstraintLayout constraintLayout4 = weakReferenceOnMinimized != null ? (TdsRoundLayout) weakReferenceOnMinimized.get() : constraintLayout;
        WeakReference<View> weakReferenceOnActivityResized = startwork.onActivityResized();
        if (weakReferenceOnActivityResized != null) {
            int i7 = onExtraCallback + 87;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 == 0) {
                constraintLayout3 = (View) weakReferenceOnActivityResized.get();
                int i8 = 36 / 0;
            } else {
                constraintLayout3 = (View) weakReferenceOnActivityResized.get();
            }
            constraintLayout2 = constraintLayout3;
        } else {
            constraintLayout2 = constraintLayout;
        }
        WeakReference<FrameLayout> weakReferenceIAuthTabCallback_Parcel = startwork.IAuthTabCallback_Parcel();
        ConstraintLayout constraintLayout5 = weakReferenceIAuthTabCallback_Parcel != null ? (FrameLayout) weakReferenceIAuthTabCallback_Parcel.get() : constraintLayout;
        if (frameLayout != null && constraintLayout4 != null) {
            int i9 = onExtraCallbackWithResult + 31;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            if (constraintLayout2 != null && constraintLayout5 != null) {
                gettags.IAuthTabCallback(activity, startwork);
                int iICustomTabsCallbackStub = startwork.ICustomTabsCallbackStub();
                int typedObject = startwork.readTypedObject();
                int iICustomTabsCallbackStubProxy = startwork.ICustomTabsCallbackStubProxy();
                int iOnRelationshipValidationResult = startwork.onRelationshipValidationResult();
                handleNativeAdClick.onExtraCallback.asInterface asinterfaceExtraCallback = startwork.extraCallback();
                if (asinterfaceExtraCallback != null) {
                    int i11 = onExtraCallback + 33;
                    onExtraCallbackWithResult = i11 % 128;
                    int i12 = i11 % 2;
                    constraintLayoutValueOf = Float.valueOf(asinterfaceExtraCallback.IAuthTabCallbackDefault());
                } else {
                    constraintLayoutValueOf = constraintLayout;
                }
                Integer numICustomTabsCallbackDefault = startwork.ICustomTabsCallbackDefault();
                ListenableWorker listenableWorker = (ListenableWorker) IAuthTabCallback(-14014887, new Object[]{gettags, activity, startwork}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 14014888, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback());
                int iOnWarmupCompleted = listenableWorker.onWarmupCompleted();
                int iOnNavigationEvent = listenableWorker.onNavigationEvent();
                Rect rectOnExtraCallback = M_.onExtraCallback.onExtraCallback(activity);
                if (rectOnExtraCallback != null) {
                    iIntValue = rectOnExtraCallback.top;
                } else {
                    if (numICustomTabsCallbackDefault == null) {
                        f = 0.0f;
                        float f2 = f;
                        frameLayout.setOnTouchListener(new View.OnTouchListener() { // from class: im.toss.base.transition.origin.OriginScaleTransition$$ExternalSyntheticLambda7
                            private static int IAuthTabCallback = 0;
                            private static int onExtraCallbackWithResult = 1;

                            @Override // android.view.View.OnTouchListener
                            public final boolean onTouch(View view, MotionEvent motionEvent) {
                                int i13 = 2 % 2;
                                int i14 = IAuthTabCallback + 15;
                                onExtraCallbackWithResult = i14 % 128;
                                if (i14 % 2 == 0) {
                                    getTags.onExtraCallback(startwork, view, motionEvent);
                                    Object obj2 = null;
                                    obj2.hashCode();
                                    throw null;
                                }
                                boolean zOnExtraCallback = getTags.onExtraCallback(startwork, view, motionEvent);
                                int i15 = IAuthTabCallback + 115;
                                onExtraCallbackWithResult = i15 % 128;
                                int i16 = i15 % 2;
                                return zOnExtraCallback;
                            }
                        });
                        startwork.onWarmupCompleted(getTriggeredContentUris.onNavigationEvent.IAuthTabCallback(constraintLayout4, constraintLayout2, constraintLayout5, iICustomTabsCallbackStub, typedObject, iICustomTabsCallbackStubProxy, iOnRelationshipValidationResult, numICustomTabsCallbackDefault, constraintLayoutValueOf, iOnWarmupCompleted, iOnNavigationEvent, f2, startwork.onUnminimized(), new Function1() { // from class: im.toss.base.transition.origin.OriginScaleTransition$$ExternalSyntheticLambda8
                            private static int onExtraCallback = 1;
                            private static int onWarmupCompleted;

                            public final Object invoke(Object obj2) {
                                int i13 = 2 % 2;
                                int i14 = onWarmupCompleted + 103;
                                onExtraCallback = i14 % 128;
                                if (i14 % 2 == 0) {
                                    getTags.onWarmupCompleted(startwork, ((Float) obj2).floatValue());
                                    throw null;
                                }
                                Unit unitOnWarmupCompleted = getTags.onWarmupCompleted(startwork, ((Float) obj2).floatValue());
                                int i15 = onWarmupCompleted + 29;
                                onExtraCallback = i15 % 128;
                                int i16 = i15 % 2;
                                return unitOnWarmupCompleted;
                            }
                        }));
                        final List listMutableListOf = CollectionsKt.mutableListOf(new View[]{constraintLayout2});
                        listMutableListOf.add(constraintLayout5);
                        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                        it = listMutableListOf.iterator();
                        while (it.hasNext()) {
                            ((View) it.next()).setLayerType(2, constraintLayout);
                        }
                        runonuithreaddelayedOnWarmupCompleted = startwork.onWarmupCompleted();
                        if (runonuithreaddelayedOnWarmupCompleted != null) {
                            final ConstraintLayout constraintLayout6 = constraintLayout2;
                            runOnUiThreadDelayed runonuithreaddelayedOnExtraCallback = runOnUiThreadDelayed.onExtraCallback(runonuithreaddelayedOnWarmupCompleted, constraintLayout, new Function0() { // from class: im.toss.base.transition.origin.OriginScaleTransition$$ExternalSyntheticLambda9
                                private static int IAuthTabCallback = 1;
                                private static int onNavigationEvent;

                                public final Object invoke() {
                                    int i13 = 2 % 2;
                                    int i14 = onNavigationEvent + 41;
                                    IAuthTabCallback = i14 % 128;
                                    int i15 = i14 % 2;
                                    Ref.BooleanRef booleanRef2 = booleanRef;
                                    if (i15 != 0) {
                                        return getTags.onExtraCallback(booleanRef2, startwork, activity, listMutableListOf, constraintLayout6);
                                    }
                                    int i16 = 16 / 0;
                                    return getTags.onExtraCallback(booleanRef2, startwork, activity, listMutableListOf, constraintLayout6);
                                }
                            }, 1, constraintLayout);
                            if (runonuithreaddelayedOnExtraCallback != null) {
                                final ConstraintLayout constraintLayout7 = constraintLayout2;
                                runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted3 = runOnUiThreadDelayed.onWarmupCompleted(runonuithreaddelayedOnExtraCallback, constraintLayout, new Function0() { // from class: im.toss.base.transition.origin.OriginScaleTransition$$ExternalSyntheticLambda10
                                    private static int IAuthTabCallback = 0;
                                    private static int onNavigationEvent = 1;

                                    public final Object invoke() {
                                        int i13 = 2 % 2;
                                        int i14 = IAuthTabCallback + 9;
                                        onNavigationEvent = i14 % 128;
                                        int i15 = i14 % 2;
                                        Unit unit = (Unit) getTags.IAuthTabCallback(-345296181, new Object[]{booleanRef, startwork, activity, listMutableListOf, constraintLayout7}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 345296187, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback());
                                        int i16 = onNavigationEvent + 67;
                                        IAuthTabCallback = i16 % 128;
                                        int i17 = i16 % 2;
                                        return unit;
                                    }
                                }, 1, constraintLayout);
                                if (runonuithreaddelayedOnWarmupCompleted3 != null) {
                                    isFireOS.onExtraCallbackWithResult(runonuithreaddelayedOnWarmupCompleted3, false, 1, constraintLayout);
                                }
                            }
                        }
                        return constraintLayout;
                    }
                    iIntValue = numICustomTabsCallbackDefault.intValue();
                }
                f = iIntValue;
                float f22 = f;
                frameLayout.setOnTouchListener(new View.OnTouchListener() { // from class: im.toss.base.transition.origin.OriginScaleTransition$$ExternalSyntheticLambda7
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        int i13 = 2 % 2;
                        int i14 = IAuthTabCallback + 15;
                        onExtraCallbackWithResult = i14 % 128;
                        if (i14 % 2 == 0) {
                            getTags.onExtraCallback(startwork, view, motionEvent);
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        boolean zOnExtraCallback = getTags.onExtraCallback(startwork, view, motionEvent);
                        int i15 = IAuthTabCallback + 115;
                        onExtraCallbackWithResult = i15 % 128;
                        int i16 = i15 % 2;
                        return zOnExtraCallback;
                    }
                });
                startwork.onWarmupCompleted(getTriggeredContentUris.onNavigationEvent.IAuthTabCallback(constraintLayout4, constraintLayout2, constraintLayout5, iICustomTabsCallbackStub, typedObject, iICustomTabsCallbackStubProxy, iOnRelationshipValidationResult, numICustomTabsCallbackDefault, constraintLayoutValueOf, iOnWarmupCompleted, iOnNavigationEvent, f22, startwork.onUnminimized(), new Function1() { // from class: im.toss.base.transition.origin.OriginScaleTransition$$ExternalSyntheticLambda8
                    private static int onExtraCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj2) {
                        int i13 = 2 % 2;
                        int i14 = onWarmupCompleted + 103;
                        onExtraCallback = i14 % 128;
                        if (i14 % 2 == 0) {
                            getTags.onWarmupCompleted(startwork, ((Float) obj2).floatValue());
                            throw null;
                        }
                        Unit unitOnWarmupCompleted = getTags.onWarmupCompleted(startwork, ((Float) obj2).floatValue());
                        int i15 = onWarmupCompleted + 29;
                        onExtraCallback = i15 % 128;
                        int i16 = i15 % 2;
                        return unitOnWarmupCompleted;
                    }
                }));
                final List listMutableListOf2 = CollectionsKt.mutableListOf(new View[]{constraintLayout2});
                listMutableListOf2.add(constraintLayout5);
                final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                it = listMutableListOf2.iterator();
                while (it.hasNext()) {
                }
                runonuithreaddelayedOnWarmupCompleted = startwork.onWarmupCompleted();
                if (runonuithreaddelayedOnWarmupCompleted != null) {
                }
                return constraintLayout;
            }
        }
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("activity", activity.getClass().getSimpleName());
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("has_overlay", Boolean.valueOf(frameLayout != null));
        if (constraintLayout4 != null) {
            int i13 = onExtraCallback + 77;
            onExtraCallbackWithResult = i13 % 128;
            int i14 = i13 % 2;
            z = true;
        } else {
            z = false;
        }
        setforeground.onExtraCallback("origin_close_fallback_cleanup", "missing_view_refs", startwork, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback("has_target_icon_container", Boolean.valueOf(z)), getWrite.IAuthTabCallback("has_target_icon", Boolean.valueOf(constraintLayout2 != null)), getWrite.IAuthTabCallback("has_screen_background_dim", Boolean.valueOf(constraintLayout5 != null))}));
        startwork.ICustomTabsCallback_Parcel();
        Function0 function0 = (Function0) startWork.onExtraCallback(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1666755791, new Object[]{startwork}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1666755789);
        if (function0 != null) {
            int i15 = onExtraCallback + 45;
            onExtraCallbackWithResult = i15 % 128;
            int i16 = i15 % 2;
            function0.invoke();
        }
        setForeground.onWarmupCompleted(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -283765271, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 283765271, new Object[]{setforeground, startwork, false, false, 4, constraintLayout}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
        return constraintLayout;
    }

    private static final boolean onExtraCallbackWithResult(startWork startwork, View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        if (motionEvent.getAction() == 0) {
            int i4 = onExtraCallback + 3;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted = startwork.onWarmupCompleted();
            if (runonuithreaddelayedOnWarmupCompleted != null && runonuithreaddelayedOnWarmupCompleted.postMessage()) {
                int i6 = onExtraCallbackWithResult + 71;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted2 = startwork.onWarmupCompleted();
                if (runonuithreaddelayedOnWarmupCompleted2 != null) {
                    runonuithreaddelayedOnWarmupCompleted2.asInterface(1.0f);
                }
                runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted3 = startwork.onWarmupCompleted();
                if (runonuithreaddelayedOnWarmupCompleted3 != null) {
                    int i8 = onExtraCallback + 63;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                    runonuithreaddelayedOnWarmupCompleted3.onNavigationEvent();
                    if (i9 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                }
            }
        }
        int i10 = onExtraCallbackWithResult + 27;
        onExtraCallback = i10 % 128;
        if (i10 % 2 == 0) {
            return false;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(startWork startwork, float f) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        startwork.onWarmupCompleted(f);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 97;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) throws Throwable {
        Ref.BooleanRef booleanRef = (Ref.BooleanRef) objArr[0];
        startWork startwork = (startWork) objArr[1];
        Activity activity = (Activity) objArr[2];
        List list = (List) objArr[3];
        View view = (View) objArr[4];
        String str = (String) objArr[5];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            if (booleanRef.element) {
                return null;
            }
            booleanRef.element = true;
            setForeground.onExtraCallback.onExtraCallback("origin_close_cleanup", str, startwork, access8100.onNavigationEvent(getWrite.IAuthTabCallback("activity", activity.getClass().getSimpleName())));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setLayerType(0, null);
            }
            Object[] objArr2 = {ScaleTransitionTargetIconFactory.onWarmupCompleted, view};
            ScaleTransitionTargetIconFactory.IAuthTabCallback(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 2043403873, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), objArr2, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -2043403873, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback());
            startwork.ICustomTabsCallback_Parcel();
            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            Function0 function0 = (Function0) startWork.onExtraCallback(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1666755791, new Object[]{startwork}, iOnExtraCallback2, -1666755789);
            if (function0 != null) {
                function0.invoke();
            }
            startwork.onWarmupCompleted((runOnUiThreadDelayed) null);
            setForeground.onExtraCallback.onExtraCallback(startwork, false, true);
            int i3 = onExtraCallbackWithResult + 99;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        boolean z = booleanRef.element;
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(Ref.BooleanRef booleanRef, startWork startwork, Activity activity, List list, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(1694236622, new Object[]{booleanRef, startwork, activity, list, view, "cancel"}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -1694236614, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback());
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 5;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit asInterface(Ref.BooleanRef booleanRef, startWork startwork, Activity activity, List list, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(1694236622, new Object[]{booleanRef, startwork, activity, list, view, "end"}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -1694236614, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback());
            Unit unit = Unit.INSTANCE;
            int i3 = onExtraCallback + 89;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
        IAuthTabCallback(1694236622, new Object[]{booleanRef, startwork, activity, list, view, "end"}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -1694236614, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback());
        Unit unit2 = Unit.INSTANCE;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0292 A[LOOP:0: B:74:0x028c->B:76:0x0292, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(final Activity activity, final startWork startwork, runOnUiThreadDelayed runonuithreaddelayed) throws Throwable {
        TdsRoundLayout tdsRoundLayout;
        boolean z;
        char c;
        boolean z2;
        float f;
        int iIntValue;
        float fCoerceAtLeast;
        Iterator it;
        runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted;
        int i = 2 % 2;
        setForeground setforeground = setForeground.onExtraCallback;
        if (!setforeground.onNavigationEvent(startwork)) {
            setforeground.onExtraCallback("origin_interrupted_close_skipped", "entry_not_found", startwork, access8100.onNavigationEvent(getWrite.IAuthTabCallback("activity", activity.getClass().getSimpleName())));
            return;
        }
        runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted2 = startwork.onWarmupCompleted();
        if (runonuithreaddelayedOnWarmupCompleted2 != null && runonuithreaddelayedOnWarmupCompleted2.postMessage()) {
            int i2 = onExtraCallbackWithResult + 101;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            setforeground.onExtraCallback("origin_interrupted_close_skipped", "end_timeline_running", startwork, access8100.onNavigationEvent(getWrite.IAuthTabCallback("activity", activity.getClass().getSimpleName())));
            return;
        }
        if (!((Boolean) startWork.onExtraCallback(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -796467992, new Object[]{startwork}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 796467999)).booleanValue()) {
            int i4 = onExtraCallbackWithResult + 33;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            startwork.onExtraCallbackWithResult(true);
            startwork.onExtraCallbackWithResult(SystemClock.uptimeMillis());
        }
        startwork.onWarmupCompleted(true);
        Object obj = null;
        runonuithreaddelayed.onWarmupCompleted((Function1) null);
        startwork.onNavigationEvent((runOnUiThreadDelayed) null);
        runonuithreaddelayed.onNavigationEvent();
        setForeground.onExtraCallback(setforeground, "origin_interrupted_close_requested", null, startwork, access8100.onNavigationEvent(getWrite.IAuthTabCallback("activity", activity.getClass().getSimpleName())), 2, null);
        Function0<Unit> function0IAuthTabCallbackDefault = startwork.IAuthTabCallbackDefault();
        if (function0IAuthTabCallbackDefault != null) {
            int i6 = onExtraCallbackWithResult + 119;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                function0IAuthTabCallbackDefault.invoke();
                throw null;
            }
            function0IAuthTabCallbackDefault.invoke();
        }
        WeakReference<FrameLayout> interfaceDescriptor = startwork.getInterfaceDescriptor();
        FrameLayout frameLayout = interfaceDescriptor != null ? interfaceDescriptor.get() : null;
        WeakReference<TdsRoundLayout> weakReferenceOnMinimized = startwork.onMinimized();
        if (weakReferenceOnMinimized != null) {
            int i7 = onExtraCallback + 17;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 == 0) {
                weakReferenceOnMinimized.get();
                obj.hashCode();
                throw null;
            }
            tdsRoundLayout = weakReferenceOnMinimized.get();
        } else {
            tdsRoundLayout = null;
        }
        WeakReference<View> weakReferenceOnActivityResized = startwork.onActivityResized();
        View view = weakReferenceOnActivityResized != null ? weakReferenceOnActivityResized.get() : null;
        WeakReference<FrameLayout> weakReferenceIAuthTabCallback_Parcel = startwork.IAuthTabCallback_Parcel();
        FrameLayout frameLayout2 = weakReferenceIAuthTabCallback_Parcel != null ? weakReferenceIAuthTabCallback_Parcel.get() : null;
        if (frameLayout == null || tdsRoundLayout == null || view == null || frameLayout2 == null) {
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("activity", activity.getClass().getSimpleName());
            Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("has_overlay", Boolean.valueOf(frameLayout != null));
            Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("has_target_icon_container", Boolean.valueOf(tdsRoundLayout != null));
            if (view != null) {
                int i8 = onExtraCallback + 83;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                z = true;
            } else {
                z = false;
            }
            Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback("has_target_icon", Boolean.valueOf(z));
            if (frameLayout2 != null) {
                int i10 = onExtraCallback + 65;
                onExtraCallbackWithResult = i10 % 128;
                c = 2;
                int i11 = i10 % 2;
                z2 = true;
            } else {
                c = 2;
                z2 = false;
            }
            Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback("has_screen_background_dim", Boolean.valueOf(z2));
            Pair[] pairArr = new Pair[5];
            pairArr[0] = pairIAuthTabCallback;
            pairArr[1] = pairIAuthTabCallback2;
            pairArr[c] = pairIAuthTabCallback3;
            pairArr[3] = pairIAuthTabCallback4;
            pairArr[4] = pairIAuthTabCallback5;
            setforeground.onExtraCallback("origin_interrupted_close_fallback_cleanup", "missing_view_refs", startwork, access8100.onWarmupCompleted(pairArr));
            startwork.ICustomTabsCallback_Parcel();
            Function0 function0 = (Function0) startWork.onExtraCallback(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1666755791, new Object[]{startwork}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1666755789);
            if (function0 != null) {
                function0.invoke();
            }
            setForeground.onWarmupCompleted(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -283765271, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 283765271, new Object[]{setforeground, startwork, false, false, 4, null}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
            return;
        }
        IAuthTabCallback(1344304745, new Object[]{this, startwork}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -1344304738, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback());
        int iICustomTabsCallbackStub = startwork.ICustomTabsCallbackStub();
        int typedObject = startwork.readTypedObject();
        int iICustomTabsCallbackStubProxy = startwork.ICustomTabsCallbackStubProxy();
        int iOnRelationshipValidationResult = startwork.onRelationshipValidationResult();
        handleNativeAdClick.onExtraCallback.asInterface asinterfaceExtraCallback = startwork.extraCallback();
        Float fValueOf = asinterfaceExtraCallback != null ? Float.valueOf(asinterfaceExtraCallback.IAuthTabCallbackDefault()) : null;
        Integer numICustomTabsCallbackDefault = startwork.ICustomTabsCallbackDefault();
        ListenableWorker listenableWorker = (ListenableWorker) IAuthTabCallback(-14014887, new Object[]{this, activity, startwork}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 14014888, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback());
        int iOnWarmupCompleted = listenableWorker.onWarmupCompleted();
        int iOnNavigationEvent = listenableWorker.onNavigationEvent();
        Rect rectOnExtraCallback = M_.onExtraCallback.onExtraCallback(activity);
        if (rectOnExtraCallback != null) {
            int i12 = onExtraCallback + 11;
            onExtraCallbackWithResult = i12 % 128;
            if (i12 % 2 == 0) {
                iIntValue = rectOnExtraCallback.top;
                int i13 = 9 / 0;
            } else {
                iIntValue = rectOnExtraCallback.top;
            }
        } else {
            if (numICustomTabsCallbackDefault == null) {
                f = 0.0f;
                if (iOnWarmupCompleted <= 0) {
                    int i14 = onExtraCallbackWithResult + 117;
                    onExtraCallback = i14 % 128;
                    int i15 = i14 % 2;
                    fCoerceAtLeast = RangesKt.coerceAtLeast((iOnNavigationEvent * iICustomTabsCallbackStub) / iOnWarmupCompleted, 1.0f);
                    int i16 = onExtraCallbackWithResult + 119;
                    onExtraCallback = i16 % 128;
                    int i17 = i16 % 2;
                } else {
                    fCoerceAtLeast = typedObject;
                }
                float f2 = typedObject;
                float fCoerceAtLeast2 = RangesKt.coerceAtLeast(fCoerceAtLeast, f2);
                ScaleTransitionTargetIconContainer scaleTransitionTargetIconContainer = !(tdsRoundLayout instanceof ScaleTransitionTargetIconContainer) ? (ScaleTransitionTargetIconContainer) tdsRoundLayout : null;
                float fCoerceIn = RangesKt.coerceIn(scaleTransitionTargetIconContainer == null ? scaleTransitionTargetIconContainer.IAuthTabCallback(f2) : f2, f2, fCoerceAtLeast2);
                float fCoerceAtLeast3 = RangesKt.coerceAtLeast(tdsRoundLayout.getScaleX(), 0.01f);
                float translationY = tdsRoundLayout.getTranslationY();
                float f3 = fCoerceIn / 2.0f;
                float typedObject2 = tdsRoundLayout.readTypedObject() * fCoerceAtLeast3;
                ScaleTransitionTargetIconFactory scaleTransitionTargetIconFactory = ScaleTransitionTargetIconFactory.onWarmupCompleted;
                scaleTransitionTargetIconFactory.onExtraCallbackWithResult(tdsRoundLayout, view, iICustomTabsCallbackStub, typedObject);
                view.setAlpha(0.0f);
                view.setX(0.0f);
                view.setY(f3 - (f2 / 2.0f));
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                scaleTransitionTargetIconFactory.onWarmupCompleted(view, fCoerceAtLeast3, Float.valueOf(typedObject2));
                frameLayout.setOnTouchListener(new View.OnTouchListener() { // from class: im.toss.base.transition.origin.OriginScaleTransition$$ExternalSyntheticLambda11
                    private static int onExtraCallback = 1;
                    private static int onWarmupCompleted;

                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        int i18 = 2 % 2;
                        int i19 = onExtraCallback + 115;
                        onWarmupCompleted = i19 % 128;
                        int i20 = i19 % 2;
                        boolean zOnNavigationEvent = getTags.onNavigationEvent(startwork, view2, motionEvent);
                        if (i20 != 0) {
                            int i21 = 39 / 0;
                        }
                        return zOnNavigationEvent;
                    }
                });
                startwork.onWarmupCompleted(getTriggeredContentUris.onNavigationEvent.IAuthTabCallback(tdsRoundLayout, view, frameLayout2, iICustomTabsCallbackStub, typedObject, iICustomTabsCallbackStubProxy, iOnRelationshipValidationResult, numICustomTabsCallbackDefault, fValueOf, iOnWarmupCompleted, iOnNavigationEvent, f, startwork.onUnminimized(), fCoerceIn, typedObject2, tdsRoundLayout.getTranslationX() + (iICustomTabsCallbackStub / 2.0f), translationY + f3, new Function1() { // from class: im.toss.base.transition.origin.OriginScaleTransition$$ExternalSyntheticLambda12
                    private static int onExtraCallbackWithResult = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj2) {
                        Unit unitOnExtraCallbackWithResult;
                        int i18 = 2 % 2;
                        int i19 = onExtraCallbackWithResult + 113;
                        onWarmupCompleted = i19 % 128;
                        if (i19 % 2 != 0) {
                            unitOnExtraCallbackWithResult = getTags.onExtraCallbackWithResult(startwork, ((Float) obj2).floatValue());
                            int i20 = 70 / 0;
                        } else {
                            unitOnExtraCallbackWithResult = getTags.onExtraCallbackWithResult(startwork, ((Float) obj2).floatValue());
                        }
                        int i21 = onWarmupCompleted + 47;
                        onExtraCallbackWithResult = i21 % 128;
                        if (i21 % 2 != 0) {
                            return unitOnExtraCallbackWithResult;
                        }
                        throw null;
                    }
                }));
                final List listMutableListOf = CollectionsKt.mutableListOf(new View[]{view});
                listMutableListOf.add(frameLayout2);
                final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                it = listMutableListOf.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).setLayerType(2, null);
                }
                runonuithreaddelayedOnWarmupCompleted = startwork.onWarmupCompleted();
                if (runonuithreaddelayedOnWarmupCompleted == null) {
                    final View view2 = view;
                    runOnUiThreadDelayed runonuithreaddelayedOnExtraCallback = runOnUiThreadDelayed.onExtraCallback(runonuithreaddelayedOnWarmupCompleted, (Object) null, new Function0() { // from class: im.toss.base.transition.origin.OriginScaleTransition$$ExternalSyntheticLambda13
                        private static int onExtraCallbackWithResult = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke() throws Throwable {
                            Unit unitOnNavigationEvent;
                            int i18 = 2 % 2;
                            int i19 = onNavigationEvent + 29;
                            onExtraCallbackWithResult = i19 % 128;
                            if (i19 % 2 != 0) {
                                unitOnNavigationEvent = getTags.onNavigationEvent(booleanRef, startwork, activity, listMutableListOf, view2);
                                int i20 = 26 / 0;
                            } else {
                                unitOnNavigationEvent = getTags.onNavigationEvent(booleanRef, startwork, activity, listMutableListOf, view2);
                            }
                            int i21 = onExtraCallbackWithResult + 57;
                            onNavigationEvent = i21 % 128;
                            int i22 = i21 % 2;
                            return unitOnNavigationEvent;
                        }
                    }, 1, (Object) null);
                    if (runonuithreaddelayedOnExtraCallback != null) {
                        final View view3 = view;
                        runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted3 = runOnUiThreadDelayed.onWarmupCompleted(runonuithreaddelayedOnExtraCallback, (Object) null, new Function0() { // from class: im.toss.base.transition.origin.OriginScaleTransition$$ExternalSyntheticLambda14
                            private static int onExtraCallback = 1;
                            private static int onNavigationEvent;

                            public final Object invoke() {
                                int i18 = 2 % 2;
                                int i19 = onNavigationEvent + 15;
                                onExtraCallback = i19 % 128;
                                int i20 = i19 % 2;
                                Ref.BooleanRef booleanRef2 = booleanRef;
                                if (i20 != 0) {
                                    return getTags.onWarmupCompleted(booleanRef2, startwork, activity, listMutableListOf, view3);
                                }
                                getTags.onWarmupCompleted(booleanRef2, startwork, activity, listMutableListOf, view3);
                                throw null;
                            }
                        }, 1, (Object) null);
                        if (runonuithreaddelayedOnWarmupCompleted3 != null) {
                            isFireOS.onExtraCallbackWithResult(runonuithreaddelayedOnWarmupCompleted3, false, 1, (Object) null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            int i18 = onExtraCallbackWithResult + 23;
            onExtraCallback = i18 % 128;
            int i19 = i18 % 2;
            iIntValue = numICustomTabsCallbackDefault.intValue();
        }
        f = iIntValue;
        if (iOnWarmupCompleted <= 0) {
        }
        float f22 = typedObject;
        float fCoerceAtLeast22 = RangesKt.coerceAtLeast(fCoerceAtLeast, f22);
        if (!(tdsRoundLayout instanceof ScaleTransitionTargetIconContainer)) {
        }
        float fCoerceIn2 = RangesKt.coerceIn(scaleTransitionTargetIconContainer == null ? scaleTransitionTargetIconContainer.IAuthTabCallback(f22) : f22, f22, fCoerceAtLeast22);
        float fCoerceAtLeast32 = RangesKt.coerceAtLeast(tdsRoundLayout.getScaleX(), 0.01f);
        float translationY2 = tdsRoundLayout.getTranslationY();
        float f32 = fCoerceIn2 / 2.0f;
        float typedObject22 = tdsRoundLayout.readTypedObject() * fCoerceAtLeast32;
        ScaleTransitionTargetIconFactory scaleTransitionTargetIconFactory2 = ScaleTransitionTargetIconFactory.onWarmupCompleted;
        scaleTransitionTargetIconFactory2.onExtraCallbackWithResult(tdsRoundLayout, view, iICustomTabsCallbackStub, typedObject);
        view.setAlpha(0.0f);
        view.setX(0.0f);
        view.setY(f32 - (f22 / 2.0f));
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        scaleTransitionTargetIconFactory2.onWarmupCompleted(view, fCoerceAtLeast32, Float.valueOf(typedObject22));
        frameLayout.setOnTouchListener(new View.OnTouchListener() { // from class: im.toss.base.transition.origin.OriginScaleTransition$$ExternalSyntheticLambda11
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view22, MotionEvent motionEvent) {
                int i182 = 2 % 2;
                int i192 = onExtraCallback + 115;
                onWarmupCompleted = i192 % 128;
                int i20 = i192 % 2;
                boolean zOnNavigationEvent = getTags.onNavigationEvent(startwork, view22, motionEvent);
                if (i20 != 0) {
                    int i21 = 39 / 0;
                }
                return zOnNavigationEvent;
            }
        });
        startwork.onWarmupCompleted(getTriggeredContentUris.onNavigationEvent.IAuthTabCallback(tdsRoundLayout, view, frameLayout2, iICustomTabsCallbackStub, typedObject, iICustomTabsCallbackStubProxy, iOnRelationshipValidationResult, numICustomTabsCallbackDefault, fValueOf, iOnWarmupCompleted, iOnNavigationEvent, f, startwork.onUnminimized(), fCoerceIn2, typedObject22, tdsRoundLayout.getTranslationX() + (iICustomTabsCallbackStub / 2.0f), translationY2 + f32, new Function1() { // from class: im.toss.base.transition.origin.OriginScaleTransition$$ExternalSyntheticLambda12
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj2) {
                Unit unitOnExtraCallbackWithResult;
                int i182 = 2 % 2;
                int i192 = onExtraCallbackWithResult + 113;
                onWarmupCompleted = i192 % 128;
                if (i192 % 2 != 0) {
                    unitOnExtraCallbackWithResult = getTags.onExtraCallbackWithResult(startwork, ((Float) obj2).floatValue());
                    int i20 = 70 / 0;
                } else {
                    unitOnExtraCallbackWithResult = getTags.onExtraCallbackWithResult(startwork, ((Float) obj2).floatValue());
                }
                int i21 = onWarmupCompleted + 47;
                onExtraCallbackWithResult = i21 % 128;
                if (i21 % 2 != 0) {
                    return unitOnExtraCallbackWithResult;
                }
                throw null;
            }
        }));
        final List listMutableListOf2 = CollectionsKt.mutableListOf(new View[]{view});
        listMutableListOf2.add(frameLayout2);
        final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
        it = listMutableListOf2.iterator();
        while (it.hasNext()) {
        }
        runonuithreaddelayedOnWarmupCompleted = startwork.onWarmupCompleted();
        if (runonuithreaddelayedOnWarmupCompleted == null) {
        }
    }

    private static final boolean IAuthTabCallback(startWork startwork, View view, MotionEvent motionEvent) {
        runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted;
        int i = 2 % 2;
        if (motionEvent.getAction() == 0 && (runonuithreaddelayedOnWarmupCompleted = startwork.onWarmupCompleted()) != null && runonuithreaddelayedOnWarmupCompleted.postMessage()) {
            runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted2 = startwork.onWarmupCompleted();
            if (runonuithreaddelayedOnWarmupCompleted2 != null) {
                runonuithreaddelayedOnWarmupCompleted2.asInterface(1.0f);
            }
            runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted3 = startwork.onWarmupCompleted();
            if (runonuithreaddelayedOnWarmupCompleted3 != null) {
                int i2 = onExtraCallback + 125;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                runonuithreaddelayedOnWarmupCompleted3.onNavigationEvent();
                if (i3 == 0) {
                    int i4 = 36 / 0;
                }
            }
        }
        int i5 = onExtraCallbackWithResult + 47;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    private static final Unit IAuthTabCallback(startWork startwork, float f) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            startwork.onWarmupCompleted(f);
            Unit unit = Unit.INSTANCE;
            int i3 = onExtraCallback + 81;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                return unit;
            }
            throw null;
        }
        startwork.onWarmupCompleted(f);
        Unit unit2 = Unit.INSTANCE;
        throw null;
    }

    private static final void onNavigationEvent(Ref.BooleanRef booleanRef, startWork startwork, Activity activity, List<View> list, View view, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        if (booleanRef.element) {
            return;
        }
        booleanRef.element = true;
        setForeground.onExtraCallback.onExtraCallback("origin_interrupted_close_cleanup", str, startwork, access8100.onNavigationEvent(getWrite.IAuthTabCallback("activity", activity.getClass().getSimpleName())));
        Iterator<T> it = list.iterator();
        while (!(!it.hasNext())) {
            ((View) it.next()).setLayerType(0, null);
            int i4 = onExtraCallback + 29;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        ScaleTransitionTargetIconFactory.IAuthTabCallback(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 2043403873, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{ScaleTransitionTargetIconFactory.onWarmupCompleted, view}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -2043403873, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback());
        startwork.ICustomTabsCallback_Parcel();
        Function0 function0 = (Function0) startWork.onExtraCallback(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1666755791, new Object[]{startwork}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1666755789);
        if (function0 != null) {
            function0.invoke();
        }
        startwork.onWarmupCompleted((runOnUiThreadDelayed) null);
        setForeground.onExtraCallback.onExtraCallback(startwork, false, true);
    }

    private static final Unit onTransact(Ref.BooleanRef booleanRef, startWork startwork, Activity activity, List list, View view) throws Throwable {
        Unit unit;
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(booleanRef, startwork, activity, list, view, "cancel");
            unit = Unit.INSTANCE;
            int i3 = 72 / 0;
        } else {
            onNavigationEvent(booleanRef, startwork, activity, list, view, "cancel");
            unit = Unit.INSTANCE;
        }
        int i4 = onExtraCallbackWithResult + 9;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        Ref.BooleanRef booleanRef = (Ref.BooleanRef) objArr[0];
        startWork startwork = (startWork) objArr[1];
        Activity activity = (Activity) objArr[2];
        List list = (List) objArr[3];
        View view = (View) objArr[4];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(booleanRef, startwork, activity, list, view, "end");
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 15;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void IAuthTabCallback(Activity activity, startWork startwork) throws Throwable {
        TdsRoundLayout tdsRoundLayout;
        View view;
        boolean z;
        float f;
        int iIntValue;
        View view2;
        int i = 2 % 2;
        WeakReference<TdsRoundLayout> weakReferenceOnMinimized = startwork.onMinimized();
        if (weakReferenceOnMinimized != null) {
            tdsRoundLayout = weakReferenceOnMinimized.get();
        } else {
            int i2 = onExtraCallback + 55;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            tdsRoundLayout = null;
        }
        WeakReference<View> weakReferenceOnActivityResized = startwork.onActivityResized();
        if (weakReferenceOnActivityResized != null) {
            int i4 = onExtraCallback + 125;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                view2 = weakReferenceOnActivityResized.get();
                int i5 = 51 / 0;
            } else {
                view2 = weakReferenceOnActivityResized.get();
            }
            view = view2;
        } else {
            view = null;
        }
        if (tdsRoundLayout == null || view == null) {
            setForeground setforeground = setForeground.onExtraCallback;
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("activity", activity.getClass().getSimpleName());
            Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("has_target_icon_container", Boolean.valueOf(tdsRoundLayout != null));
            if (view != null) {
                int i6 = onExtraCallback + 9;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                z = true;
            } else {
                z = false;
            }
            setforeground.onExtraCallback("prepare_end_state_skipped", "missing_view_refs", startwork, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback("has_target_icon", Boolean.valueOf(z))}));
            return;
        }
        int iICustomTabsCallbackStub = startwork.ICustomTabsCallbackStub();
        Integer numICustomTabsCallbackDefault = startwork.ICustomTabsCallbackDefault();
        ListenableWorker listenableWorker = (ListenableWorker) IAuthTabCallback(-14014887, new Object[]{this, activity, startwork}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 14014888, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback());
        int iOnWarmupCompleted = listenableWorker.onWarmupCompleted();
        int iOnNavigationEvent = listenableWorker.onNavigationEvent();
        Rect rectOnExtraCallback = M_.onExtraCallback.onExtraCallback(activity);
        if (rectOnExtraCallback != null) {
            iIntValue = rectOnExtraCallback.top;
        } else {
            if (numICustomTabsCallbackDefault == null) {
                f = 0.0f;
                float f2 = iOnWarmupCompleted;
                float f3 = iICustomTabsCallbackStub;
                float f4 = f2 / f3;
                int i8 = (int) ((iOnNavigationEvent * f3) / f2);
                startwork.onWarmupCompleted(f);
                getTriggeredContentUris.onWarmupCompleted(UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), 359410846, -359410843, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), new Object[]{getTriggeredContentUris.onNavigationEvent, tdsRoundLayout, Integer.valueOf(iICustomTabsCallbackStub), Float.valueOf(f4), Integer.valueOf(iOnWarmupCompleted), Integer.valueOf(i8), Float.valueOf(f)}, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult());
                IAuthTabCallback(1344304745, new Object[]{this, startwork}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -1344304738, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback());
                ScaleTransitionTargetIconFactory scaleTransitionTargetIconFactory = ScaleTransitionTargetIconFactory.onWarmupCompleted;
                scaleTransitionTargetIconFactory.onExtraCallbackWithResult(tdsRoundLayout, view, startwork.ICustomTabsCallbackStub(), startwork.readTypedObject());
                view.setAlpha(0.0f);
                view.setX(0.0f);
                view.setY((i8 / 2.0f) - (startwork.readTypedObject() / 2.0f));
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                scaleTransitionTargetIconFactory.onWarmupCompleted(view, tdsRoundLayout.getScaleX(), Float.valueOf(f));
                setForeground.onExtraCallback(setForeground.onExtraCallback, "prepare_end_state_success", null, startwork, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("activity", activity.getClass().getSimpleName()), getWrite.IAuthTabCallback("screen_width", Integer.valueOf(iOnWarmupCompleted)), getWrite.IAuthTabCallback("screen_height", Integer.valueOf(iOnNavigationEvent)), getWrite.IAuthTabCallback("icon_scale", Float.valueOf(f4)), getWrite.IAuthTabCallback("initial_height", Integer.valueOf(i8))}), 2, null);
            }
            int i9 = onExtraCallback + 83;
            onExtraCallbackWithResult = i9 % 128;
            if (i9 % 2 == 0) {
                numICustomTabsCallbackDefault.intValue();
                throw null;
            }
            iIntValue = numICustomTabsCallbackDefault.intValue();
        }
        f = iIntValue;
        float f22 = iOnWarmupCompleted;
        float f32 = iICustomTabsCallbackStub;
        float f42 = f22 / f32;
        int i82 = (int) ((iOnNavigationEvent * f32) / f22);
        startwork.onWarmupCompleted(f);
        getTriggeredContentUris.onWarmupCompleted(UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), 359410846, -359410843, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), new Object[]{getTriggeredContentUris.onNavigationEvent, tdsRoundLayout, Integer.valueOf(iICustomTabsCallbackStub), Float.valueOf(f42), Integer.valueOf(iOnWarmupCompleted), Integer.valueOf(i82), Float.valueOf(f)}, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult());
        IAuthTabCallback(1344304745, new Object[]{this, startwork}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -1344304738, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback());
        ScaleTransitionTargetIconFactory scaleTransitionTargetIconFactory2 = ScaleTransitionTargetIconFactory.onWarmupCompleted;
        scaleTransitionTargetIconFactory2.onExtraCallbackWithResult(tdsRoundLayout, view, startwork.ICustomTabsCallbackStub(), startwork.readTypedObject());
        view.setAlpha(0.0f);
        view.setX(0.0f);
        view.setY((i82 / 2.0f) - (startwork.readTypedObject() / 2.0f));
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        scaleTransitionTargetIconFactory2.onWarmupCompleted(view, tdsRoundLayout.getScaleX(), Float.valueOf(f));
        setForeground.onExtraCallback(setForeground.onExtraCallback, "prepare_end_state_success", null, startwork, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("activity", activity.getClass().getSimpleName()), getWrite.IAuthTabCallback("screen_width", Integer.valueOf(iOnWarmupCompleted)), getWrite.IAuthTabCallback("screen_height", Integer.valueOf(iOnNavigationEvent)), getWrite.IAuthTabCallback("icon_scale", Float.valueOf(f42)), getWrite.IAuthTabCallback("initial_height", Integer.valueOf(i82))}), 2, null);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Activity activity = (Activity) objArr[1];
        startWork startwork = (startWork) objArr[2];
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            startwork.IAuthTabCallbackStubProxy();
            throw null;
        }
        ListenableWorker listenableWorkerIAuthTabCallbackStubProxy = startwork.IAuthTabCallbackStubProxy();
        if (listenableWorkerIAuthTabCallbackStubProxy != null) {
            int i3 = onExtraCallbackWithResult + 35;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return listenableWorkerIAuthTabCallbackStubProxy;
            }
            obj.hashCode();
            throw null;
        }
        ListenableWorker listenableWorkerOnExtraCallbackWithResult = getInputData.onExtraCallbackWithResult(activity);
        startwork.onExtraCallback(listenableWorkerOnExtraCallbackWithResult);
        return listenableWorkerOnExtraCallbackWithResult;
    }

    public final boolean onWarmupCompleted(@NotNull Activity activity) throws Throwable {
        ViewGroup viewGroup;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(activity, "");
        setForeground setforeground = setForeground.onExtraCallback;
        startWork startworkOnExtraCallbackWithResult = setforeground.onExtraCallbackWithResult();
        if (startworkOnExtraCallbackWithResult == null) {
            return false;
        }
        WeakReference<ViewGroup> weakReferenceIAuthTabCallback = startworkOnExtraCallbackWithResult.IAuthTabCallback();
        Object obj = null;
        if (weakReferenceIAuthTabCallback != null) {
            int i2 = onExtraCallbackWithResult + 51;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                weakReferenceIAuthTabCallback.get();
                throw null;
            }
            viewGroup = weakReferenceIAuthTabCallback.get();
        } else {
            int i3 = onExtraCallback + 17;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 3 % 4;
            }
            viewGroup = null;
        }
        if (viewGroup != null) {
            View decorView = activity.getWindow().getDecorView();
            if ((decorView instanceof ViewGroup ? (ViewGroup) decorView : null) == viewGroup) {
                int i5 = onExtraCallbackWithResult + 55;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    startworkOnExtraCallbackWithResult.onWarmupCompleted();
                    throw null;
                }
                runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted = startworkOnExtraCallbackWithResult.onWarmupCompleted();
                if (runonuithreaddelayedOnWarmupCompleted != null) {
                    int i6 = onExtraCallbackWithResult + 109;
                    onExtraCallback = i6 % 128;
                    if (i6 % 2 == 0 ? runonuithreaddelayedOnWarmupCompleted.postMessage() : !runonuithreaddelayedOnWarmupCompleted.postMessage()) {
                        setforeground.onExtraCallback("origin_back_pressed", "close_running", startworkOnExtraCallbackWithResult, access8100.onNavigationEvent(getWrite.IAuthTabCallback("activity", activity.getClass().getSimpleName())));
                        runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted2 = startworkOnExtraCallbackWithResult.onWarmupCompleted();
                        if (runonuithreaddelayedOnWarmupCompleted2 != null) {
                            runonuithreaddelayedOnWarmupCompleted2.asInterface(1.0f);
                        }
                        runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted3 = startworkOnExtraCallbackWithResult.onWarmupCompleted();
                        if (runonuithreaddelayedOnWarmupCompleted3 != null) {
                            int i7 = onExtraCallback + 11;
                            onExtraCallbackWithResult = i7 % 128;
                            if (i7 % 2 == 0) {
                                runonuithreaddelayedOnWarmupCompleted3.onNavigationEvent();
                                obj.hashCode();
                                throw null;
                            }
                            runonuithreaddelayedOnWarmupCompleted3.onNavigationEvent();
                        }
                        return true;
                    }
                }
                runOnUiThreadDelayed runonuithreaddelayedWriteTypedObject = startworkOnExtraCallbackWithResult.writeTypedObject();
                if (runonuithreaddelayedWriteTypedObject != null) {
                    int i8 = onExtraCallback + 107;
                    onExtraCallbackWithResult = i8 % 128;
                    if (i8 % 2 == 0) {
                        runonuithreaddelayedWriteTypedObject.postMessage();
                        obj.hashCode();
                        throw null;
                    }
                    setforeground.onExtraCallback("origin_back_pressed", runonuithreaddelayedWriteTypedObject.postMessage() ? "open_running" : "open_waiting", startworkOnExtraCallbackWithResult, access8100.onNavigationEvent(getWrite.IAuthTabCallback("activity", activity.getClass().getSimpleName())));
                    if (runonuithreaddelayedWriteTypedObject.postMessage()) {
                        IAuthTabCallback.onNavigationEvent(activity, startworkOnExtraCallbackWithResult, runonuithreaddelayedWriteTypedObject);
                    } else {
                        startworkOnExtraCallbackWithResult.onNavigationEvent((runOnUiThreadDelayed) null);
                        startworkOnExtraCallbackWithResult.ICustomTabsCallback_Parcel();
                        setForeground.onWarmupCompleted(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -283765271, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 283765271, new Object[]{setforeground, startworkOnExtraCallbackWithResult, false, false, 4, null}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        r10 = r3;
        o.setForeground.onExtraCallback(r1, "origin_cancel_requested", null, r10, null, 10, null);
        r3 = r10.writeTypedObject();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        if (r3 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        r3.onNavigationEvent();
        r3 = o.getTags.onExtraCallback + 91;
        o.getTags.onExtraCallbackWithResult = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
    
        r10.onNavigationEvent((o.runOnUiThreadDelayed) null);
        r4 = r10.onWarmupCompleted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0061, code lost:
    
        if (r4 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
    
        r4.onNavigationEvent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        r10.onWarmupCompleted((o.runOnUiThreadDelayed) null);
        r10.ICustomTabsCallback_Parcel();
        r12 = o.CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        r16 = o.CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        r3 = (kotlin.jvm.functions.Function0) o.startWork.onExtraCallback(o.CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), r12, o.CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1666755791, new java.lang.Object[]{r10}, r16, -1666755789);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008c, code lost:
    
        if (r3 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008e, code lost:
    
        r4 = o.getTags.onExtraCallback + 19;
        o.getTags.onExtraCallbackWithResult = r4 % 128;
        r4 = r4 % 2;
        r3.invoke();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009a, code lost:
    
        o.setForegroundAsync.onExtraCallback.onNavigationEvent();
        r13 = com.facebook.react.uimanager.LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        r11 = com.facebook.react.uimanager.LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        r17 = com.facebook.react.uimanager.LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        o.setForeground.onWarmupCompleted(r11, -283765271, r13, com.facebook.react.uimanager.LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 283765271, new java.lang.Object[]{r1, r10, false, false, 6, null}, r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00cc, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r3 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r3 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        o.setForeground.onExtraCallback(r1, "origin_cancel_skipped", "entry_missing", null, null, 12, null);
        r1 = o.getTags.onExtraCallbackWithResult + 61;
        o.getTags.onExtraCallback = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onWarmupCompleted() throws Throwable {
        setForeground setforeground;
        startWork startworkOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            setforeground = setForeground.onExtraCallback;
            startworkOnExtraCallbackWithResult = setforeground.onExtraCallbackWithResult();
            int i3 = 24 / 0;
        } else {
            setforeground = setForeground.onExtraCallback;
            startworkOnExtraCallbackWithResult = setforeground.onExtraCallbackWithResult();
        }
    }

    public final void IAuthTabCallback(@NotNull startWork startwork) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(startwork, "");
            IAuthTabCallback(1344304745, new Object[]{this, startwork}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -1344304738, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback());
            int i3 = 6 / 0;
        } else {
            Intrinsics.checkNotNullParameter(startwork, "");
            IAuthTabCallback(1344304745, new Object[]{this, startwork}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -1344304738, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback());
        }
        int i4 = onExtraCallbackWithResult + 123;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final runOnUiThreadDelayed onWarmupCompleted(final View view, final int i, final int i2, int i3, int i4, int i5, int i6) {
        int i7 = 2 % 2;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        final float fIAuthTabCallback = varyMatches.IAuthTabCallback(Integer.valueOf(UCPApiConstants.ARAM_TIME_OUT), context);
        final float f = i5 / 2.0f;
        final float f2 = i6 / 2.0f;
        final float f3 = i3 + (i / 2.0f);
        final float f4 = (i2 / 2.0f) + i4;
        runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted = RallysKt.onWarmupCompleted((View) null, pxToDp.IAuthTabCallback.onExtraCallback, CollectionsKt.listOf((Rally) RallysKt.onWarmupCompleted(new Object[]{view, isMuted.onNavigationEvent(new AppLovinSdkSettings(), 0.0f, 1.0f, new Function1() { // from class: im.toss.base.transition.origin.OriginScaleTransition$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj) {
                int i8 = 2 % 2;
                int i9 = onExtraCallback + 13;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                Unit unitOnExtraCallbackWithResult = getTags.onExtraCallbackWithResult(i, fIAuthTabCallback, f3, f, f4, f2, i2, view, ((Float) obj).floatValue());
                int i11 = IAuthTabCallback + 21;
                onExtraCallback = i11 % 128;
                int i12 = i11 % 2;
                return unitOnExtraCallbackWithResult;
            }
        }, new Function1() { // from class: im.toss.base.transition.origin.OriginScaleTransition$$ExternalSyntheticLambda2
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i8 = 2 % 2;
                int i9 = onWarmupCompleted + 1;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                Unit unitOnExtraCallback = getTags.onExtraCallback((attachAppLovinSdk) obj);
                int i11 = onNavigationEvent + 19;
                onWarmupCompleted = i11 % 128;
                int i12 = i11 % 2;
                return unitOnExtraCallback;
            }
        }), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, Boolean.FALSE, 0, 0L, false, 3833, (Object) null);
        int i8 = onExtraCallbackWithResult + 15;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
        return runonuithreaddelayedOnWarmupCompleted;
    }

    private static final Unit IAuthTabCallback(int i, float f, float f2, float f3, float f4, float f5, int i2, View view, float f6) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 49;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        float f7 = i;
        float f8 = ((f - f7) * f6) + f7;
        float f9 = i2;
        view.setScaleX(f8 / f7);
        view.setScaleY(f8 / f9);
        view.setX((f2 + ((f3 - f2) * f6)) - (f7 / 2.0f));
        view.setY((f4 + ((f5 - f4) * f6)) - (f9 / 2.0f));
        ScaleTransitionTargetIconFactory.IAuthTabCallback(ScaleTransitionTargetIconFactory.onWarmupCompleted, view, 1.0f, null, 4, null);
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallbackWithResult + 67;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 22 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
        attachapplovinsdk.IAuthTabCallback(300);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 45;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void onWarmupCompleted(View view, ViewGroup viewGroup) {
        int i = 2 % 2;
        if (view.getParent() == viewGroup) {
            int i2 = onExtraCallbackWithResult + 119;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            viewGroup.removeView(view);
            if (i3 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = onExtraCallback + 53;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        final ViewGroup viewGroup;
        startWork startwork = (startWork) objArr[1];
        int i = 2 % 2;
        WeakReference<View> weakReferenceOnExtraCallback = startwork.onExtraCallback();
        Object obj = null;
        if (weakReferenceOnExtraCallback != null) {
            int i2 = onExtraCallback + 119;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            final View view = weakReferenceOnExtraCallback.get();
            if (view != null) {
                int i4 = onExtraCallback + 9;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    boolean z = view.getParent() instanceof ViewGroup;
                    obj.hashCode();
                    throw null;
                }
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    viewGroup = (ViewGroup) parent;
                } else {
                    int i5 = onExtraCallbackWithResult + 79;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    view.setVisibility(8);
                    viewGroup.post(new Runnable() { // from class: im.toss.base.transition.origin.OriginScaleTransition$$ExternalSyntheticLambda0
                        private static int onExtraCallbackWithResult = 0;
                        private static int onNavigationEvent = 1;

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i7 = 2 % 2;
                            int i8 = onNavigationEvent + 27;
                            onExtraCallbackWithResult = i8 % 128;
                            int i9 = i8 % 2;
                            View view2 = view;
                            if (i9 == 0) {
                                getTags.onExtraCallbackWithResult(view2, viewGroup);
                            } else {
                                getTags.onExtraCallbackWithResult(view2, viewGroup);
                                throw null;
                            }
                        }
                    });
                    int i7 = onExtraCallbackWithResult + 7;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                }
            }
        }
        startwork.IAuthTabCallback((WeakReference<View>) null);
        return null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Ref.BooleanRef booleanRef, startWork startwork, Activity activity, List list, View view) {
        return (Unit) IAuthTabCallback(-345296181, new Object[]{booleanRef, startwork, activity, list, view}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 345296187, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback());
    }

    private static final Unit onExtraCallbackWithResult(attachAppLovinSdk attachapplovinsdk) {
        return (Unit) IAuthTabCallback(-339552896, new Object[]{attachapplovinsdk}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 339552901, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback());
    }

    private final void onExtraCallbackWithResult(startWork startwork) throws Throwable {
        IAuthTabCallback(1344304745, new Object[]{this, startwork}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -1344304738, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback());
    }

    private static final void onWarmupCompleted(Ref.BooleanRef booleanRef, startWork startwork, Activity activity, List<View> list, View view, String str) throws Throwable {
        IAuthTabCallback(1694236622, new Object[]{booleanRef, startwork, activity, list, view, str}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -1694236614, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback());
    }

    private static final Unit IAuthTabCallbackStub(Ref.BooleanRef booleanRef, startWork startwork, Activity activity, List list, View view) {
        return (Unit) IAuthTabCallback(1010811408, new Object[]{booleanRef, startwork, activity, list, view}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -1010811405, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback());
    }

    private static final Unit onNavigationEvent(startWork startwork, Activity activity, TdsRoundLayout tdsRoundLayout) {
        return (Unit) IAuthTabCallback(525309901, new Object[]{startwork, activity, tdsRoundLayout}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -525309897, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback());
    }

    private final ListenableWorker onExtraCallbackWithResult(Activity activity, startWork startwork) {
        return (ListenableWorker) IAuthTabCallback(-14014887, new Object[]{this, activity, startwork}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 14014888, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback());
    }

    public final void onExtraCallback(@NotNull Activity activity, @NotNull startWork startwork) throws Throwable {
        IAuthTabCallback(1820477681, new Object[]{this, activity, startwork}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -1820477681, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback());
    }

    public final boolean IAuthTabCallback(@NotNull startWork startwork, @NotNull Activity activity, @NotNull getJobwork_runtime_ktx_release getjobwork_runtime_ktx_release, int i, int i2, int i3, int i4, @Nullable Integer num, int i5, @NotNull Function0<Unit> function0, @Nullable handleNativeAdClick.onExtraCallback.asInterface asinterface, boolean z, @Nullable Integer num2, @Nullable getFuturework_runtime_ktx_release getfuturework_runtime_ktx_release, @Nullable Bitmap bitmap) {
        return ((Boolean) IAuthTabCallback(1231061167, new Object[]{this, startwork, activity, getjobwork_runtime_ktx_release, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), num, Integer.valueOf(i5), function0, asinterface, Boolean.valueOf(z), num2, getfuturework_runtime_ktx_release, bitmap}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -1231061165, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback())).booleanValue();
    }
}
