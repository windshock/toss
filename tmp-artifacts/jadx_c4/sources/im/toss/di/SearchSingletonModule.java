package im.toss.di;

import javax.inject.Singleton;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.PlayerErrorCode;
import o.TextRoundCornerProgressBarSavedState1;
import o.addPolicy;
import o.availableAppForAppId;
import o.filterCommonResources;
import o.g1;
import o.getUpdateAppInfoInterval;
import o.localIdToBytes;
import o.setAvailableExpiredTime;
import o.zzad;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class SearchSingletonModule {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    static {
        int i = IAuthTabCallback + 85;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    @Singleton
    public abstract availableAppForAppId onExtraCallbackWithResult(@NotNull localIdToBytes localidtobytes);

    public static final class onNavigationEvent {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        @Singleton
        public final getUpdateAppInfoInterval onNavigationEvent(@NotNull g1 g1Var, @NotNull zzad zzadVar) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 41;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(g1Var, "");
            Intrinsics.checkNotNullParameter(zzadVar, "");
            getUpdateAppInfoInterval getupdateappinfointerval = (getUpdateAppInfoInterval) g1.onExtraCallback(g1Var, getUpdateAppInfoInterval.class, zzadVar.IAuthTabCallbackStub(), (Long) null, (Long) null, (Function1) null, 28, (Object) null);
            int i4 = onExtraCallback + 103;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return getupdateappinfointerval;
        }

        @Singleton
        public final TextRoundCornerProgressBarSavedState1 IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 79;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return addPolicy.notifyNotificationWithChannel();
            }
            addPolicy.notifyNotificationWithChannel();
            throw null;
        }

        @Singleton
        public final setAvailableExpiredTime onExtraCallback(@NotNull getUpdateAppInfoInterval getupdateappinfointerval) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(getupdateappinfointerval, "");
            setAvailableExpiredTime setavailableexpiredtime = new setAvailableExpiredTime(getupdateappinfointerval);
            int i2 = onExtraCallbackWithResult + 81;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 1 / 0;
            }
            return setavailableexpiredtime;
        }

        /* renamed from: im.toss.di.SearchSingletonModule$onNavigationEvent$onNavigationEvent, reason: collision with other inner class name */
        public static final class C0008onNavigationEvent implements filterCommonResources {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            C0008onNavigationEvent() {
            }

            public String onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 3;
                onExtraCallback = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    PlayerErrorCode.onPostMessage();
                    obj.hashCode();
                    throw null;
                }
                String strOnPostMessage = PlayerErrorCode.onPostMessage();
                int i3 = onExtraCallback + 41;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    return strOnPostMessage;
                }
                obj.hashCode();
                throw null;
            }

            public String onNavigationEvent() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 81;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                String strAccess000 = PlayerErrorCode.access000();
                int i4 = onExtraCallback + 49;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return strAccess000;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        @Singleton
        public final filterCommonResources onExtraCallback() {
            int i = 2 % 2;
            C0008onNavigationEvent c0008onNavigationEvent = new C0008onNavigationEvent();
            int i2 = onExtraCallbackWithResult + 59;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 71 / 0;
            }
            return c0008onNavigationEvent;
        }
    }
}
