package viva.republica.toss.guest.underFourteen;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.core.workerservice.WorkerService$Companion$;
import im.toss.tds.view.component.atom.text.Typography2;
import im.toss.uikit.widget.list.ServiceRow;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import o.AppLovinSdkInitializationConfigurationImpl;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CMS_SignedDataWithHash;
import o.ConvertFloatArrayToByteArray;
import o.GeckoHubImp;
import o.LifecyclesKtawaitStarted21;
import o.ParamUtils;
import o.PlayerErrorCode;
import o.SessionTrackerb;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.TrackGroupExternalSyntheticLambda0;
import o.access13800;
import o.access14000;
import o.access14300;
import o.deserializeUriNullableCollection;
import o.findResAndMsg;
import o.getAdService;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.maybeUpdateAnimatable;
import o.putCount;
import o.readIntokhttp;
import o.setRandomHost;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.guest.underFourteen.UnderFourteenMainActivity$;
import viva.republica.toss.main.more.notification.NotificationSettingAdapter$$ExternalSyntheticLambda2;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UnderFourteenMainActivity extends Hilt_UnderFourteenMainActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onWarmupCompleted Companion;
    private static char[] IAuthTabCallbackDefault = null;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access100 = 0;
    public static final int asBinder;
    private static int getInterfaceDescriptor = 1;
    private static int onTransact;

    @Inject
    public AppLovinSdkInitializationConfigurationImpl inbox;

    @Inject
    public SessionTrackerb tossRouter;
    private final Lazy asInterface = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onNavigationEvent(this));
    private boolean IAuthTabCallbackStub = true;

    static {
        setEngagementSignalsCallback();
        Companion = new onWarmupCompleted(null);
        asBinder = 8;
        int i = access100 + 111;
        IAuthTabCallback_Parcel = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        UnderFourteenMainActivity underFourteenMainActivity = (UnderFourteenMainActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 15;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return asInterface(underFourteenMainActivity, view);
        }
        asInterface(underFourteenMainActivity, view);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [android.app.Activity, viva.republica.toss.guest.underFourteen.UnderFourteenMainActivity] */
    public static /* synthetic */ Object IAuthTabCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) throws Throwable {
        SessionTrackerb sessionTrackerbOnNavigationEvent;
        String strIntern;
        boolean z;
        Function1 function1;
        Bundle bundle;
        boolean z2;
        int i7;
        int i8 = ~i6;
        int i9 = ~i3;
        int i10 = ~(i8 | i9);
        int i11 = ~(i6 | i3);
        int i12 = i10 | i11 | (~(i6 | i4));
        int i13 = i9 | i6;
        int i14 = (~((~i4) | i6)) | i11;
        int i15 = i6 + i3 + i5 + (111814883 * i2) + (1975835455 * i);
        int i16 = i15 * i15;
        int i17 = (((-1960851331) * i6) - 1583611904) + (47848387 * i3) + (i12 * (-2101222338)) + ((-92522620) * i13) + ((-2101222338) * i14) + ((-2053373952) * i5) + ((-648806400) * i2) + (1432616960 * i) + (442957824 * i16);
        int i18 = ((i6 * 961080817) - 60187382) + (i3 * 961079119) + (i12 * 566) + (i13 * (-1132)) + (i14 * 566) + (i5 * 961079685) + (i2 * 1618335983) + (i * 193609403) + (i16 * 1988296704);
        int i19 = i17 + (i18 * i18 * 176226304);
        if (i19 != 1) {
            return i19 != 2 ? i19 != 3 ? i19 != 4 ? onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr) : onWarmupCompleted(objArr);
        }
        ?? r1 = (UnderFourteenMainActivity) objArr[0];
        View view = (View) objArr[1];
        int i20 = 2 % 2;
        int i21 = onTransact + 119;
        getInterfaceDescriptor = i21 % 128;
        if (i21 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            sessionTrackerbOnNavigationEvent = r1.onNavigationEvent();
            Object[] objArr2 = new Object[1];
            a(new int[]{27, 20, 0, 0}, false, new byte[]{1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0}, objArr2);
            strIntern = ((String) objArr2[0]).intern();
            z = true;
            function1 = null;
            bundle = null;
            z2 = false;
            i7 = 103;
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            sessionTrackerbOnNavigationEvent = r1.onNavigationEvent();
            Object[] objArr3 = new Object[1];
            a(new int[]{27, 20, 0, 0}, false, new byte[]{1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0}, objArr3);
            strIntern = ((String) objArr3[0]).intern();
            z = false;
            function1 = null;
            bundle = null;
            z2 = false;
            i7 = 60;
        }
        SessionTrackerb.IAuthTabCallback(sessionTrackerbOnNavigationEvent, (Activity) r1, strIntern, z, function1, bundle, z2, i7, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i22 = onTransact + 105;
        getInterfaceDescriptor = i22 % 128;
        int i23 = i22 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(UnderFourteenMainActivity underFourteenMainActivity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 115;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(underFourteenMainActivity, view);
        if (i3 != 0) {
            int i4 = 90 / 0;
        }
        int i5 = getInterfaceDescriptor + 111;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(UnderFourteenMainActivity underFourteenMainActivity, Integer num) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 37;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(underFourteenMainActivity, num);
        int i4 = onTransact + 53;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 53;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        asBinder(function1, obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(UnderFourteenMainActivity underFourteenMainActivity, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 109;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return asBinder(underFourteenMainActivity, view);
        }
        asBinder(underFourteenMainActivity, view);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Throwable th) {
        int i = 2 % 2;
        int i2 = onTransact + 111;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(th);
        int i4 = onTransact + 15;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unitOnTransact;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        UnderFourteenMainActivity underFourteenMainActivity = (UnderFourteenMainActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 9;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        Unit unit = (Unit) IAuthTabCallback(new Object[]{underFourteenMainActivity, view}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 2073642548, iIAuthTabCallback, iIAuthTabCallback2, -2073642547);
        int i4 = getInterfaceDescriptor + 53;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 18 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 3;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        IAuthTabCallbackStub(function1, obj);
        if (i3 != 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = onTransact + 35;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 91;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return -1L;
        }
        throw null;
    }

    public static final class IAuthTabCallback implements getAdService {
        final /* synthetic */ Configuration onExtraCallback;

        public IAuthTabCallback(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onExtraCallback implements getAdService {
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onExtraCallback(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onNavigationEvent implements Function0<CMS_SignedDataWithHash> {
        final /* synthetic */ Activity onExtraCallbackWithResult;

        public onNavigationEvent(Activity activity) {
            this.onExtraCallbackWithResult = activity;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final CMS_SignedDataWithHash invoke() {
            LayoutInflater layoutInflater = this.onExtraCallbackWithResult.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return CMS_SignedDataWithHash.onWarmupCompleted(layoutInflater);
        }
    }

    public static final /* synthetic */ void onExtraCallback(UnderFourteenMainActivity underFourteenMainActivity, boolean z) {
        int i = 2 % 2;
        int i2 = onTransact + 57;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        underFourteenMainActivity.IAuthTabCallbackStub = z;
        int i5 = i3 + 39;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
    }

    public final SessionTrackerb onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact + 55;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 119;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return sessionTrackerb;
    }

    public final AppLovinSdkInitializationConfigurationImpl IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 79;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        AppLovinSdkInitializationConfigurationImpl appLovinSdkInitializationConfigurationImpl = this.inbox;
        Object obj = null;
        if (appLovinSdkInitializationConfigurationImpl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i2 + 107;
        int i6 = i5 % 128;
        onTransact = i6;
        if (i5 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i7 = i6 + 51;
        getInterfaceDescriptor = i7 % 128;
        int i8 = i7 % 2;
        return appLovinSdkInitializationConfigurationImpl;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        UnderFourteenMainActivity underFourteenMainActivity = (UnderFourteenMainActivity) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 5;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object value = underFourteenMainActivity.asInterface.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        CMS_SignedDataWithHash cMS_SignedDataWithHash = (CMS_SignedDataWithHash) value;
        if (i3 == 0) {
            return cMS_SignedDataWithHash;
        }
        throw null;
    }

    private final Typography2 access200() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 39;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        Typography2 typography2 = ((CMS_SignedDataWithHash) IAuthTabCallback(new Object[]{this}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -595877846, iIAuthTabCallback, iIAuthTabCallback2, 595877850)).onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(typography2, "");
        int i4 = onTransact + 97;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return typography2;
    }

    private final ServiceRow validateRelationship() {
        int i = 2 % 2;
        int i2 = onTransact + 59;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        ServiceRow serviceRow = ((CMS_SignedDataWithHash) IAuthTabCallback(new Object[]{this}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -595877846, iIAuthTabCallback, iIAuthTabCallback2, 595877850)).onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(serviceRow, "");
        int i4 = getInterfaceDescriptor + 1;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return serviceRow;
    }

    private final ServiceRow writeTypedList() {
        int i = 2 % 2;
        int i2 = onTransact + 35;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this};
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback3 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback4 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        if (i3 != 0) {
            ServiceRow serviceRow = ((CMS_SignedDataWithHash) IAuthTabCallback(objArr, iIAuthTabCallback4, iIAuthTabCallback3, -595877846, iIAuthTabCallback, iIAuthTabCallback2, 595877850)).onExtraCallback;
            Intrinsics.checkNotNullExpressionValue(serviceRow, "");
            return serviceRow;
        }
        ServiceRow serviceRow2 = ((CMS_SignedDataWithHash) IAuthTabCallback(objArr, iIAuthTabCallback4, iIAuthTabCallback3, -595877846, iIAuthTabCallback, iIAuthTabCallback2, 595877850)).onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(serviceRow2, "");
        int i4 = 56 / 0;
        return serviceRow2;
    }

    private final ServiceRow IEngagementSignalsCallback() {
        ServiceRow serviceRow;
        int i = 2 % 2;
        int i2 = onTransact + 13;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this};
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback3 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback4 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        if (i3 == 0) {
            serviceRow = ((CMS_SignedDataWithHash) IAuthTabCallback(objArr, iIAuthTabCallback4, iIAuthTabCallback3, -595877846, iIAuthTabCallback, iIAuthTabCallback2, 595877850)).onExtraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(serviceRow, "");
            int i4 = 73 / 0;
        } else {
            serviceRow = ((CMS_SignedDataWithHash) IAuthTabCallback(objArr, iIAuthTabCallback4, iIAuthTabCallback3, -595877846, iIAuthTabCallback, iIAuthTabCallback2, 595877850)).onExtraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(serviceRow, "");
        }
        int i5 = getInterfaceDescriptor + 65;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return serviceRow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final View ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 45;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        View viewFindViewById = ((CMS_SignedDataWithHash) IAuthTabCallback(new Object[]{this}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -595877846, iIAuthTabCallback, iIAuthTabCallback2, 595877850)).getRoot().findViewById(R.id.feedUnreadDot);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        int i4 = onTransact + 95;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 92 / 0;
        }
        return viewFindViewById;
    }

    private final View updateVisuals() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 53;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this};
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback3 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback4 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        if (i3 == 0) {
            View viewFindViewById = ((CMS_SignedDataWithHash) IAuthTabCallback(objArr, iIAuthTabCallback4, iIAuthTabCallback3, -595877846, iIAuthTabCallback, iIAuthTabCallback2, 595877850)).getRoot().findViewById(R.id.view_menu_feed_icon);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            return viewFindViewById;
        }
        View viewFindViewById2 = ((CMS_SignedDataWithHash) IAuthTabCallback(objArr, iIAuthTabCallback4, iIAuthTabCallback3, -595877846, iIAuthTabCallback, iIAuthTabCallback2, 595877850)).getRoot().findViewById(R.id.view_menu_feed_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        int i4 = 63 / 0;
        return viewFindViewById2;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        Object L$0;
        int label;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return UnderFourteenMainActivity.this.new onExtraCallbackWithResult(access13800Var);
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            UnderFourteenMainActivity underFourteenMainActivity;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                UnderFourteenMainActivity underFourteenMainActivity2 = UnderFourteenMainActivity.this;
                LifecyclesKtawaitStarted21 lifecyclesKtawaitStarted21 = LifecyclesKtawaitStarted21.IAuthTabCallback;
                Boolean boolOnNavigationEvent = access14000.onNavigationEvent(true);
                this.L$0 = underFourteenMainActivity2;
                this.label = 1;
                int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
                Object objOnExtraCallback = LifecyclesKtawaitStarted21.onExtraCallback(new Object[]{lifecyclesKtawaitStarted21, "home.inbox.button.dot.enabled", boolOnNavigationEvent, this}, 324853779, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -324853779, iIAuthTabCallback);
                if (objOnExtraCallback == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
                underFourteenMainActivity = underFourteenMainActivity2;
                obj = objOnExtraCallback;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                underFourteenMainActivity = (UnderFourteenMainActivity) this.L$0;
                ResultKt.onNavigationEvent(obj);
            }
            UnderFourteenMainActivity.onExtraCallback(underFourteenMainActivity, ((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }
    }

    private static final void IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 11;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = getInterfaceDescriptor + 89;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 59 / 0;
        }
    }

    private static final void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 95;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(UnderFourteenMainActivity underFourteenMainActivity, Integer num) {
        int i = 2 % 2;
        int i2 = onTransact + 89;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            AppLovinSdkInitializationConfigurationImpl appLovinSdkInitializationConfigurationImplIAuthTabCallback = underFourteenMainActivity.IAuthTabCallback();
            View viewUpdateVisuals = underFourteenMainActivity.updateVisuals();
            View viewICustomTabsServiceDefault = underFourteenMainActivity.ICustomTabsServiceDefault();
            Intrinsics.checkNotNull(num);
            appLovinSdkInitializationConfigurationImplIAuthTabCallback.onExtraCallback(viewUpdateVisuals, viewICustomTabsServiceDefault, num.intValue(), underFourteenMainActivity.IAuthTabCallbackStub);
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        AppLovinSdkInitializationConfigurationImpl appLovinSdkInitializationConfigurationImplIAuthTabCallback2 = underFourteenMainActivity.IAuthTabCallback();
        View viewUpdateVisuals2 = underFourteenMainActivity.updateVisuals();
        View viewICustomTabsServiceDefault2 = underFourteenMainActivity.ICustomTabsServiceDefault();
        Intrinsics.checkNotNull(num);
        appLovinSdkInitializationConfigurationImplIAuthTabCallback2.onExtraCallback(viewUpdateVisuals2, viewICustomTabsServiceDefault2, num.intValue(), underFourteenMainActivity.IAuthTabCallbackStub);
        Unit unit2 = Unit.INSTANCE;
        int i3 = getInterfaceDescriptor + 125;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit onTransact(Throwable th) {
        int i = 2 % 2;
        int i2 = onTransact + 21;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "UnderFourteenMainActivity", th.getMessage(), th, (Map) null, 8, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 85;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(UnderFourteenMainActivity underFourteenMainActivity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 97;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        SessionTrackerb sessionTrackerbOnNavigationEvent = underFourteenMainActivity.onNavigationEvent();
        Object[] objArr = new Object[1];
        a(new int[]{0, 27, 0, 0}, true, new byte[]{1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0}, objArr);
        SessionTrackerb.IAuthTabCallback(sessionTrackerbOnNavigationEvent, underFourteenMainActivity, ((String) objArr[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 35;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 84 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit asInterface(UnderFourteenMainActivity underFourteenMainActivity, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        underFourteenMainActivity.startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:15994905")));
        Unit unit = Unit.INSTANCE;
        int i2 = getInterfaceDescriptor + 89;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // viva.republica.toss.guest.underFourteen.Hilt_UnderFourteenMainActivity
    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        super.onCreate(bundle);
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        setContentView(((CMS_SignedDataWithHash) IAuthTabCallback(new Object[]{this}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -595877846, iIAuthTabCallback, iIAuthTabCallback2, 595877850)).getRoot());
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(null), 3, (Object) null);
        deserializeUriNullableCollection deserializeurinullablecollectionOnExtraCallbackWithResult = IAuthTabCallback().IAuthTabCallback().IAuthTabCallback().onExtraCallbackWithResult(new UnderFourteenMainActivity$.ExternalSyntheticLambda1(new UnderFourteenMainActivity$.ExternalSyntheticLambda0(this)), new UnderFourteenMainActivity$.ExternalSyntheticLambda3(new UnderFourteenMainActivity$.ExternalSyntheticLambda2()));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnExtraCallbackWithResult, "");
        onNavigationEvent(deserializeurinullablecollectionOnExtraCallbackWithResult);
        access200().setText(PlayerErrorCode.onPostMessage());
        ServiceRow serviceRowValidateRelationship = validateRelationship();
        serviceRowValidateRelationship.setTitle(serviceRowValidateRelationship.getContext().getString(R.string.under_fourteen_certify_title));
        serviceRowValidateRelationship.setIcon(im.toss.core.R.drawable.icn_customized_color);
        ParamUtils paramUtils = ParamUtils.NORMAL;
        Object[] objArr = {serviceRowValidateRelationship, paramUtils, new UnderFourteenMainActivity$.ExternalSyntheticLambda4(this)};
        int iOnWarmupCompleted = NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted();
        ServiceRow serviceRowWriteTypedList = writeTypedList();
        serviceRowWriteTypedList.setTitle(serviceRowWriteTypedList.getContext().getString(R.string.under_fourteen_cs_title));
        serviceRowWriteTypedList.setIcon(R.drawable.icn_cs_mono);
        Context context = serviceRowWriteTypedList.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        serviceRowWriteTypedList.setIconColor(new getUrlokhttp(new IAuthTabCallback(configuration)).onActivityResized());
        Object[] objArr2 = {serviceRowWriteTypedList, paramUtils, new UnderFourteenMainActivity$.ExternalSyntheticLambda5(this)};
        int iOnWarmupCompleted3 = NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted4 = NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted();
        ServiceRow serviceRowIEngagementSignalsCallback = IEngagementSignalsCallback();
        serviceRowIEngagementSignalsCallback.setTitle(getString(R.string.setting));
        serviceRowIEngagementSignalsCallback.setIcon(R.drawable.icon_setting_mono);
        Context context2 = serviceRowIEngagementSignalsCallback.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration2 = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        serviceRowIEngagementSignalsCallback.setIconColor(new getUrlokhttp(new onExtraCallback(configuration2)).onActivityResized());
        Object[] objArr3 = {serviceRowIEngagementSignalsCallback, paramUtils, new UnderFourteenMainActivity$.ExternalSyntheticLambda6(this)};
        int iOnWarmupCompleted5 = NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted6 = NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted();
        int i2 = getInterfaceDescriptor + 99;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit asBinder(UnderFourteenMainActivity underFourteenMainActivity, View view) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 17;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            AppLovinSdkInitializationConfigurationImpl.onNavigationEvent(underFourteenMainActivity.IAuthTabCallback(), underFourteenMainActivity, (Integer) null, 4, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            AppLovinSdkInitializationConfigurationImpl.onNavigationEvent(underFourteenMainActivity.IAuthTabCallback(), underFourteenMainActivity, (Integer) null, 2, (Object) null);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = onTransact + 57;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    public boolean onCreateOptionsMenu(@NotNull Menu menu) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(menu, "");
        getMenuInflater().inflate(R.menu.menu_toss_dashboard, menu);
        Sequence sequenceIAuthTabCallback = putCount.IAuthTabCallback(menu);
        if (sequenceIAuthTabCallback != null) {
            Iterator itIAuthTabCallback = sequenceIAuthTabCallback.IAuthTabCallback();
            while (itIAuthTabCallback.hasNext()) {
                MenuItem menuItem = (MenuItem) itIAuthTabCallback.next();
                if (menuItem.getItemId() == R.id.action_feed) {
                    int i2 = getInterfaceDescriptor + 75;
                    onTransact = i2 % 128;
                    int i3 = i2 % 2;
                    menuItem.setVisible(true);
                    View actionView = menuItem.getActionView();
                    if (actionView != null) {
                        Object[] objArr = {actionView, ParamUtils.NORMAL, new UnderFourteenMainActivity$.ExternalSyntheticLambda7(this)};
                        int iOnWarmupCompleted = NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted();
                        int iOnWarmupCompleted2 = NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted();
                        int i4 = getInterfaceDescriptor + 125;
                        onTransact = i4 % 128;
                        if (i4 % 2 != 0) {
                            int i5 = 5 % 5;
                        }
                    }
                } else {
                    menuItem.setVisible(false);
                }
            }
        }
        return true;
    }

    public String getScreenName() {
        int i = 2 % 2;
        int i2 = onTransact + 9;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return "";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = IAuthTabCallbackDefault;
        if (cArr != null) {
            int i7 = $10 + 35;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                int i10 = $11 + 119;
                $10 = i10 % 128;
                if (i10 % i != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i9])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35284 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 35 - (ViewConfiguration.getEdgeSlop() >> 16), 14240 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i9] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr[i9])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myPid() >> 22) + 35283), TextUtils.lastIndexOf("", '0', 0) + 36, TextUtils.indexOf("", "", 0, 0) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i9++;
                }
                i = 2;
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i11 = $11 + 29;
                $10 = i11 % 128;
                if (i11 % 2 == 0 ? bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1 : bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1) {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionGroup(0L), 28 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 17656 - ExpandableListView.getPackedPositionChild(0L), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                } else {
                    int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 10935), (ViewConfiguration.getTapTimeout() >> 16) + 65, 16718 - Color.alpha(0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 49467), Color.argb(0, 0, 0, 0) + 70, 12486 - View.MeasureSpec.getMode(0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            int i14 = $10 + 9;
            $11 = i14 % 128;
            if (i14 % 2 == 0) {
                char[] cArr5 = new char[i4];
                System.arraycopy(cArr3, 0, cArr5, 1, i4);
                System.arraycopy(cArr5, 0, cArr3, i4 >>> i6, i6);
                System.arraycopy(cArr5, i6, cArr3, 0, i4 + i6);
            } else {
                char[] cArr6 = new char[i4];
                System.arraycopy(cArr3, 0, cArr6, 0, i4);
                int i15 = i4 - i6;
                System.arraycopy(cArr6, 0, cArr3, i15, i6);
                System.arraycopy(cArr6, i6, cArr3, 0, i15);
            }
        }
        if (z) {
            int i16 = $11 + 5;
            $10 = i16 % 128;
            int i17 = i16 % 2;
            char[] cArr7 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr7;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public static /* synthetic */ Unit onNavigationEvent(UnderFourteenMainActivity underFourteenMainActivity, View view) {
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        return (Unit) IAuthTabCallback(new Object[]{underFourteenMainActivity, view}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -749602434, iIAuthTabCallback, iIAuthTabCallback2, 749602437);
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) throws Throwable {
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        IAuthTabCallback(new Object[]{function1, obj}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1001380588, iIAuthTabCallback, iIAuthTabCallback2, 1001380590);
    }

    public static /* synthetic */ Unit onWarmupCompleted(UnderFourteenMainActivity underFourteenMainActivity, View view) {
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        return (Unit) IAuthTabCallback(new Object[]{underFourteenMainActivity, view}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1322754732, iIAuthTabCallback, iIAuthTabCallback2, 1322754732);
    }

    private final CMS_SignedDataWithHash ICustomTabsServiceStub() {
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        return (CMS_SignedDataWithHash) IAuthTabCallback(new Object[]{this}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -595877846, iIAuthTabCallback, iIAuthTabCallback2, 595877850);
    }

    private static final Unit onTransact(UnderFourteenMainActivity underFourteenMainActivity, View view) {
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        return (Unit) IAuthTabCallback(new Object[]{underFourteenMainActivity, view}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 2073642548, iIAuthTabCallback, iIAuthTabCallback2, -2073642547);
    }

    @Override // viva.republica.toss.guest.underFourteen.Hilt_UnderFourteenMainActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = onTransact + 37;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = getInterfaceDescriptor + 45;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.guest.underFourteen.Hilt_UnderFourteenMainActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 1;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = getInterfaceDescriptor + 121;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.guest.underFourteen.Hilt_UnderFourteenMainActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = onTransact + 39;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            int i4 = 23 / 0;
        }
    }

    @Override // viva.republica.toss.guest.underFourteen.Hilt_UnderFourteenMainActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 31;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = onTransact + 73;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static void setEngagementSignalsCallback() {
        IAuthTabCallbackDefault = new char[]{27260, 27178, 27176, 27169, 27194, 27173, 27170, 27166, 27165, 27169, 27177, 27168, 27197, 27173, 27178, 27143, 27233, 27258, 27160, 27197, 27199, 27199, 27197, 27173, 27172, 27196, 27194, 27255, 27194, 27196, 27172, 27173, 27197, 27199, 27199, 27197, 27160, 27258, 27233, 27167, 27170, 27170, 27194, 27168, 27173, 27172, 27171};
    }
}
