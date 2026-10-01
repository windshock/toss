package o;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.AppMsgReceiver2;
import o.access502;
import o.enableVirtualViewContainerStateExperimental;
import o.fuseboxEnabledRelease;
import o.perfMonitorV2Enabled;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.R;
import viva.republica.toss.main.more.notification.NotificationSettingAdapter$;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class enableVirtualViewContainerStateExperimental extends exitAllPages<perfIssuesEnabled> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int IAuthTabCallback;
    private static char IAuthTabCallbackDefault = 0;
    private static char IAuthTabCallbackStub = 0;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access100 = 1;
    private static char asBinder;
    private static char asInterface;
    private static int onTransact;
    private final onExtraCallback onNavigationEvent;

    public interface onExtraCallback {
        void onExtraCallbackWithResult(@NotNull fuseboxEnabledRelease fuseboxenabledrelease);

        void onNavigationEvent();
    }

    static {
        onNavigationEvent();
        IAuthTabCallback = exitAllPages.onExtraCallbackWithResult;
        int i = IAuthTabCallback_Parcel + 59;
        IAuthTabCallbackStubProxy = i % 128;
        int i2 = i % 2;
    }

    public enableVirtualViewContainerStateExperimental(@NotNull onExtraCallback onextracallback) {
        Intrinsics.checkNotNullParameter(onextracallback, BuildConfig.FLAVOR);
        this.onNavigationEvent = onextracallback;
        access502.onExtraCallbackWithResult onextracallbackwithresult = new access502.onExtraCallbackWithResult();
        onextracallbackwithresult.onWarmupCompleted(new Function1() { // from class: viva.republica.toss.verify.account.AutoOtpPossibleBankAccountListAdapter$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return enableVirtualViewContainerStateExperimental.onWarmupCompleted((Context) obj);
            }
        });
        onextracallbackwithresult.onExtraCallbackWithResult(new Function1() { // from class: viva.republica.toss.verify.account.AutoOtpPossibleBankAccountListAdapter$$ExternalSyntheticLambda3
            public final Object invoke(Object obj) {
                return enableVirtualViewContainerStateExperimental.onNavigationEvent((RecyclerView.ViewHolder) obj);
            }
        });
        onextracallbackwithresult.IAuthTabCallback(new Function2() { // from class: viva.republica.toss.verify.account.AutoOtpPossibleBankAccountListAdapter$$ExternalSyntheticLambda4
            public final Object invoke(Object obj, Object obj2) {
                return enableVirtualViewContainerStateExperimental.onNavigationEvent(this.f$0, (AppMsgReceiver2) obj, (fuseboxEnabledRelease) obj2);
            }
        });
        if (onextracallbackwithresult.onWarmupCompleted() == null && onextracallbackwithresult.onNavigationEvent() == null) {
            int i = access100 + 11;
            onTransact = i % 128;
            int i2 = i % 2;
            onextracallbackwithresult.onExtraCallback(IAuthTabCallbackDefault.onExtraCallbackWithResult);
        }
        onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallbackWithResult());
        access502.onExtraCallbackWithResult onextracallbackwithresult2 = new access502.onExtraCallbackWithResult();
        onextracallbackwithresult2.onWarmupCompleted(new Function1() { // from class: viva.republica.toss.verify.account.AutoOtpPossibleBankAccountListAdapter$$ExternalSyntheticLambda5
            public final Object invoke(Object obj) {
                return enableVirtualViewContainerStateExperimental.onNavigationEvent((Context) obj);
            }
        });
        onextracallbackwithresult2.onExtraCallbackWithResult(new Function1() { // from class: viva.republica.toss.verify.account.AutoOtpPossibleBankAccountListAdapter$$ExternalSyntheticLambda6
            public final Object invoke(Object obj) {
                return enableVirtualViewContainerStateExperimental.onExtraCallback((RecyclerView.ViewHolder) obj);
            }
        });
        onextracallbackwithresult2.IAuthTabCallback(new Function2() { // from class: viva.republica.toss.verify.account.AutoOtpPossibleBankAccountListAdapter$$ExternalSyntheticLambda7
            public final Object invoke(Object obj, Object obj2) {
                return enableVirtualViewContainerStateExperimental.onNavigationEvent(this.f$0, (AppMsgReceiver2) obj, (perfMonitorV2Enabled) obj2);
            }
        });
        if (onextracallbackwithresult2.onWarmupCompleted() == null && onextracallbackwithresult2.onNavigationEvent() == null) {
            int i3 = access100 + 99;
            onTransact = i3 % 128;
            if (i3 % 2 != 0) {
                onextracallbackwithresult2.onExtraCallback(onTransact.onNavigationEvent);
                int i4 = 71 / 0;
            } else {
                onextracallbackwithresult2.onExtraCallback(onTransact.onNavigationEvent);
            }
            int i5 = 2 % 2;
        }
        onExtraCallbackWithResult(onextracallbackwithresult2.onExtraCallbackWithResult());
        int i6 = access100 + 105;
        onTransact = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public static final class IAuthTabCallback implements getAdService {
        final /* synthetic */ Configuration onNavigationEvent;

        public IAuthTabCallback(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class IAuthTabCallbackStub implements getAdService {
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public IAuthTabCallbackStub(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class asBinder implements getAdService {
        final /* synthetic */ Configuration onWarmupCompleted;

        public asBinder(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onWarmupCompleted) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onNavigationEvent implements getAdService {
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onNavigationEvent(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onWarmupCompleted implements getAdService {
        final /* synthetic */ Configuration IAuthTabCallback;

        public onWarmupCompleted(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.IAuthTabCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static View onWarmupCompleted(Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        TdsListRowV1View tdsListRowV1View = new TdsListRowV1View(context, (AttributeSet) null, 0, false, 14, (DefaultConstructorMarker) null);
        int i2 = onTransact + 91;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 17 / 0;
        }
        return tdsListRowV1View;
    }

    public static final class IAuthTabCallbackDefault implements Function1<Object, Boolean> {
        public static final IAuthTabCallbackDefault onExtraCallbackWithResult = new IAuthTabCallbackDefault();

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, BuildConfig.FLAVOR);
            return Boolean.valueOf(obj instanceof fuseboxEnabledRelease);
        }
    }

    public static final class onTransact implements Function1<Object, Boolean> {
        public static final onTransact onNavigationEvent = new onTransact();

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, BuildConfig.FLAVOR);
            return Boolean.valueOf(obj instanceof perfMonitorV2Enabled);
        }
    }

    public static Unit onNavigationEvent(RecyclerView.ViewHolder viewHolder) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(viewHolder, BuildConfig.FLAVOR);
        TdsListRowV1View tdsListRowV1View = viewHolder.onNavigationEvent;
        Intrinsics.checkNotNull(tdsListRowV1View, BuildConfig.FLAVOR);
        TdsListRowV1View tdsListRowV1View2 = tdsListRowV1View;
        tdsListRowV1View2.setLeftType(TdsListRowV1View.asInterface.IMAGE);
        tdsListRowV1View2.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW2C);
        tdsListRowV1View2.setRightType(TdsListRowV1View.asBinder.ROW1D);
        Context context = tdsListRowV1View2.getContext();
        Intrinsics.checkNotNullExpressionValue(context, BuildConfig.FLAVOR);
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, BuildConfig.FLAVOR);
        Object[] objArr = {new getUrlokhttp(new onExtraCallbackWithResult(configuration))};
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        tdsListRowV1View2.setRightText1Color(((Integer) getUrlokhttp.onNavigationEvent(objArr, 975054206, -975054198, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult())).intValue());
        Unit unit = Unit.INSTANCE;
        int i2 = onTransact + 47;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static Unit onWarmupCompleted(enableVirtualViewContainerStateExperimental enablevirtualviewcontainerstateexperimental, fuseboxEnabledRelease fuseboxenabledrelease, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 5;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
        enablevirtualviewcontainerstateexperimental.onNavigationEvent.onExtraCallbackWithResult(fuseboxenabledrelease);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 21;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0093 A[PHI: r0
      0x0093: PHI (r0v8 im.toss.tds.view.component.compound.listrow.TdsListRowV1View) = 
      (r0v2 im.toss.tds.view.component.compound.listrow.TdsListRowV1View)
      (r0v10 im.toss.tds.view.component.compound.listrow.TdsListRowV1View)
     binds: [B:8:0x003d, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003f A[PHI: r0
      0x003f: PHI (r0v3 im.toss.tds.view.component.compound.listrow.TdsListRowV1View) = 
      (r0v2 im.toss.tds.view.component.compound.listrow.TdsListRowV1View)
      (r0v10 im.toss.tds.view.component.compound.listrow.TdsListRowV1View)
     binds: [B:8:0x003d, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Unit onNavigationEvent(final enableVirtualViewContainerStateExperimental enablevirtualviewcontainerstateexperimental, AppMsgReceiver2 appMsgReceiver2, final fuseboxEnabledRelease fuseboxenabledrelease) {
        TdsListRowV1View tdsListRowV1View;
        int i = 2 % 2;
        int i2 = access100 + 35;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(appMsgReceiver2, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(fuseboxenabledrelease, BuildConfig.FLAVOR);
            TdsListRowV1View tdsListRowV1View2 = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
            Intrinsics.checkNotNull(tdsListRowV1View2, BuildConfig.FLAVOR);
            tdsListRowV1View = tdsListRowV1View2;
            int i3 = 80 / 0;
            if (fuseboxenabledrelease.onNavigationEvent()) {
                Context context = tdsListRowV1View.getContext();
                Intrinsics.checkNotNullExpressionValue(context, BuildConfig.FLAVOR);
                Configuration configuration = context.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration, BuildConfig.FLAVOR);
                tdsListRowV1View.setCenterText1Color(new getUrlokhttp(new onWarmupCompleted(configuration)).prefetch());
                Context context2 = tdsListRowV1View.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, BuildConfig.FLAVOR);
                Configuration configuration2 = context2.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration2, BuildConfig.FLAVOR);
                tdsListRowV1View.setCenterText2Color(new getUrlokhttp(new IAuthTabCallback(configuration2)).prefetch());
                tdsListRowV1View.setRightText1(tdsListRowV1View.getContext().getString(R.string.app_auto_otp_attempt_limit));
            } else {
                Context context3 = tdsListRowV1View.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, BuildConfig.FLAVOR);
                Configuration configuration3 = context3.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration3, BuildConfig.FLAVOR);
                tdsListRowV1View.setCenterText1Color(new getUrlokhttp(new onNavigationEvent(configuration3)).newSessionWithExtras());
                Context context4 = tdsListRowV1View.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, BuildConfig.FLAVOR);
                Configuration configuration4 = context4.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration4, BuildConfig.FLAVOR);
                tdsListRowV1View.setCenterText2Color(new getUrlokhttp(new IAuthTabCallbackStub(configuration4)).postMessage());
                tdsListRowV1View.setRightText1(BuildConfig.FLAVOR);
            }
        } else {
            Intrinsics.checkNotNullParameter(appMsgReceiver2, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(fuseboxenabledrelease, BuildConfig.FLAVOR);
            TdsListRowV1View tdsListRowV1View3 = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
            Intrinsics.checkNotNull(tdsListRowV1View3, BuildConfig.FLAVOR);
            tdsListRowV1View = tdsListRowV1View3;
            if (fuseboxenabledrelease.onNavigationEvent()) {
            }
        }
        TdsImageView tdsImageViewMayLaunchUrl = tdsListRowV1View.mayLaunchUrl();
        Intrinsics.checkNotNull(tdsImageViewMayLaunchUrl);
        UST_PKCS12_MakePFX.onWarmupCompleted(tdsImageViewMayLaunchUrl, fuseboxenabledrelease.IAuthTabCallbackDefault());
        tdsListRowV1View.setCenterText1(fuseboxenabledrelease.IAuthTabCallback());
        tdsListRowV1View.setCenterText2(fuseboxenabledrelease.onWarmupCompleted() + " " + makeAlignFaceBitmap.onExtraCallbackWithResult(fuseboxenabledrelease.asBinder()));
        BaseTextView baseTextViewICustomTabsCallbackStubProxy = tdsListRowV1View.ICustomTabsCallbackStubProxy();
        if (baseTextViewICustomTabsCallbackStubProxy != null) {
            transparentBackground.onWarmupCompleted(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{baseTextViewICustomTabsCallbackStubProxy, null, null, true, 3, null}, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -2039764647, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 2039764661, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted());
            int i4 = access100 + 99;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }
        Object[] objArr = {tdsListRowV1View, ParamUtils.NORMAL, new Function1() { // from class: viva.republica.toss.verify.account.AutoOtpPossibleBankAccountListAdapter$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return enableVirtualViewContainerStateExperimental.onWarmupCompleted(this.f$0, fuseboxenabledrelease, (View) obj);
            }
        }};
        return Unit.INSTANCE;
    }

    public static View onNavigationEvent(Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        TdsListRowV1View tdsListRowV1View = new TdsListRowV1View(context, (AttributeSet) null, 0, false, 14, (DefaultConstructorMarker) null);
        int i2 = access100 + 19;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return tdsListRowV1View;
        }
        throw null;
    }

    public static Unit onExtraCallback(RecyclerView.ViewHolder viewHolder) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(viewHolder, BuildConfig.FLAVOR);
        TdsListRowV1View tdsListRowV1View = viewHolder.onNavigationEvent;
        Intrinsics.checkNotNull(tdsListRowV1View, BuildConfig.FLAVOR);
        TdsListRowV1View tdsListRowV1View2 = tdsListRowV1View;
        tdsListRowV1View2.setLeftType(TdsListRowV1View.asInterface.IMAGE);
        TdsImageView tdsImageViewMayLaunchUrl = tdsListRowV1View2.mayLaunchUrl();
        Intrinsics.checkNotNull(tdsImageViewMayLaunchUrl);
        Object[] objArr = new Object[1];
        a(new char[]{44490, 41790, 56355, 27663, 28688, 28711, 53246, 41837, 17316, 56691, 22656, 41839, 10547, 34049, 17163, 41255, 52896, 10025, 25777, 18000, 26417, 5213, 33413, 44953, 12520, 3272, 45545, 14353, 12563, 10702, 4389, 20390, 56722, 2711, 5709, 24371, 10547, 34049, 25426, 55620, 33302, 20431, 4844, 7675, 46238, 4071, 2879, 43142, 55128, 63612, 35923, 57640, 47838, 21636, 22056, 56748, 51157, 9506}, (KeyEvent.getMaxKeyCode() >> 16) + 57, objArr);
        UST_PKCS12_MakePFX.onWarmupCompleted(tdsImageViewMayLaunchUrl, ((String) objArr[0]).intern());
        tdsListRowV1View2.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW1C);
        Context context = tdsListRowV1View2.getContext();
        Intrinsics.checkNotNullExpressionValue(context, BuildConfig.FLAVOR);
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, BuildConfig.FLAVOR);
        tdsListRowV1View2.setCenterText1Color(new getUrlokhttp(new asBinder(configuration)).newSession());
        Unit unit = Unit.INSTANCE;
        int i2 = onTransact + 43;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static Unit onNavigationEvent(enableVirtualViewContainerStateExperimental enablevirtualviewcontainerstateexperimental, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 71;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
            enablevirtualviewcontainerstateexperimental.onNavigationEvent.onNavigationEvent();
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
        enablevirtualviewcontainerstateexperimental.onNavigationEvent.onNavigationEvent();
        Unit unit2 = Unit.INSTANCE;
        int i3 = access100 + 37;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    public static Unit onNavigationEvent(final enableVirtualViewContainerStateExperimental enablevirtualviewcontainerstateexperimental, AppMsgReceiver2 appMsgReceiver2, perfMonitorV2Enabled perfmonitorv2enabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appMsgReceiver2, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(perfmonitorv2enabled, BuildConfig.FLAVOR);
        TdsListRowV1View tdsListRowV1View = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
        Intrinsics.checkNotNull(tdsListRowV1View, BuildConfig.FLAVOR);
        TdsListRowV1View tdsListRowV1View2 = tdsListRowV1View;
        tdsListRowV1View2.setCenterText1(tdsListRowV1View2.getContext().getString(R.string.app_auto_otp_select_other_account));
        Object[] objArr = {tdsListRowV1View2, ParamUtils.NORMAL, new Function1() { // from class: viva.republica.toss.verify.account.AutoOtpPossibleBankAccountListAdapter$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return enableVirtualViewContainerStateExperimental.onNavigationEvent(this.f$0, (View) obj);
            }
        }};
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        Unit unit = Unit.INSTANCE;
        int i2 = onTransact + 29;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $11 + 123;
            $10 = i4 % 128;
            int i5 = 58224;
            if (i4 % 2 != 0) {
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent << 1];
            } else {
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            }
            int i6 = i3;
            while (i6 < 16) {
                int i7 = $11 + 105;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i9 = (c2 + i5) ^ ((c2 << 4) + ((char) (asBinder ^ 1094535280733222934L)));
                int i10 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(IAuthTabCallbackStub);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char absoluteGravity = (char) Gravity.getAbsoluteGravity(i3, i3);
                        int iIndexOf = TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, i3) + 10;
                        int iLastIndexOf = 12433 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', i3);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(absoluteGravity, iIndexOf, iLastIndexOf, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (asInterface ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallbackDefault)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getPressedStateDuration() >> 16), 10 - KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i6++;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 16014), ExpandableListView.getPackedPositionGroup(0L) + 14, 19901 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onNavigationEvent() {
        asInterface = (char) 60464;
        IAuthTabCallbackDefault = (char) 61868;
        asBinder = (char) 43480;
        IAuthTabCallbackStub = (char) 50930;
    }
}
