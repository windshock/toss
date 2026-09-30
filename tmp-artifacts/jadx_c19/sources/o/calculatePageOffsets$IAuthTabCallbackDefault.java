package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.ads_sdk.log.TrackingLogRecord;
import im.toss.core.webkit.bridge.accessarybutton.IconDoubleAccessoryButtonConfiguration;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.calculatePageOffsets;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class calculatePageOffsets$IAuthTabCallbackDefault extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    final /* synthetic */ String $creativeId;
    final /* synthetic */ String $logType;
    final /* synthetic */ String $requestId;
    final /* synthetic */ long $requestTs;
    final /* synthetic */ List<String> $urls;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ calculatePageOffsets this$0;
    private static final byte[] $$a = {50, 44, -54, 25};
    private static final int $$b = 218;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onWarmupCompleted = 0;
    private static int onExtraCallbackWithResult = 1;
    private static char[] onNavigationEvent = {60819, 43327, 25820};
    private static long onExtraCallback = -1506445827542242950L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i2, short s, byte b) {
        int i3;
        int i4 = (i2 * 2) + 97;
        int i5 = b + 4;
        byte[] bArr = $$a;
        int i6 = s * 3;
        byte[] bArr2 = new byte[1 - i6];
        int i7 = 0 - i6;
        if (bArr == null) {
            int i8 = i5;
            int i9 = 0;
            i4 += i5;
            i5 = i8;
            i3 = i9;
            int i10 = i5 + 1;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
                return new String(bArr2, 0);
            }
            byte b2 = bArr[i10];
            i5 = i4;
            i4 = b2;
            i9 = i3 + 1;
            i8 = i10;
            i4 += i5;
            i5 = i8;
            i3 = i9;
            int i102 = i5 + 1;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            int i1022 = i5 + 1;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    calculatePageOffsets$IAuthTabCallbackDefault(calculatePageOffsets calculatepageoffsets, String str, List<String> list, long j, String str2, String str3, access13800<? super calculatePageOffsets$IAuthTabCallbackDefault> access13800Var) {
        super(2, access13800Var);
        this.this$0 = calculatepageoffsets;
        this.$requestId = str;
        this.$urls = list;
        this.$requestTs = j;
        this.$logType = str2;
        this.$creativeId = str3;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i2 = 2 % 2;
        calculatePageOffsets$IAuthTabCallbackDefault calculatepageoffsets_iauthtabcallbackdefault = new calculatePageOffsets$IAuthTabCallbackDefault(this.this$0, this.$requestId, this.$urls, this.$requestTs, this.$logType, this.$creativeId, access13800Var);
        int i3 = onExtraCallbackWithResult + 13;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return calculatepageoffsets_iauthtabcallbackdefault;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 95;
        onWarmupCompleted = i3 % 128;
        findResAndMsg findresandmsg = (findResAndMsg) obj;
        access13800<? super Unit> access13800Var = (access13800) obj2;
        if (i3 % 2 != 0) {
            onWarmupCompleted(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
        int i4 = onExtraCallbackWithResult + 25;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return objOnWarmupCompleted;
    }

    public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 25;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        calculatePageOffsets$IAuthTabCallbackDefault calculatepageoffsets_iauthtabcallbackdefaultCreate = create(findresandmsg, access13800Var);
        if (i4 != 0) {
            return calculatepageoffsets_iauthtabcallbackdefaultCreate.invokeSuspend(Unit.INSTANCE);
        }
        int i5 = 37 / 0;
        return calculatepageoffsets_iauthtabcallbackdefaultCreate.invokeSuspend(Unit.INSTANCE);
    }

    private static void a(int i2, int i3, char c, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i3];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i5 = $10 + 71;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i3) {
            int i7 = $10 + 31;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onNavigationEvent[i2 + i9])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - TextUtils.indexOf("", "", 0, 0)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 17, 10973 - View.combineMeasuredStates(0, 0), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i9), Long.valueOf(onExtraCallback), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "", 0) + 46134), 32 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getTouchSlop() >> 8) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i9] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - ((Process.getThreadPriority(0) + 20) >> 6)), MotionEvent.axisFromString("") + 45, 1494 - Color.blue(0), -1657859959, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class, Object.class});
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
        char[] cArr = new char[i3];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i3) {
            int i10 = $11 + 29;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - Color.blue(0)), TextUtils.getOffsetAfter("", 0) + 44, ((byte) KeyEvent.getModifierMetaStateMask()) + 1495, -1657859959, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super List<? extends Pair<? extends String, ? extends Boolean>>>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ String $creativeId;
        final /* synthetic */ String $entryId;
        final /* synthetic */ String $logType;
        final /* synthetic */ String $requestId;
        final /* synthetic */ List<String> $urls;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ calculatePageOffsets this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(List<String> list, calculatePageOffsets calculatepageoffsets, String str, String str2, String str3, String str4, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$urls = list;
            this.this$0 = calculatepageoffsets;
            this.$requestId = str;
            this.$entryId = str2;
            this.$creativeId = str3;
            this.$logType = str4;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super List<Pair<String, Boolean>>> access13800Var) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 119;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i5 = onExtraCallbackWithResult + 83;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i2 = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$urls, this.this$0, this.$requestId, this.$entryId, this.$creativeId, this.$logType, access13800Var);
            onwarmupcompleted.L$0 = obj;
            int i3 = onNavigationEvent + 41;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            Object objIAuthTabCallback;
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 3;
            onNavigationEvent = i3 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super List<Pair<String, Boolean>>> access13800Var = (access13800) obj2;
            if (i3 % 2 != 0) {
                objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
                int i4 = 39 / 0;
            } else {
                objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
            }
            int i5 = onNavigationEvent + 1;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return objIAuthTabCallback;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Pair<? extends String, ? extends Boolean>>, Object> {
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;
            final /* synthetic */ String $creativeId;
            final /* synthetic */ String $entryId;
            final /* synthetic */ String $logType;
            final /* synthetic */ String $requestId;
            final /* synthetic */ String $url;
            Object L$0;
            int label;
            final /* synthetic */ calculatePageOffsets this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            IAuthTabCallback(String str, calculatePageOffsets calculatepageoffsets, String str2, String str3, String str4, String str5, access13800<? super IAuthTabCallback> access13800Var) {
                super(2, access13800Var);
                this.$url = str;
                this.this$0 = calculatepageoffsets;
                this.$requestId = str2;
                this.$entryId = str3;
                this.$creativeId = str4;
                this.$logType = str5;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i2 = 2 % 2;
                IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$url, this.this$0, this.$requestId, this.$entryId, this.$creativeId, this.$logType, access13800Var);
                int i3 = onNavigationEvent + 37;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return iAuthTabCallback;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 57;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
                if (i4 != 0) {
                    int i5 = 21 / 0;
                }
                int i6 = onNavigationEvent + 59;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 2 / 0;
                }
                return objOnExtraCallbackWithResult;
            }

            public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Pair<String, Boolean>> access13800Var) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 63;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                IAuthTabCallback iAuthTabCallbackCreate = create(findresandmsg, access13800Var);
                Unit unit = Unit.INSTANCE;
                if (i4 != 0) {
                    return iAuthTabCallbackCreate.invokeSuspend(unit);
                }
                iAuthTabCallbackCreate.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final Object invokeSuspend(Object obj) {
                String str;
                Object objOnNavigationEvent;
                int i2 = 2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i3 = this.label;
                if (i3 != 0) {
                    int i4 = onWarmupCompleted + 81;
                    int i5 = i4 % 128;
                    onNavigationEvent = i5;
                    int i6 = i4 % 2;
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i7 = i5 + 13;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    String str2 = (String) this.L$0;
                    ResultKt.onNavigationEvent(obj);
                    str = str2;
                    objOnNavigationEvent = obj;
                } else {
                    ResultKt.onNavigationEvent(obj);
                    str = this.$url;
                    calculatePageOffsets calculatepageoffsets = this.this$0;
                    String str3 = this.$requestId;
                    String str4 = this.$entryId;
                    String str5 = this.$creativeId;
                    String str6 = this.$logType;
                    this.L$0 = str;
                    this.label = 1;
                    int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
                    int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
                    int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
                    objOnNavigationEvent = calculatePageOffsets.onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{calculatepageoffsets, str3, str4, str, null, str5, null, str6, false, false, this}, 271629036, -271629026, iOnNavigationEvent2, iOnNavigationEvent3, iOnNavigationEvent);
                    if (objOnNavigationEvent == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                }
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(str, access14000.onNavigationEvent(((calculatePageOffsets.onWarmupCompleted) objOnNavigationEvent).onWarmupCompleted()));
                int i9 = onNavigationEvent + 113;
                onWarmupCompleted = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 93 / 0;
                }
                return pairIAuthTabCallback;
            }
        }

        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i4 = onExtraCallbackWithResult + 89;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 5 / 0;
                }
                return obj;
            }
            ResultKt.onNavigationEvent(obj);
            List<String> list = this.$urls;
            calculatePageOffsets calculatepageoffsets = this.this$0;
            String str = this.$requestId;
            String str2 = this.$entryId;
            String str3 = this.$creativeId;
            String str4 = this.$logType;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ArrayList arrayList2 = arrayList;
                arrayList2.add(maybeUpdateAnimatable.onExtraCallback(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback((String) it.next(), calculatepageoffsets, str, str2, str3, str4, null), 3, (Object) null));
                int i6 = onNavigationEvent + 5;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                calculatepageoffsets = calculatepageoffsets;
                str4 = str4;
                str3 = str3;
                str2 = str2;
                str = str;
                arrayList = arrayList2;
            }
            this.L$0 = access15400.onNavigationEvent(findresandmsg);
            this.label = 1;
            Object objIAuthTabCallback = ResourceCallback.IAuthTabCallback(arrayList, this);
            return objIAuthTabCallback == objOnWarmupCompleted ? objOnWarmupCompleted : objIAuthTabCallback;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0190, code lost:
    
        if (r4.onExtraCallback(r1, r5, r32) != r2) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x014f A[LOOP:1: B:27:0x0149->B:29:0x014f, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOnNavigationEvent;
        String str;
        Object objOnExtraCallbackWithResult;
        Iterator it;
        int i2 = 2 % 2;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = this.label;
        if (i3 == 0) {
            ResultKt.onNavigationEvent(obj);
            performDrag performdragIAuthTabCallbackDefault = calculatePageOffsets.IAuthTabCallbackDefault(this.this$0);
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            String str2 = this.$requestId;
            List<String> list = this.$urls;
            String strIAuthTabCallback = ViewPager.IAuthTabCallback.IAuthTabCallback(this.$requestTs);
            String str3 = this.$logType;
            long j = this.$requestTs;
            String str4 = this.$creativeId;
            Object[] objArr = new Object[1];
            a(Process.getGidForName("") + 1, Color.red(0) + 3, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), objArr);
            TrackingLogRecord trackingLogRecord = new TrackingLogRecord(string, str2, list, strIAuthTabCallback, str3, j, (String) null, 0, (String) null, ((String) objArr[0]).intern(), str4, (String) null, false, 2496, (DefaultConstructorMarker) null);
            this.label = 1;
            int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            int iOnNavigationEvent3 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            objOnNavigationEvent = performDrag.onNavigationEvent(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{performdragIAuthTabCallbackDefault, trackingLogRecord, this}, iOnNavigationEvent, -652248046, 652248050, iOnNavigationEvent3, iOnNavigationEvent2);
            objOnWarmupCompleted = objOnWarmupCompleted;
            if (objOnNavigationEvent != objOnWarmupCompleted) {
            }
            return objOnWarmupCompleted;
        }
        if (i3 == 1) {
            ResultKt.onNavigationEvent(obj);
            objOnNavigationEvent = obj;
        } else {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i4 = onExtraCallbackWithResult + 13;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.onNavigationEvent(obj);
                throw null;
            }
            String str5 = (String) this.L$0;
            ResultKt.onNavigationEvent(obj);
            str = str5;
            objOnExtraCallbackWithResult = obj;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (Iterable) objOnExtraCallbackWithResult) {
                if (((Boolean) ((Pair) obj2).IAuthTabCallback()).booleanValue()) {
                    int i5 = onExtraCallbackWithResult + 47;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            it = arrayList.iterator();
            while (it.hasNext()) {
                int i7 = onExtraCallbackWithResult + 27;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                arrayList2.add((String) ((Pair) it.next()).onExtraCallbackWithResult());
            }
            performDrag performdragIAuthTabCallbackDefault2 = calculatePageOffsets.IAuthTabCallbackDefault(this.this$0);
            List listMinus = CollectionsKt.minus(this.$urls, CollectionsKt.toSet(arrayList2));
            this.L$0 = access15400.onNavigationEvent(str);
            this.L$1 = access15400.onNavigationEvent(arrayList2);
            this.label = 3;
        }
        str = (String) objOnNavigationEvent;
        calculatePageOffsets.IAuthTabCallback_Parcel(this.this$0);
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$urls, this.this$0, this.$requestId, str, this.$creativeId, this.$logType, null);
        this.L$0 = str;
        this.label = 2;
        objOnExtraCallbackWithResult = findRes.onExtraCallbackWithResult(onwarmupcompleted, this);
        if (objOnExtraCallbackWithResult != objOnWarmupCompleted) {
            ArrayList arrayList3 = new ArrayList();
            while (r3.hasNext()) {
            }
            ArrayList arrayList22 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
            it = arrayList3.iterator();
            while (it.hasNext()) {
            }
            performDrag performdragIAuthTabCallbackDefault22 = calculatePageOffsets.IAuthTabCallbackDefault(this.this$0);
            List listMinus2 = CollectionsKt.minus(this.$urls, CollectionsKt.toSet(arrayList22));
            this.L$0 = access15400.onNavigationEvent(str);
            this.L$1 = access15400.onNavigationEvent(arrayList22);
            this.label = 3;
        }
        return objOnWarmupCompleted;
    }
}
