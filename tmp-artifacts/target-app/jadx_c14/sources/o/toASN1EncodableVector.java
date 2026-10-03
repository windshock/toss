package o;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import viva.republica.toss.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class toASN1EncodableVector {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ toASN1EncodableVector[] $VALUES;
    public static final toASN1EncodableVector CARD_BILL_BANNER;
    public static final onWarmupCompleted Companion;
    public static final toASN1EncodableVector DIVIDER;
    public static final toASN1EncodableVector EMPTY;
    public static final toASN1EncodableVector INTEGRATED_CARD_ITEM;
    public static final toASN1EncodableVector INTEGRATED_CARD_LOADING;
    public static final toASN1EncodableVector INTEGRATED_CARD_SUB_TITLE;
    public static final toASN1EncodableVector LIST_ROW;
    public static final toASN1EncodableVector PLCC_CARD_BANNER;
    public static final toASN1EncodableVector PLCC_CARD_BILL_TRANSACTION;
    public static final toASN1EncodableVector PLCC_CARD_EXPECTED_TRANSACTION;
    public static final toASN1EncodableVector PLCC_CARD_TRANSACTION;
    public static final toASN1EncodableVector PLCC_NOTICE;
    public static final toASN1EncodableVector SAVING_BOX_BANNER;
    public static final toASN1EncodableVector TDS_BANNER;
    public static final toASN1EncodableVector THICK_DIVIDER;
    public static final toASN1EncodableVector THIN_DIVIDER;
    public static final toASN1EncodableVector TRANSACTION;
    public static final toASN1EncodableVector TRANSACTION_SKELETON;
    private final int resId;
    public static final toASN1EncodableVector TRANSACTION_DETAIL_HEADER_BANNER = new toASN1EncodableVector("TRANSACTION_DETAIL_HEADER_BANNER", 0, R.layout.row_user_card_transaction_detail_header_banner);
    public static final toASN1EncodableVector PLCC_CARD_TRANSACTION_DETAIL_HEADER = new toASN1EncodableVector("PLCC_CARD_TRANSACTION_DETAIL_HEADER", 1, R.layout.row_toss_card_transaction_detail_header);
    public static final toASN1EncodableVector TRANSACTION_SUMMARY = new toASN1EncodableVector("TRANSACTION_SUMMARY", 2, R.layout.row_user_card_transaction_summary);

    private static final /* synthetic */ toASN1EncodableVector[] $values() {
        return new toASN1EncodableVector[]{TRANSACTION_DETAIL_HEADER_BANNER, PLCC_CARD_TRANSACTION_DETAIL_HEADER, TRANSACTION_SUMMARY, TRANSACTION, PLCC_CARD_TRANSACTION, PLCC_CARD_EXPECTED_TRANSACTION, TRANSACTION_SKELETON, PLCC_CARD_BILL_TRANSACTION, EMPTY, PLCC_CARD_BANNER, DIVIDER, THIN_DIVIDER, THICK_DIVIDER, SAVING_BOX_BANNER, CARD_BILL_BANNER, TDS_BANNER, PLCC_NOTICE, LIST_ROW, INTEGRATED_CARD_SUB_TITLE, INTEGRATED_CARD_ITEM, INTEGRATED_CARD_LOADING};
    }

    public static EnumEntries<toASN1EncodableVector> getEntries() {
        return $ENTRIES;
    }

    public static toASN1EncodableVector valueOf(String str) {
        return (toASN1EncodableVector) Enum.valueOf(toASN1EncodableVector.class, str);
    }

    public static toASN1EncodableVector[] values() {
        return (toASN1EncodableVector[]) $VALUES.clone();
    }

    private toASN1EncodableVector(String str, int i, int i2) {
        this.resId = i2;
    }

    public final int getResId() {
        return this.resId;
    }

    static {
        int i = R.layout.row_user_card_transaction;
        TRANSACTION = new toASN1EncodableVector("TRANSACTION", 3, i);
        PLCC_CARD_TRANSACTION = new toASN1EncodableVector("PLCC_CARD_TRANSACTION", 4, i);
        PLCC_CARD_EXPECTED_TRANSACTION = new toASN1EncodableVector("PLCC_CARD_EXPECTED_TRANSACTION", 5, i);
        TRANSACTION_SKELETON = new toASN1EncodableVector("TRANSACTION_SKELETON", 6, R.layout.row_user_card_transaction_skeleton);
        PLCC_CARD_BILL_TRANSACTION = new toASN1EncodableVector("PLCC_CARD_BILL_TRANSACTION", 7, i);
        EMPTY = new toASN1EncodableVector("EMPTY", 8, R.layout.item_tds_result_v0);
        PLCC_CARD_BANNER = new toASN1EncodableVector("PLCC_CARD_BANNER", 9, R.layout.row_user_card_toss_card_banner);
        DIVIDER = new toASN1EncodableVector("DIVIDER", 10, R.layout.row_gray_divider);
        THIN_DIVIDER = new toASN1EncodableVector("THIN_DIVIDER", 11, R.layout.row_gray_thin_divider);
        THICK_DIVIDER = new toASN1EncodableVector("THICK_DIVIDER", 12, R.layout.row_gray_thick_divider);
        SAVING_BOX_BANNER = new toASN1EncodableVector("SAVING_BOX_BANNER", 13, R.layout.row_user_card_saving_box_banner);
        CARD_BILL_BANNER = new toASN1EncodableVector("CARD_BILL_BANNER", 14, R.layout.row_user_card_bill_banner);
        TDS_BANNER = new toASN1EncodableVector("TDS_BANNER", 15, R.layout.item_banner);
        PLCC_NOTICE = new toASN1EncodableVector("PLCC_NOTICE", 16, R.layout.row_user_card_transaction_plcc_notice);
        LIST_ROW = new toASN1EncodableVector("LIST_ROW", 17, R.layout.item_tds_list_row_v1);
        INTEGRATED_CARD_SUB_TITLE = new toASN1EncodableVector("INTEGRATED_CARD_SUB_TITLE", 18, R.layout.row_integrated_sub_title);
        INTEGRATED_CARD_ITEM = new toASN1EncodableVector("INTEGRATED_CARD_ITEM", 19, R.layout.row_integrated_card_item);
        INTEGRATED_CARD_LOADING = new toASN1EncodableVector("INTEGRATED_CARD_LOADING", 20, R.layout.row_integrated_loading);
        toASN1EncodableVector[] toasn1encodablevectorArr$values = $values();
        $VALUES = toasn1encodablevectorArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(toasn1encodablevectorArr$values);
        Companion = new onWarmupCompleted(null);
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final toASN1EncodableVector IAuthTabCallback(int i) {
            toASN1EncodableVector toasn1encodablevector;
            toASN1EncodableVector[] toasn1encodablevectorArrValues = toASN1EncodableVector.values();
            int length = toasn1encodablevectorArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    toasn1encodablevector = null;
                    break;
                }
                toasn1encodablevector = toasn1encodablevectorArrValues[i2];
                if (toasn1encodablevector.ordinal() == i) {
                    break;
                }
                i2++;
            }
            return toasn1encodablevector == null ? toASN1EncodableVector.TRANSACTION_SKELETON : toasn1encodablevector;
        }
    }
}
