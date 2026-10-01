package com.tnkfactory.ad.basic;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.tnkfactory.ad.R;
import com.tnkfactory.ad.TnkAdConfig;
import com.tnkfactory.ad.TnkContext;
import com.tnkfactory.ad.b.s;
import com.tnkfactory.ad.b.t;
import com.tnkfactory.ad.basic.TnkAdMultiJoinListItem2;
import com.tnkfactory.ad.off.TnkDirection;
import com.tnkfactory.ad.off.TnkOffNavi;
import com.tnkfactory.ad.off.data.AdListVo;
import com.tnkfactory.ad.rwd.Settings;
import com.tnkfactory.ad.rwd.TnkCore;
import com.tnkfactory.ad.rwd.Utils;
import com.tnkfactory.ad.rwd.data.MultiCampaignJoinListItemKt;
import com.tnkfactory.ad.rwd.data.layout.TnkLayoutType;
import com.tnkfactory.ad.style.ITnkOffAdItem;
import com.tnkfactory.ad.tnkassert.OfferwallTabClick;
import com.tnkfactory.ad.tnkassert.TnkAssert;
import com.xwray.groupie.GroupieAdapter;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.IEngagementSignalsCallback_Parcel;
import o.IPostMessageServiceDefault;
import o.IPostMessageService_Parcel;
import o.ITrustedWebActivityCallback;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TrackGroupExternalSyntheticLambda0;
import o.maybeUpdateAnimatable;
import o.onSessionEnded;
import o.putChannelInfo;
import o.setRandomHost;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkAdMyMenu extends DialogFragment {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Companion Companion;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static char[] onExtraCallbackWithResult = null;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public TnkOffNavi a;
    public FragmentActivity b;
    public View c;
    public final GroupieAdapter d;
    public final ArrayList e;
    public TnkAdMultiJoinListItem2.OnMultiJoinItemClickListener f;
    public ValueCallback g;
    public WebChromeClient.FileChooserParams h;

    /* renamed from: i, reason: collision with root package name */
    public final IEngagementSignalsCallback_Parcel f32i;

    public final class AdChromeClient extends WebChromeClient {
        public AdChromeClient() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(@Nullable WebView webView, boolean z, boolean z2, @Nullable Message message) {
            Intrinsics.checkNotNull(webView);
            WebView.HitTestResult hitTestResult = webView.getHitTestResult();
            Intrinsics.checkNotNullExpressionValue(hitTestResult, "");
            webView.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(hitTestResult.getExtra())));
            return false;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(@Nullable WebView webView, @NotNull ValueCallback<Uri[]> valueCallback, @NotNull WebChromeClient.FileChooserParams fileChooserParams) {
            Intrinsics.checkNotNullParameter(valueCallback, "");
            Intrinsics.checkNotNullParameter(fileChooserParams, "");
            TnkAdMyMenu.this.photoPicker(valueCallback, fileChooserParams);
            return true;
        }
    }

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final TnkAdMyMenu newInstance(int i2) {
            TnkAdMyMenu tnkAdMyMenu = new TnkAdMyMenu();
            Bundle bundle = new Bundle();
            bundle.putInt("selectTab", i2);
            tnkAdMyMenu.setArguments(bundle);
            return tnkAdMyMenu;
        }
    }

    static {
        onNavigationEvent();
        Companion = new Companion(null);
        int i2 = onExtraCallback + 29;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public TnkAdMyMenu() {
        super(R.layout.com_tnk_offerwall_my_menu);
        this.d = new GroupieAdapter();
        this.e = new ArrayList();
        this.f = new TnkAdMultiJoinListItem2.OnMultiJoinItemClickListener() { // from class: com.tnkfactory.ad.basic.TnkAdMyMenu$onEventItemClick$1
            @Override // com.tnkfactory.ad.basic.TnkAdMultiJoinListItem2.OnMultiJoinItemClickListener
            public boolean onEvent(int i2, long j) {
                if (i2 != 1) {
                    return false;
                }
                this.a.updateMultiJoinItems();
                TnkCore.INSTANCE.getOffRepository().getDataChanged().postValue(Boolean.TRUE);
                return false;
            }
        };
        IEngagementSignalsCallback_Parcel iEngagementSignalsCallback_ParcelRegisterForActivityResult = registerForActivityResult(new IPostMessageService_Parcel.onTransact(), new onSessionEnded() { // from class: com.tnkfactory.ad.basic.TnkAdMyMenu$$ExternalSyntheticLambda6
            public final void onActivityResult(Object obj) {
                TnkAdMyMenu.a(this.f$0, (Uri) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(iEngagementSignalsCallback_ParcelRegisterForActivityResult, "");
        this.f32i = iEngagementSignalsCallback_ParcelRegisterForActivityResult;
    }

    public static final void a(TnkAdMyMenu tnkAdMyMenu, View view) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 125;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        tnkAdMyMenu.dismiss();
        int i5 = IAuthTabCallback + 3;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 96 / 0;
        }
    }

    public final FragmentActivity getAppCompatActivity() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 119;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        FragmentActivity fragmentActivity = this.b;
        int i6 = i4 + 79;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return fragmentActivity;
        }
        throw null;
    }

    public final View getComTnkOffMyClose() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 103;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        View view = this.c;
        if (view != null) {
            return view.findViewById(R.id.com_tnk_off_my_close);
        }
        int i5 = i3 + 43;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 72 / 0;
        }
        return null;
    }

    public final View getComTnkOffMyMenuFaq() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 29;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        View view = this.c;
        if (view == null) {
            return null;
        }
        View viewFindViewById = view.findViewById(R.id.com_tnk_off_my_menu_faq);
        int i4 = onNavigationEvent + 79;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return viewFindViewById;
    }

    public final View getComTnkOffMyMenuFaqUnderline() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 91;
        onNavigationEvent = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        View view = this.c;
        if (view == null) {
            return null;
        }
        View viewFindViewById = view.findViewById(R.id.com_tnk_off_my_menu_faq_underline);
        int i4 = onNavigationEvent + 59;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return viewFindViewById;
    }

    public final View getComTnkOffMyMenuHelpMain() {
        int i2 = 2 % 2;
        View view = this.c;
        if (view != null) {
            int i3 = IAuthTabCallback + 5;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            View viewFindViewById = view.findViewById(R.id.com_tnk_off_my_menu_help_main);
            if (i4 != 0) {
                int i5 = 25 / 0;
            }
            return viewFindViewById;
        }
        int i6 = IAuthTabCallback + 65;
        onNavigationEvent = i6 % 128;
        Object obj = null;
        if (i6 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final View getComTnkOffMyMenuHelpMainUnderline() {
        int i2 = 2 % 2;
        View view = this.c;
        if (view == null) {
            return null;
        }
        int i3 = IAuthTabCallback + 103;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        View viewFindViewById = view.findViewById(R.id.com_tnk_off_my_menu_help_main_underline);
        int i5 = IAuthTabCallback + 73;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 37 / 0;
        }
        return viewFindViewById;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        return r2.findViewById(com.tnkfactory.ad.R.id.com_tnk_off_my_menu_multi);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        r1 = r1 + 61;
        com.tnkfactory.ad.basic.TnkAdMyMenu.onNavigationEvent = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if ((r1 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        r1 = 85 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r2 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View getComTnkOffMyMenuMulti() {
        View view;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 117;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            view = this.c;
            int i5 = 17 / 0;
        } else {
            view = this.c;
        }
    }

    public final View getComTnkOffMyMenuMultiUnderLine() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 35;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        View view = this.c;
        if (view == null) {
            return null;
        }
        int i6 = i3 + 43;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        int i8 = R.id.com_tnk_off_my_menu_multi_under_line;
        if (i7 != 0) {
            return view.findViewById(i8);
        }
        view.findViewById(i8);
        throw null;
    }

    public final View getComTnkOffMyMenuReward() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 65;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        View view = this.c;
        if (view == null) {
            return null;
        }
        int i6 = i3 + 99;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        int i8 = R.id.com_tnk_off_my_menu_reward;
        if (i7 != 0) {
            return view.findViewById(i8);
        }
        view.findViewById(i8);
        throw null;
    }

    public final View getComTnkOffMyMenuRewardUnderline() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 97;
        IAuthTabCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        View view = this.c;
        if (view == null) {
            return null;
        }
        View viewFindViewById = view.findViewById(R.id.com_tnk_off_my_menu_reward_underline);
        int i4 = onNavigationEvent + 53;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return viewFindViewById;
        }
        throw null;
    }

    public final RecyclerView getComTnkOffMyMultiList() {
        int i2 = 2 % 2;
        View view = this.c;
        Object obj = null;
        if (view == null) {
            return null;
        }
        int i3 = IAuthTabCallback + 115;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            view.findViewById(R.id.com_tnk_off_my_multi_list);
            obj.hashCode();
            throw null;
        }
        RecyclerView recyclerViewFindViewById = view.findViewById(R.id.com_tnk_off_my_multi_list);
        int i4 = onNavigationEvent + 117;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return recyclerViewFindViewById;
    }

    public final WebView getComTnkOffMyWebview() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 105;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        View view = this.c;
        if (view != null) {
            int i6 = i4 + 117;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return (WebView) view.findViewById(R.id.com_tnk_off_my_webview);
        }
        int i8 = i4 + 53;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
        return null;
    }

    public final WebChromeClient.FileChooserParams getFileChooserParams() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 83;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        WebChromeClient.FileChooserParams fileChooserParams = this.h;
        int i6 = i4 + 77;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return fileChooserParams;
        }
        throw null;
    }

    public final ValueCallback<Uri[]> getFilePathCallback() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 33;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        ValueCallback<Uri[]> valueCallback = this.g;
        int i6 = i4 + 47;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return valueCallback;
    }

    public final IEngagementSignalsCallback_Parcel<IPostMessageServiceDefault> getIntentPhotoPicker() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 119;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        IEngagementSignalsCallback_Parcel<IPostMessageServiceDefault> iEngagementSignalsCallback_Parcel = this.f32i;
        if (i4 == 0) {
            int i5 = 25 / 0;
        }
        return iEngagementSignalsCallback_Parcel;
    }

    public final GroupieAdapter getMAdapter() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 95;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        GroupieAdapter groupieAdapter = this.d;
        int i6 = i4 + 17;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return groupieAdapter;
    }

    public final ArrayList<TnkAdMultiJoinListItem2> getMMultiJoinItems() {
        ArrayList<TnkAdMultiJoinListItem2> arrayList;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 61;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            arrayList = this.e;
            int i5 = 7 / 0;
        } else {
            arrayList = this.e;
        }
        int i6 = i3 + 97;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return arrayList;
        }
        throw null;
    }

    public final TnkAdMultiJoinListItem2.OnMultiJoinItemClickListener getOnEventItemClick() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 41;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f;
        }
        throw null;
    }

    public final int getSelectTab() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 89;
        IAuthTabCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            getArguments();
            throw null;
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            int i4 = onNavigationEvent + 65;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return 0;
            }
            obj.hashCode();
            throw null;
        }
        int i5 = IAuthTabCallback + 71;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        int i7 = arguments.getInt("selectTab");
        if (i6 != 0) {
            int i8 = 85 / 0;
        }
        return i7;
    }

    public final TnkOffNavi getTnkNavi() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 113;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        TnkOffNavi tnkOffNavi = this.a;
        int i6 = i3 + 115;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 38 / 0;
        }
        return tnkOffNavi;
    }

    public final View getViewRoot() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 33;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        View view = this.c;
        int i6 = i3 + 41;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return view;
    }

    public final void loadDlg(boolean z) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 83;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        TnkOffNavi tnkOffNavi = this.a;
        Intrinsics.checkNotNull(tnkOffNavi);
        tnkOffNavi.showLoading(z);
        int i5 = onNavigationEvent + 85;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setAppCompatActivity(@Nullable FragmentActivity fragmentActivity) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 43;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        this.b = fragmentActivity;
        int i6 = i4 + 91;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void setFileChooserParams(@Nullable WebChromeClient.FileChooserParams fileChooserParams) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 5;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        this.h = fileChooserParams;
        int i6 = i3 + 63;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setFilePathCallback(@Nullable ValueCallback<Uri[]> valueCallback) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 35;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        this.g = valueCallback;
        if (i5 != 0) {
            int i6 = 18 / 0;
        }
        int i7 = i3 + 95;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    public final void setOnEventItemClick(@NotNull TnkAdMultiJoinListItem2.OnMultiJoinItemClickListener onMultiJoinItemClickListener) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 31;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(onMultiJoinItemClickListener, "");
        this.f = onMultiJoinItemClickListener;
        int i5 = onNavigationEvent + 11;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setTnkNavi(@Nullable TnkOffNavi tnkOffNavi) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 115;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        this.a = tnkOffNavi;
        if (i5 != 0) {
            int i6 = 12 / 0;
        }
        int i7 = i4 + 73;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
    }

    public final void setViewRoot(@Nullable View view) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 43;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        this.c = view;
        if (i4 != 0) {
            int i5 = 94 / 0;
        }
    }

    public final void loadWebView(@NotNull WebView webView, @NotNull String str) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(webView, "");
        Intrinsics.checkNotNullParameter(str, "");
        webView.loadUrl(str + "&" + Utils.getWebQueryParam(this.b));
        int i3 = IAuthTabCallback + 125;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 7 / 0;
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 9;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        super.onCreate(bundle);
        setStyle(1, R.style.tnk_full_screen_dialog);
        int i5 = onNavigationEvent + 25;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void open_new_window(@NotNull final String str) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tnkfactory.ad.basic.TnkAdMyMenu$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                TnkAdMyMenu.a(this.f$0, str);
            }
        });
        int i3 = onNavigationEvent + 101;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void photoPicker(@NotNull ValueCallback<Uri[]> valueCallback, @NotNull WebChromeClient.FileChooserParams fileChooserParams) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 83;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(valueCallback, "");
        Intrinsics.checkNotNullParameter(fileChooserParams, "");
        this.g = valueCallback;
        this.h = fileChooserParams;
        this.f32i.onNavigationEvent(ITrustedWebActivityCallback.onWarmupCompleted(IPostMessageService_Parcel.onTransact.onExtraCallback.onNavigationEvent));
        int i5 = onNavigationEvent + 119;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 69 / 0;
        }
    }

    public final class AdWebViewClient extends WebViewClient {
        public AdWebViewClient() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(@NotNull WebView webView, @Nullable String str) {
            Intrinsics.checkNotNullParameter(webView, "");
            TnkAdMyMenu.this.loadDlg(false);
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(@Nullable WebView webView, @Nullable String str, @Nullable Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(@Nullable WebView webView, @Nullable String str) {
            if (str != null && StringsKt.contains$default(str, "flag=open_new_window", false, 2, (Object) null)) {
                TnkAdMyMenu.this.open_new_window(str);
                return true;
            }
            Intrinsics.checkNotNull(str);
            if (!StringsKt.startsWith$default(str, "tnkscheme://", false, 2, (Object) null)) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            TnkAdMyMenu tnkAdMyMenu = TnkAdMyMenu.this;
            Uri uri = Uri.parse(str);
            Intrinsics.checkNotNullExpressionValue(uri, "");
            tnkAdMyMenu.appScheme(uri);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest) {
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    public final void appScheme(@NotNull Uri uri) {
        final Context applicationContext;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(uri, "");
        Context context = getContext();
        if (context == null || (applicationContext = context.getApplicationContext()) == null) {
            return;
        }
        try {
            String host = uri.getHost();
            if (host != null) {
                int i3 = onNavigationEvent + 107;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                int iHashCode = host.hashCode();
                if (iHashCode == -2061496180) {
                    if (host.equals("close_view")) {
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tnkfactory.ad.basic.TnkAdMyMenu$$ExternalSyntheticLambda2
                            @Override // java.lang.Runnable
                            public final void run() {
                                TnkAdMyMenu.a(this.f$0);
                            }
                        });
                        return;
                    }
                    return;
                }
                int i5 = onNavigationEvent + 33;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (iHashCode == -1561424053 && host.equals("show_privacy_policy")) {
                    Settings.INSTANCE.setAgreePrivacy(applicationContext, false);
                    dismiss();
                    TnkOffNavi tnkOffNavi = this.a;
                    Intrinsics.checkNotNull(tnkOffNavi);
                    tnkOffNavi.showTerms(1, new Function0() { // from class: com.tnkfactory.ad.basic.TnkAdMyMenu$$ExternalSyntheticLambda0
                        public final Object invoke() {
                            return TnkAdMyMenu.a();
                        }
                    }, new Function0() { // from class: com.tnkfactory.ad.basic.TnkAdMyMenu$$ExternalSyntheticLambda1
                        public final Object invoke() {
                            return TnkAdMyMenu.a(applicationContext);
                        }
                    });
                    int i6 = onNavigationEvent + 43;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(View view) throws Throwable {
        int i2;
        int i3;
        Object obj;
        WebSettings settings;
        int i4;
        int i5 = 2 % 2;
        loadDlg(true);
        Object obj2 = null;
        if (getSelectTab() == 0) {
            if (this.d.getItemCount() > 0) {
                int i6 = IAuthTabCallback + 81;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 != 0) {
                    loadDlg(true);
                } else {
                    loadDlg(false);
                }
            }
            View comTnkOffMyMenuMultiUnderLine = getComTnkOffMyMenuMultiUnderLine();
            if (comTnkOffMyMenuMultiUnderLine != null) {
                int i7 = onNavigationEvent + 57;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                comTnkOffMyMenuMultiUnderLine.setVisibility(Intrinsics.areEqual(view, getComTnkOffMyMenuMulti()) ? 0 : 8);
            }
            View comTnkOffMyMenuRewardUnderline = getComTnkOffMyMenuRewardUnderline();
            if (comTnkOffMyMenuRewardUnderline != null) {
                comTnkOffMyMenuRewardUnderline.setVisibility(Intrinsics.areEqual(view, getComTnkOffMyMenuReward()) ? 0 : 8);
            }
            View comTnkOffMyMenuFaqUnderline = getComTnkOffMyMenuFaqUnderline();
            if (comTnkOffMyMenuFaqUnderline != null) {
                comTnkOffMyMenuFaqUnderline.setVisibility(Intrinsics.areEqual(view, getComTnkOffMyMenuFaq()) ? 0 : 8);
            }
            View comTnkOffMyMenuHelpMainUnderline = getComTnkOffMyMenuHelpMainUnderline();
            if (comTnkOffMyMenuHelpMainUnderline != null) {
                if (Intrinsics.areEqual(view, getComTnkOffMyMenuHelpMain())) {
                    int i9 = IAuthTabCallback + 45;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                    i4 = 0;
                } else {
                    i4 = 8;
                }
                comTnkOffMyMenuHelpMainUnderline.setVisibility(i4);
            }
        } else {
            View comTnkOffMyMenuMultiUnderLine2 = getComTnkOffMyMenuMultiUnderLine();
            if (comTnkOffMyMenuMultiUnderLine2 != null) {
                comTnkOffMyMenuMultiUnderLine2.setVisibility(Intrinsics.areEqual(view, getComTnkOffMyMenuMulti()) ? 0 : 8);
            }
            View comTnkOffMyMenuRewardUnderline2 = getComTnkOffMyMenuRewardUnderline();
            if (comTnkOffMyMenuRewardUnderline2 != null) {
                comTnkOffMyMenuRewardUnderline2.setVisibility(Intrinsics.areEqual(view, getComTnkOffMyMenuReward()) ? 0 : 8);
            }
            View comTnkOffMyMenuFaqUnderline2 = getComTnkOffMyMenuFaqUnderline();
            if (comTnkOffMyMenuFaqUnderline2 != null) {
                int i11 = onNavigationEvent + 15;
                IAuthTabCallback = i11 % 128;
                if (i11 % 2 == 0) {
                    Intrinsics.areEqual(view, getComTnkOffMyMenuFaq());
                    obj2.hashCode();
                    throw null;
                }
                comTnkOffMyMenuFaqUnderline2.setVisibility(Intrinsics.areEqual(view, getComTnkOffMyMenuFaq()) ? 0 : 8);
            }
            View comTnkOffMyMenuHelpMainUnderline2 = getComTnkOffMyMenuHelpMainUnderline();
            if (comTnkOffMyMenuHelpMainUnderline2 != null) {
                comTnkOffMyMenuHelpMainUnderline2.setVisibility(Intrinsics.areEqual(view, getComTnkOffMyMenuHelpMain()) ? 0 : 8);
            }
            View comTnkOffMyMenuMulti = getComTnkOffMyMenuMulti();
            if (comTnkOffMyMenuMulti != null) {
                int i12 = onNavigationEvent + 53;
                IAuthTabCallback = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 88 / 0;
                    i3 = Intrinsics.areEqual(view, getComTnkOffMyMenuMulti()) ? 0 : 8;
                } else if (Intrinsics.areEqual(view, getComTnkOffMyMenuMulti())) {
                }
                comTnkOffMyMenuMulti.setVisibility(i3);
            }
            View comTnkOffMyMenuReward = getComTnkOffMyMenuReward();
            if (comTnkOffMyMenuReward != null) {
                comTnkOffMyMenuReward.setVisibility(Intrinsics.areEqual(view, getComTnkOffMyMenuReward()) ? 0 : 8);
            }
            View comTnkOffMyMenuFaq = getComTnkOffMyMenuFaq();
            if (comTnkOffMyMenuFaq != null) {
                if (Intrinsics.areEqual(view, getComTnkOffMyMenuFaq())) {
                    i2 = 0;
                } else {
                    int i14 = IAuthTabCallback + 49;
                    onNavigationEvent = i14 % 128;
                    int i15 = i14 % 2;
                    i2 = 8;
                }
                comTnkOffMyMenuFaq.setVisibility(i2);
            }
            View comTnkOffMyMenuHelpMain = getComTnkOffMyMenuHelpMain();
            if (comTnkOffMyMenuHelpMain != null) {
                comTnkOffMyMenuHelpMain.setVisibility(Intrinsics.areEqual(view, getComTnkOffMyMenuHelpMain()) ? 0 : 8);
            }
        }
        View comTnkOffMyMenuMulti2 = getComTnkOffMyMenuMulti();
        if (comTnkOffMyMenuMulti2 != null) {
            int i16 = onNavigationEvent + 107;
            IAuthTabCallback = i16 % 128;
            int i17 = i16 % 2;
            comTnkOffMyMenuMulti2.setSelected(Intrinsics.areEqual(view, getComTnkOffMyMenuMulti()));
        }
        View comTnkOffMyMenuReward2 = getComTnkOffMyMenuReward();
        if (comTnkOffMyMenuReward2 != null) {
            comTnkOffMyMenuReward2.setSelected(Intrinsics.areEqual(view, getComTnkOffMyMenuReward()));
        }
        View comTnkOffMyMenuFaq2 = getComTnkOffMyMenuFaq();
        if (comTnkOffMyMenuFaq2 != null) {
            comTnkOffMyMenuFaq2.setSelected(Intrinsics.areEqual(view, getComTnkOffMyMenuFaq()));
        }
        View comTnkOffMyMenuHelpMain2 = getComTnkOffMyMenuHelpMain();
        if (comTnkOffMyMenuHelpMain2 != null) {
            comTnkOffMyMenuHelpMain2.setSelected(Intrinsics.areEqual(view, getComTnkOffMyMenuHelpMain()));
        }
        RecyclerView comTnkOffMyMultiList = getComTnkOffMyMultiList();
        if (comTnkOffMyMultiList != null) {
            comTnkOffMyMultiList.setVisibility(Intrinsics.areEqual(view, getComTnkOffMyMenuMulti()) ? 0 : 8);
        }
        WebView comTnkOffMyWebview = getComTnkOffMyWebview();
        if (comTnkOffMyWebview != null) {
            int i18 = onNavigationEvent + 19;
            IAuthTabCallback = i18 % 128;
            if (i18 % 2 == 0) {
                Intrinsics.areEqual(view, getComTnkOffMyMenuMulti());
                throw null;
            }
            comTnkOffMyWebview.setVisibility(Intrinsics.areEqual(view, getComTnkOffMyMenuMulti()) ? 8 : 0);
        }
        WebView comTnkOffMyWebview2 = getComTnkOffMyWebview();
        if (comTnkOffMyWebview2 != null && (settings = comTnkOffMyWebview2.getSettings()) != null) {
            settings.setSupportMultipleWindows(true);
        }
        WebView comTnkOffMyWebview3 = getComTnkOffMyWebview();
        if (comTnkOffMyWebview3 != null) {
            comTnkOffMyWebview3.setWebChromeClient(new AdChromeClient());
        }
        if (Intrinsics.areEqual(view, getComTnkOffMyMenuMulti())) {
            OfferwallTabClick mOfferwallTabClick = TnkAssert.INSTANCE.getMOfferwallTabClick();
            mOfferwallTabClick.setParticipationList1(mOfferwallTabClick.getParticipationList1() + 1);
            if (this.d.getItemCount() > 1) {
                int i19 = onNavigationEvent + 59;
                IAuthTabCallback = i19 % 128;
                if (i19 % 2 == 0) {
                    loadDlg(true);
                    return;
                } else {
                    loadDlg(false);
                    return;
                }
            }
            return;
        }
        if (Intrinsics.areEqual(view, getComTnkOffMyMenuReward())) {
            OfferwallTabClick mOfferwallTabClick2 = TnkAssert.INSTANCE.getMOfferwallTabClick();
            mOfferwallTabClick2.setParticipationList2(mOfferwallTabClick2.getParticipationList2() + 1);
            WebView comTnkOffMyWebview4 = getComTnkOffMyWebview();
            Intrinsics.checkNotNull(comTnkOffMyWebview4);
            Object[] objArr = new Object[1];
            j(new int[]{0, 61, 49, 0}, true, new byte[]{1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0}, objArr);
            loadWebView(comTnkOffMyWebview4, ((String) objArr[0]).intern());
            return;
        }
        if (!Intrinsics.areEqual(view, getComTnkOffMyMenuFaq())) {
            if (Intrinsics.areEqual(view, getComTnkOffMyMenuHelpMain())) {
                OfferwallTabClick mOfferwallTabClick3 = TnkAssert.INSTANCE.getMOfferwallTabClick();
                mOfferwallTabClick3.setParticipationList4(mOfferwallTabClick3.getParticipationList4() + 1);
                WebView comTnkOffMyWebview5 = getComTnkOffMyWebview();
                Intrinsics.checkNotNull(comTnkOffMyWebview5);
                Object[] objArr2 = new Object[1];
                j(new int[]{128, 62, 52, 20}, false, new byte[]{0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1}, objArr2);
                loadWebView(comTnkOffMyWebview5, ((String) objArr2[0]).intern());
                return;
            }
            return;
        }
        int i20 = onNavigationEvent + 37;
        IAuthTabCallback = i20 % 128;
        int i21 = i20 % 2;
        OfferwallTabClick mOfferwallTabClick4 = TnkAssert.INSTANCE.getMOfferwallTabClick();
        mOfferwallTabClick4.setParticipationList3(mOfferwallTabClick4.getParticipationList3() + 1);
        WebView comTnkOffMyWebview6 = getComTnkOffMyWebview();
        Intrinsics.checkNotNull(comTnkOffMyWebview6);
        if (TnkAdConfig.INSTANCE.getUseTermsPopup()) {
            Object[] objArr3 = new Object[1];
            j(new int[]{61, 1, 0, 0}, true, new byte[]{0}, objArr3);
            obj = objArr3[0];
        } else {
            Object[] objArr4 = new Object[1];
            j(new int[]{62, 1, 26, 0}, false, new byte[]{1}, objArr4);
            obj = objArr4[0];
        }
        String strIntern = ((String) obj).intern();
        StringBuilder sb = new StringBuilder();
        Object[] objArr5 = new Object[1];
        j(new int[]{63, 65, 0, 0}, false, new byte[]{0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr5);
        sb.append(((String) objArr5[0]).intern());
        sb.append(strIntern);
        loadWebView(comTnkOffMyWebview6, sb.toString());
    }

    public static final void a(TnkAdMyMenu tnkAdMyMenu, String str) {
        int i2 = 2 % 2;
        FragmentActivity fragmentActivity = tnkAdMyMenu.b;
        Intrinsics.checkNotNull(fragmentActivity);
        PackageManager packageManager = fragmentActivity.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "");
        if (listQueryIntentActivities.size() > 0) {
            FragmentActivity fragmentActivity2 = tnkAdMyMenu.b;
            Intrinsics.checkNotNull(fragmentActivity2);
            fragmentActivity2.startActivity(intent);
            int i3 = IAuthTabCallback + 81;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = onNavigationEvent + 13;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final Unit a() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 5;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = Unit.INSTANCE;
        if (i4 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final Unit a(Context context) {
        TnkCore tnkCore;
        Settings settings;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 55;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            tnkCore = TnkCore.INSTANCE;
            tnkCore.getOffRepository().getAdList().clear();
            settings = Settings.INSTANCE;
        } else {
            tnkCore = TnkCore.INSTANCE;
            tnkCore.getOffRepository().getAdList().clear();
            settings = Settings.INSTANCE;
        }
        settings.setAgreePrivacy(context, false);
        tnkCore.getOffRepository().getDataChanged().postValue(Boolean.TRUE);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 27;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static final void a(TnkAdMyMenu tnkAdMyMenu) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 119;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        tnkAdMyMenu.dismiss();
        if (i4 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa A[PHI: r12
      0x00aa: PHI (r12v35 android.webkit.WebSettings) = (r12v34 android.webkit.WebSettings), (r12v36 android.webkit.WebSettings) binds: [B:28:0x00a8, B:25:0x00a1] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) throws Throwable {
        WebSettings settings;
        WebSettings settings2;
        WebSettings settings3;
        WebSettings settings4;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        TnkCore tnkCore = TnkCore.INSTANCE;
        if (!tnkCore.isInitialized()) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            tnkCore.init(fragmentActivityRequireActivity);
        }
        FragmentActivity context = getContext();
        Intrinsics.checkNotNull(context, "");
        FragmentActivity fragmentActivity = context;
        this.b = fragmentActivity;
        Intrinsics.checkNotNull(fragmentActivity);
        this.a = new TnkOffNavi(fragmentActivity);
        this.c = view;
        View comTnkOffMyClose = getComTnkOffMyClose();
        if (comTnkOffMyClose != null) {
            comTnkOffMyClose.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.TnkAdMyMenu$$ExternalSyntheticLambda4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    TnkAdMyMenu.a(this.f$0, view2);
                }
            });
        }
        RecyclerView comTnkOffMyMultiList = getComTnkOffMyMultiList();
        if (comTnkOffMyMultiList != null) {
            comTnkOffMyMultiList.setAdapter(this.d);
            comTnkOffMyMultiList.setLayoutManager(new LinearLayoutManager(comTnkOffMyMultiList.getContext()));
            int i3 = onNavigationEvent + 9;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
        }
        WebView comTnkOffMyWebview = getComTnkOffMyWebview();
        if (comTnkOffMyWebview != null) {
            comTnkOffMyWebview.setWebViewClient(new AdWebViewClient());
        }
        WebView comTnkOffMyWebview2 = getComTnkOffMyWebview();
        if (comTnkOffMyWebview2 != null) {
            comTnkOffMyWebview2.setWebChromeClient(new AdChromeClient());
        }
        WebView comTnkOffMyWebview3 = getComTnkOffMyWebview();
        if (comTnkOffMyWebview3 != null) {
            comTnkOffMyWebview3.setNetworkAvailable(true);
        }
        WebView comTnkOffMyWebview4 = getComTnkOffMyWebview();
        if (comTnkOffMyWebview4 != null) {
            int i5 = IAuthTabCallback + 11;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                settings4 = comTnkOffMyWebview4.getSettings();
                int i6 = 63 / 0;
                if (settings4 != null) {
                    int i7 = onNavigationEvent + 95;
                    IAuthTabCallback = i7 % 128;
                    if (i7 % 2 == 0) {
                        settings4.setJavaScriptEnabled(false);
                    } else {
                        settings4.setJavaScriptEnabled(true);
                    }
                }
            } else {
                settings4 = comTnkOffMyWebview4.getSettings();
                if (settings4 != null) {
                }
            }
        }
        WebView comTnkOffMyWebview5 = getComTnkOffMyWebview();
        if (comTnkOffMyWebview5 != null) {
            int i8 = onNavigationEvent + 21;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            WebSettings settings5 = comTnkOffMyWebview5.getSettings();
            if (settings5 != null) {
                settings5.setDomStorageEnabled(true);
                int i10 = IAuthTabCallback + 75;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
            }
        }
        WebView comTnkOffMyWebview6 = getComTnkOffMyWebview();
        if (comTnkOffMyWebview6 != null) {
            int i12 = onNavigationEvent + 95;
            IAuthTabCallback = i12 % 128;
            if (i12 % 2 == 0) {
                comTnkOffMyWebview6.getSettings();
                throw null;
            }
            WebSettings settings6 = comTnkOffMyWebview6.getSettings();
            if (settings6 != null) {
                settings6.setTextZoom(100);
            }
        }
        WebView comTnkOffMyWebview7 = getComTnkOffMyWebview();
        if (comTnkOffMyWebview7 != null && (settings3 = comTnkOffMyWebview7.getSettings()) != null) {
            int i13 = onNavigationEvent + 61;
            IAuthTabCallback = i13 % 128;
            int i14 = i13 % 2;
            settings3.setMixedContentMode(0);
        }
        WebView comTnkOffMyWebview8 = getComTnkOffMyWebview();
        if (comTnkOffMyWebview8 != null && (settings2 = comTnkOffMyWebview8.getSettings()) != null) {
            settings2.setJavaScriptCanOpenWindowsAutomatically(true);
        }
        WebView comTnkOffMyWebview9 = getComTnkOffMyWebview();
        if (comTnkOffMyWebview9 != null && (settings = comTnkOffMyWebview9.getSettings()) != null) {
            int i15 = onNavigationEvent + 5;
            IAuthTabCallback = i15 % 128;
            if (i15 % 2 == 0) {
                settings.setSupportMultipleWindows(false);
            } else {
                settings.setSupportMultipleWindows(true);
            }
        }
        WebView comTnkOffMyWebview10 = getComTnkOffMyWebview();
        if (comTnkOffMyWebview10 != null) {
            comTnkOffMyWebview10.setScrollBarStyle(0);
        }
        View comTnkOffMyMenuMulti = getComTnkOffMyMenuMulti();
        if (comTnkOffMyMenuMulti != null) {
            comTnkOffMyMenuMulti.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.TnkAdMyMenu$$ExternalSyntheticLambda5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) throws Throwable {
                    this.f$0.a(view2);
                }
            });
        }
        View comTnkOffMyMenuReward = getComTnkOffMyMenuReward();
        if (comTnkOffMyMenuReward != null) {
            comTnkOffMyMenuReward.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.TnkAdMyMenu$$ExternalSyntheticLambda5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) throws Throwable {
                    this.f$0.a(view2);
                }
            });
        }
        View comTnkOffMyMenuFaq = getComTnkOffMyMenuFaq();
        if (comTnkOffMyMenuFaq != null) {
            comTnkOffMyMenuFaq.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.TnkAdMyMenu$$ExternalSyntheticLambda5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) throws Throwable {
                    this.f$0.a(view2);
                }
            });
        }
        View comTnkOffMyMenuHelpMain = getComTnkOffMyMenuHelpMain();
        if (comTnkOffMyMenuHelpMain != null) {
            comTnkOffMyMenuHelpMain.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.TnkAdMyMenu$$ExternalSyntheticLambda5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) throws Throwable {
                    this.f$0.a(view2);
                }
            });
        }
        TnkOffNavi tnkOffNavi = this.a;
        Intrinsics.checkNotNull(tnkOffNavi);
        tnkOffNavi.showLoading(true);
        FragmentActivity fragmentActivity2 = this.b;
        Intrinsics.checkNotNull(fragmentActivity2);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(fragmentActivity2), putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new s(this, view, null), 2, (Object) null);
        try {
            int selectTab = getSelectTab();
            if (selectTab == 0) {
                View comTnkOffMyMenuMulti2 = getComTnkOffMyMenuMulti();
                Intrinsics.checkNotNull(comTnkOffMyMenuMulti2);
                a(comTnkOffMyMenuMulti2);
                return;
            }
            int i16 = IAuthTabCallback;
            int i17 = i16 + 77;
            onNavigationEvent = i17 % 128;
            int i18 = i17 % 2;
            if (selectTab == 1) {
                View comTnkOffMyMenuReward2 = getComTnkOffMyMenuReward();
                Intrinsics.checkNotNull(comTnkOffMyMenuReward2);
                a(comTnkOffMyMenuReward2);
                return;
            }
            int i19 = i16 + 29;
            onNavigationEvent = i19 % 128;
            if (i19 % 2 == 0 ? selectTab == 2 : selectTab == 2) {
                View comTnkOffMyMenuFaq2 = getComTnkOffMyMenuFaq();
                Intrinsics.checkNotNull(comTnkOffMyMenuFaq2);
                a(comTnkOffMyMenuFaq2);
            } else if (selectTab != 3) {
                View comTnkOffMyMenuMulti3 = getComTnkOffMyMenuMulti();
                Intrinsics.checkNotNull(comTnkOffMyMenuMulti3);
                a(comTnkOffMyMenuMulti3);
            } else {
                View comTnkOffMyMenuHelpMain2 = getComTnkOffMyMenuHelpMain();
                Intrinsics.checkNotNull(comTnkOffMyMenuHelpMain2);
                a(comTnkOffMyMenuHelpMain2);
            }
        } catch (Exception unused) {
        }
    }

    public static final void a(TnkAdMyMenu tnkAdMyMenu, Uri uri) {
        int i2 = 2 % 2;
        if (uri == null) {
            ValueCallback valueCallback = tnkAdMyMenu.g;
            if (valueCallback != null) {
                int i3 = IAuthTabCallback + 37;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                valueCallback.onReceiveValue(new Uri[]{Uri.EMPTY});
            }
            int i5 = onNavigationEvent + 23;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        int i7 = IAuthTabCallback + 37;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            ValueCallback valueCallback2 = tnkAdMyMenu.g;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ValueCallback valueCallback3 = tnkAdMyMenu.g;
        if (valueCallback3 != null) {
            valueCallback3.onReceiveValue(new Uri[]{uri});
        }
    }

    private static void j(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr = onExtraCallbackWithResult;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                int i10 = $10 + 9;
                $11 = i10 % 128;
                if (i10 % i3 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i9])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35282 - TextUtils.lastIndexOf("", '0', 0, 0)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 34, 14287 - AndroidCharacter.getMirror('0'), -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i9] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr[i9])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.argb(0, 0, 0, 0) + 35283), 35 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 14238, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i9++;
                }
                i3 = 2;
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i6];
        System.arraycopy(cArr, i5, cArr3, 0, i6);
        if (bArr != null) {
            int i11 = $10 + 87;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            char[] cArr4 = new char[i6];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i6) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i13 = $11 + 79;
                    $10 = i13 % 128;
                    if (i13 % 2 != 0) {
                        int i14 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 10935), 65 - TextUtils.getCapsMode("", 0, 0), 16718 - (ViewConfiguration.getEdgeSlop() >> 16), -846731970, false, TtmlNode.TAG_P, new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        Object obj = null;
                        cArr4[i14] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                        obj.hashCode();
                        throw null;
                    }
                    int i15 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10936 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getTouchSlop() >> 8) + 65, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 16718, -846731970, false, TtmlNode.TAG_P, new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i15] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                } else {
                    int i16 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr6 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getJumpTapTimeout() >> 16) + 29, TextUtils.indexOf("", "") + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i16] = ((Character) ((Method) objOnExtraCallback5).invoke(null, objArr6)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr7 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback6 == null) {
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - (Process.myTid() >> 22)), 70 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 12485 - Process.getGidForName(""), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
            }
            cArr3 = cArr4;
        }
        if (i8 > 0) {
            char[] cArr5 = new char[i6];
            System.arraycopy(cArr3, 0, cArr5, 0, i6);
            int i17 = i6 - i8;
            System.arraycopy(cArr5, 0, cArr3, i17, i8);
            System.arraycopy(cArr5, i8, cArr3, 0, i17);
        }
        if (z) {
            char[] cArr6 = new char[i6];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i6) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i6 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i7 > 0) {
            int i18 = $11 + 109;
            $10 = i18 % 128;
            if (i18 % 2 != 0) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i6) {
                int i19 = $11 + 67;
                $10 = i19 % 128;
                if (i19 % 2 != 0) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] * iArr[2]);
                    i2 = trackGroupExternalSyntheticLambda0.onNavigationEvent / 0;
                } else {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    i2 = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i2;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public final List<ITnkOffAdItem> filterAdItem(@NotNull List<AdListVo> list) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        KClass<? extends ITnkOffAdItem> viewClass = TnkAdConfig.INSTANCE.getLayoutInfo(TnkLayoutType.INSTANCE.getAD_LIST_NORMAL()).getViewClass();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        int i3 = onNavigationEvent + 21;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        for (AdListVo adListVo : list) {
            ITnkOffAdItem.Companion companion = ITnkOffAdItem.Companion;
            FragmentActivity fragmentActivity = this.b;
            Intrinsics.checkNotNull(fragmentActivity);
            arrayList.add(companion.newInstance(new TnkContext(fragmentActivity), viewClass, adListVo));
        }
        ((ITnkOffAdItem) CollectionsKt.last(arrayList)).setDirection(TnkDirection.INSTANCE.getBOTTOM());
        int i5 = IAuthTabCallback + 33;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return arrayList;
    }

    public final void updateMultiJoinItems() {
        int i2 = 2 % 2;
        Context context = getContext();
        if (context == null) {
            int i3 = onNavigationEvent + 41;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!MultiCampaignJoinListItemKt.isCorrectItem(((TnkAdMultiJoinListItem2) next).getItem(), context)) {
                int i5 = IAuthTabCallback + 13;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    arrayList2.add(next);
                    throw null;
                }
                arrayList2.add(next);
            }
        }
        Iterator it2 = arrayList2.iterator();
        int i6 = IAuthTabCallback + 17;
        onNavigationEvent = i6 % 128;
        while (true) {
            int i7 = i6 % 2;
            if (!it2.hasNext()) {
                break;
            }
            int i8 = onNavigationEvent + 83;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            this.e.remove((TnkAdMultiJoinListItem2) it2.next());
            i6 = IAuthTabCallback + 105;
            onNavigationEvent = i6 % 128;
        }
        if (!this.e.isEmpty()) {
            this.d.update(this.e);
            return;
        }
        this.e.clear();
        this.d.clear();
        FragmentActivity fragmentActivity = this.b;
        Intrinsics.checkNotNull(fragmentActivity);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(fragmentActivity), putChannelInfo.onExtraCallback(), (setRandomHost) null, new t(this, null), 2, (Object) null);
    }

    static void onNavigationEvent() {
        onExtraCallbackWithResult = new char[]{27140, 27344, 27371, 27334, 27336, 27345, 27347, 27345, 27346, 27357, 27343, 27337, 27346, 27352, 27350, 27184, 27183, 27339, 27370, 27345, 27351, 27353, 27186, 27340, 27370, 27375, 27374, 27375, 27373, 27371, 27340, 27184, 27347, 27372, 27340, 27185, 27345, 27348, 27191, 27338, 27368, 27375, 27372, 27346, 27357, 27354, 27351, 27347, 27372, 27340, 27341, 27366, 27366, 27338, 27182, 27179, 27337, 27372, 27373, 27371, 27345, 27222, 27243, 27258, 27168, 27194, 27196, 27199, 27160, 27258, 27233, 27165, 27193, 27193, 27164, 27167, 27199, 27170, 27174, 27181, 27180, 27173, 27199, 27198, 27195, 27165, 27142, 27175, 27168, 27136, 27167, 27199, 27170, 27139, 27167, 27194, 27196, 27198, 27169, 27198, 27197, 27167, 27141, 27176, 27174, 27168, 27197, 27162, 27262, 27139, 27177, 27179, 27173, 27160, 27166, 27180, 27173, 27168, 27170, 27168, 27163, 27167, 27181, 27175, 27141, 27138, 27199, 27160, 27164, 27369, 27334, 27178, 27343, 27349, 27351, 27345, 27332, 27338, 27352, 27345, 27372, 27374, 27372, 27335, 27335, 27349, 27351, 27345, 27345, 27372, 27366, 27368, 27371, 27332, 27174, 27181, 27337, 27365, 27365, 27336, 27339, 27371, 27374, 27346, 27353, 27352, 27345, 27371, 27370, 27367, 27337, 27186, 27347, 27372, 27340, 27339, 27371, 27374, 27343, 27339, 27366, 27368, 27370, 27373, 27370, 27369, 27339, 27185, 27348, 27346};
    }
}
