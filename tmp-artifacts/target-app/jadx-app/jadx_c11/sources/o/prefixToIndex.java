package o;

import android.view.animation.Interpolator;
import com.facebook.imagepipeline.core.ProducerSequenceFactory$;
import im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$;
import im.toss.observability.instrumentation.memory.PssReader$;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.Authenticator;
import o.ExtensionsManager1;
import o.QuirksExternalSyntheticBackport0;
import o.prefixToIndex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class prefixToIndex extends QuirksExternalSyntheticBackport0.onWarmupCompleted implements StreamSpecQueryResult, sortSupportedOutputSizes {
    private static int access000 = 0;
    private static int getInterfaceDescriptor = 1;
    private final Camera2CameraMetadataExternalSyntheticLambda1 IAuthTabCallback;
    private MaxInterstitialAd IAuthTabCallbackDefault;
    private final Rally IAuthTabCallbackStub;
    private final toFullSHA1Hash asInterface;
    private Integer onExtraCallback;
    private replace onExtraCallbackWithResult;
    private int onNavigationEvent;
    private final setContentInsetsRelative onTransact;
    private final AppLovinSdkSettings onWarmupCompleted;

    static final class IAuthTabCallback extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 97;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objIAuthTabCallback = prefixToIndex.IAuthTabCallback(prefixToIndex.this, (access13800) this);
            int i4 = onWarmupCompleted + 71;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objIAuthTabCallback;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        prefixToIndex prefixtoindex = (prefixToIndex) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = access000 + 101;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(prefixtoindex, zBooleanValue);
        int i4 = access000 + 71;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(prefixToIndex prefixtoindex, boolean z) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 63;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(prefixtoindex, z);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(prefixtoindex, z);
        int i3 = getInterfaceDescriptor + 125;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 75 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(prefixToIndex prefixtoindex) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 103;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(prefixtoindex);
        if (i3 != 0) {
            int i4 = 5 / 0;
        }
        return unitAsInterface;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i2;
        int i8 = ~i4;
        int i9 = ~(i7 | i8 | i6);
        int i10 = ~i6;
        int i11 = i9 | (~(i7 | i10 | i4));
        int i12 = (~(i6 | i8)) | i7 | (~(i10 | i4));
        int i13 = i2 + i4 + i3 + (1112421973 * i5) + ((-1897213938) * i);
        int i14 = i13 * i13;
        int i15 = ((1216318437 * i2) - 781189120) + ((-1395624931) * i4) + (i11 * (-1305971684)) + ((-1305971684) * i8) + (1305971684 * i12) + ((-89653248) * i3) + ((-1446510592) * i5) + (892338176 * i) + ((-1657864192) * i14);
        int i16 = (i2 * 2010092721) + 1217064380 + (i4 * 2010090761) + (i11 * (-980)) + (i8 * (-980)) + (i12 * 980) + (i3 * 2010091741) + (i5 * (-1378896031)) + (i * 856652822) + (i14 * 563281920);
        int i17 = i15 + (i16 * i16 * (-1077346304));
        if (i17 == 1) {
            prefixToIndex prefixtoindex = (prefixToIndex) objArr[0];
            int i18 = 2 % 2;
            int i19 = getInterfaceDescriptor + 83;
            int i20 = i19 % 128;
            access000 = i20;
            int i21 = i19 % 2;
            toFullSHA1Hash tofullsha1hash = prefixtoindex.asInterface;
            int i22 = i20 + 13;
            getInterfaceDescriptor = i22 % 128;
            int i23 = i22 % 2;
            return tofullsha1hash;
        }
        if (i17 == 2) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i17 == 3) {
            return IAuthTabCallback(objArr);
        }
        if (i17 == 4) {
            return onWarmupCompleted(objArr);
        }
        prefixToIndex prefixtoindex2 = (prefixToIndex) objArr[0];
        int i24 = 2 % 2;
        int i25 = getInterfaceDescriptor + 107;
        access000 = i25 % 128;
        int i26 = i25 % 2;
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        boolean zBooleanValue = ((Boolean) onExtraCallbackWithResult(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -1124775529, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 1124775531, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{prefixtoindex2}, iOnWarmupCompleted)).booleanValue();
        int i27 = getInterfaceDescriptor + 13;
        access000 = i27 % 128;
        int i28 = i27 % 2;
        return Boolean.valueOf(zBooleanValue);
    }

    public prefixToIndex(@NotNull toFullSHA1Hash tofullsha1hash, @Nullable setContentInsetsRelative setcontentinsetsrelative, @Nullable Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, int i, @NotNull MaxInterstitialAd maxInterstitialAd) {
        AppLovinSdkSettings appLovinSdkSettingsOnTransact;
        boolean zBooleanValue;
        Intrinsics.checkNotNullParameter(tofullsha1hash, "");
        Intrinsics.checkNotNullParameter(maxInterstitialAd, "");
        this.asInterface = tofullsha1hash;
        this.onTransact = setcontentinsetsrelative;
        this.IAuthTabCallback = camera2CameraMetadataExternalSyntheticLambda1;
        this.onNavigationEvent = i;
        this.IAuthTabCallbackDefault = maxInterstitialAd;
        this.onExtraCallbackWithResult = new replace();
        if (processDeepLink.onExtraCallback()) {
            appLovinSdkSettingsOnTransact = AuthenticatorCompanion.IAuthTabCallback.onExtraCallbackWithResult(authenticate.IN, AuthenticatorCompanionAuthenticatorNone.FAST);
        } else {
            appLovinSdkSettingsOnTransact = tofullsha1hash.onTransact();
        }
        AppLovinSdkSettings appLovinSdkSettings = appLovinSdkSettingsOnTransact;
        this.onWarmupCompleted = appLovinSdkSettings;
        MaxInterstitialAd maxInterstitialAd2 = this.IAuthTabCallbackDefault;
        Boolean boolAccess000 = tofullsha1hash.onTransact().access000();
        if (boolAccess000 != null) {
            int i2 = access000 + 37;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 == 0) {
                boolAccess000.booleanValue();
                throw null;
            }
            zBooleanValue = boolAccess000.booleanValue();
            int i3 = 2 % 2;
        } else {
            int i4 = access000 + 85;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            zBooleanValue = false;
        }
        this.IAuthTabCallbackStub = RallysKt.onExtraCallback((setCreativeDebuggerEnabled) maxInterstitialAd2, appLovinSdkSettings, 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, Boolean.valueOf(zBooleanValue), 0, 0L, false, 1916, (Object) null);
    }

    public static final /* synthetic */ Object IAuthTabCallback(prefixToIndex prefixtoindex, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 57;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = prefixtoindex.IAuthTabCallback((access13800<? super Unit>) access13800Var);
        int i4 = getInterfaceDescriptor + 13;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 8 / 0;
        }
        return objIAuthTabCallback;
    }

    public static final /* synthetic */ replace IAuthTabCallback(prefixToIndex prefixtoindex) {
        int i = 2 % 2;
        int i2 = access000 + 89;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        replace replaceVar = prefixtoindex.onExtraCallbackWithResult;
        int i5 = i3 + 113;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return replaceVar;
    }

    public static final /* synthetic */ getPackageType IAuthTabCallbackDefault(prefixToIndex prefixtoindex) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 15;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        getPackageType getpackagetypeAccess100 = prefixtoindex.access100();
        int i4 = getInterfaceDescriptor + 107;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return getpackagetypeAccess100;
    }

    public static final /* synthetic */ void onExtraCallback(prefixToIndex prefixtoindex, boolean z) {
        int i = 2 % 2;
        int i2 = access000 + 53;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        prefixtoindex.IAuthTabCallback(z);
        int i4 = access000 + 101;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ int onNavigationEvent(prefixToIndex prefixtoindex) {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 7;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        int i5 = prefixtoindex.onNavigationEvent;
        if (i4 == 0) {
            throw null;
        }
        int i6 = i2 + 69;
        getInterfaceDescriptor = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ setContentInsetsRelative $scroll;
        int label;
        final /* synthetic */ prefixToIndex this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(setContentInsetsRelative setcontentinsetsrelative, prefixToIndex prefixtoindex, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$scroll = setcontentinsetsrelative;
            this.this$0 = prefixtoindex;
        }

        public static /* synthetic */ int onWarmupCompleted(setContentInsetsRelative setcontentinsetsrelative) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 69;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iIAuthTabCallback = IAuthTabCallback(setcontentinsetsrelative);
            int i4 = onExtraCallbackWithResult + 43;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return iIAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$scroll, this.this$0, access13800Var);
            int i2 = IAuthTabCallback + 15;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return onnavigationevent;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 53;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            if (i3 == 0) {
                int i4 = 18 / 0;
            }
            int i5 = onExtraCallbackWithResult + 63;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 53;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationeventCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                onnavigationeventCreate.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = onnavigationeventCreate.invokeSuspend(unit);
            int i4 = IAuthTabCallback + 113;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 96 / 0;
            }
            return objInvokeSuspend;
        }

        public static final class IAuthTabCallback implements IAnimation<Integer> {
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;
            final /* synthetic */ IAnimation onExtraCallbackWithResult;

            /* renamed from: o.prefixToIndex$onNavigationEvent$IAuthTabCallback$4, reason: invalid class name */
            public static final class AnonymousClass4<T> implements setRipple {
                private static int IAuthTabCallback = 1;
                private static int onNavigationEvent;
                final /* synthetic */ setRipple onExtraCallbackWithResult;

                /* renamed from: o.prefixToIndex$onNavigationEvent$IAuthTabCallback$4$2, reason: invalid class name */
                public static final class AnonymousClass2 extends ContinuationImpl {
                    private static int onNavigationEvent = 0;
                    private static int onWarmupCompleted = 1;
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
                        int i = 2 % 2;
                        int i2 = onNavigationEvent + 7;
                        onWarmupCompleted = i2 % 128;
                        int i3 = i2 % 2;
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                        if (i3 != 0) {
                            return anonymousClass4.emit(null, this);
                        }
                        anonymousClass4.emit(null, this);
                        throw null;
                    }
                }

                public AnonymousClass4(setRipple setripple) {
                    this.onExtraCallbackWithResult = setripple;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, access13800 access13800Var) {
                    AnonymousClass2 anonymousClass2;
                    int i = 2 % 2;
                    if (access13800Var instanceof AnonymousClass2) {
                        int i2 = onNavigationEvent + 41;
                        IAuthTabCallback = i2 % 128;
                        int i3 = i2 % 2;
                        anonymousClass2 = (AnonymousClass2) access13800Var;
                        int i4 = anonymousClass2.label;
                        if ((i4 & Integer.MIN_VALUE) != 0) {
                            int i5 = onNavigationEvent + 61;
                            IAuthTabCallback = i5 % 128;
                            int i6 = i5 % 2;
                            anonymousClass2.label = i4 - 2147483648;
                        } else {
                            anonymousClass2 = new AnonymousClass2(access13800Var);
                        }
                    }
                    Object obj2 = anonymousClass2.result;
                    Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                    int i7 = anonymousClass2.label;
                    if (i7 == 0) {
                        ResultKt.onNavigationEvent(obj2);
                        setRipple setripple = this.onExtraCallbackWithResult;
                        if (((Number) obj).intValue() != 0) {
                            anonymousClass2.L$0 = access15400.onNavigationEvent(obj);
                            anonymousClass2.L$1 = access15400.onNavigationEvent(anonymousClass2);
                            anonymousClass2.L$2 = access15400.onNavigationEvent(obj);
                            anonymousClass2.L$3 = access15400.onNavigationEvent(setripple);
                            anonymousClass2.I$0 = 0;
                            anonymousClass2.label = 1;
                            if (setripple.emit(obj, anonymousClass2) == objOnWarmupCompleted) {
                                return objOnWarmupCompleted;
                            }
                        }
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.onNavigationEvent(obj2);
                        int i8 = IAuthTabCallback + 51;
                        onNavigationEvent = i8 % 128;
                        int i9 = i8 % 2;
                    }
                    return Unit.INSTANCE;
                }
            }

            public IAuthTabCallback(IAnimation iAnimation) {
                this.onExtraCallbackWithResult = iAnimation;
            }

            public Object collect(setRipple setripple, access13800 access13800Var) {
                int i = 2 % 2;
                Object objCollect = this.onExtraCallbackWithResult.collect(new AnonymousClass4(setripple), access13800Var);
                if (objCollect != access14300.onWarmupCompleted()) {
                    return Unit.INSTANCE;
                }
                int i2 = onExtraCallback;
                int i3 = i2 + 29;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                int i4 = i2 + 57;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return objCollect;
            }
        }

        private static final int IAuthTabCallback(setContentInsetsRelative setcontentinsetsrelative) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 45;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iIAuthTabCallbackStub = setcontentinsetsrelative.IAuthTabCallbackStub();
            if (i3 == 0) {
                int i4 = 82 / 0;
            }
            int i5 = onExtraCallbackWithResult + 115;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return iIAuthTabCallbackStub;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 51;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = IAuthTabCallback + 65;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                final setContentInsetsRelative setcontentinsetsrelative = this.$scroll;
                IAnimation iAnimationOnNavigationEvent = ycxycx.onNavigationEvent(new IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new Function0() { // from class: im.toss.tds.compose.component.compound.animatestack.AnimateStackNode$observeScrollState$1$$ExternalSyntheticLambda0
                    private static int onExtraCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke() {
                        int i7 = 2 % 2;
                        int i8 = onNavigationEvent + 47;
                        onExtraCallback = i8 % 128;
                        int i9 = i8 % 2;
                        Integer numValueOf = Integer.valueOf(prefixToIndex.onNavigationEvent.onWarmupCompleted(setcontentinsetsrelative));
                        int i10 = onExtraCallback + 105;
                        onNavigationEvent = i10 % 128;
                        if (i10 % 2 != 0) {
                            int i11 = 72 / 0;
                        }
                        return numValueOf;
                    }
                })));
                final prefixToIndex prefixtoindex = this.this$0;
                setRipple setripple = new setRipple() { // from class: o.prefixToIndex.onNavigationEvent.4
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public /* synthetic */ Object emit(Object obj2, access13800 access13800Var) {
                        int i7 = 2 % 2;
                        int i8 = onExtraCallbackWithResult + 93;
                        IAuthTabCallback = i8 % 128;
                        int i9 = i8 % 2;
                        int iIntValue = ((Number) obj2).intValue();
                        if (i9 == 0) {
                            return onExtraCallbackWithResult(iIntValue, access13800Var);
                        }
                        Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(iIntValue, access13800Var);
                        int i10 = 65 / 0;
                        return objOnExtraCallbackWithResult;
                    }

                    public final Object onExtraCallbackWithResult(int i7, access13800<? super Unit> access13800Var) {
                        int i8 = 2 % 2;
                        int i9 = onExtraCallbackWithResult + 35;
                        IAuthTabCallback = i9 % 128;
                        int i10 = i9 % 2;
                        Object[] objArr = {prefixtoindex};
                        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
                        ((toFullSHA1Hash) prefixToIndex.onExtraCallbackWithResult(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 525506258, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -525506257, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), objArr, iOnWarmupCompleted)).onNavigationEvent(i7);
                        prefixToIndex.IAuthTabCallbackDefault(prefixtoindex);
                        Unit unit = Unit.INSTANCE;
                        int i11 = onExtraCallbackWithResult + 17;
                        IAuthTabCallback = i11 % 128;
                        if (i11 % 2 == 0) {
                            return unit;
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                };
                this.label = 1;
                if (iAnimationOnNavigationEvent.collect(setripple, this) == objOnWarmupCompleted) {
                    int i7 = onExtraCallbackWithResult + 23;
                    IAuthTabCallback = i7 % 128;
                    if (i7 % 2 == 0) {
                        return objOnWarmupCompleted;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        if ((r1 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        r8 = im.toss.observability.instrumentation.memory.PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        r4 = im.toss.observability.instrumentation.memory.PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        r6 = im.toss.observability.instrumentation.memory.PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        onExtraCallbackWithResult(im.toss.observability.instrumentation.memory.PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -266165499, r4, 266165503, r6, new java.lang.Object[]{r9}, r8);
        r0 = 16 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005f, code lost:
    
        r7 = im.toss.observability.instrumentation.memory.PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        r3 = im.toss.observability.instrumentation.memory.PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        r5 = im.toss.observability.instrumentation.memory.PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        onExtraCallbackWithResult(im.toss.observability.instrumentation.memory.PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -266165499, r3, 266165503, r5, new java.lang.Object[]{r9}, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007f, code lost:
    
        if (r9.onTransact == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0081, code lost:
    
        r1 = o.prefixToIndex.access000 + 29;
        o.prefixToIndex.getInterfaceDescriptor = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008a, code lost:
    
        if ((r1 % 2) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008c, code lost:
    
        getInterfaceDescriptor();
        r0 = 59 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0094, code lost:
    
        getInterfaceDescriptor();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0097, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if (r9.IAuthTabCallback != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
    
        if (r9.IAuthTabCallback != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        r1 = o.prefixToIndex.access000 + 61;
        o.prefixToIndex.getInterfaceDescriptor = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void O_() {
        int i = 2 % 2;
        int i2 = access000 + 113;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            this.IAuthTabCallbackDefault.onExtraCallback(Float.valueOf(2.0f));
            IAuthTabCallback_Parcel();
        } else {
            this.IAuthTabCallbackDefault.onExtraCallback(Float.valueOf(0.0f));
            IAuthTabCallback_Parcel();
        }
    }

    public void IAuthTabCallbackStub() {
        int i = 2 % 2;
        getTargetName.onNavigationEvent(this, new Function0() { // from class: im.toss.tds.compose.component.compound.animatestack.AnimateStackNode$$ExternalSyntheticLambda2
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 9;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallback = prefixToIndex.onExtraCallback(this.f$0);
                int i5 = onWarmupCompleted + 93;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    return unitOnExtraCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i2 = getInterfaceDescriptor + 79;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit asInterface(prefixToIndex prefixtoindex) {
        int i = 2 % 2;
        int i2 = access000 + 43;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        if (i2 % 2 == 0) {
            int i4 = 84 / 0;
            if (prefixtoindex.IAuthTabCallback != null) {
                int i5 = i3 + 93;
                access000 = i5 % 128;
                int i6 = i5 % 2;
                int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
                int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
                int iOnWarmupCompleted3 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
                onExtraCallbackWithResult(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -266165499, iOnWarmupCompleted2, 266165503, iOnWarmupCompleted3, new Object[]{prefixtoindex}, iOnWarmupCompleted);
                int i7 = access000 + 107;
                getInterfaceDescriptor = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 4 / 3;
                }
            } else if (prefixtoindex.onTransact != null) {
                int i9 = i3 + 81;
                access000 = i9 % 128;
                int i10 = i9 % 2;
                prefixtoindex.getInterfaceDescriptor();
            }
        } else if (prefixtoindex.IAuthTabCallback != null) {
        }
        return Unit.INSTANCE;
    }

    public void IAuthTabCallback(@NotNull Futures3 futures3) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 71;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(futures3, "");
            this.onExtraCallbackWithResult.onExtraCallbackWithResult(FuturesCallbackListener.onTransact(futures3));
            this.onExtraCallbackWithResult.onWarmupCompleted(futures3.asBinder());
            onWarmupCompleted(futures3);
            throw null;
        }
        Intrinsics.checkNotNullParameter(futures3, "");
        this.onExtraCallbackWithResult.onExtraCallbackWithResult(FuturesCallbackListener.onTransact(futures3));
        this.onExtraCallbackWithResult.onWarmupCompleted(futures3.asBinder());
        onWarmupCompleted(futures3);
        Integer num = this.onExtraCallback;
        int i3 = this.onNavigationEvent;
        if (num == null || num.intValue() != i3) {
            this.onExtraCallback = Integer.valueOf(this.onNavigationEvent);
            IAuthTabCallback_Parcel();
            IAuthTabCallbackDefault();
            int i4 = getInterfaceDescriptor + 85;
            access000 = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = getInterfaceDescriptor + 87;
        access000 = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0037 A[PHI: r1 r2
      0x0037: PHI (r1v6 o.LiveDataObservableResult<java.lang.Integer, o.replace>) = 
      (r1v5 o.LiveDataObservableResult<java.lang.Integer, o.replace>)
      (r1v11 o.LiveDataObservableResult<java.lang.Integer, o.replace>)
     binds: [B:8:0x0035, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]
      0x0037: PHI (r2v3 java.lang.Integer) = (r2v2 java.lang.Integer), (r2v6 java.lang.Integer) binds: [B:8:0x0035, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IAuthTabCallback_Parcel() {
        LiveDataObservableResult<Integer, replace> liveDataObservableResultOnWarmupCompleted;
        Integer numValueOf;
        Object replaceVar;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 89;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            liveDataObservableResultOnWarmupCompleted = this.asInterface.onWarmupCompleted();
            numValueOf = Integer.valueOf(this.onNavigationEvent);
            replaceVar = liveDataObservableResultOnWarmupCompleted.get(numValueOf);
            int i3 = 22 / 0;
            if (replaceVar == null) {
                replaceVar = new replace();
                liveDataObservableResultOnWarmupCompleted.put(numValueOf, replaceVar);
            }
        } else {
            liveDataObservableResultOnWarmupCompleted = this.asInterface.onWarmupCompleted();
            numValueOf = Integer.valueOf(this.onNavigationEvent);
            replaceVar = liveDataObservableResultOnWarmupCompleted.get(numValueOf);
            if (replaceVar == null) {
            }
        }
        this.onExtraCallbackWithResult = (replace) replaceVar;
        int i4 = getInterfaceDescriptor + 11;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        prefixToIndex prefixtoindex = (prefixToIndex) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 41;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1 = prefixtoindex.IAuthTabCallback;
            obj.hashCode();
            throw null;
        }
        Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda12 = prefixtoindex.IAuthTabCallback;
        if (camera2CameraMetadataExternalSyntheticLambda12 == null) {
            return null;
        }
        maybeUpdateAnimatable.onNavigationEvent(prefixtoindex.onMessageChannelReady(), (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(camera2CameraMetadataExternalSyntheticLambda12, prefixtoindex, null), 3, (Object) null);
        int i3 = getInterfaceDescriptor + 113;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    public static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Camera2CameraMetadataExternalSyntheticLambda1 $listState;
        int label;
        final /* synthetic */ prefixToIndex this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, prefixToIndex prefixtoindex, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$listState = camera2CameraMetadataExternalSyntheticLambda1;
            this.this$0 = prefixtoindex;
        }

        public static /* synthetic */ Pair onWarmupCompleted(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, prefixToIndex prefixtoindex) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 83;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Pair pairIAuthTabCallback = IAuthTabCallback(camera2CameraMetadataExternalSyntheticLambda1, prefixtoindex);
            int i4 = onNavigationEvent + 119;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return pairIAuthTabCallback;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 115;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 33;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$listState, this.this$0, access13800Var);
            int i2 = onWarmupCompleted + 101;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 119;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800<? super Unit>) obj2);
            int i4 = onWarmupCompleted + 103;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0036 A[PHI: r1
          0x0036: PHI (r1v9 java.util.List) = (r1v6 java.util.List), (r1v7 java.util.List), (r1v14 java.util.List) binds: [B:8:0x002b, B:10:0x0034, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x002d A[PHI: r1
          0x002d: PHI (r1v7 java.util.List) = (r1v6 java.util.List), (r1v14 java.util.List) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static final Pair IAuthTabCallback(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, prefixToIndex prefixtoindex) {
            List listOnTransact;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 43;
            onNavigationEvent = i2 % 128;
            boolean z = true;
            if (i2 % 2 == 0) {
                listOnTransact = camera2CameraMetadataExternalSyntheticLambda1.IAuthTabCallback_Parcel().onTransact();
                if (listOnTransact instanceof Collection) {
                    if (listOnTransact.isEmpty()) {
                        int i3 = onWarmupCompleted + 3;
                        onNavigationEvent = i3 % 128;
                        int i4 = i3 % 2;
                        z = false;
                    } else {
                        Iterator it = listOnTransact.iterator();
                        while (it.hasNext()) {
                            int i5 = onWarmupCompleted + 55;
                            onNavigationEvent = i5 % 128;
                            int i6 = i5 % 2;
                            if (((Camera2CameraControlExternalSyntheticLambda7) it.next()).onExtraCallbackWithResult() == prefixToIndex.onNavigationEvent(prefixtoindex)) {
                                int i7 = onWarmupCompleted + 117;
                                onNavigationEvent = i7 % 128;
                                int i8 = i7 % 2;
                                break;
                            }
                        }
                        int i32 = onWarmupCompleted + 3;
                        onNavigationEvent = i32 % 128;
                        int i42 = i32 % 2;
                        z = false;
                    }
                }
            } else {
                listOnTransact = camera2CameraMetadataExternalSyntheticLambda1.IAuthTabCallback_Parcel().onTransact();
                if (listOnTransact instanceof Collection) {
                }
            }
            Camera2CameraControlExternalSyntheticLambda7 camera2CameraControlExternalSyntheticLambda7 = (Camera2CameraControlExternalSyntheticLambda7) CollectionsKt.firstOrNull(camera2CameraMetadataExternalSyntheticLambda1.IAuthTabCallback_Parcel().onTransact());
            return getWrite.IAuthTabCallback(Boolean.valueOf(z), Integer.valueOf((camera2CameraMetadataExternalSyntheticLambda1.asBinder() * (camera2CameraControlExternalSyntheticLambda7 != null ? camera2CameraControlExternalSyntheticLambda7.onNavigationEvent() : 0)) + camera2CameraMetadataExternalSyntheticLambda1.IAuthTabCallbackStub()));
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 115;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = onWarmupCompleted + 35;
                int i6 = i5 % 128;
                onNavigationEvent = i6;
                if (i5 % 2 != 0 ? i4 != 1 : i4 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i7 = i6 + 97;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 != 0) {
                    ResultKt.onNavigationEvent(obj);
                    int i8 = 42 / 0;
                } else {
                    ResultKt.onNavigationEvent(obj);
                }
            } else {
                ResultKt.onNavigationEvent(obj);
                final Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1 = this.$listState;
                final prefixToIndex prefixtoindex = this.this$0;
                IAnimation iAnimationOnWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new Function0() { // from class: im.toss.tds.compose.component.compound.animatestack.AnimateStackNode$observeLazyListState$1$$ExternalSyntheticLambda0
                    private static int onExtraCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke() {
                        int i9 = 2 % 2;
                        int i10 = onWarmupCompleted + 103;
                        onExtraCallback = i10 % 128;
                        Object obj2 = null;
                        if (i10 % 2 != 0) {
                            prefixToIndex.onExtraCallbackWithResult.onWarmupCompleted(camera2CameraMetadataExternalSyntheticLambda1, prefixtoindex);
                            throw null;
                        }
                        Pair pairOnWarmupCompleted = prefixToIndex.onExtraCallbackWithResult.onWarmupCompleted(camera2CameraMetadataExternalSyntheticLambda1, prefixtoindex);
                        int i11 = onWarmupCompleted + 113;
                        onExtraCallback = i11 % 128;
                        if (i11 % 2 == 0) {
                            return pairOnWarmupCompleted;
                        }
                        obj2.hashCode();
                        throw null;
                    }
                });
                final prefixToIndex prefixtoindex2 = this.this$0;
                setRipple setripple = new setRipple() { // from class: o.prefixToIndex.onExtraCallbackWithResult.3
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public /* synthetic */ Object emit(Object obj2, access13800 access13800Var) {
                        int i9 = 2 % 2;
                        int i10 = IAuthTabCallback + 75;
                        onExtraCallbackWithResult = i10 % 128;
                        int i11 = i10 % 2;
                        Object objOnNavigationEvent = onNavigationEvent((Pair) obj2, access13800Var);
                        int i12 = IAuthTabCallback + 67;
                        onExtraCallbackWithResult = i12 % 128;
                        int i13 = i12 % 2;
                        return objOnNavigationEvent;
                    }

                    public final Object onNavigationEvent(Pair<Boolean, Integer> pair, access13800<? super Unit> access13800Var) {
                        int i9 = 2 % 2;
                        int i10 = onExtraCallbackWithResult + 85;
                        IAuthTabCallback = i10 % 128;
                        int i11 = i10 % 2;
                        boolean zBooleanValue = ((Boolean) pair.onExtraCallbackWithResult()).booleanValue();
                        ((toFullSHA1Hash) prefixToIndex.onExtraCallbackWithResult(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 525506258, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -525506257, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{prefixtoindex2}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted())).onNavigationEvent(((Number) pair.IAuthTabCallback()).intValue());
                        if (!(!zBooleanValue)) {
                            int i12 = IAuthTabCallback + 67;
                            onExtraCallbackWithResult = i12 % 128;
                            if (i12 % 2 == 0) {
                                prefixToIndex.IAuthTabCallbackDefault(prefixtoindex2);
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                            prefixToIndex.IAuthTabCallbackDefault(prefixtoindex2);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (iAnimationOnWarmupCompleted.collect(setripple, this) == objOnWarmupCompleted) {
                    int i9 = onNavigationEvent + 61;
                    onWarmupCompleted = i9 % 128;
                    if (i9 % 2 != 0) {
                        int i10 = 37 / 0;
                    }
                    return objOnWarmupCompleted;
                }
            }
            Unit unit = Unit.INSTANCE;
            int i11 = onNavigationEvent + 35;
            onWarmupCompleted = i11 % 128;
            if (i11 % 2 == 0) {
                return unit;
            }
            throw null;
        }
    }

    private final void getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 27;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        setContentInsetsRelative setcontentinsetsrelative = this.onTransact;
        if (setcontentinsetsrelative == null) {
            return;
        }
        maybeUpdateAnimatable.onNavigationEvent(onMessageChannelReady(), (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(setcontentinsetsrelative, this, null), 3, (Object) null);
        int i3 = getInterfaceDescriptor + 115;
        access000 = i3 % 128;
        int i4 = i3 % 2;
    }

    private final void onWarmupCompleted(Futures3 futures3) {
        int i = 2 % 2;
        if (!ExtensionsManager1.IAuthTabCallback(this.asInterface.IAuthTabCallbackDefault(), ExtensionsManager1.Companion.onNavigationEvent())) {
            int i2 = access000 + 3;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            if (((int) this.asInterface.IAuthTabCallbackDefault()) != Integer.MAX_VALUE) {
                int i4 = getInterfaceDescriptor + 43;
                access000 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 32 / 0;
                    return;
                }
                return;
            }
        }
        this.asInterface.onWarmupCompleted(FuturesCallbackListener.onNavigationEvent(futures3).asBinder());
    }

    private final getPackageType IAuthTabCallbackDefault() {
        int i = 2 % 2;
        getPackageType getpackagetypeOnNavigationEvent = maybeUpdateAnimatable.onNavigationEvent(onMessageChannelReady(), (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(null), 3, (Object) null);
        int i2 = access000 + 107;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        return getpackagetypeOnNavigationEvent;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        int I$0;
        boolean Z$0;
        int label;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = prefixToIndex.this.new onWarmupCompleted(access13800Var);
            int i2 = onExtraCallbackWithResult + 37;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 53;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 23;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            Object objInvokeSuspend;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 29;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                objInvokeSuspend = onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
                int i4 = 23 / 0;
            } else {
                objInvokeSuspend = onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i5 = onExtraCallback + 71;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0179 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x017a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i;
            int i2 = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            Object obj2 = null;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                if (!prefixToIndex.IAuthTabCallback(prefixToIndex.this).IAuthTabCallback()) {
                    boolean zBooleanValue = ((Boolean) prefixToIndex.onExtraCallbackWithResult(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -141120806, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 141120806, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{prefixToIndex.this}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted())).booleanValue();
                    if (((toFullSHA1Hash) prefixToIndex.onExtraCallbackWithResult(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 525506258, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -525506257, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{prefixToIndex.this}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted())).asInterface() == 0) {
                        int i4 = onExtraCallback + 119;
                        onExtraCallbackWithResult = i4 % 128;
                        int i5 = i4 % 2;
                        if (!((Boolean) replace.onExtraCallbackWithResult(new Object[]{prefixToIndex.IAuthTabCallback(prefixToIndex.this)}, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 1790639364, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -1790639363, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult())).booleanValue()) {
                            prefixToIndex.IAuthTabCallback(prefixToIndex.this).onExtraCallbackWithResult(zBooleanValue);
                        }
                    }
                    if (zBooleanValue) {
                        if (((Boolean) replace.onExtraCallbackWithResult(new Object[]{prefixToIndex.IAuthTabCallback(prefixToIndex.this)}, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 1790639364, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -1790639363, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult())).booleanValue()) {
                            int iOnExtraCallbackWithResult = (int) (((toFullSHA1Hash) prefixToIndex.onExtraCallbackWithResult(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 525506258, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -525506257, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{prefixToIndex.this}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted())).onExtraCallbackWithResult() + (prefixToIndex.onNavigationEvent(prefixToIndex.this) * ((toFullSHA1Hash) prefixToIndex.onExtraCallbackWithResult(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 525506258, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -525506257, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{prefixToIndex.this}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted())).IAuthTabCallbackStub()));
                            this.Z$0 = zBooleanValue;
                            this.I$0 = iOnExtraCallbackWithResult;
                            this.label = 1;
                            if (formatMsgs.onWarmupCompleted(iOnExtraCallbackWithResult, this) == objOnWarmupCompleted) {
                                int i6 = onExtraCallbackWithResult + 3;
                                onExtraCallback = i6 % 128;
                                if (i6 % 2 != 0) {
                                    return objOnWarmupCompleted;
                                }
                                obj2.hashCode();
                                throw null;
                            }
                        }
                    }
                }
                Unit unit = Unit.INSTANCE;
                i = onExtraCallbackWithResult + 109;
                onExtraCallback = i % 128;
                if (i % 2 == 0) {
                    return unit;
                }
                obj2.hashCode();
                throw null;
            }
            int i7 = onExtraCallbackWithResult + 119;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            prefixToIndex.onExtraCallback(prefixToIndex.this, false);
            int i9 = onExtraCallbackWithResult + 97;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            Unit unit2 = Unit.INSTANCE;
            i = onExtraCallbackWithResult + 109;
            onExtraCallback = i % 128;
            if (i % 2 == 0) {
            }
        }
    }

    private final getPackageType access100() {
        int i = 2 % 2;
        Object obj = null;
        getPackageType getpackagetypeOnNavigationEvent = maybeUpdateAnimatable.onNavigationEvent(onMessageChannelReady(), (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(null), 3, (Object) null);
        int i2 = access000 + 37;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return getpackagetypeOnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        int label;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = prefixToIndex.this.new onExtraCallback(access13800Var);
            int i2 = IAuthTabCallback + 73;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 75 / 0;
            }
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 45;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 3;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 53;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            onExtraCallback onextracallbackCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                onextracallbackCreate.invokeSuspend(unit);
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = onextracallbackCreate.invokeSuspend(unit);
            int i4 = IAuthTabCallback + 57;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = IAuthTabCallback + 43;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0 ? i2 != 1 : i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                prefixToIndex prefixtoindex = prefixToIndex.this;
                this.label = 1;
                if (prefixToIndex.IAuthTabCallback(prefixtoindex, (access13800) this) == objOnWarmupCompleted) {
                    int i4 = IAuthTabCallback + 21;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 != 0) {
                        return objOnWarmupCompleted;
                    }
                    throw null;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e4, code lost:
    
        if (o.formatMsgs.onWarmupCompleted(r6 & r8, r1) == r3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00fc, code lost:
    
        if (o.formatMsgs.onWarmupCompleted(r6 + r8, r1) == r3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fe, code lost:
    
        return r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[PHI: r1 r4
      0x002b: PHI (r1v13 o.prefixToIndex$IAuthTabCallback) = (r1v12 o.prefixToIndex$IAuthTabCallback), (r1v15 o.prefixToIndex$IAuthTabCallback) binds: [B:10:0x0029, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x002b: PHI (r4v14 int) = (r4v13 int), (r4v16 int) binds: [B:10:0x0029, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object IAuthTabCallback(access13800<? super Unit> access13800Var) {
        IAuthTabCallback iAuthTabCallback;
        int i;
        int i2 = 2 % 2;
        if (access13800Var instanceof IAuthTabCallback) {
            int i3 = getInterfaceDescriptor + 17;
            access000 = i3 % 128;
            if (i3 % 2 != 0) {
                iAuthTabCallback = (IAuthTabCallback) access13800Var;
                i = iAuthTabCallback.label;
                int i4 = 67 / 0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    iAuthTabCallback.label = i - 2147483648;
                } else {
                    iAuthTabCallback = new IAuthTabCallback(access13800Var);
                }
            } else {
                iAuthTabCallback = (IAuthTabCallback) access13800Var;
                i = iAuthTabCallback.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                }
            }
        }
        Object obj = iAuthTabCallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = iAuthTabCallback.label;
        if (i5 == 0) {
            ResultKt.onNavigationEvent(obj);
            int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
            boolean zBooleanValue = ((Boolean) onExtraCallbackWithResult(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -1124775529, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 1124775531, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted)).booleanValue();
            if (zBooleanValue != this.onExtraCallbackWithResult.onWarmupCompleted()) {
                this.onExtraCallbackWithResult.onWarmupCompleted(zBooleanValue);
                if (zBooleanValue && !this.onExtraCallbackWithResult.IAuthTabCallback()) {
                    if (!((Boolean) replace.onExtraCallbackWithResult(new Object[]{this.onExtraCallbackWithResult}, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 1790639364, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -1790639363, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult())).booleanValue()) {
                        int i6 = getInterfaceDescriptor + 117;
                        access000 = i6 % 128;
                        if (i6 % 2 != 0) {
                            long jOnExtraCallbackWithResult = this.asInterface.onExtraCallbackWithResult();
                            long jIAuthTabCallbackStub = this.asInterface.IAuthTabCallbackStub();
                            iAuthTabCallback.Z$0 = zBooleanValue;
                            iAuthTabCallback.label = 0;
                        } else {
                            long jOnExtraCallbackWithResult2 = this.asInterface.onExtraCallbackWithResult();
                            long jIAuthTabCallbackStub2 = this.asInterface.IAuthTabCallbackStub();
                            iAuthTabCallback.Z$0 = zBooleanValue;
                            iAuthTabCallback.label = 1;
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
        int i7 = access000 + 33;
        int i8 = i7 % 128;
        getInterfaceDescriptor = i8;
        int i9 = i7 % 2;
        if (i5 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i10 = i8 + 111;
        access000 = i10 % 128;
        int i11 = i10 % 2;
        ResultKt.onNavigationEvent(obj);
        IAuthTabCallback(true);
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(prefixToIndex prefixtoindex, boolean z) {
        int i = 2 % 2;
        int i2 = access000 + 69;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Function1<Boolean, Unit> function1OnExtraCallback = prefixtoindex.asInterface.onExtraCallback();
        if (function1OnExtraCallback != null) {
            int i4 = getInterfaceDescriptor + 33;
            access000 = i4 % 128;
            if (i4 % 2 != 0) {
                function1OnExtraCallback.invoke(Boolean.valueOf(z));
                int i5 = 33 / 0;
            } else {
                function1OnExtraCallback.invoke(Boolean.valueOf(z));
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(prefixToIndex prefixtoindex, boolean z) {
        int i = 2 % 2;
        Object[] objArr = {prefixtoindex.onExtraCallbackWithResult, true};
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        replace.onExtraCallbackWithResult(objArr, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -2137797996, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 2137797996, iOnExtraCallbackWithResult);
        Function1<Boolean, Unit> function1IAuthTabCallback = prefixtoindex.asInterface.IAuthTabCallback();
        if (function1IAuthTabCallback != null) {
            int i2 = access000 + 49;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            function1IAuthTabCallback.invoke(Boolean.valueOf(z));
            int i4 = getInterfaceDescriptor + 51;
            access000 = i4 % 128;
            int i5 = i4 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i6 = access000 + 5;
        getInterfaceDescriptor = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 19 / 0;
        }
        return unit;
    }

    private final void IAuthTabCallback(final boolean z) {
        int i = 2 % 2;
        this.IAuthTabCallbackStub.ICustomTabsServiceStub();
        Object obj = null;
        Object[] objArr = {Rally.onTransact(this.IAuthTabCallbackStub, null, new Function0() { // from class: im.toss.tds.compose.component.compound.animatestack.AnimateStackNode$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 43;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Unit unit = (Unit) prefixToIndex.onExtraCallbackWithResult(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 1875957486, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -1875957483, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this.f$0, Boolean.valueOf(z)}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
                int i4 = onWarmupCompleted + 35;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 88 / 0;
                }
                return unit;
            }
        }, 1, null), null, new Function0() { // from class: im.toss.tds.compose.component.compound.animatestack.AnimateStackNode$$ExternalSyntheticLambda1
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 59;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                prefixToIndex prefixtoindex = this.f$0;
                if (i4 == 0) {
                    return prefixToIndex.IAuthTabCallback(prefixtoindex, z);
                }
                int i5 = 95 / 0;
                return prefixToIndex.IAuthTabCallback(prefixtoindex, z);
            }
        }, 1, null};
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        isFireOS.onExtraCallbackWithResult((Rally) Rally.onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -2128644225, iOnExtraCallback, objArr, 2128644226), false, 1, null);
        int i2 = getInterfaceDescriptor + 53;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        prefixToIndex prefixtoindex = (prefixToIndex) objArr[0];
        int i = 2 % 2;
        long jIAuthTabCallbackDefault = prefixtoindex.asInterface.IAuthTabCallbackDefault();
        ExtensionsManager1.onNavigationEvent onnavigationevent = ExtensionsManager1.Companion;
        if (!ExtensionsManager1.IAuthTabCallback(jIAuthTabCallbackDefault, onnavigationevent.onNavigationEvent())) {
            int i2 = getInterfaceDescriptor + 107;
            access000 = i2 % 128;
            if (i2 % 2 != 0) {
                ExtensionsManager1.IAuthTabCallback(prefixtoindex.onExtraCallbackWithResult.onNavigationEvent(), onnavigationevent.onNavigationEvent());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!ExtensionsManager1.IAuthTabCallback(prefixtoindex.onExtraCallbackWithResult.onNavigationEvent(), onnavigationevent.onNavigationEvent())) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) prefixtoindex.onExtraCallbackWithResult.onExtraCallback());
                int iOnNavigationEvent = (int) prefixtoindex.onExtraCallbackWithResult.onNavigationEvent();
                int iIAuthTabCallbackDefault = (int) prefixtoindex.asInterface.IAuthTabCallbackDefault();
                float f = iOnNavigationEvent;
                float fOnWarmupCompleted = prefixtoindex.onWarmupCompleted(f, fIntBitsToFloat, prefixtoindex.asInterface.IAuthTabCallback_Parcel());
                float fOnWarmupCompleted2 = prefixtoindex.onWarmupCompleted(f, fIntBitsToFloat, prefixtoindex.asInterface.getInterfaceDescriptor());
                float f2 = iIAuthTabCallbackDefault;
                float fOnWarmupCompleted3 = prefixtoindex.onWarmupCompleted(f2, prefixtoindex.asInterface.asBinder());
                float fOnWarmupCompleted4 = prefixtoindex.onWarmupCompleted(f2, prefixtoindex.asInterface.onNavigationEvent());
                if (fOnWarmupCompleted <= fOnWarmupCompleted3) {
                    int i3 = access000;
                    int i4 = i3 + 5;
                    getInterfaceDescriptor = i4 % 128;
                    int i5 = i4 % 2;
                    if (fOnWarmupCompleted2 >= fOnWarmupCompleted4) {
                        int i6 = i3 + 1;
                        getInterfaceDescriptor = i6 % 128;
                        int i7 = i6 % 2;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032 A[PHI: r1 r8
      0x0032: PHI (r1v19 int) = (r1v18 int), (r1v22 int) binds: [B:10:0x0030, B:7:0x0021] A[DONT_GENERATE, DONT_INLINE]
      0x0032: PHI (r8v6 int) = (r8v5 int), (r8v9 int) binds: [B:10:0x0030, B:7:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044 A[PHI: r1 r6
      0x0044: PHI (r1v20 int) = (r1v18 int), (r1v19 int), (r1v22 int) binds: [B:10:0x0030, B:17:0x0043, B:7:0x0021] A[DONT_GENERATE, DONT_INLINE]
      0x0044: PHI (r6v16 float) = (r6v0 float), (r6v10 float), (r6v0 float) binds: [B:10:0x0030, B:17:0x0043, B:7:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075 A[PHI: r1 r8
      0x0075: PHI (r1v9 float) = (r1v8 float), (r1v13 float) binds: [B:27:0x0073, B:24:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x0075: PHI (r8v3 int) = (r8v2 int), (r8v4 int) binds: [B:27:0x0073, B:24:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a A[PHI: r1 r6
      0x007a: PHI (r1v10 float) = (r1v8 float), (r1v9 float), (r1v13 float) binds: [B:27:0x0073, B:30:0x0079, B:24:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x007a: PHI (r6v7 float) = (r6v0 float), (r6v5 float), (r6v0 float) binds: [B:27:0x0073, B:30:0x0079, B:24:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final float onWarmupCompleted(float f, float f2, Authenticator authenticator) {
        float f3;
        float fFloatValue;
        int iOnNavigationEvent;
        int iIntValue;
        int iOnNavigationEvent2;
        int i = 2 % 2;
        if (authenticator instanceof Authenticator.onNavigationEvent) {
            int i2 = getInterfaceDescriptor + 51;
            access000 = i2 % 128;
            if (i2 % 2 != 0) {
                iIntValue = authenticator.onWarmupCompleted().intValue();
                iOnNavigationEvent2 = authenticator.onNavigationEvent();
                if (iOnNavigationEvent2 == 1) {
                    f3 = f + iIntValue;
                } else if (iOnNavigationEvent2 != 2) {
                    int i3 = access000 + 117;
                    getInterfaceDescriptor = i3 % 128;
                    if (i3 % 2 == 0) {
                        throw null;
                    }
                    f3 = iIntValue;
                } else {
                    f *= 0.5f;
                    f3 = f + iIntValue;
                }
            } else {
                iIntValue = authenticator.onWarmupCompleted().intValue();
                iOnNavigationEvent2 = authenticator.onNavigationEvent();
                if (iOnNavigationEvent2 != 1) {
                }
            }
        } else if (authenticator instanceof Authenticator.onExtraCallbackWithResult) {
            int i4 = getInterfaceDescriptor + 33;
            access000 = i4 % 128;
            if (i4 % 2 != 0) {
                fFloatValue = authenticator.onWarmupCompleted().floatValue() - f;
                iOnNavigationEvent = authenticator.onNavigationEvent();
                if (iOnNavigationEvent == 0) {
                    f3 = f + fFloatValue;
                } else if (iOnNavigationEvent != 2) {
                    f3 = fFloatValue;
                } else {
                    f *= 0.5f;
                    f3 = f + fFloatValue;
                }
            } else {
                fFloatValue = authenticator.onWarmupCompleted().floatValue() * f;
                iOnNavigationEvent = authenticator.onNavigationEvent();
                if (iOnNavigationEvent != 1) {
                }
            }
        } else {
            int i5 = getInterfaceDescriptor + 29;
            access000 = i5 % 128;
            int i6 = i5 % 2;
            f3 = 0.0f;
        }
        return f2 + f3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (r8 != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        if (r8 == 2) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        r7 = o.prefixToIndex.access000;
        r8 = r7 + 65;
        o.prefixToIndex.getInterfaceDescriptor = r8 % 128;
        r8 = r8 % 2;
        r8 = r1;
        r7 = r7 + 25;
        o.prefixToIndex.getInterfaceDescriptor = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        if ((r7 % 2) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        return (r7 * 0.5f) + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        return r7 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        if (r8 != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final float onWarmupCompleted(float f, Authenticator authenticator) {
        int iIntValue;
        int iOnNavigationEvent;
        int i = 2 % 2;
        Object obj = null;
        if (!(authenticator instanceof Authenticator.onNavigationEvent)) {
            if (!(authenticator instanceof Authenticator.onExtraCallbackWithResult)) {
                return 0.0f;
            }
            float fFloatValue = authenticator.onWarmupCompleted().floatValue() * f;
            int iOnNavigationEvent2 = authenticator.onNavigationEvent();
            if (iOnNavigationEvent2 == 1) {
                return f + fFloatValue;
            }
            if (iOnNavigationEvent2 == 2) {
                return (f * 0.5f) + fFloatValue;
            }
            int i2 = access000 + 41;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 != 0) {
                return fFloatValue;
            }
            obj.hashCode();
            throw null;
        }
        int i3 = getInterfaceDescriptor + 25;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            iIntValue = authenticator.onWarmupCompleted().intValue();
            iOnNavigationEvent = authenticator.onNavigationEvent();
        } else {
            iIntValue = authenticator.onWarmupCompleted().intValue();
            iOnNavigationEvent = authenticator.onNavigationEvent();
        }
    }

    public final void onExtraCallbackWithResult(int i, @NotNull MaxInterstitialAd maxInterstitialAd) {
        int i2 = 2 % 2;
        int i3 = access000 + 3;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(maxInterstitialAd, "");
        this.onNavigationEvent = i;
        this.IAuthTabCallbackDefault = maxInterstitialAd;
        IAuthTabCallback_Parcel();
        int i5 = access000 + 61;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ Unit onWarmupCompleted(prefixToIndex prefixtoindex, boolean z) {
        Object[] objArr = {prefixtoindex, Boolean.valueOf(z)};
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 1875957486, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -1875957483, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), objArr, iOnWarmupCompleted);
    }

    public static final /* synthetic */ boolean onWarmupCompleted(prefixToIndex prefixtoindex) {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted3 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return ((Boolean) onExtraCallbackWithResult(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -141120806, iOnWarmupCompleted2, 141120806, iOnWarmupCompleted3, new Object[]{prefixtoindex}, iOnWarmupCompleted)).booleanValue();
    }

    public static final /* synthetic */ toFullSHA1Hash onExtraCallbackWithResult(prefixToIndex prefixtoindex) {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted3 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (toFullSHA1Hash) onExtraCallbackWithResult(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 525506258, iOnWarmupCompleted2, -525506257, iOnWarmupCompleted3, new Object[]{prefixtoindex}, iOnWarmupCompleted);
    }

    private final boolean asBinder() {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted3 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return ((Boolean) onExtraCallbackWithResult(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -1124775529, iOnWarmupCompleted2, 1124775531, iOnWarmupCompleted3, new Object[]{this}, iOnWarmupCompleted)).booleanValue();
    }

    private final void access000() {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted3 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        onExtraCallbackWithResult(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -266165499, iOnWarmupCompleted2, 266165503, iOnWarmupCompleted3, new Object[]{this}, iOnWarmupCompleted);
    }
}
