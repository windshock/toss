package o;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.base.BaseActivity;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.PasswordRecipientInfo;
import o.RecomposerawaitIdle2;
import o.SetDetectableSize;
import o.toHashtable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PasswordRecipientInfo extends RecipientIdentifier<setPackageVerifier> {
    private static short[] ICustomTabsCallbackStubProxy;
    private final TdsButtonV1View ICustomTabsCallback;
    private final TdsButtonV1View extraCallback;
    private final TdsListRowV1View onActivityLayout;
    private final View.OnClickListener writeTypedObject;
    private static final byte[] $$a = {86, 117, -27, 75};
    private static final int $$b = 24;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onUnminimized = 0;
    private static int ICustomTabsCallbackDefault = 1;
    private static int onMessageChannelReady = 490790596;
    private static int onMinimized = -1538795487;
    private static int onPostMessage = 205200429;
    private static byte[] onActivityResized = {-43, -9, -13, 8, -9, 27};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r5, short r6, int r7) {
        /*
            int r7 = r7 * 4
            int r7 = r7 + 115
            int r6 = r6 * 3
            int r6 = r6 + 4
            byte[] r0 = o.PasswordRecipientInfo.$$a
            int r5 = r5 * 3
            int r1 = r5 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r5
            r3 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r5) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L22:
            r4 = r0[r6]
            int r3 = r3 + 1
        L26:
            int r4 = -r4
            int r7 = r7 + r4
            int r6 = r6 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.PasswordRecipientInfo.$$c(byte, short, int):java.lang.String");
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(BaseActivity baseActivity, setPackageVerifier setpackageverifier, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onUnminimized + 113;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(baseActivity, setpackageverifier, setDetectableSize);
        if (i3 == 0) {
            int i4 = 6 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(setPackageVerifier setpackageverifier, View view) {
        int i = 2 % 2;
        int i2 = onUnminimized + 97;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(setpackageverifier, view);
        int i4 = ICustomTabsCallbackDefault + 83;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasswordRecipientInfo(@NotNull View view, @NotNull View.OnClickListener onClickListener) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(onClickListener, "");
        this.writeTypedObject = onClickListener;
        this.onActivityLayout = view.findViewById(R.id.saving_row);
        this.extraCallback = view.findViewById(R.id.button_later);
        this.ICustomTabsCallback = view.findViewById(R.id.button_start);
    }

    @Override // o.RecipientIdentifier
    public /* bridge */ /* synthetic */ void onExtraCallbackWithResult(getOther getother, toHashtable.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = onUnminimized + 105;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult((setPackageVerifier) getother, iAuthTabCallback);
        int i4 = ICustomTabsCallbackDefault + 125;
        onUnminimized = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onExtraCallbackWithResult(@NotNull final setPackageVerifier setpackageverifier, @Nullable toHashtable.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setpackageverifier, "");
        this.onActivityLayout.setCenterText1(getLongName.onNavigationEvent(setpackageverifier.IAuthTabCallback(), (ParamImpl) null, 1, (Object) null) + " 결제 후 잔돈");
        this.onActivityLayout.setRightText1(getLongName.onNavigationEvent(setpackageverifier.onNavigationEvent(), (ParamImpl) null, 1, (Object) null));
        TdsListRowV1View tdsListRowV1View = this.onActivityLayout;
        Context context = ((RecyclerView.ViewHolder) this).onNavigationEvent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        tdsListRowV1View.setLeftImage(RecomposerrecompositionRunner2.IAuthTabCallback(new RecomposerawaitIdle2.onNavigationEvent(context).onExtraCallback(Integer.valueOf(im.toss.core.R.drawable.icn_piggybank_color)), new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[]{new PluginInfo(0.0f, 2.0f, 0.0f, (Integer) null, 0, (Integer) null, 45, (DefaultConstructorMarker) null)}));
        this.extraCallback.setOnClickListener(this.writeTypedObject);
        this.ICustomTabsCallback.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.card.viewholder.UserCardSavingBoxBannerViewHolder$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PasswordRecipientInfo.onExtraCallbackWithResult(setpackageverifier, view);
            }
        });
        int i2 = onUnminimized + 13;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 51 / 0;
        }
    }

    private static final void onNavigationEvent(final setPackageVerifier setpackageverifier, View view) {
        final BaseActivity baseActivity;
        int i = 2 % 2;
        BaseActivity context = view.getContext();
        if (context instanceof BaseActivity) {
            int i2 = ICustomTabsCallbackDefault;
            int i3 = i2 + 65;
            onUnminimized = i3 % 128;
            int i4 = i3 % 2;
            baseActivity = context;
            int i5 = i2 + 17;
            onUnminimized = i5 % 128;
            int i6 = i5 % 2;
        } else {
            baseActivity = null;
        }
        if (baseActivity != null) {
            getOctetOutputStream.onExtraCallback.onExtraCallback(baseActivity, "toss_card_transaction_banner");
            ConvertByteArrayToFloatArray.onWarmupCompleted("click_button", false, (String) null, (List) null, (Map) null, new Function1() { // from class: viva.republica.toss.card.viewholder.UserCardSavingBoxBannerViewHolder$$ExternalSyntheticLambda1
                public final Object invoke(Object obj) {
                    return PasswordRecipientInfo.onExtraCallbackWithResult(baseActivity, setpackageverifier, (SetDetectableSize) obj);
                }
            }, 30, (Object) null);
        }
    }

    private static final Unit onExtraCallback(BaseActivity baseActivity, setPackageVerifier setpackageverifier, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onUnminimized + 37;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback().put("category", sendBroadcastWithAdObject.TOSS_CARD);
        setDetectableSize.onExtraCallback().put("view", baseActivity.getScreenName());
        Map mapOnExtraCallback = setDetectableSize.onExtraCallback();
        Object[] objArr = new Object[1];
        a((short) (ViewConfiguration.getFadingEdgeLength() >> 16), (byte) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1190721843 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1468218429, (-42) - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr);
        mapOnExtraCallback.put(((String) objArr[0]).intern(), "autosave_start");
        setDetectableSize.onExtraCallback().put("service_id", "101");
        setDetectableSize.onExtraCallback().put("amount", Long.valueOf(setpackageverifier.onNavigationEvent()));
        Unit unit = Unit.INSTANCE;
        int i4 = onUnminimized + 83;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x01bf A[PHI: r0
      0x01bf: PHI (r0v35 int) = (r0v8 int), (r0v38 int) binds: [B:44:0x01bd, B:41:0x01ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c9 A[PHI: r0
      0x01c9: PHI (r0v9 int) = (r0v8 int), (r0v38 int) binds: [B:44:0x01bd, B:41:0x01ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0264  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r27, byte r28, int r29, int r30, int r31, java.lang.Object[] r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 773
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.PasswordRecipientInfo.a(short, byte, int, int, int, java.lang.Object[]):void");
    }
}
