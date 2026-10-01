package com.tnkfactory.ad.basic;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tnkfactory.ad.R;
import com.tnkfactory.ad.TnkAdListModel;
import com.tnkfactory.ad.TnkRwdFilter;
import com.tnkfactory.ad.rwd.data.MultiCampaignJoinListItem;
import com.tnkfactory.ad.rwd.data.view.CategorySet;
import com.tnkfactory.ad.rwd.data.view.Filter;
import com.tnkfactory.ad.style.TnkViewHolder;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface ITnkHeader {

    public static final class DefaultImpls {
        public static View getIvMy(@NotNull ITnkHeader iTnkHeader) {
            View viewRoot = iTnkHeader.getViewRoot();
            if (viewRoot != null) {
                return viewRoot.findViewById(R.id.com_tnk_off_header_iv_my);
            }
            return null;
        }

        public static RecyclerView getRvCategory(@NotNull ITnkHeader iTnkHeader) {
            View viewRoot = iTnkHeader.getViewRoot();
            if (viewRoot != null) {
                return viewRoot.findViewById(R.id.com_tnk_off_rv_category);
            }
            return null;
        }

        public static RecyclerView getRvFilter(@NotNull ITnkHeader iTnkHeader) {
            View viewRoot = iTnkHeader.getViewRoot();
            if (viewRoot != null) {
                return viewRoot.findViewById(R.id.com_tnk_off_header_rv_type);
            }
            return null;
        }

        public static View getTvClose(@NotNull ITnkHeader iTnkHeader) {
            View viewRoot = iTnkHeader.getViewRoot();
            if (viewRoot != null) {
                return viewRoot.findViewById(R.id.com_tnk_off_header_tv_close);
            }
            return null;
        }

        public static TextView getTvEarnPoint(@NotNull ITnkHeader iTnkHeader) {
            View viewRoot = iTnkHeader.getViewRoot();
            if (viewRoot != null) {
                return (TextView) viewRoot.findViewById(R.id.com_tnk_off_header_earn_point);
            }
            return null;
        }

        public static TextView getTvEarnPointUnit(@NotNull ITnkHeader iTnkHeader) {
            View viewRoot = iTnkHeader.getViewRoot();
            if (viewRoot != null) {
                return (TextView) viewRoot.findViewById(R.id.com_tnk_off_header_earn_point_unit);
            }
            return null;
        }

        public static TextView getTvTitle(@NotNull ITnkHeader iTnkHeader) {
            View viewRoot = iTnkHeader.getViewRoot();
            if (viewRoot != null) {
                return (TextView) viewRoot.findViewById(R.id.com_tnk_off_header_tv_title);
            }
            return null;
        }
    }

    View getIvMy();

    RecyclerView getRvCategory();

    RecyclerView getRvFilter();

    View getTvClose();

    TextView getTvEarnPoint();

    TextView getTvEarnPointUnit();

    TextView getTvTitle();

    View getViewRoot();

    TnkViewHolder initCategory(@NotNull CategorySet categorySet, boolean z, @NotNull Function1<? super Integer, Unit> function1);

    TnkViewHolder initFilter(@NotNull Filter filter, boolean z, @NotNull Function1<? super Integer, Unit> function1);

    void initHeaderMenu(@NotNull View view, @NotNull TnkAdListModel tnkAdListModel);

    void setJoinItem(@Nullable ArrayList<MultiCampaignJoinListItem> arrayList, @NotNull String str);

    void updateFilter(@NotNull TnkRwdFilter tnkRwdFilter);
}
