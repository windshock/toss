package o;

import java.io.IOException;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o.setShowDislike;
import o.setSkipEnable;
import okhttp3.internal.url._UrlKt;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getRenderTimeout {
    public static final hideCountDownText IAuthTabCallback;
    public static final hideCountDownText IAuthTabCallbackDefault;
    public static final hideCountDownText IAuthTabCallbackStub;
    public static final hideCountDownText IAuthTabCallbackStubProxy;
    public static final hideCountDownText IAuthTabCallback_Parcel;
    public static final hideCountDownText ICustomTabsCallback;
    public static final hideCountDownText access000;
    public static final hideCountDownText access100;
    public static final hideCountDownText asBinder;
    public static final hideCountDownText asInterface;
    public static final hideCountDownText extraCallbackWithResult;
    public static final hideCountDownText getInterfaceDescriptor;
    public static final hideCountDownText onExtraCallback;
    public static final hideCountDownText onExtraCallbackWithResult;
    public static final hideCountDownText onNavigationEvent;
    public static final hideCountDownText onTransact;
    public static final hideCountDownText onWarmupCompleted;

    static class onNavigationEvent extends hideCountDownText {
        onNavigationEvent() {
        }

        @Override // o.hideCountDownText
        public int IAuthTabCallback(CharSequence charSequence, int i, Writer writer) throws IOException {
            if (i != 0) {
                throw new IllegalStateException("XsiUnescaper should never reach the [1] index");
            }
            String string = charSequence.toString();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int iIndexOf = string.indexOf(92, i2);
                if (iIndexOf == -1) {
                    break;
                }
                if (iIndexOf > i3) {
                    writer.write(string.substring(i3, iIndexOf));
                }
                i3 = iIndexOf + 1;
                i2 = iIndexOf + 2;
            }
            if (i3 < string.length()) {
                writer.write(string.substring(i3));
            }
            return Character.codePointCount(charSequence, 0, charSequence.length());
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("\"", "\\\"");
        map.put("\\", "\\\\");
        setShowSkip setshowskip = new setShowSkip(Collections.unmodifiableMap(map));
        Map<CharSequence, CharSequence> map2 = getCloseButton.onTransact;
        onWarmupCompleted = new getCloseBackupButton(setshowskip, new setShowSkip(map2), setShouldShowSkipTime.onExtraCallbackWithResult(32, 127));
        HashMap map3 = new HashMap();
        map3.put("'", "\\'");
        map3.put("\"", "\\\"");
        map3.put("\\", "\\\\");
        map3.put("/", "\\/");
        onNavigationEvent = new getCloseBackupButton(new setShowSkip(Collections.unmodifiableMap(map3)), new setShowSkip(map2), setShouldShowSkipTime.onExtraCallbackWithResult(32, 127));
        HashMap map4 = new HashMap();
        map4.put("\"", "\\\"");
        map4.put("\\", "\\\\");
        map4.put("/", "\\/");
        onTransact = new getCloseBackupButton(new setShowSkip(Collections.unmodifiableMap(map4)), new setShowSkip(map2), setShouldShowSkipTime.onExtraCallbackWithResult(32, 126));
        HashMap map5 = new HashMap();
        map5.put("\u0000", _UrlKt.FRAGMENT_ENCODE_SET);
        map5.put("\u0001", _UrlKt.FRAGMENT_ENCODE_SET);
        map5.put("\u0002", _UrlKt.FRAGMENT_ENCODE_SET);
        map5.put("\u0003", _UrlKt.FRAGMENT_ENCODE_SET);
        map5.put("\u0004", _UrlKt.FRAGMENT_ENCODE_SET);
        map5.put("\u0005", _UrlKt.FRAGMENT_ENCODE_SET);
        map5.put("\u0006", _UrlKt.FRAGMENT_ENCODE_SET);
        map5.put("\u0007", _UrlKt.FRAGMENT_ENCODE_SET);
        map5.put("\b", _UrlKt.FRAGMENT_ENCODE_SET);
        map5.put("\u000b", _UrlKt.FRAGMENT_ENCODE_SET);
        map5.put("\f", _UrlKt.FRAGMENT_ENCODE_SET);
        map5.put("\u000e", _UrlKt.FRAGMENT_ENCODE_SET);
        map5.put("\u000f", _UrlKt.FRAGMENT_ENCODE_SET);
        map5.put("\u0010", _UrlKt.FRAGMENT_ENCODE_SET);
        map5.put("\u0011", _UrlKt.FRAGMENT_ENCODE_SET);
        map5.put("\u0012", _UrlKt.FRAGMENT_ENCODE_SET);
        map5.put("\u0013", _UrlKt.FRAGMENT_ENCODE_SET);
        map5.put("\u0014", _UrlKt.FRAGMENT_ENCODE_SET);
        map5.put("\u0015", _UrlKt.FRAGMENT_ENCODE_SET);
        map5.put("\u0016", _UrlKt.FRAGMENT_ENCODE_SET);
        map5.put("\u0017", _UrlKt.FRAGMENT_ENCODE_SET);
        map5.put("\u0018", _UrlKt.FRAGMENT_ENCODE_SET);
        map5.put("\u0019", _UrlKt.FRAGMENT_ENCODE_SET);
        map5.put("\u001a", _UrlKt.FRAGMENT_ENCODE_SET);
        map5.put("\u001b", _UrlKt.FRAGMENT_ENCODE_SET);
        map5.put("\u001c", _UrlKt.FRAGMENT_ENCODE_SET);
        map5.put("\u001d", _UrlKt.FRAGMENT_ENCODE_SET);
        map5.put("\u001e", _UrlKt.FRAGMENT_ENCODE_SET);
        map5.put("\u001f", _UrlKt.FRAGMENT_ENCODE_SET);
        map5.put("\ufffe", _UrlKt.FRAGMENT_ENCODE_SET);
        map5.put("\uffff", _UrlKt.FRAGMENT_ENCODE_SET);
        Map<CharSequence, CharSequence> map6 = getCloseButton.onExtraCallback;
        setShowSkip setshowskip2 = new setShowSkip(map6);
        Map<CharSequence, CharSequence> map7 = getCloseButton.onWarmupCompleted;
        asInterface = new getCloseBackupButton(setshowskip2, new setShowSkip(map7), new setShowSkip(Collections.unmodifiableMap(map5)), setShowEndCardNextAd.onNavigationEvent(127, Imgproc.COLOR_BGR2YUV_YV12), setShowEndCardNextAd.onNavigationEvent(Imgproc.COLOR_BGRA2YUV_YV12, 159), new showSkipButton());
        HashMap map8 = new HashMap();
        map8.put("\u0000", _UrlKt.FRAGMENT_ENCODE_SET);
        map8.put("\u000b", "&#11;");
        map8.put("\f", "&#12;");
        map8.put("\ufffe", _UrlKt.FRAGMENT_ENCODE_SET);
        map8.put("\uffff", _UrlKt.FRAGMENT_ENCODE_SET);
        asBinder = new getCloseBackupButton(new setShowSkip(map6), new setShowSkip(map7), new setShowSkip(Collections.unmodifiableMap(map8)), setShowEndCardNextAd.onNavigationEvent(1, 8), setShowEndCardNextAd.onNavigationEvent(14, 31), setShowEndCardNextAd.onNavigationEvent(127, Imgproc.COLOR_BGR2YUV_YV12), setShowEndCardNextAd.onNavigationEvent(Imgproc.COLOR_BGRA2YUV_YV12, 159), new showSkipButton());
        setShowSkip setshowskip3 = new setShowSkip(map6);
        Map<CharSequence, CharSequence> map9 = getCloseButton.asInterface;
        onExtraCallback = new getCloseBackupButton(setshowskip3, new setShowSkip(map9));
        onExtraCallbackWithResult = new getCloseBackupButton(new setShowSkip(map6), new setShowSkip(map9), new setShowSkip(getCloseButton.onNavigationEvent));
        IAuthTabCallback = new setShowDislike.onWarmupCompleted();
        HashMap map10 = new HashMap();
        map10.put("|", "\\|");
        map10.put("&", "\\&");
        map10.put(";", "\\;");
        map10.put("<", "\\<");
        map10.put(">", "\\>");
        map10.put("(", "\\(");
        map10.put(")", "\\)");
        map10.put("$", "\\$");
        map10.put("`", "\\`");
        map10.put("\\", "\\\\");
        map10.put("\"", "\\\"");
        map10.put("'", "\\'");
        map10.put(" ", "\\ ");
        map10.put("\t", "\\\t");
        map10.put("\r\n", _UrlKt.FRAGMENT_ENCODE_SET);
        map10.put("\n", _UrlKt.FRAGMENT_ENCODE_SET);
        map10.put("*", "\\*");
        map10.put("?", "\\?");
        map10.put("[", "\\[");
        map10.put("#", "\\#");
        map10.put("~", "\\~");
        map10.put("=", "\\=");
        map10.put("%", "\\%");
        IAuthTabCallbackDefault = new setShowSkip(Collections.unmodifiableMap(map10));
        HashMap map11 = new HashMap();
        map11.put("\\\\", "\\");
        map11.put("\\\"", "\"");
        map11.put("\\'", "'");
        map11.put("\\", _UrlKt.FRAGMENT_ENCODE_SET);
        getCloseBackupButton getclosebackupbutton = new getCloseBackupButton(new setShowPlayableNextAd(), new setSkipInvisiable(), new setShowSkip(getCloseButton.IAuthTabCallbackStub), new setShowSkip(Collections.unmodifiableMap(map11)));
        access100 = getclosebackupbutton;
        access000 = getclosebackupbutton;
        getInterfaceDescriptor = getclosebackupbutton;
        Map<CharSequence, CharSequence> map12 = getCloseButton.onExtraCallbackWithResult;
        setShowSkip setshowskip4 = new setShowSkip(map12);
        Map<CharSequence, CharSequence> map13 = getCloseButton.IAuthTabCallbackDefault;
        IAuthTabCallback_Parcel = new getCloseBackupButton(setshowskip4, new setShowSkip(map13), new setSkipEnable(new setSkipEnable.onWarmupCompleted[0]));
        IAuthTabCallbackStubProxy = new getCloseBackupButton(new setShowSkip(map12), new setShowSkip(map13), new setShowSkip(getCloseButton.asBinder), new setSkipEnable(new setSkipEnable.onWarmupCompleted[0]));
        ICustomTabsCallback = new getCloseBackupButton(new setShowSkip(map12), new setShowSkip(getCloseButton.IAuthTabCallback), new setSkipEnable(new setSkipEnable.onWarmupCompleted[0]));
        IAuthTabCallbackStub = new setShowDislike.onNavigationEvent();
        extraCallbackWithResult = new onNavigationEvent();
    }

    public static final String onWarmupCompleted(String str) {
        return access100.onExtraCallbackWithResult(str);
    }
}
