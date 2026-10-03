package viva.republica.toss.account.di;

import im.toss.realmdb.RealmMigrationCallback;
import java.util.List;
import javax.inject.Singleton;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.DERConstructedSet;
import o.KeyBoardVisiblePoint;
import o.PageSwitchInterceptPoint;
import o.UST_TSA_VerifyTimeStampTokenWithHash;
import o.checkNavigationBarBySystemProperties;
import o.interceptSwitchPage;
import o.onAdViewAdDisplayFailed;
import o.onCollectWhenDestroy;
import o.onStarted;
import o.setTestMode;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AccountModule {
    public static final AccountModule IAuthTabCallback = new AccountModule();

    private AccountModule() {
    }

    public static final class IAuthTabCallback implements interceptSwitchPage {
        IAuthTabCallback() {
        }

        public boolean onWarmupCompleted(String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Object[] objArr = {setTestMode.onExtraCallback, str, str2};
            return ((Boolean) setTestMode.onExtraCallback(-1651830061, 1651830066, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), objArr, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult())).booleanValue();
        }

        public KeyBoardVisiblePoint onNavigationEvent() {
            setTestMode settestmode = setTestMode.onExtraCallback;
            String strOnExtraCallbackWithResult = settestmode.access100().onExtraCallbackWithResult("PRIMARY_ACCOUNT_TYPE", "");
            long jOnExtraCallback = settestmode.access100().onExtraCallback("PRIMARY_ACCOUNT_ID", 0L);
            return DERConstructedSet.onWarmupCompleted(String.valueOf(jOnExtraCallback), onCollectWhenDestroy.Companion.onExtraCallbackWithResult(strOnExtraCallbackWithResult));
        }
    }

    @Singleton
    public final interceptSwitchPage onWarmupCompleted() {
        return new IAuthTabCallback();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onWarmupCompleted(checkNavigationBarBySystemProperties checknavigationbarbysystemproperties) {
        return DERConstructedSet.onExtraCallback(checknavigationbarbysystemproperties);
    }

    @Singleton
    public final onStarted onExtraCallback() {
        return new onStarted() { // from class: viva.republica.toss.account.di.AccountModule$$ExternalSyntheticLambda0
            public final boolean hasBankLoginMethod(checkNavigationBarBySystemProperties checknavigationbarbysystemproperties) {
                return AccountModule.onWarmupCompleted(checknavigationbarbysystemproperties);
            }
        };
    }

    public static final class onExtraCallback implements PageSwitchInterceptPoint {
        onExtraCallback() {
        }

        public List<KeyBoardVisiblePoint> onNavigationEvent(List<? extends KeyBoardVisiblePoint> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return CollectionsKt.sortedWith(list, new UST_TSA_VerifyTimeStampTokenWithHash());
        }
    }

    @Singleton
    public final PageSwitchInterceptPoint onNavigationEvent() {
        return new onExtraCallback();
    }

    @Singleton
    public final RealmMigrationCallback IAuthTabCallback() {
        return new onWarmupCompleted();
    }
}
