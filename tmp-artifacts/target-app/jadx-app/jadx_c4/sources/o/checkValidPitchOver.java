package o;

import im.toss.core.tracker.payload.AppEventPayloadV2;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class checkValidPitchOver implements InterfaceC0059deInitialize {
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface = 0;
    private static int onNavigationEvent = 1;
    private final Object onExtraCallback;
    private final AppEventPayloadV2 onExtraCallbackWithResult;
    private final String onWarmupCompleted;

    static {
        int i = IAuthTabCallback + 65;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof checkValidPitchOver)) {
            int i2 = IAuthTabCallbackStub + 7;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        checkValidPitchOver checkvalidpitchover = (checkValidPitchOver) obj;
        if (!Intrinsics.areEqual(this.onWarmupCompleted, checkvalidpitchover.onWarmupCompleted)) {
            int i4 = asInterface + 107;
            IAuthTabCallbackStub = i4 % 128;
            return i4 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, checkvalidpitchover.onExtraCallbackWithResult)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallback, checkvalidpitchover.onExtraCallback)) {
            int i5 = asInterface + 19;
            IAuthTabCallbackStub = i5 % 128;
            return i5 % 2 == 0;
        }
        int i6 = IAuthTabCallbackStub + 43;
        asInterface = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 99 / 0;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iHashCode = this.onWarmupCompleted.hashCode();
        int iHashCode2 = this.onExtraCallbackWithResult.hashCode();
        Object obj = this.onExtraCallback;
        if (obj == null) {
            int i3 = IAuthTabCallbackStub + 109;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            i = 0;
        } else {
            int iHashCode3 = obj.hashCode();
            int i5 = IAuthTabCallbackStub + 31;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            i = iHashCode3;
        }
        return (((iHashCode * 31) + iHashCode2) * 31) + i;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DomainLogPayloadV2(logDomain=" + this.onWarmupCompleted + ", appEvent=" + this.onExtraCallbackWithResult + ", extra=" + this.onExtraCallback + ")";
        int i2 = IAuthTabCallbackStub + 55;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public checkValidPitchOver(@NotNull String str, @NotNull AppEventPayloadV2 appEventPayloadV2, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(appEventPayloadV2, "");
        this.onWarmupCompleted = str;
        this.onExtraCallbackWithResult = appEventPayloadV2;
        this.onExtraCallback = obj;
    }

    @Override // o.InterfaceC0059deInitialize
    public String onPostMessage() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 51;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 5;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return "domainLogV2";
    }

    @Override // o.InterfaceC0059deInitialize
    public String onMinimized() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 45;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        String str = this.onWarmupCompleted;
        int i5 = i3 + 89;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.InterfaceC0059deInitialize
    public String access100() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 15;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        String strAccess100 = this.onExtraCallbackWithResult.access100();
        if (i3 != 0) {
            int i4 = 71 / 0;
        }
        return strAccess100;
    }

    @Override // o.InterfaceC0059deInitialize
    public String IAuthTabCallbackStubProxy() {
        String strIAuthTabCallbackStubProxy;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 119;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            strIAuthTabCallbackStubProxy = this.onExtraCallbackWithResult.IAuthTabCallbackStubProxy();
            int i3 = 15 / 0;
        } else {
            strIAuthTabCallbackStubProxy = this.onExtraCallbackWithResult.IAuthTabCallbackStubProxy();
        }
        int i4 = IAuthTabCallbackStub + 85;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return strIAuthTabCallbackStubProxy;
        }
        throw null;
    }

    @Override // o.InterfaceC0059deInitialize
    public Map<String, Object> extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 87;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> mapExtraCallbackWithResult = this.onExtraCallbackWithResult.extraCallbackWithResult();
        int i4 = IAuthTabCallbackStub + 11;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 46 / 0;
        }
        return mapExtraCallbackWithResult;
    }

    @Override // o.Deinitialize
    public String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface + 97;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        String strOnWarmupCompleted = this.onExtraCallbackWithResult.onWarmupCompleted();
        int i4 = IAuthTabCallbackStub + 9;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return strOnWarmupCompleted;
    }

    @Override // o.Deinitialize
    public void IAuthTabCallback(@NotNull OutputStream outputStream) throws IOException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(outputStream, "");
        try {
            AppEventPayloadV2 appEventPayloadV2 = this.onExtraCallbackWithResult;
            AppEventPayloadV2 appEventPayloadV22 = (AppEventPayloadV2) AppEventPayloadV2.onExtraCallbackWithResult(forceDomainCheck.IAuthTabCallback(), new Object[]{appEventPayloadV2, 0L, checkValidYaw.onExtraCallback(appEventPayloadV2.extraCallbackWithResult(), this.onExtraCallbackWithResult.onActivityLayout()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262141, null}, forceDomainCheck.IAuthTabCallback(), -1217172885, forceDomainCheck.IAuthTabCallback(), 1217172887, forceDomainCheck.IAuthTabCallback());
            Map mapOnExtraCallback = access8100.onExtraCallback();
            wie2 wie2VarIAuthTabCallback = checkValidYaw.IAuthTabCallback();
            wie2VarIAuthTabCallback.onExtraCallback();
            mapOnExtraCallback.putAll(initRenderFinish.onExtraCallbackWithResult(wie2VarIAuthTabCallback.IAuthTabCallback(AppEventPayloadV2.Companion.serializer(), appEventPayloadV22)));
            mapOnExtraCallback.put("log_domain", initRenderFinish.onNavigationEvent(this.onWarmupCompleted));
            Object obj = this.onExtraCallback;
            if (obj != null) {
                int i2 = asInterface + 105;
                IAuthTabCallbackStub = i2 % 128;
                if (i2 % 2 == 0) {
                    mapOnExtraCallback.put("log_extra", checkValidYaw.IAuthTabCallback().IAuthTabCallback(GetMotionInteractionState.onExtraCallback, obj));
                    throw null;
                }
                mapOnExtraCallback.put("log_extra", checkValidYaw.IAuthTabCallback().IAuthTabCallback(GetMotionInteractionState.onExtraCallback, obj));
            }
            Map mapOnExtraCallbackWithResult = access8100.onExtraCallbackWithResult(mapOnExtraCallback);
            wie2 wie2VarIAuthTabCallback2 = checkValidYaw.IAuthTabCallback();
            JsonObject jsonObject = new JsonObject(mapOnExtraCallbackWithResult);
            wie2VarIAuthTabCallback2.onExtraCallback();
            PangleEncryptUtilsType4.onExtraCallback(wie2VarIAuthTabCallback2, JsonObject.Companion.serializer(), jsonObject, outputStream);
            int i3 = asInterface + 43;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }
}
