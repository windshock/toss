package im.toss.features.account.impl;

import com.google.android.material.datepicker.DateFormatTextWatcher$;
import kotlin.jvm.functions.Function1;
import o.TitleBarCloseBtnClickInterceptPointCloseButtonClickCallback;
import o.deserializeIntNullableCollection;
import o.showFavorites;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AccountRepositoryImpl$$ExternalSyntheticLambda3 implements deserializeIntNullableCollection {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ Function1 f$0;

    public final Object apply(Object obj) {
        TitleBarCloseBtnClickInterceptPointCloseButtonClickCallback titleBarCloseBtnClickInterceptPointCloseButtonClickCallback;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr = {this.f$0, obj};
            titleBarCloseBtnClickInterceptPointCloseButtonClickCallback = (TitleBarCloseBtnClickInterceptPointCloseButtonClickCallback) showFavorites.IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, -1358842117, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1358842119);
            int i3 = 59 / 0;
        } else {
            Object[] objArr2 = {this.f$0, obj};
            titleBarCloseBtnClickInterceptPointCloseButtonClickCallback = (TitleBarCloseBtnClickInterceptPointCloseButtonClickCallback) showFavorites.IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), objArr2, -1358842117, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1358842119);
        }
        int i4 = onExtraCallback + 67;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return titleBarCloseBtnClickInterceptPointCloseButtonClickCallback;
        }
        throw null;
    }
}
