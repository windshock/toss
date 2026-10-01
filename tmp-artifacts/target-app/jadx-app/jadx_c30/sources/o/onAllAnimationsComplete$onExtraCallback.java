package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.react.viewmanagers.RNSScreenManagerDelegate;
import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import o.getPackageType;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.jmrtd.lds.CVCAFile;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class onAllAnimationsComplete$onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    final /* synthetic */ setTopGuideBackgroundColor $callbackProxy;
    final /* synthetic */ Function0<Unit> $onDisconnect;
    final /* synthetic */ Function1<String, Unit> $onError;
    final /* synthetic */ Function1<String, Unit> $onMessage;
    final /* synthetic */ long $timeout;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ onAllAnimationsComplete this$0;
    private static final byte[] $$a = {5, 64, Byte.MAX_VALUE, 81};
    private static final int $$b = 248;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private static int onExtraCallback = 478309099;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, int i) {
        int i2;
        int i3;
        int i4 = (i * 4) + 4;
        int i5 = 105 - (s * 4);
        int i6 = b * 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i6 + 1];
        if (bArr == null) {
            int i7 = i6;
            i3 = i4;
            i2 = 0;
            i4 += i7;
            i3++;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            i2++;
            i7 = bArr[i3];
            i4 += i7;
            i3++;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            i4 = i5;
            i3 = i4;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    onAllAnimationsComplete$onExtraCallback(Function1<? super String, Unit> function1, onAllAnimationsComplete onallanimationscomplete, setTopGuideBackgroundColor settopguidebackgroundcolor, Function0<Unit> function0, long j, Function1<? super String, Unit> function12, access13800<? super onAllAnimationsComplete$onExtraCallback> access13800Var) {
        super(2, access13800Var);
        this.$onError = function1;
        this.this$0 = onallanimationscomplete;
        this.$callbackProxy = settopguidebackgroundcolor;
        this.$onDisconnect = function0;
        this.$timeout = j;
        this.$onMessage = function12;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        onAllAnimationsComplete$onExtraCallback onallanimationscomplete_onextracallback = new onAllAnimationsComplete$onExtraCallback(this.$onError, this.this$0, this.$callbackProxy, this.$onDisconnect, this.$timeout, this.$onMessage, access13800Var);
        onallanimationscomplete_onextracallback.L$0 = obj;
        int i2 = onWarmupCompleted + 37;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return onallanimationscomplete_onextracallback;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        onExtraCallbackWithResult = i2 % 128;
        findResAndMsg findresandmsg = (findResAndMsg) obj;
        access13800<? super Unit> access13800Var = (access13800) obj2;
        if (i2 % 2 != 0) {
            onWarmupCompleted(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
        int i3 = onExtraCallbackWithResult + 99;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return objOnWarmupCompleted;
    }

    public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
        Object objInvokeSuspend;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onAllAnimationsComplete$onExtraCallback onallanimationscomplete_onextracallbackCreate = create(findresandmsg, access13800Var);
        if (i3 != 0) {
            objInvokeSuspend = onallanimationscomplete_onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = 37 / 0;
        } else {
            objInvokeSuspend = onallanimationscomplete_onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
        }
        int i5 = onExtraCallbackWithResult + 29;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return objInvokeSuspend;
    }

    /* renamed from: o.onAllAnimationsComplete$onExtraCallback$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        private static int[] onWarmupCompleted = {1538834783, -514707810, -932394515, -1250539953, -555094610, -1145857526, -2062538753, -1442630016, -1869088608, 1107293291, -791865489, -1302637900, -170503724, -1002961539, 1628922112, -2045031095, -1800977120, -171901618};
        final /* synthetic */ setTopGuideBackgroundColor $callbackProxy;
        final /* synthetic */ Function0<Unit> $onDisconnect;
        final /* synthetic */ Function1<String, Unit> $onError;
        final /* synthetic */ long $timeout;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ onAllAnimationsComplete this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(onAllAnimationsComplete onallanimationscomplete, Function1<? super String, Unit> function1, setTopGuideBackgroundColor settopguidebackgroundcolor, Function0<Unit> function0, long j, access13800<? super AnonymousClass2> access13800Var) {
            super(2, access13800Var);
            this.this$0 = onallanimationscomplete;
            this.$onError = function1;
            this.$callbackProxy = settopguidebackgroundcolor;
            this.$onDisconnect = function0;
            this.$timeout = j;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$onError, this.$callbackProxy, this.$onDisconnect, this.$timeout, access13800Var);
            anonymousClass2.L$0 = obj;
            int i2 = onExtraCallbackWithResult + 17;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return anonymousClass2;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 89;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onExtraCallback(findresandmsg, access13800Var);
            }
            Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
            int i3 = 44 / 0;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 117;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            AnonymousClass2 anonymousClass2Create = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                anonymousClass2Create.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
            Object objInvokeSuspend = anonymousClass2Create.invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 123;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 91 / 0;
            }
            return objInvokeSuspend;
        }

        /* renamed from: o.onAllAnimationsComplete$onExtraCallback$2$4, reason: invalid class name */
        static final class AnonymousClass4<T> implements setRipple {
            private static short[] IAuthTabCallback_Parcel;
            final /* synthetic */ findResAndMsg IAuthTabCallback;
            final /* synthetic */ onAllAnimationsComplete IAuthTabCallbackDefault;
            final /* synthetic */ long onExtraCallback;
            final /* synthetic */ Function1<String, Unit> onExtraCallbackWithResult;
            final /* synthetic */ setTopGuideBackgroundColor onNavigationEvent;
            final /* synthetic */ Function0<Unit> onWarmupCompleted;
            private static final byte[] $$a = {CVCAFile.CAR_TAG, ISO7816.INS_UPDATE_BINARY, -1, 80};
            private static final int $$b = 188;
            private static int $10 = 0;
            private static int $11 = 1;
            private static int getInterfaceDescriptor = 0;
            private static int access000 = 1;
            private static int asBinder = 2073840726;
            private static int onTransact = -1538795473;
            private static int asInterface = 702173063;
            private static byte[] IAuthTabCallbackStub = {-1, 13, -3, -9, ISO7816.INS_ERASE_BINARY, -11, 11, 4, 75, ISO7816.INS_READ_BINARY, -4, 3, -6, 95, -15, ISO7816.INS_GET_DATA, -14, -12, -15, 0, 13, 74, 15, ISO7816.INS_READ_RECORD2, -5, 11, 1, 9, 11, 74, -15, ISO7816.INS_GET_DATA, -16, -16, 10, 6, -5, 67, 15, -71, -13, 92, PSSSigner.TRAILER_IMPLICIT, 8, 3, -10, -9, -15, 2, 9, -26, 2, 13, -19, 18, -6, 8, 8, 8};

            /* renamed from: o.onAllAnimationsComplete$onExtraCallback$2$4$onExtraCallback */
            public static final /* synthetic */ class onExtraCallback {
                public static final /* synthetic */ int[] onExtraCallbackWithResult;
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                static {
                    int[] iArr = new int[r8lambdaA5Zp75IKKiAgPpucG5r12wvqGgo.values().length];
                    try {
                        iArr[r8lambdaA5Zp75IKKiAgPpucG5r12wvqGgo.RAW.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[r8lambdaA5Zp75IKKiAgPpucG5r12wvqGgo.CONNECTING.ordinal()] = 2;
                        int i = onNavigationEvent + 61;
                        onWarmupCompleted = i % 128;
                        int i2 = i % 2;
                        int i3 = 2 % 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[r8lambdaA5Zp75IKKiAgPpucG5r12wvqGgo.OPEN.ordinal()] = 3;
                        int i4 = onWarmupCompleted + 115;
                        onNavigationEvent = i4 % 128;
                        if (i4 % 2 != 0) {
                            int i5 = 2 % 2;
                        }
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[r8lambdaA5Zp75IKKiAgPpucG5r12wvqGgo.CLOSED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    onExtraCallbackWithResult = iArr;
                }
            }

            /* renamed from: o.onAllAnimationsComplete$onExtraCallback$2$4$onWarmupCompleted */
            static final class onWarmupCompleted extends ContinuationImpl {
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;
                Object L$0;
                int label;
                /* synthetic */ Object result;
                final /* synthetic */ AnonymousClass4<T> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                onWarmupCompleted(AnonymousClass4<? super T> anonymousClass4, access13800<? super onWarmupCompleted> access13800Var) {
                    super(access13800Var);
                    this.this$0 = anonymousClass4;
                }

                public final Object invokeSuspend(Object obj) throws Throwable {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 91;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    this.result = obj;
                    this.label |= PKIFailureInfo.systemUnavail;
                    AnonymousClass4<T> anonymousClass4 = this.this$0;
                    if (i3 != 0) {
                        return anonymousClass4.onExtraCallback(null, this);
                    }
                    anonymousClass4.onExtraCallback(null, this);
                    throw null;
                }
            }

            private static String $$c(byte b, int i, int i2) {
                int i3 = i * 3;
                byte[] bArr = $$a;
                int i4 = 115 - (b * 4);
                int i5 = i2 + 4;
                byte[] bArr2 = new byte[i3 + 1];
                int i6 = -1;
                if (bArr == null) {
                    i4 += -i5;
                    i5 = i5;
                    i6 = -1;
                }
                while (true) {
                    int i7 = i5 + 1;
                    int i8 = i6 + 1;
                    bArr2[i8] = (byte) i4;
                    if (i8 == i3) {
                        return new String(bArr2, 0);
                    }
                    i4 += -bArr[i7];
                    i5 = i7;
                    i6 = i8;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass4(onAllAnimationsComplete onallanimationscomplete, Function1<? super String, Unit> function1, findResAndMsg findresandmsg, setTopGuideBackgroundColor settopguidebackgroundcolor, Function0<Unit> function0, long j) {
                this.IAuthTabCallbackDefault = onallanimationscomplete;
                this.onExtraCallbackWithResult = function1;
                this.IAuthTabCallback = findresandmsg;
                this.onNavigationEvent = settopguidebackgroundcolor;
                this.onWarmupCompleted = function0;
                this.onExtraCallback = j;
            }

            public /* synthetic */ Object emit(Object obj, access13800 access13800Var) throws Throwable {
                int i = 2 % 2;
                int i2 = access000 + 123;
                getInterfaceDescriptor = i2 % 128;
                r8lambdaA5Zp75IKKiAgPpucG5r12wvqGgo r8lambdaa5zp75ikkiagppucg5r12wvqggo = (r8lambdaA5Zp75IKKiAgPpucG5r12wvqGgo) obj;
                if (i2 % 2 != 0) {
                    onExtraCallback(r8lambdaa5zp75ikkiagppucg5r12wvqggo, access13800Var);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Object objOnExtraCallback = onExtraCallback(r8lambdaa5zp75ikkiagppucg5r12wvqggo, access13800Var);
                int i3 = access000 + 85;
                getInterfaceDescriptor = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 13 / 0;
                }
                return objOnExtraCallback;
            }

            /* renamed from: o.onAllAnimationsComplete$onExtraCallback$2$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
                private static int $10 = 0;
                private static int $11 = 1;
                private static char IAuthTabCallback = 51177;
                private static int IAuthTabCallbackDefault = 1;
                private static int onExtraCallback = 0;
                private static char onExtraCallbackWithResult = 7137;
                private static char onNavigationEvent = 6396;
                private static char onWarmupCompleted = 39353;
                final /* synthetic */ Function1<String, Unit> $onError;
                final /* synthetic */ long $timeout;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(long j, Function1<? super String, Unit> function1, access13800<? super AnonymousClass1> access13800Var) {
                    super(2, access13800Var);
                    this.$timeout = j;
                    this.$onError = function1;
                }

                public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                    int i = 2 % 2;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$timeout, this.$onError, access13800Var);
                    int i2 = IAuthTabCallbackDefault + 99;
                    onExtraCallback = i2 % 128;
                    if (i2 % 2 == 0) {
                        return anonymousClass1;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }

                public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 63;
                    IAuthTabCallbackDefault = i2 % 128;
                    int i3 = i2 % 2;
                    Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
                    int i4 = onExtraCallback + 91;
                    IAuthTabCallbackDefault = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 16 / 0;
                    }
                    return objOnExtraCallbackWithResult;
                }

                public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallbackDefault + 5;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                    int i4 = IAuthTabCallbackDefault + 49;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return objInvokeSuspend;
                }

                public final Object invokeSuspend(Object obj) throws Throwable {
                    int i = 2 % 2;
                    Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                    int i2 = this.label;
                    if (i2 != 0) {
                        int i3 = IAuthTabCallbackDefault;
                        int i4 = i3 + 63;
                        onExtraCallback = i4 % 128;
                        int i5 = i4 % 2;
                        if (i2 != 1) {
                            Object[] objArr = new Object[1];
                            a(new char[]{46542, 59688, 8311, 33403, 45822, 40974, 40623, 51748, 22944, 65277, 62459, 3903, 36677, 38287, 21955, 25266, 7020, 37392, 12607, 14492, 59394, 24152, 56801, 58986, 27527, 30369, 3507, 18605, 52020, 34678, 21955, 25266, 9615, 45332, 10512, 31519, 20479, 52713, 4813, 56892, 40433, 14525, 48459, 2633, 40049, 6734, 1032, 8037}, (ViewConfiguration.getLongPressTimeout() >> 16) + 47, objArr);
                            throw new IllegalStateException(((String) objArr[0]).intern());
                        }
                        int i6 = i3 + 69;
                        onExtraCallback = i6 % 128;
                        int i7 = i6 % 2;
                        ResultKt.onNavigationEvent(obj);
                    } else {
                        ResultKt.onNavigationEvent(obj);
                        long j = this.$timeout;
                        this.label = 1;
                        if (formatMsgs.onWarmupCompleted(j, this) == objOnWarmupCompleted) {
                            int i8 = IAuthTabCallbackDefault + 15;
                            onExtraCallback = i8 % 128;
                            if (i8 % 2 == 0) {
                                return objOnWarmupCompleted;
                            }
                            throw null;
                        }
                    }
                    Function1<String, Unit> function1 = this.$onError;
                    Object[] objArr2 = new Object[1];
                    a(new char[]{43183, 6199, 36295, 13345, 20018, 31658, 22319, 9999, 2724, 10749, 13903, 63726, 53686, 570, 5810, 10875, 64945, 40959}, (ViewConfiguration.getLongPressTimeout() >> 16) + 18, objArr2);
                    function1.invoke(((String) objArr2[0]).intern());
                    return Unit.INSTANCE;
                }

                private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
                    int i2 = 2 % 2;
                    DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
                    char[] cArr2 = new char[cArr.length];
                    int i3 = 0;
                    defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
                    char[] cArr3 = new char[2];
                    while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
                        int i4 = $10 + 71;
                        $11 = i4 % 128;
                        int i5 = i4 % 2;
                        cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                        cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                        int i6 = 58224;
                        int i7 = i3;
                        while (i7 < 16) {
                            int i8 = $10 + 17;
                            $11 = i8 % 128;
                            int i9 = i8 % 2;
                            char c = cArr3[1];
                            char c2 = cArr3[i3];
                            int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)));
                            int i11 = c2 >>> 5;
                            try {
                                Object[] objArr2 = new Object[4];
                                objArr2[3] = Integer.valueOf(onWarmupCompleted);
                                objArr2[2] = Integer.valueOf(i11);
                                objArr2[1] = Integer.valueOf(i10);
                                objArr2[i3] = Integer.valueOf(c);
                                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                                if (objOnExtraCallback == null) {
                                    char deadChar = (char) KeyEvent.getDeadChar(i3, i3);
                                    int absoluteGravity = Gravity.getAbsoluteGravity(i3, i3) + 10;
                                    int mirror = AndroidCharacter.getMirror('0') + 12386;
                                    Class[] clsArr = new Class[4];
                                    clsArr[i3] = Integer.TYPE;
                                    clsArr[1] = Integer.TYPE;
                                    clsArr[2] = Integer.TYPE;
                                    clsArr[3] = Integer.TYPE;
                                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(deadChar, absoluteGravity, mirror, -787580090, false, "C", clsArr);
                                }
                                char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                                cArr3[1] = cCharValue;
                                char[] cArr4 = cArr3;
                                Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallbackWithResult)};
                                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                                if (objOnExtraCallback2 == null) {
                                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> 16), Color.argb(0, 0, 0, 0) + 10, 12434 - (ViewConfiguration.getJumpTapTimeout() >> 16), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                                }
                                cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                                i6 -= 40503;
                                i7++;
                                cArr3 = cArr4;
                                i3 = 0;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        char[] cArr5 = cArr3;
                        cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
                        cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 14 - View.resolveSizeAndState(0, 0, 0), ExpandableListView.getPackedPositionChild(0L) + 19902, -1250968944, false, "B", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        cArr3 = cArr5;
                        i3 = 0;
                    }
                    objArr[0] = new String(cArr2, 0, i);
                }
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object onExtraCallback(r8lambdaA5Zp75IKKiAgPpucG5r12wvqGgo r8lambdaa5zp75ikkiagppucg5r12wvqggo, access13800<? super Unit> access13800Var) throws Throwable {
                onWarmupCompleted onwarmupcompleted;
                int i = 2 % 2;
                if (access13800Var instanceof onWarmupCompleted) {
                    onwarmupcompleted = (onWarmupCompleted) access13800Var;
                    int i2 = onwarmupcompleted.label;
                    if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                        int i3 = access000 + 123;
                        getInterfaceDescriptor = i3 % 128;
                        int i4 = i3 % 2;
                        onwarmupcompleted.label = i2 + PKIFailureInfo.systemUnavail;
                    } else {
                        onwarmupcompleted = new onWarmupCompleted(this, access13800Var);
                    }
                }
                Object objOnExtraCallback = onwarmupcompleted.result;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i5 = onwarmupcompleted.label;
                if (i5 == 0) {
                    ResultKt.onNavigationEvent(objOnExtraCallback);
                    int i6 = onExtraCallback.onExtraCallbackWithResult[r8lambdaa5zp75ikkiagppucg5r12wvqggo.ordinal()];
                    if (i6 != 1) {
                        Object obj = null;
                        if (i6 == 2) {
                            onAllAnimationsComplete.onExtraCallback(this.IAuthTabCallbackDefault, maybeUpdateAnimatable.onNavigationEvent(this.IAuthTabCallback, (CoroutineContext) null, (setRandomHost) null, new AnonymousClass1(this.onExtraCallback, this.onExtraCallbackWithResult, null), 3, (Object) null));
                        } else if (i6 != 3) {
                            int i7 = access000 + 61;
                            int i8 = i7 % 128;
                            getInterfaceDescriptor = i8;
                            int i9 = i7 % 2;
                            if (i6 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            int i10 = i8 + 49;
                            access000 = i10 % 128;
                            if (i10 % 2 == 0) {
                                this.onWarmupCompleted.invoke();
                                obj.hashCode();
                                throw null;
                            }
                            this.onWarmupCompleted.invoke();
                        } else {
                            setOnOutOfMemeryErrorCallback.onExtraCallback(this.onNavigationEvent, (Function1) null, 1, (Object) null);
                            getPackageType getpackagetype = (getPackageType) onAllAnimationsComplete.onWarmupCompleted(new Object[]{this.IAuthTabCallbackDefault}, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), 231513749, RNSScreenManagerDelegate.onNavigationEvent(), -231513748);
                            if (getpackagetype != null) {
                                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    r8lambdaQgh8MloFePY032fLEU28OXtOsU r8lambdaqgh8mlofepy032fleu28oxtosuOnExtraCallback = onAllAnimationsComplete.onExtraCallback(this.IAuthTabCallbackDefault);
                    onwarmupcompleted.L$0 = access15400.onNavigationEvent(r8lambdaa5zp75ikkiagppucg5r12wvqggo);
                    onwarmupcompleted.label = 1;
                    objOnExtraCallback = r8lambdaqgh8mlofepy032fleu28oxtosuOnExtraCallback.onExtraCallback(onwarmupcompleted);
                    if (objOnExtraCallback == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i5 != 1) {
                        Object[] objArr = new Object[1];
                        a((short) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), (byte) TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0), 539257762 - TextUtils.getTrimmedLength(BuildConfig.FLAVOR), Drawable.resolveOpacity(0, 0) + 1919051988, ((byte) KeyEvent.getModifierMetaStateMask()) + 9, objArr);
                        throw new IllegalStateException(((String) objArr[0]).intern());
                    }
                    ResultKt.onNavigationEvent(objOnExtraCallback);
                }
                if (!((Boolean) objOnExtraCallback).booleanValue()) {
                    int i11 = getInterfaceDescriptor + 101;
                    access000 = i11 % 128;
                    int i12 = i11 % 2;
                    Function1<String, Unit> function1 = this.onExtraCallbackWithResult;
                    Object[] objArr2 = new Object[1];
                    a((short) (ViewConfiguration.getScrollDefaultDelay() >> 16), (byte) KeyEvent.normalizeMetaState(0), ImageFormat.getBitsPerPixel(0) + 539257809, 1919051972 - (ViewConfiguration.getFadingEdgeLength() >> 16), View.resolveSize(0, 0) - 27, objArr2);
                    function1.invoke(((String) objArr2[0]).intern());
                }
                return Unit.INSTANCE;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0088 A[PHI: r4
              0x0088: PHI (r4v9 byte[] A[IMMUTABLE_TYPE]) = (r4v8 byte[]), (r4v21 byte[]) binds: [B:18:0x0086, B:15:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:31:0x010f A[PHI: r4
              0x010f: PHI (r4v20 byte[]) = (r4v8 byte[]), (r4v21 byte[]) binds: [B:18:0x0086, B:15:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
                boolean z;
                char c;
                int i4;
                byte[] bArr;
                int i5;
                char c2 = 2;
                int i6 = 2 % 2;
                TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
                StringBuilder sb = new StringBuilder();
                try {
                    Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onTransact)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 42, 22440 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    int i7 = iIntValue == -1 ? 1 : 0;
                    if (i7 != 0) {
                        int i8 = $11 + 125;
                        $10 = i8 % 128;
                        if (i8 % 2 != 0) {
                            bArr = IAuthTabCallbackStub;
                            int i9 = 46 / 0;
                            if (bArr != null) {
                                int length = bArr.length;
                                byte[] bArr2 = new byte[length];
                                int i10 = 0;
                                while (i10 < length) {
                                    int i11 = $10 + 87;
                                    $11 = i11 % 128;
                                    int i12 = i11 % 2;
                                    Object[] objArr3 = {Integer.valueOf(bArr[i10])};
                                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                                    if (objOnExtraCallback2 == null) {
                                        char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 12843);
                                        int iRed = Color.red(0) + 55;
                                        int touchSlop = 2167 - (ViewConfiguration.getTouchSlop() >> 8);
                                        byte b2 = $$a[c2];
                                        byte b3 = (byte) (b2 + 1);
                                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(jumpTapTimeout, iRed, touchSlop, -299036574, false, $$c(b3, b3, b2), new Class[]{Integer.TYPE});
                                    }
                                    bArr2[i10] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                                    i10++;
                                    c2 = 2;
                                }
                                int i13 = $11 + 121;
                                $10 = i13 % 128;
                                i5 = 2;
                                if (i13 % 2 != 0) {
                                    int i14 = 4 % 4;
                                }
                                bArr = bArr2;
                            } else {
                                i5 = 2;
                            }
                        } else {
                            bArr = IAuthTabCallbackStub;
                            if (bArr != null) {
                            }
                        }
                        if (bArr != null) {
                            byte[] bArr3 = IAuthTabCallbackStub;
                            Object[] objArr4 = new Object[i5];
                            objArr4[1] = Integer.valueOf(asBinder);
                            objArr4[0] = Integer.valueOf(i);
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - KeyEvent.normalizeMetaState(0)), AndroidCharacter.getMirror('0') - 6, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 22438, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onTransact ^ (-4629411779493505016L))));
                            int i15 = $11 + 31;
                            $10 = i15 % 128;
                            int i16 = i15 % 2;
                        } else {
                            iIntValue = (short) (((short) (IAuthTabCallback_Parcel[i + ((int) (asBinder ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onTransact ^ (-4629411779493505016L))));
                        }
                    }
                    if (iIntValue > 0) {
                        int i17 = $10 + 49;
                        $11 = i17 % 128;
                        int i18 = i17 % 2;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (asBinder ^ (-4629411779493505016L))) + i7;
                        try {
                            Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(asInterface), sb};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 86, Gravity.getAbsoluteGravity(0, 0) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                            }
                            ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                            byte[] bArr4 = IAuthTabCallbackStub;
                            if (bArr4 != null) {
                                int length2 = bArr4.length;
                                byte[] bArr5 = new byte[length2];
                                for (int i19 = 0; i19 < length2; i19++) {
                                    bArr5[i19] = (byte) (bArr4[i19] ^ (-4629411779493505016L));
                                }
                                bArr4 = bArr5;
                            }
                            if (bArr4 != null) {
                                int i20 = $11 + 93;
                                $10 = i20 % 128;
                                int i21 = i20 % 2;
                                z = true;
                            } else {
                                z = false;
                            }
                            trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                            while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                                int i22 = $11 + 3;
                                int i23 = i22 % 128;
                                $10 = i23;
                                int i24 = i22 % 2;
                                if (z) {
                                    int i25 = i23 + 1;
                                    $11 = i25 % 128;
                                    if (i25 % 2 == 0) {
                                        byte[] bArr6 = IAuthTabCallbackStub;
                                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent >>> 1;
                                        byte b4 = (byte) (bArr6[r8] ^ (-4629411779493505016L));
                                        c = trackSelectionParametersExternalSyntheticLambda0.onExtraCallback;
                                        i4 = b4 % s;
                                    } else {
                                        byte[] bArr7 = IAuthTabCallbackStub;
                                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                                        byte b5 = (byte) (bArr7[r8] ^ (-4629411779493505016L));
                                        c = trackSelectionParametersExternalSyntheticLambda0.onExtraCallback;
                                        i4 = b5 + s;
                                    }
                                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (c + (((byte) i4) ^ b));
                                } else {
                                    short[] sArr = IAuthTabCallback_Parcel;
                                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                                }
                                sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                            }
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    objArr[0] = sb.toString();
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: o.setWrite */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0061 A[PHI: r1 r4
          0x0061: PHI (r1v10 o.findResAndMsg) = (r1v5 o.findResAndMsg), (r1v13 o.findResAndMsg) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
          0x0061: PHI (r4v1 java.lang.Object) = (r4v0 java.lang.Object), (r4v3 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x002c A[PHI: r5
          0x002c: PHI (r5v1 int) = (r5v0 int), (r5v3 int) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            findResAndMsg findresandmsg;
            Object objOnWarmupCompleted;
            int i;
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 123;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                findresandmsg = (findResAndMsg) this.L$0;
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                int i4 = 39 / 0;
                if (i == 0) {
                    Object obj2 = objOnWarmupCompleted;
                    ResultKt.onNavigationEvent(obj);
                    setRubIn setrubinOnExtraCallback = onAllAnimationsComplete.IAuthTabCallback(this.this$0).onExtraCallback();
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, this.$onError, findresandmsg, this.$callbackProxy, this.$onDisconnect, this.$timeout);
                    this.L$0 = access15400.onNavigationEvent(findresandmsg);
                    this.label = 1;
                    if (setrubinOnExtraCallback.collect(anonymousClass4, this) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        Object[] objArr = new Object[1];
                        a(new int[]{-996846025, -1612564158, 330530276, 1970936609, 525239264, -1261008174, -555757286, 732727417, -398938631, 87112708, -801201780, 1954667112, 1867100664, -1020194754, -1326441820, -1303316373, 25500421, 1959697410, 1085155954, 141182059, 850341712, -806171117, 545394749, 1084944658}, TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 47, objArr);
                        throw new IllegalStateException(((String) objArr[0]).intern());
                    }
                    ResultKt.onNavigationEvent(obj);
                    int i5 = onExtraCallbackWithResult + 65;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 2 / 4;
                    }
                }
            } else {
                findresandmsg = (findResAndMsg) this.L$0;
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                if (i != 0) {
                }
            }
            throw new setWrite();
        }

        private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = onWarmupCompleted;
            int i4 = -1469660336;
            int i5 = 0;
            if (iArr2 != null) {
                int i6 = $11 + 3;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i8 = 0;
                while (i8 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 72 - (ViewConfiguration.getWindowTouchSlop() >> 8), 8848 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr3[i8] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i8++;
                        i4 = -1469660336;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = onWarmupCompleted;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i9 = 0;
                while (i9 < length3) {
                    int i10 = $11 + 29;
                    $10 = i10 % 128;
                    if (i10 % 2 != 0) {
                        Object[] objArr3 = new Object[1];
                        objArr3[i5] = Integer.valueOf(iArr5[i9]);
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getCapsMode(BuildConfig.FLAVOR, i5, i5), TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', i5) + 73, View.getDefaultSize(i5, i5) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr6[i9] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    } else {
                        try {
                            Object[] objArr4 = {Integer.valueOf(iArr5[i9])};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 72 - (ViewConfiguration.getTapTimeout() >> 16), Color.green(0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                            }
                            iArr6[i9] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                            i9++;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    i5 = 0;
                }
                i2 = i5;
                iArr5 = iArr6;
            } else {
                i2 = 0;
            }
            System.arraycopy(iArr5, i2, iArr4, i2, length2);
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                cArr[i2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                int i11 = 0;
                for (int i12 = 16; i11 < i12; i12 = 16) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i11];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.blue(0) + 22252), KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 39, 10301 - TextUtils.getTrimmedLength(BuildConfig.FLAVOR), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i11++;
                }
                int i13 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i13;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
                int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
                cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
                cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
                Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16781249), (ViewConfiguration.getPressedStateDuration() >> 16) + 78, 7398 - View.MeasureSpec.getMode(0), 1888082611, false, "f", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
                i2 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }
    }

    /* renamed from: o.onAllAnimationsComplete$onExtraCallback$5, reason: invalid class name */
    static final class AnonymousClass5 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $onDisconnect;
        int label;
        final /* synthetic */ onAllAnimationsComplete this$0;
        private static final byte[] $$a = {46, -35, 45, ISOFileInfo.FCI_BYTE};
        private static final int $$b = 80;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onNavigationEvent = 0;
        private static int IAuthTabCallback = 1;
        private static char[] onWarmupCompleted = {60855, 61546, 54790, 46117, 39560, 30971, 24193, 15597, 779, 57713, 50951, 42290, 35797, 27114, 20355, 11746, 12292, 5753, 62495, 55871, 47319, 40685, 31899, 17149, 8475, 1914, 58652, 52007, 43487, 36860, 28051, 29682, 22036, 13340, 6691, 63709, 57056, 48335, 33453, 24898, 18302, 9484, 2871, 59861, 53225, 44425, 45987};
        private static long onExtraCallback = -8099405449066385397L;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(short s, byte b, int i) {
            int i2;
            int i3;
            byte[] bArr = $$a;
            int i4 = (s * 3) + 1;
            int i5 = 97 - (i * 2);
            int i6 = 3 - (b * 4);
            byte[] bArr2 = new byte[i4];
            if (bArr == null) {
                int i7 = i5;
                int i8 = 0;
                int i9 = i6;
                int i10 = i6 + i7;
                i2 = i8;
                int i11 = i9;
                i5 = i10;
                i6 = i11;
                bArr2[i2] = (byte) i5;
                i3 = i2 + 1;
                if (i3 == i4) {
                    return new String(bArr2, 0);
                }
                int i12 = i6 + 1;
                int i13 = i5;
                i9 = i12;
                i6 = bArr[i12];
                i8 = i3;
                i7 = i13;
                int i102 = i6 + i7;
                i2 = i8;
                int i112 = i9;
                i5 = i102;
                i6 = i112;
                bArr2[i2] = (byte) i5;
                i3 = i2 + 1;
                if (i3 == i4) {
                }
            } else {
                i2 = 0;
                bArr2[i2] = (byte) i5;
                i3 = i2 + 1;
                if (i3 == i4) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(onAllAnimationsComplete onallanimationscomplete, Function0<Unit> function0, access13800<? super AnonymousClass5> access13800Var) {
            super(2, access13800Var);
            this.this$0 = onallanimationscomplete;
            this.$onDisconnect = function0;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, this.$onDisconnect, access13800Var);
            int i2 = IAuthTabCallback + 11;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 4 / 0;
            }
            return anonymousClass5;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 55;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 77;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 83;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 13;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x01b7  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x01b8  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
            char c2;
            Throwable cause;
            int i3 = 2 % 2;
            TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
            long[] jArr = new long[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            int i4 = $11 + 3;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            while (true) {
                c2 = '0';
                if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                    break;
                }
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(onWarmupCompleted[i + i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 59698), 17 - Color.alpha(0), 10973 - (Process.myTid() >> 22), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(onExtraCallback), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46182 - AndroidCharacter.getMirror('0')), (ViewConfiguration.getTapTimeout() >> 16) + 31, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 20219, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - View.MeasureSpec.getSize(0)), 44 - ExpandableListView.getPackedPositionGroup(0L), TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0) + 1494, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
                int i7 = $10 + 105;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                    Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 49122), 44 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1494, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    int i8 = 76 / 0;
                } else {
                    cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                    try {
                        Object[] objArr6 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                        Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                        if (objOnExtraCallback5 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49122 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, c2, 0, 0)), 45 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), KeyEvent.getDeadChar(0, 0) + 1494, -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback5).invoke(null, objArr6);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                c2 = '0';
            }
            objArr[0] = new String(cArr);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: o.setWrite */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0059 A[PHI: r1
          0x0059: PHI (r1v9 java.lang.Object) = (r1v4 java.lang.Object), (r1v10 java.lang.Object) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r4
          0x0024: PHI (r4v1 int) = (r4v0 int), (r4v4 int) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objOnWarmupCompleted;
            int i;
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 93;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                int i4 = 37 / 0;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    getTileModeX gettilemodexOnTransact = onAllAnimationsComplete.IAuthTabCallback(this.this$0).onTransact();
                    final Function0<Unit> function0 = this.$onDisconnect;
                    setRipple setripple = new setRipple() { // from class: o.onAllAnimationsComplete.onExtraCallback.5.3
                        private static int IAuthTabCallback = 0;
                        private static int onExtraCallbackWithResult = 1;

                        public /* synthetic */ Object emit(Object obj2, access13800 access13800Var) {
                            int i5 = 2 % 2;
                            int i6 = IAuthTabCallback + 37;
                            onExtraCallbackWithResult = i6 % 128;
                            int i7 = i6 % 2;
                            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((Throwable) obj2, access13800Var);
                            int i8 = onExtraCallbackWithResult + 63;
                            IAuthTabCallback = i8 % 128;
                            if (i8 % 2 == 0) {
                                return objOnExtraCallbackWithResult;
                            }
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }

                        public final Object onExtraCallbackWithResult(Throwable th, access13800<? super Unit> access13800Var) {
                            int i5 = 2 % 2;
                            int i6 = onExtraCallbackWithResult + 55;
                            IAuthTabCallback = i6 % 128;
                            int i7 = i6 % 2;
                            function0.invoke();
                            Unit unit = Unit.INSTANCE;
                            int i8 = onExtraCallbackWithResult + 57;
                            IAuthTabCallback = i8 % 128;
                            int i9 = i8 % 2;
                            return unit;
                        }
                    };
                    this.label = 1;
                    if (gettilemodexOnTransact.collect(setripple, this) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        Object[] objArr = new Object[1];
                        a(ViewConfiguration.getScrollDefaultDelay() >> 16, TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR) + 47, (char) Color.alpha(0), objArr);
                        throw new IllegalStateException(((String) objArr[0]).intern());
                    }
                    ResultKt.onNavigationEvent(obj);
                    int i5 = onNavigationEvent + 91;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                }
            } else {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                if (i != 0) {
                }
            }
            throw new setWrite();
        }
    }

    /* renamed from: o.onAllAnimationsComplete$onExtraCallback$4, reason: invalid class name */
    static final class AnonymousClass4 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 1;
        private static int[] onExtraCallbackWithResult = {558253589, 2085698501, -1790812916, -1433852364, -908148680, 1796211588, 702873193, -700979147, -1331824080, -2143885844, 592764685, 1247007363, 1998324127, 700720460, 701574207, -870699425, -1453930927, 142721187};
        private static int onWarmupCompleted;
        final /* synthetic */ Function1<String, Unit> $onMessage;
        int label;
        final /* synthetic */ onAllAnimationsComplete this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass4(onAllAnimationsComplete onallanimationscomplete, Function1<? super String, Unit> function1, access13800<? super AnonymousClass4> access13800Var) {
            super(2, access13800Var);
            this.this$0 = onallanimationscomplete;
            this.$onMessage = function1;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 77;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 17;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, this.$onMessage, access13800Var);
            int i2 = onWarmupCompleted + 79;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return anonymousClass4;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 21;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 35;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: o.setWrite */
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 67;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = IAuthTabCallback + 85;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                if (i4 != 1) {
                    Object[] objArr = new Object[1];
                    a(new int[]{-1026443196, -2103444702, -276718221, 1266502372, 1542957874, -1654574511, 1338055882, 1960796593, -853861359, 1533379587, -1294364285, 310798689, 595938486, 393588203, -1887507677, 970890309, 1031839834, 1006816602, -347934492, 1331371122, 1699899949, -1996645090, 102589305, -230599143}, 47 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                getTileModeX gettilemodexIAuthTabCallback_Parcel = onAllAnimationsComplete.IAuthTabCallback(this.this$0).IAuthTabCallback_Parcel();
                final Function1<String, Unit> function1 = this.$onMessage;
                setRipple setripple = new setRipple() { // from class: o.onAllAnimationsComplete.onExtraCallback.4.5
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent;

                    public /* synthetic */ Object emit(Object obj2, access13800 access13800Var) {
                        int i7 = 2 % 2;
                        int i8 = onNavigationEvent + 115;
                        onExtraCallbackWithResult = i8 % 128;
                        int i9 = i8 % 2;
                        Object objOnWarmupCompleted2 = onWarmupCompleted((String) obj2, access13800Var);
                        int i10 = onExtraCallbackWithResult + 89;
                        onNavigationEvent = i10 % 128;
                        if (i10 % 2 != 0) {
                            int i11 = 49 / 0;
                        }
                        return objOnWarmupCompleted2;
                    }

                    public final Object onWarmupCompleted(String str, access13800<? super Unit> access13800Var) {
                        int i7 = 2 % 2;
                        int i8 = onExtraCallbackWithResult + 19;
                        onNavigationEvent = i8 % 128;
                        int i9 = i8 % 2;
                        function1.invoke(str);
                        Unit unit = Unit.INSTANCE;
                        int i10 = onExtraCallbackWithResult + 75;
                        onNavigationEvent = i10 % 128;
                        if (i10 % 2 == 0) {
                            return unit;
                        }
                        throw null;
                    }
                };
                this.label = 1;
                if (gettilemodexIAuthTabCallback_Parcel.collect(setripple, this) == objOnWarmupCompleted) {
                    int i7 = onWarmupCompleted + 109;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    return objOnWarmupCompleted;
                }
            }
            throw new setWrite();
        }

        private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = onExtraCallbackWithResult;
            int i4 = -1469660336;
            int i5 = 1;
            int i6 = 0;
            if (iArr2 != null) {
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i7 = 0;
                while (i7 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0), 72 - TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0), TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr3[i7] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i7++;
                        i4 = -1469660336;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = onExtraCallbackWithResult;
            long j = 0;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i8 = 0;
                while (i8 < length3) {
                    Object[] objArr3 = new Object[i5];
                    objArr3[i6] = Integer.valueOf(iArr5[i8]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionGroup(j), Color.blue(i6) + 72, 8847 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0'), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i8] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i8++;
                    i5 = 1;
                    i6 = 0;
                    j = 0;
                }
                i2 = i6;
                iArr5 = iArr6;
            } else {
                i2 = 0;
            }
            System.arraycopy(iArr5, i2, iArr4, i2, length2);
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                int i9 = $10 + 75;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                int i11 = 0;
                while (i11 < 16) {
                    int i12 = $11 + 93;
                    $10 = i12 % 128;
                    if (i12 % 2 != 0) {
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i11];
                        Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 22251), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 39, Process.getGidForName(BuildConfig.FLAVOR) + 10302, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                        i11 += 27;
                    } else {
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i11];
                        try {
                            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0') + 22253), Color.red(0) + 39, 10301 - (Process.myPid() >> 22), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                            }
                            int iIntValue2 = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue2;
                            i11++;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                }
                int i13 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i13;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
                int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
                cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
                cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
                Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - Color.alpha(0)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 77, 7398 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1888082611, false, "f", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr2, 0, i);
        }
    }

    /* renamed from: o.onAllAnimationsComplete$onExtraCallback$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char[] IAuthTabCallback = {27260, 27175, 27173, 27168, 27194, 27196, 27198, 27198, 27175, 27151, 27146, 27168, 27168, 27198, 27141, 27245, 27144, 27174, 27171, 27196, 27196, 27173, 27142, 27245, 27148, 27173, 27198, 27172, 27179, 27181, 27151, 27245, 27144, 27175, 27199, 27194, 27170, 27173, 27138, 27245, 27145, 27199, 27140, 27144, 27170, 27176, 27180};
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Function1<String, Unit> $onError;
        int label;
        final /* synthetic */ onAllAnimationsComplete this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(onAllAnimationsComplete onallanimationscomplete, Function1<? super String, Unit> function1, access13800<? super AnonymousClass1> access13800Var) {
            super(2, access13800Var);
            this.this$0 = onallanimationscomplete;
            this.$onError = function1;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 117;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            AnonymousClass1 anonymousClass1Create = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return anonymousClass1Create.invokeSuspend(unit);
            }
            anonymousClass1Create.invokeSuspend(unit);
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$onError, access13800Var);
            int i2 = onExtraCallbackWithResult + 101;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return anonymousClass1;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 85;
            onWarmupCompleted = i2 % 128;
            Object obj3 = null;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                IAuthTabCallback(findresandmsg, access13800Var);
                obj3.hashCode();
                throw null;
            }
            Object objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
            int i3 = onWarmupCompleted + 73;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                return objIAuthTabCallback;
            }
            throw null;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: o.setWrite */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0048 A[PHI: r1
          0x0048: PHI (r1v6 java.lang.Object) = (r1v4 java.lang.Object), (r1v7 java.lang.Object) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r4
          0x0024: PHI (r4v1 int) = (r4v0 int), (r4v4 int) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objOnWarmupCompleted;
            int i;
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 73;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                int i4 = 49 / 0;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    getTileModeX gettilemodexIAuthTabCallbackDefault = onAllAnimationsComplete.IAuthTabCallback(this.this$0).IAuthTabCallbackDefault();
                    final Function1<String, Unit> function1 = this.$onError;
                    setRipple setripple = new setRipple() { // from class: o.onAllAnimationsComplete.onExtraCallback.1.3
                        private static int onExtraCallbackWithResult = 1;
                        private static int onNavigationEvent;

                        public /* synthetic */ Object emit(Object obj2, access13800 access13800Var) {
                            int i5 = 2 % 2;
                            int i6 = onExtraCallbackWithResult + 91;
                            onNavigationEvent = i6 % 128;
                            int i7 = i6 % 2;
                            Object objOnWarmupCompleted2 = onWarmupCompleted((Throwable) obj2, access13800Var);
                            int i8 = onNavigationEvent + 5;
                            onExtraCallbackWithResult = i8 % 128;
                            int i9 = i8 % 2;
                            return objOnWarmupCompleted2;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:9:0x0023 A[PHI: r0
                          0x0023: PHI (r0v5 kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit>) = 
                          (r0v4 kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit>)
                          (r0v10 kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit>)
                         binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object onWarmupCompleted(Throwable th, access13800<? super Unit> access13800Var) {
                            Function1<String, Unit> function12;
                            String message;
                            int i5 = 2 % 2;
                            int i6 = onNavigationEvent + 33;
                            onExtraCallbackWithResult = i6 % 128;
                            if (i6 % 2 == 0) {
                                function12 = function1;
                                message = th.getMessage();
                                int i7 = 22 / 0;
                                if (message == null) {
                                    message = BuildConfig.FLAVOR;
                                }
                            } else {
                                function12 = function1;
                                message = th.getMessage();
                                if (message == null) {
                                }
                            }
                            function12.invoke(message);
                            Unit unit = Unit.INSTANCE;
                            int i8 = onNavigationEvent + 11;
                            onExtraCallbackWithResult = i8 % 128;
                            int i9 = i8 % 2;
                            return unit;
                        }
                    };
                    this.label = 1;
                    if (gettilemodexIAuthTabCallbackDefault.collect(setripple, this) == objOnWarmupCompleted) {
                        int i5 = onExtraCallbackWithResult + 109;
                        onWarmupCompleted = i5 % 128;
                        int i6 = i5 % 2;
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        Object[] objArr = new Object[1];
                        a(new int[]{0, 47, 0, 0}, true, new byte[]{1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0}, objArr);
                        throw new IllegalStateException(((String) objArr[0]).intern());
                    }
                    ResultKt.onNavigationEvent(obj);
                }
            } else {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                if (i != 0) {
                }
            }
            throw new setWrite();
        }

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            int i;
            int i2 = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i3 = iArr[0];
            int i4 = iArr[1];
            int i5 = iArr[2];
            int i6 = iArr[3];
            char[] cArr = IAuthTabCallback;
            char c = '0';
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i7 = 0;
                while (i7 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35282 - TextUtils.indexOf(BuildConfig.FLAVOR, c, 0, 0)), 35 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0), 14239 - (ViewConfiguration.getScrollBarSize() >> 8), -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i7++;
                        c = '0';
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
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
                    int i8 = $10 + 61;
                    $11 = i8 % 128;
                    if (i8 % 2 != 0 ? bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1 : bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 0) {
                        int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionGroup(0L), 29 - (ViewConfiguration.getKeyRepeatDelay() >> 16), TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    } else {
                        int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - (ViewConfiguration.getScrollBarSize() >> 8)), TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 66, Color.green(0) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i10] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    }
                    c2 = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49466 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0)), (ViewConfiguration.getLongPressTimeout() >> 16) + 70, TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                cArr3 = cArr4;
            }
            if (i6 > 0) {
                char[] cArr5 = new char[i4];
                System.arraycopy(cArr3, 0, cArr5, 0, i4);
                int i11 = i4 - i6;
                System.arraycopy(cArr5, 0, cArr3, i11, i6);
                System.arraycopy(cArr5, i6, cArr3, 0, i11);
            }
            if (z) {
                char[] cArr6 = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                int i12 = $10 + 79;
                $11 = i12 % 128;
                int i13 = 2;
                int i14 = i12 % 2;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    int i15 = $10 + 93;
                    $11 = i15 % 128;
                    int i16 = i15 % i13;
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                    i13 = 2;
                }
                cArr3 = cArr6;
            }
            if (i5 > 0) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    int i17 = $11 + 83;
                    $10 = i17 % 128;
                    if (i17 % 2 != 0) {
                        cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] >> iArr[2]);
                        i = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    } else {
                        cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                        i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                    }
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
                }
            }
            String str = new String(cArr3);
            int i18 = $11 + 59;
            $10 = i18 % 128;
            int i19 = i18 % 2;
            objArr[0] = str;
        }
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objIAuthTabCallback;
        Function1<String, Unit> function1;
        Object obj2;
        int i = 2 % 2;
        findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = this.label;
        Object obj3 = null;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            IAnimation iAnimationIAuthTabCallback = AFh1gSDK.onExtraCallbackWithResult.IAuthTabCallback();
            this.L$0 = findresandmsg;
            this.label = 1;
            objIAuthTabCallback = ycxycx.IAuthTabCallback(iAnimationIAuthTabCallback, this);
            if (objIAuthTabCallback == objOnWarmupCompleted) {
                int i3 = onWarmupCompleted + 11;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    return objOnWarmupCompleted;
                }
                obj3.hashCode();
                throw null;
            }
        } else {
            if (i2 != 1) {
                Object[] objArr = new Object[1];
                a((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 47, 39 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0), new char[]{65476, 65483, 22, '\t', 23, 25, 17, '\t', 65483, 65476, 6, '\t', '\n', 19, 22, '\t', 65476, 65483, '\r', 18, 26, 19, 15, '\t', 65483, 65476, 27, '\r', 24, '\f', 65476, 7, 19, 22, 19, 25, 24, '\r', 18, '\t', 7, 5, 16, 16, 65476, 24, 19}, false, 286 - (Process.myTid() >> 22), objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            int i4 = onExtraCallbackWithResult + 57;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                ResultKt.onNavigationEvent(obj);
                throw null;
            }
            ResultKt.onNavigationEvent(obj);
            objIAuthTabCallback = obj;
        }
        if (Intrinsics.areEqual((Boolean) objIAuthTabCallback, access14000.onNavigationEvent(true))) {
            maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new AnonymousClass2(this.this$0, this.$onError, this.$callbackProxy, this.$onDisconnect, this.$timeout, null), 3, (Object) null);
            maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new AnonymousClass4(this.this$0, this.$onMessage, null), 3, (Object) null);
            maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new AnonymousClass1(this.this$0, this.$onError, null), 3, (Object) null);
            maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new AnonymousClass5(this.this$0, this.$onDisconnect, null), 3, (Object) null);
            Unit unit = Unit.INSTANCE;
            int i5 = onExtraCallbackWithResult + 71;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 22 / 0;
            }
            return unit;
        }
        int i7 = onWarmupCompleted + 123;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 != 0) {
            function1 = this.$onError;
            Object[] objArr2 = new Object[1];
            a(27 / KeyEvent.getDeadChar(0, 0), 5 - KeyEvent.normalizeMetaState(1), new char[]{'\t', 65529, 7, '\b', 65526, 65525, 65527, 65535, 65531, 6, 3, '\t', 2, 65528, 19, 6, 65529, 5}, false, (Process.getElapsedCpuTime() > 1L ? 1 : (Process.getElapsedCpuTime() == 1L ? 0 : -1)) + 2267, objArr2);
            obj2 = objArr2[0];
        } else {
            function1 = this.$onError;
            Object[] objArr3 = new Object[1];
            a(18 - KeyEvent.getDeadChar(0, 0), 4 - KeyEvent.normalizeMetaState(0), new char[]{'\t', 65529, 7, '\b', 65526, 65525, 65527, 65535, 65531, 6, 3, '\t', 2, 65528, 19, 6, 65529, 5}, false, 271 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr3);
            obj2 = objArr3[0];
        }
        function1.invoke(((String) obj2).intern());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        long j;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        int i6 = $10 + 9;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        while (true) {
            i4 = 2083011369;
            j = 0;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - (ViewConfiguration.getScrollBarSize() >> 8)), 23 - View.getDefaultSize(0, 0), 10278 - KeyEvent.normalizeMetaState(0), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 12842), KeyEvent.normalizeMetaState(0) + 55, 2166 - MotionEvent.axisFromString(BuildConfig.FLAVOR), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i9 = $11 + 21;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionType(j) + 12843), AndroidCharacter.getMirror('0') + 7, ExpandableListView.getPackedPositionType(j) + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i11 = $10 + 61;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                i4 = 2083011369;
                j = 0;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }
}
