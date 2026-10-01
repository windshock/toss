package o;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.google.zxing.datamatrix.encoder.C40Encoder;
import im.toss.features.payment.ui.offline.compose.screen.TossPlaceTableOrderScreenKt$;
import im.toss.securities.libs.performance.tracker.data.model.DeviceOption;
import im.toss.securities.libs.performance.tracker.data.model.SecuritiesPerformanceLogBody;
import im.toss.securities.libs.performance.tracker.data.model.SecuritiesPerformanceLogRequestBody;
import im.toss.securities.libs.performance.tracker.data.model.SecuritiesPerformanceReqeustBody;
import im.toss.tosssecurities.features.main.ui.TossSecMainViewModel;
import im.toss.tosssecurities.network.data.SecuritiesApiErrorResponse;
import im.toss.tosssecurities.network.data.SecuritiesBaseApiResponse;
import im.toss.tosssecurities.network.domain.SecuritiesApiError;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
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
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;
import o.ComputeLandmarkConfidence;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.q3a;
import o.q3be;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;

@Singleton
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class q3be implements r8lambdaVVxSP2UZRJb9NT4EwemUyyGVI, q4ExternalSyntheticLambda5 {
    public static final onExtraCallback Companion;
    private static int IAuthTabCallbackStubProxy;
    private static int extraCallback;
    private final Context IAuthTabCallback;
    private final AppSetIdAndScope1 IAuthTabCallbackDefault;
    private final q3bc<SecuritiesPerformanceLogBody> IAuthTabCallbackStub;
    private final ConstraintsSizeResolverExternalSyntheticLambda0 IAuthTabCallback_Parcel;
    private final TextFieldScrollKtExternalSyntheticLambda0 access100;
    private final AtomicInteger asBinder;
    private final accessgetStatep asInterface;
    private final getBorderRadius<Unit> getInterfaceDescriptor;
    private final q3bg onExtraCallback;
    private final q3a onExtraCallbackWithResult;
    private final findResAndMsg onNavigationEvent;
    private final r8lambda9mD71rewDV_6y0cMhBkpBSbTog onTransact;
    private final Lazy onWarmupCompleted;
    private static final byte[] $$a = {50, 44, -54, 25};
    private static final int $$b = 80;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int extraCallbackWithResult = 1;
    private static int access000 = 0;
    private static int ICustomTabsCallback = 1;

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

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 83;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnNavigationEvent = q3be.onNavigationEvent(-955595192, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{q3be.this, null, this}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 955595197);
            int i4 = onExtraCallbackWithResult + 67;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }
    }

    static final class asInterface extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        int I$0;
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        asInterface(access13800<? super asInterface> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 29;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallbackWithResult = q3be.onExtraCallbackWithResult(q3be.this, null, false, this);
            int i4 = onNavigationEvent + 69;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r7v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, byte b2, short s) {
        int i;
        int i2 = (b2 * 4) + 4;
        byte[] bArr = $$a;
        ?? r7 = (s * 4) + 105;
        int i3 = b * 3;
        byte[] bArr2 = new byte[i3 + 1];
        int i4 = -1;
        if (bArr == null) {
            byte b3 = r7;
            i = i2;
            i2 += -b3;
            i++;
            i4++;
            bArr2[i4] = (byte) i2;
            if (i4 == i3) {
                return new String(bArr2, 0);
            }
            b3 = bArr[i];
            i2 += -b3;
            i++;
            i4++;
            bArr2[i4] = (byte) i2;
            if (i4 == i3) {
            }
        } else {
            i = i2;
            i2 = r7;
            i4++;
            bArr2[i4] = (byte) i2;
            if (i4 == i3) {
            }
        }
    }

    static {
        extraCallback = 0;
        onExtraCallbackWithResult();
        Companion = new onExtraCallback(null);
        int i = extraCallbackWithResult + 125;
        extraCallback = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ CharSequence IAuthTabCallback(File file) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 85;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        CharSequence charSequence = (CharSequence) onNavigationEvent(-1431790719, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{file}, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 1431790720);
        int i4 = access000 + 15;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return charSequence;
        }
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~(i7 | i6);
        int i9 = (~(i7 | i3)) | i8 | (~(i6 | i3));
        int i10 = (~((~i6) | i)) | (~(i | i3));
        int i11 = (~((~i3) | i7)) | i8;
        int i12 = i + i6 + i5 + (1821889583 * i4) + ((-349070011) * i2);
        int i13 = i12 * i12;
        int i14 = (575745661 * i) + 325058560 + (1920428227 * i6) + (i9 * 448227522) + ((-448227522) * i10) + (448227522 * i11) + (1472200704 * i5) + (473956352 * i4) + (1723858944 * i2) + ((-1436549120) * i13);
        int i15 = (i * 921699331) + 387174459 + (i6 * 921699517) + (i9 * 62) + (i10 * (-62)) + (i11 * 62) + (i5 * 921699455) + (i4 * 347275089) + (i2 * 1925323067) + (i13 * 94371840);
        int i16 = i14 + (i15 * i15 * (-174063616));
        if (i16 == 1) {
            File file = (File) objArr[0];
            int i17 = 2 % 2;
            Intrinsics.checkNotNullParameter(file, "");
            String str = file.getName() + ":" + file.length() + "B";
            int i18 = access000 + 61;
            ICustomTabsCallback = i18 % 128;
            int i19 = i18 % 2;
            return str;
        }
        if (i16 == 2) {
            return onWarmupCompleted(objArr);
        }
        if (i16 == 3) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i16 == 4) {
            return onNavigationEvent(objArr);
        }
        if (i16 != 5) {
            return IAuthTabCallback(objArr);
        }
        q3be q3beVar = (q3be) objArr[0];
        List list = (List) objArr[1];
        access13800 access13800Var = (access13800) objArr[2];
        int i20 = 2 % 2;
        int i21 = access000 + 25;
        ICustomTabsCallback = i21 % 128;
        int i22 = i21 % 2;
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        Object objOnNavigationEvent = onNavigationEvent(997480206, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{q3beVar, list, access13800Var}, iOnExtraCallbackWithResult, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -997480202);
        int i23 = ICustomTabsCallback + 23;
        access000 = i23 % 128;
        int i24 = i23 % 2;
        return objOnNavigationEvent;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        q3be q3beVar = (q3be) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 33;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        DeviceOption deviceOptionIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(q3beVar);
        int i4 = ICustomTabsCallback + 119;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return deviceOptionIAuthTabCallbackStubProxy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(q3be q3beVar, int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 19;
        access000 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            IAuthTabCallback(q3beVar, i);
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(q3beVar, i);
        int i4 = ICustomTabsCallback + 43;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    /* renamed from: o.q3be$4, reason: invalid class name */
    static final class AnonymousClass4 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass4(access13800<? super AnonymousClass4> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            AnonymousClass4 anonymousClass4 = q3be.this.new AnonymousClass4(access13800Var);
            anonymousClass4.L$0 = obj;
            int i2 = onWarmupCompleted + 17;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return anonymousClass4;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 111;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onExtraCallback(findresandmsg, access13800Var);
            }
            onExtraCallback(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 53;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 13;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* renamed from: o.q3be$4$4, reason: invalid class name and collision with other inner class name */
        static final class C00524 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ q3be this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00524(q3be q3beVar, access13800<? super C00524> access13800Var) {
                super(2, access13800Var);
                this.this$0 = q3beVar;
            }

            public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 29;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onExtraCallback + 123;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                C00524 c00524 = new C00524(this.this$0, access13800Var);
                c00524.L$0 = obj;
                int i2 = onNavigationEvent + 81;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return c00524;
                }
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 117;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
                int i4 = onNavigationEvent + 59;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return objIAuthTabCallback;
            }

            /* renamed from: o.q3be$4$4$onExtraCallbackWithResult */
            public static final class onExtraCallbackWithResult implements IAnimation<Boolean> {
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;
                final /* synthetic */ IAnimation onWarmupCompleted;

                /* renamed from: o.q3be$4$4$onExtraCallbackWithResult$3, reason: invalid class name */
                public static final class AnonymousClass3<T> implements setRipple {
                    private static int IAuthTabCallback = 1;
                    private static int onWarmupCompleted;
                    final /* synthetic */ setRipple onNavigationEvent;

                    /* renamed from: o.q3be$4$4$onExtraCallbackWithResult$3$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        private static int onExtraCallbackWithResult = 1;
                        private static int onNavigationEvent;
                        int I$0;
                        Object L$0;
                        Object L$1;
                        Object L$2;
                        Object L$3;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(access13800 access13800Var) {
                            super(access13800Var);
                        }

                        public final Object invokeSuspend(Object obj) {
                            int i = 2 % 2;
                            int i2 = onNavigationEvent + 19;
                            onExtraCallbackWithResult = i2 % 128;
                            int i3 = i2 % 2;
                            Object obj2 = null;
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                            if (i3 != 0) {
                                return anonymousClass3.emit(null, this);
                            }
                            anonymousClass3.emit(null, this);
                            obj2.hashCode();
                            throw null;
                        }
                    }

                    public AnonymousClass3(setRipple setripple) {
                        this.onNavigationEvent = setripple;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, access13800 access13800Var) {
                        AnonymousClass1 anonymousClass1;
                        int i = 2 % 2;
                        int i2 = IAuthTabCallback + 73;
                        onWarmupCompleted = i2 % 128;
                        Object obj2 = null;
                        if (i2 % 2 != 0) {
                            boolean z = access13800Var instanceof AnonymousClass1;
                            obj2.hashCode();
                            throw null;
                        }
                        if (access13800Var instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) access13800Var;
                            int i3 = anonymousClass1.label;
                            if ((i3 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i3 - 2147483648;
                                int i4 = onWarmupCompleted + 75;
                                IAuthTabCallback = i4 % 128;
                                int i5 = i4 % 2;
                            } else {
                                anonymousClass1 = new AnonymousClass1(access13800Var);
                            }
                        }
                        Object obj3 = anonymousClass1.result;
                        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                        int i6 = anonymousClass1.label;
                        if (i6 == 0) {
                            ResultKt.onNavigationEvent(obj3);
                            setRipple setripple = this.onNavigationEvent;
                            Boolean boolOnNavigationEvent = access14000.onNavigationEvent(((TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) obj).isAtLeast(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED));
                            anonymousClass1.L$0 = access15400.onNavigationEvent(obj);
                            anonymousClass1.L$1 = access15400.onNavigationEvent(anonymousClass1);
                            anonymousClass1.L$2 = access15400.onNavigationEvent(obj);
                            anonymousClass1.L$3 = access15400.onNavigationEvent(setripple);
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.label = 1;
                            if (setripple.emit(boolOnNavigationEvent, anonymousClass1) == objOnWarmupCompleted) {
                                int i7 = IAuthTabCallback + 25;
                                onWarmupCompleted = i7 % 128;
                                if (i7 % 2 == 0) {
                                    return objOnWarmupCompleted;
                                }
                                throw null;
                            }
                        } else {
                            if (i6 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.onNavigationEvent(obj3);
                            int i8 = IAuthTabCallback + 93;
                            onWarmupCompleted = i8 % 128;
                            int i9 = i8 % 2;
                        }
                        return Unit.INSTANCE;
                    }
                }

                public onExtraCallbackWithResult(IAnimation iAnimation) {
                    this.onWarmupCompleted = iAnimation;
                }

                public Object collect(setRipple setripple, access13800 access13800Var) {
                    int i = 2 % 2;
                    Object objCollect = this.onWarmupCompleted.collect(new AnonymousClass3(setripple), access13800Var);
                    if (objCollect == access14300.onWarmupCompleted()) {
                        int i2 = onExtraCallbackWithResult + 87;
                        onNavigationEvent = i2 % 128;
                        int i3 = i2 % 2;
                        return objCollect;
                    }
                    Unit unit = Unit.INSTANCE;
                    int i4 = onNavigationEvent + 69;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 != 0) {
                        return unit;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }

            /* renamed from: o.q3be$4$4$3, reason: invalid class name */
            static final class AnonymousClass3 extends SuspendLambda implements Function2<Boolean, access13800<? super Unit>, Object> {
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;
                final /* synthetic */ findResAndMsg $$this$launch;
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ q3be this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(findResAndMsg findresandmsg, q3be q3beVar, access13800<? super AnonymousClass3> access13800Var) {
                    super(2, access13800Var);
                    this.$$this$launch = findresandmsg;
                    this.this$0 = q3beVar;
                }

                public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                    int i = 2 % 2;
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$$this$launch, this.this$0, access13800Var);
                    anonymousClass3.Z$0 = ((Boolean) obj).booleanValue();
                    int i2 = onWarmupCompleted + 123;
                    onExtraCallback = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 76 / 0;
                    }
                    return anonymousClass3;
                }

                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 71;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    Object objOnWarmupCompleted = onWarmupCompleted(((Boolean) obj).booleanValue(), (access13800) obj2);
                    int i4 = onExtraCallback + 1;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 != 0) {
                        return objOnWarmupCompleted;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }

                public final Object onWarmupCompleted(boolean z, access13800<? super Unit> access13800Var) {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 69;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    Object objInvokeSuspend = create(Boolean.valueOf(z), access13800Var).invokeSuspend(Unit.INSTANCE);
                    int i4 = onWarmupCompleted + 33;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return objInvokeSuspend;
                }

                /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0067 -> B:23:0x0069). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    boolean z = this.Z$0;
                    Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                    int i2 = this.label;
                    if (i2 == 0) {
                        ResultKt.onNavigationEvent(obj);
                        if (z) {
                        }
                        return Unit.INSTANCE;
                    }
                    int i3 = onWarmupCompleted + 109;
                    int i4 = i3 % 128;
                    onExtraCallback = i4;
                    if (i3 % 2 == 0 ? i2 == 1 : i2 == 1) {
                        ResultKt.onNavigationEvent(obj);
                        this.Z$0 = z;
                        this.label = 2;
                        if (formatMsgs.onWarmupCompleted(10000L, this) != objOnWarmupCompleted) {
                        }
                        return objOnWarmupCompleted;
                    }
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = i4 + 25;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 == 0) {
                        ResultKt.onNavigationEvent(obj);
                        int i6 = 96 / 0;
                    } else {
                        ResultKt.onNavigationEvent(obj);
                    }
                    if (findRes.onWarmupCompleted(this.$$this$launch)) {
                        int i7 = onWarmupCompleted + 49;
                        onExtraCallback = i7 % 128;
                        int i8 = i7 % 2;
                        getBorderRadius getborderradiusIAuthTabCallbackDefault = q3be.IAuthTabCallbackDefault(this.this$0);
                        Unit unit = Unit.INSTANCE;
                        this.Z$0 = z;
                        this.label = 1;
                        if (getborderradiusIAuthTabCallbackDefault.emit(unit, this) != objOnWarmupCompleted) {
                            this.Z$0 = z;
                            this.label = 2;
                            if (formatMsgs.onWarmupCompleted(10000L, this) != objOnWarmupCompleted) {
                                if (findRes.onWarmupCompleted(this.$$this$launch)) {
                                }
                            }
                        }
                        return objOnWarmupCompleted;
                    }
                    return Unit.INSTANCE;
                }
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                Object obj2 = null;
                if (i2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    IAnimation iAnimationOnNavigationEvent = ycxycx.onNavigationEvent(new onExtraCallbackWithResult(q3be.asBinder(this.this$0).getLifecycle().onWarmupCompleted()));
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(findresandmsg, this.this$0, null);
                    this.L$0 = access15400.onNavigationEvent(findresandmsg);
                    this.label = 1;
                    if (ycxycx.onWarmupCompleted(iAnimationOnNavigationEvent, anonymousClass3, this) == objOnWarmupCompleted) {
                        int i3 = onNavigationEvent;
                        int i4 = i3 + 1;
                        onExtraCallback = i4 % 128;
                        int i5 = i4 % 2;
                        int i6 = i3 + 61;
                        onExtraCallback = i6 % 128;
                        if (i6 % 2 == 0) {
                            return objOnWarmupCompleted;
                        }
                        throw null;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i7 = onExtraCallback + 11;
                    onNavigationEvent = i7 % 128;
                    if (i7 % 2 == 0) {
                        ResultKt.onNavigationEvent(obj);
                        obj2.hashCode();
                        throw null;
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 33;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new C00524(q3be.this, null), 3, (Object) null);
            maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new AnonymousClass1(q3be.this, null), 3, (Object) null);
            Unit unit = Unit.INSTANCE;
            int i3 = onWarmupCompleted + 81;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }

        /* renamed from: o.q3be$4$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            int label;
            final /* synthetic */ q3be this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(q3be q3beVar, access13800<? super AnonymousClass1> access13800Var) {
                super(2, access13800Var);
                this.this$0 = q3beVar;
            }

            public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws setWrite {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 17;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onNavigationEvent + 59;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, access13800Var);
                int i2 = onNavigationEvent + 11;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass1;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) throws setWrite {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 47;
                onNavigationEvent = i2 % 128;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super Unit> access13800Var = (access13800) obj2;
                if (i2 % 2 == 0) {
                    IAuthTabCallback(findresandmsg, access13800Var);
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                Object objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
                int i3 = onExtraCallbackWithResult + 123;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 45 / 0;
                }
                return objIAuthTabCallback;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: o.setWrite */
            public final Object invokeSuspend(Object obj) throws setWrite {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 57;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i4 = this.label;
                if (i4 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    getBorderRadius getborderradiusIAuthTabCallbackDefault = q3be.IAuthTabCallbackDefault(this.this$0);
                    final q3be q3beVar = this.this$0;
                    setRipple setripple = new setRipple() { // from class: o.q3be.4.1.2
                        private static int onExtraCallback = 1;
                        private static int onNavigationEvent;

                        public /* synthetic */ Object emit(Object obj2, access13800 access13800Var) {
                            int i5 = 2 % 2;
                            int i6 = onExtraCallback + 59;
                            onNavigationEvent = i6 % 128;
                            Unit unit = (Unit) obj2;
                            if (i6 % 2 != 0) {
                                onExtraCallback(unit, access13800Var);
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                            Object objOnExtraCallback = onExtraCallback(unit, access13800Var);
                            int i7 = onExtraCallback + 13;
                            onNavigationEvent = i7 % 128;
                            int i8 = i7 % 2;
                            return objOnExtraCallback;
                        }

                        public final Object onExtraCallback(Unit unit, access13800<? super Unit> access13800Var) {
                            int i5 = 2 % 2;
                            int i6 = onExtraCallback + 3;
                            onNavigationEvent = i6 % 128;
                            int i7 = i6 % 2;
                            Object objOnNavigationEvent = q3be.onNavigationEvent(q3beVar, access13800Var);
                            if (objOnNavigationEvent != access14300.onWarmupCompleted()) {
                                return Unit.INSTANCE;
                            }
                            int i8 = onExtraCallback + 43;
                            onNavigationEvent = i8 % 128;
                            int i9 = i8 % 2;
                            return objOnNavigationEvent;
                        }
                    };
                    this.label = 1;
                    if (getborderradiusIAuthTabCallbackDefault.collect(setripple, this) == objOnWarmupCompleted) {
                        int i5 = onExtraCallbackWithResult + 123;
                        onNavigationEvent = i5 % 128;
                        int i6 = i5 % 2;
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    int i7 = onExtraCallbackWithResult + 49;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                }
                throw new setWrite();
            }
        }
    }

    @Inject
    public q3be(@NotNull Context context, @NotNull ConstraintsSizeResolverExternalSyntheticLambda0 constraintsSizeResolverExternalSyntheticLambda0, @NotNull q3bg q3bgVar, @NotNull accessgetStatep accessgetstatep) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(constraintsSizeResolverExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(q3bgVar, "");
        Intrinsics.checkNotNullParameter(accessgetstatep, "");
        this.IAuthTabCallback = context;
        this.IAuthTabCallback_Parcel = constraintsSizeResolverExternalSyntheticLambda0;
        this.onExtraCallback = q3bgVar;
        this.asInterface = accessgetstatep;
        this.IAuthTabCallbackDefault = ea10.onExtraCallbackWithResult("SecuritiesPerformanceTracker");
        this.onNavigationEvent = findRes.onWarmupCompleted(putChannelInfo.IAuthTabCallback().plus(isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null)));
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = TextLinkScopeExternalSyntheticLambda3.Companion.onExtraCallbackWithResult();
        this.access100 = textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult;
        this.asBinder = new AtomicInteger(0);
        this.onExtraCallbackWithResult = new q3a(accessgetstatep, new onNavigationEvent(this), new IAuthTabCallback(this), new onWarmupCompleted(null));
        this.onTransact = new r8lambda9mD71rewDV_6y0cMhBkpBSbTog(this, new q3ExternalSyntheticLambda0(512, 32, 100), new Function1() { // from class: im.toss.securities.libs.performance.tracker.data.SecuritiesPerformanceTracker$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 71;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    q3be.onWarmupCompleted(this.f$0, ((Integer) obj).intValue());
                    throw null;
                }
                Unit unitOnWarmupCompleted = q3be.onWarmupCompleted(this.f$0, ((Integer) obj).intValue());
                int i3 = onExtraCallback + 61;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 21 / 0;
                }
                return unitOnWarmupCompleted;
            }
        }, null, 8, null);
        Object[] objArr = new Object[1];
        a(1 - ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1, new char[]{0}, false, Color.blue(0) + 192, objArr);
        this.IAuthTabCallbackStub = new q3bc<>(context, ((String) objArr[0]).intern(), 5000);
        this.getInterfaceDescriptor = RealImageLoaderKtCoroutineScopeinlinedCoroutineExceptionHandler1.onWarmupCompleted();
        this.onWarmupCompleted = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.securities.libs.performance.tracker.data.SecuritiesPerformanceTracker$$ExternalSyntheticLambda1
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 123;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr2 = {this.f$0};
                int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult3 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult4 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                if (i3 == 0) {
                    return (DeviceOption) q3be.onNavigationEvent(32904597, iOnExtraCallbackWithResult4, objArr2, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, -32904595);
                }
                int i4 = 79 / 0;
                return (DeviceOption) q3be.onNavigationEvent(32904597, iOnExtraCallbackWithResult4, objArr2, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, -32904595);
            }
        });
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult), putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new AnonymousClass4(null), 2, (Object) null);
    }

    public static final /* synthetic */ q3bg IAuthTabCallback(q3be q3beVar) {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 83;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        q3bg q3bgVar = q3beVar.onExtraCallback;
        int i5 = i2 + 51;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return q3bgVar;
    }

    public static final /* synthetic */ getBorderRadius IAuthTabCallbackDefault(q3be q3beVar) {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 3;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        getBorderRadius<Unit> getborderradius = q3beVar.getInterfaceDescriptor;
        int i5 = i2 + 55;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 17 / 0;
        }
        return getborderradius;
    }

    public static final /* synthetic */ boolean IAuthTabCallbackStub(q3be q3beVar) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 87;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = q3beVar.onWarmupCompleted();
        int i4 = access000 + 93;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return zOnWarmupCompleted;
    }

    public static final /* synthetic */ TextFieldScrollKtExternalSyntheticLambda0 asBinder(q3be q3beVar) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 1;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = q3beVar.access100;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 57;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return textFieldScrollKtExternalSyntheticLambda0;
    }

    public static final /* synthetic */ Object onExtraCallback(q3be q3beVar, File file, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = access000 + 17;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = q3beVar.IAuthTabCallback(file, (access13800<? super SecuritiesPerformanceLogBody>) access13800Var);
        int i4 = ICustomTabsCallback + 45;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return objIAuthTabCallback;
    }

    public static final /* synthetic */ Object onExtraCallbackWithResult(q3be q3beVar, SecuritiesPerformanceLogBody securitiesPerformanceLogBody, boolean z, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = access000 + 67;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = q3beVar.onExtraCallback(securitiesPerformanceLogBody, z, (access13800<? super Unit>) access13800Var);
        int i4 = access000 + 35;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 76 / 0;
        }
        return objOnExtraCallback;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        q3be q3beVar = (q3be) objArr[0];
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 87;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        q3bc<SecuritiesPerformanceLogBody> q3bcVar = q3beVar.IAuthTabCallbackStub;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 5;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return q3bcVar;
    }

    public static final /* synthetic */ String onExtraCallbackWithResult(q3be q3beVar, List list, int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 61;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        String strOnExtraCallback = q3beVar.onExtraCallback((List<? extends File>) list, i);
        int i5 = access000 + 5;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return strOnExtraCallback;
        }
        throw null;
    }

    public static final /* synthetic */ q3a onExtraCallbackWithResult(q3be q3beVar) {
        int i = 2 % 2;
        int i2 = access000 + 57;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        q3a q3aVar = q3beVar.onExtraCallbackWithResult;
        if (i3 == 0) {
            int i4 = 87 / 0;
        }
        return q3aVar;
    }

    public static final /* synthetic */ Object onNavigationEvent(q3be q3beVar, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 3;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = q3beVar.onExtraCallback((access13800<? super Unit>) access13800Var);
        int i4 = access000 + 119;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return objOnExtraCallback;
        }
        throw null;
    }

    public static final /* synthetic */ String onNavigationEvent(q3be q3beVar) {
        int i = 2 % 2;
        int i2 = access000 + 89;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            return (String) onNavigationEvent(1791305796, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{q3beVar}, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, -1791305796);
        }
        int iOnExtraCallbackWithResult4 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int i3 = 31 / 0;
        return (String) onNavigationEvent(1791305796, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{q3beVar}, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult6, iOnExtraCallbackWithResult5, -1791305796);
    }

    public static final /* synthetic */ AppSetIdAndScope1 onTransact(q3be q3beVar) {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 35;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        AppSetIdAndScope1 appSetIdAndScope1 = q3beVar.IAuthTabCallbackDefault;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 3;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return appSetIdAndScope1;
    }

    public static final /* synthetic */ DeviceOption onWarmupCompleted(q3be q3beVar) {
        int i = 2 % 2;
        int i2 = access000 + 7;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        DeviceOption deviceOptionOnNavigationEvent = q3beVar.onNavigationEvent();
        if (i3 == 0) {
            int i4 = 46 / 0;
        }
        return deviceOptionOnNavigationEvent;
    }

    public static final class onTransact extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Result<? extends Boolean>>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ List $requestLogItems$inlined;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ q3be this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onTransact(access13800 access13800Var, q3be q3beVar, List list) {
            super(2, access13800Var);
            this.this$0 = q3beVar;
            this.$requestLogItems$inlined = list;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onTransact ontransact = new onTransact(access13800Var, this.this$0, this.$requestLogItems$inlined);
            int i2 = onWarmupCompleted + 47;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return ontransact;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Exception {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 3;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Result<? extends Boolean>> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onNavigationEvent(findresandmsg, access13800Var);
            }
            Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
            int i3 = 95 / 0;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Result<? extends Boolean>> access13800Var) throws Exception {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 79;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onTransact ontransactCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                ontransactCreate.invokeSuspend(Unit.INSTANCE);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = ontransactCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 31;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: retrofit2.HttpException */
        public final Object invokeSuspend(Object obj) throws Exception {
            Object obj2;
            SecuritiesApiError securitiesApiErrorOnWarmupCompleted;
            Boolean bool;
            Object objOnExtraCallbackWithResult;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            try {
                if (i2 != 0) {
                    int i3 = onWarmupCompleted + 123;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                } else {
                    ResultKt.onNavigationEvent(obj);
                    Result.Companion companion = Result.Companion;
                    q3bg q3bgVarIAuthTabCallback = q3be.IAuthTabCallback(this.this$0);
                    SecuritiesPerformanceReqeustBody securitiesPerformanceReqeustBody = new SecuritiesPerformanceReqeustBody(q3be.onWarmupCompleted(this.this$0), this.$requestLogItems$inlined);
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.L$1 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.I$2 = 0;
                    this.label = 1;
                    obj = q3bgVarIAuthTabCallback.onNavigationEvent(securitiesPerformanceReqeustBody, this);
                    if (obj == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                }
                try {
                    objOnExtraCallbackWithResult = ((SecuritiesBaseApiResponse) obj).onExtraCallbackWithResult();
                } catch (NullPointerException e) {
                    if (!Intrinsics.areEqual(Boolean.class, Object.class)) {
                        if (!Intrinsics.areEqual(Boolean.class, Unit.class)) {
                            throw e;
                        }
                        int i5 = onWarmupCompleted + 53;
                        onExtraCallbackWithResult = i5 % 128;
                        int i6 = i5 % 2;
                    }
                    bool = Unit.INSTANCE;
                } catch (Exception e2) {
                    throw e2;
                }
            } catch (WebResourceResponseModel e3) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
            } catch (CancellationException e4) {
                throw e4;
            } catch (Exception e5) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e5));
                int i7 = onWarmupCompleted + 87;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
            }
            if (objOnExtraCallbackWithResult == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            }
            bool = (Boolean) objOnExtraCallbackWithResult;
            obj2 = Result.constructor-impl(bool);
            HttpException httpException = Result.exceptionOrNull-impl(obj2);
            if (httpException != null) {
                try {
                    Result.Companion companion4 = Result.Companion;
                    if (!(httpException instanceof HttpException) || (securitiesApiErrorOnWarmupCompleted = SecuritiesApiErrorResponse.Companion.onWarmupCompleted(httpException)) == null) {
                        throw httpException;
                    }
                    int i9 = onWarmupCompleted + 57;
                    onExtraCallbackWithResult = i9 % 128;
                    if (i9 % 2 != 0) {
                        throw null;
                    }
                    throw securitiesApiErrorOnWarmupCompleted;
                } catch (Throwable th) {
                    Result.Companion companion5 = Result.Companion;
                    obj2 = Result.constructor-impl(ResultKt.createFailure(th));
                }
            }
            return Result.IAuthTabCallback(obj2);
        }
    }

    @Override // o.r8lambdaVVxSP2UZRJb9NT4EwemUyyGVI
    public findResAndMsg IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 61;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        findResAndMsg findresandmsg = this.onNavigationEvent;
        int i5 = i2 + 97;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return findresandmsg;
        }
        throw null;
    }

    static final /* synthetic */ class onNavigationEvent extends FunctionReferenceImpl implements Function0<String> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        onNavigationEvent(Object obj) {
            super(0, obj, q3be.class, "currentAppState", "currentAppState()Ljava/lang/String;", 0);
        }

        public /* synthetic */ Object invoke() {
            String strOnNavigationEvent;
            int i = 2 % 2;
            int i2 = onExtraCallback + 69;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                strOnNavigationEvent = onNavigationEvent();
                int i3 = 58 / 0;
            } else {
                strOnNavigationEvent = onNavigationEvent();
            }
            int i4 = onNavigationEvent + 91;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return strOnNavigationEvent;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 59;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            String strOnNavigationEvent = q3be.onNavigationEvent((q3be) ((CallableReference) this).receiver);
            int i4 = onExtraCallback + 7;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return strOnNavigationEvent;
            }
            throw null;
        }
    }

    static final /* synthetic */ class IAuthTabCallback extends FunctionReferenceImpl implements Function0<Boolean> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        IAuthTabCallback(Object obj) {
            super(0, obj, q3be.class, "isMonitoringDashboardEnabled", "isMonitoringDashboardEnabled()Z", 0);
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 99;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Boolean boolOnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i4 = onWarmupCompleted + 107;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return boolOnExtraCallbackWithResult;
        }

        public final Boolean onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 61;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Boolean boolValueOf = Boolean.valueOf(q3be.IAuthTabCallbackStub((q3be) ((CallableReference) this).receiver));
            int i4 = IAuthTabCallback + 47;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 28 / 0;
            }
            return boolValueOf;
        }
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<SecuritiesPerformanceLogBody, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        /* synthetic */ Object L$0;
        int label;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = q3be.this.new onWarmupCompleted(access13800Var);
            onwarmupcompleted.L$0 = obj;
            int i2 = onWarmupCompleted + 105;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 61 / 0;
            }
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 71;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((SecuritiesPerformanceLogBody) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 87;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(SecuritiesPerformanceLogBody securitiesPerformanceLogBody, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 49;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompletedCreate = create(securitiesPerformanceLogBody, access13800Var);
            if (i3 != 0) {
                return onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i4 = 41 / 0;
            return onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            SecuritiesPerformanceLogBody securitiesPerformanceLogBody = (SecuritiesPerformanceLogBody) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            Object obj2 = null;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                q3be q3beVar = q3be.this;
                this.L$0 = access15400.onNavigationEvent(securitiesPerformanceLogBody);
                this.label = 1;
                if (q3be.onExtraCallbackWithResult(q3beVar, securitiesPerformanceLogBody, false, this) == objOnWarmupCompleted) {
                    int i3 = onWarmupCompleted + 11;
                    onExtraCallback = i3 % 128;
                    if (i3 % 2 != 0) {
                        return objOnWarmupCompleted;
                    }
                    throw null;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 63;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            obj2.hashCode();
            throw null;
        }
    }

    private static final Unit IAuthTabCallback(q3be q3beVar, int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 55;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        q3beVar.onExtraCallbackWithResult.onNavigationEvent();
        Unit unit = Unit.INSTANCE;
        int i5 = ICustomTabsCallback + 89;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private final DeviceOption onNavigationEvent() {
        DeviceOption deviceOption;
        int i = 2 % 2;
        int i2 = access000 + 99;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            deviceOption = (DeviceOption) this.onWarmupCompleted.getValue();
            int i3 = 48 / 0;
        } else {
            deviceOption = (DeviceOption) this.onWarmupCompleted.getValue();
        }
        int i4 = access000 + 73;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return deviceOption;
    }

    private static final DeviceOption IAuthTabCallbackStubProxy(q3be q3beVar) {
        int i = 2 % 2;
        String strOnNavigationEvent = q3beVar.IAuthTabCallback_Parcel.onNavigationEvent();
        String str = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(str, "");
        String str2 = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(str2, "");
        DeviceOption deviceOption = new DeviceOption("android", strOnNavigationEvent, str2, str);
        int i2 = ICustomTabsCallback + 23;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        return deviceOption;
    }

    @Override // o.r8lambdaVVxSP2UZRJb9NT4EwemUyyGVI
    public Object onNavigationEvent(@NotNull r8lambdaGuc5V9NsYQnbZkQbf4KwyluwEz4 r8lambdaguc5v9nsyqnbzkqbf4kwyluwez4, @NotNull access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new IAuthTabCallbackStub(r8lambdaguc5v9nsyqnbzkqbf4kwyluwez4, null), access13800Var);
        if (objOnExtraCallback == access14300.onWarmupCompleted()) {
            int i2 = ICustomTabsCallback + 65;
            access000 = i2 % 128;
            if (i2 % 2 == 0) {
                return objOnExtraCallback;
            }
            throw null;
        }
        Unit unit = Unit.INSTANCE;
        int i3 = ICustomTabsCallback + 97;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 15 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        char[] cArr2;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr3 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr3[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i6]), Integer.valueOf(IAuthTabCallbackStubProxy)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 35124), 23 - ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getJumpTapTimeout() >> 16) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12842 - MotionEvent.axisFromString("")), 55 - Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2166, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
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
        if (i2 > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr4 = new char[i];
            System.arraycopy(cArr3, 0, cArr4, 0, i);
            System.arraycopy(cArr4, 0, cArr3, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr4, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr3, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i7 = $10 + 65;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                cArr2 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 1;
            } else {
                cArr2 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            }
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr3[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12844 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 55, TextUtils.lastIndexOf("", '0', 0, 0) + 2168, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
            }
            cArr3 = cArr2;
        }
        String str = new String(cArr3);
        int i8 = $10 + 47;
        $11 = i8 % 128;
        if (i8 % 2 != 0) {
            objArr[0] = str;
        } else {
            int i9 = 46 / 0;
            objArr[0] = str;
        }
    }

    static final class IAuthTabCallbackStub extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ r8lambdaGuc5V9NsYQnbZkQbf4KwyluwEz4 $data;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackStub(r8lambdaGuc5V9NsYQnbZkQbf4KwyluwEz4 r8lambdaguc5v9nsyqnbzkqbf4kwyluwez4, access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(2, access13800Var);
            this.$data = r8lambdaguc5v9nsyqnbzkqbf4kwyluwez4;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackStub iAuthTabCallbackStub = q3be.this.new IAuthTabCallbackStub(this.$data, access13800Var);
            int i2 = onExtraCallback + 105;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 55 / 0;
            }
            return iAuthTabCallbackStub;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 9;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 19;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnNavigationEvent;
            }
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 15;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallbackStub iAuthTabCallbackStubCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                return iAuthTabCallbackStubCreate.invokeSuspend(Unit.INSTANCE);
            }
            iAuthTabCallbackStubCreate.invokeSuspend(Unit.INSTANCE);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            r8lambdaGuc5V9NsYQnbZkQbf4KwyluwEz4 r8lambdaguc5v9nsyqnbzkqbf4kwyluwez4;
            q3be q3beVar;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    if (!q3be.onExtraCallbackWithResult(q3be.this).onExtraCallbackWithResult(this.$data)) {
                        int i3 = onExtraCallback + 117;
                        onNavigationEvent = i3 % 128;
                        if (i3 % 2 != 0) {
                            return Unit.INSTANCE;
                        }
                        Unit unit = Unit.INSTANCE;
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    Object[] objArr = {q3be.onExtraCallbackWithResult(q3be.this), this.$data};
                    q3a.onWarmupCompleted(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), 1822976475, objArr, C40Encoder.onExtraCallback(), -1822976473, C40Encoder.onExtraCallback());
                    r8lambdaguc5v9nsyqnbzkqbf4kwyluwez4 = this.$data;
                    q3be q3beVar2 = q3be.this;
                    Result.Companion companion = Result.Companion;
                    SecuritiesPerformanceLogBody securitiesPerformanceLogBodyOnNavigationEvent = r8lambdaB4yvEJRrqshFfJjnkyA0PO4d8UA.onNavigationEvent(r8lambdaguc5v9nsyqnbzkqbf4kwyluwez4);
                    q3be.onTransact(q3beVar2);
                    r8lambdaI_riJwGSTfIBpj9mrqkT4n4SVDY.onNavigationEvent(r8lambdaguc5v9nsyqnbzkqbf4kwyluwez4);
                    this.L$0 = r8lambdaguc5v9nsyqnbzkqbf4kwyluwez4;
                    this.L$1 = q3beVar2;
                    this.L$2 = access15400.onNavigationEvent(this);
                    this.L$3 = access15400.onNavigationEvent(securitiesPerformanceLogBodyOnNavigationEvent);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    if (q3be.onExtraCallbackWithResult(q3beVar2, securitiesPerformanceLogBodyOnNavigationEvent, false, this, 2, null) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                    q3beVar = q3beVar2;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q3beVar = (q3be) this.L$1;
                    r8lambdaguc5v9nsyqnbzkqbf4kwyluwez4 = (r8lambdaGuc5V9NsYQnbZkQbf4KwyluwEz4) this.L$0;
                    ResultKt.onNavigationEvent(obj);
                }
                q3be.onExtraCallbackWithResult(q3beVar).onExtraCallback(r8lambdaguc5v9nsyqnbzkqbf4kwyluwez4);
                obj2 = Result.constructor-impl(Unit.INSTANCE);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
                int i4 = onExtraCallback + 51;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
            } catch (WebResourceResponseModel e3) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
            }
            q3be q3beVar3 = q3be.this;
            r8lambdaGuc5V9NsYQnbZkQbf4KwyluwEz4 r8lambdaguc5v9nsyqnbzkqbf4kwyluwez42 = this.$data;
            Throwable th = Result.exceptionOrNull-impl(obj2);
            if (th != null) {
                int i6 = onNavigationEvent + 11;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                Object[] objArr2 = {q3be.onExtraCallbackWithResult(q3beVar3), r8lambdaguc5v9nsyqnbzkqbf4kwyluwez42};
                q3a.onWarmupCompleted(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -220368184, objArr2, C40Encoder.onExtraCallback(), 220368187, C40Encoder.onExtraCallback());
                q3be.onTransact(q3beVar3);
                th.getMessage();
            }
            return Unit.INSTANCE;
        }
    }

    private final Object onExtraCallback(access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new asBinder(null), access13800Var);
        if (objOnExtraCallback == access14300.onWarmupCompleted()) {
            int i2 = ICustomTabsCallback + 51;
            access000 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 56 / 0;
            }
            return objOnExtraCallback;
        }
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 35;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        long J$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$10;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;

        asBinder(access13800<? super asBinder> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asBinder asbinder = q3be.this.new asBinder(access13800Var);
            asbinder.L$0 = obj;
            int i2 = onExtraCallback + 85;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return asbinder;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 21;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onNavigationEvent(findresandmsg, access13800Var);
            }
            onNavigationEvent(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 83;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            asBinder asbinderCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return asbinderCreate.invokeSuspend(unit);
            }
            asbinderCreate.invokeSuspend(unit);
            throw null;
        }

        static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;
            final /* synthetic */ List<File> $files;
            final /* synthetic */ q3a.IAuthTabCallback $flushCycle;
            int I$0;
            int I$1;
            int I$2;
            int I$3;
            int I$4;
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            Object L$4;
            Object L$5;
            Object L$6;
            Object L$7;
            Object L$8;
            int label;
            final /* synthetic */ q3be this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            onExtraCallbackWithResult(List<? extends File> list, q3be q3beVar, q3a.IAuthTabCallback iAuthTabCallback, access13800<? super onExtraCallbackWithResult> access13800Var) {
                super(2, access13800Var);
                this.$files = list;
                this.this$0 = q3beVar;
                this.$flushCycle = iAuthTabCallback;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$files, this.this$0, this.$flushCycle, access13800Var);
                int i2 = onExtraCallback + 47;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 64 / 0;
                }
                return onextracallbackwithresult;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 65;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
                int i4 = onExtraCallback + 89;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return objOnExtraCallback;
                }
                throw null;
            }

            public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 15;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onExtraCallback + 3;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return objInvokeSuspend;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x00e3, code lost:
            
                if (r2 != r0) goto L17;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0099  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x00ee  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x020b  */
            /* JADX WARN: Type inference failed for: r4v0 */
            /* JADX WARN: Type inference failed for: r4v1 */
            /* JADX WARN: Type inference failed for: r4v11 */
            /* JADX WARN: Type inference failed for: r4v12 */
            /* JADX WARN: Type inference failed for: r4v13 */
            /* JADX WARN: Type inference failed for: r4v2 */
            /* JADX WARN: Type inference failed for: r4v8, types: [java.util.List] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00e3 -> B:17:0x00e5). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object obj2;
                List<? extends SecuritiesPerformanceLogBody> list;
                Throwable th;
                Iterator it;
                Iterable iterable;
                Iterable iterable2;
                Iterable iterable3;
                int i;
                q3be q3beVar;
                Collection collection;
                int i2;
                int i3;
                q3be q3beVar2;
                List<File> list2;
                int i4 = 2;
                int i5 = 2 % 2;
                int i6 = IAuthTabCallback + 75;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i8 = this.label;
                ?? r4 = 1;
                r4 = 1;
                try {
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    Result.Companion companion = Result.Companion;
                    obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
                    int i9 = IAuthTabCallback + 35;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                    list = r4;
                } catch (WebResourceResponseModel e3) {
                    Result.Companion companion2 = Result.Companion;
                    obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
                    list = r4;
                }
                if (i8 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    List<File> list3 = this.$files;
                    q3be q3beVar3 = this.this$0;
                    ArrayList arrayList = new ArrayList();
                    it = list3.iterator();
                    iterable = list3;
                    iterable2 = iterable;
                    iterable3 = iterable2;
                    i = 0;
                    q3beVar = q3beVar3;
                    collection = arrayList;
                    i2 = 0;
                    i3 = 0;
                    if (!it.hasNext()) {
                    }
                    return objOnWarmupCompleted;
                }
                if (i8 != 1) {
                    if (i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i11 = IAuthTabCallback + 81;
                    onExtraCallback = i11 % 128;
                    int i12 = i11 % 2;
                    list2 = (List) this.L$3;
                    q3beVar2 = (q3be) this.L$2;
                    List list4 = (List) this.L$1;
                    ResultKt.onNavigationEvent(obj);
                    int i13 = IAuthTabCallback + 33;
                    onExtraCallback = i13 % 128;
                    int i14 = i13 % 2;
                    r4 = list4;
                    int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                    ((q3bc) q3be.onNavigationEvent(-444116033, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{q3beVar2}, iOnExtraCallbackWithResult, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 444116036)).IAuthTabCallback(list2);
                    q3be.onExtraCallbackWithResult(q3beVar2).onExtraCallbackWithResult((List<? extends SecuritiesPerformanceLogBody>) r4);
                    obj2 = Result.constructor-impl(Unit.INSTANCE);
                    list = r4;
                    q3be q3beVar4 = this.this$0;
                    List<File> list5 = this.$files;
                    th = Result.exceptionOrNull-impl(obj2);
                    if (th != null) {
                        q3be.onExtraCallbackWithResult(q3beVar4).onNavigationEvent(list);
                        int iOnExtraCallbackWithResult3 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                        int iOnExtraCallbackWithResult4 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                        ((q3bc) q3be.onNavigationEvent(-444116033, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{q3beVar4}, iOnExtraCallbackWithResult3, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4, 444116036)).onWarmupCompleted(list5);
                        q3be.onTransact(q3beVar4);
                        th.getMessage();
                    }
                    return Unit.INSTANCE;
                }
                i = this.I$2;
                i2 = this.I$1;
                i3 = this.I$0;
                it = (Iterator) this.L$5;
                iterable = (Iterable) this.L$4;
                collection = (Collection) this.L$3;
                iterable2 = (Iterable) this.L$2;
                q3beVar = (q3be) this.L$1;
                iterable3 = (Iterable) this.L$0;
                ResultKt.onNavigationEvent(obj);
                Object objOnExtraCallback = obj;
                SecuritiesPerformanceLogBody securitiesPerformanceLogBody = (SecuritiesPerformanceLogBody) objOnExtraCallback;
                if (securitiesPerformanceLogBody != null) {
                    collection.add(securitiesPerformanceLogBody);
                }
                i4 = 2;
                if (!it.hasNext()) {
                    int i15 = IAuthTabCallback + 111;
                    onExtraCallback = i15 % 128;
                    int i16 = i15 % i4;
                    Object next = it.next();
                    File file = (File) next;
                    this.L$0 = access15400.onNavigationEvent(iterable3);
                    this.L$1 = q3beVar;
                    this.L$2 = access15400.onNavigationEvent(iterable2);
                    this.L$3 = collection;
                    this.L$4 = access15400.onNavigationEvent(iterable);
                    this.L$5 = it;
                    this.L$6 = access15400.onNavigationEvent(next);
                    this.L$7 = access15400.onNavigationEvent(next);
                    this.L$8 = access15400.onNavigationEvent(file);
                    this.I$0 = i3;
                    this.I$1 = i2;
                    this.I$2 = i;
                    this.I$3 = 0;
                    this.I$4 = 0;
                    this.label = 1;
                    objOnExtraCallback = q3be.onExtraCallback(q3beVar, file, (access13800) this);
                } else {
                    List<? extends SecuritiesPerformanceLogBody> list6 = (List) collection;
                    List<SecuritiesPerformanceLogBody> listOnWarmupCompleted = q3be.onExtraCallbackWithResult(this.this$0).onWarmupCompleted(list6, this.$flushCycle);
                    if (listOnWarmupCompleted.isEmpty()) {
                        int i17 = IAuthTabCallback + 7;
                        onExtraCallback = i17 % 128;
                        int i18 = i17 % 2;
                        if (!list6.isEmpty()) {
                            q3be.onTransact(this.this$0);
                            ((q3bc) q3be.onNavigationEvent(-444116033, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{this.this$0}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 444116036)).IAuthTabCallback(this.$files);
                            return Unit.INSTANCE;
                        }
                    }
                    if (listOnWarmupCompleted.isEmpty()) {
                        q3be.onTransact(this.this$0);
                        return Unit.INSTANCE;
                    }
                    q3beVar2 = this.this$0;
                    List<File> list7 = this.$files;
                    Result.Companion companion3 = Result.Companion;
                    q3be.onTransact(q3beVar2);
                    q3be.onExtraCallbackWithResult(q3beVar2, list7, listOnWarmupCompleted.size());
                    this.L$0 = access15400.onNavigationEvent(list6);
                    this.L$1 = listOnWarmupCompleted;
                    this.L$2 = q3beVar2;
                    this.L$3 = list7;
                    this.L$4 = access15400.onNavigationEvent(this);
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.L$8 = null;
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 2;
                    int iOnExtraCallbackWithResult5 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult6 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                    Object objOnNavigationEvent = q3be.onNavigationEvent(-955595192, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{q3beVar2, listOnWarmupCompleted, this}, iOnExtraCallbackWithResult5, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult6, 955595197);
                    Object obj3 = objOnNavigationEvent;
                    if (objOnNavigationEvent != objOnWarmupCompleted) {
                        list2 = list7;
                        r4 = listOnWarmupCompleted;
                        int iOnExtraCallbackWithResult7 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                        int iOnExtraCallbackWithResult22 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                        ((q3bc) q3be.onNavigationEvent(-444116033, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{q3beVar2}, iOnExtraCallbackWithResult7, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult22, 444116036)).IAuthTabCallback(list2);
                        q3be.onExtraCallbackWithResult(q3beVar2).onExtraCallbackWithResult((List<? extends SecuritiesPerformanceLogBody>) r4);
                        obj2 = Result.constructor-impl(Unit.INSTANCE);
                        list = r4;
                        q3be q3beVar42 = this.this$0;
                        List<File> list52 = this.$files;
                        th = Result.exceptionOrNull-impl(obj2);
                        if (th != null) {
                        }
                        return Unit.INSTANCE;
                    }
                }
                return objOnWarmupCompleted;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0214, code lost:
        
            if (r0.onWarmupCompleted(r2, r14, r5, r33) == r10) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0169  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x01d3  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x01c6 -> B:21:0x01c9). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            long jOnExtraCallback;
            int size;
            Collection arrayList;
            Iterator it;
            Object obj2;
            int i;
            List list;
            List list2;
            q3a.IAuthTabCallback iAuthTabCallback;
            Object obj3;
            int i2;
            int i3 = 2 % 2;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                q3a.IAuthTabCallback iAuthTabCallbackOnWarmupCompleted = q3be.onExtraCallbackWithResult(q3be.this).onWarmupCompleted();
                List listOnWarmupCompleted = ((ComputeLandmarkConfidence.onNavigationEvent) ComputeLandmarkConfidence.onWarmupCompleted(438504145, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), new Object[]{(q3bc) q3be.onNavigationEvent(-444116033, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{q3be.this}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 444116036), 0L, 0L, 0, true, 7, null}, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -438504145)).onWarmupCompleted();
                List list3 = listOnWarmupCompleted;
                List listFlatten = CollectionsKt.flatten(list3);
                jOnExtraCallback = q3be.onExtraCallback(q3be.this, listFlatten, 0L, 1, null);
                size = listFlatten.size();
                q3be q3beVar = q3be.this;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    ArrayList arrayList3 = arrayList2;
                    arrayList3.add(maybeUpdateAnimatable.onExtraCallback(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult((List) it2.next(), q3beVar, iAuthTabCallbackOnWarmupCompleted, null), 3, (Object) null));
                    arrayList2 = arrayList3;
                    q3beVar = q3beVar;
                }
                ArrayList arrayList4 = arrayList2;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
                it = arrayList4.iterator();
                obj2 = arrayList4;
                i = 0;
                list = listFlatten;
                list2 = listOnWarmupCompleted;
                iAuthTabCallback = iAuthTabCallbackOnWarmupCompleted;
                obj3 = obj2;
                i2 = 0;
                Object obj4 = objOnWarmupCompleted;
                if (!(!it.hasNext())) {
                }
                return obj;
            }
            if (i4 != 1) {
                int i5 = onExtraCallback + 89;
                int i6 = i5 % 128;
                onWarmupCompleted = i6;
                int i7 = i5 % 2;
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i8 = i6 + 21;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                ResultKt.onNavigationEvent(obj);
                return Unit.INSTANCE;
            }
            int i10 = this.I$2;
            int i11 = this.I$1;
            int i12 = this.I$0;
            long j = this.J$0;
            arrayList = (Collection) this.L$10;
            it = (Iterator) this.L$7;
            Collection collection = (Collection) this.L$6;
            Object obj5 = (Iterable) this.L$5;
            obj3 = (Iterable) this.L$4;
            List list4 = (List) this.L$3;
            list2 = (List) this.L$2;
            q3a.IAuthTabCallback iAuthTabCallback2 = (q3a.IAuthTabCallback) this.L$1;
            ResultKt.onNavigationEvent(obj);
            long j2 = j;
            Object obj6 = objOnWarmupCompleted;
            obj2 = obj5;
            i = i10;
            iAuthTabCallback = iAuthTabCallback2;
            list = list4;
            size = i12;
            i2 = i11;
            arrayList.add(Unit.INSTANCE);
            objOnWarmupCompleted = obj6;
            arrayList = collection;
            jOnExtraCallback = j2;
            Object obj42 = objOnWarmupCompleted;
            if (!(!it.hasNext())) {
                int i13 = onExtraCallback + 23;
                onWarmupCompleted = i13 % 128;
                int i14 = i13 % 2;
                Object next = it.next();
                GeckoHubImp1 geckoHubImp1 = (GeckoHubImp1) next;
                this.L$0 = access15400.onNavigationEvent(findresandmsg);
                this.L$1 = iAuthTabCallback;
                this.L$2 = access15400.onNavigationEvent(list2);
                this.L$3 = access15400.onNavigationEvent(list);
                this.L$4 = access15400.onNavigationEvent(obj3);
                this.L$5 = access15400.onNavigationEvent(obj2);
                this.L$6 = arrayList;
                this.L$7 = it;
                this.L$8 = access15400.onNavigationEvent(next);
                this.L$9 = access15400.onNavigationEvent(geckoHubImp1);
                this.L$10 = arrayList;
                this.J$0 = jOnExtraCallback;
                this.I$0 = size;
                this.I$1 = i2;
                i = i;
                this.I$2 = i;
                this.I$3 = 0;
                this.label = 1;
                obj6 = obj42;
                if (geckoHubImp1.IAuthTabCallback(this) != obj6) {
                    j2 = jOnExtraCallback;
                    collection = arrayList;
                    arrayList.add(Unit.INSTANCE);
                    objOnWarmupCompleted = obj6;
                    arrayList = collection;
                    jOnExtraCallback = j2;
                    Object obj422 = objOnWarmupCompleted;
                    if (!(!it.hasNext())) {
                        obj6 = obj422;
                        q3a q3aVarOnExtraCallbackWithResult = q3be.onExtraCallbackWithResult(q3be.this);
                        this.L$0 = access15400.onNavigationEvent(findresandmsg);
                        this.L$1 = access15400.onNavigationEvent(iAuthTabCallback);
                        this.L$2 = access15400.onNavigationEvent(list2);
                        this.L$3 = access15400.onNavigationEvent(list);
                        this.L$4 = null;
                        this.L$5 = null;
                        this.L$6 = null;
                        this.L$7 = null;
                        this.L$8 = null;
                        this.L$9 = null;
                        this.L$10 = null;
                        this.J$0 = jOnExtraCallback;
                        this.I$0 = size;
                        this.label = 2;
                    }
                }
            }
            return obj6;
        }
    }

    static /* synthetic */ Object onExtraCallbackWithResult(q3be q3beVar, SecuritiesPerformanceLogBody securitiesPerformanceLogBody, boolean z, access13800 access13800Var, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback;
        int i4 = i3 + 13;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 2) != 0) {
            int i6 = i3 + 67;
            access000 = i6 % 128;
            z = i6 % 2 == 0;
            int i7 = i3 + 27;
            access000 = i7 % 128;
            int i8 = i7 % 2;
        }
        return q3beVar.onExtraCallback(securitiesPerformanceLogBody, z, (access13800<? super Unit>) access13800Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onExtraCallback(SecuritiesPerformanceLogBody securitiesPerformanceLogBody, boolean z, access13800<? super Unit> access13800Var) {
        asInterface asinterface;
        int i = 2 % 2;
        int i2 = access000 + 13;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        if (access13800Var instanceof asInterface) {
            asinterface = (asInterface) access13800Var;
            int i4 = asinterface.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = access000 + 103;
                ICustomTabsCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    asinterface.label = i4 - 2147483648;
                } else {
                    asinterface.label = i4 - 2147483648;
                }
                int i6 = ICustomTabsCallback + 113;
                access000 = i6 % 128;
                int i7 = i6 % 2;
            } else {
                asinterface = new asInterface(access13800Var);
            }
        }
        Object obj = asinterface.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i8 = asinterface.label;
        if (i8 == 0) {
            ResultKt.onNavigationEvent(obj);
            this.IAuthTabCallbackStub.onNavigationEvent(securitiesPerformanceLogBody);
            if (!z) {
                securitiesPerformanceLogBody.onWarmupCompleted();
                securitiesPerformanceLogBody.getClass().getSimpleName();
                return Unit.INSTANCE;
            }
            int iIncrementAndGet = this.asBinder.incrementAndGet();
            securitiesPerformanceLogBody.onWarmupCompleted();
            securitiesPerformanceLogBody.getClass().getSimpleName();
            if (iIncrementAndGet >= 500) {
                getBorderRadius<Unit> getborderradius = this.getInterfaceDescriptor;
                Unit unit = Unit.INSTANCE;
                asinterface.L$0 = access15400.onNavigationEvent(securitiesPerformanceLogBody);
                asinterface.Z$0 = z;
                asinterface.I$0 = iIncrementAndGet;
                asinterface.label = 1;
                if (getborderradius.emit(unit, asinterface) == objOnWarmupCompleted) {
                    int i9 = ICustomTabsCallback + 11;
                    access000 = i9 % 128;
                    int i10 = i9 % 2;
                    return objOnWarmupCompleted;
                }
            }
            return Unit.INSTANCE;
        }
        int i11 = access000 + 85;
        ICustomTabsCallback = i11 % 128;
        if (i11 % 2 != 0 ? i8 != 1 : i8 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.onNavigationEvent(obj);
        this.asBinder.set(0);
        return Unit.INSTANCE;
    }

    @Override // o.q4ExternalSyntheticLambda5
    public getPackageType IAuthTabCallback(@NotNull q4ExternalSyntheticLambda4 q4externalsyntheticlambda4) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 71;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(q4externalsyntheticlambda4, "");
        if (!(!onWarmupCompleted())) {
            return this.onTransact.IAuthTabCallback(q4externalsyntheticlambda4);
        }
        this.onExtraCallbackWithResult.onNavigationEvent();
        int i4 = ICustomTabsCallback + 95;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 45 / 0;
        }
        return null;
    }

    private final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = access000 + 121;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = responseBodyComplete.onExtraCallback.onNavigationEvent();
        int i4 = ICustomTabsCallback + 99;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        q3be q3beVar = (q3be) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 111;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        if (!q3beVar.access100.getLifecycle().IAuthTabCallback().isAtLeast(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED)) {
            return "background";
        }
        int i4 = access000 + 37;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 59 / 0;
        }
        return "foreground";
    }

    private final String onExtraCallback(List<? extends File> list, int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 105;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        List<? extends File> list2 = list;
        Iterator<T> it = list2.iterator();
        int i5 = ICustomTabsCallback + 109;
        access000 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 5 % 3;
        }
        long length = 0;
        while (!(!it.hasNext())) {
            length += ((File) it.next()).length();
        }
        String strJoinToString$default = CollectionsKt.joinToString$default(list2, ",", (CharSequence) null, (CharSequence) null, 20, ",...", new Function1() { // from class: im.toss.securities.libs.performance.tracker.data.SecuritiesPerformanceTracker$$ExternalSyntheticLambda2
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i7 = 2 % 2;
                int i8 = onWarmupCompleted + 113;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                CharSequence charSequenceIAuthTabCallback = q3be.IAuthTabCallback((File) obj);
                if (i9 == 0) {
                    int i10 = 84 / 0;
                }
                int i11 = onNavigationEvent + 49;
                onWarmupCompleted = i11 % 128;
                if (i11 % 2 == 0) {
                    return charSequenceIAuthTabCallback;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }, 6, (Object) null);
        String str = "send performance log api fileCount=" + list.size() + ", logItemCount=" + i + ", totalFileBytes=" + length + ", fileSizes=[" + strJoinToString$default + "]";
        int i7 = ICustomTabsCallback + 111;
        access000 = i7 % 128;
        if (i7 % 2 == 0) {
            return str;
        }
        throw null;
    }

    static /* synthetic */ long onExtraCallback(q3be q3beVar, List list, long j, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = access000 + 103;
        int i4 = i3 % 128;
        ICustomTabsCallback = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 53;
            access000 = i6 % 128;
            int i7 = i6 % 2;
            j = System.currentTimeMillis();
            if (i7 != 0) {
                int i8 = 36 / 0;
            }
        }
        long jOnNavigationEvent = q3beVar.onNavigationEvent((List<? extends File>) list, j);
        int i9 = ICustomTabsCallback + 87;
        access000 = i9 % 128;
        int i10 = i9 % 2;
        return jOnNavigationEvent;
    }

    private final long onNavigationEvent(List<? extends File> list, long j) {
        int i = 2 % 2;
        List<? extends File> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (!(!it.hasNext())) {
            arrayList.add(Long.valueOf(((File) it.next()).lastModified()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            int i2 = access000 + 103;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            if (((Number) obj).longValue() > 0) {
                int i4 = access000 + 27;
                ICustomTabsCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    arrayList2.add(obj);
                    throw null;
                }
                arrayList2.add(obj);
                int i5 = ICustomTabsCallback + 63;
                access000 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 4 / 3;
                }
            }
        }
        Long l = (Long) CollectionsKt.minOrNull(arrayList2);
        if (l == null) {
            return 0L;
        }
        int i7 = ICustomTabsCallback + 107;
        access000 = i7 % 128;
        return RangesKt.coerceAtLeast(i7 % 2 != 0 ? j / l.longValue() : j - l.longValue(), 0L);
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super SecuritiesPerformanceLogBody>, Object> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ File $file;
        int label;
        final /* synthetic */ q3be this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(File file, q3be q3beVar, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$file = file;
            this.this$0 = q3beVar;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$file, this.this$0, access13800Var);
            int i2 = onNavigationEvent + 123;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return onextracallbackwithresult;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 29;
            onWarmupCompleted = i2 % 128;
            Object obj3 = null;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super SecuritiesPerformanceLogBody> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onNavigationEvent(findresandmsg, access13800Var);
                obj3.hashCode();
                throw null;
            }
            Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
            int i3 = onWarmupCompleted + 21;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return objOnNavigationEvent;
            }
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super SecuritiesPerformanceLogBody> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 105;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresultCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return onextracallbackwithresultCreate.invokeSuspend(unit);
            }
            onextracallbackwithresultCreate.invokeSuspend(unit);
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 41;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            try {
                FileInputStream fileInputStream = new FileInputStream(this.$file);
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, Charsets.UTF_8), 8192);
                    try {
                        String text = TextStreamsKt.readText(bufferedReader);
                        CloseableKt.closeFinally(bufferedReader, (Throwable) null);
                        wie2 wie2VarIAuthTabCallback = checkValidYaw.IAuthTabCallback();
                        wie2VarIAuthTabCallback.onExtraCallback();
                        SecuritiesPerformanceLogBody securitiesPerformanceLogBody = (SecuritiesPerformanceLogBody) wie2VarIAuthTabCallback.onExtraCallback(SecuritiesPerformanceLogBody.Companion.serializer(), text);
                        CloseableKt.closeFinally(fileInputStream, (Throwable) null);
                        return securitiesPerformanceLogBody;
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable unused) {
                Object[] objArr = {q3be.onExtraCallbackWithResult(this.this$0)};
                q3a.onWarmupCompleted(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), 889239744, objArr, C40Encoder.onExtraCallback(), -889239743, C40Encoder.onExtraCallback());
                q3be.onTransact(this.this$0);
                this.$file.getName();
                int i4 = onWarmupCompleted + 51;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 96 / 0;
                }
                return null;
            }
        }
    }

    private final Object IAuthTabCallback(File file, access13800<? super SecuritiesPerformanceLogBody> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new onExtraCallbackWithResult(file, this, null), access13800Var);
        int i2 = ICustomTabsCallback + 3;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        return objOnExtraCallback;
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws NoWhenBranchMatchedException {
        IAuthTabCallbackDefault iAuthTabCallbackDefault;
        q3be q3beVar = (q3be) objArr[0];
        List list = (List) objArr[1];
        IAuthTabCallbackDefault iAuthTabCallbackDefault2 = (access13800) objArr[2];
        int i = 2 % 2;
        if (iAuthTabCallbackDefault2 instanceof IAuthTabCallbackDefault) {
            iAuthTabCallbackDefault = iAuthTabCallbackDefault2;
            int i2 = iAuthTabCallbackDefault.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = access000 + 67;
                ICustomTabsCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    iAuthTabCallbackDefault.label = i2 >>> Integer.MIN_VALUE;
                } else {
                    iAuthTabCallbackDefault.label = i2 - 2147483648;
                }
            } else {
                iAuthTabCallbackDefault = q3beVar.new IAuthTabCallbackDefault(iAuthTabCallbackDefault2);
            }
        }
        Object objOnExtraCallback = iAuthTabCallbackDefault.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i4 = iAuthTabCallbackDefault.label;
        if (i4 != 0) {
            int i5 = ICustomTabsCallback + 51;
            access000 = i5 % 128;
            int i6 = i5 % 2;
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objOnExtraCallback);
        } else {
            ResultKt.onNavigationEvent(objOnExtraCallback);
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                SecuritiesPerformanceLogRequestBody securitiesPerformanceLogRequestBodyOnNavigationEvent = r8lambdaGfTbFYq8cBYIuyKHm6h7tgfenk.onNavigationEvent((SecuritiesPerformanceLogBody) it.next());
                if (securitiesPerformanceLogRequestBodyOnNavigationEvent != null) {
                    arrayList.add(securitiesPerformanceLogRequestBodyOnNavigationEvent);
                }
            }
            Object obj = null;
            if (!(!arrayList.isEmpty())) {
                int i7 = ICustomTabsCallback + 81;
                access000 = i7 % 128;
                if (i7 % 2 == 0) {
                    AppSetIdAndScope1 appSetIdAndScope1 = q3beVar.IAuthTabCallbackDefault;
                    return Unit.INSTANCE;
                }
                AppSetIdAndScope1 appSetIdAndScope12 = q3beVar.IAuthTabCallbackDefault;
                Unit unit = Unit.INSTANCE;
                obj.hashCode();
                throw null;
            }
            GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
            onTransact ontransact = new onTransact(null, q3beVar, arrayList);
            iAuthTabCallbackDefault.L$0 = access15400.onNavigationEvent(list);
            iAuthTabCallbackDefault.L$1 = access15400.onNavigationEvent(arrayList);
            iAuthTabCallbackDefault.I$0 = 0;
            iAuthTabCallbackDefault.label = 1;
            objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, ontransact, iAuthTabCallbackDefault);
            if (objOnExtraCallback == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        }
        ((Result) objOnExtraCallback).onNavigationEvent();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ DeviceOption onExtraCallback(q3be q3beVar) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (DeviceOption) onNavigationEvent(32904597, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{q3beVar}, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, -32904595);
    }

    public static final /* synthetic */ q3bc asInterface(q3be q3beVar) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (q3bc) onNavigationEvent(-444116033, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{q3beVar}, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 444116036);
    }

    public static final /* synthetic */ Object IAuthTabCallback(q3be q3beVar, List list, access13800 access13800Var) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return onNavigationEvent(-955595192, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{q3beVar, list, access13800Var}, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 955595197);
    }

    private final String onExtraCallback() {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (String) onNavigationEvent(1791305796, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{this}, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, -1791305796);
    }

    private final Object onExtraCallback(List<? extends SecuritiesPerformanceLogBody> list, access13800<? super Unit> access13800Var) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return onNavigationEvent(997480206, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{this, list, access13800Var}, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, -997480202);
    }

    private static final CharSequence onNavigationEvent(File file) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (CharSequence) onNavigationEvent(-1431790719, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{file}, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 1431790720);
    }

    static void onExtraCallbackWithResult() {
        IAuthTabCallbackStubProxy = 478309030;
    }
}
