package o;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import im.toss.devtool.action.presentation.DevToolActionListViewModel$onExtraCallback;
import im.toss.devtool.action.quickaction.Hilt_QuickActionBottomSheetActivity$4;
import im.toss.features.tosscert.ui.R;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.Typography7;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.bindContext;
import o.s5a;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.R;
import viva.republica.toss.dev.overlay.ScreenLogOverlay$;

/* loaded from: classes.dex */
public final class PKCS58 implements AppLovinExceptionHandler {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onNavigationEvent Companion;
    private static getBacktraceNote<? super String, ? super String, ? super Map<String, ? extends Object>, Unit> IAuthTabCallback = null;
    private static int IAuthTabCallbackStubProxy = 0;
    private static char[] IAuthTabCallback_Parcel = null;
    private static long access000 = 0;
    private static int access100 = 1;
    private static int extraCallbackWithResult = 1;
    private static int[] getInterfaceDescriptor;
    public static final int onExtraCallbackWithResult;
    public static final String onNavigationEvent;
    public static final String onWarmupCompleted;
    private static int readTypedObject;
    private TdsImageView IAuthTabCallbackDefault;
    private PopupWindow IAuthTabCallbackStub;
    private boolean asBinder;
    private TextView asInterface;
    private final r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ onExtraCallback;
    private final L_ onTransact;

    public static final /* synthetic */ class onExtraCallback {
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        static int onWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(onExtraCallback.class);

        static {
            int[] iArr = new int[decryptPrikey.values().length];
            try {
                int iOrdinal = decryptPrikey.APP.ordinal();
                int i = onWarmupCompleted;
                int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1846);
                if ((((((~i) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i)) >> 10) & 1) == 0) {
                    iArr[iOrdinal] = 0;
                } else {
                    iArr[iOrdinal] = 1;
                }
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3792);
                int i2 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            onExtraCallbackWithResult = iArr;
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(432);
        }
    }

    static {
        onNavigationEvent();
        Object[] objArr = new Object[1];
        a(new int[]{1870095970, 745825797, -2069549890, 1568597964, -56817163, 60765556, -762520403, -1531509542, 1980820454, 1999349656, 128469422, 1113202790, 1915091929, 99907970, -1817639619, -675561110}, 29 - ExpandableListView.getPackedPositionChild(0L), objArr);
        onNavigationEvent = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        b(29 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (39307 - (Process.myTid() >> 22)), ViewConfiguration.getTapTimeout() >> 16, objArr2);
        onWarmupCompleted = ((String) objArr2[0]).intern();
        Companion = new onNavigationEvent(null);
        onExtraCallbackWithResult = 8;
        int i = readTypedObject + 111;
        extraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        PKCS58 pkcs58 = (PKCS58) objArr[0];
        PopupWindow popupWindow = (PopupWindow) objArr[1];
        View view = (View) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 125;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(pkcs58, popupWindow, view);
        if (i3 != 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(PKCS58 pkcs58, String str, String str2, Map map) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 21;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(pkcs58, str, str2, map);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(pkcs58, str, str2, map);
        int i3 = IAuthTabCallbackStubProxy + 65;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i2;
        int i8 = ~i4;
        int i9 = (~(i7 | i8)) | (~(i7 | i));
        int i10 = ~(i2 | i);
        int i11 = ~i;
        int i12 = (~(i4 | i7 | i11)) | i10;
        int i13 = i7 | (~(i8 | i11));
        int i14 = i2 + i + i5 + ((-1570926368) * i6) + ((-1409401439) * i3);
        int i15 = i14 * i14;
        int i16 = (((-543990125) * i2) - 657981440) + (821186744 * i) + ((-1953193618) * i9) + ((-976596809) * i12) + (976596809 * i13) + (1797783552 * i5) + (1124073472 * i6) + ((-332922880) * i3) + ((-1182662656) * i15);
        int i17 = (i2 * 1410161459) + 847508490 + (i * 1410159032) + (i9 * (-1618)) + (i12 * (-809)) + (i13 * 809) + (i5 * 1410159841) + (i6 * 1126552800) + (i3 * (-1948647807)) + (i15 * (-1287520256));
        int i18 = i16 + (i17 * i17 * (-1577189376));
        return i18 != 1 ? i18 != 2 ? onNavigationEvent(objArr) : onExtraCallback(objArr) : IAuthTabCallback(objArr);
    }

    public static /* synthetic */ void onExtraCallbackWithResult(PKCS58 pkcs58, String str, Map map, String str2, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 109;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onExtraCallback(pkcs58, str, map, str2, view);
        if (i3 == 0) {
            throw null;
        }
        int i4 = access100 + 91;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(PKCS58 pkcs58, String str, Map map, String str2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 91;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(pkcs58, str, map, str2);
        int i4 = IAuthTabCallbackStubProxy + 41;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    public PKCS58(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull L_ l_) {
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(l_, "");
        this.onExtraCallback = r8lambdakrhaimf1bm5cgjbilhp45vln_xq;
        this.onTransact = l_;
    }

    public static final /* synthetic */ getBacktraceNote IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = access100 + 35;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        getBacktraceNote<? super String, ? super String, ? super Map<String, ? extends Object>, Unit> getbacktracenote = IAuthTabCallback;
        int i5 = i3 + 75;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            return getbacktracenote;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallback implements getAdService {
        static int onExtraCallbackWithResult = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(IAuthTabCallback.class);
        final /* synthetic */ Configuration IAuthTabCallback;

        public IAuthTabCallback(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus;
            int i = 2 % 2;
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2876);
            Object obj = null;
            if (!readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Light;
                int i2 = onExtraCallbackWithResult;
                int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4878);
                int i3 = (~iOnWarmupCompleted) & i2;
                int i4 = (~i2) & iOnWarmupCompleted;
                if ((1 & (((i4 & i3) | (i3 ^ i4)) >> 10)) != 0) {
                    return getspecialfeatureoptinstatus2;
                }
                obj.hashCode();
                throw null;
            }
            int i5 = onExtraCallbackWithResult;
            int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1235);
            int i6 = i5 & iOnWarmupCompleted2;
            if ((((((i5 ^ iOnWarmupCompleted2) | i6) & (~i6)) >> 20) & 1) == 0) {
                getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i7 = 88 / 0;
            } else {
                getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            }
            int i8 = onExtraCallbackWithResult;
            int iOnWarmupCompleted3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(6100);
            int i9 = (~iOnWarmupCompleted3) & i8;
            int i10 = (~i8) & iOnWarmupCompleted3;
            if ((1 & (((i10 & i9) | (i9 ^ i10)) >> 5)) != 0) {
                return getspecialfeatureoptinstatus;
            }
            obj.hashCode();
            throw null;
        }
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        static int onExtraCallbackWithResult = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(onExtraCallbackWithResult.class);
        final /* synthetic */ Configuration onNavigationEvent;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4906);
            if (!(!readIntokhttp.onExtraCallback(this.onNavigationEvent))) {
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5226);
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1348);
                return getspecialfeatureoptinstatus;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Light;
            int i2 = onExtraCallbackWithResult;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(624);
            if ((1 & (((i2 | iOnWarmupCompleted) & (~(i2 & iOnWarmupCompleted))) >> 17)) != 0) {
                return getspecialfeatureoptinstatus2;
            }
            throw null;
        }
    }

    public static final class onWarmupCompleted implements getAdService {
        static int onNavigationEvent = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(onWarmupCompleted.class);
        final /* synthetic */ Configuration onWarmupCompleted;

        public onWarmupCompleted(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            Object obj = null;
            if ((((onNavigationEvent ^ BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(338)) >> 20) & 1) == 0) {
                if (readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                    getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                    BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2054);
                    return getspecialfeatureoptinstatus;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Light;
                int i2 = onNavigationEvent;
                int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4098);
                int i3 = (~iOnWarmupCompleted) & i2;
                int i4 = (~i2) & iOnWarmupCompleted;
                if (((((i4 & i3) | (i3 ^ i4)) >> 12) & 1) != 0) {
                    return getspecialfeatureoptinstatus2;
                }
                throw null;
            }
            readIntokhttp.onExtraCallback(this.onWarmupCompleted);
            obj.hashCode();
            throw null;
        }
    }

    public void onExtraCallbackWithResult() throws PackageManager.NameNotFoundException {
        FragmentActivity activity;
        String strValueOf;
        int i = 2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityCallback = addPolicy.ITrustedWebActivityCallback();
        Object[] objArr = new Object[1];
        b(27 - ExpandableListView.getPackedPositionChild(0L), (char) (39306 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1, objArr);
        if (!textRoundCornerProgressBarSavedState1ITrustedWebActivityCallback.onExtraCallback(((String) objArr[0]).intern(), false) || (activity = this.onExtraCallback.getActivity()) == null) {
            return;
        }
        int i2 = IAuthTabCallbackStubProxy + 117;
        access100 = i2 % 128;
        String strValueOf2 = null;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(activity);
            strValueOf2.hashCode();
            throw null;
        }
        if (onExtraCallbackWithResult(activity)) {
            return;
        }
        if (this.onTransact.getScreenName().length() > 0) {
            strValueOf2 = this.onTransact.getScreenName();
            int i3 = IAuthTabCallbackStubProxy + 87;
            access100 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 5 / 4;
            }
        } else {
            initMiniApp initminiapp = this.onTransact;
            if (initminiapp instanceof initMiniApp) {
                int i5 = access100 + 69;
                IAuthTabCallbackStubProxy = i5 % 128;
                if (i5 % 2 != 0) {
                    strValueOf = String.valueOf(initminiapp.access200());
                    int i6 = 92 / 0;
                } else {
                    strValueOf = String.valueOf(initminiapp.access200());
                }
                strValueOf2 = strValueOf;
            } else if (initminiapp.getScreenId() != -1) {
                int i7 = access100 + 5;
                IAuthTabCallbackStubProxy = i7 % 128;
                int i8 = i7 % 2;
                strValueOf2 = String.valueOf(this.onTransact.getScreenId());
            }
        }
        if (onExtraCallback.onExtraCallbackWithResult[TimeStamp.onNavigationEvent(decryptPrikey.Companion, activity).ordinal()] != 1) {
            IAuthTabCallbackStub();
            return;
        }
        if (strValueOf2 == null) {
            List<? extends Fragment> listOnActivityLayout = activity.getSupportFragmentManager().onActivityLayout();
            Intrinsics.checkNotNullExpressionValue(listOnActivityLayout, "");
            if (!IAuthTabCallback(listOnActivityLayout)) {
                IAuthTabCallbackStub();
                return;
            }
        }
        if (strValueOf2 == null) {
            return;
        }
        Result.IAuthTabCallback(onExtraCallbackWithResult(onNavigationEvent(strValueOf2), this.onTransact.getScreenParams(), onInstallReferrerSetupFinished.onWarmupCompleted.onNavigationEvent().getLabel()));
    }

    public void onExtraCallback() {
        int i = 2 % 2;
        int i2 = access100 + 39;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            PopupWindow popupWindow = this.IAuthTabCallbackStub;
            if (popupWindow == null || !popupWindow.isShowing()) {
                return;
            }
            try {
                Result.Companion companion = Result.Companion;
                PopupWindow popupWindow2 = this.IAuthTabCallbackStub;
                if (popupWindow2 != null) {
                    popupWindow2.dismiss();
                }
                this.IAuthTabCallbackStub = null;
                this.asInterface = null;
                Result.constructor-impl(Unit.INSTANCE);
                return;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                Result.constructor-impl(ResultKt.createFailure(th));
                int i3 = access100 + 99;
                IAuthTabCallbackStubProxy = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
        }
        throw null;
    }

    public void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 49;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback();
        int i4 = access100 + 109;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void IAuthTabCallbackStub() {
        int i = 2 % 2;
        IAuthTabCallback = new ScreenLogOverlay$.ExternalSyntheticLambda0(this);
        int i2 = IAuthTabCallbackStubProxy + 11;
        access100 = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void IAuthTabCallback(PKCS58 pkcs58, String str, Map map, String str2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 67;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        pkcs58.onExtraCallbackWithResult(str, (Map<String, ? extends Object>) map, str2);
        if (i3 == 0) {
            int i4 = 51 / 0;
        }
    }

    private static void b(int i, char c, int i2, Object[] objArr) {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i) {
            int i4 = $10 + 15;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            jArr[i6] = s5a.onExtraCallbackWithResult.b(getPageByNodeId.c(IAuthTabCallback_Parcel[i2 + i6]), i6, access000, c);
            HttpDataSourceInvalidResponseCodeException.a(timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1);
        }
        char[] cArr = new char[i];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i) {
            int i7 = $11 + 19;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                HttpDataSourceInvalidResponseCodeException.a(timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1);
                throw null;
            }
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            HttpDataSourceInvalidResponseCodeException.a(timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1);
        }
        objArr[0] = new String(cArr);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        PKCS58 pkcs58 = (PKCS58) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        Map map = (Map) objArr[3];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(map, "");
        FragmentActivity activity = pkcs58.onExtraCallback.getActivity();
        if (activity != null) {
            activity.runOnUiThread(new ScreenLogOverlay$.ExternalSyntheticLambda3(pkcs58, str, map, str2));
            int i2 = access100 + 99;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 111;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        PKCS58 pkcs58 = (PKCS58) objArr[0];
        String str = (String) objArr[1];
        Map<String, ? extends Object> map = (Map) objArr[2];
        String str2 = (String) objArr[3];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 91;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            View view = pkcs58.onExtraCallback.getView();
            if (view != null) {
                pkcs58.onExtraCallback();
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                Class cls = Integer.TYPE;
                ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) ViewGroup.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
                Intrinsics.checkNotNull(layoutParams);
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                linearLayout.setBackgroundResource(R.drawable.rectangle_bg_white_radius16);
                Context context2 = linearLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                Configuration configuration = context2.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration, "");
                linearLayout.setBackgroundTintList(ColorStateList.valueOf(new getUrlokhttp(new onWarmupCompleted(configuration)).requestPostMessageChannel().newSessionWithExtras()));
                linearLayout.setPadding(varyMatches.IAuthTabCallback(linearLayout, 12), varyMatches.IAuthTabCallback(linearLayout, 8), varyMatches.IAuthTabCallback(linearLayout, 12), varyMatches.IAuthTabCallback(linearLayout, 8));
                Object objNewInstance = Typography7.class.getDeclaredConstructor(Context.class).newInstance(linearLayout.getContext());
                BaseTextView baseTextView = (BaseTextView) objNewInstance;
                Intrinsics.checkNotNull(baseTextView);
                baseTextView.setId(R.id.screen_log_info);
                Context context3 = baseTextView.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                Configuration configuration2 = context3.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration2, "");
                baseTextView.setTextColor(((Integer) getUrlokhttp.onNavigationEvent(new Object[]{new getUrlokhttp(new IAuthTabCallback(configuration2))}, -1763178192, 1763178195, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue());
                baseTextView.onNavigationEvent(response.Bold);
                baseTextView.setGravity(8388611);
                BaseTextView baseTextView2 = (BaseTextView) objNewInstance;
                Intrinsics.checkNotNull(baseTextView2);
                setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, baseTextView2);
                pkcs58.asInterface = baseTextView2;
                Context context4 = linearLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "");
                TdsImageView tdsImageView = new TdsImageView(context4, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                ViewGroup.LayoutParams layoutParams2 = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
                Intrinsics.checkNotNull(layoutParams2);
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
                layoutParams3.width = varyMatches.IAuthTabCallback(tdsImageView, 14);
                layoutParams3.height = varyMatches.IAuthTabCallback(tdsImageView, 14);
                layoutParams3.gravity = 16;
                tdsImageView.setLayoutParams(layoutParams2);
                setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -935338024, new Object[]{tdsImageView, Integer.valueOf(varyMatches.IAuthTabCallback(tdsImageView, 4)), Integer.valueOf(varyMatches.IAuthTabCallback(tdsImageView, 0))}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 935338026);
                Context context5 = tdsImageView.getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "");
                Configuration configuration3 = context5.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration3, "");
                tdsImageView.setImageTintList(ColorStateList.valueOf(((Integer) getUrlokhttp.onNavigationEvent(new Object[]{new getUrlokhttp(new onExtraCallbackWithResult(configuration3))}, -1763178192, 1763178195, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue()));
                Object[] objArr2 = new Object[1];
                a(new int[]{-1999550443, 1608485490, 1869312289, 1319905973, 1966629628, 827077880, -1345451771, 1358500822, 1788817428, -627811726, -963289949, -2094102458, -90104825, -732326859, -345959317, 326204662, 1993746259, -452150055, -1998572406, 1284453620, -657872579, -761723487, 1634007548, 2027804078, 1943954942, -769459284, -1891288475, -2130215991, -368899967, 708825009, 1390450677, 1966501570}, KeyEvent.keyCodeFromString("") + 64, objArr2);
                TdsImageView.setImage$default(tdsImageView, ((String) objArr2[0]).intern(), (Function1) null, (Function1) null, 6, (Object) null);
                tdsImageView.setScaleType(ImageView.ScaleType.FIT_XY);
                setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsImageView);
                pkcs58.IAuthTabCallbackDefault = tdsImageView;
                linearLayout.setOnClickListener(new ScreenLogOverlay$.ExternalSyntheticLambda1(pkcs58, str, map, str2));
                PopupWindow popupWindow = new PopupWindow((View) linearLayout, -2, -2, false);
                popupWindow.setFocusable(false);
                popupWindow.setOutsideTouchable(false);
                pkcs58.onWarmupCompleted(str, map, str2);
                view.post(new ScreenLogOverlay$.ExternalSyntheticLambda2(pkcs58, popupWindow, view));
                pkcs58.IAuthTabCallbackStub = popupWindow;
                int i4 = IAuthTabCallbackStubProxy + 3;
                access100 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 / 2;
                }
            }
            return Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            return Result.constructor-impl(ResultKt.createFailure(th));
        }
    }

    private static final void onExtraCallback(PKCS58 pkcs58, String str, Map map, String str2, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 101;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        pkcs58.asBinder = !pkcs58.asBinder;
        pkcs58.onWarmupCompleted(str, (Map<String, ? extends Object>) map, str2);
        int i4 = access100 + 21;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static void a(int[] iArr, int i, Object[] objArr) {
        int i2 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = getInterfaceDescriptor;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            for (int i3 = 0; i3 < length; i3++) {
                int i4 = $10 + 79;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                iArr3[i3] = Hilt_QuickActionBottomSheetActivity$4.h(iArr2[i3]);
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = getInterfaceDescriptor;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i6 = 0;
            while (i6 < length3) {
                int i7 = $11 + 83;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    iArr6[i6] = Hilt_QuickActionBottomSheetActivity$4.h(iArr5[i6]);
                } else {
                    iArr6[i6] = Hilt_QuickActionBottomSheetActivity$4.h(iArr5[i6]);
                    i6++;
                }
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i8 = $11 + 33;
        $10 = i8 % 128;
        int i9 = i8 % 2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i10 = $11 + 19;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i12 = 0;
            while (i12 < 16) {
                int i13 = $11 + 99;
                $10 = i13 % 128;
                int i14 = i13 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i12];
                int iJ = bindContext.IAuthTabCallbackStubProxy.j(simpleBasePlayerPositionSupplierExternalSyntheticLambda0, SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0);
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iJ;
                i12++;
                int i15 = $11 + 107;
                $10 = i15 % 128;
                int i16 = i15 % 2;
            }
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i17;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            DevToolActionListViewModel$onExtraCallback.f(simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0);
        }
        String str = new String(cArr2, 0, i);
        int i20 = $10 + 55;
        $11 = i20 % 128;
        int i21 = i20 % 2;
        objArr[0] = str;
    }

    private static final void onExtraCallbackWithResult(PKCS58 pkcs58, PopupWindow popupWindow, View view) {
        int i = 2 % 2;
        PopupWindow popupWindow2 = pkcs58.IAuthTabCallbackStub;
        if (popupWindow2 != null) {
            int i2 = access100 + 75;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 57 / 0;
                if (popupWindow2.isShowing()) {
                    return;
                }
            } else if (popupWindow2.isShowing()) {
                return;
            }
            int i4 = IAuthTabCallbackStubProxy + 107;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            int iOnNavigationEvent = varyMatches.onNavigationEvent(0, displayMetrics);
            DisplayMetrics displayMetrics2 = view.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
            popupWindow.showAtLocation(view, 49, iOnNavigationEvent, varyMatches.onNavigationEvent(0, displayMetrics2));
            int i6 = access100 + 113;
            IAuthTabCallbackStubProxy = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 5 % 5;
            }
        }
    }

    private final String onNavigationEvent(String str) {
        int i;
        int i2 = 2 % 2;
        int i3 = access100 + 49;
        IAuthTabCallbackStubProxy = i3 % 128;
        String typeName = null;
        if (i3 % 2 != 0) {
            this.onTransact.getLogVersion();
            this.onExtraCallback.getActivity();
            typeName.hashCode();
            throw null;
        }
        AFj1nSDK4 logVersion = this.onTransact.getLogVersion();
        FragmentActivity activity = this.onExtraCallback.getActivity();
        if (activity != null) {
            typeName = TimeStamp.onNavigationEvent(decryptPrikey.Companion, activity).getTypeName();
            i = IAuthTabCallbackStubProxy + 29;
        } else {
            i = IAuthTabCallbackStubProxy + 107;
        }
        access100 = i % 128;
        int i4 = i % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        Object[] objArr = new Object[1];
        b(2 - (ViewConfiguration.getTapTimeout() >> 16), (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 28 - TextUtils.getCapsMode("", 0, 0), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(logVersion);
        Object[] objArr2 = new Object[1];
        a(new int[]{-666171760, 1605469944}, 1 - KeyEvent.normalizeMetaState(0), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(typeName);
        Object[] objArr3 = new Object[1];
        b((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 31 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr3);
        sb.append(((String) objArr3[0]).intern());
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onWarmupCompleted(java.lang.String r20, java.util.Map<java.lang.String, ? extends java.lang.Object> r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.PKCS58.onWarmupCompleted(java.lang.String, java.util.Map, java.lang.String):void");
    }

    private final boolean onExtraCallbackWithResult(Activity activity) throws PackageManager.NameNotFoundException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 35;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        ActivityInfo activityInfo = activity.getPackageManager().getActivityInfo(activity.getComponentName(), 128);
        Intrinsics.checkNotNullExpressionValue(activityInfo, "");
        if (activityInfo.theme != R.style.WhiteTheme_NoDisplay) {
            return false;
        }
        int i4 = IAuthTabCallbackStubProxy + 61;
        access100 = i4 % 128;
        return i4 % 2 != 0;
    }

    private final boolean IAuthTabCallback(List<? extends Fragment> list) {
        int i = 2 % 2;
        if (list.isEmpty()) {
            int i2 = access100 + 47;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        List<? extends Fragment> list2 = list;
        if (list2 instanceof Collection) {
            int i4 = IAuthTabCallbackStubProxy + 85;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            if (list2.isEmpty()) {
                int i6 = IAuthTabCallbackStubProxy + 37;
                access100 = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
        }
        int i8 = IAuthTabCallbackStubProxy + 55;
        access100 = i8 % 128;
        int i9 = i8 % 2;
        for (Fragment fragment : list2) {
            if (!(fragment instanceof Ripple_androidKt)) {
                int i10 = IAuthTabCallbackStubProxy + 117;
                access100 = i10 % 128;
                if (i10 % 2 == 0) {
                    boolean z = fragment instanceof initMiniApp;
                    throw null;
                }
                if (!(fragment instanceof initMiniApp)) {
                    List<? extends Fragment> listOnActivityLayout = fragment.getChildFragmentManager().onActivityLayout();
                    Intrinsics.checkNotNullExpressionValue(listOnActivityLayout, "");
                    if (IAuthTabCallback(listOnActivityLayout)) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final class onNavigationEvent {
        private static final byte[] $$a;
        static int IAuthTabCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(onNavigationEvent.class);
        private static final int $$b = 6;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(short r5, byte r6, int r7) {
            /*
                int r6 = r6 * 2
                int r6 = r6 + 4
                byte[] r0 = o.PKCS58.onNavigationEvent.$$a
                int r7 = r7 * 2
                int r7 = r7 + 102
                int r5 = r5 * 3
                int r1 = 11 - r5
                byte[] r1 = new byte[r1]
                int r5 = 10 - r5
                r2 = -1
                if (r0 != 0) goto L18
                r3 = r5
                r7 = r6
                goto L2b
            L18:
                r4 = r7
                r7 = r6
                r6 = r4
            L1b:
                int r2 = r2 + 1
                byte r3 = (byte) r6
                r1[r2] = r3
                if (r2 != r5) goto L29
                java.lang.String r5 = new java.lang.String
                r6 = 0
                r5.<init>(r1, r6)
                return r5
            L29:
                r3 = r0[r7]
            L2b:
                int r3 = -r3
                int r6 = r6 + r3
                int r7 = r7 + 1
                int r6 = r6 + 2
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: o.PKCS58.onNavigationEvent.$$c(short, byte, int):java.lang.String");
        }

        static {
            byte[] bArr = {13, 38, -109, 117, -1, -3, 12, 26, -27, 9, -14, 19, -15, -5};
            $$a = bArr;
            ClassLoader parent = onNavigationEvent.class.getClassLoader().getParent();
            try {
                byte b = (byte) (bArr[4] + 1);
                byte b2 = b;
                Method declaredMethod = ClassLoader.class.getDeclaredMethod($$c(b, b2, b2), String.class);
                declaredMethod.setAccessible(true);
                System.load((String) declaredMethod.invoke(parent, "ea56"));
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static native char z(int i);

        private onNavigationEvent() {
        }

        public final void onWarmupCompleted(@NotNull String str, @NotNull String str2, @NotNull Map<String, ? extends Object> map) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4004);
            int i3 = i2 & iOnWarmupCompleted;
            if ((((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 11) & 1) != 0) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                int i4 = 82 / 0;
            } else {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
            }
            Intrinsics.checkNotNullParameter(map, "");
            getBacktraceNote getbacktracenoteIAuthTabCallback = PKCS58.IAuthTabCallback();
            if (getbacktracenoteIAuthTabCallback != null) {
                int i5 = IAuthTabCallback;
                int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4901);
                int i6 = ((((~i5) & iOnWarmupCompleted2) | ((~iOnWarmupCompleted2) & i5)) >> 5) & 1;
                getbacktracenoteIAuthTabCallback.invoke(str, str2, map);
                if (i6 != 0) {
                    int i7 = 46 / 0;
                }
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1505);
            }
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3393);
        }
    }

    public static /* synthetic */ void onWarmupCompleted(PKCS58 pkcs58, PopupWindow popupWindow, View view) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        onExtraCallbackWithResult(944747270, -944747269, R.drawable.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, iIAuthTabCallback3, new Object[]{pkcs58, popupWindow, view});
    }

    private final Object onExtraCallbackWithResult(String str, Map<String, ? extends Object> map, String str2) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        return onExtraCallbackWithResult(635331054, -635331054, R.drawable.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, iIAuthTabCallback3, new Object[]{this, str, map, str2});
    }

    private static final Unit onWarmupCompleted(PKCS58 pkcs58, String str, String str2, Map map) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(-202193039, 202193041, R.drawable.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, iIAuthTabCallback3, new Object[]{pkcs58, str, str2, map});
    }

    static void onNavigationEvent() {
        getInterfaceDescriptor = new int[]{2076616686, -286965431, -311824730, -1493094791, 864984987, 1090461371, -852166736, 1107718459, -1596492307, -1047152769, -2085801365, 1584287299, -1758563330, 1904927338, 429402145, -422101618, -2079463982, -720250122};
        IAuthTabCallback_Parcel = new char[]{29756, 28826, 32096, 31291, 26240, 25453, 26674, 21654, 20818, 24111, 23283, 18300, 19500, 18673, 13670, 12810, 16106, 15184, 8217, 11497, 10658, 5675, 4847, 8117, 1029, 214, 3496, 2564, 60916, 59729, 60925, 3514};
        access000 = 1699385080488323449L;
    }
}
