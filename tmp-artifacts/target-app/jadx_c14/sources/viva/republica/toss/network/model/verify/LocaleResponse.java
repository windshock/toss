package viva.republica.toss.network.model.verify;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.verify.LocaleResponse$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class LocaleResponse {
    public static final Companion Companion = new Companion(null);
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String locale;

    static {
        int i = onWarmupCompleted + 71;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 43;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        if (i3 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i5 = i4 + 1;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(!(obj instanceof LocaleResponse))) {
            return Intrinsics.areEqual(this.locale, ((LocaleResponse) obj).locale);
        }
        int i7 = i2 + 65;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.locale;
        if (str != null) {
            return str.hashCode();
        }
        int i5 = i3 + 105;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LocaleResponse(locale=" + this.locale + ")";
        int i2 = onExtraCallbackWithResult + 101;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LocaleResponse> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 63;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            LocaleResponse$.serializer serializerVar = LocaleResponse$.serializer.INSTANCE;
            if (i3 != 0) {
                return serializerVar;
            }
            throw null;
        }
    }

    public /* synthetic */ LocaleResponse(int i, String str, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = onExtraCallback + 85;
            onExtraCallbackWithResult = i2 % 128;
            htf31.onExtraCallbackWithResult(i, 1, (i2 % 2 != 0 ? LocaleResponse$.serializer.INSTANCE : LocaleResponse$.serializer.INSTANCE).getDescriptor());
            int i3 = 2 % 2;
        }
        this.locale = str;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(LocaleResponse localeResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, localeResponse.locale);
        int i4 = onExtraCallbackWithResult + 35;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 113;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.locale;
        int i5 = i2 + 111;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
