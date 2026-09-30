package o;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import im.toss.tosssecurities.host.contracts.DisplaySetting;
import im.toss.tosssecurities.widget.watchlist.medium.WatchlistMediumRemoteViewsFactory$;
import im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.wie2;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFi1uSDK implements RemoteViewsService.RemoteViewsFactory {
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int asInterface;
    private final Intent IAuthTabCallback;
    private r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg asBinder;
    private DisplaySetting onExtraCallback;
    private final Context onExtraCallbackWithResult;
    private List<WatchlistWidgetState.RowItem> onTransact;
    private final Lazy onWarmupCompleted;
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    public static final int onNavigationEvent = 8;

    static {
        int i = IAuthTabCallbackStubProxy + 87;
        asInterface = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ int onWarmupCompleted(AFi1uSDK aFi1uSDK) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 105;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = onNavigationEvent(aFi1uSDK);
        int i4 = IAuthTabCallbackDefault + 93;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return iOnNavigationEvent;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public long getItemId(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 27;
        int i4 = i3 % 128;
        IAuthTabCallbackStub = i4;
        int i5 = i3 % 2;
        long j = i;
        int i6 = i4 + 79;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return j;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public RemoteViews getLoadingView() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 111;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 75;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 31 / 0;
        }
        return null;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public int getViewTypeCount() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 35;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 101;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return 1;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public boolean hasStableIds() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 123;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 39;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public void onCreate() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 39;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public AFi1uSDK(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(intent, "");
        this.onExtraCallbackWithResult = context;
        this.IAuthTabCallback = intent;
        this.onWarmupCompleted = LazyKt__LazyJVMKt.lazy(new WatchlistMediumRemoteViewsFactory$.ExternalSyntheticLambda0(this));
        this.onTransact = CollectionsKt__CollectionsKt.emptyList();
        this.asBinder = r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg.MY_ASSET;
        this.onExtraCallback = DisplaySetting.SYSTEM;
    }

    private final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 21;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Number) this.onWarmupCompleted.getValue()).intValue();
        int i4 = IAuthTabCallbackStub + 85;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return iIntValue;
    }

    private static final int onNavigationEvent(AFi1uSDK aFi1uSDK) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 69;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int intExtra = aFi1uSDK.IAuthTabCallback.getIntExtra("appWidgetId", 0);
        int i4 = IAuthTabCallbackStub + 31;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return intExtra;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c0  */
    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDataSetChanged() {
        Object obj;
        List<WatchlistWidgetState.RowItem> listEmptyList;
        int i = 2 % 2;
        SharedPreferences sharedPreferences = this.onExtraCallbackWithResult.getSharedPreferences("watchlist_medium_widget_prefs", 0);
        String string = sharedPreferences.getString("items_" + onExtraCallbackWithResult(), null);
        int i2 = sharedPreferences.getInt("type_" + onExtraCallbackWithResult(), r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg.MY_ASSET.ordinal());
        int i3 = sharedPreferences.getInt("display_setting_" + onExtraCallbackWithResult(), DisplaySetting.SYSTEM.ordinal());
        try {
            Result.Companion companion = Result.Companion;
            q8a.onNavigationEvent.onExtraCallbackWithResult(access8000.IAuthTabCallbackStub(getWrite.IAuthTabCallback("function", "WatchlistMediumRemoteViewsFactory.onDataSetChanged"), getWrite.IAuthTabCallback("appWidgetId", Integer.valueOf(onExtraCallbackWithResult())), getWrite.IAuthTabCallback("hasData", Boolean.valueOf(string != null))));
            Result.m31constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m31constructorimpl(ResultKt.createFailure(th));
        }
        EnumEntries entries = r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg.getEntries();
        if (i2 >= 0) {
            int i4 = IAuthTabCallbackStub + 95;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            obj = i2 < entries.size() ? entries.get(i2) : r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg.MY_ASSET;
        }
        this.asBinder = (r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg) obj;
        EnumEntries entries2 = DisplaySetting.getEntries();
        this.onExtraCallback = (DisplaySetting) ((i3 < 0 || i3 >= entries2.size()) ? DisplaySetting.SYSTEM : entries2.get(i3));
        if (string != null) {
            try {
                wie2.IAuthTabCallback iAuthTabCallback = wie2.Default;
                iAuthTabCallback.onExtraCallback();
                Object objOnExtraCallback = iAuthTabCallback.onExtraCallback(new checkCanOpenLandingPage(WatchlistWidgetState.RowItem.Companion.serializer()), string);
                List list = (List) objOnExtraCallback;
                try {
                    Result.Companion companion3 = Result.Companion;
                    q8a.onNavigationEvent.onExtraCallbackWithResult(access8000.IAuthTabCallbackStub(getWrite.IAuthTabCallback("function", "WatchlistMediumRemoteViewsFactory.onDataSetChanged"), getWrite.IAuthTabCallback("appWidgetId", Integer.valueOf(onExtraCallbackWithResult())), getWrite.IAuthTabCallback("parsedItemsCount", Integer.valueOf(list.size()))));
                    Result.m31constructorimpl(Unit.INSTANCE);
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.Companion;
                    Result.m31constructorimpl(ResultKt.createFailure(th2));
                }
                listEmptyList = (List) objOnExtraCallback;
            } catch (Exception e) {
                try {
                    Result.Companion companion5 = Result.Companion;
                    q8a q8aVar = q8a.onNavigationEvent;
                    Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("function", "WatchlistMediumRemoteViewsFactory.onDataSetChanged");
                    Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("appWidgetId", Integer.valueOf(onExtraCallbackWithResult()));
                    String message = e.getMessage();
                    if (message == null) {
                        message = "parse error";
                    }
                    q8aVar.onExtraCallbackWithResult(access8000.IAuthTabCallbackStub(pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback("error", message)));
                    Result.m31constructorimpl(Unit.INSTANCE);
                } catch (Throwable th3) {
                    Result.Companion companion6 = Result.Companion;
                    Result.m31constructorimpl(ResultKt.createFailure(th3));
                }
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
        } else {
            List<WatchlistWidgetState.RowItem> listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
            int i6 = IAuthTabCallbackStub + 41;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            listEmptyList = listEmptyList2;
        }
        this.onTransact = listEmptyList;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public RemoteViews getViewAt(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 111;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        WatchlistWidgetState.RowItem rowItem = (WatchlistWidgetState.RowItem) CollectionsKt___CollectionsKt.getOrNull(this.onTransact, i);
        if (rowItem == null) {
            int i5 = IAuthTabCallbackDefault + 51;
            IAuthTabCallbackStub = i5 % 128;
            Object obj = null;
            if (i5 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        return z_.onExtraCallback(z_.onExtraCallback, this.onExtraCallbackWithResult, onExtraCallbackWithResult(), rowItem, this.asBinder, this.onExtraCallback, null, false, 64, null);
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public int getCount() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 71;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int size = this.onTransact.size();
        int i4 = IAuthTabCallbackDefault + 5;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return size;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 19;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            this.onTransact = CollectionsKt__CollectionsKt.emptyList();
            int i3 = 73 / 0;
        } else {
            this.onTransact = CollectionsKt__CollectionsKt.emptyList();
        }
        int i4 = IAuthTabCallbackDefault + 83;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallbackWithResult {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final void onWarmupCompleted(@NotNull Context context, int i, @NotNull List<WatchlistWidgetState.RowItem> list, @NotNull r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg r8lambdabrizzqzhaizmdvstl2yymmz7zsg, @NotNull DisplaySetting displaySetting) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(r8lambdabrizzqzhaizmdvstl2yymmz7zsg, "");
            Intrinsics.checkNotNullParameter(displaySetting, "");
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("watchlist_medium_widget_prefs", 0).edit();
            wie2.IAuthTabCallback iAuthTabCallback = wie2.Default;
            iAuthTabCallback.onExtraCallback();
            editorEdit.putString("items_" + i, iAuthTabCallback.onWarmupCompleted(new checkCanOpenLandingPage(WatchlistWidgetState.RowItem.Companion.serializer()), list));
            editorEdit.putInt("type_" + i, r8lambdabrizzqzhaizmdvstl2yymmz7zsg.ordinal());
            editorEdit.putInt("display_setting_" + i, displaySetting.ordinal());
            boolean zCommit = editorEdit.commit();
            try {
                Result.Companion companion = Result.Companion;
                q8a.onNavigationEvent.onExtraCallbackWithResult(access8000.IAuthTabCallbackStub(getWrite.IAuthTabCallback("function", "WatchlistMediumRemoteViewsFactory.saveItemsToPrefs"), getWrite.IAuthTabCallback("appWidgetId", Integer.valueOf(i)), getWrite.IAuthTabCallback("itemCount", Integer.valueOf(list.size())), getWrite.IAuthTabCallback("success", Boolean.valueOf(zCommit))));
                Result.m31constructorimpl(Unit.INSTANCE);
                int i3 = onWarmupCompleted + 95;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 89 / 0;
                }
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                Result.m31constructorimpl(ResultKt.createFailure(th));
            }
        }

        public final void onNavigationEvent(@NotNull Context context, int i) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("watchlist_medium_widget_prefs", 0).edit();
            editorEdit.remove("items_" + i);
            editorEdit.remove("type_" + i);
            editorEdit.remove("display_setting_" + i);
            editorEdit.apply();
            try {
                Result.Companion companion = Result.Companion;
                q8a.onNavigationEvent.onExtraCallbackWithResult(access8000.IAuthTabCallbackStub(getWrite.IAuthTabCallback("function", "WatchlistMediumRemoteViewsFactory.clearPrefs"), getWrite.IAuthTabCallback("appWidgetId", Integer.valueOf(i))));
                Result.m31constructorimpl(Unit.INSTANCE);
                int i3 = IAuthTabCallback + 59;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                Result.m31constructorimpl(ResultKt.createFailure(th));
            }
        }
    }
}
