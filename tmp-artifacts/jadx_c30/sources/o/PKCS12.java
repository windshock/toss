package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class PKCS12 {
    public static final int $stable = 0;
    public static final PKCS12 INSTANCE = new PKCS12();
    public static final String KEY_ACCOUNT_FROM = "accountFrom";
    public static final String KEY_ACCOUNT_FROM_SELECTABLE = "fromAccountSelectable";
    public static final String KEY_ACCOUNT_ID = "accountId";
    public static final String KEY_ACCOUNT_NO = "accountNo";
    public static final String KEY_ACCOUNT_NO_FROM = "accountNoFrom";
    public static final String KEY_ACCOUNT_TYPE_FROM = "accountTypeFrom";
    public static final String KEY_AMOUNT = "amount";
    public static final String KEY_BANK = "bank";
    public static final String KEY_BANK_CODE = "bankCode";
    public static final String KEY_BANK_CODE_FROM = "bankCodeFrom";
    public static final String KEY_CARD_CODE = "cardCode";
    public static final String KEY_CARD_ID = "cardId";
    public static final String KEY_CHILD_USER_NO = "childUserNo";
    public static final String KEY_FIXED_AMOUNT = "fixedAmount";
    public static final String KEY_FUNNEL_PURPOSE = "funnelPurpose";
    public static final String KEY_JUST_CLOSE = "justClose";
    public static final String KEY_MESSAGE = "msg";
    public static final String KEY_NAME = "name";
    public static final String KEY_ORIGIN = "origin";
    public static final String KEY_PHONE = "phone";
    public static final String KEY_RECEIVER = "receiver";
    public static final String KEY_RECEIVER_PHONE = "receiverPhone";
    public static final String KEY_REFERRER = "referrer";
    public static final String KEY_RESERVE_KEY = "reserveKey";
    public static final String KEY_SERVICE_ID = "serviceId";
    public static final String KEY_SKIP_AD = "skipAd";
    public static final String KEY_SOURCE = "source";
    public static final String KEY_TERMS = "terms";
    public static final String KEY_TITLE = "title";
    public static final String KEY_TOSS_ACCOUNT_ID = "accountId";
    public static final String KEY_TOSS_BANK_WEB_TRANSFER = "tossBankWebTransfer";
    public static final String KEY_TO_MY_TOSS_ACCOUNT_ID = "toMyTossAccountId";
    public static final String KEY_TRANSFER_TEXT_TYPE = "textType";
    public static final String KEY_USER_NO = "userNo";
    public static final String KEY_VENDOR_ID = "vendorId";
    public static final String LAST_SAVED_CERT_BANK_CODE = "last";
    public static final int REQ_ACTIVITY_MANDATORY_TERMS = 10001;
    public static final String SubscriptionDeposit = "subscriptionDeposit";
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    static {
        int i = onExtraCallback + 89;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private PKCS12() {
    }
}
