package viva.republica.toss.network.model.serviceManagement.marketingNotifications;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class Setting {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 1;
    private final String key;
    private final String title;
    private boolean value;

    static {
        int i = onWarmupCompleted + 29;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 59;
        onExtraCallbackWithResult = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Setting)) {
            int i4 = i2 + 35;
            onExtraCallbackWithResult = i4 % 128;
            return i4 % 2 == 0;
        }
        Setting setting = (Setting) obj;
        if (Intrinsics.areEqual(this.key, setting.key)) {
            return Intrinsics.areEqual(this.title, setting.title) && this.value == setting.value;
        }
        int i5 = IAuthTabCallback + 77;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        onExtraCallbackWithResult = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (((this.key.hashCode() - 22) - this.title.hashCode()) << 65) >> Boolean.hashCode(this.value) : (((this.key.hashCode() * 31) + this.title.hashCode()) * 31) + Boolean.hashCode(this.value);
        int i3 = IAuthTabCallback + 89;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Setting(key=" + this.key + ", title=" + this.title + ", value=" + this.value + ")";
        int i2 = IAuthTabCallback + 19;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<Setting> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 111;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Setting$$serializer setting$$serializer = Setting$$serializer.INSTANCE;
            if (i3 == 0) {
                return setting$$serializer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public /* synthetic */ Setting(int i, String str, String str2, boolean z, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 7;
        if (7 != (i & 7)) {
            int i3 = onExtraCallbackWithResult + 101;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                descriptor = Setting$$serializer.INSTANCE.getDescriptor();
                i2 = 27;
            } else {
                descriptor = Setting$$serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = 2 % 2;
        }
        this.key = str;
        this.title = str2;
        this.value = z;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(Setting setting, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, setting.key);
        vylVar.onExtraCallback(serialDescriptor, 1, setting.title);
        vylVar.onNavigationEvent(serialDescriptor, 2, setting.value);
        int i4 = IAuthTabCallback + 9;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.key;
        int i5 = i3 + 109;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return this.title;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallback(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        this.value = z;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.value;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
