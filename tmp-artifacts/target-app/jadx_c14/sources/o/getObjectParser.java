package o;

import androidx.lifecycle.ViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.getTileModeY;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getObjectParser extends ViewModel {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    public static final int onExtraCallback = 8;
    private final getCornerRadius<List<onExtraCallback>> IAuthTabCallback;
    private final setRubIn<Boolean> IAuthTabCallbackDefault;
    private final setRubIn<List<IAuthTabCallback>> IAuthTabCallbackStub;
    private final setRubIn<List<String>> IAuthTabCallback_Parcel;
    private String access000;
    private String access100;
    private final setRubIn<List<IAuthTabCallback.onWarmupCompleted>> asBinder;
    private final Rmipmap<onWarmupCompleted> asInterface;
    private final setRubIn<String> getInterfaceDescriptor;
    private final getCornerRadius<Boolean> onExtraCallbackWithResult;
    private final getCornerRadius<String> onNavigationEvent;
    private final setRubIn<Boolean> onTransact;
    private final getCornerRadius<Boolean> onWarmupCompleted;

    public getObjectParser() {
        getCornerRadius<List<onExtraCallback>> getcornerradiusOnNavigationEvent = setShine.onNavigationEvent(CollectionsKt.emptyList());
        this.IAuthTabCallback = getcornerradiusOnNavigationEvent;
        getCornerRadius<String> getcornerradiusOnNavigationEvent2 = setShine.onNavigationEvent("");
        this.onNavigationEvent = getcornerradiusOnNavigationEvent2;
        this.getInterfaceDescriptor = ycxycx.onExtraCallback(getcornerradiusOnNavigationEvent2);
        Boolean bool = Boolean.FALSE;
        getCornerRadius<Boolean> getcornerradiusOnNavigationEvent3 = setShine.onNavigationEvent(bool);
        this.onExtraCallbackWithResult = getcornerradiusOnNavigationEvent3;
        getCornerRadius<Boolean> getcornerradiusOnNavigationEvent4 = setShine.onNavigationEvent(bool);
        this.onWarmupCompleted = getcornerradiusOnNavigationEvent4;
        this.onTransact = ycxycx.onExtraCallback(getcornerradiusOnNavigationEvent4);
        this.access000 = "";
        this.access100 = "";
        IAnimation iAnimationOnNavigationEvent = ycxycx.onNavigationEvent(new IAuthTabCallbackDefault(getcornerradiusOnNavigationEvent));
        findResAndMsg findresandmsgIAuthTabCallback = ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this);
        getTileModeY.onWarmupCompleted onwarmupcompleted = getTileModeY.Companion;
        this.IAuthTabCallback_Parcel = ycxycx.IAuthTabCallback(iAnimationOnNavigationEvent, findresandmsgIAuthTabCallback, onwarmupcompleted.onNavigationEvent(), CollectionsKt.emptyList());
        this.IAuthTabCallbackDefault = ycxycx.IAuthTabCallback(ycxycx.onNavigationEvent(new asInterface(getcornerradiusOnNavigationEvent)), ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), onwarmupcompleted.onNavigationEvent(), bool);
        this.asBinder = ycxycx.IAuthTabCallback(new onTransact(getcornerradiusOnNavigationEvent), ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), onwarmupcompleted.onNavigationEvent(), CollectionsKt.emptyList());
        this.IAuthTabCallbackStub = ycxycx.IAuthTabCallback(ycxycx.onExtraCallbackWithResult(getcornerradiusOnNavigationEvent, getcornerradiusOnNavigationEvent2, getcornerradiusOnNavigationEvent3, new onExtraCallbackWithResult(null)), ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), onwarmupcompleted.onNavigationEvent(), CollectionsKt.emptyList());
        this.asInterface = new Rmipmap<>();
    }

    public final setRubIn<String> asBinder() {
        return this.getInterfaceDescriptor;
    }

    public final setRubIn<Boolean> asInterface() {
        return this.onTransact;
    }

    public final String onExtraCallbackWithResult() {
        return this.access000;
    }

    public static final class IAuthTabCallbackDefault implements IAnimation<List<? extends String>> {
        final /* synthetic */ IAnimation onNavigationEvent;

        /* renamed from: o.getObjectParser$IAuthTabCallbackDefault$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements setRipple {
            final /* synthetic */ setRipple onExtraCallbackWithResult;

            /* renamed from: o.getObjectParser$IAuthTabCallbackDefault$5$4, reason: invalid class name */
            public static final class AnonymousClass4 extends ContinuationImpl {
                int I$0;
                Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                int label;
                /* synthetic */ Object result;

                public AnonymousClass4(access13800 access13800Var) {
                    super(access13800Var);
                }

                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return AnonymousClass5.this.emit(null, this);
                }
            }

            public AnonymousClass5(setRipple setripple) {
                this.onExtraCallbackWithResult = setripple;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r7, o.access13800 r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof o.getObjectParser.IAuthTabCallbackDefault.AnonymousClass5.AnonymousClass4
                    if (r0 == 0) goto L13
                    r0 = r8
                    o.getObjectParser$IAuthTabCallbackDefault$5$4 r0 = (o.getObjectParser.IAuthTabCallbackDefault.AnonymousClass5.AnonymousClass4) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 + r2
                    r0.label = r1
                    goto L18
                L13:
                    o.getObjectParser$IAuthTabCallbackDefault$5$4 r0 = new o.getObjectParser$IAuthTabCallbackDefault$5$4
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.result
                    java.lang.Object r1 = o.access14300.onWarmupCompleted()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L39
                    if (r2 != r3) goto L31
                    java.lang.Object r7 = r0.L$3
                    o.setRipple r7 = (o.setRipple) r7
                    java.lang.Object r7 = r0.L$1
                    o.getObjectParser$IAuthTabCallbackDefault$5$4 r7 = (o.getObjectParser.IAuthTabCallbackDefault.AnonymousClass5.AnonymousClass4) r7
                    kotlin.ResultKt.onNavigationEvent(r8)
                    goto L92
                L31:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L39:
                    kotlin.ResultKt.onNavigationEvent(r8)
                    o.setRipple r8 = r6.onExtraCallbackWithResult
                    r2 = r7
                    java.util.List r2 = (java.util.List) r2
                    java.lang.Iterable r2 = (java.lang.Iterable) r2
                    java.util.ArrayList r4 = new java.util.ArrayList
                    r5 = 10
                    int r5 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r5)
                    r4.<init>(r5)
                    java.util.Iterator r2 = r2.iterator()
                L52:
                    boolean r5 = r2.hasNext()
                    if (r5 == 0) goto L6a
                    java.lang.Object r5 = r2.next()
                    o.getObjectParser$onExtraCallback r5 = (o.getObjectParser.onExtraCallback) r5
                    o.TabBarInfoQueryPointOnTabBarInfoQueryListener r5 = r5.onWarmupCompleted()
                    java.lang.String r5 = r5.asInterface()
                    r4.add(r5)
                    goto L52
                L6a:
                    java.util.List r2 = kotlin.collections.CollectionsKt.distinct(r4)
                    java.lang.Object r4 = o.access15400.onNavigationEvent(r7)
                    r0.L$0 = r4
                    java.lang.Object r4 = o.access15400.onNavigationEvent(r0)
                    r0.L$1 = r4
                    java.lang.Object r7 = o.access15400.onNavigationEvent(r7)
                    r0.L$2 = r7
                    java.lang.Object r7 = o.access15400.onNavigationEvent(r8)
                    r0.L$3 = r7
                    r7 = 0
                    r0.I$0 = r7
                    r0.label = r3
                    java.lang.Object r7 = r8.emit(r2, r0)
                    if (r7 != r1) goto L92
                    return r1
                L92:
                    kotlin.Unit r7 = kotlin.Unit.INSTANCE
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: o.getObjectParser.IAuthTabCallbackDefault.AnonymousClass5.emit(java.lang.Object, o.access13800):java.lang.Object");
            }
        }

        public IAuthTabCallbackDefault(IAnimation iAnimation) {
            this.onNavigationEvent = iAnimation;
        }

        public Object collect(setRipple setripple, access13800 access13800Var) {
            Object objCollect = this.onNavigationEvent.collect(new AnonymousClass5(setripple), access13800Var);
            return objCollect == access14300.onWarmupCompleted() ? objCollect : Unit.INSTANCE;
        }
    }

    public final String onTransact() {
        return this.access100;
    }

    public static final class asInterface implements IAnimation<Boolean> {
        final /* synthetic */ IAnimation onWarmupCompleted;

        /* renamed from: o.getObjectParser$asInterface$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements setRipple {
            final /* synthetic */ setRipple onExtraCallbackWithResult;

            /* renamed from: o.getObjectParser$asInterface$3$2, reason: invalid class name */
            public static final class AnonymousClass2 extends ContinuationImpl {
                int I$0;
                Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                int label;
                /* synthetic */ Object result;

                public AnonymousClass2(access13800 access13800Var) {
                    super(access13800Var);
                }

                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return AnonymousClass3.this.emit(null, this);
                }
            }

            public AnonymousClass3(setRipple setripple) {
                this.onExtraCallbackWithResult = setripple;
            }

            /* JADX WARN: Removed duplicated region for block: B:28:0x0091 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r7, o.access13800 r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof o.getObjectParser.asInterface.AnonymousClass3.AnonymousClass2
                    if (r0 == 0) goto L13
                    r0 = r8
                    o.getObjectParser$asInterface$3$2 r0 = (o.getObjectParser.asInterface.AnonymousClass3.AnonymousClass2) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 + r2
                    r0.label = r1
                    goto L18
                L13:
                    o.getObjectParser$asInterface$3$2 r0 = new o.getObjectParser$asInterface$3$2
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.result
                    java.lang.Object r1 = o.access14300.onWarmupCompleted()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L39
                    if (r2 != r3) goto L31
                    java.lang.Object r7 = r0.L$3
                    o.setRipple r7 = (o.setRipple) r7
                    java.lang.Object r7 = r0.L$1
                    o.getObjectParser$asInterface$3$2 r7 = (o.getObjectParser.asInterface.AnonymousClass3.AnonymousClass2) r7
                    kotlin.ResultKt.onNavigationEvent(r8)
                    goto L92
                L31:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L39:
                    kotlin.ResultKt.onNavigationEvent(r8)
                    o.setRipple r8 = r6.onExtraCallbackWithResult
                    r2 = r7
                    java.util.List r2 = (java.util.List) r2
                    java.lang.Iterable r2 = (java.lang.Iterable) r2
                    boolean r4 = r2 instanceof java.util.Collection
                    r5 = 0
                    if (r4 == 0) goto L52
                    r4 = r2
                    java.util.Collection r4 = (java.util.Collection) r4
                    boolean r4 = r4.isEmpty()
                    if (r4 == 0) goto L52
                    goto L6a
                L52:
                    java.util.Iterator r2 = r2.iterator()
                L56:
                    boolean r4 = r2.hasNext()
                    if (r4 == 0) goto L6a
                    java.lang.Object r4 = r2.next()
                    o.getObjectParser$onExtraCallback r4 = (o.getObjectParser.onExtraCallback) r4
                    boolean r4 = r4.onNavigationEvent()
                    if (r4 == 0) goto L56
                    r2 = r3
                    goto L6b
                L6a:
                    r2 = r5
                L6b:
                    java.lang.Boolean r2 = o.access14000.onNavigationEvent(r2)
                    java.lang.Object r4 = o.access15400.onNavigationEvent(r7)
                    r0.L$0 = r4
                    java.lang.Object r4 = o.access15400.onNavigationEvent(r0)
                    r0.L$1 = r4
                    java.lang.Object r7 = o.access15400.onNavigationEvent(r7)
                    r0.L$2 = r7
                    java.lang.Object r7 = o.access15400.onNavigationEvent(r8)
                    r0.L$3 = r7
                    r0.I$0 = r5
                    r0.label = r3
                    java.lang.Object r7 = r8.emit(r2, r0)
                    if (r7 != r1) goto L92
                    return r1
                L92:
                    kotlin.Unit r7 = kotlin.Unit.INSTANCE
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: o.getObjectParser.asInterface.AnonymousClass3.emit(java.lang.Object, o.access13800):java.lang.Object");
            }
        }

        public asInterface(IAnimation iAnimation) {
            this.onWarmupCompleted = iAnimation;
        }

        public Object collect(setRipple setripple, access13800 access13800Var) {
            Object objCollect = this.onWarmupCompleted.collect(new AnonymousClass3(setripple), access13800Var);
            return objCollect == access14300.onWarmupCompleted() ? objCollect : Unit.INSTANCE;
        }
    }

    public final setRubIn<Boolean> IAuthTabCallback() {
        return this.IAuthTabCallbackDefault;
    }

    public static final class onTransact implements IAnimation<List<? extends IAuthTabCallback.onWarmupCompleted>> {
        final /* synthetic */ IAnimation onExtraCallbackWithResult;

        /* renamed from: o.getObjectParser$onTransact$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements setRipple {
            final /* synthetic */ setRipple onExtraCallback;

            /* renamed from: o.getObjectParser$onTransact$2$2, reason: invalid class name and collision with other inner class name */
            public static final class C00132 extends ContinuationImpl {
                int I$0;
                Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                int label;
                /* synthetic */ Object result;

                public C00132(access13800 access13800Var) {
                    super(access13800Var);
                }

                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return AnonymousClass2.this.emit(null, this);
                }
            }

            public AnonymousClass2(setRipple setripple) {
                this.onExtraCallback = setripple;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r14, o.access13800 r15) {
                /*
                    r13 = this;
                    boolean r0 = r15 instanceof o.getObjectParser.onTransact.AnonymousClass2.C00132
                    if (r0 == 0) goto L13
                    r0 = r15
                    o.getObjectParser$onTransact$2$2 r0 = (o.getObjectParser.onTransact.AnonymousClass2.C00132) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 + r2
                    r0.label = r1
                    goto L18
                L13:
                    o.getObjectParser$onTransact$2$2 r0 = new o.getObjectParser$onTransact$2$2
                    r0.<init>(r15)
                L18:
                    java.lang.Object r15 = r0.result
                    java.lang.Object r1 = o.access14300.onWarmupCompleted()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L3a
                    if (r2 != r3) goto L32
                    java.lang.Object r14 = r0.L$3
                    o.setRipple r14 = (o.setRipple) r14
                    java.lang.Object r14 = r0.L$1
                    o.getObjectParser$onTransact$2$2 r14 = (o.getObjectParser.onTransact.AnonymousClass2.C00132) r14
                    kotlin.ResultKt.onNavigationEvent(r15)
                    goto Lb3
                L32:
                    java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                    java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
                    r14.<init>(r15)
                    throw r14
                L3a:
                    kotlin.ResultKt.onNavigationEvent(r15)
                    o.setRipple r15 = r13.onExtraCallback
                    r2 = r14
                    java.util.List r2 = (java.util.List) r2
                    java.lang.Iterable r2 = (java.lang.Iterable) r2
                    java.util.ArrayList r4 = new java.util.ArrayList
                    r5 = 10
                    int r5 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r5)
                    r4.<init>(r5)
                    java.util.Iterator r2 = r2.iterator()
                L53:
                    boolean r5 = r2.hasNext()
                    if (r5 == 0) goto L8f
                    java.lang.Object r5 = r2.next()
                    o.getObjectParser$onExtraCallback r5 = (o.getObjectParser.onExtraCallback) r5
                    o.TabBarInfoQueryPointOnTabBarInfoQueryListener r6 = r5.onWarmupCompleted()
                    java.lang.String r8 = r6.onExtraCallbackWithResult()
                    java.lang.String r9 = r6.asBinder()
                    java.lang.String r7 = " "
                    java.lang.String r10 = r6.onExtraCallback(r7)
                    o.checkNavigationBarBySystemProperties r6 = r6.IAuthTabCallbackStub()
                    java.lang.String r6 = r6.getInterfaceDescriptor()
                    boolean r7 = kotlin.text.StringsKt.isBlank(r6)
                    if (r7 == 0) goto L80
                    r6 = 0
                L80:
                    r11 = r6
                    boolean r12 = r5.onNavigationEvent()
                    o.getObjectParser$IAuthTabCallback$onWarmupCompleted r5 = new o.getObjectParser$IAuthTabCallback$onWarmupCompleted
                    r7 = r5
                    r7.<init>(r8, r9, r10, r11, r12)
                    r4.add(r5)
                    goto L53
                L8f:
                    java.lang.Object r2 = o.access15400.onNavigationEvent(r14)
                    r0.L$0 = r2
                    java.lang.Object r2 = o.access15400.onNavigationEvent(r0)
                    r0.L$1 = r2
                    java.lang.Object r14 = o.access15400.onNavigationEvent(r14)
                    r0.L$2 = r14
                    java.lang.Object r14 = o.access15400.onNavigationEvent(r15)
                    r0.L$3 = r14
                    r14 = 0
                    r0.I$0 = r14
                    r0.label = r3
                    java.lang.Object r14 = r15.emit(r4, r0)
                    if (r14 != r1) goto Lb3
                    return r1
                Lb3:
                    kotlin.Unit r14 = kotlin.Unit.INSTANCE
                    return r14
                */
                throw new UnsupportedOperationException("Method not decompiled: o.getObjectParser.onTransact.AnonymousClass2.emit(java.lang.Object, o.access13800):java.lang.Object");
            }
        }

        public onTransact(IAnimation iAnimation) {
            this.onExtraCallbackWithResult = iAnimation;
        }

        public Object collect(setRipple setripple, access13800 access13800Var) {
            Object objCollect = this.onExtraCallbackWithResult.collect(new AnonymousClass2(setripple), access13800Var);
            return objCollect == access14300.onWarmupCompleted() ? objCollect : Unit.INSTANCE;
        }
    }

    public final setRubIn<List<IAuthTabCallback.onWarmupCompleted>> onNavigationEvent() {
        return this.asBinder;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements setTaggedAddrCtrl<List<? extends onExtraCallback>, String, Boolean, access13800<? super List<? extends IAuthTabCallback>>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ boolean Z$0;
        int label;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(4, access13800Var);
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return onNavigationEvent((List) obj, (String) obj2, ((Boolean) obj3).booleanValue(), (access13800) obj4);
        }

        public final Object onNavigationEvent(List<onExtraCallback> list, String str, boolean z, access13800<? super List<? extends IAuthTabCallback>> access13800Var) {
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
            onextracallbackwithresult.L$0 = list;
            onextracallbackwithresult.L$1 = str;
            onextracallbackwithresult.Z$0 = z;
            return onextracallbackwithresult.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
            List listTake;
            List list = (List) this.L$0;
            String str = (String) this.L$1;
            boolean z = this.Z$0;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            boolean z2 = list.size() > 3;
            if (z) {
                listTake = list;
            } else {
                if (z) {
                    throw new NoWhenBranchMatchedException();
                }
                listTake = CollectionsKt.take(list, 3);
            }
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            listCreateListBuilder.add(new IAuthTabCallback.C0012IAuthTabCallback(str));
            List<onExtraCallback> list2 = listTake;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (onExtraCallback onextracallback : list2) {
                TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted = onextracallback.onWarmupCompleted();
                String strOnExtraCallbackWithResult = tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted.onExtraCallbackWithResult();
                String strAsBinder = tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted.asBinder();
                String strOnExtraCallback = tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted.onExtraCallback(" ");
                String interfaceDescriptor = tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted.IAuthTabCallbackStub().getInterfaceDescriptor();
                if (StringsKt.isBlank(interfaceDescriptor)) {
                    interfaceDescriptor = null;
                }
                arrayList.add(new IAuthTabCallback.onWarmupCompleted(strOnExtraCallbackWithResult, strAsBinder, strOnExtraCallback, interfaceDescriptor, onextracallback.onNavigationEvent()));
            }
            listCreateListBuilder.addAll(arrayList);
            if (z2 && !z) {
                listCreateListBuilder.add(new IAuthTabCallback.onNavigationEvent(list.size() - 3));
            }
            return CollectionsKt.build(listCreateListBuilder);
        }
    }

    public final Rmipmap<onWarmupCompleted> onWarmupCompleted() {
        return this.asInterface;
    }

    public final void IAuthTabCallback(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onNavigationEvent.onWarmupCompleted(str);
    }

    public final void onExtraCallbackWithResult(@NotNull List<? extends TabBarInfoQueryPointOnTabBarInfoQueryListener> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        getCornerRadius<List<onExtraCallback>> getcornerradius = this.IAuthTabCallback;
        List<? extends TabBarInfoQueryPointOnTabBarInfoQueryListener> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new onExtraCallback((TabBarInfoQueryPointOnTabBarInfoQueryListener) it.next(), z));
        }
        getcornerradius.onWarmupCompleted(arrayList);
    }

    public final void onExtraCallbackWithResult(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        List list = (List) this.IAuthTabCallback.IAuthTabCallback();
        getCornerRadius<List<onExtraCallback>> getcornerradius = this.IAuthTabCallback;
        List<onExtraCallback> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (onExtraCallback onextracallbackIAuthTabCallback : list2) {
            if (Intrinsics.areEqual(onextracallbackIAuthTabCallback.onWarmupCompleted().onExtraCallbackWithResult(), str)) {
                onextracallbackIAuthTabCallback = onExtraCallback.IAuthTabCallback(onextracallbackIAuthTabCallback, null, z, 1, null);
            }
            arrayList.add(onextracallbackIAuthTabCallback);
        }
        getcornerradius.onWarmupCompleted(arrayList);
    }

    public final List<TabBarInfoQueryPointOnTabBarInfoQueryListener> onExtraCallback() {
        Iterable iterable = (Iterable) this.IAuthTabCallback.IAuthTabCallback();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (((onExtraCallback) obj).onNavigationEvent()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((onExtraCallback) it.next()).onWarmupCompleted());
        }
        return arrayList2;
    }

    public final void IAuthTabCallbackDefault() {
        List<TabBarInfoQueryPointOnTabBarInfoQueryListener> listOnExtraCallback = onExtraCallback();
        Rmipmap<onWarmupCompleted> rmipmap = this.asInterface;
        List<TabBarInfoQueryPointOnTabBarInfoQueryListener> list = listOnExtraCallback;
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((TabBarInfoQueryPointOnTabBarInfoQueryListener) it.next()).IAuthTabCallbackStub().ICustomTabsCallback()) {
                    z = true;
                    break;
                }
            }
        }
        rmipmap.setValue(new onWarmupCompleted(listOnExtraCallback, z));
    }

    public final void onExtraCallback(boolean z) {
        this.onWarmupCompleted.onWarmupCompleted(Boolean.valueOf(z));
    }

    public final void onNavigationEvent(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.access000 = str;
        this.access100 = str2;
    }

    static final class onExtraCallback {
        private final TabBarInfoQueryPointOnTabBarInfoQueryListener onExtraCallbackWithResult;
        private final boolean onNavigationEvent;

        public static /* synthetic */ onExtraCallback IAuthTabCallback(onExtraCallback onextracallback, TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                tabBarInfoQueryPointOnTabBarInfoQueryListener = onextracallback.onExtraCallbackWithResult;
            }
            if ((i & 2) != 0) {
                z = onextracallback.onNavigationEvent;
            }
            return onextracallback.IAuthTabCallback(tabBarInfoQueryPointOnTabBarInfoQueryListener, z);
        }

        public final onExtraCallback IAuthTabCallback(@NotNull TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener, boolean z) {
            Intrinsics.checkNotNullParameter(tabBarInfoQueryPointOnTabBarInfoQueryListener, "");
            return new onExtraCallback(tabBarInfoQueryPointOnTabBarInfoQueryListener, z);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallback)) {
                return false;
            }
            onExtraCallback onextracallback = (onExtraCallback) obj;
            return Intrinsics.areEqual(this.onExtraCallbackWithResult, onextracallback.onExtraCallbackWithResult) && this.onNavigationEvent == onextracallback.onNavigationEvent;
        }

        public int hashCode() {
            return (this.onExtraCallbackWithResult.hashCode() * 31) + Boolean.hashCode(this.onNavigationEvent);
        }

        public String toString() {
            return "TargetAccountModel(bankAccount=" + this.onExtraCallbackWithResult + ", isSelected=" + this.onNavigationEvent + ")";
        }

        public onExtraCallback(@NotNull TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener, boolean z) {
            Intrinsics.checkNotNullParameter(tabBarInfoQueryPointOnTabBarInfoQueryListener, "");
            this.onExtraCallbackWithResult = tabBarInfoQueryPointOnTabBarInfoQueryListener;
            this.onNavigationEvent = z;
        }

        public final TabBarInfoQueryPointOnTabBarInfoQueryListener onWarmupCompleted() {
            return this.onExtraCallbackWithResult;
        }

        public final boolean onNavigationEvent() {
            return this.onNavigationEvent;
        }
    }

    public interface IAuthTabCallback {

        public static final class onWarmupCompleted implements IAuthTabCallback {
            private final String IAuthTabCallback;
            private final String onExtraCallback;
            private final String onExtraCallbackWithResult;
            private final String onNavigationEvent;
            private final boolean onWarmupCompleted;

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof onWarmupCompleted)) {
                    return false;
                }
                onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
                return Intrinsics.areEqual(this.IAuthTabCallback, onwarmupcompleted.IAuthTabCallback) && Intrinsics.areEqual(this.onExtraCallback, onwarmupcompleted.onExtraCallback) && Intrinsics.areEqual(this.onExtraCallbackWithResult, onwarmupcompleted.onExtraCallbackWithResult) && Intrinsics.areEqual(this.onNavigationEvent, onwarmupcompleted.onNavigationEvent) && this.onWarmupCompleted == onwarmupcompleted.onWarmupCompleted;
            }

            public int hashCode() {
                int iHashCode = this.IAuthTabCallback.hashCode();
                int iHashCode2 = this.onExtraCallback.hashCode();
                int iHashCode3 = this.onExtraCallbackWithResult.hashCode();
                String str = this.onNavigationEvent;
                return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.onWarmupCompleted);
            }

            public String toString() {
                return "Account(accountId=" + this.IAuthTabCallback + ", title=" + this.onExtraCallback + ", description=" + this.onExtraCallbackWithResult + ", iconUrl=" + this.onNavigationEvent + ", isSelected=" + this.onWarmupCompleted + ")";
            }

            public onWarmupCompleted(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4, boolean z) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                this.IAuthTabCallback = str;
                this.onExtraCallback = str2;
                this.onExtraCallbackWithResult = str3;
                this.onNavigationEvent = str4;
                this.onWarmupCompleted = z;
            }

            public final String onExtraCallbackWithResult() {
                return this.IAuthTabCallback;
            }

            public final String onNavigationEvent() {
                return this.onExtraCallback;
            }

            public final String onWarmupCompleted() {
                return this.onExtraCallbackWithResult;
            }

            public final String IAuthTabCallback() {
                return this.onNavigationEvent;
            }

            public final boolean onExtraCallback() {
                return this.onWarmupCompleted;
            }
        }

        public static final class onNavigationEvent implements IAuthTabCallback {
            private final int IAuthTabCallback;

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof onNavigationEvent) && this.IAuthTabCallback == ((onNavigationEvent) obj).IAuthTabCallback;
            }

            public int hashCode() {
                return Integer.hashCode(this.IAuthTabCallback);
            }

            public String toString() {
                return "ShowMoreAccounts(moreAccountsCount=" + this.IAuthTabCallback + ")";
            }

            public onNavigationEvent(int i) {
                this.IAuthTabCallback = i;
            }
        }

        /* renamed from: o.getObjectParser$IAuthTabCallback$IAuthTabCallback, reason: collision with other inner class name */
        public static final class C0012IAuthTabCallback implements IAuthTabCallback {
            private final String onNavigationEvent;

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0012IAuthTabCallback) && Intrinsics.areEqual(this.onNavigationEvent, ((C0012IAuthTabCallback) obj).onNavigationEvent);
            }

            public int hashCode() {
                return this.onNavigationEvent.hashCode();
            }

            public String toString() {
                return "Title(title=" + this.onNavigationEvent + ")";
            }

            public C0012IAuthTabCallback(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.onNavigationEvent = str;
            }
        }
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }
}
