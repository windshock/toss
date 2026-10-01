package viva.republica.toss;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.List;
import o.ContextMenuAreaKtExternalSyntheticLambda1;
import o.ContextMenuAreaKtExternalSyntheticLambda3;
import o.asymmDecryptWithCert;
import o.asymmEncryptWithCert;
import o.decEnvelopedDataWithEncryptKey;
import o.genEncryptedData;
import o.genEnvelopedData;
import o.genEnvelopedDataWithEncryptKey;
import o.genSignedData;
import o.getSymmAlgorithm;
import o.issueCertificate_Close;
import o.keyAgreement;
import o.setAsymmetricKey;
import viva.republica.toss.databinding.RowAccountHistoryItemDividerBindingImpl;
import viva.republica.toss.databinding.RowAccountHistoryItemEmptyMessageBindingImpl;
import viva.republica.toss.databinding.RowAccountHistoryItemEndBindingImpl;
import viva.republica.toss.databinding.RowAccountHistoryItemLoadingBindingImpl;
import viva.republica.toss.databinding.RowAccountHistoryItemStickyYearBindingImpl;
import viva.republica.toss.databinding.RowAccountHistoryItemYearBindingImpl;
import viva.republica.toss.databinding.RowDashboardItemUnknownBindingImpl;
import viva.republica.toss.databinding.RowTransactionDateBindingImpl;
import viva.republica.toss.databinding.RowTransactionItemBindingImpl;
import viva.republica.toss.databinding.RowTransactionTitleBindingImpl;
import viva.republica.toss.databinding.RowTransactionYearBindingImpl;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class DataBinderMapperImpl extends ContextMenuAreaKtExternalSyntheticLambda3 {
    private static final SparseIntArray IAuthTabCallback;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(22);
        IAuthTabCallback = sparseIntArray;
        sparseIntArray.put(R.layout.item_henem_box_transaction_detail_header, 1);
        sparseIntArray.put(R.layout.row_account_history_item_divider, 2);
        sparseIntArray.put(R.layout.row_account_history_item_empty_message, 3);
        sparseIntArray.put(R.layout.row_account_history_item_end, 4);
        sparseIntArray.put(R.layout.row_account_history_item_loading, 5);
        sparseIntArray.put(R.layout.row_account_history_item_sticky_year, 6);
        sparseIntArray.put(R.layout.row_account_history_item_year, 7);
        sparseIntArray.put(R.layout.row_dashboard_item_unknown, 8);
        sparseIntArray.put(R.layout.row_transaction_date, 9);
        sparseIntArray.put(R.layout.row_transaction_item, 10);
        sparseIntArray.put(R.layout.row_transaction_title, 11);
        sparseIntArray.put(R.layout.row_transaction_year, 12);
        sparseIntArray.put(R.layout.view_account_history_header_filter, 13);
        sparseIntArray.put(R.layout.view_account_history_header_tossmoney_banner, 14);
        sparseIntArray.put(R.layout.view_account_history_inventory_sdk, 15);
        sparseIntArray.put(R.layout.view_account_history_tossmoney_limit_guide_banner, 16);
        sparseIntArray.put(R.layout.view_account_history_tossmoney_limit_warning_banner, 17);
        sparseIntArray.put(R.layout.view_account_history_tossmoney_notice_banner, 18);
        sparseIntArray.put(R.layout.view_toss_account_history_header, 19);
        sparseIntArray.put(R.layout.view_toss_account_history_saving_box, 20);
        sparseIntArray.put(R.layout.view_toss_account_history_teens_saving_box, 21);
        sparseIntArray.put(R.layout.view_toss_money_upgrade_guide, 22);
    }

    public ViewDataBinding onExtraCallbackWithResult(ContextMenuAreaKtExternalSyntheticLambda1 contextMenuAreaKtExternalSyntheticLambda1, View view, int i) {
        int i2 = IAuthTabCallback.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        switch (i2) {
            case 1:
                if ("layout/item_henem_box_transaction_detail_header_0".equals(tag)) {
                    return new issueCertificate_Close(contextMenuAreaKtExternalSyntheticLambda1, view);
                }
                throw new IllegalArgumentException("The tag for item_henem_box_transaction_detail_header is invalid. Received: " + tag);
            case 2:
                if ("layout/row_account_history_item_divider_0".equals(tag)) {
                    return new RowAccountHistoryItemDividerBindingImpl(contextMenuAreaKtExternalSyntheticLambda1, view);
                }
                throw new IllegalArgumentException("The tag for row_account_history_item_divider is invalid. Received: " + tag);
            case 3:
                if ("layout/row_account_history_item_empty_message_0".equals(tag)) {
                    return new RowAccountHistoryItemEmptyMessageBindingImpl(contextMenuAreaKtExternalSyntheticLambda1, view);
                }
                throw new IllegalArgumentException("The tag for row_account_history_item_empty_message is invalid. Received: " + tag);
            case 4:
                if ("layout/row_account_history_item_end_0".equals(tag)) {
                    return new RowAccountHistoryItemEndBindingImpl(contextMenuAreaKtExternalSyntheticLambda1, view);
                }
                throw new IllegalArgumentException("The tag for row_account_history_item_end is invalid. Received: " + tag);
            case 5:
                if ("layout/row_account_history_item_loading_0".equals(tag)) {
                    return new RowAccountHistoryItemLoadingBindingImpl(contextMenuAreaKtExternalSyntheticLambda1, view);
                }
                throw new IllegalArgumentException("The tag for row_account_history_item_loading is invalid. Received: " + tag);
            case 6:
                if ("layout/row_account_history_item_sticky_year_0".equals(tag)) {
                    return new RowAccountHistoryItemStickyYearBindingImpl(contextMenuAreaKtExternalSyntheticLambda1, view);
                }
                throw new IllegalArgumentException("The tag for row_account_history_item_sticky_year is invalid. Received: " + tag);
            case 7:
                if ("layout/row_account_history_item_year_0".equals(tag)) {
                    return new RowAccountHistoryItemYearBindingImpl(contextMenuAreaKtExternalSyntheticLambda1, view);
                }
                throw new IllegalArgumentException("The tag for row_account_history_item_year is invalid. Received: " + tag);
            case 8:
                if ("layout/row_dashboard_item_unknown_0".equals(tag)) {
                    return new RowDashboardItemUnknownBindingImpl(contextMenuAreaKtExternalSyntheticLambda1, view);
                }
                throw new IllegalArgumentException("The tag for row_dashboard_item_unknown is invalid. Received: " + tag);
            case 9:
                if ("layout/row_transaction_date_0".equals(tag)) {
                    return new RowTransactionDateBindingImpl(contextMenuAreaKtExternalSyntheticLambda1, view);
                }
                throw new IllegalArgumentException("The tag for row_transaction_date is invalid. Received: " + tag);
            case 10:
                if ("layout/row_transaction_item_0".equals(tag)) {
                    return new RowTransactionItemBindingImpl(contextMenuAreaKtExternalSyntheticLambda1, view);
                }
                throw new IllegalArgumentException("The tag for row_transaction_item is invalid. Received: " + tag);
            case 11:
                if ("layout/row_transaction_title_0".equals(tag)) {
                    return new RowTransactionTitleBindingImpl(contextMenuAreaKtExternalSyntheticLambda1, view);
                }
                throw new IllegalArgumentException("The tag for row_transaction_title is invalid. Received: " + tag);
            case 12:
                if ("layout/row_transaction_year_0".equals(tag)) {
                    return new RowTransactionYearBindingImpl(contextMenuAreaKtExternalSyntheticLambda1, view);
                }
                throw new IllegalArgumentException("The tag for row_transaction_year is invalid. Received: " + tag);
            case 13:
                if ("layout/view_account_history_header_filter_0".equals(tag)) {
                    return new genEncryptedData(contextMenuAreaKtExternalSyntheticLambda1, view);
                }
                throw new IllegalArgumentException("The tag for view_account_history_header_filter is invalid. Received: " + tag);
            case 14:
                if ("layout/view_account_history_header_tossmoney_banner_0".equals(tag)) {
                    return new decEnvelopedDataWithEncryptKey(contextMenuAreaKtExternalSyntheticLambda1, view);
                }
                throw new IllegalArgumentException("The tag for view_account_history_header_tossmoney_banner is invalid. Received: " + tag);
            case 15:
                if ("layout/view_account_history_inventory_sdk_0".equals(tag)) {
                    return new genEnvelopedData(contextMenuAreaKtExternalSyntheticLambda1, view);
                }
                throw new IllegalArgumentException("The tag for view_account_history_inventory_sdk is invalid. Received: " + tag);
            case 16:
                if ("layout/view_account_history_tossmoney_limit_guide_banner_0".equals(tag)) {
                    return new genEnvelopedDataWithEncryptKey(contextMenuAreaKtExternalSyntheticLambda1, view);
                }
                throw new IllegalArgumentException("The tag for view_account_history_tossmoney_limit_guide_banner is invalid. Received: " + tag);
            case 17:
                if ("layout/view_account_history_tossmoney_limit_warning_banner_0".equals(tag)) {
                    return new getSymmAlgorithm(contextMenuAreaKtExternalSyntheticLambda1, view);
                }
                throw new IllegalArgumentException("The tag for view_account_history_tossmoney_limit_warning_banner is invalid. Received: " + tag);
            case 18:
                if ("layout/view_account_history_tossmoney_notice_banner_0".equals(tag)) {
                    return new genSignedData(contextMenuAreaKtExternalSyntheticLambda1, view);
                }
                throw new IllegalArgumentException("The tag for view_account_history_tossmoney_notice_banner is invalid. Received: " + tag);
            case 19:
                if ("layout/view_toss_account_history_header_0".equals(tag)) {
                    return new asymmDecryptWithCert(contextMenuAreaKtExternalSyntheticLambda1, view);
                }
                throw new IllegalArgumentException("The tag for view_toss_account_history_header is invalid. Received: " + tag);
            case 20:
                if ("layout/view_toss_account_history_saving_box_0".equals(tag)) {
                    return new asymmEncryptWithCert(contextMenuAreaKtExternalSyntheticLambda1, view);
                }
                throw new IllegalArgumentException("The tag for view_toss_account_history_saving_box is invalid. Received: " + tag);
            case 21:
                if ("layout/view_toss_account_history_teens_saving_box_0".equals(tag)) {
                    return new setAsymmetricKey(contextMenuAreaKtExternalSyntheticLambda1, view);
                }
                throw new IllegalArgumentException("The tag for view_toss_account_history_teens_saving_box is invalid. Received: " + tag);
            case 22:
                if ("layout/view_toss_money_upgrade_guide_0".equals(tag)) {
                    return new keyAgreement(contextMenuAreaKtExternalSyntheticLambda1, view);
                }
                throw new IllegalArgumentException("The tag for view_toss_money_upgrade_guide is invalid. Received: " + tag);
            default:
                return null;
        }
    }

    public ViewDataBinding onNavigationEvent(ContextMenuAreaKtExternalSyntheticLambda1 contextMenuAreaKtExternalSyntheticLambda1, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || IAuthTabCallback.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    public List<ContextMenuAreaKtExternalSyntheticLambda3> onNavigationEvent() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new im.toss.ads_sdk.DataBinderMapperImpl());
        return arrayList;
    }
}
