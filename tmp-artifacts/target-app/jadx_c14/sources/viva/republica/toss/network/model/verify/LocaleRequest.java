package viva.republica.toss.network.model.verify;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.verify.LocaleRequest$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class LocaleRequest {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final String loginToken;

    static {
        int i = onWarmupCompleted + 113;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocaleRequest)) {
            return false;
        }
        if (Intrinsics.areEqual(this.loginToken, ((LocaleRequest) obj).loginToken)) {
            return true;
        }
        int i3 = onExtraCallback + 69;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.loginToken.hashCode();
        int i4 = IAuthTabCallback + 9;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LocaleRequest(loginToken=" + this.loginToken + ")";
        int i2 = onExtraCallback + 109;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LocaleRequest> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 41;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            LocaleRequest$.serializer serializerVar = LocaleRequest$.serializer.INSTANCE;
            int i4 = onExtraCallback + 7;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 21 / 0;
            }
            return serializerVar;
        }
    }

    public /* synthetic */ LocaleRequest(int i, String str, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = IAuthTabCallback + 101;
            onExtraCallback = i2 % 128;
            htf31.onExtraCallbackWithResult(i, 1, (i2 % 2 == 0 ? LocaleRequest$.serializer.INSTANCE : LocaleRequest$.serializer.INSTANCE).getDescriptor());
            int i3 = onExtraCallback + 15;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        }
        this.loginToken = str;
    }

    public LocaleRequest(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.loginToken = str;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(LocaleRequest localeRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, localeRequest.loginToken);
        int i4 = onExtraCallback + 83;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
