package o;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import o.SaversKtExternalSyntheticLambda15;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class Registry implements SaversKtExternalSyntheticLambda15.onNavigationEvent {
    private final Savers_androidKtExternalSyntheticLambda6 onExtraCallbackWithResult;
    private final Savers_androidKtExternalSyntheticLambda5 onWarmupCompleted;

    public Registry(Savers_androidKtExternalSyntheticLambda5 savers_androidKtExternalSyntheticLambda5, @Nullable Savers_androidKtExternalSyntheticLambda6 savers_androidKtExternalSyntheticLambda6) {
        this.onWarmupCompleted = savers_androidKtExternalSyntheticLambda5;
        this.onExtraCallbackWithResult = savers_androidKtExternalSyntheticLambda6;
    }

    @Override // o.SaversKtExternalSyntheticLambda15.onNavigationEvent
    public Bitmap onExtraCallbackWithResult(int i2, int i3, @NonNull Bitmap.Config config) {
        return this.onWarmupCompleted.onExtraCallbackWithResult(i2, i3, config);
    }

    @Override // o.SaversKtExternalSyntheticLambda15.onNavigationEvent
    public void onWarmupCompleted(@NonNull Bitmap bitmap) {
        this.onWarmupCompleted.onWarmupCompleted(bitmap);
    }

    @Override // o.SaversKtExternalSyntheticLambda15.onNavigationEvent
    public byte[] onExtraCallbackWithResult(int i2) {
        Savers_androidKtExternalSyntheticLambda6 savers_androidKtExternalSyntheticLambda6 = this.onExtraCallbackWithResult;
        if (savers_androidKtExternalSyntheticLambda6 == null) {
            return new byte[i2];
        }
        return (byte[]) savers_androidKtExternalSyntheticLambda6.onExtraCallback(i2, byte[].class);
    }

    @Override // o.SaversKtExternalSyntheticLambda15.onNavigationEvent
    public void onWarmupCompleted(@NonNull byte[] bArr) {
        Savers_androidKtExternalSyntheticLambda6 savers_androidKtExternalSyntheticLambda6 = this.onExtraCallbackWithResult;
        if (savers_androidKtExternalSyntheticLambda6 == null) {
            return;
        }
        savers_androidKtExternalSyntheticLambda6.onNavigationEvent((Savers_androidKtExternalSyntheticLambda6) bArr);
    }

    @Override // o.SaversKtExternalSyntheticLambda15.onNavigationEvent
    public int[] onNavigationEvent(int i2) {
        Savers_androidKtExternalSyntheticLambda6 savers_androidKtExternalSyntheticLambda6 = this.onExtraCallbackWithResult;
        if (savers_androidKtExternalSyntheticLambda6 == null) {
            return new int[i2];
        }
        return (int[]) savers_androidKtExternalSyntheticLambda6.onExtraCallback(i2, int[].class);
    }

    @Override // o.SaversKtExternalSyntheticLambda15.onNavigationEvent
    public void onExtraCallbackWithResult(@NonNull int[] iArr) {
        Savers_androidKtExternalSyntheticLambda6 savers_androidKtExternalSyntheticLambda6 = this.onExtraCallbackWithResult;
        if (savers_androidKtExternalSyntheticLambda6 == null) {
            return;
        }
        savers_androidKtExternalSyntheticLambda6.onNavigationEvent((Savers_androidKtExternalSyntheticLambda6) iArr);
    }
}
