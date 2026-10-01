package o;

import im.toss.feature.credit.terms.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class enableNebulaDestroyOpt$asInterface extends enableNebulaDestroyOpt {
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 1;
    private static int onTransact;
    public static final enableNebulaDestroyOpt$asInterface onExtraCallbackWithResult = new enableNebulaDestroyOpt$asInterface();
    private static final long IAuthTabCallback = 5959;
    private static final String asInterface = "STD_7189_CREDIT_PLUS_FREE_TRIAL";
    private static final String onExtraCallback = "";
    private static final enablePreTaskOpt onNavigationEvent = enablePreTaskOpt.GET_LOCAL_OR_REFRESH;
    private static final Integer onWarmupCompleted = Integer.valueOf(R.string.credit_plus_terms_not_agreed_message);

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof enableNebulaDestroyOpt$asInterface)) {
            int i2 = asBinder + 107;
            onTransact = i2 % 128;
            return i2 % 2 != 0;
        }
        int i3 = onTransact + 67;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onTransact + 65;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return -667324079;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = asBinder + 101;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 63;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return "PlusFreeTrial";
    }

    private enableNebulaDestroyOpt$asInterface() {
        super((DefaultConstructorMarker) null);
    }

    static {
        int i = IAuthTabCallbackDefault + 57;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public long onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 3;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        long j = IAuthTabCallback;
        int i4 = i2 + 87;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 96 / 0;
        }
        return j;
    }

    public String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = asBinder + 17;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        String str = asInterface;
        int i5 = i3 + 1;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 117;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        String str = onExtraCallback;
        int i5 = i2 + 37;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public enablePreTaskOpt onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 35;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent;
        }
        throw null;
    }

    public Integer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder + 23;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        Integer num = onWarmupCompleted;
        int i5 = i3 + 17;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }
}
