package o;

import android.annotation.NonNull;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.webkit.ValueCallback;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import im.toss.core.webkit.TossCoreWebView;
import im.toss.features.tosscert.ui.R;
import im.toss.rn.appsintoss.api.model.contacts_common.PushInfo;
import im.toss.webview.TossWebView;
import java.lang.reflect.Method;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.AdExperienceType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.main.pullupweb.ExternalWebFragment;
import viva.republica.toss.main.pullupweb.PullUpSheetView;
import viva.republica.toss.service.LabFragment;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AdExperienceType extends Fragment {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final IAuthTabCallback Companion;
    public static final int IAuthTabCallback;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access000 = 0;
    private static char[] access100 = null;
    private static int getInterfaceDescriptor = 1;
    private int IAuthTabCallbackDefault;
    private Boolean IAuthTabCallbackStub;
    private Window.Callback asBinder;
    private Integer asInterface;
    private ExternalWebFragment onExtraCallback;
    private Function0<Unit> onExtraCallbackWithResult;
    private LabFragment onNavigationEvent;
    private PullUpSheetView onTransact;
    private Window.Callback onWarmupCompleted;

    public static final /* synthetic */ class onWarmupCompleted {
        public static final /* synthetic */ int[] onExtraCallback;
        public static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[setIconSizeDp.values().length];
            try {
                iArr[setIconSizeDp.Dismissed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            onExtraCallback = iArr;
            int[] iArr2 = new int[AdSDKNotificationListener.values().length];
            try {
                iArr2[AdSDKNotificationListener.Internal.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[AdSDKNotificationListener.External.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            onNavigationEvent = iArr2;
        }
    }

    static {
        onNavigationEvent();
        Companion = new IAuthTabCallback(null);
        IAuthTabCallback = 8;
        int i = IAuthTabCallbackStubProxy + 61;
        getInterfaceDescriptor = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = (~(i7 | i)) | i3;
        int i9 = (~(i7 | (~i))) | (~((~i3) | i7)) | (~(i3 | i6 | i));
        int i10 = ~(i | i3);
        int i11 = i3 + i6 + i4 + ((-813770285) * i2) + (135932771 * i5);
        int i12 = i11 * i11;
        int i13 = (526900465 * i3) + 74317824 + ((-1745228167) * i6) + ((-249289968) * i8) + (2022838664 * i9) + ((-2022838664) * i10) + (277610496 * i4) + (1331953664 * i2) + ((-366739456) * i5) + ((-1308753920) * i12);
        int i14 = (i3 * 1149714451) + 247108311 + (i6 * 1149714091) + (i8 * (-720)) + (i9 * (-360)) + (i10 * 360) + (i4 * 1149713731) + (i2 * 1918847289) + (i5 * (-2006650391)) + (i12 * 460980224);
        int i15 = i13 + (i14 * i14 * (-1418592256));
        return i15 != 1 ? i15 != 2 ? i15 != 3 ? i15 != 4 ? onExtraCallback(objArr) : onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr) : onNavigationEvent(objArr);
    }

    public static /* synthetic */ Unit IAuthTabCallback(AdExperienceType adExperienceType) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 29;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(adExperienceType);
        int i4 = access000 + 101;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(AdExperienceType adExperienceType) {
        int i = 2 % 2;
        int i2 = access000 + 23;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        onTransact(adExperienceType);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = access000 + 105;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(AdExperienceType adExperienceType) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 115;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallbackStub = IAuthTabCallbackStub(adExperienceType);
        int i4 = IAuthTabCallback_Parcel + 71;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return zIAuthTabCallbackStub;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(AdExperienceType adExperienceType, float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 71;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(adExperienceType, f);
        int i4 = IAuthTabCallback_Parcel + 23;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ void onNavigationEvent(TossWebView tossWebView, AdExperienceType adExperienceType, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 35;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(tossWebView, adExperienceType, str);
        int i4 = access000 + 61;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(AdExperienceType adExperienceType) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 71;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {adExperienceType};
        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback3 = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback4 = PushInfo.Companion.onExtraCallback();
        if (i3 != 0) {
            throw null;
        }
        Unit unit = (Unit) IAuthTabCallback(iOnExtraCallback, iOnExtraCallback3, -1133384297, objArr, iOnExtraCallback2, iOnExtraCallback4, 1133384299);
        int i4 = IAuthTabCallback_Parcel + 7;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static final class asBinder implements getAdService {
        final /* synthetic */ Configuration onNavigationEvent;

        public asBinder(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final /* synthetic */ void onExtraCallback(AdExperienceType adExperienceType, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 13;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        adExperienceType.IAuthTabCallback(str);
        int i4 = IAuthTabCallback_Parcel + 73;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ PullUpSheetView onNavigationEvent(AdExperienceType adExperienceType) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 113;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        PullUpSheetView pullUpSheetView = adExperienceType.onTransact;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 99;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return pullUpSheetView;
    }

    public final void onWarmupCompleted(@Nullable Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 125;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        this.onExtraCallbackWithResult = function0;
        int i5 = i2 + 11;
        access000 = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Object obj;
        AdExperienceType adExperienceType = (AdExperienceType) objArr[0];
        int i = 2 % 2;
        Object obj2 = null;
        try {
            Result.Companion companion = Result.Companion;
            String string = adExperienceType.requireArguments().getString("_pullUpTarget");
            if (string == null) {
                int i2 = IAuthTabCallback_Parcel + 59;
                access000 = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                string = "";
            }
            obj = Result.constructor-impl(AdSDKNotificationListener.valueOf(string));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
            int i3 = IAuthTabCallback_Parcel + 13;
            access000 = i3 % 128;
            int i4 = i3 % 2;
        }
        AdSDKNotificationListener adSDKNotificationListener = AdSDKNotificationListener.Internal;
        if (Result.onExtraCallback(obj)) {
            obj = adSDKNotificationListener;
        }
        AdSDKNotificationListener adSDKNotificationListener2 = (AdSDKNotificationListener) obj;
        int i5 = access000 + 97;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return adSDKNotificationListener2;
        }
        obj2.hashCode();
        throw null;
    }

    private static final void onTransact(AdExperienceType adExperienceType) {
        int i = 2 % 2;
        if (adExperienceType.isAdded()) {
            int i2 = access000 + 3;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            adExperienceType.asInterface();
        }
        int i4 = access000 + 99;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static final boolean IAuthTabCallbackStub(AdExperienceType adExperienceType) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 103;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            adExperienceType.IAuthTabCallbackStub();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TossCoreWebView tossCoreWebViewIAuthTabCallbackStub = adExperienceType.IAuthTabCallbackStub();
        if (tossCoreWebViewIAuthTabCallbackStub == null || !tossCoreWebViewIAuthTabCallbackStub.canScrollVertically(-1)) {
            int i3 = access000 + 101;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        int i5 = IAuthTabCallback_Parcel + 47;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        AdExperienceType adExperienceType = (AdExperienceType) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 93;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        adExperienceType.asInterface();
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 113;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackDefault(AdExperienceType adExperienceType) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 5;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        adExperienceType.onExtraCallback();
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(AdExperienceType adExperienceType, float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 9;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        adExperienceType.onExtraCallback(f);
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            int i4 = 55 / 0;
        }
        return unit;
    }

    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object obj;
        int i = 2 % 2;
        String str = "";
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        getAdExperienceType getadexperiencetypeOnExtraCallbackWithResult = getAdExperienceType.Companion.onExtraCallbackWithResult(requireArguments().getString(getAdExperienceType.QUERY_KEY));
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        boolean z = false;
        boolean z2 = false;
        PullUpSheetView pullUpSheetView = new PullUpSheetView(contextRequireContext, false ? 1 : 0, 2, false ? 1 : 0);
        pullUpSheetView.setInitialState(setIconSizeDp.Companion.onExtraCallbackWithResult(getadexperiencetypeOnExtraCallbackWithResult));
        if (bundle != null) {
            int i2 = IAuthTabCallback_Parcel + 91;
            access000 = i2 % 128;
            try {
            } catch (Throwable th) {
                Result.Companion companion = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            if (i2 % 2 != 0) {
                Result.Companion companion2 = Result.Companion;
                bundle.getString("_pullUpSheetState");
                (z2 ? 1 : 0).hashCode();
                throw null;
            }
            Result.Companion companion3 = Result.Companion;
            String string = bundle.getString("_pullUpSheetState");
            if (string == null) {
                int i3 = access000 + 19;
                IAuthTabCallback_Parcel = i3 % 128;
                if (i3 % 2 == 0) {
                    (z ? 1 : 0).hashCode();
                    throw null;
                }
            } else {
                str = string;
            }
            obj = Result.constructor-impl(setIconSizeDp.valueOf(str));
            setIconSizeDp seticonsizedp = (setIconSizeDp) (Result.onExtraCallback(obj) ? null : obj);
            int i4 = seticonsizedp == null ? -1 : onWarmupCompleted.onExtraCallback[seticonsizedp.ordinal()];
            if (i4 != -1) {
                int i5 = IAuthTabCallback_Parcel + 65;
                access000 = i5 % 128;
                if (i5 % 2 == 0 ? i4 == 1 : i4 == 0) {
                    pullUpSheetView.post(new Runnable() { // from class: viva.republica.toss.main.pullupweb.PullUpWebHostFragment$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            AdExperienceType.onExtraCallback(this.f$0);
                        }
                    });
                } else {
                    pullUpSheetView.onExtraCallback(seticonsizedp, bundle.getBoolean("_pullUpSheetOpened"));
                }
            }
        }
        pullUpSheetView.setCanWebViewScrollUp(new Function0() { // from class: viva.republica.toss.main.pullupweb.PullUpWebHostFragment$$ExternalSyntheticLambda2
            public final Object invoke() {
                return Boolean.valueOf(AdExperienceType.onExtraCallbackWithResult(this.f$0));
            }
        });
        pullUpSheetView.setOnDismiss(new Function0() { // from class: viva.republica.toss.main.pullupweb.PullUpWebHostFragment$$ExternalSyntheticLambda3
            public final Object invoke() {
                return AdExperienceType.onWarmupCompleted(this.f$0);
            }
        });
        pullUpSheetView.setOnBackPressed(new Function0() { // from class: viva.republica.toss.main.pullupweb.PullUpWebHostFragment$$ExternalSyntheticLambda4
            public final Object invoke() {
                return AdExperienceType.IAuthTabCallback(this.f$0);
            }
        });
        pullUpSheetView.setOnChromeProgress(new Function1() { // from class: viva.republica.toss.main.pullupweb.PullUpWebHostFragment$$ExternalSyntheticLambda5
            public final Object invoke(Object obj2) {
                return AdExperienceType.onNavigationEvent(this.f$0, ((Float) obj2).floatValue());
            }
        });
        this.onTransact = pullUpSheetView;
        return pullUpSheetView;
    }

    static final /* synthetic */ class onExtraCallbackWithResult extends FunctionReferenceImpl implements Function1<String, Unit> {
        onExtraCallbackWithResult(Object obj) {
            super(1, obj, AdExperienceType.class, "updateAddress", "updateAddress(Ljava/lang/String;)V", 0);
        }

        public /* synthetic */ Object invoke(Object obj) throws Throwable {
            onExtraCallback((String) obj);
            return Unit.INSTANCE;
        }

        public final void onExtraCallback(String str) throws Throwable {
            AdExperienceType.onExtraCallback((AdExperienceType) ((CallableReference) this).receiver, str);
        }
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) throws Throwable {
        LabFragment labFragment;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        if (bundle == null) {
            asBinder();
        } else {
            LabFragment labFragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag("lab");
            if (labFragmentFindFragmentByTag instanceof LabFragment) {
                labFragment = labFragmentFindFragmentByTag;
                int i2 = access000 + 83;
                IAuthTabCallback_Parcel = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 5 % 4;
                }
            } else {
                labFragment = null;
            }
            this.onNavigationEvent = labFragment;
            Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag("pull_up_external");
            ExternalWebFragment externalWebFragment = !(fragmentFindFragmentByTag instanceof ExternalWebFragment) ? null : (ExternalWebFragment) fragmentFindFragmentByTag;
            if (externalWebFragment != null) {
                externalWebFragment.IAuthTabCallback(new onExtraCallbackWithResult(this));
            } else {
                externalWebFragment = null;
            }
            this.onExtraCallback = externalWebFragment;
            int i4 = IAuthTabCallback_Parcel + 61;
            access000 = i4 % 128;
            int i5 = i4 % 2;
        }
        TossCoreWebView tossCoreWebViewIAuthTabCallbackStub = IAuthTabCallbackStub();
        IAuthTabCallback(tossCoreWebViewIAuthTabCallbackStub != null ? tossCoreWebViewIAuthTabCallbackStub.getUrl() : null);
        IAuthTabCallback(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), -1633137160, new Object[]{this}, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), 1633137161);
        IAuthTabCallbackStubProxy();
    }

    static final /* synthetic */ class onExtraCallback extends FunctionReferenceImpl implements Function1<String, Unit> {
        onExtraCallback(Object obj) {
            super(1, obj, AdExperienceType.class, "updateAddress", "updateAddress(Ljava/lang/String;)V", 0);
        }

        public /* synthetic */ Object invoke(Object obj) throws Throwable {
            onWarmupCompleted((String) obj);
            return Unit.INSTANCE;
        }

        public final void onWarmupCompleted(String str) throws Throwable {
            AdExperienceType.onExtraCallback((AdExperienceType) ((CallableReference) this).receiver, str);
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        AdExperienceType adExperienceType = (AdExperienceType) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 37;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            adExperienceType.isAdded();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (adExperienceType.isAdded() && !adExperienceType.isStateSaved()) {
            int i3 = access000;
            int i4 = i3 + 53;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            if (adExperienceType.onTransact != null) {
                int i6 = i3 + 43;
                IAuthTabCallback_Parcel = i6 % 128;
                int i7 = i6 % 2;
                return true;
            }
        }
        return false;
    }

    public final void onWarmupCompleted(@NotNull Bundle bundle, @NotNull AdSDKNotificationListener adSDKNotificationListener) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 61;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(bundle, "");
        Intrinsics.checkNotNullParameter(adSDKNotificationListener, "");
        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
        if (((Boolean) IAuthTabCallback(iOnExtraCallback, PushInfo.Companion.onExtraCallback(), -1594112689, new Object[]{this}, iOnExtraCallback2, PushInfo.Companion.onExtraCallback(), 1594112692)).booleanValue()) {
            Bundle bundle2 = new Bundle(bundle);
            bundle2.putString("_pullUpTarget", adSDKNotificationListener.name());
            setArguments(bundle2);
            this.onNavigationEvent = null;
            this.onExtraCallback = null;
            asBinder();
            Bundle bundleRequireArguments = requireArguments();
            Object[] objArr = new Object[1];
            a(new int[]{0, 3, 0, 0}, true, new byte[]{0, 0, 1}, objArr);
            IAuthTabCallback(bundleRequireArguments.getString(((String) objArr[0]).intern()));
            int i4 = IAuthTabCallback_Parcel + 79;
            access000 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private final TossCoreWebView IAuthTabCallbackStub() {
        int i = 2 % 2;
        LabFragment labFragment = this.onNavigationEvent;
        if (labFragment != null) {
            int i2 = access000 + 57;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            TossWebView tossWebViewICustomTabsCallback_Parcel = labFragment.ICustomTabsCallback_Parcel();
            if (tossWebViewICustomTabsCallback_Parcel != null) {
                int i4 = IAuthTabCallback_Parcel + 33;
                access000 = i4 % 128;
                if (i4 % 2 == 0) {
                    return tossWebViewICustomTabsCallback_Parcel;
                }
                throw null;
            }
        }
        ExternalWebFragment externalWebFragment = this.onExtraCallback;
        if (externalWebFragment == null) {
            return null;
        }
        TossCoreWebView webView = externalWebFragment.getWebView();
        int i5 = IAuthTabCallback_Parcel + 87;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return webView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void IAuthTabCallback(java.lang.String r8) throws java.lang.Throwable {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.AdExperienceType.access000
            int r1 = r1 + 59
            int r2 = r1 % 128
            o.AdExperienceType.IAuthTabCallback_Parcel = r2
            int r1 = r1 % r0
            r1 = 0
            if (r8 == 0) goto L29
            boolean r2 = kotlin.text.StringsKt.isBlank(r8)
            if (r2 == 0) goto L17
            r8 = r1
            goto L27
        L17:
            int r2 = o.AdExperienceType.IAuthTabCallback_Parcel
            int r3 = r2 + 39
            int r4 = r3 % 128
            o.AdExperienceType.access000 = r4
            int r3 = r3 % r0
            int r2 = r2 + 47
            int r3 = r2 % 128
            o.AdExperienceType.access000 = r3
            int r2 = r2 % r0
        L27:
            if (r8 != 0) goto L4a
        L29:
            android.os.Bundle r8 = r7.requireArguments()
            r2 = 0
            r3 = 3
            int[] r4 = new int[]{r2, r3, r2, r2}
            byte[] r3 = new byte[r3]
            r3 = {x00b2: FILL_ARRAY_DATA , data: [0, 0, 1} // fill-array
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            a(r4, r5, r3, r6)
            r2 = r6[r2]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.intern()
            java.lang.String r8 = r8.getString(r2)
        L4a:
            if (r8 == 0) goto Laa
            boolean r2 = kotlin.text.StringsKt.isBlank(r8)
            if (r2 == 0) goto L53
            r8 = r1
        L53:
            if (r8 == 0) goto Laa
            int r2 = o.AdExperienceType.IAuthTabCallback_Parcel
            int r2 = r2 + 73
            int r3 = r2 % 128
            o.AdExperienceType.access000 = r3
            int r2 = r2 % r0
            kotlin.Result$Companion r2 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L89
            android.net.Uri r2 = android.net.Uri.parse(r8)     // Catch: java.lang.Throwable -> L89
            java.lang.String r2 = r2.getHost()     // Catch: java.lang.Throwable -> L89
            if (r2 == 0) goto L83
            int r3 = o.AdExperienceType.access000
            int r3 = r3 + 65
            int r4 = r3 % 128
            o.AdExperienceType.IAuthTabCallback_Parcel = r4
            int r3 = r3 % r0
            java.lang.String r4 = "www."
            if (r3 == 0) goto L7c
            java.lang.String r2 = kotlin.text.StringsKt.removePrefix(r2, r4)     // Catch: java.lang.Throwable -> L89
            goto L84
        L7c:
            kotlin.text.StringsKt.removePrefix(r2, r4)     // Catch: java.lang.Throwable -> L89
            r1.hashCode()     // Catch: java.lang.Throwable -> L89
            throw r1     // Catch: java.lang.Throwable -> L89
        L83:
            r2 = r1
        L84:
            java.lang.Object r2 = kotlin.Result.constructor-impl(r2)     // Catch: java.lang.Throwable -> L89
            goto L94
        L89:
            r2 = move-exception
            kotlin.Result$Companion r3 = kotlin.Result.Companion
            java.lang.Object r2 = kotlin.ResultKt.createFailure(r2)
            java.lang.Object r2 = kotlin.Result.constructor-impl(r2)
        L94:
            boolean r3 = kotlin.Result.onExtraCallback(r2)
            if (r3 == 0) goto L9b
            goto L9c
        L9b:
            r1 = r2
        L9c:
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto Laa
            int r1 = o.AdExperienceType.access000
            int r1 = r1 + 53
            int r2 = r1 % 128
            o.AdExperienceType.IAuthTabCallback_Parcel = r2
            int r1 = r1 % r0
            r1 = r8
        Laa:
            viva.republica.toss.main.pullupweb.PullUpSheetView r8 = r7.onTransact
            if (r8 == 0) goto Lb1
            r8.setTitle(r1)
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AdExperienceType.IAuthTabCallback(java.lang.String):void");
    }

    private final void onExtraCallback() {
        int i = 2 % 2;
        Object obj = null;
        if (this.onNavigationEvent != null) {
            int i2 = IAuthTabCallback_Parcel + 113;
            access000 = i2 % 128;
            if (i2 % 2 == 0) {
                int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
                int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
                IAuthTabCallback(iOnExtraCallback, PushInfo.Companion.onExtraCallback(), 1431307184, new Object[]{this}, iOnExtraCallback2, PushInfo.Companion.onExtraCallback(), -1431307184);
                return;
            }
            int iOnExtraCallback3 = PushInfo.Companion.onExtraCallback();
            int iOnExtraCallback4 = PushInfo.Companion.onExtraCallback();
            IAuthTabCallback(iOnExtraCallback3, PushInfo.Companion.onExtraCallback(), 1431307184, new Object[]{this}, iOnExtraCallback4, PushInfo.Companion.onExtraCallback(), -1431307184);
            throw null;
        }
        ExternalWebFragment externalWebFragment = this.onExtraCallback;
        if (externalWebFragment != null) {
            int i3 = access000 + 91;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            if (externalWebFragment.IAuthTabCallback()) {
                ExternalWebFragment externalWebFragment2 = this.onExtraCallback;
                if (externalWebFragment2 != null) {
                    int i5 = IAuthTabCallback_Parcel + 71;
                    access000 = i5 % 128;
                    int i6 = i5 % 2;
                    externalWebFragment2.onExtraCallback();
                    return;
                }
                return;
            }
        }
        PullUpSheetView pullUpSheetView = this.onTransact;
        if (pullUpSheetView != null) {
            int i7 = IAuthTabCallback_Parcel + 55;
            access000 = i7 % 128;
            int i8 = i7 % 2;
            pullUpSheetView.asBinder();
            if (i8 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    private static final void IAuthTabCallback(TossWebView tossWebView, AdExperienceType adExperienceType, String str) {
        int i = 2 % 2;
        if (str != null) {
            int i2 = IAuthTabCallback_Parcel + 69;
            access000 = i2 % 128;
            if (i2 % 2 != 0) {
                if (!Boolean.parseBoolean(str)) {
                    return;
                }
            } else if (Boolean.parseBoolean(str)) {
                return;
            }
        }
        if (getOptimalPreviewSize.IAuthTabCallback(tossWebView)) {
            getOptimalPreviewSize.onNavigationEvent(tossWebView);
            return;
        }
        PullUpSheetView pullUpSheetView = adExperienceType.onTransact;
        if (pullUpSheetView != null) {
            int i3 = access000 + 17;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            pullUpSheetView.asBinder();
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        final TossWebView tossWebViewICustomTabsCallback_Parcel;
        final AdExperienceType adExperienceType = (AdExperienceType) objArr[0];
        int i = 2 % 2;
        LabFragment labFragment = adExperienceType.onNavigationEvent;
        Object obj = null;
        if (labFragment != null) {
            int i2 = access000 + 69;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            tossWebViewICustomTabsCallback_Parcel = labFragment.ICustomTabsCallback_Parcel();
            int i4 = IAuthTabCallback_Parcel + 97;
            access000 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 / 3;
            }
        } else {
            tossWebViewICustomTabsCallback_Parcel = null;
        }
        if (tossWebViewICustomTabsCallback_Parcel == null) {
            int i6 = access000 + 111;
            IAuthTabCallback_Parcel = i6 % 128;
            if (i6 % 2 == 0) {
                PullUpSheetView pullUpSheetView = adExperienceType.onTransact;
                obj.hashCode();
                throw null;
            }
            PullUpSheetView pullUpSheetView2 = adExperienceType.onTransact;
            if (pullUpSheetView2 != null) {
                pullUpSheetView2.asBinder();
                int i7 = IAuthTabCallback_Parcel + 77;
                access000 = i7 % 128;
                int i8 = i7 % 2;
                return null;
            }
        } else {
            String strExtraCallbackWithResult = tossWebViewICustomTabsCallback_Parcel.extraCallbackWithResult();
            if (strExtraCallbackWithResult != null) {
                tossWebViewICustomTabsCallback_Parcel.evaluateJavascript(strExtraCallbackWithResult + "()", new ValueCallback() { // from class: viva.republica.toss.main.pullupweb.PullUpWebHostFragment$$ExternalSyntheticLambda0
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj2) {
                        AdExperienceType.onNavigationEvent(tossWebViewICustomTabsCallback_Parcel, adExperienceType, (String) obj2);
                    }
                });
                return null;
            }
            if (getOptimalPreviewSize.IAuthTabCallback(tossWebViewICustomTabsCallback_Parcel)) {
                getOptimalPreviewSize.onNavigationEvent(tossWebViewICustomTabsCallback_Parcel);
                int i9 = access000 + 31;
                IAuthTabCallback_Parcel = i9 % 128;
                if (i9 % 2 != 0) {
                    return null;
                }
                obj.hashCode();
                throw null;
            }
            PullUpSheetView pullUpSheetView3 = adExperienceType.onTransact;
            if (pullUpSheetView3 != null) {
                int i10 = access000 + 63;
                IAuthTabCallback_Parcel = i10 % 128;
                int i11 = i10 % 2;
                pullUpSheetView3.asBinder();
            }
        }
        return null;
    }

    public void onSaveInstanceState(@NotNull Bundle bundle) {
        int i = 2 % 2;
        int i2 = access000 + 57;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(bundle, "");
            super.onSaveInstanceState(bundle);
            throw null;
        }
        Intrinsics.checkNotNullParameter(bundle, "");
        super.onSaveInstanceState(bundle);
        PullUpSheetView pullUpSheetView = this.onTransact;
        if (pullUpSheetView != null) {
            bundle.putString("_pullUpSheetState", pullUpSheetView.onExtraCallback().name());
            bundle.putBoolean("_pullUpSheetOpened", pullUpSheetView.IAuthTabCallbackDefault());
            int i3 = access000 + 41;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = access000 + 29;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 62 / 0;
        }
    }

    private final void asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 113;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        Function0<Unit> function0 = this.onExtraCallbackWithResult;
        if (function0 != null) {
            int i5 = i2 + 91;
            access000 = i5 % 128;
            if (i5 % 2 == 0) {
                function0.invoke();
            } else {
                function0.invoke();
                int i6 = 28 / 0;
            }
        }
        if (!isAdded()) {
            return;
        }
        getParentFragmentManager().onExtraCallbackWithResult().onNavigationEvent(this).onExtraCallback();
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = access100;
        if (cArr != null) {
            int i6 = $11 + 31;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i8 = 0; i8 < length; i8++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - TextUtils.getCapsMode("", 0, 0)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 34, Drawable.resolveOpacity(0, 0) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            int i9 = $10 + 59;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10936 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 65 - TextUtils.getCapsMode("", 0, 0), 16718 - (ViewConfiguration.getFadingEdgeLength() >> 16), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i11] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 29, Drawable.resolveOpacity(0, 0) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 49468), (ViewConfiguration.getTouchSlop() >> 8) + 70, 12485 - TextUtils.indexOf((CharSequence) "", '0', 0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            int i13 = $10 + 21;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i15 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i15, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i15);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        String str = new String(cArr3);
        int i16 = $10 + 39;
        $11 = i16 % 128;
        if (i16 % 2 != 0) {
            objArr[0] = str;
        } else {
            int i17 = 43 / 0;
            objArr[0] = str;
        }
    }

    public static final class onNavigationEvent implements Window.Callback {
        final /* synthetic */ AdExperienceType IAuthTabCallback;
        private final /* synthetic */ Window.Callback onExtraCallbackWithResult;
        final /* synthetic */ Window.Callback onNavigationEvent;

        @Override // android.view.Window.Callback
        public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
            return this.onExtraCallbackWithResult.dispatchGenericMotionEvent(motionEvent);
        }

        @Override // android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return this.onExtraCallbackWithResult.dispatchKeyShortcutEvent(keyEvent);
        }

        @Override // android.view.Window.Callback
        public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            return this.onExtraCallbackWithResult.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }

        @Override // android.view.Window.Callback
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return this.onExtraCallbackWithResult.dispatchTouchEvent(motionEvent);
        }

        @Override // android.view.Window.Callback
        public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
            return this.onExtraCallbackWithResult.dispatchTrackballEvent(motionEvent);
        }

        @Override // android.view.Window.Callback
        public void onActionModeFinished(ActionMode actionMode) {
            this.onExtraCallbackWithResult.onActionModeFinished(actionMode);
        }

        @Override // android.view.Window.Callback
        public void onActionModeStarted(ActionMode actionMode) {
            this.onExtraCallbackWithResult.onActionModeStarted(actionMode);
        }

        @Override // android.view.Window.Callback
        public void onAttachedToWindow() {
            this.onExtraCallbackWithResult.onAttachedToWindow();
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
            this.onExtraCallbackWithResult.onContentChanged();
        }

        @Override // android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, @NonNull Menu menu) {
            Intrinsics.checkNotNullParameter(menu, "");
            return this.onExtraCallbackWithResult.onCreatePanelMenu(i, menu);
        }

        @Override // android.view.Window.Callback
        public View onCreatePanelView(int i) {
            return this.onExtraCallbackWithResult.onCreatePanelView(i);
        }

        @Override // android.view.Window.Callback
        public void onDetachedFromWindow() {
            this.onExtraCallbackWithResult.onDetachedFromWindow();
        }

        @Override // android.view.Window.Callback
        public boolean onMenuItemSelected(int i, @NonNull MenuItem menuItem) {
            Intrinsics.checkNotNullParameter(menuItem, "");
            return this.onExtraCallbackWithResult.onMenuItemSelected(i, menuItem);
        }

        @Override // android.view.Window.Callback
        public boolean onMenuOpened(int i, @NonNull Menu menu) {
            Intrinsics.checkNotNullParameter(menu, "");
            return this.onExtraCallbackWithResult.onMenuOpened(i, menu);
        }

        @Override // android.view.Window.Callback
        public void onPanelClosed(int i, @NonNull Menu menu) {
            Intrinsics.checkNotNullParameter(menu, "");
            this.onExtraCallbackWithResult.onPanelClosed(i, menu);
        }

        @Override // android.view.Window.Callback
        public boolean onPreparePanel(int i, @android.annotation.Nullable View view, @NonNull Menu menu) {
            Intrinsics.checkNotNullParameter(menu, "");
            return this.onExtraCallbackWithResult.onPreparePanel(i, view, menu);
        }

        @Override // android.view.Window.Callback
        public boolean onSearchRequested() {
            return this.onExtraCallbackWithResult.onSearchRequested();
        }

        @Override // android.view.Window.Callback
        public boolean onSearchRequested(SearchEvent searchEvent) {
            return this.onExtraCallbackWithResult.onSearchRequested(searchEvent);
        }

        @Override // android.view.Window.Callback
        public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
            this.onExtraCallbackWithResult.onWindowAttributesChanged(layoutParams);
        }

        @Override // android.view.Window.Callback
        public void onWindowFocusChanged(boolean z) {
            this.onExtraCallbackWithResult.onWindowFocusChanged(z);
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return this.onExtraCallbackWithResult.onWindowStartingActionMode(callback);
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return this.onExtraCallbackWithResult.onWindowStartingActionMode(callback, i);
        }

        onNavigationEvent(Window.Callback callback, AdExperienceType adExperienceType) {
            this.onNavigationEvent = callback;
            this.IAuthTabCallback = adExperienceType;
            this.onExtraCallbackWithResult = callback;
        }

        @Override // android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            Intrinsics.checkNotNullParameter(keyEvent, "");
            PullUpSheetView pullUpSheetViewOnNavigationEvent = AdExperienceType.onNavigationEvent(this.IAuthTabCallback);
            if (keyEvent.getKeyCode() == 4 && pullUpSheetViewOnNavigationEvent != null) {
                return pullUpSheetViewOnNavigationEvent.dispatchKeyEvent(keyEvent);
            }
            return this.onNavigationEvent.dispatchKeyEvent(keyEvent);
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Window window;
        AdExperienceType adExperienceType = (AdExperienceType) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 55;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        FragmentActivity activity = adExperienceType.getActivity();
        if (activity == null) {
            return null;
        }
        int i4 = IAuthTabCallback_Parcel + 57;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            window = activity.getWindow();
            int i5 = 50 / 0;
            if (window == null) {
                return null;
            }
        } else {
            window = activity.getWindow();
            if (window == null) {
                return null;
            }
        }
        Window.Callback callback = window.getCallback();
        if (callback == null) {
            return null;
        }
        int i6 = access000 + 125;
        IAuthTabCallback_Parcel = i6 % 128;
        int i7 = i6 % 2;
        if (adExperienceType.onWarmupCompleted != null) {
            return null;
        }
        adExperienceType.asBinder = callback;
        onNavigationEvent onnavigationevent = new onNavigationEvent(callback, adExperienceType);
        adExperienceType.onWarmupCompleted = onnavigationevent;
        window.setCallback(onnavigationevent);
        return null;
    }

    private final void IAuthTabCallbackDefault() {
        int i = 2 % 2;
        FragmentActivity activity = getActivity();
        Window window = activity != null ? activity.getWindow() : null;
        if (window != null && window.getCallback() == this.onWarmupCompleted) {
            int i2 = access000 + 117;
            IAuthTabCallback_Parcel = i2 % 128;
            if (i2 % 2 == 0) {
                window.setCallback(this.asBinder);
                throw null;
            }
            window.setCallback(this.asBinder);
            int i3 = access000 + 91;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
        }
        this.onWarmupCompleted = null;
        this.asBinder = null;
    }

    private final void IAuthTabCallbackStubProxy() {
        boolean z;
        int i = 2 % 2;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            int i2 = IAuthTabCallback_Parcel + 43;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            Window window = activity.getWindow();
            if (window == null || this.asInterface != null) {
                return;
            }
            this.asInterface = Integer.valueOf(window.getStatusBarColor());
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            Resources resources = contextRequireContext.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            Configuration configuration = resources.getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            this.IAuthTabCallbackDefault = ((Integer) getDEFAULT_CONNECTION_SPECSokhttp.onExtraCallbackWithResult(1656360527, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), new Object[]{new getDEFAULT_CONNECTION_SPECSokhttp(new asBinder(configuration))}, R.drawable.IAuthTabCallback(), -1656360525)).intValue();
            if (Build.VERSION.SDK_INT >= 29) {
                int i4 = access000 + 59;
                IAuthTabCallback_Parcel = i4 % 128;
                if (i4 % 2 == 0) {
                    this.IAuthTabCallbackStub = Boolean.valueOf(window.isStatusBarContrastEnforced());
                    z = true;
                } else {
                    this.IAuthTabCallbackStub = Boolean.valueOf(window.isStatusBarContrastEnforced());
                    z = false;
                }
                window.setStatusBarContrastEnforced(z);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onExtraCallback(float r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.AdExperienceType.access000
            int r1 = r1 + 9
            int r2 = r1 % 128
            o.AdExperienceType.IAuthTabCallback_Parcel = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L65
            androidx.fragment.app.FragmentActivity r1 = r6.getActivity()
            if (r1 == 0) goto L64
            android.view.Window r1 = r1.getWindow()
            if (r1 == 0) goto L64
            int r3 = o.AdExperienceType.IAuthTabCallback_Parcel
            int r4 = r3 + 17
            int r5 = r4 % 128
            o.AdExperienceType.access000 = r5
            int r4 = r4 % r0
            if (r4 != 0) goto L63
            java.lang.Integer r2 = r6.asInterface
            if (r2 == 0) goto L64
            int r3 = r3 + 11
            int r4 = r3 % 128
            o.AdExperienceType.access000 = r4
            int r3 = r3 % r0
            r0 = 0
            if (r3 == 0) goto L42
            int r2 = r2.intValue()
            int r3 = android.graphics.Color.alpha(r2)
            r4 = 94
            int r4 = r4 / r0
            if (r3 != 0) goto L52
            goto L4c
        L42:
            int r2 = r2.intValue()
            int r3 = android.graphics.Color.alpha(r2)
            if (r3 != 0) goto L52
        L4c:
            int r2 = r6.IAuthTabCallbackDefault
            int r2 = o.VideoEncoderInfoImplExternalSyntheticLambda0.IAuthTabCallback(r2, r0)
        L52:
            int r0 = r6.IAuthTabCallbackDefault
            r3 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            float r7 = kotlin.ranges.RangesKt.coerceIn(r7, r3, r4)
            int r7 = o.VideoEncoderInfoImplExternalSyntheticLambda0.onExtraCallbackWithResult(r2, r0, r7)
            r1.setStatusBarColor(r7)
            goto L64
        L63:
            throw r2
        L64:
            return
        L65:
            r6.getActivity()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AdExperienceType.onExtraCallback(float):void");
    }

    private final void access000() {
        Window window;
        int i = 2 % 2;
        FragmentActivity activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        Integer num = this.asInterface;
        Object obj = null;
        if (num != null) {
            int i2 = IAuthTabCallback_Parcel + 121;
            access000 = i2 % 128;
            if (i2 % 2 != 0) {
                window.setStatusBarColor(num.intValue());
                obj.hashCode();
                throw null;
            }
            window.setStatusBarColor(num.intValue());
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int i3 = IAuthTabCallback_Parcel;
            int i4 = i3 + 47;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            Boolean bool = this.IAuthTabCallbackStub;
            if (bool != null) {
                int i6 = i3 + 61;
                access000 = i6 % 128;
                if (i6 % 2 != 0) {
                    window.setStatusBarContrastEnforced(bool.booleanValue());
                    obj.hashCode();
                    throw null;
                }
                window.setStatusBarContrastEnforced(bool.booleanValue());
            }
        }
        this.asInterface = null;
        this.IAuthTabCallbackStub = null;
    }

    public void onDestroyView() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 109;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackDefault();
        access000();
        super.onDestroyView();
        this.onTransact = null;
        int i4 = IAuthTabCallback_Parcel + 113;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public final AdExperienceType onExtraCallbackWithResult(@NotNull Bundle bundle, @NotNull AdSDKNotificationListener adSDKNotificationListener) {
            Intrinsics.checkNotNullParameter(bundle, "");
            Intrinsics.checkNotNullParameter(adSDKNotificationListener, "");
            AdExperienceType adExperienceType = new AdExperienceType();
            Bundle bundle2 = new Bundle(bundle);
            bundle2.putString("_pullUpTarget", adSDKNotificationListener.name());
            adExperienceType.setArguments(bundle2);
            return adExperienceType;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void asBinder() throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 75;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        PullUpSheetView pullUpSheetView = this.onTransact;
        if (pullUpSheetView != null) {
            int iAsInterface = pullUpSheetView.asInterface();
            int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
            int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
            int i3 = onWarmupCompleted.onNavigationEvent[((AdSDKNotificationListener) IAuthTabCallback(iOnExtraCallback, PushInfo.Companion.onExtraCallback(), -465793241, new Object[]{this}, iOnExtraCallback2, PushInfo.Companion.onExtraCallback(), 465793245)).ordinal()];
            if (i3 != 1) {
                int i4 = access000 + 47;
                IAuthTabCallback_Parcel = i4 % 128;
                int i5 = i4 % 2;
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                ExternalWebFragment.IAuthTabCallback iAuthTabCallback = ExternalWebFragment.Companion;
                Bundle bundleRequireArguments = requireArguments();
                Object[] objArr = new Object[1];
                a(new int[]{0, 3, 0, 0}, true, new byte[]{0, 0, 1}, objArr);
                String string = bundleRequireArguments.getString(((String) objArr[0]).intern());
                Bundle bundleRequireArguments2 = requireArguments();
                Object[] objArr2 = new Object[1];
                a(new int[]{3, 5, 0, 0}, true, new byte[]{1, 1, 0, 1, 1}, objArr2);
                ExternalWebFragment externalWebFragmentOnNavigationEvent = iAuthTabCallback.onNavigationEvent(string, bundleRequireArguments2.getString(((String) objArr2[0]).intern()));
                externalWebFragmentOnNavigationEvent.IAuthTabCallback(new onExtraCallback(this));
                this.onExtraCallback = externalWebFragmentOnNavigationEvent;
                getChildFragmentManager().onExtraCallbackWithResult().onExtraCallback(iAsInterface, externalWebFragmentOnNavigationEvent, "pull_up_external").onExtraCallbackWithResult();
                return;
            }
            FlowMeasureLazyPolicyExternalSyntheticLambda3 childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Bundle bundleRequireArguments3 = requireArguments();
            LabFragment labFragmentInstantiate = childFragmentManager.onMessageChannelReady().instantiate(ClassLoader.getSystemClassLoader(), LabFragment.class.getName());
            if (labFragmentInstantiate == null) {
                throw new NullPointerException("null cannot be cast to non-null type viva.republica.toss.service.LabFragment");
            }
            int i6 = access000 + 45;
            int i7 = i6 % 128;
            IAuthTabCallback_Parcel = i7;
            int i8 = i6 % 2;
            LabFragment labFragment = labFragmentInstantiate;
            if (bundleRequireArguments3 != null) {
                int i9 = i7 + 113;
                access000 = i9 % 128;
                int i10 = i9 % 2;
                labFragment.setArguments(bundleRequireArguments3);
            }
            this.onNavigationEvent = labFragment;
            getChildFragmentManager().onExtraCallbackWithResult().onExtraCallback(iAsInterface, labFragment, "lab").onExtraCallbackWithResult();
        }
    }

    private final AdSDKNotificationListener onExtraCallbackWithResult() {
        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
        return (AdSDKNotificationListener) IAuthTabCallback(iOnExtraCallback, PushInfo.Companion.onExtraCallback(), -465793241, new Object[]{this}, iOnExtraCallback2, PushInfo.Companion.onExtraCallback(), 465793245);
    }

    private final void IAuthTabCallback() {
        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
        IAuthTabCallback(iOnExtraCallback, PushInfo.Companion.onExtraCallback(), 1431307184, new Object[]{this}, iOnExtraCallback2, PushInfo.Companion.onExtraCallback(), -1431307184);
    }

    private final void onTransact() {
        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
        IAuthTabCallback(iOnExtraCallback, PushInfo.Companion.onExtraCallback(), -1633137160, new Object[]{this}, iOnExtraCallback2, PushInfo.Companion.onExtraCallback(), 1633137161);
    }

    private static final Unit asInterface(AdExperienceType adExperienceType) {
        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
        return (Unit) IAuthTabCallback(iOnExtraCallback, PushInfo.Companion.onExtraCallback(), -1133384297, new Object[]{adExperienceType}, iOnExtraCallback2, PushInfo.Companion.onExtraCallback(), 1133384299);
    }

    public final boolean onWarmupCompleted() {
        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
        return ((Boolean) IAuthTabCallback(iOnExtraCallback, PushInfo.Companion.onExtraCallback(), -1594112689, new Object[]{this}, iOnExtraCallback2, PushInfo.Companion.onExtraCallback(), 1594112692)).booleanValue();
    }

    static void onNavigationEvent() {
        access100 = new char[]{27256, 27169, 27197, 27260, 27174, 27198, 27168, 27168};
    }
}
