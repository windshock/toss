package com.tnkfactory.ad.rwd;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.tnkfactory.ad.R;
import com.tnkfactory.ad.rwd.api.ConstantsUtil;
import com.tnkfactory.ad.rwd.data.constants.RpcConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class YouTubeVideoView extends RelativeLayout {
    public static final Companion Companion = new Companion(null);
    public static final int PROGRESS_BAR_BAR = 1;
    public static final int PROGRESS_BAR_SEC = 2;
    public WebView a;
    public ToggleButton b;
    public ImageView c;
    public TextView d;
    public int e;
    public float f;
    public float g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f54i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f55o;
    public boolean p;
    public boolean q;
    public boolean r;
    public final Runnable s;
    public VideoActionListener t;
    public VideoProgressListener u;
    public ViewTreeObserver.OnGlobalLayoutListener v;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YouTubeVideoView(@NotNull Context context, int i2, int i3) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.e = -1;
        this.r = true;
        this.s = new Runnable() { // from class: com.tnkfactory.ad.rwd.YouTubeVideoView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                YouTubeVideoView.a(this.f$0);
            }
        };
        a(context, i2, i3);
    }

    public static final void a(YouTubeVideoView youTubeVideoView) {
        if (!youTubeVideoView.r || youTubeVideoView.g <= 0.0f) {
            return;
        }
        youTubeVideoView.setPanelVisible(false);
    }

    public static final void access$hidePanelDelayed(YouTubeVideoView youTubeVideoView, long j) {
        youTubeVideoView.removeCallbacks(youTubeVideoView.s);
        if (j > 0) {
            youTubeVideoView.postDelayed(youTubeVideoView.s, j);
        }
    }

    public static final void b(YouTubeVideoView youTubeVideoView) {
        youTubeVideoView.startVideo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPanelVisible(boolean z) {
        this.r = z;
        int i2 = z ? 0 : 4;
        ToggleButton toggleButton = this.b;
        if (toggleButton != null) {
            Intrinsics.checkNotNull(toggleButton);
            toggleButton.setVisibility(i2);
        }
        TextView textView = this.d;
        if (textView != null) {
            Intrinsics.checkNotNull(textView);
            textView.setVisibility(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setViewTreeObserver$lambda$5(YouTubeVideoView youTubeVideoView) {
        if (LayoutUtils.isViewVisible(youTubeVideoView, true)) {
            boolean z = youTubeVideoView.p;
            if (z || !youTubeVideoView.f55o || z) {
                return;
            }
            youTubeVideoView.startVideo();
            youTubeVideoView.removeCallbacks(youTubeVideoView.s);
            youTubeVideoView.postDelayed(youTubeVideoView.s, 700L);
            return;
        }
        boolean z2 = youTubeVideoView.p;
        if (z2 && z2) {
            youTubeVideoView.p = false;
            youTubeVideoView.a(ConstantsUtil.INSTANCE.def("d6791485ec67986ff6702c0a"));
            youTubeVideoView.setPanelVisible(true);
            youTubeVideoView.removeCallbacks(youTubeVideoView.s);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.v != null) {
            getViewTreeObserver().removeOnGlobalLayoutListener(this.v);
            this.v = null;
        }
    }

    public final void pauseVideo() {
        if (this.p) {
            this.p = false;
            a(ConstantsUtil.INSTANCE.def("d6791485ec67986ff6702c0a"));
            setPanelVisible(true);
            removeCallbacks(this.s);
        }
    }

    public final void resumeVideo() {
        if (!this.f55o || this.p) {
            return;
        }
        startVideo();
        removeCallbacks(this.s);
        postDelayed(this.s, 700L);
    }

    public final void setAutoStart(boolean z) {
        this.f54i = z;
    }

    public final void setMuteOnStart(boolean z) {
        this.q = z;
        ToggleButton toggleButton = this.b;
        if (toggleButton != null) {
            Intrinsics.checkNotNull(toggleButton);
            toggleButton.setChecked(this.q);
            ToggleButton toggleButton2 = this.b;
            Intrinsics.checkNotNull(toggleButton2);
            toggleButton2.setSelected(this.q);
        }
    }

    public final void setVideoActionListener(@Nullable VideoActionListener videoActionListener) {
        this.t = videoActionListener;
    }

    public final void setVideoProgressListener(@Nullable VideoProgressListener videoProgressListener) {
        this.u = videoProgressListener;
    }

    public final void setYoutubeId(@Nullable String str) {
        ConstantsUtil constantsUtil = ConstantsUtil.INSTANCE;
        String strDef = constantsUtil.def("9a3925b9ca65a85bd63f6c5733f56bdad6d21714281ba2c95017f7220cf1bf343008d349bc813ea359389a59ba161a1a2080c5c393b6011e1a8656f70b09c6267b32b6af497ebcfc530bf25876e3b6c07c2a8c49c8426c0e28b254a87157344cd7ed0b45f65243d037121aae2c7df92b997818f1ed208c2bb39eac73511e07416bb2e87020baea721add7a13b251e0b46b3318643bb1eb684484f4117933fd0b43889e3a61f34b3448bc525a8b6cead03068d04c16755d33d1d96d5f7a586d0d0cbb623507b5a8758a7a07633c83bdbe7b97e6b5240df186d650e627fe40aeb4c00e99f99eb909e4717de4f597a5439fb134929cc61d8de77ee2a07ad311332233d7a6947606c350c3d5580528a72b8ed674bf4eb0ba3f9a1c86de2525bdc37615ba2a77e456597eeaed3d954bdb14720d5a954516b5547a4530aa716ebbed067c23124841d5b69d64ccf7277130a164bbf2dbcd2105e0447c74075a4b1a0b339bab0e76c37af2c5c1db1ca7ddf5848dd4276cb93fa1dd0730e2b0cb0b9814cb9b66dbb242b8062b3ef84e90e43c719de5786a75c0fe2def950b17aba8b0a1e73883c5bbc3b2c8785a1479452b49bbaed0f30221727a598aab888c5f5a1eddb58abc6544b33684d9816301f48c578a2ebe8dd714958a97dd857adecb6925e016861072332d868ff6b079605ae6781d2d73ed0901b2357fa1ca2ef46e5edbf0e90d12e170b109c6ad048ce528fc00461d88310ecf110c446bcf2590da7e9d6dc403b8c6e64e27efcd7d6a5961f3c6359f3d2ad91b73d18a6c8fddfa7db5c8a6e78d9ab727a76bbfd5f28632dad6e5b88e75001f888cb2750fff230a6b636817f5018b8d71c423257644f3ba18300c6a6af25a8c65040a221cbd692e61f523e74ec16e4d8252fe199b8229b13b324d9ffa2871425b896837c896e5a8ddaf7a33ff0bfa7792bf18984e279f6268f531f22cf16472207a9378fdce4d57803ab84a85445bb927d2a976cb0e46a3b8a588b9222246dd09c8458a7abecadd32f4832851d0096b8a3095daae59943cef695deb66c9ed41d2f23a1a950ba9ed3310b3a09a0ca4898a477578faebcbe223eef7d9a5b9035f32ec0e514e5f668d4e9784491be4c074b39b6252204d170841423b883561560df24a18854e99d0bef612645a995f3a40e117e4ec24198f7eb544cd8f6cb852954d58552ad75341b6eb8c3bcf287f1fcad394e148b058360012d1164a45897f7bfd93141e537d8c844fbd5b31191128c0ab7926bca5d753f0082a8aaa5779ace2ac1ea059d256d75cf792ae7cba4d81701d231201ba8d60cb8d981c1f202b04bf269a65df3d06ba33b063c62fe0e103a797d26ae5a983360335939ea3975c42c4effe7ba7abf1c2dd7f1a8d41c7bc3628355b9fdccddd6f30ec53c6f3c75585ea9c59488245c495384ac3342d80e5ca7d459d8fede9f5f19a3c3f1b42d808ad3d2e8dfac52c13e9d67977d002b7a9a8d6ac5a5d438c0725e93c1e067ce1f444e3baf06081ac86d781db717d51c8a8541e1b485028f4779b7f3934c76c81308f77357ea590ca6dcf9e03b83108e81fe5a1f58066a0af2eb95b337b0536525c50306ccfa19ff66c649528054664a72351cdb24fa508cb2a0e055ec3a18db8391e0d9017b706abd635abbc3c17f43a27e4bebf34409aac391f768fbb0bf4025668b9a2fdf0338280eb3df58e554236794d2dc10c9e17de365348fba60850e7a1203efba5b48095ae641936bf180ffdd6a9bfc1bbfef291da3df91e42fe76161f6eb34e383f8aac6032fd8360ccb76ed558a7ed52db2a55988cab007fedaa596c9540bfc7916d297c3c353c995cb7975adea8a2a24822c02c8625ffed9f0a7930dd19330ab1db61797a71c80c3623ea66d81b2181e3f3b3a8364adeb5d6fa20551307520751c893f802d4c2efc9f5a774fcaa58dbdbd748709a82716ff28364c877ab6f1865c2f6857d1b2239918748590ffc7531779ccf8d995f60b3ffee5af63b63d40dd5a97b51c602b6cbff7210954524fb01860337c3bbf5d3be4d55a2c5d0b87f7304ad0a445a359366c77e4dc6881a11d02b86b35ba36e5aebb90096a15804e9c65e5d1d4e9ee43f2b40a0285067637206c9bd20335ef4a75f5182fe82015dcfb042956722c29bbca5274091bed08c2ae499cd5ee82d7df14f893e78feeef512e68bd63585761116f9db84119855ca79408b7b0f14d612f5e8422a6a7ebf2eb29f6e0e983f0def603986bc65df03e4a2af221eb06e9b6967355d4e6daa5cf24a99708a8521a63715c60bbaaf4853bf105cb9130d2403b3ce0029a50c784be64d240eb4e0aa2a99bf273aec710bc5c3c69c0aa5c7984b58c93c0ad3a88ccc82b4468a6ba0a2f90c606b1ce518ef9771dd78fc1321112a74e8e433b4c6681d04442019d2ec4ef01afb77dbee5d6751e86b4f0746e99a43396c11fd8e82f3d4add5551c72cba55d4c1acfbc533381b87422cc702678f6dbf0a6f580534305ba7a7788045ee3e750472ea96fd9adb69f6fa6e109afd1d31e69c7be82384b73d3c54c3ef246760e9a344e42f1cdab4b9deec1d8459edb0d7065948f9db9f374cfedaaad646f4e9834a2f0f97d6b3022afef69c1cf49b27c4ef20e57431fa412fe8cb0fafa6d5446b418cc5ff7ee2692e854876a52ca09ae9f7b9c89056b96c1c6446739fd52ded5250f9e8d8ab574df011199f573b9c1b0c1e21ebe9700d9a484642db777fbca8872b56024d2bcd500f9324351a845496ae4037cc860e5b38538144ad38797cdac9f09a304d37a8a6978e46bd0ee1689c94d8901982dfb80f89af3c9bb8dacaf691d35b4be0a05eaaf021bd43b1b5cfa588c09e2f9ea06bbc09a3d72296fd436c5b90f4031edce37bf4b5e42d5dee2f661b73905220003bf0419c17d3103e3af8c02202a2dde1a420c90d219e507e1c4879d9155898e7d33b8800c011f636f718aad873179255f66dabf8e1355487ccf8b06de626abae0484b7996ca4c36fe69e5a7f92dbc790cb5b5df19d05f37417dc87c9a416048f3fdd0c1ad00e53a20ff00a5371bcfa6dfaf958d01e058868dbb5bb395848447649c9246ab4bde8920e149346c10932e6298dc6fd34970b4e470d06c8dee47cb87c1dfa1556d1ae9ac9dcd13fe9dceab68527d067078046b32c9f2217db2225dee2cc5b0a45a08e0fa7bc41ec1351306a5858725442f30690500be3ec10ceea971b31766fd5276855d837d55bec9b0d6497aa31e7e461d789e516d9ad4017b436e15301a0d91d806e8ad78c13afa8625267386cdb1fd5b22ee62e34800a3710a25c0b10e635d0b37f9443c728c145cbb905123d47ce7e85c796ac4b4d1ef7dea47b838195c9c87efa9bea9c59513c779f885a529711fc28729441d96655fe0c68e446f6ac9ded8602a5893f912d90f9eb9bd1268d19508dd887cdc02d8ad599c9036b5936965c4256f234e8761d834e87f3fd92be1ef27b1d4e2c8058ebaf2406fd5ad10a353eedfeefd2a7cbb3d2831a4689d00759ab848cf0de3048743fd3f1814cef5022d649892e8d74f4d9060caff594a9a7b067bc34cf016a27a498775c0015e4de06432f6fa1d8853a39a3182ba864b700003967684c58913db5a01e3ab41f94b78362a91b366d8b63f23b3af4b5e6847888f5d746ee2b81b02401a40dc2bf80653d8331a49a921ad8baa834d9e486d8a579e31efacff8939fdf9a250d14208d32dd6d7cf87ab19078743b78036f8ce07e2852991db0395f207684b98cf8fffdfd36477aaf5378a5504c6062dc969f743331f07e3fe399148c2748487d6f904cf70380e7ccb4c2b80217befb78cd78c5d6441241552cbcd016c418b7eb407505ee9cc815d4ca4d91f20a82be85b143e736939e31819e0ced1f38d60e58499f181228eee12958b7bcf3b8801f2e6d5fc48f6be8c9790cdf6714dc1674e76cd4cc8136697eaa14b43555c045b518c7f9cce82370a9dca11fe116c1d2881cf0ba61318f89f58ba8e16ff63f4dd1a35c1923dc24bb02e43c7609cd67345451274c679c4b8c29349aab5909e7d4c99cdea37cbee36dfd7a63e0647343f9c95a1b53d503be683eff688876b026f42c1021269a37a7565271afd5d8c42eeb6a88f1304083243b6983fdecbd0546ef6bea90e0eeca03a23d1d306745518e0c8cd53e875a6ee1711bbc2faccef21a119db753026cd38b1dcc4c45479d9cc8596f7c00fa3c81630f1a26956ef1709da4a7a1477008b3eea5c2aa0947107d8ee6baeaff789eca98f8d3267ae8b31112f62630763bc54b2d4d22a6206446475f380d990cd5838841f9161ded5dee31405a8161c8e9619d788a99afcc3cd64e4aa99ac6b76bde5d0ea2bb2ccb6e60ca64371e829c9f5568a748e130720a68fc5759a29afd569ca86e6b77eca6af3f104b1b43472854f33538a735c2b4d5c60e0dbd8bc3526c23b70432783f57a9695a6");
        Intrinsics.checkNotNull(str);
        String strReplace$default = StringsKt.replace$default(strDef, "<<injectedVideoId>>", str, false, 4, (Object) null);
        WebView webView = this.a;
        Intrinsics.checkNotNull(webView);
        webView.loadDataWithBaseURL(constantsUtil.def(RpcConfig.ENC_YOUTUBE_BASE_DOMAIN), strReplace$default, "text/html", "utf-8", null);
    }

    public final void startVideo() {
        if (!this.f55o) {
            postDelayed(new Runnable() { // from class: com.tnkfactory.ad.rwd.YouTubeVideoView$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    YouTubeVideoView.b(this.f$0);
                }
            }, 1000L);
        } else {
            this.p = true;
            a(ConstantsUtil.INSTANCE.def("d674008fdf58956efc372d"));
        }
    }

    public final void a(Context context, int i2, int i3) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        WebView webView = new WebView(getContext());
        this.a = webView;
        Intrinsics.checkNotNull(webView);
        webView.setLayoutParams(layoutParams);
        WebView webView2 = this.a;
        Intrinsics.checkNotNull(webView2);
        webView2.getSettings().setJavaScriptEnabled(true);
        WebView webView3 = this.a;
        Intrinsics.checkNotNull(webView3);
        webView3.getSettings().setJavaScriptCanOpenWindowsAutomatically(false);
        WebView webView4 = this.a;
        Intrinsics.checkNotNull(webView4);
        webView4.getSettings().setCacheMode(-1);
        WebView webView5 = this.a;
        Intrinsics.checkNotNull(webView5);
        webView5.setFocusable(false);
        WebView webView6 = this.a;
        Intrinsics.checkNotNull(webView6);
        webView6.addJavascriptInterface(new com.tnkfactory.ad.e.l(this), ConstantsUtil.INSTANCE.def("ff7714a2fc53945bff7e7d462cdb27b98edd06"));
        WebView webView7 = this.a;
        Intrinsics.checkNotNull(webView7);
        webView7.setWebChromeClient(new WebChromeClient() { // from class: com.tnkfactory.ad.rwd.YouTubeVideoView$init$1
            @Override // android.webkit.WebChromeClient
            public Bitmap getDefaultVideoPoster() {
                Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
                if (defaultVideoPoster != null) {
                    return defaultVideoPoster;
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.RGB_565);
                Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
                return bitmapCreateBitmap;
            }

            @Override // android.webkit.WebChromeClient
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                Intrinsics.checkNotNullParameter(consoleMessage, "");
                return super.onConsoleMessage(consoleMessage);
            }
        });
        WebView webView8 = this.a;
        Intrinsics.checkNotNull(webView8);
        webView8.setOnTouchListener(new View.OnTouchListener() { // from class: com.tnkfactory.ad.rwd.YouTubeVideoView$$ExternalSyntheticLambda4
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return YouTubeVideoView.a(this.f$0, view, motionEvent);
            }
        });
        addView(this.a);
        int iDip = Utils.dip(20);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iDip, iDip);
        if ((i3 & 1) == 0) {
            layoutParams2.addRule(11);
        } else {
            layoutParams2.addRule(9);
        }
        if ((i3 & 2) == 0) {
            layoutParams2.addRule(10);
        } else {
            layoutParams2.addRule(12);
        }
        int i4 = iDip / 4;
        layoutParams2.rightMargin = i4;
        layoutParams2.topMargin = i4;
        layoutParams2.leftMargin = i4;
        layoutParams2.bottomMargin = i4;
        ToggleButton toggleButton = new ToggleButton(getContext());
        this.b = toggleButton;
        Intrinsics.checkNotNull(toggleButton);
        toggleButton.setLayoutParams(layoutParams2);
        ToggleButton toggleButton2 = this.b;
        Intrinsics.checkNotNull(toggleButton2);
        toggleButton2.setText((CharSequence) null);
        ToggleButton toggleButton3 = this.b;
        Intrinsics.checkNotNull(toggleButton3);
        toggleButton3.setTextOn(null);
        ToggleButton toggleButton4 = this.b;
        Intrinsics.checkNotNull(toggleButton4);
        toggleButton4.setTextOff(null);
        ToggleButton toggleButton5 = this.b;
        Intrinsics.checkNotNull(toggleButton5);
        toggleButton5.setBackgroundResource(R.drawable.com_tnk_offerwall_btn_video_volume);
        addView(this.b);
        ToggleButton toggleButton6 = this.b;
        Intrinsics.checkNotNull(toggleButton6);
        toggleButton6.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.rwd.YouTubeVideoView$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                YouTubeVideoView.a(this.f$0, view);
            }
        });
        if ((i2 & 1) != 0) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, Utils.dip(2));
            layoutParams3.addRule(12);
            ImageView imageView = new ImageView(context);
            this.c = imageView;
            Intrinsics.checkNotNull(imageView);
            imageView.setLayoutParams(layoutParams3);
            ImageView imageView2 = this.c;
            Intrinsics.checkNotNull(imageView2);
            imageView2.setBackgroundColor(0);
            ImageView imageView3 = this.c;
            Intrinsics.checkNotNull(imageView3);
            imageView3.setScaleType(ImageView.ScaleType.FIT_XY);
            ClipDrawable clipDrawable = new ClipDrawable(new ColorDrawable(-16729344), 3, 1);
            clipDrawable.setLevel(0);
            ImageView imageView4 = this.c;
            Intrinsics.checkNotNull(imageView4);
            imageView4.setImageDrawable(clipDrawable);
            addView(this.c);
        }
        if ((i2 & 2) != 0) {
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(iDip, iDip);
            layoutParams4.addRule(12);
            layoutParams4.addRule(9);
            layoutParams4.leftMargin = 10;
            layoutParams4.bottomMargin = 10;
            TextView textView = new TextView(context);
            this.d = textView;
            Intrinsics.checkNotNull(textView);
            textView.setLayoutParams(layoutParams4);
            TextView textView2 = this.d;
            Intrinsics.checkNotNull(textView2);
            textView2.setTextColor(-1);
            TextView textView3 = this.d;
            Intrinsics.checkNotNull(textView3);
            textView3.setTextSize(14.0f);
            addView(this.d);
        }
    }

    public static final boolean a(YouTubeVideoView youTubeVideoView, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || !youTubeVideoView.p) {
            return false;
        }
        youTubeVideoView.setPanelVisible(true);
        youTubeVideoView.removeCallbacks(youTubeVideoView.s);
        youTubeVideoView.postDelayed(youTubeVideoView.s, 2000L);
        return false;
    }

    public static final void a(YouTubeVideoView youTubeVideoView, View view) {
        if (view == null) {
            return;
        }
        boolean zIsChecked = ((ToggleButton) view).isChecked();
        youTubeVideoView.q = zIsChecked;
        if (zIsChecked) {
            youTubeVideoView.a(ConstantsUtil.INSTANCE.def("cb6d1593a118"));
        } else {
            youTubeVideoView.a(ConstantsUtil.INSTANCE.def("d3762c83fd54d922"));
        }
    }

    public final void a(final String str) {
        WebView webView = this.a;
        Intrinsics.checkNotNull(webView);
        webView.post(new Runnable() { // from class: com.tnkfactory.ad.rwd.YouTubeVideoView$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                YouTubeVideoView.a(this.f$0, str);
            }
        });
    }

    public static final void a(YouTubeVideoView youTubeVideoView, String str) {
        WebView webView = youTubeVideoView.a;
        Intrinsics.checkNotNull(webView);
        webView.loadUrl("javascript:" + str);
    }

    public final void a() {
        if (this.v == null) {
            this.v = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.tnkfactory.ad.rwd.YouTubeVideoView$$ExternalSyntheticLambda3
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    YouTubeVideoView.setViewTreeObserver$lambda$5(this.f$0);
                }
            };
            getViewTreeObserver().addOnGlobalLayoutListener(this.v);
        }
    }
}
