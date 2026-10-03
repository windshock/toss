package o;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.zzgsa;
import com.google.common.collect.Synchronized;
import com.google.firebase.messaging.FirebaseMessaging;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.base.BaseActivity;
import im.toss.featurescommon.servicetermsagreement.standardtermsv2.domain.model.response.UserTermsStateWithServiceInfoResponse;
import im.toss.tds.view.component.atom.switches.TdsSwitchV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.uikit.widget.textView.top.TdsTopV1T02View;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import o.access502;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.main.more.notification.NotificationSettingAdapter$;
import viva.republica.toss.main.more.push.MarketingTermsActivity;
import viva.republica.toss.main.more.push.MultipleNotificationBottomSheet;
import viva.republica.toss.network.model.serviceManagement.marketingNotifications.Setting;
import viva.republica.toss.network.model.serviceManagement.marketingNotifications.Term;
import viva.republica.toss.service.LabActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public class onRewardedAdCompleted extends exitAllPages<Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallbackStub = 1940504557997684612L;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private final onRewardedVideoCompleted IAuthTabCallback;
    private final BaseActivity onNavigationEvent;

    public interface onWarmupCompleted {
        Function0<Unit> onExtraCallback();

        String onNavigationEvent();

        Function0<Unit> onWarmupCompleted();
    }

    public static /* synthetic */ Unit asBinder(RecyclerView.ViewHolder viewHolder) {
        int i = 2 % 2;
        int i2 = asInterface + 51;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(viewHolder);
        int i4 = asInterface + 65;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onExtraCallback(RecyclerView.ViewHolder viewHolder) {
        int i = 2 % 2;
        int i2 = asInterface + 123;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(viewHolder);
        int i4 = asBinder + 65;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onExtraCallback(AppMsgReceiver2 appMsgReceiver2, asBinder asbinder) {
        int i = 2 % 2;
        int i2 = asBinder + 75;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(appMsgReceiver2, asbinder);
        if (i3 == 0) {
            int i4 = 31 / 0;
        }
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 43;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(viewHolder);
        if (i3 == 0) {
            int i4 = 65 / 0;
        }
        return unitAsInterface;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(AppMsgReceiver2 appMsgReceiver2, IAuthTabCallbackStub iAuthTabCallbackStub) {
        int i = 2 % 2;
        int i2 = asBinder + 85;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(appMsgReceiver2, iAuthTabCallbackStub);
        }
        IAuthTabCallback(appMsgReceiver2, iAuthTabCallbackStub);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(AppMsgReceiver2 appMsgReceiver2, getInterfaceDescriptor getinterfacedescriptor) {
        int i = 2 % 2;
        int i2 = asBinder + 25;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(appMsgReceiver2, getinterfacedescriptor);
        int i4 = asBinder + 99;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        onRewardedAdCompleted onrewardedadcompleted = (onRewardedAdCompleted) objArr[0];
        AppMsgReceiver2 appMsgReceiver2 = (AppMsgReceiver2) objArr[1];
        onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) objArr[2];
        int i = 2 % 2;
        int i2 = asInterface + 71;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(onrewardedadcompleted, appMsgReceiver2, onextracallbackwithresult);
        int i4 = asBinder + 103;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 92 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Object onNavigationEvent(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = ~(i4 | i6);
        int i11 = i9 | i10;
        int i12 = ~i4;
        int i13 = i9 | (~(i12 | i3)) | i10;
        int i14 = (~(i6 | i4 | i3)) | (~(i7 | i12 | i8));
        int i15 = i4 + i3 + i2 + (1322235619 * i) + (440487356 * i5);
        int i16 = i15 * i15;
        int i17 = (((-1102165783) * i4) - 2100690944) + ((-281430247) * i3) + ((-820735536) * i11) + (i13 * 410367768) + (410367768 * i14) + ((-691798016) * i2) + ((-942931968) * i) + ((-1410334720) * i5) + (1251606528 * i16);
        int i18 = (i4 * 157034417) + 1376579869 + (i3 * 157036385) + (i11 * (-1968)) + (i13 * 984) + (i14 * 984) + (i2 * 157035401) + (i * (-982187909)) + (i5 * (-1869533796)) + (i16 * (-899022848));
        switch (i17 + (i18 * i18 * (-511311872))) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onWarmupCompleted(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                return asInterface(objArr);
            case 6:
                return IAuthTabCallbackStub(objArr);
            case 7:
                return IAuthTabCallbackDefault(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(RecyclerView.ViewHolder viewHolder) {
        int i = 2 % 2;
        int i2 = asBinder + 89;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess100 = access100(viewHolder);
        int i4 = asBinder + 69;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unitAccess100;
    }

    public static /* synthetic */ Unit onNavigationEvent(AppMsgReceiver2 appMsgReceiver2, access000 access000Var) {
        int i = 2 % 2;
        int i2 = asBinder + 25;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(appMsgReceiver2, access000Var);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(appMsgReceiver2, access000Var);
        int i3 = asBinder + 63;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(AppMsgReceiver2 appMsgReceiver2, access100 access100Var) {
        int i = 2 % 2;
        int i2 = asBinder + 99;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
        Unit unit = (Unit) onNavigationEvent(new Object[]{appMsgReceiver2, access100Var}, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), 1624044119, -1624044119, setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
        int i3 = asBinder + 11;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        AppMsgReceiver2 appMsgReceiver2 = (AppMsgReceiver2) objArr[0];
        IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy = (IAuthTabCallbackStubProxy) objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 67;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(appMsgReceiver2, iAuthTabCallbackStubProxy);
        }
        IAuthTabCallback(appMsgReceiver2, iAuthTabCallbackStubProxy);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(RecyclerView.ViewHolder viewHolder) {
        int i = 2 % 2;
        int i2 = asBinder + 49;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(viewHolder);
        if (i3 == 0) {
            int i4 = 59 / 0;
        }
        int i5 = asInterface + 75;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onWarmupCompleted(onRewardedAdCompleted onrewardedadcompleted, AppMsgReceiver2 appMsgReceiver2, asInterface asinterface) {
        int i = 2 % 2;
        int i2 = asInterface + 99;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        Unit unit = (Unit) onNavigationEvent(new Object[]{onrewardedadcompleted, appMsgReceiver2, asinterface}, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), -1072095395, 1072095402, setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
        int i4 = asBinder + 39;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(onRewardedAdCompleted onrewardedadcompleted, AppMsgReceiver2 appMsgReceiver2, onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = asBinder + 109;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        Unit unit = (Unit) onNavigationEvent(new Object[]{onrewardedadcompleted, appMsgReceiver2, onwarmupcompleted}, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), -1662230479, 1662230482, setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
        int i4 = asInterface + 63;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final class ICustomTabsCallbackDefault implements Function1<Object, Boolean> {
        public static final ICustomTabsCallbackDefault onNavigationEvent = new ICustomTabsCallbackDefault();

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof onWarmupCompleted);
        }
    }

    public static final class ICustomTabsCallbackStub implements Function1<Object, Boolean> {
        public static final ICustomTabsCallbackStub onWarmupCompleted = new ICustomTabsCallbackStub();

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof getInterfaceDescriptor);
        }
    }

    public static final class ICustomTabsCallbackStubProxy implements Function1<Object, Boolean> {
        public static final ICustomTabsCallbackStubProxy onWarmupCompleted = new ICustomTabsCallbackStubProxy();

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof IAuthTabCallbackStub);
        }
    }

    public static final class ICustomTabsCallback_Parcel implements Function1<Object, Boolean> {
        public static final ICustomTabsCallback_Parcel onNavigationEvent = new ICustomTabsCallback_Parcel();

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof IAuthTabCallbackStubProxy);
        }
    }

    public static final class ICustomTabsService implements Function1<Object, Boolean> {
        public static final ICustomTabsService IAuthTabCallback = new ICustomTabsService();

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof onExtraCallbackWithResult);
        }
    }

    public static final class extraCommand implements Function1<Object, Boolean> {
        public static final extraCommand onExtraCallbackWithResult = new extraCommand();

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof access100);
        }
    }

    public static final class mayLaunchUrl implements Function1<Object, Boolean> {
        public static final mayLaunchUrl onExtraCallback = new mayLaunchUrl();

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof asInterface);
        }
    }

    public static final class onRelationshipValidationResult implements Function1<Object, Boolean> {
        public static final onRelationshipValidationResult onNavigationEvent = new onRelationshipValidationResult();

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof access000);
        }
    }

    public static final class onUnminimized implements Function1<Object, Boolean> {
        public static final onUnminimized onNavigationEvent = new onUnminimized();

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof asBinder);
        }
    }

    public static final class IAuthTabCallback_Parcel implements getAdService {
        final /* synthetic */ Configuration IAuthTabCallback;

        public IAuthTabCallback_Parcel(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.IAuthTabCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class ICustomTabsCallback implements getAdService {
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public ICustomTabsCallback(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class extraCallback implements getAdService {
        final /* synthetic */ Configuration onNavigationEvent;

        public extraCallback(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class extraCallbackWithResult implements getAdService {
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public extraCallbackWithResult(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onActivityResized implements getAdService {
        final /* synthetic */ Configuration onWarmupCompleted;

        public onActivityResized(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onWarmupCompleted) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onMinimized implements getAdService {
        final /* synthetic */ Configuration onExtraCallback;

        public onMinimized(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class writeTypedObject implements getAdService {
        final /* synthetic */ Configuration onExtraCallback;

        public writeTypedObject(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onMessageChannelReady implements getAdService {
        final /* synthetic */ Configuration onNavigationEvent;

        public onMessageChannelReady(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onPostMessage implements getAdService {
        final /* synthetic */ Configuration onWarmupCompleted;

        public onPostMessage(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onWarmupCompleted) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class readTypedObject implements getAdService {
        final /* synthetic */ Configuration onWarmupCompleted;

        public readTypedObject(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onWarmupCompleted) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onActivityLayout implements Function1<Object, Boolean> {
        public static final onActivityLayout onExtraCallback = new onActivityLayout();

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof IAuthTabCallbackDefault);
        }
    }

    public onRewardedAdCompleted(@NotNull BaseActivity baseActivity, @NotNull onRewardedVideoCompleted onrewardedvideocompleted) {
        Intrinsics.checkNotNullParameter(baseActivity, "");
        Intrinsics.checkNotNullParameter(onrewardedvideocompleted, "");
        this.onNavigationEvent = baseActivity;
        this.IAuthTabCallback = onrewardedvideocompleted;
        onExtraCallbackWithResult(new access502.onNavigationEvent().onExtraCallbackWithResult(onUnminimized.onNavigationEvent).onNavigationEvent(R.layout.item_tds_top_v1_02).onExtraCallback(new NotificationSettingAdapter$.ExternalSyntheticLambda10()).IAuthTabCallback());
        onExtraCallbackWithResult(new access502.onNavigationEvent().onExtraCallbackWithResult(ICustomTabsCallbackStub.onWarmupCompleted).onNavigationEvent(R.layout.row_noti_setting_section).onExtraCallback(new NotificationSettingAdapter$.ExternalSyntheticLambda17()).IAuthTabCallback());
        onExtraCallbackWithResult(new access502.onNavigationEvent().onExtraCallbackWithResult(ICustomTabsCallbackStubProxy.onWarmupCompleted).onNavigationEvent(R.layout.row_setting_divider).onExtraCallback(new NotificationSettingAdapter$.ExternalSyntheticLambda18()).IAuthTabCallback());
        access502.onExtraCallbackWithResult onextracallbackwithresult = new access502.onExtraCallbackWithResult();
        int i = R.layout.item_tds_list_row_v1;
        onextracallbackwithresult.onWarmupCompleted(i);
        onextracallbackwithresult.onExtraCallbackWithResult(new NotificationSettingAdapter$.ExternalSyntheticLambda19());
        onextracallbackwithresult.IAuthTabCallback(new NotificationSettingAdapter$.ExternalSyntheticLambda20(this));
        if (onextracallbackwithresult.onWarmupCompleted() == null && onextracallbackwithresult.onNavigationEvent() == null) {
            int i2 = asInterface + 55;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                onextracallbackwithresult.onExtraCallback(onActivityLayout.onExtraCallback);
                int i3 = 48 / 0;
            } else {
                onextracallbackwithresult.onExtraCallback(onActivityLayout.onExtraCallback);
            }
            int i4 = 2 % 2;
        }
        onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallbackWithResult());
        onExtraCallbackWithResult(new access502.onNavigationEvent().onExtraCallbackWithResult(ICustomTabsCallbackDefault.onNavigationEvent).onNavigationEvent(i).onNavigationEvent(new NotificationSettingAdapter$.ExternalSyntheticLambda21()).onExtraCallback(new NotificationSettingAdapter$.ExternalSyntheticLambda22(this)).IAuthTabCallback());
        onExtraCallbackWithResult(new access502.onNavigationEvent().onExtraCallbackWithResult(onRelationshipValidationResult.onNavigationEvent).onNavigationEvent(i).onNavigationEvent(new NotificationSettingAdapter$.ExternalSyntheticLambda23()).onExtraCallback(new NotificationSettingAdapter$.ExternalSyntheticLambda24()).IAuthTabCallback());
        onExtraCallbackWithResult(new access502.onNavigationEvent().onExtraCallbackWithResult(ICustomTabsService.IAuthTabCallback).onNavigationEvent(i).onNavigationEvent(new NotificationSettingAdapter$.ExternalSyntheticLambda25()).onExtraCallback(new NotificationSettingAdapter$.ExternalSyntheticLambda11(this)).IAuthTabCallback());
        onExtraCallbackWithResult(new access502.onNavigationEvent().onExtraCallbackWithResult(mayLaunchUrl.onExtraCallback).onNavigationEvent(R.layout.row_noti_setting_marketing_info).onExtraCallback(new NotificationSettingAdapter$.ExternalSyntheticLambda12(this)).IAuthTabCallback());
        onExtraCallbackWithResult(new access502.onNavigationEvent().onExtraCallbackWithResult(extraCommand.onExtraCallbackWithResult).onNavigationEvent(i).onNavigationEvent(new NotificationSettingAdapter$.ExternalSyntheticLambda13()).onExtraCallback(new NotificationSettingAdapter$.ExternalSyntheticLambda14()).IAuthTabCallback());
        onExtraCallbackWithResult(new access502.onNavigationEvent().onExtraCallbackWithResult(ICustomTabsCallback_Parcel.onNavigationEvent).onNavigationEvent(i).onNavigationEvent(new NotificationSettingAdapter$.ExternalSyntheticLambda15()).onExtraCallback(new NotificationSettingAdapter$.ExternalSyntheticLambda16()).IAuthTabCallback());
        int i5 = asBinder + 63;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
    }

    public final BaseActivity onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder + 75;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        BaseActivity baseActivity = this.onNavigationEvent;
        int i5 = i3 + 77;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return baseActivity;
    }

    private static final Unit onNavigationEvent(AppMsgReceiver2 appMsgReceiver2, asBinder asbinder) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
        Intrinsics.checkNotNullParameter(asbinder, "");
        TdsTopV1T02View tdsTopV1T02View = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
        TdsTopV1T02View tdsTopV1T02View2 = null;
        if (tdsTopV1T02View instanceof TdsTopV1T02View) {
            int i2 = asBinder + 97;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                tdsTopV1T02View2.hashCode();
                throw null;
            }
            tdsTopV1T02View2 = tdsTopV1T02View;
        }
        if (tdsTopV1T02View2 != null) {
            int i3 = asInterface + 119;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            tdsTopV1T02View2.setText(tdsTopV1T02View.getContext().getString(asbinder.onNavigationEvent()));
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(AppMsgReceiver2 appMsgReceiver2, getInterfaceDescriptor getinterfacedescriptor) {
        int i = 2 % 2;
        int i2 = asInterface + 9;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
            Intrinsics.checkNotNullParameter(getinterfacedescriptor, "");
            Intrinsics.checkNotNull(((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent, "");
            getinterfacedescriptor.onExtraCallback().length();
            throw null;
        }
        Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
        Intrinsics.checkNotNullParameter(getinterfacedescriptor, "");
        TdsTopV1View tdsTopV1View = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
        Intrinsics.checkNotNull(tdsTopV1View, "");
        TdsTopV1View tdsTopV1View2 = tdsTopV1View;
        if (getinterfacedescriptor.onExtraCallback().length() > 0) {
            int i3 = asInterface + 75;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            tdsTopV1View2.setUpperType(TdsTopV1View.onExtraCallbackWithResult.TOP3);
            tdsTopV1View2.setLowerType(TdsTopV1View.onNavigationEvent.TOP6);
            tdsTopV1View2.setUpperText(getinterfacedescriptor.onExtraCallback());
            tdsTopV1View2.setLowerText(getinterfacedescriptor.onWarmupCompleted());
        } else if (getinterfacedescriptor.onWarmupCompleted() != null) {
            tdsTopV1View2.setUpperType(TdsTopV1View.onExtraCallbackWithResult.TOP6);
            TdsTopV1View tdsTopV1View3 = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
            Intrinsics.checkNotNull(tdsTopV1View3, "");
            tdsTopV1View3.setUpperText(getinterfacedescriptor.onWarmupCompleted());
        }
        Unit unit = Unit.INSTANCE;
        int i5 = asInterface + 99;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i3 = $10 + 33;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i5 = $11 + 103;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 25, (ViewConfiguration.getFadingEdgeLength() >> 16) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i7] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (IAuthTabCallbackStub ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0') + 60, 6383 - (ViewConfiguration.getJumpTapTimeout() >> 16), -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i8 = $10 + 63;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), 59 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 6383 - (ViewConfiguration.getScrollBarSize() >> 8), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    private static final Unit IAuthTabCallback(AppMsgReceiver2 appMsgReceiver2, IAuthTabCallbackStub iAuthTabCallbackStub) {
        int i = 2 % 2;
        int i2 = asInterface + 125;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
        if (iAuthTabCallbackStub.onNavigationEvent()) {
            View view = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(view, "");
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            Configuration configuration = resources.getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            view.setBackgroundColor(new getDEFAULT_CONNECTION_SPECSokhttp(new IAuthTabCallback_Parcel(configuration)).onExtraCallbackWithResult());
            int i4 = asBinder + 11;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        } else {
            View view2 = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(view2, "");
            Context context2 = view2.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Resources resources2 = context2.getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "");
            Configuration configuration2 = resources2.getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            view2.setBackgroundColor(new getDEFAULT_CONNECTION_SPECSokhttp(new ICustomTabsCallback(configuration2)).onWarmupCompleted());
        }
        return Unit.INSTANCE;
    }

    public static Unit onExtraCallbackWithResult(RecyclerView.ViewHolder viewHolder) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(viewHolder, "");
        TdsListRowV1View tdsListRowV1View = viewHolder.onNavigationEvent;
        Intrinsics.checkNotNull(tdsListRowV1View, "");
        TdsListRowV1View tdsListRowV1View2 = tdsListRowV1View;
        tdsListRowV1View2.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW2A);
        Context context = tdsListRowV1View2.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsListRowV1View2.setBackgroundColor(new getDEFAULT_CONNECTION_SPECSokhttp(new extraCallbackWithResult(configuration)).onWarmupCompleted());
        tdsListRowV1View2.setBorderType(ProtocolCompanion.FULL);
        Unit unit = Unit.INSTANCE;
        int i2 = asInterface + 77;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static Unit IAuthTabCallback(onRewardedAdCompleted onrewardedadcompleted, IAuthTabCallbackDefault iAuthTabCallbackDefault, UserTermsStateWithServiceInfoResponse userTermsStateWithServiceInfoResponse, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(userTermsStateWithServiceInfoResponse, "");
        onrewardedadcompleted.IAuthTabCallback.onWarmupCompleted().onExtraCallback(getWrite.IAuthTabCallback(new onRewardedInterstitialCompleted(userTermsStateWithServiceInfoResponse, iAuthTabCallbackDefault.onWarmupCompleted().IAuthTabCallback()), view));
        Unit unit = Unit.INSTANCE;
        int i2 = asBinder + 75;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    public static void IAuthTabCallback(onRewardedAdCompleted onrewardedadcompleted, TdsListRowV1View tdsListRowV1View, IAuthTabCallbackDefault iAuthTabCallbackDefault, View view) {
        int i = 2 % 2;
        BaseActivity baseActivity = onrewardedadcompleted.onNavigationEvent;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = tdsListRowV1View.getContext().getString(R.string.notification_setting_title);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String str = String.format(string, Arrays.copyOf(new Object[]{iAuthTabCallbackDefault.onWarmupCompleted().IAuthTabCallback()}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        new MultipleNotificationBottomSheet(baseActivity, str, iAuthTabCallbackDefault.onExtraCallbackWithResult(), new NotificationSettingAdapter$.ExternalSyntheticLambda9(onrewardedadcompleted, iAuthTabCallbackDefault)).show();
        int i2 = asBinder + 105;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    public static void onNavigationEvent(UserTermsStateWithServiceInfoResponse userTermsStateWithServiceInfoResponse, View view) {
        int i = 2 % 2;
        int i2 = asInterface + 49;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            String strOnExtraCallbackWithResult = userTermsStateWithServiceInfoResponse.onExtraCallbackWithResult();
            String strDecode = URLDecoder.decode(strOnExtraCallbackWithResult != null ? StringsKt.trim(strOnExtraCallbackWithResult).toString() : null, "utf-8");
            Intrinsics.checkNotNullExpressionValue(strDecode, "");
            String string = StringsKt.trim(strDecode).toString();
            Context context = view.getContext();
            LabActivity.IAuthTabCallback iAuthTabCallback = LabActivity.Companion;
            Context context2 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            context.startActivity(LabActivity.IAuthTabCallback.onNavigationEvent(iAuthTabCallback, context2, string, StringsKt.trim(userTermsStateWithServiceInfoResponse.asBinder()).toString(), (String) null, (String) null, false, false, false, 248, (Object) null));
            int i3 = asBinder + 99;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        userTermsStateWithServiceInfoResponse.onExtraCallbackWithResult();
        throw null;
    }

    public static void onNavigationEvent(UserTermsStateWithServiceInfoResponse userTermsStateWithServiceInfoResponse, onRewardedAdCompleted onrewardedadcompleted, CompoundButton compoundButton, boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 11;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(compoundButton, "");
        if (userTermsStateWithServiceInfoResponse.onNavigationEvent() == z) {
            return;
        }
        Object[] objArr = {userTermsStateWithServiceInfoResponse, Boolean.valueOf(z)};
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        UserTermsStateWithServiceInfoResponse.IAuthTabCallback(zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), objArr, iOnWarmupCompleted, -1388489091, zzgsa.onWarmupCompleted(), 1388489092);
        onrewardedadcompleted.IAuthTabCallback.onWarmupCompleted().onExtraCallback(getWrite.IAuthTabCallback(new onRewardedInterstitialCompleted(userTermsStateWithServiceInfoResponse, userTermsStateWithServiceInfoResponse.asBinder()), (Object) null));
        int i4 = asBinder + 9;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 91 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.Unit IAuthTabCallback(o.onRewardedAdCompleted r13, o.AppMsgReceiver2 r14, o.onRewardedAdCompleted.IAuthTabCallbackDefault r15) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onRewardedAdCompleted.IAuthTabCallback(o.onRewardedAdCompleted, o.AppMsgReceiver2, o.onRewardedAdCompleted$IAuthTabCallbackDefault):kotlin.Unit");
    }

    private static final Unit onTransact(RecyclerView.ViewHolder viewHolder) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(viewHolder, "");
        TdsListRowV1View tdsListRowV1View = viewHolder.onNavigationEvent;
        Intrinsics.checkNotNull(tdsListRowV1View, "");
        TdsListRowV1View tdsListRowV1View2 = tdsListRowV1View;
        Context context = tdsListRowV1View2.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsListRowV1View2.setBackgroundColor(new getDEFAULT_CONNECTION_SPECSokhttp(new writeTypedObject(configuration)).onWarmupCompleted());
        tdsListRowV1View2.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW1A);
        tdsListRowV1View2.setRightType(TdsListRowV1View.asBinder.ROW1A);
        tdsListRowV1View2.setRightArrow(true);
        Context context2 = tdsListRowV1View2.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration2 = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        tdsListRowV1View2.setCenterText1Color(new getUrlokhttp(new onMessageChannelReady(configuration2)).newSession());
        Unit unit = Unit.INSTANCE;
        int i2 = asInterface + 65;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 38 / 0;
        }
        return unit;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ onWarmupCompleted $item;
        final /* synthetic */ TdsListRowV1View $this_run;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(onWarmupCompleted onwarmupcompleted, TdsListRowV1View tdsListRowV1View, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$item = onwarmupcompleted;
            this.$this_run = tdsListRowV1View;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onNavigationEvent(this.$item, this.$this_run, access13800Var);
        }

        public final Object invokeSuspend(Object obj) {
            String strIAuthTabCallback;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                onWarmupCompleted onwarmupcompleted = this.$item;
                if (!(onwarmupcompleted instanceof onExtraCallback)) {
                    if (!(onwarmupcompleted instanceof onTransact)) {
                        return Unit.INSTANCE;
                    }
                    Function1<access13800<? super String>, Object> function1IAuthTabCallback = ((onTransact) onwarmupcompleted).IAuthTabCallback();
                    this.label = 1;
                    obj = function1IAuthTabCallback.invoke(this);
                    if (obj == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    strIAuthTabCallback = ((onExtraCallback) onwarmupcompleted).IAuthTabCallback();
                    SessionTrackerb.onExtraCallbackWithResult(resumeForClick.asBinder, this.$this_run.getContext(), strIAuthTabCallback, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
                    return Unit.INSTANCE;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            strIAuthTabCallback = (String) obj;
            SessionTrackerb.onExtraCallbackWithResult(resumeForClick.asBinder, this.$this_run.getContext(), strIAuthTabCallback, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
            return Unit.INSTANCE;
        }
    }

    public static void onExtraCallback(onWarmupCompleted onwarmupcompleted, onRewardedAdCompleted onrewardedadcompleted, TdsListRowV1View tdsListRowV1View, View view) {
        int i = 2 % 2;
        onwarmupcompleted.onWarmupCompleted().invoke();
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(onrewardedadcompleted.onNavigationEvent), (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(onwarmupcompleted, tdsListRowV1View, null), 3, (Object) null);
        int i2 = asBinder + 99;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 41 / 0;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        onRewardedAdCompleted onrewardedadcompleted = (onRewardedAdCompleted) objArr[0];
        AppMsgReceiver2 appMsgReceiver2 = (AppMsgReceiver2) objArr[1];
        onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) objArr[2];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        TdsListRowV1View tdsListRowV1View = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
        Intrinsics.checkNotNull(tdsListRowV1View, "");
        TdsListRowV1View tdsListRowV1View2 = tdsListRowV1View;
        tdsListRowV1View2.setCenterText1(onwarmupcompleted.onNavigationEvent());
        onwarmupcompleted.onExtraCallback().invoke();
        tdsListRowV1View2.setOnClickListener(new NotificationSettingAdapter$.ExternalSyntheticLambda4(onwarmupcompleted, onrewardedadcompleted, tdsListRowV1View2));
        Unit unit = Unit.INSTANCE;
        int i2 = asBinder + 93;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit asInterface(RecyclerView.ViewHolder viewHolder) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(viewHolder, "");
        TdsListRowV1View tdsListRowV1View = viewHolder.onNavigationEvent;
        Intrinsics.checkNotNull(tdsListRowV1View, "");
        TdsListRowV1View tdsListRowV1View2 = tdsListRowV1View;
        Context context = tdsListRowV1View2.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsListRowV1View2.setBackgroundColor(new getDEFAULT_CONNECTION_SPECSokhttp(new onActivityResized(configuration)).onWarmupCompleted());
        tdsListRowV1View2.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW1A);
        tdsListRowV1View2.setRightType(TdsListRowV1View.asBinder.ROW1A);
        tdsListRowV1View2.setRightArrow(true);
        Context context2 = tdsListRowV1View2.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration2 = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        tdsListRowV1View2.setCenterText1Color(new getUrlokhttp(new onPostMessage(configuration2)).newSession());
        Unit unit = Unit.INSTANCE;
        int i2 = asBinder + 111;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    public static void onExtraCallbackWithResult(access000 access000Var, TdsListRowV1View tdsListRowV1View, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 119;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Function0<Unit> function0OnExtraCallback = access000Var.onExtraCallback();
        if (function0OnExtraCallback != null) {
            function0OnExtraCallback.invoke();
        }
        Context context = tdsListRowV1View.getContext();
        Intent intent = new Intent(tdsListRowV1View.getContext(), access000Var.onNavigationEvent());
        Object[] objArr = new Object[1];
        a(new char[]{62145, 36271, 3111, 36029, 3877, 36764, 3584, 36494}, 32633 - (ViewConfiguration.getEdgeSlop() >> 16), objArr);
        intent.putExtra(((String) objArr[0]).intern(), "noti_setting");
        context.startActivity(intent);
        int i4 = asInterface + 113;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 52 / 0;
        }
    }

    private static final Unit IAuthTabCallback(AppMsgReceiver2 appMsgReceiver2, access000 access000Var) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
        Intrinsics.checkNotNullParameter(access000Var, "");
        TdsListRowV1View tdsListRowV1View = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
        Intrinsics.checkNotNull(tdsListRowV1View, "");
        TdsListRowV1View tdsListRowV1View2 = tdsListRowV1View;
        tdsListRowV1View2.setCenterText1(access000Var.onExtraCallbackWithResult());
        Function0<Unit> function0IAuthTabCallback = access000Var.IAuthTabCallback();
        if (function0IAuthTabCallback != null) {
            int i2 = asBinder + 47;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            function0IAuthTabCallback.invoke();
            int i4 = asBinder + 3;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }
        tdsListRowV1View2.setOnClickListener(new NotificationSettingAdapter$.ExternalSyntheticLambda6(access000Var, tdsListRowV1View2));
        Unit unit = Unit.INSTANCE;
        int i6 = asBinder + 67;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final Unit access100(RecyclerView.ViewHolder viewHolder) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(viewHolder, "");
        TdsListRowV1View tdsListRowV1View = viewHolder.onNavigationEvent;
        Intrinsics.checkNotNull(tdsListRowV1View, "");
        TdsListRowV1View tdsListRowV1View2 = tdsListRowV1View;
        Context context = tdsListRowV1View2.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsListRowV1View2.setBackgroundColor(new getDEFAULT_CONNECTION_SPECSokhttp(new onMinimized(configuration)).onWarmupCompleted());
        tdsListRowV1View2.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW1A);
        tdsListRowV1View2.setRightType(TdsListRowV1View.asBinder.SWITCH);
        Unit unit = Unit.INSTANCE;
        int i2 = asBinder + 69;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static Unit onExtraCallback(onExtraCallbackWithResult onextracallbackwithresult, boolean z, SetDetectableSize setDetectableSize) throws Throwable {
        String str;
        int i = 2 % 2;
        int i2 = asInterface + 11;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Map mapOnExtraCallback = setDetectableSize.onExtraCallback();
        Object[] objArr = new Object[1];
        a(new char[]{62151, 63547, 59169, 53765}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2800, objArr);
        mapOnExtraCallback.put(((String) objArr[0]).intern(), onextracallbackwithresult.onExtraCallback().onNavigationEvent());
        setDetectableSize.onExtraCallback().put("service", onextracallbackwithresult.onNavigationEvent());
        Map mapOnExtraCallback2 = setDetectableSize.onExtraCallback();
        if (z) {
            int i4 = asBinder + 63;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            str = "on";
        } else {
            str = "off";
        }
        mapOnExtraCallback2.put("on_off", str);
        Unit unit = Unit.INSTANCE;
        int i6 = asBinder + 5;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) objArr[0];
        onRewardedAdCompleted onrewardedadcompleted = (onRewardedAdCompleted) objArr[1];
        CompoundButton compoundButton = (CompoundButton) objArr[2];
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        int i = 2 % 2;
        int i2 = asBinder + 21;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(compoundButton, "");
            onextracallbackwithresult.onExtraCallback().onExtraCallbackWithResult();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(compoundButton, "");
        if (onextracallbackwithresult.onExtraCallback().onExtraCallbackWithResult() == zBooleanValue) {
            return null;
        }
        onextracallbackwithresult.onExtraCallback().onExtraCallback(zBooleanValue);
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1010663L, false, (String) null, (Map) null, new NotificationSettingAdapter$.ExternalSyntheticLambda8(onextracallbackwithresult, zBooleanValue), 14, (Object) null);
        if (!AdLoadAdConfig.onExtraCallback(onextracallbackwithresult.onNavigationEvent(), zBooleanValue)) {
            onrewardedadcompleted.IAuthTabCallback.onExtraCallbackWithResult().onExtraCallback(onextracallbackwithresult);
            int i3 = asBinder + 59;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        onrewardedadcompleted.IAuthTabCallback.onNavigationEvent().onExtraCallback(new onRewardedAdServerFailed(onextracallbackwithresult));
        int i5 = asBinder + 85;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        TdsListRowV1View tdsListRowV1View = (TdsListRowV1View) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 63;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        TdsSwitchV1View tdsSwitchV1View = (TdsSwitchV1View) TdsListRowV1View.IAuthTabCallback(new Object[]{tdsListRowV1View}, -1467355518, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1467355519, iOnNavigationEvent, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
        if (tdsSwitchV1View == null) {
            return null;
        }
        int i4 = asInterface + 99;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        tdsSwitchV1View.toggle();
        if (i5 != 0) {
            int i6 = 52 / 0;
        }
        int i7 = asInterface + 7;
        asBinder = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    private static final Unit onWarmupCompleted(onRewardedAdCompleted onrewardedadcompleted, AppMsgReceiver2 appMsgReceiver2, onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = asBinder + 95;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            TdsListRowV1View tdsListRowV1View = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
            Intrinsics.checkNotNull(tdsListRowV1View, "");
            TdsListRowV1View tdsListRowV1View2 = tdsListRowV1View;
            tdsListRowV1View2.setCenterText1(onextracallbackwithresult.onExtraCallback().IAuthTabCallback());
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        TdsListRowV1View tdsListRowV1View3 = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
        Intrinsics.checkNotNull(tdsListRowV1View3, "");
        TdsListRowV1View tdsListRowV1View4 = tdsListRowV1View3;
        tdsListRowV1View4.setCenterText1(onextracallbackwithresult.onExtraCallback().IAuthTabCallback());
        TdsSwitchV1View tdsSwitchV1View = (TdsSwitchV1View) TdsListRowV1View.IAuthTabCallback(new Object[]{tdsListRowV1View4}, -1467355518, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1467355519, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
        if (tdsSwitchV1View != null) {
            tdsSwitchV1View.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            int i3 = asInterface + 21;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
        }
        tdsListRowV1View4.setRightSwitchChecked(onextracallbackwithresult.onExtraCallback().onExtraCallbackWithResult(), false);
        TdsSwitchV1View tdsSwitchV1View2 = (TdsSwitchV1View) TdsListRowV1View.IAuthTabCallback(new Object[]{tdsListRowV1View4}, -1467355518, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1467355519, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
        if (tdsSwitchV1View2 != null) {
            tdsSwitchV1View2.setOnCheckedChangeListener(new NotificationSettingAdapter$.ExternalSyntheticLambda27(onextracallbackwithresult, onrewardedadcompleted));
            tdsSwitchV1View2.setEnabled(!onextracallbackwithresult.IAuthTabCallback());
            tdsSwitchV1View2.setClickable(false);
        }
        tdsListRowV1View4.setOnClickListener(new NotificationSettingAdapter$.ExternalSyntheticLambda28(tdsListRowV1View4));
        tdsListRowV1View4.setEnabled(!onextracallbackwithresult.IAuthTabCallback());
        return Unit.INSTANCE;
    }

    public static void onExtraCallbackWithResult(asInterface asinterface, onRewardedAdCompleted onrewardedadcompleted, TdsListRowV1View tdsListRowV1View, View view) throws UnsupportedEncodingException {
        int i = 2 % 2;
        asinterface.onExtraCallbackWithResult().invoke();
        Object obj = null;
        if (AdLoadAdConfig.onExtraCallback(asinterface.IAuthTabCallback(), !asinterface.onWarmupCompleted().asBinder())) {
            onrewardedadcompleted.IAuthTabCallback.onNavigationEvent().onExtraCallback(new onRewardedAdServerFailed((onExtraCallbackWithResult) null));
            return;
        }
        if (!asinterface.onWarmupCompleted().asBinder()) {
            int i2 = asBinder + 57;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                asinterface.onNavigationEvent();
                throw null;
            }
            Function0<Boolean> function0OnNavigationEvent = asinterface.onNavigationEvent();
            if (function0OnNavigationEvent != null && ((Boolean) function0OnNavigationEvent.invoke()).booleanValue()) {
                return;
            }
        }
        if (Intrinsics.areEqual(asinterface.onWarmupCompleted().onNavigationEvent(), "application/pdf")) {
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(onrewardedadcompleted.onNavigationEvent), putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new IAuthTabCallback(tdsListRowV1View, asinterface, onrewardedadcompleted, (access13800) null), 2, (Object) null);
            int i3 = asBinder + 81;
            asInterface = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        int i4 = asInterface + 23;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        String strDecode = URLDecoder.decode(StringsKt.trim(asinterface.onWarmupCompleted().onWarmupCompleted()).toString(), "utf-8");
        Intrinsics.checkNotNullExpressionValue(strDecode, "");
        getNavigationBar.IAuthTabCallback(MarketingTermsActivity.Companion.onWarmupCompleted(onrewardedadcompleted.onNavigationEvent, StringsKt.trim(strDecode).toString(), asinterface.onWarmupCompleted().asBinder(), asinterface.onWarmupCompleted().onTransact(), asinterface.IAuthTabCallback(), asinterface.onWarmupCompleted().onExtraCallback()), onrewardedadcompleted.onNavigationEvent, 1240);
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        String string;
        onRewardedAdCompleted onrewardedadcompleted = (onRewardedAdCompleted) objArr[0];
        AppMsgReceiver2 appMsgReceiver2 = (AppMsgReceiver2) objArr[1];
        asInterface asinterface = (asInterface) objArr[2];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
        Intrinsics.checkNotNullParameter(asinterface, "");
        int i2 = R.id.setting_item;
        TdsListRowV1View tdsListRowV1View = (TdsListRowV1View) appMsgReceiver2.onWarmupCompleted().get(i2);
        if (tdsListRowV1View == null) {
            tdsListRowV1View = (TdsListRowV1View) ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent.findViewById(i2);
            if (tdsListRowV1View != null) {
                appMsgReceiver2.onWarmupCompleted().put(i2, tdsListRowV1View);
            } else {
                appMsgReceiver2.onWarmupCompleted().remove(i2);
            }
        }
        if (tdsListRowV1View != null) {
            tdsListRowV1View.setCenterText1(asinterface.onWarmupCompleted().onTransact());
            if (asinterface.onWarmupCompleted().asBinder()) {
                int i3 = asInterface + 31;
                asBinder = i3 % 128;
                if (i3 % 2 != 0) {
                    string = tdsListRowV1View.getContext().getString(R.string.notification_setting_agree);
                    int i4 = 1 / 0;
                } else {
                    string = tdsListRowV1View.getContext().getString(R.string.notification_setting_agree);
                }
            } else {
                string = tdsListRowV1View.getContext().getString(R.string.notification_setting_denial);
            }
            tdsListRowV1View.setRightText1(string);
            tdsListRowV1View.setRightArrow(true);
            tdsListRowV1View.setOnClickListener(new NotificationSettingAdapter$.ExternalSyntheticLambda7(asinterface, onrewardedadcompleted, tdsListRowV1View));
        }
        Unit unit = Unit.INSTANCE;
        int i5 = asInterface + 19;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 53 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallbackStub(RecyclerView.ViewHolder viewHolder) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(viewHolder, "");
        TdsListRowV1View tdsListRowV1View = viewHolder.onNavigationEvent;
        Intrinsics.checkNotNull(tdsListRowV1View, "");
        TdsListRowV1View tdsListRowV1View2 = tdsListRowV1View;
        tdsListRowV1View2.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW1B);
        Context context = tdsListRowV1View2.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        Object[] objArr = {new getUrlokhttp(new readTypedObject(configuration))};
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        tdsListRowV1View2.setCenterText1Color(((Integer) getUrlokhttp.onNavigationEvent(objArr, 975054206, -975054198, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult())).intValue());
        tdsListRowV1View2.setEnabled(false);
        Unit unit = Unit.INSTANCE;
        int i2 = asBinder + 43;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        AppMsgReceiver2 appMsgReceiver2 = (AppMsgReceiver2) objArr[0];
        access100 access100Var = (access100) objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 81;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
        Intrinsics.checkNotNullParameter(access100Var, "");
        TdsListRowV1View tdsListRowV1View = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
        Intrinsics.checkNotNull(tdsListRowV1View, "");
        tdsListRowV1View.setCenterText1(access100Var.IAuthTabCallback());
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 81;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackDefault(RecyclerView.ViewHolder viewHolder) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(viewHolder, "");
        TdsListRowV1View tdsListRowV1View = viewHolder.onNavigationEvent;
        Intrinsics.checkNotNull(tdsListRowV1View, "");
        TdsListRowV1View tdsListRowV1View2 = tdsListRowV1View;
        Context context = tdsListRowV1View2.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsListRowV1View2.setBackgroundColor(new getDEFAULT_CONNECTION_SPECSokhttp(new extraCallback(configuration)).onWarmupCompleted());
        tdsListRowV1View2.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW1A);
        tdsListRowV1View2.setRightType(TdsListRowV1View.asBinder.ROW1A);
        tdsListRowV1View2.setRightArrow(true);
        Unit unit = Unit.INSTANCE;
        int i2 = asInterface + 11;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static void IAuthTabCallback(TdsListRowV1View tdsListRowV1View, View view) {
        int i = 2 % 2;
        FirebaseMessaging.getInstance().deleteToken();
        CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(tdsListRowV1View.getContext(), new NotificationSettingAdapter$.ExternalSyntheticLambda5());
        int i2 = asBinder + 25;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 65 / 0;
        }
    }

    public static Unit IAuthTabCallback(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = asInterface + 47;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        AppLovinError.Companion.onExtraCallbackWithResult().IAuthTabCallback(true);
        return Unit.INSTANCE;
    }

    public static Unit onExtraCallbackWithResult(CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1081265451, new Object[]{commonModule_setLeftEdgeTouchEnabled, false}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1081265446, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(commonModule_setLeftEdgeTouchEnabled.onWarmupCompleted().getString(R.string.notification_setting_reset_push_token_dialog_message));
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, commonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(new NotificationSettingAdapter$.ExternalSyntheticLambda0())};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = asBinder + 29;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(AppMsgReceiver2 appMsgReceiver2, IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallbackStubProxy, "");
        TdsListRowV1View tdsListRowV1View = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
        Intrinsics.checkNotNull(tdsListRowV1View, "");
        TdsListRowV1View tdsListRowV1View2 = tdsListRowV1View;
        tdsListRowV1View2.setCenterText1(iAuthTabCallbackStubProxy.onNavigationEvent());
        tdsListRowV1View2.setOnClickListener(new NotificationSettingAdapter$.ExternalSyntheticLambda26(tdsListRowV1View2));
        Unit unit = Unit.INSTANCE;
        int i2 = asInterface + 89;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 28 / 0;
        }
        return unit;
    }

    public static final class asInterface {
        private final Term IAuthTabCallback;
        private final Function0<Boolean> onExtraCallback;
        private final Function0<Unit> onExtraCallbackWithResult;
        private final String onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof asInterface)) {
                return false;
            }
            asInterface asinterface = (asInterface) obj;
            return Intrinsics.areEqual(this.onNavigationEvent, asinterface.onNavigationEvent) && Intrinsics.areEqual(this.IAuthTabCallback, asinterface.IAuthTabCallback) && Intrinsics.areEqual(this.onExtraCallbackWithResult, asinterface.onExtraCallbackWithResult) && Intrinsics.areEqual(this.onExtraCallback, asinterface.onExtraCallback);
        }

        public int hashCode() {
            int iHashCode = this.onNavigationEvent.hashCode();
            int iHashCode2 = this.IAuthTabCallback.hashCode();
            int iHashCode3 = this.onExtraCallbackWithResult.hashCode();
            Function0<Boolean> function0 = this.onExtraCallback;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (function0 == null ? 0 : function0.hashCode());
        }

        public String toString() {
            return "AffiliateTerm(companyKey=" + this.onNavigationEvent + ", term=" + this.IAuthTabCallback + ", onClickHook=" + this.onExtraCallbackWithResult + ", onConsentClick=" + this.onExtraCallback + ")";
        }

        public asInterface(@NotNull String str, @NotNull Term term, @NotNull Function0<Unit> function0, @Nullable Function0<Boolean> function02) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(term, "");
            Intrinsics.checkNotNullParameter(function0, "");
            this.onNavigationEvent = str;
            this.IAuthTabCallback = term;
            this.onExtraCallbackWithResult = function0;
            this.onExtraCallback = function02;
        }

        public final String IAuthTabCallback() {
            return this.onNavigationEvent;
        }

        public final Term onWarmupCompleted() {
            return this.IAuthTabCallback;
        }

        public final Function0<Unit> onExtraCallbackWithResult() {
            return this.onExtraCallbackWithResult;
        }

        public final Function0<Boolean> onNavigationEvent() {
            return this.onExtraCallback;
        }
    }

    public static final class onExtraCallbackWithResult {
        private final boolean onExtraCallbackWithResult;
        private final Setting onNavigationEvent;
        private final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                return false;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            return Intrinsics.areEqual(this.onWarmupCompleted, onextracallbackwithresult.onWarmupCompleted) && Intrinsics.areEqual(this.onNavigationEvent, onextracallbackwithresult.onNavigationEvent) && this.onExtraCallbackWithResult == onextracallbackwithresult.onExtraCallbackWithResult;
        }

        public int hashCode() {
            return (((this.onWarmupCompleted.hashCode() * 31) + this.onNavigationEvent.hashCode()) * 31) + Boolean.hashCode(this.onExtraCallbackWithResult);
        }

        public String toString() {
            return "AffiliateSetting(companyKey=" + this.onWarmupCompleted + ", setting=" + this.onNavigationEvent + ", isMaintenance=" + this.onExtraCallbackWithResult + ")";
        }

        public onExtraCallbackWithResult(@NotNull String str, @NotNull Setting setting, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(setting, "");
            this.onWarmupCompleted = str;
            this.onNavigationEvent = setting;
            this.onExtraCallbackWithResult = z;
        }

        public final boolean IAuthTabCallback() {
            return this.onExtraCallbackWithResult;
        }

        public final Setting onExtraCallback() {
            return this.onNavigationEvent;
        }

        public final String onNavigationEvent() {
            return this.onWarmupCompleted;
        }
    }

    public static final class access100 {
        private final String IAuthTabCallback;

        public access100(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.IAuthTabCallback = str;
        }

        public final String IAuthTabCallback() {
            return this.IAuthTabCallback;
        }
    }

    public static final class getInterfaceDescriptor {
        private final String IAuthTabCallback;
        private final String onNavigationEvent;

        public getInterfaceDescriptor(@NotNull String str, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onNavigationEvent = str;
            this.IAuthTabCallback = str2;
        }

        public /* synthetic */ getInterfaceDescriptor(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        public final String onExtraCallback() {
            return this.onNavigationEvent;
        }

        public final String onWarmupCompleted() {
            return this.IAuthTabCallback;
        }
    }

    public static final class IAuthTabCallbackStub {
        private final boolean IAuthTabCallback;

        public IAuthTabCallbackStub() {
            this(false, 1, null);
        }

        public IAuthTabCallbackStub(boolean z) {
            this.IAuthTabCallback = z;
        }

        public /* synthetic */ IAuthTabCallbackStub(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z);
        }

        public final boolean onNavigationEvent() {
            return this.IAuthTabCallback;
        }
    }

    public static final class access000 {
        private final Class<? extends BaseActivity> IAuthTabCallback;
        private final Function0<Unit> onExtraCallback;
        private final String onExtraCallbackWithResult;
        private final Function0<Unit> onNavigationEvent;

        public access000(@NotNull String str, @NotNull Class<? extends BaseActivity> cls, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function02) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(cls, "");
            this.onExtraCallbackWithResult = str;
            this.IAuthTabCallback = cls;
            this.onExtraCallback = function0;
            this.onNavigationEvent = function02;
        }

        public /* synthetic */ access000(String str, Class cls, Function0 function0, Function0 function02, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, cls, (i & 4) != 0 ? null : function0, (i & 8) != 0 ? null : function02);
        }

        public final String onExtraCallbackWithResult() {
            return this.onExtraCallbackWithResult;
        }

        public final Class<? extends BaseActivity> onNavigationEvent() {
            return this.IAuthTabCallback;
        }

        public final Function0<Unit> onExtraCallback() {
            return this.onExtraCallback;
        }

        public final Function0<Unit> IAuthTabCallback() {
            return this.onNavigationEvent;
        }
    }

    public static final class onExtraCallback implements onWarmupCompleted {
        private final Function0<Unit> IAuthTabCallback;
        private final String onExtraCallback;
        private final String onExtraCallbackWithResult;
        private final Function0<Unit> onNavigationEvent;

        public onExtraCallback(@NotNull String str, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(function02, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.onExtraCallback = str;
            this.onNavigationEvent = function0;
            this.IAuthTabCallback = function02;
            this.onExtraCallbackWithResult = str2;
        }

        @Override // o.onRewardedAdCompleted.onWarmupCompleted
        public String onNavigationEvent() {
            return this.onExtraCallback;
        }

        @Override // o.onRewardedAdCompleted.onWarmupCompleted
        public Function0<Unit> onWarmupCompleted() {
            return this.onNavigationEvent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit asBinder() {
            return Unit.INSTANCE;
        }

        @Override // o.onRewardedAdCompleted.onWarmupCompleted
        public Function0<Unit> onExtraCallback() {
            return this.IAuthTabCallback;
        }

        public final String IAuthTabCallback() {
            return this.onExtraCallbackWithResult;
        }
    }

    public static final class onTransact implements onWarmupCompleted {
        private final Function0<Unit> IAuthTabCallback;
        private final Function1<access13800<? super String>, Object> onExtraCallback;
        private final String onExtraCallbackWithResult;
        private final Function0<Unit> onWarmupCompleted;

        public onTransact(@NotNull String str, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function1<? super access13800<? super String>, ? extends Object> function1) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(function02, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallbackWithResult = str;
            this.IAuthTabCallback = function0;
            this.onWarmupCompleted = function02;
            this.onExtraCallback = function1;
        }

        @Override // o.onRewardedAdCompleted.onWarmupCompleted
        public String onNavigationEvent() {
            return this.onExtraCallbackWithResult;
        }

        @Override // o.onRewardedAdCompleted.onWarmupCompleted
        public Function0<Unit> onWarmupCompleted() {
            return this.IAuthTabCallback;
        }

        @Override // o.onRewardedAdCompleted.onWarmupCompleted
        public Function0<Unit> onExtraCallback() {
            return this.onWarmupCompleted;
        }

        public final Function1<access13800<? super String>, Object> IAuthTabCallback() {
            return this.onExtraCallback;
        }
    }

    public static final class IAuthTabCallbackStubProxy {
        private final String onWarmupCompleted;

        public IAuthTabCallbackStubProxy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onWarmupCompleted = str;
        }

        public final String onNavigationEvent() {
            return this.onWarmupCompleted;
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(AppMsgReceiver2 appMsgReceiver2, IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy) {
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(new Object[]{appMsgReceiver2, iAuthTabCallbackStubProxy}, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), 2042262039, -2042262038, setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    public static void onExtraCallback(TdsListRowV1View tdsListRowV1View, View view) {
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        onNavigationEvent(new Object[]{tdsListRowV1View, view}, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), 1771166296, -1771166291, setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    public static void IAuthTabCallback(onExtraCallbackWithResult onextracallbackwithresult, onRewardedAdCompleted onrewardedadcompleted, CompoundButton compoundButton, boolean z) {
        Object[] objArr = {onextracallbackwithresult, onrewardedadcompleted, compoundButton, Boolean.valueOf(z)};
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        onNavigationEvent(objArr, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), 978992583, -978992577, setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    public static /* synthetic */ Unit onNavigationEvent(onRewardedAdCompleted onrewardedadcompleted, AppMsgReceiver2 appMsgReceiver2, onExtraCallbackWithResult onextracallbackwithresult) {
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(new Object[]{onrewardedadcompleted, appMsgReceiver2, onextracallbackwithresult}, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), 521361736, -521361734, setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    public static /* synthetic */ Unit IAuthTabCallback(RecyclerView.ViewHolder viewHolder) {
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(new Object[]{viewHolder}, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), 2144832862, -2144832858, setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    private static final Unit IAuthTabCallback(onRewardedAdCompleted onrewardedadcompleted, AppMsgReceiver2 appMsgReceiver2, asInterface asinterface) {
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(new Object[]{onrewardedadcompleted, appMsgReceiver2, asinterface}, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), -1072095395, 1072095402, setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    private static final Unit onExtraCallbackWithResult(AppMsgReceiver2 appMsgReceiver2, access100 access100Var) {
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(new Object[]{appMsgReceiver2, access100Var}, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), 1624044119, -1624044119, setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    private static final Unit onExtraCallback(onRewardedAdCompleted onrewardedadcompleted, AppMsgReceiver2 appMsgReceiver2, onWarmupCompleted onwarmupcompleted) {
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(new Object[]{onrewardedadcompleted, appMsgReceiver2, onwarmupcompleted}, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), -1662230479, 1662230482, setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }
}
