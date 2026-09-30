package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import android.widget.RemoteViews;
import im.toss.featurescommon.overseas.company.presentation.screen.ComposableSingletons$OverseasCompanyInfoScreenKt$;
import im.toss.securities.widget.common.utils.RemoteViewsThemeUtilKt;
import im.toss.securities.widget.data.model.overview.OverviewItemInfo;
import im.toss.securities.widget.data.model.overview.OverviewPrice;
import im.toss.securities.widget.data.model.overview.OverviewRate;
import im.toss.securities.widget.overview.R;
import im.toss.securities.widget.overview.ui.medium.model.OverviewMediumListItem;
import im.toss.securities.widget.overview.ui.medium.model.OverviewMediumWidgetState;
import im.toss.splittarget.impl.fsm.AppStateImpl$$ExternalSyntheticLambda11;
import im.toss.tosssecurities.core.currency.domain.Currency;
import im.toss.tosssecurities.topic.model.StockTic;
import java.text.DecimalFormat;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r5b {
    private static int IAuthTabCallback = 0;
    public static final r5b onExtraCallback = new r5b();
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public static final /* synthetic */ class onExtraCallback {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[checkDuration.values().length];
            try {
                iArr[checkDuration.UP.ordinal()] = 1;
                int i = onExtraCallbackWithResult + 9;
                onNavigationEvent = i % 128;
                if (i % 2 != 0) {
                    int i2 = 3 / 5;
                } else {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[checkDuration.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[checkDuration.EQUAL.ordinal()] = 3;
                int i4 = onNavigationEvent + 89;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 % 2;
                }
            } catch (NoSuchFieldError unused3) {
            }
            onWarmupCompleted = iArr;
        }
    }

    static {
        int i = IAuthTabCallback + 39;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private r5b() {
    }

    public static /* synthetic */ RemoteViews IAuthTabCallback(r5b r5bVar, Context context, OverviewMediumListItem overviewMediumListItem, OverviewMediumWidgetState.Success success, Bitmap bitmap, Bitmap bitmap2, boolean z, int i, Object obj) throws NoWhenBranchMatchedException {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 23;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        Bitmap bitmap3 = (i3 % 2 == 0 ? (i & 8) == 0 : (i & 95) == 0) ? bitmap : null;
        Bitmap bitmap4 = (i & 16) != 0 ? null : bitmap2;
        if ((i & 32) != 0) {
            int i5 = i4 + 69;
            onNavigationEvent = i5 % 128;
            z2 = i5 % 2 == 0;
        } else {
            z2 = z;
        }
        RemoteViews remoteViewsIAuthTabCallback = r5bVar.IAuthTabCallback(context, overviewMediumListItem, success, bitmap3, bitmap4, z2);
        int i6 = onNavigationEvent + 37;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return remoteViewsIAuthTabCallback;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final RemoteViews IAuthTabCallback(@NotNull Context context, @NotNull OverviewMediumListItem overviewMediumListItem, @NotNull OverviewMediumWidgetState.Success success, @Nullable Bitmap bitmap, @Nullable Bitmap bitmap2, boolean z) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(overviewMediumListItem, "");
        Intrinsics.checkNotNullParameter(success, "");
        if (!(overviewMediumListItem instanceof OverviewMediumListItem.FolderHeader)) {
            if (!(!(overviewMediumListItem instanceof OverviewMediumListItem.Stock))) {
                return onNavigationEvent(context, ((OverviewMediumListItem.Stock) overviewMediumListItem).IAuthTabCallback(), success, bitmap, bitmap2, z);
            }
            throw new NoWhenBranchMatchedException();
        }
        int i4 = onNavigationEvent + 73;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            OverviewMediumListItem.FolderHeader folderHeader = (OverviewMediumListItem.FolderHeader) overviewMediumListItem;
            return onExtraCallback(context, folderHeader.onExtraCallbackWithResult(), folderHeader.onWarmupCompleted(), success);
        }
        OverviewMediumListItem.FolderHeader folderHeader2 = (OverviewMediumListItem.FolderHeader) overviewMediumListItem;
        onExtraCallback(context, folderHeader2.onExtraCallbackWithResult(), folderHeader2.onWarmupCompleted(), success);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final RemoteViews onExtraCallback(Context context, String str, Double d, OverviewMediumWidgetState.Success success) {
        String str2;
        int i = 2 % 2;
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_overview_medium_folder_header);
        Object[] objArr = {charset.onExtraCallbackWithResult};
        int iOnNavigationEvent = ByteOrderedDataOutputStream.onNavigationEvent(RemoteViewsThemeUtilKt.IAuthTabCallback((CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 382802400, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -382802383, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), objArr), context, success.onExtraCallback(), null, 4, null));
        int i2 = R.id.folder_name;
        remoteViews.setTextViewText(i2, str);
        remoteViews.setTextColor(i2, iOnNavigationEvent);
        if (d == null) {
            int i3 = onNavigationEvent + 63;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            remoteViews.setViewVisibility(R.id.folder_profit_rate, 8);
            return remoteViews;
        }
        String str3 = discard.onExtraCallback.onExtraCallback().format(Math.abs(d.doubleValue()));
        if (d.doubleValue() > 0.0d) {
            str2 = "+" + str3;
        } else if (d.doubleValue() < 0.0d) {
            str2 = "-" + str3;
            int i5 = onExtraCallbackWithResult + 25;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        } else {
            str2 = "0.0%";
        }
        int iOnNavigationEvent2 = ByteOrderedDataOutputStream.onNavigationEvent(RemoteViewsThemeUtilKt.IAuthTabCallback(r8lambdaMKedLQ34eSPA96F3cZORktsT52c.IAuthTabCallback.onExtraCallback(d.doubleValue()), context, success.onExtraCallback(), null, 4, null));
        int i7 = R.id.folder_profit_rate;
        remoteViews.setViewVisibility(i7, 0);
        remoteViews.setTextViewText(i7, str2);
        remoteViews.setTextColor(i7, iOnNavigationEvent2);
        return remoteViews;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0110 A[PHI: r0 r11
      0x0110: PHI (r0v72 java.lang.Double) = (r0v71 java.lang.Double), (r0v91 java.lang.Double) binds: [B:27:0x010e, B:24:0x0106] A[DONT_GENERATE, DONT_INLINE]
      0x0110: PHI (r11v8 boolean) = (r11v7 boolean), (r11v21 boolean) binds: [B:27:0x010e, B:24:0x0106] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011e A[PHI: r11
      0x011e: PHI (r11v10 boolean) = (r11v20 boolean), (r11v11 boolean) binds: [B:27:0x010e, B:24:0x0106] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0334  */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RemoteViews onNavigationEvent(@NotNull Context context, @NotNull OverviewItemInfo overviewItemInfo, @NotNull OverviewMediumWidgetState.Success success, @Nullable Bitmap bitmap, @Nullable Bitmap bitmap2, boolean z) throws NoWhenBranchMatchedException, Resources.NotFoundException {
        boolean z2;
        ?? r13;
        Currency interfaceDescriptor;
        Double dIAuthTabCallback;
        String strIAuthTabCallback;
        int i;
        CipherSuiteCompanion cipherSuiteCompanionOnExtraCallbackWithResult;
        Double dICustomTabsCallback;
        double dDoubleValue;
        String string;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(overviewItemInfo, "");
        Intrinsics.checkNotNullParameter(success, "");
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_overview_medium_list_item);
        if (bitmap != null) {
            remoteViews.setViewVisibility(R.id.stock_logo_container, 0);
            int i3 = R.id.stock_logo;
            remoteViews.setViewVisibility(i3, 0);
            remoteViews.setImageViewBitmap(i3, bitmap);
        } else {
            remoteViews.setViewVisibility(R.id.stock_logo_container, 8);
            remoteViews.setViewVisibility(R.id.stock_logo, 8);
            int i4 = onNavigationEvent + 17;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = R.id.acc_icon_circle;
        remoteViews.setViewVisibility(i6, 8);
        int i7 = R.id.acc_icon_rect;
        remoteViews.setViewVisibility(i7, 8);
        remoteViews.setInt(i6, "setColorFilter", 0);
        r2a r2aVarIAuthTabCallback = r5ExternalSyntheticLambda0.IAuthTabCallback(overviewItemInfo);
        if (r2aVarIAuthTabCallback != null) {
            int i8 = onNavigationEvent + 37;
            int i9 = i8 % 128;
            onExtraCallbackWithResult = i9;
            int i10 = i8 % 2;
            if (bitmap2 != null) {
                int i11 = i9 + 73;
                onNavigationEvent = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 60 / 0;
                    if (r2aVarIAuthTabCallback.onNavigationEvent()) {
                        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                        int iOnNavigationEvent = varyMatches.onNavigationEvent(Double.valueOf(0.7d), displayMetrics);
                        DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
                        int iOnNavigationEvent2 = varyMatches.onNavigationEvent((Number) 1, displayMetrics2);
                        remoteViews.setViewPadding(i7, iOnNavigationEvent, iOnNavigationEvent2, iOnNavigationEvent, iOnNavigationEvent2);
                        remoteViews.setImageViewBitmap(i7, bitmap2);
                        remoteViews.setViewVisibility(i7, 0);
                    } else {
                        remoteViews.setImageViewBitmap(i6, bitmap2);
                        remoteViews.setViewVisibility(i6, 0);
                    }
                } else if (!(!r2aVarIAuthTabCallback.onNavigationEvent())) {
                }
            }
        }
        int i13 = R.id.stock_name;
        remoteViews.setTextViewText(i13, overviewItemInfo.IAuthTabCallbackStubProxy());
        r8lambdaMKedLQ34eSPA96F3cZORktsT52c r8lambdamkedlq34espa96f3czorktst52c = r8lambdaMKedLQ34eSPA96F3cZORktsT52c.IAuthTabCallback;
        remoteViews.setTextColor(i13, ByteOrderedDataOutputStream.onNavigationEvent(RemoteViewsThemeUtilKt.IAuthTabCallback(r8lambdamkedlq34espa96f3czorktst52c.onNavigationEvent(), context, success.onExtraCallback(), null, 4, null)));
        if (success.extraCallbackWithResult()) {
            int i14 = onExtraCallbackWithResult + 13;
            onNavigationEvent = i14 % 128;
            if (i14 % 2 == 0) {
                dICustomTabsCallback = overviewItemInfo.ICustomTabsCallback();
                z2 = false;
                z2 = false;
                int i15 = 73 / 0;
                if (dICustomTabsCallback != null) {
                    int i16 = onNavigationEvent + 89;
                    onExtraCallbackWithResult = i16 % 128;
                    int i17 = i16 % 2;
                    dDoubleValue = dICustomTabsCallback.doubleValue();
                } else {
                    dDoubleValue = 0.0d;
                }
            } else {
                z2 = false;
                z2 = false;
                dICustomTabsCallback = overviewItemInfo.ICustomTabsCallback();
                if (dICustomTabsCallback != null) {
                }
            }
            if (overviewItemInfo instanceof OverviewItemInfo.Bond) {
                String string2 = context.getString(R.string.securities_asset_my_bond_amount, discard.onExtraCallback.IAuthTabCallback().format(dDoubleValue));
                Intrinsics.checkNotNullExpressionValue(string2, "");
                String strICustomTabsCallbackStub = ((OverviewItemInfo.Bond) overviewItemInfo).ICustomTabsCallbackStub();
                if (strICustomTabsCallbackStub == null) {
                    strICustomTabsCallbackStub = "";
                }
                string = string2 + " · " + strICustomTabsCallbackStub;
            } else if (overviewItemInfo instanceof OverviewItemInfo.Option) {
                string = context.getString(im.toss.tosssecurities.features.main.home.ui.R.string.securities_asset_my_option_amount, discard.onExtraCallback.IAuthTabCallback().format(dDoubleValue));
                Intrinsics.checkNotNull(string);
            } else {
                string = context.getString(R.string.securities_asset_my_stock_amount, discard.onExtraCallback.IAuthTabCallback().format(dDoubleValue));
                Intrinsics.checkNotNull(string);
            }
            int i18 = R.id.stock_quantity;
            remoteViews.setTextViewText(i18, string);
            remoteViews.setTextColor(i18, ByteOrderedDataOutputStream.onNavigationEvent(RemoteViewsThemeUtilKt.IAuthTabCallback(r8lambdamkedlq34espa96f3czorktst52c.asBinder(), context, success.onExtraCallback(), null, 4, null)));
            remoteViews.setViewVisibility(i18, z2 ? 1 : 0);
        } else {
            z2 = false;
            remoteViews.setViewVisibility(R.id.stock_quantity, 8);
        }
        boolean zICustomTabsService = overviewItemInfo instanceof OverviewItemInfo.Stock ? ((OverviewItemInfo.Stock) overviewItemInfo).ICustomTabsService() : z2 ? 1 : 0;
        Object obj = null;
        if (!overviewItemInfo.IAuthTabCallbackDefault()) {
            int i19 = onNavigationEvent + 117;
            onExtraCallbackWithResult = i19 % 128;
            if (i19 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            r13 = 1;
            if (!(!zICustomTabsService)) {
            }
            if (overviewItemInfo.onPostMessage()) {
                interfaceDescriptor = Currency.KRW;
            } else {
                int i20 = onNavigationEvent + 53;
                onExtraCallbackWithResult = i20 % 128;
                if (i20 % 2 != 0) {
                    success.getInterfaceDescriptor();
                    throw null;
                }
                interfaceDescriptor = success.getInterfaceDescriptor();
            }
            Currency currency = interfaceDescriptor;
            if (z2) {
                if (success.extraCallbackWithResult()) {
                    Double dIAuthTabCallback2 = overviewItemInfo instanceof OverviewItemInfo.Bond ? (Double) OverviewItemInfo.Bond.onWarmupCompleted(new Object[]{(OverviewItemInfo.Bond) overviewItemInfo, Boolean.valueOf(success.access100()), success.IAuthTabCallback_Parcel(), currency}, -895773258, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 895773258, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent()) : overviewItemInfo.onExtraCallback(success.access100()).IAuthTabCallback(currency);
                    if (dIAuthTabCallback2 != null) {
                        Resources resources = context.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources, "");
                        strIAuthTabCallback = isHealthy.IAuthTabCallback(dIAuthTabCallback2, currency, resources, false, false, (DecimalFormat) null, (DecimalFormat) null, 60, (Object) null);
                        if (strIAuthTabCallback == null) {
                        }
                    }
                } else {
                    OverviewPrice overviewPriceOnExtraCallbackWithResult = overviewItemInfo.onExtraCallbackWithResult();
                    if (overviewPriceOnExtraCallbackWithResult != null && (dIAuthTabCallback = overviewPriceOnExtraCallbackWithResult.IAuthTabCallback(currency)) != null) {
                        Resources resources2 = context.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources2, "");
                        strIAuthTabCallback = isHealthy.IAuthTabCallback(dIAuthTabCallback, currency, resources2, false, false, (DecimalFormat) null, (DecimalFormat) null, 60, (Object) null);
                        if (strIAuthTabCallback == null) {
                        }
                    }
                }
                int i21 = R.id.stock_price;
                remoteViews.setTextViewText(i21, strIAuthTabCallback);
                remoteViews.setTextColor(i21, ByteOrderedDataOutputStream.onNavigationEvent(RemoteViewsThemeUtilKt.IAuthTabCallback((CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 382802400, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -382802383, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{charset.onExtraCallbackWithResult}), context, success.onExtraCallback(), null, 4, null)));
                i = onExtraCallback.onWarmupCompleted[IAuthTabCallback(overviewItemInfo, success, currency, z2).ordinal()];
                if (i == r13) {
                    cipherSuiteCompanionOnExtraCallbackWithResult = r8lambdamkedlq34espa96f3czorktst52c.onExtraCallbackWithResult();
                } else if (i != 2) {
                    int i22 = onNavigationEvent + 69;
                    onExtraCallbackWithResult = i22 % 128;
                    int i23 = i22 % 2;
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cipherSuiteCompanionOnExtraCallbackWithResult = r8lambdamkedlq34espa96f3czorktst52c.onWarmupCompleted();
                } else {
                    cipherSuiteCompanionOnExtraCallbackWithResult = r8lambdamkedlq34espa96f3czorktst52c.onExtraCallback();
                }
                CipherSuiteCompanion cipherSuiteCompanion = cipherSuiteCompanionOnExtraCallbackWithResult;
                String strIAuthTabCallback2 = IAuthTabCallback(context, overviewItemInfo, success, currency, z2);
                int i24 = R.id.stock_profit;
                remoteViews.setTextViewText(i24, strIAuthTabCallback2);
                remoteViews.setTextColor(i24, ByteOrderedDataOutputStream.onNavigationEvent(RemoteViewsThemeUtilKt.IAuthTabCallback(cipherSuiteCompanion, context, success.onExtraCallback(), null, 4, null)));
                if (!z) {
                    remoteViews.setOnClickFillInIntent(R.id.list_item_container, r7.IAuthTabCallback(r7.onExtraCallbackWithResult, overviewItemInfo, success.onTransact(), null, null, 12, null));
                }
                return remoteViews;
            }
            int i25 = onNavigationEvent + 35;
            onExtraCallbackWithResult = i25 % 128;
            int i26 = i25 % 2;
            strIAuthTabCallback = "-";
            int i212 = R.id.stock_price;
            remoteViews.setTextViewText(i212, strIAuthTabCallback);
            remoteViews.setTextColor(i212, ByteOrderedDataOutputStream.onNavigationEvent(RemoteViewsThemeUtilKt.IAuthTabCallback((CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 382802400, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -382802383, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{charset.onExtraCallbackWithResult}), context, success.onExtraCallback(), null, 4, null)));
            i = onExtraCallback.onWarmupCompleted[IAuthTabCallback(overviewItemInfo, success, currency, z2).ordinal()];
            if (i == r13) {
            }
            CipherSuiteCompanion cipherSuiteCompanion2 = cipherSuiteCompanionOnExtraCallbackWithResult;
            String strIAuthTabCallback22 = IAuthTabCallback(context, overviewItemInfo, success, currency, z2);
            int i242 = R.id.stock_profit;
            remoteViews.setTextViewText(i242, strIAuthTabCallback22);
            remoteViews.setTextColor(i242, ByteOrderedDataOutputStream.onNavigationEvent(RemoteViewsThemeUtilKt.IAuthTabCallback(cipherSuiteCompanion2, context, success.onExtraCallback(), null, 4, null)));
            if (!z) {
            }
            return remoteViews;
        }
        r13 = 1;
        z2 = r13;
        r13 = r13;
        if (overviewItemInfo.onPostMessage()) {
        }
        Currency currency2 = interfaceDescriptor;
        if (z2) {
        }
        strIAuthTabCallback = "-";
        int i2122 = R.id.stock_price;
        remoteViews.setTextViewText(i2122, strIAuthTabCallback);
        remoteViews.setTextColor(i2122, ByteOrderedDataOutputStream.onNavigationEvent(RemoteViewsThemeUtilKt.IAuthTabCallback((CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 382802400, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -382802383, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{charset.onExtraCallbackWithResult}), context, success.onExtraCallback(), null, 4, null)));
        i = onExtraCallback.onWarmupCompleted[IAuthTabCallback(overviewItemInfo, success, currency2, z2).ordinal()];
        if (i == r13) {
        }
        CipherSuiteCompanion cipherSuiteCompanion22 = cipherSuiteCompanionOnExtraCallbackWithResult;
        String strIAuthTabCallback222 = IAuthTabCallback(context, overviewItemInfo, success, currency2, z2);
        int i2422 = R.id.stock_profit;
        remoteViews.setTextViewText(i2422, strIAuthTabCallback222);
        remoteViews.setTextColor(i2422, ByteOrderedDataOutputStream.onNavigationEvent(RemoteViewsThemeUtilKt.IAuthTabCallback(cipherSuiteCompanion22, context, success.onExtraCallback(), null, 4, null)));
        if (!z) {
        }
        return remoteViews;
    }

    private final OverviewPrice onExtraCallbackWithResult(OverviewItemInfo overviewItemInfo, OverviewMediumWidgetState.Success success) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            if (success.writeTypedObject()) {
                OverviewPrice overviewPriceOnNavigationEvent = overviewItemInfo.onNavigationEvent();
                int i3 = onExtraCallbackWithResult + 35;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return overviewPriceOnNavigationEvent;
            }
            return overviewItemInfo.onWarmupCompleted(success.access100());
        }
        success.writeTypedObject();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final OverviewRate IAuthTabCallback(OverviewItemInfo overviewItemInfo, OverviewMediumWidgetState.Success success) {
        int i = 2 % 2;
        if (success.writeTypedObject()) {
            int i2 = onNavigationEvent + 53;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return overviewItemInfo.onExtraCallback();
        }
        OverviewRate overviewRateOnNavigationEvent = overviewItemInfo.onNavigationEvent(success.access100());
        int i4 = onNavigationEvent + 25;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return overviewRateOnNavigationEvent;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r8 == im.toss.tosssecurities.core.currency.domain.Currency.USD) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if (r8 == im.toss.tosssecurities.core.currency.domain.Currency.USD) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        r6 = ((im.toss.securities.widget.data.model.overview.OverviewItemInfo.Bond) r6).ICustomTabsCallbackStubProxy().onNavigationEvent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r6 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
    
        r2 = java.lang.Double.valueOf(java.lang.Math.signum(r6.doubleValue()));
        r6 = o.r5b.onExtraCallbackWithResult + 23;
        o.r5b.onNavigationEvent = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        if ((r6 % 2) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
    
        r6 = 5 / 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r2, 1.0d) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        r6 = o.r5b.onExtraCallbackWithResult + 17;
        o.r5b.onNavigationEvent = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007a, code lost:
    
        return o.checkDuration.UP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0081, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r2, -1.0d) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
    
        return o.checkDuration.DOWN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0088, code lost:
    
        return o.checkDuration.EQUAL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008b, code lost:
    
        return o.checkDuration.EQUAL;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final checkDuration IAuthTabCallback(OverviewItemInfo overviewItemInfo, OverviewMediumWidgetState.Success success, Currency currency, boolean z) throws NoWhenBranchMatchedException {
        double dDoubleValue;
        double dDoubleValue2;
        int i = 2 % 2;
        if (z) {
            int i2 = onNavigationEvent + 109;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return checkDuration.EQUAL;
        }
        Double dValueOf = null;
        if (!success.extraCallbackWithResult()) {
            if (overviewItemInfo instanceof OverviewItemInfo.Bond) {
                Double dOnNavigationEvent = ((OverviewItemInfo.Bond) overviewItemInfo).onExtraCallback().onNavigationEvent(currency);
                double dDoubleValue3 = dOnNavigationEvent != null ? dOnNavigationEvent.doubleValue() : 0.0d;
                return dDoubleValue3 > 0.0d ? checkDuration.UP : dDoubleValue3 < 0.0d ? checkDuration.DOWN : checkDuration.EQUAL;
            }
            StockTic stockTicOnMessageChannelReady = overviewItemInfo.onMessageChannelReady();
            Double dOnWarmupCompleted = stockTicOnMessageChannelReady.onWarmupCompleted(currency);
            if (dOnWarmupCompleted != null) {
                int i4 = onExtraCallbackWithResult + 71;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    dOnWarmupCompleted.doubleValue();
                    dValueOf.hashCode();
                    throw null;
                }
                dDoubleValue = dOnWarmupCompleted.doubleValue();
            } else {
                dDoubleValue = 0.0d;
            }
            Double dOnNavigationEvent2 = stockTicOnMessageChannelReady.onNavigationEvent(currency);
            double dDoubleValue4 = dOnNavigationEvent2 != null ? dOnNavigationEvent2.doubleValue() : 0.0d;
            if (dDoubleValue <= dDoubleValue4) {
                return dDoubleValue < dDoubleValue4 ? checkDuration.UP : checkDuration.EQUAL;
            }
            int i5 = onNavigationEvent + 121;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return checkDuration.DOWN;
        }
        if (!(overviewItemInfo instanceof OverviewItemInfo.Bond) || success.IAuthTabCallback_Parcel() != r2ExternalSyntheticLambda1.MATURITY) {
            OverviewPrice overviewPriceOnExtraCallbackWithResult = onExtraCallbackWithResult(overviewItemInfo, success);
            if (overviewPriceOnExtraCallbackWithResult != null) {
                int i7 = onExtraCallbackWithResult + 35;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                Double dIAuthTabCallback = overviewPriceOnExtraCallbackWithResult.IAuthTabCallback(currency);
                dDoubleValue2 = dIAuthTabCallback != null ? dIAuthTabCallback.doubleValue() : 0.0d;
            }
            return dDoubleValue2 > 0.0d ? checkDuration.UP : dDoubleValue2 < 0.0d ? checkDuration.DOWN : checkDuration.EQUAL;
        }
        int i9 = onExtraCallbackWithResult + 29;
        onNavigationEvent = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 49 / 0;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String IAuthTabCallback(Context context, OverviewItemInfo overviewItemInfo, OverviewMediumWidgetState.Success success, Currency currency, boolean z) throws NoWhenBranchMatchedException, Resources.NotFoundException {
        Double dIAuthTabCallback;
        String str;
        String str2;
        String str3;
        int i = 2 % 2;
        if (z) {
            return "";
        }
        String str4 = "-";
        if (success.extraCallbackWithResult()) {
            if ((!(overviewItemInfo instanceof OverviewItemInfo.Bond)) || success.IAuthTabCallback_Parcel() != r2ExternalSyntheticLambda1.MATURITY) {
                Resources resources = context.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "");
                String strOnWarmupCompleted = r6a.onWarmupCompleted(resources, onExtraCallbackWithResult(overviewItemInfo, success), IAuthTabCallback(overviewItemInfo, success), currency, success.writeTypedObject(), false);
                int i2 = onExtraCallbackWithResult + 73;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return strOnWarmupCompleted;
            }
            StringBuilder sb = new StringBuilder();
            if (currency == Currency.USD) {
                Double dOnNavigationEvent = ((OverviewItemInfo.Bond) overviewItemInfo).ICustomTabsCallbackStubProxy().onNavigationEvent();
                if (dOnNavigationEvent != null) {
                    int i4 = onExtraCallbackWithResult + 125;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 == 0) {
                        dValueOf = Double.valueOf(Math.signum(dOnNavigationEvent.doubleValue()));
                        int i5 = 32 / 0;
                    } else {
                        dValueOf = Double.valueOf(Math.signum(dOnNavigationEvent.doubleValue()));
                    }
                }
                if (Intrinsics.areEqual(dValueOf, 1.0d)) {
                    str3 = "+";
                } else {
                    Intrinsics.areEqual(dValueOf, -1.0d);
                    str3 = "";
                }
                if (dOnNavigationEvent != null) {
                    Resources resources2 = context.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources2, "");
                    String strIAuthTabCallback = isHealthy.IAuthTabCallback(dOnNavigationEvent, currency, resources2, false, false, (DecimalFormat) null, (DecimalFormat) null, 56, (Object) null);
                    if (strIAuthTabCallback == null) {
                        int i6 = onNavigationEvent + 49;
                        onExtraCallbackWithResult = i6 % 128;
                        int i7 = i6 % 2;
                    } else {
                        str4 = strIAuthTabCallback;
                    }
                }
                sb.append(str3 + str4);
            } else {
                sb.append("오늘 환율 기준");
            }
            return sb.toString();
        }
        if (!(overviewItemInfo instanceof OverviewItemInfo.Option)) {
            int i8 = onNavigationEvent + 19;
            int i9 = i8 % 128;
            onExtraCallbackWithResult = i9;
            if (i8 % 2 != 0) {
                boolean z2 = overviewItemInfo instanceof OverviewItemInfo.Stock;
                throw null;
            }
            if (!(overviewItemInfo instanceof OverviewItemInfo.Stock)) {
                int i10 = i9 + 15;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                if (!(overviewItemInfo instanceof OverviewItemInfo.Bond)) {
                    throw new NoWhenBranchMatchedException();
                }
                int i12 = i9 + 21;
                onNavigationEvent = i12 % 128;
                int i13 = i12 % 2;
                OverviewItemInfo.Bond bond = (OverviewItemInfo.Bond) overviewItemInfo;
                Double dIAuthTabCallback2 = bond.onExtraCallbackWithResult().IAuthTabCallback(currency);
                OverviewPrice overviewPriceIAuthTabCallback = bond.IAuthTabCallback();
                Double dOnNavigationEvent2 = isHealthy.onNavigationEvent(overviewPriceIAuthTabCallback != null ? overviewPriceIAuthTabCallback.IAuthTabCallback(currency) : null, dIAuthTabCallback2);
                if (dOnNavigationEvent2 == null || (str2 = discard.onExtraCallback.onExtraCallback().format(Math.abs(dOnNavigationEvent2.doubleValue()))) == null) {
                    str2 = "-";
                }
                if (dOnNavigationEvent2 == null) {
                    int i14 = onNavigationEvent + 91;
                    onExtraCallbackWithResult = i14 % 128;
                    if (i14 % 2 != 0) {
                        int i15 = 73 / 0;
                    }
                    return str2;
                }
                if (dOnNavigationEvent2.doubleValue() > 0.0d) {
                    return "+" + str2;
                }
                if (dOnNavigationEvent2.doubleValue() >= 0.0d) {
                    return "0.0%";
                }
                return "-" + str2;
            }
        }
        OverviewPrice overviewPriceOnExtraCallbackWithResult = overviewItemInfo.onExtraCallbackWithResult();
        if (overviewPriceOnExtraCallbackWithResult != null) {
            int i16 = onNavigationEvent + 123;
            onExtraCallbackWithResult = i16 % 128;
            if (i16 % 2 != 0) {
                overviewPriceOnExtraCallbackWithResult.IAuthTabCallback(currency);
                throw null;
            }
            dIAuthTabCallback = overviewPriceOnExtraCallbackWithResult.IAuthTabCallback(currency);
        } else {
            dIAuthTabCallback = null;
        }
        OverviewPrice overviewPriceIAuthTabCallback2 = overviewItemInfo.IAuthTabCallback();
        Double dOnNavigationEvent3 = isHealthy.onNavigationEvent(overviewPriceIAuthTabCallback2 != null ? overviewPriceIAuthTabCallback2.IAuthTabCallback(currency) : null, dIAuthTabCallback);
        if (dOnNavigationEvent3 != null) {
            str = discard.onExtraCallback.onExtraCallback().format(Math.abs(dOnNavigationEvent3.doubleValue()));
            if (str == null) {
                str = "-";
            }
        }
        StringBuilder sb2 = new StringBuilder();
        if (dOnNavigationEvent3 == null) {
            int i17 = onExtraCallbackWithResult + 101;
            onNavigationEvent = i17 % 128;
            int i18 = i17 % 2;
            sb2.append(str);
        } else if (dOnNavigationEvent3.doubleValue() > 0.0d) {
            sb2.append("+");
            sb2.append(str);
        } else if (Intrinsics.areEqual(dOnNavigationEvent3, 0.0d)) {
            sb2.append("0.0%");
        } else {
            sb2.append("-");
            sb2.append(str);
        }
        return sb2.toString();
    }
}
