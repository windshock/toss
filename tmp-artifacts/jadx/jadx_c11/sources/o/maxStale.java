package o;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import androidx.core.content.ContextCompat;
import com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity;
import im.toss.global.features.kyc.eu.main.cdd.ui.identity_confirm.GlobalKycEuIdentityConfirmViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.noStore;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class maxStale {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final boolean onExtraCallback;

    public static final /* synthetic */ class onExtraCallbackWithResult {
        private static int IAuthTabCallback = 1;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        private static int onWarmupCompleted;

        static {
            int[] iArr = new int[maxAge.values().length];
            try {
                iArr[maxAge.On.ordinal()] = 1;
                int i = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[maxAge.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[maxAge.System.ordinal()] = 3;
                int i2 = onWarmupCompleted + 7;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused3) {
            }
            onExtraCallbackWithResult = iArr;
            int i4 = onWarmupCompleted + 117;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final /* synthetic */ void onWarmupCompleted(maxStale maxstale, Context context, noStore nostore) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        maxstale.onExtraCallbackWithResult(context, nostore);
        int i4 = IAuthTabCallback + 89;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public maxStale() {
        this(true);
    }

    public maxStale(boolean z) {
        this.onExtraCallback = z;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Context $context;
        final /* synthetic */ noStore $haptic;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(Context context, noStore nostore, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$context = context;
            this.$haptic = nostore;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = maxStale.this.new onNavigationEvent(this.$context, this.$haptic, access13800Var);
            int i2 = onNavigationEvent + 17;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 51;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 91;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onExtraCallback + 115;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationeventCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                onnavigationeventCreate.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = onnavigationeventCreate.invokeSuspend(unit);
            int i4 = onNavigationEvent + 15;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
            Unit unit;
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 25;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i2 + 85;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            if (i6 == 0) {
                maxStale.onWarmupCompleted(maxStale.this, this.$context, this.$haptic);
                unit = Unit.INSTANCE;
                int i7 = 77 / 0;
            } else {
                maxStale.onWarmupCompleted(maxStale.this, this.$context, this.$haptic);
                unit = Unit.INSTANCE;
            }
            int i8 = onExtraCallback + 77;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            return unit;
        }
    }

    public final void onWarmupCompleted(@NotNull Context context, @NotNull noStore nostore) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(nostore, "");
        Activity activity = !(context instanceof Activity) ? null : (Activity) context;
        if (activity != null) {
            int i4 = onExtraCallbackWithResult + 83;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                if (!activity.isFinishing()) {
                    return;
                }
            } else if (activity.isFinishing()) {
                return;
            }
        }
        if (Intrinsics.areEqual(nostore, noStore.Companion.onExtraCallbackWithResult())) {
            return;
        }
        if (this.onExtraCallback) {
            maybeUpdateAnimatable.onNavigationEvent(ComponentModelb.onExtraCallback, putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new onNavigationEvent(context, nostore, null), 2, (Object) null);
            return;
        }
        onExtraCallbackWithResult(context, nostore);
        int i5 = onExtraCallbackWithResult + 99;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void onExtraCallbackWithResult(Context context, noStore nostore) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult.onExtraCallbackWithResult[getTcfVendorConsentStatus.Companion.onExtraCallbackWithResult().onExtraCallback().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return;
            }
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            AudioManager audioManager = (AudioManager) ContextCompat.getSystemService(context, AudioManager.class);
            if (audioManager != null) {
                int i3 = onExtraCallbackWithResult + 123;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                if (audioManager.getRingerMode() == 0) {
                    int i5 = IAuthTabCallback + 23;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 == 0) {
                        throw null;
                    }
                    return;
                }
            }
        }
        Vibrator vibrator = (Vibrator) ContextCompat.getSystemService(context, Vibrator.class);
        if (vibrator == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 26 || minFresh.onWarmupCompleted() || minFresh.onNavigationEvent() || vibrator.hasAmplitudeControl()) {
            onExtraCallbackWithResult(vibrator, nostore.IAuthTabCallbackDefault(), nostore.asBinder());
            return;
        }
        int i6 = onExtraCallbackWithResult + 85;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        noStore.onExtraCallback onextracallback = noStore.Companion;
        if (!Intrinsics.areEqual(nostore, onextracallback.onNavigationEvent())) {
            if (!Intrinsics.areEqual(nostore, (noStore) noStore.onExtraCallback.onWarmupCompleted(new Object[]{onextracallback}, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted())) && !Intrinsics.areEqual(nostore, onextracallback.IAuthTabCallbackDefault()) && !Intrinsics.areEqual(nostore, onextracallback.onWarmupCompleted())) {
                int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
                minFresh.onExtraCallback(1820763482, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), -1820763481, new Object[]{vibrator, 100L}, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
                return;
            }
        }
        int iOnExtraCallbackWithResult3 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        minFresh.onExtraCallback(1820763482, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), -1820763481, new Object[]{vibrator, 50L}, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult3);
        int i8 = IAuthTabCallback + 41;
        onExtraCallbackWithResult = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    private final void onExtraCallbackWithResult(Vibrator vibrator, long[] jArr, int[] iArr) {
        VibrationEffect vibrationEffectCreateWaveform;
        int iIntValue;
        int i;
        int i2 = 2 % 2;
        clampToInt clamptointOnExtraCallbackWithResult = getTcfVendorConsentStatus.Companion.onExtraCallbackWithResult();
        if (Build.VERSION.SDK_INT < 26) {
            minFresh.onExtraCallback(vibrator, jArr, -1);
            int i3 = IAuthTabCallback + 81;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        int i4 = onExtraCallbackWithResult + 123;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            clamptointOnExtraCallbackWithResult.onExtraCallbackWithResult();
            throw null;
        }
        float fOnExtraCallbackWithResult = clamptointOnExtraCallbackWithResult.onExtraCallbackWithResult();
        if (iArr != null) {
            List mutableList = ArraysKt.toMutableList(iArr);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(mutableList, 10));
            Iterator it = mutableList.iterator();
            while (it.hasNext()) {
                int i5 = onExtraCallbackWithResult + 95;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    iIntValue = (int) (((Number) it.next()).intValue() * fOnExtraCallbackWithResult);
                    i = 6048;
                } else {
                    iIntValue = (int) (((Number) it.next()).intValue() * fOnExtraCallbackWithResult);
                    i = 255;
                }
                arrayList.add(Integer.valueOf(Math.min(iIntValue, i)));
            }
            vibrationEffectCreateWaveform = VibrationEffect.createWaveform(jArr, CollectionsKt.toIntArray(arrayList), -1);
        } else {
            vibrationEffectCreateWaveform = VibrationEffect.createWaveform(jArr, -1);
        }
        Intrinsics.checkNotNull(vibrationEffectCreateWaveform);
        minFresh.rn_(vibrator, vibrationEffectCreateWaveform);
    }
}
