package im.toss.features.home.core.remote.model;

import im.toss.features.home.core.remote.model.LogoResponse$Logo$;
import im.toss.features.home.core.remote.model.dst.eventlog.ImpressionEventLogResponse;
import im.toss.features.home.core.remote.model.dst.eventlog.ImpressionEventLogResponse$;
import im.toss.features.home.core.remote.model.dst.handler.HandlerResponse;
import im.toss.features.home.core.remote.model.dst.widget.ImageSourceResponse;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TBPermissionHelper;
import o.WindowBridgeExtension3;
import o.WindowBridgeExtension32;
import o.getSpecificKey;
import o.htf31;
import o.liq;
import o.okycx;
import o.setStartParam;
import o.vyl;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class LogoResponse$Logo extends LogoResponse {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final HandlerResponse handler;
    private final double height;
    private final ImageSourceResponse image;
    private final ImpressionEventLogResponse impressionEventLog;
    private final String titleAlt;
    private final double width;

    static {
        int i = onWarmupCompleted + 45;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LogoResponse$Logo(int i, HandlerResponse handlerResponse, ImpressionEventLogResponse impressionEventLogResponse, ImageSourceResponse imageSourceResponse, double d, double d2, String str, okycx okycxVar) {
        super((DefaultConstructorMarker) null);
        if (63 != (i & 63)) {
            int i2 = onNavigationEvent + 65;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 63, LogoResponse$Logo$.serializer.INSTANCE.getDescriptor());
            int i4 = IAuthTabCallback + 113;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        }
        this.handler = handlerResponse;
        this.impressionEventLog = impressionEventLogResponse;
        this.image = imageSourceResponse;
        this.width = d;
        this.height = d2;
        this.titleAlt = str;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(LogoResponse$Logo logoResponse$Logo, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallbackWithResult(serialDescriptor, 0, TBPermissionHelper.onExtraCallbackWithResult, logoResponse$Logo.onWarmupCompleted());
        vylVar.onExtraCallbackWithResult(serialDescriptor, 1, ImpressionEventLogResponse$.serializer.INSTANCE, logoResponse$Logo.onExtraCallbackWithResult());
        vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getSpecificKey.IAuthTabCallback, logoResponse$Logo.image);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 3, logoResponse$Logo.width);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 4, logoResponse$Logo.height);
        vylVar.onExtraCallback(serialDescriptor, 5, logoResponse$Logo.titleAlt);
        int i4 = IAuthTabCallback + 19;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* synthetic */ Object toDto() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback();
        }
        onExtraCallback();
        throw null;
    }

    public HandlerResponse onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 29;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        HandlerResponse handlerResponse = this.handler;
        int i5 = i2 + 107;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return handlerResponse;
        }
        throw null;
    }

    public ImpressionEventLogResponse onExtraCallbackWithResult() {
        ImpressionEventLogResponse impressionEventLogResponse;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 87;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            impressionEventLogResponse = this.impressionEventLog;
            int i4 = 54 / 0;
        } else {
            impressionEventLogResponse = this.impressionEventLog;
        }
        int i5 = i2 + 33;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return impressionEventLogResponse;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public WindowBridgeExtension3.onExtraCallback onExtraCallback() {
        WindowBridgeExtension32 windowBridgeExtension32;
        setStartParam setstartparam;
        setStartParam setstartparam2;
        WindowBridgeExtension32 windowBridgeExtension322;
        int i = 2 % 2;
        ImageSourceResponse imageSourceResponse = this.image;
        if (imageSourceResponse != null) {
            int i2 = onNavigationEvent + 105;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                windowBridgeExtension322 = (WindowBridgeExtension32) imageSourceResponse.toDto();
                int i3 = 11 / 0;
            } else {
                windowBridgeExtension322 = (WindowBridgeExtension32) imageSourceResponse.toDto();
            }
            windowBridgeExtension32 = windowBridgeExtension322;
        } else {
            windowBridgeExtension32 = null;
        }
        double d = this.width;
        double d2 = this.height;
        String str = this.titleAlt;
        HandlerResponse handlerResponseOnWarmupCompleted = onWarmupCompleted();
        if (handlerResponseOnWarmupCompleted != null) {
            int i4 = IAuthTabCallback + 35;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                setstartparam2 = (setStartParam) handlerResponseOnWarmupCompleted.toDto();
                int i5 = 54 / 0;
            } else {
                setstartparam2 = (setStartParam) handlerResponseOnWarmupCompleted.toDto();
            }
            setstartparam = setstartparam2;
        } else {
            setstartparam = null;
        }
        ImpressionEventLogResponse impressionEventLogResponseOnExtraCallbackWithResult = onExtraCallbackWithResult();
        return new WindowBridgeExtension3.onExtraCallback(windowBridgeExtension32, d, d2, str, setstartparam, impressionEventLogResponseOnExtraCallbackWithResult != null ? impressionEventLogResponseOnExtraCallbackWithResult.onNavigationEvent() : null);
    }
}
