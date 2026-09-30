package o;

import android.content.Context;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import im.toss.ads_sdk.admob.ThumbnailBannerAdMobLoader$;
import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.ads_sdk.remote.model.AdMobFailedReason;
import im.toss.ads_sdk.remote.model.ExposureContent;
import im.toss.features.home.core.local.model.TransactionFilterLocal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import o.getPackageType;
import o.getScaleX;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getScaleX {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    public static final int IAuthTabCallback = 8;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 1;
    private static int asInterface;
    private static int onTransact;
    private getPackageType onExtraCallback;
    private final Context onExtraCallbackWithResult;
    private boolean onNavigationEvent;
    private final findResAndMsg onWarmupCompleted;

    public static final /* synthetic */ class IAuthTabCallback {
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int[] iArr = new int[NativeAdsDto.ThumbnailBannerAdMobRatio.values().length];
            try {
                iArr[NativeAdsDto.ThumbnailBannerAdMobRatio.LANDSCAPE.ordinal()] = 1;
                int i = onWarmupCompleted + 125;
                onNavigationEvent = i % 128;
                if (i % 2 == 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NativeAdsDto.ThumbnailBannerAdMobRatio.PORTRAIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NativeAdsDto.ThumbnailBannerAdMobRatio.SQUARE.ordinal()] = 3;
                int i3 = onWarmupCompleted + 25;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NativeAdsDto.ThumbnailBannerAdMobRatio.ANY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NativeAdsDto.ThumbnailBannerAdMobRatio.UNKNOWN.ordinal()] = 5;
                int i6 = onNavigationEvent + 21;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 2 % 2;
                }
            } catch (NoSuchFieldError unused5) {
            }
            onExtraCallbackWithResult = iArr;
        }
    }

    public interface onWarmupCompleted {
        void IAuthTabCallback();

        void IAuthTabCallback(@NotNull NativeAd nativeAd);

        void onNavigationEvent(@NotNull ExposureContent exposureContent, @NotNull AdMobFailedReason adMobFailedReason, boolean z);

        void onWarmupCompleted(@NotNull NativeAd nativeAd);

        void onWarmupCompleted(@NotNull NativeAd nativeAd, @NotNull ExposureContent exposureContent);

        void onWarmupCompleted(@NotNull String str, boolean z);
    }

    static {
        int i = onTransact + 11;
        asBinder = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) objArr[0];
        NativeAd nativeAd = (NativeAd) objArr[1];
        AdValue adValue = (AdValue) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 65;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onNavigationEvent(new Object[]{onwarmupcompleted, nativeAd, adValue}, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), 80745231, TransactionFilterLocal.Companion.onNavigationEvent(), -80745230);
            return null;
        }
        onNavigationEvent(new Object[]{onwarmupcompleted, nativeAd, adValue}, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), 80745231, TransactionFilterLocal.Companion.onNavigationEvent(), -80745230);
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(getScaleX getscalex, NativeAdsDto.Mediation mediation, int i, NativeAdsDto.AdmobInfo admobInfo, onWarmupCompleted onwarmupcompleted, String str, Ref.ObjectRef objectRef, NativeAd nativeAd) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 29;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallbackWithResult(getscalex, mediation, i, admobInfo, onwarmupcompleted, str, objectRef, nativeAd);
        if (i4 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object onNavigationEvent(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~(i7 | i);
        int i9 = ~i6;
        int i10 = ~i;
        int i11 = i8 | (~(i9 | i10 | i4));
        int i12 = (~(i | i9 | i4)) | (~(i10 | i7));
        int i13 = ~(i7 | i9);
        int i14 = i6 + i4 + i2 + (762713021 * i3) + (1579510587 * i5);
        int i15 = i14 * i14;
        int i16 = ((i6 * (-1846875272)) - 1480523776) + ((-1846875272) * i4) + (i11 * (-1613556599)) + (i12 * (-1613556599)) + ((-1613556599) * i13) + (834535424 * i2) + ((-750387200) * i3) + ((-523632640) * i5) + ((-1971257344) * i15);
        int i17 = ((i6 * (-1364308824)) - 1074288667) + (i4 * (-1364308824)) + (i11 * 659) + (i12 * 659) + (i13 * 659) + (i2 * (-1364308165)) + (i3 * (-893132913)) + (i5 * 986770329) + (i15 * (-1162149888));
        int i18 = i16 + (i17 * i17 * (-1529413632));
        return i18 != 1 ? i18 != 2 ? onExtraCallbackWithResult(objArr) : onExtraCallback(objArr) : onNavigationEvent(objArr);
    }

    public getScaleX(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallbackWithResult = context;
        this.onWarmupCompleted = findRes.onWarmupCompleted(isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null).plus(putChannelInfo.onExtraCallback().onExtraCallback()));
    }

    public static final /* synthetic */ getPackageType IAuthTabCallback(getScaleX getscalex) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 35;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        getPackageType getpackagetype = getscalex.onExtraCallback;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 11;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return getpackagetype;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onExtraCallback(getScaleX getscalex, String str, NativeAdsDto.AdmobInfo admobInfo, NativeAdsDto.Mediation mediation, int i, onWarmupCompleted onwarmupcompleted) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 19;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        getscalex.onExtraCallbackWithResult(str, admobInfo, mediation, i, onwarmupcompleted);
        if (i4 != 0) {
            int i5 = 88 / 0;
        }
        int i6 = IAuthTabCallbackStub + 11;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final /* synthetic */ void onExtraCallback(getScaleX getscalex, onWarmupCompleted onwarmupcompleted, String str) {
        int i = 2 % 2;
        int i2 = asInterface + 79;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        getscalex.onWarmupCompleted(onwarmupcompleted, str);
        int i4 = asInterface + 97;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ boolean onExtraCallback(getScaleX getscalex) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 81;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        boolean z = getscalex.onNavigationEvent;
        int i5 = i2 + 3;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        getScaleX getscalex = (getScaleX) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 45;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        Context context = getscalex.onExtraCallbackWithResult;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 55;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 42 / 0;
        }
        return context;
    }

    public static final /* synthetic */ void onWarmupCompleted(getScaleX getscalex, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 119;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        getscalex.onNavigationEvent = z;
        if (i4 != 0) {
            int i5 = 25 / 0;
        }
        int i6 = i3 + 11;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ onWarmupCompleted $callback;
        final /* synthetic */ long $timeoutMillis;
        int label;
        final /* synthetic */ getScaleX this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(long j, getScaleX getscalex, onWarmupCompleted onwarmupcompleted, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$timeoutMillis = j;
            this.this$0 = getscalex;
            this.$callback = onwarmupcompleted;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 43;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationeventCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                onnavigationeventCreate.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = onnavigationeventCreate.invokeSuspend(unit);
            int i4 = onExtraCallback + 97;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$timeoutMillis, this.this$0, this.$callback, access13800Var);
            int i2 = onExtraCallback + 59;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 7;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 21;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 49;
            onExtraCallback = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 != 0) {
                access14300.onWarmupCompleted();
                obj2.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                long j = this.$timeoutMillis;
                if (j > 0) {
                    this.label = 1;
                    if (formatMsgs.onWarmupCompleted(j, this) == objOnWarmupCompleted) {
                        int i4 = onExtraCallback + 51;
                        onWarmupCompleted = i4 % 128;
                        int i5 = i4 % 2;
                        return objOnWarmupCompleted;
                    }
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = onExtraCallback + 87;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    obj2.hashCode();
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
            }
            if (getScaleX.onExtraCallback(this.this$0)) {
                return Unit.INSTANCE;
            }
            getScaleX.onWarmupCompleted(this.this$0, true);
            this.$callback.IAuthTabCallback();
            return Unit.INSTANCE;
        }
    }

    public final void onExtraCallback(@NotNull String str, @NotNull NativeAdsDto.AdmobInfo admobInfo, @NotNull NativeAdsDto.Mediation mediation, boolean z, @NotNull onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 63;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(admobInfo, "");
        Intrinsics.checkNotNullParameter(mediation, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        IAuthTabCallback();
        this.onNavigationEvent = false;
        if (z) {
            int i4 = asInterface + 9;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                this.onNavigationEvent = true;
                onwarmupcompleted.onWarmupCompleted("FORCED_INLINE_ADMOB_FAILURE", true);
                return;
            } else {
                this.onNavigationEvent = true;
                onwarmupcompleted.onWarmupCompleted("FORCED_INLINE_ADMOB_FAILURE", true);
                return;
            }
        }
        Number numberValueOf = Double.valueOf(admobInfo.asInterface());
        if (numberValueOf.doubleValue() <= 0.0d) {
            int i5 = IAuthTabCallbackStub + 103;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            numberValueOf = null;
        }
        if (numberValueOf == null) {
            numberValueOf = 2000L;
        }
        this.onExtraCallback = maybeUpdateAnimatable.onNavigationEvent(this.onWarmupCompleted, (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(numberValueOf.longValue(), this, onwarmupcompleted, null), 3, (Object) null);
        maybeUpdateAnimatable.onNavigationEvent(this.onWarmupCompleted, (CoroutineContext) null, (setRandomHost) null, new onTransact(str, admobInfo, mediation, onwarmupcompleted, null), 3, (Object) null);
        int i7 = IAuthTabCallbackStub + 79;
        asInterface = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    static final class onTransact extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ NativeAdsDto.AdmobInfo $admobInfo;
        final /* synthetic */ onWarmupCompleted $callback;
        final /* synthetic */ NativeAdsDto.Mediation $mediation;
        final /* synthetic */ String $requestId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onTransact(String str, NativeAdsDto.AdmobInfo admobInfo, NativeAdsDto.Mediation mediation, onWarmupCompleted onwarmupcompleted, access13800<? super onTransact> access13800Var) {
            super(2, access13800Var);
            this.$requestId = str;
            this.$admobInfo = admobInfo;
            this.$mediation = mediation;
            this.$callback = onwarmupcompleted;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onTransact ontransact = getScaleX.this.new onTransact(this.$requestId, this.$admobInfo, this.$mediation, this.$callback, access13800Var);
            int i2 = IAuthTabCallback + 43;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 38 / 0;
            }
            return ontransact;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 3;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                onExtraCallback(findresandmsg, access13800Var);
                throw null;
            }
            Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
            int i3 = onExtraCallbackWithResult + 113;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return objOnExtraCallback;
            }
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 57;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 59;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objOnWarmupCompleted;
            int i = 2 % 2;
            Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                getPivotX getpivotx = getPivotX.onExtraCallback;
                Context applicationContext = ((Context) getScaleX.onNavigationEvent(new Object[]{getScaleX.this}, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -180943533, TransactionFilterLocal.Companion.onNavigationEvent(), 180943533)).getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "");
                this.label = 1;
                objOnWarmupCompleted = getpivotx.onWarmupCompleted(applicationContext, this);
                if (objOnWarmupCompleted == objOnWarmupCompleted2) {
                    int i3 = IAuthTabCallback + 57;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    return objOnWarmupCompleted2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = onExtraCallbackWithResult + 55;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    ((kotlin.Result) obj).onNavigationEvent();
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
                objOnWarmupCompleted = ((kotlin.Result) obj).onNavigationEvent();
            }
            getScaleX getscalex = getScaleX.this;
            onWarmupCompleted onwarmupcompleted = this.$callback;
            Throwable th = kotlin.Result.exceptionOrNull-impl(objOnWarmupCompleted);
            if (th == null) {
                getScaleX.onExtraCallback(getScaleX.this, this.$requestId, this.$admobInfo, this.$mediation, 0, this.$callback);
                return Unit.INSTANCE;
            }
            int i6 = onExtraCallbackWithResult + 117;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            String message = th.getMessage();
            if (message == null) {
                int i8 = onExtraCallbackWithResult + 123;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                message = "MobileAds initialization failed";
            }
            getScaleX.onExtraCallback(getscalex, onwarmupcompleted, message);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001d A[PHI: r1
      0x001d: PHI (r1v5 o.getPackageType) = (r1v4 o.getPackageType), (r1v6 o.getPackageType) binds: [B:8:0x001b, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void IAuthTabCallback() {
        getPackageType getpackagetype;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 37;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 != 0) {
            this.onNavigationEvent = true;
            getpackagetype = this.onExtraCallback;
            if (getpackagetype != null) {
                int i4 = i3 + 79;
                IAuthTabCallbackStub = i4 % 128;
                if (i4 % 2 == 0) {
                    getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 0, (Object) null);
                } else {
                    getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
                }
            }
        } else {
            this.onNavigationEvent = true;
            getpackagetype = this.onExtraCallback;
            if (getpackagetype != null) {
            }
        }
        this.onExtraCallback = null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) objArr[0];
        NativeAd nativeAd = (NativeAd) objArr[1];
        AdValue adValue = (AdValue) objArr[2];
        int i = 2 % 2;
        int i2 = asInterface + 83;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(adValue, "");
        Intrinsics.checkNotNull(nativeAd);
        onwarmupcompleted.onWarmupCompleted(nativeAd, ExposureContent.Companion.IAuthTabCallback(nativeAd, adValue));
        int i4 = IAuthTabCallbackStub + 7;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static final void onExtraCallbackWithResult(getScaleX getscalex, NativeAdsDto.Mediation mediation, int i, NativeAdsDto.AdmobInfo admobInfo, onWarmupCompleted onwarmupcompleted, String str, Ref.ObjectRef objectRef, NativeAd nativeAd) throws Throwable {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(nativeAd, "");
        if (getscalex.onNavigationEvent) {
            nativeAd.destroy();
            return;
        }
        onExtraCallback onExtraCallback = getscalex.onExtraCallback(nativeAd, mediation);
        if (!onExtraCallback.onWarmupCompleted()) {
            getscalex.onNavigationEvent = true;
            getPackageType getpackagetype = getscalex.onExtraCallback;
            if (getpackagetype != null) {
                int i3 = asInterface + 83;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
            }
            objectRef.element = nativeAd;
            nativeAd.setOnPaidEventListener(new ThumbnailBannerAdMobLoader$.ExternalSyntheticLambda0(onwarmupcompleted, nativeAd));
            onwarmupcompleted.IAuthTabCallback(nativeAd);
            return;
        }
        int i5 = asInterface + 21;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        ExposureContent exposureContentOnExtraCallback = ExposureContent.Companion.onExtraCallback(nativeAd);
        AdMobFailedReason.Companion companion = AdMobFailedReason.Companion;
        String strOnExtraCallback = companion.onExtraCallback(nativeAd);
        List listOnExtraCallback = onExtraCallback.onExtraCallback();
        if (listOnExtraCallback.isEmpty()) {
            listOnExtraCallback = null;
        }
        AdMobFailedReason adMobFailedReasonOnExtraCallback = companion.onExtraCallback(strOnExtraCallback, listOnExtraCallback);
        nativeAd.destroy();
        if (i < admobInfo.asBinder()) {
            onwarmupcompleted.onNavigationEvent(exposureContentOnExtraCallback, adMobFailedReasonOnExtraCallback, false);
            getscalex.onExtraCallbackWithResult(str, admobInfo, mediation, i + 1, onwarmupcompleted);
            return;
        }
        getscalex.onNavigationEvent = true;
        getPackageType getpackagetype2 = getscalex.onExtraCallback;
        if (getpackagetype2 != null) {
            int i7 = asInterface + 113;
            IAuthTabCallbackStub = i7 % 128;
            if (i7 % 2 == 0) {
                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype2, (CancellationException) null, 1, (Object) null);
            } else {
                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype2, (CancellationException) null, 1, (Object) null);
            }
        }
        onwarmupcompleted.onNavigationEvent(exposureContentOnExtraCallback, adMobFailedReasonOnExtraCallback, true);
    }

    public static final class asInterface extends AdListener {
        private static int asBinder = 1;
        private static int onTransact;
        final /* synthetic */ String IAuthTabCallback;
        final /* synthetic */ int IAuthTabCallbackDefault;
        final /* synthetic */ getScaleX asInterface;
        final /* synthetic */ NativeAdsDto.Mediation onExtraCallback;
        final /* synthetic */ NativeAdsDto.AdmobInfo onExtraCallbackWithResult;
        final /* synthetic */ onWarmupCompleted onNavigationEvent;
        final /* synthetic */ Ref.ObjectRef<NativeAd> onWarmupCompleted;

        asInterface(Ref.ObjectRef<NativeAd> objectRef, onWarmupCompleted onwarmupcompleted, getScaleX getscalex, int i, NativeAdsDto.AdmobInfo admobInfo, String str, NativeAdsDto.Mediation mediation) {
            this.onWarmupCompleted = objectRef;
            this.onNavigationEvent = onwarmupcompleted;
            this.asInterface = getscalex;
            this.IAuthTabCallbackDefault = i;
            this.onExtraCallbackWithResult = admobInfo;
            this.IAuthTabCallback = str;
            this.onExtraCallback = mediation;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
        
            if ((r1 % 2) == 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
        
            r3.onNavigationEvent.onWarmupCompleted(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        
            if (r1 == null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        
            if (r1 == null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
        
            r1 = o.getScaleX.asInterface.onTransact + 107;
            o.getScaleX.asInterface.asBinder = r1 % 128;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onAdClicked() {
            NativeAd nativeAd;
            int i = 2 % 2;
            int i2 = onTransact + 1;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                nativeAd = (NativeAd) this.onWarmupCompleted.element;
                int i3 = 16 / 0;
            } else {
                nativeAd = (NativeAd) this.onWarmupCompleted.element;
            }
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) throws Throwable {
            int i = 2 % 2;
            int i2 = onTransact + 77;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(loadAdError, "");
            if (getScaleX.onExtraCallback(this.asInterface)) {
                int i4 = asBinder + 93;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            if (this.IAuthTabCallbackDefault < this.onExtraCallbackWithResult.asBinder()) {
                int i6 = onTransact + 3;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
                onWarmupCompleted onwarmupcompleted = this.onNavigationEvent;
                String message = loadAdError.getMessage();
                Intrinsics.checkNotNullExpressionValue(message, "");
                onwarmupcompleted.onWarmupCompleted(message, false);
                getScaleX.onExtraCallback(this.asInterface, this.IAuthTabCallback, this.onExtraCallbackWithResult, this.onExtraCallback, this.IAuthTabCallbackDefault + 1, this.onNavigationEvent);
                return;
            }
            getScaleX.onWarmupCompleted(this.asInterface, true);
            getPackageType getpackagetypeIAuthTabCallback = getScaleX.IAuthTabCallback(this.asInterface);
            if (getpackagetypeIAuthTabCallback != null) {
                int i8 = asBinder + 1;
                onTransact = i8 % 128;
                if (i8 % 2 != 0) {
                    getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetypeIAuthTabCallback, (CancellationException) null, 0, (Object) null);
                } else {
                    getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetypeIAuthTabCallback, (CancellationException) null, 1, (Object) null);
                }
            }
            onWarmupCompleted onwarmupcompleted2 = this.onNavigationEvent;
            String message2 = loadAdError.getMessage();
            Intrinsics.checkNotNullExpressionValue(message2, "");
            onwarmupcompleted2.onWarmupCompleted(message2, true);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallbackWithResult(final String str, final NativeAdsDto.AdmobInfo admobInfo, final NativeAdsDto.Mediation mediation, final int i, final onWarmupCompleted onwarmupcompleted) throws Throwable {
        int i2;
        Object obj;
        String message;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 55;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            if (this.onNavigationEvent) {
                return;
            }
            VideoOptions videoOptionsBuild = new VideoOptions.Builder().setCustomControlsRequested(true).build();
            Intrinsics.checkNotNullExpressionValue(videoOptionsBuild, "");
            NativeAdOptions.Builder videoOptions = new NativeAdOptions.Builder().setVideoOptions(videoOptionsBuild);
            int i5 = IAuthTabCallback.onExtraCallbackWithResult[admobInfo.onTransact().ordinal()];
            if (i5 != 1) {
                i2 = 3;
                if (i5 != 2) {
                    int i6 = asInterface;
                    int i7 = i6 + 11;
                    IAuthTabCallbackStub = i7 % 128;
                    int i8 = i7 % 2;
                    if (i5 == 3) {
                        i2 = 4;
                    } else if (i5 != 4) {
                        int i9 = i6 + 45;
                        IAuthTabCallbackStub = i9 % 128;
                        if (i9 % 2 != 0 ? i5 != 5 : i5 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i2 = 0;
                    } else {
                        i2 = 1;
                    }
                }
            } else {
                i2 = 2;
            }
            NativeAdOptions nativeAdOptionsBuild = videoOptions.setMediaAspectRatio(i2).build();
            Intrinsics.checkNotNullExpressionValue(nativeAdOptionsBuild, "");
            AdRequest adRequestIAuthTabCallback = setStrokeWidth.onExtraCallback.IAuthTabCallback(admobInfo, true);
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            try {
                Result.Companion companion = kotlin.Result.Companion;
                new AdLoader.Builder(this.onExtraCallbackWithResult.getApplicationContext(), admobInfo.onNavigationEvent()).forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: im.toss.ads_sdk.admob.ThumbnailBannerAdMobLoader$$ExternalSyntheticLambda1
                    private static int IAuthTabCallback = 1;
                    private static int onWarmupCompleted;

                    public final void onNativeAdLoaded(NativeAd nativeAd) throws Throwable {
                        int i10 = 2 % 2;
                        int i11 = onWarmupCompleted + 7;
                        IAuthTabCallback = i11 % 128;
                        if (i11 % 2 != 0) {
                            getScaleX.onExtraCallback(this.f$0, mediation, i, admobInfo, onwarmupcompleted, str, objectRef, nativeAd);
                            return;
                        }
                        getScaleX.onExtraCallback(this.f$0, mediation, i, admobInfo, onwarmupcompleted, str, objectRef, nativeAd);
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                }).withAdListener(new asInterface(objectRef, onwarmupcompleted, this, i, admobInfo, str, mediation)).withNativeAdOptions(nativeAdOptionsBuild).build().loadAd(adRequestIAuthTabCallback);
                obj = kotlin.Result.constructor-impl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = kotlin.Result.Companion;
                obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
            }
            Throwable th2 = kotlin.Result.exceptionOrNull-impl(obj);
            if (th2 != null) {
                int i10 = asInterface + 93;
                IAuthTabCallbackStub = i10 % 128;
                if (i10 % 2 == 0) {
                    message = th2.getMessage();
                    int i11 = 10 / 0;
                    if (message == null) {
                        message = "AdMob load failed";
                    }
                } else {
                    message = th2.getMessage();
                    if (message == null) {
                    }
                }
                onWarmupCompleted(onwarmupcompleted, message);
                return;
            }
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private final void onWarmupCompleted(onWarmupCompleted onwarmupcompleted, String str) {
        int i = 2 % 2;
        if (this.onNavigationEvent) {
            int i2 = IAuthTabCallbackStub + 5;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 66 / 0;
                return;
            }
            return;
        }
        this.onNavigationEvent = true;
        getPackageType getpackagetype = this.onExtraCallback;
        if (getpackagetype != null) {
            int i4 = asInterface + 15;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
        }
        onwarmupcompleted.onWarmupCompleted(str, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final onExtraCallback onExtraCallback(NativeAd nativeAd, NativeAdsDto.Mediation mediation) {
        String headline;
        boolean z;
        int i = 2 % 2;
        int i2 = asInterface + 105;
        IAuthTabCallbackStub = i2 % 128;
        String str = "";
        if (i2 % 2 == 0) {
            headline = nativeAd.getHeadline();
            int i3 = 89 / 0;
            if (headline == null) {
                headline = "";
            }
        } else {
            headline = nativeAd.getHeadline();
            if (headline == null) {
            }
        }
        String body = nativeAd.getBody();
        if (body != null) {
            int i4 = asInterface + 25;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 95 / 0;
            }
            str = body;
        }
        String str2 = headline + str;
        MediaContent mediaContent = nativeAd.getMediaContent();
        if ((mediaContent != null ? mediaContent.getAspectRatio() : 0.0f) < 1.0f) {
            int i6 = IAuthTabCallbackStub + 35;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            int i8 = IAuthTabCallbackStub + 117;
            asInterface = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 4 / 4;
            }
            z = false;
        }
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        if (mediation.onTransact().contains("NO_KOREAN_FILTER") && !onNavigationEvent(str2)) {
            listCreateListBuilder.add("NO_KOREAN_FILTER");
        }
        if (mediation.onTransact().contains("BANNED_KEYWORDS")) {
            List<String> listAsBinder = mediation.asBinder();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listAsBinder.iterator();
            while (!(!it.hasNext())) {
                Object next = it.next();
                String str3 = (String) next;
                if (!StringsKt.isBlank(str3) && StringsKt.contains(str2, str3, true)) {
                    int i10 = IAuthTabCallbackStub + 73;
                    asInterface = i10 % 128;
                    if (i10 % 2 != 0) {
                        arrayList.add(next);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    arrayList.add(next);
                }
            }
            if (!arrayList.isEmpty()) {
                listCreateListBuilder.add("BANNED_KEYWORDS");
            }
        }
        List listBuild = CollectionsKt.build(listCreateListBuilder);
        return new onExtraCallback(z || !listBuild.isEmpty(), CollectionsKt.distinct(listBuild));
    }

    private final boolean onNavigationEvent(String str) {
        int i = 2 % 2;
        boolean zOnExtraCallback = new Regex("[\\uAC00-\\uD7A3]").onExtraCallback(str);
        int i2 = IAuthTabCallbackStub + 57;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return zOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    public static final /* synthetic */ Context onWarmupCompleted(getScaleX getscalex) {
        return (Context) onNavigationEvent(new Object[]{getscalex}, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -180943533, TransactionFilterLocal.Companion.onNavigationEvent(), 180943533);
    }

    private static final void onWarmupCompleted(onWarmupCompleted onwarmupcompleted, NativeAd nativeAd, AdValue adValue) {
        onNavigationEvent(new Object[]{onwarmupcompleted, nativeAd, adValue}, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), 80745231, TransactionFilterLocal.Companion.onNavigationEvent(), -80745230);
    }
}
