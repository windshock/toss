package im.toss.components.alpha.accesstoken;

import android.content.Context;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.AUTextView;
import o.UserChoiceBillingListener;
import o.adInfo;
import o.liq;
import o.okycx;
import o.videoFrameChanged;
import o.vyl;
import o.wie2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AlphaEnvironmentAccessTokenProvider {
    private static int asInterface = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public static final AlphaEnvironmentAccessTokenProvider IAuthTabCallback = new AlphaEnvironmentAccessTokenProvider();
    private static final Lazy onWarmupCompleted = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.alpha.accesstoken.AlphaEnvironmentAccessTokenProvider$$ExternalSyntheticLambda0
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 19;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            String strOnExtraCallback = AlphaEnvironmentAccessTokenProvider.onExtraCallback();
            if (i3 == 0) {
                int i4 = 3 / 0;
            }
            return strOnExtraCallback;
        }
    });

    public static /* synthetic */ String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = onNavigationEvent + 33;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return strOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(adInfo adinfo) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(adinfo);
        int i4 = onExtraCallbackWithResult + 103;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    private AlphaEnvironmentAccessTokenProvider() {
    }

    static {
        int i = asInterface + 81;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallback = IAuthTabCallback.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback());
        int i4 = onExtraCallbackWithResult + 115;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return strOnExtraCallback;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) onWarmupCompleted.getValue();
        int i4 = onExtraCallbackWithResult + 75;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(adInfo adinfo) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(adinfo, "");
        adinfo.IAuthTabCallbackDefault(true);
        adinfo.IAuthTabCallback(true);
        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        adInfo.onExtraCallbackWithResult(-186882588, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), 186882589, new Object[]{adinfo, true}, iOnExtraCallback2, iOnExtraCallback);
        adinfo.onExtraCallbackWithResult(true);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 91;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private final String onExtraCallback(Context context) {
        Object obj;
        int i = 2 % 2;
        Object obj2 = null;
        wie2 wie2VarOnWarmupCompleted = videoFrameChanged.onWarmupCompleted((wie2) null, new Function1() { // from class: im.toss.components.alpha.accesstoken.AlphaEnvironmentAccessTokenProvider$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj3) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 93;
                onExtraCallbackWithResult = i3 % 128;
                adInfo adinfo = (adInfo) obj3;
                if (i3 % 2 != 0) {
                    AlphaEnvironmentAccessTokenProvider.onNavigationEvent(adinfo);
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
                Unit unitOnNavigationEvent = AlphaEnvironmentAccessTokenProvider.onNavigationEvent(adinfo);
                int i4 = onExtraCallbackWithResult + 25;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return unitOnNavigationEvent;
            }
        }, 1, (Object) null);
        try {
            Result.Companion companion = Result.Companion;
            InputStream inputStreamOpen = context.getAssets().open("alpha-env-access-token.json");
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "");
            String text = TextStreamsKt.readText(new InputStreamReader(inputStreamOpen, Charsets.UTF_8));
            wie2VarOnWarmupCompleted.onExtraCallback();
            obj = Result.constructor-impl((AlphaEnvAccessTokenInfo) wie2VarOnWarmupCompleted.onExtraCallback(AlphaEnvAccessTokenInfo.Companion.serializer(), text));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.onExtraCallback(obj)) {
            int i2 = onNavigationEvent + 89;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            obj = null;
        }
        AlphaEnvAccessTokenInfo alphaEnvAccessTokenInfo = (AlphaEnvAccessTokenInfo) obj;
        if (alphaEnvAccessTokenInfo != null) {
            int i4 = onExtraCallbackWithResult + 69;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                alphaEnvAccessTokenInfo.onExtraCallback();
                obj2.hashCode();
                throw null;
            }
            String strOnExtraCallback = alphaEnvAccessTokenInfo.onExtraCallback();
            if (strOnExtraCallback != null) {
                return strOnExtraCallback;
            }
        }
        int i5 = onExtraCallbackWithResult + 97;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return "";
    }

    @liq
    static final class AlphaEnvAccessTokenInfo {
        public static final Companion Companion = new Companion(null);
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;
        private final String token;
        private final String version;

        static {
            int i = onNavigationEvent + 111;
            onExtraCallback = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public AlphaEnvAccessTokenInfo() {
            String str = null;
            this(str, str, 3, (DefaultConstructorMarker) str);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 71;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            int i5 = i3 % 2;
            if (this == obj) {
                int i6 = i4 + 119;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                return true;
            }
            if (!(obj instanceof AlphaEnvAccessTokenInfo)) {
                int i8 = i2 + 5;
                onWarmupCompleted = i8 % 128;
                return i8 % 2 == 0;
            }
            AlphaEnvAccessTokenInfo alphaEnvAccessTokenInfo = (AlphaEnvAccessTokenInfo) obj;
            if (!Intrinsics.areEqual(this.token, alphaEnvAccessTokenInfo.token)) {
                return false;
            }
            if (Intrinsics.areEqual(this.version, alphaEnvAccessTokenInfo.version)) {
                return true;
            }
            int i9 = onWarmupCompleted + 39;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 13;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (this.token.hashCode() * 31) + this.version.hashCode();
            int i4 = onWarmupCompleted + 13;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "AlphaEnvAccessTokenInfo(token=" + this.token + ", version=" + this.version + ")";
            int i2 = IAuthTabCallback + 15;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final class Companion {
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<AlphaEnvAccessTokenInfo> serializer() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 67;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                AlphaEnvironmentAccessTokenProvider$AlphaEnvAccessTokenInfo$$serializer alphaEnvironmentAccessTokenProvider$AlphaEnvAccessTokenInfo$$serializer = AlphaEnvironmentAccessTokenProvider$AlphaEnvAccessTokenInfo$$serializer.INSTANCE;
                if (i3 != 0) {
                    return alphaEnvironmentAccessTokenProvider$AlphaEnvAccessTokenInfo$$serializer;
                }
                throw null;
            }
        }

        public /* synthetic */ AlphaEnvAccessTokenInfo(int i, String str, String str2, okycx okycxVar) {
            if ((i & 1) == 0) {
                this.token = "";
            } else {
                this.token = str;
                int i2 = onWarmupCompleted + 87;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            }
            if ((i & 2) != 0) {
                this.version = str2;
                return;
            }
            int i5 = IAuthTabCallback;
            int i6 = i5 + 109;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            this.version = "";
            int i8 = i5 + 33;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 34 / 0;
            }
        }

        public AlphaEnvAccessTokenInfo(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.token = str;
            this.version = str2;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onWarmupCompleted(AlphaEnvAccessTokenInfo alphaEnvAccessTokenInfo, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                int i2 = IAuthTabCallback + 17;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 94 / 0;
                    if (!Intrinsics.areEqual(alphaEnvAccessTokenInfo.token, "")) {
                        vylVar.onExtraCallback(serialDescriptor, 0, alphaEnvAccessTokenInfo.token);
                    }
                } else if (!Intrinsics.areEqual(alphaEnvAccessTokenInfo.token, "")) {
                }
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                int i4 = onWarmupCompleted + 113;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                boolean zAreEqual = Intrinsics.areEqual(alphaEnvAccessTokenInfo.version, "");
                if (i5 != 0) {
                    int i6 = 27 / 0;
                    if (zAreEqual) {
                        return;
                    }
                } else if (!(!zAreEqual)) {
                    return;
                }
            }
            vylVar.onExtraCallback(serialDescriptor, 1, alphaEnvAccessTokenInfo.version);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ AlphaEnvAccessTokenInfo(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = IAuthTabCallback + 63;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                if (i2 % 2 == 0) {
                    int i4 = 63 / 0;
                }
                int i5 = i3 + 121;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 2 % 2;
                }
                str = "";
            }
            if ((i & 2) != 0) {
                int i7 = onWarmupCompleted + 81;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                int i9 = 2 % 2;
                str2 = "";
            }
            this(str, str2);
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 47;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.token;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
