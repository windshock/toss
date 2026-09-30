package o;

import com.facebook.react.uimanager.LayoutShadowNode;
import im.toss.core.webkit.bridge.accessarybutton.IconDoubleAccessoryButtonConfiguration;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.LottieDrawableExternalSyntheticLambda17;
import o.isQueryRefinementEnabled;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class LottieDrawableExternalSyntheticLambda17 {
    private static int access000 = 1;
    private static int getInterfaceDescriptor;
    private final getSupportedHighSpeedResolutions IAuthTabCallback;
    private final findResAndMsg IAuthTabCallbackDefault;
    private final boolean IAuthTabCallbackStub;
    private final Function0<Unit> IAuthTabCallbackStubProxy;
    private final CameraPresenceProviderExternalSyntheticLambda6<Function0<Unit>> IAuthTabCallback_Parcel;
    private final Function0<Unit> access100;
    private final getSupportedHighSpeedResolutions asBinder;
    private final inflateMenu asInterface;
    private final getSupportedHighSpeedResolutionsFor onExtraCallback;
    private final CameraPresenceProviderExternalSyntheticLambda6 onExtraCallbackWithResult;
    private final getSupportedHighSpeedResolutions onNavigationEvent;
    private boolean onTransact;
    private final getSupportedHighSpeedResolutions onWarmupCompleted;

    public static /* synthetic */ float onNavigationEvent(LottieDrawableExternalSyntheticLambda17 lottieDrawableExternalSyntheticLambda17) {
        int i = 2 % 2;
        int i2 = access000 + 61;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(lottieDrawableExternalSyntheticLambda17);
        }
        IAuthTabCallback(lottieDrawableExternalSyntheticLambda17);
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~((~i) | i4);
        int i8 = ~((~i4) | i6);
        int i9 = i8 | i7;
        int i10 = i8 | (~((~i6) | i4));
        int i11 = i4 + i6 + i3 + (762724209 * i2) + (1201824936 * i5);
        int i12 = i11 * i11;
        int i13 = ((-126223985) * i4) + 43253760 + (1339426419 * i6) + ((-1465650404) * i7) + (1465650404 * i9) + (1414658446 * i10) + ((-1540882432) * i3) + (1302855680 * i2) + (1514143744 * i5) + (1905524736 * i12);
        int i14 = ((i4 * 162561953) - 555857873) + (i6 * 162559997) + (i7 * 1956) + (i9 * (-1956)) + (i10 * 978) + (i3 * 162560975) + (i2 * 701011807) + (i5 * 237771736) + (i12 * (-223608832));
        int i15 = i13 + (i14 * i14 * 703332352);
        return i15 != 1 ? i15 != 2 ? i15 != 3 ? i15 != 4 ? onNavigationEvent(objArr) : onExtraCallback(objArr) : onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr) : onWarmupCompleted(objArr);
    }

    public LottieDrawableExternalSyntheticLambda17(@NotNull findResAndMsg findresandmsg, @NotNull CameraPresenceProviderExternalSyntheticLambda6<? extends Function0<Unit>> cameraPresenceProviderExternalSyntheticLambda6, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, boolean z, float f, float f2) {
        Intrinsics.checkNotNullParameter(findresandmsg, "");
        Intrinsics.checkNotNullParameter(cameraPresenceProviderExternalSyntheticLambda6, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        this.IAuthTabCallbackDefault = findresandmsg;
        this.IAuthTabCallback_Parcel = cameraPresenceProviderExternalSyntheticLambda6;
        this.access100 = function0;
        this.IAuthTabCallbackStubProxy = function02;
        this.IAuthTabCallbackStub = z;
        this.onExtraCallbackWithResult = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new Function0() { // from class: im.toss.compose.widget.ptr.TdsPullRefreshState$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 109;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Float fValueOf = Float.valueOf(LottieDrawableExternalSyntheticLambda17.onNavigationEvent(this.f$0));
                int i4 = IAuthTabCallback + 105;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return fValueOf;
            }
        });
        this.onExtraCallback = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onNavigationEvent = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(0.0f);
        this.asBinder = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(0.0f);
        this.IAuthTabCallback = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(f2);
        this.onWarmupCompleted = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(f);
        this.asInterface = new inflateMenu();
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        LottieDrawableExternalSyntheticLambda17 lottieDrawableExternalSyntheticLambda17 = (LottieDrawableExternalSyntheticLambda17) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 81;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        inflateMenu inflatemenu = lottieDrawableExternalSyntheticLambda17.asInterface;
        int i5 = i2 + 73;
        access000 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 45 / 0;
        }
        return inflatemenu;
    }

    public static final /* synthetic */ float onWarmupCompleted(LottieDrawableExternalSyntheticLambda17 lottieDrawableExternalSyntheticLambda17) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 9;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        float fIAuthTabCallbackDefault = lottieDrawableExternalSyntheticLambda17.IAuthTabCallbackDefault();
        int i4 = getInterfaceDescriptor + 103;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return fIAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        LottieDrawableExternalSyntheticLambda17 lottieDrawableExternalSyntheticLambda17 = (LottieDrawableExternalSyntheticLambda17) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = access000 + 115;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        lottieDrawableExternalSyntheticLambda17.IAuthTabCallbackDefault(fFloatValue);
        if (i3 == 0) {
            return null;
        }
        throw null;
    }

    public final float IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = access000 + 3;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (!(!this.IAuthTabCallbackStub)) {
            return 0.0f;
        }
        float fIAuthTabCallbackStub = IAuthTabCallbackStub() / onExtraCallbackWithResult();
        int i3 = access000 + 111;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            return fIAuthTabCallbackStub;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = access000 + 107;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        boolean z = this.onTransact;
        int i5 = i3 + 35;
        access000 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 84 / 0;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        if (r4 == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        if ((!r4) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        LottieDrawableExternalSyntheticLambda17 lottieDrawableExternalSyntheticLambda17 = (LottieDrawableExternalSyntheticLambda17) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 117;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            lottieDrawableExternalSyntheticLambda17.asInterface();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (lottieDrawableExternalSyntheticLambda17.asInterface()) {
            int i3 = access000 + 61;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            boolean z = lottieDrawableExternalSyntheticLambda17.IAuthTabCallbackStub;
            if (i4 != 0) {
                int i5 = 0 / 0;
            }
        }
        return false;
    }

    public final float onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access000 + 7;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        if (!(!this.IAuthTabCallbackStub)) {
            return 0.0f;
        }
        float fIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        int i4 = access000 + 125;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return fIAuthTabCallbackDefault;
    }

    public final float onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 117;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        float fIAuthTabCallback_Parcel = IAuthTabCallback_Parcel();
        int i4 = getInterfaceDescriptor + 57;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return fIAuthTabCallback_Parcel;
    }

    private static final float IAuthTabCallback(LottieDrawableExternalSyntheticLambda17 lottieDrawableExternalSyntheticLambda17) {
        int i = 2 % 2;
        int i2 = access000 + 53;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        float fFloatValue = ((Float) onWarmupCompleted(iOnNavigationEvent, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), iOnNavigationEvent2, 463810934, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{lottieDrawableExternalSyntheticLambda17}, -463810932)).floatValue() * 0.5f;
        int i4 = getInterfaceDescriptor + 37;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return fFloatValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        r17.access100.invoke();
        r4 = com.facebook.react.uimanager.LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        r6 = com.facebook.react.uimanager.LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        r2 = kotlin.ranges.RangesKt.coerceAtLeast(((java.lang.Float) onWarmupCompleted(r4, com.facebook.react.uimanager.LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), r6, 463810934, com.facebook.react.uimanager.LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new java.lang.Object[]{r17}, -463810932)).floatValue() + r18, 0.0f);
        r10 = com.facebook.react.uimanager.LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        r12 = com.facebook.react.uimanager.LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        r3 = ((java.lang.Float) onWarmupCompleted(r10, com.facebook.react.uimanager.LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), r12, 463810934, com.facebook.react.uimanager.LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new java.lang.Object[]{r17}, -463810932)).floatValue();
        asBinder(r2);
        IAuthTabCallbackDefault(asBinder());
        r2 = r2 - r3;
        r3 = o.LottieDrawableExternalSyntheticLambda17.getInterfaceDescriptor + 1;
        o.LottieDrawableExternalSyntheticLambda17.access000 = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0087, code lost:
    
        if ((r3 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0089, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (asInterface() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (asInterface() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        return 0.0f;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float IAuthTabCallback(float f) {
        int i = 2 % 2;
        int i2 = access000 + 79;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 40 / 0;
        }
    }

    public final float onExtraCallback(float f) {
        int i = 2 % 2;
        if (asInterface()) {
            return 0.0f;
        }
        if (IAuthTabCallbackStub() > onExtraCallbackWithResult()) {
            ((Function0) this.IAuthTabCallback_Parcel.onExtraCallbackWithResult()).invoke();
            this.onTransact = true;
        }
        onWarmupCompleted(0.0f);
        if (((Float) onWarmupCompleted(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 463810934, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{this}, -463810932)).floatValue() == 0.0f || f < 0.0f) {
            int i2 = getInterfaceDescriptor + 5;
            access000 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 4 / 5;
            }
            f = 0.0f;
        }
        asBinder(0.0f);
        int i4 = access000 + 77;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return f;
        }
        throw null;
    }

    public final void onExtraCallback(boolean z) {
        int i = 2 % 2;
        int i2 = access000 + 83;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        if (asInterface() != z) {
            int i4 = access000 + 117;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            if (this.onTransact) {
                onWarmupCompleted(z ? access000() : 0.0f);
            }
            onWarmupCompleted(z);
            asBinder(0.0f);
            if (IAuthTabCallbackDefault() <= 0.0f || z || !this.onTransact) {
                return;
            }
            this.IAuthTabCallbackStubProxy.invoke();
            this.onTransact = false;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        LottieDrawableExternalSyntheticLambda17 lottieDrawableExternalSyntheticLambda17 = (LottieDrawableExternalSyntheticLambda17) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = access000 + 61;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        lottieDrawableExternalSyntheticLambda17.onTransact(fFloatValue);
        int i4 = access000 + 23;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final void onNavigationEvent(float f) {
        int i = 2 % 2;
        if (access000() == f) {
            return;
        }
        IAuthTabCallbackStub(f);
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        if (((Boolean) onWarmupCompleted(iOnNavigationEvent, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), iOnNavigationEvent2, -1787313507, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{this}, 1787313511)).booleanValue()) {
            int i2 = access000;
            int i3 = i2 + 31;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            if (this.onTransact) {
                int i5 = i2 + 19;
                getInterfaceDescriptor = i5 % 128;
                int i6 = i5 % 2;
                onWarmupCompleted(f);
            }
        }
    }

    private final getPackageType onWarmupCompleted(float f) {
        int i = 2 % 2;
        Object obj = null;
        getPackageType getpackagetypeOnNavigationEvent = maybeUpdateAnimatable.onNavigationEvent(this.IAuthTabCallbackDefault, (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(f, null), 3, (Object) null);
        int i2 = access000 + 35;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return getpackagetypeOnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ float $offset;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(float f, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$offset = f;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = LottieDrawableExternalSyntheticLambda17.this.new onNavigationEvent(this.$offset, access13800Var);
            int i2 = onExtraCallback + 77;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 103;
            onExtraCallbackWithResult = i2 % 128;
            Object obj3 = null;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onWarmupCompleted(findresandmsg, access13800Var);
                obj3.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            int i3 = onExtraCallback + 51;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return objOnWarmupCompleted;
            }
            obj3.hashCode();
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 85;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 27;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 11 / 0;
            }
            return objInvokeSuspend;
        }

        /* renamed from: o.LottieDrawableExternalSyntheticLambda17$onNavigationEvent$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;
            final /* synthetic */ float $offset;
            Object L$0;
            int label;
            final /* synthetic */ LottieDrawableExternalSyntheticLambda17 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(LottieDrawableExternalSyntheticLambda17 lottieDrawableExternalSyntheticLambda17, float f, access13800<? super AnonymousClass3> access13800Var) {
                super(1, access13800Var);
                this.this$0 = lottieDrawableExternalSyntheticLambda17;
                this.$offset = f;
            }

            public static /* synthetic */ Unit onWarmupCompleted(LottieDrawableExternalSyntheticLambda17 lottieDrawableExternalSyntheticLambda17, isQueryRefinementEnabled isqueryrefinementenabled, isQueryRefinementEnabled isqueryrefinementenabled2) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 37;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnExtraCallback = onExtraCallback(lottieDrawableExternalSyntheticLambda17, isqueryrefinementenabled, isqueryrefinementenabled2);
                if (i3 == 0) {
                    int i4 = 58 / 0;
                }
                return unitOnExtraCallback;
            }

            public final Object IAuthTabCallback(access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 53;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = IAuthTabCallback + 35;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            public final access13800<Unit> create(access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, this.$offset, access13800Var);
                int i2 = IAuthTabCallback + 17;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass3;
            }

            public /* synthetic */ Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 37;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objIAuthTabCallback = IAuthTabCallback((access13800) obj);
                int i4 = onExtraCallback + 9;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return objIAuthTabCallback;
            }

            private static final Unit onExtraCallback(LottieDrawableExternalSyntheticLambda17 lottieDrawableExternalSyntheticLambda17, isQueryRefinementEnabled isqueryrefinementenabled, isQueryRefinementEnabled isqueryrefinementenabled2) {
                Unit unit;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 75;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    Object[] objArr = {lottieDrawableExternalSyntheticLambda17, Float.valueOf(((Number) isqueryrefinementenabled.IAuthTabCallback()).floatValue())};
                    LottieDrawableExternalSyntheticLambda17.onWarmupCompleted(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 860589526, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), objArr, -860589525);
                    unit = Unit.INSTANCE;
                    int i3 = 24 / 0;
                } else {
                    Object[] objArr2 = {lottieDrawableExternalSyntheticLambda17, Float.valueOf(((Number) isqueryrefinementenabled.IAuthTabCallback()).floatValue())};
                    LottieDrawableExternalSyntheticLambda17.onWarmupCompleted(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 860589526, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), objArr2, -860589525);
                    unit = Unit.INSTANCE;
                }
                int i4 = onExtraCallback + 65;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 7;
                IAuthTabCallback = i2 % 128;
                Object obj2 = null;
                if (i2 % 2 == 0) {
                    access14300.onWarmupCompleted();
                    obj2.hashCode();
                    throw null;
                }
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i3 = this.label;
                if (i3 != 0) {
                    int i4 = onExtraCallback;
                    int i5 = i4 + 11;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i7 = i4 + 97;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    ResultKt.onNavigationEvent(obj);
                } else {
                    ResultKt.onNavigationEvent(obj);
                    final isQueryRefinementEnabled isqueryrefinementenabledOnWarmupCompleted = isIconified.onWarmupCompleted(LottieDrawableExternalSyntheticLambda17.onWarmupCompleted(this.this$0), 0.0f, 2, (Object) null);
                    Float fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(this.$offset);
                    getThumbPosition getthumbpositionOnExtraCallbackWithResult = onQueryRefine.onExtraCallbackWithResult(500, 0, (getMediaContentViewGroup) getCallToActionButton.IAuthTabCallback(-1178288673, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{getCallToActionButton.onExtraCallback}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 1178288673), 2, (Object) null);
                    final LottieDrawableExternalSyntheticLambda17 lottieDrawableExternalSyntheticLambda17 = this.this$0;
                    Function1 function1 = new Function1() { // from class: im.toss.compose.widget.ptr.TdsPullRefreshState$animateIndicatorTo$1$1$$ExternalSyntheticLambda0
                        private static int onExtraCallback = 0;
                        private static int onExtraCallbackWithResult = 1;

                        public final Object invoke(Object obj3) {
                            int i9 = 2 % 2;
                            int i10 = onExtraCallback + 11;
                            onExtraCallbackWithResult = i10 % 128;
                            int i11 = i10 % 2;
                            Unit unitOnWarmupCompleted = LottieDrawableExternalSyntheticLambda17.onNavigationEvent.AnonymousClass3.onWarmupCompleted(lottieDrawableExternalSyntheticLambda17, isqueryrefinementenabledOnWarmupCompleted, (isQueryRefinementEnabled) obj3);
                            int i12 = onExtraCallback + 59;
                            onExtraCallbackWithResult = i12 % 128;
                            int i13 = i12 % 2;
                            return unitOnWarmupCompleted;
                        }
                    };
                    this.L$0 = access15400.onNavigationEvent(isqueryrefinementenabledOnWarmupCompleted);
                    this.label = 1;
                    if (isQueryRefinementEnabled.onWarmupCompleted(isqueryrefinementenabledOnWarmupCompleted, fOnExtraCallbackWithResult, getthumbpositionOnExtraCallbackWithResult, (Object) null, function1, this, 4, (Object) null) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onExtraCallbackWithResult + 47;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0 ? i2 != 1 : i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i4 = onExtraCallback + 123;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
            } else {
                ResultKt.onNavigationEvent(obj);
                Object[] objArr = {LottieDrawableExternalSyntheticLambda17.this};
                inflateMenu inflatemenu = (inflateMenu) LottieDrawableExternalSyntheticLambda17.onWarmupCompleted(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1182307230, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), objArr, 1182307233);
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(LottieDrawableExternalSyntheticLambda17.this, this.$offset, null);
                this.label = 1;
                if (inflateMenu.IAuthTabCallback(inflatemenu, (isOverflowMenuShowing) null, anonymousClass3, this, 1, (Object) null) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            return Unit.INSTANCE;
        }
    }

    private final float asBinder() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 1;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        if (IAuthTabCallbackStub() <= onExtraCallbackWithResult()) {
            return IAuthTabCallbackStub();
        }
        float fAbs = Math.abs(IAuthTabCallback()) - 1.0f;
        if (fAbs < 0.0f) {
            fAbs = 0.0f;
        }
        if (fAbs > 2.0f) {
            int i4 = getInterfaceDescriptor + 69;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            fAbs = 2.0f;
        }
        return onExtraCallbackWithResult() + (onExtraCallbackWithResult() * (fAbs - (((float) Math.pow(fAbs, 2.0d)) / 4.0f)));
    }

    private final float IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 87;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            float fFloatValue = ((Number) this.onExtraCallbackWithResult.onExtraCallbackWithResult()).floatValue();
            int i3 = getInterfaceDescriptor + 35;
            access000 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 91 / 0;
            }
            return fFloatValue;
        }
        ((Number) this.onExtraCallbackWithResult.onExtraCallbackWithResult()).floatValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final boolean asInterface() {
        int i = 2 % 2;
        int i2 = access000 + 115;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.onExtraCallback.onExtraCallbackWithResult()).booleanValue();
        int i4 = getInterfaceDescriptor + 75;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 22 / 0;
        }
        return zBooleanValue;
    }

    private final void onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        int i2 = access000 + 55;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            this.onExtraCallback.IAuthTabCallback(Boolean.valueOf(z));
        } else {
            this.onExtraCallback.IAuthTabCallback(Boolean.valueOf(z));
            throw null;
        }
    }

    private final float IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 81;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        float fOnNavigationEvent = this.onNavigationEvent.onNavigationEvent();
        int i4 = getInterfaceDescriptor + 123;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return fOnNavigationEvent;
    }

    private final void IAuthTabCallbackDefault(float f) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 65;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        this.onNavigationEvent.onNavigationEvent(f);
        int i4 = access000 + 21;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        LottieDrawableExternalSyntheticLambda17 lottieDrawableExternalSyntheticLambda17 = (LottieDrawableExternalSyntheticLambda17) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 27;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            return Float.valueOf(lottieDrawableExternalSyntheticLambda17.asBinder.onNavigationEvent());
        }
        lottieDrawableExternalSyntheticLambda17.asBinder.onNavigationEvent();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void asBinder(float f) {
        int i = 2 % 2;
        int i2 = access000 + 13;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        this.asBinder.onNavigationEvent(f);
        int i4 = getInterfaceDescriptor + 117;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    private final float IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 37;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            float fOnNavigationEvent = this.IAuthTabCallback.onNavigationEvent();
            int i3 = getInterfaceDescriptor + 25;
            access000 = i3 % 128;
            if (i3 % 2 != 0) {
                return fOnNavigationEvent;
            }
            throw null;
        }
        this.IAuthTabCallback.onNavigationEvent();
        throw null;
    }

    private final void onTransact(float f) {
        int i = 2 % 2;
        int i2 = access000 + 15;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            this.IAuthTabCallback.onNavigationEvent(f);
            int i3 = 94 / 0;
        } else {
            this.IAuthTabCallback.onNavigationEvent(f);
        }
    }

    private final float access000() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 49;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            float fOnNavigationEvent = this.onWarmupCompleted.onNavigationEvent();
            int i3 = getInterfaceDescriptor + 65;
            access000 = i3 % 128;
            int i4 = i3 % 2;
            return fOnNavigationEvent;
        }
        this.onWarmupCompleted.onNavigationEvent();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void IAuthTabCallbackStub(float f) {
        int i = 2 % 2;
        int i2 = access000 + 95;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            this.onWarmupCompleted.onNavigationEvent(f);
            return;
        }
        this.onWarmupCompleted.onNavigationEvent(f);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ inflateMenu onExtraCallback(LottieDrawableExternalSyntheticLambda17 lottieDrawableExternalSyntheticLambda17) {
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        return (inflateMenu) onWarmupCompleted(iOnNavigationEvent, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), iOnNavigationEvent2, -1182307230, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{lottieDrawableExternalSyntheticLambda17}, 1182307233);
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(LottieDrawableExternalSyntheticLambda17 lottieDrawableExternalSyntheticLambda17, float f) {
        Object[] objArr = {lottieDrawableExternalSyntheticLambda17, Float.valueOf(f)};
        onWarmupCompleted(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 860589526, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), objArr, -860589525);
    }

    private final float onTransact() {
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        return ((Float) onWarmupCompleted(iOnNavigationEvent, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), iOnNavigationEvent2, 463810934, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{this}, -463810932)).floatValue();
    }

    public final boolean onExtraCallback() {
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        return ((Boolean) onWarmupCompleted(iOnNavigationEvent, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), iOnNavigationEvent2, -1787313507, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{this}, 1787313511)).booleanValue();
    }

    public final void onExtraCallbackWithResult(float f) {
        Object[] objArr = {this, Float.valueOf(f)};
        onWarmupCompleted(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 2107662630, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), objArr, -2107662630);
    }
}
