package o;

import android.content.Context;
import com.google.android.gms.internal.ads.zzgc;
import im.toss.ads_sdk.log.TrackingLogRecord;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import o._string;
import o.adInfo;
import o.getPackageType;
import o.performDrag;
import org.jetbrains.annotations.NotNull;

@Singleton
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class performDrag {
    private static int IAuthTabCallbackStubProxy = 0;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access100 = 1;
    private static int readTypedObject = 1;
    private final Lazy IAuthTabCallback;
    private final wie2 IAuthTabCallbackDefault;
    private final AtomicBoolean IAuthTabCallbackStub;
    private getPackageType access000;
    private final jni_YGNodeStyleGetFlexBasisJNI asBinder;
    private boolean asInterface;
    private final jni_YGNodeStyleGetFlexBasisJNI getInterfaceDescriptor;
    private final List<TrackingLogRecord> onExtraCallback;
    private final Map<String, IAuthTabCallback> onExtraCallbackWithResult;
    private final findResAndMsg onTransact;
    private final Context onWarmupCompleted;
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    public static final int onNavigationEvent = 8;

    static final class IAuthTabCallbackDefault extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallbackDefault(access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 29;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnNavigationEvent = performDrag.onNavigationEvent(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{performDrag.this, null, null, 0, this}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 896653985, -896653985, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent());
            int i4 = onExtraCallback + 91;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }
    }

    static final class IAuthTabCallbackStub extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallbackStub(access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 23;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            performDrag performdrag = performDrag.this;
            if (i3 == 0) {
                return performdrag.onExtraCallbackWithResult((access13800<? super Boolean>) this);
            }
            performdrag.onExtraCallbackWithResult((access13800<? super Boolean>) this);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    static final class IAuthTabCallback_Parcel extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        int I$0;
        long J$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback_Parcel(access13800<? super IAuthTabCallback_Parcel> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 7;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallback = performDrag.this.onExtraCallback(0L, (access13800<? super List<TrackingLogRecord>>) this);
            int i4 = onWarmupCompleted + 27;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }
    }

    static final class asBinder extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        asBinder(access13800<? super asBinder> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 49;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallback = performDrag.this.onExtraCallback(null, null, this);
            if (i3 == 0) {
                int i4 = 3 / 0;
            }
            int i5 = onWarmupCompleted + 3;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return objOnExtraCallback;
            }
            throw null;
        }
    }

    static final class onExtraCallback extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 81;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnNavigationEvent = performDrag.this.onNavigationEvent(null, this);
            int i4 = onExtraCallback + 95;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }
    }

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 109;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            performDrag performdrag = performDrag.this;
            if (i3 != 0) {
                return performDrag.IAuthTabCallback(performdrag, (access13800) this);
            }
            performDrag.IAuthTabCallback(performdrag, (access13800) this);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    static final class onNavigationEvent extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 47;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnNavigationEvent = performDrag.onNavigationEvent(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{performDrag.this, null, this}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -652248046, 652248050, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent());
            int i4 = IAuthTabCallback + 87;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }
    }

    static final class onTransact extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        onTransact(access13800<? super onTransact> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 79;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnWarmupCompleted = performDrag.this.onWarmupCompleted((Set<String>) null, (access13800<? super Unit>) this);
            int i4 = onNavigationEvent + 17;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }
    }

    static {
        int i = IAuthTabCallbackStubProxy + 35;
        readTypedObject = i % 128;
        if (i % 2 == 0) {
            int i2 = 78 / 0;
        }
    }

    public static /* synthetic */ boolean IAuthTabCallback(Set set, TrackingLogRecord trackingLogRecord) {
        int i = 2 % 2;
        int i2 = access100 + 17;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(set, trackingLogRecord);
        }
        onExtraCallback(set, trackingLogRecord);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        long jLongValue = ((Number) objArr[0]).longValue();
        Map.Entry entry = (Map.Entry) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 25;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(jLongValue, entry);
        int i4 = IAuthTabCallback_Parcel + 85;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return Boolean.valueOf(zOnExtraCallbackWithResult);
        }
        int i5 = 40 / 0;
        return Boolean.valueOf(zOnExtraCallbackWithResult);
    }

    public static /* synthetic */ File onExtraCallbackWithResult(performDrag performdrag) {
        int i = 2 % 2;
        int i2 = access100 + 73;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent3 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        File file = (File) onNavigationEvent(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{performdrag}, iOnNavigationEvent, 177541085, -177541083, iOnNavigationEvent3, iOnNavigationEvent2);
        int i4 = access100 + 97;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return file;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i4 | i3 | i2;
        int i8 = (~((~i2) | i3)) | i4;
        int i9 = ~((~i4) | i3);
        int i10 = i4 + i3 + i6 + (1132004924 * i5) + ((-2047965933) * i);
        int i11 = i10 * i10;
        int i12 = ((1650805025 * i4) - 289800192) + ((-1513965855) * i3) + ((-565098208) * i7) + (i8 * 565098208) + (565098208 * i9) + ((-2079064064) * i6) + (1823473664 * i5) + (830210048 * i) + ((-1143341056) * i11);
        int i13 = ((i4 * (-767560105)) - 1188649921) + (i3 * (-767559017)) + (i7 * (-544)) + (i8 * 544) + (i9 * 544) + (i6 * (-767559561)) + (i5 * 1544553956) + (i * (-1468578859)) + (i11 * (-2108293120));
        int i14 = i12 + (i13 * i13 * (-2075787264));
        if (i14 == 1) {
            return onExtraCallback(objArr);
        }
        if (i14 != 2) {
            return i14 != 3 ? i14 != 4 ? IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr);
        }
        int i15 = 2 % 2;
        File file = new File(((performDrag) objArr[0]).onWarmupCompleted.getFilesDir(), "ads_sdk/failed_tracking_logs.ndjson");
        int i16 = IAuthTabCallback_Parcel + 77;
        access100 = i16 % 128;
        int i17 = i16 % 2;
        return file;
    }

    public static /* synthetic */ Unit onNavigationEvent(adInfo adinfo) {
        int i = 2 % 2;
        int i2 = access100 + 45;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent3 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        Unit unit = (Unit) onNavigationEvent(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{adinfo}, iOnNavigationEvent, 1291339611, -1291339608, iOnNavigationEvent3, iOnNavigationEvent2);
        int i4 = IAuthTabCallback_Parcel + 73;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public performDrag(@NotNull Context context, @NotNull findResAndMsg findresandmsg) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(findresandmsg, "");
        this.onWarmupCompleted = context;
        this.onTransact = findresandmsg;
        this.asBinder = jni_YGNodeStyleGetFlexGrowJNI.IAuthTabCallback(false, 1, (Object) null);
        this.getInterfaceDescriptor = jni_YGNodeStyleGetFlexGrowJNI.IAuthTabCallback(false, 1, (Object) null);
        this.onExtraCallback = new ArrayList();
        this.IAuthTabCallbackStub = new AtomicBoolean(false);
        this.onExtraCallbackWithResult = new LinkedHashMap();
        this.IAuthTabCallbackDefault = videoFrameChanged.onWarmupCompleted((wie2) null, new Function1() { // from class: im.toss.ads_sdk.log.TrackingLogStore$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 95;
                onExtraCallback = i2 % 128;
                adInfo adinfo = (adInfo) obj;
                if (i2 % 2 != 0) {
                    return performDrag.onNavigationEvent(adinfo);
                }
                performDrag.onNavigationEvent(adinfo);
                throw null;
            }
        }, 1, (Object) null);
        this.IAuthTabCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.ads_sdk.log.TrackingLogStore$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 83;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                File fileOnExtraCallbackWithResult = performDrag.onExtraCallbackWithResult(this.f$0);
                int i4 = onNavigationEvent + 117;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return fileOnExtraCallbackWithResult;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
    }

    public static final /* synthetic */ Object IAuthTabCallback(performDrag performdrag, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 111;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object objOnWarmupCompleted = performdrag.onWarmupCompleted(access13800Var);
        int i4 = IAuthTabCallback_Parcel + 107;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return objOnWarmupCompleted;
        }
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Inject
    public performDrag(@NotNull Context context) {
        this(context, findRes.onWarmupCompleted(isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null).plus(putChannelInfo.IAuthTabCallback())));
        Intrinsics.checkNotNullParameter(context, "");
    }

    static final class IAuthTabCallback {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private int onExtraCallback;
        private long onExtraCallbackWithResult;

        public IAuthTabCallback(int i, long j) {
            this.onExtraCallback = i;
            this.onExtraCallbackWithResult = j;
        }

        public final int onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 1;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.onExtraCallback;
            int i6 = i2 + 17;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                return i5;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final long onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 83;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onExtraCallbackWithResult;
            }
            int i3 = 71 / 0;
            return this.onExtraCallbackWithResult;
        }

        public final void onNavigationEvent(long j) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 105;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            this.onExtraCallbackWithResult = j;
            int i5 = i3 + 19;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
        }

        public final void onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 55;
            int i4 = i3 % 128;
            onNavigationEvent = i4;
            int i5 = i3 % 2;
            this.onExtraCallback = i;
            int i6 = i4 + 17;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        boolean z = false;
        adInfo adinfo = (adInfo) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 125;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(adinfo, "");
        } else {
            Intrinsics.checkNotNullParameter(adinfo, "");
            z = true;
        }
        adinfo.IAuthTabCallback(z);
        return Unit.INSTANCE;
    }

    private final File IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 35;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        File file = (File) this.IAuthTabCallback.getValue();
        if (i3 != 0) {
            return file;
        }
        throw null;
    }

    private final String onExtraCallback(TrackingLogRecord trackingLogRecord) throws Throwable {
        String strOnTransact;
        int i = 2 % 2;
        String str = (String) TrackingLogRecord.IAuthTabCallback(new Object[]{trackingLogRecord}, _string.onNavigationEvent.IAuthTabCallback(), 928218804, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -928218802);
        Iterator<TrackingLogRecord> it = this.onExtraCallback.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            int i3 = IAuthTabCallback_Parcel + 39;
            access100 = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.areEqual((String) TrackingLogRecord.IAuthTabCallback(new Object[]{it.next()}, _string.onNavigationEvent.IAuthTabCallback(), 928218804, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -928218802), str);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (Intrinsics.areEqual((String) TrackingLogRecord.IAuthTabCallback(new Object[]{it.next()}, _string.onNavigationEvent.IAuthTabCallback(), 928218804, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -928218802), str)) {
                break;
            }
            int i4 = IAuthTabCallback_Parcel + 39;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            i2++;
        }
        if (i2 >= 0) {
            TrackingLogRecord trackingLogRecord2 = this.onExtraCallback.get(i2);
            this.onExtraCallback.set(i2, TrackingLogRecord.IAuthTabCallback(trackingLogRecord2, null, null, CollectionsKt.distinct(CollectionsKt.plus(trackingLogRecord2.IAuthTabCallbackStubProxy(), trackingLogRecord.IAuthTabCallbackStubProxy())), trackingLogRecord.IAuthTabCallbackDefault(), null, Math.min(trackingLogRecord2.onWarmupCompleted(), trackingLogRecord.onWarmupCompleted()), null, 0, null, null, null, null, false, 8147, null));
            strOnTransact = trackingLogRecord2.onTransact();
        } else {
            this.onExtraCallback.add(trackingLogRecord);
            strOnTransact = trackingLogRecord.onTransact();
        }
        asInterface();
        int i6 = access100 + 33;
        IAuthTabCallback_Parcel = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 24 / 0;
        }
        return strOnTransact;
    }

    private static final boolean onExtraCallback(Set set, TrackingLogRecord trackingLogRecord) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 17;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(trackingLogRecord, "");
            set.contains(trackingLogRecord.onTransact());
            throw null;
        }
        Intrinsics.checkNotNullParameter(trackingLogRecord, "");
        boolean zContains = set.contains(trackingLogRecord.onTransact());
        int i3 = access100 + 9;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return zContains;
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access100 + 19;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        boolean zCompareAndSet = this.IAuthTabCallbackStub.compareAndSet(false, true);
        int i4 = IAuthTabCallback_Parcel + 87;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return zCompareAndSet;
        }
        throw null;
    }

    public final void onExtraCallback() {
        int i = 2 % 2;
        int i2 = access100 + 7;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallbackStub.set(false);
        int i4 = IAuthTabCallback_Parcel + 67;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(performDrag performdrag, long j, access13800 access13800Var, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 111;
        access100 = i3 % 128;
        if (i3 % 2 != 0 && (i & 1) != 0) {
            j = System.currentTimeMillis();
        }
        Object objOnExtraCallback = performdrag.onExtraCallback(j, (access13800<? super List<TrackingLogRecord>>) access13800Var);
        int i4 = access100 + 97;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 15 / 0;
        }
        return objOnExtraCallback;
    }

    private static final boolean onExtraCallbackWithResult(long j, Map.Entry entry) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(entry, "");
        if (j - ((IAuthTabCallback) entry.getValue()).onNavigationEvent() > 120000) {
            int i2 = IAuthTabCallback_Parcel + 91;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = IAuthTabCallback_Parcel + 25;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return false;
        }
        throw null;
    }

    private final void asBinder() {
        int i = 2 % 2;
        int i2 = access100 + 121;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        getPackageType getpackagetype = this.access000;
        if (getpackagetype != null) {
            int i5 = i3 + 111;
            access100 = i5 % 128;
            if (i5 % 2 == 0) {
                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 0, (Object) null);
            } else {
                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
            }
        }
        this.access000 = maybeUpdateAnimatable.onNavigationEvent(this.onTransact, (CoroutineContext) null, (setRandomHost) null, new asInterface(null), 3, (Object) null);
    }

    static final class asInterface extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        int label;

        asInterface(access13800<? super asInterface> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asInterface asinterface = performDrag.this.new asInterface(access13800Var);
            int i2 = onExtraCallbackWithResult + 19;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return asinterface;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 75;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                onNavigationEvent(findresandmsg, access13800Var);
                throw null;
            }
            Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
            int i3 = onExtraCallbackWithResult + 79;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 23;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 85;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
        
            if (o.performDrag.IAuthTabCallback(r6, (o.access13800) r5) == r1) goto L23;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 125;
            onExtraCallback = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                access14300.onWarmupCompleted();
                obj2.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(500L, this) != objOnWarmupCompleted) {
                }
                return objOnWarmupCompleted;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i4 = onExtraCallback + 111;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.onNavigationEvent(obj);
                throw null;
            }
            ResultKt.onNavigationEvent(obj);
            performDrag performdrag = performDrag.this;
            this.label = 2;
        }
    }

    private final boolean onWarmupCompleted() throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 99;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        if (this.asInterface) {
            int i5 = i2 + 49;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        this.asInterface = true;
        if (!IAuthTabCallback().exists()) {
            int i7 = IAuthTabCallback_Parcel + 49;
            access100 = i7 % 128;
            return i7 % 2 == 0;
        }
        try {
            Result.Companion companion = kotlin.Result.Companion;
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(IAuthTabCallback()), Charsets.UTF_8), 8192);
            try {
                Iterator itIAuthTabCallback = TextStreamsKt.lineSequence(bufferedReader).IAuthTabCallback();
                while (itIAuthTabCallback.hasNext()) {
                    String str = (String) itIAuthTabCallback.next();
                    if (!StringsKt.isBlank(str)) {
                        int i8 = IAuthTabCallback_Parcel + 37;
                        access100 = i8 % 128;
                        int i9 = i8 % 2;
                        listCreateListBuilder.add(this.IAuthTabCallbackDefault.onExtraCallback(TrackingLogRecord.Companion.serializer(), str));
                    }
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(bufferedReader, (Throwable) null);
                obj = kotlin.Result.constructor-impl(CollectionsKt.build(listCreateListBuilder));
            } finally {
            }
        } catch (Throwable th) {
            Result.Companion companion2 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = kotlin.Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "NativeAdsTrackingQueue", "Native ads tracking queue file is corrupted", th2, (Map) null, 8, (Object) null);
            onExtraCallbackWithResult();
            return false;
        }
        for (TrackingLogRecord trackingLogRecord : (List) obj) {
            String str2 = (String) TrackingLogRecord.IAuthTabCallback(new Object[]{trackingLogRecord}, _string.onNavigationEvent.IAuthTabCallback(), 928218804, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -928218802);
            Iterator<TrackingLogRecord> it = this.onExtraCallback.iterator();
            int i10 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i10 = -1;
                    break;
                }
                int i11 = access100 + 107;
                IAuthTabCallback_Parcel = i11 % 128;
                int i12 = i11 % 2;
                if (Intrinsics.areEqual((String) TrackingLogRecord.IAuthTabCallback(new Object[]{it.next()}, _string.onNavigationEvent.IAuthTabCallback(), 928218804, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -928218802), str2)) {
                    break;
                }
                i10++;
            }
            if (i10 >= 0) {
                TrackingLogRecord trackingLogRecord2 = this.onExtraCallback.get(i10);
                this.onExtraCallback.set(i10, TrackingLogRecord.IAuthTabCallback(trackingLogRecord2, null, null, CollectionsKt.distinct(CollectionsKt.plus(trackingLogRecord2.IAuthTabCallbackStubProxy(), trackingLogRecord.IAuthTabCallbackStubProxy())), null, null, Math.min(trackingLogRecord2.onWarmupCompleted(), trackingLogRecord.onWarmupCompleted()), null, Math.max(((Integer) TrackingLogRecord.IAuthTabCallback(new Object[]{trackingLogRecord2}, _string.onNavigationEvent.IAuthTabCallback(), 239726099, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -239726098)).intValue(), ((Integer) TrackingLogRecord.IAuthTabCallback(new Object[]{trackingLogRecord}, _string.onNavigationEvent.IAuthTabCallback(), 239726099, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -239726098)).intValue()), null, null, null, null, false, 8027, null));
                int i13 = access100 + 109;
                IAuthTabCallback_Parcel = i13 % 128;
                int i14 = i13 % 2;
            } else {
                this.onExtraCallback.add(trackingLogRecord);
            }
        }
        return asInterface();
    }

    private final void onExtraCallbackWithResult(String str) {
        int i = 2 % 2;
        IAuthTabCallback iAuthTabCallback = this.onExtraCallbackWithResult.get(str);
        if (iAuthTabCallback == null) {
            this.onExtraCallbackWithResult.put(str, new IAuthTabCallback(1, System.currentTimeMillis()));
            int i2 = access100 + 95;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        iAuthTabCallback.onWarmupCompleted(iAuthTabCallback.onExtraCallbackWithResult() + 1);
        iAuthTabCallback.onNavigationEvent(System.currentTimeMillis());
        int i4 = IAuthTabCallback_Parcel + 29;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(String str) {
        int i = 2 % 2;
        int i2 = access100 + 77;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback iAuthTabCallback = this.onExtraCallbackWithResult.get(str);
        if (iAuthTabCallback != null) {
            int i4 = access100 + 7;
            IAuthTabCallback_Parcel = i4 % 128;
            if (i4 % 2 != 0) {
                iAuthTabCallback.onWarmupCompleted(iAuthTabCallback.onExtraCallbackWithResult() << 1);
                if (iAuthTabCallback.onExtraCallbackWithResult() <= 0) {
                    this.onExtraCallbackWithResult.remove(str);
                }
            } else {
                iAuthTabCallback.onWarmupCompleted(iAuthTabCallback.onExtraCallbackWithResult() - 1);
                if (iAuthTabCallback.onExtraCallbackWithResult() <= 0) {
                }
            }
        }
        int i5 = access100 + 23;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
    }

    private final boolean asInterface() throws Throwable {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 9;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            z = true;
            i = 0;
        } else {
            i = 0;
            z = false;
        }
        while (this.onExtraCallback.size() > 200) {
            this.onExtraCallbackWithResult.remove(this.onExtraCallback.get(0).onTransact());
            this.onExtraCallback.remove(0);
            i++;
            z = true;
        }
        if (i > 0) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "NativeAdsTrackingQueue", "Native ads tracking queue trimmed", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("trimmed_count", Integer.valueOf(i)), getWrite.IAuthTabCallback("max_cache_size", 200)}), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
            int i4 = access100 + 57;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
        }
        return z;
    }

    private final void onExtraCallbackWithResult() {
        int i = 2 % 2;
        this.onExtraCallback.clear();
        try {
            Result.Companion companion = kotlin.Result.Companion;
            IAuthTabCallback().delete();
            kotlin.Result.constructor-impl(Boolean.valueOf(new File(IAuthTabCallback().getParentFile(), IAuthTabCallback().getName() + ".tmp").delete()));
            int i2 = IAuthTabCallback_Parcel + 73;
            access100 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 10 / 0;
            }
        } catch (Throwable th) {
            Result.Companion companion2 = kotlin.Result.Companion;
            kotlin.Result.constructor-impl(ResultKt.createFailure(th));
        }
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        onNavigationEvent onnavigationevent;
        jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni;
        performDrag performdrag = (performDrag) objArr[0];
        TrackingLogRecord trackingLogRecord = (TrackingLogRecord) objArr[1];
        onNavigationEvent onnavigationevent2 = (access13800) objArr[2];
        int i = 2 % 2;
        if (onnavigationevent2 instanceof onNavigationEvent) {
            onnavigationevent = onnavigationevent2;
            int i2 = onnavigationevent.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                onnavigationevent.label = i2 - 2147483648;
                int i3 = access100 + 61;
                IAuthTabCallback_Parcel = i3 % 128;
                int i4 = i3 % 2;
            } else {
                onnavigationevent = performdrag.new onNavigationEvent(onnavigationevent2);
            }
        }
        Object obj = onnavigationevent.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = onnavigationevent.label;
        Object obj2 = null;
        if (i5 == 0) {
            ResultKt.onNavigationEvent(obj);
            jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni2 = performdrag.asBinder;
            onnavigationevent.L$0 = trackingLogRecord;
            onnavigationevent.L$1 = jni_ygnodestylegetflexbasisjni2;
            onnavigationevent.I$0 = 0;
            onnavigationevent.label = 1;
            if (jni_ygnodestylegetflexbasisjni2.IAuthTabCallback((Object) null, onnavigationevent) == objOnWarmupCompleted) {
                int i6 = IAuthTabCallback_Parcel + 77;
                access100 = i6 % 128;
                int i7 = i6 % 2;
                return objOnWarmupCompleted;
            }
            jni_ygnodestylegetflexbasisjni = jni_ygnodestylegetflexbasisjni2;
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i8 = access100 + 1;
            IAuthTabCallback_Parcel = i8 % 128;
            if (i8 % 2 != 0) {
                ResultKt.onNavigationEvent(obj);
                obj2.hashCode();
                throw null;
            }
            jni_ygnodestylegetflexbasisjni = (jni_YGNodeStyleGetFlexBasisJNI) onnavigationevent.L$1;
            trackingLogRecord = (TrackingLogRecord) onnavigationevent.L$0;
            ResultKt.onNavigationEvent(obj);
        }
        try {
            performdrag.onWarmupCompleted();
            String strOnExtraCallback = performdrag.onExtraCallback(trackingLogRecord);
            performdrag.onExtraCallbackWithResult(strOnExtraCallback);
            performdrag.asBinder();
            return strOnExtraCallback;
        } finally {
            jni_ygnodestylegetflexbasisjni.onWarmupCompleted((Object) null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onNavigationEvent(@NotNull TrackingLogRecord trackingLogRecord, @NotNull access13800<? super String> access13800Var) {
        onExtraCallback onextracallback;
        jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni;
        int i = 2 % 2;
        if (access13800Var instanceof onExtraCallback) {
            onextracallback = (onExtraCallback) access13800Var;
            int i2 = onextracallback.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = IAuthTabCallback_Parcel + 69;
                access100 = i3 % 128;
                int i4 = i3 % 2;
                onextracallback.label = i2 - 2147483648;
            } else {
                onextracallback = new onExtraCallback(access13800Var);
            }
        }
        Object obj = onextracallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = onextracallback.label;
        Object obj2 = null;
        try {
            if (i5 == 0) {
                ResultKt.onNavigationEvent(obj);
                jni_ygnodestylegetflexbasisjni = this.asBinder;
                onextracallback.L$0 = trackingLogRecord;
                onextracallback.L$1 = jni_ygnodestylegetflexbasisjni;
                onextracallback.I$0 = 0;
                onextracallback.label = 1;
                if (jni_ygnodestylegetflexbasisjni.IAuthTabCallback((Object) null, onextracallback) != objOnWarmupCompleted) {
                }
            }
            int i6 = IAuthTabCallback_Parcel + 33;
            access100 = i6 % 128;
            if (i6 % 2 != 0 ? i5 != 1 : i5 != 1) {
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str = (String) onextracallback.L$1;
                ResultKt.onNavigationEvent(obj);
                int i7 = IAuthTabCallback_Parcel + 75;
                access100 = i7 % 128;
                if (i7 % 2 != 0) {
                    return str;
                }
                obj2.hashCode();
                throw null;
            }
            jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni2 = (jni_YGNodeStyleGetFlexBasisJNI) onextracallback.L$1;
            TrackingLogRecord trackingLogRecord2 = (TrackingLogRecord) onextracallback.L$0;
            ResultKt.onNavigationEvent(obj);
            jni_ygnodestylegetflexbasisjni = jni_ygnodestylegetflexbasisjni2;
            trackingLogRecord = trackingLogRecord2;
            onWarmupCompleted();
            String strOnExtraCallback = onExtraCallback(trackingLogRecord);
            onExtraCallbackWithResult(strOnExtraCallback);
            getPackageType getpackagetype = this.access000;
            if (getpackagetype != null) {
                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
                int i8 = IAuthTabCallback_Parcel + 5;
                access100 = i8 % 128;
                int i9 = i8 % 2;
            }
            this.access000 = null;
            jni_ygnodestylegetflexbasisjni.onWarmupCompleted((Object) null);
            onextracallback.L$0 = access15400.onNavigationEvent(trackingLogRecord);
            onextracallback.L$1 = strOnExtraCallback;
            onextracallback.label = 2;
            return onWarmupCompleted(onextracallback) == objOnWarmupCompleted ? objOnWarmupCompleted : strOnExtraCallback;
        } catch (Throwable th) {
            jni_ygnodestylegetflexbasisjni.onWarmupCompleted((Object) null);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onWarmupCompleted(@NotNull final Set<String> set, @NotNull access13800<? super Unit> access13800Var) {
        onTransact ontransact;
        jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni;
        int i = 2 % 2;
        if (access13800Var instanceof onTransact) {
            ontransact = (onTransact) access13800Var;
            int i2 = ontransact.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = IAuthTabCallback_Parcel + 121;
                access100 = i3 % 128;
                if (i3 % 2 == 0) {
                    ontransact.label = i2 % Integer.MIN_VALUE;
                } else {
                    ontransact.label = i2 - 2147483648;
                }
            } else {
                ontransact = new onTransact(access13800Var);
            }
        }
        Object obj = ontransact.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i4 = ontransact.label;
        Object obj2 = null;
        if (i4 != 0) {
            int i5 = IAuthTabCallback_Parcel + 123;
            int i6 = i5 % 128;
            access100 = i6;
            int i7 = i5 % 2;
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i8 = i6 + 49;
            IAuthTabCallback_Parcel = i8 % 128;
            int i9 = i8 % 2;
            jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni2 = (jni_YGNodeStyleGetFlexBasisJNI) ontransact.L$1;
            Set<String> set2 = (Set) ontransact.L$0;
            ResultKt.onNavigationEvent(obj);
            int i10 = IAuthTabCallback_Parcel + 125;
            access100 = i10 % 128;
            int i11 = i10 % 2;
            jni_ygnodestylegetflexbasisjni = jni_ygnodestylegetflexbasisjni2;
            set = set2;
        } else {
            ResultKt.onNavigationEvent(obj);
            if (set.isEmpty()) {
                return Unit.INSTANCE;
            }
            jni_ygnodestylegetflexbasisjni = this.asBinder;
            ontransact.L$0 = set;
            ontransact.L$1 = jni_ygnodestylegetflexbasisjni;
            ontransact.I$0 = 0;
            ontransact.label = 1;
            if (jni_ygnodestylegetflexbasisjni.IAuthTabCallback((Object) null, ontransact) == objOnWarmupCompleted) {
                int i12 = IAuthTabCallback_Parcel + 63;
                access100 = i12 % 128;
                if (i12 % 2 != 0) {
                    return objOnWarmupCompleted;
                }
                obj2.hashCode();
                throw null;
            }
        }
        try {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                this.onExtraCallbackWithResult.remove((String) it.next());
            }
            if (CollectionsKt.removeAll(this.onExtraCallback, new Function1() { // from class: im.toss.ads_sdk.log.TrackingLogStore$$ExternalSyntheticLambda2
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj3) {
                    int i13 = 2 % 2;
                    int i14 = onExtraCallbackWithResult + 29;
                    onWarmupCompleted = i14 % 128;
                    int i15 = i14 % 2;
                    Boolean boolValueOf = Boolean.valueOf(performDrag.IAuthTabCallback(set, (TrackingLogRecord) obj3));
                    int i16 = onExtraCallbackWithResult + 81;
                    onWarmupCompleted = i16 % 128;
                    if (i16 % 2 == 0) {
                        return boolValueOf;
                    }
                    throw null;
                }
            })) {
                asBinder();
            }
            Unit unit = Unit.INSTANCE;
            jni_ygnodestylegetflexbasisjni.onWarmupCompleted((Object) null);
            int i13 = access100 + 85;
            IAuthTabCallback_Parcel = i13 % 128;
            int i14 = i13 % 2;
            return unit;
        } catch (Throwable th) {
            jni_ygnodestylegetflexbasisjni.onWarmupCompleted((Object) null);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onExtraCallbackWithResult(@NotNull access13800<? super Boolean> access13800Var) {
        IAuthTabCallbackStub iAuthTabCallbackStub;
        jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni;
        int i = 2 % 2;
        if (access13800Var instanceof IAuthTabCallbackStub) {
            iAuthTabCallbackStub = (IAuthTabCallbackStub) access13800Var;
            int i2 = iAuthTabCallbackStub.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iAuthTabCallbackStub.label = i2 - 2147483648;
            } else {
                iAuthTabCallbackStub = new IAuthTabCallbackStub(access13800Var);
            }
        }
        Object obj = iAuthTabCallbackStub.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = iAuthTabCallbackStub.label;
        boolean z = true;
        if (i3 == 0) {
            ResultKt.onNavigationEvent(obj);
            jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni2 = this.asBinder;
            iAuthTabCallbackStub.L$0 = jni_ygnodestylegetflexbasisjni2;
            iAuthTabCallbackStub.I$0 = 0;
            iAuthTabCallbackStub.label = 1;
            if (jni_ygnodestylegetflexbasisjni2.IAuthTabCallback((Object) null, iAuthTabCallbackStub) == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
            jni_ygnodestylegetflexbasisjni = jni_ygnodestylegetflexbasisjni2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = access100 + 91;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            jni_ygnodestylegetflexbasisjni = (jni_YGNodeStyleGetFlexBasisJNI) iAuthTabCallbackStub.L$0;
            ResultKt.onNavigationEvent(obj);
            int i6 = IAuthTabCallback_Parcel + 43;
            access100 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 / 3;
            }
        }
        try {
            onWarmupCompleted();
            List<TrackingLogRecord> list = this.onExtraCallback;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (!this.onExtraCallbackWithResult.containsKey(((TrackingLogRecord) it.next()).onTransact())) {
                        int i8 = access100 + 39;
                        IAuthTabCallback_Parcel = i8 % 128;
                        if (i8 % 2 != 0) {
                            break;
                        }
                    }
                }
            } else {
                z = false;
            }
            return access14000.onNavigationEvent(z);
        } finally {
            jni_ygnodestylegetflexbasisjni.onWarmupCompleted((Object) null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onExtraCallback(@NotNull String str, @NotNull List<String> list, @NotNull access13800<? super Unit> access13800Var) {
        asBinder asbinder;
        jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni;
        String str2;
        List<String> list2;
        List<TrackingLogRecord> list3;
        TrackingLogRecord trackingLogRecordIAuthTabCallback;
        int i = 2 % 2;
        if (access13800Var instanceof asBinder) {
            int i2 = IAuthTabCallback_Parcel + 121;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            asbinder = (asBinder) access13800Var;
            int i4 = asbinder.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                asbinder.label = i4 - 2147483648;
            } else {
                asbinder = new asBinder(access13800Var);
            }
        }
        Object obj = asbinder.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = asbinder.label;
        int i6 = 0;
        if (i5 == 0) {
            ResultKt.onNavigationEvent(obj);
            jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni2 = this.asBinder;
            asbinder.L$0 = str;
            asbinder.L$1 = list;
            asbinder.L$2 = jni_ygnodestylegetflexbasisjni2;
            asbinder.I$0 = 0;
            asbinder.label = 1;
            if (jni_ygnodestylegetflexbasisjni2.IAuthTabCallback((Object) null, asbinder) == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
            jni_ygnodestylegetflexbasisjni = jni_ygnodestylegetflexbasisjni2;
            str2 = str;
            list2 = list;
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i7 = access100 + 27;
            IAuthTabCallback_Parcel = i7 % 128;
            int i8 = i7 % 2;
            jni_ygnodestylegetflexbasisjni = (jni_YGNodeStyleGetFlexBasisJNI) asbinder.L$2;
            list2 = (List) asbinder.L$1;
            str2 = (String) asbinder.L$0;
            ResultKt.onNavigationEvent(obj);
        }
        try {
            onNavigationEvent(str2);
            Iterator<TrackingLogRecord> it = this.onExtraCallback.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i6 = -1;
                    break;
                }
                if (Intrinsics.areEqual(it.next().onTransact(), str2)) {
                    break;
                }
                i6++;
                int i9 = IAuthTabCallback_Parcel + 91;
                access100 = i9 % 128;
                int i10 = i9 % 2;
            }
            if (i6 >= 0) {
                List listMinus = CollectionsKt.minus(this.onExtraCallback.get(i6).IAuthTabCallbackStubProxy(), CollectionsKt.toSet(list2));
                if (listMinus.isEmpty()) {
                    this.onExtraCallback.remove(i6);
                } else if (listMinus.size() != this.onExtraCallback.get(i6).IAuthTabCallbackStubProxy().size()) {
                    int i11 = access100 + 53;
                    IAuthTabCallback_Parcel = i11 % 128;
                    if (i11 % 2 != 0) {
                        list3 = this.onExtraCallback;
                        trackingLogRecordIAuthTabCallback = TrackingLogRecord.IAuthTabCallback(list3.get(i6), null, null, listMinus, null, null, 0L, null, 1, null, null, null, null, false, 21184, null);
                    } else {
                        list3 = this.onExtraCallback;
                        trackingLogRecordIAuthTabCallback = TrackingLogRecord.IAuthTabCallback(list3.get(i6), null, null, listMinus, null, null, 0L, null, 0, null, null, null, null, false, 8187, null);
                    }
                    list3.set(i6, trackingLogRecordIAuthTabCallback);
                }
                asBinder();
            }
            return Unit.INSTANCE;
        } finally {
            jni_ygnodestylegetflexbasisjni.onWarmupCompleted((Object) null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        IAuthTabCallbackDefault iAuthTabCallbackDefault;
        jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni;
        int i;
        boolean z = false;
        performDrag performdrag = (performDrag) objArr[0];
        String str = (String) objArr[1];
        List list = (List) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        IAuthTabCallbackDefault iAuthTabCallbackDefault2 = (access13800) objArr[4];
        int i2 = 2 % 2;
        if (iAuthTabCallbackDefault2 instanceof IAuthTabCallbackDefault) {
            iAuthTabCallbackDefault = iAuthTabCallbackDefault2;
            int i3 = iAuthTabCallbackDefault.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                int i4 = IAuthTabCallback_Parcel + 117;
                access100 = i4 % 128;
                int i5 = i4 % 2;
                iAuthTabCallbackDefault.label = i3 - 2147483648;
            } else {
                iAuthTabCallbackDefault = performdrag.new IAuthTabCallbackDefault(iAuthTabCallbackDefault2);
            }
        }
        Object obj = iAuthTabCallbackDefault.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i6 = iAuthTabCallbackDefault.label;
        if (i6 == 0) {
            ResultKt.onNavigationEvent(obj);
            jni_ygnodestylegetflexbasisjni = performdrag.asBinder;
            iAuthTabCallbackDefault.L$0 = str;
            iAuthTabCallbackDefault.L$1 = list;
            iAuthTabCallbackDefault.L$2 = jni_ygnodestylegetflexbasisjni;
            iAuthTabCallbackDefault.I$0 = iIntValue;
            iAuthTabCallbackDefault.I$1 = 0;
            iAuthTabCallbackDefault.label = 1;
            if (jni_ygnodestylegetflexbasisjni.IAuthTabCallback((Object) null, iAuthTabCallbackDefault) == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iIntValue = iAuthTabCallbackDefault.I$0;
            jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni2 = (jni_YGNodeStyleGetFlexBasisJNI) iAuthTabCallbackDefault.L$2;
            list = (List) iAuthTabCallbackDefault.L$1;
            String str2 = (String) iAuthTabCallbackDefault.L$0;
            ResultKt.onNavigationEvent(obj);
            jni_ygnodestylegetflexbasisjni = jni_ygnodestylegetflexbasisjni2;
            str = str2;
        }
        try {
            Iterator<TrackingLogRecord> it = performdrag.onExtraCallback.iterator();
            int i7 = access100 + 69;
            IAuthTabCallback_Parcel = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 0;
            while (it.hasNext()) {
                int i10 = IAuthTabCallback_Parcel + 89;
                access100 = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 8 / 0;
                    if (Intrinsics.areEqual(it.next().onTransact(), str)) {
                        i = IAuthTabCallback_Parcel + 37;
                        access100 = i % 128;
                        if (i % 2 == 0) {
                            int i12 = 5 / 4;
                        }
                    } else {
                        i9++;
                    }
                } else if (Intrinsics.areEqual(it.next().onTransact(), str)) {
                    i = IAuthTabCallback_Parcel + 37;
                    access100 = i % 128;
                    if (i % 2 == 0) {
                    }
                } else {
                    i9++;
                }
                if (i9 >= 0) {
                    int i13 = IAuthTabCallback_Parcel + 59;
                    access100 = i13 % 128;
                    int i14 = i13 % 2;
                    List listMinus = CollectionsKt.minus(performdrag.onExtraCallback.get(i9).IAuthTabCallbackStubProxy(), CollectionsKt.toSet(list));
                    if (performdrag.onExtraCallbackWithResult.containsKey(str)) {
                        int i15 = IAuthTabCallback_Parcel + 1;
                        access100 = i15 % 128;
                        int i16 = i15 % 2;
                        if (listMinus.isEmpty()) {
                            performdrag.onExtraCallback.remove(i9);
                        } else {
                            List<TrackingLogRecord> list2 = performdrag.onExtraCallback;
                            list2.set(i9, TrackingLogRecord.IAuthTabCallback(list2.get(i9), null, null, listMinus, null, null, 0L, null, 0, null, null, null, null, false, 8187, null));
                            int i17 = IAuthTabCallback_Parcel + 83;
                            access100 = i17 % 128;
                            int i18 = i17 % 2;
                        }
                        performdrag.asBinder();
                        z = !listMinus.isEmpty();
                    } else {
                        int iIntValue2 = ((Integer) TrackingLogRecord.IAuthTabCallback(new Object[]{performdrag.onExtraCallback.get(i9)}, _string.onNavigationEvent.IAuthTabCallback(), 239726099, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -239726098)).intValue() + 1;
                        boolean z2 = !listMinus.isEmpty() && iIntValue2 < iIntValue;
                        if (!(!z2)) {
                            List<TrackingLogRecord> list3 = performdrag.onExtraCallback;
                            list3.set(i9, TrackingLogRecord.IAuthTabCallback(list3.get(i9), null, null, listMinus, null, null, 0L, null, iIntValue2, null, null, null, null, false, 8059, null));
                        } else {
                            performdrag.onExtraCallback.remove(i9);
                        }
                        performdrag.asBinder();
                        if (z2) {
                            z = true;
                        }
                    }
                }
                return access14000.onNavigationEvent(z);
            }
            i9 = -1;
            if (i9 >= 0) {
            }
            return access14000.onNavigationEvent(z);
        } finally {
            jni_ygnodestylegetflexbasisjni.onWarmupCompleted((Object) null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onExtraCallback(final long j, @NotNull access13800<? super List<TrackingLogRecord>> access13800Var) {
        IAuthTabCallback_Parcel iAuthTabCallback_Parcel;
        jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni;
        int i = 2 % 2;
        if (access13800Var instanceof IAuthTabCallback_Parcel) {
            iAuthTabCallback_Parcel = (IAuthTabCallback_Parcel) access13800Var;
            int i2 = iAuthTabCallback_Parcel.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iAuthTabCallback_Parcel.label = i2 - 2147483648;
            } else {
                iAuthTabCallback_Parcel = new IAuthTabCallback_Parcel(access13800Var);
            }
        }
        Object obj = iAuthTabCallback_Parcel.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = iAuthTabCallback_Parcel.label;
        if (i3 != 0) {
            int i4 = IAuthTabCallback_Parcel + 33;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = iAuthTabCallback_Parcel.J$0;
            jni_ygnodestylegetflexbasisjni = (jni_YGNodeStyleGetFlexBasisJNI) iAuthTabCallback_Parcel.L$0;
            ResultKt.onNavigationEvent(obj);
            int i6 = access100 + 91;
            IAuthTabCallback_Parcel = i6 % 128;
            int i7 = i6 % 2;
        } else {
            ResultKt.onNavigationEvent(obj);
            jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni2 = this.asBinder;
            iAuthTabCallback_Parcel.L$0 = jni_ygnodestylegetflexbasisjni2;
            iAuthTabCallback_Parcel.J$0 = j;
            iAuthTabCallback_Parcel.I$0 = 0;
            iAuthTabCallback_Parcel.label = 1;
            if (jni_ygnodestylegetflexbasisjni2.IAuthTabCallback((Object) null, iAuthTabCallback_Parcel) == objOnWarmupCompleted) {
                int i8 = IAuthTabCallback_Parcel + 99;
                access100 = i8 % 128;
                int i9 = i8 % 2;
                return objOnWarmupCompleted;
            }
            jni_ygnodestylegetflexbasisjni = jni_ygnodestylegetflexbasisjni2;
        }
        try {
            boolean zOnWarmupCompleted = onWarmupCompleted();
            List<TrackingLogRecord> list = this.onExtraCallback;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (!(!it.hasNext())) {
                Object next = it.next();
                if (j - ((TrackingLogRecord) next).onWarmupCompleted() > 604800000) {
                    arrayList.add(next);
                }
            }
            if (!arrayList.isEmpty()) {
                this.onExtraCallback.removeAll(arrayList);
            }
            if (zOnWarmupCompleted || (!arrayList.isEmpty())) {
                asBinder();
                int i10 = access100 + 97;
                IAuthTabCallback_Parcel = i10 % 128;
                int i11 = i10 % 2;
            }
            CollectionsKt.removeAll(this.onExtraCallbackWithResult.entrySet(), new Function1() { // from class: im.toss.ads_sdk.log.TrackingLogStore$$ExternalSyntheticLambda3
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj2) {
                    int i12 = 2 % 2;
                    int i13 = onExtraCallback + 7;
                    onExtraCallbackWithResult = i13 % 128;
                    int i14 = i13 % 2;
                    Long lValueOf = Long.valueOf(j);
                    int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
                    int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
                    int iOnNavigationEvent3 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
                    Boolean boolValueOf = Boolean.valueOf(((Boolean) performDrag.onNavigationEvent(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{lValueOf, (Map.Entry) obj2}, iOnNavigationEvent, 590535835, -590535834, iOnNavigationEvent3, iOnNavigationEvent2)).booleanValue());
                    int i15 = onExtraCallback + 83;
                    onExtraCallbackWithResult = i15 % 128;
                    if (i15 % 2 == 0) {
                        return boolValueOf;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            });
            List<TrackingLogRecord> list2 = this.onExtraCallback;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                if (!this.onExtraCallbackWithResult.containsKey(((TrackingLogRecord) obj2).onTransact())) {
                    arrayList2.add(obj2);
                }
            }
            return arrayList2;
        } finally {
            jni_ygnodestylegetflexbasisjni.onWarmupCompleted((Object) null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1 A[Catch: all -> 0x0176, TryCatch #2 {all -> 0x0176, blocks: (B:31:0x00a5, B:33:0x00b1, B:34:0x00b4, B:40:0x010e, B:43:0x0120, B:44:0x0169, B:51:0x0172, B:52:0x0175, B:48:0x016f, B:35:0x00e5, B:36:0x00eb, B:38:0x00f1, B:39:0x010c), top: B:70:0x00a5, outer: #1, inners: #0, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f1 A[Catch: all -> 0x016d, LOOP:0: B:36:0x00eb->B:38:0x00f1, LOOP_END, TryCatch #5 {all -> 0x016d, blocks: (B:35:0x00e5, B:36:0x00eb, B:38:0x00f1, B:39:0x010c), top: B:75:0x00e5, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onWarmupCompleted(access13800<? super Unit> access13800Var) throws Throwable {
        onExtraCallbackWithResult onextracallbackwithresult;
        jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni;
        int i;
        jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni2;
        jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni3;
        File fileIAuthTabCallback;
        File parentFile;
        File file;
        BufferedWriter bufferedWriter;
        Iterator it;
        int i2 = 2 % 2;
        int i3 = access100 + 27;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            boolean z = access13800Var instanceof onExtraCallbackWithResult;
            throw null;
        }
        if (access13800Var instanceof onExtraCallbackWithResult) {
            onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
            int i4 = onextracallbackwithresult.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                onextracallbackwithresult.label = i4 - 2147483648;
            } else {
                onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
            }
        }
        Object obj = onextracallbackwithresult.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = onextracallbackwithresult.label;
        try {
            if (i5 == 0) {
                ResultKt.onNavigationEvent(obj);
                jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni4 = this.getInterfaceDescriptor;
                onextracallbackwithresult.L$0 = jni_ygnodestylegetflexbasisjni4;
                onextracallbackwithresult.I$0 = 0;
                onextracallbackwithresult.label = 1;
                if (jni_ygnodestylegetflexbasisjni4.IAuthTabCallback((Object) null, onextracallbackwithresult) != objOnWarmupCompleted) {
                    jni_ygnodestylegetflexbasisjni = jni_ygnodestylegetflexbasisjni4;
                    i = 0;
                }
                return objOnWarmupCompleted;
            }
            if (i5 == 1) {
                i = onextracallbackwithresult.I$0;
                jni_ygnodestylegetflexbasisjni = (jni_YGNodeStyleGetFlexBasisJNI) onextracallbackwithresult.L$0;
                ResultKt.onNavigationEvent(obj);
            } else {
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jni_ygnodestylegetflexbasisjni2 = (jni_YGNodeStyleGetFlexBasisJNI) onextracallbackwithresult.L$1;
                jni_ygnodestylegetflexbasisjni3 = (jni_YGNodeStyleGetFlexBasisJNI) onextracallbackwithresult.L$0;
                try {
                    ResultKt.onNavigationEvent(obj);
                    int i6 = access100 + 75;
                    IAuthTabCallback_Parcel = i6 % 128;
                    int i7 = i6 % 2;
                    try {
                        List list = CollectionsKt.toList(this.onExtraCallback);
                        try {
                            Result.Companion companion = kotlin.Result.Companion;
                            fileIAuthTabCallback = IAuthTabCallback();
                            parentFile = fileIAuthTabCallback.getParentFile();
                            if (parentFile != null) {
                                parentFile.mkdirs();
                            }
                            file = new File(fileIAuthTabCallback.getParentFile(), fileIAuthTabCallback.getName() + ".tmp");
                            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), Charsets.UTF_8), 8192);
                        } catch (Throwable th) {
                            Result.Companion companion2 = kotlin.Result.Companion;
                            kotlin.Result.constructor-impl(ResultKt.createFailure(th));
                        }
                        try {
                            it = list.iterator();
                            while (it.hasNext()) {
                                bufferedWriter.write(this.IAuthTabCallbackDefault.onWarmupCompleted(TrackingLogRecord.Companion.serializer(), (TrackingLogRecord) it.next()));
                                bufferedWriter.newLine();
                            }
                            Unit unit = Unit.INSTANCE;
                            CloseableKt.closeFinally(bufferedWriter, (Throwable) null);
                            if (!file.renameTo(fileIAuthTabCallback)) {
                                int i8 = access100 + 105;
                                IAuthTabCallback_Parcel = i8 % 128;
                                int i9 = i8 % 2;
                                file.delete();
                                ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "NativeAdsTrackingQueue", "Native ads tracking queue flush could not replace the target file", null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
                            }
                            kotlin.Result.constructor-impl(unit);
                            jni_ygnodestylegetflexbasisjni3.onWarmupCompleted((Object) null);
                            return Unit.INSTANCE;
                        } finally {
                        }
                    } finally {
                        jni_ygnodestylegetflexbasisjni2.onWarmupCompleted((Object) null);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    jni_ygnodestylegetflexbasisjni = jni_ygnodestylegetflexbasisjni3;
                    throw th;
                }
            }
            jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni5 = this.asBinder;
            onextracallbackwithresult.L$0 = jni_ygnodestylegetflexbasisjni;
            onextracallbackwithresult.L$1 = jni_ygnodestylegetflexbasisjni5;
            onextracallbackwithresult.L$2 = access15400.onNavigationEvent(onextracallbackwithresult);
            onextracallbackwithresult.I$0 = i;
            onextracallbackwithresult.I$1 = 0;
            onextracallbackwithresult.I$2 = 0;
            onextracallbackwithresult.label = 2;
            if (jni_ygnodestylegetflexbasisjni5.IAuthTabCallback((Object) null, onextracallbackwithresult) != objOnWarmupCompleted) {
                jni_ygnodestylegetflexbasisjni2 = jni_ygnodestylegetflexbasisjni5;
                jni_ygnodestylegetflexbasisjni3 = jni_ygnodestylegetflexbasisjni;
                List list2 = CollectionsKt.toList(this.onExtraCallback);
                Result.Companion companion3 = kotlin.Result.Companion;
                fileIAuthTabCallback = IAuthTabCallback();
                parentFile = fileIAuthTabCallback.getParentFile();
                if (parentFile != null) {
                }
                file = new File(fileIAuthTabCallback.getParentFile(), fileIAuthTabCallback.getName() + ".tmp");
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), Charsets.UTF_8), 8192);
                it = list2.iterator();
                while (it.hasNext()) {
                }
                Unit unit2 = Unit.INSTANCE;
                CloseableKt.closeFinally(bufferedWriter, (Throwable) null);
                if (!file.renameTo(fileIAuthTabCallback)) {
                }
                kotlin.Result.constructor-impl(unit2);
                jni_ygnodestylegetflexbasisjni3.onWarmupCompleted((Object) null);
                return Unit.INSTANCE;
            }
            return objOnWarmupCompleted;
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public static /* synthetic */ boolean onWarmupCompleted(long j, Map.Entry entry) {
        Object[] objArr = {Long.valueOf(j), entry};
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        return ((Boolean) onNavigationEvent(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr, iOnNavigationEvent, 590535835, -590535834, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent2)).booleanValue();
    }

    private static final File onExtraCallback(performDrag performdrag) {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent3 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        return (File) onNavigationEvent(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{performdrag}, iOnNavigationEvent, 177541085, -177541083, iOnNavigationEvent3, iOnNavigationEvent2);
    }

    private static final Unit onExtraCallback(adInfo adinfo) {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent3 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        return (Unit) onNavigationEvent(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{adinfo}, iOnNavigationEvent, 1291339611, -1291339608, iOnNavigationEvent3, iOnNavigationEvent2);
    }

    public final Object IAuthTabCallback(@NotNull TrackingLogRecord trackingLogRecord, @NotNull access13800<? super String> access13800Var) {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent3 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        return onNavigationEvent(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{this, trackingLogRecord, access13800Var}, iOnNavigationEvent, -652248046, 652248050, iOnNavigationEvent3, iOnNavigationEvent2);
    }

    public final Object onExtraCallbackWithResult(@NotNull String str, @NotNull List<String> list, int i, @NotNull access13800<? super Boolean> access13800Var) {
        Object[] objArr = {this, str, list, Integer.valueOf(i), access13800Var};
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        return onNavigationEvent(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr, iOnNavigationEvent, 896653985, -896653985, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent2);
    }
}
