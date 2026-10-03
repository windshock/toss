package viva.republica.toss.inappupdate;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import im.toss.base.BaseActivity;
import java.lang.reflect.Method;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.IPostMessageService;
import o.IPostMessageService_Parcel;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.access13800;
import o.access14300;
import o.findResAndMsg;
import o.maybeUpdateAnimatable;
import o.onJsBridgeReady;
import o.onSessionEnded;
import o.setRandomHost;
import o.withOnAnimationEventListener;
import o.withOrigin;
import o.ycxycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.inappupdate.InAppUpdateLauncherActivity$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class InAppUpdateLauncherActivity extends Hilt_InAppUpdateLauncherActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallbackWithResult Companion;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int IAuthTabCallback_Parcel = 0;
    public static final int asInterface;
    private static int getInterfaceDescriptor = 1;
    private static int[] onTransact;
    private final IEngagementSignalsCallback_Parcel<IPostMessageService> asBinder = registerForActivityResult(new IPostMessageService_Parcel.IAuthTabCallbackStub(), new onSessionEnded() { // from class: viva.republica.toss.inappupdate.InAppUpdateLauncherActivity$$ExternalSyntheticLambda0
        public final void onActivityResult(Object obj) {
            InAppUpdateLauncherActivity.onExtraCallback(this.f$0, (IEngagementSignalsCallbackDefault) obj);
        }
    });

    @Inject
    public withOrigin inAppUpdateManager;

    static {
        IAuthTabCallback();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallbackWithResult(defaultConstructorMarker);
        asInterface = 8;
        int i = IAuthTabCallback_Parcel + 99;
        getInterfaceDescriptor = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(InAppUpdateLauncherActivity inAppUpdateLauncherActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 123;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(inAppUpdateLauncherActivity, iEngagementSignalsCallbackDefault);
        int i4 = IAuthTabCallbackStub + 113;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onNavigationEvent(InAppUpdateLauncherActivity inAppUpdateLauncherActivity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        int i5 = 2 % 2;
        int i6 = IAuthTabCallbackDefault + 13;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        onWarmupCompleted(inAppUpdateLauncherActivity, intentSender, i, intent, i2, i3, i4, bundle);
        if (i7 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 123;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 87;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return -1L;
    }

    public static final /* synthetic */ void onWarmupCompleted(InAppUpdateLauncherActivity inAppUpdateLauncherActivity, withOnAnimationEventListener withonanimationeventlistener) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 111;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        inAppUpdateLauncherActivity.onWarmupCompleted(withonanimationeventlistener);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackStub + 5;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public final withOrigin onNavigationEvent() {
        int i = 2 % 2;
        withOrigin withorigin = this.inAppUpdateManager;
        if (withorigin != null) {
            int i2 = IAuthTabCallbackDefault + 71;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            return withorigin;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = IAuthTabCallbackDefault + 27;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return InAppUpdateLauncherActivity.this.new onNavigationEvent(access13800Var);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                withOrigin withoriginOnNavigationEvent = InAppUpdateLauncherActivity.this.onNavigationEvent();
                this.label = 1;
                if (withoriginOnNavigationEvent.onNavigationEvent(this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
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

    private static final void onWarmupCompleted(InAppUpdateLauncherActivity inAppUpdateLauncherActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 85;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        Object obj = null;
        if (iEngagementSignalsCallbackDefault.onNavigationEvent() == 0) {
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(inAppUpdateLauncherActivity), (CoroutineContext) null, (setRandomHost) null, inAppUpdateLauncherActivity.new onNavigationEvent(null), 3, (Object) null);
            return;
        }
        if (iEngagementSignalsCallbackDefault.onNavigationEvent() == -1) {
            int i4 = IAuthTabCallbackDefault + 61;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            inAppUpdateLauncherActivity.finish();
            if (i5 != 0) {
                int i6 = 35 / 0;
            }
        }
        int i7 = IAuthTabCallbackStub + 1;
        IAuthTabCallbackDefault = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return InAppUpdateLauncherActivity.this.new onExtraCallback(access13800Var);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                withOrigin withoriginOnNavigationEvent = InAppUpdateLauncherActivity.this.onNavigationEvent();
                this.label = 1;
                if (withoriginOnNavigationEvent.onExtraCallback(this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
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

    static final class onWarmupCompleted extends SuspendLambda implements Function2<withOnAnimationEventListener, access13800<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            onWarmupCompleted onwarmupcompleted = InAppUpdateLauncherActivity.this.new onWarmupCompleted(access13800Var);
            onwarmupcompleted.L$0 = obj;
            return onwarmupcompleted;
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(withOnAnimationEventListener withonanimationeventlistener, access13800<? super Unit> access13800Var) {
            return create(withonanimationeventlistener, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            withOnAnimationEventListener withonanimationeventlistener = (withOnAnimationEventListener) this.L$0;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            InAppUpdateLauncherActivity.onWarmupCompleted(InAppUpdateLauncherActivity.this, withonanimationeventlistener);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // viva.republica.toss.inappupdate.Hilt_InAppUpdateLauncherActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 43;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        if (!getIntent().getBooleanExtra("should_check_app_update", true)) {
            onWarmupCompleted((withOnAnimationEventListener) onNavigationEvent().onWarmupCompleted().IAuthTabCallback());
            return;
        }
        Object obj = null;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(null), 3, (Object) null);
        ycxycx.onWarmupCompleted(ycxycx.IAuthTabCallback(onNavigationEvent().onWarmupCompleted(), new onWarmupCompleted(null)), TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this));
        int i4 = IAuthTabCallbackStub + 25;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static final void onWarmupCompleted(InAppUpdateLauncherActivity inAppUpdateLauncherActivity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(intentSender, "");
        inAppUpdateLauncherActivity.asBinder.onNavigationEvent(new IPostMessageService.IAuthTabCallback(intentSender).IAuthTabCallback(intent).onExtraCallback(i3, i2).onNavigationEvent());
        int i6 = IAuthTabCallbackDefault + 81;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onWarmupCompleted(withOnAnimationEventListener withonanimationeventlistener) throws Throwable {
        int i = 2 % 2;
        Intent intent = getIntent();
        Object[] objArr = new Object[1];
        a(new int[]{-888246060, -283942402}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 4, objArr);
        String stringExtra = intent.getStringExtra(((String) objArr[0]).intern());
        if (stringExtra == null) {
            stringExtra = onExtraCallbackWithResult.onWarmupCompleted.FLEXIBLE.getValue();
            int i2 = IAuthTabCallbackDefault + 17;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
        }
        IntentSenderForResultStarter externalSyntheticLambda1 = new InAppUpdateLauncherActivity$.ExternalSyntheticLambda1(this);
        if (withonanimationeventlistener instanceof withOnAnimationEventListener.onTransact) {
            int i4 = IAuthTabCallbackStub + 37;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                BaseActivity.IAuthTabCallback(this, (String) null, false, 3, (Object) null);
            } else {
                BaseActivity.IAuthTabCallback(this, (String) null, false, 3, (Object) null);
            }
        } else {
            bo_();
        }
        if (withonanimationeventlistener instanceof withOnAnimationEventListener.IAuthTabCallbackStub) {
            if (!(!Intrinsics.areEqual(stringExtra, onExtraCallbackWithResult.onWarmupCompleted.IMMEDIATE.getValue()))) {
                onNavigationEvent().onExtraCallbackWithResult(this, externalSyntheticLambda1);
                finish();
                return;
            } else {
                if (!Intrinsics.areEqual(stringExtra, onExtraCallbackWithResult.onWarmupCompleted.FLEXIBLE.getValue())) {
                    return;
                }
                onNavigationEvent().onNavigationEvent(this, externalSyntheticLambda1);
                finish();
                return;
            }
        }
        if (!(!(withonanimationeventlistener instanceof withOnAnimationEventListener.onExtraCallbackWithResult))) {
            onJsBridgeReady.IAuthTabCallback(this, R.string.app_setting_version_update_download_requested, 0, 2, (Object) null);
            return;
        }
        if (!(withonanimationeventlistener instanceof withOnAnimationEventListener.onExtraCallback) && !(withonanimationeventlistener instanceof withOnAnimationEventListener.asBinder)) {
            int i5 = IAuthTabCallbackDefault;
            int i6 = i5 + 95;
            IAuthTabCallbackStub = i6 % 128;
            if (i6 % 2 != 0) {
                boolean z = withonanimationeventlistener instanceof withOnAnimationEventListener.onNavigationEvent;
                throw null;
            }
            if (!(withonanimationeventlistener instanceof withOnAnimationEventListener.onNavigationEvent)) {
                int i7 = i5 + 7;
                IAuthTabCallbackStub = i7 % 128;
                int i8 = i7 % 2;
                if (!Intrinsics.areEqual(withonanimationeventlistener, withOnAnimationEventListener.IAuthTabCallbackDefault.onExtraCallbackWithResult)) {
                    return;
                }
            }
        }
        finish();
    }

    public static final class onExtraCallbackWithResult {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        private static int[] onNavigationEvent = {-1643929578, -851485566, 1321238741, -323845980, -2090832375, -1729199597, 1240966425, -1453006138, 317225582, 1536275929, -42745936, -1855545027, 2021385699, 480382661, 972189876, 1171231906, -481124720, -547111202};

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final Intent onExtraCallback(@NotNull Context context, @NotNull onWarmupCompleted onwarmupcompleted, boolean z) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            Intent intent = new Intent(context, (Class<?>) InAppUpdateLauncherActivity.class);
            Object[] objArr = new Object[1];
            a(new int[]{-1789057571, 722466561}, 4 - (ViewConfiguration.getEdgeSlop() >> 16), objArr);
            intent.putExtra(((String) objArr[0]).intern(), onwarmupcompleted.getValue());
            intent.putExtra("should_check_app_update", z);
            int i2 = onExtraCallbackWithResult + 17;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return intent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = onNavigationEvent;
            int i3 = -1469660336;
            if (iArr2 != null) {
                int i4 = $11 + 85;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i6 = 0;
                while (i6 < length) {
                    int i7 = $11 + 7;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 72, 8848 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr3[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i6++;
                        i3 = -1469660336;
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
            int[] iArr5 = onNavigationEvent;
            if (iArr5 != null) {
                int i9 = $11 + 19;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                for (int i11 = 0; i11 < length3; i11++) {
                    Object[] objArr3 = {Integer.valueOf(iArr5[i11])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.getDefaultSize(0, 0), KeyEvent.getDeadChar(0, 0) + 72, 8848 - (Process.myTid() >> 22), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i11] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                }
                iArr5 = iArr6;
            }
            System.arraycopy(iArr5, 0, iArr4, 0, length2);
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                for (int i12 = 0; i12 < 16; i12++) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i12];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), Drawable.resolveOpacity(0, 0) + 39, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 10300, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
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
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.getDefaultSize(0, 0) + 4033), 78 - (ViewConfiguration.getPressedStateDuration() >> 16), Drawable.resolveOpacity(0, 0) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr2, 0, i);
        }
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onTransact;
        int i4 = -1469660336;
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = $11 + 81;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - MotionEvent.axisFromString("")), Color.rgb(0, 0, 0) + 16777288, (ViewConfiguration.getScrollBarSize() >> 8) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
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
        int[] iArr5 = onTransact;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i9 = 0;
            while (i9 < length3) {
                Object[] objArr3 = new Object[1];
                objArr3[i5] = Integer.valueOf(iArr5[i9]);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 72 - KeyEvent.keyCodeFromString(""), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i9] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i9++;
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
            for (int i10 = 0; i10 < 16; i10++) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i10];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.argb(0, 0, 0, 0) + 22252), ((byte) KeyEvent.getModifierMetaStateMask()) + 40, Color.argb(0, 0, 0, 0) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
            }
            int i11 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i11;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i12 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i13 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), (ViewConfiguration.getTouchSlop() >> 8) + 78, 7398 - View.combineMeasuredStates(0, 0), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            i2 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i14 = $10 + 85;
        $11 = i14 % 128;
        int i15 = i14 % 2;
        objArr[0] = str;
    }

    @Override // viva.republica.toss.inappupdate.Hilt_InAppUpdateLauncherActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 19;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackStub + 35;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.inappupdate.Hilt_InAppUpdateLauncherActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 39;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.inappupdate.Hilt_InAppUpdateLauncherActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 77;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            int i4 = 50 / 0;
        }
        int i5 = IAuthTabCallbackStub + 103;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // viva.republica.toss.inappupdate.Hilt_InAppUpdateLauncherActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 37;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = IAuthTabCallbackStub + 35;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    static void IAuthTabCallback() {
        onTransact = new int[]{1480030346, -306859976, 1722307947, -1005664557, 32679947, 1406986377, 1563479811, -680761511, -819286035, 1234637749, -91221566, 1005141652, -2088170604, 1330853249, -1759021501, -229241890, 1070120958, 1398239353};
    }
}
