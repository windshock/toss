package im.toss.appsintoss.iap;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.alibaba.ariver.kernel.RVParams;
import im.toss.appsintoss.R;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import java.lang.reflect.Method;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access8100;
import o.findResAndMsg;
import o.getTileModeX;
import o.getWrite;
import o.ycxycx;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class InAppPurchaseHistoryDetailActivity$onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    int label;
    final /* synthetic */ InAppPurchaseHistoryDetailActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InAppPurchaseHistoryDetailActivity$onExtraCallback(InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity, access13800<? super InAppPurchaseHistoryDetailActivity$onExtraCallback> access13800Var) {
        super(2, access13800Var);
        this.this$0 = inAppPurchaseHistoryDetailActivity;
    }

    public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 109;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        int i5 = onExtraCallback + 17;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return objInvokeSuspend;
        }
        throw null;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i2 = 2 % 2;
        InAppPurchaseHistoryDetailActivity$onExtraCallback inAppPurchaseHistoryDetailActivity$onExtraCallback = new InAppPurchaseHistoryDetailActivity$onExtraCallback(this.this$0, access13800Var);
        int i3 = onExtraCallback + 3;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return inAppPurchaseHistoryDetailActivity$onExtraCallback;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 65;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
        int i5 = onExtraCallbackWithResult + 9;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return objIAuthTabCallback;
    }

    /* renamed from: im.toss.appsintoss.iap.InAppPurchaseHistoryDetailActivity$onExtraCallback$5, reason: invalid class name */
    static final class AnonymousClass5 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        int label;
        final /* synthetic */ InAppPurchaseHistoryDetailActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity, access13800<? super AnonymousClass5> access13800Var) {
            super(2, access13800Var);
            this.this$0 = inAppPurchaseHistoryDetailActivity;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i2 = 2 % 2;
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, access13800Var);
            int i3 = onWarmupCompleted + 35;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return anonymousClass5;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 107;
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
            int i4 = onWarmupCompleted + 107;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 93 / 0;
            }
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 25;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i5 = onWarmupCompleted + 81;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        /* renamed from: im.toss.appsintoss.iap.InAppPurchaseHistoryDetailActivity$onExtraCallback$5$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, access13800<? super Unit>, Object> {
            private static int $10 = 0;
            private static int $11 = 1;
            private static int onExtraCallback = 1;
            private static long onNavigationEvent = -6615217177566551934L;
            private static int onWarmupCompleted;
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ InAppPurchaseHistoryDetailActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity, access13800<? super AnonymousClass1> access13800Var) {
                super(2, access13800Var);
                this.this$0 = inAppPurchaseHistoryDetailActivity;
            }

            public final Object IAuthTabCallback(boolean z, access13800<? super Unit> access13800Var) throws Throwable {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 85;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Object objInvokeSuspend = create(Boolean.valueOf(z), access13800Var).invokeSuspend(Unit.INSTANCE);
                int i5 = onExtraCallback + 103;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return objInvokeSuspend;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i2 = 2 % 2;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, access13800Var);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                int i3 = onWarmupCompleted + 113;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 42 / 0;
                }
                return anonymousClass1;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 113;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Object obj3 = null;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                access13800<? super Unit> access13800Var = (access13800) obj2;
                if (i4 == 0) {
                    IAuthTabCallback(zBooleanValue, access13800Var);
                    throw null;
                }
                Object objIAuthTabCallback = IAuthTabCallback(zBooleanValue, access13800Var);
                int i5 = onWarmupCompleted + 41;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return objIAuthTabCallback;
                }
                obj3.hashCode();
                throw null;
            }

            private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
                int i3 = 2 % 2;
                AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
                audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i2;
                int length = cArr.length;
                long[] jArr = new long[length];
                audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
                while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                    int i4 = $10 + 47;
                    $11 = i4 % 128;
                    int i5 = i4 % 2;
                    int i6 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 24 - TextUtils.getOffsetAfter("", 0), 19627 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1002848041, false, RVParams.URL, new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i6] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onNavigationEvent ^ 5407414049857832247L);
                        try {
                            Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), ExpandableListView.getPackedPositionType(0L) + 59, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback2).invoke(null, objArr3);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                char[] cArr2 = new char[length];
                audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
                while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                    int i7 = $11 + 121;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                    Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0) + 1), Color.green(0) + 59, View.resolveSize(0, 0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    int i9 = $11 + 33;
                    $10 = i9 % 128;
                    if (i9 % 2 != 0) {
                        int i10 = 5 / 5;
                    }
                }
                objArr[0] = new String(cArr2);
            }

            public final Object invokeSuspend(Object obj) throws Throwable {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 9;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                boolean z = this.Z$0;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity = this.this$0;
                Object[] objArr = new Object[1];
                a(new char[]{58823, 32297, 53812, 13867, 35389, 60956}, View.combineMeasuredStates(0, 0) + 39929, objArr);
                InAppPurchaseHistoryDetailActivity.onWarmupCompleted(inAppPurchaseHistoryDetailActivity, "refund_result_observed", access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), access14000.onNavigationEvent(z))));
                if (!z) {
                    InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity2 = this.this$0;
                    String string = inAppPurchaseHistoryDetailActivity2.getString(R.string.appsintoss_purchase_history_detail_refund_toast_fail);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    new TdsToastV1.onNavigationEvent(inAppPurchaseHistoryDetailActivity2, string).onNavigationEvent();
                    int i5 = onExtraCallback + 37;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                }
                return Unit.INSTANCE;
            }
        }

        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 93;
            onWarmupCompleted = i3 % 128;
            Object obj2 = null;
            if (i3 % 2 != 0) {
                access14300.onWarmupCompleted();
                obj2.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                getTileModeX gettilemodexAsBinder = InAppPurchaseHistoryDetailActivity.onExtraCallbackWithResult(this.this$0).asBinder();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (ycxycx.onWarmupCompleted(gettilemodexAsBinder, anonymousClass1, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = onWarmupCompleted + 111;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                ResultKt.onNavigationEvent(obj);
                int i7 = onWarmupCompleted + 115;
                onExtraCallbackWithResult = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 5 / 3;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 9;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = this.label;
        if (i5 != 0) {
            int i6 = onExtraCallback + 71;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0 ? i5 != 1 : i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
        } else {
            ResultKt.onNavigationEvent(obj);
            InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity = this.this$0;
            TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallback = TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.STARTED;
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(inAppPurchaseHistoryDetailActivity, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.onExtraCallback(inAppPurchaseHistoryDetailActivity, onextracallback, anonymousClass5, this) == objOnWarmupCompleted) {
                int i7 = onExtraCallback + 105;
                onExtraCallbackWithResult = i7 % 128;
                if (i7 % 2 != 0) {
                    return objOnWarmupCompleted;
                }
                throw null;
            }
        }
        return Unit.INSTANCE;
    }
}
