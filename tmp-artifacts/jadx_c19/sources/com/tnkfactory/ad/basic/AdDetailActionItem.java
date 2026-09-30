package com.tnkfactory.ad.basic;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tnkfactory.ad.R;
import com.tnkfactory.ad.TnkAdConfig;
import com.tnkfactory.ad.off.data.AdActionInfoVo;
import com.tnkfactory.ad.rwd.Resources;
import com.tnkfactory.ad.rwd.Utils;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldSizeKtExternalSyntheticLambda2;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AdDetailActionItem extends ConstraintLayout implements TextFieldScrollKtExternalSyntheticLambda0 {
    public final Context a;
    public final AdActionInfoVo b;
    public final Lazy c;
    public final TextFieldSizeKtExternalSyntheticLambda2 d;
    public final Lazy e;
    public final ViewGroup f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AdDetailActionItem(@NotNull Context context, @NotNull AdActionInfoVo adActionInfoVo) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(adActionInfoVo, "");
        this.a = context;
        this.b = adActionInfoVo;
        this.c = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: com.tnkfactory.ad.basic.AdDetailActionItem$$ExternalSyntheticLambda0
            public final Object invoke() {
                return AdDetailActionItem.b(this.f$0);
            }
        });
        this.d = getLifecycleRegistry();
        this.e = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: com.tnkfactory.ad.basic.AdDetailActionItem$$ExternalSyntheticLambda1
            public final Object invoke() {
                return AdDetailActionItem.a(this.f$0);
            }
        });
        View viewInflate = getLayoutInflater().inflate(TnkAdConfig.INSTANCE.getLayoutConfig().getAdDetailCampaignLayout(), (ViewGroup) this, true);
        Intrinsics.checkNotNull(viewInflate, "");
        this.f = (ViewGroup) viewInflate;
        getLifecycleRegistry().onWarmupCompleted(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.INITIALIZED);
        if (isAttachedToWindow()) {
            getLifecycleRegistry().onWarmupCompleted(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED);
            setData();
        } else {
            addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.tnkfactory.ad.basic.AdDetailActionItem$special$$inlined$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@NotNull View view) {
                    this.removeOnAttachStateChangeListener(this);
                    this.getLifecycleRegistry().onWarmupCompleted(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED);
                    this.setData();
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@NotNull View view) {
                }
            });
        }
        if (isAttachedToWindow()) {
            addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.tnkfactory.ad.basic.AdDetailActionItem$special$$inlined$doOnDetach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@NotNull View view) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@NotNull View view) {
                    this.removeOnAttachStateChangeListener(this);
                    this.getLifecycleRegistry().onWarmupCompleted(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.CREATED);
                }
            });
        } else {
            getLifecycleRegistry().onWarmupCompleted(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.CREATED);
        }
    }

    public static final LayoutInflater a(AdDetailActionItem adDetailActionItem) {
        return LayoutInflater.from(adDetailActionItem.a);
    }

    public static final TextFieldSizeKtExternalSyntheticLambda2 b(AdDetailActionItem adDetailActionItem) {
        return new TextFieldSizeKtExternalSyntheticLambda2(adDetailActionItem);
    }

    private final LayoutInflater getLayoutInflater() {
        Object value = this.e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (LayoutInflater) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextFieldSizeKtExternalSyntheticLambda2 getLifecycleRegistry() {
        return (TextFieldSizeKtExternalSyntheticLambda2) this.c.getValue();
    }

    public final AdActionInfoVo getActionItem() {
        return this.b;
    }

    public final TextView getComTnkOffDetailActionItemDesc() {
        return (TextView) this.f.findViewById(R.id.com_tnk_off_detail_action_item_desc);
    }

    public final View getComTnkOffDetailActionItemIcon() {
        return this.f.findViewById(R.id.com_tnk_off_detail_action_item_icon);
    }

    public final TextView getComTnkOffDetailActionItemPoint() {
        return (TextView) this.f.findViewById(R.id.com_tnk_off_detail_action_item_point);
    }

    public final TextView getComTnkOffDetailActionItemUnit() {
        return (TextView) this.f.findViewById(R.id.com_tnk_off_detail_action_item_unit);
    }

    public TextFieldKeyInputExternalSyntheticLambda9 getLifecycle() {
        return this.d;
    }

    public final Context getMContext() {
        return this.a;
    }

    public final ViewGroup getRootView() {
        return this.f;
    }

    public final void setData() {
        View comTnkOffDetailActionItemIcon = getComTnkOffDetailActionItemIcon();
        if (comTnkOffDetailActionItemIcon != null) {
            comTnkOffDetailActionItemIcon.setSelected(this.b.getPayYn());
        }
        TextView comTnkOffDetailActionItemPoint = getComTnkOffDetailActionItemPoint();
        if (comTnkOffDetailActionItemPoint != null) {
            comTnkOffDetailActionItemPoint.setSelected(this.b.getPayYn());
        }
        TextView comTnkOffDetailActionItemDesc = getComTnkOffDetailActionItemDesc();
        if (comTnkOffDetailActionItemDesc != null) {
            comTnkOffDetailActionItemDesc.setSelected(this.b.getPayYn());
        }
        String currency = Resources.getResources().formatCurrency(this.b.getPointAmount());
        String pnt_unit = TnkAdConfig.INSTANCE.getVisibleDetailActionItemUnit() ? this.b.getPnt_unit() : "";
        TextView comTnkOffDetailActionItemPoint2 = getComTnkOffDetailActionItemPoint();
        if (comTnkOffDetailActionItemPoint2 != null) {
            comTnkOffDetailActionItemPoint2.setText(currency + pnt_unit);
        }
        if (!TextUtils.isEmpty(this.b.getMulti_desc())) {
            TextView comTnkOffDetailActionItemDesc2 = getComTnkOffDetailActionItemDesc();
            if (comTnkOffDetailActionItemDesc2 != null) {
                comTnkOffDetailActionItemDesc2.setText(Utils.fromHtml(this.b.getMulti_desc() + (this.b.getPayYn() ? "(완료)" : "")));
                return;
            }
            return;
        }
        int campaignType = this.b.getCampaignType();
        if (campaignType == 100) {
            TextView comTnkOffDetailActionItemDesc3 = getComTnkOffDetailActionItemDesc();
            if (comTnkOffDetailActionItemDesc3 != null) {
                comTnkOffDetailActionItemDesc3.setText("참여 버튼을 선택 후 앱을 설치해주세요.(이미 설치한 경우 참여가 불가합니다.)\n앱 설치 후 목록으로 돌아와서 해당 미션의 `확인` 버튼을 선택해주세요.");
                return;
            }
            return;
        }
        if (campaignType == 101) {
            TextView comTnkOffDetailActionItemDesc4 = getComTnkOffDetailActionItemDesc();
            if (comTnkOffDetailActionItemDesc4 != null) {
                comTnkOffDetailActionItemDesc4.setText("참여 버튼을 선택 후 앱을 설치 및 실행해주세요.(이전에 실행한 이력이 있다면 참여가 불가합니다.)");
                return;
            }
            return;
        }
        if (campaignType == 108) {
            TextView comTnkOffDetailActionItemDesc5 = getComTnkOffDetailActionItemDesc();
            if (comTnkOffDetailActionItemDesc5 != null) {
                comTnkOffDetailActionItemDesc5.setText("하단의 출석 버튼을 눌러주세요");
                return;
            }
            return;
        }
        if (campaignType != 199) {
            TextView comTnkOffDetailActionItemDesc6 = getComTnkOffDetailActionItemDesc();
            if (comTnkOffDetailActionItemDesc6 != null) {
                comTnkOffDetailActionItemDesc6.setText(Utils.fromHtml("액션명 입력이 필요합니다."));
                return;
            }
            return;
        }
        TextView comTnkOffDetailActionItemDesc7 = getComTnkOffDetailActionItemDesc();
        if (comTnkOffDetailActionItemDesc7 != null) {
            comTnkOffDetailActionItemDesc7.setText("미션을 달성해 주세요");
        }
    }
}
