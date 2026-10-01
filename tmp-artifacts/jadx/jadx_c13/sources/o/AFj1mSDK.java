package o;

import android.app.PendingIntent;
import android.content.Context;
import android.widget.RemoteViews;
import com.google.firebase.messaging.FcmBroadcastProcessor$;
import im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$;
import im.toss.features.usshome.UssHomeItemAdapter$;
import im.toss.securities.widget.common.utils.RemoteViewsThemeUtil;
import im.toss.securities.widget.common.utils.RemoteViewsThemeUtilKt;
import im.toss.securities.widget.common.utils.RoutesKt;
import im.toss.securities.widget.data.model.watchlists.ItemType;
import im.toss.securities.widget.watchlist.R;
import im.toss.tosssecurities.host.contracts.DisplaySetting;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$$ExternalSyntheticLambda10;
import im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AFj1mSDK;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFj1mSDK {
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public static final AFj1mSDK IAuthTabCallback = new AFj1mSDK();
    private static final List<onWarmupCompleted> onNavigationEvent = CollectionsKt__CollectionsKt.listOf((Object[]) new onWarmupCompleted[]{new onWarmupCompleted(R.id.first_item_container, R.id.first_name, R.id.first_price, R.id.first_profit_ratio), new onWarmupCompleted(R.id.second_item_container, R.id.second_name, R.id.second_price, R.id.second_profit_ratio), new onWarmupCompleted(R.id.third_item_container, R.id.third_name, R.id.third_price, R.id.third_profit_ratio)});

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i4;
        int i9 = (~(i8 | i5)) | i7;
        int i10 = ~i5;
        int i11 = ~(i8 | i10 | i2);
        int i12 = (~(i5 | i7)) | i8 | (~(i10 | i2));
        int i13 = i2 + i4 + i6 + (325770565 * i3) + ((-1284996642) * i);
        int i14 = i13 * i13;
        int i15 = ((789042555 * i2) - 1205338112) + ((-1364710777) * i4) + (i9 * 1076876666) + (1076876666 * i11) + ((-1076876666) * i12) + ((-287834112) * i6) + ((-667418624) * i3) + ((-145752064) * i) + (1116340224 * i14);
        int i16 = (i2 * (-1991011123)) + 595473426 + (i4 * (-1991009311)) + (i9 * (-906)) + (i11 * (-906)) + (i12 * 906) + (i6 * (-1991010217)) + (i3 * (-1223611789)) + (i * (-291900814)) + (i14 * (-1931083776));
        int i17 = i15 + (i16 * i16 * (-1558839296));
        return i17 != 1 ? i17 != 2 ? onNavigationEvent(objArr) : IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        WatchlistWidgetState.RowItem rowItem = (WatchlistWidgetState.RowItem) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String strOnNavigationEvent = onNavigationEvent(rowItem);
        if (i3 != 0) {
            int i4 = 58 / 0;
        }
        return strOnNavigationEvent;
    }

    public static /* synthetic */ String onExtraCallback(WatchlistWidgetState.ProductSuccess productSuccess, WatchlistWidgetState.RowItem rowItem) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallback = IAuthTabCallback(productSuccess, rowItem);
        if (i3 != 0) {
            int i4 = 27 / 0;
        }
        return strIAuthTabCallback;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Context context = (Context) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        WatchlistWidgetState.ProductSuccess productSuccess = (WatchlistWidgetState.ProductSuccess) objArr[2];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        PendingIntent pendingIntentOnNavigationEvent = onNavigationEvent(context, iIntValue, productSuccess);
        int i4 = onWarmupCompleted + 45;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return pendingIntentOnNavigationEvent;
    }

    public static /* synthetic */ PendingIntent onWarmupCompleted(Context context, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 57;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        PendingIntent pendingIntentOnExtraCallback = onExtraCallback(context, i);
        int i5 = onWarmupCompleted + 45;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 58 / 0;
        }
        return pendingIntentOnExtraCallback;
    }

    private AFj1mSDK() {
    }

    public static abstract class IAuthTabCallback {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private final boolean onNavigationEvent;

        public /* synthetic */ IAuthTabCallback(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(z);
        }

        private IAuthTabCallback(boolean z) {
            this.onNavigationEvent = z;
        }

        public boolean onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 89;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            boolean z = this.onNavigationEvent;
            int i5 = i2 + 11;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return z;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final class onExtraCallback extends IAuthTabCallback {
            public static final onExtraCallback IAuthTabCallback = new onExtraCallback();
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            static {
                int i = onNavigationEvent + 5;
                onWarmupCompleted = i % 128;
                int i2 = i % 2;
            }

            /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
            
                if ((!(r6 instanceof o.AFj1mSDK.IAuthTabCallback.onExtraCallback)) == false) goto L13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
            
                return true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
            
                if (r5 == r6) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
            
                if (r5 == r6) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
            
                r2 = r2 + 101;
                o.AFj1mSDK.IAuthTabCallback.onExtraCallback.onExtraCallbackWithResult = r2 % 128;
                r2 = r2 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
            
                return true;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 87;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                if (i2 % 2 != 0) {
                    int i4 = 77 / 0;
                }
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 99;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                if (i2 % 2 != 0) {
                    throw null;
                }
                int i4 = i3 + 23;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return 573229335;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onExtraCallback;
                int i3 = i2 + 21;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 45;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 91 / 0;
                }
                return "GeneralError";
            }

            private onExtraCallback() {
                super(true, null);
            }
        }

        public static final class onNavigationEvent extends IAuthTabCallback {
            private static int IAuthTabCallback = 0;
            public static final onNavigationEvent onExtraCallback = new onNavigationEvent();
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            static {
                int i = onNavigationEvent + 61;
                onWarmupCompleted = i % 128;
                int i2 = i % 2;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    int i2 = onExtraCallbackWithResult + 113;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    return true;
                }
                if (obj instanceof onNavigationEvent) {
                    return true;
                }
                int i4 = onExtraCallbackWithResult + 103;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 37;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 52 / 0;
                }
                int i5 = i2 + 37;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return -931114095;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 47;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                if (i2 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i4 = i3 + 123;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return "NetworkError";
            }

            private onNavigationEvent() {
                super(true, null);
            }
        }

        /* renamed from: o.AFj1mSDK$IAuthTabCallback$IAuthTabCallback, reason: collision with other inner class name */
        public static final class C0018IAuthTabCallback extends IAuthTabCallback {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;
            public static final C0018IAuthTabCallback onWarmupCompleted = new C0018IAuthTabCallback();

            static {
                int i = onExtraCallback + 27;
                onExtraCallbackWithResult = i % 128;
                int i2 = i % 2;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 115;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                if (this == obj || (obj instanceof C0018IAuthTabCallback)) {
                    return true;
                }
                int i4 = i2 + 55;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 91;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    return 1397396764;
                }
                int i3 = 45 / 0;
                return 1397396764;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 3;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return "Maintenance";
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private C0018IAuthTabCallback() {
                super(false, null);
            }
        }

        public static final class onExtraCallbackWithResult extends IAuthTabCallback {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;
            private final r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg onExtraCallback;
            private final Long onNavigationEvent;

            /* JADX WARN: Illegal instructions before constructor call */
            public onExtraCallbackWithResult() {
                r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg r8lambdabrizzqzhaizmdvstl2yymmz7zsg = null;
                this(r8lambdabrizzqzhaizmdvstl2yymmz7zsg, r8lambdabrizzqzhaizmdvstl2yymmz7zsg, 3, r8lambdabrizzqzhaizmdvstl2yymmz7zsg);
            }

            /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
            
                if ((r6 instanceof o.AFj1mSDK.IAuthTabCallback.onExtraCallbackWithResult) != false) goto L13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
            
                r6 = (o.AFj1mSDK.IAuthTabCallback.onExtraCallbackWithResult) r6;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
            
                if (r5.onExtraCallback == r6.onExtraCallback) goto L16;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onNavigationEvent, r6.onNavigationEvent) == false) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
            
                return true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
            
                if (r5 == r6) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
            
                if (r5 == r6) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
            
                r3 = r3 + 1;
                o.AFj1mSDK.IAuthTabCallback.onExtraCallbackWithResult.onExtraCallbackWithResult = r3 % 128;
                r3 = r3 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
            
                return true;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 1;
                int i3 = i2 % 128;
                IAuthTabCallback = i3;
                if (i2 % 2 == 0) {
                    int i4 = 3 / 0;
                }
            }

            public int hashCode() {
                int iHashCode;
                int i = 2 % 2;
                r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg r8lambdabrizzqzhaizmdvstl2yymmz7zsg = this.onExtraCallback;
                if (r8lambdabrizzqzhaizmdvstl2yymmz7zsg == null) {
                    int i2 = IAuthTabCallback + 41;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    iHashCode = 0;
                } else {
                    iHashCode = r8lambdabrizzqzhaizmdvstl2yymmz7zsg.hashCode();
                    int i4 = onExtraCallbackWithResult + 25;
                    IAuthTabCallback = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 4 / 5;
                    }
                }
                Long l = this.onNavigationEvent;
                return (iHashCode * 31) + (l != null ? l.hashCode() : 0);
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Empty(watchlistType=" + this.onExtraCallback + ", watchlistId=" + this.onNavigationEvent + ")";
                int i2 = onExtraCallbackWithResult + 83;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            public onExtraCallbackWithResult(@Nullable r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg r8lambdabrizzqzhaizmdvstl2yymmz7zsg, @Nullable Long l) {
                super(false, null);
                this.onExtraCallback = r8lambdabrizzqzhaizmdvstl2yymmz7zsg;
                this.onNavigationEvent = l;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ onExtraCallbackWithResult(r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg r8lambdabrizzqzhaizmdvstl2yymmz7zsg, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i & 1) != 0) {
                    int i2 = onExtraCallbackWithResult + 47;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    r8lambdabrizzqzhaizmdvstl2yymmz7zsg = null;
                }
                if ((i & 2) != 0) {
                    int i4 = onExtraCallbackWithResult + 29;
                    IAuthTabCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 2 % 2;
                    }
                    l = null;
                }
                this(r8lambdabrizzqzhaizmdvstl2yymmz7zsg, l);
            }

            public final r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 59;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    return this.onExtraCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final Long onExtraCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 111;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Long l = this.onNavigationEvent;
                int i5 = i2 + 113;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return l;
            }
        }
    }

    public static /* synthetic */ RemoteViews onExtraCallback(AFj1mSDK aFj1mSDK, Context context, int i, WatchlistWidgetState watchlistWidgetState, boolean z, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult;
        int i5 = i4 + 31;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0 ? (i2 & 8) != 0 : (i2 & 30) != 0) {
            int i6 = i4 + 75;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        return aFj1mSDK.onExtraCallbackWithResult(context, i, watchlistWidgetState, z);
    }

    public final RemoteViews onExtraCallbackWithResult(@NotNull Context context, int i, @NotNull WatchlistWidgetState watchlistWidgetState, boolean z) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 123;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(watchlistWidgetState, "");
        q8a.onNavigationEvent.IAuthTabCallback(i);
        if (watchlistWidgetState instanceof WatchlistWidgetState.ProductSuccess) {
            int i5 = onWarmupCompleted + 59;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return onExtraCallback(context, i, (WatchlistWidgetState.ProductSuccess) watchlistWidgetState, z);
        }
        r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg r8lambdabrizzqzhaizmdvstl2yymmz7zsg = null;
        if (watchlistWidgetState instanceof WatchlistWidgetState.IndexSuccess) {
            int i7 = onWarmupCompleted + 13;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 == 0) {
                return onExtraCallback(context, i, (WatchlistWidgetState.IndexSuccess) watchlistWidgetState, z);
            }
            onExtraCallback(context, i, (WatchlistWidgetState.IndexSuccess) watchlistWidgetState, z);
            r8lambdabrizzqzhaizmdvstl2yymmz7zsg.hashCode();
            throw null;
        }
        if (watchlistWidgetState instanceof WatchlistWidgetState.Loading) {
            Object[] objArr = {this, context, Integer.valueOf(i), watchlistWidgetState, Boolean.valueOf(z)};
            int iOnExtraCallback = WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback();
            int iOnExtraCallback2 = WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback();
            return (RemoteViews) IAuthTabCallback(WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), 1342547571, WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), -1342547570, objArr, iOnExtraCallback, iOnExtraCallback2);
        }
        if (watchlistWidgetState instanceof WatchlistWidgetState.Error) {
            int i8 = onExtraCallbackWithResult + 35;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 != 0) {
                return onExtraCallbackWithResult(context, i, watchlistWidgetState, z, IAuthTabCallback.onExtraCallback.IAuthTabCallback);
            }
            onExtraCallbackWithResult(context, i, watchlistWidgetState, z, IAuthTabCallback.onExtraCallback.IAuthTabCallback);
            r8lambdabrizzqzhaizmdvstl2yymmz7zsg.hashCode();
            throw null;
        }
        if (watchlistWidgetState instanceof WatchlistWidgetState.NetworkError) {
            return onExtraCallbackWithResult(context, i, watchlistWidgetState, z, IAuthTabCallback.onNavigationEvent.onExtraCallback);
        }
        if (watchlistWidgetState instanceof WatchlistWidgetState.NotLoggedInError) {
            return onExtraCallbackWithResult(context, i, watchlistWidgetState, z, new IAuthTabCallback.onExtraCallbackWithResult(r8lambdabrizzqzhaizmdvstl2yymmz7zsg, r8lambdabrizzqzhaizmdvstl2yymmz7zsg, 3, r8lambdabrizzqzhaizmdvstl2yymmz7zsg));
        }
        if (watchlistWidgetState instanceof WatchlistWidgetState.Maintenance) {
            return onExtraCallbackWithResult(context, i, watchlistWidgetState, z, IAuthTabCallback.C0018IAuthTabCallback.onWarmupCompleted);
        }
        if (!(watchlistWidgetState instanceof WatchlistWidgetState.SettingInProgress)) {
            throw new NoWhenBranchMatchedException();
        }
        Object[] objArr2 = {this, context, Integer.valueOf(i), watchlistWidgetState, Boolean.valueOf(z)};
        int iOnExtraCallback3 = WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback4 = WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback();
        return (RemoteViews) IAuthTabCallback(WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), 1342547571, WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), -1342547570, objArr2, iOnExtraCallback3, iOnExtraCallback4);
    }

    static final class onWarmupCompleted {
        private static int onTransact = 1;
        private static int onWarmupCompleted;
        private final int IAuthTabCallback;
        private final int onExtraCallback;
        private final int onExtraCallbackWithResult;
        private final int onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onTransact + 59;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            if (this == obj) {
                return true;
            }
            if (obj instanceof onWarmupCompleted) {
                onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
                return this.onNavigationEvent == onwarmupcompleted.onNavigationEvent && this.onExtraCallback == onwarmupcompleted.onExtraCallback && this.onExtraCallbackWithResult == onwarmupcompleted.onExtraCallbackWithResult && this.IAuthTabCallback == onwarmupcompleted.IAuthTabCallback;
            }
            int i5 = i3 + 105;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 115;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = Integer.hashCode(this.onNavigationEvent);
            return i3 == 0 ? (((((iHashCode - 45) >>> Integer.hashCode(this.onExtraCallback)) / 119) / Integer.hashCode(this.onExtraCallbackWithResult)) >>> 15) / Integer.hashCode(this.IAuthTabCallback) : (((((iHashCode * 31) + Integer.hashCode(this.onExtraCallback)) * 31) + Integer.hashCode(this.onExtraCallbackWithResult)) * 31) + Integer.hashCode(this.IAuthTabCallback);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "RowIds(container=" + this.onNavigationEvent + ", name=" + this.onExtraCallback + ", price=" + this.onExtraCallbackWithResult + ", ratio=" + this.IAuthTabCallback + ")";
            int i2 = onWarmupCompleted + 41;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onWarmupCompleted(int i, int i2, int i3, int i4) {
            this.onNavigationEvent = i;
            this.onExtraCallback = i2;
            this.onExtraCallbackWithResult = i3;
            this.IAuthTabCallback = i4;
        }

        public final int IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onTransact + 25;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            int i5 = this.onExtraCallbackWithResult;
            int i6 = i3 + 75;
            onTransact = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 9 / 0;
            }
            return i5;
        }

        public final int onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 17;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            int i4 = this.onNavigationEvent;
            int i5 = i2 + 51;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 15 / 0;
            }
            return i4;
        }

        public final int onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 21;
            int i3 = i2 % 128;
            onTransact = i3;
            int i4 = i2 % 2;
            int i5 = this.onExtraCallback;
            int i6 = i3 + 83;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 73 / 0;
            }
            return i5;
        }

        public final int onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 83;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.IAuthTabCallback;
            int i6 = i2 + 101;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                return i5;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = onExtraCallback + 65;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final RemoteViews onExtraCallback(final Context context, final int i, final WatchlistWidgetState.ProductSuccess productSuccess, boolean z) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 91;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback3 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            ((List) WatchlistWidgetState.ProductSuccess.onExtraCallback(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 1766261298, iOnExtraCallback3, new Object[]{productSuccess}, iOnExtraCallback2, iOnExtraCallback, -1766261296)).isEmpty();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnExtraCallback4 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback5 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback6 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        if (((List) WatchlistWidgetState.ProductSuccess.onExtraCallback(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 1766261298, iOnExtraCallback6, new Object[]{productSuccess}, iOnExtraCallback5, iOnExtraCallback4, -1766261296)).isEmpty()) {
            return onExtraCallbackWithResult(context, i, productSuccess, z, new IAuthTabCallback.onExtraCallbackWithResult(productSuccess.access000(), productSuccess.IAuthTabCallbackStubProxy()));
        }
        int iOnExtraCallback7 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback8 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback9 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        RemoteViews remoteViewsOnNavigationEvent = onNavigationEvent(context, i, (List) WatchlistWidgetState.ProductSuccess.onExtraCallback(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 1766261298, iOnExtraCallback9, new Object[]{productSuccess}, iOnExtraCallback8, iOnExtraCallback7, -1766261296), productSuccess.onNavigationEvent(), productSuccess.onExtraCallbackWithResult(), productSuccess.IAuthTabCallbackStub(), z, new Function0() { // from class: im.toss.tosssecurities.widget.watchlist.small.WatchlistSmallRemoteViewsBuilder$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = 2 % 2;
                int i5 = IAuthTabCallback + 83;
                onNavigationEvent = i5 % 128;
                Object obj2 = null;
                if (i5 % 2 == 0) {
                    Context context2 = context;
                    int i6 = i;
                    Object[] objArr = {context2, Integer.valueOf(i6), productSuccess};
                    int iOnExtraCallback10 = WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback();
                    int iOnExtraCallback11 = WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback();
                    obj2.hashCode();
                    throw null;
                }
                Context context3 = context;
                int i7 = i;
                Object[] objArr2 = {context3, Integer.valueOf(i7), productSuccess};
                int iOnExtraCallback12 = WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback();
                int iOnExtraCallback13 = WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback();
                PendingIntent pendingIntent = (PendingIntent) AFj1mSDK.IAuthTabCallback(WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), -1369884117, WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), 1369884117, objArr2, iOnExtraCallback12, iOnExtraCallback13);
                int i8 = IAuthTabCallback + 85;
                onNavigationEvent = i8 % 128;
                if (i8 % 2 != 0) {
                    return pendingIntent;
                }
                obj2.hashCode();
                throw null;
            }
        }, new Function1() { // from class: im.toss.tosssecurities.widget.watchlist.small.WatchlistSmallRemoteViewsBuilder$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i4 = 2 % 2;
                int i5 = IAuthTabCallback + 53;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                String strOnExtraCallback = AFj1mSDK.onExtraCallback(productSuccess, (WatchlistWidgetState.RowItem) obj2);
                int i7 = IAuthTabCallback + 37;
                onExtraCallbackWithResult = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 31 / 0;
                }
                return strOnExtraCallback;
            }
        }, R.string.toss_securities_widget_watchlist_small_add_product_hint);
        int i4 = onExtraCallbackWithResult + 31;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return remoteViewsOnNavigationEvent;
    }

    private static final PendingIntent onNavigationEvent(Context context, int i, WatchlistWidgetState.ProductSuccess productSuccess) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 43;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            r8lambdaoKZRWZmr9aRpjpVbwq8DNTPTms r8lambdaokzrwzmr9arpjpvbwq8dntptms = r8lambdaoKZRWZmr9aRpjpVbwq8DNTPTms.onExtraCallbackWithResult;
            r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg r8lambdabrizzqzhaizmdvstl2yymmz7zsgAccess000 = productSuccess.access000();
            int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback3 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            r8lambdaokzrwzmr9arpjpvbwq8dntptms.IAuthTabCallback(context, i, r8lambdabrizzqzhaizmdvstl2yymmz7zsgAccess000, (Long) WatchlistWidgetState.ProductSuccess.onExtraCallback(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 1744908740, iOnExtraCallback3, new Object[]{productSuccess}, iOnExtraCallback2, iOnExtraCallback, -1744908739));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        r8lambdaoKZRWZmr9aRpjpVbwq8DNTPTms r8lambdaokzrwzmr9arpjpvbwq8dntptms2 = r8lambdaoKZRWZmr9aRpjpVbwq8DNTPTms.onExtraCallbackWithResult;
        r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg r8lambdabrizzqzhaizmdvstl2yymmz7zsgAccess0002 = productSuccess.access000();
        int iOnExtraCallback4 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback5 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback6 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        PendingIntent pendingIntentIAuthTabCallback = r8lambdaokzrwzmr9arpjpvbwq8dntptms2.IAuthTabCallback(context, i, r8lambdabrizzqzhaizmdvstl2yymmz7zsgAccess0002, (Long) WatchlistWidgetState.ProductSuccess.onExtraCallback(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 1744908740, iOnExtraCallback6, new Object[]{productSuccess}, iOnExtraCallback5, iOnExtraCallback4, -1744908739));
        int i4 = onWarmupCompleted + 73;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return pendingIntentIAuthTabCallback;
    }

    private static final String IAuthTabCallback(WatchlistWidgetState.ProductSuccess productSuccess, WatchlistWidgetState.RowItem rowItem) {
        String strName;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(rowItem, "");
        String strIAuthTabCallbackStub = rowItem.IAuthTabCallbackStub();
        r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg r8lambdabrizzqzhaizmdvstl2yymmz7zsgAccess000 = productSuccess.access000();
        ItemType itemTypeAsBinder = rowItem.asBinder();
        if (itemTypeAsBinder != null) {
            int i4 = onWarmupCompleted + 19;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            strName = itemTypeAsBinder.name();
        } else {
            int i6 = onWarmupCompleted + 1;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            strName = null;
        }
        return RoutesKt.onWarmupCompleted(strIAuthTabCallbackStub, r8lambdabrizzqzhaizmdvstl2yymmz7zsgAccess000, strName);
    }

    private final RemoteViews onExtraCallback(final Context context, final int i, WatchlistWidgetState.IndexSuccess indexSuccess, boolean z) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 113;
        onWarmupCompleted = i3 % 128;
        r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg r8lambdabrizzqzhaizmdvstl2yymmz7zsg = null;
        if (i3 % 2 == 0) {
            indexSuccess.asInterface().isEmpty();
            r8lambdabrizzqzhaizmdvstl2yymmz7zsg.hashCode();
            throw null;
        }
        if (indexSuccess.asInterface().isEmpty()) {
            return onExtraCallbackWithResult(context, i, indexSuccess, z, new IAuthTabCallback.onExtraCallbackWithResult(r8lambdabrizzqzhaizmdvstl2yymmz7zsg, r8lambdabrizzqzhaizmdvstl2yymmz7zsg, 3, r8lambdabrizzqzhaizmdvstl2yymmz7zsg));
        }
        List<WatchlistWidgetState.RowItem> listAsInterface = indexSuccess.asInterface();
        DisplaySetting displaySettingOnNavigationEvent = indexSuccess.onNavigationEvent();
        float fOnExtraCallbackWithResult = indexSuccess.onExtraCallbackWithResult();
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        RemoteViews remoteViewsOnNavigationEvent = onNavigationEvent(context, i, listAsInterface, displaySettingOnNavigationEvent, fOnExtraCallbackWithResult, (String) WatchlistWidgetState.IndexSuccess.onWarmupCompleted(new Object[]{indexSuccess}, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted, -802450113, 802450114, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted()), z, new Function0() { // from class: im.toss.tosssecurities.widget.watchlist.small.WatchlistSmallRemoteViewsBuilder$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = 2 % 2;
                int i5 = onExtraCallbackWithResult + 125;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                Context context2 = context;
                if (i6 == 0) {
                    return AFj1mSDK.onWarmupCompleted(context2, i);
                }
                AFj1mSDK.onWarmupCompleted(context2, i);
                throw null;
            }
        }, new Function1() { // from class: im.toss.tosssecurities.widget.watchlist.small.WatchlistSmallRemoteViewsBuilder$$ExternalSyntheticLambda1
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i4 = 2 % 2;
                int i5 = onWarmupCompleted + 57;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                int iOnExtraCallback = WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback();
                int iOnExtraCallback2 = WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback();
                int iOnExtraCallback3 = WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback();
                String str = (String) AFj1mSDK.IAuthTabCallback(WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), 321091358, iOnExtraCallback3, -321091356, new Object[]{(WatchlistWidgetState.RowItem) obj}, iOnExtraCallback, iOnExtraCallback2);
                int i7 = onWarmupCompleted + 13;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                return str;
            }
        }, R.string.toss_securities_widget_watchlist_small_add_index_hint);
        int i4 = onExtraCallbackWithResult + 83;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return remoteViewsOnNavigationEvent;
    }

    private static final PendingIntent onExtraCallback(Context context, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 5;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        PendingIntent pendingIntentOnExtraCallback = r8lambdaoKZRWZmr9aRpjpVbwq8DNTPTms.onExtraCallback(r8lambdaoKZRWZmr9aRpjpVbwq8DNTPTms.onExtraCallbackWithResult, context, i, null, null, 8, null);
        int i5 = onWarmupCompleted + 99;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return pendingIntentOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final String onNavigationEvent(WatchlistWidgetState.RowItem rowItem) {
        String strIAuthTabCallbackStub;
        r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg r8lambdabrizzqzhaizmdvstl2yymmz7zsg;
        int i;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 125;
        onExtraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(rowItem, "");
            strIAuthTabCallbackStub = rowItem.IAuthTabCallbackStub();
            r8lambdabrizzqzhaizmdvstl2yymmz7zsg = r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg.INDEX;
            i = 3;
        } else {
            Intrinsics.checkNotNullParameter(rowItem, "");
            strIAuthTabCallbackStub = rowItem.IAuthTabCallbackStub();
            r8lambdabrizzqzhaizmdvstl2yymmz7zsg = r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg.INDEX;
            i = 4;
        }
        String strOnExtraCallback = RoutesKt.onExtraCallback(strIAuthTabCallbackStub, r8lambdabrizzqzhaizmdvstl2yymmz7zsg, (String) null, i, (Object) null);
        int i4 = onExtraCallbackWithResult + 51;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return strOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    private final void IAuthTabCallback(RemoteViews remoteViews, Context context, int i, boolean z, int i2, DisplaySetting displaySetting, boolean z2) {
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = onExtraCallbackWithResult;
        int i7 = i6 + 31;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        if (z) {
            int i9 = R.id.add_hint_row;
            remoteViews.setViewVisibility(i9, 0);
            int i10 = R.id.add_hint_text;
            remoteViews.setTextViewText(i10, context.getString(i2));
            r8lambdaMKedLQ34eSPA96F3cZORktsT52c r8lambdamkedlq34espa96f3czorktst52c = r8lambdaMKedLQ34eSPA96F3cZORktsT52c.IAuthTabCallback;
            remoteViews.setTextColor(i10, ByteOrderedDataOutputStream.onNavigationEvent(RemoteViewsThemeUtilKt.IAuthTabCallback(r8lambdamkedlq34espa96f3czorktst52c.asBinder(), context, displaySetting, (Float) null, 4, (Object) null)));
            RemoteViewsThemeUtil.onNavigationEvent.onNavigationEvent(remoteViews, context, displaySetting, r8lambdamkedlq34espa96f3czorktst52c.IAuthTabCallbackStub(), new int[]{R.id.add_hint_icon});
            if (z2) {
                return;
            }
            remoteViews.setOnClickPendingIntent(i9, r8lambdaoKZRWZmr9aRpjpVbwq8DNTPTms.onExtraCallbackWithResult.onExtraCallback(context, i));
            return;
        }
        int i11 = i6 + 91;
        onWarmupCompleted = i11 % 128;
        if (i11 % 2 == 0) {
            i3 = R.id.add_hint_row;
            i4 = 55;
        } else {
            i3 = R.id.add_hint_row;
            i4 = 8;
        }
        remoteViews.setViewVisibility(i3, i4);
    }

    private final RemoteViews onNavigationEvent(Context context, int i, List<WatchlistWidgetState.RowItem> list, DisplaySetting displaySetting, float f, String str, boolean z, Function0<PendingIntent> function0, Function1<? super WatchlistWidgetState.RowItem, String> function1, int i2) {
        boolean z2;
        int i3;
        AFj1mSDK aFj1mSDK;
        RemoteViews remoteViews;
        Context context2;
        int i4;
        int i5;
        DisplaySetting displaySetting2;
        Iterator it;
        int iOnExtraCallbackWithResult;
        int i6;
        int i7 = 2 % 2;
        RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), R.layout.widget_watchlist_small_main);
        RemoteViewsThemeUtil remoteViewsThemeUtil = RemoteViewsThemeUtil.onNavigationEvent;
        int i8 = R.id.widget_root;
        RemoteViewsThemeUtil.onExtraCallbackWithResult(remoteViewsThemeUtil, remoteViews2, context, i8, displaySetting, f, 0, 0, 0, BERTags.FLAGS, (Object) null);
        if (!z) {
            remoteViews2.setOnClickPendingIntent(i8, function0.invoke());
            int i9 = R.id.refresh_button;
            r8lambdaoKZRWZmr9aRpjpVbwq8DNTPTms r8lambdaokzrwzmr9arpjpvbwq8dntptms = r8lambdaoKZRWZmr9aRpjpVbwq8DNTPTms.onExtraCallbackWithResult;
            remoteViews2.setOnClickPendingIntent(i9, r8lambdaokzrwzmr9arpjpvbwq8dntptms.onExtraCallbackWithResult(context, i));
            remoteViews2.setOnClickPendingIntent(R.id.setting_button, r8lambdaokzrwzmr9arpjpvbwq8dntptms.onExtraCallback(context, i));
        }
        remoteViewsThemeUtil.onNavigationEvent(remoteViews2, context, displaySetting, r8lambdaMKedLQ34eSPA96F3cZORktsT52c.IAuthTabCallback.IAuthTabCallback(), new int[]{R.id.refresh_button, R.id.setting_button});
        charset charsetVar = charset.onExtraCallbackWithResult;
        int iOnNavigationEvent = ByteOrderedDataOutputStream.onNavigationEvent(RemoteViewsThemeUtilKt.IAuthTabCallback(new scheme(charsetVar.postMessage().IAuthTabCallback(), charsetVar.newSession().onExtraCallbackWithResult()), context, displaySetting, (Float) null, 4, (Object) null));
        int iOnNavigationEvent2 = ByteOrderedDataOutputStream.onNavigationEvent(RemoteViewsThemeUtilKt.IAuthTabCallback(charsetVar.receiveFile(), context, displaySetting, (Float) null, 4, (Object) null));
        if (list.size() >= 3 || i2 == 0) {
            int i10 = onExtraCallbackWithResult + 3;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            z2 = false;
        } else {
            int i12 = onWarmupCompleted + 37;
            onExtraCallbackWithResult = i12 % 128;
            int i13 = i12 % 2;
            z2 = true;
        }
        int i14 = onExtraCallbackWithResult + 95;
        onWarmupCompleted = i14 % 128;
        if (i14 % 2 == 0) {
            aFj1mSDK = this;
            remoteViews = remoteViews2;
            context2 = context;
            i4 = i;
            i5 = i2;
            displaySetting2 = displaySetting;
            i3 = 0;
        } else {
            i3 = 0;
            aFj1mSDK = this;
            remoteViews = remoteViews2;
            context2 = context;
            i4 = i;
            i5 = i2;
            displaySetting2 = displaySetting;
        }
        aFj1mSDK.IAuthTabCallback(remoteViews, context2, i4, z2, i5, displaySetting2, z);
        Iterator it2 = onNavigationEvent.iterator();
        int i15 = i3;
        while (it2.hasNext()) {
            Object next = it2.next();
            if (i15 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) next;
            WatchlistWidgetState.RowItem rowItem = (WatchlistWidgetState.RowItem) CollectionsKt___CollectionsKt.getOrNull(list, i15);
            if (rowItem == null) {
                int i16 = onWarmupCompleted + 51;
                onExtraCallbackWithResult = i16 % 128;
                if (i16 % 2 != 0) {
                    iOnExtraCallbackWithResult = onwarmupcompleted.onExtraCallbackWithResult();
                    i6 = 41;
                } else {
                    iOnExtraCallbackWithResult = onwarmupcompleted.onExtraCallbackWithResult();
                    i6 = 8;
                }
                remoteViews2.setViewVisibility(iOnExtraCallbackWithResult, i6);
                it = it2;
            } else {
                remoteViews2.setViewVisibility(onwarmupcompleted.onExtraCallbackWithResult(), i3);
                remoteViews2.setTextViewText(onwarmupcompleted.onNavigationEvent(), rowItem.onTransact());
                remoteViews2.setTextColor(onwarmupcompleted.onNavigationEvent(), iOnNavigationEvent);
                int iIAuthTabCallback = onwarmupcompleted.IAuthTabCallback();
                int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
                remoteViews2.setTextViewText(iIAuthTabCallback, (String) WatchlistWidgetState.RowItem.onNavigationEvent(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 1235089590, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), new Object[]{rowItem}, iOnExtraCallback, -1235089589));
                remoteViews2.setTextColor(onwarmupcompleted.IAuthTabCallback(), iOnNavigationEvent2);
                remoteViews2.setTextViewText(onwarmupcompleted.onWarmupCompleted(), rowItem.access100());
                it = it2;
                remoteViews2.setTextColor(onwarmupcompleted.onWarmupCompleted(), ByteOrderedDataOutputStream.onNavigationEvent(RemoteViewsThemeUtilKt.IAuthTabCallback(r8lambdaMKedLQ34eSPA96F3cZORktsT52c.IAuthTabCallback.onExtraCallback(rowItem.getInterfaceDescriptor()), context, displaySetting, (Float) null, 4, (Object) null)));
                if (!z) {
                    remoteViews2.setOnClickPendingIntent(onwarmupcompleted.onExtraCallbackWithResult(), r8lambdaoKZRWZmr9aRpjpVbwq8DNTPTms.onExtraCallbackWithResult.onExtraCallbackWithResult(context, i, function1.invoke(rowItem)));
                }
            }
            i15++;
            it2 = it;
            i3 = 0;
        }
        int i17 = im.toss.securities.widget.common.R.id.timestamp;
        remoteViews2.setTextViewText(i17, str);
        charset charsetVar2 = charset.onExtraCallbackWithResult;
        remoteViews2.setTextColor(i17, ByteOrderedDataOutputStream.onNavigationEvent(RemoteViewsThemeUtilKt.IAuthTabCallback(new scheme(charsetVar2.prefetch().IAuthTabCallback(), charsetVar2.postMessage().onExtraCallbackWithResult()), context, displaySetting, (Float) null, 4, (Object) null)));
        StringBuilder sb = new StringBuilder();
        for (WatchlistWidgetState.RowItem rowItem2 : CollectionsKt___CollectionsKt.take(list, onNavigationEvent.size())) {
            sb.append(rowItem2.onTransact());
            sb.append(" ");
            int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
            sb.append((String) WatchlistWidgetState.RowItem.onNavigationEvent(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 1235089590, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), new Object[]{rowItem2}, iOnExtraCallback2, -1235089589));
            sb.append(" ");
            sb.append(rowItem2.access100());
            sb.append(" ");
        }
        sb.append(str);
        Object[] objArr = {q8a.onNavigationEvent, Integer.valueOf(i), sb.toString()};
        q8a.onWarmupCompleted(getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), objArr, -1919848074, getKekid.onExtraCallback(), 1919848088);
        return remoteViews2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        AFj1mSDK aFj1mSDK = (AFj1mSDK) objArr[0];
        Context context = (Context) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        WatchlistWidgetState watchlistWidgetState = (WatchlistWidgetState) objArr[3];
        boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
        int i = 2 % 2;
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_watchlist_small_loading);
        RemoteViewsThemeUtil remoteViewsThemeUtil = RemoteViewsThemeUtil.onNavigationEvent;
        int i2 = R.id.widget_root;
        RemoteViewsThemeUtil.onExtraCallbackWithResult(remoteViewsThemeUtil, remoteViews, context, i2, watchlistWidgetState.onNavigationEvent(), watchlistWidgetState.onExtraCallbackWithResult(), 0, 0, 0, BERTags.FLAGS, (Object) null);
        aFj1mSDK.onNavigationEvent(remoteViews, watchlistWidgetState.onNavigationEvent(), watchlistWidgetState.onExtraCallbackWithResult());
        if (!zBooleanValue) {
            int i3 = onWarmupCompleted + 107;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                remoteViews.setOnClickPendingIntent(i2, r8lambdaoKZRWZmr9aRpjpVbwq8DNTPTms.onExtraCallbackWithResult.onNavigationEvent(context, iIntValue));
                int i4 = 60 / 0;
            } else {
                remoteViews.setOnClickPendingIntent(i2, r8lambdaoKZRWZmr9aRpjpVbwq8DNTPTms.onExtraCallbackWithResult.onNavigationEvent(context, iIntValue));
            }
        }
        int i5 = onWarmupCompleted + 87;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 14 / 0;
        }
        return remoteViews;
    }

    private final RemoteViews onExtraCallbackWithResult(Context context, int i, WatchlistWidgetState watchlistWidgetState, boolean z, IAuthTabCallback iAuthTabCallback) {
        PendingIntent pendingIntentIAuthTabCallback;
        int i2 = 2 % 2;
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_watchlist_small_error);
        RemoteViewsThemeUtil remoteViewsThemeUtil = RemoteViewsThemeUtil.onNavigationEvent;
        int i3 = R.id.widget_root;
        RemoteViewsThemeUtil.onExtraCallbackWithResult(remoteViewsThemeUtil, remoteViews, context, i3, watchlistWidgetState.onNavigationEvent(), watchlistWidgetState.onExtraCallbackWithResult(), 0, 0, 0, BERTags.FLAGS, (Object) null);
        String strOnWarmupCompleted = onWarmupCompleted(context, iAuthTabCallback);
        int i4 = R.id.error_content_1;
        remoteViews.setTextViewText(i4, strOnWarmupCompleted);
        remoteViews.setTextColor(i4, ByteOrderedDataOutputStream.onNavigationEvent(onExtraCallback(context, watchlistWidgetState.onNavigationEvent())));
        if (iAuthTabCallback instanceof IAuthTabCallback.onExtraCallback) {
            int i5 = onWarmupCompleted + Imgproc.COLOR_YUV2RGB_YVYU;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            int i7 = R.id.error_content_2;
            remoteViews.setViewVisibility(i7, 0);
            String string = context.getString(im.toss.securities.widget.common.R.string.toss_securities_widget_error_content_small_2);
            Intrinsics.checkNotNullExpressionValue(string, "");
            remoteViews.setTextViewText(i7, string);
            remoteViews.setTextColor(i7, ByteOrderedDataOutputStream.onNavigationEvent(RemoteViewsThemeUtilKt.IAuthTabCallback(r8lambdaMKedLQ34eSPA96F3cZORktsT52c.IAuthTabCallback.asBinder(), context, watchlistWidgetState.onNavigationEvent(), (Float) null, 4, (Object) null)));
        } else {
            remoteViews.setViewVisibility(R.id.error_content_2, 8);
        }
        if (iAuthTabCallback.onWarmupCompleted()) {
            int i8 = R.id.refresh_button;
            remoteViews.setViewVisibility(i8, 0);
            remoteViews.setImageViewResource(i8, im.toss.securities.widget.common.R.drawable.icon_system_refresh_outlined);
            remoteViewsThemeUtil.onNavigationEvent(remoteViews, context, watchlistWidgetState.onNavigationEvent(), r8lambdaMKedLQ34eSPA96F3cZORktsT52c.IAuthTabCallback.IAuthTabCallback(), new int[]{i8});
        } else {
            remoteViews.setViewVisibility(R.id.refresh_button, 8);
        }
        Object[] objArr = {q8a.onNavigationEvent, Integer.valueOf(i), strOnWarmupCompleted};
        q8a.onWarmupCompleted(getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), objArr, -1919848074, getKekid.onExtraCallback(), 1919848088);
        if (!z) {
            if (!(iAuthTabCallback instanceof IAuthTabCallback.onExtraCallbackWithResult)) {
                pendingIntentIAuthTabCallback = r8lambdaoKZRWZmr9aRpjpVbwq8DNTPTms.onExtraCallbackWithResult.onNavigationEvent(context, i);
            } else {
                int i9 = onWarmupCompleted + 83;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
                IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult = (IAuthTabCallback.onExtraCallbackWithResult) iAuthTabCallback;
                pendingIntentIAuthTabCallback = r8lambdaoKZRWZmr9aRpjpVbwq8DNTPTms.onExtraCallbackWithResult.IAuthTabCallback(context, i, onextracallbackwithresult.onExtraCallbackWithResult(), onextracallbackwithresult.onExtraCallback());
            }
            remoteViews.setOnClickPendingIntent(i3, pendingIntentIAuthTabCallback);
            if (iAuthTabCallback.onWarmupCompleted()) {
                int i11 = onWarmupCompleted + 71;
                onExtraCallbackWithResult = i11 % 128;
                if (i11 % 2 != 0) {
                    remoteViews.setOnClickPendingIntent(R.id.refresh_button, r8lambdaoKZRWZmr9aRpjpVbwq8DNTPTms.onExtraCallbackWithResult.onExtraCallbackWithResult(context, i));
                    throw null;
                }
                remoteViews.setOnClickPendingIntent(R.id.refresh_button, r8lambdaoKZRWZmr9aRpjpVbwq8DNTPTms.onExtraCallbackWithResult.onExtraCallbackWithResult(context, i));
            }
        }
        int i12 = onExtraCallbackWithResult + 3;
        onWarmupCompleted = i12 % 128;
        if (i12 % 2 != 0) {
            return remoteViews;
        }
        throw null;
    }

    private final String onWarmupCompleted(Context context, IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 5;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if (iAuthTabCallback instanceof IAuthTabCallback.onExtraCallback) {
            String string = context.getString(im.toss.securities.widget.common.R.string.toss_securities_widget_error_content_small_1);
            Intrinsics.checkNotNullExpressionValue(string, "");
            int i5 = onWarmupCompleted + 39;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 35 / 0;
            }
            return string;
        }
        if (iAuthTabCallback instanceof IAuthTabCallback.onNavigationEvent) {
            int i7 = i2 + 73;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            String string2 = context.getString(im.toss.securities.widget.common.R.string.toss_securities_widget_network_error_content_small_title);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            return string2;
        }
        if (iAuthTabCallback instanceof IAuthTabCallback.C0018IAuthTabCallback) {
            String string3 = context.getString(im.toss.securities.widget.common.R.string.toss_securities_widget_maintenance_small);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            return string3;
        }
        if (!(iAuthTabCallback instanceof IAuthTabCallback.onExtraCallbackWithResult)) {
            throw new NoWhenBranchMatchedException();
        }
        String string4 = ((IAuthTabCallback.onExtraCallbackWithResult) iAuthTabCallback).onExtraCallbackWithResult() == r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg.RECENT_WATCH ? context.getString(R.string.toss_securities_widget_watchlist_small_empty_recent) : context.getString(R.string.toss_securities_widget_watchlist_small_empty);
        Intrinsics.checkNotNull(string4);
        return string4;
    }

    private final long onExtraCallback(Context context, DisplaySetting displaySetting) {
        CipherSuiteCompanion cipherSuiteCompanionAsBinder;
        Float f;
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 49;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        r8lambdaMKedLQ34eSPA96F3cZORktsT52c r8lambdamkedlq34espa96f3czorktst52c = r8lambdaMKedLQ34eSPA96F3cZORktsT52c.IAuthTabCallback;
        if (i4 == 0) {
            cipherSuiteCompanionAsBinder = r8lambdamkedlq34espa96f3czorktst52c.asBinder();
            f = null;
            i = 2;
        } else {
            cipherSuiteCompanionAsBinder = r8lambdamkedlq34espa96f3czorktst52c.asBinder();
            f = null;
            i = 4;
        }
        return RemoteViewsThemeUtilKt.IAuthTabCallback(cipherSuiteCompanionAsBinder, context, displaySetting, f, i, (Object) null);
    }

    private final void onNavigationEvent(RemoteViews remoteViews, DisplaySetting displaySetting, float f) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        RemoteViewsThemeUtil remoteViewsThemeUtil = RemoteViewsThemeUtil.onNavigationEvent;
        int iIAuthTabCallback = remoteViewsThemeUtil.IAuthTabCallback(RemoteViewsThemeUtil.SkeletonShape.BAR_8, displaySetting);
        r0c r0cVar = r0c.onWarmupCompleted;
        remoteViewsThemeUtil.IAuthTabCallback(remoteViews, f, iIAuthTabCallback, CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{getWrite.IAuthTabCallback(Float.valueOf(r0cVar.onWarmupCompleted(0)), CollectionsKt__CollectionsJVMKt.listOf(Integer.valueOf(R.id.skeleton_row1))), getWrite.IAuthTabCallback(Float.valueOf(r0cVar.onWarmupCompleted(1)), CollectionsKt__CollectionsJVMKt.listOf(Integer.valueOf(R.id.skeleton_row2))), getWrite.IAuthTabCallback(Float.valueOf(r0cVar.onWarmupCompleted(2)), CollectionsKt__CollectionsJVMKt.listOf(Integer.valueOf(R.id.skeleton_row3)))}));
        int i4 = onExtraCallbackWithResult + 115;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ PendingIntent onExtraCallbackWithResult(Context context, int i, WatchlistWidgetState.ProductSuccess productSuccess) {
        Object[] objArr = {context, Integer.valueOf(i), productSuccess};
        int iOnExtraCallback = WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback();
        return (PendingIntent) IAuthTabCallback(WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), -1369884117, WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), 1369884117, objArr, iOnExtraCallback, iOnExtraCallback2);
    }

    public static /* synthetic */ String onExtraCallbackWithResult(WatchlistWidgetState.RowItem rowItem) {
        int iOnExtraCallback = WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback3 = WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback();
        return (String) IAuthTabCallback(WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), 321091358, iOnExtraCallback3, -321091356, new Object[]{rowItem}, iOnExtraCallback, iOnExtraCallback2);
    }

    private final RemoteViews onExtraCallback(Context context, int i, WatchlistWidgetState watchlistWidgetState, boolean z) {
        Object[] objArr = {this, context, Integer.valueOf(i), watchlistWidgetState, Boolean.valueOf(z)};
        int iOnExtraCallback = WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback();
        return (RemoteViews) IAuthTabCallback(WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), 1342547571, WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), -1342547570, objArr, iOnExtraCallback, iOnExtraCallback2);
    }
}
