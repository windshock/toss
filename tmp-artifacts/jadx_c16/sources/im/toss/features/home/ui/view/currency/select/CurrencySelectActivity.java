package im.toss.features.home.ui.view.currency.select;

import android.content.Context;
import android.content.Intent;
import android.graphics.ImageFormat;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.activity.ComponentActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.features.home.ui.R;
import im.toss.features.home.ui.view.currency.select.CurrencySelectActivity$;
import im.toss.features.teens.henembox.transaction.HenemSavingBoxTransationDetailActivity$;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.widget.TdsRecyclerView;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.AppxNgRuntimeChecker;
import o.AutoExtension;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.M_;
import o.NativeActionFilter;
import o.RVManifestIProxyManifest;
import o.RightClickGesturesKtonRightClickDown2;
import o.SetDetectableSize;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TimelineExternalSyntheticLambda0;
import o.access13800;
import o.accessgetStartTimeMscp;
import o.enableAccessibilityOrder;
import o.getDataStatusChangedListener;
import o.maybeUpdateAnimatable;
import o.needWaitForSetup;
import o.needWaitForSetup$onExtraCallback;
import o.setRandomHost;
import o.setRequiredVersion;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.util.SmoothScrollLinearLayoutManager;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class CurrencySelectActivity extends Hilt_CurrencySelectActivity<getDataStatusChangedListener, CurrencySelectViewModel, RVManifestIProxyManifest> implements needWaitForSetup$onExtraCallback {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallback Companion;
    public static final int IAuthTabCallbackStub;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access100;
    private static int getInterfaceDescriptor;
    private static long onTransact;
    private final needWaitForSetup IAuthTabCallbackDefault;
    private final Lazy asBinder;
    private final String asInterface;

    static {
        IPostMessageService();
        Companion = new onExtraCallback(null);
        IAuthTabCallbackStub = 8;
        int i = access100 + 83;
        IAuthTabCallback_Parcel = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object onExtraCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) throws Throwable {
        int i7 = ~i3;
        int i8 = ~(i2 | i7);
        int i9 = i | i8;
        int i10 = ~i;
        int i11 = i8 | (~(i7 | i10));
        int i12 = (~(i7 | i)) | (~(i10 | i3));
        int i13 = i3 + i + i5 + (513088896 * i4) + ((-1342203445) * i6);
        int i14 = i13 * i13;
        int i15 = (665020156 * i3) + 661520384 + (1303681286 * i) + ((-638661130) * i9) + (638661130 * i11) + (319330565 * i12) + (984350720 * i5) + ((-771751936) * i4) + (1382285312 * i6) + ((-350355456) * i14);
        int i16 = ((i3 * (-363642324)) - 614971735) + (i * (-363641282)) + (i9 * (-1042)) + (i11 * 1042) + (i12 * 521) + (i5 * (-363641803)) + (i4 * (-2127225984)) + (i6 * (-1080704249)) + (i14 * (-1523187712));
        if (i15 + (i16 * i16 * (-227409920)) != 1) {
            return onWarmupCompleted(objArr);
        }
        CurrencySelectActivity currencySelectActivity = (CurrencySelectActivity) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i17 = 2 % 2;
        int i18 = IAuthTabCallbackStubProxy + 99;
        getInterfaceDescriptor = i18 % 128;
        int i19 = i18 % 2;
        Unit unitOnExtraCallback = onExtraCallback(currencySelectActivity, setDetectableSize);
        int i20 = getInterfaceDescriptor + 11;
        IAuthTabCallbackStubProxy = i20 % 128;
        int i21 = i20 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(CurrencySelectActivity currencySelectActivity, View view) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 67;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(currencySelectActivity, view);
        if (i3 == 0) {
            int i4 = 40 / 0;
        }
        int i5 = IAuthTabCallbackStubProxy + 75;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(setRequiredVersion setrequiredversion, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 31;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(setrequiredversion, setDetectableSize);
        int i4 = IAuthTabCallbackStubProxy + 15;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 66 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 101;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return 1244045L;
        }
        throw null;
    }

    public static final /* synthetic */ needWaitForSetup onNavigationEvent(CurrencySelectActivity currencySelectActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 59;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        needWaitForSetup needwaitforsetup = currencySelectActivity.IAuthTabCallbackDefault;
        int i5 = i2 + 61;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            return needwaitforsetup;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        CurrencySelectActivity currencySelectActivity = (CurrencySelectActivity) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 41;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        getDataStatusChangedListener getdatastatuschangedlistenerUpdateVisuals = currencySelectActivity.updateVisuals();
        int i4 = getInterfaceDescriptor + 1;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return getdatastatuschangedlistenerUpdateVisuals;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ NativeActionFilter IPostMessageServiceStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 111;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent();
        }
        onNavigationEvent();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* renamed from: im.toss.features.home.ui.view.currency.select.CurrencySelectActivity$3, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements Function1<LayoutInflater, getDataStatusChangedListener> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        public static final AnonymousClass3 onWarmupCompleted = new AnonymousClass3();

        static {
            int i = IAuthTabCallback + 87;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        AnonymousClass3() {
            super(1, getDataStatusChangedListener.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lim/toss/features/home/ui/databinding/HomeActivityCurrencySelectBinding;", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 19;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            getDataStatusChangedListener getdatastatuschangedlistenerOnExtraCallbackWithResult = onExtraCallbackWithResult((LayoutInflater) obj);
            int i4 = onNavigationEvent + 95;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return getdatastatuschangedlistenerOnExtraCallbackWithResult;
        }

        public final getDataStatusChangedListener onExtraCallbackWithResult(LayoutInflater layoutInflater) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 51;
            onExtraCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(layoutInflater, "");
                getDataStatusChangedListener.onWarmupCompleted(layoutInflater);
                throw null;
            }
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            getDataStatusChangedListener getdatastatuschangedlistenerOnWarmupCompleted = getDataStatusChangedListener.onWarmupCompleted(layoutInflater);
            int i3 = onExtraCallback + 33;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return getdatastatuschangedlistenerOnWarmupCompleted;
            }
            obj.hashCode();
            throw null;
        }
    }

    public CurrencySelectActivity() {
        super(AnonymousClass3.onWarmupCompleted);
        this.asInterface = "home_currency_select";
        this.asBinder = new RightClickGesturesKtonRightClickDown2(Reflection.getOrCreateKotlinClass(CurrencySelectViewModel.class), new IAuthTabCallbackDefault(this), new onExtraCallbackWithResult(this), new asBinder(null, this));
        this.IAuthTabCallbackDefault = new needWaitForSetup(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String onVerticalScrollEvent() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 57;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullExpressionValue(getString(R.string.home_ui_currency_select_accessibility_screen_name), "");
            throw null;
        }
        String string = getString(R.string.home_ui_currency_select_accessibility_screen_name);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public String ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 17;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        String str = this.asInterface;
        int i5 = i2 + 123;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    protected CurrencySelectViewModel onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 3;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.asBinder.getValue();
        if (i3 == 0) {
            return (CurrencySelectViewModel) value;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 47;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout constraintLayoutIAuthTabCallback = updateVisuals().IAuthTabCallback();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutIAuthTabCallback, "");
        AutoExtension.onExtraCallback(constraintLayoutIAuthTabCallback, validateRelationship(), updateVisuals().onExtraCallback, false, (List) null, 8, (Object) null);
        int i4 = getInterfaceDescriptor + 15;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 92 / 0;
        }
    }

    @Override // im.toss.features.home.ui.view.currency.select.Hilt_CurrencySelectActivity
    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 57;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            super.onCreate(bundle);
            IEngagementSignalsCallbackStubProxy();
            IPostMessageServiceDefault();
            int i3 = 10 / 0;
        } else {
            super.onCreate(bundle);
            IEngagementSignalsCallbackStubProxy();
            IPostMessageServiceDefault();
        }
        int i4 = IAuthTabCallbackStubProxy + 69;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static void d(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onTransact ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $10 + 27;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $11 + 109;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onTransact)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 45813), 84 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), View.getDefaultSize(0, 0) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 14185), 19 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 8809 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    public static final class onWarmupCompleted extends RecyclerView.OnScrollListener {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        onWarmupCompleted() {
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(recyclerView, "");
            if (i == 1) {
                int i3 = onNavigationEvent + 47;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    enableAccessibilityOrder.onExtraCallbackWithResult.onExtraCallback(CurrencySelectActivity.this);
                    throw null;
                }
                if (enableAccessibilityOrder.onExtraCallbackWithResult.onExtraCallback(CurrencySelectActivity.this)) {
                    M_.onExtraCallback.onExtraCallback(((getDataStatusChangedListener) CurrencySelectActivity.onExtraCallback(889377016, new Object[]{CurrencySelectActivity.this}, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -889377016, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback())).onWarmupCompleted.IAuthTabCallback());
                    int i4 = onWarmupCompleted + 89;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                }
            }
        }
    }

    public static final class onExtraCallbackWithResult implements Function0<ViewModelProvider.onWarmupCompleted> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ ComponentActivity onWarmupCompleted;

        public onExtraCallbackWithResult(ComponentActivity componentActivity) {
            this.onWarmupCompleted = componentActivity;
        }

        public final ViewModelProvider.onWarmupCompleted IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 21;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = this.onWarmupCompleted.getDefaultViewModelProviderFactory();
            int i4 = IAuthTabCallback + 111;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 70 / 0;
            }
            return defaultViewModelProviderFactory;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 29;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            ViewModelProvider.onWarmupCompleted onwarmupcompletedIAuthTabCallback = IAuthTabCallback();
            int i4 = IAuthTabCallback + 117;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompletedIAuthTabCallback;
        }
    }

    public static final class IAuthTabCallbackDefault implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ ComponentActivity IAuthTabCallback;

        public IAuthTabCallbackDefault(ComponentActivity componentActivity) {
            this.IAuthTabCallback = componentActivity;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 99;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = this.IAuthTabCallback.getViewModelStore();
            int i4 = onExtraCallback + 5;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return viewModelStore;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 15;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 androidTextContextMenuToolbarProviderExternalSyntheticLambda1IAuthTabCallback = IAuthTabCallback();
            int i4 = onExtraCallback + 123;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return androidTextContextMenuToolbarProviderExternalSyntheticLambda1IAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class asBinder implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ ComponentActivity onExtraCallback;
        final /* synthetic */ Function0 onNavigationEvent;

        public asBinder(Function0 function0, ComponentActivity componentActivity) {
            this.onNavigationEvent = function0;
            this.onExtraCallback = componentActivity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 17;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                onExtraCallback();
                throw null;
            }
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnExtraCallback = onExtraCallback();
            int i3 = onExtraCallbackWithResult + 37;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnExtraCallback;
        }

        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 onExtraCallback() {
            int i = 2 % 2;
            Function0 function0 = this.onNavigationEvent;
            if (function0 != null) {
                int i2 = onWarmupCompleted + 33;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke();
                if (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 != null) {
                    int i3 = onWarmupCompleted + 5;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
                }
            }
            return this.onExtraCallback.getDefaultViewModelCreationExtras();
        }
    }

    private static final Unit onExtraCallback(CurrencySelectActivity currencySelectActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 107;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        d(new char[]{2943, 10402, 30137, 2844, 11205, 38815, 2907, 5743, 63034, 38052, 3690, 4420}, TextUtils.indexOf("", "", 0), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), currencySelectActivity.onNavigationEvent().onUnminimized().IAuthTabCallback());
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 109;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void onWarmupCompleted(CurrencySelectActivity currencySelectActivity, View view) {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1244433L, false, (String) null, (Map) null, new CurrencySelectActivity$.ExternalSyntheticLambda1(currencySelectActivity), 14, (Object) null);
        currencySelectActivity.onNavigationEvent().ICustomTabsCallbackStub();
        int i2 = IAuthTabCallbackStubProxy + 5;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public static final class onNavigationEvent extends accessgetStartTimeMscp {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        onNavigationEvent() {
        }

        public void afterTextChanged(Editable editable) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 89;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                super.afterTextChanged(editable);
                CurrencySelectActivity.this.onNavigationEvent().onActivityResized().onWarmupCompleted(String.valueOf(editable));
            } else {
                super.afterTextChanged(editable);
                CurrencySelectActivity.this.onNavigationEvent().onActivityResized().onWarmupCompleted(String.valueOf(editable));
                throw null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IEngagementSignalsCallbackStubProxy() {
        int i = 2 % 2;
        TdsRecyclerView tdsRecyclerView = updateVisuals().IAuthTabCallback;
        tdsRecyclerView.setVerticalFadingEdgeEnabled(true);
        DisplayMetrics displayMetrics = tdsRecyclerView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        tdsRecyclerView.setFadingEdgeLength(varyMatches.onNavigationEvent(34, displayMetrics));
        tdsRecyclerView.setFadingEdgeType(3);
        tdsRecyclerView.setLayoutManager(new SmoothScrollLinearLayoutManager(this, 0.0f, (Function1) null, 6, (DefaultConstructorMarker) null));
        tdsRecyclerView.setAdapter(this.IAuthTabCallbackDefault);
        tdsRecyclerView.addOnScrollListener(new onWarmupCompleted());
        TdsBottomCtaV1View tdsBottomCtaV1View = updateVisuals().onExtraCallback;
        tdsBottomCtaV1View.setGradientVisibility(8);
        tdsBottomCtaV1View.asInterface().setOnClickListener(new CurrencySelectActivity$.ExternalSyntheticLambda2(this));
        updateVisuals().onWarmupCompleted.IAuthTabCallback(new onNavigationEvent());
        int i2 = getInterfaceDescriptor + 45;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void IPostMessageServiceDefault() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(this, (access13800) null), 3, (Object) null);
        int i2 = IAuthTabCallbackStubProxy + 13;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // o.ResourceProvider$onExtraCallback
    public void onNavigationEvent(@NotNull setRequiredVersion setrequiredversion) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setrequiredversion, "");
        onNavigationEvent().onNavigationEvent(setrequiredversion.onExtraCallbackWithResult());
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1244047L, false, (String) null, (Map) null, new CurrencySelectActivity$.ExternalSyntheticLambda0(setrequiredversion), 14, (Object) null);
        int i2 = getInterfaceDescriptor + 15;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onExtraCallbackWithResult(setRequiredVersion setrequiredversion, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 101;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        d(new char[]{2943, 10402, 30137, 2844, 11205, 38815, 2907, 5743, 63034, 38052, 3690, 4420}, ImageFormat.getBitsPerPixel(0) + 1, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), setrequiredversion.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 25;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final class onExtraCallback {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final Intent onExtraCallbackWithResult(@NotNull Context context, @NotNull Map<String, AppxNgRuntimeChecker> map) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            Intent intentPutExtra = new Intent(context, (Class<?>) CurrencySelectActivity.class).putExtra("currencyRatioMap", new HashMap(map));
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            int i2 = onExtraCallback + 109;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return intentPutExtra;
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CurrencySelectActivity currencySelectActivity, SetDetectableSize setDetectableSize) {
        return (Unit) onExtraCallback(468118707, new Object[]{currencySelectActivity, setDetectableSize}, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -468118706, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
    }

    public static final /* synthetic */ getDataStatusChangedListener onExtraCallbackWithResult(CurrencySelectActivity currencySelectActivity) {
        return (getDataStatusChangedListener) onExtraCallback(889377016, new Object[]{currencySelectActivity}, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -889377016, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
    }

    @Override // im.toss.features.home.ui.view.currency.select.Hilt_CurrencySelectActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 103;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.onStart();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = getInterfaceDescriptor + 35;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // im.toss.features.home.ui.view.currency.select.Hilt_CurrencySelectActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 37;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = IAuthTabCallbackStubProxy + 69;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.features.home.ui.view.currency.select.Hilt_CurrencySelectActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 67;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = getInterfaceDescriptor + 87;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.features.home.ui.view.currency.select.Hilt_CurrencySelectActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 11;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = IAuthTabCallbackStubProxy + 1;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static void IPostMessageService() {
        onTransact = -1764856161303149500L;
    }
}
