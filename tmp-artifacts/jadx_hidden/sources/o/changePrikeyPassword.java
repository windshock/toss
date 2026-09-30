package o;

import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import im.toss.devtool.action.quickaction.QuickActionBottomSheetActivity$IAuthTabCallbackStub;
import im.toss.devtool.runtime.data.util.Hilt_SchemeExecutorActivity$1;
import im.toss.global.features.leave.test.GlobalLeaveTestActivity$IAuthTabCallback;
import im.toss.security.impl.malware.MalwareDetectActivity$onExtraCallbackWithResult;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.bindContext;
import o.getBooleanFromAdObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class changePrikeyPassword {
    private static int $10 = 0;
    private static int $11 = 1;
    private static byte[] IAuthTabCallback = {9, 1, 8, -5, 7, -8, 12, -7, 27, -16, -11, 11, 11, 8, 13};
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallback = -1538795507;
    private static handleServerMsgRemoteApiCallback onExtraCallbackWithResult = null;
    private static int onNavigationEvent = 1293571428;
    private static short[] onTransact = null;
    private static int onWarmupCompleted = -1870593598;

    static final class IAuthTabCallback extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackStub = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Fragment $fragment;
        final /* synthetic */ auth $this_setAffiliate;
        int label;
        private static char[] onExtraCallbackWithResult = {32581, 32583, 32636, 32512, 32628, 32625, 32569, 32630, 32635, 32629, 32619, 32627, 32582, 32634, 32639, 32626, 32618, 32637, 32617, 32632};
        private static int onNavigationEvent = -1184333856;
        private static boolean IAuthTabCallback = true;
        private static boolean onExtraCallback = true;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(auth authVar, Fragment fragment, access13800<? super IAuthTabCallback> access13800Var) {
            super(1, access13800Var);
            this.$this_setAffiliate = authVar;
            this.$fragment = fragment;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$this_setAffiliate, this.$fragment, access13800Var);
            int i2 = IAuthTabCallbackStub + 3;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 117;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((access13800) obj);
            int i4 = IAuthTabCallbackStub + 99;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 19 / 0;
            }
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 115;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallbackCreate = create(access13800Var);
            if (i3 == 0) {
                return iAuthTabCallbackCreate.invokeSuspend(Unit.INSTANCE);
            }
            iAuthTabCallbackCreate.invokeSuspend(Unit.INSTANCE);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 75;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (this.label != 0) {
                Object[] objArr = new Object[1];
                a(null, null, new byte[]{-119, -112, -113, -123, -117, -122, -120, -122, -127, -124, -108, -123, -113, -109, -124, -121, -119, -110, -122, -111, -112, -113, -121, -124, -119, -120, -122, -114, -119, -115, -124, -121, -119, -116, -117, -118, -119, -120, -121, -124, -122, -123, -124, -125, -125, -126, -127}, 127 - ExpandableListView.getPackedPositionGroup(0L), objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            ResultKt.onNavigationEvent(obj);
            changePrikeyPassword.onExtraCallback(this.$this_setAffiliate, this.$fragment.getActivity());
            Unit unit = Unit.INSTANCE;
            int i3 = onWarmupCompleted + 95;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) {
            int i2;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr2 = onExtraCallbackWithResult;
            if (cArr2 != null) {
                int i4 = $11 + 85;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                for (int i6 = 0; i6 < length; i6++) {
                    int i7 = $10 + 29;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    cArr3[i6] = MalwareDetectActivity$onExtraCallbackWithResult.x(cArr2[i6]);
                }
                cArr2 = cArr3;
            }
            int iY = GlobalLeaveTestActivity$IAuthTabCallback.y(onNavigationEvent);
            if (onExtraCallback) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iY);
                    Hilt_SchemeExecutorActivity$1.v(defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2);
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (IAuthTabCallback) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iY);
                    Hilt_SchemeExecutorActivity$1.v(defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2);
                }
                objArr[0] = new String(cArr5);
                return;
            }
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i9 = $10 + 93;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback % 1) + defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] << i] / iY);
                    i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted;
                } else {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iY);
                    i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted + 1;
                }
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = i2;
            }
            String str = new String(cArr6);
            int i10 = $11 + 41;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            objArr[0] = str;
        }
    }

    public static final void onNavigationEvent(@NotNull Fragment fragment, @NotNull auth authVar) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(authVar, "");
        onExtraCallbackWithResult(fragment, new IAuthTabCallback(authVar, fragment, null));
        int i2 = IAuthTabCallbackDefault + 71;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 21 / 0;
        }
    }

    public static final void onExtraCallback(@NotNull auth authVar, @Nullable ComponentActivity componentActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 105;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(authVar, "");
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(authVar, "");
        if (componentActivity == null) {
            return;
        }
        IAuthTabCallback(authVar, encryptPKCS8PrikeyInfo.Companion.onNavigationEvent(TimeStamp.onNavigationEvent(decryptPrikey.Companion, componentActivity), componentActivity).onTransact());
        int i3 = IAuthTabCallbackDefault + 47;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final void IAuthTabCallback(@NotNull auth authVar, @NotNull handleServerMsgRemoteApiCallback handleservermsgremoteapicallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 89;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(authVar, "");
        Intrinsics.checkNotNullParameter(handleservermsgremoteapicallback, "");
        if (onExtraCallbackWithResult == handleservermsgremoteapicallback) {
            return;
        }
        onExtraCallbackWithResult = handleservermsgremoteapicallback;
        Object[] objArr = new Object[1];
        a((short) View.MeasureSpec.getMode(0), (byte) View.MeasureSpec.getSize(0), (-885447114) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 379745000 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 7, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((short) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (-885447108) - TextUtils.indexOf("", "", 0), View.MeasureSpec.getMode(0) + 379745013, (-6) - ExpandableListView.getPackedPositionGroup(0L), objArr2);
        authVar.onWarmupCompleted(strIntern, ((String) objArr2[0]).intern(), handleservermsgremoteapicallback.name());
        int i4 = IAuthTabCallbackDefault + 103;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static final void onExtraCallbackWithResult(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, Function1<? super access13800<? super Unit>, ? extends Object> function1) {
        int i = 2 % 2;
        try {
            maybeUpdateAnimatable.onNavigationEvent(TextFieldPressGestureFilterKttapPressTextFieldModifier121ExternalSyntheticLambda0.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0.getLifecycle()), putChannelInfo.onExtraCallback(), (setRandomHost) null, new onNavigationEvent(function1, null), 2, (Object) null);
            int i2 = IAuthTabCallbackDefault + 113;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable unused) {
        }
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 478309011;
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Function1<access13800<? super Unit>, Object> $action;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(Function1<? super access13800<? super Unit>, ? extends Object> function1, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$action = function1;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$action, access13800Var);
            int i2 = onExtraCallbackWithResult + 93;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return onnavigationevent;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 15;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 119;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnExtraCallback;
            }
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 75;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 125;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onWarmupCompleted + 69;
                int i4 = i3 % 128;
                onExtraCallbackWithResult = i4;
                if (i3 % 2 == 0 ? i2 != 1 : i2 != 1) {
                    Object[] objArr = new Object[1];
                    a(Drawable.resolveOpacity(0, 0) + 47, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 10, new char[]{'\t', 22, 65483, 65476, 19, 24, 65476, 16, 16, 5, 7, '\t', 18, '\r', 24, 25, 19, 22, 19, 7, 65476, '\f', 24, '\r', 27, 65476, 65483, '\t', 15, 19, 26, 18, '\r', 65483, 65476, '\t', 22, 19, '\n', '\t', 6, 65476, 65483, '\t', 17, 25, 23}, true, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 278, objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                int i5 = i4 + 117;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                Function1<access13800<? super Unit>, Object> function1 = this.$action;
                this.label = 1;
                if (function1.invoke(this) == objOnWarmupCompleted) {
                    int i7 = onExtraCallbackWithResult + 111;
                    onWarmupCompleted = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 36 / 0;
                    }
                    return objOnWarmupCompleted;
                }
            }
            return Unit.INSTANCE;
        }

        private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) {
            int i4 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
            char[] cArr2 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i5 = $11 + 27;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback + i3);
                int i7 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
                cArr2[i7] = bindContext.access000.g(cArr2[i7], onExtraCallback);
                LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.i(simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1);
            }
            if (i2 > 0) {
                int i8 = $10 + 69;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
                char[] cArr3 = new char[i];
                System.arraycopy(cArr2, 0, cArr3, 0, i);
                System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
                System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
                int i10 = $11 + 21;
                $10 = i10 % 128;
                int i11 = i10 % 2;
            }
            if (!(!z)) {
                char[] cArr4 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
                while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.i(simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1);
                    int i12 = $11 + 7;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                }
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) {
        int i4;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        int iO = getBooleanFromAdObject.onWarmupCompleted.o(i3, onExtraCallback);
        if (iO == -1) {
            int i6 = $11 + 89;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (i4 != 0) {
            int i8 = $11 + 99;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            byte[] bArr = IAuthTabCallback;
            if (bArr != null) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i10 = 0; i10 < length; i10++) {
                    bArr2[i10] = LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.s(bArr[i10]);
                }
                bArr = bArr2;
            }
            iO = bArr != null ? (byte) (((byte) (IAuthTabCallback[getBooleanFromAdObject.onWarmupCompleted.o(i, onWarmupCompleted)] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L)))) : (short) (((short) (onTransact[((int) (onWarmupCompleted ^ (-4629411779493505016L))) + i] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
        }
        if (iO > 0) {
            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iO) - 2) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))) + i4;
            ((StringBuilder) QuickActionBottomSheetActivity$IAuthTabCallbackStub.r(trackSelectionParametersExternalSyntheticLambda0, i2, onNavigationEvent, sb)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
            trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
            byte[] bArr3 = IAuthTabCallback;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                int i11 = $11 + 91;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                for (int i13 = 0; i13 < length2; i13++) {
                    bArr4[i13] = (byte) (bArr3[i13] ^ (-4629411779493505016L));
                }
                bArr3 = bArr4;
            }
            boolean z = bArr3 != null;
            trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
            while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iO) {
                if (z) {
                    byte[] bArr5 = IAuthTabCallback;
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr5[r5] ^ (-4629411779493505016L))) + s)) ^ b));
                } else {
                    short[] sArr = onTransact;
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r5] ^ (-4629411779493505016L))) + s)) ^ b));
                }
                sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
            }
        }
        objArr[0] = sb.toString();
    }
}
