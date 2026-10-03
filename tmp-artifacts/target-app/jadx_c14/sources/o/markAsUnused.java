package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public class markAsUnused {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    public static final int IAuthTabCallback = 8;
    private Function2<? super markAsUnused, ? super Boolean, Unit> IAuthTabCallbackDefault;
    private boolean IAuthTabCallbackStub;
    private final boolean IAuthTabCallbackStubProxy;
    private String IAuthTabCallback_Parcel;
    private String asBinder;
    private boolean asInterface;
    private Function0<Unit> onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private Function0<Unit> onTransact;
    private boolean onWarmupCompleted;

    public markAsUnused(int i, @NotNull String str, @Nullable String str2, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function02, @Nullable Function2<? super markAsUnused, ? super Boolean, Unit> function2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onNavigationEvent = i;
        this.IAuthTabCallback_Parcel = str;
        this.asBinder = str2;
        this.onExtraCallback = function0;
        this.onTransact = function02;
        this.IAuthTabCallbackDefault = function2;
        this.IAuthTabCallbackStubProxy = z;
        this.onWarmupCompleted = true;
    }

    public final int IAuthTabCallback() {
        return this.onNavigationEvent;
    }

    public final String IAuthTabCallbackStubProxy() {
        return this.IAuthTabCallback_Parcel;
    }

    public final String asBinder() {
        return this.asBinder;
    }

    public final void onWarmupCompleted(@Nullable String str) {
        this.asBinder = str;
    }

    public final Function0<Unit> onWarmupCompleted() {
        return this.onExtraCallback;
    }

    public final Function0<Unit> IAuthTabCallbackStub() {
        return this.onTransact;
    }

    public final Function2<markAsUnused, Boolean, Unit> asInterface() {
        return this.IAuthTabCallbackDefault;
    }

    public final boolean access100() {
        return this.IAuthTabCallbackStubProxy;
    }

    public final boolean onTransact() {
        return this.asInterface;
    }

    public final boolean IAuthTabCallbackDefault() {
        return this.IAuthTabCallbackStub;
    }

    public final void onWarmupCompleted(boolean z) {
        this.IAuthTabCallbackStub = z;
    }

    public final boolean onExtraCallbackWithResult() {
        return this.onWarmupCompleted;
    }

    public final void onExtraCallbackWithResult(boolean z) {
        this.onExtraCallbackWithResult = z;
    }

    public final boolean onNavigationEvent() {
        return this.onExtraCallbackWithResult;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && (obj instanceof markAsUnused) && this.onNavigationEvent == ((markAsUnused) obj).onNavigationEvent;
    }

    public int hashCode() {
        return this.onNavigationEvent;
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public static /* synthetic */ markAsUnused onExtraCallbackWithResult(IAuthTabCallback iAuthTabCallback, int i, String str, String str2, boolean z, Function0 function0, int i2, Object obj) {
            if ((i2 & 8) != 0) {
                z = false;
            }
            return iAuthTabCallback.onExtraCallbackWithResult(i, str, str2, z, function0);
        }

        public final markAsUnused onExtraCallbackWithResult(int i, @NotNull String str, @Nullable String str2, boolean z, @Nullable Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(str, "");
            return new markAsUnused(i, str, str2, function0, null, null, z);
        }

        public static /* synthetic */ markAsUnused onWarmupCompleted(IAuthTabCallback iAuthTabCallback, int i, String str, String str2, boolean z, Function2 function2, int i2, Object obj) {
            if ((i2 & 8) != 0) {
                z = false;
            }
            return iAuthTabCallback.onNavigationEvent(i, str, str2, z, function2);
        }

        public final markAsUnused onNavigationEvent(int i, @NotNull String str, @Nullable String str2, boolean z, @Nullable Function2<? super markAsUnused, ? super Boolean, Unit> function2) {
            Intrinsics.checkNotNullParameter(str, "");
            return new markAsUnused(i, str, str2, null, null, function2, z);
        }
    }
}
