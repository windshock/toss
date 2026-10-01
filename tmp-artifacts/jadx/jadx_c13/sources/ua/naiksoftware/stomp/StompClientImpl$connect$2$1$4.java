package ua.naiksoftware.stomp;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.rx2.RxConvertKt;
import o.AFd1mSDK;
import o.AFd1wSDK4;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.Http1ExchangeCodecAbstractSource;
import o.IAnimation;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.UpdatePackageContent;
import o.WebResourceResponseModel;
import o.access13800;
import o.access14000;
import o.access14100;
import o.access15400;
import o.access8000;
import o.findResAndMsg;
import o.getByteBuffer;
import o.getWrite;
import o.maybeRemoveAttachStateListener;
import o.newKnownLengthSink;
import o.setRipple;
import o.wasLastName;
import okhttp3.internal.url._UrlKt;
import org.opencv.imgproc.Imgproc;
import ua.naiksoftware.stomp.dto.LifecycleEvent;
import ua.naiksoftware.stomp.dto.StompHeader;
import ua.naiksoftware.stomp.dto.StompMessage;
import ua.naiksoftware.stomp.exception.StompConnectionExceptionKt;
import ua.naiksoftware.stomp.exception.StompSocketBrokenException;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class StompClientImpl$connect$2$1$4 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    final /* synthetic */ String $connectionId;
    final /* synthetic */ maybeRemoveAttachStateListener<Boolean> $cont;
    final /* synthetic */ List<StompHeader> $headers;
    final /* synthetic */ Function1<Throwable, Unit> $onError;
    final /* synthetic */ AtomicBoolean $resumed;
    int label;
    final /* synthetic */ StompClientImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    StompClientImpl$connect$2$1$4(StompClientImpl stompClientImpl, String str, List<? extends StompHeader> list, AtomicBoolean atomicBoolean, maybeRemoveAttachStateListener<? super Boolean> mayberemoveattachstatelistener, Function1<? super Throwable, Unit> function1, access13800<? super StompClientImpl$connect$2$1$4> access13800Var) {
        super(2, access13800Var);
        this.this$0 = stompClientImpl;
        this.$connectionId = str;
        this.$headers = list;
        this.$resumed = atomicBoolean;
        this.$cont = mayberemoveattachstatelistener;
        this.$onError = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        return new StompClientImpl$connect$2$1$4(this.this$0, this.$connectionId, this.$headers, this.$resumed, this.$cont, this.$onError, access13800Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        return ((StompClientImpl$connect$2$1$4) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
    }

    /* renamed from: ua.naiksoftware.stomp.StompClientImpl$connect$2$1$4$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements setRipple {
        private static short[] onExtraCallbackWithResult;
        final /* synthetic */ String $connectionId;
        final /* synthetic */ maybeRemoveAttachStateListener<Boolean> $cont;
        final /* synthetic */ List<StompHeader> $headers;
        final /* synthetic */ Function1<Throwable, Unit> $onError;
        final /* synthetic */ AtomicBoolean $resumed;
        final /* synthetic */ StompClientImpl this$0;
        private static final byte[] $$a = {50, -82, -81, 124};
        private static final int $$b = 111;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int asBinder = 0;
        private static int IAuthTabCallbackStub = 1;
        private static int onExtraCallback = 1735591760;
        private static int IAuthTabCallback = -1538795505;
        private static int onWarmupCompleted = 1018706051;
        private static byte[] onNavigationEvent = {9, 5, 9, 11, -12, -11, -10, 14, -26, 8, 6, -16, 8, 8};

        /* renamed from: ua.naiksoftware.stomp.StompClientImpl$connect$2$1$4$1$WhenMappings */
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[LifecycleEvent.Type.values().length];
                try {
                    iArr[LifecycleEvent.Type.OPENED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LifecycleEvent.Type.ERROR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[LifecycleEvent.Type.CLOSING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[LifecycleEvent.Type.CLOSED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[LifecycleEvent.Type.FAILED_SERVER_HEARTBEAT.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(short s, short s2, short s3) {
            int i;
            int i2 = s3 * 4;
            byte[] bArr = $$a;
            int i3 = 115 - (s * 2);
            int i4 = s2 + 4;
            byte[] bArr2 = new byte[1 - i2];
            int i5 = 0 - i2;
            if (bArr == null) {
                int i6 = i4;
                i3 = i5;
                int i7 = 0;
                i3 += i4;
                i4 = i6;
                i = i7;
                bArr2[i] = (byte) i3;
                int i8 = i4 + 1;
                i7 = i + 1;
                if (i == i5) {
                    return new String(bArr2, 0);
                }
                i6 = i8;
                i4 = bArr[i8];
                i3 += i4;
                i4 = i6;
                i = i7;
                bArr2[i] = (byte) i3;
                int i82 = i4 + 1;
                i7 = i + 1;
                if (i == i5) {
                }
            } else {
                i = 0;
                bArr2[i] = (byte) i3;
                int i822 = i4 + 1;
                i7 = i + 1;
                if (i == i5) {
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(String str, List<? extends StompHeader> list, AtomicBoolean atomicBoolean, maybeRemoveAttachStateListener<? super Boolean> mayberemoveattachstatelistener, StompClientImpl stompClientImpl, Function1<? super Throwable, Unit> function1) {
            this.$connectionId = str;
            this.$headers = list;
            this.$resumed = atomicBoolean;
            this.$cont = mayberemoveattachstatelistener;
            this.this$0 = stompClientImpl;
            this.$onError = function1;
        }

        @Override // o.setRipple
        public /* bridge */ /* synthetic */ Object emit(Object obj, access13800 access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 63;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Object objEmit = emit((LifecycleEvent) obj, (access13800<? super Unit>) access13800Var);
            int i4 = asBinder + 59;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return objEmit;
        }

        /* JADX WARN: Removed duplicated region for block: B:48:0x021b A[PHI: r1
          0x021b: PHI (r1v7 int) = (r1v6 int), (r1v54 int) binds: [B:47:0x0219, B:44:0x0207] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0225 A[PHI: r1
          0x0225: PHI (r1v51 int) = (r1v6 int), (r1v54 int) binds: [B:47:0x0219, B:44:0x0207] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
            int i4;
            int i5;
            int length;
            byte[] bArr;
            int i6;
            int i7 = 2 % 2;
            TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - View.resolveSizeAndState(0, 0, 0)), 42 - KeyEvent.normalizeMetaState(0), View.MeasureSpec.getSize(0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                boolean z = iIntValue == -1;
                if (z) {
                    int i8 = $10 + 97;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    byte[] bArr2 = onNavigationEvent;
                    long j = 0;
                    if (bArr2 != null) {
                        int length2 = bArr2.length;
                        byte[] bArr3 = new byte[length2];
                        int i10 = 0;
                        while (i10 < length2) {
                            Object[] objArr3 = {Integer.valueOf(bArr2[i10])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                char cBlue = (char) (Color.blue(0) + 12843);
                                int i11 = (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) + 54;
                                int i12 = 2168 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1));
                                byte b2 = (byte) 0;
                                byte b3 = (byte) (b2 - 1);
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cBlue, i11, i12, -299036574, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                            }
                            bArr3[i10] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i10++;
                            j = 0;
                        }
                        bArr2 = bArr3;
                    }
                    if (bArr2 != null) {
                        int i13 = $11 + 119;
                        $10 = i13 % 128;
                        if (i13 % 2 != 0) {
                            byte[] bArr4 = onNavigationEvent;
                            Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallback)};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43423 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (ViewConfiguration.getWindowTouchSlop() >> 8) + 42, 22439 - (ViewConfiguration.getPressedStateDuration() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            i6 = ((byte) (bArr4[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] - 4629411779493505016L)) % ((int) (IAuthTabCallback / (-4629411779493505016L)));
                        } else {
                            byte[] bArr5 = onNavigationEvent;
                            Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(onExtraCallback)};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 43424), 42 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0), 22438 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0'), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            i6 = ((byte) (bArr5[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L)));
                        }
                        iIntValue = (byte) i6;
                    } else {
                        iIntValue = (short) (((short) (onExtraCallbackWithResult[i + ((int) (onExtraCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))));
                    }
                }
                if (iIntValue > 0) {
                    int i14 = $10;
                    int i15 = i14 + 39;
                    $11 = i15 % 128;
                    if (i15 % 2 == 0) {
                        i4 = ((i >> iIntValue) - 3) % ((int) (onExtraCallback % (-4629411779493505016L)));
                        if (z) {
                            int i16 = i14 + 31;
                            $11 = i16 % 128;
                            int i17 = i16 % 2;
                            i5 = 1;
                        } else {
                            i5 = 0;
                        }
                    } else {
                        i4 = ((i + iIntValue) - 2) + ((int) (onExtraCallback ^ (-4629411779493505016L)));
                        if (z) {
                        }
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i4 + i5;
                    Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onWarmupCompleted), sb};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), 87 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 9566 - ((byte) KeyEvent.getModifierMetaStateMask()), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr6 = onNavigationEvent;
                    if (bArr6 != null) {
                        int i18 = $11 + 37;
                        $10 = i18 % 128;
                        if (i18 % 2 != 0) {
                            length = bArr6.length;
                            bArr = new byte[length];
                        } else {
                            length = bArr6.length;
                            bArr = new byte[length];
                        }
                        for (int i19 = 0; i19 < length; i19++) {
                            int i20 = $11 + 105;
                            $10 = i20 % 128;
                            int i21 = i20 % 2;
                            bArr[i19] = (byte) (bArr6[i19] ^ (-4629411779493505016L));
                        }
                        bArr6 = bArr;
                    }
                    boolean z2 = bArr6 != null;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        if (z2) {
                            byte[] bArr7 = onNavigationEvent;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r4] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            short[] sArr = onExtraCallbackWithResult;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r4] ^ (-4629411779493505016L))) + s)) ^ b));
                            int i22 = $11 + 87;
                            $10 = i22 % 128;
                            if (i22 % 2 != 0) {
                                int i23 = 3 / 5;
                            }
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                        int i24 = $10 + 77;
                        $11 = i24 % 128;
                        if (i24 % 2 == 0) {
                            int i25 = 2 % 5;
                        }
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        /* renamed from: ua.naiksoftware.stomp.StompClientImpl$connect$2$1$4$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            final /* synthetic */ Function1<Throwable, Unit> $onError;
            final /* synthetic */ Throwable $throwable;
            int I$0;
            int I$1;
            Object L$0;
            int label;
            final /* synthetic */ StompClientImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass4(Function1<? super Throwable, Unit> function1, Throwable th, StompClientImpl stompClientImpl, access13800<? super AnonymousClass4> access13800Var) {
                super(2, access13800Var);
                this.$onError = function1;
                this.$throwable = th;
                this.this$0 = stompClientImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                return new AnonymousClass4(this.$onError, this.$throwable, this.this$0, access13800Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                return ((AnonymousClass4) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objOnExtraCallback = access14100.onExtraCallback();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.onNavigationEvent(obj);
                        StompClientImpl stompClientImpl = this.this$0;
                        Result.Companion companion = Result.Companion;
                        this.L$0 = access15400.onNavigationEvent(this);
                        this.I$0 = 0;
                        this.I$1 = 0;
                        this.label = 1;
                        if (StompClient.disconnect$default(stompClientImpl, null, this, 1, null) == objOnExtraCallback) {
                            return objOnExtraCallback;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.onNavigationEvent(obj);
                    }
                    Result.m31constructorimpl(Unit.INSTANCE);
                } catch (WebResourceResponseModel e) {
                    Result.Companion companion2 = Result.Companion;
                    Result.m31constructorimpl(ResultKt.createFailure(e));
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Exception e3) {
                    Result.Companion companion3 = Result.Companion;
                    Result.m31constructorimpl(ResultKt.createFailure(e3));
                }
                this.$onError.invoke(this.$throwable);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:69:0x0344, code lost:
        
            if (o.maybeUpdateAnimatable.onExtraCallback(r3, r4, r5) != r6) goto L70;
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x037d, code lost:
        
            if (kotlinx.coroutines.rx2.RxAwaitKt.onWarmupCompleted(r0, r5) == r6) goto L77;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:89:0x03ad  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x03fd  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x0464  */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v14 */
        /* JADX WARN: Type inference failed for: r2v15 */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v40 */
        /* JADX WARN: Type inference failed for: r2v45 */
        /* JADX WARN: Type inference failed for: r2v46 */
        /* JADX WARN: Type inference failed for: r2v47 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(LifecycleEvent lifecycleEvent, access13800<? super Unit> access13800Var) throws Throwable {
            StompClientImpl$connect$2$1$4$1$emit$1 stompClientImpl$connect$2$1$4$1$emit$1;
            Object objM31constructorimpl;
            LifecycleEvent lifecycleEvent2;
            Throwable thM32exceptionOrNullimpl;
            ?? r2 = 2;
            r2 = 2;
            int i = 2 % 2;
            Object[] objArr = new Object[1];
            a((short) ('0' - AndroidCharacter.getMirror('0')), (byte) Color.blue(0), 1019945128 + Drawable.resolveOpacity(0, 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1728061405, TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            if (!(access13800Var instanceof StompClientImpl$connect$2$1$4$1$emit$1)) {
                stompClientImpl$connect$2$1$4$1$emit$1 = new StompClientImpl$connect$2$1$4$1$emit$1(this, access13800Var);
            } else {
                stompClientImpl$connect$2$1$4$1$emit$1 = (StompClientImpl$connect$2$1$4$1$emit$1) access13800Var;
                int i2 = stompClientImpl$connect$2$1$4$1$emit$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    int i3 = IAuthTabCallbackStub + Imgproc.COLOR_YUV2RGBA_YVYU;
                    asBinder = i3 % 128;
                    int i4 = i3 % 2;
                    stompClientImpl$connect$2$1$4$1$emit$1.label = i2 - 2147483648;
                }
            }
            Object obj = stompClientImpl$connect$2$1$4$1$emit$1.result;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i5 = stompClientImpl$connect$2$1$4$1$emit$1.label;
            try {
                try {
                } catch (CancellationException e) {
                    throw e;
                }
            } catch (WebResourceResponseModel e2) {
                e = e2;
            } catch (Exception e3) {
                e = e3;
            }
            if (i5 == 0) {
                ResultKt.onNavigationEvent(obj);
                LifecycleEvent.Type type = lifecycleEvent.getType();
                int i6 = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
                if (i6 != 1) {
                    int i7 = asBinder;
                    int i8 = i7 + 91;
                    IAuthTabCallbackStub = i8 % 128;
                    int i9 = i8 % 2;
                    if (i6 != 2) {
                        int i10 = i7 + 37;
                        IAuthTabCallbackStub = i10 % 128;
                        if (i10 % 2 != 0 ? i6 != 3 : i6 != 4) {
                            if (i6 == 4) {
                                Intrinsics.checkNotNull(lifecycleEvent);
                                Map<String, Object> mapCloseLogParams = StompClientImplKt.closeLogParams(lifecycleEvent);
                                if (lifecycleEvent.getThrowable() == null) {
                                    Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("connectionId", this.$connectionId);
                                    Object[] objArr2 = new Object[1];
                                    a((short) ExpandableListView.getPackedPositionType(0L), (byte) (KeyEvent.getMaxKeyCode() >> 16), 1019945134 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1728061410 - KeyEvent.keyCodeFromString(_UrlKt.FRAGMENT_ENCODE_SET), View.MeasureSpec.makeMeasureSpec(0, 0), objArr2);
                                    AFd1mSDK.onExtraCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -2050114575, 2050114579, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{"STOMP_CLOSED", access8000.onExtraCallbackWithResult(access8000.IAuthTabCallbackStub(pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), lifecycleEvent.getMessage()), getWrite.IAuthTabCallback("handshakeResponseHeaders", lifecycleEvent.getHandshakeResponseHeaders()), getWrite.IAuthTabCallback(strIntern, this.$headers)), mapCloseLogParams), false, null, 12, null}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
                                } else {
                                    AFd1mSDK.onNavigationEvent("STOMP_CLOSED", lifecycleEvent.getThrowable(), access8000.onExtraCallbackWithResult(access8000.IAuthTabCallbackStub(getWrite.IAuthTabCallback("connectionId", this.$connectionId), getWrite.IAuthTabCallback("lifecycleEvent.message", lifecycleEvent.getMessage()), getWrite.IAuthTabCallback("handshakeResponseHeaders", lifecycleEvent.getHandshakeResponseHeaders()), getWrite.IAuthTabCallback(strIntern, this.$headers)), mapCloseLogParams), false, (Function1) null, 24, (Object) null);
                                }
                                this.this$0._isConnected.onWarmupCompleted(access14000.onNavigationEvent(false));
                                if (newKnownLengthSink.Companion.onWarmupCompleted(Http1ExchangeCodecAbstractSource.SEAND_4104)) {
                                    if (this.$resumed.compareAndSet(false, true)) {
                                        maybeRemoveAttachStateListener<Boolean> mayberemoveattachstatelistener = this.$cont;
                                        StompSocketBrokenException stompSocketBrokenException = new StompSocketBrokenException("Socket closed before connected: " + lifecycleEvent.getMessage());
                                        Result.Companion companion = Result.Companion;
                                        mayberemoveattachstatelistener.resumeWith(Result.m31constructorimpl(ResultKt.createFailure(stompSocketBrokenException)));
                                    }
                                    this.$onError.invoke(new StompSocketBrokenException("Socket closed: " + lifecycleEvent.getMessage()));
                                    this.this$0.cancel();
                                }
                            } else {
                                if (i6 != 5) {
                                    throw new IllegalStateException("Unsupported lifecycle event type");
                                }
                                AFd1mSDK.onNavigationEvent("STOMP_FAILED_SERVER_HEARTBEAT", lifecycleEvent.getThrowable(), access8000.IAuthTabCallbackStub(getWrite.IAuthTabCallback("lifecycleEvent.message", lifecycleEvent.getMessage()), getWrite.IAuthTabCallback("handshakeResponseHeaders", lifecycleEvent.getHandshakeResponseHeaders()), getWrite.IAuthTabCallback(strIntern, this.$headers)), false, (Function1) null, 24, (Object) null);
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    Throwable throwable = lifecycleEvent.getThrowable();
                    if (throwable == null) {
                        throwable = new Exception("Unknown error");
                    }
                    Intrinsics.checkNotNull(lifecycleEvent);
                    Map<String, Object> mapCloseLogParams2 = StompClientImplKt.closeLogParams(lifecycleEvent);
                    if (StompConnectionExceptionKt.isStompKnownError(throwable)) {
                        AFd1mSDK.onExtraCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -2050114575, 2050114579, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{"STOMP_ERROR", access8000.onExtraCallbackWithResult(access8000.onExtraCallbackWithResult(access8000.IAuthTabCallbackStub(getWrite.IAuthTabCallback("connectionId", this.$connectionId), getWrite.IAuthTabCallback("lifecycleEvent.message", lifecycleEvent.getMessage()), getWrite.IAuthTabCallback("handshakeResponseHeaders", lifecycleEvent.getHandshakeResponseHeaders()), getWrite.IAuthTabCallback(strIntern, this.$headers)), mapCloseLogParams2), AFd1wSDK4.onNavigationEvent(throwable)), false, null, 12, null}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
                    } else {
                        AFd1mSDK.onNavigationEvent("STOMP_ERROR", throwable, access8000.onExtraCallbackWithResult(access8000.IAuthTabCallbackStub(getWrite.IAuthTabCallback("connectionId", this.$connectionId), getWrite.IAuthTabCallback("lifecycleEvent.message", lifecycleEvent.getMessage()), getWrite.IAuthTabCallback("handshakeResponseHeaders", lifecycleEvent.getHandshakeResponseHeaders()), getWrite.IAuthTabCallback(strIntern, this.$headers)), mapCloseLogParams2), false, (Function1) null, 24, (Object) null);
                    }
                    if (!(!newKnownLengthSink.Companion.onWarmupCompleted(Http1ExchangeCodecAbstractSource.SEAND_4104)) && this.$resumed.compareAndSet(false, true)) {
                        maybeRemoveAttachStateListener<Boolean> mayberemoveattachstatelistener2 = this.$cont;
                        Result.Companion companion2 = Result.Companion;
                        mayberemoveattachstatelistener2.resumeWith(Result.m31constructorimpl(ResultKt.createFailure(throwable)));
                    }
                    UpdatePackageContent updatePackageContent = UpdatePackageContent.onExtraCallback;
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$onError, throwable, this.this$0, null);
                    stompClientImpl$connect$2$1$4$1$emit$1.L$0 = access15400.onNavigationEvent(lifecycleEvent);
                    stompClientImpl$connect$2$1$4$1$emit$1.L$1 = access15400.onNavigationEvent(throwable);
                    stompClientImpl$connect$2$1$4$1$emit$1.L$2 = access15400.onNavigationEvent(mapCloseLogParams2);
                    stompClientImpl$connect$2$1$4$1$emit$1.label = 2;
                } else {
                    StompClientImpl stompClientImpl = this.this$0;
                    List<StompHeader> list = this.$headers;
                    try {
                        Result.Companion companion3 = Result.Companion;
                        wasLastName waslastnameSend = stompClientImpl.connectionProvider.send(new StompMessage("CONNECT", list, null).compile(stompClientImpl.legacyWhitespace));
                        Intrinsics.checkNotNullExpressionValue(waslastnameSend, "");
                        LifecycleEvent lifecycleEvent3 = lifecycleEvent;
                        stompClientImpl$connect$2$1$4$1$emit$1.L$0 = lifecycleEvent3;
                        stompClientImpl$connect$2$1$4$1$emit$1.L$1 = access15400.onNavigationEvent(stompClientImpl$connect$2$1$4$1$emit$1);
                        stompClientImpl$connect$2$1$4$1$emit$1.I$0 = 0;
                        stompClientImpl$connect$2$1$4$1$emit$1.I$1 = 0;
                        stompClientImpl$connect$2$1$4$1$emit$1.label = 1;
                        r2 = lifecycleEvent3;
                    } catch (WebResourceResponseModel e4) {
                        e = e4;
                        r2 = lifecycleEvent;
                        Result.Companion companion4 = Result.Companion;
                        objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e));
                        lifecycleEvent2 = r2;
                        String str = this.$connectionId;
                        List<StompHeader> list2 = this.$headers;
                        if (Result.onNavigationEvent(objM31constructorimpl)) {
                        }
                        String str2 = this.$connectionId;
                        List<StompHeader> list3 = this.$headers;
                        thM32exceptionOrNullimpl = Result.m32exceptionOrNullimpl(objM31constructorimpl);
                        if (thM32exceptionOrNullimpl == null) {
                        }
                    } catch (Exception e5) {
                        e = e5;
                        r2 = lifecycleEvent;
                        Result.Companion companion5 = Result.Companion;
                        objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e));
                        lifecycleEvent2 = r2;
                        String str3 = this.$connectionId;
                        List<StompHeader> list22 = this.$headers;
                        if (Result.onNavigationEvent(objM31constructorimpl)) {
                        }
                        String str22 = this.$connectionId;
                        List<StompHeader> list32 = this.$headers;
                        thM32exceptionOrNullimpl = Result.m32exceptionOrNullimpl(objM31constructorimpl);
                        if (thM32exceptionOrNullimpl == null) {
                        }
                    }
                }
                return objOnExtraCallback;
            }
            if (i5 != 1) {
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i11 = IAuthTabCallbackStub + 95;
                asBinder = i11 % 128;
                int i12 = i11 % 2;
                return Unit.INSTANCE;
            }
            LifecycleEvent lifecycleEvent4 = (LifecycleEvent) stompClientImpl$connect$2$1$4$1$emit$1.L$0;
            ResultKt.onNavigationEvent(obj);
            r2 = lifecycleEvent4;
            objM31constructorimpl = Result.m31constructorimpl(Unit.INSTANCE);
            lifecycleEvent2 = r2;
            String str32 = this.$connectionId;
            List<StompHeader> list222 = this.$headers;
            if (Result.onNavigationEvent(objM31constructorimpl)) {
                AFd1mSDK.onExtraCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -2050114575, 2050114579, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{"STOMP_CLIENT_OPENED", access8000.IAuthTabCallbackStub(getWrite.IAuthTabCallback("connectionId", str32), getWrite.IAuthTabCallback("handshakeResponseHeaders", lifecycleEvent2.getHandshakeResponseHeaders()), getWrite.IAuthTabCallback(strIntern, list222)), false, null, 12, null}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
            }
            String str222 = this.$connectionId;
            List<StompHeader> list322 = this.$headers;
            thM32exceptionOrNullimpl = Result.m32exceptionOrNullimpl(objM31constructorimpl);
            if (thM32exceptionOrNullimpl == null) {
                Result.IAuthTabCallback(objM31constructorimpl);
                return Unit.INSTANCE;
            }
            if (!StompConnectionExceptionKt.isStompKnownError(thM32exceptionOrNullimpl)) {
                AFd1mSDK.onNavigationEvent("STOMP_CONNECT_FAILED", thM32exceptionOrNullimpl, access8000.IAuthTabCallbackStub(getWrite.IAuthTabCallback("connectionId", str222), getWrite.IAuthTabCallback(strIntern, list322)), false, (Function1) null, 24, (Object) null);
                throw thM32exceptionOrNullimpl;
            }
            AFd1mSDK.onExtraCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -2050114575, 2050114579, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{"STOMP_CONNECT_FAILED", access8000.onExtraCallbackWithResult(access8000.IAuthTabCallbackStub(getWrite.IAuthTabCallback("connectionId", str222), getWrite.IAuthTabCallback(strIntern, list322)), AFd1wSDK4.onNavigationEvent(thM32exceptionOrNullimpl)), false, null, 12, null}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
            throw thM32exceptionOrNullimpl;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i = this.label;
        if (i == 0) {
            ResultKt.onNavigationEvent(obj);
            getByteBuffer<LifecycleEvent> getbytebufferLifecycle = this.this$0.connectionProvider.lifecycle();
            Intrinsics.checkNotNullExpressionValue(getbytebufferLifecycle, "");
            IAnimation iAnimationIAuthTabCallback = RxConvertKt.IAuthTabCallback(getbytebufferLifecycle);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$connectionId, this.$headers, this.$resumed, this.$cont, this.this$0, this.$onError);
            this.label = 1;
            if (iAnimationIAuthTabCallback.collect(anonymousClass1, this) == objOnExtraCallback) {
                return objOnExtraCallback;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
        }
        return Unit.INSTANCE;
    }
}
