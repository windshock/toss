package im.toss.ads_sdk.ui.activity;

import android.content.Context;
import com.facebook.imagepipeline.core.ProducerSequenceFactory$;
import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullPageActivity$$ExternalSyntheticLambda6 implements getBacktraceNote {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ NativeAdsDto f$0;
    public final /* synthetic */ NativeAdsDto.Creative.FullPage f$1;
    public final /* synthetic */ float f$2;
    public final /* synthetic */ NativeAdsFullPageActivity f$3;
    public final /* synthetic */ Context f$4;

    public /* synthetic */ NativeAdsFullPageActivity$$ExternalSyntheticLambda6(NativeAdsDto nativeAdsDto, NativeAdsDto.Creative.FullPage fullPage, float f, NativeAdsFullPageActivity nativeAdsFullPageActivity, Context context) {
        this.f$0 = nativeAdsDto;
        this.f$1 = fullPage;
        this.f$2 = f;
        this.f$3 = nativeAdsFullPageActivity;
        this.f$4 = context;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 46 / 0;
            return (Unit) NativeAdsFullPageActivity.onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 1331144694, -1331144691, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), new Object[]{this.f$0, this.f$1, Float.valueOf(this.f$2), this.f$3, this.f$4, (DeviceQuirksExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())}, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult());
        }
        return (Unit) NativeAdsFullPageActivity.onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 1331144694, -1331144691, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), new Object[]{this.f$0, this.f$1, Float.valueOf(this.f$2), this.f$3, this.f$4, (DeviceQuirksExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())}, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult());
    }
}
