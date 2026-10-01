package ua.naiksoftware.stomp;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AFb1vSDKAFa1ySDK;
import o.AFd1mSDK;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.Http1ExchangeCodecAbstractSource;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.TimelineExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.WebResourceResponseModel;
import o.access13800;
import o.access14000;
import o.access14100;
import o.access14200;
import o.access14600;
import o.access15400;
import o.access8000;
import o.access8200;
import o.doGet;
import o.findRes;
import o.findResAndMsg;
import o.getBorderRadius;
import o.getCornerRadius;
import o.getShine;
import o.getTileModeX;
import o.getWrite;
import o.isNeedUnzip;
import o.maybeUpdateAnimatable;
import o.newKnownLengthSink;
import o.onLoadStarted;
import o.putChannelInfo;
import o.setAutoCaptured;
import o.setResourceInternal;
import o.setRubIn;
import o.setShine;
import o.timeoutExit;
import o.wasLastName;
import o.ycxycx;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;
import ua.naiksoftware.stomp.HeartBeatTask;
import ua.naiksoftware.stomp.dto.StompHeader;
import ua.naiksoftware.stomp.dto.StompMessage;
import ua.naiksoftware.stomp.exception.StompSocketBrokenException;
import ua.naiksoftware.stomp.exception.StompSocketDisconnectionFailureException;
import ua.naiksoftware.stomp.provider.ConnectionProvider;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class StompClientImpl implements StompClient {
    private static final String DEFAULT_ACK = "auto";
    private static final String SUPPORTED_VERSIONS = "1.1,1.2";
    private final getCornerRadius<Boolean> _isConnected;
    private final getBorderRadius<StompMessage> _messageStream;
    private findResAndMsg clientScope;
    private final ConnectionProvider connectionProvider;
    private volatile HeartBeatTask heartBeatTask;
    private final setRubIn<Boolean> isConnected;
    private boolean legacyWhitespace;
    private final getTileModeX<StompMessage> messageStream;
    private ConcurrentHashMap<String, AFb1vSDKAFa1ySDK> topics;
    private ConcurrentHashMap<String, AFb1vSDKAFa1ySDK> topicsKeysMap;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = StompClient.class.getSimpleName();

    /* renamed from: ua.naiksoftware.stomp.StompClientImpl$subscribePath$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(access13800<? super AnonymousClass1> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StompClientImpl.this.subscribePath(null, null, this);
        }
    }

    /* renamed from: ua.naiksoftware.stomp.StompClientImpl$suspendUntilConnected$1, reason: invalid class name and case insensitive filesystem */
    static final class C00531 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C00531(access13800<? super C00531> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StompClientImpl.this.suspendUntilConnected(null, this);
        }
    }

    public StompClientImpl(@NotNull ConnectionProvider connectionProvider) {
        Intrinsics.checkNotNullParameter(connectionProvider, "");
        this.connectionProvider = connectionProvider;
        this.topics = new ConcurrentHashMap<>();
        this.topicsKeysMap = new ConcurrentHashMap<>();
        getBorderRadius<StompMessage> getborderradiusOnWarmupCompleted = getShine.onWarmupCompleted(0, 0, null, 7, null);
        this._messageStream = getborderradiusOnWarmupCompleted;
        this.messageStream = ycxycx.onExtraCallbackWithResult((getBorderRadius) getborderradiusOnWarmupCompleted);
        getCornerRadius<Boolean> getcornerradiusOnNavigationEvent = setShine.onNavigationEvent(Boolean.FALSE);
        this._isConnected = getcornerradiusOnNavigationEvent;
        this.isConnected = ycxycx.onExtraCallback((getCornerRadius) getcornerradiusOnNavigationEvent);
    }

    /* renamed from: ua.naiksoftware.stomp.StompClientImpl$sendHeartBeat$2, reason: invalid class name and case insensitive filesystem */
    static final class C00522 extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static long IAuthTabCallback = 2351607484680480520L;
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ String $pingMessage;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C00522(String str, access13800<? super C00522> access13800Var) {
            super(1, access13800Var);
            this.$pingMessage = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            C00522 c00522 = StompClientImpl.this.new C00522(this.$pingMessage, access13800Var);
            int i2 = onExtraCallback + 87;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return c00522;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 95;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvoke2 = invoke2(access13800Var);
            int i4 = onNavigationEvent + 9;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 16 / 0;
            }
            return objInvoke2;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(access13800<? super Unit> access13800Var) throws Throwable {
            Object objInvokeSuspend;
            int i = 2 % 2;
            int i2 = onExtraCallback + 11;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            C00522 c00522 = (C00522) create(access13800Var);
            if (i3 != 0) {
                objInvokeSuspend = c00522.invokeSuspend(Unit.INSTANCE);
                int i4 = 68 / 0;
            } else {
                objInvokeSuspend = c00522.invokeSuspend(Unit.INSTANCE);
            }
            int i5 = onNavigationEvent + 111;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
            char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallback ^ (-7907085296252847348L), cArr, i);
            timelineExternalSyntheticLambda0.onNavigationEvent = 4;
            int i3 = $11 + 125;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
                timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - Color.red(0)), 83 - Process.getGidForName(_UrlKt.FRAGMENT_ENCODE_SET), (ViewConfiguration.getScrollBarSize() >> 8) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0) + 14185), Color.argb(0, 0, 0, 0) + 19, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
            int i6 = $11 + 63;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            objArr[0] = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = this.label;
            Object obj2 = null;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                wasLastName waslastnameSend = StompClientImpl.this.connectionProvider.send(this.$pingMessage);
                Intrinsics.checkNotNullExpressionValue(waslastnameSend, "");
                this.label = 1;
                if (RxAwaitKt.onWarmupCompleted(waslastnameSend, this) == objOnExtraCallback) {
                    int i3 = onExtraCallback + 61;
                    onNavigationEvent = i3 % 128;
                    if (i3 % 2 == 0) {
                        return objOnExtraCallback;
                    }
                    obj2.hashCode();
                    throw null;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i4 = onNavigationEvent + 65;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                ResultKt.onNavigationEvent(obj);
            }
            StompClientImpl stompClientImpl = StompClientImpl.this;
            Object[] objArr = new Object[1];
            a(new char[]{25474, 45851, 25585, 16861, 35855, 28538, 63931, 6247}, (-1) - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0'), objArr);
            stompClientImpl.sendToFlipper(((String) objArr[0]).intern(), "HEARTBEAT", ">>> ping");
            Unit unit = Unit.INSTANCE;
            int i6 = onExtraCallback + 123;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                return unit;
            }
            obj2.hashCode();
            throw null;
        }
    }

    @Override // ua.naiksoftware.stomp.StompClient
    public getTileModeX<StompMessage> getMessageStream() {
        return this.messageStream;
    }

    @Override // ua.naiksoftware.stomp.StompClient
    public setRubIn<Boolean> isConnected() {
        return this.isConnected;
    }

    @Override // ua.naiksoftware.stomp.StompClient
    public Object connect(@Nullable final List<? extends StompHeader> list, int i, int i2, @NotNull final Function1<? super Throwable, Unit> function1, @NotNull access13800<? super Boolean> access13800Var) {
        findResAndMsg findresandmsg = this.clientScope;
        if (findresandmsg != null && findRes.onWarmupCompleted(findresandmsg)) {
            return access14000.onNavigationEvent(true);
        }
        this._isConnected.onWarmupCompleted(access14000.onNavigationEvent(false));
        final String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        setResourceInternal setresourceinternal = new setResourceInternal(access14200.onExtraCallbackWithResult(access13800Var), 1);
        setresourceinternal.onTransact();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final findResAndMsg findresandmsgOnWarmupCompleted = findRes.onWarmupCompleted(setresourceinternal.getContext().plus(isNeedUnzip.onExtraCallbackWithResult(null, 1, null)));
        this.heartBeatTask = new HeartBeatTask(new HeartBeatTask.SendCallback() { // from class: ua.naiksoftware.stomp.StompClientImpl$connect$2$1$1

            /* renamed from: ua.naiksoftware.stomp.StompClientImpl$connect$2$1$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
                final /* synthetic */ String $pingMessage;
                int label;
                final /* synthetic */ StompClientImpl this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(StompClientImpl stompClientImpl, String str, access13800<? super AnonymousClass1> access13800Var) {
                    super(2, access13800Var);
                    this.this$0 = stompClientImpl;
                    this.$pingMessage = str;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                    return new AnonymousClass1(this.this$0, this.$pingMessage, access13800Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                    return ((AnonymousClass1) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objOnExtraCallback = access14100.onExtraCallback();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.onNavigationEvent(obj);
                        StompClientImpl stompClientImpl = this.this$0;
                        String str = this.$pingMessage;
                        this.label = 1;
                        if (stompClientImpl.sendHeartBeat(str, this) == objOnExtraCallback) {
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

            @Override // ua.naiksoftware.stomp.HeartBeatTask.SendCallback
            public final void sendClientHeartBeat(String str) {
                Intrinsics.checkNotNullParameter(str, "");
                onLoadStarted.onExtraCallback(findresandmsgOnWarmupCompleted, null, null, new AnonymousClass1(this, str, null), 3, null);
            }
        }, new HeartBeatTask.FailedListener() { // from class: ua.naiksoftware.stomp.StompClientImpl$connect$2$1$2
            private static final byte[] $$a = {5, -4, -80, 1};
            private static final int $$b = 196;
            private static int $10 = 0;
            private static int $11 = 1;
            private static int onWarmupCompleted = 0;
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent = 478308967;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static String $$c(byte b, short s, int i3) {
                int i4;
                int i5;
                byte[] bArr = $$a;
                int i6 = (s * 3) + 105;
                int i7 = 1 - (b * 2);
                int i8 = 4 - (i3 * 2);
                byte[] bArr2 = new byte[i7];
                if (bArr == null) {
                    int i9 = i8;
                    i5 = 0;
                    int i10 = i7;
                    i6 = (-i6) + i10;
                    i8 = i9 + 1;
                    i4 = i5;
                    i5 = i4 + 1;
                    bArr2[i4] = (byte) i6;
                    if (i5 == i7) {
                        return new String(bArr2, 0);
                    }
                    int i11 = bArr[i8];
                    int i12 = i8;
                    i10 = i6;
                    i6 = i11;
                    i9 = i12;
                    i6 = (-i6) + i10;
                    i8 = i9 + 1;
                    i4 = i5;
                    i5 = i4 + 1;
                    bArr2[i4] = (byte) i6;
                    if (i5 == i7) {
                    }
                } else {
                    i4 = 0;
                    i5 = i4 + 1;
                    bArr2[i4] = (byte) i6;
                    if (i5 == i7) {
                    }
                }
            }

            /* renamed from: ua.naiksoftware.stomp.StompClientImpl$connect$2$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
                final /* synthetic */ Function1<Throwable, Unit> $onError;
                int label;
                final /* synthetic */ StompClientImpl this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(Function1<? super Throwable, Unit> function1, StompClientImpl stompClientImpl, access13800<? super AnonymousClass1> access13800Var) {
                    super(2, access13800Var);
                    this.$onError = function1;
                    this.this$0 = stompClientImpl;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                    return new AnonymousClass1(this.$onError, this.this$0, access13800Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                    return ((AnonymousClass1) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    if (newKnownLengthSink.Companion.onWarmupCompleted(Http1ExchangeCodecAbstractSource.SEAND_4104)) {
                        this.$onError.invoke(new StompSocketBrokenException("Heartbeat failed"));
                        this.this$0.cancel();
                        return Unit.INSTANCE;
                    }
                    throw new StompSocketBrokenException("Heartbeat failed");
                }
            }

            @Override // ua.naiksoftware.stomp.HeartBeatTask.FailedListener
            public final void onServerHeartBeatFailed() throws Throwable {
                int i3 = 2 % 2;
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("connectionId", string);
                Object[] objArr = new Object[1];
                a(6 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 6 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), new char[]{65529, 65532, 65533, '\n', 11, 0, 65533}, false, ExpandableListView.getPackedPositionGroup(0L) + 182, objArr);
                Object[] objArr2 = {"STOMP_HEARTBEAT_FAILED", access8000.IAuthTabCallbackStub(pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr[0]).intern(), list)), false, null, 12, null};
                int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                AFd1mSDK.onExtraCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -2050114575, 2050114579, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr2, iOnExtraCallbackWithResult2);
                Object obj = null;
                onLoadStarted.onExtraCallback(findresandmsgOnWarmupCompleted, null, null, new AnonymousClass1(function1, this, null), 3, null);
                int i4 = onWarmupCompleted + 25;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Removed duplicated region for block: B:43:0x01d4  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x01d5  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void a(int i3, int i4, char[] cArr, boolean z, int i5, Object[] objArr) throws Throwable {
                char c;
                int i6;
                char[] cArr2;
                Throwable cause;
                int i7 = 2 % 2;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
                char[] cArr3 = new char[i3];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
                while (true) {
                    c = 3;
                    i6 = 2083011369;
                    if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i3) {
                        break;
                    }
                    int i8 = $11 + 1;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                    cArr3[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i5 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
                    int i10 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i10]), Integer.valueOf(onNavigationEvent)};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 23 - (ViewConfiguration.getLongPressTimeout() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr3[i10] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                        if (objOnExtraCallback2 == null) {
                            char c2 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 12842);
                            int scrollBarFadeDuration = 55 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            int iGreen = Color.green(0) + 2167;
                            byte b = (byte) ($$a[3] - 1);
                            byte b2 = b;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c2, scrollBarFadeDuration, iGreen, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
                if (i4 > 0) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i4;
                    char[] cArr4 = new char[i3];
                    System.arraycopy(cArr3, 0, cArr4, 0, i3);
                    System.arraycopy(cArr4, 0, cArr3, i3 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
                    System.arraycopy(cArr4, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr3, 0, i3 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
                }
                if (z) {
                    int i11 = $11 + 47;
                    $10 = i11 % 128;
                    if (i11 % 2 != 0) {
                        cArr2 = new char[i3];
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 1;
                    } else {
                        cArr2 = new char[i3];
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
                    }
                    while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i3) {
                        int i12 = $10 + 5;
                        $11 = i12 % 128;
                        if (i12 % 2 == 0) {
                            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr3[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback + i3];
                            Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i6);
                            if (objOnExtraCallback3 == null) {
                                char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 12843);
                                int i13 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 55;
                                int packedPositionType = 2167 - ExpandableListView.getPackedPositionType(0L);
                                byte b3 = (byte) ($$a[c] - 1);
                                byte b4 = b3;
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(tapTimeout, i13, packedPositionType, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        } else {
                            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr3[(i3 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                            if (objOnExtraCallback4 == null) {
                                char mirror = (char) (AndroidCharacter.getMirror('0') + 12795);
                                int iMakeMeasureSpec = 55 - View.MeasureSpec.makeMeasureSpec(0, 0);
                                int deadChar = KeyEvent.getDeadChar(0, 0) + 2167;
                                byte b5 = (byte) ($$a[3] - 1);
                                byte b6 = b5;
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(mirror, iMakeMeasureSpec, deadChar, 1298711993, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback4).invoke(null, objArr5);
                        }
                        c = 3;
                        i6 = 2083011369;
                    }
                    cArr3 = cArr2;
                }
                String str = new String(cArr3);
                int i14 = $10 + 109;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                objArr[0] = str;
            }
        }, newKnownLengthSink.Companion.onWarmupCompleted(Http1ExchangeCodecAbstractSource.SEAND_4104));
        HeartBeatTask heartBeatTask = this.heartBeatTask;
        if (heartBeatTask != null) {
            heartBeatTask.setClientHeartbeat(i);
        }
        HeartBeatTask heartBeatTask2 = this.heartBeatTask;
        if (heartBeatTask2 != null) {
            heartBeatTask2.setServerHeartbeat(i2);
        }
        onLoadStarted.onExtraCallback(findresandmsgOnWarmupCompleted, null, null, new StompClientImpl$connect$2$1$3(this, atomicBoolean, setresourceinternal, null), 3, null);
        onLoadStarted.onExtraCallback(findresandmsgOnWarmupCompleted, null, null, new StompClientImpl$connect$2$1$4(this, string, list, atomicBoolean, setresourceinternal, function1, null), 3, null);
        this.clientScope = findresandmsgOnWarmupCompleted;
        Object objIAuthTabCallbackDefault = setresourceinternal.IAuthTabCallbackDefault();
        if (objIAuthTabCallbackDefault == access14100.onExtraCallback()) {
            access14600.IAuthTabCallback(access13800Var);
        }
        return objIAuthTabCallbackDefault;
    }

    /* renamed from: ua.naiksoftware.stomp.StompClientImpl$send$4, reason: invalid class name */
    static final class AnonymousClass4 extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static short[] IAuthTabCallback;
        final /* synthetic */ StompMessage $stompMessage;
        int label;
        private static final byte[] $$a = {79, -7, -1, -17};
        private static final int $$b = 156;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int asInterface = 0;
        private static int IAuthTabCallbackDefault = 1;
        private static int onWarmupCompleted = 1016029574;
        private static int onExtraCallback = -1538795516;
        private static int onNavigationEvent = -1937787774;
        private static byte[] onExtraCallbackWithResult = {-120, 119, -116, 8};

        private static String $$c(byte b, int i, short s) {
            int i2 = 115 - (b * 4);
            int i3 = i * 4;
            byte[] bArr = $$a;
            int i4 = 4 - (s * 3);
            byte[] bArr2 = new byte[1 - i3];
            int i5 = 0 - i3;
            int i6 = -1;
            if (bArr == null) {
                int i7 = i4 + i5;
                i4++;
                i2 = i7;
            }
            while (true) {
                i6++;
                bArr2[i6] = (byte) i2;
                if (i6 == i5) {
                    return new String(bArr2, 0);
                }
                int i8 = i4;
                i4 = i8 + 1;
                i2 += bArr[i4];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(StompMessage stompMessage, access13800<? super AnonymousClass4> access13800Var) {
            super(1, access13800Var);
            this.$stompMessage = stompMessage;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            AnonymousClass4 anonymousClass4 = StompClientImpl.this.new AnonymousClass4(this.$stompMessage, access13800Var);
            int i2 = asInterface + 105;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            return anonymousClass4;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 97;
            asInterface = i2 % 128;
            access13800<? super Unit> access13800Var2 = access13800Var;
            if (i2 % 2 == 0) {
                return invoke2(access13800Var2);
            }
            invoke2(access13800Var2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 109;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            AnonymousClass4 anonymousClass4 = (AnonymousClass4) create(access13800Var);
            if (i3 == 0) {
                return anonymousClass4.invokeSuspend(Unit.INSTANCE);
            }
            anonymousClass4.invokeSuspend(Unit.INSTANCE);
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x01c2 A[PHI: r0
          0x01c2: PHI (r0v9 int) = (r0v8 int), (r0v41 int) binds: [B:44:0x01c0, B:41:0x01ae] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x01cc A[PHI: r0
          0x01cc: PHI (r0v38 int) = (r0v8 int), (r0v41 int) binds: [B:44:0x01c0, B:41:0x01ae] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
            int i4;
            int i5;
            char c = 2;
            int i6 = 2 % 2;
            TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - ExpandableListView.getPackedPositionType(0L)), (ViewConfiguration.getPressedStateDuration() >> 16) + 42, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                boolean z = iIntValue == -1;
                if (z) {
                    byte[] bArr = onExtraCallbackWithResult;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i7 = 0;
                        while (i7 < length) {
                            try {
                                Object[] objArr3 = {Integer.valueOf(bArr[i7])};
                                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                                if (objOnExtraCallback2 == null) {
                                    char cResolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 12843);
                                    int iRed = Color.red(0) + 55;
                                    int windowTouchSlop = 2167 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                                    byte b2 = (byte) ($$a[c] + 1);
                                    byte b3 = b2;
                                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cResolveSizeAndState, iRed, windowTouchSlop, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                                }
                                bArr2[i7] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                                i7++;
                                c = 2;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        int i8 = $10 + 73;
                        $11 = i8 % 128;
                        int i9 = i8 % 2;
                        byte[] bArr3 = onExtraCallbackWithResult;
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onWarmupCompleted)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (KeyEvent.getMaxKeyCode() >> 16)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 41, TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0) + 22440, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                        int i10 = $10 + 3;
                        $11 = i10 % 128;
                        int i11 = i10 % 2;
                    } else {
                        iIntValue = (short) (((short) (IAuthTabCallback[i + ((int) (onWarmupCompleted ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                    }
                }
                if (iIntValue > 0) {
                    int i12 = $11 + 33;
                    int i13 = i12 % 128;
                    $10 = i13;
                    if (i12 % 2 != 0) {
                        i4 = ((i << iIntValue) << 5) - ((int) (onWarmupCompleted * (-4629411779493505016L)));
                        if (z) {
                            int i14 = i13 + 75;
                            $11 = i14 % 128;
                            int i15 = i14 % 2;
                            i5 = 1;
                        } else {
                            i5 = 0;
                        }
                    } else {
                        i4 = ((i + iIntValue) - 2) + ((int) (onWarmupCompleted ^ (-4629411779493505016L)));
                        if (z) {
                        }
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i4 + i5;
                    try {
                        Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onNavigationEvent), sb};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getCapsMode(_UrlKt.FRAGMENT_ENCODE_SET, 0, 0), 86 - (ViewConfiguration.getFadingEdgeLength() >> 16), KeyEvent.normalizeMetaState(0) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                        }
                        ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        byte[] bArr4 = onExtraCallbackWithResult;
                        if (bArr4 != null) {
                            int length2 = bArr4.length;
                            byte[] bArr5 = new byte[length2];
                            int i16 = $11 + 37;
                            $10 = i16 % 128;
                            int i17 = i16 % 2;
                            for (int i18 = 0; i18 < length2; i18++) {
                                bArr5[i18] = (byte) (bArr4[i18] ^ (-4629411779493505016L));
                            }
                            bArr4 = bArr5;
                        }
                        boolean z2 = bArr4 != null;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                        while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                            if (z2) {
                                byte[] bArr6 = onExtraCallbackWithResult;
                                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                                trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                            } else {
                                short[] sArr = IAuthTabCallback;
                                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                                trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                            }
                            sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                            trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                wasLastName waslastnameSend = StompClientImpl.this.connectionProvider.send(this.$stompMessage.compile(StompClientImpl.this.legacyWhitespace));
                Intrinsics.checkNotNullExpressionValue(waslastnameSend, "");
                this.label = 1;
                if (RxAwaitKt.onWarmupCompleted(waslastnameSend, this) == objOnExtraCallback) {
                    int i3 = asInterface + 13;
                    IAuthTabCallbackDefault = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 0 / 0;
                    }
                    return objOnExtraCallback;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i5 = asInterface + 123;
                IAuthTabCallbackDefault = i5 % 128;
                int i6 = i5 % 2;
            }
            StompClientImpl stompClientImpl = StompClientImpl.this;
            Object[] objArr = new Object[1];
            a((short) (TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0) + 1), (byte) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + Imgproc.COLOR_YUV2RGB_YVYU), 1731675761 - Process.getGidForName(_UrlKt.FRAGMENT_ENCODE_SET), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 674786328, TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0) - 7, objArr);
            stompClientImpl.sendToFlipper(((String) objArr[0]).intern(), this.$stompMessage);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object send(String str, access13800<? super Unit> access13800Var) {
        Object objSend = send(str, null, access13800Var);
        return objSend == access14100.onExtraCallback() ? objSend : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object send(String str, String str2, access13800<? super Unit> access13800Var) {
        Object objSend = send(new StompMessage("SEND", CollectionsKt__CollectionsJVMKt.listOf(new StompHeader(StompHeader.DESTINATION, str)), str2), access13800Var);
        return objSend == access14100.onExtraCallback() ? objSend : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object send(StompMessage stompMessage, access13800<? super Unit> access13800Var) {
        Object objSuspendUntilConnected = suspendUntilConnected(new AnonymousClass4(stompMessage, null), access13800Var);
        return objSuspendUntilConnected == access14100.onExtraCallback() ? objSuspendUntilConnected : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object sendHeartBeat(String str, access13800<? super Unit> access13800Var) {
        Object objSuspendUntilConnected = suspendUntilConnected(new C00522(str, null), access13800Var);
        return objSuspendUntilConnected == access14100.onExtraCallback() ? objSuspendUntilConnected : Unit.INSTANCE;
    }

    /* renamed from: ua.naiksoftware.stomp.StompClientImpl$suspendUntilConnected$2, reason: invalid class name and case insensitive filesystem */
    static final class C00542 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Boolean>, Object> {
        int label;

        C00542(access13800<? super C00542> access13800Var) {
            super(2, access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return StompClientImpl.this.new C00542(access13800Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Boolean> access13800Var) {
            return ((C00542) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        /* renamed from: ua.naiksoftware.stomp.StompClientImpl$suspendUntilConnected$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, access13800<? super Boolean>, Object> {
            /* synthetic */ boolean Z$0;
            int label;

            AnonymousClass1(access13800<? super AnonymousClass1> access13800Var) {
                super(2, access13800Var);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(access13800Var);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, access13800<? super Boolean> access13800Var) {
                return invoke(bool.booleanValue(), access13800Var);
            }

            public final Object invoke(boolean z, access13800<? super Boolean> access13800Var) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), access13800Var)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                boolean z = this.Z$0;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return access14000.onNavigationEvent(z);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return obj;
            }
            ResultKt.onNavigationEvent(obj);
            setRubIn<Boolean> setrubinIsConnected = StompClientImpl.this.isConnected();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.label = 1;
            Object objOnExtraCallbackWithResult = ycxycx.onExtraCallbackWithResult(setrubinIsConnected, anonymousClass1, this);
            return objOnExtraCallbackWithResult == objOnExtraCallback ? objOnExtraCallback : objOnExtraCallbackWithResult;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        if (r7.invoke(r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object suspendUntilConnected(Function1<? super access13800<? super Unit>, ? extends Object> function1, access13800<? super Unit> access13800Var) {
        C00531 c00531;
        if (access13800Var instanceof C00531) {
            c00531 = (C00531) access13800Var;
            int i = c00531.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00531.label = i - 2147483648;
            } else {
                c00531 = new C00531(access13800Var);
            }
        }
        Object obj = c00531.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = c00531.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            C00542 c00542 = new C00542(null);
            c00531.L$0 = function1;
            c00531.label = 1;
            if (doGet.onNavigationEvent(3000L, c00542, c00531) != objOnExtraCallback) {
            }
            return objOnExtraCallback;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            return Unit.INSTANCE;
        }
        function1 = (Function1) c00531.L$0;
        ResultKt.onNavigationEvent(obj);
        c00531.L$0 = access15400.onNavigationEvent(function1);
        c00531.label = 2;
    }

    /* renamed from: ua.naiksoftware.stomp.StompClientImpl$disconnect$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int I$0;
        int I$1;
        Object L$0;
        int label;

        AnonymousClass2(access13800<? super AnonymousClass2> access13800Var) {
            super(2, access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return StompClientImpl.this.new AnonymousClass2(access13800Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return ((AnonymousClass2) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM31constructorimpl;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    StompClientImpl.this.topics.clear();
                    StompClientImpl.this.topicsKeysMap.clear();
                    HeartBeatTask heartBeatTask = StompClientImpl.this.heartBeatTask;
                    if (heartBeatTask != null) {
                        heartBeatTask.shutdown();
                    }
                    StompClientImpl.this.heartBeatTask = null;
                    StompClientImpl stompClientImpl = StompClientImpl.this;
                    Result.Companion companion = Result.Companion;
                    StompClientImpl$disconnect$2$1$1 stompClientImpl$disconnect$2$1$1 = new StompClientImpl$disconnect$2$1$1(stompClientImpl, null);
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    obj = doGet.onNavigationEvent(3000L, stompClientImpl$disconnect$2$1$1, this);
                    if (obj == objOnExtraCallback) {
                        return objOnExtraCallback;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                objM31constructorimpl = Result.m31constructorimpl(obj);
            } catch (WebResourceResponseModel e) {
                Result.Companion companion2 = Result.Companion;
                objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e));
            } catch (CancellationException e2) {
                throw e2;
            } catch (Exception e3) {
                Result.Companion companion3 = Result.Companion;
                objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e3));
            }
            Throwable thM32exceptionOrNullimpl = Result.m32exceptionOrNullimpl(objM31constructorimpl);
            if (thM32exceptionOrNullimpl == null) {
                findResAndMsg findresandmsg = StompClientImpl.this.clientScope;
                if (findresandmsg != null) {
                    findRes.onExtraCallbackWithResult(findresandmsg, null, 1, null);
                }
                StompClientImpl.this.clientScope = null;
                return Unit.INSTANCE;
            }
            if (thM32exceptionOrNullimpl instanceof WebResourceResponseModel) {
                throw new StompSocketDisconnectionFailureException("Failed to disconnect gracefully");
            }
            throw thM32exceptionOrNullimpl;
        }
    }

    @Override // ua.naiksoftware.stomp.StompClient
    public Object disconnect(@Nullable Throwable th, @NotNull access13800<? super Unit> access13800Var) {
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new AnonymousClass2(null), access13800Var);
        return objOnExtraCallback == access14100.onExtraCallback() ? objOnExtraCallback : Unit.INSTANCE;
    }

    @Override // ua.naiksoftware.stomp.StompClient
    public void cancel() {
        this.topics.clear();
        this.topicsKeysMap.clear();
        HeartBeatTask heartBeatTask = this.heartBeatTask;
        if (heartBeatTask != null) {
            heartBeatTask.shutdown();
        }
        this.heartBeatTask = null;
        findResAndMsg findresandmsg = this.clientScope;
        if (findresandmsg != null) {
            findRes.onExtraCallbackWithResult(findresandmsg, null, 1, null);
        }
        this.clientScope = null;
        this.connectionProvider.cancel();
    }

    @Override // ua.naiksoftware.stomp.StompClient
    public Object addTopic(@NotNull AFb1vSDKAFa1ySDK aFb1vSDKAFa1ySDK, @Nullable List<? extends StompHeader> list, @NotNull access13800<? super Unit> access13800Var) {
        Object objSubscribePath = subscribePath(aFb1vSDKAFa1ySDK, list, access13800Var);
        return objSubscribePath == access14100.onExtraCallback() ? objSubscribePath : Unit.INSTANCE;
    }

    @Override // ua.naiksoftware.stomp.StompClient
    public Object removeTopic(@NotNull String str, @NotNull access13800<? super Unit> access13800Var) {
        Object objUnsubscribePath = unsubscribePath(str, access13800Var);
        return objUnsubscribePath == access14100.onExtraCallback() ? objUnsubscribePath : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(13:0|2|(2:4|(1:6)(1:7))(0)|8|78|(1:(1:(8:12|82|13|65|66|75|76|77)(2:21|22))(4:23|83|24|25))(2:32|(2:34|35)(6:36|(1:38)|87|39|(1:42)|63))|81|43|59|(4:85|61|(4:64|65|66|75)|63)|76|77|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x012f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0131, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0166 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object subscribePath(AFb1vSDKAFa1ySDK aFb1vSDKAFa1ySDK, List<? extends StompHeader> list, access13800<? super Unit> access13800Var) {
        AnonymousClass1 anonymousClass1;
        Collection collection;
        List<? extends StompHeader> list2;
        AFb1vSDKAFa1ySDK aFb1vSDKAFa1ySDK2;
        Collection collection2;
        Object objM31constructorimpl;
        Throwable thM32exceptionOrNullimpl;
        String strOnTransact;
        AFb1vSDKAFa1ySDK aFb1vSDKAFa1ySDK3;
        Throwable th;
        Throwable th2;
        AFb1vSDKAFa1ySDK aFb1vSDKAFa1ySDK4 = aFb1vSDKAFa1ySDK;
        if (access13800Var instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) access13800Var;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - 2147483648;
            } else {
                anonymousClass1 = new AnonymousClass1(access13800Var);
            }
        }
        Object obj = anonymousClass1.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = anonymousClass1.label;
        try {
            try {
                if (i2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    if (isSubscribed(aFb1vSDKAFa1ySDK.onTransact())) {
                        return Unit.INSTANCE;
                    }
                    this.topics.put(aFb1vSDKAFa1ySDK.IAuthTabCallbackStub(), aFb1vSDKAFa1ySDK4);
                    this.topicsKeysMap.put(aFb1vSDKAFa1ySDK.onTransact(), aFb1vSDKAFa1ySDK4);
                    ArrayList arrayListArrayListOf = CollectionsKt__CollectionsKt.arrayListOf(new StompHeader(StompHeader.ID, aFb1vSDKAFa1ySDK.IAuthTabCallbackStub()), new StompHeader(StompHeader.DESTINATION, aFb1vSDKAFa1ySDK.onExtraCallbackWithResult()), new StompHeader(StompHeader.ACK, DEFAULT_ACK), new StompHeader(StompHeader.RECEIPT, (String) AFb1vSDKAFa1ySDK.IAuthTabCallback(setAutoCaptured.onExtraCallbackWithResult(), new Object[]{aFb1vSDKAFa1ySDK}, setAutoCaptured.onExtraCallbackWithResult(), 1403333147, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), -1403333147)));
                    if (list != null) {
                        arrayListArrayListOf.addAll(list);
                    }
                    try {
                        Result.Companion companion = Result.Companion;
                        StompMessage stompMessage = new StompMessage("SUBSCRIBE", arrayListArrayListOf, null);
                        anonymousClass1.L$0 = aFb1vSDKAFa1ySDK4;
                        anonymousClass1.L$1 = access15400.onNavigationEvent(list);
                        anonymousClass1.L$2 = access15400.onNavigationEvent(arrayListArrayListOf);
                        anonymousClass1.L$3 = access15400.onNavigationEvent(anonymousClass1);
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.I$1 = 0;
                        anonymousClass1.label = 1;
                        if (send(stompMessage, anonymousClass1) != objOnExtraCallback) {
                            collection = arrayListArrayListOf;
                            list2 = list;
                        }
                    } catch (WebResourceResponseModel e) {
                        e = e;
                        collection = arrayListArrayListOf;
                        list2 = list;
                        Collection collection3 = collection;
                        aFb1vSDKAFa1ySDK2 = aFb1vSDKAFa1ySDK4;
                        collection2 = collection3;
                        Result.Companion companion2 = Result.Companion;
                        objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e));
                        AFb1vSDKAFa1ySDK aFb1vSDKAFa1ySDK5 = aFb1vSDKAFa1ySDK2;
                        collection = collection2;
                        aFb1vSDKAFa1ySDK4 = aFb1vSDKAFa1ySDK5;
                        thM32exceptionOrNullimpl = Result.m32exceptionOrNullimpl(objM31constructorimpl);
                        if (thM32exceptionOrNullimpl != null) {
                        }
                        return Unit.INSTANCE;
                    } catch (Exception e2) {
                        e = e2;
                        collection = arrayListArrayListOf;
                        list2 = list;
                        Collection collection4 = collection;
                        aFb1vSDKAFa1ySDK2 = aFb1vSDKAFa1ySDK4;
                        collection2 = collection4;
                        Result.Companion companion3 = Result.Companion;
                        objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e));
                        AFb1vSDKAFa1ySDK aFb1vSDKAFa1ySDK52 = aFb1vSDKAFa1ySDK2;
                        collection = collection2;
                        aFb1vSDKAFa1ySDK4 = aFb1vSDKAFa1ySDK52;
                        thM32exceptionOrNullimpl = Result.m32exceptionOrNullimpl(objM31constructorimpl);
                        if (thM32exceptionOrNullimpl != null) {
                        }
                        return Unit.INSTANCE;
                    }
                    return objOnExtraCallback;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th = (Throwable) anonymousClass1.L$4;
                    aFb1vSDKAFa1ySDK3 = (AFb1vSDKAFa1ySDK) anonymousClass1.L$0;
                    try {
                        ResultKt.onNavigationEvent(obj);
                        Result.m31constructorimpl(Unit.INSTANCE);
                        th2 = th;
                    } catch (WebResourceResponseModel e3) {
                        e = e3;
                        thM32exceptionOrNullimpl = th;
                        aFb1vSDKAFa1ySDK4 = aFb1vSDKAFa1ySDK3;
                        Result.Companion companion4 = Result.Companion;
                        Result.m31constructorimpl(ResultKt.createFailure(e));
                        aFb1vSDKAFa1ySDK3 = aFb1vSDKAFa1ySDK4;
                        th2 = thM32exceptionOrNullimpl;
                        AFd1mSDK.onNavigationEvent("STOMP_SUBSCRIBE_FAILED", th2, access8200.IAuthTabCallback(getWrite.IAuthTabCallback(StompHeader.DESTINATION, aFb1vSDKAFa1ySDK3.onExtraCallbackWithResult())), false, (Function1) null, 24, (Object) null);
                        return Unit.INSTANCE;
                    } catch (Exception e4) {
                        e = e4;
                        thM32exceptionOrNullimpl = th;
                        aFb1vSDKAFa1ySDK4 = aFb1vSDKAFa1ySDK3;
                        Result.Companion companion5 = Result.Companion;
                        Result.m31constructorimpl(ResultKt.createFailure(e));
                        aFb1vSDKAFa1ySDK3 = aFb1vSDKAFa1ySDK4;
                        th2 = thM32exceptionOrNullimpl;
                        AFd1mSDK.onNavigationEvent("STOMP_SUBSCRIBE_FAILED", th2, access8200.IAuthTabCallback(getWrite.IAuthTabCallback(StompHeader.DESTINATION, aFb1vSDKAFa1ySDK3.onExtraCallbackWithResult())), false, (Function1) null, 24, (Object) null);
                        return Unit.INSTANCE;
                    }
                    AFd1mSDK.onNavigationEvent("STOMP_SUBSCRIBE_FAILED", th2, access8200.IAuthTabCallback(getWrite.IAuthTabCallback(StompHeader.DESTINATION, aFb1vSDKAFa1ySDK3.onExtraCallbackWithResult())), false, (Function1) null, 24, (Object) null);
                    return Unit.INSTANCE;
                }
                collection2 = (List) anonymousClass1.L$2;
                list2 = (List) anonymousClass1.L$1;
                aFb1vSDKAFa1ySDK2 = (AFb1vSDKAFa1ySDK) anonymousClass1.L$0;
                try {
                    ResultKt.onNavigationEvent(obj);
                    collection = collection2;
                    aFb1vSDKAFa1ySDK4 = aFb1vSDKAFa1ySDK2;
                } catch (WebResourceResponseModel e5) {
                    e = e5;
                    Result.Companion companion22 = Result.Companion;
                    objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e));
                    AFb1vSDKAFa1ySDK aFb1vSDKAFa1ySDK522 = aFb1vSDKAFa1ySDK2;
                    collection = collection2;
                    aFb1vSDKAFa1ySDK4 = aFb1vSDKAFa1ySDK522;
                    thM32exceptionOrNullimpl = Result.m32exceptionOrNullimpl(objM31constructorimpl);
                    if (thM32exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                } catch (Exception e6) {
                    e = e6;
                    Result.Companion companion32 = Result.Companion;
                    objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e));
                    AFb1vSDKAFa1ySDK aFb1vSDKAFa1ySDK5222 = aFb1vSDKAFa1ySDK2;
                    collection = collection2;
                    aFb1vSDKAFa1ySDK4 = aFb1vSDKAFa1ySDK5222;
                    thM32exceptionOrNullimpl = Result.m32exceptionOrNullimpl(objM31constructorimpl);
                    if (thM32exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
                objM31constructorimpl = Result.m31constructorimpl(Unit.INSTANCE);
                thM32exceptionOrNullimpl = Result.m32exceptionOrNullimpl(objM31constructorimpl);
                if (thM32exceptionOrNullimpl != null) {
                    try {
                        Result.Companion companion6 = Result.Companion;
                        strOnTransact = aFb1vSDKAFa1ySDK4.onTransact();
                        anonymousClass1.L$0 = aFb1vSDKAFa1ySDK4;
                        anonymousClass1.L$1 = access15400.onNavigationEvent(list2);
                        anonymousClass1.L$2 = access15400.onNavigationEvent(collection);
                        anonymousClass1.L$3 = objM31constructorimpl;
                        anonymousClass1.L$4 = thM32exceptionOrNullimpl;
                        anonymousClass1.L$5 = access15400.onNavigationEvent(anonymousClass1);
                        anonymousClass1.L$6 = access15400.onNavigationEvent(anonymousClass1);
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.I$1 = 0;
                        anonymousClass1.I$2 = 0;
                        anonymousClass1.label = 2;
                    } catch (WebResourceResponseModel e7) {
                        e = e7;
                        Result.Companion companion42 = Result.Companion;
                        Result.m31constructorimpl(ResultKt.createFailure(e));
                        aFb1vSDKAFa1ySDK3 = aFb1vSDKAFa1ySDK4;
                        th2 = thM32exceptionOrNullimpl;
                        AFd1mSDK.onNavigationEvent("STOMP_SUBSCRIBE_FAILED", th2, access8200.IAuthTabCallback(getWrite.IAuthTabCallback(StompHeader.DESTINATION, aFb1vSDKAFa1ySDK3.onExtraCallbackWithResult())), false, (Function1) null, 24, (Object) null);
                        return Unit.INSTANCE;
                    } catch (Exception e8) {
                        e = e8;
                        Result.Companion companion52 = Result.Companion;
                        Result.m31constructorimpl(ResultKt.createFailure(e));
                        aFb1vSDKAFa1ySDK3 = aFb1vSDKAFa1ySDK4;
                        th2 = thM32exceptionOrNullimpl;
                        AFd1mSDK.onNavigationEvent("STOMP_SUBSCRIBE_FAILED", th2, access8200.IAuthTabCallback(getWrite.IAuthTabCallback(StompHeader.DESTINATION, aFb1vSDKAFa1ySDK3.onExtraCallbackWithResult())), false, (Function1) null, 24, (Object) null);
                        return Unit.INSTANCE;
                    }
                    if (unsubscribePath(strOnTransact, anonymousClass1) != objOnExtraCallback) {
                        aFb1vSDKAFa1ySDK3 = aFb1vSDKAFa1ySDK4;
                        th = thM32exceptionOrNullimpl;
                        Result.m31constructorimpl(Unit.INSTANCE);
                        th2 = th;
                        AFd1mSDK.onNavigationEvent("STOMP_SUBSCRIBE_FAILED", th2, access8200.IAuthTabCallback(getWrite.IAuthTabCallback(StompHeader.DESTINATION, aFb1vSDKAFa1ySDK3.onExtraCallbackWithResult())), false, (Function1) null, 24, (Object) null);
                    }
                    return objOnExtraCallback;
                }
                return Unit.INSTANCE;
            } catch (CancellationException e9) {
                throw e9;
            }
        } catch (CancellationException e10) {
            throw e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object unsubscribePath(String str, access13800<? super Unit> access13800Var) {
        AFb1vSDKAFa1ySDK aFb1vSDKAFa1ySDKRemove = this.topicsKeysMap.remove(str);
        if (aFb1vSDKAFa1ySDKRemove == null) {
            return Unit.INSTANCE;
        }
        this.topics.remove(aFb1vSDKAFa1ySDKRemove.IAuthTabCallbackStub());
        Object objSend = send(new StompMessage("UNSUBSCRIBE", CollectionsKt__CollectionsKt.listOf((Object[]) new StompHeader[]{new StompHeader(StompHeader.ID, aFb1vSDKAFa1ySDKRemove.IAuthTabCallbackStub()), new StompHeader(StompHeader.RECEIPT, aFb1vSDKAFa1ySDKRemove.IAuthTabCallbackDefault())}), null), access13800Var);
        return objSend == access14100.onExtraCallback() ? objSend : Unit.INSTANCE;
    }

    @Override // ua.naiksoftware.stomp.StompClient
    public void setLegacyWhitespace(boolean z) {
        this.legacyWhitespace = z;
    }

    @Override // ua.naiksoftware.stomp.StompClient
    public AFb1vSDKAFa1ySDK getSubscriptionKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.topics.get(str);
    }

    @Override // ua.naiksoftware.stomp.StompClient
    public boolean isSubscribed(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.topicsKeysMap.containsKey(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendToFlipper(String str, StompMessage stompMessage) {
        timeoutExit.Companion.onExtraCallback().onExtraCallbackWithResult(str, stompMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendToFlipper(String str, String str2, String str3) {
        timeoutExit.Companion.onExtraCallback().onExtraCallback(str, str2, str3);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
