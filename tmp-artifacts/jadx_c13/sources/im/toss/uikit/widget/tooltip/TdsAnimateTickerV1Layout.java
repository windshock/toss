package im.toss.uikit.widget.tooltip;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.features.tosscert.ui.R;
import im.toss.features.verify.sms.impl.SmsVerifyInYourNameFragment$;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.uikit.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2;
import o.AppLovinSdkSettings;
import o.AuthenticatorCompanion;
import o.AuthenticatorCompanionAuthenticatorNone;
import o.Cache;
import o.EasingFunctionsKtExternalSyntheticLambda0;
import o.TextFieldPressGestureFilterKtExternalSyntheticLambda0;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.access13800;
import o.access14100;
import o.access15300;
import o.access15400;
import o.authenticate;
import o.ensureCausesIsMutable;
import o.findResAndMsg;
import o.formatMsgs;
import o.getExtraParameters;
import o.getPackageType;
import o.isFireOS;
import o.onLoadStarted;
import o.processDeepLink;
import o.pxToDp;
import o.runOnUiThreadDelayed;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TdsAnimateTickerV1Layout extends FrameLayout {
    public static final IAuthTabCallback Companion;
    private static int ICustomTabsCallback = 0;
    private static int onActivityResized = 0;
    public static final int onExtraCallback = 8;
    private static int onMessageChannelReady = 1;
    private static int onMinimized = 1;
    private boolean IAuthTabCallback;
    private long IAuthTabCallbackDefault;
    private Function1<? super View, ? extends Rally> IAuthTabCallbackStub;
    private int IAuthTabCallbackStubProxy;
    private int IAuthTabCallback_Parcel;
    private final List<Pair<Integer, Integer>> access000;
    private Function1<? super View, ? extends Rally> access100;
    private long asBinder;
    private boolean asInterface;
    private boolean extraCallback;
    private runOnUiThreadDelayed extraCallbackWithResult;
    private final List<Drawable> getInterfaceDescriptor;
    private int onExtraCallbackWithResult;
    private onExtraCallbackWithResult onNavigationEvent;
    private boolean onTransact;
    private ValueAnimator onWarmupCompleted;
    private getPackageType readTypedObject;
    private onWarmupCompleted writeTypedObject;

    static final class onNavigationEvent extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        int I$4;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objOnWarmupCompleted;
            int i = 2 % 2;
            int i2 = onExtraCallback + 23;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object[] objArr = {TdsAnimateTickerV1Layout.this, null, this};
            int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback4 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            if (i3 != 0) {
                objOnWarmupCompleted = TdsAnimateTickerV1Layout.onWarmupCompleted(1682207010, objArr, -1682207006, iIAuthTabCallback4, iIAuthTabCallback2, iIAuthTabCallback3, iIAuthTabCallback);
                int i4 = 13 / 0;
            } else {
                objOnWarmupCompleted = TdsAnimateTickerV1Layout.onWarmupCompleted(1682207010, objArr, -1682207006, iIAuthTabCallback4, iIAuthTabCallback2, iIAuthTabCallback3, iIAuthTabCallback);
            }
            int i5 = onWarmupCompleted + 123;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return objOnWarmupCompleted;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new IAuthTabCallback(defaultConstructorMarker);
        int i = onActivityResized + 81;
        onMinimized = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsAnimateTickerV1Layout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsAnimateTickerV1Layout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ boolean IAuthTabCallback(View view) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 11;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zAccess000 = access000(view);
        int i4 = ICustomTabsCallback + 57;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 26 / 0;
        }
        return zAccess000;
    }

    private final Function1<View, Rally> IAuthTabCallbackDefault() {
        int i = 2 % 2;
        Function1<View, Rally> function1 = new Function1() { // from class: im.toss.uikit.widget.tooltip.TdsAnimateTickerV1Layout$$ExternalSyntheticLambda3
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 119;
                onWarmupCompleted = i3 % 128;
                View view = (View) obj;
                if (i3 % 2 != 0) {
                    int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
                Rally rally = (Rally) TdsAnimateTickerV1Layout.onWarmupCompleted(-2146669987, new Object[]{view}, 2146669990, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2);
                int i4 = onExtraCallbackWithResult + 29;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return rally;
            }
        };
        int i2 = ICustomTabsCallback + 41;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        return function1;
    }

    private final Function1<View, Rally> asInterface() {
        int i = 2 % 2;
        Function1<View, Rally> function1 = new Function1() { // from class: im.toss.uikit.widget.tooltip.TdsAnimateTickerV1Layout$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 19;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
                Rally rally = (Rally) TdsAnimateTickerV1Layout.onWarmupCompleted(1850286995, new Object[]{(View) obj}, -1850286994, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback);
                int i5 = onExtraCallbackWithResult + 97;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return rally;
            }
        };
        int i2 = ICustomTabsCallback + 59;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        return function1;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        View view = (View) objArr[0];
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 1;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackStub(view);
        }
        IAuthTabCallbackStub(view);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Rally onExtraCallbackWithResult(View view) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 75;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Rally rallyIAuthTabCallbackDefault = IAuthTabCallbackDefault(view);
        int i4 = onMessageChannelReady + 47;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return rallyIAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i = 2 % 2;
        Function1 function1 = new Function1() { // from class: im.toss.uikit.widget.tooltip.TdsAnimateTickerV1Layout$$ExternalSyntheticLambda1
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 51;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Rally rallyOnExtraCallbackWithResult = TdsAnimateTickerV1Layout.onExtraCallbackWithResult((View) obj);
                int i5 = onNavigationEvent + 3;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 42 / 0;
                }
                return rallyOnExtraCallbackWithResult;
            }
        };
        int i2 = onMessageChannelReady + 53;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return function1;
        }
        throw null;
    }

    public static /* synthetic */ Rally onNavigationEvent(View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 119;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 == 0) {
            asInterface(view);
            throw null;
        }
        Rally rallyAsInterface = asInterface(view);
        int i3 = ICustomTabsCallback + 71;
        onMessageChannelReady = i3 % 128;
        if (i3 % 2 != 0) {
            return rallyAsInterface;
        }
        throw null;
    }

    private final Function1<View, Rally> onNavigationEvent() {
        int i = 2 % 2;
        Function1<View, Rally> function1 = new Function1() { // from class: im.toss.uikit.widget.tooltip.TdsAnimateTickerV1Layout$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 119;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Rally rallyOnNavigationEvent = TdsAnimateTickerV1Layout.onNavigationEvent((View) obj);
                int i5 = IAuthTabCallback + 27;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return rallyOnNavigationEvent;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        };
        int i2 = ICustomTabsCallback + 93;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 != 0) {
            return function1;
        }
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i;
        int i9 = ~i6;
        int i10 = (~(i7 | i9)) | i8;
        int i11 = ~(i9 | i8 | i7);
        int i12 = i + i2 + i4 + ((-112346298) * i5) + (505796074 * i3);
        int i13 = i12 * i12;
        int i14 = ((1543607772 * i) - 1525940224) + (1734765094 * i2) + (i7 * 95578661) + ((-95578661) * i10) + (95578661 * i11) + (1639186432 * i4) + (859308032 * i5) + (310902784 * i3) + (417529856 * i13);
        int i15 = (i * (-1233303660)) + 1670658458 + (i2 * (-1233302158)) + (i7 * 751) + (i10 * (-751)) + (i11 * 751) + (i4 * (-1233302909)) + (i5 * 1075253458) + (i3 * 745806526) + (i13 * 1512636416);
        int i16 = i14 + (i15 * i15 * (-1737162752));
        return i16 != 1 ? i16 != 2 ? i16 != 3 ? i16 != 4 ? i16 != 5 ? IAuthTabCallback(objArr) : IAuthTabCallbackDefault(objArr) : onNavigationEvent(objArr) : onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr) : onExtraCallback(objArr);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        View view = (View) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 5;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Rally rallyOnTransact = onTransact(view);
        int i4 = onMessageChannelReady + Imgproc.COLOR_YUV2RGB_YVYU;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return rallyOnTransact;
        }
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TdsAnimateTickerV1Layout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.writeTypedObject = onWarmupCompleted.CENTER;
        this.onNavigationEvent = onExtraCallbackWithResult.LEFT;
        this.IAuthTabCallbackStubProxy = -1;
        this.IAuthTabCallbackDefault = 1000L;
        this.asBinder = 1500L;
        this.extraCallback = true;
        this.getInterfaceDescriptor = new ArrayList();
        this.access000 = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.TdsAnimateTickerV1View, 0, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        int i2 = 0;
        while (i2 < indexCount) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == R.styleable.TdsAnimateTickerV1View_autoPlay) {
                int i3 = onMessageChannelReady + 59;
                ICustomTabsCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    this.IAuthTabCallback = typedArrayObtainStyledAttributes.getBoolean(index, this.IAuthTabCallback);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                this.IAuthTabCallback = typedArrayObtainStyledAttributes.getBoolean(index, this.IAuthTabCallback);
                int i4 = ICustomTabsCallback + 17;
                onMessageChannelReady = i4 % 128;
                int i5 = i4 % 2;
            } else {
                if (index == R.styleable.TdsAnimateTickerV1View_skipIntro) {
                    this.extraCallback = typedArrayObtainStyledAttributes.getBoolean(index, this.extraCallback);
                    int i6 = ICustomTabsCallback + 13;
                    onMessageChannelReady = i6 % 128;
                    if (i6 % 2 == 0) {
                    }
                }
                i2++;
                int i7 = 2 % 2;
            }
            int i8 = 2 % 2;
            i2++;
            int i72 = 2 % 2;
        }
        if (this.IAuthTabCallback) {
            onExtraCallbackWithResult(this, null, null, 0, this.extraCallback, false, 23, null);
        } else {
            this.onExtraCallbackWithResult = this.extraCallback ? 0 : -1;
        }
        requestLayout();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsAnimateTickerV1Layout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onMessageChannelReady + 99;
            ICustomTabsCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i6 = onMessageChannelReady + 95;
            ICustomTabsCallback = i6 % 128;
            i = i6 % 2 != 0 ? 1 : 0;
        }
        this(context, attributeSet, i);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        TdsAnimateTickerV1Layout tdsAnimateTickerV1Layout = (TdsAnimateTickerV1Layout) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 109;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        tdsAnimateTickerV1Layout.onExtraCallbackWithResult = iIntValue;
        if (i3 == 0) {
            return null;
        }
        throw null;
    }

    public static final /* synthetic */ runOnUiThreadDelayed IAuthTabCallback(TdsAnimateTickerV1Layout tdsAnimateTickerV1Layout) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 81;
        int i3 = i2 % 128;
        onMessageChannelReady = i3;
        int i4 = i2 % 2;
        runOnUiThreadDelayed runonuithreaddelayed = tdsAnimateTickerV1Layout.extraCallbackWithResult;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 71;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return runonuithreaddelayed;
    }

    public static final /* synthetic */ void onExtraCallback(TdsAnimateTickerV1Layout tdsAnimateTickerV1Layout, int i) {
        int i2 = 2 % 2;
        int i3 = onMessageChannelReady + 57;
        int i4 = i3 % 128;
        ICustomTabsCallback = i4;
        int i5 = i3 % 2;
        tdsAnimateTickerV1Layout.IAuthTabCallback_Parcel = i;
        if (i5 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i4 + 77;
        onMessageChannelReady = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final /* synthetic */ void onExtraCallback(TdsAnimateTickerV1Layout tdsAnimateTickerV1Layout, runOnUiThreadDelayed runonuithreaddelayed) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 87;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        tdsAnimateTickerV1Layout.extraCallbackWithResult = runonuithreaddelayed;
        if (i3 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ boolean onExtraCallback(TdsAnimateTickerV1Layout tdsAnimateTickerV1Layout) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 89;
        int i3 = i2 % 128;
        onMessageChannelReady = i3;
        int i4 = i2 % 2;
        boolean z = tdsAnimateTickerV1Layout.extraCallback;
        int i5 = i3 + 75;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 5 / 0;
        }
        return z;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        TdsAnimateTickerV1Layout tdsAnimateTickerV1Layout = (TdsAnimateTickerV1Layout) objArr[0];
        List<runOnUiThreadDelayed> list = (List) objArr[1];
        access13800<? super Unit> access13800Var = (access13800) objArr[2];
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 113;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objOnNavigationEvent = tdsAnimateTickerV1Layout.onNavigationEvent(list, access13800Var);
        int i4 = onMessageChannelReady + 31;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 97 / 0;
        }
        return objOnNavigationEvent;
    }

    public static final /* synthetic */ int onWarmupCompleted(TdsAnimateTickerV1Layout tdsAnimateTickerV1Layout) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 49;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        int i4 = tdsAnimateTickerV1Layout.IAuthTabCallback_Parcel;
        if (i3 != 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady;
        int i3 = i2 + 63;
        ICustomTabsCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        long j = this.IAuthTabCallbackDefault;
        int i4 = i2 + Imgproc.COLOR_YUV2RGB_YVYU;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return j;
        }
        obj.hashCode();
        throw null;
    }

    public final void setInterval(long j) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 71;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallbackDefault = j;
        if (i3 == 0) {
            throw null;
        }
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 99;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.asBinder;
        }
        int i3 = 28 / 0;
        return this.asBinder;
    }

    public final void setInitDelay(long j) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 1;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        this.asBinder = j;
        if (i3 != 0) {
            int i4 = 26 / 0;
        }
    }

    public static /* synthetic */ void setAlignment$default(TdsAnimateTickerV1Layout tdsAnimateTickerV1Layout, onExtraCallbackWithResult onextracallbackwithresult, onWarmupCompleted onwarmupcompleted, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback;
        int i4 = i3 + 25;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            onextracallbackwithresult = tdsAnimateTickerV1Layout.onNavigationEvent;
            int i6 = i3 + 67;
            onMessageChannelReady = i6 % 128;
            int i7 = i6 % 2;
        }
        if ((i & 2) != 0) {
            int i8 = i3 + 59;
            onMessageChannelReady = i8 % 128;
            if (i8 % 2 == 0) {
                onwarmupcompleted = tdsAnimateTickerV1Layout.writeTypedObject;
                int i9 = 47 / 0;
            } else {
                onwarmupcompleted = tdsAnimateTickerV1Layout.writeTypedObject;
            }
        }
        tdsAnimateTickerV1Layout.setAlignment(onextracallbackwithresult, onwarmupcompleted);
    }

    public final void setAlignment(@NotNull onExtraCallbackWithResult onextracallbackwithresult, @NotNull onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            this.onNavigationEvent = onextracallbackwithresult;
            this.writeTypedObject = onwarmupcompleted;
            requestLayout();
            throw null;
        }
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        this.onNavigationEvent = onextracallbackwithresult;
        this.writeTypedObject = onwarmupcompleted;
        requestLayout();
        int i3 = ICustomTabsCallback + 41;
        onMessageChannelReady = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void setPlayCount(int i) {
        int i2 = 2 % 2;
        int i3 = onMessageChannelReady + 3;
        int i4 = i3 % 128;
        ICustomTabsCallback = i4;
        int i5 = i3 % 2;
        this.IAuthTabCallbackStubProxy = i;
        if (i5 != 0) {
            throw null;
        }
        int i6 = i4 + 83;
        onMessageChannelReady = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void setInRally(@NotNull Function1<? super View, ? extends Rally> function1) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 9;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        onExtraCallback();
        this.IAuthTabCallbackStub = function1;
        int i4 = ICustomTabsCallback + 33;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 38 / 0;
        }
    }

    public final void setOutRally(@NotNull Function1<? super View, ? extends Rally> function1) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 119;
        onMessageChannelReady = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            onExtraCallback();
            this.access100 = function1;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        onExtraCallback();
        this.access100 = function1;
        int i3 = onMessageChannelReady + 65;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    private final Rally asBinder(View view) {
        Rally rallyInvoke;
        int i = 2 % 2;
        if (processDeepLink.onExtraCallback()) {
            return asInterface().invoke(view);
        }
        Function1<? super View, ? extends Rally> function1 = this.IAuthTabCallbackStub;
        if (function1 == null || (rallyInvoke = function1.invoke(view)) == null) {
            Rally rallyInvoke2 = onNavigationEvent().invoke(view);
            int i2 = onMessageChannelReady + 67;
            ICustomTabsCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return rallyInvoke2;
            }
            throw null;
        }
        int i3 = ICustomTabsCallback;
        int i4 = i3 + 97;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 17;
        onMessageChannelReady = i6 % 128;
        if (i6 % 2 != 0) {
            return rallyInvoke;
        }
        throw null;
    }

    private final Rally access100(View view) {
        int i = 2 % 2;
        if (processDeepLink.onExtraCallback()) {
            int i2 = onMessageChannelReady + 69;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            return IAuthTabCallbackDefault().invoke(view);
        }
        Function1<? super View, ? extends Rally> function1 = this.access100;
        if (function1 != null) {
            int i4 = onMessageChannelReady + Imgproc.COLOR_YUV2RGBA_YVYU;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
            Rally rallyInvoke = function1.invoke(view);
            if (rallyInvoke != null) {
                int i6 = ICustomTabsCallback + 53;
                onMessageChannelReady = i6 % 128;
                int i7 = i6 % 2;
                return rallyInvoke;
            }
        }
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Rally) ((Function1) onWarmupCompleted(1754275447, new Object[]{this}, -1754275445, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback)).invoke(view);
    }

    public final void setSkipIntro(boolean z) {
        int i;
        int i2 = 2 % 2;
        this.extraCallback = z;
        if (!z) {
            int i3 = ICustomTabsCallback + 67;
            onMessageChannelReady = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 5 / 3;
            }
            i = -1;
        } else {
            int i5 = ICustomTabsCallback + 83;
            onMessageChannelReady = i5 % 128;
            int i6 = i5 % 2;
            i = 0;
        }
        this.onExtraCallbackWithResult = i;
        requestLayout();
    }

    private static final Rally IAuthTabCallbackStub(View view) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 57;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Object[] objArr = {AuthenticatorCompanion.IAuthTabCallback, authenticate.IN, null, 2, null};
        Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{view, (AppLovinSdkSettings) AuthenticatorCompanion.IAuthTabCallback(-1255317290, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1255317293, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent()), 0, null, 0, null, null, null, 200, 0L, false, 1788, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        int i4 = ICustomTabsCallback + 125;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
        return rally;
    }

    private static final Rally onTransact(View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 61;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{view, (AppLovinSdkSettings) AuthenticatorCompanion.IAuthTabCallback(-1255317290, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{AuthenticatorCompanion.IAuthTabCallback, authenticate.OUT, null, 2, null}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1255317293, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent()), 0, null, 0, null, null, null, 200, 0L, false, 1788, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        int i4 = onMessageChannelReady + 27;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return rally;
    }

    private static final Rally asInterface(View view) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 1;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{view, AuthenticatorCompanion.IAuthTabCallback(AuthenticatorCompanion.IAuthTabCallback, authenticate.IN, Cache.UP, (AuthenticatorCompanionAuthenticatorNone) null, false, (Function1) null, 28, (Object) null), 0, null, 0, null, null, null, 200, 0L, false, 1788, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        int i4 = ICustomTabsCallback + 93;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 != 0) {
            return rally;
        }
        throw null;
    }

    private static final Rally IAuthTabCallbackDefault(View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 41;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{view, AuthenticatorCompanion.IAuthTabCallback(AuthenticatorCompanion.IAuthTabCallback, authenticate.OUT, Cache.UP, (AuthenticatorCompanionAuthenticatorNone) null, false, (Function1) null, 28, (Object) null), 0, null, 0, null, null, null, 200, 0L, false, 1788, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        int i4 = onMessageChannelReady + 59;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return rally;
        }
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(TdsAnimateTickerV1Layout tdsAnimateTickerV1Layout, onExtraCallbackWithResult onextracallbackwithresult, onWarmupCompleted onwarmupcompleted, int i, boolean z, boolean z2, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = ICustomTabsCallback;
        int i5 = i4 + 37;
        onMessageChannelReady = i5 % 128;
        if (i5 % 2 != 0 && (i2 & 1) != 0) {
            onextracallbackwithresult = tdsAnimateTickerV1Layout.onNavigationEvent;
        }
        onExtraCallbackWithResult onextracallbackwithresult2 = onextracallbackwithresult;
        if ((i2 & 2) != 0) {
            onwarmupcompleted = tdsAnimateTickerV1Layout.writeTypedObject;
        }
        onWarmupCompleted onwarmupcompleted2 = onwarmupcompleted;
        if ((i2 & 4) != 0) {
            i = tdsAnimateTickerV1Layout.IAuthTabCallbackStubProxy;
        }
        if ((i2 & 8) != 0) {
            z = tdsAnimateTickerV1Layout.extraCallback;
            int i6 = i4 + 25;
            onMessageChannelReady = i6 % 128;
            int i7 = i6 % 2;
        }
        if ((i2 & 16) != 0) {
            z2 = false;
        }
        Object[] objArr = {tdsAnimateTickerV1Layout, onextracallbackwithresult2, onwarmupcompleted2, Integer.valueOf(i), Boolean.valueOf(z), Boolean.valueOf(z2)};
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onWarmupCompleted(2059235313, objArr, -2059235308, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        int i;
        TdsAnimateTickerV1Layout tdsAnimateTickerV1Layout = (TdsAnimateTickerV1Layout) objArr[0];
        onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) objArr[1];
        onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[5]).booleanValue();
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        tdsAnimateTickerV1Layout.onNavigationEvent = onextracallbackwithresult;
        tdsAnimateTickerV1Layout.writeTypedObject = onwarmupcompleted;
        tdsAnimateTickerV1Layout.IAuthTabCallbackStubProxy = iIntValue;
        tdsAnimateTickerV1Layout.extraCallback = zBooleanValue;
        Sequence<View> sequenceOnTransact = tdsAnimateTickerV1Layout.onTransact();
        if (ensureCausesIsMutable.extraCallbackWithResult(sequenceOnTransact) >= 2) {
            int i3 = onMessageChannelReady;
            int i4 = i3 + 113;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
            if (tdsAnimateTickerV1Layout.onTransact) {
                int i6 = i3 + 45;
                ICustomTabsCallback = i6 % 128;
                int i7 = i6 % 2;
                if (zBooleanValue2) {
                    tdsAnimateTickerV1Layout.asBinder();
                    if (zBooleanValue) {
                        int i8 = onMessageChannelReady + 37;
                        ICustomTabsCallback = i8 % 128;
                        if (i8 % 2 != 0) {
                            int i9 = 5 / 3;
                        }
                        i = 0;
                    } else {
                        int i10 = ICustomTabsCallback + 115;
                        onMessageChannelReady = i10 % 128;
                        int i11 = i10 % 2;
                        i = -1;
                    }
                    tdsAnimateTickerV1Layout.onExtraCallbackWithResult = i;
                    tdsAnimateTickerV1Layout.asInterface = false;
                    tdsAnimateTickerV1Layout.onWarmupCompleted(sequenceOnTransact, zBooleanValue, iIntValue);
                }
            }
        }
        int i12 = ICustomTabsCallback + 49;
        onMessageChannelReady = i12 % 128;
        if (i12 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private final void onWarmupCompleted(Sequence<? extends View> sequence, boolean z, int i) {
        ArrayList arrayList;
        Iterator<? extends View> itIAuthTabCallback;
        runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted;
        int i2 = i;
        int i3 = 2 % 2;
        requestLayout();
        this.getInterfaceDescriptor.clear();
        this.access000.clear();
        Iterator itIAuthTabCallback2 = EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback(this).IAuthTabCallback();
        while (itIAuthTabCallback2.hasNext()) {
            View view = (View) itIAuthTabCallback2.next();
            this.getInterfaceDescriptor.add(view.getBackground());
            this.access000.add(new Pair<>(Integer.valueOf(view.getMeasuredWidth()), Integer.valueOf(view.getMeasuredHeight())));
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator<? extends View> itIAuthTabCallback3 = sequence.IAuthTabCallback();
        View view2 = null;
        int i4 = 0;
        while (itIAuthTabCallback3.hasNext()) {
            int i5 = ICustomTabsCallback + 59;
            onMessageChannelReady = i5 % 128;
            int i6 = i5 % 2;
            View next = itIAuthTabCallback3.next();
            if (i4 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            View view3 = next;
            if (!z || i4 != 0) {
                if (view2 != null) {
                    runonuithreaddelayedOnWarmupCompleted = RallysKt.onWarmupCompleted((View) null, pxToDp.IAuthTabCallback.onExtraCallback, CollectionsKt__CollectionsKt.listOf((Object[]) new Rally[]{asBinder(view3), access100(view2)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, Boolean.TRUE, 0, 0L, false, 3833, (Object) null);
                    int i7 = ICustomTabsCallback + 91;
                    onMessageChannelReady = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 2 % 5;
                    }
                } else {
                    runonuithreaddelayedOnWarmupCompleted = RallysKt.onWarmupCompleted((View) null, pxToDp.IAuthTabCallback.onExtraCallback, CollectionsKt__CollectionsJVMKt.listOf(asBinder(view3)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, Boolean.TRUE, 0, 0L, false, 3833, (Object) null);
                }
                arrayList2.add(runonuithreaddelayedOnWarmupCompleted);
            }
            i4++;
            view2 = view3;
        }
        if (i2 != 1) {
            int i9 = ICustomTabsCallback + 75;
            onMessageChannelReady = i9 % 128;
            if (i9 % 2 == 0) {
                itIAuthTabCallback = sequence.IAuthTabCallback();
                int i10 = 74 / 0;
            } else {
                itIAuthTabCallback = sequence.IAuthTabCallback();
            }
            while (itIAuthTabCallback.hasNext()) {
                int i11 = onMessageChannelReady + 41;
                ICustomTabsCallback = i11 % 128;
                int i12 = i11 % 2;
                View next2 = itIAuthTabCallback.next();
                pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
                Rally rallyAsBinder = asBinder(next2);
                Intrinsics.checkNotNull(view2);
                arrayList3.add(RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt__CollectionsKt.listOf((Object[]) new Rally[]{rallyAsBinder, access100(view2)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, Boolean.TRUE, 0, 0L, false, 3833, (Object) null));
                view2 = next2;
            }
        }
        ArrayList arrayList4 = new ArrayList();
        pxToDp.onWarmupCompleted onwarmupcompleted = pxToDp.onWarmupCompleted.IAuthTabCallback;
        Boolean bool = Boolean.TRUE;
        arrayList4.add(RallysKt.onWarmupCompleted((View) null, onwarmupcompleted, arrayList2, 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, bool, 0, 0L, false, 3833, (Object) null));
        if (arrayList3.isEmpty()) {
            arrayList = arrayList3;
        } else {
            if (i2 > 0) {
                i2--;
            }
            int i13 = i2;
            arrayList = arrayList3;
            arrayList4.add(RallysKt.onWarmupCompleted((View) null, onwarmupcompleted, arrayList3, i13, getExtraParameters.Normal, 0, (Interpolator) null, (Integer) null, bool, 0, 0L, false, 3809, (Object) null));
        }
        onWarmupCompleted(arrayList2, arrayList);
    }

    private final void onWarmupCompleted(List<runOnUiThreadDelayed> list, List<runOnUiThreadDelayed> list2) {
        TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent;
        int i = 2 % 2;
        getPackageType getpackagetype = this.readTypedObject;
        getPackageType getpackagetypeOnExtraCallback = null;
        if (getpackagetype != null) {
            int i2 = onMessageChannelReady + 101;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, null, 1, null);
        }
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this);
        if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult != null && (textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult)) != null) {
            getpackagetypeOnExtraCallback = onLoadStarted.onExtraCallback(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, null, null, new asBinder(list, list2, null), 3, null);
        }
        this.readTypedObject = getpackagetypeOnExtraCallback;
        int i4 = ICustomTabsCallback + 29;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
    }

    static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ List<runOnUiThreadDelayed> $firstTimelines;
        final /* synthetic */ List<runOnUiThreadDelayed> $lastTimeline;
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        int I$4;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asBinder(List<runOnUiThreadDelayed> list, List<runOnUiThreadDelayed> list2, access13800<? super asBinder> access13800Var) {
            super(2, access13800Var);
            this.$firstTimelines = list;
            this.$lastTimeline = list2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asBinder asbinder = TdsAnimateTickerV1Layout.this.new asBinder(this.$firstTimelines, this.$lastTimeline, access13800Var);
            int i2 = onExtraCallbackWithResult + 11;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 45 / 0;
            }
            return asbinder;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 57;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            if (i3 == 0) {
                int i4 = 4 / 0;
            }
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 101;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((asBinder) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 101;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x00b4, code lost:
        
            if (o.formatMsgs.onWarmupCompleted(r3 + r5, r25) == r2) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00c4, code lost:
        
            if (o.formatMsgs.onWarmupCompleted(r3, r25) != r2) goto L26;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Path cross not found for [B:37:0x0119, B:41:0x0124], limit reached: 62 */
        /* JADX WARN: Removed duplicated region for block: B:35:0x010e  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x012c A[PHI: r12 r13
          0x012c: PHI (r12v6 java.lang.Object) = (r12v5 java.lang.Object), (r12v11 java.lang.Object) binds: [B:42:0x012a, B:38:0x011f] A[DONT_GENERATE, DONT_INLINE]
          0x012c: PHI (r13v3 int) = (r13v2 int), (r13v6 int) binds: [B:42:0x012a, B:38:0x011f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0163  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0173  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x01b3  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x01c4  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x021a  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0226  */
        /* JADX WARN: Type inference failed for: r14v10, types: [java.lang.Iterable] */
        /* JADX WARN: Type inference failed for: r3v22, types: [java.lang.Iterable] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int size;
            List<runOnUiThreadDelayed> list;
            TdsAnimateTickerV1Layout tdsAnimateTickerV1Layout;
            List<runOnUiThreadDelayed> list2;
            Iterator it;
            int i;
            int i2;
            Iterator it2;
            List<runOnUiThreadDelayed> list3;
            TdsAnimateTickerV1Layout tdsAnimateTickerV1Layout2;
            List<runOnUiThreadDelayed> list4;
            int i3;
            int i4;
            int i5;
            Object obj2;
            int i6;
            runOnUiThreadDelayed runonuithreaddelayed;
            int i7;
            Object next;
            int i8;
            runOnUiThreadDelayed runonuithreaddelayedIAuthTabCallback;
            boolean z;
            Object obj3;
            long jOnWarmupCompleted;
            int i9 = 2;
            int i10 = 2 % 2;
            int i11 = onNavigationEvent + 53;
            onExtraCallbackWithResult = i11 % 128;
            if (i11 % 2 != 0) {
                access14100.onExtraCallback();
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i12 = this.label;
            int i13 = 1;
            boolean z2 = false;
            if (i12 != 0) {
                if (i12 != 1) {
                    int i14 = onNavigationEvent + 125;
                    int i15 = i14 % 128;
                    onExtraCallbackWithResult = i15;
                    if (i14 % 2 == 0 ? i12 != 2 : i12 != 3) {
                        if (i12 == 3) {
                            int i16 = this.I$4;
                            i4 = this.I$3;
                            int i17 = this.I$2;
                            i2 = this.I$1;
                            int i18 = this.I$0;
                            runOnUiThreadDelayed runonuithreaddelayed2 = (runOnUiThreadDelayed) this.L$5;
                            Object obj5 = this.L$4;
                            it2 = (Iterator) this.L$3;
                            List<runOnUiThreadDelayed> list5 = (List) this.L$2;
                            TdsAnimateTickerV1Layout tdsAnimateTickerV1Layout3 = (TdsAnimateTickerV1Layout) this.L$1;
                            ?? r3 = (Iterable) this.L$0;
                            ResultKt.onNavigationEvent(obj);
                            i7 = i16;
                            i5 = 1;
                            i6 = i17;
                            i3 = i18;
                            list4 = list5;
                            obj2 = obj5;
                            list3 = r3;
                            runonuithreaddelayed = runonuithreaddelayed2;
                            tdsAnimateTickerV1Layout2 = tdsAnimateTickerV1Layout3;
                            if (i4 != i3 - 1) {
                            }
                        } else {
                            if (i12 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            int i19 = i15 + 85;
                            onNavigationEvent = i19 % 128;
                            int i20 = i19 % 2;
                            i6 = this.I$2;
                            int i21 = this.I$1;
                            i3 = this.I$0;
                            Iterator it3 = (Iterator) this.L$3;
                            list4 = (List) this.L$2;
                            tdsAnimateTickerV1Layout2 = (TdsAnimateTickerV1Layout) this.L$1;
                            ?? r14 = (Iterable) this.L$0;
                            ResultKt.onNavigationEvent(obj);
                            i5 = 1;
                            List<runOnUiThreadDelayed> list6 = r14;
                            size = i3;
                            list2 = list4;
                            tdsAnimateTickerV1Layout = tdsAnimateTickerV1Layout2;
                            i = i6;
                            list = list6;
                            Iterator it4 = it3;
                            i2 = i21;
                            it = it4;
                            i13 = i5;
                            i9 = 2;
                            z2 = false;
                            if (it.hasNext()) {
                                int i22 = onNavigationEvent + 105;
                                onExtraCallbackWithResult = i22 % 128;
                                if (i22 % i9 == 0) {
                                    next = it.next();
                                    i8 = i + 1;
                                    if (i < 0) {
                                    }
                                    Object obj6 = next;
                                    runOnUiThreadDelayed runonuithreaddelayed3 = (runOnUiThreadDelayed) obj6;
                                    TdsAnimateTickerV1Layout.onWarmupCompleted(1791708688, new Object[]{tdsAnimateTickerV1Layout, Integer.valueOf(i8)}, -1791708688, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback());
                                    runonuithreaddelayedIAuthTabCallback = TdsAnimateTickerV1Layout.IAuthTabCallback(tdsAnimateTickerV1Layout);
                                    if (runonuithreaddelayedIAuthTabCallback == null) {
                                    }
                                    TdsAnimateTickerV1Layout.onExtraCallback(tdsAnimateTickerV1Layout, isFireOS.onExtraCallbackWithResult(runonuithreaddelayed3, z, i5, obj3));
                                    jOnWarmupCompleted = tdsAnimateTickerV1Layout.onWarmupCompleted();
                                    this.L$0 = access15400.onNavigationEvent(list);
                                    this.L$1 = tdsAnimateTickerV1Layout;
                                    this.L$2 = list2;
                                    this.L$3 = it;
                                    this.L$4 = access15400.onNavigationEvent(obj6);
                                    this.L$5 = access15400.onNavigationEvent(runonuithreaddelayed3);
                                    this.I$0 = size;
                                    this.I$1 = i2;
                                    this.I$2 = i8;
                                    this.I$3 = i;
                                    this.I$4 = 0;
                                    this.label = 3;
                                    objOnExtraCallback = objOnExtraCallback;
                                    if (formatMsgs.onWarmupCompleted(jOnWarmupCompleted, this) != objOnExtraCallback) {
                                    }
                                    return objOnExtraCallback;
                                }
                                next = it.next();
                                i8 = i % 0;
                                if (i < 0) {
                                    int i23 = onExtraCallbackWithResult + 51;
                                    onNavigationEvent = i23 % 128;
                                    int i24 = i23 % i9;
                                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                                }
                                Object obj62 = next;
                                runOnUiThreadDelayed runonuithreaddelayed32 = (runOnUiThreadDelayed) obj62;
                                TdsAnimateTickerV1Layout.onWarmupCompleted(1791708688, new Object[]{tdsAnimateTickerV1Layout, Integer.valueOf(i8)}, -1791708688, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback());
                                runonuithreaddelayedIAuthTabCallback = TdsAnimateTickerV1Layout.IAuthTabCallback(tdsAnimateTickerV1Layout);
                                if (runonuithreaddelayedIAuthTabCallback == null) {
                                    int i25 = onExtraCallbackWithResult + 75;
                                    onNavigationEvent = i25 % 128;
                                    int i26 = i25 % i9;
                                    runonuithreaddelayedIAuthTabCallback.onNavigationEvent();
                                    obj3 = null;
                                    i5 = 1;
                                    z = false;
                                } else {
                                    z = z2;
                                    i5 = i13;
                                    obj3 = null;
                                }
                                TdsAnimateTickerV1Layout.onExtraCallback(tdsAnimateTickerV1Layout, isFireOS.onExtraCallbackWithResult(runonuithreaddelayed32, z, i5, obj3));
                                jOnWarmupCompleted = tdsAnimateTickerV1Layout.onWarmupCompleted();
                                this.L$0 = access15400.onNavigationEvent(list);
                                this.L$1 = tdsAnimateTickerV1Layout;
                                this.L$2 = list2;
                                this.L$3 = it;
                                this.L$4 = access15400.onNavigationEvent(obj62);
                                this.L$5 = access15400.onNavigationEvent(runonuithreaddelayed32);
                                this.I$0 = size;
                                this.I$1 = i2;
                                this.I$2 = i8;
                                this.I$3 = i;
                                this.I$4 = 0;
                                this.label = 3;
                                objOnExtraCallback = objOnExtraCallback;
                                if (formatMsgs.onWarmupCompleted(jOnWarmupCompleted, this) != objOnExtraCallback) {
                                    it2 = it;
                                    i4 = i;
                                    i7 = 0;
                                    i3 = size;
                                    runonuithreaddelayed = runonuithreaddelayed32;
                                    list4 = list2;
                                    list3 = list;
                                    i6 = i8;
                                    tdsAnimateTickerV1Layout2 = tdsAnimateTickerV1Layout;
                                    obj2 = obj62;
                                    if (i4 != i3 - 1) {
                                        this.L$0 = access15400.onNavigationEvent(list3);
                                        this.L$1 = tdsAnimateTickerV1Layout2;
                                        this.L$2 = list4;
                                        this.L$3 = it2;
                                        this.L$4 = access15400.onNavigationEvent(obj2);
                                        this.L$5 = access15400.onNavigationEvent(runonuithreaddelayed);
                                        this.I$0 = i3;
                                        this.I$1 = i2;
                                        this.I$2 = i6;
                                        this.I$3 = i4;
                                        this.I$4 = i7;
                                        this.label = 4;
                                        if (TdsAnimateTickerV1Layout.onWarmupCompleted(1682207010, new Object[]{tdsAnimateTickerV1Layout2, list4, this}, -1682207006, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback()) != objOnExtraCallback) {
                                            i21 = i2;
                                            it3 = it2;
                                            list6 = list3;
                                            size = i3;
                                            list2 = list4;
                                            tdsAnimateTickerV1Layout = tdsAnimateTickerV1Layout2;
                                            i = i6;
                                            list = list6;
                                            Iterator it42 = it3;
                                            i2 = i21;
                                            it = it42;
                                            i13 = i5;
                                            i9 = 2;
                                            z2 = false;
                                            if (it.hasNext()) {
                                                Unit unit = Unit.INSTANCE;
                                                int i27 = onNavigationEvent + Imgproc.COLOR_YUV2RGB_YVYU;
                                                onExtraCallbackWithResult = i27 % 128;
                                                int i28 = i27 % 2;
                                                return unit;
                                            }
                                        }
                                    } else {
                                        size = i3;
                                        list2 = list4;
                                        tdsAnimateTickerV1Layout = tdsAnimateTickerV1Layout2;
                                        it = it2;
                                        i = i6;
                                        list = list3;
                                        i13 = i5;
                                        i9 = 2;
                                        z2 = false;
                                        if (it.hasNext()) {
                                        }
                                    }
                                }
                                return objOnExtraCallback;
                            }
                        }
                    }
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                if (TdsAnimateTickerV1Layout.onExtraCallback(TdsAnimateTickerV1Layout.this)) {
                    long jOnExtraCallbackWithResult = TdsAnimateTickerV1Layout.this.onExtraCallbackWithResult();
                    long jOnWarmupCompleted2 = TdsAnimateTickerV1Layout.this.onWarmupCompleted();
                    this.label = 1;
                } else {
                    long jOnExtraCallbackWithResult2 = TdsAnimateTickerV1Layout.this.onExtraCallbackWithResult();
                    this.label = 2;
                }
                if (it.hasNext()) {
                }
            }
            size = this.$firstTimelines.size();
            TdsAnimateTickerV1Layout.onExtraCallback(TdsAnimateTickerV1Layout.this, 0);
            TdsAnimateTickerV1Layout.onExtraCallback(TdsAnimateTickerV1Layout.this, TdsAnimateTickerV1Layout.onWarmupCompleted(TdsAnimateTickerV1Layout.this) + 1);
            runOnUiThreadDelayed runonuithreaddelayedIAuthTabCallback2 = TdsAnimateTickerV1Layout.IAuthTabCallback(TdsAnimateTickerV1Layout.this);
            if (runonuithreaddelayedIAuthTabCallback2 != null) {
                int i29 = onExtraCallbackWithResult + 115;
                onNavigationEvent = i29 % 128;
                if (i29 % 2 == 0) {
                    runonuithreaddelayedIAuthTabCallback2.onNavigationEvent();
                    int i30 = 81 / 0;
                } else {
                    runonuithreaddelayedIAuthTabCallback2.onNavigationEvent();
                }
            }
            list = this.$firstTimelines;
            tdsAnimateTickerV1Layout = TdsAnimateTickerV1Layout.this;
            list2 = this.$lastTimeline;
            it = list.iterator();
            i = 0;
            i2 = 0;
            if (it.hasNext()) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x01a2, code lost:
    
        r1 = im.toss.uikit.widget.tooltip.TdsAnimateTickerV1Layout.ICustomTabsCallback + 27;
        r2 = r1 % 128;
        im.toss.uikit.widget.tooltip.TdsAnimateTickerV1Layout.onMessageChannelReady = r2;
        r4 = 2;
        r1 = r1 % 2;
        r2 = r2 + 125;
        im.toss.uikit.widget.tooltip.TdsAnimateTickerV1Layout.ICustomTabsCallback = r2 % 128;
        r2 = r2 % 2;
        r5 = r3;
        r9 = r7;
        r7 = r12;
        r1 = r13;
        r3 = r15;
     */
    /* JADX WARN: Path cross not found for [B:25:0x00cb, B:29:0x00d5], limit reached: 58 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00dd A[PHI: r11 r12
      0x00dd: PHI (r11v5 java.lang.Object) = (r11v4 java.lang.Object), (r11v15 java.lang.Object) binds: [B:30:0x00db, B:26:0x00d0] A[DONT_GENERATE, DONT_INLINE]
      0x00dd: PHI (r12v3 int) = (r12v2 int), (r12v6 int) binds: [B:30:0x00db, B:26:0x00d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x017d -> B:51:0x017f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onNavigationEvent(List<runOnUiThreadDelayed> list, access13800<? super Unit> access13800Var) {
        onNavigationEvent onnavigationevent;
        Iterator it;
        int i;
        int i2;
        Object obj;
        onNavigationEvent onnavigationevent2;
        int i3;
        List<runOnUiThreadDelayed> list2;
        int i4;
        Object obj2;
        List<runOnUiThreadDelayed> list3;
        Object obj3;
        int i5;
        runOnUiThreadDelayed runonuithreaddelayed;
        int i6;
        Object next;
        int i7;
        runOnUiThreadDelayed runonuithreaddelayed2;
        long j;
        int i8 = 2;
        int i9 = 2 % 2;
        int i10 = 1;
        if (!(access13800Var instanceof onNavigationEvent)) {
            onnavigationevent = new onNavigationEvent(access13800Var);
        } else {
            int i11 = ICustomTabsCallback + 41;
            onMessageChannelReady = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = ((onNavigationEvent) access13800Var).label;
                throw null;
            }
            onnavigationevent = (onNavigationEvent) access13800Var;
            int i13 = onnavigationevent.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                int i14 = ICustomTabsCallback + 39;
                onMessageChannelReady = i14 % 128;
                int i15 = i14 % 2;
                onnavigationevent.label = i13 - 2147483648;
            }
        }
        Object obj4 = onnavigationevent.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i16 = onnavigationevent.label;
        if (i16 != 0) {
            int i17 = ICustomTabsCallback + 31;
            onMessageChannelReady = i17 % 128;
            int i18 = i17 % 2;
            if (i16 == 1) {
                int i19 = onnavigationevent.I$4;
                i = onnavigationevent.I$3;
                int i20 = onnavigationevent.I$2;
                int i21 = onnavigationevent.I$1;
                int i22 = onnavigationevent.I$0;
                runOnUiThreadDelayed runonuithreaddelayed3 = (runOnUiThreadDelayed) onnavigationevent.L$4;
                obj2 = onnavigationevent.L$3;
                Iterator it2 = (Iterator) onnavigationevent.L$2;
                Object obj5 = (Iterable) onnavigationevent.L$1;
                List<runOnUiThreadDelayed> list4 = (List) onnavigationevent.L$0;
                ResultKt.onNavigationEvent(obj4);
                i6 = i19;
                i5 = i20;
                i2 = i21;
                obj3 = obj5;
                runonuithreaddelayed = runonuithreaddelayed3;
                list3 = list4;
                it = it2;
                i4 = i22;
                if (i != i4 - 1) {
                }
                i8 = i;
                i10 = 1;
                if (!it.hasNext()) {
                }
            } else {
                if (i16 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i5 = onnavigationevent.I$2;
                int i23 = onnavigationevent.I$1;
                int i24 = onnavigationevent.I$0;
                Iterator it3 = (Iterator) onnavigationevent.L$2;
                obj3 = (Iterable) onnavigationevent.L$1;
                list3 = (List) onnavigationevent.L$0;
                ResultKt.onNavigationEvent(obj4);
                it = it3;
                onnavigationevent2 = onnavigationevent;
                i3 = i24;
                list2 = list3;
                int i25 = 2;
                i2 = i23;
                i = i5;
                obj = obj3;
                i8 = i25;
                i10 = 1;
                if (!it.hasNext()) {
                    int i26 = onMessageChannelReady + Imgproc.COLOR_YUV2RGBA_YVYU;
                    ICustomTabsCallback = i26 % 128;
                    if (i26 % i8 == 0) {
                        next = it.next();
                        i7 = i + 1;
                        if (i < 0) {
                        }
                        obj2 = next;
                        runOnUiThreadDelayed runonuithreaddelayed4 = (runOnUiThreadDelayed) obj2;
                        this.onExtraCallbackWithResult = i7;
                        runonuithreaddelayed2 = this.extraCallbackWithResult;
                        if (runonuithreaddelayed2 != null) {
                        }
                        this.extraCallbackWithResult = isFireOS.onExtraCallbackWithResult(runonuithreaddelayed4, false, i10, (Object) null);
                        i4 = i3;
                        j = this.IAuthTabCallbackDefault;
                        onnavigationevent2.L$0 = list2;
                        onnavigationevent2.L$1 = access15400.onNavigationEvent(obj);
                        onnavigationevent2.L$2 = it;
                        onnavigationevent2.L$3 = access15400.onNavigationEvent(obj2);
                        onnavigationevent2.L$4 = access15400.onNavigationEvent(runonuithreaddelayed4);
                        onnavigationevent2.I$0 = i4;
                        onnavigationevent2.I$1 = i2;
                        onnavigationevent2.I$2 = i7;
                        onnavigationevent2.I$3 = i;
                        onnavigationevent2.I$4 = 0;
                        onnavigationevent2.label = i10;
                        if (formatMsgs.onWarmupCompleted(j, onnavigationevent2) != objOnExtraCallback) {
                        }
                        return objOnExtraCallback;
                    }
                    next = it.next();
                    i7 = i;
                    if (i < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    obj2 = next;
                    runOnUiThreadDelayed runonuithreaddelayed42 = (runOnUiThreadDelayed) obj2;
                    this.onExtraCallbackWithResult = i7;
                    runonuithreaddelayed2 = this.extraCallbackWithResult;
                    if (runonuithreaddelayed2 != null) {
                        runonuithreaddelayed2.IAuthTabCallback();
                    }
                    this.extraCallbackWithResult = isFireOS.onExtraCallbackWithResult(runonuithreaddelayed42, false, i10, (Object) null);
                    i4 = i3;
                    j = this.IAuthTabCallbackDefault;
                    onnavigationevent2.L$0 = list2;
                    onnavigationevent2.L$1 = access15400.onNavigationEvent(obj);
                    onnavigationevent2.L$2 = it;
                    onnavigationevent2.L$3 = access15400.onNavigationEvent(obj2);
                    onnavigationevent2.L$4 = access15400.onNavigationEvent(runonuithreaddelayed42);
                    onnavigationevent2.I$0 = i4;
                    onnavigationevent2.I$1 = i2;
                    onnavigationevent2.I$2 = i7;
                    onnavigationevent2.I$3 = i;
                    onnavigationevent2.I$4 = 0;
                    onnavigationevent2.label = i10;
                    if (formatMsgs.onWarmupCompleted(j, onnavigationevent2) != objOnExtraCallback) {
                        int i27 = onMessageChannelReady + 73;
                        ICustomTabsCallback = i27 % 128;
                        int i28 = i27 % 2;
                        onnavigationevent = onnavigationevent2;
                        runonuithreaddelayed = runonuithreaddelayed42;
                        list3 = list2;
                        i6 = 0;
                        int i29 = i7;
                        obj3 = obj;
                        i5 = i29;
                        if (i != i4 - 1) {
                            int i30 = ICustomTabsCallback + 19;
                            onMessageChannelReady = i30 % 128;
                            if (i30 % 2 == 0) {
                                Object obj6 = null;
                                obj6.hashCode();
                                throw null;
                            }
                            int i31 = this.IAuthTabCallbackStubProxy;
                            if (i31 == -1 || this.IAuthTabCallback_Parcel < i31) {
                                onnavigationevent.L$0 = list3;
                                onnavigationevent.L$1 = access15400.onNavigationEvent(obj3);
                                onnavigationevent.L$2 = it;
                                onnavigationevent.L$3 = access15400.onNavigationEvent(obj2);
                                onnavigationevent.L$4 = access15400.onNavigationEvent(runonuithreaddelayed);
                                onnavigationevent.I$0 = i4;
                                onnavigationevent.I$1 = i2;
                                onnavigationevent.I$2 = i5;
                                onnavigationevent.I$3 = i;
                                onnavigationevent.I$4 = i6;
                                onnavigationevent.label = 2;
                                if (onNavigationEvent(list3, onnavigationevent) != objOnExtraCallback) {
                                    i23 = i2;
                                    i24 = i4;
                                    onnavigationevent2 = onnavigationevent;
                                    i3 = i24;
                                    list2 = list3;
                                    int i252 = 2;
                                    i2 = i23;
                                    i = i5;
                                    obj = obj3;
                                }
                            } else {
                                int i32 = ICustomTabsCallback + 27;
                                int i33 = i32 % 128;
                                onMessageChannelReady = i33;
                                i252 = 2;
                                int i34 = i32 % 2;
                                int i35 = i33 + 125;
                                ICustomTabsCallback = i35 % 128;
                                int i36 = i35 % 2;
                                onnavigationevent2 = onnavigationevent;
                                i = i5;
                                obj = obj3;
                                list2 = list3;
                                i3 = i4;
                            }
                        }
                        i8 = i252;
                        i10 = 1;
                        if (!it.hasNext()) {
                            return Unit.INSTANCE;
                        }
                    }
                    return objOnExtraCallback;
                }
            }
        } else {
            ResultKt.onNavigationEvent(obj4);
            this.IAuthTabCallback_Parcel++;
            int size = list.size();
            List<runOnUiThreadDelayed> list5 = list;
            it = list5.iterator();
            i = 0;
            i2 = 0;
            obj = list5;
            onnavigationevent2 = onnavigationevent;
            i3 = size;
            list2 = list;
            if (!it.hasNext()) {
            }
        }
    }

    public final void onExtraCallback() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 33;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        getPackageType getpackagetype = this.readTypedObject;
        if (getpackagetype != null) {
            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, null, 1, null);
        }
        this.readTypedObject = null;
        runOnUiThreadDelayed runonuithreaddelayed = this.extraCallbackWithResult;
        if (runonuithreaddelayed != null) {
            runonuithreaddelayed.onNavigationEvent();
            int i4 = onMessageChannelReady + 101;
            ICustomTabsCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 / 3;
            }
        }
        this.asInterface = true;
        asBinder();
        this.onExtraCallbackWithResult = ensureCausesIsMutable.extraCallbackWithResult(onTransact()) - 1;
        requestLayout();
    }

    private final void asBinder() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 103;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        Iterator itIAuthTabCallback = EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback(this).IAuthTabCallback();
        while (itIAuthTabCallback.hasNext()) {
            Object next = itIAuthTabCallback.next();
            if (i4 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            View view = (View) next;
            view.setX(view.getLeft());
            view.setY(view.getTop());
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setRotation(0.0f);
            view.setRotationX(0.0f);
            view.setRotationY(0.0f);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            view.setTranslationZ(0.0f);
            if (this.getInterfaceDescriptor.size() > i4) {
                int i5 = ICustomTabsCallback + 37;
                onMessageChannelReady = i5 % 128;
                int i6 = i5 % 2;
                view.setBackground((Drawable) CollectionsKt___CollectionsKt.getOrNull(this.getInterfaceDescriptor, i4));
            }
            if (this.access000.size() > i4) {
                int i7 = onMessageChannelReady + 107;
                ICustomTabsCallback = i7 % 128;
                int i8 = i7 % 2;
                if (CollectionsKt___CollectionsKt.getOrNull(this.access000, i4) != null) {
                    int i9 = ICustomTabsCallback + 23;
                    onMessageChannelReady = i9 % 128;
                    int i10 = i9 % 2;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    layoutParams.width = this.access000.get(i4).getFirst().intValue();
                    layoutParams.height = this.access000.get(i4).getSecond().intValue();
                }
            }
            i4++;
            int i11 = ICustomTabsCallback + 43;
            onMessageChannelReady = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 3 / 3;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IAuthTabCallbackStub() {
        int i = 2 % 2;
        Iterator<View> itIAuthTabCallback = onTransact().IAuthTabCallback();
        int i2 = 0;
        while (itIAuthTabCallback.hasNext()) {
            View next = itIAuthTabCallback.next();
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            View view = next;
            if (!this.asInterface) {
                int i3 = ICustomTabsCallback + 45;
                onMessageChannelReady = i3 % 128;
                int i4 = i3 % 2;
                if (this.extraCallback) {
                    if (i2 == this.onExtraCallbackWithResult) {
                        int i5 = onMessageChannelReady + 9;
                        ICustomTabsCallback = i5 % 128;
                        int i6 = i5 % 2;
                        view.setAlpha(1.0f);
                    } else {
                        view.setAlpha(0.0f);
                    }
                }
            }
            i2++;
        }
    }

    private static final boolean access000(View view) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 31;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            if (view.getVisibility() != 39) {
                return true;
            }
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            if (view.getVisibility() != 8) {
                return true;
            }
        }
        int i3 = onMessageChannelReady + 51;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 97 / 0;
        }
        return false;
    }

    private final Sequence<View> onTransact() {
        int i = 2 % 2;
        Sequence<View> sequenceAccess100 = ensureCausesIsMutable.access100(EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback(this), new Function1() { // from class: im.toss.uikit.widget.tooltip.TdsAnimateTickerV1Layout$$ExternalSyntheticLambda4
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 43;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Boolean boolValueOf = Boolean.valueOf(TdsAnimateTickerV1Layout.IAuthTabCallback((View) obj));
                int i5 = IAuthTabCallback + 105;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return boolValueOf;
            }
        });
        int i2 = ICustomTabsCallback + 75;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 19 / 0;
        }
        return sequenceAccess100;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        Sequence<View> sequenceOnTransact;
        int i = 2 % 2;
        super.onAttachedToWindow();
        if (this.onTransact) {
            if (this.IAuthTabCallbackStubProxy != -1) {
                onExtraCallback();
                return;
            }
            int i2 = onMessageChannelReady + 123;
            ICustomTabsCallback = i2 % 128;
            if (i2 % 2 != 0) {
                this.asInterface = true;
                this.asBinder = 0L;
                sequenceOnTransact = onTransact();
                if (ensureCausesIsMutable.extraCallbackWithResult(sequenceOnTransact) < 2) {
                    return;
                }
            } else {
                this.asInterface = false;
                this.asBinder = 0L;
                sequenceOnTransact = onTransact();
                if (ensureCausesIsMutable.extraCallbackWithResult(sequenceOnTransact) < 2) {
                    return;
                }
            }
            runOnUiThreadDelayed runonuithreaddelayed = this.extraCallbackWithResult;
            if (runonuithreaddelayed != null) {
                int i3 = ICustomTabsCallback + 59;
                onMessageChannelReady = i3 % 128;
                int i4 = i3 % 2;
                runonuithreaddelayed.onNavigationEvent();
                int i5 = ICustomTabsCallback + 91;
                onMessageChannelReady = i5 % 128;
                int i6 = i5 % 2;
            }
            onWarmupCompleted(sequenceOnTransact, this.extraCallback, this.IAuthTabCallbackStubProxy);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        int i = 2 % 2;
        if (this.extraCallbackWithResult != null) {
            int i2 = ICustomTabsCallback + 67;
            onMessageChannelReady = i2 % 128;
            if (i2 % 2 == 0) {
                this.onTransact = false;
            } else {
                this.onTransact = true;
            }
        }
        getPackageType getpackagetype = this.readTypedObject;
        if (getpackagetype != null) {
            int i3 = onMessageChannelReady + 23;
            ICustomTabsCallback = i3 % 128;
            if (i3 % 2 != 0) {
                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, null, 0, null);
            } else {
                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, null, 1, null);
            }
        }
        this.readTypedObject = null;
        this.onWarmupCompleted = null;
        this.asInterface = true;
        super.onDetachedFromWindow();
        int i4 = onMessageChannelReady + 81;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0017 A[SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingRight;
        int paddingLeft;
        int i5;
        int paddingTop;
        int i6;
        float right;
        int i7;
        int top;
        float bottom;
        int i8;
        int right2;
        int height;
        int paddingBottom;
        int height2;
        int i9;
        int i10 = 2 % 2;
        int i11 = onMessageChannelReady + 81;
        ICustomTabsCallback = i11 % 128;
        int i12 = i11 % 2;
        IAuthTabCallbackStub();
        Iterator itIAuthTabCallback = EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback(this).IAuthTabCallback();
        while (itIAuthTabCallback.hasNext()) {
            View view = (View) itIAuthTabCallback.next();
            if (view.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "");
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                onExtraCallbackWithResult onextracallbackwithresult = this.onNavigationEvent;
                int[] iArr = onExtraCallback.onExtraCallbackWithResult;
                int i13 = iArr[onextracallbackwithresult.ordinal()];
                if (i13 == 1) {
                    width = ((((getWidth() / 2) - (view.getMeasuredWidth() / 2)) + layoutParams2.leftMargin) - layoutParams2.rightMargin) + getPaddingLeft();
                    paddingRight = getPaddingRight();
                } else if (i13 == 2) {
                    width = (getWidth() - view.getMeasuredWidth()) - layoutParams2.rightMargin;
                    paddingRight = getPaddingRight();
                } else {
                    if (i13 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    paddingLeft = getPaddingLeft() + layoutParams2.leftMargin;
                    onWarmupCompleted onwarmupcompleted = this.writeTypedObject;
                    int[] iArr2 = onExtraCallback.onWarmupCompleted;
                    i5 = iArr2[onwarmupcompleted.ordinal()];
                    if (i5 == 1) {
                        if (i5 == 2) {
                            height = ((((getHeight() / 2) - (view.getMeasuredHeight() / 2)) + layoutParams2.topMargin) - layoutParams2.bottomMargin) + getPaddingTop();
                            paddingBottom = getPaddingBottom();
                        } else {
                            if (i5 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            int i14 = ICustomTabsCallback + 105;
                            onMessageChannelReady = i14 % 128;
                            if (i14 % 2 == 0) {
                                height2 = getHeight() * view.getMeasuredHeight();
                                i9 = layoutParams2.bottomMargin;
                            } else {
                                height2 = getHeight() - view.getMeasuredHeight();
                                i9 = layoutParams2.bottomMargin;
                            }
                            height = height2 - i9;
                            paddingBottom = getPaddingBottom();
                        }
                        paddingTop = height - paddingBottom;
                    } else {
                        paddingTop = getPaddingTop() + layoutParams2.topMargin;
                    }
                    view.layout(paddingLeft, paddingTop, view.getMeasuredWidth() + paddingLeft, view.getMeasuredHeight() + paddingTop);
                    i6 = iArr[this.onNavigationEvent.ordinal()];
                    if (i6 == 1) {
                        if (i6 != 2) {
                            int i15 = ICustomTabsCallback + 25;
                            onMessageChannelReady = i15 % 128;
                            int i16 = i15 % 2;
                            if (i6 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            right2 = view.getLeft();
                        } else {
                            right2 = view.getRight();
                        }
                        right = right2;
                    } else {
                        right = (view.getRight() - view.getLeft()) / 2.0f;
                    }
                    view.setPivotX(right);
                    i7 = iArr2[this.writeTypedObject.ordinal()];
                    if (i7 == 1) {
                        int i17 = ICustomTabsCallback + 37;
                        onMessageChannelReady = i17 % 128;
                        if (i17 % 2 != 0 ? i7 == 2 : i7 == 5) {
                            bottom = (view.getBottom() - view.getTop()) / 2.0f;
                            view.setPivotY(bottom);
                            i8 = onMessageChannelReady + 5;
                            ICustomTabsCallback = i8 % 128;
                            if (i8 % 2 != 0) {
                                int i18 = 2 / 4;
                            }
                        } else {
                            if (i7 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            top = view.getBottom();
                        }
                    } else {
                        top = view.getTop();
                    }
                    bottom = top;
                    view.setPivotY(bottom);
                    i8 = onMessageChannelReady + 5;
                    ICustomTabsCallback = i8 % 128;
                    if (i8 % 2 != 0) {
                    }
                }
                paddingLeft = width - paddingRight;
                onWarmupCompleted onwarmupcompleted2 = this.writeTypedObject;
                int[] iArr22 = onExtraCallback.onWarmupCompleted;
                i5 = iArr22[onwarmupcompleted2.ordinal()];
                if (i5 == 1) {
                }
                view.layout(paddingLeft, paddingTop, view.getMeasuredWidth() + paddingLeft, view.getMeasuredHeight() + paddingTop);
                i6 = iArr[this.onNavigationEvent.ordinal()];
                if (i6 == 1) {
                }
                view.setPivotX(right);
                i7 = iArr22[this.writeTypedObject.ordinal()];
                if (i7 == 1) {
                }
                bottom = top;
                view.setPivotY(bottom);
                i8 = onMessageChannelReady + 5;
                ICustomTabsCallback = i8 % 128;
                if (i8 % 2 != 0) {
                }
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallbackWithResult {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallbackWithResult[] $VALUES;
        public static final onExtraCallback Companion;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        public static final onExtraCallbackWithResult LEFT = new onExtraCallbackWithResult("LEFT", 0);
        public static final onExtraCallbackWithResult CENTER = new onExtraCallbackWithResult("CENTER", 1);
        public static final onExtraCallbackWithResult RIGHT = new onExtraCallbackWithResult("RIGHT", 2);

        private static final /* synthetic */ onExtraCallbackWithResult[] $values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 53;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = LEFT;
            if (i3 != 0) {
                return new onExtraCallbackWithResult[]{onextracallbackwithresult, CENTER, RIGHT};
            }
            onExtraCallbackWithResult[] onextracallbackwithresultArr = {CENTER, onextracallbackwithresult};
            onextracallbackwithresultArr[3] = RIGHT;
            return onextracallbackwithresultArr;
        }

        public static EnumEntries<onExtraCallbackWithResult> getEntries() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 55;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<onExtraCallbackWithResult> enumEntries = $ENTRIES;
            int i5 = i2 + 125;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 41 / 0;
            }
            return enumEntries;
        }

        public static onExtraCallbackWithResult valueOf(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 45;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) Enum.valueOf(onExtraCallbackWithResult.class, str);
            if (i3 != 0) {
                throw null;
            }
            int i4 = onWarmupCompleted + 11;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 40 / 0;
            }
            return onextracallbackwithresult;
        }

        public static onExtraCallbackWithResult[] values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 33;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            onExtraCallbackWithResult[] onextracallbackwithresultArr = (onExtraCallbackWithResult[]) $VALUES.clone();
            int i3 = onWarmupCompleted + 113;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return onextracallbackwithresultArr;
            }
            throw null;
        }

        private onExtraCallbackWithResult(String str, int i) {
        }

        static {
            onExtraCallbackWithResult[] onextracallbackwithresultArr$values = $values();
            $VALUES = onextracallbackwithresultArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackwithresultArr$values);
            Companion = new onExtraCallback(null);
            int i = onExtraCallback + 11;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        public static final class onExtraCallback {
            public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private onExtraCallback() {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onWarmupCompleted {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onWarmupCompleted[] $VALUES;
        public static final onExtraCallbackWithResult Companion;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        public static final onWarmupCompleted TOP = new onWarmupCompleted("TOP", 0);
        public static final onWarmupCompleted CENTER = new onWarmupCompleted("CENTER", 1);
        public static final onWarmupCompleted BOTTOM = new onWarmupCompleted("BOTTOM", 2);

        private static final /* synthetic */ onWarmupCompleted[] $values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 13;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            onWarmupCompleted[] onwarmupcompletedArr = {TOP, CENTER, BOTTOM};
            int i5 = i2 + 57;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return onwarmupcompletedArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static EnumEntries<onWarmupCompleted> getEntries() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 5;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<onWarmupCompleted> enumEntries = $ENTRIES;
            int i5 = i2 + 47;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return enumEntries;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onWarmupCompleted valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 71;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
            if (i3 != 0) {
                return onwarmupcompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onWarmupCompleted[] values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 55;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted[] onwarmupcompletedArr = (onWarmupCompleted[]) $VALUES.clone();
            int i4 = onWarmupCompleted + 123;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 83 / 0;
            }
            return onwarmupcompletedArr;
        }

        private onWarmupCompleted(String str, int i) {
        }

        static {
            onWarmupCompleted[] onwarmupcompletedArr$values = $values();
            $VALUES = onwarmupcompletedArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onwarmupcompletedArr$values);
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new onExtraCallbackWithResult(defaultConstructorMarker);
            int i = IAuthTabCallback + 101;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 == 0) {
                return;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }

        public static final class onExtraCallbackWithResult {
            public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private onExtraCallbackWithResult() {
            }
        }
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    public static /* synthetic */ Rally onExtraCallback(View view) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Rally) onWarmupCompleted(-2146669987, new Object[]{view}, 2146669990, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback);
    }

    public static /* synthetic */ Rally onWarmupCompleted(View view) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Rally) onWarmupCompleted(1850286995, new Object[]{view}, -1850286994, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback);
    }

    public static final /* synthetic */ Object IAuthTabCallback(TdsAnimateTickerV1Layout tdsAnimateTickerV1Layout, List list, access13800 access13800Var) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return onWarmupCompleted(1682207010, new Object[]{tdsAnimateTickerV1Layout, list, access13800Var}, -1682207006, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback);
    }

    public static final /* synthetic */ void onWarmupCompleted(TdsAnimateTickerV1Layout tdsAnimateTickerV1Layout, int i) {
        Object[] objArr = {tdsAnimateTickerV1Layout, Integer.valueOf(i)};
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onWarmupCompleted(1791708688, objArr, -1791708688, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback);
    }

    private final Function1<View, Rally> IAuthTabCallback() {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Function1) onWarmupCompleted(1754275447, new Object[]{this}, -1754275445, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback);
    }

    public final void onWarmupCompleted(@NotNull onExtraCallbackWithResult onextracallbackwithresult, @NotNull onWarmupCompleted onwarmupcompleted, int i, boolean z, boolean z2) {
        Object[] objArr = {this, onextracallbackwithresult, onwarmupcompleted, Integer.valueOf(i), Boolean.valueOf(z), Boolean.valueOf(z2)};
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onWarmupCompleted(2059235313, objArr, -2059235308, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback);
    }
}
