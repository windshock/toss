package o;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@JvmInline
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class BasicTextFieldKtExternalSyntheticLambda7 {
    private final int onWarmupCompleted;
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private static final int onExtraCallbackWithResult = onExtraCallback(0);
    private static final int onExtraCallback = onExtraCallback(1);
    private static final int IAuthTabCallback = onExtraCallback(2);

    public static int onExtraCallback(int i2) {
        return i2;
    }

    public static final boolean onExtraCallback(int i2, int i3) {
        return (i3 | i2) == i2;
    }

    public static boolean onExtraCallback(int i2, Object obj) {
        return (obj instanceof BasicTextFieldKtExternalSyntheticLambda7) && i2 == ((BasicTextFieldKtExternalSyntheticLambda7) obj).onNavigationEvent();
    }

    public static int onExtraCallbackWithResult(int i2) {
        return Integer.hashCode(i2);
    }

    public boolean equals(Object obj) {
        return onExtraCallback(this.onWarmupCompleted, obj);
    }

    public int hashCode() {
        return onExtraCallbackWithResult(this.onWarmupCompleted);
    }

    public final /* synthetic */ int onNavigationEvent() {
        return this.onWarmupCompleted;
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final int onExtraCallbackWithResult() {
            return BasicTextFieldKtExternalSyntheticLambda7.onExtraCallback;
        }

        public final int onWarmupCompleted() {
            return BasicTextFieldKtExternalSyntheticLambda7.IAuthTabCallback;
        }
    }

    public String toString() {
        return IAuthTabCallback(this.onWarmupCompleted);
    }

    public static String IAuthTabCallback(int i2) {
        if (i2 == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((onExtraCallback & i2) != 0) {
            arrayList.add("Underline");
        }
        if ((i2 & IAuthTabCallback) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return "TextDecoration[" + CollectionsKt.joinToString$default(arrayList, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null) + ']';
    }
}
