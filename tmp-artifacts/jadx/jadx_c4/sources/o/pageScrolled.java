package o;

import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.ads.zzgc;
import im.toss.ads_sdk.log.TrackingLogRecord;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.splittarget.impl.fsm.AppStateImpl$;
import im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o._string;
import o.pageScrolled;
import o.unregisterDataSetObserver;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class pageScrolled {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onWarmupCompleted Companion;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 0;
    private static int asInterface = 0;
    private static char[] onExtraCallback = null;
    private static int onTransact = 1;
    public static final int onWarmupCompleted;
    private final enableLayers IAuthTabCallback;
    private final isGutterDrag onExtraCallbackWithResult;
    private final performDrag onNavigationEvent;

    static final class IAuthTabCallbackDefault extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallbackDefault(access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 85;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnNavigationEvent = pageScrolled.onNavigationEvent(pageScrolled.this, null, 0, this);
            int i4 = onExtraCallbackWithResult + 121;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 93 / 0;
            }
            return objOnNavigationEvent;
        }
    }

    static final class onExtraCallback extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 87;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objIAuthTabCallback = pageScrolled.this.IAuthTabCallback((access13800<? super IAuthTabCallback>) this);
            int i4 = onNavigationEvent + 69;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }
    }

    static final class onNavigationEvent extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        int I$4;
        int I$5;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 19;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallback = pageScrolled.onExtraCallback(pageScrolled.this, null, 0, this);
            int i4 = onExtraCallback + 71;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 75 / 0;
            }
            return objOnExtraCallback;
        }
    }

    static {
        onExtraCallbackWithResult();
        Companion = new onWarmupCompleted(null);
        onWarmupCompleted = 8;
        int i = asInterface + 99;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~(i7 | i4);
        int i9 = ~i4;
        int i10 = i8 | (~(i9 | i2));
        int i11 = (~(i4 | i2)) | (~((~i2) | i7 | i9));
        int i12 = i7 | i2 | i9;
        int i13 = i2 + i6 + i5 + (1362283521 * i3) + ((-853422242) * i);
        int i14 = i13 * i13;
        int i15 = ((1713903284 * i2) - 1228931072) + ((-782767794) * i6) + (i10 * 1248335539) + (1248335539 * i11) + ((-1248335539) * i12) + (i5 * 465567744) + (465567744 * i3) + (1887436800 * i) + ((-1154482176) * i14);
        int i16 = ((i2 * 722868660) - 41817558) + (i6 * 722869710) + (i10 * (-525)) + (i11 * (-525)) + (i12 * 525) + (i5 * 722869185) + (i3 * 1172694977) + (i * (-747618338)) + (i14 * 791674880);
        int i17 = i15 + (i16 * i16 * 751828992);
        return i17 != 1 ? i17 != 2 ? onNavigationEvent(objArr) : IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        String str = (String) objArr[0];
        TrackingLogRecord trackingLogRecord = (TrackingLogRecord) objArr[1];
        pageScrolled pagescrolled = (pageScrolled) objArr[2];
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        Lazy lazy = (Lazy) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        int i = 2 % 2;
        int i2 = asBinder + 23;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Request requestOnWarmupCompleted = onWarmupCompleted(str, trackingLogRecord, pagescrolled, zBooleanValue, lazy, iIntValue);
        int i4 = IAuthTabCallbackStub + 13;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return requestOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(boolean z, TrackingLogRecord trackingLogRecord, String str, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asBinder + 17;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(z, trackingLogRecord, str, i);
        int i5 = asBinder + 89;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ RequestBody onExtraCallbackWithResult(TrackingLogRecord trackingLogRecord, pageScrolled pagescrolled) {
        int i = 2 % 2;
        int i2 = asBinder + 27;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(trackingLogRecord, pagescrolled);
            throw null;
        }
        RequestBody requestBodyIAuthTabCallback = IAuthTabCallback(trackingLogRecord, pagescrolled);
        int i3 = asBinder + 31;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return requestBodyIAuthTabCallback;
    }

    @Inject
    public pageScrolled(@NotNull performDrag performdrag, @NotNull enableLayers enablelayers, @NotNull isGutterDrag isgutterdrag) {
        Intrinsics.checkNotNullParameter(performdrag, "");
        Intrinsics.checkNotNullParameter(enablelayers, "");
        Intrinsics.checkNotNullParameter(isgutterdrag, "");
        this.onNavigationEvent = performdrag;
        this.IAuthTabCallback = enablelayers;
        this.onExtraCallbackWithResult = isgutterdrag;
    }

    public static final /* synthetic */ Object onExtraCallback(pageScrolled pagescrolled, TrackingLogRecord trackingLogRecord, int i, access13800 access13800Var) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 9;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Integer numValueOf = Integer.valueOf(i);
        if (i4 != 0) {
            int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
            int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
            int iOnWarmupCompleted3 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
            IAuthTabCallback(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -723036293, new Object[]{pagescrolled, trackingLogRecord, numValueOf, access13800Var}, iOnWarmupCompleted3, iOnWarmupCompleted, iOnWarmupCompleted2, 723036295);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnWarmupCompleted4 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted5 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted6 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        Object objIAuthTabCallback = IAuthTabCallback(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -723036293, new Object[]{pagescrolled, trackingLogRecord, numValueOf, access13800Var}, iOnWarmupCompleted6, iOnWarmupCompleted4, iOnWarmupCompleted5, 723036295);
        int i5 = asBinder + 51;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return objIAuthTabCallback;
    }

    public static final /* synthetic */ Object onNavigationEvent(pageScrolled pagescrolled, TrackingLogRecord trackingLogRecord, int i, access13800 access13800Var) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asBinder + 19;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            return pagescrolled.onExtraCallbackWithResult(trackingLogRecord, i, access13800Var);
        }
        pagescrolled.onExtraCallbackWithResult(trackingLogRecord, i, access13800Var);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super List<? extends Boolean>>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ List<TrackingLogRecord> $chunk;
        final /* synthetic */ int $maxRetryCount;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ pageScrolled this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(List<TrackingLogRecord> list, pageScrolled pagescrolled, int i, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$chunk = list;
            this.this$0 = pagescrolled;
            this.$maxRetryCount = i;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super List<Boolean>> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 95;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresultCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                onextracallbackwithresultCreate.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = onextracallbackwithresultCreate.invokeSuspend(unit);
            int i4 = onWarmupCompleted + 93;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$chunk, this.this$0, this.$maxRetryCount, access13800Var);
            onextracallbackwithresult.L$0 = obj;
            int i2 = IAuthTabCallback + 65;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return onextracallbackwithresult;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 35;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 117;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objIAuthTabCallback;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Boolean>, Object> {
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;
            final /* synthetic */ TrackingLogRecord $log;
            final /* synthetic */ int $maxRetryCount;
            int label;
            final /* synthetic */ pageScrolled this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            IAuthTabCallback(pageScrolled pagescrolled, TrackingLogRecord trackingLogRecord, int i, access13800<? super IAuthTabCallback> access13800Var) {
                super(2, access13800Var);
                this.this$0 = pagescrolled;
                this.$log = trackingLogRecord;
                this.$maxRetryCount = i;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.this$0, this.$log, this.$maxRetryCount, access13800Var);
                int i2 = onExtraCallbackWithResult + 65;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return iAuthTabCallback;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 125;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
                int i4 = onNavigationEvent + 17;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return objOnWarmupCompleted;
            }

            public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Boolean> access13800Var) throws Throwable {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 115;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onExtraCallbackWithResult + 47;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            public final Object invokeSuspend(Object obj) throws Throwable {
                int i = 2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                if (i2 != 0) {
                    int i3 = onNavigationEvent + 9;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 != 0 ? i2 != 1 : i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    return obj;
                }
                ResultKt.onNavigationEvent(obj);
                pageScrolled pagescrolled = this.this$0;
                TrackingLogRecord trackingLogRecord = this.$log;
                int i4 = this.$maxRetryCount;
                this.label = 1;
                Object objOnNavigationEvent = pageScrolled.onNavigationEvent(pagescrolled, trackingLogRecord, i4, this);
                if (objOnNavigationEvent != objOnWarmupCompleted) {
                    return objOnNavigationEvent;
                }
                int i5 = onNavigationEvent + 9;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return objOnWarmupCompleted;
            }
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onWarmupCompleted + 113;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0 ? i2 != 1 : i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return obj;
            }
            ResultKt.onNavigationEvent(obj);
            List<TrackingLogRecord> list = this.$chunk;
            pageScrolled pagescrolled = this.this$0;
            int i4 = this.$maxRetryCount;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(maybeUpdateAnimatable.onExtraCallback(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(pagescrolled, (TrackingLogRecord) it.next(), i4, null), 3, (Object) null));
            }
            this.L$0 = access15400.onNavigationEvent(findresandmsg);
            this.label = 1;
            Object objIAuthTabCallback = ResourceCallback.IAuthTabCallback(arrayList, this);
            if (objIAuthTabCallback != objOnWarmupCompleted) {
                return objIAuthTabCallback;
            }
            int i5 = IAuthTabCallback + 31;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 83 / 0;
            }
            return objOnWarmupCompleted;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0138, code lost:
    
        if (r0 != r10) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01a0, code lost:
    
        if (r0 != r10) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01f8, code lost:
    
        if (r0 == r10) goto L91;
     */
    /* JADX WARN: Path cross not found for [B:64:0x01a8, B:76:0x01d1], limit reached: 92 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011f A[Catch: all -> 0x00aa, TryCatch #0 {all -> 0x00aa, blocks: (B:17:0x0077, B:62:0x01a2, B:64:0x01a8, B:66:0x01ae, B:77:0x01d2, B:58:0x0162, B:60:0x0169, B:69:0x01b8, B:70:0x01bc, B:72:0x01c2, B:20:0x0084, B:54:0x013a, B:23:0x0091, B:50:0x0117, B:52:0x011f, B:57:0x014b, B:26:0x009c, B:47:0x00f4, B:29:0x00a6, B:44:0x00dd, B:42:0x00d1), top: B:94:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014b A[Catch: all -> 0x00aa, TRY_ENTER, TryCatch #0 {all -> 0x00aa, blocks: (B:17:0x0077, B:62:0x01a2, B:64:0x01a8, B:66:0x01ae, B:77:0x01d2, B:58:0x0162, B:60:0x0169, B:69:0x01b8, B:70:0x01bc, B:72:0x01c2, B:20:0x0084, B:54:0x013a, B:23:0x0091, B:50:0x0117, B:52:0x011f, B:57:0x014b, B:26:0x009c, B:47:0x00f4, B:29:0x00a6, B:44:0x00dd, B:42:0x00d1), top: B:94:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0169 A[Catch: all -> 0x00aa, TryCatch #0 {all -> 0x00aa, blocks: (B:17:0x0077, B:62:0x01a2, B:64:0x01a8, B:66:0x01ae, B:77:0x01d2, B:58:0x0162, B:60:0x0169, B:69:0x01b8, B:70:0x01bc, B:72:0x01c2, B:20:0x0084, B:54:0x013a, B:23:0x0091, B:50:0x0117, B:52:0x011f, B:57:0x014b, B:26:0x009c, B:47:0x00f4, B:29:0x00a6, B:44:0x00dd, B:42:0x00d1), top: B:94:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x01a0 -> B:62:0x01a2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object IAuthTabCallback(@NotNull access13800<? super IAuthTabCallback> access13800Var) {
        onExtraCallback onextracallback;
        Ref.BooleanRef booleanRef;
        Object objOnNavigationEvent;
        int i;
        Ref.BooleanRef booleanRef2;
        Object objOnExtraCallbackWithResult;
        int i2;
        Ref.BooleanRef booleanRef3;
        int i3;
        List list;
        List list2;
        Ref.BooleanRef booleanRef4;
        int i4;
        int i5;
        int i6;
        Iterable iterable;
        Iterator it;
        boolean z;
        boolean z2;
        int i7 = 2 % 2;
        int i8 = asBinder + 23;
        int i9 = i8 % 128;
        IAuthTabCallbackStub = i9;
        int i10 = i8 % 2;
        if (access13800Var instanceof onExtraCallback) {
            int i11 = i9 + 27;
            asBinder = i11 % 128;
            int i12 = i11 % 2;
            onextracallback = (onExtraCallback) access13800Var;
            int i13 = onextracallback.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                int i14 = asBinder + 95;
                IAuthTabCallbackStub = i14 % 128;
                if (i14 % 2 == 0) {
                    onextracallback.label = i13 >>> Integer.MIN_VALUE;
                } else {
                    onextracallback.label = i13 - 2147483648;
                }
            } else {
                onextracallback = new onExtraCallback(access13800Var);
            }
        }
        Object objOnExtraCallback = onextracallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        try {
            switch (onextracallback.label) {
                case 0:
                    ResultKt.onNavigationEvent(objOnExtraCallback);
                    if (!this.onNavigationEvent.onNavigationEvent()) {
                        int i15 = IAuthTabCallbackStub + 59;
                        asBinder = i15 % 128;
                        if (i15 % 2 == 0) {
                            return IAuthTabCallback.onNavigationEvent.IAuthTabCallback;
                        }
                        int i16 = 8 / 0;
                        return IAuthTabCallback.onNavigationEvent.IAuthTabCallback;
                    }
                    booleanRef = new Ref.BooleanRef();
                    isGutterDrag isgutterdrag = this.onExtraCallbackWithResult;
                    onextracallback.L$0 = booleanRef;
                    onextracallback.label = 1;
                    objOnExtraCallback = isgutterdrag.onExtraCallback(onextracallback);
                    if (objOnExtraCallback != objOnWarmupCompleted) {
                        int iIntValue = ((Number) objOnExtraCallback).intValue();
                        isGutterDrag isgutterdrag2 = this.onExtraCallbackWithResult;
                        onextracallback.L$0 = booleanRef;
                        onextracallback.I$0 = iIntValue;
                        onextracallback.label = 2;
                        objOnNavigationEvent = isgutterdrag2.onNavigationEvent(onextracallback);
                        if (objOnNavigationEvent != objOnWarmupCompleted) {
                            i = iIntValue;
                            booleanRef2 = booleanRef;
                            objOnExtraCallback = objOnNavigationEvent;
                            int iIntValue2 = ((Number) objOnExtraCallback).intValue();
                            performDrag performdrag = this.onNavigationEvent;
                            onextracallback.L$0 = booleanRef2;
                            onextracallback.I$0 = i;
                            onextracallback.I$1 = iIntValue2;
                            onextracallback.label = 3;
                            objOnExtraCallbackWithResult = performDrag.onExtraCallbackWithResult(performdrag, 0L, onextracallback, 1, null);
                            if (objOnExtraCallbackWithResult != objOnWarmupCompleted) {
                                i2 = i;
                                booleanRef3 = booleanRef2;
                                i3 = iIntValue2;
                                objOnExtraCallback = objOnExtraCallbackWithResult;
                                list = (List) objOnExtraCallback;
                                if (!list.isEmpty()) {
                                    performDrag performdrag2 = this.onNavigationEvent;
                                    onextracallback.L$0 = access15400.onNavigationEvent(booleanRef3);
                                    onextracallback.L$1 = access15400.onNavigationEvent(list);
                                    onextracallback.I$0 = i2;
                                    onextracallback.I$1 = i3;
                                    onextracallback.label = 4;
                                    objOnExtraCallback = performdrag2.onExtraCallbackWithResult((access13800<? super Boolean>) onextracallback);
                                    break;
                                } else {
                                    List listChunked = CollectionsKt.chunked(list, i3);
                                    list2 = list;
                                    booleanRef4 = booleanRef3;
                                    i4 = i2;
                                    i5 = i3;
                                    i6 = 0;
                                    iterable = listChunked;
                                    it = listChunked.iterator();
                                    if (!it.hasNext()) {
                                        this.onNavigationEvent.onExtraCallback();
                                        if (!booleanRef4.element) {
                                            performDrag performdrag3 = this.onNavigationEvent;
                                            onextracallback.L$0 = access15400.onNavigationEvent(booleanRef4);
                                            onextracallback.L$1 = null;
                                            onextracallback.L$2 = null;
                                            onextracallback.L$3 = null;
                                            onextracallback.L$4 = null;
                                            onextracallback.L$5 = null;
                                            onextracallback.label = 6;
                                            objOnExtraCallback = performdrag3.onExtraCallbackWithResult((access13800<? super Boolean>) onextracallback);
                                            break;
                                        }
                                        z2 = true;
                                        return new IAuthTabCallback.onWarmupCompleted(z2);
                                    }
                                    Object next = it.next();
                                    List list3 = (List) next;
                                    onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(list3, this, i4, null);
                                    onextracallback.L$0 = booleanRef4;
                                    onextracallback.L$1 = access15400.onNavigationEvent(list2);
                                    onextracallback.L$2 = access15400.onNavigationEvent(iterable);
                                    onextracallback.L$3 = it;
                                    onextracallback.L$4 = access15400.onNavigationEvent(next);
                                    onextracallback.L$5 = access15400.onNavigationEvent(list3);
                                    onextracallback.I$0 = i4;
                                    onextracallback.I$1 = i5;
                                    onextracallback.I$2 = i6;
                                    onextracallback.I$3 = 0;
                                    onextracallback.label = 5;
                                    objOnExtraCallback = findRes.onExtraCallbackWithResult(onextracallbackwithresult, onextracallback);
                                    break;
                                }
                            }
                        }
                    }
                    return objOnWarmupCompleted;
                case 1:
                    booleanRef = (Ref.BooleanRef) onextracallback.L$0;
                    ResultKt.onNavigationEvent(objOnExtraCallback);
                    int iIntValue3 = ((Number) objOnExtraCallback).intValue();
                    isGutterDrag isgutterdrag22 = this.onExtraCallbackWithResult;
                    onextracallback.L$0 = booleanRef;
                    onextracallback.I$0 = iIntValue3;
                    onextracallback.label = 2;
                    objOnNavigationEvent = isgutterdrag22.onNavigationEvent(onextracallback);
                    if (objOnNavigationEvent != objOnWarmupCompleted) {
                    }
                    return objOnWarmupCompleted;
                case 2:
                    int i17 = onextracallback.I$0;
                    Ref.BooleanRef booleanRef5 = (Ref.BooleanRef) onextracallback.L$0;
                    ResultKt.onNavigationEvent(objOnExtraCallback);
                    i = i17;
                    booleanRef2 = booleanRef5;
                    int iIntValue22 = ((Number) objOnExtraCallback).intValue();
                    performDrag performdrag4 = this.onNavigationEvent;
                    onextracallback.L$0 = booleanRef2;
                    onextracallback.I$0 = i;
                    onextracallback.I$1 = iIntValue22;
                    onextracallback.label = 3;
                    objOnExtraCallbackWithResult = performDrag.onExtraCallbackWithResult(performdrag4, 0L, onextracallback, 1, null);
                    if (objOnExtraCallbackWithResult != objOnWarmupCompleted) {
                    }
                    return objOnWarmupCompleted;
                case 3:
                    i3 = onextracallback.I$1;
                    i2 = onextracallback.I$0;
                    booleanRef3 = (Ref.BooleanRef) onextracallback.L$0;
                    ResultKt.onNavigationEvent(objOnExtraCallback);
                    list = (List) objOnExtraCallback;
                    if (!list.isEmpty()) {
                    }
                    break;
                case 4:
                    ResultKt.onNavigationEvent(objOnExtraCallback);
                    return new IAuthTabCallback.onWarmupCompleted(((Boolean) objOnExtraCallback).booleanValue());
                case 5:
                    i6 = onextracallback.I$2;
                    i5 = onextracallback.I$1;
                    i4 = onextracallback.I$0;
                    it = (Iterator) onextracallback.L$3;
                    iterable = (Iterable) onextracallback.L$2;
                    list2 = (List) onextracallback.L$1;
                    booleanRef4 = (Ref.BooleanRef) onextracallback.L$0;
                    ResultKt.onNavigationEvent(objOnExtraCallback);
                    List list4 = (List) objOnExtraCallback;
                    if (!booleanRef4.element) {
                        List list5 = list4;
                        if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                            Iterator it2 = list5.iterator();
                            while (it2.hasNext()) {
                                if (((Boolean) it2.next()).booleanValue()) {
                                }
                            }
                        }
                        z = false;
                        booleanRef4.element = z;
                        if (!it.hasNext()) {
                        }
                        return objOnWarmupCompleted;
                    }
                    z = true;
                    booleanRef4.element = z;
                    if (!it.hasNext()) {
                    }
                    return objOnWarmupCompleted;
                case 6:
                    ResultKt.onNavigationEvent(objOnExtraCallback);
                    if (!((Boolean) objOnExtraCallback).booleanValue()) {
                        z2 = false;
                        return new IAuthTabCallback.onWarmupCompleted(z2);
                    }
                    int i18 = IAuthTabCallbackStub + 41;
                    asBinder = i18 % 128;
                    int i19 = i18 % 2;
                    z2 = true;
                    return new IAuthTabCallback.onWarmupCompleted(z2);
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } finally {
            this.onNavigationEvent.onExtraCallback();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a0, code lost:
    
        if (r0 != r6) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0145, code lost:
    
        if (r5.onWarmupCompleted(r8, (o.access13800<? super kotlin.Unit>) r4) != r6) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0147, code lost:
    
        return r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onExtraCallbackWithResult(TrackingLogRecord trackingLogRecord, int i, access13800<? super Boolean> access13800Var) throws Throwable {
        IAuthTabCallbackDefault iAuthTabCallbackDefault;
        int i2;
        TrackingLogRecord trackingLogRecord2;
        int i3;
        String message;
        TrackingLogRecord trackingLogRecord3 = trackingLogRecord;
        int i4 = 2 % 2;
        if (!(access13800Var instanceof IAuthTabCallbackDefault)) {
            iAuthTabCallbackDefault = new IAuthTabCallbackDefault(access13800Var);
        } else {
            iAuthTabCallbackDefault = (IAuthTabCallbackDefault) access13800Var;
            int i5 = iAuthTabCallbackDefault.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                iAuthTabCallbackDefault.label = i5 - 2147483648;
            }
        }
        Object objIAuthTabCallback = iAuthTabCallbackDefault.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i6 = iAuthTabCallbackDefault.label;
        boolean zBooleanValue = false;
        try {
            if (i6 != 0) {
                int i7 = asBinder;
                int i8 = i7 + 109;
                IAuthTabCallbackStub = i8 % 128;
                int i9 = i8 % 2;
                if (i6 != 1) {
                    int i10 = i7 + 21;
                    IAuthTabCallbackStub = i10 % 128;
                    int i11 = i10 % 2;
                    if (i6 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(objIAuthTabCallback);
                    return access14000.onNavigationEvent(zBooleanValue);
                }
                i3 = iAuthTabCallbackDefault.I$0;
                trackingLogRecord2 = (TrackingLogRecord) iAuthTabCallbackDefault.L$0;
                try {
                    ResultKt.onNavigationEvent(objIAuthTabCallback);
                    i2 = i3;
                    trackingLogRecord3 = trackingLogRecord2;
                } catch (Throwable th) {
                    th = th;
                    ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                    Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("request_id", trackingLogRecord2.access000());
                    Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("entry_id", trackingLogRecord2.onTransact());
                    Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("log_type", trackingLogRecord2.asBinder());
                    message = th.getMessage();
                    if (message == null) {
                        message = th.getClass().getSimpleName();
                    }
                    ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{convertFloatArrayToByteArray, "NativeAdsTrackingFlush", "Native ads tracking log dropped by unrecoverable request build failure", access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, getWrite.IAuthTabCallback("error", message)}), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
                    performDrag performdrag = this.onNavigationEvent;
                    Set<String> setOnExtraCallback = clearFaultAdjacentMetadata.onExtraCallback(trackingLogRecord2.onTransact());
                    iAuthTabCallbackDefault.L$0 = access15400.onNavigationEvent(trackingLogRecord2);
                    iAuthTabCallbackDefault.L$1 = access15400.onNavigationEvent(th);
                    iAuthTabCallbackDefault.I$0 = i3;
                    iAuthTabCallbackDefault.label = 2;
                }
            } else {
                ResultKt.onNavigationEvent(objIAuthTabCallback);
                try {
                    iAuthTabCallbackDefault.L$0 = trackingLogRecord3;
                    i2 = i;
                    try {
                        iAuthTabCallbackDefault.I$0 = i2;
                        iAuthTabCallbackDefault.label = 1;
                        objIAuthTabCallback = IAuthTabCallback(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -723036293, new Object[]{this, trackingLogRecord3, Integer.valueOf(i), iAuthTabCallbackDefault}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 723036295);
                        Object obj = objIAuthTabCallback;
                    } catch (Throwable th2) {
                        th = th2;
                        int i12 = i2;
                        trackingLogRecord2 = trackingLogRecord3;
                        i3 = i12;
                        ConvertFloatArrayToByteArray convertFloatArrayToByteArray2 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback("request_id", trackingLogRecord2.access000());
                        Pair pairIAuthTabCallback22 = getWrite.IAuthTabCallback("entry_id", trackingLogRecord2.onTransact());
                        Pair pairIAuthTabCallback32 = getWrite.IAuthTabCallback("log_type", trackingLogRecord2.asBinder());
                        message = th.getMessage();
                        if (message == null) {
                        }
                        ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{convertFloatArrayToByteArray2, "NativeAdsTrackingFlush", "Native ads tracking log dropped by unrecoverable request build failure", access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback4, pairIAuthTabCallback22, pairIAuthTabCallback32, getWrite.IAuthTabCallback("error", message)}), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
                        performDrag performdrag2 = this.onNavigationEvent;
                        Set<String> setOnExtraCallback2 = clearFaultAdjacentMetadata.onExtraCallback(trackingLogRecord2.onTransact());
                        iAuthTabCallbackDefault.L$0 = access15400.onNavigationEvent(trackingLogRecord2);
                        iAuthTabCallbackDefault.L$1 = access15400.onNavigationEvent(th);
                        iAuthTabCallbackDefault.I$0 = i3;
                        iAuthTabCallbackDefault.label = 2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    i2 = i;
                    int i122 = i2;
                    trackingLogRecord2 = trackingLogRecord3;
                    i3 = i122;
                    ConvertFloatArrayToByteArray convertFloatArrayToByteArray22 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                    Pair pairIAuthTabCallback42 = getWrite.IAuthTabCallback("request_id", trackingLogRecord2.access000());
                    Pair pairIAuthTabCallback222 = getWrite.IAuthTabCallback("entry_id", trackingLogRecord2.onTransact());
                    Pair pairIAuthTabCallback322 = getWrite.IAuthTabCallback("log_type", trackingLogRecord2.asBinder());
                    message = th.getMessage();
                    if (message == null) {
                    }
                    ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{convertFloatArrayToByteArray22, "NativeAdsTrackingFlush", "Native ads tracking log dropped by unrecoverable request build failure", access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback42, pairIAuthTabCallback222, pairIAuthTabCallback322, getWrite.IAuthTabCallback("error", message)}), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
                    performDrag performdrag22 = this.onNavigationEvent;
                    Set<String> setOnExtraCallback22 = clearFaultAdjacentMetadata.onExtraCallback(trackingLogRecord2.onTransact());
                    iAuthTabCallbackDefault.L$0 = access15400.onNavigationEvent(trackingLogRecord2);
                    iAuthTabCallbackDefault.L$1 = access15400.onNavigationEvent(th);
                    iAuthTabCallbackDefault.I$0 = i3;
                    iAuthTabCallbackDefault.label = 2;
                }
            }
            zBooleanValue = ((Boolean) objIAuthTabCallback).booleanValue();
            return access14000.onNavigationEvent(zBooleanValue);
        } catch (CancellationException e) {
            throw e;
        }
    }

    private static final RequestBody IAuthTabCallback(Lazy<? extends RequestBody> lazy) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 97;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        RequestBody requestBody = (RequestBody) lazy.getValue();
        int i4 = asBinder + 95;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 31 / 0;
        }
        return requestBody;
    }

    private static final RequestBody IAuthTabCallback(TrackingLogRecord trackingLogRecord, pageScrolled pagescrolled) {
        RequestBody requestBodyOnExtraCallback;
        int i = 2 % 2;
        String strAsInterface = trackingLogRecord.asInterface();
        if (strAsInterface == null || (requestBodyOnExtraCallback = pagescrolled.IAuthTabCallback.onExtraCallback(strAsInterface)) == null) {
            RequestBody requestBodyOnNavigationEvent = enableLayers.onNavigationEvent(pagescrolled.IAuthTabCallback, trackingLogRecord.asBinder(), trackingLogRecord.IAuthTabCallbackDefault(), (String) null, ViewPager.IAuthTabCallback.IAuthTabCallback(trackingLogRecord.onWarmupCompleted()), 4, (Object) null);
            int i2 = IAuthTabCallbackStub + 33;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return requestBodyOnNavigationEvent;
        }
        int i4 = IAuthTabCallbackStub + 93;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return requestBodyOnExtraCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        if ((r7 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r7 = 55 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        r0 = r6.IAuthTabCallbackStub();
        r5 = new java.lang.Object[1];
        a(new int[]{0, 3, 69, 0}, false, new byte[]{0, 0, 1}, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r0, ((java.lang.String) r5[0]).intern()) == true) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0067, code lost:
    
        return r7.IAuthTabCallback.onNavigationEvent(r6.access000(), r10, IAuthTabCallback(r9), !r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
    
        return r7.IAuthTabCallback.onNavigationEvent(r6.access000(), r10, (okhttp3.RequestBody) null, !r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r6.onNavigationEvent() != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r6.onNavigationEvent() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r6 = r7.IAuthTabCallback.IAuthTabCallback(r10);
        r7 = o.pageScrolled.IAuthTabCallbackStub + 71;
        o.pageScrolled.asBinder = r7 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Request onExtraCallbackWithResult(TrackingLogRecord trackingLogRecord, pageScrolled pagescrolled, boolean z, Lazy<? extends RequestBody> lazy, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 9;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 27 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(boolean z, TrackingLogRecord trackingLogRecord, String str, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 39;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 44 / 0;
            if (z) {
                determineTargetPage.onExtraCallbackWithResult(determineTargetPage.IAuthTabCallback, trackingLogRecord.access000(), trackingLogRecord.onTransact(), str, "fire_requested", "cache", i, null, 64, null);
                int i5 = asBinder + 73;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
            }
        } else if (z) {
        }
        Unit unit = Unit.INSTANCE;
        int i7 = asBinder + 111;
        IAuthTabCallbackStub = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    private static final Request onWarmupCompleted(String str, TrackingLogRecord trackingLogRecord, pageScrolled pagescrolled, boolean z, Lazy lazy, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asBinder + 101;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Request requestOnExtraCallbackWithResult = onExtraCallbackWithResult(trackingLogRecord, pagescrolled, z, lazy, str);
        int i5 = asBinder + 95;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return requestOnExtraCallbackWithResult;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(25:33|(2:35|(1:40)(1:41))(2:38|(0)(0))|42|129|43|44|127|45|46|123|47|48|115|49|50|121|51|52|119|53|54|125|55|56|(9:58|113|59|60|(0)(0)|(0)(0)|67|95|(0)(0))(2:72|105)) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:(3:117|16|17)|113|59|60|(1:62)(1:63)|(1:65)(1:66)|67|95|(2:100|101)(4:(1:98)|99|31|(25:33|(2:35|(1:40)(1:41))(2:38|(0)(0))|42|129|43|44|127|45|46|123|47|48|115|49|50|121|51|52|119|53|54|125|55|56|(9:58|113|59|60|(0)(0)|(0)(0)|67|95|(0)(0))(2:72|105))(2:103|(1:132)(5:106|107|(1:110)|111|112)))) */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0426, code lost:
    
        r0 = r9;
        r21 = null;
        r45 = r11;
        r11 = r32;
        r32 = r10;
        o.ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, com.google.android.gms.internal.ads.zzgc.onExtraCallbackWithResult(), 1349100616, new java.lang.Object[]{r2, "NativeAdsTrackingFlush", "Native ads tracking url dropped by unrecoverable request build failure", o.access8100.onWarmupCompleted(new kotlin.Pair[]{r3, r4, r5, o.getWrite.IAuthTabCallback("error", r6)}), null, r27, null, 56, null}, com.google.android.gms.internal.ads.zzgc.onExtraCallbackWithResult(), com.google.android.gms.internal.ads.zzgc.onExtraCallbackWithResult(), com.google.android.gms.internal.ads.zzgc.onExtraCallbackWithResult());
        r4 = r42;
        IAuthTabCallback(im.toss.splittarget.impl.fsm.AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 112330651, new java.lang.Object[]{r4, r0, new o.getPageTitle(new o.unregisterDataSetObserver.onExtraCallback(-1), 1)}, im.toss.splittarget.impl.fsm.AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), im.toss.splittarget.impl.fsm.AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), im.toss.splittarget.impl.fsm.AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -112330651);
        r9 = r45;
        r8 = r1;
        r7 = r18;
        r6 = r23;
        r5 = r24;
        r23 = r26;
        r3 = r28;
        r26 = r30;
        r2 = r31;
        r10 = false;
        r1 = r0;
        r18 = r15;
        r0 = r25;
        r25 = r29;
        r15 = r14;
        r14 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x02d0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02d1, code lost:
    
        r32 = r7;
        r42 = r34;
        r15 = r18;
        r18 = r14;
        r14 = r28;
        r28 = r25;
        r25 = r11;
        r11 = r8;
        r43 = r12;
        r12 = r9;
        r9 = r6;
        r31 = r30;
        r30 = r29;
        r29 = r26;
        r26 = r23;
        r23 = r43;
        r44 = r24;
        r24 = r10;
        r10 = r44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x02ff, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0300, code lost:
    
        r32 = r31;
        r42 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0305, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0306, code lost:
    
        r32 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0308, code lost:
    
        r42 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x030d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x030e, code lost:
    
        r32 = r31;
        r5 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0313, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0314, code lost:
    
        r32 = r31;
        r5 = r33;
        r42 = r34;
        r4 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x031d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x031f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0320, code lost:
    
        r2 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0322, code lost:
    
        r3 = r32;
        r5 = r33;
        r42 = r34;
        r4 = r35;
        r32 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x032f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0330, code lost:
    
        r32 = r10;
        r42 = r12;
        r2 = r24;
        r10 = r3;
        r3 = r4;
        r12 = r6;
        r4 = r14;
        r14 = r7;
        r43 = r9;
        r9 = r5;
        r5 = r43;
        r44 = r27;
        r27 = r11;
        r11 = r44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0348, code lost:
    
        r31 = r2;
        r24 = r9;
        r15 = r18;
        r29 = r25;
        r30 = r26;
        r9 = r1;
        r26 = r3;
        r1 = r8;
        r25 = r11;
        r18 = r14;
        r14 = r28;
        r11 = r5;
        r28 = r10;
        r10 = r23;
        r23 = r12;
        r12 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x038c, code lost:
    
        r6 = new kotlin.Pair[]{r3, r4, r5, o.getWrite.IAuthTabCallback("error", r0.getClass().getSimpleName())};
        r0 = r9;
        r21 = null;
        r45 = r11;
        r11 = r32;
        r32 = r10;
        o.ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, com.google.android.gms.internal.ads.zzgc.onExtraCallbackWithResult(), 1349100616, new java.lang.Object[]{r2, "NativeAdsTrackingFlush", "Native ads tracking url dropped by unrecoverable request build failure", o.access8100.onWarmupCompleted(r6), null, r27, null, 56, null}, com.google.android.gms.internal.ads.zzgc.onExtraCallbackWithResult(), com.google.android.gms.internal.ads.zzgc.onExtraCallbackWithResult(), com.google.android.gms.internal.ads.zzgc.onExtraCallbackWithResult());
        r4 = r42;
        IAuthTabCallback(im.toss.splittarget.impl.fsm.AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 112330651, new java.lang.Object[]{r4, r0, new o.getPageTitle(new o.unregisterDataSetObserver.onExtraCallback(-1), 1)}, im.toss.splittarget.impl.fsm.AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), im.toss.splittarget.impl.fsm.AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), im.toss.splittarget.impl.fsm.AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -112330651);
        r9 = r45;
        r8 = r1;
        r7 = r18;
        r6 = r23;
        r5 = r24;
        r23 = r26;
        r3 = r28;
        r26 = r30;
        r2 = r31;
        r10 = false;
        r1 = r0;
        r18 = r15;
        r0 = r25;
        r25 = r29;
        r15 = r14;
        r14 = r12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01a6 A[PHI: r0 r2
      0x01a6: PHI (r0v24 java.lang.Object) = (r0v23 java.lang.Object), (r0v40 java.lang.Object) binds: [B:39:0x01a4, B:36:0x019a] A[DONT_GENERATE, DONT_INLINE]
      0x01a6: PHI (r2v20 java.lang.String) = (r2v19 java.lang.String), (r2v33 java.lang.String) binds: [B:39:0x01a4, B:36:0x019a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ad A[PHI: r0 r2
      0x01ad: PHI (r0v38 java.lang.Object) = (r0v23 java.lang.Object), (r0v40 java.lang.Object) binds: [B:39:0x01a4, B:36:0x019a] A[DONT_GENERATE, DONT_INLINE]
      0x01ad: PHI (r2v30 java.lang.String) = (r2v19 java.lang.String), (r2v33 java.lang.String) binds: [B:39:0x01a4, B:36:0x019a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0434  */
    /* JADX WARN: Type inference failed for: r24v9, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0259 -> B:113:0x026c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        onNavigationEvent onnavigationevent;
        String str;
        Object obj;
        Object obj2;
        Object obj3;
        int i;
        int i2;
        String str2;
        final TrackingLogRecord trackingLogRecord;
        int i3;
        Iterator it;
        int i4;
        int i5;
        Lazy lazy;
        boolean z;
        ArrayList arrayList;
        onNavigationEvent onnavigationevent2;
        Boolean bool;
        boolean z2;
        Boolean bool2;
        char c;
        List list;
        TrackingLogRecord trackingLogRecord2;
        int i6;
        Object obj4;
        Object next;
        String str3;
        Object obj5;
        final String str4;
        String str5;
        final boolean z3;
        int i7;
        int i8;
        Object obj6;
        pageScrolled pagescrolled;
        Object obj7;
        Lazy lazy2;
        Object obj8;
        Object obj9;
        getPageTitle getpagetitle;
        Object obj10;
        TrackingLogRecord trackingLogRecord3;
        ArrayList arrayList2;
        int i9;
        Iterator it2;
        int i10;
        String str6;
        int i11;
        boolean z4;
        Object obj11;
        Boolean bool3 = false;
        final pageScrolled pagescrolled2 = (pageScrolled) objArr[0];
        final TrackingLogRecord trackingLogRecord4 = (TrackingLogRecord) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        onNavigationEvent onnavigationevent3 = (access13800) objArr[3];
        int i12 = 2 % 2;
        if (onnavigationevent3 instanceof onNavigationEvent) {
            onnavigationevent = onnavigationevent3;
            int i13 = onnavigationevent.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                onnavigationevent.label = i13 - 2147483648;
            } else {
                onnavigationevent = pagescrolled2.new onNavigationEvent(onnavigationevent3);
            }
        }
        ?? r3 = onnavigationevent.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i14 = onnavigationevent.label;
        String str7 = "log_type";
        String str8 = "request_id";
        if (i14 == 0) {
            ResultKt.onNavigationEvent((Object) r3);
            int i15 = (Intrinsics.areEqual(trackingLogRecord4.asBinder(), "CLICK") && trackingLogRecord4.onNavigationEvent()) ? 1 : 0;
            boolean zAreEqual = Intrinsics.areEqual(trackingLogRecord4.asBinder(), "WEB_EVENT");
            int i16 = ((Integer) TrackingLogRecord.IAuthTabCallback(new Object[]{trackingLogRecord4}, _string.onNavigationEvent.IAuthTabCallback(), 239726099, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -239726098)).intValue() + 1 >= iIntValue ? 0 : 1;
            Lazy lazyOnExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.ads_sdk.log.NativeAdsTrackingLogFlusher$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                public final Object invoke() {
                    int i17 = 2 % 2;
                    int i18 = onExtraCallback + 23;
                    IAuthTabCallback = i18 % 128;
                    int i19 = i18 % 2;
                    RequestBody requestBodyOnExtraCallbackWithResult = pageScrolled.onExtraCallbackWithResult(trackingLogRecord4, pagescrolled2);
                    int i20 = IAuthTabCallback + 113;
                    onExtraCallback = i20 % 128;
                    int i21 = i20 % 2;
                    return requestBodyOnExtraCallbackWithResult;
                }
            });
            List<String> listIAuthTabCallbackStubProxy = trackingLogRecord4.IAuthTabCallbackStubProxy();
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = listIAuthTabCallbackStubProxy.iterator();
            str = "log_type";
            obj = listIAuthTabCallbackStubProxy;
            obj2 = obj;
            obj3 = "entry_id";
            i = 0;
            i2 = i15;
            str2 = "request_id";
            trackingLogRecord = trackingLogRecord4;
            i3 = i16;
            it = it3;
            i4 = 0;
            i5 = iIntValue;
            lazy = lazyOnExtraCallbackWithResult;
            onNavigationEvent onnavigationevent4 = onnavigationevent;
            z = zAreEqual;
            arrayList = arrayList3;
            onnavigationevent2 = onnavigationevent4;
            if (it.hasNext()) {
            }
        } else {
            if (i14 != 1) {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i6 = onnavigationevent.I$0;
                list = (List) onnavigationevent.L$2;
                trackingLogRecord2 = (TrackingLogRecord) onnavigationevent.L$0;
                ResultKt.onNavigationEvent((Object) r3);
                bool2 = bool3;
                obj4 = "entry_id";
                c = 4;
                obj11 = r3;
                boolean zBooleanValue = ((Boolean) obj11).booleanValue();
                if (!list.isEmpty() && !zBooleanValue) {
                    ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                    Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(str8, trackingLogRecord2.access000());
                    Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(obj4, trackingLogRecord2.onTransact());
                    Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(str7, trackingLogRecord2.asBinder());
                    Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback("retry_count", access14000.onNavigationEvent(((Integer) TrackingLogRecord.IAuthTabCallback(new Object[]{trackingLogRecord2}, _string.onNavigationEvent.IAuthTabCallback(), 239726099, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -239726098)).intValue() + 1));
                    Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback("max_retry_count", access14000.onNavigationEvent(i6));
                    Pair pairIAuthTabCallback6 = getWrite.IAuthTabCallback("remaining_url_count", access14000.onNavigationEvent(list.size()));
                    Pair[] pairArr = new Pair[6];
                    pairArr[0] = pairIAuthTabCallback;
                    pairArr[1] = pairIAuthTabCallback2;
                    pairArr[2] = pairIAuthTabCallback3;
                    pairArr[3] = pairIAuthTabCallback4;
                    pairArr[c] = pairIAuthTabCallback5;
                    pairArr[5] = pairIAuthTabCallback6;
                    ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{convertFloatArrayToByteArray, "NativeAdsTrackingFlush", "Native ads tracking log dropped after max retry", access8100.onWarmupCompleted(pairArr), null, bool2, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
                    int i17 = asBinder + 23;
                    IAuthTabCallbackStub = i17 % 128;
                    int i18 = i17 % 2;
                }
                return access14000.onNavigationEvent(zBooleanValue);
            }
            int i19 = onnavigationevent.I$4;
            int i20 = onnavigationevent.I$3;
            int i21 = onnavigationevent.I$2;
            boolean z5 = onnavigationevent.Z$0;
            int i22 = onnavigationevent.I$1;
            int i23 = onnavigationevent.I$0;
            String str9 = (String) onnavigationevent.L$7;
            Object obj12 = onnavigationevent.L$6;
            Iterator it4 = (Iterator) onnavigationevent.L$5;
            ?? r24 = (Collection) onnavigationevent.L$4;
            Object obj13 = (Iterable) onnavigationevent.L$3;
            Object obj14 = (Iterable) onnavigationevent.L$2;
            Lazy lazy3 = (Lazy) onnavigationevent.L$1;
            TrackingLogRecord trackingLogRecord5 = (TrackingLogRecord) onnavigationevent.L$0;
            try {
                try {
                    ResultKt.onNavigationEvent((Object) r3);
                    pagescrolled = pagescrolled2;
                    obj9 = obj14;
                    lazy2 = lazy3;
                    i7 = i22;
                    bool = bool3;
                    obj6 = obj12;
                    obj10 = obj13;
                    i10 = i20;
                    i8 = i21;
                    arrayList2 = r24;
                    i9 = i19;
                    obj8 = "entry_id";
                    str2 = "request_id";
                    obj7 = objOnWarmupCompleted;
                    it2 = it4;
                    onnavigationevent2 = onnavigationevent;
                    str6 = str9;
                    z2 = z5;
                    str5 = "log_type";
                    trackingLogRecord3 = trackingLogRecord5;
                    getpagetitle = r3;
                } catch (Throwable th) {
                    Throwable th2 = th;
                    int i24 = i22;
                    Object obj15 = objOnWarmupCompleted;
                    pageScrolled pagescrolled3 = pagescrolled2;
                    Object obj16 = "entry_id";
                    Object obj17 = obj13;
                    Object obj18 = obj14;
                    Lazy lazy4 = lazy3;
                    TrackingLogRecord trackingLogRecord6 = trackingLogRecord5;
                    int i25 = i20;
                    int i26 = i21;
                    bool = bool3;
                    Object obj19 = obj12;
                    boolean z6 = z5;
                    ArrayList arrayList4 = r24;
                    int i27 = i19;
                    String str10 = "log_type";
                    String str11 = "request_id";
                    Iterator it5 = it4;
                    onnavigationevent2 = onnavigationevent;
                    ConvertFloatArrayToByteArray convertFloatArrayToByteArray2 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                    Pair pairIAuthTabCallback7 = getWrite.IAuthTabCallback(str11, trackingLogRecord6.access000());
                    Pair pairIAuthTabCallback8 = getWrite.IAuthTabCallback(obj16, trackingLogRecord6.onTransact());
                    Pair pairIAuthTabCallback9 = getWrite.IAuthTabCallback(str10, trackingLogRecord6.asBinder());
                    String message = th2.getMessage();
                    if (message == null) {
                    }
                    i11 = asBinder + 109;
                    TrackingLogRecord trackingLogRecord7 = trackingLogRecord;
                    IAuthTabCallbackStub = i11 % 128;
                    if (i11 % 2 == 0) {
                    }
                }
                getPageTitle getpagetitle2 = getpagetitle;
                pageScrolled pagescrolled4 = pagescrolled;
                IAuthTabCallback(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 112330651, new Object[]{pagescrolled4, trackingLogRecord3, getpagetitle2}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -112330651);
                boolean z7 = i7 == 0;
                if (i8 == 0) {
                    int i28 = IAuthTabCallbackStub + 73;
                    asBinder = i28 % 128;
                    int i29 = i28 % 2;
                    z4 = true;
                } else {
                    z4 = false;
                }
                TrackingLogRecord trackingLogRecord8 = trackingLogRecord3;
                Object obj20 = obj7;
                boolean zOnExtraCallback = pagescrolled4.onExtraCallback(trackingLogRecord3, str6, getpagetitle2, z7, z4);
                it = it2;
                i2 = i7;
                i3 = i8;
                arrayList = arrayList2;
                obj = obj10;
                str = str5;
                obj2 = obj9;
                lazy = lazy2;
                pageScrolled pagescrolled5 = pagescrolled4;
                Throwable th3 = null;
                boolean z8 = zOnExtraCallback;
                i4 = i10;
                Object obj21 = obj6;
                Object obj22 = obj20;
                i = i9;
                Object obj23 = obj8;
                i5 = i23;
                TrackingLogRecord trackingLogRecord9 = trackingLogRecord8;
                i11 = asBinder + 109;
                TrackingLogRecord trackingLogRecord72 = trackingLogRecord9;
                IAuthTabCallbackStub = i11 % 128;
                if (i11 % 2 == 0) {
                    th3.hashCode();
                    throw th3;
                }
                if (z8) {
                    arrayList.add(obj21);
                }
                trackingLogRecord = trackingLogRecord72;
                pagescrolled2 = pagescrolled5;
                objOnWarmupCompleted = obj22;
                z = z2;
                bool3 = bool;
                obj3 = obj23;
                if (it.hasNext()) {
                    int i30 = i3;
                    bool2 = bool3;
                    String str12 = str;
                    c = 4;
                    Object obj24 = objOnWarmupCompleted;
                    ArrayList arrayList5 = arrayList;
                    boolean z9 = z;
                    pageScrolled pagescrolled6 = pagescrolled2;
                    int i31 = i2;
                    ArrayList arrayList6 = arrayList5;
                    performDrag performdrag = pagescrolled6.onNavigationEvent;
                    String strOnTransact = trackingLogRecord.onTransact();
                    List listMinus = CollectionsKt.minus(trackingLogRecord.IAuthTabCallbackStubProxy(), CollectionsKt.toSet(arrayList6));
                    onnavigationevent2.L$0 = trackingLogRecord;
                    onnavigationevent2.L$1 = access15400.onNavigationEvent(lazy);
                    onnavigationevent2.L$2 = arrayList6;
                    onnavigationevent2.L$3 = null;
                    onnavigationevent2.L$4 = null;
                    onnavigationevent2.L$5 = null;
                    onnavigationevent2.L$6 = null;
                    onnavigationevent2.L$7 = null;
                    onnavigationevent2.L$8 = null;
                    onnavigationevent2.I$0 = i5;
                    onnavigationevent2.I$1 = i31;
                    onnavigationevent2.Z$0 = z9;
                    onnavigationevent2.I$2 = i30;
                    onnavigationevent2.label = 2;
                    Object objOnNavigationEvent = performDrag.onNavigationEvent(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{performdrag, strOnTransact, listMinus, Integer.valueOf(i5), onnavigationevent2}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 896653985, -896653985, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent());
                    if (objOnNavigationEvent == obj24) {
                        return obj24;
                    }
                    list = arrayList6;
                    trackingLogRecord2 = trackingLogRecord;
                    i6 = i5;
                    str8 = str2;
                    obj4 = obj3;
                    str7 = str12;
                    obj11 = objOnNavigationEvent;
                    boolean zBooleanValue2 = ((Boolean) obj11).booleanValue();
                    if (!list.isEmpty()) {
                        ConvertFloatArrayToByteArray convertFloatArrayToByteArray3 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                        Pair pairIAuthTabCallback10 = getWrite.IAuthTabCallback(str8, trackingLogRecord2.access000());
                        Pair pairIAuthTabCallback22 = getWrite.IAuthTabCallback(obj4, trackingLogRecord2.onTransact());
                        Pair pairIAuthTabCallback32 = getWrite.IAuthTabCallback(str7, trackingLogRecord2.asBinder());
                        Pair pairIAuthTabCallback42 = getWrite.IAuthTabCallback("retry_count", access14000.onNavigationEvent(((Integer) TrackingLogRecord.IAuthTabCallback(new Object[]{trackingLogRecord2}, _string.onNavigationEvent.IAuthTabCallback(), 239726099, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -239726098)).intValue() + 1));
                        Pair pairIAuthTabCallback52 = getWrite.IAuthTabCallback("max_retry_count", access14000.onNavigationEvent(i6));
                        Pair pairIAuthTabCallback62 = getWrite.IAuthTabCallback("remaining_url_count", access14000.onNavigationEvent(list.size()));
                        Pair[] pairArr2 = new Pair[6];
                        pairArr2[0] = pairIAuthTabCallback10;
                        pairArr2[1] = pairIAuthTabCallback22;
                        pairArr2[2] = pairIAuthTabCallback32;
                        pairArr2[3] = pairIAuthTabCallback42;
                        pairArr2[c] = pairIAuthTabCallback52;
                        pairArr2[5] = pairIAuthTabCallback62;
                        ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{convertFloatArrayToByteArray3, "NativeAdsTrackingFlush", "Native ads tracking log dropped after max retry", access8100.onWarmupCompleted(pairArr2), null, bool2, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
                        int i172 = asBinder + 23;
                        IAuthTabCallbackStub = i172 % 128;
                        int i182 = i172 % 2;
                    }
                    return access14000.onNavigationEvent(zBooleanValue2);
                }
                int i32 = asBinder + 15;
                final Lazy lazy5 = lazy;
                IAuthTabCallbackStub = i32 % 128;
                if (i32 % 2 == 0) {
                    next = it.next();
                    str3 = (String) next;
                    int i33 = 18 / 0;
                    if (i2 != 0) {
                        obj5 = next;
                        str4 = str3;
                        str5 = str;
                        z3 = true;
                    } else {
                        obj5 = next;
                        str4 = str3;
                        str5 = str;
                        z3 = false;
                    }
                } else {
                    next = it.next();
                    str3 = (String) next;
                    if (i2 != 0) {
                    }
                }
                Function1 function1 = new Function1() { // from class: im.toss.ads_sdk.log.NativeAdsTrackingLogFlusher$$ExternalSyntheticLambda1
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallback;

                    public final Object invoke(Object obj25) throws Throwable {
                        int i34 = 2 % 2;
                        int i35 = onExtraCallback + 121;
                        IAuthTabCallback = i35 % 128;
                        int i36 = i35 % 2;
                        boolean z10 = z3;
                        if (i36 != 0) {
                            return pageScrolled.onExtraCallbackWithResult(z10, trackingLogRecord, str4, ((Integer) obj25).intValue());
                        }
                        pageScrolled.onExtraCallbackWithResult(z10, trackingLogRecord, str4, ((Integer) obj25).intValue());
                        Object obj26 = null;
                        obj26.hashCode();
                        throw null;
                    }
                };
                enableLayers enablelayers = pagescrolled2.IAuthTabCallback;
                Object obj25 = obj5;
                bool = bool3;
                obj6 = obj25;
                Object obj26 = objOnWarmupCompleted;
                ArrayList arrayList7 = arrayList;
                final String str13 = str4;
                final boolean z10 = z;
                final TrackingLogRecord trackingLogRecord10 = trackingLogRecord;
                int i34 = i;
                Iterator it6 = it;
                final pageScrolled pagescrolled7 = pagescrolled2;
                pagescrolled = pagescrolled2;
                i7 = i2;
                int i35 = i4;
                i8 = i3;
                Function1 function12 = new Function1() { // from class: im.toss.ads_sdk.log.NativeAdsTrackingLogFlusher$$ExternalSyntheticLambda2
                    private static int onExtraCallbackWithResult = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj27) {
                        int i36 = 2 % 2;
                        int i37 = onNavigationEvent + 113;
                        onExtraCallbackWithResult = i37 % 128;
                        int i38 = i37 % 2;
                        String str14 = str13;
                        TrackingLogRecord trackingLogRecord11 = trackingLogRecord10;
                        pageScrolled pagescrolled8 = pagescrolled7;
                        boolean z11 = z10;
                        Object[] objArr2 = {str14, trackingLogRecord11, pagescrolled8, Boolean.valueOf(z11), lazy5, Integer.valueOf(((Integer) obj27).intValue())};
                        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
                        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
                        Request request = (Request) pageScrolled.IAuthTabCallback(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 631462357, objArr2, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted, iOnWarmupCompleted2, -631462356);
                        int i39 = onExtraCallbackWithResult + 99;
                        onNavigationEvent = i39 % 128;
                        if (i39 % 2 != 0) {
                            return request;
                        }
                        throw null;
                    }
                };
                onnavigationevent2.L$0 = trackingLogRecord;
                Lazy lazy6 = lazy5;
                onnavigationevent2.L$1 = lazy6;
                onnavigationevent2.L$2 = access15400.onNavigationEvent(obj2);
                onnavigationevent2.L$3 = access15400.onNavigationEvent(obj);
                onnavigationevent2.L$4 = arrayList7;
                onnavigationevent2.L$5 = it6;
                onnavigationevent2.L$6 = obj6;
                onnavigationevent2.L$7 = str4;
                onnavigationevent2.L$8 = access15400.onNavigationEvent(function1);
                onnavigationevent2.I$0 = i5;
                onnavigationevent2.I$1 = i7;
                boolean z11 = z10;
                onnavigationevent2.Z$0 = z11;
                onnavigationevent2.I$2 = i8;
                int i36 = i35;
                onnavigationevent2.I$3 = i36;
                int i37 = i34;
                onnavigationevent2.I$4 = i37;
                onnavigationevent2.I$5 = 0;
                onnavigationevent2.label = 1;
                Object[] objArr2 = new Object[7];
                objArr2[0] = enablelayers;
                objArr2[1] = function1;
                objArr2[2] = null;
                objArr2[3] = function12;
                objArr2[4] = onnavigationevent2;
                objArr2[5] = 2;
                objArr2[6] = null;
                ?? OnNavigationEvent = enableLayers.onNavigationEvent(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -2146488407, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), objArr2, 2146488408);
                obj7 = obj26;
                if (OnNavigationEvent == obj7) {
                    return obj7;
                }
                lazy2 = lazy6;
                obj8 = obj3;
                obj9 = obj2;
                z2 = z11;
                getpagetitle = OnNavigationEvent;
                obj10 = obj;
                trackingLogRecord3 = trackingLogRecord;
                i23 = i5;
                arrayList2 = arrayList7;
                i9 = i37;
                it2 = it6;
                i10 = i36;
                str6 = str4;
                getPageTitle getpagetitle22 = getpagetitle;
                pageScrolled pagescrolled42 = pagescrolled;
                IAuthTabCallback(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 112330651, new Object[]{pagescrolled42, trackingLogRecord3, getpagetitle22}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -112330651);
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                TrackingLogRecord trackingLogRecord82 = trackingLogRecord3;
                Object obj202 = obj7;
                boolean zOnExtraCallback2 = pagescrolled42.onExtraCallback(trackingLogRecord3, str6, getpagetitle22, z7, z4);
                it = it2;
                i2 = i7;
                i3 = i8;
                arrayList = arrayList2;
                obj = obj10;
                str = str5;
                obj2 = obj9;
                lazy = lazy2;
                pageScrolled pagescrolled52 = pagescrolled42;
                Throwable th32 = null;
                boolean z82 = zOnExtraCallback2;
                i4 = i10;
                Object obj212 = obj6;
                Object obj222 = obj202;
                i = i9;
                Object obj232 = obj8;
                i5 = i23;
                TrackingLogRecord trackingLogRecord92 = trackingLogRecord82;
                i11 = asBinder + 109;
                TrackingLogRecord trackingLogRecord722 = trackingLogRecord92;
                IAuthTabCallbackStub = i11 % 128;
                if (i11 % 2 == 0) {
                }
            } catch (CancellationException e) {
                throw e;
            }
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        TrackingLogRecord trackingLogRecord = (TrackingLogRecord) objArr[1];
        getPageTitle getpagetitle = (getPageTitle) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 21;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            if (completeScroll.onNavigationEvent.onNavigationEvent() == null) {
                int i3 = IAuthTabCallbackStub + 45;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
                return null;
            }
            try {
                Result.Companion companion = kotlin.Result.Companion;
                trackingLogRecord.access000();
                trackingLogRecord.asBinder();
                getpagetitle.onExtraCallback();
                kotlin.Result.constructor-impl(Unit.INSTANCE);
                return null;
            } catch (Throwable th) {
                Result.Companion companion2 = kotlin.Result.Companion;
                kotlin.Result.constructor-impl(ResultKt.createFailure(th));
                return null;
            }
        }
        completeScroll.onNavigationEvent.onNavigationEvent();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final boolean onExtraCallback(TrackingLogRecord trackingLogRecord, String str, getPageTitle getpagetitle, boolean z, boolean z2) throws Throwable {
        int i = 2 % 2;
        unregisterDataSetObserver unregisterdatasetobserverOnExtraCallback = getpagetitle.onExtraCallback();
        if (Intrinsics.areEqual(unregisterdatasetobserverOnExtraCallback, unregisterDataSetObserver.onExtraCallbackWithResult.onExtraCallback)) {
            if (z) {
                determineTargetPage.onExtraCallbackWithResult(determineTargetPage.IAuthTabCallback, trackingLogRecord.access000(), trackingLogRecord.onTransact(), str, "fire_succeeded", "cache", getpagetitle.onWarmupCompleted(), null, 64, null);
            }
            return false;
        }
        if (unregisterdatasetobserverOnExtraCallback instanceof unregisterDataSetObserver.onExtraCallback) {
            unregisterDataSetObserver.onExtraCallback onextracallback = (unregisterDataSetObserver.onExtraCallback) unregisterdatasetobserverOnExtraCallback;
            ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "NativeAdsTrackingFlush", "Native ads tracking log dropped by terminal response", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("request_id", trackingLogRecord.access000()), getWrite.IAuthTabCallback("entry_id", trackingLogRecord.onTransact()), getWrite.IAuthTabCallback("log_type", trackingLogRecord.asBinder()), getWrite.IAuthTabCallback("status_code", Integer.valueOf(onextracallback.onWarmupCompleted()))}), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
            if (z) {
                int i2 = asBinder + 91;
                IAuthTabCallbackStub = i2 % 128;
                int i3 = i2 % 2;
                determineTargetPage.IAuthTabCallback.onExtraCallback(trackingLogRecord.access000(), trackingLogRecord.onTransact(), str, "fire_failed", "cache", getpagetitle.onWarmupCompleted(), access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("failure_type", "terminal"), getWrite.IAuthTabCallback("status_code", Integer.valueOf(onextracallback.onWarmupCompleted())), getWrite.IAuthTabCallback("will_keep_cache", Boolean.FALSE)}));
            }
            return false;
        }
        if (Intrinsics.areEqual(unregisterdatasetobserverOnExtraCallback, unregisterDataSetObserver.onWarmupCompleted.IAuthTabCallback)) {
            if (z) {
                determineTargetPage.IAuthTabCallback.onExtraCallback(trackingLogRecord.access000(), trackingLogRecord.onTransact(), str, "fire_failed", "cache", getpagetitle.onWarmupCompleted(), access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("failure_type", "network"), getWrite.IAuthTabCallback("will_keep_cache", Boolean.valueOf(z2)), getWrite.IAuthTabCallback("retry_count", Integer.valueOf(((Integer) TrackingLogRecord.IAuthTabCallback(new Object[]{trackingLogRecord}, _string.onNavigationEvent.IAuthTabCallback(), 239726099, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -239726098)).intValue() + 1))}));
                int i4 = asBinder + 19;
                IAuthTabCallbackStub = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 59 / 0;
                }
                return z2;
            }
        } else {
            if (!Intrinsics.areEqual(unregisterdatasetobserverOnExtraCallback, unregisterDataSetObserver.IAuthTabCallback.onNavigationEvent)) {
                throw new NoWhenBranchMatchedException();
            }
            if (z) {
                determineTargetPage.IAuthTabCallback.onExtraCallback(trackingLogRecord.access000(), trackingLogRecord.onTransact(), str, "fire_failed", "cache", getpagetitle.onWarmupCompleted(), access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("failure_type", "server"), getWrite.IAuthTabCallback("will_keep_cache", Boolean.valueOf(z2)), getWrite.IAuthTabCallback("retry_count", Integer.valueOf(((Integer) TrackingLogRecord.IAuthTabCallback(new Object[]{trackingLogRecord}, _string.onNavigationEvent.IAuthTabCallback(), 239726099, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -239726098)).intValue() + 1))}));
            }
        }
        return z2;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = onExtraCallback;
        char c = '0';
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 63;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - KeyEvent.getDeadChar(0, 0)), TextUtils.indexOf("", c, 0, 0) + 36, 14239 - TextUtils.indexOf("", ""), -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i7 >>>= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr[i7])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 35282), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 34, AndroidCharacter.getMirror('0') + 14191, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i7++;
                }
                c = '0';
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c2 = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - View.MeasureSpec.getMode(0)), 65 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getPressedStateDuration() >> 16) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i9] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                } else {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 29, 17705 - AndroidCharacter.getMirror('0'), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                }
                c2 = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49466 - Process.getGidForName("")), 70 - ((Process.getThreadPriority(0) + 20) >> 6), 12486 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
                int i11 = $11 + 33;
                $10 = i11 % 128;
                int i12 = i11 % 2;
            }
            int i13 = $11 + 47;
            $10 = i13 % 128;
            i = 2;
            int i14 = i13 % 2;
            cArr3 = cArr4;
        } else {
            i = 2;
        }
        if (i6 > 0) {
            int i15 = $11 + 47;
            $10 = i15 % 128;
            int i16 = i15 % i;
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i17 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i17, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i17);
        }
        if (z) {
            int i18 = $11 + 79;
            $10 = i18 % 128;
            int i19 = i18 % 2;
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i20 = $11 + 91;
                $10 = i20 % 128;
                int i21 = i20 % 2;
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

    public interface IAuthTabCallback {

        public static final class onNavigationEvent implements IAuthTabCallback {
            public static final onNavigationEvent IAuthTabCallback = new onNavigationEvent();
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            static {
                int i = onWarmupCompleted + 77;
                onNavigationEvent = i % 128;
                if (i % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    int i2 = onExtraCallbackWithResult + 37;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    return true;
                }
                if (obj instanceof onNavigationEvent) {
                    return true;
                }
                int i4 = onExtraCallbackWithResult + 89;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 81;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return 1222982108;
                }
                int i3 = 53 / 0;
                return 1222982108;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 59;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 99 / 0;
                }
                int i5 = i2 + 125;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return "Skipped";
            }

            private onNavigationEvent() {
            }
        }

        public static final class onWarmupCompleted implements IAuthTabCallback {
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;
            private final boolean onExtraCallbackWithResult;

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof onWarmupCompleted)) {
                    int i2 = IAuthTabCallback + 13;
                    onNavigationEvent = i2 % 128;
                    return i2 % 2 == 0;
                }
                if (this.onExtraCallbackWithResult == ((onWarmupCompleted) obj).onExtraCallbackWithResult) {
                    return true;
                }
                int i3 = IAuthTabCallback + 17;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 117;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = Boolean.hashCode(this.onExtraCallbackWithResult);
                int i4 = IAuthTabCallback + 5;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 80 / 0;
                }
                return iHashCode;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Completed(hasRemainingLogs=" + this.onExtraCallbackWithResult + ")";
                int i2 = IAuthTabCallback + 85;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    return str;
                }
                throw null;
            }

            public onWarmupCompleted(boolean z) {
                this.onExtraCallbackWithResult = z;
            }

            public final boolean onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 125;
                int i3 = i2 % 128;
                IAuthTabCallback = i3;
                int i4 = i2 % 2;
                boolean z = this.onExtraCallbackWithResult;
                int i5 = i3 + 97;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return z;
            }
        }
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    public static /* synthetic */ Request onExtraCallback(String str, TrackingLogRecord trackingLogRecord, pageScrolled pagescrolled, boolean z, Lazy lazy, int i) {
        Object[] objArr = {str, trackingLogRecord, pagescrolled, Boolean.valueOf(z), lazy, Integer.valueOf(i)};
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (Request) IAuthTabCallback(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 631462357, objArr, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted, iOnWarmupCompleted2, -631462356);
    }

    private final Object onExtraCallback(TrackingLogRecord trackingLogRecord, int i, access13800<? super Boolean> access13800Var) {
        Object[] objArr = {this, trackingLogRecord, Integer.valueOf(i), access13800Var};
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        return IAuthTabCallback(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -723036293, objArr, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted, iOnWarmupCompleted2, 723036295);
    }

    private final void onWarmupCompleted(TrackingLogRecord trackingLogRecord, getPageTitle getpagetitle) {
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        IAuthTabCallback(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 112330651, new Object[]{this, trackingLogRecord, getpagetitle}, iOnWarmupCompleted3, iOnWarmupCompleted, iOnWarmupCompleted2, -112330651);
    }

    static void onExtraCallbackWithResult() {
        onExtraCallback = new char[]{27144, 27333, 27359};
    }
}
