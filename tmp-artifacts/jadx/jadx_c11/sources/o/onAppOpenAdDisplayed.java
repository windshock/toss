package o;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.ads.zzgc;
import im.toss.rn.spec.bundle.TossReactBundleMeta;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.MaxFullscreenAdImpl;
import o.MaxFullscreenAdImplExternalSyntheticLambda10;
import o.MaxFullscreenAdImplExternalSyntheticLambda6;
import o.MaxRewardedAdImplb;
import o.logApiCall;
import o.onAppOpenAdDisplayed;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class onAppOpenAdDisplayed {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    private static int IAuthTabCallbackStubProxy = 1;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access000;
    private static int access100;
    private final MaxFullscreenAdImplExternalSyntheticLambda10 IAuthTabCallback;
    private final String IAuthTabCallbackDefault;
    private final String IAuthTabCallbackStub;
    private final String asBinder;
    private MaxFullscreenAdImpl asInterface;
    private String getInterfaceDescriptor;
    private final Context onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final Lazy onNavigationEvent;
    private String onTransact;
    private final Lazy onWarmupCompleted;

    static {
        int i = access000 + 123;
        IAuthTabCallbackStubProxy = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ onAppOpenAdDisplayed(Context context, String str, String str2, String str3, String str4, MaxFullscreenAdImplExternalSyntheticLambda10 maxFullscreenAdImplExternalSyntheticLambda10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, str2, str3, str4, maxFullscreenAdImplExternalSyntheticLambda10);
    }

    public static /* synthetic */ MaxRewardedAdImplb onExtraCallbackWithResult(onAppOpenAdDisplayed onappopenaddisplayed) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 89;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        MaxRewardedAdImplb maxRewardedAdImplbAsInterface = asInterface(onappopenaddisplayed);
        int i4 = access100 + 95;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return maxRewardedAdImplbAsInterface;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        onAppOpenAdDisplayed onappopenaddisplayed = (onAppOpenAdDisplayed) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 51;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        logApiCall logapicallIAuthTabCallbackStub = IAuthTabCallbackStub(onappopenaddisplayed);
        int i4 = IAuthTabCallback_Parcel + 55;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return logapicallIAuthTabCallbackStub;
        }
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i6;
        int i9 = (~(i8 | i5)) | i7;
        int i10 = (~(i7 | (~i5) | i6)) | (~(i8 | i7 | i5));
        int i11 = (~(i5 | i6)) | (~(i | i6));
        int i12 = i + i6 + i2 + ((-1520811122) * i4) + (1880343047 * i3);
        int i13 = i12 * i12;
        int i14 = (((-88056299) * i) - 1254686720) + (875799021 * i6) + ((-481927660) * i9) + (i10 * 481927660) + (481927660 * i11) + (393871360 * i2) + ((-206831616) * i4) + (408289280 * i3) + ((-683737088) * i13);
        int i15 = ((i * (-660833811)) - 1995073173) + (i6 * (-660833531)) + (i9 * (-140)) + (i10 * 140) + (i11 * 140) + (i2 * (-660833671)) + (i4 * 644061726) + (i3 * (-2012083377)) + (i13 * (-1027145728));
        int i16 = i14 + (i15 * i15 * 814809088);
        if (i16 == 1) {
            return onExtraCallback(objArr);
        }
        if (i16 != 2) {
            if (i16 != 3) {
                return onNavigationEvent(objArr);
            }
            onAppOpenAdDisplayed onappopenaddisplayed = (onAppOpenAdDisplayed) objArr[0];
            access13800 access13800Var = (access13800) objArr[1];
            int i17 = 2 % 2;
            Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), onappopenaddisplayed.new onWarmupCompleted(null), access13800Var);
            int i18 = IAuthTabCallback_Parcel + 67;
            access100 = i18 % 128;
            int i19 = i18 % 2;
            return objOnExtraCallback;
        }
        onAppOpenAdDisplayed onappopenaddisplayed2 = (onAppOpenAdDisplayed) objArr[0];
        int i20 = 2 % 2;
        int i21 = IAuthTabCallback_Parcel + 105;
        access100 = i21 % 128;
        int i22 = i21 % 2;
        logApiCall logapicall = (logApiCall) onappopenaddisplayed2.onWarmupCompleted.getValue();
        int i23 = IAuthTabCallback_Parcel + 115;
        access100 = i23 % 128;
        int i24 = i23 % 2;
        return logapicall;
    }

    private onAppOpenAdDisplayed(Context context, String str, String str2, String str3, String str4, MaxFullscreenAdImplExternalSyntheticLambda10 maxFullscreenAdImplExternalSyntheticLambda10) {
        this.asBinder = str;
        this.IAuthTabCallbackDefault = str2;
        this.IAuthTabCallbackStub = str3;
        this.onExtraCallbackWithResult = str4;
        this.IAuthTabCallback = maxFullscreenAdImplExternalSyntheticLambda10;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        this.onExtraCallback = applicationContext;
        this.onWarmupCompleted = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.rn.toss.core.portal.PortalServiceBundleLoader$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 73;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr = {this.f$0};
                int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
                logApiCall logapicall = (logApiCall) onAppOpenAdDisplayed.onWarmupCompleted(-685106136, objArr, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 685106136);
                int i4 = onExtraCallbackWithResult + 55;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    return logapicall;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        this.onNavigationEvent = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.rn.toss.core.portal.PortalServiceBundleLoader$$ExternalSyntheticLambda1
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 115;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                MaxRewardedAdImplb maxRewardedAdImplbOnExtraCallbackWithResult = onAppOpenAdDisplayed.onExtraCallbackWithResult(this.f$0);
                int i4 = onExtraCallback + 79;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 60 / 0;
                }
                return maxRewardedAdImplbOnExtraCallbackWithResult;
            }
        });
    }

    public static final /* synthetic */ void IAuthTabCallback(onAppOpenAdDisplayed onappopenaddisplayed, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 7;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        onappopenaddisplayed.getInterfaceDescriptor = str;
        int i5 = i3 + 19;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ String asBinder(onAppOpenAdDisplayed onappopenaddisplayed) {
        int i = 2 % 2;
        int i2 = access100 + 41;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        String str = onappopenaddisplayed.asBinder;
        if (i3 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        onAppOpenAdDisplayed onappopenaddisplayed = (onAppOpenAdDisplayed) objArr[0];
        setRequestListener setrequestlistener = (setRequestListener) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 33;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return onappopenaddisplayed.IAuthTabCallback(setrequestlistener);
        }
        onappopenaddisplayed.IAuthTabCallback(setrequestlistener);
        throw null;
    }

    public static final /* synthetic */ MaxFullscreenAdImplExternalSyntheticLambda10 onExtraCallback(onAppOpenAdDisplayed onappopenaddisplayed) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 109;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        MaxFullscreenAdImplExternalSyntheticLambda10 maxFullscreenAdImplExternalSyntheticLambda10 = onappopenaddisplayed.IAuthTabCallback;
        if (i4 != 0) {
            int i5 = 69 / 0;
        }
        int i6 = i2 + 107;
        access100 = i6 % 128;
        int i7 = i6 % 2;
        return maxFullscreenAdImplExternalSyntheticLambda10;
    }

    public static final /* synthetic */ void onExtraCallback(onAppOpenAdDisplayed onappopenaddisplayed, MaxFullscreenAdImpl maxFullscreenAdImpl) {
        int i = 2 % 2;
        int i2 = access100 + 93;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        onappopenaddisplayed.asInterface = maxFullscreenAdImpl;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 11;
        access100 = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(onAppOpenAdDisplayed onappopenaddisplayed, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 117;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        onappopenaddisplayed.onTransact = str;
        int i5 = i2 + 51;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ logApiCall onNavigationEvent(onAppOpenAdDisplayed onappopenaddisplayed) {
        int i = 2 % 2;
        int i2 = access100 + 63;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        logApiCall logapicall = (logApiCall) onWarmupCompleted(-1879185077, new Object[]{onappopenaddisplayed}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1879185079);
        int i4 = IAuthTabCallback_Parcel + 77;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return logapicall;
        }
        throw null;
    }

    public static final /* synthetic */ String onTransact(onAppOpenAdDisplayed onappopenaddisplayed) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 27;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        String str = onappopenaddisplayed.IAuthTabCallbackStub;
        if (i4 != 0) {
            int i5 = 82 / 0;
        }
        int i6 = i2 + 123;
        access100 = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static final /* synthetic */ String onWarmupCompleted(onAppOpenAdDisplayed onappopenaddisplayed) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 125;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        String str = onappopenaddisplayed.onExtraCallbackWithResult;
        int i5 = i3 + 101;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private static final logApiCall IAuthTabCallbackStub(onAppOpenAdDisplayed onappopenaddisplayed) {
        int i = 2 % 2;
        int i2 = access100 + 87;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        logApiCall contentView = onappopenaddisplayed.onTransact().setContentView();
        int i4 = access100 + 23;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return contentView;
    }

    private final MaxRewardedAdImplb asInterface() {
        MaxRewardedAdImplb maxRewardedAdImplb;
        int i = 2 % 2;
        int i2 = access100 + 35;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            maxRewardedAdImplb = (MaxRewardedAdImplb) this.onNavigationEvent.getValue();
            int i3 = 78 / 0;
        } else {
            maxRewardedAdImplb = (MaxRewardedAdImplb) this.onNavigationEvent.getValue();
        }
        int i4 = access100 + 117;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return maxRewardedAdImplb;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final MaxRewardedAdImplb asInterface(onAppOpenAdDisplayed onappopenaddisplayed) {
        int i = 2 % 2;
        int i2 = access100 + 65;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        MaxFullscreenAdImplExternalSyntheticLambda6.IAuthTabCallback iAuthTabCallbackOnTransact = onappopenaddisplayed.onTransact();
        if (i3 == 0) {
            iAuthTabCallbackOnTransact.reportFullyDrawn();
            throw null;
        }
        MaxRewardedAdImplb maxRewardedAdImplbReportFullyDrawn = iAuthTabCallbackOnTransact.reportFullyDrawn();
        int i4 = IAuthTabCallback_Parcel + 121;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return maxRewardedAdImplbReportFullyDrawn;
        }
        obj.hashCode();
        throw null;
    }

    private final MaxFullscreenAdImplExternalSyntheticLambda6.IAuthTabCallback onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 109;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            MaxFullscreenAdImplExternalSyntheticLambda6.IAuthTabCallback iAuthTabCallback = (MaxFullscreenAdImplExternalSyntheticLambda6.IAuthTabCallback) Response.onExtraCallback(this.onExtraCallback, MaxFullscreenAdImplExternalSyntheticLambda6.IAuthTabCallback.class);
            int i3 = IAuthTabCallback_Parcel + 43;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            return iAuthTabCallback;
        }
        throw null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onNavigationEvent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onNavigationEvent[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        public static final onNavigationEvent PRODUCTION = new onNavigationEvent("PRODUCTION", 0);
        public static final onNavigationEvent DEV_SERVER = new onNavigationEvent("DEV_SERVER", 1);

        private static final /* synthetic */ onNavigationEvent[] $values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 109;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            onNavigationEvent[] onnavigationeventArr = {PRODUCTION, DEV_SERVER};
            int i5 = i2 + 53;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return onnavigationeventArr;
        }

        public static EnumEntries<onNavigationEvent> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 117;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            EnumEntries<onNavigationEvent> enumEntries = $ENTRIES;
            int i5 = i3 + 113;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 97 / 0;
            }
            return enumEntries;
        }

        public static onNavigationEvent valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 85;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
            if (i3 == 0) {
                throw null;
            }
            int i4 = onWarmupCompleted + 69;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return onnavigationevent;
            }
            obj.hashCode();
            throw null;
        }

        public static onNavigationEvent[] values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 17;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            onNavigationEvent[] onnavigationeventArr = (onNavigationEvent[]) $VALUES.clone();
            int i3 = onWarmupCompleted + 117;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 27 / 0;
            }
            return onnavigationeventArr;
        }

        static {
            onNavigationEvent[] onnavigationeventArr$values = $values();
            $VALUES = onnavigationeventArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
            int i = IAuthTabCallback + 19;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        private onNavigationEvent(String str, int i) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super onNavigationEvent>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char[] IAuthTabCallback = {64961, 64983, 64960, 64965, 64963, 64982, 64962, 64926, 64964};
        private static char onExtraCallback = 51242;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        int label;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = onAppOpenAdDisplayed.this.new onWarmupCompleted(access13800Var);
            int i2 = onNavigationEvent + 89;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 88 / 0;
            }
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 89;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 47;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 90 / 0;
            }
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super onNavigationEvent> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 1;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 81;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objIAuthTabCallback;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 57;
            onExtraCallbackWithResult = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 != 0) {
                access14300.onWarmupCompleted();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "react_native_debug", "bundle_load_start", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("from", "PortalServiceBundleLoader"), getWrite.IAuthTabCallback("serviceBundleName", onAppOpenAdDisplayed.asBinder(onAppOpenAdDisplayed.this)), getWrite.IAuthTabCallback("region", onAppOpenAdDisplayed.onTransact(onAppOpenAdDisplayed.this)), getWrite.IAuthTabCallback("company", onAppOpenAdDisplayed.onWarmupCompleted(onAppOpenAdDisplayed.this))}), (String) null, false, (String) null, 56, (Object) null);
                MaxFullscreenAdImplExternalSyntheticLambda10 maxFullscreenAdImplExternalSyntheticLambda10OnExtraCallback = onAppOpenAdDisplayed.onExtraCallback(onAppOpenAdDisplayed.this);
                logApiCall logapicallOnNavigationEvent = onAppOpenAdDisplayed.onNavigationEvent(onAppOpenAdDisplayed.this);
                this.label = 1;
                objIAuthTabCallback = maxFullscreenAdImplExternalSyntheticLambda10OnExtraCallback.IAuthTabCallback(logapicallOnNavigationEvent, "PortalServiceBundleLoader", this);
                if (objIAuthTabCallback == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                objIAuthTabCallback = obj;
            }
            MaxFullscreenAdImplExternalSyntheticLambda10.IAuthTabCallback iAuthTabCallback = (MaxFullscreenAdImplExternalSyntheticLambda10.IAuthTabCallback) objIAuthTabCallback;
            if (iAuthTabCallback instanceof MaxFullscreenAdImplExternalSyntheticLambda10.IAuthTabCallback.onExtraCallbackWithResult) {
                onAppOpenAdDisplayed onappopenaddisplayed = onAppOpenAdDisplayed.this;
                Object[] objArr = new Object[1];
                a(new char[]{2, 4, 4, 6, 5, '\b', 3, 6, 3, 2}, (byte) (111 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), View.resolveSizeAndState(0, 0, 0) + 10, objArr);
                onAppOpenAdDisplayed.onExtraCallback(onappopenaddisplayed, new MaxFullscreenAdImpl.onExtraCallbackWithResult("", "", new TossReactBundleMeta((String) null, ((String) objArr[0]).intern(), (String) null, (String) null, 0L, 0L, (String) null, 125, (DefaultConstructorMarker) null), false, 8, (DefaultConstructorMarker) null));
                MaxFullscreenAdImplExternalSyntheticLambda10.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult = (MaxFullscreenAdImplExternalSyntheticLambda10.IAuthTabCallback.onExtraCallbackWithResult) iAuthTabCallback;
                ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "react_native_debug", "metro_server_detected", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("from", "PortalServiceBundleLoader"), getWrite.IAuthTabCallback("host", onextracallbackwithresult.onExtraCallback()), getWrite.IAuthTabCallback("port", access14000.onNavigationEvent(onextracallbackwithresult.onExtraCallbackWithResult()))}), (String) null, false, (String) null, 56, (Object) null);
                return onNavigationEvent.DEV_SERVER;
            }
            if (!(iAuthTabCallback instanceof MaxFullscreenAdImplExternalSyntheticLambda10.IAuthTabCallback.onWarmupCompleted)) {
                throw new NoWhenBranchMatchedException();
            }
            int i4 = onExtraCallbackWithResult + 51;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                setRequestListener setrequestlistenerIAuthTabCallback = ((MaxFullscreenAdImplExternalSyntheticLambda10.IAuthTabCallback.onWarmupCompleted) iAuthTabCallback).IAuthTabCallback();
                onAppOpenAdDisplayed.onExtraCallbackWithResult(onAppOpenAdDisplayed.this, setrequestlistenerIAuthTabCallback.onWarmupCompleted());
                onAppOpenAdDisplayed.IAuthTabCallback(onAppOpenAdDisplayed.this, setrequestlistenerIAuthTabCallback.onExtraCallback());
                onAppOpenAdDisplayed onappopenaddisplayed2 = onAppOpenAdDisplayed.this;
                onAppOpenAdDisplayed.onExtraCallback(onappopenaddisplayed2, (MaxFullscreenAdImpl.onExtraCallbackWithResult) onAppOpenAdDisplayed.onWarmupCompleted(552513749, new Object[]{onappopenaddisplayed2, setrequestlistenerIAuthTabCallback}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), -552513748));
                return onNavigationEvent.PRODUCTION;
            }
            setRequestListener setrequestlistenerIAuthTabCallback2 = ((MaxFullscreenAdImplExternalSyntheticLambda10.IAuthTabCallback.onWarmupCompleted) iAuthTabCallback).IAuthTabCallback();
            onAppOpenAdDisplayed.onExtraCallbackWithResult(onAppOpenAdDisplayed.this, setrequestlistenerIAuthTabCallback2.onWarmupCompleted());
            onAppOpenAdDisplayed.IAuthTabCallback(onAppOpenAdDisplayed.this, setrequestlistenerIAuthTabCallback2.onExtraCallback());
            onAppOpenAdDisplayed onappopenaddisplayed3 = onAppOpenAdDisplayed.this;
            onAppOpenAdDisplayed.onExtraCallback(onappopenaddisplayed3, (MaxFullscreenAdImpl.onExtraCallbackWithResult) onAppOpenAdDisplayed.onWarmupCompleted(552513749, new Object[]{onappopenaddisplayed3, setrequestlistenerIAuthTabCallback2}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), -552513748));
            onNavigationEvent onnavigationevent = onNavigationEvent.PRODUCTION;
            obj2.hashCode();
            throw null;
        }

        private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr2 = IAuthTabCallback;
            Object obj2 = null;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                for (int i4 = 0; i4 < length; i4++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 26 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 23139 - (ViewConfiguration.getFadingEdgeLength() >> 16), -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            try {
                Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.lastIndexOf("", '0') + 27, 23139 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -2137011959, false, "z", new Class[]{Integer.TYPE});
                }
                char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                char[] cArr4 = new char[i];
                if (i % 2 != 0) {
                    int i5 = $11 + 87;
                    int i6 = i5 % 128;
                    $10 = i6;
                    if (i5 % 2 != 0) {
                        i2 = i + 105;
                        cArr4[i2] = (char) (cArr[i2] - b);
                    } else {
                        i2 = i - 1;
                        cArr4[i2] = (char) (cArr[i2] - b);
                    }
                    int i7 = i6 + 39;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                } else {
                    i2 = i;
                }
                if (i2 > 1) {
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                    while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                        defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                            int i9 = $10 + 31;
                            $11 = i9 % 128;
                            int i10 = i9 % 2;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                            obj = obj2;
                        } else {
                            try {
                                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                                if (objOnExtraCallback3 == null) {
                                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.combineMeasuredStates(0, 0) + 24824), 74 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 8088 - View.MeasureSpec.getSize(0), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                }
                                if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                    if (objOnExtraCallback4 == null) {
                                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getTapTimeout() >> 16) + 30, 19488 - (ViewConfiguration.getTapTimeout() >> 16), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                    }
                                    obj = null;
                                    int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                                    int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i11];
                                } else {
                                    obj = null;
                                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                        int i12 = $10 + 39;
                                        $11 = i12 % 128;
                                        int i13 = i12 % 2;
                                        defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                        int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                        int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i14];
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i15];
                                        int i16 = $11 + 71;
                                        $10 = i16 % 128;
                                        int i17 = i16 % 2;
                                    } else {
                                        int i18 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                        int i19 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i18];
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i19];
                                    }
                                }
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        }
                        defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                        obj2 = obj;
                    }
                }
                for (int i20 = 0; i20 < i; i20++) {
                    cArr4[i20] = (char) (cArr4[i20] ^ 13722);
                }
                objArr[0] = new String(cArr4);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 39;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            String str = this.onTransact;
            if (str == null) {
                throw new IllegalStateException("Service bundle not loaded. Call loadServiceBundle() first.");
            }
            int i4 = i2 + 31;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = access100 + 111;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        String str = this.IAuthTabCallbackDefault;
        if (i3 == 0) {
            int i4 = 99 / 0;
        }
        return str;
    }

    public final String onNavigationEvent() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 61;
        int i3 = i2 % 128;
        access100 = i3;
        if (i2 % 2 != 0) {
            str = this.asBinder;
            int i4 = 61 / 0;
        } else {
            str = this.asBinder;
        }
        int i5 = i3 + 111;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 97;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            String str = this.getInterfaceDescriptor;
            int i4 = 98 / 0;
            if (str != null) {
                return str;
            }
        } else {
            String str2 = this.getInterfaceDescriptor;
            if (str2 != null) {
                return str2;
            }
        }
        int i5 = i2 + 59;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return "";
    }

    public final MaxFullscreenAdImpl IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 95;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.asInterface;
        int i5 = i3 + 101;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return maxFullscreenAdImpl;
    }

    public final void asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 9;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        String str = this.getInterfaceDescriptor;
        if (str == null) {
            int i5 = i3 + 113;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            str = "";
        }
        ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "react_native_debug", "bundle_crash_recorded", (Throwable) null, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("from", "PortalServiceBundleLoader"), getWrite.IAuthTabCallback("bundleName", this.asBinder), getWrite.IAuthTabCallback("region", this.IAuthTabCallbackStub), getWrite.IAuthTabCallback("company", this.onExtraCallbackWithResult), getWrite.IAuthTabCallback("deploymentId", str)}), 4, (Object) null);
        asInterface().onWarmupCompleted(this.asBinder, this.IAuthTabCallbackStub, this.onExtraCallbackWithResult, str);
    }

    private final MaxFullscreenAdImpl.onExtraCallbackWithResult IAuthTabCallback(setRequestListener setrequestlistener) {
        long jLongValue;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 17;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            String strIAuthTabCallback = setrequestlistener.IAuthTabCallback();
            String strOnWarmupCompleted = setrequestlistener.onWarmupCompleted();
            if (strOnWarmupCompleted == null) {
                strOnWarmupCompleted = "";
            }
            String strAsBinder = setrequestlistener.asBinder();
            String strOnExtraCallback = setrequestlistener.onExtraCallback();
            String strOnExtraCallbackWithResult = setrequestlistener.onExtraCallbackWithResult();
            String strOnTransact = setrequestlistener.onTransact();
            String str = strOnTransact == null ? "" : strOnTransact;
            Long lOnNavigationEvent = setrequestlistener.onNavigationEvent();
            if (lOnNavigationEvent != null) {
                int i3 = IAuthTabCallback_Parcel + 123;
                access100 = i3 % 128;
                int i4 = i3 % 2;
                jLongValue = lOnNavigationEvent.longValue();
            } else {
                jLongValue = 0;
            }
            Long lIAuthTabCallbackStub = setrequestlistener.IAuthTabCallbackStub();
            return new MaxFullscreenAdImpl.onExtraCallbackWithResult(strIAuthTabCallback, strOnWarmupCompleted, new TossReactBundleMeta(strAsBinder, strOnExtraCallback, strOnExtraCallbackWithResult, str, jLongValue, lIAuthTabCallbackStub != null ? lIAuthTabCallbackStub.longValue() : 0L, (String) null, 64, (DefaultConstructorMarker) null), setrequestlistener.IAuthTabCallbackDefault());
        }
        setrequestlistener.IAuthTabCallback();
        setrequestlistener.onWarmupCompleted();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallback {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onTransact = 1;
        private static char[] IAuthTabCallback = {32387, 32447, 32444, 32385};
        private static int onWarmupCompleted = -1184334034;
        private static boolean onExtraCallback = true;
        private static boolean onNavigationEvent = true;

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0051, code lost:
        
            if (r7 == null) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0053, code lost:
        
            r5 = o.onAppOpenAdDisplayed.IAuthTabCallback.onTransact + 107;
            o.onAppOpenAdDisplayed.IAuthTabCallback.onExtraCallbackWithResult = r5 % 128;
            r8 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x005d, code lost:
        
            if ((r5 % 2) != 0) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x005f, code lost:
        
            r9 = r36.IAuthTabCallbackStubProxy();
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
        
            if (r9 == null) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0067, code lost:
        
            r10 = o.onAppOpenAdDisplayed.IAuthTabCallback.onExtraCallbackWithResult + 119;
            o.onAppOpenAdDisplayed.IAuthTabCallback.onTransact = r10 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
        
            if ((r10 % 2) == 0) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
        
            r10 = r36.asBinder();
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
        
            if (r10 != null) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x007a, code lost:
        
            r10 = "kr";
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x007b, code lost:
        
            r12 = r36.IAuthTabCallback();
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0081, code lost:
        
            if (r12 != null) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0083, code lost:
        
            r15 = new java.lang.Object[1];
            a(null, null, new byte[]{-124, -125, -126, -127}, 127 - android.graphics.Color.argb(0, 0, 0, 0), r15);
            r12 = ((java.lang.String) r15[0]).intern();
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x009b, code lost:
        
            r19 = o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
            r20 = o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
            r23 = (java.lang.String) o.MaxFullscreenAdImplExternalSyntheticLambda6.onNavigationEvent.onExtraCallbackWithResult(o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new java.lang.Object[]{r36}, r19, 1309118263, -1309118259, r20, o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00be, code lost:
        
            if (r23 == null) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00c0, code lost:
        
            r2 = o.onAppOpenAdDisplayed.IAuthTabCallback.onTransact + 23;
            o.onAppOpenAdDisplayed.IAuthTabCallback.onExtraCallbackWithResult = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00c9, code lost:
        
            if ((r2 % 2) != 0) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00cb, code lost:
        
            r24 = r36.IAuthTabCallbackStubProxy();
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00cf, code lost:
        
            if (r24 == null) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00d1, code lost:
        
            r1 = r36.asBinder();
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00d5, code lost:
        
            if (r1 != null) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00d7, code lost:
        
            r25 = "kr";
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00da, code lost:
        
            r25 = r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00dc, code lost:
        
            r1 = r36.IAuthTabCallback();
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00e0, code lost:
        
            if (r1 != null) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00e2, code lost:
        
            r3 = new java.lang.Object[1];
            a(null, null, new byte[]{-124, -125, -126, -127}, android.text.TextUtils.getOffsetAfter("", 0) + 127, r3);
            r1 = ((java.lang.String) r3[0]).intern();
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x012f, code lost:
        
            return new o.onAppOpenAdDisplayed(r6, r7, r9, r10, r12, new o.MaxFullscreenAdImplExternalSyntheticLambda10(r23, r24, r25, r1, r36.IAuthTabCallbackDefault(), r36.asInterface(), r36.access000(), r36.access100(), r36.onNavigationEvent(), r36.IAuthTabCallback_Parcel(), r36.onExtraCallbackWithResult(), r36.getInterfaceDescriptor()), null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0135, code lost:
        
            throw new java.lang.IllegalStateException("Remote bundle URL is required");
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0136, code lost:
        
            r36.IAuthTabCallbackStubProxy();
            r1 = null;
            r1.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x013d, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0143, code lost:
        
            throw new java.lang.IllegalStateException("Remote bundle name is required");
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0144, code lost:
        
            r36.asBinder();
            r8.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x014b, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0151, code lost:
        
            throw new java.lang.IllegalStateException("Remote bundle URL is required");
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0152, code lost:
        
            r36.IAuthTabCallbackStubProxy();
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0156, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x015c, code lost:
        
            throw new java.lang.IllegalStateException("Remote bundle name is required");
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0164, code lost:
        
            throw new java.lang.IllegalStateException("Context is required");
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
        
            if (r2 != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
        
            if (r2 != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
        
            r6 = r2;
            r9 = o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
            r12 = o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
            r7 = (java.lang.String) o.MaxFullscreenAdImplExternalSyntheticLambda6.onNavigationEvent.onExtraCallbackWithResult(o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new java.lang.Object[]{r36}, r9, 1309118263, -1309118259, r12, o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final onAppOpenAdDisplayed onWarmupCompleted(@NotNull MaxFullscreenAdImplExternalSyntheticLambda6.onNavigationEvent onnavigationevent) throws Throwable {
            Context contextOnWarmupCompleted;
            int i = 2 % 2;
            int i2 = onTransact + 29;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(onnavigationevent, "");
                contextOnWarmupCompleted = onnavigationevent.onWarmupCompleted();
                int i3 = 90 / 0;
            } else {
                Intrinsics.checkNotNullParameter(onnavigationevent, "");
                contextOnWarmupCompleted = onnavigationevent.onWarmupCompleted();
            }
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
            char[] cArr2;
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr3 = IAuthTabCallback;
            if (cArr3 != null) {
                int length = cArr3.length;
                char[] cArr4 = new char[length];
                int i3 = 0;
                while (i3 < length) {
                    int i4 = $10 + 75;
                    $11 = i4 % 128;
                    int i5 = i4 % 2;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 77 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getJumpTapTimeout() >> 16) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr4[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i3++;
                        int i6 = $11 + 31;
                        $10 = i6 % 128;
                        int i7 = i6 % 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr3 = cArr4;
            }
            Object[] objArr3 = {Integer.valueOf(onWarmupCompleted)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            float f = 0.0f;
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 75, 16038 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            if (onNavigationEvent) {
                int i8 = $11 + 59;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                    cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
                } else {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                    cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                }
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)) + 63, (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1)) + 12213, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    f = 0.0f;
                }
                objArr[0] = new String(cArr2);
                return;
            }
            if (!onExtraCallback) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i9 = $10 + 47;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted;
                    int i11 = defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback;
                    cArr6[i10] = (char) (cArr3[cArr[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getThreadPriority(0) + 20) >> 6), 63 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 12214 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                } else {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getTapTimeout() >> 16) + 63, 12214 - Color.argb(0, 0, 0, 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                }
            }
            objArr[0] = new String(cArr6);
        }
    }

    public static /* synthetic */ logApiCall IAuthTabCallback(onAppOpenAdDisplayed onappopenaddisplayed) {
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        return (logApiCall) onWarmupCompleted(-685106136, new Object[]{onappopenaddisplayed}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 685106136);
    }

    public static final /* synthetic */ MaxFullscreenAdImpl.onExtraCallbackWithResult onWarmupCompleted(onAppOpenAdDisplayed onappopenaddisplayed, setRequestListener setrequestlistener) {
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        return (MaxFullscreenAdImpl.onExtraCallbackWithResult) onWarmupCompleted(552513749, new Object[]{onappopenaddisplayed, setrequestlistener}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -552513748);
    }

    private final logApiCall IAuthTabCallbackStub() {
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        return (logApiCall) onWarmupCompleted(-1879185077, new Object[]{this}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1879185079);
    }

    public final Object onExtraCallback(@NotNull access13800<? super onNavigationEvent> access13800Var) {
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        return onWarmupCompleted(2115256031, new Object[]{this, access13800Var}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -2115256028);
    }
}
