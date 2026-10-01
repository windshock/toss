package com.tnkfactory.ad.rwd;

import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.tnkfactory.ad.TnkStyle;
import java.lang.reflect.Method;
import java.util.Locale;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class Resources {
    public static Resources b = null;
    public static boolean useCustomResource = false;
    public FormatCurrency a = new m();
    public String agree_privacy_btn_agree;
    public String agree_privacy_btn_refuse;
    public String agree_privacy_desc_default;
    public String agree_privacy_title;
    public String app_download;
    public String cancel;
    public String check_attend;
    public String check_install;
    public String confirm;
    public String default_title;
    public String detail_app_attend;
    public String detail_app_click;
    public String detail_app_inst;
    public String detail_app_inst_auto;
    public String detail_app_run;
    public String detail_title_cpi;
    public String detail_title_cps;
    public String detail_video_complete;
    public String detail_video_skip;
    public String detail_view_video;
    public String error_already_paid;
    public String error_app_launch_failed;
    public String error_check_run_failed;
    public String error_inconsistent;
    public String error_invalid_device;
    public String error_limit_day_count;
    public String error_market_not_installed;
    public String error_no_adv;
    public String error_no_browser;
    public String error_no_google;
    public String error_no_history;
    public String error_no_market;
    public String error_no_olleh;
    public String error_no_ozstore;
    public String error_no_pay_condition;
    public String error_no_pub;
    public String error_no_tstore;
    public String error_not_installed;
    public String error_not_installed_through_market;
    public String error_not_yet_attend_time;
    public String error_system;
    public String error_user_name_exceeded_256_bytes;
    public String extra_text_app;
    public String extra_text_web;
    public String filter_ad_category_text_action;
    public String filter_ad_category_text_purchase;
    public String filter_ad_category_title;
    public String filter_alginment_text_recommend;
    public String filter_alginment_text_reward;
    public String filter_alignment_title;
    public String filter_btn_apply;
    public String filter_btn_cancel;
    public String filter_product_category_text_all;
    public String filter_product_category_text_beauty;
    public String filter_product_category_text_food;
    public String filter_product_category_text_health;
    public String filter_product_category_text_life;
    public String filter_product_category_text_merchandise;
    public String filter_product_category_title;
    public String go;
    public String hide_app_cancel;
    public String hide_app_confirm;
    public String hide_app_message;
    public String hide_cancel_message;
    public String info_check_run;
    public String invalidate_placement_id;
    public String item_campn_type_action_etc;
    public String item_campn_type_attendance;
    public String item_campn_type_click;
    public String item_campn_type_cps;
    public String item_campn_type_db;
    public String item_campn_type_etc;
    public String item_campn_type_facebook;
    public String item_campn_type_instagram;
    public String item_campn_type_install;
    public String item_campn_type_join_app;
    public String item_campn_type_join_naver_cafe;
    public String item_campn_type_join_web;
    public String item_campn_type_kakao_story;
    public String item_campn_type_level;
    public String item_campn_type_login;
    public String item_campn_type_login_kakao;
    public String item_campn_type_paid_payment;
    public String item_campn_type_reservation;
    public String item_campn_type_run;
    public String item_campn_type_sns_etc;
    public String item_campn_type_subscribe_youtube;
    public String item_campn_type_tutorial;
    public String item_campn_type_twitter;
    public String item_campn_type_video;
    public String item_campn_type_video_etc;
    public String item_campn_type_video_naver;
    public String item_campn_type_video_youtube;
    public String launch;
    public String ppi_action_down;
    public String ppi_action_join;
    public String tag_check;
    public String tag_check_reward;
    public String tag_default;
    public String tag_normal;
    public String tutorial_btn_close;
    public String video;

    public interface FormatCurrency {
        String formatCurrency(long j);
    }

    public static class ResourcesEnglishImpl extends Resources {
        public ResourcesEnglishImpl() {
            this.confirm = "Confirm";
            this.cancel = "Cancel";
            this.go = "Go";
            this.video = "Video";
            this.launch = "Launch";
            this.check_install = "Confirm";
            this.check_attend = "Attend";
            this.app_download = "Get";
            this.detail_title_cpi = "Get Free Points";
            this.detail_title_cps = "Get points by shopping";
            this.extra_text_app = "<h2>Precautions for Participation</h2><ul><li>Reward may not be given otherwise you have not installed this app before.</li><li>You can participate this event only once and may not be rewarded if you complete the missions after the event is closed.</li><li>You have to abstract the market page only via the button below and have to finish app installation and complete missions in 24 hours.</li><li>If you didn't get rewarded, leave your inquiries vie the link at the bottom of the offer-list.</li></ul>";
            this.extra_text_web = "<h2>Precautions for Participation</h2><ul><li>Reward may not be given otherwise you participate this event for the first time.</li><li>You can participate this event only once and may not be rewarded if you complete the missions after the event is closed.</li><li>You have to abstract the event page only via the button below and have to complete the missions in 24 hours.</li><li>If you didn't get rewarded, leave your inquiries vie the link at the bottom of the offer-list.</li></ul>";
            this.default_title = "Get Free Points";
            this.error_no_pub = "This is not rewarding application.";
            this.error_inconsistent = "Inconsistent State.";
            this.error_already_paid = "This item has been obtained before.";
            this.error_system = "System or Network error. Try later.";
            this.error_no_adv = "This item has been finished or paid.";
            this.error_no_market = "Invalid market type.";
            this.error_not_installed = "Not yet installed.";
            this.error_market_not_installed = "Not supported Market.";
            this.error_invalid_device = "Not supported device.";
            this.error_no_pay_condition = "Not rewarded. Check the reward mission please.";
            this.error_no_history = "No record found. Please start from the begining.";
            this.error_not_yet_attend_time = "The date of attendance is not over yet. Please try again in {left_hour} hours.";
            this.error_limit_day_count = "Daily purchases exceeded";
            this.invalidate_placement_id = "Invalid placement id";
            this.hide_app_message = "Hide ''{0}'' from the list?";
            this.hide_app_confirm = "Hide";
            this.hide_app_cancel = "Show All";
            this.hide_cancel_message = "Show all list?";
            this.error_no_tstore = "TStore is not installed.";
            this.error_no_olleh = "Olleh market is not installed.";
            this.error_no_ozstore = "U+ market is not installed.";
            this.error_no_google = "GooglePlay is not installed";
            this.error_no_browser = "Internet browser is not installed.";
            this.error_app_launch_failed = "Launch has failed.";
            this.error_check_run_failed = "Failed to launch app. Please check if app is correctly installed.";
            this.info_check_run = "Launch the app after installation. If succeed, Reward will be given within 5 mins.";
            this.error_not_installed_through_market = "Please install it from the market.";
            this.error_user_name_exceeded_256_bytes = "User identification value can not exceed 256 bytes.";
            this.tag_normal = "Free";
            this.tag_check = "Check<br><small>Install</small>";
            this.tag_check_reward = "Check";
            this.tag_default = "Get";
            this.detail_app_inst = "Click 'confirm' after application is setup.";
            this.detail_app_inst_auto = "Setup application.";
            this.detail_app_run = "Open application.";
            this.detail_view_video = "Watch the video.";
            this.detail_app_click = "Click here to find out.";
            this.detail_app_attend = "Press 'Attend' after {attend} days.";
            this.detail_video_skip = "You can participate after watching the video for %1$d seconds.";
            this.detail_video_complete = "You can participate if you watch the video until the end.";
            this.ppi_action_down = "Download";
            this.ppi_action_join = "Join";
            this.item_campn_type_install = "Get";
            this.item_campn_type_run = "Open";
            this.item_campn_type_login_kakao = "Login";
            this.item_campn_type_login = "Login";
            this.item_campn_type_join_app = "Sing-up";
            this.item_campn_type_level = "Level up";
            this.item_campn_type_tutorial = "Tutorial";
            this.item_campn_type_reservation = "Pre-engage";
            this.item_campn_type_attendance = "Attend";
            this.item_campn_type_click = "Click";
            this.item_campn_type_action_etc = "Action";
            this.item_campn_type_facebook = "Facebook";
            this.item_campn_type_twitter = "Twitter";
            this.item_campn_type_instagram = "Instagram";
            this.item_campn_type_kakao_story = "Kakao";
            this.item_campn_type_join_web = "Sing-up";
            this.item_campn_type_db = "Sing-up";
            this.item_campn_type_sns_etc = "SNS";
            this.item_campn_type_video = "Video";
            this.item_campn_type_video_youtube = "Youtube";
            this.item_campn_type_video_naver = "Naver";
            this.item_campn_type_video_etc = "Video";
            this.item_campn_type_cps = "Purchase";
            this.item_campn_type_paid_payment = "PaidPayment";
            this.item_campn_type_etc = "Various";
            this.item_campn_type_subscribe_youtube = "Subscribe";
            this.item_campn_type_join_naver_cafe = "Sing-up";
            this.agree_privacy_title = "Privacy Policy";
            this.agree_privacy_desc_default = "Users who would like to use the offerwall service provided by TNKF Corp. need to agree with the collection of personal information like below:\n- Google advertising ID\n- IP Address\n- Retention period : Destroy after achieving the purpose of collecting and using information.\n{device_id}\nThe personal information collected above will be used only for confirming the result of offerwall service.\nIt is essential information to provide the service, so your consent should be needed, and if you refuse to agree, Unfortunately, we can not provide appropriate services for you.";
            this.agree_privacy_btn_refuse = "No";
            this.agree_privacy_btn_agree = "Yes";
            this.filter_alignment_title = "Alignment Method";
            this.filter_alginment_text_recommend = "Recommend";
            this.filter_alginment_text_reward = "Reward";
            this.filter_ad_category_title = "Ad Category";
            this.filter_ad_category_text_action = "Action";
            this.filter_ad_category_text_purchase = "Purchase";
            this.filter_product_category_title = "Product Category";
            this.filter_product_category_text_all = "All";
            this.filter_product_category_text_food = "Food";
            this.filter_product_category_text_merchandise = "Merchandise";
            this.filter_product_category_text_life = "Life";
            this.filter_product_category_text_health = "Health";
            this.filter_product_category_text_beauty = "Beauty";
            this.filter_btn_cancel = "Cancel";
            this.filter_btn_apply = "Apply";
            this.tutorial_btn_close = "Close";
            this.a = new o();
        }
    }

    public static class ResourcesIndonesianImpl extends Resources {
        public ResourcesIndonesianImpl() {
            this.confirm = "OK";
            this.cancel = "Batal";
            this.go = "Pindah";
            this.video = "Video";
            this.launch = "Buka App";
            this.check_install = "Cek Unduhan";
            this.check_attend = "Menghadiri";
            this.app_download = "Unduh";
            this.detail_title_cpi = "Partisipasi dan akumulasi";
            this.detail_title_cps = "Beli dan akumulasi";
            this.extra_text_app = "<h2>Perhatian</h2><ul><li>Anda hanya bisa mendapatkan poin jika Anda adalah pengguna baru app ini. Jika Anda sudah pernah mengunduh atau mendaftar app ini, Anda tidak akan mendapatkan poin.</li><li>Anda hanya bisa mengikuti event ini sekali. Jika event ini sudah berakhir atau tidak ada lagi iklan, Anda tidak akan mendapatkan poin.</li><li>Anda harus mengunduh app ini melalui tombol yang disediakan dan menyelesaikan misi dalam 24 jam.</li><li>Jika Anda tidak mendapatkan poin, silahkan hubungi kami melalui link di bawah.</li></ul>";
            this.extra_text_web = "<h2>Precautions for Participation</h2><ul><li>Reward may not be given otherwise you participate this event for the first time.</li><li>You can participate this event only once and may not be rewarded if you complete the missions after the event is closed.</li><li>You have to open the event page only via the button below and have to complete the missions in 24 hours.</li><li>If you didn't get rewarded, leave your inquiries vie the link at the bottom of the offer-list.</li></ul>";
            this.default_title = "Dapatkan Poin GRATIS.";
            this.error_no_pub = "Bukan app yang bisa dapat poin.";
            this.error_inconsistent = "Tidak dapat diproses karena info permintaan salah.";
            this.error_already_paid = "Item ini sudah pernah diambil.";
            this.error_system = "Error sistem atau jaringan. Coba lagi.";
            this.error_no_adv = "Iklan ini sudah selesai.";
            this.error_no_market = "Info market salah.";
            this.error_not_installed = "Belum terunduh.";
            this.error_market_not_installed = "Market tidak didukung.";
            this.error_invalid_device = "Perangkat tidak didukung.";
            this.error_no_pay_condition = "Tidak dihargai. Memeriksa kondisi silahkan.";
            this.error_no_history = "Tidak ada catatan. Silakan mulai dari awal lagi.";
            this.error_not_yet_attend_time = "Belum waktunya. Silakan coba lagi dalam {left_hour} jam.";
            this.error_limit_day_count = "Anda sudah melebihi batas pembelian hari ini. Silakan coba lagi besok.";
            this.invalidate_placement_id = "Invalid placement id.";
            this.hide_app_message = "Sembunyikan ''{0}'' dari daftar?";
            this.hide_app_confirm = "Sembunyikan";
            this.hide_app_cancel = "Lihat Semua";
            this.hide_cancel_message = "Tampilkan semua item tersebunyi?";
            this.error_no_tstore = "TStore belum terunduh.";
            this.error_no_olleh = "Olleh market belum terunduh.";
            this.error_no_ozstore = "U+ market belum terunduh.";
            this.error_no_google = "GooglePlay belum terunduh.";
            this.error_no_browser = "Browser internet belum terunduh.";
            this.error_app_launch_failed = "App tidak dapat dibuka.";
            this.error_check_run_failed = "Failed to launch app. Please check if app is correctly installed.";
            this.info_check_run = "Buka aplikasi untuk cek apabila sudah diunduh. Jika sukses, hadiah akan diproses dalam 5 menit.";
            this.error_not_installed_through_market = "Unduh melalui market.";
            this.error_user_name_exceeded_256_bytes = "User ID tidak boleh lebih dari 256 bytes.";
            this.tag_normal = "Gratis";
            this.tag_check = "Cek<br><small>Unduhan</small>";
            this.tag_check_reward = "Cek";
            this.tag_default = "Get";
            this.detail_app_inst = "Install and press 'Cek Unduhan'.";
            this.detail_app_inst_auto = "Unduh app untuk dapakan {unit}.";
            this.detail_app_run = "Unduh dan buka app ini.";
            this.detail_view_video = "Lihat video.";
            this.detail_app_click = "Click here to find out.";
            this.detail_app_attend = "Press 'Attend' after {attend} days.";
            this.detail_video_skip = "You can participate after watching the video for %1$d seconds.";
            this.detail_video_complete = "You can participate if you watch the video until the end.";
            this.ppi_action_down = "Unduh";
            this.ppi_action_join = "Pindah";
            this.item_campn_type_install = "Install";
            this.item_campn_type_run = "Execution";
            this.item_campn_type_login_kakao = "Action";
            this.item_campn_type_login = "Action";
            this.item_campn_type_join_app = "Sing-up";
            this.item_campn_type_level = "Action";
            this.item_campn_type_tutorial = "Action";
            this.item_campn_type_reservation = "Pre-engage";
            this.item_campn_type_attendance = "Action";
            this.item_campn_type_click = "Click";
            this.item_campn_type_action_etc = "Action";
            this.item_campn_type_facebook = "SNS";
            this.item_campn_type_twitter = "SNS";
            this.item_campn_type_instagram = "SNS";
            this.item_campn_type_kakao_story = "SNS";
            this.item_campn_type_join_web = "Sing-up";
            this.item_campn_type_db = "Sing-up";
            this.item_campn_type_sns_etc = "SNS";
            this.item_campn_type_video = "Video";
            this.item_campn_type_video_youtube = "Video";
            this.item_campn_type_video_naver = "Video";
            this.item_campn_type_video_etc = "Video";
            this.item_campn_type_cps = "Purchase";
            this.item_campn_type_paid_payment = "PaidPayment";
            this.item_campn_type_etc = "Various";
            this.item_campn_type_subscribe_youtube = "Subscribe";
            this.item_campn_type_join_naver_cafe = "Sing-up";
            this.agree_privacy_title = "Privacy Policy";
            this.agree_privacy_desc_default = "Users who would like to use the offerwall service provided by TNKF Corp. need to agree with the collection of personal information like below:\n- Google advertising ID\n- IP Address\n- Retention period : Destroy after achieving the purpose of collecting and using information.\n{device_id}\nThe personal information collected above will be used only for confirming the result of offerwall service.\nIt is essential information to provide the service, so your consent should be needed, and if you refuse to agree, Unfortunately, we can not provide appropriate services for you.";
            this.agree_privacy_btn_refuse = "No";
            this.agree_privacy_btn_agree = "Yes";
            this.filter_alignment_title = "Accumulation Method";
            this.filter_alginment_text_recommend = "Recommend";
            this.filter_alginment_text_reward = "Reward";
            this.filter_ad_category_title = "Ad Category";
            this.filter_ad_category_text_action = "Action";
            this.filter_ad_category_text_purchase = "Purchase";
            this.filter_product_category_title = "Product Category";
            this.filter_product_category_text_all = "All";
            this.filter_product_category_text_food = "Food";
            this.filter_product_category_text_merchandise = "Merchandise";
            this.filter_product_category_text_life = "Life";
            this.filter_product_category_text_health = "Health";
            this.filter_product_category_text_beauty = "Beauty";
            this.filter_btn_cancel = "Cancel";
            this.filter_btn_apply = "Apply";
            this.tutorial_btn_close = "Close";
            this.a = new p();
        }
    }

    public static class ResourcesJapeneseImpl extends Resources {
        public ResourcesJapeneseImpl() {
            this.confirm = "確認";
            this.cancel = "キャンセル";
            this.go = "移動";
            this.video = "CM視聴";
            this.launch = "起動";
            this.check_install = "アプリ確認";
            this.check_attend = "出席確認";
            this.app_download = "インストール";
            this.detail_title_cpi = "参加してポイントを獲得";
            this.detail_title_cps = "購入してポイントを獲得";
            this.extra_text_app = "<h2>参加の注意事項</h2><ul><li>当該アプリの新規ユーザーのみがポイントを獲得できます。以前にインストールまたはログインしたアプリを削除または退会してもポイントを獲得できません。</li><li>イベントは1回のみ参加でき、広告の在庫がなくなったり終了した場合はポイントを獲得できません。</li><li>必ず提供されるボタンをタップして移動し、24時間以内にアプリのインストールとミッションを完了してください。</li><li>ポイントを獲得できなかった場合は、広告リストの下部にあるお問い合わせを通じてお問い合わせください。</li></ul>";
            this.extra_text_web = "<h2>Precautions for Participation</h2><ul><li>Reward may not be given otherwise you participate this event for the first time.</li><li>You can participate this event only once and may not be rewarded if you complete the missions after the event is closed.</li><li>You have to open the event page only via the button below and have to complete the missions in 24 hours.</li><li>If you didn't get rewarded, leave your inquiries vie the link at the bottom of the offer-list.</li></ul>";
            this.default_title = "無料ポイントを希望する";
            this.error_system = "エラー サーバーはビジー状態です。お手数ですが、少し時間をおいてからやり直してください。";
            this.error_no_adv = "終了しました。";
            this.error_no_market = "マーケット情報が正しくありません";
            this.error_not_installed = "まだ、インストールされていません。";
            this.error_market_not_installed = "サポートしていません。";
            this.error_no_pub = "ポイント付与されるアプリではありません";
            this.error_inconsistent = "入力された内容に間違いがありました。正しく入力されていることを確認してください。";
            this.error_already_paid = "すでに付与されています";
            this.error_invalid_device = "サポートしていない機器です。";
            this.error_no_pay_condition = "報いません。 付与条件チェックしてください。";
            this.error_no_history = "参加記録がありません。最初からやり直してください。";
            this.error_not_yet_attend_time = "出席日がまだ経過していません。{left_hour}時間後にやり直してください。";
            this.error_limit_day_count = "本日、購入可能回数を超えました。 明日また購入できます";
            this.invalidate_placement_id = "無効な placement id です。";
            this.hide_app_message = "''{0}''を広告リストから非表示にしますか？";
            this.hide_app_confirm = "非表示";
            this.hide_app_cancel = "すべて表示";
            this.hide_cancel_message = "すべての広告リストを表示しますか？";
            this.error_no_tstore = "TStoreがインストールされていません。";
            this.error_no_olleh = "Ollehマーケットがインストールされていません。";
            this.error_no_ozstore = "U+マーケットがインストールされていません。";
            this.error_no_google = "GooglePlayがインストールされていません。";
            this.error_no_browser = "インターネットブラウザがインストールされていません。";
            this.error_app_launch_failed = "アプリの実行に失敗しました。";
            this.error_check_run_failed = "アプリを起動に失敗しました。アプリが正しくインストールされているかどうかを確認してください。";
            this.info_check_run = "インストールの確認のためにアプリを実行します。正常に実行されると、5分以内に支給されます。";
            this.error_not_installed_through_market = "マーケットを通してインストールしてください。";
            this.error_user_name_exceeded_256_bytes = "ユーザー識別値は256バイトを超えることはできません。";
            this.tag_normal = "無料";
            this.tag_check = "アプリ<br><small>確認</small>";
            this.tag_check_reward = "確認";
            this.tag_default = "参加";
            this.detail_view_video = "まず、CMを視聴してください。";
            this.detail_app_inst = "インストールしたあとこちらのページに戻って 'アプリ確認'ボタンをタップしてください。";
            this.detail_app_inst_auto = "アプリをインストールしてください。";
            this.detail_app_run = "アプリをインストールされたら 起動してください。";
            this.detail_app_click = "クリックして確認してください。";
            this.detail_app_attend = "{attend}日後に '出席確認'をしてください。";
            this.detail_video_skip = "ビデオを%1$d秒視聴した後、ご参加いただけます。";
            this.detail_video_complete = "ビデオを最後までご覧にならないと参加できません。";
            this.ppi_action_down = "ダウンロード";
            this.ppi_action_join = "参加する";
            this.item_campn_type_install = "Install";
            this.item_campn_type_run = "Execution";
            this.item_campn_type_login_kakao = "Action";
            this.item_campn_type_login = "Action";
            this.item_campn_type_join_app = "Sing-up";
            this.item_campn_type_level = "Action";
            this.item_campn_type_tutorial = "Action";
            this.item_campn_type_reservation = "Pre-engage";
            this.item_campn_type_attendance = "Action";
            this.item_campn_type_click = "Click";
            this.item_campn_type_action_etc = "Action";
            this.item_campn_type_facebook = "SNS";
            this.item_campn_type_twitter = "SNS";
            this.item_campn_type_instagram = "SNS";
            this.item_campn_type_kakao_story = "SNS";
            this.item_campn_type_join_web = "Sing-up";
            this.item_campn_type_db = "Sing-up";
            this.item_campn_type_sns_etc = "SNS";
            this.item_campn_type_video = "Video";
            this.item_campn_type_video_youtube = "Video";
            this.item_campn_type_video_naver = "Video";
            this.item_campn_type_video_etc = "Video";
            this.item_campn_type_cps = "Purchase";
            this.item_campn_type_paid_payment = "PaidPayment";
            this.item_campn_type_etc = "Various";
            this.item_campn_type_subscribe_youtube = "Subscribe";
            this.item_campn_type_join_naver_cafe = "Sing-up";
            this.agree_privacy_title = "Privacy Policy";
            this.agree_privacy_desc_default = "Users who would like to use the offerwall service provided by TNKF Corp. need to agree with the collection of personal information like below:\n- Google advertising ID\n- IP Address\n- Retention period : Destroy after achieving the purpose of collecting and using information.\n{device_id}\nThe personal information collected above will be used only for confirming the result of offerwall service.\nIt is essential information to provide the service, so your consent should be needed, and if you refuse to agree, Unfortunately, we can not provide appropriate services for you.";
            this.agree_privacy_btn_refuse = "No";
            this.agree_privacy_btn_agree = "Yes";
            this.filter_alignment_title = "Accumulation Method";
            this.filter_alginment_text_recommend = "Recommend";
            this.filter_alginment_text_reward = "Reward";
            this.filter_ad_category_title = "Ad Category";
            this.filter_ad_category_text_action = "Action";
            this.filter_ad_category_text_purchase = "Purchase";
            this.filter_product_category_title = "Product Category";
            this.filter_product_category_text_all = "All";
            this.filter_product_category_text_food = "Food";
            this.filter_product_category_text_merchandise = "Merchandise";
            this.filter_product_category_text_life = "Life";
            this.filter_product_category_text_health = "Health";
            this.filter_product_category_text_beauty = "Beauty";
            this.filter_btn_cancel = "Cancel";
            this.filter_btn_apply = "Apply";
            this.tutorial_btn_close = "Close";
            this.a = new q();
        }
    }

    public static Resources getResources() {
        if (b == null) {
            String language = Locale.getDefault().getLanguage();
            if (TnkStyle.availableLanguages.contains(language)) {
                b = getResources(language);
            } else {
                b = getResources(TnkStyle.defaultLanguage);
            }
            if (b == null) {
                b = new ResourcesEnglishImpl();
            }
        }
        return b;
    }

    public static Resources setUseCustomResource() {
        ResourcesCustomImpl resourcesCustomImpl = new ResourcesCustomImpl();
        b = resourcesCustomImpl;
        return resourcesCustomImpl;
    }

    public String formatCurrency(long j) {
        FormatCurrency formatCurrency = TnkStyle.FormatCurrency;
        if (formatCurrency != null) {
            return formatCurrency.formatCurrency(j);
        }
        FormatCurrency formatCurrency2 = this.a;
        return formatCurrency2 != null ? formatCurrency2.formatCurrency(j) : String.valueOf(j);
    }

    public static Resources getResources(String str) {
        if (useCustomResource) {
            return new ResourcesCustomImpl();
        }
        if ("ko".equals(str)) {
            return new ResourcesKoreanImpl();
        }
        if ("ja".equals(str)) {
            return new ResourcesJapeneseImpl();
        }
        if ("in".equals(str)) {
            return new ResourcesIndonesianImpl();
        }
        if ("en".equals(str)) {
            return new ResourcesEnglishImpl();
        }
        return null;
    }

    public static class ResourcesKoreanImpl extends Resources {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int[] onExtraCallback = {539862305, -1494815881, 1479156009, 1383402222, -1706016116, 487298555, 604155012, 1974440081, 2079499630, 630337021, -1619203551, 1558844464, -2061968404, -491316191, -1188641652, -1779018921, -2132329614, -1993085251};

        public ResourcesKoreanImpl() throws Throwable {
            Object[] objArr = new Object[1];
            c(new int[]{932529537, -1801257099}, 2 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
            this.confirm = ((String) objArr[0]).intern();
            this.cancel = "취소";
            this.go = "이동";
            this.video = "동영상 시청";
            this.launch = "오픈하기";
            Object[] objArr2 = new Object[1];
            c(new int[]{932529537, -1801257099}, 2 - (ViewConfiguration.getTouchSlop() >> 8), objArr2);
            this.check_install = ((String) objArr2[0]).intern();
            this.check_attend = "출석하기";
            this.app_download = "다운받기";
            this.detail_title_cpi = "참여하고 적립받기";
            this.detail_title_cps = "쇼핑하고 적립받기";
            this.extra_text_app = "<h2>주의사항</h2><ul><li>해당 앱의 신규 사용자만 적립 받을 수 있습니다. 이전에 설치 또는 로그인 했던 앱을 삭제하거나 탈퇴하여도 적립 받을 수 없습니다.</li><li>이벤트는 1회만 참여할 수 있으며 광고 물량 소진 및 종료시에는 적립받을 수 없습니다.</li><li>반드시 제공되는 버튼을 눌러서 이동하시고 24시간 이내에 앱 설치 및 미션을 완료하셔야 합니다.</li><li>적립 받지 못하신 경우에는 광고 리스트 하단의 이용문의를 통해 문의해주세요.</li></ul>";
            this.extra_text_web = "<h2>주의사항</h2><ul><li>해당 이벤트에 최초 참여하시는 경우에만 적립 받을 수 있습니다. 이전에 참여하셨거나 또는 해당 서비스를 탈퇴하신 적이 있으셔도 적립 받을 수 없습니다.</li><li>이벤트는 1회만 참여할 수 있으며 광고 물량 소진 및 종료시에는 적립받을 수 없습니다.</li><li>반드시 제공되는 버튼을 눌러서 이동하시고 24시간 이내에 미션을 완료하셔야 합니다.</li><li>적립 받지 못하신 경우에는 광고 리스트 하단의 이용문의를 통해 문의해주세요.</li></ul>";
            this.default_title = "무료 포인트 받기";
            this.error_system = "시스템 또는 네트워크 오류입니다. 잠시후 다시 시도해주세요.";
            this.error_no_adv = "종료되었거나 적립이 완료된 광고입니다.";
            this.error_no_market = "잘못된 마켓 정보입니다.";
            this.error_not_installed = "앱이 설치되지 않았습니다.";
            this.error_market_not_installed = "이 단말기는 해당 마켓을 지원하지 않습니다.";
            this.error_no_pub = "포인트를 받을 수 있는 매체앱이 아닙니다.";
            this.error_inconsistent = "요청하신 정보가 잘못되어 처리할 수 없습니다.";
            this.error_already_paid = "이미 지급된 항목입니다. 다른 곳에서 적립받은 경우 또는 이미 실행하신 이력이 있을 수 있습니다.";
            this.error_invalid_device = "지원하지 않는 기기입니다.";
            this.error_no_pay_condition = "적립되지 않았습니다. 적립조건을 확인해주세요.";
            this.error_no_history = "참여하지 않은 광고입니다. 처음부터 다시 진행해주세요.";
            this.error_not_yet_attend_time = "출석일이 아직 지나지 않았습니다. {left_hour}시간 후 다시 시도해주세요.";
            this.error_limit_day_count = "오늘 구매 가능 횟수가 초과됐습니다. 내일 다시 구매가 가능합니다";
            this.invalidate_placement_id = "잘못된 placement id 입니다.";
            this.hide_app_message = "광고가 목록에서 제거되며 다시 복구할 수 없습니다.\n목록에서 제거 하시겠습니까?";
            this.hide_app_confirm = "숨기기";
            this.hide_app_cancel = "전체보기";
            this.hide_cancel_message = "숨긴 광고를 모두 다시 표시하시겠습니까?";
            this.error_no_tstore = "티스토어가 설치되어 있지 않습니다.";
            this.error_no_olleh = "올레마켓이 설치되어 있지 않습니다.";
            this.error_no_ozstore = "유플러스마켓이 설치되어 있지 않습니다.";
            this.error_no_google = "구글플레이가 설치되어 있지 않습니다.";
            this.error_no_browser = "인터넷브라우저가 설치되어 있지 않습니다.";
            this.error_app_launch_failed = "앱실행을 실패하였습니다.";
            this.error_check_run_failed = "앱을 실행할 수 없습니다. 앱이 정상적으로 설치되었는지 확인해주세요.";
            this.info_check_run = "확인을 위하여 앱을 실행합니다. 정상확인 후 5분이내에 지급처리됩니다.";
            this.error_not_installed_through_market = "마켓을 통하여 설치하시기 바랍니다.";
            this.error_user_name_exceeded_256_bytes = "User ID는 256 bytes를 초과할 수 없습니다.";
            this.tag_normal = "무료다운";
            Object[] objArr3 = new Object[1];
            c(new int[]{932529537, -1801257099}, 2 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr3);
            this.tag_check = ((String) objArr3[0]).intern();
            this.tag_check_reward = "적립받기";
            this.tag_default = "참여하기";
            this.detail_view_video = "동영상을 시청해주세요.";
            this.detail_app_inst = "앱을 받으신 후 '확인' 버튼을 눌러주세요.";
            this.detail_app_inst_auto = "앱을 받으세요.";
            this.detail_app_run = "앱을 받으신 후 오픈해주세요.";
            this.detail_app_click = "클릭 후 알아보세요.";
            this.detail_app_attend = "{attend}일 후 '출석확인' 해주세요.";
            this.detail_video_skip = "영상을 %1$d초 이상 시청 후 참여 가능합니다.";
            this.detail_video_complete = "영상을 끝까지 시청하셔야 참여 가능합니다.";
            this.ppi_action_down = "받기";
            this.ppi_action_join = "참여하기";
            this.item_campn_type_install = "설치하면";
            this.item_campn_type_run = "실행하면";
            this.item_campn_type_login_kakao = "로그인하면";
            this.item_campn_type_login = "로그인하면";
            this.item_campn_type_join_app = "가입하면";
            this.item_campn_type_level = "레벨달성";
            this.item_campn_type_tutorial = "튜토리얼 완료";
            this.item_campn_type_reservation = "사전예약";
            this.item_campn_type_attendance = "출석하기";
            this.item_campn_type_click = "클릭하기";
            this.item_campn_type_action_etc = "액션완료";
            this.item_campn_type_facebook = "페북 좋아요";
            this.item_campn_type_twitter = "트위터 팔로우";
            this.item_campn_type_instagram = "인스타 팔로우";
            this.item_campn_type_kakao_story = "카스 소식받기";
            this.item_campn_type_join_web = "회원가입";
            this.item_campn_type_db = "상담신청";
            this.item_campn_type_sns_etc = "SNS";
            this.item_campn_type_video = "동영상 시청";
            this.item_campn_type_video_youtube = "유튜브 시청";
            this.item_campn_type_video_naver = "네이버 동영상";
            this.item_campn_type_video_etc = "동영상";
            this.item_campn_type_cps = "제품구매";
            this.item_campn_type_paid_payment = "유료결제";
            this.item_campn_type_etc = "기타";
            this.item_campn_type_subscribe_youtube = "유튜브 구독";
            this.item_campn_type_join_naver_cafe = "카페가입";
            this.agree_privacy_title = "개인정보 수집 동의";
            this.agree_privacy_desc_default = "(주)티앤케이팩토리가 제공하는 충전소 서비스의 이용을 위해서는 아래의 정보 수집에 대한 동의가 필요합니다.\n아래 수집된 정보는 충전소 서비스 제공 결과 확인을 위한 용도로만 활용되며,\n서비스 제공을 위한 필수 정보이므로 동의를 부탁드리며, 거부하실 경우 해당 서비스를 이용하실 수 없습니다.\n- 구글 광고 ID\n- IP 주소\n- 보유기간 : 정보 수집 및 이용 목적 달성 후 파기합니다.\n{device_id}";
            this.agree_privacy_btn_refuse = "거부";
            this.agree_privacy_btn_agree = "동의";
            this.filter_alignment_title = "정렬방식";
            this.filter_alginment_text_recommend = "추천순";
            this.filter_alginment_text_reward = "리워드순";
            this.filter_ad_category_title = "광고 유형";
            this.filter_ad_category_text_action = "참여형";
            this.filter_ad_category_text_purchase = "구매형";
            this.filter_product_category_title = "상품 카테고리";
            this.filter_product_category_text_all = "전체";
            this.filter_product_category_text_food = "식품";
            this.filter_product_category_text_merchandise = "잡화";
            this.filter_product_category_text_life = "생활";
            this.filter_product_category_text_health = "건강";
            this.filter_product_category_text_beauty = "뷰티";
            this.filter_btn_cancel = "취소";
            this.filter_btn_apply = "적용";
            this.tutorial_btn_close = "닫기";
            this.a = new r();
        }

        private static void c(int[] iArr, int i2, Object[] objArr) throws Throwable {
            int length;
            int[] iArr2;
            int i3 = 2;
            int i4 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr3 = onExtraCallback;
            int i5 = -1469660336;
            if (iArr3 != null) {
                int i6 = $11 + 119;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    length = iArr3.length;
                    iArr2 = new int[length];
                } else {
                    length = iArr3.length;
                    iArr2 = new int[length];
                }
                int i7 = 0;
                while (i7 < length) {
                    int i8 = $11 + 39;
                    $10 = i8 % 128;
                    if (i8 % i3 != 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(iArr3[i7])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ('0' - AndroidCharacter.getMirror('0')), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 72, TextUtils.lastIndexOf("", '0', 0) + 8849, -1725547072, false, "h", new Class[]{Integer.TYPE});
                            }
                            iArr2[i7] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                            i7 >>= 1;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        Object[] objArr3 = {Integer.valueOf(iArr3[i7])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - MotionEvent.axisFromString("")), 72 - ExpandableListView.getPackedPositionGroup(0L), 8847 - MotionEvent.axisFromString(""), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr2[i7] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        i7++;
                    }
                    i3 = 2;
                    i5 = -1469660336;
                }
                iArr3 = iArr2;
            }
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = onExtraCallback;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i9 = $11 + 99;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 3 % 4;
                }
                for (int i11 = 0; i11 < length3; i11++) {
                    try {
                        Object[] objArr4 = {Integer.valueOf(iArr5[i11])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), 72 - (ViewConfiguration.getTapTimeout() >> 16), 8848 - (ViewConfiguration.getTouchSlop() >> 8), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr6[i11] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                iArr5 = iArr6;
            }
            System.arraycopy(iArr5, 0, iArr4, 0, length2);
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                int i12 = 0;
                for (int i13 = 16; i12 < i13; i13 = 16) {
                    int i14 = $11 + 109;
                    $10 = i14 % 128;
                    int i15 = i14 % 2;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i12];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - View.resolveSizeAndState(0, 0, 0)), 39 - (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 10300, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i12++;
                }
                int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i16;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
                int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
                cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
                cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
                Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - (KeyEvent.getMaxKeyCode() >> 16)), 78 - ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 7397, 1888082611, false, "f", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            String str = new String(cArr2, 0, i2);
            int i19 = $10 + 115;
            $11 = i19 % 128;
            if (i19 % 2 == 0) {
                throw null;
            }
            objArr[0] = str;
        }
    }

    public static class ResourcesCustomImpl extends Resources {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char[] IAuthTabCallback = {278, 42252};

        public ResourcesCustomImpl() throws Throwable {
            Object[] objArr = new Object[1];
            c(new int[]{0, 2, 92, 2}, false, new byte[]{1, 1}, objArr);
            this.confirm = ((String) objArr[0]).intern();
            this.cancel = "취소";
            this.go = "이동";
            this.video = "동영상 시청";
            this.launch = "오픈하기";
            Object[] objArr2 = new Object[1];
            c(new int[]{0, 2, 92, 2}, false, new byte[]{1, 1}, objArr2);
            this.check_install = ((String) objArr2[0]).intern();
            this.check_attend = "출석하기";
            this.app_download = "다운받기";
            this.detail_title_cpi = "참여하고 적립받기";
            this.detail_title_cps = "쇼핑하고 적립받기";
            this.extra_text_app = "<h2>주의사항</h2><ul><li>해당 앱의 신규 사용자만 적립 받을 수 있습니다. 이전에 설치 또는 로그인 했던 앱을 삭제하거나 탈퇴하여도 적립 받을 수 없습니다.</li><li>이벤트는 1회만 참여할 수 있으며 광고 물량 소진 및 종료시에는 적립받을 수 없습니다.</li><li>반드시 제공되는 버튼을 눌러서 이동하시고 24시간 이내에 앱 설치 및 미션을 완료하셔야 합니다.</li><li>적립 받지 못하신 경우에는 광고 리스트 하단의 이용문의를 통해 문의해주세요.</li></ul>";
            this.extra_text_web = "<h2>주의사항</h2><ul><li>해당 이벤트에 최초 참여하시는 경우에만 적립 받을 수 있습니다. 이전에 참여하셨거나 또는 해당 서비스를 탈퇴하신 적이 있으셔도 적립 받을 수 없습니다.</li><li>이벤트는 1회만 참여할 수 있으며 광고 물량 소진 및 종료시에는 적립받을 수 없습니다.</li><li>반드시 제공되는 버튼을 눌러서 이동하시고 24시간 이내에 미션을 완료하셔야 합니다.</li><li>적립 받지 못하신 경우에는 광고 리스트 하단의 이용문의를 통해 문의해주세요.</li></ul>";
            this.default_title = "무료 포인트 받기";
            this.error_system = "시스템 또는 네트워크 오류입니다. 잠시후 다시 시도해주세요.";
            this.error_no_adv = "종료되었거나 적립이 완료된 광고입니다.";
            this.error_no_market = "잘못된 마켓 정보입니다.";
            this.error_not_installed = "앱이 설치되지 않았습니다.";
            this.error_market_not_installed = "이 단말기는 해당 마켓을 지원하지 않습니다.";
            this.error_no_pub = "포인트를 받을 수 있는 매체앱이 아닙니다.";
            this.error_inconsistent = "요청하신 정보가 잘못되어 처리할 수 없습니다.";
            this.error_already_paid = "이미 지급된 항목입니다. 다른 곳에서 적립받은 경우 또는 이미 실행하신 이력이 있을 수 있습니다.";
            this.error_invalid_device = "지원하지 않는 기기입니다.";
            this.error_no_pay_condition = "적립되지 않았습니다. 적립조건을 확인해주세요.";
            this.error_no_history = "참여하지 않은 광고입니다. 처음부터 다시 진행해주세요.";
            this.error_not_yet_attend_time = "출석일이 아직 지나지 않았습니다. {left_hour}시간 후 다시 시도해주세요.";
            this.error_limit_day_count = "오늘 구매 가능 횟수가 초과됐습니다. 내일 다시 구매가 가능합니다";
            this.invalidate_placement_id = "잘못된 placement id 입니다.";
            this.hide_app_message = "광고가 목록에서 제거되며 다시 복구할 수 없습니다.\n목록에서 제거 하시겠습니까?";
            this.hide_app_confirm = "숨기기";
            this.hide_app_cancel = "전체보기";
            this.hide_cancel_message = "숨긴 광고를 모두 다시 표시하시겠습니까?";
            this.error_no_tstore = "티스토어가 설치되어 있지 않습니다.";
            this.error_no_olleh = "올레마켓이 설치되어 있지 않습니다.";
            this.error_no_ozstore = "유플러스마켓이 설치되어 있지 않습니다.";
            this.error_no_google = "구글플레이가 설치되어 있지 않습니다.";
            this.error_no_browser = "인터넷브라우저가 설치되어 있지 않습니다.";
            this.error_app_launch_failed = "앱실행을 실패하였습니다.";
            this.error_check_run_failed = "앱을 실행할 수 없습니다. 앱이 정상적으로 설치되었는지 확인해주세요.";
            this.info_check_run = "확인을 위하여 앱을 실행합니다. 정상확인 후 5분이내에 지급처리됩니다.";
            this.error_not_installed_through_market = "마켓을 통하여 설치하시기 바랍니다.";
            this.error_user_name_exceeded_256_bytes = "User ID는 256 bytes를 초과할 수 없습니다.";
            this.tag_normal = "무료다운";
            Object[] objArr3 = new Object[1];
            c(new int[]{0, 2, 92, 2}, false, new byte[]{1, 1}, objArr3);
            this.tag_check = ((String) objArr3[0]).intern();
            this.tag_check_reward = "적립받기";
            this.tag_default = "참여하기";
            this.detail_view_video = "동영상을 시청해주세요.";
            this.detail_app_inst = "앱을 받으신 후 '확인' 버튼을 눌러주세요.";
            this.detail_app_inst_auto = "앱을 받으세요.";
            this.detail_app_run = "앱을 받으신 후 오픈해주세요.";
            this.detail_app_click = "클릭 후 알아보세요.";
            this.detail_app_attend = "{attend}일 후 '출석확인' 해주세요.";
            this.detail_video_skip = "영상을 %1$d초 이상 시청 후 참여 가능합니다.";
            this.detail_video_complete = "영상을 끝까지 시청하셔야 참여 가능합니다.";
            this.ppi_action_down = "받기";
            this.ppi_action_join = "참여하기";
            this.item_campn_type_install = "내려받고";
            this.item_campn_type_run = "최초 오픈하고";
            this.item_campn_type_login_kakao = "카톡 로그인하고";
            this.item_campn_type_login = "로그인 하고";
            this.item_campn_type_join_app = "회원 가입하고";
            this.item_campn_type_level = "레벨 달성하고";
            this.item_campn_type_tutorial = "튜토리얼 완료하고";
            this.item_campn_type_reservation = "사전예약하고";
            this.item_campn_type_attendance = "출석하고";
            this.item_campn_type_click = "클릭하고";
            this.item_campn_type_action_etc = "액션 완료하고";
            this.item_campn_type_facebook = "페북 좋아요하고";
            this.item_campn_type_twitter = "트위터 팔로우하고";
            this.item_campn_type_instagram = "인스타 팔로우하고";
            this.item_campn_type_kakao_story = "카스 소식받고";
            this.item_campn_type_join_web = "회원 가입하고";
            this.item_campn_type_db = "상담 신청하고";
            this.item_campn_type_sns_etc = "SNS 참여하고";
            this.item_campn_type_video = "동영상 시청하고";
            this.item_campn_type_video_youtube = "유튜브 시청하고";
            this.item_campn_type_video_naver = "네이버 동영상보고";
            this.item_campn_type_video_etc = "동영상보고";
            this.item_campn_type_cps = "제품 구매하고";
            this.item_campn_type_paid_payment = "유료 결제하고";
            this.item_campn_type_etc = "미션 달성하고";
            this.item_campn_type_subscribe_youtube = "유튜브 구독하고";
            this.item_campn_type_join_naver_cafe = "카페 가입하고";
            this.agree_privacy_title = "개인정보 수집 동의";
            this.agree_privacy_desc_default = "(주)티앤케이팩토리가 제공하는 충전소 서비스의 이용을 위해서는 아래의 정보 수집에 대한 동의가 필요합니다.\n아래 수집된 정보는 충전소 서비스 제공 결과 확인을 위한 용도로만 활용되며,\n서비스 제공을 위한 필수 정보이므로 동의를 부탁드리며, 거부하실 경우 해당 서비스를 이용하실 수 없습니다.\n- 구글 광고 ID\n- IP 주소\n- 보유기간 : 정보 수집 및 이용 목적 달성 후 파기합니다.\n{device_id}";
            this.agree_privacy_btn_refuse = "거부";
            this.agree_privacy_btn_agree = "동의";
            this.filter_alignment_title = "정렬방식";
            this.filter_alginment_text_recommend = "추천순";
            this.filter_alginment_text_reward = "리워드순";
            this.filter_ad_category_title = "광고 유형";
            this.filter_ad_category_text_action = "참여형";
            this.filter_ad_category_text_purchase = "구매형";
            this.filter_product_category_title = "상품 카테고리";
            this.filter_product_category_text_all = "전체";
            this.filter_product_category_text_food = "식품";
            this.filter_product_category_text_merchandise = "잡화";
            this.filter_product_category_text_life = "생활";
            this.filter_product_category_text_health = "건강";
            this.filter_product_category_text_beauty = "뷰티";
            this.filter_btn_cancel = "취소";
            this.filter_btn_apply = "적용";
            this.tutorial_btn_close = "닫기";
            this.a = new n();
        }

        private static void c(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            char[] cArr;
            int length;
            char[] cArr2;
            int i2 = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i3 = iArr[0];
            int i4 = iArr[1];
            int i5 = iArr[2];
            int i6 = iArr[3];
            char[] cArr3 = IAuthTabCallback;
            long j = 0;
            if (cArr3 != null) {
                int i7 = $10 + 119;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    length = cArr3.length;
                    cArr2 = new char[length];
                } else {
                    length = cArr3.length;
                    cArr2 = new char[length];
                }
                int i8 = 0;
                while (i8 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i8])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionGroup(j) + 35283), 35 - (Process.myPid() >> 22), (KeyEvent.getMaxKeyCode() >> 16) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i8++;
                        j = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr3 = cArr2;
            }
            char[] cArr4 = new char[i4];
            System.arraycopy(cArr3, i3, cArr4, 0, i4);
            if (bArr != null) {
                char[] cArr5 = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                char c = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    int i9 = $10 + 57;
                    $11 = i9 % 128;
                    if (i9 % 2 != 0 ? bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1 : bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 0) {
                        int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr3 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), TextUtils.indexOf("", "", 0, 0) + 29, 17658 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[i10] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    } else {
                        int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 10935), TextUtils.getCapsMode("", 0, 0) + 65, ImageFormat.getBitsPerPixel(0) + 16719, -846731970, false, TtmlNode.TAG_P, new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    }
                    c = cArr5[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - View.getDefaultSize(0, 0)), 71 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getTouchSlop() >> 8) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                cArr4 = cArr5;
            }
            if (i6 > 0) {
                int i12 = $11 + 89;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    char[] cArr6 = new char[i4];
                    System.arraycopy(cArr4, 1, cArr6, 0, i4);
                    System.arraycopy(cArr6, 1, cArr4, i4 * i6, i6);
                    System.arraycopy(cArr6, i6, cArr4, 0, i4 % i6);
                } else {
                    char[] cArr7 = new char[i4];
                    System.arraycopy(cArr4, 0, cArr7, 0, i4);
                    int i13 = i4 - i6;
                    System.arraycopy(cArr7, 0, cArr4, i13, i6);
                    System.arraycopy(cArr7, i6, cArr4, 0, i13);
                }
            }
            if (z) {
                int i14 = $10 + 49;
                $11 = i14 % 128;
                if (i14 % 2 == 0) {
                    cArr = new char[i4];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
                } else {
                    cArr = new char[i4];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                }
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
                cArr4 = cArr;
            }
            if (i5 > 0) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    int i15 = $11 + 59;
                    $10 = i15 % 128;
                    int i16 = i15 % 2;
                    cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
            }
            objArr[0] = new String(cArr4);
        }
    }
}
