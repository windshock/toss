package kotlin.jvm.internal;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import net.sf.scuba.smartcards.BuildConfig;
import o.addAllOpenFds;
import o.addCauses;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class TypeParameterReference$Companion {

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[addAllOpenFds.values().length];
            try {
                iArr[addAllOpenFds.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[addAllOpenFds.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[addAllOpenFds.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ TypeParameterReference$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private TypeParameterReference$Companion() {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final String toString(@NotNull addCauses addcauses) throws NoWhenBranchMatchedException {
        Intrinsics.checkNotNullParameter(addcauses, BuildConfig.FLAVOR);
        StringBuilder sb = new StringBuilder();
        int i = WhenMappings.$EnumSwitchMapping$0[addcauses.getVariance().ordinal()];
        if (i == 1) {
            Unit unit = Unit.INSTANCE;
        } else if (i == 2) {
            sb.append("in ");
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            sb.append("out ");
        }
        sb.append(addcauses.getName());
        return sb.toString();
    }
}
