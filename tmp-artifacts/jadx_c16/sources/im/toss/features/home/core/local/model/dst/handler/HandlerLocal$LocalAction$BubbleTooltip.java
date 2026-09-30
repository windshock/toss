package im.toss.features.home.core.local.model.dst.handler;

import im.toss.features.home.core.local.model.dst.eventlog.EventLogLocal;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal$LocalAction$BubbleTooltip$;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal$LocalAction$BubbleTooltip$Data$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.BaseWorkerImplRenderReadyListener;
import o.htf31;
import o.liq;
import o.okycx;
import o.onAlipayJSBridgeReady;
import o.removeNotifyListener;
import o.setStartParam;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class HandlerLocal$LocalAction$BubbleTooltip extends HandlerLocal.LocalAction {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final Data data;
    private final EventLogLocal eventLog;
    private final String id;
    private final String name;
    private final HandlerLocal.RunOption runOption;

    static {
        int i = onExtraCallback + 53;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HandlerLocal$LocalAction$BubbleTooltip)) {
            int i2 = onNavigationEvent + 107;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 35 / 0;
            }
            return false;
        }
        HandlerLocal$LocalAction$BubbleTooltip handlerLocal$LocalAction$BubbleTooltip = (HandlerLocal$LocalAction$BubbleTooltip) obj;
        if (!Intrinsics.areEqual(this.id, handlerLocal$LocalAction$BubbleTooltip.id)) {
            int i4 = onWarmupCompleted + 37;
            onNavigationEvent = i4 % 128;
            return i4 % 2 == 0;
        }
        Object obj2 = null;
        if (!Intrinsics.areEqual(this.name, handlerLocal$LocalAction$BubbleTooltip.name)) {
            int i5 = onWarmupCompleted + 15;
            int i6 = i5 % 128;
            onNavigationEvent = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 93;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 == 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        if (!Intrinsics.areEqual(this.data, handlerLocal$LocalAction$BubbleTooltip.data) || !Intrinsics.areEqual(this.runOption, handlerLocal$LocalAction$BubbleTooltip.runOption)) {
            return false;
        }
        if (Intrinsics.areEqual(this.eventLog, handlerLocal$LocalAction$BubbleTooltip.eventLog)) {
            return true;
        }
        int i9 = onNavigationEvent;
        int i10 = i9 + 25;
        onWarmupCompleted = i10 % 128;
        int i11 = i10 % 2;
        int i12 = i9 + 61;
        onWarmupCompleted = i12 % 128;
        if (i12 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            this.id.hashCode();
            this.name.hashCode();
            this.data.hashCode();
            this.runOption.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode2 = this.id.hashCode();
        int iHashCode3 = this.name.hashCode();
        int iHashCode4 = this.data.hashCode();
        int iHashCode5 = this.runOption.hashCode();
        EventLogLocal eventLogLocal = this.eventLog;
        if (eventLogLocal == null) {
            int i3 = onNavigationEvent + 123;
            onWarmupCompleted = i3 % 128;
            iHashCode = i3 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = eventLogLocal.hashCode();
        }
        return (((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BubbleTooltip(id=" + this.id + ", name=" + this.name + ", data=" + this.data + ", runOption=" + this.runOption + ", eventLog=" + this.eventLog + ")";
        int i2 = onNavigationEvent + 97;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HandlerLocal$LocalAction$BubbleTooltip(int i, String str, String str2, Data data, HandlerLocal.RunOption runOption, EventLogLocal eventLogLocal, okycx okycxVar) {
        SerialDescriptor descriptor;
        super((DefaultConstructorMarker) null);
        int i2 = 7;
        if (7 != (i & 7)) {
            int i3 = onNavigationEvent + 47;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                descriptor = HandlerLocal$LocalAction$BubbleTooltip$.serializer.INSTANCE.getDescriptor();
                i2 = 125;
            } else {
                descriptor = HandlerLocal$LocalAction$BubbleTooltip$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = 2 % 2;
        }
        Object obj = null;
        this.id = str;
        this.name = str2;
        this.data = data;
        if ((i & 8) == 0) {
            this.runOption = HandlerLocal.RunOption.Automatic.INSTANCE;
        } else {
            this.runOption = runOption;
        }
        if ((i & 16) != 0) {
            this.eventLog = eventLogLocal;
            int i5 = onNavigationEvent + 65;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        int i6 = onNavigationEvent + 95;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        this.eventLog = null;
        if (i7 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x003f  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onNavigationEvent(HandlerLocal$LocalAction$BubbleTooltip handlerLocal$LocalAction$BubbleTooltip, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, handlerLocal$LocalAction$BubbleTooltip.id);
        vylVar.onExtraCallback(serialDescriptor, 1, handlerLocal$LocalAction$BubbleTooltip.onNavigationEvent());
        vylVar.onNavigationEvent(serialDescriptor, 2, HandlerLocal$LocalAction$BubbleTooltip$Data$.serializer.INSTANCE, handlerLocal$LocalAction$BubbleTooltip.data);
        if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
            int i4 = onWarmupCompleted + 119;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            if (true ^ Intrinsics.areEqual(handlerLocal$LocalAction$BubbleTooltip.onExtraCallbackWithResult(), HandlerLocal.RunOption.Automatic.INSTANCE)) {
                vylVar.onNavigationEvent(serialDescriptor, 3, BaseWorkerImplRenderReadyListener.onExtraCallbackWithResult, handlerLocal$LocalAction$BubbleTooltip.onExtraCallbackWithResult());
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 4)) {
            int i6 = onWarmupCompleted + 67;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            if (handlerLocal$LocalAction$BubbleTooltip.onExtraCallback() == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 4, onAlipayJSBridgeReady.onExtraCallbackWithResult, handlerLocal$LocalAction$BubbleTooltip.onExtraCallback());
    }

    public /* synthetic */ Object toDto() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        setStartParam setstartparamIAuthTabCallback = IAuthTabCallback();
        int i4 = onNavigationEvent + 15;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return setstartparamIAuthTabCallback;
        }
        throw null;
    }

    public String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.name;
        int i5 = i3 + 121;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public HandlerLocal.RunOption onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        HandlerLocal.RunOption runOption = this.runOption;
        int i5 = i3 + 39;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return runOption;
    }

    public EventLogLocal onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 101;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        EventLogLocal eventLogLocal = this.eventLog;
        int i5 = i2 + 99;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return eventLogLocal;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public setStartParam IAuthTabCallback() {
        removeNotifyListener removenotifylistener;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String str = this.id;
        String strOnNavigationEvent = onNavigationEvent();
        setStartParam.asInterface.onWarmupCompleted.onExtraCallback onExtraCallback2 = this.data.onExtraCallback();
        setStartParam.IAuthTabCallbackStubProxy iAuthTabCallbackStubProxyOnExtraCallback = onExtraCallbackWithResult().onExtraCallback();
        EventLogLocal eventLogLocalOnExtraCallback = onExtraCallback();
        Object obj = null;
        if (eventLogLocalOnExtraCallback != null) {
            int i4 = onWarmupCompleted + 75;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            removenotifylistener = (removeNotifyListener) eventLogLocalOnExtraCallback.toDto();
        } else {
            removenotifylistener = null;
        }
        return new setStartParam.asInterface.onWarmupCompleted(str, strOnNavigationEvent, removenotifylistener, iAuthTabCallbackStubProxyOnExtraCallback, onExtraCallback2);
    }
}
