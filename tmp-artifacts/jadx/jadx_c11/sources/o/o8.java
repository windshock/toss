package o;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class o8 extends p0ba {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private Map<String, ? extends Object> onWarmupCompleted;

    public static /* synthetic */ Unit IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        int i4 = onExtraCallbackWithResult + 119;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit asBinder() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback_Parcel = IAuthTabCallback_Parcel();
        int i4 = onNavigationEvent + 29;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback_Parcel;
        }
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8(@NotNull readBomAsCharset readbomascharset, @NotNull Map<String, ? extends Object> map, @NotNull Function0<Unit> function0) {
        super(readbomascharset, function0);
        Intrinsics.checkNotNullParameter(readbomascharset, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.onWarmupCompleted = map;
    }

    private static final Unit IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = onExtraCallbackWithResult + 9;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.p0ba
    public void onNavigationEvent(@NotNull pExternalSyntheticLambda1 pexternalsyntheticlambda1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(pexternalsyntheticlambda1, "");
            pexternalsyntheticlambda1.onNavigationEvent(access000(), this.onWarmupCompleted);
            throw null;
        }
        Intrinsics.checkNotNullParameter(pexternalsyntheticlambda1, "");
        pexternalsyntheticlambda1.onNavigationEvent(access000(), this.onWarmupCompleted);
        int i3 = onExtraCallbackWithResult + 71;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = onNavigationEvent + 95;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    public final void onExtraCallback(@NotNull readBomAsCharset readbomascharset, @NotNull Map<String, ? extends Object> map, @NotNull Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(readbomascharset, "");
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.areEqual(access000(), readbomascharset);
            onWarmupCompleted(readbomascharset);
            this.onWarmupCompleted = map;
            onNavigationEvent(function0);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(readbomascharset, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(function0, "");
        boolean zAreEqual = Intrinsics.areEqual(access000(), readbomascharset);
        onWarmupCompleted(readbomascharset);
        this.onWarmupCompleted = map;
        onNavigationEvent(function0);
        if (zAreEqual) {
            return;
        }
        access100();
        int i3 = onNavigationEvent + 89;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
    }
}
