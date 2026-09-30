package im.toss.tds.compose.component.compound.tab.v1;

import android.os.Process;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.Camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirksExternalSyntheticBackport0;
import o.deprecated_followRedirects;
import o.getSubtitle;
import o.handleNativeAdClick;
import o.setCurrentIndex;
import o.x4ExternalSyntheticLambda4;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final /* synthetic */ class ItemPreset$$ExternalSyntheticLambda3 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public static int onExtraCallbackWithResult;
    public static int onNavigationEvent;
    public final /* synthetic */ x4ExternalSyntheticLambda4 f$0;
    public final /* synthetic */ deprecated_followRedirects f$1;
    public final /* synthetic */ long f$10;
    public final /* synthetic */ Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 f$11;
    public final /* synthetic */ getSubtitle f$12;
    public final /* synthetic */ int f$13;
    public final /* synthetic */ int f$14;
    public final /* synthetic */ int f$15;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ boolean f$3;
    public final /* synthetic */ Function0 f$4;
    public final /* synthetic */ QuirksExternalSyntheticBackport0 f$5;
    public final /* synthetic */ boolean f$6;
    public final /* synthetic */ boolean f$7;
    public final /* synthetic */ handleNativeAdClick.onExtraCallback f$8;
    public final /* synthetic */ long f$9;

    public /* synthetic */ ItemPreset$$ExternalSyntheticLambda3(x4ExternalSyntheticLambda4 x4externalsyntheticlambda4, deprecated_followRedirects deprecated_followredirects, String str, boolean z, Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z2, boolean z3, handleNativeAdClick.onExtraCallback onextracallback, long j, long j2, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getSubtitle getsubtitle, int i, int i2, int i3) {
        this.f$0 = x4externalsyntheticlambda4;
        this.f$1 = deprecated_followredirects;
        this.f$2 = str;
        this.f$3 = z;
        this.f$4 = function0;
        this.f$5 = quirksExternalSyntheticBackport0;
        this.f$6 = z2;
        this.f$7 = z3;
        this.f$8 = onextracallback;
        this.f$9 = j;
        this.f$10 = j2;
        this.f$11 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
        this.f$12 = getsubtitle;
        this.f$13 = i;
        this.f$14 = i2;
        this.f$15 = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        x4ExternalSyntheticLambda4 x4externalsyntheticlambda4 = this.f$0;
        deprecated_followRedirects deprecated_followredirects = this.f$1;
        String str = this.f$2;
        boolean z = this.f$3;
        Function0 function0 = this.f$4;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = this.f$5;
        boolean z2 = this.f$6;
        boolean z3 = this.f$7;
        handleNativeAdClick.onExtraCallback onextracallback = this.f$8;
        long j = this.f$9;
        long j2 = this.f$10;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = this.f$11;
        getSubtitle getsubtitle = this.f$12;
        int i4 = this.f$13;
        int i5 = this.f$14;
        int i6 = this.f$15;
        int iIntValue = ((Integer) obj2).intValue();
        Object[] objArr = {x4externalsyntheticlambda4, deprecated_followredirects, str, Boolean.valueOf(z), function0, quirksExternalSyntheticBackport0, Boolean.valueOf(z2), Boolean.valueOf(z3), onextracallback, Long.valueOf(j), Long.valueOf(j2), camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitle, Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)};
        Unit unit = (Unit) x4ExternalSyntheticLambda4.onExtraCallback(setCurrentIndex.onNavigationEvent(), -1116337501, 1116337501, setCurrentIndex.onNavigationEvent(), objArr, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent());
        int i7 = onExtraCallback + 51;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    public static int IAuthTabCallback() {
        int i = onExtraCallbackWithResult;
        int i2 = i % 5704590;
        onExtraCallbackWithResult = i + 1;
        if (i2 != 0) {
            return onNavigationEvent;
        }
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        onNavigationEvent = elapsedCpuTime;
        return elapsedCpuTime;
    }
}
