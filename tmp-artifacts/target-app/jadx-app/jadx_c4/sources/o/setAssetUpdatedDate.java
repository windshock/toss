package o;

import android.app.Application;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.material.datepicker.DateFormatTextWatcher$;
import im.toss.core.tracker.entry.TrackEvent;
import im.toss.core.tracker.marketing.impl.appsflyer.AppsFlyerDeepLinkResolver$;
import im.toss.core.tracker.marketing.impl.appsflyer.AppsFlyerDeepLinkResolver$createConversionListener$1$;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.SetDetectableSize;
import o.setAssetUpdatedDate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setAssetUpdatedDate {
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    private static int IAuthTabCallback_Parcel = 1;
    private static int access000 = 1;
    private static int access100;
    private static int getInterfaceDescriptor;
    private final AtomicBoolean IAuthTabCallback;
    private final AtomicBoolean IAuthTabCallbackDefault;
    private final TextRoundCornerProgressBarSavedState1 IAuthTabCallbackStub;
    private final AtomicBoolean IAuthTabCallbackStubProxy;
    private final pauseMyRequest<Unit> asBinder;
    private final findResAndMsg asInterface;
    private final initLayout onExtraCallback;
    private final boolean onExtraCallbackWithResult;
    private final AtomicBoolean onNavigationEvent;
    private final r8lambdaTsWcD_OVmry3lIzl60G0AtUlM onTransact;
    private final copyLicense onWarmupCompleted;

    public static final /* synthetic */ class onExtraCallbackWithResult {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        public static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[DeepLinkResult.Status.values().length];
            try {
                iArr[DeepLinkResult.Status.FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeepLinkResult.Status.NOT_FOUND.ordinal()] = 2;
                int i = IAuthTabCallback + 65;
                onExtraCallbackWithResult = i % 128;
                if (i % 2 == 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DeepLinkResult.Status.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            onNavigationEvent = iArr;
            int i3 = onExtraCallbackWithResult + 39;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = IAuthTabCallback_Parcel + 85;
        access100 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~((~i6) | i7);
        int i9 = i4 | i8 | (~(i | i6));
        int i10 = (~(i6 | i4)) | (~(i7 | i6)) | (~(i7 | i4));
        int i11 = i4 + i + i5 + (1351532378 * i2) + (1237199896 * i3);
        int i12 = i11 * i11;
        int i13 = ((-211156802) * i4) + 1314914304 + ((-491389116) * i) + (2007367491 * i9) + (i10 * (-2007367491)) + ((-2007367491) * i8) + (1796210688 * i5) + ((-1818230784) * i2) + ((-914358272) * i3) + ((-2051670016) * i12);
        int i14 = ((i4 * 406040238) - 634933780) + (i * 406038884) + (i9 * (-677)) + (i10 * 677) + (i8 * 677) + (i5 * 406039561) + (i2 * 1283666474) + (i3 * 1712827608) + (i12 * (-77201408));
        int i15 = i13 + (i14 * i14 * 1831469056);
        return i15 != 1 ? i15 != 2 ? i15 != 3 ? i15 != 4 ? i15 != 5 ? onExtraCallback(objArr) : asInterface(objArr) : onNavigationEvent(objArr) : IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr);
    }

    public static /* synthetic */ void onExtraCallback(setAssetUpdatedDate setassetupdateddate, Application application, DeepLinkResult deepLinkResult) {
        int i = 2 % 2;
        int i2 = access000 + 109;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        IAuthTabCallback(1372764597, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1372764594, new Object[]{setassetupdateddate, application, deepLinkResult}, iOnNavigationEvent2, iOnNavigationEvent);
        int i4 = access000 + 121;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, String str2, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = access000 + 125;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(str, str2, setDetectableSize);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(str, str2, setDetectableSize);
        int i3 = getInterfaceDescriptor + 111;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    @Inject
    public setAssetUpdatedDate(@NotNull TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1, @NotNull r8lambdaTsWcD_OVmry3lIzl60G0AtUlM r8lambdatswcd_ovmry3lizl60g0atulm, @NotNull copyLicense copylicense, @NotNull initLayout initlayout) {
        Intrinsics.checkNotNullParameter(textRoundCornerProgressBarSavedState1, "");
        Intrinsics.checkNotNullParameter(r8lambdatswcd_ovmry3lizl60g0atulm, "");
        Intrinsics.checkNotNullParameter(copylicense, "");
        Intrinsics.checkNotNullParameter(initlayout, "");
        this.IAuthTabCallbackStub = textRoundCornerProgressBarSavedState1;
        this.onTransact = r8lambdatswcd_ovmry3lizl60g0atulm;
        this.onWarmupCompleted = copylicense;
        this.onExtraCallback = initlayout;
        this.asInterface = findRes.onWarmupCompleted(isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null).plus(putChannelInfo.IAuthTabCallback()));
        this.onNavigationEvent = new AtomicBoolean(false);
        this.IAuthTabCallbackStubProxy = new AtomicBoolean(false);
        this.IAuthTabCallback = new AtomicBoolean(false);
        this.IAuthTabCallbackDefault = new AtomicBoolean(false);
        this.asBinder = getResRootDir.onExtraCallback((getPackageType) null, 1, (Object) null);
    }

    public static final /* synthetic */ void IAuthTabCallback(setAssetUpdatedDate setassetupdateddate, String str, String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 63;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        setassetupdateddate.IAuthTabCallback(str, str2);
        int i4 = access000 + 21;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ boolean IAuthTabCallback(setAssetUpdatedDate setassetupdateddate) {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 65;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        boolean z = setassetupdateddate.onExtraCallbackWithResult;
        int i5 = i2 + 93;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public static final /* synthetic */ TextRoundCornerProgressBarSavedState1 IAuthTabCallbackDefault(setAssetUpdatedDate setassetupdateddate) {
        int i = 2 % 2;
        int i2 = access000 + 87;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = setassetupdateddate.IAuthTabCallbackStub;
        int i5 = i3 + 119;
        access000 = i5 % 128;
        if (i5 % 2 != 0) {
            return textRoundCornerProgressBarSavedState1;
        }
        throw null;
    }

    public static final /* synthetic */ void asBinder(setAssetUpdatedDate setassetupdateddate) {
        int i = 2 % 2;
        int i2 = access000 + 73;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        setassetupdateddate.asInterface();
        if (i3 != 0) {
            int i4 = 71 / 0;
        }
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        setAssetUpdatedDate setassetupdateddate = (setAssetUpdatedDate) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 15;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        copyLicense copylicense = setassetupdateddate.onWarmupCompleted;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 95;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return copylicense;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        setAssetUpdatedDate setassetupdateddate = (setAssetUpdatedDate) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 39;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        AtomicBoolean atomicBoolean = setassetupdateddate.IAuthTabCallbackStubProxy;
        int i5 = i3 + 117;
        access000 = i5 % 128;
        if (i5 % 2 != 0) {
            return atomicBoolean;
        }
        throw null;
    }

    public static final /* synthetic */ AtomicBoolean onExtraCallback(setAssetUpdatedDate setassetupdateddate) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 39;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        AtomicBoolean atomicBoolean = setassetupdateddate.onNavigationEvent;
        if (i3 != 0) {
            return atomicBoolean;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ AtomicBoolean onExtraCallbackWithResult(setAssetUpdatedDate setassetupdateddate) {
        int i = 2 % 2;
        int i2 = access000 + 23;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        AtomicBoolean atomicBoolean = setassetupdateddate.IAuthTabCallback;
        if (i3 == 0) {
            return atomicBoolean;
        }
        throw null;
    }

    public static final /* synthetic */ Long onNavigationEvent(setAssetUpdatedDate setassetupdateddate) {
        int i = 2 % 2;
        int i2 = access000 + 111;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Long lOnTransact = setassetupdateddate.onTransact();
        int i4 = getInterfaceDescriptor + 11;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 8 / 0;
        }
        return lOnTransact;
    }

    public static final /* synthetic */ boolean onNavigationEvent(setAssetUpdatedDate setassetupdateddate, long j) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 11;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = setassetupdateddate.onExtraCallbackWithResult(j);
        int i4 = getInterfaceDescriptor + 111;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallbackWithResult;
    }

    public static final /* synthetic */ r8lambdaTsWcD_OVmry3lIzl60G0AtUlM onTransact(setAssetUpdatedDate setassetupdateddate) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 31;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaTsWcD_OVmry3lIzl60G0AtUlM r8lambdatswcd_ovmry3lizl60g0atulm = setassetupdateddate.onTransact;
        if (i3 == 0) {
            int i4 = 84 / 0;
        }
        return r8lambdatswcd_ovmry3lizl60g0atulm;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0025, code lost:
    
        if (r5 == o.access14300.onWarmupCompleted()) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
    
        if (r5 == o.access14300.onWarmupCompleted()) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
    
        r0 = o.setAssetUpdatedDate.getInterfaceDescriptor + 113;
        o.setAssetUpdatedDate.access000 = r0 % 128;
        r0 = r0 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Object objIAuthTabCallback;
        setAssetUpdatedDate setassetupdateddate = (setAssetUpdatedDate) objArr[0];
        access13800 access13800Var = (access13800) objArr[1];
        int i = 2 % 2;
        int i2 = access000 + 105;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            objIAuthTabCallback = setassetupdateddate.asBinder.IAuthTabCallback(access13800Var);
            int i3 = 75 / 0;
        } else {
            objIAuthTabCallback = setassetupdateddate.asBinder.IAuthTabCallback(access13800Var);
        }
    }

    private final void asInterface() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 57;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        if (!this.IAuthTabCallbackDefault.get()) {
            int i4 = getInterfaceDescriptor + 121;
            access000 = i4 % 128;
            if (i4 % 2 != 0) {
                if ((!this.IAuthTabCallbackStubProxy.get()) || !this.IAuthTabCallback.get()) {
                    return;
                }
            } else {
                this.IAuthTabCallbackStubProxy.get();
                throw null;
            }
        }
        this.asBinder.IAuthTabCallback(Unit.INSTANCE);
        int i5 = getInterfaceDescriptor + 107;
        access000 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final DeepLinkListener IAuthTabCallback(@NotNull Application application) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(application, "");
        AppsFlyerDeepLinkResolver$.ExternalSyntheticLambda0 externalSyntheticLambda0 = new AppsFlyerDeepLinkResolver$.ExternalSyntheticLambda0(this, application);
        int i2 = access000 + 105;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        return externalSyntheticLambda0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        setAssetUpdatedDate setassetupdateddate = (setAssetUpdatedDate) objArr[0];
        Application application = (Application) objArr[1];
        DeepLinkResult deepLinkResult = (DeepLinkResult) objArr[2];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(deepLinkResult, "");
        Long lOnTransact = setassetupdateddate.onTransact();
        if (lOnTransact == null) {
            setassetupdateddate.IAuthTabCallbackDefault();
            return null;
        }
        int i2 = getInterfaceDescriptor + 35;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        long jLongValue = lOnTransact.longValue();
        int i4 = onExtraCallbackWithResult.onNavigationEvent[deepLinkResult.getStatus().ordinal()];
        if (i4 == 1) {
            maybeUpdateAnimatable.onNavigationEvent(setassetupdateddate.asInterface, (CoroutineContext) null, (setRandomHost) null, setassetupdateddate.new onNavigationEvent(application, deepLinkResult, jLongValue, null), 3, (Object) null);
            return null;
        }
        if (i4 == 2) {
            boolean z = setassetupdateddate.onExtraCallbackWithResult;
            setassetupdateddate.IAuthTabCallbackStubProxy.set(true);
            setassetupdateddate.asInterface();
            int i5 = access000 + 43;
            getInterfaceDescriptor = i5 % 128;
            if (i5 % 2 == 0) {
                return null;
            }
            throw null;
        }
        if (i4 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        int i6 = getInterfaceDescriptor + 37;
        access000 = i6 % 128;
        if (i6 % 2 == 0) {
            deepLinkResult.getError();
            DeepLinkResult.Error error = DeepLinkResult.Error.TIMEOUT;
            throw null;
        }
        if (deepLinkResult.getError() == DeepLinkResult.Error.TIMEOUT || deepLinkResult.getError() == DeepLinkResult.Error.NETWORK) {
            boolean z2 = setassetupdateddate.onExtraCallbackWithResult;
            int i7 = access000 + 67;
            getInterfaceDescriptor = i7 % 128;
            int i8 = i7 % 2;
        } else {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "AppsFlyerManager", "AppsFlyer UDL failed: " + deepLinkResult.getError(), (Throwable) null, (Map) null, 12, (Object) null);
        }
        setassetupdateddate.IAuthTabCallbackStubProxy.set(true);
        setassetupdateddate.asInterface();
        return null;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ long $consentRevision;
        final /* synthetic */ Application $context;
        final /* synthetic */ DeepLinkResult $result;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(Application application, DeepLinkResult deepLinkResult, long j, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$context = application;
            this.$result = deepLinkResult;
            this.$consentRevision = j;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = setAssetUpdatedDate.this.new onNavigationEvent(this.$context, this.$result, this.$consentRevision, access13800Var);
            int i2 = IAuthTabCallback + 91;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return onnavigationevent;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 15;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 125;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 39;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 125;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 119;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i3 + 7;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            setAssetUpdatedDate.this.IAuthTabCallback(this.$context, this.$result.getDeepLink(), access14000.onExtraCallback(this.$consentRevision));
            Object[] objArr = {setAssetUpdatedDate.this};
            int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
            ((AtomicBoolean) setAssetUpdatedDate.IAuthTabCallback(1966545852, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1966545852, objArr, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent)).set(true);
            setAssetUpdatedDate.asBinder(setAssetUpdatedDate.this);
            return Unit.INSTANCE;
        }
    }

    public static final class IAuthTabCallback implements AppsFlyerConversionListener {
        final /* synthetic */ Application onExtraCallbackWithResult;
        private static final byte[] $$a = {2, 105, -126, -86};
        private static final int $$b = 83;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onNavigationEvent = 0;
        private static int onTransact = 1;
        private static char[] onWarmupCompleted = {60855, 42035, 32437, 12598, 52141, 33315, 21655, 61200};
        private static long onExtraCallback = 5424297911852115026L;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(short s, int i, int i2) {
            int i3;
            byte[] bArr = $$a;
            int i4 = i2 * 4;
            int i5 = 97 - (s * 3);
            int i6 = 3 - (i * 4);
            byte[] bArr2 = new byte[1 - i4];
            int i7 = 0 - i4;
            if (bArr == null) {
                int i8 = i6;
                int i9 = 0;
                i5 += -i6;
                i6 = i8;
                i3 = i9;
                bArr2[i3] = (byte) i5;
                if (i3 == i7) {
                    return new String(bArr2, 0);
                }
                int i10 = i3 + 1;
                int i11 = i6 + 1;
                i8 = i11;
                i6 = bArr[i11];
                i9 = i10;
                i5 += -i6;
                i6 = i8;
                i3 = i9;
                bArr2[i3] = (byte) i5;
                if (i3 == i7) {
                }
            } else {
                i3 = 0;
                bArr2[i3] = (byte) i5;
                if (i3 == i7) {
                }
            }
        }

        public static /* synthetic */ Unit onExtraCallbackWithResult(setAssetUpdatedDate setassetupdateddate, long j, String str, String str2) throws Throwable {
            int i = 2 % 2;
            int i2 = onTransact + 5;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnNavigationEvent = onNavigationEvent(setassetupdateddate, j, str, str2);
            int i4 = onNavigationEvent + 75;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return unitOnNavigationEvent;
        }

        public void onAppOpenAttribution(Map<String, String> map) {
            int i = 2 % 2;
            int i2 = onTransact + 69;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
        }

        private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
            long[] jArr = new long[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                int i4 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(onWarmupCompleted[i + i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - (ViewConfiguration.getScrollBarSize() >> 8)), 16 - ExpandableListView.getPackedPositionChild(0L), KeyEvent.keyCodeFromString("") + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(onExtraCallback), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - Color.green(0)), 31 - ExpandableListView.getPackedPositionGroup(0L), 20221 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - Drawable.resolveOpacity(0, 0)), 44 - (KeyEvent.getMaxKeyCode() >> 16), TextUtils.getCapsMode("", 0, 0) + 1494, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr = new char[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            int i5 = $11 + 57;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                int i7 = $11 + 87;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49122 - ExpandableListView.getPackedPositionChild(0L)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 44, 1494 - (ViewConfiguration.getLongPressTimeout() >> 16), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr);
        }

        IAuthTabCallback(Application application) {
            this.onExtraCallbackWithResult = application;
        }

        private static final Unit onNavigationEvent(setAssetUpdatedDate setassetupdateddate, long j, String str, String str2) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str2, "");
            if (!setAssetUpdatedDate.onNavigationEvent(setassetupdateddate, j)) {
                int i2 = onNavigationEvent + 121;
                onTransact = i2 % 128;
                int i3 = i2 % 2;
                setAssetUpdatedDate.onExtraCallbackWithResult(setassetupdateddate).set(true);
                setAssetUpdatedDate.asBinder(setassetupdateddate);
                return Unit.INSTANCE;
            }
            if (setAssetUpdatedDate.onExtraCallback(setassetupdateddate).compareAndSet(false, true)) {
                int i4 = onTransact + 125;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    setassetupdateddate.onNavigationEvent(str2);
                    setAssetUpdatedDate.IAuthTabCallback(setassetupdateddate, str2, str);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                setassetupdateddate.onNavigationEvent(str2);
                setAssetUpdatedDate.IAuthTabCallback(setassetupdateddate, str2, str);
            }
            setAssetUpdatedDate.onExtraCallbackWithResult(setassetupdateddate).set(true);
            setAssetUpdatedDate.asBinder(setassetupdateddate);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:47:0x0171  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final boolean IAuthTabCallback(Map<String, String> map) throws Throwable {
            Object obj;
            int i = 2 % 2;
            Long lOnNavigationEvent = setAssetUpdatedDate.onNavigationEvent(setAssetUpdatedDate.this);
            if (lOnNavigationEvent == null) {
                return false;
            }
            long jLongValue = lOnNavigationEvent.longValue();
            Application application = this.onExtraCallbackWithResult;
            try {
                Result.Companion companion = kotlin.Result.Companion;
                obj = kotlin.Result.constructor-impl(AdvertisingIdClient.getAdvertisingIdInfo(application).getId());
            } catch (Throwable th) {
                Result.Companion companion2 = kotlin.Result.Companion;
                obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
            }
            boolean z = true;
            Object obj2 = null;
            if (!(!kotlin.Result.onExtraCallback(obj))) {
                obj = null;
            }
            String str = (String) obj;
            if (!setAssetUpdatedDate.onNavigationEvent(setAssetUpdatedDate.this, jLongValue)) {
                return false;
            }
            if (str != null) {
                int i2 = onTransact + 87;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    map.put("ad_id", str);
                } else {
                    map.put("ad_id", str);
                    obj2.hashCode();
                    throw null;
                }
            }
            GetFeatureExtension.onExtraCallbackWithResult(GetFeatureExtension.onWarmupCompleted, new TrackEvent.IAuthTabCallback().onNavigationEvent("appsflyer_conversion_data").IAuthTabCallback(map).onWarmupCompleted(), false, 2, null);
            if (!StringsKt.equals("true", String.valueOf(map.get("is_first_launch")), true)) {
                return false;
            }
            int i3 = onNavigationEvent + 93;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            if (setAssetUpdatedDate.IAuthTabCallback(setAssetUpdatedDate.this)) {
                Objects.toString(map);
            }
            String str2 = map.get("af_dp");
            Object[] objArr = new Object[1];
            a(ViewConfiguration.getScrollDefaultDelay() >> 16, 8 - ((Process.getThreadPriority(0) + 20) >> 6), (char) View.MeasureSpec.getMode(0), objArr);
            String str3 = map.get(((String) objArr[0]).intern());
            String str4 = map.get("adset");
            String str5 = map.get("af_adset");
            String str6 = map.get("af_status");
            if (str2 != null && mergeParams.onExtraCallbackWithResult(str2)) {
                if (!setAssetUpdatedDate.onExtraCallback(setAssetUpdatedDate.this).compareAndSet(false, true)) {
                    setAssetUpdatedDate.IAuthTabCallback(setAssetUpdatedDate.this);
                } else {
                    int i5 = onTransact + 39;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 != 0) {
                        setAssetUpdatedDate.IAuthTabCallback(setAssetUpdatedDate.this, str2, str);
                        setAssetUpdatedDate.this.onNavigationEvent(str2);
                    } else {
                        setAssetUpdatedDate.IAuthTabCallback(setAssetUpdatedDate.this, str2, str);
                        setAssetUpdatedDate.this.onNavigationEvent(str2);
                    }
                }
                z = false;
            } else if (str3 != null) {
                int i6 = onTransact + 17;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0 ? TextUtils.isEmpty(str3) : TextUtils.isEmpty(str3)) {
                    z = false;
                } else {
                    setAssetUpdatedDate.onTransact(setAssetUpdatedDate.this).onExtraCallback(str3);
                    ((copyLicense) setAssetUpdatedDate.IAuthTabCallback(916210380, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -916210375, new Object[]{setAssetUpdatedDate.this}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent())).onExtraCallbackWithResult(str3, str4, str5, new AppsFlyerDeepLinkResolver$createConversionListener$1$.ExternalSyntheticLambda0(setAssetUpdatedDate.this, jLongValue, str));
                }
            }
            if (str5 != null && str5.length() != 0) {
                setAssetUpdatedDate.IAuthTabCallbackDefault(setAssetUpdatedDate.this).onNavigationEvent("af_adset", str5);
            }
            if (str6 != null && str6.length() != 0) {
                setAssetUpdatedDate.IAuthTabCallbackDefault(setAssetUpdatedDate.this).onNavigationEvent("af_status", str6);
            }
            if (str3 != null) {
                if (str3.length() == 0) {
                    int i7 = onTransact + 61;
                    onNavigationEvent = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i8 = 78 / 0;
                    }
                } else {
                    setAssetUpdatedDate.IAuthTabCallbackDefault(setAssetUpdatedDate.this).onNavigationEvent("af_campaign", str3);
                }
            }
            return z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void onConversionDataSuccess(Map<String, Object> map) throws Throwable {
            Object obj;
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray;
            String str;
            String str2;
            Map map2;
            int i;
            boolean zIAuthTabCallback;
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 121;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            if (setAssetUpdatedDate.onNavigationEvent(setAssetUpdatedDate.this) == null) {
                int i5 = onNavigationEvent + 121;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                setAssetUpdatedDate.onExtraCallbackWithResult(setAssetUpdatedDate.this).set(true);
                setAssetUpdatedDate.asBinder(setAssetUpdatedDate.this);
                return;
            }
            try {
                Result.Companion companion = kotlin.Result.Companion;
                if (map == null) {
                    map = null;
                }
                if (map != null) {
                    zIAuthTabCallback = IAuthTabCallback(map);
                    int i7 = onNavigationEvent + 67;
                    onTransact = i7 % 128;
                    int i8 = i7 % 2;
                } else {
                    zIAuthTabCallback = false;
                }
                obj = kotlin.Result.constructor-impl(Boolean.valueOf(zIAuthTabCallback));
            } catch (Throwable th) {
                Result.Companion companion2 = kotlin.Result.Companion;
                obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
            }
            Throwable th2 = kotlin.Result.exceptionOrNull-impl(obj);
            if (th2 != null) {
                int i9 = onNavigationEvent + 5;
                onTransact = i9 % 128;
                if (i9 % 2 == 0) {
                    convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                    str = "AppsFlyerManager";
                    str2 = "AppsFlyer conversion data processing failed";
                    map2 = null;
                    i = 68;
                } else {
                    convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                    str = "AppsFlyerManager";
                    str2 = "AppsFlyer conversion data processing failed";
                    map2 = null;
                    i = 8;
                }
                ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, str, str2, th2, map2, i, (Object) null);
                obj = Boolean.FALSE;
            }
            if (((Boolean) obj).booleanValue()) {
                return;
            }
            setAssetUpdatedDate.onExtraCallbackWithResult(setAssetUpdatedDate.this).set(true);
            setAssetUpdatedDate.asBinder(setAssetUpdatedDate.this);
        }

        public void onConversionDataFail(String str) throws Throwable {
            int i = 2 % 2;
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "AppsFlyerManager", "AppsFlyer SDK conversion data failed: " + str, (Throwable) null, (Map) null, 12, (Object) null);
            setAssetUpdatedDate.onExtraCallbackWithResult(setAssetUpdatedDate.this).set(true);
            setAssetUpdatedDate.asBinder(setAssetUpdatedDate.this);
            int i2 = onNavigationEvent + 37;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        public void onAttributionFailure(String str) throws Throwable {
            int i = 2 % 2;
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "AppsFlyerManager", "AppsFlyer SDK attribution failed: " + str, (Throwable) null, (Map) null, 12, (Object) null);
            int i2 = onNavigationEvent + 87;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void IAuthTabCallback(@NotNull Application application, @Nullable DeepLink deepLink, @Nullable Long l) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = access000 + 61;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(application, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(application, "");
        if (l == null || !onExtraCallbackWithResult(l.longValue()) || deepLink == null || !Intrinsics.areEqual(deepLink.isDeferred(), Boolean.TRUE)) {
            return;
        }
        String deepLinkValue = deepLink.getDeepLinkValue();
        if (deepLinkValue != null) {
            int i3 = getInterfaceDescriptor + 7;
            access000 = i3 % 128;
            if (i3 % 2 == 0) {
                mergeParams.onExtraCallbackWithResult(deepLinkValue);
                throw null;
            }
            if (!mergeParams.onExtraCallbackWithResult(deepLinkValue)) {
                deepLinkValue = null;
            }
            if (deepLinkValue == null) {
                String stringValue = deepLink.getStringValue("af_dp");
                if (stringValue != null) {
                    if (!mergeParams.onExtraCallbackWithResult(stringValue)) {
                        stringValue = null;
                    }
                    deepLinkValue = stringValue;
                } else {
                    deepLinkValue = null;
                }
                if (deepLinkValue == null) {
                    return;
                }
            }
        }
        if (this.onNavigationEvent.compareAndSet(false, true)) {
            int i4 = getInterfaceDescriptor + 39;
            access000 = i4 % 128;
            try {
            } catch (Throwable th) {
                Result.Companion companion = kotlin.Result.Companion;
                obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
            }
            if (i4 % 2 == 0) {
                Result.Companion companion2 = kotlin.Result.Companion;
                kotlin.Result.constructor-impl(AdvertisingIdClient.getAdvertisingIdInfo(application).getId());
                obj.hashCode();
                throw null;
            }
            Result.Companion companion3 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(AdvertisingIdClient.getAdvertisingIdInfo(application).getId());
            String str = (String) (kotlin.Result.onExtraCallback(obj) ^ true ? obj : null);
            if (onExtraCallbackWithResult(l.longValue())) {
                IAuthTabCallback(deepLinkValue, str);
                onNavigationEvent(deepLinkValue);
                int i5 = access000 + 69;
                getInterfaceDescriptor = i5 % 128;
                int i6 = i5 % 2;
            }
        }
    }

    public final AppsFlyerConversionListener onExtraCallbackWithResult(@NotNull Application application) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(application, "");
        IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(application);
        int i2 = getInterfaceDescriptor + 7;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            return iAuthTabCallback;
        }
        throw null;
    }

    private final void IAuthTabCallback(final String str, final String str2) throws Throwable {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "appsflyer_did_resolve_deep_link", false, null, null, null, new Function1() { // from class: im.toss.core.tracker.marketing.impl.appsflyer.AppsFlyerDeepLinkResolver$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 89;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnWarmupCompleted = setAssetUpdatedDate.onWarmupCompleted(str, str2, (SetDetectableSize) obj);
                int i5 = IAuthTabCallback + 3;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return unitOnWarmupCompleted;
            }
        }, 30, null);
        int i2 = access000 + 15;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit onExtraCallback(String str, String str2, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = access000 + 43;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("deeplinkValue", str);
            setDetectableSize.onExtraCallback("isDeferred", Boolean.TRUE);
            throw null;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("deeplinkValue", str);
        setDetectableSize.onExtraCallback("isDeferred", Boolean.TRUE);
        if (str2 != null) {
            int i3 = access000 + 25;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            setDetectableSize.onExtraCallback("ad_id", str2);
        }
        return Unit.INSTANCE;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = access000 + 115;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallback = this.IAuthTabCallbackStub.IAuthTabCallback("deferred_deeplink");
        int i4 = access000 + 5;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return strIAuthTabCallback;
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = access000 + 39;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        if (onExtraCallbackWithResult() == null) {
            return false;
        }
        int i4 = getInterfaceDescriptor + 113;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public final void onNavigationEvent(@NotNull String str) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 85;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.IAuthTabCallbackStub.IAuthTabCallback("deferred_deeplink", str, true);
        this.IAuthTabCallbackDefault.set(true);
        asInterface();
        int i4 = access000 + 37;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 90 / 0;
        }
    }

    public final void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 105;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            this.IAuthTabCallbackStub.onTransact("deferred_deeplink");
            int i3 = 47 / 0;
        } else {
            this.IAuthTabCallbackStub.onTransact("deferred_deeplink");
        }
        int i4 = getInterfaceDescriptor + 85;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        setAssetUpdatedDate setassetupdateddate = (setAssetUpdatedDate) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 103;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            String strIAuthTabCallback = setassetupdateddate.IAuthTabCallbackStub.IAuthTabCallback("af_campaign");
            if (strIAuthTabCallback != null) {
                int i3 = access000 + 31;
                getInterfaceDescriptor = i3 % 128;
                int i4 = i3 % 2;
                if (!StringsKt.isBlank(strIAuthTabCallback)) {
                    int i5 = access000 + 59;
                    getInterfaceDescriptor = i5 % 128;
                    int i6 = i5 % 2;
                    return strIAuthTabCallback;
                }
            }
            return null;
        }
        setassetupdateddate.IAuthTabCallbackStub.IAuthTabCallback("af_campaign");
        obj.hashCode();
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access000 + 123;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallback = this.IAuthTabCallbackStub.IAuthTabCallback("af_adset");
        if (strIAuthTabCallback != null) {
            int i4 = access000 + 45;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            if (!StringsKt.isBlank(strIAuthTabCallback)) {
                return strIAuthTabCallback;
            }
        }
        int i6 = getInterfaceDescriptor + 57;
        access000 = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        setAssetUpdatedDate setassetupdateddate = (setAssetUpdatedDate) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 99;
        access000 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            setassetupdateddate.IAuthTabCallbackStub.onTransact("deferred_deeplink");
            setassetupdateddate.IAuthTabCallbackStub.onTransact("af_adset");
            setassetupdateddate.IAuthTabCallbackStub.onTransact("af_status");
            setassetupdateddate.IAuthTabCallbackStub.onTransact("af_campaign");
            int i3 = getInterfaceDescriptor + 9;
            access000 = i3 % 128;
            if (i3 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        setassetupdateddate.IAuthTabCallbackStub.onTransact("deferred_deeplink");
        setassetupdateddate.IAuthTabCallbackStub.onTransact("af_adset");
        setassetupdateddate.IAuthTabCallbackStub.onTransact("af_status");
        setassetupdateddate.IAuthTabCallbackStub.onTransact("af_campaign");
        throw null;
    }

    private final Long onTransact() {
        int i = 2 % 2;
        if (this.onExtraCallback.IAuthTabCallback(onViewDraw.Marketing) != getIconPaddingTop.Start) {
            return null;
        }
        int i2 = access000 + 67;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Long lValueOf = Long.valueOf(this.onExtraCallback.onWarmupCompleted());
        int i4 = access000 + 23;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return lValueOf;
    }

    private final boolean onExtraCallbackWithResult(long j) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 33;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        if (this.onExtraCallback.IAuthTabCallback(onViewDraw.Marketing) != getIconPaddingTop.Start || this.onExtraCallback.onWarmupCompleted() != j) {
            return false;
        }
        int i4 = access000 + 67;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    private final void IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = access000 + 65;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallbackStubProxy.set(true);
        asInterface();
    }

    public static final /* synthetic */ copyLicense onWarmupCompleted(setAssetUpdatedDate setassetupdateddate) {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return (copyLicense) IAuthTabCallback(916210380, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -916210375, new Object[]{setassetupdateddate}, iOnNavigationEvent2, iOnNavigationEvent);
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    public static final /* synthetic */ AtomicBoolean asInterface(setAssetUpdatedDate setassetupdateddate) {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return (AtomicBoolean) IAuthTabCallback(1966545852, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1966545852, new Object[]{setassetupdateddate}, iOnNavigationEvent2, iOnNavigationEvent);
    }

    private static final void IAuthTabCallback(setAssetUpdatedDate setassetupdateddate, Application application, DeepLinkResult deepLinkResult) {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        IAuthTabCallback(1372764597, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1372764594, new Object[]{setassetupdateddate, application, deepLinkResult}, iOnNavigationEvent2, iOnNavigationEvent);
    }

    public final Object IAuthTabCallback(@NotNull access13800<? super Unit> access13800Var) {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return IAuthTabCallback(-1052632502, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1052632503, new Object[]{this, access13800Var}, iOnNavigationEvent2, iOnNavigationEvent);
    }

    public final String IAuthTabCallback() {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return (String) IAuthTabCallback(333124378, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -333124374, new Object[]{this}, iOnNavigationEvent2, iOnNavigationEvent);
    }

    public final void IAuthTabCallbackStub() {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        IAuthTabCallback(2136714032, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -2136714030, new Object[]{this}, iOnNavigationEvent2, iOnNavigationEvent);
    }
}
