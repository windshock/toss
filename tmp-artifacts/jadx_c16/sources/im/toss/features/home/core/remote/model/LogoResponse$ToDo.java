package im.toss.features.home.core.remote.model;

import im.toss.features.home.core.remote.model.LogoResponse$ToDo$;
import im.toss.features.home.core.remote.model.dst.eventlog.ImpressionEventLogResponse;
import im.toss.features.home.core.remote.model.dst.eventlog.ImpressionEventLogResponse$;
import im.toss.features.home.core.remote.model.dst.handler.HandlerResponse;
import im.toss.features.home.core.remote.model.dst.property.ColorAttributeResponse;
import im.toss.features.home.core.remote.model.dst.property.ColorAttributeResponse$;
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
import o.postNotification;
import o.setStartParam;
import o.vyl;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class LogoResponse$ToDo extends LogoResponse {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final HandlerResponse handler;
    private final ImageSourceResponse image;
    private final ImpressionEventLogResponse impressionEventLog;
    private final ColorAttributeResponse primaryColor;
    private final boolean pulse;
    private final ColorAttributeResponse secondaryColor;
    private final String text;

    static {
        int i = onExtraCallbackWithResult + 17;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LogoResponse$ToDo(int i, HandlerResponse handlerResponse, ImpressionEventLogResponse impressionEventLogResponse, ImageSourceResponse imageSourceResponse, String str, boolean z, ColorAttributeResponse colorAttributeResponse, ColorAttributeResponse colorAttributeResponse2, okycx okycxVar) {
        super((DefaultConstructorMarker) null);
        if (127 != (i & 127)) {
            int i2 = onNavigationEvent + 3;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 127, LogoResponse$ToDo$.serializer.INSTANCE.getDescriptor());
            int i4 = IAuthTabCallback + 45;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.handler = handlerResponse;
        this.impressionEventLog = impressionEventLogResponse;
        this.image = imageSourceResponse;
        this.text = str;
        this.pulse = z;
        this.primaryColor = colorAttributeResponse;
        this.secondaryColor = colorAttributeResponse2;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(LogoResponse$ToDo logoResponse$ToDo, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallbackWithResult(serialDescriptor, 0, TBPermissionHelper.onExtraCallbackWithResult, logoResponse$ToDo.IAuthTabCallback());
        vylVar.onExtraCallbackWithResult(serialDescriptor, 1, ImpressionEventLogResponse$.serializer.INSTANCE, logoResponse$ToDo.onExtraCallbackWithResult());
        vylVar.onNavigationEvent(serialDescriptor, 2, getSpecificKey.IAuthTabCallback, logoResponse$ToDo.image);
        vylVar.onExtraCallback(serialDescriptor, 3, logoResponse$ToDo.text);
        vylVar.onNavigationEvent(serialDescriptor, 4, logoResponse$ToDo.pulse);
        ColorAttributeResponse$.serializer serializerVar = ColorAttributeResponse$.serializer.INSTANCE;
        vylVar.onNavigationEvent(serialDescriptor, 5, serializerVar, logoResponse$ToDo.primaryColor);
        vylVar.onNavigationEvent(serialDescriptor, 6, serializerVar, logoResponse$ToDo.secondaryColor);
        int i4 = onNavigationEvent + 7;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
    }

    public /* synthetic */ Object toDto() {
        WindowBridgeExtension3.onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            onextracallbackwithresultOnNavigationEvent = onNavigationEvent();
            int i3 = 41 / 0;
        } else {
            onextracallbackwithresultOnNavigationEvent = onNavigationEvent();
        }
        int i4 = onNavigationEvent + 73;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return onextracallbackwithresultOnNavigationEvent;
    }

    public HandlerResponse IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 67;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        HandlerResponse handlerResponse = this.handler;
        int i5 = i2 + 33;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return handlerResponse;
    }

    public ImpressionEventLogResponse onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 57;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        ImpressionEventLogResponse impressionEventLogResponse = this.impressionEventLog;
        int i5 = i2 + 61;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 97 / 0;
        }
        return impressionEventLogResponse;
    }

    public WindowBridgeExtension3.onExtraCallbackWithResult onNavigationEvent() {
        setStartParam setstartparam;
        int i = 2 % 2;
        HandlerResponse handlerResponseIAuthTabCallback = IAuthTabCallback();
        postNotification postnotificationOnNavigationEvent = null;
        if (handlerResponseIAuthTabCallback != null) {
            int i2 = IAuthTabCallback + 13;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            setstartparam = (setStartParam) handlerResponseIAuthTabCallback.toDto();
        } else {
            int i4 = onNavigationEvent + 17;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            setstartparam = null;
        }
        ImpressionEventLogResponse impressionEventLogResponseOnExtraCallbackWithResult = onExtraCallbackWithResult();
        if (impressionEventLogResponseOnExtraCallbackWithResult != null) {
            int i6 = IAuthTabCallback + 123;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            postnotificationOnNavigationEvent = impressionEventLogResponseOnExtraCallbackWithResult.onNavigationEvent();
        }
        return new WindowBridgeExtension3.onExtraCallbackWithResult(setstartparam, postnotificationOnNavigationEvent, (WindowBridgeExtension32) this.image.toDto(), this.text, this.pulse, this.primaryColor.IAuthTabCallback(), this.secondaryColor.IAuthTabCallback());
    }
}
