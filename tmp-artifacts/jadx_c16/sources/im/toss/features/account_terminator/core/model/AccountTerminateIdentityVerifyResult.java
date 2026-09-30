package im.toss.features.account_terminator.core.model;

import android.graphics.Color;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.account_terminator.core.model.AccountTerminateIdentityVerifyResult$;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access15300;
import o.liq;
import o.updateRenderInfoForVideo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class AccountTerminateIdentityVerifyResult {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AccountTerminateIdentityVerifyResult[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    public static final AccountTerminateIdentityVerifyResult CERT_FAIL;
    public static final Companion Companion;
    private static int IAuthTabCallback = 1;
    public static final AccountTerminateIdentityVerifyResult IDENTITY_NUMBER_VERIFY_FAIL;
    public static final AccountTerminateIdentityVerifyResult SUCCESS;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static long onWarmupCompleted;

    /* renamed from: $r8$lambda$YfWnXQ-RqQaFhkCKX3HJ_RND-y8, reason: not valid java name */
    public static /* synthetic */ KSerializer m66$r8$lambda$YfWnXQRqQaFhkCKX3HJ_RNDy8() {
        KSerializer kSerializer_init_$_anonymous_;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializer_init_$_anonymous_ = _init_$_anonymous_();
            int i3 = 78 / 0;
        } else {
            kSerializer_init_$_anonymous_ = _init_$_anonymous_();
        }
        int i4 = onExtraCallback + 39;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializer_init_$_anonymous_;
    }

    private static final /* synthetic */ AccountTerminateIdentityVerifyResult[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 63;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        AccountTerminateIdentityVerifyResult[] accountTerminateIdentityVerifyResultArr = {SUCCESS, CERT_FAIL, IDENTITY_NUMBER_VERIFY_FAIL};
        int i5 = i2 + 49;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return accountTerminateIdentityVerifyResultArr;
    }

    public static EnumEntries<AccountTerminateIdentityVerifyResult> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        EnumEntries<AccountTerminateIdentityVerifyResult> enumEntries = $ENTRIES;
        int i5 = i3 + 101;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return enumEntries;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static AccountTerminateIdentityVerifyResult valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        AccountTerminateIdentityVerifyResult accountTerminateIdentityVerifyResult = (AccountTerminateIdentityVerifyResult) Enum.valueOf(AccountTerminateIdentityVerifyResult.class, str);
        int i4 = onExtraCallbackWithResult + 107;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return accountTerminateIdentityVerifyResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static AccountTerminateIdentityVerifyResult[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        AccountTerminateIdentityVerifyResult[] accountTerminateIdentityVerifyResultArr = (AccountTerminateIdentityVerifyResult[]) $VALUES.clone();
        int i4 = onExtraCallback + 81;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return accountTerminateIdentityVerifyResultArr;
    }

    private AccountTerminateIdentityVerifyResult(String str, int i) {
    }

    private static final /* synthetic */ KSerializer _init_$_anonymous_() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.features.account_terminator.core.model.AccountTerminateIdentityVerifyResult", values());
        }
        updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.features.account_terminator.core.model.AccountTerminateIdentityVerifyResult", values());
        throw null;
    }

    public static final /* synthetic */ Lazy access$get$cachedSerializer$delegate$cp() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 9;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Lazy<KSerializer<Object>> lazy = $cachedSerializer$delegate;
        int i4 = i2 + 35;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return lazy;
    }

    static {
        onNavigationEvent();
        Object[] objArr = new Object[1];
        a(new char[]{49850, 59541, 54142, 49897, 39511, 65111, 65043, 55761, 39075, 38965, 21671}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1, objArr);
        SUCCESS = new AccountTerminateIdentityVerifyResult(((String) objArr[0]).intern(), 0);
        CERT_FAIL = new AccountTerminateIdentityVerifyResult("CERT_FAIL", 1);
        IDENTITY_NUMBER_VERIFY_FAIL = new AccountTerminateIdentityVerifyResult("IDENTITY_NUMBER_VERIFY_FAIL", 2);
        AccountTerminateIdentityVerifyResult[] accountTerminateIdentityVerifyResultArr$values = $values();
        $VALUES = accountTerminateIdentityVerifyResultArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(accountTerminateIdentityVerifyResultArr$values);
        Companion = new Companion((DefaultConstructorMarker) null);
        $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new AccountTerminateIdentityVerifyResult$.ExternalSyntheticLambda0());
        int i = IAuthTabCallback + 3;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onWarmupCompleted ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (true) {
            obj = null;
            if (timelineExternalSyntheticLambda0.onNavigationEvent >= cArrOnWarmupCompleted.length) {
                break;
            }
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i3 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45811 - TextUtils.lastIndexOf("", '0', 0)), AndroidCharacter.getMirror('0') + '$', Color.red(0) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 18, 8808 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    int i4 = $11 + 23;
                    $10 = i4 % 128;
                    int i5 = i4 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i6 = $10 + 117;
        $11 = i6 % 128;
        if (i6 % 2 != 0) {
            objArr[0] = str;
        } else {
            obj.hashCode();
            throw null;
        }
    }

    static void onNavigationEvent() {
        onWarmupCompleted = -4855048708723741285L;
    }
}
