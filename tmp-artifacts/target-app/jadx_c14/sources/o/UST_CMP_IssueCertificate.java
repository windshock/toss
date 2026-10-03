package o;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.CookieManager;
import android.webkit.WebStorage;
import android.widget.ExpandableListView;
import androidx.core.content.ContextCompat;
import im.toss.base.BaseActivity;
import im.toss.features.edoc.register.AptPasswordActivity$;
import io.realm.Realm;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.SetDetectableSize;
import o.UST_CMP_IssueCertificate;
import o.getSegmentCollection;
import o.setAdUnitIds;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.core.AppStateManager;
import viva.republica.toss.core.UserLogin$softResetForDevTool$1$;
import viva.republica.toss.main.more.notification.NotificationSettingAdapter$$ExternalSyntheticLambda2;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CMP_IssueCertificate {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final boolean IAuthTabCallback = false;
    private static int IAuthTabCallbackDefault = 0;
    private static char[] IAuthTabCallbackStub = null;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access100 = 0;
    private static final Lazy asBinder;
    private static final Lazy asInterface;
    private static final Lazy onExtraCallback;
    public static final int onExtraCallbackWithResult;
    public static final UST_CMP_IssueCertificate onNavigationEvent;
    private static int onTransact = 1;
    private static final findResAndMsg onWarmupCompleted;

    public static /* synthetic */ Object IAuthTabCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i4;
        int i9 = (~(i7 | i8)) | (~(i7 | i)) | (~(i8 | i));
        int i10 = ~i;
        int i11 = (~(i10 | i6)) | (~(i8 | i6));
        int i12 = ~(i8 | i7 | i10);
        int i13 = i + i6 + i2 + ((-2109949842) * i3) + (2078889904 * i5);
        int i14 = i13 * i13;
        int i15 = ((-1963971821) * i) + 932184064 + (61854959 * i6) + (1134570258 * i9) + (i11 * (-1134570258)) + ((-1134570258) * i12) + (1196425216 * i2) + (610271232 * i3) + (922746880 * i5) + (671350784 * i14);
        int i16 = (i * (-573803825)) + 196542130 + (i6 * (-573802789)) + (i9 * (-518)) + (i11 * 518) + (i12 * 518) + (i2 * (-573803307)) + (i3 * (-843101306)) + (i5 * (-1524517520)) + (i14 * 458489856);
        int i17 = i15 + (i16 * i16 * 64749568);
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? i17 != 5 ? onWarmupCompleted(objArr) : onTransact(objArr) : onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr) : onExtraCallback(objArr);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 73;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallbackStubProxy();
        }
        IAuthTabCallbackStubProxy();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(int i, String str, String str2, Map map, SetDetectableSize setDetectableSize) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onTransact + 13;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(i, str, str2, map, setDetectableSize);
        int i5 = onTransact + 23;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ setAlogFlushAddr onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 29;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        setAlogFlushAddr setalogflushaddrAsInterface = asInterface();
        int i4 = IAuthTabCallbackDefault + 123;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return setalogflushaddrAsInterface;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Realm realm) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 77;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(801720328, new Object[]{realm}, NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), -801720327);
        int i4 = onTransact + 95;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 0 / 0;
        }
    }

    public static /* synthetic */ Unit onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 25;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            IAuthTabCallbackDefault();
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        int i3 = onTransact + 91;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            return unitIAuthTabCallbackDefault;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 59;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onNavigationEvent(zBooleanValue);
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = onTransact + 59;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ access600 onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact + 109;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return access100();
        }
        access100();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private UST_CMP_IssueCertificate() {
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(UST_CMP_IssueCertificate uST_CMP_IssueCertificate) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 17;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        uST_CMP_IssueCertificate.IAuthTabCallback_Parcel();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = onTransact + 59;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void onNavigationEvent(UST_CMP_IssueCertificate uST_CMP_IssueCertificate) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 55;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        uST_CMP_IssueCertificate.extraCallback();
        if (i3 == 0) {
            int i4 = 66 / 0;
        }
        int i5 = onTransact + 81;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ setAlogFlushAddr onWarmupCompleted(UST_CMP_IssueCertificate uST_CMP_IssueCertificate) {
        int i = 2 % 2;
        int i2 = onTransact + 65;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        setAlogFlushAddr setalogflushaddrIAuthTabCallbackStub = uST_CMP_IssueCertificate.IAuthTabCallbackStub();
        int i4 = onTransact + 89;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 97 / 0;
        }
        return setalogflushaddrIAuthTabCallbackStub;
    }

    public static final /* synthetic */ wasLastName onWarmupCompleted(UST_CMP_IssueCertificate uST_CMP_IssueCertificate, String str, String str2, Map map, int i, deserializeDecimalCollection deserializedecimalcollection) {
        int i2 = 2 % 2;
        int i3 = onTransact + 101;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            return uST_CMP_IssueCertificate.onWarmupCompleted(str, str2, map, i, deserializedecimalcollection);
        }
        uST_CMP_IssueCertificate.onWarmupCompleted(str, str2, map, i, deserializedecimalcollection);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean asBinder() throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 119;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub = addPolicy.ITrustedWebActivityServiceStub();
        Object[] objArr = new Object[1];
        a(new int[]{26, 35, 92, 0}, true, new byte[]{0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0}, objArr);
        boolean zOnExtraCallback = textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub.onExtraCallback(((String) objArr[0]).intern(), false);
        int i4 = onTransact + 103;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
        return zOnExtraCallback;
    }

    static {
        onTransact();
        onNavigationEvent = new UST_CMP_IssueCertificate();
        asBinder = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.core.UserLogin$$ExternalSyntheticLambda1
            public final Object invoke() {
                return (setAdUnitIds) UST_CMP_IssueCertificate.IAuthTabCallback(601464405, new Object[0], NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), -601464403);
            }
        });
        onExtraCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.core.UserLogin$$ExternalSyntheticLambda2
            public final Object invoke() {
                return UST_CMP_IssueCertificate.onExtraCallback();
            }
        });
        asInterface = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.core.UserLogin$$ExternalSyntheticLambda3
            public final Object invoke() {
                return UST_CMP_IssueCertificate.onWarmupCompleted();
            }
        });
        onWarmupCompleted = findRes.onWarmupCompleted(isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null).plus(putChannelInfo.onExtraCallback().onExtraCallback()));
        onExtraCallbackWithResult = 8;
        int i = IAuthTabCallback_Parcel + 89;
        access100 = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onTransact + 1;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        setAdUnitIds setadunitids = (setAdUnitIds) asBinder.getValue();
        int i4 = onTransact + 29;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return setadunitids;
    }

    private static final setAdUnitIds IAuthTabCallbackStubProxy() {
        setAdUnitIds setadunitidsRcolor;
        int i = 2 % 2;
        int i2 = onTransact + 25;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Response response = Response.onNavigationEvent;
            setadunitidsRcolor = ((setAdUnitIds.onExtraCallbackWithResult) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), setAdUnitIds.onExtraCallbackWithResult.class)).Rcolor();
            int i3 = 26 / 0;
        } else {
            Response response2 = Response.onNavigationEvent;
            setadunitidsRcolor = ((setAdUnitIds.onExtraCallbackWithResult) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), setAdUnitIds.onExtraCallbackWithResult.class)).Rcolor();
        }
        int i4 = IAuthTabCallbackDefault + 87;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return setadunitidsRcolor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final setAlogFlushAddr IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 115;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object value = onExtraCallback.getValue();
        if (i3 != 0) {
            return (setAlogFlushAddr) value;
        }
        int i4 = 85 / 0;
        return (setAlogFlushAddr) value;
    }

    private static final setAlogFlushAddr asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 31;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Response response = Response.onNavigationEvent;
            return ((setAlogFlushV2Addr) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), setAlogFlushV2Addr.class)).getOnBackPressedDispatcher();
        }
        Response response2 = Response.onNavigationEvent;
        ((setAlogFlushV2Addr) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), setAlogFlushV2Addr.class)).getOnBackPressedDispatcher();
        throw null;
    }

    private final access600 access000() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 7;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        access600 access600Var = (access600) asInterface.getValue();
        int i4 = IAuthTabCallbackDefault + 57;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return access600Var;
        }
        throw null;
    }

    private static final access600 access100() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 31;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Response response = Response.onNavigationEvent;
        access600 access600VarICustomTabsCallbackDefault = ((r8lambdaWo9IDtVAtw4e9nsv4COJ7bL1j1E) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), r8lambdaWo9IDtVAtw4e9nsv4COJ7bL1j1E.class)).ICustomTabsCallbackDefault();
        int i4 = IAuthTabCallbackDefault + 103;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return access600VarICustomTabsCallbackDefault;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallback[] $VALUES;
        public static final onExtraCallback MEMBER_STATE = new onExtraCallback("MEMBER_STATE", 0);
        public static final onExtraCallback LOGIN = new onExtraCallback("LOGIN", 1);
        public static final onExtraCallback GENERAL = new onExtraCallback("GENERAL", 2);
        public static final onExtraCallback REGION_CHANGE = new onExtraCallback("REGION_CHANGE", 3);
        public static final onExtraCallback SECURITY = new onExtraCallback("SECURITY", 4);
        public static final onExtraCallback DEVTOOL = new onExtraCallback("DEVTOOL", 5);

        private static final /* synthetic */ onExtraCallback[] $values() {
            return new onExtraCallback[]{MEMBER_STATE, LOGIN, GENERAL, REGION_CHANGE, SECURITY, DEVTOOL};
        }

        public static EnumEntries<onExtraCallback> getEntries() {
            return $ENTRIES;
        }

        public static onExtraCallback valueOf(String str) {
            return (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
        }

        public static onExtraCallback[] values() {
            return (onExtraCallback[]) $VALUES.clone();
        }

        private onExtraCallback(String str, int i) {
        }

        static {
            onExtraCallback[] onextracallbackArr$values = $values();
            $VALUES = onextracallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
        }
    }

    public static /* synthetic */ void onNavigationEvent(boolean z, onExtraCallback onextracallback, String str, Map map, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 31;
        int i5 = i4 % 128;
        onTransact = i5;
        if (i4 % 2 != 0 ? (i2 & 1) != 0 : (i2 & 1) != 0) {
            int i6 = i5 + 121;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        }
        if ((i2 & 8) != 0) {
            int i8 = i5 + 51;
            IAuthTabCallbackDefault = i8 % 128;
            int i9 = i8 % 2;
            map = null;
        }
        if ((i2 & 16) != 0) {
            i = 4;
        }
        onNavigationEvent(z, onextracallback, str, map, i);
    }

    public static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int asBinder = 1;
        private static char onExtraCallback = 63015;
        private static char onExtraCallbackWithResult = 11024;
        private static char onNavigationEvent = 32136;
        private static char onWarmupCompleted = 58193;
        final /* synthetic */ Map<String, Object> $logExtras;
        final /* synthetic */ int $logLevel;
        final /* synthetic */ String $logReferrer;
        final /* synthetic */ onExtraCallback $reason;
        final /* synthetic */ boolean $showProgressDialog;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(boolean z, onExtraCallback onextracallback, String str, Map<String, ? extends Object> map, int i, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$showProgressDialog = z;
            this.$reason = onextracallback;
            this.$logReferrer = str;
            this.$logExtras = map;
            this.$logLevel = i;
        }

        public static /* synthetic */ void IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 83;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent();
            if (i3 == 0) {
                throw null;
            }
            int i4 = asBinder + 35;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        public static /* synthetic */ void onExtraCallbackWithResult(boolean z, BaseActivity baseActivity) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 29;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent(z, baseActivity);
            int i4 = asBinder + 55;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$showProgressDialog, this.$reason, this.$logReferrer, this.$logExtras, this.$logLevel, access13800Var);
            int i2 = asBinder + 75;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return iAuthTabCallback;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 1;
            asBinder = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onWarmupCompleted(findresandmsg, access13800Var);
            }
            onWarmupCompleted(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = asBinder + 91;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = asBinder + 9;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            String str;
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
            char[] cArr2 = new char[cArr.length];
            int i3 = 0;
            defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
            char[] cArr3 = new char[2];
            int i4 = $10 + 67;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
                int i6 = $10 + 79;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                int i8 = 58224;
                int i9 = i3;
                while (i9 < 16) {
                    char c = cArr3[1];
                    char c2 = cArr3[i3];
                    int i10 = (c2 + i8) ^ ((c2 << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)));
                    int i11 = c2 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(onExtraCallback);
                        objArr2[2] = Integer.valueOf(i11);
                        objArr2[1] = Integer.valueOf(i10);
                        objArr2[i3] = Integer.valueOf(c);
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback == null) {
                            char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                            str = "";
                            int iLastIndexOf = 9 - TextUtils.lastIndexOf(str, '0', i3, i3);
                            int i12 = 12435 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                            Class[] clsArr = new Class[4];
                            clsArr[i3] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(packedPositionChild, iLastIndexOf, i12, -787580090, false, "C", clsArr);
                        } else {
                            str = "";
                        }
                        char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        char[] cArr4 = cArr3;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallbackWithResult)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - MotionEvent.axisFromString(str)), 10 - KeyEvent.getDeadChar(0, 0), TextUtils.getOffsetAfter(str, 0) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i8 -= 40503;
                        i9++;
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
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16013 - Process.getGidForName("")), (ViewConfiguration.getTapTimeout() >> 16) + 14, 19900 - ((byte) KeyEvent.getModifierMetaStateMask()), -1250968944, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                cArr3 = cArr5;
                i3 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            final BaseActivity baseActivityOnWarmupCompleted;
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub = addPolicy.ITrustedWebActivityServiceStub();
            Object[] objArr = new Object[1];
            a(new char[]{50548, 59628, 10499, 34639, 22433, 6715, 42440, 51474, 24835, 35603, 35874, 34024, 21952, 6819, 59757, 43074, 46064, 59711, 59312, 43500, 53127, 13671, 36582, 47182, 11714, 55201, 20024, '0', 36847, 26507, 64307, 15408, 29203, 12296, 33097, 40938}, Drawable.resolveOpacity(0, 0) + 35, objArr);
            textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub.onNavigationEvent(((String) objArr[0]).intern(), true);
            Activity typedObject = AppStateManager.onExtraCallbackWithResult.readTypedObject();
            if (typedObject != null) {
                int i2 = IAuthTabCallback + 13;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                baseActivityOnWarmupCompleted = onJsBridgeReady.onWarmupCompleted(typedObject);
                int i4 = asBinder + 79;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
            } else {
                baseActivityOnWarmupCompleted = null;
            }
            if (this.$showProgressDialog) {
                int i6 = IAuthTabCallback + 45;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
                if (baseActivityOnWarmupCompleted != null) {
                    BaseActivity.IAuthTabCallback(baseActivityOnWarmupCompleted, (String) null, false, 3, (Object) null);
                }
            }
            wasLastName waslastnameOnNavigationEvent = UST_CMP_IssueCertificate.onWarmupCompleted(UST_CMP_IssueCertificate.onNavigationEvent, this.$reason.name(), this.$logReferrer, this.$logExtras, this.$logLevel, new deserializeDecimalCollection() { // from class: viva.republica.toss.core.UserLogin$evacuate$1$$ExternalSyntheticLambda0
                public final void run() {
                    UST_CMP_IssueCertificate.IAuthTabCallback.IAuthTabCallback();
                }
            }).onNavigationEvent();
            final boolean z = this.$showProgressDialog;
            waslastnameOnNavigationEvent.onExtraCallback(new deserializeDecimalCollection() { // from class: viva.republica.toss.core.UserLogin$evacuate$1$$ExternalSyntheticLambda1
                public final void run() {
                    UST_CMP_IssueCertificate.IAuthTabCallback.onExtraCallbackWithResult(z, baseActivityOnWarmupCompleted);
                }
            });
            return Unit.INSTANCE;
        }

        private static final void onNavigationEvent() {
            int i = 2 % 2;
            int i2 = asBinder + 125;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            UST_CMP_IssueCertificate.onExtraCallbackWithResult(UST_CMP_IssueCertificate.onNavigationEvent);
            if (i3 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final void onNavigationEvent(boolean z, BaseActivity baseActivity) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 47;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            if (!z || baseActivity == null) {
                return;
            }
            int i5 = i2 + 39;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            baseActivity.bo_();
        }
    }

    public static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ Map<String, Object> $logExtras;
        final /* synthetic */ int $logLevel;
        final /* synthetic */ String $logReferrer;
        final /* synthetic */ onExtraCallback $reason;
        final /* synthetic */ boolean $showProgressDialog;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(boolean z, onExtraCallback onextracallback, String str, Map<String, ? extends Object> map, int i, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$showProgressDialog = z;
            this.$reason = onextracallback;
            this.$logReferrer = str;
            this.$logExtras = map;
            this.$logLevel = i;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onNavigationEvent(this.$showProgressDialog, this.$reason, this.$logReferrer, this.$logExtras, this.$logLevel, access13800Var);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            Activity typedObject = AppStateManager.onExtraCallbackWithResult.readTypedObject();
            final BaseActivity baseActivityOnWarmupCompleted = typedObject != null ? onJsBridgeReady.onWarmupCompleted(typedObject) : null;
            if (this.$showProgressDialog && baseActivityOnWarmupCompleted != null) {
                BaseActivity.IAuthTabCallback(baseActivityOnWarmupCompleted, (String) null, false, 3, (Object) null);
            }
            wasLastName waslastnameOnNavigationEvent = UST_CMP_IssueCertificate.onWarmupCompleted(UST_CMP_IssueCertificate.onNavigationEvent, this.$reason.name(), this.$logReferrer, this.$logExtras, this.$logLevel, new deserializeDecimalCollection() { // from class: viva.republica.toss.core.UserLogin$logout$1$$ExternalSyntheticLambda0
                public final void run() {
                    UST_CMP_IssueCertificate.onNavigationEvent.onExtraCallbackWithResult();
                }
            }).onNavigationEvent();
            final boolean z = this.$showProgressDialog;
            waslastnameOnNavigationEvent.onExtraCallback(new deserializeDecimalCollection() { // from class: viva.republica.toss.core.UserLogin$logout$1$$ExternalSyntheticLambda1
                public final void run() {
                    UST_CMP_IssueCertificate.onNavigationEvent.onWarmupCompleted(z, baseActivityOnWarmupCompleted);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onExtraCallbackWithResult() {
            UST_CMP_IssueCertificate.onNavigationEvent(UST_CMP_IssueCertificate.onNavigationEvent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onWarmupCompleted(boolean z, BaseActivity baseActivity) {
            if (z && baseActivity != null) {
                baseActivity.bo_();
            }
            AppLovinError.Companion.onExtraCallbackWithResult().IAuthTabCallback(true);
        }
    }

    @JvmStatic
    public static final void onNavigationEvent(boolean z, @NotNull onExtraCallback onextracallback, @NotNull String str, @Nullable Map<String, ? extends Object> map, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Intrinsics.checkNotNullParameter(str, "");
        maybeUpdateAnimatable.onNavigationEvent(onWarmupCompleted, (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(z, onextracallback, str, map, i, null), 3, (Object) null);
        int i3 = IAuthTabCallbackDefault + 61;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
    }

    public static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ boolean $showProgressDialog;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(boolean z, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$showProgressDialog = z;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onExtraCallbackWithResult(this.$showProgressDialog, access13800Var);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            Activity typedObject = AppStateManager.onExtraCallbackWithResult.readTypedObject();
            BaseActivity baseActivityOnWarmupCompleted = typedObject != null ? onJsBridgeReady.onWarmupCompleted(typedObject) : null;
            if (this.$showProgressDialog && baseActivityOnWarmupCompleted != null) {
                BaseActivity.IAuthTabCallback(baseActivityOnWarmupCompleted, (String) null, false, 3, (Object) null);
            }
            wasLastName.onExtraCallbackWithResult(new UserLogin$softResetForDevTool$1$.ExternalSyntheticLambda0()).onExtraCallback(wasLastName.onExtraCallbackWithResult(new UserLogin$softResetForDevTool$1$.ExternalSyntheticLambda1()).onNavigationEvent()).onWarmupCompleted(clearTid.onExtraCallback()).onExtraCallback(10L, TimeUnit.SECONDS).onNavigationEvent(NetConverter3.onExtraCallback()).onNavigationEvent().onExtraCallback(new UserLogin$softResetForDevTool$1$.ExternalSyntheticLambda2(this.$showProgressDialog, baseActivityOnWarmupCompleted));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onExtraCallback() {
            DefaultReactNativeHostExternalSyntheticLambda0.onExtraCallback(DefaultReactNativeHostExternalSyntheticLambda0.onNavigationEvent, false, 1, (Object) null);
            Response response = Response.onNavigationEvent;
            ((isIssueCertV3) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), isIssueCertV3.class)).ReportDrawnKtExternalSyntheticLambda4().onExtraCallbackWithResult("UserLogin.softResetForDevTool");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onNavigationEvent() {
            UST_CMP_IssueCertificate.onNavigationEvent(UST_CMP_IssueCertificate.onNavigationEvent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onWarmupCompleted(boolean z, BaseActivity baseActivity) {
            if (z && baseActivity != null) {
                baseActivity.bo_();
            }
            AppLovinError.Companion.onExtraCallbackWithResult().IAuthTabCallback(true);
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        onExtraCallback onextracallback = (onExtraCallback) objArr[1];
        String str = (String) objArr[2];
        Map map = (Map) objArr[3];
        int i = 4;
        int iIntValue = ((Number) objArr[4]).intValue();
        int iIntValue2 = ((Number) objArr[5]).intValue();
        Object obj = objArr[6];
        int i2 = 2 % 2;
        int i3 = onTransact;
        int i4 = i3 + 41;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0 ? (iIntValue2 & 1) != 0 : (iIntValue2 & 1) != 0) {
            zBooleanValue = true;
        }
        if ((iIntValue2 & 8) != 0) {
            int i5 = i3 + 31;
            int i6 = i5 % 128;
            IAuthTabCallbackDefault = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 11;
            onTransact = i8 % 128;
            int i9 = i8 % 2;
            map = null;
        }
        if ((iIntValue2 & 16) != 0) {
            int i10 = onTransact + 55;
            IAuthTabCallbackDefault = i10 % 128;
            int i11 = i10 % 2;
        } else {
            i = iIntValue;
        }
        onExtraCallback(zBooleanValue, onextracallback, str, (Map<String, ? extends Object>) map, i);
        return null;
    }

    @JvmStatic
    public static final void onExtraCallback(boolean z, @NotNull onExtraCallback onextracallback, @NotNull String str, @Nullable Map<String, ? extends Object> map, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Intrinsics.checkNotNullParameter(str, "");
        maybeUpdateAnimatable.onNavigationEvent(onWarmupCompleted, (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(z, onextracallback, str, map, i, null), 3, (Object) null);
        int i3 = onTransact + 35;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 35 / 0;
        }
    }

    private static final Unit onExtraCallback(int i, String str, String str2, Map map, SetDetectableSize setDetectableSize) throws Throwable {
        String strIntern;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        if (i == 4) {
            strIntern = "INFO";
        } else if (i == 5) {
            int i3 = IAuthTabCallbackDefault + 65;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            strIntern = "WARN";
        } else if (i != 6) {
            Object[] objArr = new Object[1];
            a(new int[]{0, 7, 187, 0}, false, new byte[]{0, 1, 1, 1, 1, 0, 1}, objArr);
            strIntern = ((String) objArr[0]).intern();
        } else {
            strIntern = "ERROR";
        }
        Object[] objArr2 = new Object[1];
        a(new int[]{7, 4, 133, 0}, true, new byte[]{0, 1, 1, 1}, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), strIntern);
        Object[] objArr3 = new Object[1];
        a(new int[]{11, 7, 163, 0}, false, new byte[]{0, 0, 0, 0, 0, 0, 0}, objArr3);
        setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), str);
        Object[] objArr4 = new Object[1];
        a(new int[]{18, 8, 0, 6}, false, new byte[]{0, 1, 1, 0, 1, 1, 0, 1}, objArr4);
        setDetectableSize.onExtraCallback(((String) objArr4[0]).intern(), str2);
        setDetectableSize.onExtraCallback(map);
        Unit unit = Unit.INSTANCE;
        int i5 = IAuthTabCallbackDefault + 29;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr;
        char c;
        int length;
        char[] cArr2;
        int i;
        int i2 = 2;
        int i3 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr3 = IAuthTabCallbackStub;
        if (cArr3 != null) {
            int i8 = $11 + 11;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i = 0;
            }
            while (i < length) {
                int i9 = $11 + 69;
                $10 = i9 % 128;
                if (i9 % i2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 35 - Color.argb(0, 0, 0, 0), 14240 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i %= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[i])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 35283), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 35, ExpandableListView.getPackedPositionGroup(0L) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i2 = 2;
            }
            cArr3 = cArr2;
        }
        char[] cArr4 = new char[i5];
        System.arraycopy(cArr3, i4, cArr4, 0, i5);
        if (bArr != null) {
            int i10 = $10 + 111;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                cArr = new char[i5];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
                c = 1;
            } else {
                cArr = new char[i5];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                c = 0;
            }
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                int i11 = $10 + 35;
                $11 = i11 % 128;
                if (i11 % 2 != 0 ? bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1 : bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 0) {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), View.getDefaultSize(0, 0) + 29, 17656 - ImageFormat.getBitsPerPixel(0), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                } else {
                    int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.blue(0) + 10935), 65 - (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getFadingEdgeLength() >> 16) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i13] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                }
                c = cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - (ViewConfiguration.getTouchSlop() >> 8)), 70 - Color.red(0), KeyEvent.getDeadChar(0, 0) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            int i14 = $11 + 3;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            cArr4 = cArr;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr4, 0, cArr5, 0, i5);
            int i16 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr4, i16, i7);
            System.arraycopy(cArr5, i7, cArr4, 0, i16);
        }
        if (z) {
            char[] cArr6 = new char[i5];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i5 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr4 = cArr6;
        }
        if (i6 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                int i17 = $11 + 51;
                $10 = i17 % 128;
                int i18 = i17 % 2;
            }
        }
        objArr[0] = new String(cArr4);
    }

    private static final Unit IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 93;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Response response = Response.onNavigationEvent;
            ((isIssueCertV3) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), isIssueCertV3.class)).ReportDrawnKtExternalSyntheticLambda4().onExtraCallbackWithResult("UserLogin.destroyAllUserData");
            return Unit.INSTANCE;
        }
        Response response2 = Response.onNavigationEvent;
        ((isIssueCertV3) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), isIssueCertV3.class)).ReportDrawnKtExternalSyntheticLambda4().onExtraCallbackWithResult("UserLogin.destroyAllUserData");
        int i3 = 28 / 0;
        return Unit.INSTANCE;
    }

    private final wasLastName onWarmupCompleted(final String str, final String str2, final Map<String, ? extends Object> map, final int i, deserializeDecimalCollection deserializedecimalcollection) {
        int i2 = 2 % 2;
        int i3 = onTransact + 33;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        if (IAuthTabCallback) {
            int i5 = IAuthTabCallbackDefault + 37;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
        }
        ConvertByteArrayToFloatArray.onWarmupCompleted("destroyAllUserData", true, (String) null, (List) null, (Map) null, new Function1() { // from class: viva.republica.toss.core.UserLogin$$ExternalSyntheticLambda4
            public final Object invoke(Object obj) {
                return UST_CMP_IssueCertificate.IAuthTabCallback(i, str, str2, map, (SetDetectableSize) obj);
            }
        }, 28, (Object) null);
        final boolean zIAuthTabCallback = ((setAdUnitIds) IAuthTabCallback(1338131038, new Object[]{this}, NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), -1338131038)).IAuthTabCallback();
        DefaultReactNativeHostExternalSyntheticLambda0.onExtraCallback(DefaultReactNativeHostExternalSyntheticLambda0.onNavigationEvent, false, 1, (Object) null);
        wasLastName waslastnameIAuthTabCallback = wasLastName.onWarmupCompleted(new JsonReaderErrorInfo[]{(wasLastName) IAuthTabCallback(817757461, new Object[]{this, str}, NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), -817757458), GetFeatureExtension.onWarmupCompleted.onUnminimized(), asDoublelambda2.IAuthTabCallback.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback())}).onNavigationEvent().onExtraCallback(wasLastName.onNavigationEvent(new Callable() { // from class: viva.republica.toss.core.UserLogin$$ExternalSyntheticLambda5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return UST_CMP_IssueCertificate.onNavigationEvent();
            }
        }).onWarmupCompleted(clearTid.onExtraCallback())).onExtraCallback(wasLastName.onExtraCallbackWithResult(deserializedecimalcollection).onNavigationEvent().onWarmupCompleted(clearTid.onExtraCallback())).onExtraCallback(10L, TimeUnit.SECONDS).onNavigationEvent(NetConverter3.onExtraCallback()).IAuthTabCallback(new deserializeDecimalCollection() { // from class: viva.republica.toss.core.UserLogin$$ExternalSyntheticLambda6
            public final void run() {
                UST_CMP_IssueCertificate.IAuthTabCallback(1597213448, new Object[]{Boolean.valueOf(zIAuthTabCallback)}, NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), -1597213443);
            }
        });
        Intrinsics.checkNotNullExpressionValue(waslastnameIAuthTabCallback, "");
        return waslastnameIAuthTabCallback;
    }

    private static final void onNavigationEvent(boolean z) {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 115;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        if (z) {
            int i5 = i2 + 61;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            AppStateManager.onExtraCallbackWithResult.onActivityLayout().onEvent(getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy.onNavigationEvent);
        }
        int i7 = IAuthTabCallbackDefault + 9;
        onTransact = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onWarmupCompleted(access13800Var);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                setAlogFlushAddr setalogflushaddrOnWarmupCompleted = UST_CMP_IssueCertificate.onWarmupCompleted(UST_CMP_IssueCertificate.onNavigationEvent);
                this.label = 1;
                if (setalogflushaddrOnWarmupCompleted.onExtraCallbackWithResult(this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    private final void extraCallback() {
        int i = 2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            onExtraCallbackWithResult();
            Result.constructor-impl(Unit.INSTANCE);
            int i2 = IAuthTabCallbackDefault + 83;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th));
        }
        try {
            Result.Companion companion3 = Result.Companion;
            if (DERSet.onExtraCallback.PlaybackStateCompatCustomAction()) {
                PageShowPoint.Companion.onExtraCallbackWithResult();
                int i4 = IAuthTabCallbackDefault + 35;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
            }
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th2));
        }
        try {
            Result.Companion companion5 = Result.Companion;
            WebStorage.getInstance().deleteAllData();
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th3) {
            Result.Companion companion6 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th3));
        }
        try {
            Result.Companion companion7 = Result.Companion;
            onNavigationEvent.access000().onNavigationEvent(new r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc[0]);
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th4) {
            Result.Companion companion8 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th4));
        }
        try {
            Result.Companion companion9 = Result.Companion;
            MemoryCacheBuilderExternalSyntheticLambda0.onWarmupCompleted();
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1564184796);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 46479), 13 - (KeyEvent.getMaxKeyCode() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 22730, -1820028492, false, "IAuthTabCallback", (Class[]) null);
            }
            Object obj = ((Field) objOnExtraCallback).get(null);
            try {
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-736429273);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getDeadChar(0, 0) + 46480), 12 - MotionEvent.axisFromString(""), 22730 - TextUtils.lastIndexOf("", '0'), -447085129, false, "onExtraCallbackWithResult", new Class[0]);
                }
                ((Method) objOnExtraCallback2).invoke(obj, null);
                setTestMode.onExtraCallback(1168132255, -1168132248, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{null, 1, null}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult());
                RemoteWorkManager.onExtraCallbackWithResult(-831430487, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 831430494, new Object[]{RemoteWorkManager.onWarmupCompleted}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted());
                RedBoxContentViewOpenStackFrameTask.Companion.onExtraCallbackWithResult(UserChoiceBillingListener.onExtraCallback.onExtraCallback());
                CookieManager cookieManager = CookieManager.getInstance();
                cookieManager.flush();
                cookieManager.removeAllCookies(null);
                maybeUpdateAnimatable.onWarmupCompleted((CoroutineContext) null, new onWarmupCompleted(null), 1, (Object) null);
                Result.constructor-impl(Unit.INSTANCE);
                int i6 = onTransact + 37;
                IAuthTabCallbackDefault = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th5) {
                Throwable cause = th5.getCause();
                if (cause == null) {
                    throw th5;
                }
                throw cause;
            }
        } catch (Throwable th6) {
            Result.Companion companion10 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th6));
        }
        try {
            Result.Companion companion11 = Result.Companion;
            zzbk.onExtraCallbackWithResult(new File(ContextCompat.getDataDir(UserChoiceBillingListener.onExtraCallback.onExtraCallback()), "/"), MemoryCacheBuilderExternalSyntheticLambda0.onNavigationEvent());
            Result.constructor-impl(Unit.INSTANCE);
            int i8 = IAuthTabCallbackDefault + 119;
            onTransact = i8 % 128;
            int i9 = i8 % 2;
        } catch (Throwable th7) {
            Result.Companion companion12 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th7));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void IAuthTabCallback_Parcel() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.UST_CMP_IssueCertificate.onTransact
            int r1 = r1 + 67
            int r2 = r1 % 128
            o.UST_CMP_IssueCertificate.IAuthTabCallbackDefault = r2
            int r1 = r1 % r0
            o.UserChoiceBillingListener r1 = o.UserChoiceBillingListener.onExtraCallback
            android.content.Context r1 = r1.onExtraCallback()
            r2 = 1
            kotlin.Result$Companion r3 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L56
            java.lang.String r3 = "activity"
            java.lang.Object r3 = r1.getSystemService(r3)     // Catch: java.lang.Throwable -> L56
            boolean r4 = r3 instanceof android.app.ActivityManager     // Catch: java.lang.Throwable -> L56
            if (r4 == 0) goto L22
            android.app.ActivityManager r3 = (android.app.ActivityManager) r3     // Catch: java.lang.Throwable -> L56
            goto L23
        L22:
            r3 = 0
        L23:
            r4 = 0
            if (r3 == 0) goto L2b
            boolean r3 = r3.clearApplicationUserData()     // Catch: java.lang.Throwable -> L56
            goto L2c
        L2b:
            r3 = r4
        L2c:
            r3 = r3 ^ r2
            if (r3 == 0) goto L30
            goto L4d
        L30:
            int r3 = o.UST_CMP_IssueCertificate.IAuthTabCallbackDefault
            int r3 = r3 + 31
            int r5 = r3 % 128
            o.UST_CMP_IssueCertificate.onTransact = r5
            int r3 = r3 % r0
            if (r3 != 0) goto L44
            o.RemoteWorkManager r0 = o.RemoteWorkManager.onWarmupCompleted     // Catch: java.lang.Throwable -> L56
            boolean r0 = r0.access000()     // Catch: java.lang.Throwable -> L56
            if (r0 == r2) goto L4d
            goto L4c
        L44:
            o.RemoteWorkManager r0 = o.RemoteWorkManager.onWarmupCompleted     // Catch: java.lang.Throwable -> L56
            boolean r0 = r0.access000()     // Catch: java.lang.Throwable -> L56
            if (r0 != 0) goto L4d
        L4c:
            r4 = r2
        L4d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L56
            java.lang.Object r0 = kotlin.Result.constructor-impl(r0)     // Catch: java.lang.Throwable -> L56
            goto L61
        L56:
            r0 = move-exception
            kotlin.Result$Companion r3 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.constructor-impl(r0)
        L61:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            boolean r4 = kotlin.Result.onExtraCallback(r0)
            if (r4 != 0) goto L6a
            r3 = r0
        L6a:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r3 = r3 ^ r2
            if (r3 == r2) goto L74
            goto Ld4
        L74:
            boolean r3 = o.UST_CMP_IssueCertificate.IAuthTabCallback
            if (r3 == 0) goto L7f
            java.lang.Throwable r0 = kotlin.Result.exceptionOrNull-impl(r0)
            java.util.Objects.toString(r0)
        L7f:
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> Lad
            java.lang.String r0 = r1.getPackageName()     // Catch: java.lang.Throwable -> Lad
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> Lad
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lad
            r3.<init>()     // Catch: java.lang.Throwable -> Lad
            java.lang.String r4 = "pm clear "
            r3.append(r4)     // Catch: java.lang.Throwable -> Lad
            r3.append(r0)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> Lad
            r1.exec(r0)     // Catch: java.lang.Throwable -> Lad
            o.RemoteWorkManager r0 = o.RemoteWorkManager.onWarmupCompleted     // Catch: java.lang.Throwable -> Lad
            boolean r0 = r0.access000()     // Catch: java.lang.Throwable -> Lad
            r0 = r0 ^ r2
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> Lad
            java.lang.Object r0 = kotlin.Result.constructor-impl(r0)     // Catch: java.lang.Throwable -> Lad
            goto Lb8
        Lad:
            r0 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.constructor-impl(r0)
        Lb8:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r2 = kotlin.Result.onExtraCallback(r0)
            if (r2 != 0) goto Lc1
            r1 = r0
        Lc1:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto Ld4
            boolean r1 = o.UST_CMP_IssueCertificate.IAuthTabCallback
            if (r1 == 0) goto Ld4
            java.lang.Throwable r0 = kotlin.Result.exceptionOrNull-impl(r0)
            java.util.Objects.toString(r0)
        Ld4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.UST_CMP_IssueCertificate.IAuthTabCallback_Parcel():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0059, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005a, code lost:
    
        r6 = o.wasLastName.IAuthTabCallback();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, "");
        r0 = o.UST_CMP_IssueCertificate.onTransact + 83;
        o.UST_CMP_IssueCertificate.IAuthTabCallbackDefault = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0069, code lost:
    
        if ((r0 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006b, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0029, code lost:
    
        if (o.setAdUnitIds.Companion.onNavigationEvent().IAuthTabCallback() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0036, code lost:
    
        if (o.setAdUnitIds.Companion.onNavigationEvent().IAuthTabCallback() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        r6 = o.AdSettingsIntegrationErrorMode.onNavigationEvent.IAuthTabCallbackStub().onExtraCallbackWithResult(new viva.republica.toss.network.model.user.LogoutReq(r6)).IAuthTabCallback(im.toss.utils.RxUtils.onExtraCallbackWithResult((java.lang.Object) null));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, "");
        r6 = r6.bI_();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, "");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onExtraCallbackWithResult(java.lang.Object[] r6) {
        /*
            r0 = 0
            r1 = r6[r0]
            o.UST_CMP_IssueCertificate r1 = (o.UST_CMP_IssueCertificate) r1
            r1 = 1
            r6 = r6[r1]
            java.lang.String r6 = (java.lang.String) r6
            r1 = 2
            int r2 = r1 % r1
            int r2 = o.UST_CMP_IssueCertificate.onTransact
            int r2 = r2 + 59
            int r3 = r2 % 128
            o.UST_CMP_IssueCertificate.IAuthTabCallbackDefault = r3
            int r2 = r2 % r1
            r3 = 0
            r4 = 83
            java.lang.String r5 = ""
            if (r2 == 0) goto L2c
            o.setAdUnitIds$IAuthTabCallback r2 = o.setAdUnitIds.Companion
            o.setAdUnitIds r2 = r2.onNavigationEvent()
            boolean r2 = r2.IAuthTabCallback()
            int r0 = r4 / 0
            if (r2 == 0) goto L5a
            goto L38
        L2c:
            o.setAdUnitIds$IAuthTabCallback r0 = o.setAdUnitIds.Companion
            o.setAdUnitIds r0 = r0.onNavigationEvent()
            boolean r0 = r0.IAuthTabCallback()
            if (r0 == 0) goto L5a
        L38:
            o.AdSettingsIntegrationErrorMode r0 = o.AdSettingsIntegrationErrorMode.onNavigationEvent
            o.setVideoRenderer r0 = r0.IAuthTabCallbackStub()
            viva.republica.toss.network.model.user.LogoutReq r1 = new viva.republica.toss.network.model.user.LogoutReq
            r1.<init>(r6)
            o.writeRaw r6 = r0.onExtraCallbackWithResult(r1)
            o.deserializeUri r0 = im.toss.utils.RxUtils.onExtraCallbackWithResult(r3)
            o.writeRaw r6 = r6.IAuthTabCallback(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            o.wasLastName r6 = r6.bI_()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            return r6
        L5a:
            o.wasLastName r6 = o.wasLastName.IAuthTabCallback()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            int r0 = o.UST_CMP_IssueCertificate.onTransact
            int r0 = r0 + r4
            int r2 = r0 % 128
            o.UST_CMP_IssueCertificate.IAuthTabCallbackDefault = r2
            int r0 = r0 % r1
            if (r0 != 0) goto L6c
            return r6
        L6c:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.UST_CMP_IssueCertificate.onExtraCallbackWithResult(java.lang.Object[]):java.lang.Object");
    }

    @JvmStatic
    public static final void onExtraCallbackWithResult() {
        int i = 2 % 2;
        Realm realmOnMessageChannelReady = Realm.onMessageChannelReady();
        Intrinsics.checkNotNullExpressionValue(realmOnMessageChannelReady, "");
        try {
            realmOnMessageChannelReady.IAuthTabCallback(new Realm.Transaction() { // from class: viva.republica.toss.core.UserLogin$$ExternalSyntheticLambda0
                public final void execute(Realm realm) {
                    UST_CMP_IssueCertificate.onExtraCallbackWithResult(realm);
                }
            });
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            CloseableKt.closeFinally(realmOnMessageChannelReady, (Throwable) null);
            int i2 = IAuthTabCallbackDefault + 83;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        } finally {
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Realm realm = (Realm) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 83;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        realm.asInterface();
        if (i3 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ setAdUnitIds IAuthTabCallback() {
        return (setAdUnitIds) IAuthTabCallback(601464405, new Object[0], NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), -601464403);
    }

    private static final void onExtraCallback(Realm realm) {
        IAuthTabCallback(801720328, new Object[]{realm}, NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), -801720327);
    }

    private final setAdUnitIds getInterfaceDescriptor() {
        return (setAdUnitIds) IAuthTabCallback(1338131038, new Object[]{this}, NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), -1338131038);
    }

    private final wasLastName IAuthTabCallback(String str) {
        return (wasLastName) IAuthTabCallback(817757461, new Object[]{this, str}, NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), -817757458);
    }

    static void onTransact() {
        IAuthTabCallbackStub = new char[]{27334, 27458, 27465, 27465, 27463, 27456, 27459, 27195, 27297, 27319, 27317, 27334, 27458, 27457, 27480, 27459, 27465, 27463, 27261, 27179, 27173, 27196, 27173, 27173, 27196, 27173, 27179, 27268, 27267, 27272, 27377, 27273, 27274, 27275, 27268, 27266, 27268, 27376, 27379, 27275, 27277, 27378, 27378, 27272, 27272, 27376, 27379, 27277, 27266, 27274, 27378, 27274, 27275, 27377, 27274, 27277, 27379, 27376, 27279, 27273, 27267};
    }
}
