package o;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import o.setSegmentCollection;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface setSegmentCollection {
    public static final onNavigationEvent Companion = onNavigationEvent.onNavigationEvent;

    public interface onExtraCallback {
        setSegmentCollection Rinterpolator();
    }

    void IAuthTabCallback(long j);

    boolean IAuthTabCallbackStub();

    long onExtraCallback();

    void onExtraCallback(boolean z);

    boolean onExtraCallback(@NotNull String str, @NotNull String str2);

    boolean onExtraCallbackWithResult();

    boolean onNavigationEvent();

    void onTransact();

    void onWarmupCompleted();

    public static final class onNavigationEvent {
        private static int IAuthTabCallback = 0;
        private static int IAuthTabCallbackDefault = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        static final /* synthetic */ onNavigationEvent onNavigationEvent = new onNavigationEvent();
        private static final Lazy<setSegmentCollection> onWarmupCompleted = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.splittarget.spec.guest.LoginUtil$Companion$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                setSegmentCollection setsegmentcollectionIAuthTabCallback;
                int i = 2 % 2;
                int i2 = onExtraCallback + 59;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    setsegmentcollectionIAuthTabCallback = setSegmentCollection.onNavigationEvent.IAuthTabCallback();
                    int i3 = 89 / 0;
                } else {
                    setsegmentcollectionIAuthTabCallback = setSegmentCollection.onNavigationEvent.IAuthTabCallback();
                }
                int i4 = onExtraCallbackWithResult + 39;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return setsegmentcollectionIAuthTabCallback;
            }
        });

        public static /* synthetic */ setSegmentCollection IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 23;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            setSegmentCollection setsegmentcollectionOnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i4 = onExtraCallbackWithResult + 119;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return setsegmentcollectionOnExtraCallbackWithResult;
        }

        private onNavigationEvent() {
        }

        static {
            int i = onExtraCallback + 67;
            IAuthTabCallbackDefault = i % 128;
            int i2 = i % 2;
        }

        public final setSegmentCollection onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 49;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            setSegmentCollection setsegmentcollection = (setSegmentCollection) onWarmupCompleted.getValue();
            int i3 = IAuthTabCallback + 31;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return setsegmentcollection;
        }

        private static final setSegmentCollection onExtraCallbackWithResult() {
            setSegmentCollection setsegmentcollectionRinterpolator;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 115;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Response response = Response.onNavigationEvent;
                setsegmentcollectionRinterpolator = ((onExtraCallback) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), onExtraCallback.class)).Rinterpolator();
                int i3 = 80 / 0;
            } else {
                Response response2 = Response.onNavigationEvent;
                setsegmentcollectionRinterpolator = ((onExtraCallback) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), onExtraCallback.class)).Rinterpolator();
            }
            int i4 = onExtraCallbackWithResult + 115;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 65 / 0;
            }
            return setsegmentcollectionRinterpolator;
        }
    }
}
