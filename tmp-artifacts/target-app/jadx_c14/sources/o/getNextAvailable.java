package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.LinearInterpolator;
import android.widget.CompoundButton;
import android.widget.ExpandableListView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.Synchronized;
import im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity;
import im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.component.atom.switches.TdsSwitchV1View;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.textbutton.TdsTextButtonV0View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.uikit.widget.list.TdsListHeaderV1T02View;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import o.AppMsgReceiver2;
import o.access502;
import o.fromInstagram;
import o.getNextAvailable;
import o.markAsUnused;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.main.WebViewActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getNextAvailable extends exitAllPages<Object> {
    public static final int onNavigationEvent = exitAllPages.onExtraCallbackWithResult;
    private final onExtraCallbackWithResult IAuthTabCallback;

    public static final class IAuthTabCallback extends markAsUnused {
    }

    public static final class IAuthTabCallbackDefault extends markAsUnused {
    }

    public interface onExtraCallbackWithResult {
        void onExtraCallbackWithResult(@NotNull markAsUnused markasunused);

        void onNavigationEvent(@NotNull markAsUnused markasunused);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public getNextAvailable() {
        onExtraCallbackWithResult onextracallbackwithresult = null;
        this(onextracallbackwithresult, 1, onextracallbackwithresult);
    }

    public static final class IAuthTabCallbackStub implements getAdService {
        final /* synthetic */ Configuration onWarmupCompleted;

        public IAuthTabCallbackStub(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onWarmupCompleted) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onTransact implements getAdService {
        final /* synthetic */ Configuration onNavigationEvent;

        public onTransact(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class IAuthTabCallbackStubProxy implements getAdService {
        final /* synthetic */ Configuration IAuthTabCallback;

        public IAuthTabCallbackStubProxy(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.IAuthTabCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class access000 implements getAdService {
        final /* synthetic */ Configuration onNavigationEvent;

        public access000(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class asBinder implements getAdService {
        final /* synthetic */ Configuration IAuthTabCallback;

        public asBinder(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.IAuthTabCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class asInterface implements getAdService {
        final /* synthetic */ Configuration onNavigationEvent;

        public asInterface(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class getInterfaceDescriptor implements getAdService {
        final /* synthetic */ Configuration IAuthTabCallback;

        public getInterfaceDescriptor(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.IAuthTabCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class IAuthTabCallback_Parcel implements Function1<Object, Boolean> {
        public static final IAuthTabCallback_Parcel IAuthTabCallback = new IAuthTabCallback_Parcel();

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof fromInstagram);
        }
    }

    public static final class ICustomTabsCallback implements Function1<Object, Boolean> {
        public static final ICustomTabsCallback IAuthTabCallback = new ICustomTabsCallback();

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof onWarmupCompleted);
        }
    }

    public static final class access100 implements Function1<Object, Boolean> {
        public static final access100 onWarmupCompleted = new access100();

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof SkiaPooledImageRegionDecoderDecoderPool);
        }
    }

    public static final class extraCallback implements Function1<Object, Boolean> {
        public static final extraCallback onNavigationEvent = new extraCallback();

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof IAuthTabCallback);
        }
    }

    public static final class extraCallbackWithResult implements Function1<Object, Boolean> {
        public static final extraCallbackWithResult IAuthTabCallback = new extraCallbackWithResult();

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof IAuthTabCallbackDefault);
        }
    }

    public static final class onActivityResized implements Function1<Object, Boolean> {
        public static final onActivityResized onWarmupCompleted = new onActivityResized();

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof markAsUnused);
        }
    }

    public static final class readTypedObject implements Function1<Object, Boolean> {
        public static final readTypedObject onNavigationEvent = new readTypedObject();

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof onNavigationEvent);
        }
    }

    public static final class writeTypedObject implements Function1<Object, Boolean> {
        public static final writeTypedObject onNavigationEvent = new writeTypedObject();

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof onExtraCallback);
        }
    }

    public getNextAvailable(@Nullable onExtraCallbackWithResult onextracallbackwithresult) {
        this.IAuthTabCallback = onextracallbackwithresult;
        setHasStableIds(true);
        access502.onExtraCallbackWithResult onextracallbackwithresult2 = new access502.onExtraCallbackWithResult();
        onextracallbackwithresult2.onWarmupCompleted(R.layout.row_setting_divider);
        if (onextracallbackwithresult2.onWarmupCompleted() == null && onextracallbackwithresult2.onNavigationEvent() == null) {
            onextracallbackwithresult2.onExtraCallback(access100.onWarmupCompleted);
        }
        onExtraCallbackWithResult(onextracallbackwithresult2.onExtraCallbackWithResult());
        access502.onExtraCallbackWithResult onextracallbackwithresult3 = new access502.onExtraCallbackWithResult();
        onextracallbackwithresult3.onWarmupCompleted(R.layout.row_setting_section);
        onextracallbackwithresult3.IAuthTabCallback(new Function2() { // from class: viva.republica.toss.main.more.AppSettingAdapter$$ExternalSyntheticLambda2
            public final Object invoke(Object obj, Object obj2) {
                return getNextAvailable.onWarmupCompleted((AppMsgReceiver2) obj, (fromInstagram) obj2);
            }
        });
        if (onextracallbackwithresult3.onWarmupCompleted() == null && onextracallbackwithresult3.onNavigationEvent() == null) {
            onextracallbackwithresult3.onExtraCallback(IAuthTabCallback_Parcel.IAuthTabCallback);
        }
        onExtraCallbackWithResult(onextracallbackwithresult3.onExtraCallbackWithResult());
        access502.onExtraCallbackWithResult onextracallbackwithresult4 = new access502.onExtraCallbackWithResult();
        onextracallbackwithresult4.onWarmupCompleted(R.layout.row_setting_version);
        onextracallbackwithresult4.IAuthTabCallback(new Function2() { // from class: viva.republica.toss.main.more.AppSettingAdapter$$ExternalSyntheticLambda3
            public final Object invoke(Object obj, Object obj2) {
                return getNextAvailable.onExtraCallbackWithResult((AppMsgReceiver2) obj, (getNextAvailable.IAuthTabCallbackDefault) obj2);
            }
        });
        if (onextracallbackwithresult4.onWarmupCompleted() == null && onextracallbackwithresult4.onNavigationEvent() == null) {
            onextracallbackwithresult4.onExtraCallback(extraCallbackWithResult.IAuthTabCallback);
        }
        onExtraCallbackWithResult(onextracallbackwithresult4.onExtraCallbackWithResult());
        access502.onExtraCallbackWithResult onextracallbackwithresult5 = new access502.onExtraCallbackWithResult();
        onextracallbackwithresult5.onWarmupCompleted(R.layout.row_setting_opensource_license);
        onextracallbackwithresult5.IAuthTabCallback(new Function2() { // from class: viva.republica.toss.main.more.AppSettingAdapter$$ExternalSyntheticLambda4
            public final Object invoke(Object obj, Object obj2) {
                return getNextAvailable.IAuthTabCallback(this.f$0, (AppMsgReceiver2) obj, (getNextAvailable.onWarmupCompleted) obj2);
            }
        });
        if (onextracallbackwithresult5.onWarmupCompleted() == null && onextracallbackwithresult5.onNavigationEvent() == null) {
            onextracallbackwithresult5.onExtraCallback(ICustomTabsCallback.IAuthTabCallback);
        }
        onExtraCallbackWithResult(onextracallbackwithresult5.onExtraCallbackWithResult());
        access502.onExtraCallbackWithResult onextracallbackwithresult6 = new access502.onExtraCallbackWithResult();
        int i = R.layout.item_tds_list_row_v1;
        onextracallbackwithresult6.onWarmupCompleted(i);
        onextracallbackwithresult6.onExtraCallbackWithResult(new Function1() { // from class: viva.republica.toss.main.more.AppSettingAdapter$$ExternalSyntheticLambda5
            public final Object invoke(Object obj) {
                return getNextAvailable.onExtraCallback((RecyclerView.ViewHolder) obj);
            }
        });
        onextracallbackwithresult6.IAuthTabCallback(new Function2() { // from class: viva.republica.toss.main.more.AppSettingAdapter$$ExternalSyntheticLambda6
            public final Object invoke(Object obj, Object obj2) {
                return getNextAvailable.onNavigationEvent(this.f$0, (AppMsgReceiver2) obj, (getNextAvailable.onExtraCallback) obj2);
            }
        });
        if (onextracallbackwithresult6.onWarmupCompleted() == null && onextracallbackwithresult6.onNavigationEvent() == null) {
            onextracallbackwithresult6.onExtraCallback(writeTypedObject.onNavigationEvent);
        }
        onExtraCallbackWithResult(onextracallbackwithresult6.onExtraCallbackWithResult());
        access502.onExtraCallbackWithResult onextracallbackwithresult7 = new access502.onExtraCallbackWithResult();
        onextracallbackwithresult7.onWarmupCompleted(i);
        onextracallbackwithresult7.onExtraCallbackWithResult(new Function1() { // from class: viva.republica.toss.main.more.AppSettingAdapter$$ExternalSyntheticLambda7
            public final Object invoke(Object obj) {
                return getNextAvailable.IAuthTabCallback((RecyclerView.ViewHolder) obj);
            }
        });
        onextracallbackwithresult7.IAuthTabCallback(new Function2() { // from class: viva.republica.toss.main.more.AppSettingAdapter$$ExternalSyntheticLambda8
            public final Object invoke(Object obj, Object obj2) {
                return getNextAvailable.onNavigationEvent(this.f$0, (AppMsgReceiver2) obj, (getNextAvailable.IAuthTabCallback) obj2);
            }
        });
        if (onextracallbackwithresult7.onWarmupCompleted() == null && onextracallbackwithresult7.onNavigationEvent() == null) {
            onextracallbackwithresult7.onExtraCallback(extraCallback.onNavigationEvent);
        }
        onExtraCallbackWithResult(onextracallbackwithresult7.onExtraCallbackWithResult());
        access502.onExtraCallbackWithResult onextracallbackwithresult8 = new access502.onExtraCallbackWithResult();
        onextracallbackwithresult8.onWarmupCompleted(R.layout.row_setting_transfer_auth_method_help);
        onextracallbackwithresult8.IAuthTabCallback(new Function2() { // from class: viva.republica.toss.main.more.AppSettingAdapter$$ExternalSyntheticLambda9
            public final Object invoke(Object obj, Object obj2) {
                return getNextAvailable.onExtraCallback((AppMsgReceiver2) obj, (getNextAvailable.onNavigationEvent) obj2);
            }
        });
        if (onextracallbackwithresult8.onWarmupCompleted() == null && onextracallbackwithresult8.onNavigationEvent() == null) {
            onextracallbackwithresult8.onExtraCallback(readTypedObject.onNavigationEvent);
        }
        onExtraCallbackWithResult(onextracallbackwithresult8.onExtraCallbackWithResult());
        access502.onExtraCallbackWithResult onextracallbackwithresult9 = new access502.onExtraCallbackWithResult();
        onextracallbackwithresult9.onWarmupCompleted(R.layout.row_setting_item_v2);
        onextracallbackwithresult9.onExtraCallbackWithResult(new Function1() { // from class: viva.republica.toss.main.more.AppSettingAdapter$$ExternalSyntheticLambda10
            public final Object invoke(Object obj) {
                return getNextAvailable.onWarmupCompleted((RecyclerView.ViewHolder) obj);
            }
        });
        onextracallbackwithresult9.IAuthTabCallback(new Function2() { // from class: viva.republica.toss.main.more.AppSettingAdapter$$ExternalSyntheticLambda11
            public final Object invoke(Object obj, Object obj2) {
                return getNextAvailable.IAuthTabCallback(this.f$0, (AppMsgReceiver2) obj, (markAsUnused) obj2);
            }
        });
        if (onextracallbackwithresult9.onWarmupCompleted() == null && onextracallbackwithresult9.onNavigationEvent() == null) {
            onextracallbackwithresult9.onExtraCallback(onActivityResized.onWarmupCompleted);
        }
        onExtraCallbackWithResult(onextracallbackwithresult9.onExtraCallbackWithResult());
    }

    public /* synthetic */ getNextAvailable(onExtraCallbackWithResult onextracallbackwithresult, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : onextracallbackwithresult);
    }

    public static Unit onWarmupCompleted(AppMsgReceiver2 appMsgReceiver2, fromInstagram frominstagram) {
        Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
        Intrinsics.checkNotNullParameter(frominstagram, "");
        TdsListHeaderV1T02View tdsListHeaderV1T02View = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
        Intrinsics.checkNotNull(tdsListHeaderV1T02View, "");
        TdsListHeaderV1T02View tdsListHeaderV1T02View2 = tdsListHeaderV1T02View;
        tdsListHeaderV1T02View2.setTitle(frominstagram.onExtraCallbackWithResult());
        tdsListHeaderV1T02View2.onWarmupCompleted().onNavigationEvent(response.Bold);
        Context context = tdsListHeaderV1T02View2.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsListHeaderV1T02View2.setTitleColor(new getUrlokhttp(new asBinder(configuration)).onRelationshipValidationResult());
        tdsListHeaderV1T02View2.onNavigationEvent(tdsListHeaderV1T02View2.getResources().getDimensionPixelSize(im.toss.uikit.R.dimen.list_divider_left_margin_24));
        return Unit.INSTANCE;
    }

    public static Unit onExtraCallbackWithResult(AppMsgReceiver2 appMsgReceiver2, IAuthTabCallbackDefault iAuthTabCallbackDefault) {
        Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallbackDefault, "");
        View view = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
        Intrinsics.checkNotNull(view, "");
        ((TextView) view).setText(iAuthTabCallbackDefault.IAuthTabCallbackStubProxy() + iAuthTabCallbackDefault.asBinder());
        return Unit.INSTANCE;
    }

    public static Unit IAuthTabCallback(final getNextAvailable getnextavailable, AppMsgReceiver2 appMsgReceiver2, final onWarmupCompleted onwarmupcompleted) {
        Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        int i = R.id.text_button;
        TdsTextButtonV0View tdsTextButtonV0ViewFindViewById = (TdsTextButtonV0View) appMsgReceiver2.onWarmupCompleted().get(i);
        if (tdsTextButtonV0ViewFindViewById == null) {
            tdsTextButtonV0ViewFindViewById = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent.findViewById(i);
            if (tdsTextButtonV0ViewFindViewById != null) {
                appMsgReceiver2.onWarmupCompleted().put(i, tdsTextButtonV0ViewFindViewById);
            } else {
                appMsgReceiver2.onWarmupCompleted().remove(i);
            }
        }
        if (tdsTextButtonV0ViewFindViewById != null) {
            tdsTextButtonV0ViewFindViewById.setText(onwarmupcompleted.IAuthTabCallbackStubProxy());
            tdsTextButtonV0ViewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.main.more.AppSettingAdapter$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    getNextAvailable.IAuthTabCallback(onwarmupcompleted, getnextavailable, view);
                }
            });
            onExtraCallbackWithResult onextracallbackwithresult = getnextavailable.IAuthTabCallback;
            if (onextracallbackwithresult != null) {
                onextracallbackwithresult.onExtraCallbackWithResult(onwarmupcompleted);
            }
        }
        return Unit.INSTANCE;
    }

    public static void IAuthTabCallback(onWarmupCompleted onwarmupcompleted, getNextAvailable getnextavailable, View view) {
        Function0<Unit> function0OnWarmupCompleted = onwarmupcompleted.onWarmupCompleted();
        if (function0OnWarmupCompleted != null) {
            function0OnWarmupCompleted.invoke();
        }
        onExtraCallbackWithResult onextracallbackwithresult = getnextavailable.IAuthTabCallback;
        if (onextracallbackwithresult != null) {
            onextracallbackwithresult.onNavigationEvent(onwarmupcompleted);
        }
    }

    public static final class onWarmupCompleted extends markAsUnused {
        private static int $10 = 0;
        private static int $11 = 1;
        private static long onExtraCallback = -5019395644070465755L;
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public static /* synthetic */ Unit onExtraCallback(Context context) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 109;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnWarmupCompleted = onWarmupCompleted(context);
            int i4 = onExtraCallbackWithResult + 119;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unitOnWarmupCompleted;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i3 = $11 + 65;
                $10 = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(""), 25 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 19627 - (Process.myPid() >> 22), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() | (onExtraCallback % 5407414049857832247L);
                        Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') - '0'), 60 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), ExpandableListView.getPackedPositionChild(0L) + 6384, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                    Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), 24 - (ViewConfiguration.getScrollBarSize() >> 8), 19627 - (ViewConfiguration.getTouchSlop() >> 8), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (onExtraCallback ^ 5407414049857832247L);
                    Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 59 - View.MeasureSpec.getMode(0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
            }
            char[] cArr2 = new char[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i6 = $10 + 23;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), 58 - Process.getGidForName(""), 6384 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr2);
        }

        private static final Unit onWarmupCompleted(Context context) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 23;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            WebViewActivity.onExtraCallback onextracallback = WebViewActivity.Companion;
            Object[] objArr = new Object[1];
            a(new char[]{60026, 32769, 16040, 54615, 17405, 65067, 37975, 748, 47449, 22520, 49764, 30735, 5801, 36187, 15300, 54837, 19478, 64170, 37215, 4036, 47664, 20488, 52901, 25980, 5084, 36476, 9237, 53984, 18788, 59265, 37426}, 27239 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr);
            context.startActivity(WebViewActivity.onExtraCallback.onExtraCallback(onextracallback, context, ((String) objArr[0]).intern(), true, false, 8, null));
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 79;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 38 / 0;
            }
            return unit;
        }
    }

    public static Unit onExtraCallback(RecyclerView.ViewHolder viewHolder) {
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
        tdsListRowV1View2.setBackgroundColor(new getDEFAULT_CONNECTION_SPECSokhttp(new onTransact(configuration)).onWarmupCompleted());
        tdsListRowV1View2.setLeftType(TdsListRowV1View.asInterface.IMAGE);
        tdsListRowV1View2.setLeftImageTransformation(new PluginInfo(40.0f, 0.0f, 0.0f, (Integer) null, 0, (Integer) null, 60, (DefaultConstructorMarker) null));
        tdsListRowV1View2.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW2C);
        tdsListRowV1View2.setRightType(TdsListRowV1View.asBinder.ROW1A);
        tdsListRowV1View2.setRightArrow(true);
        return Unit.INSTANCE;
    }

    public static Unit onNavigationEvent(final getNextAvailable getnextavailable, AppMsgReceiver2 appMsgReceiver2, final onExtraCallback onextracallback) {
        Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        TdsListRowV1View tdsListRowV1View = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
        Intrinsics.checkNotNull(tdsListRowV1View, "");
        TdsListRowV1View tdsListRowV1View2 = tdsListRowV1View;
        tdsListRowV1View2.setCenterText1(onextracallback.IAuthTabCallbackStubProxy());
        tdsListRowV1View2.setCenterText2(onextracallback.asBinder());
        String strOnExtraCallback = onextracallback.onExtraCallback();
        if (strOnExtraCallback != null) {
            tdsListRowV1View2.setLeftImage(strOnExtraCallback);
        }
        tdsListRowV1View2.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.main.more.AppSettingAdapter$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                getNextAvailable.onExtraCallback(onextracallback, getnextavailable, view);
            }
        });
        onExtraCallbackWithResult onextracallbackwithresult = getnextavailable.IAuthTabCallback;
        if (onextracallbackwithresult != null) {
            onextracallbackwithresult.onExtraCallbackWithResult(onextracallback);
        }
        return Unit.INSTANCE;
    }

    public static void onExtraCallback(onExtraCallback onextracallback, getNextAvailable getnextavailable, View view) {
        Function0<Unit> function0OnWarmupCompleted = onextracallback.onWarmupCompleted();
        if (function0OnWarmupCompleted != null) {
            function0OnWarmupCompleted.invoke();
        }
        onExtraCallbackWithResult onextracallbackwithresult = getnextavailable.IAuthTabCallback;
        if (onextracallbackwithresult != null) {
            onextracallbackwithresult.onNavigationEvent(onextracallback);
        }
    }

    public static Unit IAuthTabCallback(RecyclerView.ViewHolder viewHolder) {
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
        tdsListRowV1View2.setBackgroundColor(new getDEFAULT_CONNECTION_SPECSokhttp(new IAuthTabCallbackStub(configuration)).onWarmupCompleted());
        tdsListRowV1View2.setLeftType(TdsListRowV1View.asInterface.NONE);
        tdsListRowV1View2.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW1A);
        Context context2 = tdsListRowV1View2.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration2 = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        tdsListRowV1View2.setCenterText1Color(new getUrlokhttp(new asInterface(configuration2)).ICustomTabsCallbackStubProxy());
        tdsListRowV1View2.setRightType(TdsListRowV1View.asBinder.ROW1A);
        Context context3 = tdsListRowV1View2.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        Configuration configuration3 = context3.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration3, "");
        tdsListRowV1View2.setRightText1Color(((Integer) setHeadersokhttp.onExtraCallbackWithResult(-552023978, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{new getUrlokhttp(new getInterfaceDescriptor(configuration3)).requestPostMessageChannel()}, matches.onExtraCallback(), 552023983, matches.onExtraCallback())).intValue());
        tdsListRowV1View2.setRightArrow(true);
        return Unit.INSTANCE;
    }

    public static Unit onNavigationEvent(final getNextAvailable getnextavailable, AppMsgReceiver2 appMsgReceiver2, final IAuthTabCallback iAuthTabCallback) {
        Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        TdsListRowV1View tdsListRowV1View = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
        Intrinsics.checkNotNull(tdsListRowV1View, "");
        TdsListRowV1View tdsListRowV1View2 = tdsListRowV1View;
        tdsListRowV1View2.setCenterText1(iAuthTabCallback.IAuthTabCallbackStubProxy());
        tdsListRowV1View2.setRightText1(iAuthTabCallback.asBinder());
        tdsListRowV1View2.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.main.more.AppSettingAdapter$$ExternalSyntheticLambda12
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                getNextAvailable.onWarmupCompleted(iAuthTabCallback, getnextavailable, view);
            }
        });
        onExtraCallbackWithResult onextracallbackwithresult = getnextavailable.IAuthTabCallback;
        if (onextracallbackwithresult != null) {
            onextracallbackwithresult.onExtraCallbackWithResult(iAuthTabCallback);
        }
        return Unit.INSTANCE;
    }

    public static void onWarmupCompleted(IAuthTabCallback iAuthTabCallback, getNextAvailable getnextavailable, View view) {
        Function0<Unit> function0OnWarmupCompleted = iAuthTabCallback.onWarmupCompleted();
        if (function0OnWarmupCompleted != null) {
            function0OnWarmupCompleted.invoke();
        }
        onExtraCallbackWithResult onextracallbackwithresult = getnextavailable.IAuthTabCallback;
        if (onextracallbackwithresult != null) {
            onextracallbackwithresult.onNavigationEvent(iAuthTabCallback);
        }
    }

    public static Unit onExtraCallback(AppMsgReceiver2 appMsgReceiver2, onNavigationEvent onnavigationevent) {
        Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        int i = R.id.transfer_auth_method_help_text;
        TextView textView = (TextView) appMsgReceiver2.onWarmupCompleted().get(i);
        if (textView == null) {
            textView = (TextView) ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent.findViewById(i);
            if (textView != null) {
                appMsgReceiver2.onWarmupCompleted().put(i, textView);
            } else {
                appMsgReceiver2.onWarmupCompleted().remove(i);
            }
        }
        if (textView != null) {
            textView.setText(onnavigationevent.onNavigationEvent());
        }
        return Unit.INSTANCE;
    }

    public static Unit onWarmupCompleted(RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        TdsListRowV1View tdsListRowV1ViewFindViewById = viewHolder.onNavigationEvent.findViewById(R.id.setting_item);
        if (tdsListRowV1ViewFindViewById != null) {
            BaseTextView baseTextViewICustomTabsCallbackDefault = tdsListRowV1ViewFindViewById.ICustomTabsCallbackDefault();
            if (baseTextViewICustomTabsCallbackDefault != null) {
                baseTextViewICustomTabsCallbackDefault.setSingleLine(false);
                baseTextViewICustomTabsCallbackDefault.setMaxLines(2);
            }
            DisplayMetrics displayMetrics = viewHolder.onNavigationEvent.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            int iOnNavigationEvent = varyMatches.onNavigationEvent(16, displayMetrics);
            DisplayMetrics displayMetrics2 = viewHolder.onNavigationEvent.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
            int iOnNavigationEvent2 = varyMatches.onNavigationEvent(16, displayMetrics2);
            DisplayMetrics displayMetrics3 = viewHolder.onNavigationEvent.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
            tdsListRowV1ViewFindViewById.setPadding(varyMatches.onNavigationEvent(24, displayMetrics3), iOnNavigationEvent, 0, iOnNavigationEvent2);
        }
        return Unit.INSTANCE;
    }

    public static Unit IAuthTabCallback(final getNextAvailable getnextavailable, AppMsgReceiver2 appMsgReceiver2, final markAsUnused markasunused) {
        Integer num;
        String str;
        onExtraCallbackWithResult onextracallbackwithresult;
        Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
        Intrinsics.checkNotNullParameter(markasunused, "");
        final TdsListRowV1View tdsListRowV1ViewFindViewById = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent.findViewById(R.id.setting_item);
        if (tdsListRowV1ViewFindViewById != null) {
            boolean z = markasunused.IAuthTabCallback() == 44;
            boolean z2 = markasunused.IAuthTabCallback() == 1200;
            boolean z3 = markasunused.IAuthTabCallback() == 5601;
            boolean z4 = markasunused.IAuthTabCallbackStub() != null;
            boolean z5 = markasunused.asInterface() != null;
            boolean z6 = markasunused.onWarmupCompleted() != null;
            String strAsBinder = markasunused.asBinder();
            boolean z7 = strAsBinder == null || StringsKt.isBlank(strAsBinder);
            if (markasunused.IAuthTabCallbackStub() == null) {
                num = 1;
                if (markasunused.asInterface() != null) {
                    if (markasunused.IAuthTabCallbackDefault()) {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String string = tdsListRowV1ViewFindViewById.getContext().getString(R.string.app_setting_content_description_switch_on);
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        String strIAuthTabCallbackStubProxy = markasunused.IAuthTabCallbackStubProxy();
                        String strAsBinder2 = markasunused.asBinder();
                        if (strAsBinder2 == null) {
                            strAsBinder2 = "";
                        }
                        str = String.format(string, Arrays.copyOf(new Object[]{strIAuthTabCallbackStubProxy + " " + strAsBinder2}, 1));
                        Intrinsics.checkNotNullExpressionValue(str, "");
                    } else {
                        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                        String string2 = tdsListRowV1ViewFindViewById.getContext().getString(R.string.app_setting_content_description_switch_off);
                        Intrinsics.checkNotNullExpressionValue(string2, "");
                        String strIAuthTabCallbackStubProxy2 = markasunused.IAuthTabCallbackStubProxy();
                        String strAsBinder3 = markasunused.asBinder();
                        if (strAsBinder3 == null) {
                            strAsBinder3 = "";
                        }
                        str = String.format(string2, Arrays.copyOf(new Object[]{strIAuthTabCallbackStubProxy2 + " " + strAsBinder3}, 1));
                        Intrinsics.checkNotNullExpressionValue(str, "");
                    }
                } else if (markasunused.IAuthTabCallback() != 44) {
                    StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                    String string3 = tdsListRowV1ViewFindViewById.getContext().getString(R.string.app_setting_content_description_button);
                    Intrinsics.checkNotNullExpressionValue(string3, "");
                    String strIAuthTabCallbackStubProxy3 = markasunused.IAuthTabCallbackStubProxy();
                    String strAsBinder4 = markasunused.asBinder();
                    if (strAsBinder4 == null) {
                        strAsBinder4 = "";
                    }
                    str = String.format(string3, Arrays.copyOf(new Object[]{strIAuthTabCallbackStubProxy3 + " " + strAsBinder4}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "");
                } else if (markasunused.onWarmupCompleted() == null) {
                    String strIAuthTabCallbackStubProxy4 = markasunused.IAuthTabCallbackStubProxy();
                    String strAsBinder5 = markasunused.asBinder();
                    if (strAsBinder5 == null) {
                        strAsBinder5 = "";
                    }
                    str = strIAuthTabCallbackStubProxy4 + " " + strAsBinder5;
                } else {
                    StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
                    String string4 = tdsListRowV1ViewFindViewById.getContext().getString(R.string.app_setting_content_description_button);
                    Intrinsics.checkNotNullExpressionValue(string4, "");
                    String strIAuthTabCallbackStubProxy5 = markasunused.IAuthTabCallbackStubProxy();
                    String strAsBinder6 = markasunused.asBinder();
                    if (strAsBinder6 == null) {
                        strAsBinder6 = "";
                    }
                    str = String.format(string4, Arrays.copyOf(new Object[]{strIAuthTabCallbackStubProxy5 + " " + strAsBinder6}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "");
                }
            } else if (markasunused.onTransact() || markasunused.IAuthTabCallbackStub() == null) {
                num = 1;
                String strIAuthTabCallbackStubProxy6 = markasunused.IAuthTabCallbackStubProxy();
                String strAsBinder7 = markasunused.asBinder();
                if (strAsBinder7 == null) {
                    strAsBinder7 = "";
                }
                str = strIAuthTabCallbackStubProxy6 + " " + strAsBinder7;
            } else {
                StringCompanionObject stringCompanionObject5 = StringCompanionObject.INSTANCE;
                String string5 = tdsListRowV1ViewFindViewById.getContext().getString(R.string.app_setting_content_description_button);
                Intrinsics.checkNotNullExpressionValue(string5, "");
                String strIAuthTabCallbackStubProxy7 = markasunused.IAuthTabCallbackStubProxy();
                String strAsBinder8 = markasunused.asBinder();
                num = 1;
                str = String.format(string5, Arrays.copyOf(new Object[]{strIAuthTabCallbackStubProxy7 + " " + (strAsBinder8 == null ? "" : strAsBinder8)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "");
            }
            tdsListRowV1ViewFindViewById.setContentDescription(str);
            TdsListRowV1View.onExtraCallbackWithResult onextracallbackwithresult2 = (z || z2 || z3 || z7) ? TdsListRowV1View.onExtraCallbackWithResult.ROW1A : TdsListRowV1View.onExtraCallbackWithResult.ROW2A;
            tdsListRowV1ViewFindViewById.setCenterType(onextracallbackwithresult2);
            tdsListRowV1ViewFindViewById.setCenterText1(markasunused.IAuthTabCallbackStubProxy());
            BaseTextView baseTextViewICustomTabsCallbackDefault = tdsListRowV1ViewFindViewById.ICustomTabsCallbackDefault();
            if (baseTextViewICustomTabsCallbackDefault != null) {
                ShareInviteHelper.onExtraCallback(baseTextViewICustomTabsCallbackDefault, markasunused.access100(), setDeeplinkPath.TOP, 0, 4, (Object) null);
            }
            Context context = tdsListRowV1ViewFindViewById.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            tdsListRowV1ViewFindViewById.setCenterText1Color(new getUrlokhttp(new access000(configuration)).ICustomTabsCallbackStubProxy());
            tdsListRowV1ViewFindViewById.setRightType(z5 ? TdsListRowV1View.asBinder.SWITCH : TdsListRowV1View.asBinder.ROW1A);
            tdsListRowV1ViewFindViewById.setCenterText2("");
            tdsListRowV1ViewFindViewById.setRightText1("");
            if (!z7) {
                if (z || z2 || z3) {
                    tdsListRowV1ViewFindViewById.setRightText1(markasunused.asBinder());
                } else {
                    tdsListRowV1ViewFindViewById.setCenterText2(markasunused.asBinder());
                }
            }
            if (z4) {
                tdsListRowV1ViewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.main.more.AppSettingAdapter$$ExternalSyntheticLambda13
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        getNextAvailable.onExtraCallback(markasunused, getnextavailable, view);
                    }
                });
            } else if (z5) {
                final TdsSwitchV1View tdsSwitchV1View = (TdsSwitchV1View) TdsListRowV1View.IAuthTabCallback(new Object[]{tdsListRowV1ViewFindViewById}, -1467355518, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1467355519, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
                if (tdsSwitchV1View != null) {
                    tdsSwitchV1View.setCheckedState(markasunused.IAuthTabCallbackDefault(), false);
                    tdsSwitchV1View.setEnabled(markasunused.onExtraCallbackWithResult());
                    tdsSwitchV1View.setClickable(false);
                    tdsSwitchV1View.setFocusable(false);
                    tdsSwitchV1View.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: viva.republica.toss.main.more.AppSettingAdapter$$ExternalSyntheticLambda14
                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
                            getNextAvailable.onWarmupCompleted(markasunused, tdsListRowV1ViewFindViewById, compoundButton, z8);
                        }
                    });
                    tdsSwitchV1View.setChecked(markasunused.IAuthTabCallbackDefault(), false);
                    tdsListRowV1ViewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.main.more.AppSettingAdapter$$ExternalSyntheticLambda15
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            getNextAvailable.onExtraCallbackWithResult(tdsSwitchV1View, getnextavailable, markasunused, view);
                        }
                    });
                }
            } else if (z || z2) {
                if (z2) {
                    BaseTextView baseTextView = (BaseTextView) TdsListRowV1View.IAuthTabCallback(new Object[]{tdsListRowV1ViewFindViewById}, -1111713185, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1111713194, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
                    if (baseTextView != null) {
                        Context context2 = tdsListRowV1ViewFindViewById.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "");
                        Configuration configuration2 = context2.getResources().getConfiguration();
                        Intrinsics.checkNotNullExpressionValue(configuration2, "");
                        baseTextView.setTextColor(((Integer) setHeadersokhttp.onExtraCallbackWithResult(-552023978, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{new getUrlokhttp(new IAuthTabCallbackStubProxy(configuration2)).requestPostMessageChannel()}, matches.onExtraCallback(), 552023983, matches.onExtraCallback())).intValue());
                    }
                }
                tdsListRowV1ViewFindViewById.setClickable(z6);
                if (z6) {
                    tdsListRowV1ViewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.main.more.AppSettingAdapter$$ExternalSyntheticLambda16
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            getNextAvailable.onExtraCallbackWithResult(markasunused, getnextavailable, view);
                        }
                    });
                }
            } else {
                BaseTextView baseTextViewICustomTabsCallbackStubProxy = tdsListRowV1ViewFindViewById.ICustomTabsCallbackStubProxy();
                if (baseTextViewICustomTabsCallbackStubProxy != null) {
                    baseTextViewICustomTabsCallbackStubProxy.setSingleLine(false);
                    baseTextViewICustomTabsCallbackStubProxy.setMaxLines(2);
                }
                tdsListRowV1ViewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.main.more.AppSettingAdapter$$ExternalSyntheticLambda17
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        getNextAvailable.onNavigationEvent(markasunused, getnextavailable, view);
                    }
                });
            }
            tdsListRowV1ViewFindViewById.setRightArrow((!z6 || z4 || z5) ? false : true);
            if (z6 && (onextracallbackwithresult = getnextavailable.IAuthTabCallback) != null) {
                onextracallbackwithresult.onExtraCallbackWithResult(markasunused);
            }
            tdsListRowV1ViewFindViewById.setEnabled(markasunused.onExtraCallbackWithResult());
        } else {
            num = 1;
        }
        int i = R.id.guide_frame;
        View viewFindViewById = (View) appMsgReceiver2.onWarmupCompleted().get(i);
        if (viewFindViewById == null) {
            viewFindViewById = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent.findViewById(i);
            if (viewFindViewById != null) {
                appMsgReceiver2.onWarmupCompleted().put(i, viewFindViewById);
            } else {
                appMsgReceiver2.onWarmupCompleted().remove(i);
            }
        }
        View view = viewFindViewById;
        if (view != null) {
            view.setVisibility(markasunused.onNavigationEvent() ? 0 : 8);
            if (markasunused.onNavigationEvent()) {
                isFireOS.onExtraCallbackWithResult((Rally) Rally.onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -2128644225, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{(Rally) RallysKt.onWarmupCompleted(new Object[]{view, isMuted.onNavigationEvent((AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, new Object[]{RallysKt.onExtraCallback(new LinearInterpolator(), 1000), 600}, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), Float.valueOf(1.0f), Float.valueOf(0.0f), (Function1) null, 4, (Object) null), num, null, 0, null, null, Boolean.FALSE, 0, 0L, false, 1912, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), null, new Function0() { // from class: viva.republica.toss.main.more.AppSettingAdapter$$ExternalSyntheticLambda18
                    public final Object invoke() {
                        return getNextAvailable.IAuthTabCallback(markasunused, getnextavailable);
                    }
                }, num, null}, 2128644226), false, 1, (Object) null);
            }
        }
        return Unit.INSTANCE;
    }

    public static void onExtraCallback(markAsUnused markasunused, getNextAvailable getnextavailable, View view) {
        Function0<Unit> function0IAuthTabCallbackStub;
        if (!markasunused.onTransact() && (function0IAuthTabCallbackStub = markasunused.IAuthTabCallbackStub()) != null) {
            function0IAuthTabCallbackStub.invoke();
        }
        onExtraCallbackWithResult onextracallbackwithresult = getnextavailable.IAuthTabCallback;
        if (onextracallbackwithresult != null) {
            onextracallbackwithresult.onNavigationEvent(markasunused);
        }
    }

    public static void onWarmupCompleted(markAsUnused markasunused, TdsListRowV1View tdsListRowV1View, CompoundButton compoundButton, boolean z) {
        String str;
        Intrinsics.checkNotNullParameter(compoundButton, "");
        if (markasunused.asInterface() != null) {
            if (z) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String string = tdsListRowV1View.getContext().getString(viva.republica.toss.R.string.app_setting_content_description_switch_on);
                Intrinsics.checkNotNullExpressionValue(string, "");
                String strIAuthTabCallbackStubProxy = markasunused.IAuthTabCallbackStubProxy();
                String strAsBinder = markasunused.asBinder();
                if (strAsBinder == null) {
                    strAsBinder = "";
                }
                str = String.format(string, Arrays.copyOf(new Object[]{strIAuthTabCallbackStubProxy + " " + strAsBinder}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "");
            } else {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                String string2 = tdsListRowV1View.getContext().getString(viva.republica.toss.R.string.app_setting_content_description_switch_off);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                String strIAuthTabCallbackStubProxy2 = markasunused.IAuthTabCallbackStubProxy();
                String strAsBinder2 = markasunused.asBinder();
                if (strAsBinder2 == null) {
                    strAsBinder2 = "";
                }
                str = String.format(string2, Arrays.copyOf(new Object[]{strIAuthTabCallbackStubProxy2 + " " + strAsBinder2}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "");
            }
            tdsListRowV1View.setContentDescription(str);
        }
        Function2<markAsUnused, Boolean, Unit> function2AsInterface = markasunused.asInterface();
        if (function2AsInterface != null) {
            function2AsInterface.invoke(markasunused, Boolean.valueOf(z));
        }
    }

    public static void onExtraCallbackWithResult(TdsSwitchV1View tdsSwitchV1View, getNextAvailable getnextavailable, markAsUnused markasunused, View view) {
        tdsSwitchV1View.toggle();
        onExtraCallbackWithResult onextracallbackwithresult = getnextavailable.IAuthTabCallback;
        if (onextracallbackwithresult != null) {
            onextracallbackwithresult.onNavigationEvent(markasunused);
        }
    }

    public static void onExtraCallbackWithResult(markAsUnused markasunused, getNextAvailable getnextavailable, View view) {
        Function0<Unit> function0OnWarmupCompleted = markasunused.onWarmupCompleted();
        if (function0OnWarmupCompleted != null) {
            function0OnWarmupCompleted.invoke();
        }
        onExtraCallbackWithResult onextracallbackwithresult = getnextavailable.IAuthTabCallback;
        if (onextracallbackwithresult != null) {
            onextracallbackwithresult.onNavigationEvent(markasunused);
        }
    }

    public static void onNavigationEvent(markAsUnused markasunused, getNextAvailable getnextavailable, View view) {
        Function0<Unit> function0OnWarmupCompleted = markasunused.onWarmupCompleted();
        if (function0OnWarmupCompleted != null) {
            function0OnWarmupCompleted.invoke();
        }
        onExtraCallbackWithResult onextracallbackwithresult = getnextavailable.IAuthTabCallback;
        if (onextracallbackwithresult != null) {
            onextracallbackwithresult.onNavigationEvent(markasunused);
        }
    }

    public static Unit IAuthTabCallback(markAsUnused markasunused, getNextAvailable getnextavailable) {
        markasunused.onExtraCallbackWithResult(false);
        getnextavailable.onExtraCallbackWithResult(markasunused);
        return Unit.INSTANCE;
    }

    public long getItemId(int i) {
        int iHashCode;
        Object obj = onExtraCallbackWithResult().get(i);
        if (obj instanceof markAsUnused) {
            iHashCode = ((markAsUnused) obj).IAuthTabCallback();
        } else {
            if (obj instanceof onNavigationEvent) {
                return -5601L;
            }
            iHashCode = obj.hashCode();
        }
        return iHashCode;
    }

    public final void onExtraCallbackWithResult(@NotNull markAsUnused markasunused) {
        Intrinsics.checkNotNullParameter(markasunused, "");
        int iIndexOf = onExtraCallbackWithResult().indexOf(markasunused);
        if (iIndexOf >= 0) {
            notifyItemChanged(iIndexOf);
        }
    }

    public static final class onExtraCallback extends markAsUnused {
        private String onExtraCallback;

        public final String onExtraCallback() {
            return this.onExtraCallback;
        }
    }

    public static final class onNavigationEvent {
        public static final onExtraCallback Companion = new onExtraCallback(null);
        public static final int onExtraCallbackWithResult = 8;
        private final CharSequence onExtraCallback;

        public static final class onExtraCallback {
            public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private onExtraCallback() {
            }
        }

        public onNavigationEvent(@NotNull CharSequence charSequence) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            this.onExtraCallback = charSequence;
        }

        public final CharSequence onNavigationEvent() {
            return this.onExtraCallback;
        }
    }
}
