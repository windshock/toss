package o;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import im.toss.devtool.action.presentation.DevToolActionListViewModel$asInterface;
import im.toss.devtool.action.presentation.DevToolActionListViewModel$onExtraCallback;
import im.toss.devtool.action.quickaction.Hilt_QuickActionBottomSheetActivity$4;
import im.toss.devtool.runtime.ui.scheme.history.Hilt_SchemeHistoryActivity$5;
import im.toss.global.features.leave.test.Hilt_GlobalLeaveTestActivity$4;
import im.toss.global.localization.domain.di.RegionDomainModuleKt;
import im.toss.rn.spec.base.ReactNativeContentOwner;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.dialog.BottomSheetHeader;
import im.toss.uikit.widget.textField.TextField;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppNode61;
import o.EngineConfig1;
import o.MaxFullscreenAdImpl;
import o.PKCS58;
import o.bindContext;
import o.initMiniApp;
import o.makePFX_WINS;
import o.s3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.dev.screencapture.ScreenCaptureAlertDialog$onExtraCallback;
import viva.republica.toss.dev.screencapture.ScreenCaptureAlertDialog$onNavigationEvent;
import viva.republica.toss.dev.screencapture.ScreenCaptureType$MiniApp$;
import viva.republica.toss.dev.screencapture.ScreenCaptureType$ReactNative$;
import viva.republica.toss.dev.screencapture.ScreenCaptureType$Web$;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$;
import viva.republica.toss.network.model.SchemeManagerInfoResponse;

/* loaded from: classes.dex */
public abstract class encryptPKCS8PrikeyInfo {
    static int onExtraCallbackWithResult = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(encryptPKCS8PrikeyInfo.class);
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);

    static {
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3045);
    }

    public /* synthetic */ encryptPKCS8PrikeyInfo(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    protected abstract Activity IAuthTabCallback();

    protected abstract decryptPrikey IAuthTabCallbackDefault();

    protected abstract String IAuthTabCallbackStub();

    public abstract handleServerMsgRemoteApiCallback onTransact();

    public static final class onWarmupCompleted extends encryptPKCS8PrikeyInfo implements ScreenCaptureAlertDialog$onExtraCallback, ScreenCaptureAlertDialog$onNavigationEvent {
        private static int $10 = 0;
        private static int $11 = 1;
        private static final onExtraCallbackWithResult Companion;
        private static final String IAuthTabCallback;
        private static int ICustomTabsCallback = 1;
        private static int extraCallback = 0;
        private static int extraCallbackWithResult = 0;
        private static char[] getInterfaceDescriptor = null;
        public static final int onExtraCallback;
        private static final String onNavigationEvent;
        private static int onPostMessage = 1;
        private static final String onWarmupCompleted;
        private static char[] readTypedObject;
        private static char writeTypedObject;
        private final Function1<Activity, Unit> IAuthTabCallbackDefault;
        private final Function1<Activity, Unit> IAuthTabCallbackStub;
        private final String IAuthTabCallbackStubProxy;
        private final decryptPrikey IAuthTabCallback_Parcel;
        private final String access000;
        private final String access100;
        private final Activity asBinder;
        private final Lazy asInterface;
        private final handleServerMsgRemoteApiCallback onTransact;

        static {
            asInterface();
            Object[] objArr = new Object[1];
            a(new int[]{0, 6, 0, 0}, true, new byte[]{0, 1, 1, 1, 1, 1}, objArr);
            onWarmupCompleted = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a(new int[]{6, 23, 25, 4}, false, new byte[]{0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1}, objArr2);
            IAuthTabCallback = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            a(new int[]{29, 10, 0, 6}, true, new byte[]{1, 0, 0, 1, 1, 1, 0, 1, 1, 0}, objArr3);
            onNavigationEvent = ((String) objArr3[0]).intern();
            Companion = new onExtraCallbackWithResult(null);
            onExtraCallback = 8;
            int i = onPostMessage + 53;
            extraCallback = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public static /* synthetic */ Object IAuthTabCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
            r8lambdaHDAe14RP_YfkbgNStt68qt10Iow r8lambdahdae14rp_yfkbgnstt68qt10iowIAuthTabCallback_Parcel;
            String string;
            Object obj;
            int i7 = ~i3;
            int i8 = ~i6;
            int i9 = (~i2) | i8;
            int i10 = ~(i2 | i8);
            int i11 = i6 + i3 + i + ((-714989572) * i4) + (1142003473 * i5);
            int i12 = i11 * i11;
            int i13 = (i6 * (-1158907614)) + 1427560840 + (i3 * (-1158905656)) + (i7 * 979) + (i9 * (-979)) + (i10 * 979) + ((-1158906635) * i) + (1387703340 * i4) + (1202573125 * i5) + (i12 * (-451215360));
            int i14 = (((-190873766) * i6) - 1983905792) + (1136689320 * i3) + (i7 * (-1483702105)) + (1483702105 * i9) + ((-1483702105) * i10) + ((-1674575872) * i) + ((-1891631104) * i4) + ((-1355808768) * i5) + ((-1882259456) * i12) + (i13 * i13 * (-310837248));
            if (i14 == 1) {
                onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) objArr[0];
                getTypedExportedConstants gettypedexportedconstants = (getTypedExportedConstants) objArr[1];
                View view = (View) objArr[2];
                int i15 = 2 % 2;
                int i16 = ICustomTabsCallback + 17;
                extraCallbackWithResult = i16 % 128;
                int i17 = i16 % 2;
                Intrinsics.checkNotNullParameter(view, "");
                r8lambdaHDAe14RP_YfkbgNStt68qt10Iow r8lambdahdae14rp_yfkbgnstt68qt10iowIAuthTabCallback_Parcel2 = onwarmupcompleted.IAuthTabCallback_Parcel();
                Object[] objArr2 = new Object[1];
                a(new int[]{6, 23, 25, 4}, false, new byte[]{0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1}, objArr2);
                r8lambdahdae14rp_yfkbgnstt68qt10iowIAuthTabCallback_Parcel2.onExtraCallbackWithResult((String) null, ((String) objArr2[0]).intern());
                gettypedexportedconstants.dismiss();
                Unit unit = Unit.INSTANCE;
                int i18 = extraCallbackWithResult + 13;
                ICustomTabsCallback = i18 % 128;
                int i19 = i18 % 2;
                return unit;
            }
            if (i14 == 2) {
                return onExtraCallback(objArr);
            }
            if (i14 == 3) {
                return onWarmupCompleted(objArr);
            }
            onWarmupCompleted onwarmupcompleted2 = (onWarmupCompleted) objArr[0];
            TextField textField = (TextField) objArr[1];
            getTypedExportedConstants gettypedexportedconstants2 = (getTypedExportedConstants) objArr[2];
            View view2 = (View) objArr[3];
            int i20 = 2 % 2;
            int i21 = extraCallbackWithResult + 63;
            ICustomTabsCallback = i21 % 128;
            if (i21 % 2 == 0) {
                Intrinsics.checkNotNullParameter(view2, "");
                r8lambdahdae14rp_yfkbgnstt68qt10iowIAuthTabCallback_Parcel = onwarmupcompleted2.IAuthTabCallback_Parcel();
                string = ((Editable) TextField.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 450491628, new Object[]{textField}, -450491624, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).toString();
                Object[] objArr3 = new Object[1];
                a(new int[]{6, 23, 25, 4}, false, new byte[]{0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1}, objArr3);
                obj = objArr3[0];
            } else {
                Intrinsics.checkNotNullParameter(view2, "");
                r8lambdahdae14rp_yfkbgnstt68qt10iowIAuthTabCallback_Parcel = onwarmupcompleted2.IAuthTabCallback_Parcel();
                string = ((Editable) TextField.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 450491628, new Object[]{textField}, -450491624, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).toString();
                Object[] objArr4 = new Object[1];
                a(new int[]{6, 23, 25, 4}, false, new byte[]{0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1}, objArr4);
                obj = objArr4[0];
            }
            r8lambdahdae14rp_yfkbgnstt68qt10iowIAuthTabCallback_Parcel.onExtraCallbackWithResult(string, ((String) obj).intern());
            gettypedexportedconstants2.dismiss();
            Unit unit2 = Unit.INSTANCE;
            int i22 = extraCallbackWithResult + 25;
            ICustomTabsCallback = i22 % 128;
            int i23 = i22 % 2;
            return unit2;
        }

        public static /* synthetic */ Unit IAuthTabCallback(onWarmupCompleted onwarmupcompleted, Activity activity) {
            int i = 2 % 2;
            int i2 = extraCallbackWithResult + 39;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnNavigationEvent = onNavigationEvent(onwarmupcompleted, activity);
            if (i3 == 0) {
                int i4 = 50 / 0;
            }
            return unitOnNavigationEvent;
        }

        public static /* synthetic */ Unit onExtraCallback(onWarmupCompleted onwarmupcompleted, TextField textField, getTypedExportedConstants gettypedexportedconstants, View view) {
            int i = 2 % 2;
            int i2 = ICustomTabsCallback + 99;
            extraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return onWarmupCompleted(onwarmupcompleted, textField, gettypedexportedconstants, view);
            }
            onWarmupCompleted(onwarmupcompleted, textField, gettypedexportedconstants, view);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Unit onExtraCallback(onWarmupCompleted onwarmupcompleted, getTypedExportedConstants gettypedexportedconstants, View view) {
            int i = 2 % 2;
            int i2 = extraCallbackWithResult + 29;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(onwarmupcompleted, gettypedexportedconstants, view);
            int i4 = extraCallbackWithResult + 107;
            ICustomTabsCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return unitOnExtraCallbackWithResult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ r8lambdaHDAe14RP_YfkbgNStt68qt10Iow onExtraCallbackWithResult(onWarmupCompleted onwarmupcompleted) {
            int i = 2 % 2;
            int i2 = extraCallbackWithResult + 47;
            ICustomTabsCallback = i2 % 128;
            if (i2 % 2 == 0) {
                IAuthTabCallback(onwarmupcompleted);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            r8lambdaHDAe14RP_YfkbgNStt68qt10Iow r8lambdahdae14rp_yfkbgnstt68qt10iowIAuthTabCallback = IAuthTabCallback(onwarmupcompleted);
            int i3 = ICustomTabsCallback + 45;
            extraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return r8lambdahdae14rp_yfkbgnstt68qt10iowIAuthTabCallback;
        }

        public static /* synthetic */ Unit onWarmupCompleted(onWarmupCompleted onwarmupcompleted, Activity activity) {
            int i = 2 % 2;
            int i2 = extraCallbackWithResult + 77;
            ICustomTabsCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return onExtraCallbackWithResult(onwarmupcompleted, activity);
            }
            onExtraCallbackWithResult(onwarmupcompleted, activity);
            throw null;
        }

        public static final class onNavigationEvent implements Function1<initMiniApp.onWarmupCompleted, Unit> {
            static int onExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(onNavigationEvent.class);
            public static final onNavigationEvent onExtraCallbackWithResult = new onNavigationEvent();

            static {
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2782);
            }

            public final void onExtraCallbackWithResult(initMiniApp.onWarmupCompleted onwarmupcompleted) {
                int i = 2 % 2;
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(832);
                Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
                int i2 = onExtraCallback;
                int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2570);
                int i3 = i2 & iOnWarmupCompleted;
                if ((((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 25) & 1) != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallback;
                int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3949);
                int i3 = i2 & iOnWarmupCompleted;
                int i4 = ((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 31) & 1;
                onExtraCallbackWithResult((initMiniApp.onWarmupCompleted) obj);
                if (i4 == 0) {
                    return Unit.INSTANCE;
                }
                Unit unit = Unit.INSTANCE;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(@NotNull Activity activity) {
            super(null);
            Intrinsics.checkNotNullParameter(activity, "");
            this.asBinder = activity;
            this.IAuthTabCallback_Parcel = decryptPrikey.REACT_NATIVE;
            String strIAuthTabCallback = onVisit.IAuthTabCallback(IAuthTabCallback());
            String strAsBinder = asBinder();
            StringBuilder sb = new StringBuilder();
            sb.append(strIAuthTabCallback);
            Object[] objArr = new Object[1];
            b((byte) (27 - View.getDefaultSize(0, 0)), 1 - Drawable.resolveOpacity(0, 0), new char[]{13781}, objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(strAsBinder);
            this.access000 = sb.toString();
            this.onTransact = handleServerMsgRemoteApiCallback.CORE;
            this.asInterface = LazyKt.onExtraCallbackWithResult(new ScreenCaptureType$ReactNative$.ExternalSyntheticLambda0(this));
            Object[] objArr2 = new Object[1];
            b((byte) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 116), (ViewConfiguration.getWindowTouchSlop() >> 8) + 10, new char[]{21, 19, '*', '\t', 22, '\t', '%', '.', ' ', 0}, objArr2);
            this.IAuthTabCallbackStubProxy = ((String) objArr2[0]).intern();
            this.IAuthTabCallbackStub = new ScreenCaptureType$ReactNative$.ExternalSyntheticLambda1(this);
            Object[] objArr3 = new Object[1];
            a(new int[]{39, 23, 0, 0}, false, new byte[]{0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0}, objArr3);
            this.access100 = ((String) objArr3[0]).intern();
            this.IAuthTabCallbackDefault = new ScreenCaptureType$ReactNative$.ExternalSyntheticLambda2(this);
        }

        @Override // o.encryptPKCS8PrikeyInfo
        protected Activity IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = ICustomTabsCallback;
            int i3 = i2 + 59;
            extraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            Activity activity = this.asBinder;
            int i4 = i2 + 91;
            extraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 25 / 0;
            }
            return activity;
        }

        @Override // o.encryptPKCS8PrikeyInfo
        protected decryptPrikey IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = extraCallbackWithResult + 57;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            decryptPrikey decryptprikey = this.IAuthTabCallback_Parcel;
            if (i3 == 0) {
                int i4 = 36 / 0;
            }
            return decryptprikey;
        }

        @Override // o.encryptPKCS8PrikeyInfo
        protected String IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = extraCallbackWithResult + 109;
            int i3 = i2 % 128;
            ICustomTabsCallback = i3;
            int i4 = i2 % 2;
            String str = this.access000;
            int i5 = i3 + 7;
            extraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        @Override // o.encryptPKCS8PrikeyInfo
        public handleServerMsgRemoteApiCallback onTransact() {
            int i = 2 % 2;
            int i2 = extraCallbackWithResult + 61;
            ICustomTabsCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onTransact;
            }
            throw null;
        }

        private final r8lambdaHDAe14RP_YfkbgNStt68qt10Iow IAuthTabCallback_Parcel() {
            int i = 2 % 2;
            int i2 = ICustomTabsCallback + 125;
            extraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            r8lambdaHDAe14RP_YfkbgNStt68qt10Iow r8lambdahdae14rp_yfkbgnstt68qt10iow = (r8lambdaHDAe14RP_YfkbgNStt68qt10Iow) this.asInterface.getValue();
            int i3 = ICustomTabsCallback + 47;
            extraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 9 / 0;
            }
            return r8lambdahdae14rp_yfkbgnstt68qt10iow;
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) objArr[0];
            int i = 2 % 2;
            int i2 = ICustomTabsCallback + 113;
            extraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                Response response = Response.onNavigationEvent;
                Context applicationContext = onwarmupcompleted.IAuthTabCallback().getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "");
                return ((MaxAdViewImpld) Response.onExtraCallback(applicationContext, MaxAdViewImpld.class)).removeOnContextAvailableListener();
            }
            Response response2 = Response.onNavigationEvent;
            Context applicationContext2 = onwarmupcompleted.IAuthTabCallback().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "");
            ((MaxAdViewImpld) Response.onExtraCallback(applicationContext2, MaxAdViewImpld.class)).removeOnContextAvailableListener();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // viva.republica.toss.dev.screencapture.ScreenCaptureAlertDialog$onNavigationEvent
        public String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = extraCallbackWithResult;
            int i3 = i2 + 11;
            ICustomTabsCallback = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            String str = this.IAuthTabCallbackStubProxy;
            int i4 = i2 + 53;
            ICustomTabsCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return str;
            }
            throw null;
        }

        @Override // viva.republica.toss.dev.screencapture.ScreenCaptureAlertDialog$onNavigationEvent
        public Function1<Activity, Unit> onExtraCallback() {
            int i = 2 % 2;
            int i2 = extraCallbackWithResult + 39;
            ICustomTabsCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return this.IAuthTabCallbackStub;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final Unit onNavigationEvent(onWarmupCompleted onwarmupcompleted, Activity activity) {
            int i = 2 % 2;
            int i2 = extraCallbackWithResult + 73;
            ICustomTabsCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(activity, "");
                onwarmupcompleted.access000();
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(activity, "");
            ReactNativeContentOwner reactNativeContentOwnerAccess000 = onwarmupcompleted.access000();
            if (reactNativeContentOwnerAccess000 != null) {
                reactNativeContentOwnerAccess000.IAuthTabCallback_Parcel();
            }
            Unit unit = Unit.INSTANCE;
            int i3 = extraCallbackWithResult + 99;
            ICustomTabsCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return unit;
            }
            obj.hashCode();
            throw null;
        }

        @Override // viva.republica.toss.dev.screencapture.ScreenCaptureAlertDialog$onExtraCallback
        public String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = extraCallbackWithResult + 73;
            ICustomTabsCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return this.access100;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // viva.republica.toss.dev.screencapture.ScreenCaptureAlertDialog$onExtraCallback
        public Function1<Activity, Unit> onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = extraCallbackWithResult + 17;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            Function1<Activity, Unit> function1 = this.IAuthTabCallbackDefault;
            if (i3 == 0) {
                int i4 = 65 / 0;
            }
            return function1;
        }

        private static final Unit onExtraCallbackWithResult(onWarmupCompleted onwarmupcompleted, Activity activity) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(activity, "");
            Activity activityIAuthTabCallback = onwarmupcompleted.IAuthTabCallback();
            onNavigationEvent onnavigationevent = onNavigationEvent.onExtraCallbackWithResult;
            logAndOpenStore.IAuthTabCallback(activityIAuthTabCallback, (Long) null);
            getTypedExportedConstants gettypedexportedconstants = new getTypedExportedConstants(activityIAuthTabCallback, 0, false, false, -1L, onnavigationevent, 14, (DefaultConstructorMarker) null);
            Context context = gettypedexportedconstants.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            Context context2 = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            BottomSheetHeader bottomSheetHeader = new BottomSheetHeader(context2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            Object[] objArr = new Object[1];
            a(new int[]{68, 21, 0, 0}, true, new byte[]{1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1}, objArr);
            bottomSheetHeader.setTitle(((String) objArr[0]).intern());
            bottomSheetHeader.setShowCloseIcon(false);
            String strOnExtraCallback = onwarmupcompleted.IAuthTabCallback_Parcel().onExtraCallback();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            a(new int[]{89, 5, 0, 0}, false, new byte[]{0, 0, 0, 0, 0}, objArr2);
            sb.append(((String) objArr2[0]).intern());
            sb.append(strOnExtraCallback);
            bottomSheetHeader.setDescription(sb.toString());
            setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, bottomSheetHeader);
            TextField.onWarmupCompleted onwarmupcompleted2 = TextField.onWarmupCompleted.NORMAL;
            Context context3 = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            TextField textField = new TextField(context3);
            textField.setTextFieldType(onwarmupcompleted2);
            textField.setPadding(varyMatches.IAuthTabCallback(textField, 24), varyMatches.IAuthTabCallback(textField, 24), varyMatches.IAuthTabCallback(textField, 0), varyMatches.IAuthTabCallback(textField, 0));
            textField.setHint(onwarmupcompleted.IAuthTabCallback_Parcel().onExtraCallbackWithResult());
            setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, textField);
            Context context4 = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            TdsBottomCtaV1View tdsBottomCtaV1View = new TdsBottomCtaV1View(context4);
            Object[] objArr3 = new Object[1];
            b((byte) (TextUtils.indexOf("", "") + 125), 2 - KeyEvent.getDeadChar(0, 0), new char[]{27, '$'}, objArr3);
            TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, ((String) objArr3[0]).intern(), new ScreenCaptureType$ReactNative$.ExternalSyntheticLambda3(onwarmupcompleted, textField, gettypedexportedconstants), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
            Object[] objArr4 = new Object[1];
            b((byte) ((-16777162) - Color.rgb(0, 0, 0)), View.MeasureSpec.getSize(0) + 3, new char[]{11, 2, 58372}, objArr4);
            TdsBottomCtaV1View.setSecondary$default(tdsBottomCtaV1View, ((String) objArr4[0]).intern(), new ScreenCaptureType$ReactNative$.ExternalSyntheticLambda4(onwarmupcompleted, gettypedexportedconstants), (TdsButtonV1View.asInterface) null, 4, (Object) null);
            setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsBottomCtaV1View);
            gettypedexportedconstants.setContentView(linearLayout);
            gettypedexportedconstants.show();
            Unit unit = Unit.INSTANCE;
            int i2 = ICustomTabsCallback + 125;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return unit;
        }

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) {
            int length;
            char[] cArr;
            int i;
            int i2 = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i3 = iArr[0];
            int i4 = iArr[1];
            int i5 = iArr[2];
            int i6 = iArr[3];
            char[] cArr2 = getInterfaceDescriptor;
            if (cArr2 != null) {
                int i7 = $11 + 91;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    length = cArr2.length;
                    cArr = new char[length];
                    i = 1;
                } else {
                    length = cArr2.length;
                    cArr = new char[length];
                    i = 0;
                }
                while (i < length) {
                    cArr[i] = EngineConfig1.onNavigationEvent.AnonymousClass4.t(cArr2[i]);
                    i++;
                    int i8 = $11 + 77;
                    $10 = i8 % 128;
                    if (i8 % 2 != 0) {
                        int i9 = 2 % 3;
                    }
                }
                cArr2 = cArr;
            }
            char[] cArr3 = new char[i4];
            System.arraycopy(cArr2, i3, cArr3, 0, i4);
            if (bArr != null) {
                char[] cArr4 = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                int i10 = $11 + 39;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                char c = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                        int i12 = $11 + 33;
                        $10 = i12 % 128;
                        int i13 = i12 % 2;
                        cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = Hilt_GlobalLeaveTestActivity$4.p(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent], c);
                    } else {
                        cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = getExternalTransactionToken.q(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent], c);
                        int i14 = $11 + 97;
                        $10 = i14 % 128;
                        int i15 = i14 % 2;
                    }
                    c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    Hilt_SchemeHistoryActivity$5.w(trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0);
                }
                cArr3 = cArr4;
            }
            if (i6 > 0) {
                char[] cArr5 = new char[i4];
                System.arraycopy(cArr3, 0, cArr5, 0, i4);
                int i16 = i4 - i6;
                System.arraycopy(cArr5, 0, cArr3, i16, i6);
                System.arraycopy(cArr5, i6, cArr3, 0, i16);
            }
            if (z) {
                int i17 = $11 + 59;
                $10 = i17 % 128;
                int i18 = i17 % 2;
                char[] cArr6 = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    int i19 = $10 + 31;
                    $11 = i19 % 128;
                    int i20 = i19 % 2;
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
                cArr3 = cArr6;
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

        public final String asBinder() {
            String strIntern;
            String strOnExtraCallbackWithResult;
            int i = 2 % 2;
            ReactNativeContentOwner reactNativeContentOwnerAccess000 = access000();
            if (reactNativeContentOwnerAccess000 == null) {
                int i2 = ICustomTabsCallback;
                int i3 = i2 + 25;
                extraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 111;
                extraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return "";
            }
            r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yosIAuthTabCallbackDefault = reactNativeContentOwnerAccess000.IAuthTabCallbackDefault();
            r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yosOnTransact = reactNativeContentOwnerAccess000.onTransact();
            if (r8lambdadtqrzfihm2ghoddvkfg5vm2yosIAuthTabCallbackDefault == null || (strIntern = r8lambdadtqrzfihm2ghoddvkfg5vm2yosIAuthTabCallbackDefault.onExtraCallbackWithResult()) == null) {
                Object[] objArr = new Object[1];
                a(new int[]{0, 6, 0, 0}, true, new byte[]{0, 1, 1, 1, 1, 1}, objArr);
                strIntern = ((String) objArr[0]).intern();
            }
            String strOnExtraCallbackWithResult2 = onExtraCallbackWithResult(strIntern, onWarmupCompleted(reactNativeContentOwnerAccess000.access100()));
            if (r8lambdadtqrzfihm2ghoddvkfg5vm2yosOnTransact != null) {
                int i7 = extraCallbackWithResult + 71;
                ICustomTabsCallback = i7 % 128;
                int i8 = i7 % 2;
                strOnExtraCallbackWithResult = r8lambdadtqrzfihm2ghoddvkfg5vm2yosOnTransact.onExtraCallbackWithResult();
                int i9 = extraCallbackWithResult + 117;
                ICustomTabsCallback = i9 % 128;
                int i10 = i9 % 2;
            } else {
                strOnExtraCallbackWithResult = null;
            }
            String strOnExtraCallbackWithResult3 = onExtraCallbackWithResult(requestTimeStampWithHash.IAuthTabCallback(strOnExtraCallbackWithResult), onWarmupCompleted(reactNativeContentOwnerAccess000.asInterface()));
            String strIAuthTabCallback = requestTimeStampWithHash.IAuthTabCallback(r8lambdadtqrzfihm2ghoddvkfg5vm2yosIAuthTabCallbackDefault != null ? r8lambdadtqrzfihm2ghoddvkfg5vm2yosIAuthTabCallbackDefault.getDistributionGroup() : null);
            StringBuilder sb = new StringBuilder();
            sb.append(strOnExtraCallbackWithResult2);
            Object[] objArr2 = new Object[1];
            b((byte) (TextUtils.getOffsetBefore("", 0) + 27), TextUtils.getOffsetAfter("", 0) + 1, new char[]{13781}, objArr2);
            sb.append(((String) objArr2[0]).intern());
            sb.append(strOnExtraCallbackWithResult3);
            Object[] objArr3 = new Object[1];
            b((byte) ((ViewConfiguration.getEdgeSlop() >> 16) + 53), 20 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), new char[]{2, 23, '0', 19, ' ', '!', 5, '/', 30, ' ', ',', '!', 16, '+', 18, '!', 31, 30, 31, 26}, objArr3);
            sb.append(((String) objArr3[0]).intern());
            sb.append(strIAuthTabCallback);
            return sb.toString();
        }

        @Override // o.encryptPKCS8PrikeyInfo
        public getNotAfterTime onExtraCallbackWithResult(@Nullable Long l, @Nullable SchemeManagerInfoResponse schemeManagerInfoResponse, @Nullable String str, @NotNull Map<String, String> map, @NotNull String str2) {
            Map<String, String> mapOnNavigationEvent;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(str2, "");
            String typeName = IAuthTabCallbackDefault().getTypeName();
            String strIAuthTabCallbackStub = IAuthTabCallbackStub();
            handleServerMsgRemoteApiCallback handleservermsgremoteapicallbackOnTransact = onTransact();
            getPricingPhaseList getpricingphaselistOnExtraCallbackWithResult = RegionDomainModuleKt.onExtraCallbackWithResult().onExtraCallbackWithResult();
            ReactNativeContentOwner reactNativeContentOwnerAccess000 = access000();
            if (reactNativeContentOwnerAccess000 != null) {
                int i2 = ICustomTabsCallback + 29;
                extraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                mapOnNavigationEvent = onExtraCallbackWithResult(reactNativeContentOwnerAccess000);
            } else {
                int i4 = ICustomTabsCallback + 85;
                extraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                mapOnNavigationEvent = null;
            }
            if (mapOnNavigationEvent == null) {
                mapOnNavigationEvent = access8100.onNavigationEvent();
            }
            return new getNotAfterTime(typeName, strIAuthTabCallbackStub, handleservermsgremoteapicallbackOnTransact, l, schemeManagerInfoResponse, getpricingphaselistOnExtraCallbackWithResult, str, map, str2, mapOnNavigationEvent);
        }

        private final Map<String, String> onExtraCallbackWithResult(ReactNativeContentOwner reactNativeContentOwner) {
            String strOnExtraCallbackWithResult;
            int i = 2 % 2;
            int i2 = extraCallbackWithResult + 79;
            ICustomTabsCallback = i2 % 128;
            String strOnExtraCallbackWithResult2 = null;
            if (i2 % 2 == 0) {
                reactNativeContentOwner.asInterface();
                reactNativeContentOwner.access100();
                reactNativeContentOwner.onTransact();
                reactNativeContentOwner.IAuthTabCallbackDefault();
                access8100.onExtraCallback();
                throw null;
            }
            MaxFullscreenAdImpl maxFullscreenAdImplAsInterface = reactNativeContentOwner.asInterface();
            MaxFullscreenAdImpl maxFullscreenAdImplAccess100 = reactNativeContentOwner.access100();
            r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yosOnTransact = reactNativeContentOwner.onTransact();
            r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yosIAuthTabCallbackDefault = reactNativeContentOwner.IAuthTabCallbackDefault();
            Map mapOnExtraCallback = access8100.onExtraCallback();
            if (r8lambdadtqrzfihm2ghoddvkfg5vm2yosOnTransact != null) {
                strOnExtraCallbackWithResult = r8lambdadtqrzfihm2ghoddvkfg5vm2yosOnTransact.onExtraCallbackWithResult();
            } else {
                int i3 = extraCallbackWithResult + 47;
                ICustomTabsCallback = i3 % 128;
                int i4 = i3 % 2;
                strOnExtraCallbackWithResult = null;
            }
            Object[] objArr = new Object[1];
            b((byte) (1 - Color.argb(0, 0, 0, 0)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 11, new char[]{17, 6, 30, 4, '*', 26, 4, '\n', '0', '\b', 13824}, objArr);
            mapOnExtraCallback.put(((String) objArr[0]).intern(), requestTimeStampWithHash.IAuthTabCallback(strOnExtraCallbackWithResult));
            Object[] objArr2 = new Object[1];
            b((byte) (96 - MotionEvent.axisFromString("")), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 19, new char[]{17, 6, 30, 4, '*', 26, 2, '-', 17, 2, 30, '(', 28, 2, '\n', 6, 17, 29, '\n', 19}, objArr2);
            mapOnExtraCallback.put(((String) objArr2[0]).intern(), onExtraCallbackWithResult(maxFullscreenAdImplAsInterface));
            Object[] objArr3 = new Object[1];
            a(new int[]{94, 18, 0, 0}, false, new byte[]{1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 1}, objArr3);
            mapOnExtraCallback.put(((String) objArr3[0]).intern(), onExtraCallback(maxFullscreenAdImplAsInterface));
            Object[] objArr4 = new Object[1];
            a(new int[]{112, 27, 0, 13}, true, new byte[]{1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 1}, objArr4);
            mapOnExtraCallback.put(((String) objArr4[0]).intern(), onNavigationEvent(maxFullscreenAdImplAsInterface));
            if (r8lambdadtqrzfihm2ghoddvkfg5vm2yosIAuthTabCallbackDefault != null) {
                int i5 = ICustomTabsCallback + 45;
                extraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                strOnExtraCallbackWithResult2 = r8lambdadtqrzfihm2ghoddvkfg5vm2yosIAuthTabCallbackDefault.onExtraCallbackWithResult();
            }
            Object[] objArr5 = new Object[1];
            b((byte) (KeyEvent.normalizeMetaState(0) + 35), TextUtils.getOffsetBefore("", 0) + 13, new char[]{15, ')', '.', 29, 2, 17, '/', '%', '$', 22, 23, ',', 13858}, objArr5);
            mapOnExtraCallback.put(((String) objArr5[0]).intern(), requestTimeStampWithHash.IAuthTabCallback(strOnExtraCallbackWithResult2));
            Object[] objArr6 = new Object[1];
            b((byte) (7 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 19 - KeyEvent.normalizeMetaState(0), new char[]{15, ')', '.', 29, 2, 17, 2, 23, 5, 31, ',', '%', 6, 7, 1, 17, '!', '\n', 13796}, objArr6);
            mapOnExtraCallback.put(((String) objArr6[0]).intern(), onExtraCallbackWithResult(maxFullscreenAdImplAccess100));
            Object[] objArr7 = new Object[1];
            b((byte) (Drawable.resolveOpacity(0, 0) + 3), 17 - (Process.myPid() >> 22), new char[]{15, ')', '.', 29, 2, 17, 2, 23, 5, 31, ',', '%', 1, 4, 18, ',', 13809}, objArr7);
            mapOnExtraCallback.put(((String) objArr7[0]).intern(), onExtraCallback(maxFullscreenAdImplAccess100));
            return access8100.onExtraCallbackWithResult(mapOnExtraCallback);
        }

        private final ReactNativeContentOwner access000() {
            int i = 2 % 2;
            Activity activityIAuthTabCallback = IAuthTabCallback();
            if (!(!(activityIAuthTabCallback instanceof ReactNativeContentOwner))) {
                ReactNativeContentOwner reactNativeContentOwnerIAuthTabCallback = IAuthTabCallback();
                int i2 = extraCallbackWithResult + 119;
                ICustomTabsCallback = i2 % 128;
                int i3 = i2 % 2;
                return reactNativeContentOwnerIAuthTabCallback;
            }
            if (!(activityIAuthTabCallback instanceof FragmentActivity)) {
                int i4 = ICustomTabsCallback + 9;
                extraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return null;
            }
            int i6 = ICustomTabsCallback + 9;
            extraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            List<? extends Fragment> listOnActivityLayout = IAuthTabCallback().getSupportFragmentManager().onActivityLayout();
            Intrinsics.checkNotNullExpressionValue(listOnActivityLayout, "");
            return onNavigationEvent(listOnActivityLayout);
        }

        private static void b(byte b, int i, char[] cArr, Object[] objArr) {
            char[] cArr2;
            int i2;
            int i3;
            int i4;
            char[] cArr3;
            int i5;
            int i6 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr4 = readTypedObject;
            int i7 = 0;
            if (cArr4 != null) {
                int i8 = $10 + 97;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                int length = cArr4.length;
                char[] cArr5 = new char[length];
                for (int i10 = 0; i10 < length; i10++) {
                    cArr5[i10] = PKCS58.onNavigationEvent.z(cArr4[i10]);
                }
                int i11 = $10 + 37;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                cArr2 = cArr5;
            } else {
                cArr2 = cArr4;
            }
            char cZ = PKCS58.onNavigationEvent.z(writeTypedObject);
            char[] cArr6 = new char[i];
            if (i % 2 != 0) {
                int i13 = $10 + 99;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                int i15 = i - 1;
                cArr6[i15] = (char) (cArr[i15] - b);
                i2 = i15;
            } else {
                i2 = i;
            }
            int i16 = 1;
            if (i2 > 1) {
                int i17 = $11 + 55;
                $10 = i17 % 128;
                int i18 = i17 % 2;
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + i16];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        cArr6[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr6[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + i16] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        i3 = i16;
                        i4 = i2;
                        cArr3 = cArr6;
                        i5 = i7;
                    } else {
                        i3 = i16;
                        i4 = i2;
                        cArr3 = cArr6;
                        i5 = i7;
                        if (DevToolActionListViewModel$asInterface.A(defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0) == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            int I = s3.onExtraCallbackWithResult.I(defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, cZ, defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, cZ, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0);
                            int i19 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cZ) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[I];
                            cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i19];
                        } else if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cZ) - 1) % cZ;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cZ) - 1) % cZ;
                            int i20 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cZ) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i21 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cZ) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i20];
                            cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i21];
                        } else {
                            int i22 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cZ) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i23 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cZ) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i22];
                            cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i23];
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    cArr6 = cArr3;
                    i16 = i3;
                    i2 = i4;
                    i7 = i5;
                }
            }
            char[] cArr7 = cArr6;
            int i24 = i7;
            for (int i25 = i24; i25 < i; i25++) {
                cArr7[i25] = (char) (cArr7[i25] ^ 13722);
            }
            String str = new String(cArr7);
            int i26 = $11 + 91;
            $10 = i26 % 128;
            if (i26 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            objArr[i24] = str;
        }

        private final ReactNativeContentOwner onNavigationEvent(List<? extends Fragment> list) {
            int i = 2 % 2;
            ReactNativeContentOwner reactNativeContentOwnerOnNavigationEvent = null;
            if (list.isEmpty()) {
                int i2 = extraCallbackWithResult + 55;
                ICustomTabsCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return null;
                }
                reactNativeContentOwnerOnNavigationEvent.hashCode();
                throw null;
            }
            Iterator<? extends Fragment> it = list.iterator();
            while (!(!it.hasNext())) {
                int i3 = ICustomTabsCallback + 47;
                extraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Fragment next = it.next();
                reactNativeContentOwnerOnNavigationEvent = onNavigationEvent(next);
                if (reactNativeContentOwnerOnNavigationEvent == null) {
                    int i5 = ICustomTabsCallback + 107;
                    extraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    List<? extends Fragment> listOnActivityLayout = next.getChildFragmentManager().onActivityLayout();
                    Intrinsics.checkNotNullExpressionValue(listOnActivityLayout, "");
                    reactNativeContentOwnerOnNavigationEvent = onNavigationEvent(listOnActivityLayout);
                }
                if (reactNativeContentOwnerOnNavigationEvent != null) {
                    break;
                }
            }
            int i7 = ICustomTabsCallback + 13;
            extraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            return reactNativeContentOwnerOnNavigationEvent;
        }

        private final ReactNativeContentOwner onNavigationEvent(Fragment fragment) {
            int i = 2 % 2;
            if (!TimeStamp.IAuthTabCallback(fragment)) {
                return null;
            }
            int i2 = extraCallbackWithResult;
            int i3 = i2 + 103;
            ICustomTabsCallback = i3 % 128;
            int i4 = i3 % 2;
            if (!(fragment instanceof ReactNativeContentOwner)) {
                return null;
            }
            int i5 = i2 + 45;
            ICustomTabsCallback = i5 % 128;
            ReactNativeContentOwner reactNativeContentOwner = (ReactNativeContentOwner) fragment;
            if (i5 % 2 == 0) {
                int i6 = 44 / 0;
            }
            return reactNativeContentOwner;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        private final String onWarmupCompleted(MaxFullscreenAdImpl maxFullscreenAdImpl) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            if (maxFullscreenAdImpl instanceof MaxFullscreenAdImpl.onExtraCallbackWithResult) {
                int i2 = ICustomTabsCallback + 103;
                extraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return onNavigationEvent(((MaxFullscreenAdImpl.onExtraCallbackWithResult) maxFullscreenAdImpl).onExtraCallbackWithResult().IAuthTabCallback());
            }
            if (!(maxFullscreenAdImpl instanceof MaxFullscreenAdImpl.onExtraCallback)) {
                if (maxFullscreenAdImpl != null) {
                    throw new NoWhenBranchMatchedException();
                }
                Object[] objArr = new Object[1];
                b((byte) (29 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 7 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), new char[]{'$', 22, '+', 14, '\"', 2, 13842}, objArr);
                return ((String) objArr[0]).intern();
            }
            int i4 = ICustomTabsCallback + 25;
            extraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                Object[] objArr2 = new Object[1];
                a(new int[]{63, 5, 0, 0}, true, new byte[]{1, 1, 0, 1, 1}, objArr2);
                return ((String) objArr2[0]).intern();
            }
            Object[] objArr3 = new Object[1];
            a(new int[]{63, 5, 0, 0}, false, new byte[]{1, 1, 0, 1, 1}, objArr3);
            return ((String) objArr3[0]).intern();
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        private final String onExtraCallbackWithResult(MaxFullscreenAdImpl maxFullscreenAdImpl) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            if (maxFullscreenAdImpl instanceof MaxFullscreenAdImpl.onExtraCallbackWithResult) {
                int i2 = extraCallbackWithResult + 73;
                ICustomTabsCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return requestTimeStampWithHash.IAuthTabCallback(((MaxFullscreenAdImpl.onExtraCallbackWithResult) maxFullscreenAdImpl).onExtraCallbackWithResult().IAuthTabCallback());
                }
                requestTimeStampWithHash.IAuthTabCallback(((MaxFullscreenAdImpl.onExtraCallbackWithResult) maxFullscreenAdImpl).onExtraCallbackWithResult().IAuthTabCallback());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!(maxFullscreenAdImpl instanceof MaxFullscreenAdImpl.onExtraCallback)) {
                if (maxFullscreenAdImpl != null) {
                    throw new NoWhenBranchMatchedException();
                }
                Object[] objArr = new Object[1];
                b((byte) (30 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 6 - TextUtils.lastIndexOf("", '0'), new char[]{'$', 22, '+', 14, '\"', 2, 13842}, objArr);
                return ((String) objArr[0]).intern();
            }
            Object[] objArr2 = new Object[1];
            a(new int[]{63, 5, 0, 0}, false, new byte[]{1, 1, 0, 1, 1}, objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            int i3 = ICustomTabsCallback + 35;
            extraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return strIntern;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x004f, code lost:
        
            return o.requestTimeStampWithHash.IAuthTabCallback((java.lang.String) im.toss.rn.spec.bundle.TossReactBundleMeta.onWarmupCompleted(new java.lang.Object[]{r8.onExtraCallbackWithResult()}, o.WebSocketFactory.onExtraCallback.IAuthTabCallback(), o.WebSocketFactory.onExtraCallback.IAuthTabCallback(), -1379106844, 1379106845, o.WebSocketFactory.onExtraCallback.IAuthTabCallback(), o.WebSocketFactory.onExtraCallback.IAuthTabCallback()));
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0052, code lost:
        
            if ((r8 instanceof o.MaxFullscreenAdImpl.onExtraCallback) == false) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
        
            r5 = r5 + 49;
            o.encryptPKCS8PrikeyInfo.onWarmupCompleted.extraCallbackWithResult = r5 % 128;
            r5 = r5 % 2;
            r1 = new java.lang.Object[1];
            a(new int[]{63, 5, 0, 0}, false, new byte[]{1, 1, 0, 1, 1}, r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0074, code lost:
        
            return ((java.lang.String) r1[0]).intern();
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0075, code lost:
        
            if (r8 != null) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0077, code lost:
        
            r3 = r3 + 41;
            o.encryptPKCS8PrikeyInfo.onWarmupCompleted.ICustomTabsCallback = r3 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0081, code lost:
        
            if ((r3 % 2) != 0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0083, code lost:
        
            r1 = new java.lang.Object[1];
            b((byte) (34 / (android.view.ViewConfiguration.getScrollBarSize() % 31)), 126 % (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)), new char[]{'$', 22, '+', 14, '\"', 2, 13842}, r1);
            r8 = r1[0];
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00a3, code lost:
        
            r1 = new java.lang.Object[1];
            b((byte) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 30), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)) + 6, new char[]{'$', 22, '+', 14, '\"', 2, 13842}, r1);
            r8 = r1[0];
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00c6, code lost:
        
            return ((java.lang.String) r8).intern();
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00cc, code lost:
        
            throw new kotlin.NoWhenBranchMatchedException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
        
            if ((!(r8 instanceof o.MaxFullscreenAdImpl.onExtraCallbackWithResult)) != true) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
        
            if ((r8 instanceof o.MaxFullscreenAdImpl.onExtraCallbackWithResult) != false) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static /* synthetic */ java.lang.Object onExtraCallback(java.lang.Object[] r8) throws kotlin.NoWhenBranchMatchedException {
            /*
                r0 = 0
                r1 = r8[r0]
                o.encryptPKCS8PrikeyInfo$onWarmupCompleted r1 = (o.encryptPKCS8PrikeyInfo.onWarmupCompleted) r1
                r1 = 1
                r8 = r8[r1]
                o.MaxFullscreenAdImpl r8 = (o.MaxFullscreenAdImpl) r8
                r2 = 2
                int r3 = r2 % r2
                int r3 = o.encryptPKCS8PrikeyInfo.onWarmupCompleted.extraCallbackWithResult
                int r4 = r3 + 125
                int r5 = r4 % 128
                o.encryptPKCS8PrikeyInfo.onWarmupCompleted.ICustomTabsCallback = r5
                int r4 = r4 % r2
                if (r4 != 0) goto L21
                boolean r4 = r8 instanceof o.MaxFullscreenAdImpl.onExtraCallbackWithResult
                r6 = 8
                int r6 = r6 / r0
                r4 = r4 ^ r1
                if (r4 == r1) goto L50
                goto L25
            L21:
                boolean r4 = r8 instanceof o.MaxFullscreenAdImpl.onExtraCallbackWithResult
                if (r4 == 0) goto L50
            L25:
                o.MaxFullscreenAdImpl$onExtraCallbackWithResult r8 = (o.MaxFullscreenAdImpl.onExtraCallbackWithResult) r8
                im.toss.rn.spec.bundle.TossReactBundleMeta r8 = r8.onExtraCallbackWithResult()
                java.lang.Object[] r0 = new java.lang.Object[]{r8}
                int r5 = o.WebSocketFactory.onExtraCallback.IAuthTabCallback()
                int r2 = o.WebSocketFactory.onExtraCallback.IAuthTabCallback()
                int r1 = o.WebSocketFactory.onExtraCallback.IAuthTabCallback()
                int r6 = o.WebSocketFactory.onExtraCallback.IAuthTabCallback()
                r3 = -1379106844(0xffffffffadcc7fe4, float:-2.324891E-11)
                r4 = 1379106845(0x5233801d, float:1.9273713E11)
                java.lang.Object r8 = im.toss.rn.spec.bundle.TossReactBundleMeta.onWarmupCompleted(r0, r1, r2, r3, r4, r5, r6)
                java.lang.String r8 = (java.lang.String) r8
                java.lang.String r8 = o.requestTimeStampWithHash.IAuthTabCallback(r8)
                return r8
            L50:
                boolean r4 = r8 instanceof o.MaxFullscreenAdImpl.onExtraCallback
                if (r4 == 0) goto L75
                int r5 = r5 + 49
                int r8 = r5 % 128
                o.encryptPKCS8PrikeyInfo.onWarmupCompleted.extraCallbackWithResult = r8
                int r5 = r5 % r2
                r8 = 63
                r2 = 5
                int[] r8 = new int[]{r8, r2, r0, r0}
                byte[] r2 = new byte[r2]
                r2 = {x00ce: FILL_ARRAY_DATA , data: [1, 1, 0, 1, 1} // fill-array
                java.lang.Object[] r1 = new java.lang.Object[r1]
                a(r8, r0, r2, r1)
                r8 = r1[r0]
                java.lang.String r8 = (java.lang.String) r8
                java.lang.String r8 = r8.intern()
                return r8
            L75:
                if (r8 != 0) goto Lc7
                int r3 = r3 + 41
                int r8 = r3 % 128
                o.encryptPKCS8PrikeyInfo.onWarmupCompleted.ICustomTabsCallback = r8
                int r3 = r3 % r2
                r8 = 7
                r4 = 0
                if (r3 != 0) goto La3
                int r2 = android.view.ViewConfiguration.getScrollBarSize()
                int r2 = r2 % 31
                r3 = 34
                int r3 = r3 / r2
                byte r2 = (byte) r3
                long r6 = android.view.ViewConfiguration.getGlobalActionKeyTimeout()
                int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                r4 = 126(0x7e, float:1.77E-43)
                int r4 = r4 % r3
                char[] r8 = new char[r8]
                r8 = {x00d6: FILL_ARRAY_DATA , data: [36, 22, 43, 14, 34, 2, 13842} // fill-array
                java.lang.Object[] r1 = new java.lang.Object[r1]
                b(r2, r4, r8, r1)
                r8 = r1[r0]
                goto Lc0
            La3:
                int r2 = android.view.ViewConfiguration.getScrollBarSize()
                int r2 = r2 >> 8
                int r2 = r2 + 30
                byte r2 = (byte) r2
                long r6 = android.view.ViewConfiguration.getGlobalActionKeyTimeout()
                int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                int r3 = r3 + 6
                char[] r8 = new char[r8]
                r8 = {x00e2: FILL_ARRAY_DATA , data: [36, 22, 43, 14, 34, 2, 13842} // fill-array
                java.lang.Object[] r1 = new java.lang.Object[r1]
                b(r2, r3, r8, r1)
                r8 = r1[r0]
            Lc0:
                java.lang.String r8 = (java.lang.String) r8
                java.lang.String r8 = r8.intern()
                return r8
            Lc7:
                kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: o.encryptPKCS8PrikeyInfo.onWarmupCompleted.onExtraCallback(java.lang.Object[]):java.lang.Object");
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        private final String onNavigationEvent(MaxFullscreenAdImpl maxFullscreenAdImpl) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            if (!(maxFullscreenAdImpl instanceof MaxFullscreenAdImpl.onExtraCallbackWithResult)) {
                if (maxFullscreenAdImpl instanceof MaxFullscreenAdImpl.onExtraCallback) {
                    Object[] objArr = new Object[1];
                    a(new int[]{63, 5, 0, 0}, false, new byte[]{1, 1, 0, 1, 1}, objArr);
                    return ((String) objArr[0]).intern();
                }
                if (maxFullscreenAdImpl != null) {
                    throw new NoWhenBranchMatchedException();
                }
                Object[] objArr2 = new Object[1];
                b((byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 30), 6 - ExpandableListView.getPackedPositionChild(0L), new char[]{'$', 22, '+', 14, '\"', 2, 13842}, objArr2);
                return ((String) objArr2[0]).intern();
            }
            int i2 = ICustomTabsCallback + 91;
            extraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                requestTimeStampWithHash.IAuthTabCallback(((MaxFullscreenAdImpl.onExtraCallbackWithResult) maxFullscreenAdImpl).onExtraCallbackWithResult().asInterface());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String strIAuthTabCallback = requestTimeStampWithHash.IAuthTabCallback(((MaxFullscreenAdImpl.onExtraCallbackWithResult) maxFullscreenAdImpl).onExtraCallbackWithResult().asInterface());
            int i3 = ICustomTabsCallback + 113;
            extraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 53 / 0;
            }
            return strIAuthTabCallback;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x005f, code lost:
        
            return r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
        
            return o.requestTimeStampWithHash.IAuthTabCallback(kotlin.text.StringsKt.take(r9, 7));
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0034, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r9, ((java.lang.String) r4[0]).intern()) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0055, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r9, ((java.lang.String) r4[0]).intern()) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0057, code lost:
        
            r1 = o.encryptPKCS8PrikeyInfo.onWarmupCompleted.ICustomTabsCallback + 7;
            o.encryptPKCS8PrikeyInfo.onWarmupCompleted.extraCallbackWithResult = r1 % 128;
            r1 = r1 % 2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final java.lang.String onNavigationEvent(java.lang.String r9) {
            /*
                r8 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = o.encryptPKCS8PrikeyInfo.onWarmupCompleted.extraCallbackWithResult
                int r1 = r1 + 105
                int r2 = r1 % 128
                o.encryptPKCS8PrikeyInfo.onWarmupCompleted.ICustomTabsCallback = r2
                int r1 = r1 % r0
                r2 = 7
                r3 = 6
                r4 = 29
                r5 = 10
                r6 = 0
                r7 = 1
                if (r1 != 0) goto L37
                java.lang.String r9 = o.requestTimeStampWithHash.IAuthTabCallback(r9)
                int[] r1 = new int[]{r4, r5, r6, r3}
                byte[] r3 = new byte[r5]
                r3 = {x006a: FILL_ARRAY_DATA , data: [1, 0, 0, 1, 1, 1, 0, 1, 1, 0} // fill-array
                java.lang.Object[] r4 = new java.lang.Object[r7]
                a(r1, r6, r3, r4)
                r1 = r4[r6]
                java.lang.String r1 = (java.lang.String) r1
                java.lang.String r1 = r1.intern()
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r1)
                if (r1 == 0) goto L60
                goto L57
            L37:
                java.lang.String r9 = o.requestTimeStampWithHash.IAuthTabCallback(r9)
                int[] r1 = new int[]{r4, r5, r6, r3}
                byte[] r3 = new byte[r5]
                r3 = {x0074: FILL_ARRAY_DATA , data: [1, 0, 0, 1, 1, 1, 0, 1, 1, 0} // fill-array
                java.lang.Object[] r4 = new java.lang.Object[r7]
                a(r1, r7, r3, r4)
                r1 = r4[r6]
                java.lang.String r1 = (java.lang.String) r1
                java.lang.String r1 = r1.intern()
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r1)
                if (r1 == 0) goto L60
            L57:
                int r1 = o.encryptPKCS8PrikeyInfo.onWarmupCompleted.ICustomTabsCallback
                int r1 = r1 + r2
                int r2 = r1 % 128
                o.encryptPKCS8PrikeyInfo.onWarmupCompleted.extraCallbackWithResult = r2
                int r1 = r1 % r0
                return r9
            L60:
                java.lang.String r9 = kotlin.text.StringsKt.take(r9, r2)
                java.lang.String r9 = o.requestTimeStampWithHash.IAuthTabCallback(r9)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: o.encryptPKCS8PrikeyInfo.onWarmupCompleted.onNavigationEvent(java.lang.String):java.lang.String");
        }

        private final String onExtraCallbackWithResult(String str, String str2) {
            int i = 2 % 2;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            Object[] objArr = new Object[1];
            a(new int[]{62, 1, 12, 1}, false, new byte[]{1}, objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(str2);
            String string = sb.toString();
            int i2 = ICustomTabsCallback + 69;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return string;
        }

        static final class onExtraCallbackWithResult {
            public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private onExtraCallbackWithResult() {
            }
        }

        private final String onExtraCallback(MaxFullscreenAdImpl maxFullscreenAdImpl) {
            int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
            return (String) IAuthTabCallback(forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback, new Object[]{this, maxFullscreenAdImpl}, -1544448390, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), 1544448392);
        }

        private static final r8lambdaHDAe14RP_YfkbgNStt68qt10Iow IAuthTabCallback(onWarmupCompleted onwarmupcompleted) {
            int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
            return (r8lambdaHDAe14RP_YfkbgNStt68qt10Iow) IAuthTabCallback(forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback, new Object[]{onwarmupcompleted}, 1749595021, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -1749595018);
        }

        private static final Unit onWarmupCompleted(onWarmupCompleted onwarmupcompleted, TextField textField, getTypedExportedConstants gettypedexportedconstants, View view) {
            int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
            return (Unit) IAuthTabCallback(forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback, new Object[]{onwarmupcompleted, textField, gettypedexportedconstants, view}, 1132901729, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -1132901729);
        }

        private static final Unit onExtraCallbackWithResult(onWarmupCompleted onwarmupcompleted, getTypedExportedConstants gettypedexportedconstants, View view) {
            int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
            return (Unit) IAuthTabCallback(forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback, new Object[]{onwarmupcompleted, gettypedexportedconstants, view}, -722086447, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), 722086448);
        }

        static void asInterface() {
            getInterfaceDescriptor = new char[]{27260, 27178, 27173, 27175, 27178, 27171, 27149, 27340, 27340, 27332, 27331, 27338, 27341, 27338, 27184, 27340, 27176, 27183, 27189, 27343, 27333, 27331, 27330, 27338, 27180, 27183, 27187, 27336, 27172, 27260, 27170, 27166, 27167, 27171, 27178, 27173, 27173, 27171, 27194, 27244, 27160, 27168, 27197, 27197, 27171, 27179, 27173, 27194, 27168, 27170, 27168, 27145, 27261, 27154, 27198, 27196, 27196, 27142, 2796, 44754, 42232, 43914, 27219, 27260, 27173, 27196, 27198, 27198, 3652, 44754, 2796, 27142, 27196, 27196, 27198, 27170, 27149, 27145, 27168, 27170, 27168, 27194, 27173, 27179, 27171, 27197, 27197, 27168, 27176, 15702, 57306, 57035, 15464, 27235, 27255, 27170, 27173, 27194, 27169, 27176, 27178, 27148, 27148, 27178, 27172, 27168, 27171, 27194, 27169, 27178, 27164, 27156, 27260, 27173, 27175, 27178, 27171, 27143, 27148, 27178, 27176, 27169, 27194, 27173, 27170, 27197, 27156, 27164, 27178, 27169, 27194, 27171, 27168, 27172, 27162, 27159, 27173, 27157, 27158};
            readTypedObject = new char[]{64970, 64981, 64965, 64982, 21379, 64972, 64964, 15739, 20819, 12475, 64980, 65021, 65018, 64990, 18775, 64989, 64983, 65015, 11239, 65012, 64960, 64976, 15511, 17903, 64924, 64979, 16699, 64975, 10475, 64966, 64988, 64967, 64961, 64963, 64985, 65065, 64987, 64991, 64962, 13275, 64977, 13734, 64984, 64978, 64915, 64973, 65010, 64986, 64974};
            writeTypedObject = (char) 51246;
        }
    }

    private encryptPKCS8PrikeyInfo() {
    }

    public getNotAfterTime onExtraCallbackWithResult(@Nullable Long l, @Nullable SchemeManagerInfoResponse schemeManagerInfoResponse, @Nullable String str, @NotNull Map<String, String> map, @NotNull String str2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(503);
        int i3 = (~iOnWarmupCompleted) & i2;
        int i4 = (~i2) & iOnWarmupCompleted;
        Object obj = null;
        if (((((i4 & i3) | (i3 ^ i4)) >> 23) & 1) == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(str2, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str2, "");
        String typeName = IAuthTabCallbackDefault().getTypeName();
        String strIAuthTabCallbackStub = IAuthTabCallbackStub();
        int i5 = onExtraCallbackWithResult;
        int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4878);
        int i6 = (~iOnWarmupCompleted2) & i5;
        int i7 = (~i5) & iOnWarmupCompleted2;
        if (((((i7 & i6) | (i6 ^ i7)) >> 10) & 1) != 0) {
            onTransact();
            RegionDomainModuleKt.onExtraCallbackWithResult().onExtraCallbackWithResult();
            throw null;
        }
        getNotAfterTime getnotaftertime = new getNotAfterTime(typeName, strIAuthTabCallbackStub, onTransact(), l, schemeManagerInfoResponse, RegionDomainModuleKt.onExtraCallbackWithResult().onExtraCallbackWithResult(), str, map, str2, (Map) null, 512, (DefaultConstructorMarker) null);
        int i8 = onExtraCallbackWithResult;
        int iOnWarmupCompleted3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(432);
        int i9 = i8 & iOnWarmupCompleted3;
        if ((((((i8 ^ iOnWarmupCompleted3) | i9) & (~i9)) >> 8) & 1) == 0) {
            return getnotaftertime;
        }
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallback extends encryptPKCS8PrikeyInfo {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackDefault = 0;
        private static int IAuthTabCallbackStub = -468086126;
        private static char asBinder = 27643;
        private static int asInterface = 1;
        private static long onTransact = 7798559133331975163L;
        private final String IAuthTabCallback;
        private final handleServerMsgRemoteApiCallback onExtraCallback;
        private final Activity onNavigationEvent;
        private final decryptPrikey onWarmupCompleted;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00f0  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0072  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public onExtraCallback(@org.jetbrains.annotations.NotNull android.app.Activity r12) {
            /*
                Method dump skipped, instructions count: 288
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.encryptPKCS8PrikeyInfo.onExtraCallback.<init>(android.app.Activity):void");
        }

        @Override // o.encryptPKCS8PrikeyInfo
        protected Activity IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 91;
            int i3 = i2 % 128;
            asInterface = i3;
            int i4 = i2 % 2;
            Activity activity = this.onNavigationEvent;
            int i5 = i3 + 51;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return activity;
        }

        @Override // o.encryptPKCS8PrikeyInfo
        protected decryptPrikey IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = asInterface;
            int i3 = i2 + 91;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            decryptPrikey decryptprikey = this.onWarmupCompleted;
            int i4 = i2 + 61;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return decryptprikey;
        }

        @Override // o.encryptPKCS8PrikeyInfo
        protected String IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = asInterface;
            int i3 = i2 + 119;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            String str = this.IAuthTabCallback;
            int i5 = i2 + 39;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 73 / 0;
            }
            return str;
        }

        @Override // o.encryptPKCS8PrikeyInfo
        public handleServerMsgRemoteApiCallback onTransact() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 57;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            handleServerMsgRemoteApiCallback handleservermsgremoteapicallback = this.onExtraCallback;
            int i5 = i2 + 51;
            asInterface = i5 % 128;
            if (i5 % 2 != 0) {
                return handleservermsgremoteapicallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) {
            int i2 = 2 % 2;
            TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int length2 = cArr2.length;
            char[] cArr5 = new char[length2];
            System.arraycopy(cArr3, 0, cArr4, 0, length);
            System.arraycopy(cArr2, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr.length;
            char[] cArr6 = new char[length3];
            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
            int i3 = $11 + 69;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                int i5 = $10 + 63;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                int iN = HttpDataSourceInvalidContentTypeException.n(trackSelectionParametersBuilderExternalSyntheticLambda0);
                int iM = HttpDataSourceInvalidResponseCodeException.m(trackSelectionParametersBuilderExternalSyntheticLambda0);
                makePFX_WINS.onNavigationEvent.C0003onNavigationEvent.k(trackSelectionParametersBuilderExternalSyntheticLambda0, cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718, cArr5[iN]);
                cArr5[iM] = AppNode61.onNavigationEvent.l(cArr4[iM] * 32718, cArr5[iN]);
                cArr4[iM] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iM] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onTransact ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallbackStub ^ 7798559133331975163L))) ^ ((char) (asBinder ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
            }
            String str = new String(cArr6);
            int i7 = $10 + 123;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            objArr[0] = str;
        }
    }

    public static final class onExtraCallbackWithResult extends encryptPKCS8PrikeyInfo implements ScreenCaptureAlertDialog$onNavigationEvent {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackDefault = -1776194565;
        private static int IAuthTabCallbackStubProxy = 0;
        private static int access100 = 1;
        private static long asBinder = 7798559133331975163L;
        private static char onTransact = 1780;
        private final handleServerMsgRemoteApiCallback IAuthTabCallback;
        private final decryptPrikey IAuthTabCallbackStub;
        private final String asInterface;
        private final String onExtraCallback;
        private final Function1<Activity, Unit> onNavigationEvent;
        private final Activity onWarmupCompleted;

        public static /* synthetic */ Unit onExtraCallbackWithResult(onExtraCallbackWithResult onextracallbackwithresult, Activity activity) {
            int i = 2 % 2;
            int i2 = access100 + 115;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 == 0) {
                return IAuthTabCallback(onextracallbackwithresult, activity);
            }
            IAuthTabCallback(onextracallbackwithresult, activity);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallbackWithResult(@NotNull Activity activity) {
            super(null);
            Intrinsics.checkNotNullParameter(activity, "");
            this.onWarmupCompleted = activity;
            this.IAuthTabCallbackStub = decryptPrikey.WEB;
            String strIAuthTabCallback = onVisit.IAuthTabCallback(IAuthTabCallback());
            String strOnNavigationEvent = onNavigationEvent();
            StringBuilder sb = new StringBuilder();
            sb.append(strIAuthTabCallback);
            Object[] objArr = new Object[1];
            a((char) (62675 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (-2028485851) - Color.alpha(0), new char[]{23687}, new char[]{0, 0, 0, 0}, new char[]{9500, 6083, 53895, 48884}, objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(strOnNavigationEvent);
            this.asInterface = sb.toString();
            handleServerMsgRemoteApiCallback handleservermsgremoteapicallbackIAuthTabCallback = handleServerMsgRemoteApiCallback.Companion.IAuthTabCallback(onNavigationEvent());
            if (handleservermsgremoteapicallbackIAuthTabCallback == null) {
                handleservermsgremoteapicallbackIAuthTabCallback = handleServerMsgRemoteApiCallback.CORE;
                int i = IAuthTabCallbackStubProxy + 27;
                access100 = i % 128;
                if (i % 2 == 0) {
                    int i2 = 5 % 5;
                } else {
                    int i3 = 2 % 2;
                }
            }
            this.IAuthTabCallback = handleservermsgremoteapicallbackIAuthTabCallback;
            Object[] objArr2 = new Object[1];
            a((char) (ViewConfiguration.getTouchSlop() >> 8), ViewConfiguration.getEdgeSlop() >> 16, new char[]{63100, 36830, 58395, 21135, 54424, 39375, 20115, 17006, 1186, 49757, 28328, 4620}, new char[]{0, 0, 0, 0}, new char[]{48502, 44036, 14117, 19409}, objArr2);
            this.onExtraCallback = ((String) objArr2[0]).intern();
            this.onNavigationEvent = new ScreenCaptureType$Web$.ExternalSyntheticLambda0(this);
            int i4 = access100 + 123;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // o.encryptPKCS8PrikeyInfo
        protected Activity IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy;
            int i3 = i2 + 77;
            access100 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            Activity activity = this.onWarmupCompleted;
            int i4 = i2 + 1;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            return activity;
        }

        @Override // o.encryptPKCS8PrikeyInfo
        protected decryptPrikey IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = access100 + 35;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 == 0) {
                return this.IAuthTabCallbackStub;
            }
            throw null;
        }

        @Override // o.encryptPKCS8PrikeyInfo
        protected String IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy;
            int i3 = i2 + 77;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.asInterface;
            int i5 = i2 + 103;
            access100 = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            throw null;
        }

        @Override // o.encryptPKCS8PrikeyInfo
        public handleServerMsgRemoteApiCallback onTransact() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy + 17;
            access100 = i2 % 128;
            if (i2 % 2 != 0) {
                return this.IAuthTabCallback;
            }
            throw null;
        }

        @Override // viva.republica.toss.dev.screencapture.ScreenCaptureAlertDialog$onNavigationEvent
        public String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = access100;
            int i3 = i2 + 65;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onExtraCallback;
            int i5 = i2 + 123;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        @Override // viva.republica.toss.dev.screencapture.ScreenCaptureAlertDialog$onNavigationEvent
        public Function1<Activity, Unit> onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy;
            int i3 = i2 + 61;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            Function1<Activity, Unit> function1 = this.onNavigationEvent;
            int i5 = i2 + 95;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            return function1;
        }

        private static final Unit IAuthTabCallback(onExtraCallbackWithResult onextracallbackwithresult, Activity activity) {
            int i = 2 % 2;
            int i2 = access100 + 29;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(activity, "");
            ReactNativeFeatureFlagsCxxInterop.onWarmupCompleted.onExtraCallback(onextracallbackwithresult.IAuthTabCallback(), onextracallbackwithresult.onNavigationEvent());
            Activity activityIAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            Object[] objArr = new Object[1];
            a((char) (10612 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), ViewConfiguration.getKeyRepeatTimeout() >> 16, new char[]{37993, 43886, 31442, 12077, 49985, 25094}, new char[]{0, 0, 0, 0}, new char[]{10095, 63361, 29482, 50473}, objArr);
            Object obj = null;
            onJsBridgeReady.onNavigationEvent(activityIAuthTabCallback, ((String) objArr[0]).intern(), 0, 2, (Object) null);
            Unit unit = Unit.INSTANCE;
            int i4 = access100 + 59;
            IAuthTabCallbackStubProxy = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0096 A[PHI: r1
          0x0096: PHI (r1v11 im.toss.core.webkit.TossCoreWebView) = (r1v10 im.toss.core.webkit.TossCoreWebView), (r1v15 im.toss.core.webkit.TossCoreWebView) binds: [B:23:0x0094, B:20:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final java.lang.String onNavigationEvent() {
            /*
                r4 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = o.encryptPKCS8PrikeyInfo.onExtraCallbackWithResult.access100
                int r1 = r1 + 59
                int r2 = r1 % 128
                o.encryptPKCS8PrikeyInfo.onExtraCallbackWithResult.IAuthTabCallbackStubProxy = r2
                int r1 = r1 % r0
                android.app.Activity r1 = r4.IAuthTabCallback()
                boolean r2 = r1 instanceof im.toss.core.webkit.WebViewContentOwner
                r2 = r2 ^ 1
                java.lang.String r3 = ""
                if (r2 == 0) goto L69
                boolean r1 = r1 instanceof androidx.fragment.app.FragmentActivity
                if (r1 == 0) goto L5f
                int r1 = o.encryptPKCS8PrikeyInfo.onExtraCallbackWithResult.IAuthTabCallbackStubProxy
                int r1 = r1 + 65
                int r2 = r1 % 128
                o.encryptPKCS8PrikeyInfo.onExtraCallbackWithResult.access100 = r2
                int r1 = r1 % r0
                if (r1 == 0) goto L49
                android.app.Activity r1 = r4.IAuthTabCallback()
                androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
                o.FlowMeasureLazyPolicyExternalSyntheticLambda3 r1 = r1.getSupportFragmentManager()
                java.util.List r1 = r1.onActivityLayout()
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
                java.lang.String r1 = r4.onNavigationEvent(r1)
                if (r1 != 0) goto L3f
                return r3
            L3f:
                int r2 = o.encryptPKCS8PrikeyInfo.onExtraCallbackWithResult.access100
                int r2 = r2 + 55
                int r3 = r2 % 128
                o.encryptPKCS8PrikeyInfo.onExtraCallbackWithResult.IAuthTabCallbackStubProxy = r3
                int r2 = r2 % r0
                return r1
            L49:
                android.app.Activity r0 = r4.IAuthTabCallback()
                androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
                o.FlowMeasureLazyPolicyExternalSyntheticLambda3 r0 = r0.getSupportFragmentManager()
                java.util.List r0 = r0.onActivityLayout()
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
                r4.onNavigationEvent(r0)
                r0 = 0
                throw r0
            L5f:
                int r1 = o.encryptPKCS8PrikeyInfo.onExtraCallbackWithResult.access100
                int r1 = r1 + 109
                int r2 = r1 % 128
                o.encryptPKCS8PrikeyInfo.onExtraCallbackWithResult.IAuthTabCallbackStubProxy = r2
                int r1 = r1 % r0
                return r3
            L69:
                int r1 = o.encryptPKCS8PrikeyInfo.onExtraCallbackWithResult.access100
                int r1 = r1 + 107
                int r2 = r1 % 128
                o.encryptPKCS8PrikeyInfo.onExtraCallbackWithResult.IAuthTabCallbackStubProxy = r2
                int r1 = r1 % r0
                if (r1 == 0) goto L87
                android.app.Activity r1 = r4.IAuthTabCallback()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r3)
                im.toss.core.webkit.WebViewContentOwner r1 = (im.toss.core.webkit.WebViewContentOwner) r1
                im.toss.core.webkit.TossCoreWebView r1 = r1.getWebView()
                r2 = 5
                int r2 = r2 / 0
                if (r1 == 0) goto Lac
                goto L96
            L87:
                android.app.Activity r1 = r4.IAuthTabCallback()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r3)
                im.toss.core.webkit.WebViewContentOwner r1 = (im.toss.core.webkit.WebViewContentOwner) r1
                im.toss.core.webkit.TossCoreWebView r1 = r1.getWebView()
                if (r1 == 0) goto Lac
            L96:
                java.lang.String r1 = r1.getUrl()
                if (r1 == 0) goto Lac
                int r2 = o.encryptPKCS8PrikeyInfo.onExtraCallbackWithResult.IAuthTabCallbackStubProxy
                int r2 = r2 + 67
                int r3 = r2 % 128
                o.encryptPKCS8PrikeyInfo.onExtraCallbackWithResult.access100 = r3
                int r2 = r2 % r0
                if (r2 != 0) goto Lab
                r0 = 49
                int r0 = r0 / 0
            Lab:
                return r1
            Lac:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: o.encryptPKCS8PrikeyInfo.onExtraCallbackWithResult.onNavigationEvent():java.lang.String");
        }

        private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) {
            int i2 = 2 % 2;
            TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int length2 = cArr2.length;
            char[] cArr5 = new char[length2];
            System.arraycopy(cArr3, 0, cArr4, 0, length);
            System.arraycopy(cArr2, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr.length;
            char[] cArr6 = new char[length3];
            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
            while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                int i3 = $11 + 111;
                $10 = i3 % 128;
                int i4 = i3 % 2;
                int iN = HttpDataSourceInvalidContentTypeException.n(trackSelectionParametersBuilderExternalSyntheticLambda0);
                int iM = HttpDataSourceInvalidResponseCodeException.m(trackSelectionParametersBuilderExternalSyntheticLambda0);
                makePFX_WINS.onNavigationEvent.C0003onNavigationEvent.k(trackSelectionParametersBuilderExternalSyntheticLambda0, cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718, cArr5[iN]);
                cArr5[iM] = AppNode61.onNavigationEvent.l(cArr4[iM] * 32718, cArr5[iN]);
                cArr4[iM] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iM] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (asBinder ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallbackDefault ^ 7798559133331975163L))) ^ ((char) (onTransact ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
            }
            String str = new String(cArr6);
            int i5 = $10 + 105;
            $11 = i5 % 128;
            if (i5 % 2 != 0) {
                objArr[0] = str;
            } else {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        private final String onNavigationEvent(List<? extends Fragment> list) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy + 91;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            if (!list.isEmpty()) {
                String strOnNavigationEvent = null;
                for (Fragment fragment : list) {
                    String strIAuthTabCallback = IAuthTabCallback(fragment);
                    if (strIAuthTabCallback == null) {
                        List<? extends Fragment> listOnActivityLayout = fragment.getChildFragmentManager().onActivityLayout();
                        Intrinsics.checkNotNullExpressionValue(listOnActivityLayout, "");
                        strOnNavigationEvent = onNavigationEvent(listOnActivityLayout);
                    } else {
                        strOnNavigationEvent = strIAuthTabCallback;
                    }
                    if (strOnNavigationEvent != null) {
                        break;
                    }
                }
                int i4 = access100 + 41;
                IAuthTabCallbackStubProxy = i4 % 128;
                if (i4 % 2 == 0) {
                    return strOnNavigationEvent;
                }
                throw null;
            }
            int i5 = IAuthTabCallbackStubProxy + 77;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final java.lang.String IAuthTabCallback(androidx.fragment.app.Fragment r5) {
            /*
                r4 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = o.encryptPKCS8PrikeyInfo.onExtraCallbackWithResult.access100
                int r1 = r1 + 101
                int r2 = r1 % 128
                o.encryptPKCS8PrikeyInfo.onExtraCallbackWithResult.IAuthTabCallbackStubProxy = r2
                int r1 = r1 % r0
                r2 = 0
                if (r1 == 0) goto L1a
                boolean r1 = o.TimeStamp.onExtraCallbackWithResult(r5)
                r3 = 29
                int r3 = r3 / 0
                if (r1 == 0) goto L64
                goto L20
            L1a:
                boolean r1 = o.TimeStamp.onExtraCallbackWithResult(r5)
                if (r1 == 0) goto L64
            L20:
                int r1 = o.encryptPKCS8PrikeyInfo.onExtraCallbackWithResult.access100
                int r1 = r1 + 83
                int r3 = r1 % 128
                o.encryptPKCS8PrikeyInfo.onExtraCallbackWithResult.IAuthTabCallbackStubProxy = r3
                int r1 = r1 % r0
                java.lang.String r3 = ""
                if (r1 != 0) goto L5b
                kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r3)
                im.toss.core.webkit.WebViewContentOwner r5 = (im.toss.core.webkit.WebViewContentOwner) r5
                im.toss.core.webkit.TossCoreWebView r5 = r5.getWebView()
                if (r5 == 0) goto L64
                int r1 = o.encryptPKCS8PrikeyInfo.onExtraCallbackWithResult.IAuthTabCallbackStubProxy
                int r1 = r1 + 31
                int r3 = r1 % 128
                o.encryptPKCS8PrikeyInfo.onExtraCallbackWithResult.access100 = r3
                int r1 = r1 % r0
                if (r1 == 0) goto L57
                java.lang.String r0 = r5.getUrl()
                if (r0 == 0) goto L64
                int r0 = r0.length()
                if (r0 == 0) goto L64
                java.lang.String r5 = r5.getUrl()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
                return r5
            L57:
                r5.getUrl()
                throw r2
            L5b:
                kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r3)
                im.toss.core.webkit.WebViewContentOwner r5 = (im.toss.core.webkit.WebViewContentOwner) r5
                r5.getWebView()
                throw r2
            L64:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: o.encryptPKCS8PrikeyInfo.onExtraCallbackWithResult.IAuthTabCallback(androidx.fragment.app.Fragment):java.lang.String");
        }
    }

    public static final class onNavigationEvent extends encryptPKCS8PrikeyInfo implements ScreenCaptureAlertDialog$onNavigationEvent {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackStubProxy = 0;
        private static int IAuthTabCallback_Parcel = 1;
        private final handleServerMsgRemoteApiCallback IAuthTabCallback;
        private final decryptPrikey IAuthTabCallbackDefault;
        private final Activity onExtraCallback;
        private final String onNavigationEvent;
        private final String onTransact;
        private final Function1<Activity, Unit> onWarmupCompleted;
        private static int[] asInterface = {1519400352, -899575295, -1047031009, -275281651, -1211154628, 980410746, -366060594, -911920014, -1385268401, 1012564586, 1267411393, -1373605774, -2046917261, -1015019731, 1932276633, 875788026, 592442461, -1106492729};
        private static long IAuthTabCallbackStub = 7798559133331975163L;
        private static int asBinder = -1776194565;
        private static char access000 = 43008;

        public static /* synthetic */ Unit onExtraCallback(Activity activity) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 87;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
                onExtraCallbackWithResult(activity);
                throw null;
            }
            Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(activity);
            int i3 = IAuthTabCallback_Parcel + 43;
            IAuthTabCallbackStubProxy = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 13 / 0;
            }
            return unitOnExtraCallbackWithResult;
        }

        private static void b(int i, char c, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) {
            int i2 = 2 % 2;
            TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
            int length = cArr2.length;
            char[] cArr4 = new char[length];
            int length2 = cArr3.length;
            char[] cArr5 = new char[length2];
            System.arraycopy(cArr2, 0, cArr4, 0, length);
            System.arraycopy(cArr3, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr.length;
            char[] cArr6 = new char[length3];
            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
            while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                int i3 = $11 + 79;
                $10 = i3 % 128;
                int i4 = i3 % 2;
                int iN = HttpDataSourceInvalidContentTypeException.n(trackSelectionParametersBuilderExternalSyntheticLambda0);
                int iM = HttpDataSourceInvalidResponseCodeException.m(trackSelectionParametersBuilderExternalSyntheticLambda0);
                makePFX_WINS.onNavigationEvent.C0003onNavigationEvent.k(trackSelectionParametersBuilderExternalSyntheticLambda0, cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718, cArr5[iN]);
                cArr5[iM] = AppNode61.onNavigationEvent.l(cArr4[iM] * 32718, cArr5[iN]);
                cArr4[iM] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iM] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (IAuthTabCallbackStub ^ 7798559133331975163L)) ^ ((int) (asBinder ^ 7798559133331975163L))) ^ ((char) (access000 ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i5 = $11 + 121;
                $10 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 5 % 3;
                }
            }
            objArr[0] = new String(cArr6);
        }

        private static void a(int[] iArr, int i, Object[] objArr) {
            int i2 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = asInterface;
            if (iArr2 != null) {
                int i3 = $10 + 75;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                for (int i5 = 0; i5 < length; i5++) {
                    int i6 = $11 + 125;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                    iArr3[i5] = Hilt_QuickActionBottomSheetActivity$4.h(iArr2[i5]);
                }
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = asInterface;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i8 = 0;
                while (i8 < length3) {
                    iArr6[i8] = Hilt_QuickActionBottomSheetActivity$4.h(iArr5[i8]);
                    i8++;
                    int i9 = $11 + 99;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                }
                iArr5 = iArr6;
            }
            System.arraycopy(iArr5, 0, iArr4, 0, length2);
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                int i11 = $10 + 57;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                int i13 = 0;
                while (i13 < 16) {
                    int i14 = $10 + 63;
                    $11 = i14 % 128;
                    if (i14 % 2 == 0) {
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i13];
                        int iJ = bindContext.IAuthTabCallbackStubProxy.j(simpleBasePlayerPositionSupplierExternalSyntheticLambda0, SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0);
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iJ;
                        i13 += 10;
                    } else {
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i13];
                        int iJ2 = bindContext.IAuthTabCallbackStubProxy.j(simpleBasePlayerPositionSupplierExternalSyntheticLambda0, SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0);
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iJ2;
                        i13++;
                    }
                }
                int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i15;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
                int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
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
            objArr[0] = new String(cArr2, 0, i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onNavigationEvent(@NotNull Activity activity) {
            super(null);
            Intrinsics.checkNotNullParameter(activity, "");
            this.onExtraCallback = activity;
            this.IAuthTabCallbackDefault = decryptPrikey.MINI_APP;
            this.onTransact = onVisit.IAuthTabCallback(IAuthTabCallback());
            this.IAuthTabCallback = handleServerMsgRemoteApiCallback.CORE;
            Object[] objArr = new Object[1];
            a(new int[]{-1376034125, 1168041049, -367683661, -1180755550}, View.combineMeasuredStates(0, 0) + 7, objArr);
            this.onNavigationEvent = ((String) objArr[0]).intern();
            this.onWarmupCompleted = new ScreenCaptureType$MiniApp$.ExternalSyntheticLambda0();
        }

        @Override // o.encryptPKCS8PrikeyInfo
        protected Activity IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy + 39;
            int i3 = i2 % 128;
            IAuthTabCallback_Parcel = i3;
            int i4 = i2 % 2;
            Activity activity = this.onExtraCallback;
            int i5 = i3 + 77;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            return activity;
        }

        @Override // o.encryptPKCS8PrikeyInfo
        protected decryptPrikey IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy + 125;
            int i3 = i2 % 128;
            IAuthTabCallback_Parcel = i3;
            int i4 = i2 % 2;
            decryptPrikey decryptprikey = this.IAuthTabCallbackDefault;
            int i5 = i3 + 119;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            return decryptprikey;
        }

        @Override // o.encryptPKCS8PrikeyInfo
        protected String IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel;
            int i3 = i2 + 77;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onTransact;
            int i5 = i2 + 77;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        @Override // o.encryptPKCS8PrikeyInfo
        public handleServerMsgRemoteApiCallback onTransact() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy + 51;
            IAuthTabCallback_Parcel = i2 % 128;
            if (i2 % 2 != 0) {
                return this.IAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // viva.republica.toss.dev.screencapture.ScreenCaptureAlertDialog$onNavigationEvent
        public String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 97;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            String str = this.onNavigationEvent;
            if (i3 != 0) {
                int i4 = 58 / 0;
            }
            return str;
        }

        @Override // viva.republica.toss.dev.screencapture.ScreenCaptureAlertDialog$onNavigationEvent
        public Function1<Activity, Unit> onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy;
            int i3 = i2 + 81;
            IAuthTabCallback_Parcel = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            Function1<Activity, Unit> function1 = this.onWarmupCompleted;
            int i4 = i2 + 125;
            IAuthTabCallback_Parcel = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 50 / 0;
            }
            return function1;
        }

        private static final Unit onExtraCallbackWithResult(Activity activity) {
            r8lambdaeK8nSbQCAzTPTGQCG5EZPYPyuX8 r8lambdaek8nsbqcaztptgqcg5ezpypyux8;
            String strIAuthTabCallback;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(activity, "");
            Object obj = null;
            if (activity instanceof r8lambdaeK8nSbQCAzTPTGQCG5EZPYPyuX8) {
                int i2 = IAuthTabCallbackStubProxy + 79;
                IAuthTabCallback_Parcel = i2 % 128;
                if (i2 % 2 == 0) {
                    r8lambdaek8nsbqcaztptgqcg5ezpypyux8 = (r8lambdaeK8nSbQCAzTPTGQCG5EZPYPyuX8) activity;
                    int i3 = 55 / 0;
                } else {
                    r8lambdaek8nsbqcaztptgqcg5ezpypyux8 = (r8lambdaeK8nSbQCAzTPTGQCG5EZPYPyuX8) activity;
                }
            } else {
                r8lambdaek8nsbqcaztptgqcg5ezpypyux8 = null;
            }
            if (r8lambdaek8nsbqcaztptgqcg5ezpypyux8 != null) {
                strIAuthTabCallback = r8lambdaek8nsbqcaztptgqcg5ezpypyux8.IAuthTabCallback();
                int i4 = IAuthTabCallback_Parcel + 109;
                IAuthTabCallbackStubProxy = i4 % 128;
                int i5 = i4 % 2;
            } else {
                strIAuthTabCallback = null;
            }
            if (strIAuthTabCallback == null) {
                int i6 = IAuthTabCallbackStubProxy + 61;
                IAuthTabCallback_Parcel = i6 % 128;
                if (i6 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                strIAuthTabCallback = "";
            }
            ReactNativeFeatureFlagsCxxInterop.onWarmupCompleted.onExtraCallback(activity, strIAuthTabCallback);
            Object[] objArr = new Object[1];
            b(ViewConfiguration.getDoubleTapTimeout() >> 16, (char) (19824 - TextUtils.getCapsMode("", 0, 0)), new char[]{61063, 22201, 24544, 52033, 40949, 19832}, new char[]{21745, 58024, 28812, 21325}, new char[]{0, 0, 0, 0}, objArr);
            onJsBridgeReady.onNavigationEvent(activity, ((String) objArr[0]).intern(), 0, 2, (Object) null);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x012b  */
        @Override // o.encryptPKCS8PrikeyInfo
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public o.getNotAfterTime onExtraCallbackWithResult(@org.jetbrains.annotations.Nullable java.lang.Long r20, @org.jetbrains.annotations.Nullable viva.republica.toss.network.model.SchemeManagerInfoResponse r21, @org.jetbrains.annotations.Nullable java.lang.String r22, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> r23, @org.jetbrains.annotations.NotNull java.lang.String r24) {
            /*
                Method dump skipped, instructions count: 964
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.encryptPKCS8PrikeyInfo.onNavigationEvent.onExtraCallbackWithResult(java.lang.Long, viva.republica.toss.network.model.SchemeManagerInfoResponse, java.lang.String, java.util.Map, java.lang.String):o.getNotAfterTime");
        }
    }

    public static final class IAuthTabCallback {
        static int onExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(IAuthTabCallback.class);

        /* renamed from: o.encryptPKCS8PrikeyInfo$IAuthTabCallback$IAuthTabCallback, reason: collision with other inner class name */
        public static final /* synthetic */ class C0002IAuthTabCallback {
            static int IAuthTabCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(C0002IAuthTabCallback.class);
            public static final /* synthetic */ int[] onNavigationEvent;

            static {
                int[] iArr = new int[decryptPrikey.values().length];
                try {
                    iArr[decryptPrikey.APP.ordinal()] = 1;
                    if ((((IAuthTabCallback ^ BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5517)) >> 2) & 1) != 0) {
                        int i = 2 % 2;
                    }
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[decryptPrikey.WEB.ordinal()] = 2;
                    BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(283);
                    int i2 = 2 % 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[decryptPrikey.REACT_NATIVE.ordinal()] = 3;
                    int i3 = IAuthTabCallback;
                    int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4290);
                    if ((((((~i3) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i3)) >> 11) & 1) != 0) {
                        int i4 = 2 % 2;
                    }
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[decryptPrikey.MINI_APP.ordinal()] = 4;
                    int i5 = IAuthTabCallback;
                    int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2947);
                    int i6 = (~iOnWarmupCompleted2) & i5;
                    int i7 = (~i5) & iOnWarmupCompleted2;
                    if (((((i7 & i6) | (i6 ^ i7)) >> 15) & 1) != 0) {
                        int i8 = 2 % 2;
                    }
                } catch (NoSuchFieldError unused4) {
                }
                onNavigationEvent = iArr;
                int i9 = IAuthTabCallback;
                int iOnWarmupCompleted3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4550);
                int i10 = (~iOnWarmupCompleted3) & i9;
                int i11 = (~i9) & iOnWarmupCompleted3;
                if (((((i11 & i10) | (i10 ^ i11)) >> 3) & 1) == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final encryptPKCS8PrikeyInfo onNavigationEvent(@NotNull decryptPrikey decryptprikey, @NotNull Activity activity) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3684);
            int i3 = (~iOnWarmupCompleted) & i2;
            int i4 = (~i2) & iOnWarmupCompleted;
            int i5 = (((i4 & i3) | (i3 ^ i4)) >> 24) & 1;
            Object obj = null;
            if (i5 == 0) {
                Intrinsics.checkNotNullParameter(decryptprikey, "");
                Intrinsics.checkNotNullParameter(activity, "");
                int[] iArr = C0002IAuthTabCallback.onNavigationEvent;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(decryptprikey, "");
            Intrinsics.checkNotNullParameter(activity, "");
            int[] iArr2 = C0002IAuthTabCallback.onNavigationEvent;
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5772);
            int i6 = iArr2[decryptprikey.ordinal()];
            if (i6 == 1) {
                onExtraCallback onextracallback = new onExtraCallback(activity);
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4498);
                return onextracallback;
            }
            int i7 = onExtraCallback;
            int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2727);
            if (((i7 | iOnWarmupCompleted2) & (~(i7 & iOnWarmupCompleted2)) & 1) != 0 ? i6 == 2 : i6 == 2) {
                onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(activity);
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4878);
                return onextracallbackwithresult;
            }
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5517);
            if (i6 == 3) {
                onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(activity);
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5161);
                return onwarmupcompleted;
            }
            int i8 = onExtraCallback;
            int iOnWarmupCompleted3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4098);
            if (((((i8 | iOnWarmupCompleted3) & (~(i8 & iOnWarmupCompleted3))) >> 20) & 1) == 0 ? i6 != 4 : i6 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            onNavigationEvent onnavigationevent = new onNavigationEvent(activity);
            int i9 = onExtraCallback;
            int iOnWarmupCompleted4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1725);
            int i10 = (~iOnWarmupCompleted4) & i9;
            int i11 = (~i9) & iOnWarmupCompleted4;
            if (((((i11 & i10) | (i10 ^ i11)) >> 4) & 1) != 0) {
                return onnavigationevent;
            }
            obj.hashCode();
            throw null;
        }
    }
}
