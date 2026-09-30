package im.toss.features.alltab.feature.total_service.feature.mini_home.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirksExternalSyntheticBackport0;
import o.onSegItemCheckedChanged;
import o.switchToSearchBar;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TotalServiceMiniHomeSectionKt$$ExternalSyntheticLambda1 implements Function2 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ switchToSearchBar f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ Function1 f$2;
    public final /* synthetic */ QuirksExternalSyntheticBackport0 f$3;
    public final /* synthetic */ int f$4;
    public final /* synthetic */ int f$5;

    public /* synthetic */ TotalServiceMiniHomeSectionKt$$ExternalSyntheticLambda1(switchToSearchBar switchtosearchbar, Function1 function1, Function1 function12, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2) {
        this.f$0 = switchtosearchbar;
        this.f$1 = function1;
        this.f$2 = function12;
        this.f$3 = quirksExternalSyntheticBackport0;
        this.f$4 = i;
        this.f$5 = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onSegItemCheckedChanged.onExtraCallbackWithResult(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = onNavigationEvent + 51;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
