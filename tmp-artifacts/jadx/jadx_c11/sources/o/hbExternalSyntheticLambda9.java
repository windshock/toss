package o;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.hbExternalSyntheticLambda9;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class hbExternalSyntheticLambda9 {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private static int IAuthTabCallbackStub = 0;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int onTransact = 1;
    private final String IAuthTabCallback;
    private final n1 IAuthTabCallbackDefault;
    private final n5 asBinder;
    private final Long asInterface;
    private final String onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final hc onNavigationEvent;
    private final String onWarmupCompleted;

    public static final /* synthetic */ class IAuthTabCallback {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[hc.values().length];
            try {
                iArr[hc.WarmupTimeout.ordinal()] = 1;
                int i = onExtraCallbackWithResult + 93;
                IAuthTabCallback = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[hc.WarmupFailed.ordinal()] = 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            onWarmupCompleted = iArr;
            int i5 = onExtraCallbackWithResult + 99;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = IAuthTabCallbackStubProxy + 51;
        IAuthTabCallback_Parcel = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ CharSequence onExtraCallbackWithResult(hbExternalSyntheticLambda9 hbexternalsyntheticlambda9, Map.Entry entry) throws UnsupportedEncodingException {
        int i = 2 % 2;
        int i2 = onTransact + 63;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        CharSequence charSequenceOnExtraCallback = onExtraCallback(hbexternalsyntheticlambda9, entry);
        int i4 = IAuthTabCallbackStub + 21;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return charSequenceOnExtraCallback;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 103;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hbExternalSyntheticLambda9)) {
            return false;
        }
        hbExternalSyntheticLambda9 hbexternalsyntheticlambda9 = (hbExternalSyntheticLambda9) obj;
        if (!Intrinsics.areEqual(this.onWarmupCompleted, hbexternalsyntheticlambda9.onWarmupCompleted)) {
            int i3 = onTransact + 69;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (this.onNavigationEvent != hbexternalsyntheticlambda9.onNavigationEvent) {
            int i5 = onTransact + 105;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, hbexternalsyntheticlambda9.onExtraCallbackWithResult)) {
            int i7 = onTransact + 103;
            IAuthTabCallbackStub = i7 % 128;
            return i7 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.onExtraCallback, hbexternalsyntheticlambda9.onExtraCallback) || (!Intrinsics.areEqual(this.IAuthTabCallback, hbexternalsyntheticlambda9.IAuthTabCallback)) || !Intrinsics.areEqual(this.asBinder, hbexternalsyntheticlambda9.asBinder) || !Intrinsics.areEqual(this.asInterface, hbexternalsyntheticlambda9.asInterface)) {
            return false;
        }
        if (Intrinsics.areEqual(this.IAuthTabCallbackDefault, hbexternalsyntheticlambda9.IAuthTabCallbackDefault)) {
            return true;
        }
        int i8 = IAuthTabCallbackStub + 103;
        onTransact = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.onWarmupCompleted.hashCode();
        int iHashCode3 = this.onNavigationEvent.hashCode();
        int iHashCode4 = this.onExtraCallbackWithResult.hashCode();
        int iHashCode5 = this.onExtraCallback.hashCode();
        int iHashCode6 = this.IAuthTabCallback.hashCode();
        int iHashCode7 = this.asBinder.hashCode();
        Long l = this.asInterface;
        int iHashCode8 = 0;
        if (l == null) {
            int i2 = onTransact + 73;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = l.hashCode();
        }
        n1 n1Var = this.IAuthTabCallbackDefault;
        if (n1Var != null) {
            int i4 = IAuthTabCallbackStub + 123;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            iHashCode8 = n1Var.hashCode();
        }
        return (((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode) * 31) + iHashCode8;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ShoppingTabRnSearchEntryFallbackEventPayload(eventName=" + this.onWarmupCompleted + ", reason=" + this.onNavigationEvent + ", fallbackRoute=" + this.onExtraCallbackWithResult + ", sharedBundleName=" + this.onExtraCallback + ", serviceBundleName=" + this.IAuthTabCallback + ", state=" + this.asBinder + ", waitTimeoutMs=" + this.asInterface + ", warmupFailureState=" + this.IAuthTabCallbackDefault + ")";
        int i2 = IAuthTabCallbackStub + 9;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 10 / 0;
        }
        return str;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public hbExternalSyntheticLambda9(@NotNull String str, @NotNull hc hcVar, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull n5 n5Var, @Nullable Long l, @Nullable n1 n1Var) throws NoWhenBranchMatchedException {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(hcVar, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(n5Var, "");
        this.onWarmupCompleted = str;
        this.onNavigationEvent = hcVar;
        this.onExtraCallbackWithResult = str2;
        this.onExtraCallback = str3;
        this.IAuthTabCallback = str4;
        this.asBinder = n5Var;
        this.asInterface = l;
        this.IAuthTabCallbackDefault = n1Var;
        if (StringsKt.isBlank(str)) {
            throw new IllegalArgumentException("eventName must not be blank");
        }
        if (StringsKt.isBlank(str2)) {
            throw new IllegalArgumentException("fallbackRoute must not be blank");
        }
        int i = onTransact + 35;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 != 0) {
            StringsKt.isBlank(str3);
            throw null;
        }
        if (StringsKt.isBlank(str3)) {
            throw new IllegalArgumentException("sharedBundleName must not be blank");
        }
        if (!(!StringsKt.isBlank(str4))) {
            throw new IllegalArgumentException("serviceBundleName must not be blank");
        }
        int i2 = onTransact + 57;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            n5Var.onWarmupCompleted();
            hbExternalSyntheticLambda1 hbexternalsyntheticlambda1 = hbExternalSyntheticLambda1.Fallback;
            throw null;
        }
        if (n5Var.onWarmupCompleted() != hbExternalSyntheticLambda1.Fallback) {
            throw new IllegalArgumentException("fallback event requires fallback entry request state");
        }
        int i3 = IAuthTabCallback.onWarmupCompleted[hcVar.ordinal()];
        if (i3 == 1) {
            if (l == null) {
                throw new IllegalArgumentException("timeout fallback event requires waitTimeoutMs");
            }
            long jLongValue = l.longValue();
            if (0 > jLongValue || jLongValue >= 301) {
                throw new IllegalArgumentException("waitTimeoutMs must be in 0..300");
            }
            int i4 = onTransact + 95;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 29 / 0;
                if (n1Var == null) {
                    return;
                }
            } else if (n1Var == null) {
                return;
            }
            throw new IllegalArgumentException("timeout fallback event must not carry warmup failure state");
        }
        int i6 = IAuthTabCallbackStub + 39;
        int i7 = i6 % 128;
        onTransact = i7;
        int i8 = i6 % 2;
        if (i3 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int i9 = i7 + 55;
        IAuthTabCallbackStub = i9 % 128;
        int i10 = i9 % 2;
        if (l != null) {
            throw new IllegalArgumentException("warmup failure fallback event must not carry timeout");
        }
        if (n1Var == null) {
            throw new IllegalArgumentException("warmup failure fallback event requires warmup failure state");
        }
        if (!Intrinsics.areEqual(n1Var.IAuthTabCallback(), n5Var)) {
            throw new IllegalArgumentException("warmup failure fallback event state must match failure state");
        }
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 19;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        String str = this.onExtraCallbackWithResult;
        int i5 = i3 + 39;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 81 / 0;
        }
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 3;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        String str = this.IAuthTabCallback;
        if (i3 == 0) {
            int i4 = 76 / 0;
        }
        return str;
    }

    public final Map<String, String> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 115;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        LinkedHashMap linkedHashMapOnExtraCallback = access8100.onExtraCallback(new Pair[]{getWrite.IAuthTabCallback("shoppingTabRnWarmupFallbackEventName", this.onWarmupCompleted), getWrite.IAuthTabCallback("shoppingTabRnWarmupFallbackReason", this.onNavigationEvent.name()), getWrite.IAuthTabCallback("shoppingTabRnWarmupFallbackSharedBundleName", this.onExtraCallback), getWrite.IAuthTabCallback("shoppingTabRnWarmupFallbackServiceBundleName", this.IAuthTabCallback), getWrite.IAuthTabCallback("shoppingTabRnWarmupFallbackTabState", this.asBinder.IAuthTabCallbackDefault().name()), getWrite.IAuthTabCallback("shoppingTabRnWarmupFallbackFragmentState", this.asBinder.onExtraCallback().name()), getWrite.IAuthTabCallback("shoppingTabRnWarmupFallbackSharedBundleState", this.asBinder.IAuthTabCallback().name()), getWrite.IAuthTabCallback("shoppingTabRnWarmupFallbackReactHostStarted", String.valueOf(this.asBinder.onNavigationEvent())), getWrite.IAuthTabCallback("shoppingTabRnWarmupFallbackServiceBundleLoaded", String.valueOf(this.asBinder.onExtraCallbackWithResult())), getWrite.IAuthTabCallback("shoppingTabRnWarmupFallbackEntryRequestState", this.asBinder.onWarmupCompleted().name())});
        Long l = this.asInterface;
        if (l != null) {
        }
        n1 n1Var = this.IAuthTabCallbackDefault;
        if (n1Var != null) {
            int i4 = onTransact + 57;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                linkedHashMapOnExtraCallback.put("shoppingTabRnWarmupFallbackWarmupFailureReason", n1Var.onExtraCallback().name());
                String strOnExtraCallbackWithResult = n1Var.onExtraCallbackWithResult();
                if (strOnExtraCallbackWithResult != null) {
                }
                String strOnTransact = n1Var.onTransact();
                if (strOnTransact != null) {
                    int i5 = IAuthTabCallbackStub + 35;
                    onTransact = i5 % 128;
                    int i6 = i5 % 2;
                    linkedHashMapOnExtraCallback.put("shoppingTabRnWarmupFallbackThrowableMessage", strOnTransact);
                }
            } else {
                linkedHashMapOnExtraCallback.put("shoppingTabRnWarmupFallbackWarmupFailureReason", n1Var.onExtraCallback().name());
                n1Var.onExtraCallbackWithResult();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        return linkedHashMapOnExtraCallback;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 77;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(this.onExtraCallbackWithResult, onWarmupCompleted());
        int i4 = onTransact + 91;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return strOnExtraCallbackWithResult;
    }

    private final String onExtraCallbackWithResult(String str, Map<String, String> map) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 101;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        if (!map.isEmpty()) {
            return str + (StringsKt.contains$default(str, "?", false, 2, (Object) null) ? "&" : "?") + CollectionsKt.joinToString$default(map.entrySet(), "&", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: im.toss.rn.toss.core.shopping.ShoppingTabRnSearchEntryFallbackEventPayload$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj) throws UnsupportedEncodingException {
                    CharSequence charSequenceOnExtraCallbackWithResult;
                    int i4 = 2 % 2;
                    int i5 = onNavigationEvent + 59;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        charSequenceOnExtraCallbackWithResult = hbExternalSyntheticLambda9.onExtraCallbackWithResult(this.f$0, (Map.Entry) obj);
                        int i6 = 76 / 0;
                    } else {
                        charSequenceOnExtraCallbackWithResult = hbExternalSyntheticLambda9.onExtraCallbackWithResult(this.f$0, (Map.Entry) obj);
                    }
                    int i7 = IAuthTabCallback + 37;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                    return charSequenceOnExtraCallbackWithResult;
                }
            }, 30, (Object) null);
        }
        int i4 = IAuthTabCallbackStub + 97;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static final CharSequence onExtraCallback(hbExternalSyntheticLambda9 hbexternalsyntheticlambda9, Map.Entry entry) throws UnsupportedEncodingException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(entry, "");
        String str = (String) entry.getKey();
        String str2 = (String) entry.getValue();
        String str3 = hbexternalsyntheticlambda9.onExtraCallback(str) + "=" + hbexternalsyntheticlambda9.onExtraCallback(str2);
        int i2 = onTransact + 19;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return str3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final String onExtraCallback(String str) throws UnsupportedEncodingException {
        String strEncode;
        String str2;
        String str3;
        boolean z;
        int i;
        int i2 = 2 % 2;
        int i3 = onTransact + 45;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            strEncode = URLEncoder.encode(str, StandardCharsets.UTF_8.name());
            Intrinsics.checkNotNullExpressionValue(strEncode, "");
            str2 = "+";
            str3 = "%20";
            z = false;
            i = 2;
        } else {
            strEncode = URLEncoder.encode(str, StandardCharsets.UTF_8.name());
            Intrinsics.checkNotNullExpressionValue(strEncode, "");
            str2 = "+";
            str3 = "%20";
            z = false;
            i = 4;
        }
        String strReplace$default = StringsKt.replace$default(strEncode, str2, str3, z, i, (Object) null);
        int i4 = IAuthTabCallbackStub + 109;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return strReplace$default;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }
}
