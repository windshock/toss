package o;

import android.content.Context;
import android.graphics.Bitmap;
import im.toss.securities.widget.data.model.overview.BadgeIcon;
import im.toss.securities.widget.data.model.overview.OverviewItemInfo;
import im.toss.securities.widget.data.model.overview.OverviewNotice;
import im.toss.tosssecurities.uikit.extension.ResourcesKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r5ExternalSyntheticLambda0 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public static final /* synthetic */ class IAuthTabCallback {
        public static final /* synthetic */ int[] onExtraCallback;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        static {
            int[] iArr = new int[rebuildJournalokhttp.values().length];
            try {
                iArr[rebuildJournalokhttp.PUT.ordinal()] = 1;
                int i = onExtraCallbackWithResult + 71;
                onNavigationEvent = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[rebuildJournalokhttp.CALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            onExtraCallback = iArr;
            int i4 = onExtraCallbackWithResult + 57;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final r2a IAuthTabCallback(@NotNull OverviewItemInfo overviewItemInfo) {
        int i;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 47;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(overviewItemInfo, "");
        if (overviewItemInfo.onWarmupCompleted() != null) {
            BadgeIcon badgeIconOnWarmupCompleted = overviewItemInfo.onWarmupCompleted();
            Intrinsics.checkNotNull(badgeIconOnWarmupCompleted);
            String strOnNavigationEvent = ResourcesKt.onNavigationEvent(badgeIconOnWarmupCompleted.onExtraCallbackWithResult());
            BadgeIcon badgeIconOnWarmupCompleted2 = overviewItemInfo.onWarmupCompleted();
            Intrinsics.checkNotNull(badgeIconOnWarmupCompleted2);
            return new r2a(strOnNavigationEvent, badgeIconOnWarmupCompleted2.onNavigationEvent());
        }
        OverviewNotice overviewNoticeAccess000 = overviewItemInfo.access000();
        if (overviewNoticeAccess000 != null) {
            int i5 = onNavigationEvent + 15;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0 ? overviewNoticeAccess000.onNavigationEvent() : overviewNoticeAccess000.onNavigationEvent()) {
                return new r2a(ResourcesKt.onNavigationEvent("icon-loudspeaker-fill"), false, 2, null);
            }
        }
        if (!(overviewItemInfo instanceof OverviewItemInfo.Option)) {
            if (overviewItemInfo instanceof OverviewItemInfo.Stock) {
                int i6 = onNavigationEvent + 119;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                if (((OverviewItemInfo.Stock) overviewItemInfo).onPostMessage()) {
                    return new r2a(ResourcesKt.onNavigationEvent("icon-flag-us"), true);
                }
            }
            return null;
        }
        int i8 = onNavigationEvent + 103;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        rebuildJournalokhttp rebuildjournalokhttpOnNavigationEvent = rebuildJournalokhttp.Companion.onNavigationEvent(((OverviewItemInfo.Option) overviewItemInfo).extraCommand());
        if (rebuildjournalokhttpOnNavigationEvent == null) {
            int i10 = onWarmupCompleted + 5;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            i = -1;
        } else {
            i = IAuthTabCallback.onExtraCallback[rebuildjournalokhttpOnNavigationEvent.ordinal()];
        }
        String str = i != 1 ? i != 2 ? null : "icon-arrow-right-up-circle" : "icon-arrow-right-down-circle";
        if (str != null) {
            return new r2a(ResourcesKt.onNavigationEvent(str), false, 2, null);
        }
        int i12 = onWarmupCompleted + 115;
        onNavigationEvent = i12 % 128;
        int i13 = i12 % 2;
        return null;
    }

    public static /* synthetic */ Object onWarmupCompleted(Context context, List list, boolean z, access13800 access13800Var, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 35;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 4) != 0) {
            z = false;
        }
        Object objOnWarmupCompleted = onWarmupCompleted(context, list, z, access13800Var);
        int i5 = onNavigationEvent + 27;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 88 / 0;
        }
        return objOnWarmupCompleted;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Map<String, ? extends Bitmap>>, Object> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ boolean $cacheOnly;
        final /* synthetic */ List<r2a> $circleAccessories;
        final /* synthetic */ Context $context;
        final /* synthetic */ List<r2a> $rectAccessories;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(Context context, List<r2a> list, boolean z, List<r2a> list2, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$context = context;
            this.$circleAccessories = list;
            this.$cacheOnly = z;
            this.$rectAccessories = list2;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$context, this.$circleAccessories, this.$cacheOnly, this.$rectAccessories, access13800Var);
            onextracallback.L$0 = obj;
            int i2 = onExtraCallback + 55;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return onextracallback;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 35;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 59;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Map<String, Bitmap>> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 105;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallbackCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                return onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
            }
            onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
            throw null;
        }

        /* renamed from: o.r5ExternalSyntheticLambda0$onExtraCallback$onExtraCallback, reason: collision with other inner class name */
        static final class C0054onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Map<String, ? extends Bitmap>>, Object> {
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;
            final /* synthetic */ boolean $cacheOnly;
            final /* synthetic */ List<r2a> $circleAccessories;
            final /* synthetic */ Context $context;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0054onExtraCallback(Context context, List<r2a> list, boolean z, access13800<? super C0054onExtraCallback> access13800Var) {
                super(2, access13800Var);
                this.$context = context;
                this.$circleAccessories = list;
                this.$cacheOnly = z;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                C0054onExtraCallback c0054onExtraCallback = new C0054onExtraCallback(this.$context, this.$circleAccessories, this.$cacheOnly, access13800Var);
                int i2 = onWarmupCompleted + 63;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return c0054onExtraCallback;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 51;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
                int i4 = onExtraCallback + 57;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return objOnNavigationEvent;
            }

            public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Map<String, Bitmap>> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 57;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                C0054onExtraCallback c0054onExtraCallbackCreate = create(findresandmsg, access13800Var);
                if (i3 != 0) {
                    return c0054onExtraCallbackCreate.invokeSuspend(Unit.INSTANCE);
                }
                c0054onExtraCallbackCreate.invokeSuspend(Unit.INSTANCE);
                throw null;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = onWarmupCompleted + 97;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    ResultKt.onNavigationEvent(obj);
                    return obj;
                }
                ResultKt.onNavigationEvent(obj);
                r2 r2Var = r2.onNavigationEvent;
                Context context = this.$context;
                List<r2a> list = this.$circleAccessories;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    int i5 = onWarmupCompleted + 43;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    arrayList.add(((r2a) it.next()).IAuthTabCallback());
                    int i7 = onWarmupCompleted + 23;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                }
                boolean z = this.$cacheOnly;
                this.label = 1;
                Object objOnWarmupCompleted2 = r2.onWarmupCompleted(r2Var, context, arrayList, z, null, this, 8, null);
                if (objOnWarmupCompleted2 != objOnWarmupCompleted) {
                    return objOnWarmupCompleted2;
                }
                int i9 = onWarmupCompleted + 123;
                onExtraCallback = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 78 / 0;
                }
                return objOnWarmupCompleted;
            }
        }

        static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Map<String, ? extends Bitmap>>, Object> {
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;
            final /* synthetic */ boolean $cacheOnly;
            final /* synthetic */ Context $context;
            final /* synthetic */ List<r2a> $rectAccessories;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onExtraCallbackWithResult(Context context, List<r2a> list, boolean z, access13800<? super onExtraCallbackWithResult> access13800Var) {
                super(2, access13800Var);
                this.$context = context;
                this.$rectAccessories = list;
                this.$cacheOnly = z;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$context, this.$rectAccessories, this.$cacheOnly, access13800Var);
                int i2 = onExtraCallbackWithResult + 9;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return onextracallbackwithresult;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 121;
                onWarmupCompleted = i2 % 128;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super Map<String, Bitmap>> access13800Var = (access13800) obj2;
                if (i2 % 2 == 0) {
                    onWarmupCompleted(findresandmsg, access13800Var);
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
                int i3 = onExtraCallbackWithResult + 103;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return objOnWarmupCompleted;
            }

            public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Map<String, Bitmap>> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 9;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object obj = null;
                onExtraCallbackWithResult onextracallbackwithresultCreate = create(findresandmsg, access13800Var);
                if (i3 == 0) {
                    onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
                    throw null;
                }
                Object objInvokeSuspend = onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
                int i4 = onExtraCallbackWithResult + 63;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    return objInvokeSuspend;
                }
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
            
                kotlin.ResultKt.onNavigationEvent(r10);
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
            
                return r10;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
            
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
            
                kotlin.ResultKt.onNavigationEvent(r10);
                r3 = o.r2.onNavigationEvent;
                r4 = r9.$context;
                r10 = r9.$rectAccessories;
                r5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(r10, 10));
                r10 = r10.iterator();
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
            
                if (r10.hasNext() == false) goto L26;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
            
                r5.add(((o.r2a) r10.next()).IAuthTabCallback());
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
            
                r6 = r9.$cacheOnly;
                r7 = kotlin.collections.CollectionsKt.emptyList();
                r9.label = 1;
                r10 = r3.IAuthTabCallback(r4, (java.util.List<java.lang.String>) r5, r6, r7, (o.access13800<? super java.util.Map<java.lang.String, android.graphics.Bitmap>>) r9);
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
            
                if (r10 != r1) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
            
                r10 = o.r5ExternalSyntheticLambda0.onExtraCallback.onExtraCallbackWithResult.onWarmupCompleted + 43;
                o.r5ExternalSyntheticLambda0.onExtraCallback.onExtraCallbackWithResult.onExtraCallbackWithResult = r10 % 128;
                r10 = r10 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
            
                return r1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0079, code lost:
            
                r1 = o.r5ExternalSyntheticLambda0.onExtraCallback.onExtraCallbackWithResult.onWarmupCompleted + 59;
                o.r5ExternalSyntheticLambda0.onExtraCallback.onExtraCallbackWithResult.onExtraCallbackWithResult = r1 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
            
                if ((r1 % 2) == 0) goto L25;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x0084, code lost:
            
                r0 = 65 / 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x0088, code lost:
            
                return r10;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
            
                if (r3 != 0) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
            
                if (r3 != 0) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
            
                if (r3 != 1) goto L12;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object objOnWarmupCompleted;
                int i;
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 55;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    objOnWarmupCompleted = access14300.onWarmupCompleted();
                    i = this.label;
                    int i4 = 15 / 0;
                } else {
                    objOnWarmupCompleted = access14300.onWarmupCompleted();
                    i = this.label;
                }
            }
        }

        public final Object invokeSuspend(Object obj) {
            GeckoHubImp1 geckoHubImp1OnExtraCallback;
            GeckoHubImp1 geckoHubImp1;
            Map map;
            int i = 2 % 2;
            int i2 = onExtraCallback + 31;
            onNavigationEvent = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                access14300.onWarmupCompleted();
                obj2.hashCode();
                throw null;
            }
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                GeckoHubImp1 geckoHubImp1OnExtraCallback2 = maybeUpdateAnimatable.onExtraCallback(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new C0054onExtraCallback(this.$context, this.$circleAccessories, this.$cacheOnly, null), 3, (Object) null);
                geckoHubImp1OnExtraCallback = maybeUpdateAnimatable.onExtraCallback(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(this.$context, this.$rectAccessories, this.$cacheOnly, null), 3, (Object) null);
                this.L$0 = access15400.onNavigationEvent(findresandmsg);
                this.L$1 = access15400.onNavigationEvent(geckoHubImp1OnExtraCallback2);
                this.L$2 = geckoHubImp1OnExtraCallback;
                this.label = 1;
                Object objIAuthTabCallback = geckoHubImp1OnExtraCallback2.IAuthTabCallback(this);
                if (objIAuthTabCallback != objOnWarmupCompleted) {
                    geckoHubImp1 = geckoHubImp1OnExtraCallback2;
                    obj = objIAuthTabCallback;
                }
                return objOnWarmupCompleted;
            }
            int i4 = onNavigationEvent + 81;
            int i5 = i4 % 128;
            onExtraCallback = i5;
            if (i4 % 2 == 0 ? i3 != 1 : i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = i5 + 101;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                map = (Map) this.L$3;
                ResultKt.onNavigationEvent(obj);
                return access8100.onWarmupCompleted(map, (Map) obj);
            }
            geckoHubImp1OnExtraCallback = (GeckoHubImp1) this.L$2;
            geckoHubImp1 = (GeckoHubImp1) this.L$1;
            ResultKt.onNavigationEvent(obj);
            int i8 = onExtraCallback + 59;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            Map map2 = (Map) obj;
            this.L$0 = access15400.onNavigationEvent(findresandmsg);
            this.L$1 = access15400.onNavigationEvent(geckoHubImp1);
            this.L$2 = access15400.onNavigationEvent(geckoHubImp1OnExtraCallback);
            this.L$3 = map2;
            this.label = 2;
            Object objIAuthTabCallback2 = geckoHubImp1OnExtraCallback.IAuthTabCallback(this);
            if (objIAuthTabCallback2 != objOnWarmupCompleted) {
                map = map2;
                obj = objIAuthTabCallback2;
                return access8100.onWarmupCompleted(map, (Map) obj);
            }
            return objOnWarmupCompleted;
        }
    }

    public static final Object onWarmupCompleted(@NotNull Context context, @NotNull List<? extends OverviewItemInfo> list, boolean z, @NotNull access13800<? super Map<String, Bitmap>> access13800Var) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        int i2 = onWarmupCompleted + 11;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        while (it.hasNext()) {
            r2a r2aVarIAuthTabCallback = IAuthTabCallback((OverviewItemInfo) it.next());
            if (r2aVarIAuthTabCallback != null) {
                arrayList.add(r2aVarIAuthTabCallback);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            int i4 = onWarmupCompleted + 51;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            if (((r2a) obj).onNavigationEvent()) {
                int i6 = onNavigationEvent + 33;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    arrayList2.add(obj);
                    int i7 = 42 / 0;
                } else {
                    arrayList2.add(obj);
                }
            } else {
                arrayList3.add(obj);
                int i8 = onWarmupCompleted + 27;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
            }
        }
        Pair pair = new Pair(arrayList2, arrayList3);
        return findRes.onExtraCallbackWithResult(new onExtraCallback(context, (List) pair.IAuthTabCallback(), z, (List) pair.onExtraCallbackWithResult(), null), access13800Var);
    }
}
