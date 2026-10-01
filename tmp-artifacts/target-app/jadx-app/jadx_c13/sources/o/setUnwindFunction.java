package o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ScrollView;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import im.toss.tds.view.component.widget.TdsScrollView;
import im.toss.uikit.R;
import im.toss.uikit.widget.menu.TdsMenuV1PopupWindow$;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.Sequence;
import o.alertWithArgs;
import o.pin;
import o.setUnwindFunction;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setUnwindFunction extends PopupWindow {
    public static final onWarmupCompleted Companion;
    private static int onActivityLayout = 0;
    private static int onActivityResized = 0;
    private static int onMinimized = 1;
    public static final int onNavigationEvent = 8;
    private static int onPostMessage = 1;
    private final int IAuthTabCallback;
    private boolean IAuthTabCallbackDefault;
    private disableAnrReporting<?> IAuthTabCallbackStub;
    private int IAuthTabCallbackStubProxy;
    private int IAuthTabCallback_Parcel;
    private String ICustomTabsCallback;
    private int access000;
    private int access100;
    private int asBinder;
    private int asInterface;
    private final int extraCallback;
    private int extraCallbackWithResult;
    private int getInterfaceDescriptor;
    private enableAnrReporting onExtraCallback;
    private List<View> onExtraCallbackWithResult;
    private final Context onTransact;
    private Rect onWarmupCompleted;
    private int readTypedObject;
    private final setDnsokhttp writeTypedObject;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onWarmupCompleted(defaultConstructorMarker);
        int i = onActivityResized + 95;
        onMinimized = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    private static final float IAuthTabCallback(pin pinVar) {
        int i = 2 % 2;
        int i2 = onPostMessage + 9;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(pinVar, "");
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onPostMessage + 45;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
        return 1.6f;
    }

    public static /* synthetic */ void IAuthTabCallback(unload unloadVar, setUnwindFunction setunwindfunction, boolean z, int i, int i2, LinearLayout linearLayout, LinearLayout linearLayout2, View view) {
        int i3 = 2 % 2;
        int i4 = onActivityLayout + 55;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallback(unloadVar, setunwindfunction, z, i, i2, linearLayout, linearLayout2, view);
        if (i5 == 0) {
            int i6 = 77 / 0;
        }
        int i7 = onActivityLayout + 95;
        onPostMessage = i7 % 128;
        int i8 = i7 % 2;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        setUnwindFunction setunwindfunction = (setUnwindFunction) objArr[0];
        int i = 2 % 2;
        int i2 = onPostMessage + 109;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(setunwindfunction);
        int i4 = onActivityLayout + 53;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ Object onExtraCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~((~i) | i7);
        int i9 = ~i6;
        int i10 = i8 | (~(i9 | i)) | (~(i5 | i));
        int i11 = i7 | i;
        int i12 = i9 | i11;
        int i13 = i5 + i + i4 + ((-1542968645) * i2) + (1789173782 * i3);
        int i14 = i13 * i13;
        int i15 = (1553370224 * i5) + 752877568 + ((-368479342) * i) + (i10 * 1186558865) + (1921849566 * i11) + (1186558865 * i12) + ((-1555038208) * i4) + (1802502144 * i2) + (148897792 * i3) + (289275904 * i14);
        int i16 = (i5 * (-930071408)) + 1959937684 + (i * (-930070194)) + (i10 * 607) + (i11 * (-1214)) + (i12 * 607) + (i4 * (-930070801)) + (i2 * 1059663509) + (i3 * (-1428764534)) + (i14 * 484573184);
        switch (i15 + (i16 * i16 * 411172864)) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                pin pinVar = (pin) objArr[0];
                int i17 = 2 % 2;
                int i18 = onActivityLayout + 77;
                onPostMessage = i18 % 128;
                int i19 = i18 % 2;
                float fIAuthTabCallback = IAuthTabCallback(pinVar);
                int i20 = onPostMessage + 61;
                onActivityLayout = i20 % 128;
                int i21 = i20 % 2;
                return Float.valueOf(fIAuthTabCallback);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                setUnwindFunction setunwindfunction = (setUnwindFunction) objArr[0];
                int i22 = 2 % 2;
                int i23 = onActivityLayout + 119;
                onPostMessage = i23 % 128;
                int i24 = i23 % 2;
                Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(setunwindfunction);
                int i25 = onActivityLayout + 33;
                onPostMessage = i25 % 128;
                int i26 = i25 % 2;
                return unitOnExtraCallbackWithResult;
            case 5:
                return IAuthTabCallback(objArr);
            case 6:
                return onWarmupCompleted(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(performOneTimeSetup performonetimesetup) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 73;
        onPostMessage = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(performonetimesetup);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(performonetimesetup);
        int i3 = onPostMessage + 123;
        onActivityLayout = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 57 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onPostMessage + 81;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(i, i2);
        int i6 = onPostMessage + 37;
        onActivityLayout = i6 % 128;
        int i7 = i6 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(setUnwindFunction setunwindfunction, LinearLayout linearLayout) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        int i = 2 % 2;
        int i2 = onActivityLayout + 55;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(setunwindfunction, linearLayout);
        if (i3 == 0) {
            int i4 = 40 / 0;
        }
        int i5 = onPostMessage + 89;
        onActivityLayout = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ void onWarmupCompleted(setUnwindFunction setunwindfunction, View view) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 31;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(setunwindfunction, view);
        int i4 = onActivityLayout + 53;
        onPostMessage = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setUnwindFunction(@NotNull ContextWrapper contextWrapper) {
        super(contextWrapper);
        Intrinsics.checkNotNullParameter(contextWrapper, "");
        this.onTransact = contextWrapper;
        this.ICustomTabsCallback = _UrlKt.FRAGMENT_ENCODE_SET;
        this.IAuthTabCallbackStub = new notifyAnrDetected(CollectionsKt__CollectionsKt.emptyList(), null, 2, null);
        this.onExtraCallbackWithResult = new ArrayList();
        DisplayMetrics displayMetrics = contextWrapper.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        this.getInterfaceDescriptor = varyMatches.onNavigationEvent(180, displayMetrics);
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        this.access100 = Math.max(getCurrentBacktraceOrBuilderList.onNavigationEvent(((Integer) onExtraCallback(new Object[]{this}, 1249757803, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), -1249757798, iOnExtraCallbackWithResult)).intValue() * 0.66f), this.getInterfaceDescriptor);
        this.access000 = getCurrentBacktraceOrBuilderList.onNavigationEvent(onExtraCallbackWithResult() * 0.6f);
        this.extraCallbackWithResult = 20;
        this.asBinder = 20;
        this.IAuthTabCallbackStubProxy = 20;
        this.onWarmupCompleted = new Rect();
        this.writeTypedObject = setConnectionSpecsokhttp.IAuthTabCallback(new Function1() { // from class: im.toss.uikit.widget.menu.TdsMenuV1PopupWindow$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 7;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr = {(pin) obj};
                int iOnExtraCallbackWithResult2 = alertWithArgs.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult3 = alertWithArgs.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult4 = alertWithArgs.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult5 = alertWithArgs.onExtraCallbackWithResult();
                if (i3 != 0) {
                    return Float.valueOf(((Float) setUnwindFunction.onExtraCallback(objArr, 138154449, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult5, iOnExtraCallbackWithResult3, -138154447, iOnExtraCallbackWithResult2)).floatValue());
                }
                Float.valueOf(((Float) setUnwindFunction.onExtraCallback(objArr, 138154449, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult5, iOnExtraCallbackWithResult3, -138154447, iOnExtraCallbackWithResult2)).floatValue());
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }, 0.0f, (getDelegateokhttp) null, (getDelegateokhttp) null, 14, (Object) null);
        this.IAuthTabCallback = View.generateViewId();
        this.extraCallback = View.generateViewId();
        setFocusable(true);
        setOutsideTouchable(true);
        setBackgroundDrawable(new ColorDrawable(0));
        float fOnWarmupCompleted = onExtraCallback().onWarmupCompleted();
        Intrinsics.checkNotNullExpressionValue(contextWrapper.getResources().getDisplayMetrics(), "");
        setElevation(varyMatches.onNavigationEvent(Float.valueOf(fOnWarmupCompleted), r10));
        setClippingEnabled(false);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        setUnwindFunction setunwindfunction = (setUnwindFunction) objArr[0];
        int i = 2 % 2;
        int i2 = onPostMessage + 65;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        disableAnrReporting<?> disableanrreporting = setunwindfunction.IAuthTabCallbackStub;
        if (i3 == 0) {
            return disableanrreporting;
        }
        throw null;
    }

    public final void IAuthTabCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 17;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.ICustomTabsCallback = str;
        int i4 = onActivityLayout + 25;
        onPostMessage = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        setUnwindFunction setunwindfunction = (setUnwindFunction) objArr[0];
        int i = 2 % 2;
        int i2 = onPostMessage + 19;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        int i4 = setunwindfunction.onTransact.getResources().getDisplayMetrics().widthPixels;
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = onActivityLayout + 35;
        onPostMessage = i5 % 128;
        int i6 = i5 % 2;
        return Integer.valueOf(i4);
    }

    private final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 73;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.onTransact.getResources().getDisplayMetrics().heightPixels;
        int i5 = onActivityLayout + Imgproc.COLOR_YUV2RGB_YVYU;
        onPostMessage = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final boolean onTransact() {
        int i = 2 % 2;
        if (this.onTransact.getResources().getConfiguration().fontScale < 1.6f) {
            return false;
        }
        int i2 = onPostMessage;
        int i3 = i2 + 97;
        onActivityLayout = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 25;
        onActivityLayout = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 25 / 0;
        }
        return true;
    }

    private final accessgetORDER_BY_NAMEcp onExtraCallback() {
        int i = 2 % 2;
        int i2 = onPostMessage + 43;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {realm.onExtraCallback};
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        accessgetORDER_BY_NAMEcp accessgetorder_by_namecp = (accessgetORDER_BY_NAMEcp) realm.IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), objArr, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), 151101192, -151101192, iIAuthTabCallback);
        int i4 = onActivityLayout + 101;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
        return accessgetorder_by_namecp;
    }

    private static final Unit IAuthTabCallback(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onPostMessage + 89;
        onActivityLayout = i4 % 128;
        if (i4 % 2 != 0) {
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i5 = onActivityLayout + 67;
        onPostMessage = i5 % 128;
        int i6 = i5 % 2;
        return unit2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void IAuthTabCallback(setUnwindFunction setunwindfunction, List list, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onActivityLayout + 17;
        onPostMessage = i3 % 128;
        if (i3 % 2 != 0 ? (i & 2) != 0 : (i & 5) != 0) {
            function1 = new TdsMenuV1PopupWindow$.ExternalSyntheticLambda7();
        }
        setunwindfunction.onWarmupCompleted((List<performOneTimeSetup>) list, (Function1<? super performOneTimeSetup, Unit>) function1);
        int i4 = onPostMessage + 21;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onNavigationEvent(performOneTimeSetup performonetimesetup) {
        int i = 2 % 2;
        int i2 = onPostMessage + 67;
        onActivityLayout = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(performonetimesetup, "");
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(performonetimesetup, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = onPostMessage + 67;
        onActivityLayout = i3 % 128;
        if (i3 % 2 == 0) {
            return unit2;
        }
        throw null;
    }

    public final void onWarmupCompleted(@NotNull List<performOneTimeSetup> list, @NotNull Function1<? super performOneTimeSetup, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.IAuthTabCallbackStub = new notifyAnrDetected(list, function1);
        DisplayMetrics displayMetrics = this.onTransact.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        this.extraCallbackWithResult = varyMatches.onNavigationEvent(20, displayMetrics);
        DisplayMetrics displayMetrics2 = this.onTransact.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        this.asBinder = varyMatches.onNavigationEvent(20, displayMetrics2);
        DisplayMetrics displayMetrics3 = this.onTransact.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
        this.IAuthTabCallbackStubProxy = varyMatches.onNavigationEvent(20, displayMetrics3);
        int i2 = onPostMessage + 43;
        onActivityLayout = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private final View IAuthTabCallback() {
        int i = 2 % 2;
        View viewOnNavigationEvent = onNavigationEvent(this.onTransact, new Function1() { // from class: im.toss.uikit.widget.menu.TdsMenuV1PopupWindow$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 35;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                setUnwindFunction setunwindfunction = this.f$0;
                LinearLayout linearLayout = (LinearLayout) obj;
                if (i4 != 0) {
                    return setUnwindFunction.onWarmupCompleted(setunwindfunction, linearLayout);
                }
                setUnwindFunction.onWarmupCompleted(setunwindfunction, linearLayout);
                throw null;
            }
        });
        int i2 = onActivityLayout + 39;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        return viewOnNavigationEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033 A[PHI: r7
      0x0033: PHI (r7v19 kotlin.jvm.functions.Function0<kotlin.Unit>) = (r7v13 kotlin.jvm.functions.Function0<kotlin.Unit>), (r7v22 kotlin.jvm.functions.Function0<kotlin.Unit>) binds: [B:10:0x0031, B:7:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0035 A[PHI: r7 r8
      0x0035: PHI (r7v14 kotlin.jvm.functions.Function0<kotlin.Unit>) = (r7v13 kotlin.jvm.functions.Function0<kotlin.Unit>), (r7v22 kotlin.jvm.functions.Function0<kotlin.Unit>) binds: [B:10:0x0031, B:7:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x0035: PHI (r8v3 o.disableAnrReporting<?>) = (r8v2 o.disableAnrReporting<?>), (r8v9 o.disableAnrReporting<?>) binds: [B:10:0x0031, B:7:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallback(unload unloadVar, setUnwindFunction setunwindfunction, boolean z, int i, int i2, LinearLayout linearLayout, LinearLayout linearLayout2, View view) {
        initNativePlugin initnativeplugin;
        Function2<Integer, Integer, Unit> function2OnWarmupCompleted;
        Function0<Unit> function0OnExtraCallbackWithResult;
        disableAnrReporting<?> disableanrreporting;
        notifyAnrDetected notifyanrdetected;
        int i3 = 2 % 2;
        if (unloadVar instanceof performOneTimeSetup) {
            int i4 = onActivityLayout + 91;
            onPostMessage = i4 % 128;
            if (i4 % 2 == 0) {
                function0OnExtraCallbackWithResult = ((performOneTimeSetup) unloadVar).onExtraCallbackWithResult();
                disableanrreporting = setunwindfunction.IAuthTabCallbackStub;
                int i5 = 25 / 0;
                if (disableanrreporting instanceof notifyAnrDetected) {
                    int i6 = onPostMessage + 39;
                    onActivityLayout = i6 % 128;
                    if (i6 % 2 != 0) {
                        throw null;
                    }
                    notifyanrdetected = (notifyAnrDetected) disableanrreporting;
                } else {
                    notifyanrdetected = null;
                }
            } else {
                function0OnExtraCallbackWithResult = ((performOneTimeSetup) unloadVar).onExtraCallbackWithResult();
                disableanrreporting = setunwindfunction.IAuthTabCallbackStub;
                if (!(disableanrreporting instanceof notifyAnrDetected)) {
                }
            }
            Function1<performOneTimeSetup, Unit> function1OnWarmupCompleted = notifyanrdetected != null ? notifyanrdetected.onWarmupCompleted() : null;
            if (function0OnExtraCallbackWithResult != null) {
                function0OnExtraCallbackWithResult.invoke();
            } else if (function1OnWarmupCompleted != null) {
                int i7 = onActivityLayout + 123;
                onPostMessage = i7 % 128;
                int i8 = i7 % 2;
                function1OnWarmupCompleted.invoke(unloadVar);
            }
            setunwindfunction.dismiss();
            return;
        }
        if (!(unloadVar instanceof r8lambdauySRm1mZP8abhbkrYCVyutMa2H4)) {
            throw new NoWhenBranchMatchedException();
        }
        int i9 = onPostMessage;
        int i10 = i9 + 89;
        onActivityLayout = i10 % 128;
        int i11 = i10 % 2;
        if (setunwindfunction.IAuthTabCallbackDefault) {
            return;
        }
        int i12 = i9 + 95;
        onActivityLayout = i12 % 128;
        int i13 = i12 % 2;
        if (!z) {
            disableAnrReporting<?> disableanrreporting2 = setunwindfunction.IAuthTabCallbackStub;
            initNativePlugin initnativeplugin2 = disableanrreporting2 instanceof initNativePlugin ? (initNativePlugin) disableanrreporting2 : null;
            if (initnativeplugin2 != null && (function2OnWarmupCompleted = initnativeplugin2.onWarmupCompleted()) != null) {
                function2OnWarmupCompleted.invoke(Integer.valueOf(i), Integer.valueOf(i2));
            }
            disableAnrReporting<?> disableanrreporting3 = setunwindfunction.IAuthTabCallbackStub;
            if (!(disableanrreporting3 instanceof initNativePlugin)) {
                initnativeplugin = null;
            } else {
                int i14 = onActivityLayout + 89;
                onPostMessage = i14 % 128;
                int i15 = i14 % 2;
                initnativeplugin = (initNativePlugin) disableanrreporting3;
            }
            if (initnativeplugin != null) {
                initnativeplugin.onNavigationEvent(i2);
            }
            unload unloadVar2 = (unload) CollectionsKt___CollectionsKt.getOrNull(setunwindfunction.IAuthTabCallbackStub.onExtraCallbackWithResult(), i);
            ViewGroup viewGroup = unloadVar2 != null ? (ViewGroup) linearLayout2.findViewWithTag(unloadVar2) : null;
            if (viewGroup != null) {
                setunwindfunction.onNavigationEvent(viewGroup, false);
            }
            setunwindfunction.onNavigationEvent((ViewGroup) linearLayout, true);
        }
        setunwindfunction.IAuthTabCallback(100);
    }

    private static final void IAuthTabCallback(setUnwindFunction setunwindfunction, View view) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 65;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        setunwindfunction.dismiss();
        int i4 = onActivityLayout + 43;
        onPostMessage = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 59 / 0;
        }
    }

    private static final Unit onNavigationEvent(final setUnwindFunction setunwindfunction, final LinearLayout linearLayout) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Integer num;
        Class cls;
        initNativePlugin initnativeplugin;
        int iOnExtraCallback;
        deprecated_followRedirects deprecated_followredirectsOnWarmupCompleted;
        performOneTimeSetup performonetimesetup;
        unload unloadVar;
        Integer numIAuthTabCallback;
        boolean z;
        Integer num2;
        Integer num3;
        int iOnNavigationEvent;
        int iOnNavigationEvent2;
        LinearLayout linearLayout2 = linearLayout;
        int i = 2 % 2;
        Integer num4 = 8;
        Integer num5 = 20;
        Integer num6 = 6;
        Intrinsics.checkNotNullParameter(linearLayout2, "");
        View view = new View(linearLayout.getContext());
        Integer num7 = -1;
        Integer num8 = -2;
        Class cls2 = Integer.TYPE;
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) ViewGroup.LayoutParams.class.getDeclaredConstructor(cls2, cls2).newInstance(num7, num8);
        Intrinsics.checkNotNull(layoutParams);
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        layoutParams.height = varyMatches.onNavigationEvent(10, displayMetrics);
        view.setLayoutParams(layoutParams);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout2, view);
        if (setunwindfunction.ICustomTabsCallback.length() > 0) {
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            Context context = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(layoutParams2);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            int i2 = setunwindfunction.extraCallbackWithResult;
            DisplayMetrics displayMetrics2 = frameLayout.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
            int iOnNavigationEvent3 = varyMatches.onNavigationEvent(num6, displayMetrics2);
            DisplayMetrics displayMetrics3 = frameLayout.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
            int iOnNavigationEvent4 = varyMatches.onNavigationEvent(num5, displayMetrics3);
            num = 10;
            DisplayMetrics displayMetrics4 = frameLayout.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
            cls = cls2;
            marginLayoutParams.setMargins(i2, iOnNavigationEvent3, iOnNavigationEvent4, varyMatches.onNavigationEvent(4, displayMetrics4));
            BaseTextView baseTextView = (BaseTextView) Typography7.class.getDeclaredConstructor(Context.class).newInstance(frameLayout.getContext());
            baseTextView.setLayoutParams(marginLayoutParams);
            Intrinsics.checkNotNull(baseTextView);
            baseTextView.setText(setunwindfunction.ICustomTabsCallback);
            baseTextView.onNavigationEvent(response.SemiBold);
            baseTextView.setTextColor(RequestBodyCompanion.onNavigationEvent(baseTextView, authParams.TextQuaternary));
            baseTextView.onNavigationEvent(setunwindfunction.writeTypedObject);
            baseTextView.setImportantForAccessibility(2);
            Intrinsics.checkNotNull(baseTextView);
            setProxySelectorokhttp.onExtraCallbackWithResult(frameLayout, baseTextView);
            setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout2, frameLayout);
        } else {
            num = 10;
            cls = cls2;
        }
        Class<ViewGroup.LayoutParams> cls3 = ViewGroup.LayoutParams.class;
        disableAnrReporting<?> disableanrreporting = setunwindfunction.IAuthTabCallbackStub;
        Object obj = null;
        if (disableanrreporting instanceof initNativePlugin) {
            int i3 = onPostMessage + 51;
            onActivityLayout = i3 % 128;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            initnativeplugin = (initNativePlugin) disableanrreporting;
        } else {
            initnativeplugin = null;
        }
        if (initnativeplugin != null) {
            int i4 = onActivityLayout + 111;
            onPostMessage = i4 % 128;
            if (i4 % 2 == 0) {
                initnativeplugin.onExtraCallback();
                throw null;
            }
            iOnExtraCallback = initnativeplugin.onExtraCallback();
        } else {
            iOnExtraCallback = -1;
        }
        setunwindfunction.onExtraCallbackWithResult.clear();
        int i5 = 0;
        for (Object obj2 : setunwindfunction.IAuthTabCallbackStub.onExtraCallbackWithResult()) {
            if (i5 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            unload unloadVar2 = (unload) obj2;
            Integer num9 = num7;
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            Context context2 = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Class<ViewGroup.LayoutParams> cls4 = cls3;
            final LinearLayout linearLayout3 = new LinearLayout(context2);
            linearLayout3.setOrientation(0);
            linearLayout3.setLayoutParams(layoutParams3);
            linearLayout3.setTag(unloadVar2);
            linearLayout3.setGravity(16);
            boolean z2 = unloadVar2 instanceof performOneTimeSetup;
            final boolean z3 = iOnExtraCallback == i5;
            performOneTimeSetup performonetimesetup2 = !(z2 ^ true) ? (performOneTimeSetup) unloadVar2 : null;
            if (performonetimesetup2 != null) {
                deprecated_followredirectsOnWarmupCompleted = performonetimesetup2.onWarmupCompleted();
            } else {
                int i6 = onActivityLayout + 101;
                onPostMessage = i6 % 128;
                int i7 = i6 % 2;
                deprecated_followredirectsOnWarmupCompleted = null;
            }
            if (z2) {
                performonetimesetup = (performOneTimeSetup) unloadVar2;
            } else {
                int i8 = onPostMessage + 47;
                onActivityLayout = i8 % 128;
                int i9 = i8 % 2;
                performonetimesetup = null;
            }
            if (performonetimesetup != null) {
                int i10 = onPostMessage + 85;
                unloadVar = unloadVar2;
                onActivityLayout = i10 % 128;
                int i11 = i10 % 2;
                numIAuthTabCallback = performonetimesetup.IAuthTabCallback();
            } else {
                unloadVar = unloadVar2;
                numIAuthTabCallback = null;
            }
            int i12 = setunwindfunction.IAuthTabCallbackStubProxy;
            int i13 = setunwindfunction.asBinder;
            DisplayMetrics displayMetrics5 = linearLayout3.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics5, "");
            int iOnNavigationEvent5 = varyMatches.onNavigationEvent(num4, displayMetrics5);
            DisplayMetrics displayMetrics6 = linearLayout3.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics6, "");
            linearLayout3.setPadding(i13, iOnNavigationEvent5, i12, varyMatches.onNavigationEvent(num4, displayMetrics6));
            DisplayMetrics displayMetrics7 = linearLayout3.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics7, "");
            linearLayout3.setMinimumHeight(varyMatches.onNavigationEvent(Float.valueOf(44.0f), displayMetrics7));
            final unload unloadVar3 = unloadVar;
            Integer num10 = num4;
            Integer num11 = num;
            Class cls5 = cls;
            final int i14 = i5;
            Integer num12 = num5;
            Integer num13 = num8;
            final int i15 = iOnExtraCallback;
            Integer num14 = num6;
            deprecated_followRedirects deprecated_followredirects = deprecated_followredirectsOnWarmupCompleted;
            int i16 = iOnExtraCallback;
            linearLayout3.setOnClickListener(new View.OnClickListener() { // from class: im.toss.uikit.widget.menu.TdsMenuV1PopupWindow$$ExternalSyntheticLambda4
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i17 = 2 % 2;
                    int i18 = IAuthTabCallback + 65;
                    onWarmupCompleted = i18 % 128;
                    int i19 = i18 % 2;
                    setUnwindFunction.IAuthTabCallback(unloadVar3, setunwindfunction, z3, i15, i14, linearLayout3, linearLayout, view2);
                    int i20 = IAuthTabCallback + 39;
                    onWarmupCompleted = i20 % 128;
                    if (i20 % 2 == 0) {
                        throw null;
                    }
                }
            });
            if (setunwindfunction.IAuthTabCallbackStub instanceof initNativePlugin) {
                TdsCheckBoxV2View.onNavigationEvent onnavigationevent = TdsCheckBoxV2View.onNavigationEvent.LINE;
                Context context3 = linearLayout3.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                TdsCheckBoxV2View tdsCheckBoxV2View = new TdsCheckBoxV2View(context3, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                tdsCheckBoxV2View.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                tdsCheckBoxV2View.setType(onnavigationevent);
                tdsCheckBoxV2View.setChecked(false);
                tdsCheckBoxV2View.setId(setunwindfunction.IAuthTabCallback);
                if (setunwindfunction.onTransact()) {
                    int i17 = onActivityLayout + 17;
                    onPostMessage = i17 % 128;
                    int i18 = i17 % 2;
                    DisplayMetrics displayMetrics8 = tdsCheckBoxV2View.getResources().getDisplayMetrics();
                    Intrinsics.checkNotNullExpressionValue(displayMetrics8, "");
                    iOnNavigationEvent2 = varyMatches.onNavigationEvent(30, displayMetrics8);
                } else {
                    DisplayMetrics displayMetrics9 = tdsCheckBoxV2View.getResources().getDisplayMetrics();
                    Intrinsics.checkNotNullExpressionValue(displayMetrics9, "");
                    iOnNavigationEvent2 = varyMatches.onNavigationEvent(24, displayMetrics9);
                }
                num8 = num13;
                num2 = num9;
                ViewGroup.LayoutParams layoutParams4 = (ViewGroup.LayoutParams) ViewGroup.MarginLayoutParams.class.getDeclaredConstructor(cls5, cls5).newInstance(num2, num8);
                Intrinsics.checkNotNull(layoutParams4);
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4;
                DisplayMetrics displayMetrics10 = tdsCheckBoxV2View.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics10, "");
                num6 = num14;
                marginLayoutParams2.rightMargin = varyMatches.onNavigationEvent(num6, displayMetrics10);
                marginLayoutParams2.width = iOnNavigationEvent2;
                marginLayoutParams2.height = iOnNavigationEvent2;
                tdsCheckBoxV2View.setLayoutParams(layoutParams4);
                z = z3;
                setunwindfunction.IAuthTabCallback(tdsCheckBoxV2View, z);
                tdsCheckBoxV2View.setClickable(false);
                setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout3, tdsCheckBoxV2View);
            } else {
                z = z3;
                num8 = num13;
                num6 = num14;
                num2 = num9;
            }
            if (deprecated_followredirects != null) {
                if (setunwindfunction.onTransact()) {
                    DisplayMetrics displayMetrics11 = linearLayout3.getResources().getDisplayMetrics();
                    Intrinsics.checkNotNullExpressionValue(displayMetrics11, "");
                    iOnNavigationEvent = varyMatches.onNavigationEvent(30, displayMetrics11);
                    num3 = num12;
                } else {
                    DisplayMetrics displayMetrics12 = linearLayout3.getResources().getDisplayMetrics();
                    Intrinsics.checkNotNullExpressionValue(displayMetrics12, "");
                    num3 = num12;
                    iOnNavigationEvent = varyMatches.onNavigationEvent(num3, displayMetrics12);
                }
                LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(iOnNavigationEvent, iOnNavigationEvent);
                Context context4 = linearLayout3.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                TdsImageView tdsImageView = new TdsImageView(context4, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                tdsImageView.setLayoutParams(layoutParams5);
                DisplayMetrics displayMetrics13 = tdsImageView.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics13, "");
                setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(tdsImageView, varyMatches.onNavigationEvent(12, displayMetrics13));
                tdsImageView.setImage(deprecated_followredirects);
                if (numIAuthTabCallback != null) {
                    tdsImageView.setColorFilter(numIAuthTabCallback.intValue());
                }
                setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout3, tdsImageView);
            } else {
                num3 = num12;
            }
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(0, -2, 1.0f);
            BaseTextView baseTextView2 = (BaseTextView) Typography5.class.getDeclaredConstructor(Context.class).newInstance(linearLayout3.getContext());
            baseTextView2.setLayoutParams(layoutParams6);
            Intrinsics.checkNotNull(baseTextView2);
            baseTextView2.setId(setunwindfunction.extraCallback);
            baseTextView2.setText(unloadVar.onExtraCallback());
            setunwindfunction.onWarmupCompleted(baseTextView2, z);
            baseTextView2.onNavigationEvent(setunwindfunction.writeTypedObject);
            Intrinsics.checkNotNull(baseTextView2);
            setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout3, baseTextView2);
            Intrinsics.checkNotNullExpressionValue(linearLayout3.getResources().getDisplayMetrics(), "");
            patch.onExtraCallbackWithResult(linearLayout3, varyMatches.onNavigationEvent(Float.valueOf(12.0f), r0));
            setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, linearLayout3);
            setunwindfunction.onExtraCallbackWithResult.add(linearLayout3);
            int i19 = i14 + 1;
            linearLayout2 = linearLayout;
            cls = cls5;
            num5 = num3;
            iOnExtraCallback = i16;
            cls3 = cls4;
            num4 = num10;
            num = num11;
            num7 = num2;
            i5 = i19;
        }
        LinearLayout linearLayout4 = linearLayout2;
        Class cls6 = cls;
        View view2 = new View(linearLayout.getContext());
        ViewGroup.LayoutParams layoutParamsNewInstance = cls3.getDeclaredConstructor(cls6, cls6).newInstance(num7, num8);
        Intrinsics.checkNotNull(layoutParamsNewInstance);
        DisplayMetrics displayMetrics14 = view2.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics14, "");
        layoutParamsNewInstance.height = varyMatches.onNavigationEvent(num, displayMetrics14);
        view2.setLayoutParams(layoutParamsNewInstance);
        Context context5 = view2.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        if (varyFields.onWarmupCompleted(context5)) {
            view2.setContentDescription(view2.getContext().getString(R.string.uikit_content_desc_close));
            view2.setFocusable(true);
            view2.setOnClickListener(new View.OnClickListener() { // from class: im.toss.uikit.widget.menu.TdsMenuV1PopupWindow$$ExternalSyntheticLambda5
                private static int IAuthTabCallback = 1;
                private static int onWarmupCompleted;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    int i20 = 2 % 2;
                    int i21 = onWarmupCompleted + 15;
                    IAuthTabCallback = i21 % 128;
                    int i22 = i21 % 2;
                    setUnwindFunction.onWarmupCompleted(this.f$0, view3);
                    int i23 = IAuthTabCallback + 33;
                    onWarmupCompleted = i23 % 128;
                    if (i23 % 2 != 0) {
                        throw null;
                    }
                }
            });
        }
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout4, view2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r1
      0x0027: PHI (r1v7 im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View) = 
      (r1v6 im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View)
      (r1v14 im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View)
     binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(ViewGroup viewGroup, boolean z) {
        TdsCheckBoxV2View tdsCheckBoxV2View;
        int i = 2 % 2;
        int i2 = onActivityLayout + 71;
        onPostMessage = i2 % 128;
        if (i2 % 2 == 0) {
            tdsCheckBoxV2View = (TdsCheckBoxV2View) viewGroup.findViewById(this.IAuthTabCallback);
            int i3 = 91 / 0;
            if (tdsCheckBoxV2View != null) {
                IAuthTabCallback(tdsCheckBoxV2View, z);
            }
        } else {
            tdsCheckBoxV2View = (TdsCheckBoxV2View) viewGroup.findViewById(this.IAuthTabCallback);
            if (tdsCheckBoxV2View != null) {
            }
        }
        BaseTextView baseTextView = (BaseTextView) viewGroup.findViewById(this.extraCallback);
        if (baseTextView != null) {
            int i4 = onPostMessage + 103;
            onActivityLayout = i4 % 128;
            int i5 = i4 % 2;
            onWarmupCompleted(baseTextView, z);
        }
        int i6 = onPostMessage + 71;
        onActivityLayout = i6 % 128;
        int i7 = i6 % 2;
    }

    private final void onWarmupCompleted(BaseTextView baseTextView, boolean z) {
        Pair pairIAuthTabCallback;
        int i = 2 % 2;
        int i2 = onActivityLayout + 93;
        int i3 = i2 % 128;
        onPostMessage = i3;
        int i4 = i2 % 2;
        if (z) {
            int i5 = i3 + 91;
            onActivityLayout = i5 % 128;
            int i6 = i5 % 2;
            pairIAuthTabCallback = getWrite.IAuthTabCallback(Integer.valueOf(RequestBodyCompanion.onNavigationEvent(baseTextView, authParams.TextBrand)), response.Bold);
        } else {
            pairIAuthTabCallback = getWrite.IAuthTabCallback(Integer.valueOf(RequestBodyCompanion.onNavigationEvent(baseTextView, authParams.TextSecondary)), response.Medium);
        }
        int iIntValue = ((Number) pairIAuthTabCallback.onExtraCallbackWithResult()).intValue();
        response responseVar = (response) pairIAuthTabCallback.IAuthTabCallback();
        baseTextView.setTextColor(iIntValue);
        baseTextView.onNavigationEvent(responseVar);
    }

    public static /* synthetic */ void IAuthTabCallback(setUnwindFunction setunwindfunction, View view, int i, int i2, int i3, int i4, Object obj) {
        int i5 = 2 % 2;
        int i6 = onPostMessage;
        int i7 = i6 + Imgproc.COLOR_YUV2RGB_YVYU;
        onActivityLayout = i7 % 128;
        int i8 = i7 % 2;
        if ((i4 & 2) != 0) {
            i = setunwindfunction.readTypedObject;
        }
        if ((i4 & 4) != 0) {
            i2 = setunwindfunction.asInterface;
        }
        if ((i4 & 8) != 0) {
            int i9 = i6 + 9;
            onActivityLayout = i9 % 128;
            int i10 = i9 % 2;
            i3 = setunwindfunction.onTransact.getResources().getConfiguration().getLayoutDirection();
        }
        Object[] objArr = {setunwindfunction, view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        onExtraCallback(objArr, 653676421, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), -653676418, iOnExtraCallbackWithResult);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        setUnwindFunction setunwindfunction = (setUnwindFunction) objArr[0];
        View view = (View) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int iIntValue3 = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onActivityLayout + Imgproc.COLOR_YUV2RGBA_YVYU;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        view.getGlobalVisibleRect(setunwindfunction.onWarmupCompleted);
        setunwindfunction.IAuthTabCallback(setunwindfunction.onWarmupCompleted, iIntValue, iIntValue2, iIntValue3);
        int i4 = onActivityLayout + 7;
        onPostMessage = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(setUnwindFunction setunwindfunction, Rect rect, int i, int i2, int i3, int i4, Object obj) {
        int i5 = 2 % 2;
        int i6 = onPostMessage + 71;
        int i7 = i6 % 128;
        onActivityLayout = i7;
        if (i6 % 2 == 0 && (i4 & 1) != 0) {
            rect = setunwindfunction.onWarmupCompleted;
        }
        if ((i4 & 2) != 0) {
            int i8 = i7 + 61;
            onPostMessage = i8 % 128;
            int i9 = i8 % 2;
            i = setunwindfunction.readTypedObject;
        }
        if ((i4 & 4) != 0) {
            i2 = setunwindfunction.asInterface;
        }
        if ((i4 & 8) != 0) {
            i3 = setunwindfunction.onTransact.getResources().getConfiguration().getLayoutDirection();
        }
        setunwindfunction.IAuthTabCallback(rect, i, i2, i3);
    }

    private static final Unit onExtraCallbackWithResult(setUnwindFunction setunwindfunction) {
        int i = 2 % 2;
        int i2 = onPostMessage + 11;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        super.dismiss();
        Unit unit = Unit.INSTANCE;
        int i4 = onActivityLayout + 95;
        onPostMessage = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void IAuthTabCallback(@NotNull Rect rect, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = onPostMessage + 21;
        onActivityLayout = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(rect, "");
        this.readTypedObject = i;
        this.asInterface = i2;
        setContentView(IAuthTabCallback());
        setWidth(RangesKt___RangesKt.coerceIn(getContentView().getMeasuredWidth(), this.getInterfaceDescriptor, this.access100));
        int measuredHeight = getContentView().getMeasuredHeight();
        Integer numValueOf = Integer.valueOf(this.IAuthTabCallback_Parcel);
        enableAnrReporting enableanrreporting = null;
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        setHeight(((Number) RangesKt___RangesKt.coerceIn(Integer.valueOf(measuredHeight), numValueOf, Integer.valueOf(this.access000))).intValue());
        View contentView = getContentView();
        Intrinsics.checkNotNullExpressionValue(contentView, "");
        this.onExtraCallback = new enableAnrReporting(contentView, new Function0() { // from class: im.toss.uikit.widget.menu.TdsMenuV1PopupWindow$$ExternalSyntheticLambda3
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                int i7 = 2 % 2;
                int i8 = onExtraCallbackWithResult + 85;
                onWarmupCompleted = i8 % 128;
                if (i8 % 2 != 0) {
                    Object[] objArr = {this.f$0};
                    int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
                    unit = (Unit) setUnwindFunction.onExtraCallback(objArr, -560495728, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 560495732, iOnExtraCallbackWithResult);
                    int i9 = 35 / 0;
                } else {
                    Object[] objArr2 = {this.f$0};
                    int iOnExtraCallbackWithResult2 = alertWithArgs.onExtraCallbackWithResult();
                    unit = (Unit) setUnwindFunction.onExtraCallback(objArr2, -560495728, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 560495732, iOnExtraCallbackWithResult2);
                }
                int i10 = onWarmupCompleted + 59;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
                return unit;
            }
        });
        Point pointOnExtraCallbackWithResult = onExtraCallbackWithResult(new Point(i2, i), rect, new Size(onNavigationEvent(), onExtraCallbackWithResult()), i3, new Size(getWidth(), getHeight()));
        int i7 = pointOnExtraCallbackWithResult.x;
        Rect rect2 = new Rect(i7, pointOnExtraCallbackWithResult.y, getWidth() + i7, pointOnExtraCallbackWithResult.y + getHeight());
        showAtLocation(getContentView(), 0, pointOnExtraCallbackWithResult.x, pointOnExtraCallbackWithResult.y);
        getContentView().setScaleX(0.0f);
        getContentView().setScaleY(0.0f);
        enableAnrReporting enableanrreporting2 = this.onExtraCallback;
        if (enableanrreporting2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            int i8 = onActivityLayout + 31;
            onPostMessage = i8 % 128;
            int i9 = i8 % 2;
        } else {
            enableanrreporting = enableanrreporting2;
        }
        enableanrreporting.onNavigationEvent(rect2, rect);
    }

    public final List<View> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onPostMessage + 119;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        List<View> list = this.onExtraCallbackWithResult;
        if (i3 == 0) {
            return CollectionsKt___CollectionsKt.toList(list);
        }
        CollectionsKt___CollectionsKt.toList(list);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final Point onExtraCallbackWithResult(Point point, Rect rect, Size size, int i, Size size2) {
        Sequence sequenceOnExtraCallback;
        Object obj;
        Object next;
        int i2 = 2 % 2;
        DisplayMetrics displayMetrics = this.onTransact.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(8, displayMetrics);
        int i3 = rect.left;
        int i4 = point.x;
        int i5 = i3 + i4;
        int width = (rect.right - i4) - size2.getWidth();
        int width2 = size.getWidth() - size2.getWidth();
        if (i == 0) {
            if (rect.left < 0) {
                width2 = 0;
            }
            sequenceOnExtraCallback = clearSelinuxLabel.onExtraCallback((Object[]) new Integer[]{Integer.valueOf(i5), Integer.valueOf(width), Integer.valueOf(width2)});
        } else {
            if (rect.right <= size.getWidth()) {
                int i6 = onPostMessage + 123;
                onActivityLayout = i6 % 128;
                width2 = i6 % 2 != 0 ? 1 : 0;
            }
            sequenceOnExtraCallback = clearSelinuxLabel.onExtraCallback((Object[]) new Integer[]{Integer.valueOf(width), Integer.valueOf(i5), Integer.valueOf(width2)});
        }
        Iterator itIAuthTabCallback = sequenceOnExtraCallback.IAuthTabCallback();
        while (true) {
            obj = null;
            if (!itIAuthTabCallback.hasNext()) {
                next = null;
                break;
            }
            next = itIAuthTabCallback.next();
            int iIntValue = ((Number) next).intValue();
            if (iIntValue >= 0) {
                int i7 = onPostMessage + 31;
                onActivityLayout = i7 % 128;
                if (i7 % 2 != 0) {
                    if (iIntValue * size2.getWidth() <= size.getWidth()) {
                        break;
                    }
                } else if (iIntValue + size2.getWidth() <= size.getWidth()) {
                    break;
                }
            }
        }
        Integer num = (Integer) next;
        if (num != null) {
            int i8 = onPostMessage + 87;
            onActivityLayout = i8 % 128;
            int i9 = i8 % 2;
            width = num.intValue();
        }
        int iMax = Math.max(rect.bottom + point.y, iOnNavigationEvent);
        int height = (rect.top - point.y) - size2.getHeight();
        Iterator itIAuthTabCallback2 = clearSelinuxLabel.onExtraCallback((Object[]) new Integer[]{Integer.valueOf(iMax), Integer.valueOf(height), Integer.valueOf(rect.top - (size2.getHeight() / 2)), Integer.valueOf((size.getHeight() - size2.getHeight()) - iOnNavigationEvent)}).IAuthTabCallback();
        while (true) {
            if (!itIAuthTabCallback2.hasNext()) {
                break;
            }
            int i10 = onActivityLayout + 53;
            onPostMessage = i10 % 128;
            int i11 = i10 % 2;
            Object next2 = itIAuthTabCallback2.next();
            int iIntValue2 = ((Number) next2).intValue();
            if (iIntValue2 >= iOnNavigationEvent && iIntValue2 + size2.getHeight() <= size.getHeight() - iOnNavigationEvent) {
                obj = next2;
                break;
            }
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            height = num2.intValue();
            int i12 = onActivityLayout + 47;
            onPostMessage = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 5 % 5;
            }
        }
        return new Point(width, height);
    }

    private final View onNavigationEvent(Context context, Function1<? super LinearLayout, Unit> function1) {
        int i = 2 % 2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        float fOnNavigationEvent = varyMatches.onNavigationEvent(Float.valueOf(20.0f), displayMetrics);
        int iOnNavigationEvent = OkHttpClientCompanion.onNavigationEvent(context, eExternalSyntheticLambda0.MenuBorder);
        TdsRoundLayout tdsRoundLayout = new TdsRoundLayout(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        tdsRoundLayout.setRadius(fOnNavigationEvent);
        TdsRoundLayout.setShadow$default(tdsRoundLayout, (accessgetORDER_BY_NAMEcp) realm.IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{realm.onExtraCallback}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), 151101192, -151101192, OverseasRrnInputTextField.IAuthTabCallback()), (AppLovinSdkSettings) null, 2, (Object) null);
        Context context2 = tdsRoundLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        ViewGroup frameLayout = new FrameLayout(context2);
        frameLayout.setId(R.id.tds_menu_bg_blur_container);
        onExtraCallbackWithResult(frameLayout);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(fOnNavigationEvent);
        gradientDrawable.setColor(0);
        frameLayout.setBackground(gradientDrawable);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(fOnNavigationEvent);
        gradientDrawable2.setColor(0);
        javaName javanameOnWarmupCompleted = Challenge.IAuthTabCallback.onWarmupCompleted();
        DisplayMetrics displayMetrics2 = frameLayout.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        gradientDrawable2.setStroke(getCurrentBacktraceOrBuilderList.onNavigationEvent(javanameOnWarmupCompleted.onWarmupCompleted(displayMetrics2)), iOnNavigationEvent);
        frameLayout.setForeground(gradientDrawable2);
        frameLayout.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        frameLayout.setClipToOutline(true);
        setProxySelectorokhttp.onExtraCallbackWithResult(tdsRoundLayout, frameLayout);
        Context context3 = tdsRoundLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        TdsScrollView tdsScrollView = new TdsScrollView(context3, (AttributeSet) null, 0, 0, 14, (DefaultConstructorMarker) null);
        tdsScrollView.setId(R.id.tds_menu_content);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        Context context4 = tdsScrollView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        LinearLayout linearLayout = new LinearLayout(context4);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(layoutParams);
        function1.invoke(linearLayout);
        setProxySelectorokhttp.onExtraCallbackWithResult(tdsScrollView, linearLayout);
        tdsScrollView.setVerticalFadingEdgeEnabled(true);
        DisplayMetrics displayMetrics3 = tdsScrollView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
        int iOnNavigationEvent2 = varyMatches.onNavigationEvent(16, displayMetrics3);
        DisplayMetrics displayMetrics4 = tdsScrollView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
        tdsScrollView.setFadingEdgeLength(varyMatches.onNavigationEvent(Integer.valueOf(iOnNavigationEvent2), displayMetrics4));
        disableAnrReporting<?> disableanrreporting = this.IAuthTabCallbackStub;
        if (disableanrreporting instanceof initNativePlugin) {
            int i2 = onPostMessage + 93;
            onActivityLayout = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNull(disableanrreporting, "");
                onExtraCallback(new Object[]{this, tdsScrollView, (initNativePlugin) disableanrreporting}, -2134158925, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 2134158925, alertWithArgs.onExtraCallbackWithResult());
                throw null;
            }
            Intrinsics.checkNotNull(disableanrreporting, "");
            onExtraCallback(new Object[]{this, tdsScrollView, (initNativePlugin) disableanrreporting}, -2134158925, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 2134158925, alertWithArgs.onExtraCallbackWithResult());
            int i3 = onActivityLayout + 103;
            onPostMessage = i3 % 128;
            int i4 = i3 % 2;
        } else {
            onExtraCallbackWithResult((View) tdsScrollView);
        }
        setProxySelectorokhttp.onExtraCallbackWithResult(tdsRoundLayout, tdsScrollView);
        setContentView(tdsScrollView);
        tdsRoundLayout.measure(0, 0);
        tdsRoundLayout.forceLayout();
        return tdsRoundLayout;
    }

    public static final class IAuthTabCallback implements ViewTreeObserver.OnGlobalLayoutListener {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ initNativePlugin IAuthTabCallback;
        final /* synthetic */ ScrollView onExtraCallbackWithResult;
        final /* synthetic */ setUnwindFunction onWarmupCompleted;

        IAuthTabCallback(ScrollView scrollView, initNativePlugin initnativeplugin, setUnwindFunction setunwindfunction) {
            this.onExtraCallbackWithResult = scrollView;
            this.IAuthTabCallback = initnativeplugin;
            this.onWarmupCompleted = setunwindfunction;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 5;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallbackWithResult.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            View childAt = this.onExtraCallbackWithResult.getChildAt(0);
            Intrinsics.checkNotNull(childAt, "");
            View viewFindViewWithTag = this.onExtraCallbackWithResult.findViewWithTag(this.IAuthTabCallback.IAuthTabCallback());
            Iterator itIAuthTabCallback = EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback((ViewGroup) childAt).IAuthTabCallback();
            int height = 0;
            while (itIAuthTabCallback.hasNext()) {
                int i4 = onNavigationEvent + 29;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    Intrinsics.areEqual((View) itIAuthTabCallback.next(), viewFindViewWithTag);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                View view = (View) itIAuthTabCallback.next();
                if (Intrinsics.areEqual(view, viewFindViewWithTag)) {
                    break;
                }
                height += view.getHeight();
                int i5 = onNavigationEvent + 99;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 4 / 3;
                }
            }
            if (height > this.onWarmupCompleted.getHeight() * 0.6f) {
                int i7 = onExtraCallback + 33;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                this.onExtraCallbackWithResult.scrollTo(0, height);
            }
            if (viewFindViewWithTag != null) {
                int i9 = onExtraCallback + 53;
                onNavigationEvent = i9 % 128;
                viewFindViewWithTag.sendAccessibilityEvent(i9 % 2 != 0 ? 16 : 8);
            }
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        setUnwindFunction setunwindfunction = (setUnwindFunction) objArr[0];
        ScrollView scrollView = (ScrollView) objArr[1];
        int i = 2 % 2;
        scrollView.getViewTreeObserver().addOnGlobalLayoutListener(new IAuthTabCallback(scrollView, (initNativePlugin) objArr[2], setunwindfunction));
        int i2 = onPostMessage + 59;
        onActivityLayout = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 99 / 0;
        }
        return null;
    }

    public static final class onNavigationEvent implements ViewTreeObserver.OnGlobalLayoutListener {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ View onExtraCallbackWithResult;
        final /* synthetic */ setUnwindFunction onNavigationEvent;

        onNavigationEvent(View view, setUnwindFunction setunwindfunction) {
            this.onExtraCallbackWithResult = view;
            this.onNavigationEvent = setunwindfunction;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            int i = 2 % 2;
            this.onExtraCallbackWithResult.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            View view = this.onExtraCallbackWithResult;
            Object[] objArr = {this.onNavigationEvent};
            int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
            unload unloadVar = (unload) CollectionsKt___CollectionsKt.firstOrNull(((disableAnrReporting) setUnwindFunction.onExtraCallback(objArr, 1492349035, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), -1492349029, iOnExtraCallbackWithResult)).onExtraCallbackWithResult());
            if (unloadVar != null) {
                int i2 = onExtraCallback + 3;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                View viewFindViewWithTag = view.findViewWithTag(unloadVar);
                if (viewFindViewWithTag != null) {
                    int i4 = onExtraCallback + 109;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    viewFindViewWithTag.sendAccessibilityEvent(8);
                    int i6 = IAuthTabCallback + 21;
                    onExtraCallback = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 5 % 4;
                    }
                }
            }
        }
    }

    private final void onExtraCallbackWithResult(View view) {
        int i = 2 % 2;
        view.getViewTreeObserver().addOnGlobalLayoutListener(new onNavigationEvent(view, this));
        int i2 = onPostMessage + 29;
        onActivityLayout = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 47;
        onPostMessage = i2 % 128;
        IAuthTabCallback(i2 % 2 == 0 ? 1 : 0);
        int i3 = onPostMessage + 89;
        onActivityLayout = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void IAuthTabCallback(int i) {
        View contentView;
        int i2 = 2 % 2;
        if (this.IAuthTabCallbackDefault) {
            return;
        }
        int i3 = onActivityLayout + 15;
        onPostMessage = i3 % 128;
        if (i3 % 2 == 0) {
            this.IAuthTabCallbackDefault = true;
            contentView = getContentView();
            if (contentView == null) {
                return;
            }
        } else {
            this.IAuthTabCallbackDefault = true;
            contentView = getContentView();
            if (contentView == null) {
                return;
            }
        }
        contentView.postDelayed(new Runnable() { // from class: im.toss.uikit.widget.menu.TdsMenuV1PopupWindow$$ExternalSyntheticLambda6
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            @Override // java.lang.Runnable
            public final void run() {
                int i4 = 2 % 2;
                int i5 = onNavigationEvent + 111;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                setUnwindFunction setunwindfunction = this.f$0;
                if (i6 == 0) {
                    int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
                    setUnwindFunction.onExtraCallback(new Object[]{setunwindfunction}, 1060668363, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), -1060668362, iOnExtraCallbackWithResult);
                } else {
                    int iOnExtraCallbackWithResult2 = alertWithArgs.onExtraCallbackWithResult();
                    setUnwindFunction.onExtraCallback(new Object[]{setunwindfunction}, 1060668363, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), -1060668362, iOnExtraCallbackWithResult2);
                    throw null;
                }
            }
        }, i);
        int i4 = onPostMessage + 11;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void onExtraCallback(setUnwindFunction setunwindfunction) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 49;
        int i3 = i2 % 128;
        onPostMessage = i3;
        int i4 = i2 % 2;
        enableAnrReporting enableanrreporting = setunwindfunction.onExtraCallback;
        if (enableanrreporting == null) {
            int i5 = i3 + 81;
            onActivityLayout = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            enableanrreporting = null;
        }
        enableanrreporting.onNavigationEvent();
        setunwindfunction.IAuthTabCallbackDefault = false;
    }

    public static final class onWarmupCompleted {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public static final class onNavigationEvent extends ContextWrapper {
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;
            final /* synthetic */ Context onExtraCallbackWithResult;
            private final Context onNavigationEvent;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onNavigationEvent(Context context, Configuration configuration) {
                super(context);
                this.onExtraCallbackWithResult = context;
                this.onNavigationEvent = context.createConfigurationContext(configuration);
            }

            @Override // android.content.ContextWrapper, android.content.Context
            public Resources getResources() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 61;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Context context = this.onNavigationEvent;
                if (i3 == 0) {
                    return context.getResources();
                }
                context.getResources();
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // android.content.ContextWrapper, android.content.Context
            public Resources.Theme getTheme() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Resources.Theme theme = this.onExtraCallbackWithResult.getTheme();
                int i4 = IAuthTabCallback + 7;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return theme;
                }
                throw null;
            }

            @Override // android.content.ContextWrapper, android.content.Context
            public Object getSystemService(String str) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 81;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(str, "");
                    return this.onExtraCallbackWithResult.getSystemService(str);
                }
                Intrinsics.checkNotNullParameter(str, "");
                this.onExtraCallbackWithResult.getSystemService(str);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // android.content.ContextWrapper
            public void attachBaseContext(Context context) {
                super.attachBaseContext(context);
            }
        }

        public final ContextWrapper onExtraCallbackWithResult(@NotNull Context context) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Configuration configuration = new Configuration(context.getResources().getConfiguration());
            if (configuration.fontScale > 1.6f) {
                int i2 = onNavigationEvent + 123;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    configuration.fontScale = 1.6f;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                configuration.fontScale = 1.6f;
            }
            return new onNavigationEvent(context, configuration);
        }
    }

    private final void IAuthTabCallback(TdsCheckBoxV2View tdsCheckBoxV2View, boolean z) {
        int i;
        int i2 = 2 % 2;
        int i3 = onPostMessage + 123;
        onActivityLayout = i3 % 128;
        if (i3 % 2 == 0) {
            tdsCheckBoxV2View.setChecked(z);
            if (z) {
                i = 0;
            } else {
                int i4 = onActivityLayout + 81;
                onPostMessage = i4 % 128;
                int i5 = i4 % 2;
                i = 4;
            }
            tdsCheckBoxV2View.setVisibility(i);
            return;
        }
        tdsCheckBoxV2View.setChecked(z);
        throw null;
    }

    private final View onExtraCallbackWithResult(ViewGroup viewGroup) {
        int i = 2 % 2;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        View view = new View(viewGroup.getContext());
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(OkHttpClientCompanion.onWarmupCompleted(view, eExternalSyntheticLambda0.MenuFill));
        setProxySelectorokhttp.onExtraCallbackWithResult(viewGroup, view);
        int i2 = onPostMessage + 71;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        return view;
    }

    public static /* synthetic */ float onExtraCallbackWithResult(pin pinVar) {
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        return ((Float) onExtraCallback(new Object[]{pinVar}, 138154449, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), -138154447, iOnExtraCallbackWithResult)).floatValue();
    }

    public static /* synthetic */ void IAuthTabCallback(setUnwindFunction setunwindfunction) {
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        onExtraCallback(new Object[]{setunwindfunction}, 1060668363, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), -1060668362, iOnExtraCallbackWithResult);
    }

    public static /* synthetic */ Unit onWarmupCompleted(setUnwindFunction setunwindfunction) {
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(new Object[]{setunwindfunction}, -560495728, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 560495732, iOnExtraCallbackWithResult);
    }

    public static final /* synthetic */ disableAnrReporting onNavigationEvent(setUnwindFunction setunwindfunction) {
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        return (disableAnrReporting) onExtraCallback(new Object[]{setunwindfunction}, 1492349035, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), -1492349029, iOnExtraCallbackWithResult);
    }

    private final int onNavigationEvent() {
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        return ((Integer) onExtraCallback(new Object[]{this}, 1249757803, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), -1249757798, iOnExtraCallbackWithResult)).intValue();
    }

    private final void onExtraCallback(ScrollView scrollView, initNativePlugin initnativeplugin) {
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        onExtraCallback(new Object[]{this, scrollView, initnativeplugin}, -2134158925, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 2134158925, iOnExtraCallbackWithResult);
    }

    public final void IAuthTabCallback(@NotNull View view, int i, int i2, int i3) {
        Object[] objArr = {this, view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        onExtraCallback(objArr, 653676421, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), -653676418, iOnExtraCallbackWithResult);
    }
}
