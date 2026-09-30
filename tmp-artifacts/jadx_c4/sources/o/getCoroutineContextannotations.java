package o;

import android.app.Dialog;
import im.toss.uikit.base.UIKitBaseActivity;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getCoroutineContextannotations implements SidecarAdapterExternalSyntheticLambda3 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    private final isJacksonCreator IAuthTabCallback;

    @Inject
    public getCoroutineContextannotations(@NotNull isJacksonCreator isjacksoncreator) {
        Intrinsics.checkNotNullParameter(isjacksoncreator, "");
        this.IAuthTabCallback = isjacksoncreator;
    }

    @Override // o.SidecarAdapterExternalSyntheticLambda3
    public Dialog onNavigationEvent(@NotNull UIKitBaseActivity uIKitBaseActivity) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(uIKitBaseActivity, "");
        if (this.IAuthTabCallback.IAuthTabCallback(uIKitBaseActivity)) {
            return new ImageRegionDecoder(uIKitBaseActivity);
        }
        DecoderFactory decoderFactory = new DecoderFactory(uIKitBaseActivity);
        int i4 = onExtraCallback + 31;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return decoderFactory;
    }

    @Override // o.SidecarAdapterExternalSyntheticLambda3
    public void IAuthTabCallback(@Nullable Dialog dialog, long j) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        DimensionPropConverterCompanion dimensionPropConverterCompanion = !((dialog instanceof DimensionPropConverterCompanion) ^ true) ? (DimensionPropConverterCompanion) dialog : null;
        if (dimensionPropConverterCompanion != null) {
            int i5 = i3 + 59;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            DimensionPropConverterCompanion.onExtraCallback(dimensionPropConverterCompanion, j, false, 2, (Object) null);
        }
    }

    @Override // o.SidecarAdapterExternalSyntheticLambda3
    public boolean onWarmupCompleted(@Nullable Dialog dialog) {
        DimensionPropConverterCompanion dimensionPropConverterCompanion;
        int i = 2 % 2;
        if (!(dialog instanceof DimensionPropConverterCompanion)) {
            dimensionPropConverterCompanion = null;
        } else {
            dimensionPropConverterCompanion = (DimensionPropConverterCompanion) dialog;
            int i2 = onExtraCallback + 53;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
        }
        if (dimensionPropConverterCompanion != null) {
            int i4 = onWarmupCompleted + 107;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            if (dimensionPropConverterCompanion.onWarmupCompleted()) {
                int i6 = onExtraCallback + 89;
                onWarmupCompleted = i6 % 128;
                return i6 % 2 == 0;
            }
        }
        return false;
    }

    @Override // o.SidecarAdapterExternalSyntheticLambda3
    public void onExtraCallbackWithResult(@Nullable Dialog dialog) {
        int i = 2 % 2;
        DimensionPropConverterCompanion dimensionPropConverterCompanion = null;
        if (dialog instanceof DimensionPropConverterCompanion) {
            int i2 = onExtraCallback + 69;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            dimensionPropConverterCompanion = (DimensionPropConverterCompanion) dialog;
        } else {
            int i3 = onExtraCallback + 13;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        }
        if (dimensionPropConverterCompanion != null) {
            dimensionPropConverterCompanion.onExtraCallback();
        }
    }
}
