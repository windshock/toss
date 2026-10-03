package viva.republica.toss.network.model.verify;

import android.os.SystemClock;
import android.view.Gravity;
import android.view.ViewConfiguration;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access15300;
import o.liq;
import o.updateRenderInfoForVideo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class SessionKnownType implements SessionType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SessionKnownType[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    public static final SessionKnownType AUTHENTICATE_CS_AUTH;
    public static final SessionKnownType CHANGE_CERTIFY_USER_PHONE_NUMBER;
    public static final SessionKnownType CHANGE_USER_CERTIFICATION_OWN_PHONE_ONLY;
    public static final SessionKnownType CHANGE_USER_NAME_VISITOR;
    public static final SessionKnownType CHANGE_USER_PHONE_VISITOR;
    public static final Companion Companion;
    public static final SessionKnownType FACE_PAY;
    public static final SessionKnownType ISSUE_CERTIFICATE;
    public static final SessionKnownType ISSUE_CERTIFICATE_IDENTIFY_TOKEN;
    public static final SessionKnownType ISSUE_CERTIFICATE_IN_PERSON;
    public static final SessionKnownType ISSUE_CERTIFICATE_REAL_NAME;
    public static final SessionKnownType ISSUE_CERTIFY_CERTIFICATE;
    public static final SessionKnownType ISSUE_SMARTPASS;
    public static final SessionKnownType KNOW_YOUR_CUSTOMER_EXPAT;
    public static final SessionKnownType KYC_CUSTOMER_DUE_DILIGENCE;
    public static final SessionKnownType KYC_CUSTOMER_DUE_DILIGENCE_F2;
    public static final SessionKnownType KYC_ENHANCED_DUE_DILIGENCE;
    public static final SessionKnownType LOAD_CERTIFICATE;
    public static final SessionKnownType MOBILE_ID_RELEASE_LOST_STATE;
    public static final SessionKnownType PAY_MEMBERSHIP;
    public static final SessionKnownType REGISTER_BANK_ACCOUNT;
    public static final SessionKnownType REGISTER_CERTIFY;
    public static final SessionKnownType REKEY_CERTIFICATE_TWO_PLUS_ZERO;
    public static final SessionKnownType RESET_PASSWORD;
    public static final SessionKnownType RESET_PASSWORD_BY_USS_CARD;
    public static final SessionKnownType RESET_PASSWORD_UNDER_AGE;
    public static final SessionKnownType UNIFIED_LIMIT_INCREASE;
    public static final SessionKnownType UPDATE_USER_CERTIFICATION;
    public static final SessionKnownType UPDATE_USER_CERTIFICATION_EXPAT;
    public static final SessionKnownType VERIFY_BANK_ACCOUNT;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {7, 80, 121, 38};
    private static final int $$b = 217;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 1;
    private static int onExtraCallback = 0;
    private static int IAuthTabCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, byte r7, byte r8) {
        /*
            byte[] r0 = viva.republica.toss.network.model.verify.SessionKnownType.$$a
            int r8 = r8 * 4
            int r8 = r8 + 1
            int r6 = r6 * 3
            int r6 = 105 - r6
            int r7 = r7 * 2
            int r7 = 4 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r6
            r6 = r8
            r4 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r3 = r0[r7]
        L27:
            int r6 = r6 + r3
            int r7 = r7 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.verify.SessionKnownType.$$c(byte, byte, byte):java.lang.String");
    }

    public static /* synthetic */ KSerializer $r8$lambda$XJi2M3aUrE58fqv4SNm04UrD6CQ() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializer_init_$_anonymous_ = _init_$_anonymous_();
        int i4 = IAuthTabCallback + 111;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializer_init_$_anonymous_;
    }

    private static final /* synthetic */ SessionKnownType[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        SessionKnownType[] sessionKnownTypeArr = {ISSUE_CERTIFICATE, ISSUE_CERTIFICATE_REAL_NAME, ISSUE_CERTIFICATE_IDENTIFY_TOKEN, ISSUE_CERTIFICATE_IN_PERSON, LOAD_CERTIFICATE, REKEY_CERTIFICATE_TWO_PLUS_ZERO, REGISTER_CERTIFY, ISSUE_CERTIFY_CERTIFICATE, CHANGE_CERTIFY_USER_PHONE_NUMBER, AUTHENTICATE_CS_AUTH, RESET_PASSWORD, RESET_PASSWORD_UNDER_AGE, RESET_PASSWORD_BY_USS_CARD, VERIFY_BANK_ACCOUNT, REGISTER_BANK_ACCOUNT, UNIFIED_LIMIT_INCREASE, UPDATE_USER_CERTIFICATION, KYC_ENHANCED_DUE_DILIGENCE, KNOW_YOUR_CUSTOMER_EXPAT, CHANGE_USER_CERTIFICATION_OWN_PHONE_ONLY, FACE_PAY, PAY_MEMBERSHIP, ISSUE_SMARTPASS, MOBILE_ID_RELEASE_LOST_STATE, UPDATE_USER_CERTIFICATION_EXPAT, CHANGE_USER_NAME_VISITOR, CHANGE_USER_PHONE_VISITOR, KYC_CUSTOMER_DUE_DILIGENCE_F2, KYC_CUSTOMER_DUE_DILIGENCE};
        int i5 = i3 + 101;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 88 / 0;
        }
        return sessionKnownTypeArr;
    }

    public static EnumEntries<SessionKnownType> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 25;
        onExtraCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        EnumEntries<SessionKnownType> enumEntries = $ENTRIES;
        int i4 = i2 + 99;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return enumEntries;
        }
        obj.hashCode();
        throw null;
    }

    public static SessionKnownType valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        SessionKnownType sessionKnownType = (SessionKnownType) Enum.valueOf(SessionKnownType.class, str);
        int i4 = onExtraCallback + 51;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return sessionKnownType;
    }

    public static SessionKnownType[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        SessionKnownType[] sessionKnownTypeArr = $VALUES;
        if (i3 != 0) {
            return (SessionKnownType[]) sessionKnownTypeArr.clone();
        }
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 125;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializer = (KSerializer) SessionKnownType.access$get$cachedSerializer$delegate$cp().getValue();
            int i4 = onWarmupCompleted + 53;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 90 / 0;
            }
            return kSerializer;
        }

        public final KSerializer<SessionKnownType> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 21;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            KSerializer<SessionKnownType> kSerializerOnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i4 = onExtraCallbackWithResult + 83;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 13 / 0;
            }
            return kSerializerOnExtraCallbackWithResult;
        }
    }

    private SessionKnownType(String str, int i) {
    }

    private static final /* synthetic */ KSerializer _init_$_anonymous_() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.verify.SessionKnownType", values());
        int i4 = onExtraCallback + 105;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static final /* synthetic */ Lazy access$get$cachedSerializer$delegate$cp() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 71;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>> lazy = $cachedSerializer$delegate;
        int i5 = i2 + 97;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return lazy;
    }

    @Override // viva.republica.toss.network.model.verify.SessionType
    public /* synthetic */ String getName() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return name();
        }
        name();
        throw null;
    }

    static {
        onWarmupCompleted = 0;
        onExtraCallback();
        ISSUE_CERTIFICATE = new SessionKnownType("ISSUE_CERTIFICATE", 0);
        ISSUE_CERTIFICATE_REAL_NAME = new SessionKnownType("ISSUE_CERTIFICATE_REAL_NAME", 1);
        ISSUE_CERTIFICATE_IDENTIFY_TOKEN = new SessionKnownType("ISSUE_CERTIFICATE_IDENTIFY_TOKEN", 2);
        ISSUE_CERTIFICATE_IN_PERSON = new SessionKnownType("ISSUE_CERTIFICATE_IN_PERSON", 3);
        LOAD_CERTIFICATE = new SessionKnownType("LOAD_CERTIFICATE", 4);
        REKEY_CERTIFICATE_TWO_PLUS_ZERO = new SessionKnownType("REKEY_CERTIFICATE_TWO_PLUS_ZERO", 5);
        REGISTER_CERTIFY = new SessionKnownType("REGISTER_CERTIFY", 6);
        ISSUE_CERTIFY_CERTIFICATE = new SessionKnownType("ISSUE_CERTIFY_CERTIFICATE", 7);
        CHANGE_CERTIFY_USER_PHONE_NUMBER = new SessionKnownType("CHANGE_CERTIFY_USER_PHONE_NUMBER", 8);
        AUTHENTICATE_CS_AUTH = new SessionKnownType("AUTHENTICATE_CS_AUTH", 9);
        RESET_PASSWORD = new SessionKnownType("RESET_PASSWORD", 10);
        RESET_PASSWORD_UNDER_AGE = new SessionKnownType("RESET_PASSWORD_UNDER_AGE", 11);
        RESET_PASSWORD_BY_USS_CARD = new SessionKnownType("RESET_PASSWORD_BY_USS_CARD", 12);
        VERIFY_BANK_ACCOUNT = new SessionKnownType("VERIFY_BANK_ACCOUNT", 13);
        REGISTER_BANK_ACCOUNT = new SessionKnownType("REGISTER_BANK_ACCOUNT", 14);
        UNIFIED_LIMIT_INCREASE = new SessionKnownType("UNIFIED_LIMIT_INCREASE", 15);
        UPDATE_USER_CERTIFICATION = new SessionKnownType("UPDATE_USER_CERTIFICATION", 16);
        KYC_ENHANCED_DUE_DILIGENCE = new SessionKnownType("KYC_ENHANCED_DUE_DILIGENCE", 17);
        KNOW_YOUR_CUSTOMER_EXPAT = new SessionKnownType("KNOW_YOUR_CUSTOMER_EXPAT", 18);
        CHANGE_USER_CERTIFICATION_OWN_PHONE_ONLY = new SessionKnownType("CHANGE_USER_CERTIFICATION_OWN_PHONE_ONLY", 19);
        Object[] objArr = new Object[1];
        a(Gravity.getAbsoluteGravity(0, 0) + 8, (ViewConfiguration.getFadingEdgeLength() >> 16) + 7, new char[]{65526, 65528, 65530, 20, 5, 65526, 14, 65531}, false, 234 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
        FACE_PAY = new SessionKnownType(((String) objArr[0]).intern(), 20);
        PAY_MEMBERSHIP = new SessionKnownType("PAY_MEMBERSHIP", 21);
        ISSUE_SMARTPASS = new SessionKnownType("ISSUE_SMARTPASS", 22);
        MOBILE_ID_RELEASE_LOST_STATE = new SessionKnownType("MOBILE_ID_RELEASE_LOST_STATE", 23);
        UPDATE_USER_CERTIFICATION_EXPAT = new SessionKnownType("UPDATE_USER_CERTIFICATION_EXPAT", 24);
        CHANGE_USER_NAME_VISITOR = new SessionKnownType("CHANGE_USER_NAME_VISITOR", 25);
        CHANGE_USER_PHONE_VISITOR = new SessionKnownType("CHANGE_USER_PHONE_VISITOR", 26);
        KYC_CUSTOMER_DUE_DILIGENCE_F2 = new SessionKnownType("KYC_CUSTOMER_DUE_DILIGENCE_F2", 27);
        KYC_CUSTOMER_DUE_DILIGENCE = new SessionKnownType("KYC_CUSTOMER_DUE_DILIGENCE", 28);
        SessionKnownType[] sessionKnownTypeArr$values = $values();
        $VALUES = sessionKnownTypeArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(sessionKnownTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.verify.SessionKnownType$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 7;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    return SessionKnownType.$r8$lambda$XJi2M3aUrE58fqv4SNm04UrD6CQ();
                }
                SessionKnownType.$r8$lambda$XJi2M3aUrE58fqv4SNm04UrD6CQ();
                throw null;
            }
        });
        int i = onNavigationEvent + 19;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r23, int r24, char[] r25, boolean r26, int r27, java.lang.Object[] r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.verify.SessionKnownType.a(int, int, char[], boolean, int, java.lang.Object[]):void");
    }

    static void onExtraCallback() {
        onExtraCallbackWithResult = 478309047;
    }
}
