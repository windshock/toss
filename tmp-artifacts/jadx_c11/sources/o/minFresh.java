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
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.noStore;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class minFresh {
    private static int IAuthTabCallback = 0;
    private static final maxStale onExtraCallback = new maxStale();
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i6;
        int i9 = (~(i7 | i8)) | (~(i7 | i)) | (~(i8 | i));
        int i10 = ~(i6 | i7);
        int i11 = i | i10 | (~(i8 | i4));
        int i12 = i + i4 + i5 + ((-393945980) * i3) + (1728320405 * i2);
        int i13 = i12 * i12;
        int i14 = ((-1552544754) * i) + 1566572544 + ((-1100352524) * i4) + (i9 * (-226096115)) + ((-226096115) * i10) + (226096115 * i11) + ((-1326448640) * i5) + (2076180480 * i3) + ((-877658112) * i2) + (214302720 * i13);
        int i15 = ((i * (-252835662)) - 192251156) + (i4 * (-252834676)) + (i9 * (-493)) + (i10 * (-493)) + (i11 * 493) + (i5 * (-252835169)) + (i3 * 1574575612) + (i2 * 147979147) + (i13 * (-1426456576));
        if (i14 + (i15 * i15 * 2075787264) != 1) {
            return onExtraCallbackWithResult(objArr);
        }
        Vibrator vibrator = (Vibrator) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int i16 = 2 % 2;
        int i17 = onExtraCallbackWithResult + 93;
        IAuthTabCallback = i17 % 128;
        int i18 = i17 % 2;
        onWarmupCompleted(vibrator, jLongValue);
        int i19 = IAuthTabCallback + 107;
        onExtraCallbackWithResult = i19 % 128;
        int i20 = i19 % 2;
        return null;
    }

    public static final /* synthetic */ void onExtraCallback(Vibrator vibrator, long[] jArr, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 69;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        onWarmupCompleted(vibrator, jArr, i);
        if (i4 == 0) {
            int i5 = 36 / 0;
        }
        int i6 = IAuthTabCallback + 45;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final /* synthetic */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult();
        if (i3 == 0) {
            int i4 = 39 / 0;
        }
        return zOnExtraCallbackWithResult;
    }

    public static final /* synthetic */ boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = IAuthTabCallback();
        int i4 = onExtraCallbackWithResult + 71;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return zIAuthTabCallback;
    }

    public static final /* synthetic */ void rn_(Vibrator vibrator, VibrationEffect vibrationEffect) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {vibrator, vibrationEffect};
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        if (i3 != 0) {
            int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
            onExtraCallback(1420917965, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), -1420917965, objArr, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
            obj.hashCode();
            throw null;
        }
        int iOnExtraCallbackWithResult3 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        onExtraCallback(1420917965, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), -1420917965, objArr, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult);
        int i4 = IAuthTabCallback + 101;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static {
        int i = onWarmupCompleted + 95;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ void IAuthTabCallback(Context context, noStore nostore, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = IAuthTabCallback + 95;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                Object[] objArr = {noStore.Companion};
                int iOnWarmupCompleted = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
                throw null;
            }
            Object[] objArr2 = {noStore.Companion};
            int iOnWarmupCompleted2 = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
            nostore = (noStore) noStore.onExtraCallback.onWarmupCompleted(objArr2, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 502194663, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -502194662, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted2);
        }
        onNavigationEvent(context, nostore);
        int i4 = onExtraCallbackWithResult + 39;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final void onNavigationEvent(@NotNull Context context, @NotNull noStore nostore) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(nostore, "");
            onExtraCallback.onWarmupCompleted(context, nostore);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(nostore, "");
        onExtraCallback.onWarmupCompleted(context, nostore);
        int i3 = onExtraCallbackWithResult + 109;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    public static /* synthetic */ void onWarmupCompleted(Context context, long[] jArr, int[] iArr, int i, Object obj) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = onExtraCallbackWithResult + 73;
            int i4 = i3 % 128;
            IAuthTabCallback = i4;
            if (i3 % 2 != 0) {
                throw null;
            }
            int i5 = i4 + 69;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            iArr = null;
        }
        onExtraCallback(context, jArr, iArr);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void onExtraCallback(@NotNull Context context, @NotNull long[] jArr, @Nullable int[] iArr) throws NoWhenBranchMatchedException {
        VibrationEffect vibrationEffectCreateWaveform;
        int iIntValue;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(jArr, "");
        Object obj = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            int i3 = onExtraCallbackWithResult + 33;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                if (activity.isFinishing()) {
                    return;
                }
            } else if (activity.isFinishing()) {
                return;
            }
        }
        clampToInt clamptointOnExtraCallbackWithResult = getTcfVendorConsentStatus.Companion.onExtraCallbackWithResult();
        int i4 = IAuthTabCallback.onExtraCallbackWithResult[clamptointOnExtraCallbackWithResult.onExtraCallback().ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                return;
            }
            if (i4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            int i5 = onExtraCallbackWithResult + 55;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            AudioManager audioManager = (AudioManager) ContextCompat.getSystemService(context, AudioManager.class);
            if (audioManager != null) {
                int i7 = IAuthTabCallback + 117;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                if (audioManager.getRingerMode() == 0) {
                    return;
                }
            }
        }
        Vibrator vibrator = (Vibrator) ContextCompat.getSystemService(context, Vibrator.class);
        if (vibrator != null) {
            int i9 = IAuthTabCallback + 39;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            if (Build.VERSION.SDK_INT < 26) {
                onWarmupCompleted(vibrator, jArr, -1);
                return;
            }
            int i11 = onExtraCallbackWithResult + 75;
            IAuthTabCallback = i11 % 128;
            if (i11 % 2 != 0) {
                IAuthTabCallback();
                obj.hashCode();
                throw null;
            }
            if (!IAuthTabCallback() && !onExtraCallbackWithResult() && !vibrator.hasAmplitudeControl()) {
                onWarmupCompleted(vibrator, 100L);
                return;
            }
            float fOnExtraCallbackWithResult = clamptointOnExtraCallbackWithResult.onExtraCallbackWithResult();
            if (iArr != null) {
                List mutableList = ArraysKt.toMutableList(iArr);
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(mutableList, 10));
                Iterator it = mutableList.iterator();
                while (it.hasNext()) {
                    int i12 = onExtraCallbackWithResult + 9;
                    IAuthTabCallback = i12 % 128;
                    if (i12 % 2 != 0) {
                        iIntValue = (int) (((Number) it.next()).intValue() + fOnExtraCallbackWithResult);
                        i = 26097;
                    } else {
                        iIntValue = (int) (((Number) it.next()).intValue() * fOnExtraCallbackWithResult);
                        i = 255;
                    }
                    arrayList.add(Integer.valueOf(Math.min(iIntValue, i)));
                    int i13 = IAuthTabCallback + 25;
                    onExtraCallbackWithResult = i13 % 128;
                    int i14 = i13 % 2;
                }
                vibrationEffectCreateWaveform = VibrationEffect.createWaveform(jArr, CollectionsKt.toIntArray(arrayList), -1);
            } else {
                vibrationEffectCreateWaveform = VibrationEffect.createWaveform(jArr, -1);
            }
            Intrinsics.checkNotNull(vibrationEffectCreateWaveform);
            int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
            onExtraCallback(1420917965, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), -1420917965, new Object[]{vibrator, vibrationEffectCreateWaveform}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
        }
    }

    private static final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zEquals = StringsKt.equals("LM-Q520N", Build.MODEL, true);
        int i4 = IAuthTabCallback + 79;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return zEquals;
        }
        throw null;
    }

    private static final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zEquals = StringsKt.equals("Redmi Note 12", Build.MODEL, true);
        int i4 = IAuthTabCallback + 75;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return zEquals;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onWarmupCompleted(Vibrator vibrator, long j) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onExtraCallbackWithResult = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                vibrator.vibrate(j);
            } else {
                vibrator.vibrate(j);
                throw null;
            }
        } catch (Exception unused) {
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Vibrator vibrator = (Vibrator) objArr[0];
        VibrationEffect vibrationEffect = (VibrationEffect) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        try {
            vibrator.vibrate(vibrationEffect);
            int i4 = IAuthTabCallback + 25;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return null;
            }
            throw null;
        } catch (Exception unused) {
            return null;
        }
    }

    private static final void onWarmupCompleted(Vibrator vibrator, long[] jArr, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        try {
            vibrator.vibrate(jArr, i);
            int i5 = IAuthTabCallback + 43;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        } catch (Exception unused) {
        }
    }

    public static final /* synthetic */ void IAuthTabCallback(Vibrator vibrator, long j) {
        Object[] objArr = {vibrator, Long.valueOf(j)};
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        onExtraCallback(1820763482, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), -1820763481, objArr, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
    }

    private static final void ro_(Vibrator vibrator, VibrationEffect vibrationEffect) {
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        onExtraCallback(1420917965, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, -1420917965, new Object[]{vibrator, vibrationEffect}, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
    }
}
