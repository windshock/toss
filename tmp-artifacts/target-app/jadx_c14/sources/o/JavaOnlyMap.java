package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.properties.ReadWriteProperty;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class JavaOnlyMap {
    private static final onWarmupCompleted IAuthTabCallback;
    private static final onWarmupCompleted IAuthTabCallbackStub;
    private static final onWarmupCompleted asBinder;
    private static final onWarmupCompleted asInterface;
    public static final JavaOnlyMap onExtraCallback;
    private static final onWarmupCompleted onExtraCallbackWithResult;
    static final /* synthetic */ addAllCommandLine<Object>[] onNavigationEvent = {new MutablePropertyReference1Impl<>(JavaOnlyMap.class, "delayedTransferMockingActivated", "getDelayedTransferMockingActivated()Z", 0), new MutablePropertyReference1Impl<>(JavaOnlyMap.class, "mockDelayedTransferHolderNameOnce", "getMockDelayedTransferHolderNameOnce()Z", 0), new MutablePropertyReference1Impl<>(JavaOnlyMap.class, "mockContactRealNameNotMatchedOnce", "getMockContactRealNameNotMatchedOnce()Z", 0), new MutablePropertyReference1Impl<>(JavaOnlyMap.class, "mockTransferUniqueKey", "getMockTransferUniqueKey()Ljava/lang/String;", 0), new MutablePropertyReference1Impl<>(JavaOnlyMap.class, "mockPointFeeFree", "getMockPointFeeFree()Z", 0), new MutablePropertyReference1Impl<>(JavaOnlyMap.class, "mockPointFeeCoupon", "getMockPointFeeCoupon()Z", 0)};
    private static final onWarmupCompleted onWarmupCompleted;

    static {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        onExtraCallback = javaOnlyMap;
        Boolean bool = Boolean.FALSE;
        IAuthTabCallback = javaOnlyMap.onExtraCallbackWithResult("transfer_mock_delayed_transfer", bool);
        onExtraCallbackWithResult = javaOnlyMap.onExtraCallbackWithResult("transfer_mock_delayed_transfer_with_holder_name_once", bool);
        onWarmupCompleted = javaOnlyMap.onExtraCallbackWithResult("transfer_mock_contact_real_name_not_matched_once", bool);
        asBinder = javaOnlyMap.onExtraCallbackWithResult("transfer_mock_transfer_unique_key", "");
        IAuthTabCallbackStub = javaOnlyMap.onExtraCallbackWithResult("transfer_mock_point_fee_free", bool);
        asInterface = javaOnlyMap.onExtraCallbackWithResult("transfer_mock_point_coupon", bool);
    }

    private JavaOnlyMap() {
    }

    public final boolean IAuthTabCallback() {
        return ((Boolean) IAuthTabCallback.getValue(this, onNavigationEvent[0])).booleanValue();
    }

    public final void onExtraCallbackWithResult(boolean z) {
        IAuthTabCallback.setValue(this, onNavigationEvent[0], Boolean.valueOf(z));
    }

    public final boolean onNavigationEvent() {
        return ((Boolean) onExtraCallbackWithResult.getValue(this, onNavigationEvent[1])).booleanValue();
    }

    public final void onWarmupCompleted(boolean z) {
        onExtraCallbackWithResult.setValue(this, onNavigationEvent[1], Boolean.valueOf(z));
    }

    public final void IAuthTabCallback(boolean z) {
        onWarmupCompleted.setValue(this, onNavigationEvent[2], Boolean.valueOf(z));
    }

    public final boolean onExtraCallback() {
        return ((Boolean) onWarmupCompleted.getValue(this, onNavigationEvent[2])).booleanValue();
    }

    public final void onExtraCallback(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        asBinder.setValue(this, onNavigationEvent[3], str);
    }

    public final String onTransact() {
        return (String) asBinder.getValue(this, onNavigationEvent[3]);
    }

    public final boolean onExtraCallbackWithResult() {
        return ((Boolean) IAuthTabCallbackStub.getValue(this, onNavigationEvent[4])).booleanValue();
    }

    public final void onNavigationEvent(boolean z) {
        IAuthTabCallbackStub.setValue(this, onNavigationEvent[4], Boolean.valueOf(z));
    }

    public final void onExtraCallback(boolean z) {
        asInterface.setValue(this, onNavigationEvent[5], Boolean.valueOf(z));
    }

    public final boolean onWarmupCompleted() {
        return ((Boolean) asInterface.getValue(this, onNavigationEvent[5])).booleanValue();
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class onWarmupCompleted<T> implements ReadWriteProperty<Object, T> {
        final /* synthetic */ String onExtraCallback;
        final /* synthetic */ T onNavigationEvent;

        onWarmupCompleted(String str, T t) {
            this.onExtraCallback = str;
            this.onNavigationEvent = t;
        }

        public T getValue(Object obj, addAllCommandLine<?> addallcommandline) {
            Intrinsics.checkNotNullParameter(addallcommandline, "");
            return (T) addPolicy.getSmallIconBitmap().onExtraCallback(this.onExtraCallback, this.onNavigationEvent);
        }

        public void setValue(Object obj, addAllCommandLine<?> addallcommandline, T t) {
            Intrinsics.checkNotNullParameter(addallcommandline, "");
            Intrinsics.checkNotNullParameter(t, "");
            addPolicy.getSmallIconBitmap().IAuthTabCallback(this.onExtraCallback, t);
        }
    }

    private final <T> onWarmupCompleted onExtraCallbackWithResult(String str, T t) {
        return new onWarmupCompleted(str, t);
    }
}
