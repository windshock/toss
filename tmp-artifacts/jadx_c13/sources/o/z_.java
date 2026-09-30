package o;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.RemoteViews;
import com.google.firebase.messaging.FcmBroadcastProcessor$;
import im.toss.securities.widget.common.utils.RemoteViewsThemeUtilKt;
import im.toss.securities.widget.common.utils.RoutesKt;
import im.toss.securities.widget.data.model.watchlists.ItemType;
import im.toss.securities.widget.watchlist.R;
import im.toss.tosssecurities.host.contracts.DisplaySetting;
import im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class z_ {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    public static final z_ onExtraCallback;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    private static char[] onWarmupCompleted;

    static {
        IAuthTabCallback();
        onExtraCallback = new z_();
        int i = onExtraCallbackWithResult + 25;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private z_() {
    }

    public static /* synthetic */ RemoteViews onExtraCallback(z_ z_Var, Context context, int i, WatchlistWidgetState.RowItem rowItem, r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg r8lambdabrizzqzhaizmdvstl2yymmz7zsg, DisplaySetting displaySetting, Bitmap bitmap, boolean z, int i2, Object obj) throws Throwable {
        Bitmap bitmap2;
        int i3 = 2 % 2;
        Object obj2 = null;
        if ((i2 & 32) != 0) {
            int i4 = onTransact + 85;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            bitmap2 = null;
        } else {
            bitmap2 = bitmap;
        }
        RemoteViews remoteViewsIAuthTabCallback = z_Var.IAuthTabCallback(context, i, rowItem, r8lambdabrizzqzhaizmdvstl2yymmz7zsg, displaySetting, bitmap2, (i2 & 64) != 0 ? false : z);
        int i6 = onNavigationEvent + 125;
        onTransact = i6 % 128;
        if (i6 % 2 != 0) {
            return remoteViewsIAuthTabCallback;
        }
        obj2.hashCode();
        throw null;
    }

    public final RemoteViews IAuthTabCallback(@NotNull Context context, int i, @NotNull WatchlistWidgetState.RowItem rowItem, @NotNull r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg r8lambdabrizzqzhaizmdvstl2yymmz7zsg, @NotNull DisplaySetting displaySetting, @Nullable Bitmap bitmap, boolean z) throws Throwable {
        String strName;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(rowItem, "");
        Intrinsics.checkNotNullParameter(r8lambdabrizzqzhaizmdvstl2yymmz7zsg, "");
        Intrinsics.checkNotNullParameter(displaySetting, "");
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_watchlist_medium_item);
        int i3 = R.id.name;
        remoteViews.setTextViewText(i3, rowItem.onTransact());
        remoteViews.setTextViewTextSize(i3, 1, r1.onExtraCallback(context, R.dimen.watchlist_medium_item_name_text_size));
        r8lambdaMKedLQ34eSPA96F3cZORktsT52c r8lambdamkedlq34espa96f3czorktst52c = r8lambdaMKedLQ34eSPA96F3cZORktsT52c.IAuthTabCallback;
        remoteViews.setTextColor(i3, ByteOrderedDataOutputStream.onNavigationEvent(RemoteViewsThemeUtilKt.IAuthTabCallback(r8lambdamkedlq34espa96f3czorktst52c.onNavigationEvent(), context, displaySetting, (Float) null, 4, (Object) null)));
        int i4 = R.id.price;
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        remoteViews.setTextViewText(i4, (String) WatchlistWidgetState.RowItem.onNavigationEvent(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 1235089590, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), new Object[]{rowItem}, iOnExtraCallback, -1235089589));
        remoteViews.setTextViewTextSize(i4, 1, r1.onExtraCallback(context, R.dimen.watchlist_medium_item_price_text_size));
        remoteViews.setTextColor(i4, ByteOrderedDataOutputStream.onNavigationEvent(RemoteViewsThemeUtilKt.IAuthTabCallback(charset.onExtraCallbackWithResult.receiveFile(), context, displaySetting, (Float) null, 4, (Object) null)));
        int i5 = R.id.profit_ratio;
        remoteViews.setTextViewText(i5, rowItem.access100());
        remoteViews.setTextViewTextSize(i5, 1, r1.onExtraCallback(context, R.dimen.watchlist_medium_item_profit_text_size));
        remoteViews.setTextColor(i5, ByteOrderedDataOutputStream.onNavigationEvent(RemoteViewsThemeUtilKt.IAuthTabCallback(r8lambdamkedlq34espa96f3czorktst52c.onExtraCallback(rowItem.getInterfaceDescriptor()), context, displaySetting, (Float) null, 4, (Object) null)));
        if (bitmap != null) {
            remoteViews.setImageViewBitmap(R.id.graph, bitmap);
        } else if (!z) {
            remoteViews.setImageViewBitmap(R.id.graph, AFj1aSDK.onNavigationEvent(context, rowItem, displaySetting));
        }
        Intent intent = new Intent();
        String strIAuthTabCallbackStub = rowItem.IAuthTabCallbackStub();
        ItemType itemTypeAsBinder = rowItem.asBinder();
        if (itemTypeAsBinder != null) {
            int i6 = onNavigationEvent + 67;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            strName = itemTypeAsBinder.name();
            int i8 = onNavigationEvent + 69;
            onTransact = i8 % 128;
            int i9 = i8 % 2;
        } else {
            strName = null;
        }
        String strOnWarmupCompleted = RoutesKt.onWarmupCompleted(strIAuthTabCallbackStub, r8lambdabrizzqzhaizmdvstl2yymmz7zsg, strName);
        Object[] objArr = new Object[1];
        a(new int[]{0, 3, 58, 1}, false, new byte[]{0, 1, 1}, objArr);
        intent.putExtra(((String) objArr[0]).intern(), strOnWarmupCompleted);
        remoteViews.setOnClickFillInIntent(R.id.item_root, intent);
        q8a q8aVar = q8a.onNavigationEvent;
        String strOnTransact = rowItem.onTransact();
        int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        q8aVar.onExtraCallback(i, strOnTransact + ((String) WatchlistWidgetState.RowItem.onNavigationEvent(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 1235089590, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), new Object[]{rowItem}, iOnExtraCallback2, -1235089589)) + rowItem.access100());
        return remoteViews;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = onWarmupCompleted;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.blue(0) + 35283), 34 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0), 14238 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0'), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            int i7 = $10 + 75;
            $11 = i7 % 128;
            int i8 = 2;
            int i9 = i7 % 2;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i10 = $11 + 69;
                $10 = i10 % 128;
                if (i10 % i8 == 0 ? bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1 : bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET)), ExpandableListView.getPackedPositionChild(0L) + 66, (ViewConfiguration.getFadingEdgeLength() >> 16) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 28 - ExpandableListView.getPackedPositionChild(0L), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 17656, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - (ViewConfiguration.getJumpTapTimeout() >> 16)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 69, (ViewConfiguration.getScrollBarSize() >> 8) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                i8 = 2;
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i13 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i13, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i13);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            int i14 = $11 + 95;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i16 = $11 + Imgproc.COLOR_YUV2RGB_YVYU;
                $10 = i16 % 128;
                int i17 = i16 % 2;
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void IAuthTabCallback() {
        onWarmupCompleted = new char[]{27165, 27364, 27363};
    }
}
