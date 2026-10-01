package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface dyycx {
    public static final onWarmupCompleted Builtins = onWarmupCompleted.$$INSTANCE;

    String onExtraCallback(@NotNull SerialDescriptor serialDescriptor, int i, @NotNull String str);

    public static final class onWarmupCompleted {
        static final /* synthetic */ onWarmupCompleted $$INSTANCE = new onWarmupCompleted();
        private static final dyycx SnakeCase = new onExtraCallbackWithResult();
        private static final dyycx KebabCase = new C0027onWarmupCompleted();

        private onWarmupCompleted() {
        }

        public static final class onExtraCallbackWithResult implements dyycx {
            onExtraCallbackWithResult() {
            }

            @Override // o.dyycx
            public String onExtraCallback(SerialDescriptor serialDescriptor, int i, String str) {
                Intrinsics.checkNotNullParameter(serialDescriptor, "");
                Intrinsics.checkNotNullParameter(str, "");
                return onWarmupCompleted.$$INSTANCE.IAuthTabCallback(str, '_');
            }

            public String toString() {
                return "kotlinx.serialization.json.JsonNamingStrategy.SnakeCase";
            }
        }

        /* renamed from: o.dyycx$onWarmupCompleted$onWarmupCompleted, reason: collision with other inner class name */
        public static final class C0027onWarmupCompleted implements dyycx {
            C0027onWarmupCompleted() {
            }

            @Override // o.dyycx
            public String onExtraCallback(SerialDescriptor serialDescriptor, int i, String str) {
                Intrinsics.checkNotNullParameter(serialDescriptor, "");
                Intrinsics.checkNotNullParameter(str, "");
                return onWarmupCompleted.$$INSTANCE.IAuthTabCallback(str, '-');
            }

            public String toString() {
                return "kotlinx.serialization.json.JsonNamingStrategy.KebabCase";
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String IAuthTabCallback(String str, char c) {
            StringBuilder sb = new StringBuilder(str.length() << 1);
            Character chValueOf = null;
            int i = 0;
            for (int i2 = 0; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (Character.isUpperCase(cCharAt)) {
                    if (i == 0 && sb.length() > 0 && StringsKt___StringsKt.last(sb) != c) {
                        sb.append(c);
                    }
                    if (chValueOf != null) {
                        sb.append(chValueOf.charValue());
                    }
                    i++;
                    chValueOf = Character.valueOf(Character.toLowerCase(cCharAt));
                } else {
                    if (chValueOf != null) {
                        if (i > 1 && Character.isLetter(cCharAt)) {
                            sb.append(c);
                        }
                        sb.append(chValueOf.charValue());
                        chValueOf = null;
                        i = 0;
                    }
                    sb.append(cCharAt);
                }
            }
            if (chValueOf != null) {
                sb.append(chValueOf.charValue());
            }
            return sb.toString();
        }
    }
}
