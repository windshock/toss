package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.RecomposerawaitIdle2;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r2 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    public static final r2 onNavigationEvent = new r2();
    private static int onWarmupCompleted = 1;

    static {
        int i = onExtraCallback + 37;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            int i2 = 73 / 0;
        }
    }

    private r2() {
    }

    public static final /* synthetic */ Object onNavigationEvent(r2 r2Var, Context context, String str, boolean z, List list, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return r2Var.IAuthTabCallback(context, str, z, (List<? extends SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1>) list, (access13800<? super Bitmap>) access13800Var);
        }
        r2Var.IAuthTabCallback(context, str, z, (List<? extends SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1>) list, (access13800<? super Bitmap>) access13800Var);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(r2 r2Var, Context context, List list, boolean z, List list2, access13800 access13800Var, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            list2 = CollectionsKt.listOf(new ReusableLinkRememberObserverHolder());
            int i3 = onWarmupCompleted + 101;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
        }
        Object objIAuthTabCallback = r2Var.IAuthTabCallback(context, (List<String>) list, z2, (List<? extends SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1>) list2, (access13800<? super Map<String, Bitmap>>) access13800Var);
        int i5 = onWarmupCompleted + 119;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return objIAuthTabCallback;
    }

    public final Object IAuthTabCallback(@NotNull Context context, @NotNull List<String> list, boolean z, @NotNull List<? extends SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1> list2, @NotNull access13800<? super Map<String, Bitmap>> access13800Var) {
        int i = 2 % 2;
        jni_YGNodeStyleGetFlexDirectionJNI jni_ygnodestylegetflexdirectionjniOnWarmupCompleted = jni_YGNodeStyleGetFlexShrinkJNI.onWarmupCompleted(8, 0, 2, (Object) null);
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new onExtraCallbackWithResult(CollectionsKt.distinct(list), jni_ygnodestylegetflexdirectionjniOnWarmupCompleted, context, z, list2, null), access13800Var);
        int i2 = IAuthTabCallback + 109;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return objOnExtraCallback;
        }
        throw null;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Map<String, ? extends Bitmap>>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ boolean $cacheOnly;
        final /* synthetic */ Context $context;
        final /* synthetic */ List<String> $distinctUrls;
        final /* synthetic */ jni_YGNodeStyleGetFlexDirectionJNI $semaphore;
        final /* synthetic */ List<SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1> $transformations;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(List<String> list, jni_YGNodeStyleGetFlexDirectionJNI jni_ygnodestylegetflexdirectionjni, Context context, boolean z, List<? extends SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1> list2, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$distinctUrls = list;
            this.$semaphore = jni_ygnodestylegetflexdirectionjni;
            this.$context = context;
            this.$cacheOnly = z;
            this.$transformations = list2;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Map<String, Bitmap>> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 77;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 113;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$distinctUrls, this.$semaphore, this.$context, this.$cacheOnly, this.$transformations, access13800Var);
            onextracallbackwithresult.L$0 = obj;
            int i2 = IAuthTabCallback + 43;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return onextracallbackwithresult;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 61;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Map<String, Bitmap>> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return IAuthTabCallback(findresandmsg, access13800Var);
            }
            IAuthTabCallback(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            Object objIAuthTabCallback;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 35;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = IAuthTabCallback + 123;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0 ? i4 != 1 : i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                objIAuthTabCallback = obj;
            } else {
                ResultKt.onNavigationEvent(obj);
                List<String> list = this.$distinctUrls;
                jni_YGNodeStyleGetFlexDirectionJNI jni_ygnodestylegetflexdirectionjni = this.$semaphore;
                Context context = this.$context;
                boolean z = this.$cacheOnly;
                List<SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1> list2 = this.$transformations;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    boolean z2 = z;
                    onExtraCallback onextracallback = new onExtraCallback(jni_ygnodestylegetflexdirectionjni, context, (String) it.next(), z2, list2, null);
                    ArrayList arrayList2 = arrayList;
                    arrayList2.add(maybeUpdateAnimatable.onExtraCallback(findresandmsg, (CoroutineContext) null, (setRandomHost) null, onextracallback, 3, (Object) null));
                    jni_ygnodestylegetflexdirectionjni = jni_ygnodestylegetflexdirectionjni;
                    arrayList = arrayList2;
                    list2 = list2;
                    z = z2;
                    context = context;
                }
                this.L$0 = access15400.onNavigationEvent(findresandmsg);
                this.label = 1;
                objIAuthTabCallback = ResourceCallback.IAuthTabCallback(arrayList, this);
                if (objIAuthTabCallback == objOnWarmupCompleted) {
                    int i6 = onWarmupCompleted + 39;
                    IAuthTabCallback = i6 % 128;
                    if (i6 % 2 == 0) {
                        return objOnWarmupCompleted;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            }
            return access8100.onExtraCallbackWithResult(CollectionsKt.filterNotNull((Iterable) objIAuthTabCallback));
        }

        static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Pair<? extends String, ? extends Bitmap>>, Object> {
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;
            final /* synthetic */ boolean $cacheOnly;
            final /* synthetic */ Context $context;
            final /* synthetic */ jni_YGNodeStyleGetFlexDirectionJNI $semaphore;
            final /* synthetic */ List<SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1> $transformations;
            final /* synthetic */ String $url;
            int I$0;
            int I$1;
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            boolean Z$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onExtraCallback(jni_YGNodeStyleGetFlexDirectionJNI jni_ygnodestylegetflexdirectionjni, Context context, String str, boolean z, List<? extends SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1> list, access13800<? super onExtraCallback> access13800Var) {
                super(2, access13800Var);
                this.$semaphore = jni_ygnodestylegetflexdirectionjni;
                this.$context = context;
                this.$url = str;
                this.$cacheOnly = z;
                this.$transformations = list;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onExtraCallback onextracallback = new onExtraCallback(this.$semaphore, this.$context, this.$url, this.$cacheOnly, this.$transformations, access13800Var);
                int i2 = onExtraCallbackWithResult + 3;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return onextracallback;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 101;
                onWarmupCompleted = i2 % 128;
                Object obj3 = null;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super Pair<String, Bitmap>> access13800Var = (access13800) obj2;
                if (i2 % 2 == 0) {
                    onWarmupCompleted(findresandmsg, access13800Var);
                    obj3.hashCode();
                    throw null;
                }
                Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
                int i3 = onExtraCallbackWithResult + 99;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    return objOnWarmupCompleted;
                }
                throw null;
            }

            public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Pair<String, Bitmap>> access13800Var) throws Throwable {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 117;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                onExtraCallback onextracallbackCreate = create(findresandmsg, access13800Var);
                if (i3 != 0) {
                    onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Object objInvokeSuspend = onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
                int i4 = onWarmupCompleted + 121;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            /* JADX WARN: Removed duplicated region for block: B:27:0x00b7 A[Catch: all -> 0x00bf, TRY_LEAVE, TryCatch #1 {all -> 0x00bf, blocks: (B:21:0x008f, B:25:0x00b3, B:27:0x00b7), top: B:37:0x008f }] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws Throwable {
                jni_YGNodeStyleGetFlexDirectionJNI jni_ygnodestylegetflexdirectionjni;
                int i;
                Context context;
                boolean z;
                String str;
                List<SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1> list;
                jni_YGNodeStyleGetFlexDirectionJNI jni_ygnodestylegetflexdirectionjni2;
                Throwable th;
                Object objOnNavigationEvent;
                String str2;
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 101;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i5 = this.label;
                try {
                    if (i5 == 0) {
                        ResultKt.onNavigationEvent(obj);
                        jni_YGNodeStyleGetFlexDirectionJNI jni_ygnodestylegetflexdirectionjni3 = this.$semaphore;
                        Context context2 = this.$context;
                        String str3 = this.$url;
                        boolean z2 = this.$cacheOnly;
                        List<SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1> list2 = this.$transformations;
                        this.L$0 = jni_ygnodestylegetflexdirectionjni3;
                        this.L$1 = context2;
                        this.L$2 = str3;
                        this.L$3 = list2;
                        this.Z$0 = z2;
                        this.I$0 = 0;
                        this.label = 1;
                        if (jni_ygnodestylegetflexdirectionjni3.IAuthTabCallback(this) != objOnWarmupCompleted) {
                            jni_ygnodestylegetflexdirectionjni = jni_ygnodestylegetflexdirectionjni3;
                            i = 0;
                            context = context2;
                            z = z2;
                            str = str3;
                            list = list2;
                        }
                        return objOnWarmupCompleted;
                    }
                    int i6 = onWarmupCompleted + 97;
                    int i7 = i6 % 128;
                    onExtraCallbackWithResult = i7;
                    if (i6 % 2 == 0 ? i5 != 1 : i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i8 = i7 + 59;
                        onWarmupCompleted = i8 % 128;
                        int i9 = i8 % 2;
                        str2 = (String) this.L$1;
                        jni_ygnodestylegetflexdirectionjni2 = (jni_YGNodeStyleGetFlexDirectionJNI) this.L$0;
                        try {
                            ResultKt.onNavigationEvent(obj);
                            jni_ygnodestylegetflexdirectionjni = jni_ygnodestylegetflexdirectionjni2;
                            objOnNavigationEvent = obj;
                            Bitmap bitmap = (Bitmap) objOnNavigationEvent;
                            Pair pairIAuthTabCallback = bitmap != null ? getWrite.IAuthTabCallback(str2, bitmap) : null;
                            jni_ygnodestylegetflexdirectionjni.onExtraCallback();
                            return pairIAuthTabCallback;
                        } catch (Throwable th2) {
                            th = th2;
                            jni_ygnodestylegetflexdirectionjni2.onExtraCallback();
                            throw th;
                        }
                    }
                    i = this.I$0;
                    boolean z3 = this.Z$0;
                    List<SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1> list3 = (List) this.L$3;
                    String str4 = (String) this.L$2;
                    Context context3 = (Context) this.L$1;
                    jni_YGNodeStyleGetFlexDirectionJNI jni_ygnodestylegetflexdirectionjni4 = (jni_YGNodeStyleGetFlexDirectionJNI) this.L$0;
                    ResultKt.onNavigationEvent(obj);
                    jni_ygnodestylegetflexdirectionjni = jni_ygnodestylegetflexdirectionjni4;
                    str = str4;
                    list = list3;
                    z = z3;
                    context = context3;
                    r2 r2Var = r2.onNavigationEvent;
                    this.L$0 = jni_ygnodestylegetflexdirectionjni;
                    this.L$1 = str;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.I$0 = i;
                    this.I$1 = 0;
                    this.label = 2;
                    objOnNavigationEvent = r2.onNavigationEvent(r2Var, context, str, z, list, this);
                    if (objOnNavigationEvent != objOnWarmupCompleted) {
                        int i10 = onWarmupCompleted + 23;
                        onExtraCallbackWithResult = i10 % 128;
                        int i11 = i10 % 2;
                        str2 = str;
                        Bitmap bitmap2 = (Bitmap) objOnNavigationEvent;
                        if (bitmap2 != null) {
                        }
                        jni_ygnodestylegetflexdirectionjni.onExtraCallback();
                        return pairIAuthTabCallback;
                    }
                    return objOnWarmupCompleted;
                } catch (Throwable th3) {
                    th = th3;
                    jni_ygnodestylegetflexdirectionjni2 = jni_ygnodestylegetflexdirectionjni;
                    jni_ygnodestylegetflexdirectionjni2.onExtraCallback();
                    throw th;
                }
            }
        }
    }

    private final Object IAuthTabCallback(Context context, String str, boolean z, List<? extends SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1> list, access13800<? super Bitmap> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new IAuthTabCallback(context, str, list, z, null), access13800Var);
        int i2 = IAuthTabCallback + 75;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return objOnExtraCallback;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Bitmap>, Object> {
        final /* synthetic */ boolean $cacheOnly;
        final /* synthetic */ Context $context;
        final /* synthetic */ String $imageUrl;
        final /* synthetic */ List<SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1> $transformations;
        float F$0;
        Object L$0;
        int label;
        private static final byte[] $$a = {15, -57, -42, 5};
        private static final int $$b = 94;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onExtraCallback = 1;
        private static char[] IAuthTabCallback = {2578, 58184, 55462, 46598, 44902, 34040, 29245, 27525};
        private static long onNavigationEvent = 8575094673747215498L;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(short s, byte b, short s2) {
            int i;
            int i2 = s2 * 2;
            int i3 = 4 - (b * 3);
            int i4 = (s * 4) + 97;
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[1 - i2];
            int i5 = 0 - i2;
            if (bArr == null) {
                int i6 = i3;
                int i7 = i5;
                int i8 = 0;
                i4 = (-i4) + i7;
                i3 = i6 + 1;
                i = i8;
                bArr2[i] = (byte) i4;
                if (i == i5) {
                    return new String(bArr2, 0);
                }
                byte b2 = bArr[i3];
                int i9 = i3;
                i7 = i4;
                i4 = b2;
                i8 = i + 1;
                i6 = i9;
                i4 = (-i4) + i7;
                i3 = i6 + 1;
                i = i8;
                bArr2[i] = (byte) i4;
                if (i == i5) {
                }
            } else {
                i = 0;
                bArr2[i] = (byte) i4;
                if (i == i5) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(Context context, String str, List<? extends SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1> list, boolean z, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$context = context;
            this.$imageUrl = str;
            this.$transformations = list;
            this.$cacheOnly = z;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$context, this.$imageUrl, this.$transformations, this.$cacheOnly, access13800Var);
            int i2 = onExtraCallbackWithResult + 119;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 61;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 59;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Bitmap> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 45;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 71;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            try {
                if (i2 != 0) {
                    int i3 = onExtraCallbackWithResult + 21;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                } else {
                    ResultKt.onNavigationEvent(obj);
                    Integer numOnNavigationEvent = access14000.onNavigationEvent(36);
                    DisplayMetrics displayMetrics = this.$context.getResources().getDisplayMetrics();
                    Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                    float fOnWarmupCompleted = varyMatches.onWarmupCompleted(numOnNavigationEvent, displayMetrics);
                    RecomposerawaitIdle2.onNavigationEvent onnavigationeventOnWarmupCompleted = RecomposerrecompositionRunner2.onWarmupCompleted(Recomposerjoin2.IAuthTabCallback(new RecomposerawaitIdle2.onNavigationEvent(this.$context).onExtraCallback(this.$imageUrl).onNavigationEvent((int) fOnWarmupCompleted), false), this.$transformations);
                    if (this.$cacheOnly) {
                        onnavigationeventOnWarmupCompleted.onExtraCallbackWithResult(RecomposerHotReloadable.DISABLED);
                    }
                    RecomposerawaitIdle2 recomposerawaitIdle2OnExtraCallbackWithResult = onnavigationeventOnWarmupCompleted.onExtraCallbackWithResult();
                    CarouselKtExternalSyntheticLambda8 carouselKtExternalSyntheticLambda8OnExtraCallbackWithResult = CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(this.$context);
                    this.L$0 = access15400.onNavigationEvent(recomposerawaitIdle2OnExtraCallbackWithResult);
                    this.F$0 = fOnWarmupCompleted;
                    this.label = 1;
                    obj = carouselKtExternalSyntheticLambda8OnExtraCallbackWithResult.onNavigationEvent(recomposerawaitIdle2OnExtraCallbackWithResult, this);
                    if (obj == objOnWarmupCompleted) {
                        int i5 = onExtraCallbackWithResult + 65;
                        onExtraCallback = i5 % 128;
                        int i6 = i5 % 2;
                        return objOnWarmupCompleted;
                    }
                }
                CarouselKtExternalSyntheticLambda7 carouselKtExternalSyntheticLambda7OnExtraCallbackWithResult = ((RecomposerErrorInformation) obj).onExtraCallbackWithResult();
                if (carouselKtExternalSyntheticLambda7OnExtraCallbackWithResult != null) {
                    return CarouselPagerStateExternalSyntheticLambda1.onExtraCallbackWithResult(carouselKtExternalSyntheticLambda7OnExtraCallbackWithResult, 0, 0, 3, (Object) null);
                }
                return null;
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                Object[] objArr = new Object[1];
                a(ExpandableListView.getPackedPositionGroup(0L), 8 - KeyEvent.getDeadChar(0, 0), (char) (59311 - (ViewConfiguration.getEdgeSlop() >> 16)), objArr);
                AFd1mSDK.onExtraCallbackWithResult("ImageLoadWorker_loadImage", e2, access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), this.$imageUrl)), false, (Function1) null, 24, (Object) null);
                return null;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:61:0x0330  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0331  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
            char c2;
            long j;
            long j2;
            Throwable cause;
            int i3 = 2 % 2;
            TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
            long[] jArr = new long[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            int i4 = $11 + 111;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            while (true) {
                c2 = '0';
                j = 0;
                if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                    break;
                }
                int i6 = $11 + 7;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                    try {
                        Object[] objArr2 = {Integer.valueOf(IAuthTabCallback[i - i7])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - (Process.myPid() >> 22)), 17 - (Process.myTid() >> 22), TextUtils.lastIndexOf("", '0', 0) + 10974, 919452672, false, "c", new Class[]{Integer.TYPE});
                        }
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(onNavigationEvent), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 46134), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 30, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i7] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                        Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                        if (objOnExtraCallback3 == null) {
                            byte b = (byte) 0;
                            byte b2 = b;
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 44 - KeyEvent.normalizeMetaState(0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1494, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    } catch (Throwable th) {
                        cause = th.getCause();
                        if (cause != null) {
                        }
                    }
                } else {
                    int i8 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                    Object[] objArr5 = {Integer.valueOf(IAuthTabCallback[i + i8])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - TextUtils.indexOf("", "")), 17 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 10973 - (Process.myTid() >> 22), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i8), Long.valueOf(onNavigationEvent), Integer.valueOf(c)};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.blue(0) + 46134), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 31, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i8] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                    Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback6 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getCapsMode("", 0, 0) + 49123), 44 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1494 - TextUtils.indexOf("", "", 0, 0), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback6).invoke(null, objArr7);
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
                int i9 = $10 + 39;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                    Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback7 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), TextUtils.getOffsetAfter("", 0) + 44, 1495 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)), -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback7).invoke(null, objArr8);
                    int i10 = 98 / 0;
                    j = 0;
                } else {
                    cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                    Object[] objArr9 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback8 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback8 == null) {
                        j2 = 0;
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objOnExtraCallback8 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", c2, 0, 0) + 49124), 45 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), View.combineMeasuredStates(0, 0) + 1494, -1657859959, false, $$c(b7, b8, b8), new Class[]{Object.class, Object.class});
                    } else {
                        j2 = 0;
                    }
                    ((Method) objOnExtraCallback8).invoke(null, objArr9);
                    j = j2;
                    c2 = '0';
                }
            }
            objArr[0] = new String(cArr);
        }
    }
}
