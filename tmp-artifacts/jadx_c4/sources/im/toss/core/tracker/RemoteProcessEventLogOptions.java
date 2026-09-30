package im.toss.core.tracker;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonObject;
import o.access8100;
import o.encryptType4;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RemoteProcessEventLogOptions {
    public static final Companion Companion = new Companion(null);
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final String defaultService;
    private final JsonObject extraParams;
    private final String logNameKey;

    static {
        int i = onExtraCallback + 1;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            int i2 = 91 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof im.toss.core.tracker.RemoteProcessEventLogOptions) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r1 = r1 + 103;
        im.toss.core.tracker.RemoteProcessEventLogOptions.onNavigationEvent = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r6 = (im.toss.core.tracker.RemoteProcessEventLogOptions) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.logNameKey, r6.logNameKey) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        r6 = im.toss.core.tracker.RemoteProcessEventLogOptions.onExtraCallbackWithResult + 89;
        im.toss.core.tracker.RemoteProcessEventLogOptions.onNavigationEvent = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if ((r6 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.defaultService, r6.defaultService) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        r6 = im.toss.core.tracker.RemoteProcessEventLogOptions.onExtraCallbackWithResult + 101;
        im.toss.core.tracker.RemoteProcessEventLogOptions.onNavigationEvent = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
    
        if ((r6 % 2) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.extraParams, r6.extraParams) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0061, code lost:
    
        r6 = im.toss.core.tracker.RemoteProcessEventLogOptions.onNavigationEvent + 107;
        im.toss.core.tracker.RemoteProcessEventLogOptions.onExtraCallbackWithResult = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        if ((r6 % 2) == 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006e, code lost:
    
        r6 = im.toss.core.tracker.RemoteProcessEventLogOptions.onExtraCallbackWithResult + 123;
        im.toss.core.tracker.RemoteProcessEventLogOptions.onNavigationEvent = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0077, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 49;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 20 / 0;
        }
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.logNameKey.hashCode() * 31) + this.defaultService.hashCode()) * 31) + this.extraParams.hashCode();
        int i4 = onNavigationEvent + 1;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RemoteProcessEventLogOptions(logNameKey=" + this.logNameKey + ", defaultService=" + this.defaultService + ", extraParams=" + this.extraParams + ")";
        int i2 = onNavigationEvent + 83;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<RemoteProcessEventLogOptions> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 67;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            RemoteProcessEventLogOptions$$serializer remoteProcessEventLogOptions$$serializer = RemoteProcessEventLogOptions$$serializer.INSTANCE;
            int i4 = IAuthTabCallback + 85;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 / 0;
            }
            return remoteProcessEventLogOptions$$serializer;
        }
    }

    public /* synthetic */ RemoteProcessEventLogOptions(int i, String str, String str2, JsonObject jsonObject, okycx okycxVar) {
        if (3 != (i & 3)) {
            htf31.onExtraCallbackWithResult(i, 3, RemoteProcessEventLogOptions$$serializer.INSTANCE.getDescriptor());
            int i2 = onExtraCallbackWithResult + 17;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        }
        this.logNameKey = str;
        this.defaultService = str2;
        if ((i & 4) == 0) {
            this.extraParams = new JsonObject(access8100.onNavigationEvent());
            return;
        }
        this.extraParams = jsonObject;
        int i4 = onNavigationEvent + 97;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public RemoteProcessEventLogOptions(@NotNull String str, @NotNull String str2, @NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        this.logNameKey = str;
        this.defaultService = str2;
        this.extraParams = jsonObject;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(RemoteProcessEventLogOptions remoteProcessEventLogOptions, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, remoteProcessEventLogOptions.logNameKey);
        vylVar.onExtraCallback(serialDescriptor, 1, remoteProcessEventLogOptions.defaultService);
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || !Intrinsics.areEqual(remoteProcessEventLogOptions.extraParams, new JsonObject(access8100.onNavigationEvent()))) {
            vylVar.onNavigationEvent(serialDescriptor, 2, encryptType4.IAuthTabCallback, remoteProcessEventLogOptions.extraParams);
            int i4 = onExtraCallbackWithResult + 57;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.logNameKey;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.defaultService;
        int i5 = i3 + 43;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final JsonObject IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 73;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        JsonObject jsonObject = this.extraParams;
        int i5 = i2 + 107;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return jsonObject;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
