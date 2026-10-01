package o;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.observability.instrumentation.rn.RnCause;
import im.toss.rn.toss.core.bundle.model.RemoteBundleResult;
import im.toss.rn.toss.core.bundle.preload.AirlineBundlePreloader$;
import im.toss.rn.toss.core.bundle.source.RemoteBundleSource;
import im.toss.rn.toss.core.common.airline.AirlineBundleNamesResponse;
import im.toss.rn.toss.core.observability.RnPhaseObserver;
import im.toss.securities.core.router.spec.TossSecRoute;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.hExternalSyntheticLambda4;
import org.jetbrains.annotations.NotNull;

@Singleton
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setExpirationListener {
    private final RnPhaseObserver onExtraCallback;
    private final RemoteBundleSource onExtraCallbackWithResult;
    private final r8lambda77QfHZwh7Dbw9oSh2DYiQTXjabs onNavigationEvent;
    private final r8lambdaHDAe14RP_YfkbgNStt68qt10Iow onWarmupCompleted;
    private static final byte[] $$a = {84, 79, 22, 41};
    private static final int $$b = 235;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int asBinder = 1;
    private static char[] IAuthTabCallback = {60855, 16734, 46188, 60190};
    private static long asInterface = 4328315324662300977L;

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$12;
        Object L$13;
        Object L$14;
        Object L$15;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 79;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object obj2 = null;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            setExpirationListener setexpirationlistener = setExpirationListener.this;
            if (i3 == 0) {
                return setexpirationlistener.onExtraCallback(null, this);
            }
            setexpirationlistener.onExtraCallback(null, this);
            obj2.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, short s) {
        int i2;
        int i3 = 97 - (i * 3);
        int i4 = b + 4;
        byte[] bArr = $$a;
        int i5 = s * 2;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        if (bArr == null) {
            int i7 = i3;
            int i8 = 0;
            int i9 = i4;
            int i10 = i4 + i7;
            i2 = i8;
            int i11 = i9;
            i3 = i10;
            i4 = i11;
            bArr2[i2] = (byte) i3;
            int i12 = i4 + 1;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            int i13 = i3;
            i9 = i12;
            i4 = bArr[i12];
            i8 = i2 + 1;
            i7 = i13;
            int i102 = i4 + i7;
            i2 = i8;
            int i112 = i9;
            i3 = i102;
            i4 = i112;
            bArr2[i2] = (byte) i3;
            int i122 = i4 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            int i1222 = i4 + 1;
            if (i2 == i6) {
            }
        }
    }

    public static /* synthetic */ r8lambda4jipudH4a44aIGrlvbWbk0rzTp4 onExtraCallbackWithResult(String str, RemoteBundleResult remoteBundleResult) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = asBinder + 5;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        r8lambda4jipudH4a44aIGrlvbWbk0rzTp4 r8lambda4jipudh4a44aigrlvbwbk0rztp4IAuthTabCallback = IAuthTabCallback(str, remoteBundleResult);
        if (i3 != 0) {
            int i4 = 6 / 0;
        }
        return r8lambda4jipudh4a44aigrlvbwbk0rztp4IAuthTabCallback;
    }

    @Inject
    public setExpirationListener(@NotNull r8lambda77QfHZwh7Dbw9oSh2DYiQTXjabs r8lambda77qfhzwh7dbw9osh2dyiqtxjabs, @NotNull RemoteBundleSource remoteBundleSource, @NotNull r8lambdaHDAe14RP_YfkbgNStt68qt10Iow r8lambdahdae14rp_yfkbgnstt68qt10iow, @NotNull RnPhaseObserver rnPhaseObserver) {
        Intrinsics.checkNotNullParameter(r8lambda77qfhzwh7dbw9osh2dyiqtxjabs, "");
        Intrinsics.checkNotNullParameter(remoteBundleSource, "");
        Intrinsics.checkNotNullParameter(r8lambdahdae14rp_yfkbgnstt68qt10iow, "");
        Intrinsics.checkNotNullParameter(rnPhaseObserver, "");
        this.onNavigationEvent = r8lambda77qfhzwh7dbw9osh2dyiqtxjabs;
        this.onExtraCallbackWithResult = remoteBundleSource;
        this.onWarmupCompleted = r8lambdahdae14rp_yfkbgnstt68qt10iow;
        this.onExtraCallback = rnPhaseObserver;
    }

    public static final /* synthetic */ r8lambda77QfHZwh7Dbw9oSh2DYiQTXjabs onExtraCallback(setExpirationListener setexpirationlistener) {
        int i = 2 % 2;
        int i2 = asBinder + 7;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        r8lambda77QfHZwh7Dbw9oSh2DYiQTXjabs r8lambda77qfhzwh7dbw9osh2dyiqtxjabs = setexpirationlistener.onNavigationEvent;
        if (i4 != 0) {
            int i5 = 50 / 0;
        }
        int i6 = i3 + 73;
        asBinder = i6 % 128;
        if (i6 % 2 != 0) {
            return r8lambda77qfhzwh7dbw9osh2dyiqtxjabs;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ RemoteBundleSource onNavigationEvent(setExpirationListener setexpirationlistener) {
        int i = 2 % 2;
        int i2 = asBinder + 3;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        RemoteBundleSource remoteBundleSource = setexpirationlistener.onExtraCallbackWithResult;
        int i5 = i3 + 113;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return remoteBundleSource;
    }

    private static final r8lambda4jipudH4a44aIGrlvbWbk0rzTp4 IAuthTabCallback(String str, RemoteBundleResult remoteBundleResult) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onTransact + 83;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(remoteBundleResult, "");
        r8lambda4jipudH4a44aIGrlvbWbk0rzTp4 r8lambda4jipudh4a44aigrlvbwbk0rztp4OnNavigationEvent = MaxNativeAdLoaderImplc.onNavigationEvent(remoteBundleResult, str);
        int i4 = onTransact + 57;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return r8lambda4jipudh4a44aigrlvbwbk0rztp4OnNavigationEvent;
        }
        throw null;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function1<access13800<? super RemoteBundleResult>, Object> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ String $bundleName;
        final /* synthetic */ String $bundleURL;
        final /* synthetic */ String $company;
        final /* synthetic */ String $regionCode;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(String str, String str2, String str3, String str4, access13800<? super onNavigationEvent> access13800Var) {
            super(1, access13800Var);
            this.$bundleName = str;
            this.$bundleURL = str2;
            this.$regionCode = str3;
            this.$company = str4;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = setExpirationListener.this.new onNavigationEvent(this.$bundleName, this.$bundleURL, this.$regionCode, this.$company, access13800Var);
            int i2 = onExtraCallback + 33;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 69;
            onExtraCallbackWithResult = i2 % 128;
            access13800<? super RemoteBundleResult> access13800Var = (access13800) obj;
            if (i2 % 2 == 0) {
                return onNavigationEvent(access13800Var);
            }
            onNavigationEvent(access13800Var);
            throw null;
        }

        public final Object onNavigationEvent(access13800<? super RemoteBundleResult> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 105;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 == 0) {
                int i4 = 19 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onExtraCallbackWithResult + 31;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0 ? i2 != 1 : i2 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return obj;
            }
            ResultKt.onNavigationEvent(obj);
            RemoteBundleSource remoteBundleSourceOnNavigationEvent = setExpirationListener.onNavigationEvent(setExpirationListener.this);
            String str = this.$bundleName;
            String str2 = this.$bundleURL;
            String str3 = this.$regionCode;
            String str4 = this.$company;
            this.label = 1;
            Object objIAuthTabCallback = RemoteBundleSource.IAuthTabCallback(remoteBundleSourceOnNavigationEvent, str, str2, str3, str4, false, null, null, this, 112, null);
            if (objIAuthTabCallback != objOnWarmupCompleted) {
                return objIAuthTabCallback;
            }
            int i4 = onExtraCallback + 19;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnWarmupCompleted;
            }
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        long j;
        Throwable cause;
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i4 = $11 + 5;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (true) {
            j = 0;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                break;
            }
            int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(IAuthTabCallback[i + i6])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 17 - TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(asInterface), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getCapsMode("", 0, 0) + 46134), 32 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 20219 - ExpandableListView.getPackedPositionChild(0L), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0) + 49124), 44 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.getCapsMode("", 0, 0) + 1494, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i7 = $10 + 47;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback4 == null) {
                    byte b3 = (byte) (-1);
                    byte b4 = (byte) (b3 + 1);
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 44 - (Process.myTid() >> 22), View.MeasureSpec.getSize(0) + 1494, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                throw null;
            }
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            try {
                Object[] objArr6 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback5 == null) {
                    byte b5 = (byte) (-1);
                    byte b6 = (byte) (b5 + 1);
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) + 49122), 44 - Gravity.getAbsoluteGravity(0, 0), 1494 - Drawable.resolveOpacity(0, 0), -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
                j = 0;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0276, code lost:
    
        if (r5.element >= ((java.lang.Integer) o.DERSet.onExtraCallback(-1496294799, new java.lang.Object[]{o.DERSet.onExtraCallback}, 1496294829, o.getKekid.onExtraCallback(), o.getKekid.onExtraCallback(), o.getKekid.onExtraCallback(), o.getKekid.onExtraCallback())).intValue()) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x039e, code lost:
    
        r1 = r36;
        r2 = r9;
        r8 = r12;
        r17 = r15;
        r12 = r4;
        r15 = r5;
        r9 = r6;
        r6 = r11;
        r5 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:64:0x0207, B:67:0x0243], limit reached: 91 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03b1  */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v45, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v24, types: [java.lang.Iterable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x031a -> B:74:0x0329). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onExtraCallback(@NotNull getPricingPhaseList getpricingphaselist, @NotNull access13800<? super Unit> access13800Var) throws Throwable {
        onExtraCallbackWithResult onextracallbackwithresult;
        Object obj;
        Ref.IntRef intRef;
        List list;
        Iterator it;
        getPricingPhaseList getpricingphaselist2;
        boolean z;
        Ref.IntRef intRef2;
        ArrayList arrayList;
        ArrayList arrayList2;
        Ref.IntRef intRef3;
        onExtraCallbackWithResult onextracallbackwithresult2;
        int i;
        List list2;
        Ref.IntRef intRef4;
        String str;
        String str2;
        ArrayList arrayList3;
        Object obj2;
        String str3;
        int i2;
        Iterator it2;
        boolean z2;
        int i3;
        setExpirationListener setexpirationlistener = this;
        getPricingPhaseList getpricingphaselist3 = getpricingphaselist;
        int i4 = 2 % 2;
        if (!(access13800Var instanceof onExtraCallbackWithResult)) {
            onextracallbackwithresult = setexpirationlistener.new onExtraCallbackWithResult(access13800Var);
        } else {
            onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
            int i5 = onextracallbackwithresult.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                int i6 = asBinder + 53;
                onTransact = i6 % 128;
                if (i6 % 2 != 0) {
                    onextracallbackwithresult.label = i5 / Integer.MIN_VALUE;
                } else {
                    onextracallbackwithresult.label = i5 - 2147483648;
                }
            }
        }
        Object objOnExtraCallback = onextracallbackwithresult.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i7 = onextracallbackwithresult.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(e2));
        } catch (WebResourceResponseModel e3) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(e3));
            int i8 = asBinder + 119;
            onTransact = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 4 / 2;
            }
        }
        if (i7 != 0) {
            int i10 = asBinder;
            int i11 = i10 + 89;
            onTransact = i11 % 128;
            int i12 = i11 % 2;
            if (i7 != 1) {
                int i13 = i10 + 71;
                onTransact = i13 % 128;
                if (i13 % 2 == 0 ? i7 != 2 : i7 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i14 = onextracallbackwithresult.I$0;
                String str4 = (String) onextracallbackwithresult.L$14;
                Iterator it3 = (Iterator) onextracallbackwithresult.L$12;
                ?? r5 = (Iterable) onextracallbackwithresult.L$11;
                String str5 = (String) onextracallbackwithresult.L$10;
                String str6 = (String) onextracallbackwithresult.L$9;
                ?? r13 = (List) onextracallbackwithresult.L$8;
                ?? r14 = (List) onextracallbackwithresult.L$7;
                Ref.IntRef intRef5 = (Ref.IntRef) onextracallbackwithresult.L$6;
                Ref.IntRef intRef6 = (Ref.IntRef) onextracallbackwithresult.L$5;
                Ref.IntRef intRef7 = (Ref.IntRef) onextracallbackwithresult.L$4;
                Ref.IntRef intRef8 = (Ref.IntRef) onextracallbackwithresult.L$3;
                ?? r1 = (List) onextracallbackwithresult.L$2;
                List list3 = (List) onextracallbackwithresult.L$1;
                getPricingPhaseList getpricingphaselist4 = (getPricingPhaseList) onextracallbackwithresult.L$0;
                ResultKt.onNavigationEvent(objOnExtraCallback);
                List list4 = r5;
                ArrayList arrayList4 = r13;
                int i15 = i14;
                String str7 = str6;
                String str8 = str5;
                Object obj3 = objOnWarmupCompleted;
                Ref.IntRef intRef9 = intRef5;
                Ref.IntRef intRef10 = intRef8;
                list2 = list3;
                getpricingphaselist2 = getpricingphaselist4;
                ArrayList arrayList5 = r1;
                ArrayList arrayList6 = r14;
                RemoteBundleResult remoteBundleResult = (RemoteBundleResult) objOnExtraCallback;
                onExtraCallbackWithResult onextracallbackwithresult3 = onextracallbackwithresult;
                if (remoteBundleResult instanceof RemoteBundleResult.Success) {
                    it2 = it3;
                    i2 = i15;
                    if (!(remoteBundleResult instanceof RemoteBundleResult.Error)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i16 = onTransact + 109;
                    asBinder = i16 % 128;
                    if (i16 % 2 == 0) {
                        z2 = true;
                        i3 = intRef6.element >> 1;
                    } else {
                        z2 = true;
                        i3 = intRef6.element + 1;
                    }
                    intRef6.element = i3;
                    arrayList5.add(str4);
                    Unit unit = Unit.INSTANCE;
                } else {
                    RemoteBundleResult.Success success = (RemoteBundleResult.Success) remoteBundleResult;
                    it2 = it3;
                    if (success.onExtraCallbackWithResult() == 304) {
                        intRef7.element++;
                        int i17 = i15;
                        z2 = true;
                        i2 = i17;
                    } else {
                        intRef10.element++;
                        i2 = i15;
                        int iOnExtraCallback = (int) success.onExtraCallback();
                        intRef9.element += iOnExtraCallback / 1024;
                        arrayList6.add(access14000.onNavigationEvent(iOnExtraCallback));
                        arrayList4.add(str4);
                        z2 = true;
                    }
                }
                arrayList3 = arrayList5;
                arrayList2 = arrayList4;
                intRef2 = intRef9;
                arrayList = arrayList6;
                list = list4;
                onExtraCallbackWithResult onextracallbackwithresult4 = onextracallbackwithresult3;
                String str9 = str7;
                str2 = str8;
                str = str9;
                objOnWarmupCompleted = obj3;
                intRef = intRef7;
                intRef4 = intRef6;
                i = i2;
                z = z2;
                onextracallbackwithresult2 = onextracallbackwithresult4;
                intRef3 = intRef10;
                it = it2;
                setexpirationlistener = this;
                ArrayList arrayList7 = arrayList2;
                if ((!it.hasNext()) == z) {
                    int i18 = asBinder + 123;
                    onTransact = i18 % 128;
                    if (i18 % 2 != 0) {
                        Object next = it.next();
                        obj2 = next;
                        str3 = (String) next;
                        int i19 = 98 / 0;
                        if (intRef3.element >= ((Integer) DERSet.onExtraCallback(-1496294799, new Object[]{DERSet.onExtraCallback}, 1496294829, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback())).intValue()) {
                            arrayList2 = arrayList7;
                            i2 = i;
                            onextracallbackwithresult4 = onextracallbackwithresult2;
                            it2 = it;
                            intRef6 = intRef4;
                            intRef10 = intRef3;
                            intRef7 = intRef;
                            obj3 = objOnWarmupCompleted;
                            z2 = true;
                            objOnWarmupCompleted = obj3;
                            intRef = intRef7;
                            intRef4 = intRef6;
                            i = i2;
                            z = z2;
                            onextracallbackwithresult2 = onextracallbackwithresult4;
                            intRef3 = intRef10;
                            it = it2;
                            setexpirationlistener = this;
                            ArrayList arrayList72 = arrayList2;
                            if ((!it.hasNext()) == z) {
                                getControlState.onWarmupCompleted(arrayList72, arrayList3, intRef3.element, intRef.element, intRef4.element, intRef2.element, arrayList);
                                return Unit.INSTANCE;
                            }
                        }
                        String str10 = str3;
                        String strIAuthTabCallback = setexpirationlistener.IAuthTabCallback(str10, str, str2);
                        Object obj4 = objOnWarmupCompleted;
                        RnPhaseObserver rnPhaseObserver = setexpirationlistener.onExtraCallback;
                        RnCause rnCause = RnCause.AIRLINE;
                        AirlineBundlePreloader$.ExternalSyntheticLambda0 externalSyntheticLambda0 = new AirlineBundlePreloader$.ExternalSyntheticLambda0(strIAuthTabCallback);
                        arrayList4 = arrayList72;
                        intRef9 = intRef2;
                        int i20 = i;
                        Ref.IntRef intRef11 = intRef4;
                        Iterator it4 = it;
                        intRef10 = intRef3;
                        list4 = list;
                        Ref.IntRef intRef12 = intRef;
                        String str11 = str2;
                        String str12 = str2;
                        str7 = str;
                        onNavigationEvent onnavigationevent = new onNavigationEvent(str10, strIAuthTabCallback, str, str11, null);
                        onextracallbackwithresult2.L$0 = access15400.onNavigationEvent(getpricingphaselist2);
                        onextracallbackwithresult2.L$1 = access15400.onNavigationEvent(list2);
                        onextracallbackwithresult2.L$2 = arrayList3;
                        onextracallbackwithresult2.L$3 = intRef10;
                        onextracallbackwithresult2.L$4 = intRef12;
                        onextracallbackwithresult2.L$5 = intRef11;
                        onextracallbackwithresult2.L$6 = intRef9;
                        ArrayList arrayList8 = arrayList;
                        onextracallbackwithresult2.L$7 = arrayList8;
                        onextracallbackwithresult2.L$8 = arrayList4;
                        onextracallbackwithresult2.L$9 = str7;
                        onextracallbackwithresult2.L$10 = str12;
                        onextracallbackwithresult2.L$11 = access15400.onNavigationEvent(list4);
                        onextracallbackwithresult2.L$12 = it4;
                        onextracallbackwithresult2.L$13 = access15400.onNavigationEvent(obj2);
                        onextracallbackwithresult2.L$14 = str10;
                        onextracallbackwithresult2.L$15 = access15400.onNavigationEvent(strIAuthTabCallback);
                        i15 = i20;
                        onextracallbackwithresult2.I$0 = i15;
                        onextracallbackwithresult2.I$1 = 0;
                        onextracallbackwithresult2.label = 2;
                        Object objIAuthTabCallback = rnPhaseObserver.IAuthTabCallback(str10, str7, str12, rnCause, (Function1) externalSyntheticLambda0, (Function1) onnavigationevent, (access13800) onextracallbackwithresult2);
                        obj3 = obj4;
                        if (objIAuthTabCallback == obj3) {
                            return obj3;
                        }
                        arrayList5 = arrayList3;
                        objOnExtraCallback = objIAuthTabCallback;
                        str8 = str12;
                        onextracallbackwithresult = onextracallbackwithresult2;
                        intRef6 = intRef11;
                        intRef7 = intRef12;
                        arrayList6 = arrayList8;
                        it3 = it4;
                        str4 = str10;
                        RemoteBundleResult remoteBundleResult2 = (RemoteBundleResult) objOnExtraCallback;
                        onExtraCallbackWithResult onextracallbackwithresult32 = onextracallbackwithresult;
                        if (remoteBundleResult2 instanceof RemoteBundleResult.Success) {
                        }
                        arrayList3 = arrayList5;
                        arrayList2 = arrayList4;
                        intRef2 = intRef9;
                        arrayList = arrayList6;
                        list = list4;
                        onExtraCallbackWithResult onextracallbackwithresult42 = onextracallbackwithresult32;
                        String str92 = str7;
                        str2 = str8;
                        str = str92;
                        objOnWarmupCompleted = obj3;
                        intRef = intRef7;
                        intRef4 = intRef6;
                        i = i2;
                        z = z2;
                        onextracallbackwithresult2 = onextracallbackwithresult42;
                        intRef3 = intRef10;
                        it = it2;
                        setexpirationlistener = this;
                        ArrayList arrayList722 = arrayList2;
                        if ((!it.hasNext()) == z) {
                        }
                    } else {
                        Object next2 = it.next();
                        obj2 = next2;
                        str3 = (String) next2;
                    }
                }
            } else {
                getpricingphaselist3 = (getPricingPhaseList) onextracallbackwithresult.L$0;
                ResultKt.onNavigationEvent(objOnExtraCallback);
            }
        } else {
            ResultKt.onNavigationEvent(objOnExtraCallback);
            if (((Integer) DERSet.onExtraCallback(-1496294799, new Object[]{DERSet.onExtraCallback}, 1496294829, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback())).intValue() <= 0) {
                int i21 = asBinder + 1;
                onTransact = i21 % 128;
                if (i21 % 2 == 0) {
                    return Unit.INSTANCE;
                }
                Unit unit2 = Unit.INSTANCE;
                throw null;
            }
            if (!AdControlButton.Companion.onNavigationEvent(getpricingphaselist3).isAirlineEnabled()) {
                int i22 = onTransact + 55;
                asBinder = i22 % 128;
                int i23 = i22 % 2;
                return Unit.INSTANCE;
            }
            Result.Companion companion3 = Result.Companion;
            r8lambda77QfHZwh7Dbw9oSh2DYiQTXjabs r8lambda77qfhzwh7dbw9osh2dyiqtxjabsOnExtraCallback = onExtraCallback(this);
            onextracallbackwithresult.L$0 = getpricingphaselist3;
            onextracallbackwithresult.L$1 = access15400.onNavigationEvent(onextracallbackwithresult);
            onextracallbackwithresult.I$0 = 0;
            onextracallbackwithresult.I$1 = 0;
            onextracallbackwithresult.label = 1;
            objOnExtraCallback = r8lambda77qfhzwh7dbw9osh2dyiqtxjabsOnExtraCallback.onExtraCallback(onextracallbackwithresult);
            if (objOnExtraCallback == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        }
        obj = Result.constructor-impl(((AirlineBundleNamesResponse) objOnExtraCallback).IAuthTabCallback());
        List listEmptyList = (List) (Result.onExtraCallback(obj) ? null : obj);
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        ArrayList arrayList9 = new ArrayList();
        Ref.IntRef intRef13 = new Ref.IntRef();
        intRef = new Ref.IntRef();
        Ref.IntRef intRef14 = new Ref.IntRef();
        Ref.IntRef intRef15 = new Ref.IntRef();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        getControlState.IAuthTabCallback(listEmptyList);
        String code = getpricingphaselist3.getCode();
        list = listEmptyList;
        it = list.iterator();
        getpricingphaselist2 = getpricingphaselist3;
        onExtraCallbackWithResult onextracallbackwithresult5 = onextracallbackwithresult;
        z = true;
        Object[] objArr = new Object[1];
        a((-1) - TextUtils.indexOf((CharSequence) "", '0', 0), (ViewConfiguration.getEdgeSlop() >> 16) + 4, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr);
        String strIntern = ((String) objArr[0]).intern();
        intRef2 = intRef15;
        arrayList = arrayList10;
        arrayList2 = arrayList11;
        intRef3 = intRef13;
        onextracallbackwithresult2 = onextracallbackwithresult5;
        i = 0;
        list2 = listEmptyList;
        intRef4 = intRef14;
        str = code;
        str2 = strIntern;
        arrayList3 = arrayList9;
        ArrayList arrayList7222 = arrayList2;
        if ((!it.hasNext()) == z) {
        }
    }

    private final String IAuthTabCallback(String str, String str2, String str3) {
        int i = 2 % 2;
        hExternalSyntheticLambda4.onExtraCallback onextracallback = hExternalSyntheticLambda4.Companion;
        String lowerCase = str2.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        String str4 = onextracallback.IAuthTabCallback(lowerCase, str3).getBundleBaseUrl() + str + TossSecRoute.Main.PATH + this.onWarmupCompleted.onWarmupCompleted() + "/rn84";
        int i2 = asBinder + 103;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return str4;
    }
}
